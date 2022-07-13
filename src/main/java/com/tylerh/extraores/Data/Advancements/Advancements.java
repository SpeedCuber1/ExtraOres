package com.tylerh.extraores.Data.Advancements;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minecraft.advancements.Advancement;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.advancements.AdvancementProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.HashCache;
import net.minecraft.data.DataProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class Advancements extends AdvancementProvider
{
    private final DataGenerator generator;
    private static final Logger LOGGER = LogManager.getLogger();
    private final List<Consumer<Consumer<Advancement>>> advancements = ImmutableList.of(new ExOreAdvancement());

    public Advancements(DataGenerator generator, ExistingFileHelper helper)
    {
        super(generator,helper);
        this.generator = generator;
    }

    @Override
    public void run(CachedOutput cache)
    {
        Path path = this.generator.getOutputFolder();
        Set<ResourceLocation> set = Sets.newHashSet();
        Consumer<Advancement> consumer = (p_204017_3_) ->
        {
            if (!set.add(p_204017_3_.getId()))
            {
                throw new IllegalStateException("Duplicate advancement " + p_204017_3_.getId());
            }
            else
            {
                Path path1 = getPath(path, p_204017_3_);

                try
                {
                    DataProvider.saveStable(cache, p_204017_3_.deconstruct().serializeToJson(), path1);
                }
                catch (IOException ioexception)
                {
                    LOGGER.error("Couldn't save advancement {}", path1, ioexception);
                }

            }
        };

        for (Consumer<Consumer<Advancement>> consumer1 : this.advancements)
        {
            consumer1.accept(consumer);
        }

    }

    private static Path getPath(Path pathIn, Advancement advancementIn)
    {
        return pathIn.resolve("data/" + advancementIn.getId().getNamespace() + "/advancements/" + advancementIn.getId().getPath() + ".json");
    }

    /**
     * Gets a name for this provider, to use in logging.
     */
    public String getName()
    {
        return "Extra Ores Advancements";
    }
}

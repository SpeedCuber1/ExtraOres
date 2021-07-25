package com.tylerh.extraores.Data.Loot_Tables;


import com.google.common.collect.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.datafixers.util.Pair;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.HashCache;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.LootTables;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public abstract class BaseLootTableProvider extends LootTableProvider
{
    private static final Logger LOGGER = LogManager.getLogger();
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    private final DataGenerator generator;
    //private final List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootContextParamSet>> subProviders;

    public BaseLootTableProvider(DataGenerator gen)
    {
        super(gen);
        //subProviders = ImmutableList.of(Pair.of(LootTables::new,LootContextParamSets.BLOCK));
        generator = gen;
    }

    @Override
    public void run(HashCache cache)
    {
        Path path = generator.getOutputFolder();
        Map<ResourceLocation, LootTable> map = Maps.newHashMap();
        LootContextParamSet var10002 = LootContextParamSets.ALL_PARAMS;
        Function var10003 = (func) ->
        {
            return null;
        };
        Objects.requireNonNull(map);
        ValidationContext validationcontext = new ValidationContext(var10002, var10003, map::get);
        this.validate(map, validationcontext);
        Multimap<String, String> multimap = validationcontext.getProblems();
        if (!multimap.isEmpty())
        {
            multimap.forEach((p_124446_, p_124447_) ->
            {
                LOGGER.warn("Found validation problem in {}: {}", p_124446_, p_124447_);
            });
            throw new IllegalStateException("Failed to validate loot tables, see logs");
        }
        else
        {
            map.forEach((p_124451_, p_124452_) ->
            {
                Path path1 = createPath(path, p_124451_);

                try
                {
                    DataProvider.save(GSON, cache, LootTables.serialize(p_124452_), path1);
                }
                catch (IOException var6)
                {
                    LOGGER.error("Couldn't save loot table {}", path1, var6);
                }

            });
        }
    }

    /*protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootContextParamSet>> getTables()
    {
        return this.subProviders;
    }*/

    protected void validate(Map<ResourceLocation, LootTable> map, ValidationContext validationtracker)
    {
        UnmodifiableIterator var3 = Sets.difference(BuiltInLootTables.all(), map.keySet()).iterator();

        while (var3.hasNext())
        {
            ResourceLocation resourcelocation = (ResourceLocation) var3.next();
            validationtracker.reportProblem("Missing built-in table: " + resourcelocation);
        }

        map.forEach((p_218436_2_, p_218436_3_) ->
        {
            LootTables.validate(validationtracker, p_218436_2_, p_218436_3_);
        });
    }

    private static Path createPath(Path p_124454_, ResourceLocation p_124455_)
    {
        String var10001 = p_124455_.getNamespace();
        return p_124454_.resolve("data/" + var10001 + "/loot_tables/" + p_124455_.getPath() + ".json");
    }

    @Override
    public String getName()
    {
        return "Extra Ores Loot Tables";
    }
}
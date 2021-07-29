package com.tylerh.extraores.Data;

import com.tylerh.extraores.Data.Advancements.Advancements;
import com.tylerh.extraores.Data.Loot_Tables.LootTables;
import com.tylerh.extraores.Data.Recipes.ExOreRecipe;
import com.tylerh.extraores.Data.Tags.ExOreBlockTag;
import com.tylerh.extraores.Data.Tags.ExOreItemTag;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EXOreDataGen
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event)
    {
        DataGenerator generator = event.getGenerator();
        generator.addProvider(new Advancements(generator));
        generator.addProvider(new ExOreRecipe(generator));
        generator.addProvider(new ExOreBlockTag(generator, event.getExistingFileHelper()));
        generator.addProvider(new ExOreItemTag(generator,new ExOreBlockTag(generator, event.getExistingFileHelper()),event.getExistingFileHelper()));
        generator.addProvider(new LootTables(generator));
    }
}

package com.tylerh.extraores.Data;

import com.tylerh.extraores.Data.Advancements.Advancements;
import com.tylerh.extraores.Data.Loot_Tables.LootTables;
import com.tylerh.extraores.Data.Recipes.ExOreRecipe;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EXOreDataGen
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event)
    {
        DataGenerator generator = event.getGenerator();
        generator.addProvider(new LootTables(generator));
        generator.addProvider(new Advancements(generator));
        generator.addProvider(new ExOreRecipe(generator));
    }
}

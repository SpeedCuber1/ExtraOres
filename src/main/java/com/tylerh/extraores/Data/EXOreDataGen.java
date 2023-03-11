package com.tylerh.extraores.Data;

import com.tylerh.extraores.Data.Advancements.Advancements;
import com.tylerh.extraores.Data.Loot_Tables.LootTables;
import com.tylerh.extraores.Data.Recipes.ExOreRecipe;
import com.tylerh.extraores.Data.Rendering.ExOreBlockstateProvider;
import com.tylerh.extraores.Data.Rendering.ExOreItemModelProvider;
import com.tylerh.extraores.Data.Tags.ExOreBlockTag;
import com.tylerh.extraores.Data.Tags.ExOreItemTag;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EXOreDataGen
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event)
    {
        var generator = event.getGenerator();
        var existingFileHelper = event.getExistingFileHelper();
        generator.addProvider(true,new Advancements(generator,existingFileHelper));
        generator.addProvider(true,new ExOreRecipe(generator));
        generator.addProvider(true,new ExOreBlockTag(generator, existingFileHelper));
        generator.addProvider(true,new ExOreItemTag(generator,new ExOreBlockTag(generator,existingFileHelper),existingFileHelper));
        generator.addProvider(true,new LootTables(generator));
        generator.addProvider(true,new ExOreBlockstateProvider(generator,existingFileHelper));
        generator.addProvider(true,new ExOreItemModelProvider(generator,existingFileHelper));
    }
}

package com.tylerh.extraores.Data;

import com.tylerh.extraores.Data.Advancements.ExOreAdvancementGenerator;
import com.tylerh.extraores.Data.Loot_Tables.ExOreLootTableProvider;
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
        var packOutput = generator.getPackOutput();
        var existingFileHelper = event.getExistingFileHelper();
        var lookupProvider = event.getLookupProvider();
        generator.addProvider(true, ExOreLootTableProvider.create(packOutput));
        generator.addProvider(true,new ExOreAdvancementGenerator(packOutput));
        generator.addProvider(true,new ExOreRecipe(packOutput));
        generator.addProvider(true,new ExOreBlockTag(packOutput,lookupProvider,existingFileHelper));
        generator.addProvider(true,new ExOreItemTag(packOutput,lookupProvider,existingFileHelper));
        generator.addProvider(true,new ExOreBlockstateProvider(packOutput,existingFileHelper));
        generator.addProvider(true,new ExOreItemModelProvider(packOutput,existingFileHelper));
    }
}

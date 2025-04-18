package com.tylerh.extraores.Data;

import com.tylerh.extraores.Data.Advancements.ExOreAdvancementProvider;
import com.tylerh.extraores.Data.Loot_Tables.ExOreLootTableProvider;
import com.tylerh.extraores.Data.Recipes.ExOreRecipe;
import com.tylerh.extraores.Data.Rendering.ExOreBlockstateProvider;
import com.tylerh.extraores.Data.Rendering.ExOreItemModelProvider;
import com.tylerh.extraores.Data.Tags.ExOreBlockTag;
import com.tylerh.extraores.Data.Tags.ExOreItemTag;
import com.tylerh.extraores.Util.ModInfo;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = ModInfo.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class EXOreDataGen
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event)
    {
        var generator = event.getGenerator();
        var packOutput = generator.getPackOutput();
        var existingFileHelper = event.getExistingFileHelper();
        var lookupProvider = event.getLookupProvider();
        generator.addProvider(true, ExOreLootTableProvider.create(packOutput,lookupProvider));
        generator.addProvider(true,new ExOreAdvancementProvider(packOutput,lookupProvider,existingFileHelper));
        generator.addProvider(true,new ExOreRecipe(packOutput,lookupProvider));
        generator.addProvider(true,new ExOreBlockTag(packOutput,lookupProvider,existingFileHelper));
        generator.addProvider(true,new ExOreItemTag(packOutput,lookupProvider,existingFileHelper));
        generator.addProvider(true,new ExOreBlockstateProvider(packOutput,existingFileHelper));
        generator.addProvider(true,new ExOreItemModelProvider(packOutput,existingFileHelper));
        //generator.addProvider(true,new ExOreWorldGenProvider(packOutput,lookupProvider));
    }
}

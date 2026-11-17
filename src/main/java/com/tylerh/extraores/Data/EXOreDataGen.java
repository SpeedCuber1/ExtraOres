package com.tylerh.extraores.Data;

import com.tylerh.extraores.Data.Advancements.EXOreAdvancementProvider;
import com.tylerh.extraores.Data.Loot_Tables.ExOreLootTableProvider;
import com.tylerh.extraores.Data.Models.ExOreModelProvider;
import com.tylerh.extraores.Data.Recipes.ExOreRecipeProvider;
import com.tylerh.extraores.Data.Tags.ExOreBlockTag;
import com.tylerh.extraores.Data.Tags.ExOreItemTag;
import com.tylerh.extraores.Data.World.ExOreWorldGenProvider;
import com.tylerh.extraores.Util.ModInfo;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Collections;
import java.util.List;

@EventBusSubscriber(modid = ModInfo.MOD_ID)
public class EXOreDataGen
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event)
    {
        var generator = event.getGenerator();
        var packOutput = generator.getPackOutput();
        var lookupProvider = event.getLookupProvider();
        generator.addProvider(true,new ExOreBlockTag(packOutput,lookupProvider));
        generator.addProvider(true,new ExOreItemTag(packOutput,lookupProvider));
        generator.addProvider(true,new ExOreWorldGenProvider(packOutput,lookupProvider));
        generator.addProvider(true,new EXOreAdvancementProvider(packOutput,lookupProvider));
        generator.addProvider(true,new ExOreModelProvider(packOutput));
        generator.addProvider(true,new ExOreRecipeProvider.Runner(packOutput,lookupProvider));
        generator.addProvider(true,new LootTableProvider(packOutput, Collections.emptySet(), List.of(new LootTableProvider.SubProviderEntry(ExOreLootTableProvider::new, LootContextParamSets.BLOCK)),lookupProvider));
    }
}

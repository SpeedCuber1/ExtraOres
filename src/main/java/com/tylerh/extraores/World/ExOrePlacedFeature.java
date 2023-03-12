package com.tylerh.extraores.World;

import com.tylerh.extraores.Init.ConfigRegistryList;
import com.tylerh.extraores.Init.ConfiguredFeatureList;
import com.tylerh.extraores.Init.PlacedFeatureList;
import com.tylerh.extraores.Util.ModInfo;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ExOrePlacedFeature
{
    public static void bootstrap(BootstapContext<PlacedFeature> context)
    {
        int rate = ExOreWorldGenConfig.spawnRate.get();
        int height;
        HolderGetter<ConfiguredFeature<?,?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);
        if(ConfigRegistryList.registerAdamantine.get())
        {
            PlacedFeatureList.featureAdamantinePlaced = createKey("adamantineore");
            height = ModInfo.HEIGHT_RARE;
            register(context,PlacedFeatureList.featureAdamantinePlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureAdamantine),rate,height);
        }
    }
    private static ResourceKey<PlacedFeature> createKey(String name)
    {
        return ResourceKey.create(Registries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,name));
    }
    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?,?>> configuration,int rate,int height)
    {
        context.register(key,new PlacedFeature(configuration,List.of(CountPlacement.of(rate), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)), BiomeFilter.biome())));
    }
}

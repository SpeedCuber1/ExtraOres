package com.tylerh.extraores.World.Modifiers;

import com.mojang.serialization.Codec;
import com.tylerh.extraores.Init.ConfigRegistryList;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ModifiableBiomeInfo;
import net.minecraftforge.registries.ForgeRegistries;

public record AdamantineOreModifier(HolderSet<Biome> biomes, Holder<PlacedFeature> feature) implements BiomeModifier
{
    @Override
    public void modify(Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.Builder builder)
    {
        if(phase == Phase.ADD && ConfigRegistryList.registerAdamantine.get() && this.biomes.contains(biome))
        {
            var id = ForgeRegistries.BIOMES.getKey(biome.value());
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,this.feature);
        }
    }
    @Override
    public Codec<? extends BiomeModifier> codec()
    {
        return null;
    }
}

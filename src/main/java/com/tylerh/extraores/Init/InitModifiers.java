package com.tylerh.extraores.Init;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.tylerh.extraores.Util.ModInfo;
import com.tylerh.extraores.World.Modifiers.AdamantineOreModifier;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class InitModifiers
{
    public static final DeferredRegister<Codec<? extends BiomeModifier>> MODIFIERS = DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, ModInfo.MOD_ID);
    public static final RegistryObject<Codec<AdamantineOreModifier>> ADAMANTINE_ORE = MODIFIERS.register("adamantineore",() ->
            RecordCodecBuilder.create(builder -> builder.group(
                    Biome.LIST_CODEC.fieldOf("biomes").forGetter(AdamantineOreModifier::biomes),
                    PlacedFeature.CODEC.fieldOf("feature").forGetter(AdamantineOreModifier::feature)
            ).apply(builder,AdamantineOreModifier::new)));
}

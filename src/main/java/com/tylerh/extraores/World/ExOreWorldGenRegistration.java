package com.tylerh.extraores.World;

import com.tylerh.extraores.Init.BlockList;
import com.tylerh.extraores.Init.ConfigRegistryList;
import com.tylerh.extraores.Util.ModInfo;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public final class ExOreWorldGenRegistration
{
    public static void onCommonSetup()
    {
        int size = ExOreWorldGenConfig.veinSize.get();
        int rate = ExOreWorldGenConfig.spawnRate.get();
        int height;
        List<OreConfiguration.TargetBlockState> target;
        ConfiguredFeature<OreConfiguration, ?> feature;
        if (ConfigRegistryList.registerAdamantine.get())
        {
            height = ModInfo.HEIGHT_RARE;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreAdamantine.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreAdamantine.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureAdamantine = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "adamantineore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "adamantineore"), featureAdamantine);
        }
        if (ConfigRegistryList.registerAgate.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreAgate.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreAgate.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureAgate = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "agateore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "agateore"), featureAgate);
        }
        if (ConfigRegistryList.registerAldourite.get())
        {
            height = ModInfo.HEIGHT_NETHER;
            target = List.of(
                    OreConfiguration.target(new BlockMatchTest(Blocks.NETHERRACK), BlockList.blockOreAldourite.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureAldourite = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "aldouriteore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "aldouriteore"), featureAldourite);
        }
        if (ConfigRegistryList.registerAluminum.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreAluminum.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreAluminum.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureAluminum = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "aluminumore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "aluminumore"), featureAluminum);
        }
        if (ConfigRegistryList.registerAmericium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreAmericium.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreAmericium.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureAmericium = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "americiumore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "americiumore"), featureAmericium);
        }
        if (ConfigRegistryList.registerAmethyst.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreAmethyst.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreAmethyst.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureAmethyst = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "amethystore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "amethystore"), featureAmethyst);
        }
        if (ConfigRegistryList.registerAmetrine.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreAmetrine.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreAmetrine.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureAmetrine = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "ametrineore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "ametrineore"), featureAmetrine);
        }
        if (ConfigRegistryList.registerAmordrine.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreAmordrine.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreAmordrine.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureAmordrine = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "amordrineore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "amordrineore"), featureAmordrine);
        }
        if (ConfigRegistryList.registerAngmallen.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreAngmallen.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreAngmallen.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureAngmallen = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "angmallenore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "angmallenore"), featureAngmallen);
        }
        if (ConfigRegistryList.registerAquamarine.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreAquamarine.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreAquamarine.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureAquamarine = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "aquamarineore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "aquamarineore"), featureAquamarine);
        }
        if (ConfigRegistryList.registerAstralSilver.get())
        {
            height = ModInfo.HEIGHT_RARE;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreAstralSilver.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreAstralSilver.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureAstralSilver = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "astralsilverore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "astralsilverore"), featureAstralSilver);
        }
        if (ConfigRegistryList.registerAtlarus.get())
        {
            height = ModInfo.HEIGHT_RARE;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreAtlarus.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreAtlarus.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureAtlarus = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "atlarusore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "atlarusore"), featureAtlarus);
        }
        if (ConfigRegistryList.registerBismuth.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreBismuth.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreBismuth.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureBismuth = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "bismuthore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "bismuthore"), featureBismuth);
        }
        if (ConfigRegistryList.registerBlackSteel.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreBlackSteel.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreBlackSteel.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureBlackSteel = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "blacksteelore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "blacksteelore"), featureBlackSteel);
        }
        if (ConfigRegistryList.registerCadmium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreCadmium.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreCadmium.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureCadmium = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "cadmiumore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "cadmiumore"), featureCadmium);
        }
        if (ConfigRegistryList.registerCarmot.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreCarmot.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreCarmot.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureCarmot = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "carmotore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "carmotore"), featureCarmot);
        }
        if (ConfigRegistryList.registerCelenegil.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreCelenegil.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreCelenegil.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureCelenegil = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "celenegilore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "celenegilore"), featureCelenegil);
        }
        if (ConfigRegistryList.registerCeruclase.get())
        {
            height = ModInfo.HEIGHT_NETHER;
            target = List.of(
                    OreConfiguration.target(new BlockMatchTest(Blocks.NETHERRACK), BlockList.blockOreCeruclase.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureCeruclase = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "ceruclaseore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "ceruclaseore"), featureCeruclase);
        }
        if (ConfigRegistryList.registerChromium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreChromium.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreChromium.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureChromium = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "chromiumore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "chromiumore"), featureChromium);
        }
        if (ConfigRegistryList.registerChrysocolla.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreChrysocolla.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreChrysocolla.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureChrysocolla = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "chrysocollaore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "chrysocollaore"), featureChrysocolla);
        }
        if (ConfigRegistryList.registerCitrine.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreCitrine.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreCitrine.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureCitrine = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "citrineore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "citrineore"), featureCitrine);
        }
        if (ConfigRegistryList.registerCobalt.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreCobalt.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreCobalt.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureCobalt = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "cobaltore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "cobaltore"), featureCobalt);
        }
        if (ConfigRegistryList.registerCopper.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreCopper.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreCopper.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureCopper = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "copperore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "copperore"), featureCopper);
        }
        if(ConfigRegistryList.registerCrimsonSteel.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreCrimsonSteel.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreCrimsonSteel.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureCrimsonSteel = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "crimsonsteelore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "crimsonsteelore"), featureCrimsonSteel);
        }
        if (ConfigRegistryList.registerDeepIron.get())
        {
            height = ModInfo.HEIGHT_RARE;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreDeepIron.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreDeepIron.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureDeepIron = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "deepironore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "deepironore"), featureDeepIron);
        }
        if (ConfigRegistryList.registerDesichalkos.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreDesichalkos.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreDesichalkos.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureDesichalkos = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "desichalkosore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "desichalkosore"), featureDesichalkos);
        }
        if (ConfigRegistryList.registerEximite.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreEximite.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreEximite.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureEximite = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "eximiteore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "eximiteore"), featureEximite);
        }
        if (ConfigRegistryList.registerGallium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreGallium.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreGallium.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureGallium = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "galliumore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "galliumore"), featureGallium);
        }
        if (ConfigRegistryList.registerGarnet.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreGarnet.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreGarnet.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureGarnet = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "garnetore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "garnetore"), featureGarnet);
        }
        if (ConfigRegistryList.registerHaderoth.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreHaderoth.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreHaderoth.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureHaderoth = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "haderothore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "haderothore"), featureHaderoth);
        }
        if (ConfigRegistryList.registerHepatizon.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreHepatizon.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreHepatizon.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureHepatizon = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "hepatizonore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "hepatizonore"), featureHepatizon);
        }
        if (ConfigRegistryList.registerIgnatius.get())
        {
            height = ModInfo.HEIGHT_NETHER;
            target = List.of(
                    OreConfiguration.target(new BlockMatchTest(Blocks.NETHERRACK), BlockList.blockOreIgnatius.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureIgnatius = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "ignatiusore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "ignatiusore"), featureIgnatius);
        }
        if (ConfigRegistryList.registerIndium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreIndium.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreIndium.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureIndium = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "indiumore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "indiumore"), featureIndium);
        }
        if (ConfigRegistryList.registerInfuscolium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreInfuscolium.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreInfuscolium.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureInfuscolium = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "infuscoliumore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "infuscoliumore"), featureInfuscolium);
        }
        if (ConfigRegistryList.registerInolashite.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreInolashite.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreInolashite.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureInolashite = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "inolashiteore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "inolashiteore"), featureInolashite);
        }
        if (ConfigRegistryList.registerIolite.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreIolite.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreIolite.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureIolite = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "ioliteore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "ioliteore"), featureIolite);
        }
        if (ConfigRegistryList.registerIridium.get())
        {
            height = ModInfo.HEIGHT_RARE;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreIridium.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreIridium.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureIridium = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "iridiumore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "iridiumore"), featureIridium);
        }
        if (ConfigRegistryList.registerJade.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreJade.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreJade.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureJade = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "jadeore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "jadeore"), featureJade);
        }
        if (ConfigRegistryList.registerJasper.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreJasper.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreJasper.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureJasper = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "jasperore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "jasperore"), featureJasper);
        }
        if (ConfigRegistryList.registerKalendrite.get())
        {
            height = ModInfo.HEIGHT_NETHER;
            target = List.of(
                    OreConfiguration.target(new BlockMatchTest(Blocks.NETHERRACK), BlockList.blockOreKalendrite.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureKalendrite = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "kalendriteore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "kalendriteore"), featureKalendrite);
        }
        if (ConfigRegistryList.registerKyanite.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreKyanite.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreKyanite.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureKyanite = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "kyaniteore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "kyaniteore"), featureKyanite);
        }
        if (ConfigRegistryList.registerLead.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreLead.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreLead.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureLead = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "leadore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "leadore"), featureLead);
        }
        if (ConfigRegistryList.registerLemurite.get())
        {
            height = ModInfo.HEIGHT_NETHER;
            target = List.of(
                    OreConfiguration.target(new BlockMatchTest(Blocks.NETHERRACK), BlockList.blockOreLemurite.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureLemurite = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "lemuriteore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "lemuriteore"), featureLemurite);
        }
        if (ConfigRegistryList.registerMalachite.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreMalachite.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreMalachite.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureMalachite = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "malachiteore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "malachiteore"), featureMalachite);
        }
        if (ConfigRegistryList.registerManganese.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreManganese.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreManganese.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureManganese = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "manganeseore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "manganeseore"), featureManganese);
        }
        if (ConfigRegistryList.registerMeutoite.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreMeutoite.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreMeutoite.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureMeutoite = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "meutoiteore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "meutoiteore"), featureMeutoite);
        }
        if (ConfigRegistryList.registerMidasium.get())
        {
            height = ModInfo.HEIGHT_NETHER;
            target = List.of(
                    OreConfiguration.target(new BlockMatchTest(Blocks.NETHERRACK), BlockList.blockOreMidasium.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureMidasium = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "midasiumore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "midasiumore"), featureMidasium);
        }
        if (ConfigRegistryList.registerMithril.get())
        {
            height = ModInfo.HEIGHT_RARE;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreMithril.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreMithril.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureMithril = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "mithrilore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "mithrilore"), featureMithril);
        }
        if (ConfigRegistryList.registerMolybdenum.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreMolybdenum.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreMolybdenum.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureMolybdenum = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "molybdenumore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "molybdenumore"), featureMolybdenum);
        }
        if (ConfigRegistryList.registerNeodymium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreNeodymium.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreNeodymium.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureNeodymium = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "neodymiumore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "neodymiumore"), featureNeodymium);
        }
        if (ConfigRegistryList.registerNeptunium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreNeptunium.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreNeptunium.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureNeptunium = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "neptuniumore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "neptuniumore"), featureNeptunium);
        }
        if (ConfigRegistryList.registerNickel.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreNickel.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreNickel.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureNickel = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "nickelore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "nickelore"), featureNickel);
        }
        if (ConfigRegistryList.registerNiobium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreNiobium.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreNiobium.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureNiobium = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "niobiumore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "niobiumore"), featureNiobium);
        }
        if (ConfigRegistryList.registerOnyx.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreOnyx.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreOnyx.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureOnyx = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "onyxore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "onyxore"), featureOnyx);
        }
        if (ConfigRegistryList.registerOpal.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreOpal.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreOpal.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureOpal = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "opalore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "opalore"), featureOpal);
        }
        if (ConfigRegistryList.registerOrichalcum.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreOrichalcum.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreOrichalcum.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureOrichalcum = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "orichalcumore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "orichalcumore"), featureOrichalcum);
        }
        if (ConfigRegistryList.registerOsmium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreOsmium.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreOsmium.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureOsmium = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "osmiumore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "osmiumore"), featureOsmium);
        }
        if (ConfigRegistryList.registerOureclase.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreOureclase.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreOureclase.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureOureclase = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "oureclaseore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "oureclaseore"), featureOureclase);
        }
        if (ConfigRegistryList.registerPalladium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOrePalladium.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOrePalladium.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featurePalladium = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "palladiumore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "palladiumore"), featurePalladium);
        }
        if (ConfigRegistryList.registerPeridot.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOrePeridot.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOrePeridot.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featurePeridot = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "peridotore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "peridotore"), featurePeridot);
        }
        if (ConfigRegistryList.registerPhoenixite.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOrePhoenixite.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOrePhoenixite.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featurePhoenixite = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "phoenixiteore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "phoenixiteore"), featurePhoenixite);
        }
        if (ConfigRegistryList.registerPlatinum.get())
        {
            height = ModInfo.HEIGHT_RARE;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOrePlatinum.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOrePlatinum.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featurePlatinum = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "platinumore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "platinumore"), featurePlatinum);
        }
        if (ConfigRegistryList.registerPlutonium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOrePlutonium.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOrePlutonium.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featurePlutonium = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "plutoniumore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "plutoniumore"), featurePlutonium);
        }
        if (ConfigRegistryList.registerPolonium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOrePolonium.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOrePolonium.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featurePolonium = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "poloniumore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "poloniumore"), featurePolonium);
        }
        if (ConfigRegistryList.registerPromethium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOrePromethium.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOrePromethium.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featurePromethium = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "promethiumore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "promethiumore"), featurePromethium);
        }
        if (ConfigRegistryList.registerQuartz.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreQuartz.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreQuartz.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureQuartz = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "quartzore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "quartzore"), featureQuartz);
        }
        if (ConfigRegistryList.registerRhenium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreRhenium.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreRhenium.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureRhenium = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "rheniumore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "rheniumore"), featureRhenium);
        }
        if (ConfigRegistryList.registerRhodium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreRhodium.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreRhodium.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureRhodium = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "rhodiumore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "rhodiumore"), featureRhodium);
        }
        if (ConfigRegistryList.registerRuthenium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreRuthenium.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreRuthenium.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureRuthenium = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "rutheniumore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "rutheniumore"), featureRuthenium);
        }
        if (ConfigRegistryList.registerRubracium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreRubracium.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreRubracium.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureRubracium = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "rubraciumore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "rubraciumore"), featureRubracium);
        }
        if (ConfigRegistryList.registerRuby.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreRuby.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreRuby.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureRuby = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "rubyore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "rubyore"), featureRuby);
        }
        if (ConfigRegistryList.registerSanguinite.get())
        {
            height = ModInfo.HEIGHT_NETHER;
            target = List.of(
                    OreConfiguration.target(new BlockMatchTest(Blocks.NETHERRACK), BlockList.blockOreSanguinite.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureSanguinite = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "sanguiniteore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "sanguiniteore"), featureSanguinite);
        }
        if (ConfigRegistryList.registerSapphire.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreSapphire.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreSapphire.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureSapphire = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "sapphireore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "sapphireore"), featureSapphire);
        }
        if (ConfigRegistryList.registerShadowIron.get())
        {
            height = ModInfo.HEIGHT_NETHER;
            target = List.of(
                    OreConfiguration.target(new BlockMatchTest(Blocks.NETHERRACK), BlockList.blockOreShadowIron.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureShadowIron = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "shadowironore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "shadowironore"), featureShadowIron);
        }
        if (ConfigRegistryList.registerSilver.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreSilver.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreSilver.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureSilver = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "silverore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "silverore"), featureSilver);
        }
        if (ConfigRegistryList.registerSpinel.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreSpinel.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreSpinel.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureSpinel = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "spinelore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "spinelore"), featureSpinel);
        }
        if (ConfigRegistryList.registerSugilite.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreSugilite.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreSugilite.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureSugilite = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "sugiliteore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "sugiliteore"), featureSugilite);
        }
        if (ConfigRegistryList.registerTantalum.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreTantalum.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreTantalum.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureTantalum = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "tantalumore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "tantalumore"), featureTantalum);
        }
        if (ConfigRegistryList.registerTanzanite.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreTanzanite.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreTanzanite.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureTanzanite = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "tanzaniteore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "tanzaniteore"), featureTanzanite);
        }
        if (ConfigRegistryList.registerTartarite.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreTartarite.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreTartarite.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureTartarite = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "tartariteore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "tartariteore"), featureTartarite);
        }
        if (ConfigRegistryList.registerTechnetium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreTechnetium.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreTechnetium.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureTechnetium = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "technetiumore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "technetiumore"), featureTechnetium);
        }
        if (ConfigRegistryList.registerThallium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreThallium.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreThallium.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureThallium = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "thalliumore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "thalliumore"), featureThallium);
        }
        if (ConfigRegistryList.registerTin.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreTin.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreTin.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureTin = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "tinore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "tinore"), featureTin);
        }
        if (ConfigRegistryList.registerTitanium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreTitanium.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreTitanium.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureTitanium = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "titaniumore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "titaniumore"), featureTitanium);
        }
        if (ConfigRegistryList.registerTopaz.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreTopaz.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreTopaz.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureTopaz = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "topazore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "topazore"), featureTopaz);
        }
        if (ConfigRegistryList.registerTourmaline.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreTourmaline.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreTourmaline.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureTourmaline = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "tourmalineore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "tourmalineore"), featureTourmaline);
        }
        if(ConfigRegistryList.registerTritium.get())
        {
            height = ModInfo.HEIGHT_RARE;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreTritium.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreTritium.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureTritium = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "tritiumore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "tritiumore"), featureTritium);
        }
        if (ConfigRegistryList.registerTungsten.get())
        {
            height = ModInfo.HEIGHT_RARE;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreTungsten.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreTungsten.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureTungsten = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "tungstenore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "tungstenore"), featureTungsten);
        }
        if (ConfigRegistryList.registerTurquoise.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreTurquoise.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreTurquoise.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureTurquoise = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "turquoiseore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "turquoiseore"), featureTurquoise);
        }
        if (ConfigRegistryList.registerUnobtainium.get())
        {
            height = ModInfo.HEIGHT_RARE;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreUnobtainium.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreUnobtainium.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureUnobtainium = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "unobtainiumore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "unobtainiumore"), featureUnobtainium);
        }
        if (ConfigRegistryList.registerUranium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreUranium.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreUranium.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureUranium = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "uraniumore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "uraniumore"), featureUranium);
        }
        if (ConfigRegistryList.registerVanadium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreVanadium.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreVanadium.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureVanadium = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "vanadiumore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "vanadiumore"), featureVanadium);
        }
        if(ConfigRegistryList.registerVibranium.get())
        {
            height = ModInfo.HEIGHT_RARE;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreVibranium.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreVibranium.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureVibranium = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "vibraniumore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "vibraniumore"), featureVibranium);
        }
        if (ConfigRegistryList.registerVulcanite.get())
        {
            height = ModInfo.HEIGHT_NETHER;
            target = List.of(
                    OreConfiguration.target(new BlockMatchTest(Blocks.NETHERRACK), BlockList.blockOreVulcanite.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureVulcanite = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "vulcaniteore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "vulcaniteore"), featureVulcanite);
        }
        if (ConfigRegistryList.registerVyroxeres.get())
        {
            height = ModInfo.HEIGHT_NETHER;
            target = List.of(
                    OreConfiguration.target(new BlockMatchTest(Blocks.NETHERRACK), BlockList.blockOreVyroxeres.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureVyroxeres = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "vyroxeresore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "vyroxeresore"), featureVyroxeres);
        }
        if (ConfigRegistryList.registerYellorite.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreYellorite.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreYellorite.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureYellorite = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "yelloriteore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "yelloriteore"), featureYellorite);
        }
        if (ConfigRegistryList.registerZinc.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreZinc.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreZinc.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureZinc = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "zincore"), feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "zincore"), featureZinc);
        }
        if (ConfigRegistryList.registerZirconium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), BlockList.blockOreZirconium.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockList.blockDeepslateOreZirconium.get().defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(target, size));
            var featureZirconium = new PlacedFeature(Holder.direct(feature), List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            //Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "zirconiumore"), feature);
            //Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(ModInfo.MOD_ID, "zirconiumore"), featureZirconium);
        }
    }
    private static <FC extends FeatureConfiguration,F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?,?>> context, ResourceKey<ConfiguredFeature<?,?>> key,F feature,FC configuration)
    {
        context.register(key,new ConfiguredFeature<>(feature,configuration));
    }
}

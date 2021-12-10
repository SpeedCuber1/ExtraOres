package com.tylerh.extraores.World;

import com.tylerh.extraores.Init.BlockList;
import com.tylerh.extraores.Init.ConfigRegistryList;
import com.tylerh.extraores.Util.ModInfo;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import java.util.List;

public class ExOreWorldGen
{
    @SubscribeEvent
    public void onBiomesLoading(BiomeLoadingEvent event)
    {
        Biome.BiomeCategory category = event.getCategory();
        BiomeGenerationSettingsBuilder builder = event.getGeneration();
        OreConfiguration config;
        List<OreConfiguration.TargetBlockState> target;
        int height;
        int rate = ExOreWorldGenConfig.spawnRate.get();
        int size = ExOreWorldGenConfig.veinSize.get();
        switch (category)
        {
            case NETHER:
                if (ConfigRegistryList.registerAldourite.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES,BlockList.blockOreAldourite.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = 128;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerCeruclase.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES,BlockList.blockOreCeruclase.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = 128;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerIgnatius.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES,BlockList.blockOreIgnatius.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = 128;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerKalendrite.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES,BlockList.blockOreKalendrite.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = 128;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerLemurite.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES,BlockList.blockOreLemurite.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = 128;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerMidasium.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES,BlockList.blockOreMidasium.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = 128;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerSanguinite.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES,BlockList.blockOreSanguinite.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = 128;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerShadowIron.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES,BlockList.blockOreShadowIron.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = 128;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerVulcanite.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES,BlockList.blockOreVulcanite.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = 128;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerVyroxeres.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES,BlockList.blockOreVyroxeres.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = 128;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                break;
            case THEEND:
                break;
            default:
                if(ConfigRegistryList.registerAdamantine.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreAdamantine.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreAdamantine.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_RARE;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerAgate.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreAgate.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreAgate.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerAluminum.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreAluminum.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreAluminum.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerAmericium.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreAmericium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreAmericium.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerAmethyst.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreAmethyst.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreAmethyst.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerAmetrine.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreAmetrine.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreAmetrine.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerAmordrine.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreAmordrine.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreAmordrine.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerAngmallen.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreAngmallen.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreAngmallen.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerAquamarine.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreAquamarine.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreAquamarine.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerAstralSilver.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreAstralSilver.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreAstralSilver.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerAtlarus.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreAtlarus.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreAtlarus.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_RARE;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerBismuth.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreBismuth.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreBismuth.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerBlackSteel.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreBlackSteel.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreBlackSteel.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerCadmium.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreCadmium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreCadmium.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerCarmot.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreCarmot.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreCarmot.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerCelenegil.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreCelenegil.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreCelenegil.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerChromium.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreChromium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreChromium.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerChrysocolla.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreChrysocolla.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreChrysocolla.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerCitrine.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreCitrine.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreCitrine.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerCobalt.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreCobalt.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreCobalt.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerCopper.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreCopper.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreCopper.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerDeepIron.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreDeepIron.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreDeepIron.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_RARE;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerDesichalkos.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreDesichalkos.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreDesichalkos.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerEximite.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreEximite.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreEximite.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerGallium.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreGallium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreGallium.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerGarnet.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreGarnet.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreGarnet.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerHaderoth.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreHaderoth.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreHaderoth.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerHepatizon.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreHepatizon.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreHepatizon.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerIndium.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreIndium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreIndium.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerInfuscolium.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreInfuscolium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreInfuscolium.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerInolashite.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreInolashite.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreInolashite.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerIolite.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreIolite.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreIolite.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerIridium.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreIridium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreIridium.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerJade.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreJade.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreJade.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerJasper.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreJasper.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreJasper.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerKyanite.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreKyanite.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreKyanite.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerLead.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreLead.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreLead.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerMalachite.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreMalachite.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreMalachite.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerManganese.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreManganese.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreManganese.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerMeutoite.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreMeutoite.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreMeutoite.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerMithril.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreMithril.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreMithril.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_RARE;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerMolybdenum.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreMolybdenum.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreMolybdenum.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerNeodymium.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreNeodymium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreNeodymium.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerNeptunium.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreNeptunium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreNeptunium.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerNickel.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreNickel.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreNickel.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerNiobium.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreNiobium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreNiobium.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerOnyx.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreOnyx.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreOnyx.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerOpal.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreOpal.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreOpal.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerOrichalcum.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreOrichalcum.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreOrichalcum.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerOsmium.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreOsmium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreOsmium.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerOureclase.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreOureclase.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreOureclase.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerPalladium.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOrePalladium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOrePalladium.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerPeridot.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOrePeridot.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOrePeridot.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerPhoenixite.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOrePhoenixite.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOrePhoenixite.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerPlatinum.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOrePlatinum.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOrePlatinum.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerPlutonium.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOrePlutonium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOrePlutonium.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerPolonium.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOrePolonium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOrePolonium.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerPromethium.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOrePromethium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOrePromethium.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerQuartz.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreQuartz.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreQuartz.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerRhenium.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreRhenium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreRhenium.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerRhodium.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreRhodium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreRhodium.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerRubracium.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreRubracium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreRubracium.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerRuby.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreRuby.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreRuby.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerRuthenium.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreRuthenium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreRuthenium.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerSilver.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreSilver.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreSilver.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerSpinel.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreSpinel.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreSpinel.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerSugilite.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreSugilite.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreSugilite.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerTantalum.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreTantalum.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreTantalum.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerTanzanite.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreTanzanite.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreTanzanite.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerTartarite.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreTartarite.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreTartarite.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerTechnetium.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreTechnetium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreTechnetium.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerThallium.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreThallium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreThallium.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerTin.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreTin.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreTin.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerTitanium.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreTitanium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreTitanium.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerTopaz.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreTopaz.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreTopaz.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerTourmaline.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreTourmaline.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreTourmaline.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerTungsten.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreTungsten.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreTungsten.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_RARE;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerTurquoise.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreTurquoise.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreTurquoise.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerUnobtainium.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreUnobtainium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreUnobtainium.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_RARE;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerUranium.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreUranium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreUranium.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerVanadium.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreVanadium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreVanadium.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerYellorite.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreYellorite.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreYellorite.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerZinc.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreZinc.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreZinc.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                if(ConfigRegistryList.registerZirconium.get())
                {
                    target = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreZirconium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreZirconium.defaultBlockState()));
                    config = new OreConfiguration(target,size);
                    height = ModInfo.HEIGHT_NORMAL;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(List.of(CountPlacement.of(rate),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.aboveBottom(height)),
                                    BiomeFilter.biome())));
                }
                break;
        }
    }
}

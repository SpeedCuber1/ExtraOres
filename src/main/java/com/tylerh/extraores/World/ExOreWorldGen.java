package com.tylerh.extraores.World;

import com.tylerh.extraores.Init.BlockList;
import com.tylerh.extraores.Init.ConfigRegistryList;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.heightproviders.UniformHeight;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class ExOreWorldGen
{
    private static Logger LOGGER = LogManager.getLogger();
    @SubscribeEvent
    public void onBiomesLoading(BiomeLoadingEvent event)
    {
        Biome.BiomeCategory category = event.getCategory();
        BiomeGenerationSettingsBuilder builder = event.getGeneration();
        OreConfiguration config;
        int height;
        int rate = ExOreWorldGenConfig.spawnRate.get();
        int size = ExOreWorldGenConfig.veinSize.get();
        switch (category)
        {
            case NETHER:
                if (ConfigRegistryList.registerAldourite.get())
                {
                    List<OreConfiguration.TargetBlockState> aldourite = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES,BlockList.blockOreAldourite.defaultBlockState()));
                    config = new OreConfiguration(aldourite, size);
                    height = 64;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))), InSquarePlacement.spread(), CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerCeruclase.get())
                {
                    List<OreConfiguration.TargetBlockState> ceruclase = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES,BlockList.blockOreCeruclase.defaultBlockState()));
                    config = new OreConfiguration(ceruclase, size);
                    height = 64;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))), InSquarePlacement.spread(), CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerIgnatius.get())
                {
                    List<OreConfiguration.TargetBlockState> ignatius = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES,BlockList.blockOreIgnatius.defaultBlockState()));
                    config = new OreConfiguration(ignatius, size);
                    height = 64;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))), InSquarePlacement.spread(), CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerKalendrite.get())
                {
                    List<OreConfiguration.TargetBlockState> kalendrite = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES,BlockList.blockOreKalendrite.defaultBlockState()));
                    config = new OreConfiguration(kalendrite, size);
                    height = 64;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))), InSquarePlacement.spread(), CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerLemurite.get())
                {
                    List<OreConfiguration.TargetBlockState> lemurite = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES,BlockList.blockOreLemurite.defaultBlockState()));
                    config = new OreConfiguration(lemurite, size);
                    height = 64;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))), InSquarePlacement.spread(), CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerMidasium.get())
                {
                    List<OreConfiguration.TargetBlockState> midasium = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreMidasium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreMidasium.defaultBlockState()));
                    config = new OreConfiguration(midasium, size);
                    height = 64;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))), InSquarePlacement.spread(), CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerSanguinite.get())
                {
                    List<OreConfiguration.TargetBlockState> sanguinite = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES,BlockList.blockOreSanguinite.defaultBlockState()));
                    config = new OreConfiguration(sanguinite, size);
                    height = 64;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))), InSquarePlacement.spread(), CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerShadowIron.get())
                {
                    List<OreConfiguration.TargetBlockState> shadowiron = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES,BlockList.blockOreShadowIron.defaultBlockState()));
                    config = new OreConfiguration(shadowiron, size);
                    height = 64;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))), InSquarePlacement.spread(), CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerVulcanite.get())
                {
                    List<OreConfiguration.TargetBlockState> vulcanite = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES,BlockList.blockOreVulcanite.defaultBlockState()));
                    config = new OreConfiguration(vulcanite, size);
                    height = 64;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))), InSquarePlacement.spread(), CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerVyroxeres.get())
                {
                    List<OreConfiguration.TargetBlockState> vyroxeres = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES,BlockList.blockOreVyroxeres.defaultBlockState()));
                    config = new OreConfiguration(vyroxeres, size);
                    height = 64;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))), InSquarePlacement.spread(), CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                break;
            case THEEND:
                break;
            default:
                if(ConfigRegistryList.registerAdamantine.get())
                {
                    List<OreConfiguration.TargetBlockState> adamantine = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreAdamantine.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreAdamantine.defaultBlockState()));
                    config = new OreConfiguration(adamantine,size);
                    height = 140;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerAgate.get())
                {
                    List<OreConfiguration.TargetBlockState> agate = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreAgate.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreAgate.defaultBlockState()));
                    config = new OreConfiguration(agate,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerAluminum.get())
                {
                    List<OreConfiguration.TargetBlockState> aluminum = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreAluminum.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreAluminum.defaultBlockState()));
                    config = new OreConfiguration(aluminum,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerAmericium.get())
                {
                    List<OreConfiguration.TargetBlockState> americium = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreAmericium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreAmericium.defaultBlockState()));
                    config = new OreConfiguration(americium,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerAmethyst.get())
                {
                    List<OreConfiguration.TargetBlockState> amethyst = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreAmethyst.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreAmethyst.defaultBlockState()));
                    config = new OreConfiguration(amethyst,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerAmetrine.get())
                {
                    List<OreConfiguration.TargetBlockState> ametrine = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreAmetrine.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreAmetrine.defaultBlockState()));
                    config = new OreConfiguration(ametrine,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerAmordrine.get())
                {
                    List<OreConfiguration.TargetBlockState> amordrine = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreAmordrine.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreAmordrine.defaultBlockState()));
                    config = new OreConfiguration(amordrine,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerAngmallen.get())
                {
                    List<OreConfiguration.TargetBlockState> angmallen = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreAngmallen.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreAngmallen.defaultBlockState()));
                    config = new OreConfiguration(angmallen,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerAquamarine.get())
                {
                    List<OreConfiguration.TargetBlockState> aquamarine = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreAquamarine.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreAquamarine.defaultBlockState()));
                    config = new OreConfiguration(aquamarine,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerAstralSilver.get())
                {
                    List<OreConfiguration.TargetBlockState> astralsilver = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreAstralSilver.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreAstralSilver.defaultBlockState()));
                    config = new OreConfiguration(astralsilver,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerAtlarus.get())
                {
                    List<OreConfiguration.TargetBlockState> atlarus = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreAtlarus.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreAtlarus.defaultBlockState()));
                    config = new OreConfiguration(atlarus,size);
                    height = 140;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerBismuth.get())
                {
                    List<OreConfiguration.TargetBlockState> bismuth = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreBismuth.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreBismuth.defaultBlockState()));
                    config = new OreConfiguration(bismuth,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerBlackSteel.get())
                {
                    List<OreConfiguration.TargetBlockState> blacksteel = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreBlackSteel.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreBlackSteel.defaultBlockState()));
                    config = new OreConfiguration(blacksteel,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerCadmium.get())
                {
                    List<OreConfiguration.TargetBlockState> cadmium = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreCadmium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreCadmium.defaultBlockState()));
                    config = new OreConfiguration(cadmium,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerCarmot.get())
                {
                    List<OreConfiguration.TargetBlockState> carmot = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreCarmot.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreCarmot.defaultBlockState()));
                    config = new OreConfiguration(carmot,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerCelenegil.get())
                {
                    List<OreConfiguration.TargetBlockState> celenegil = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreCelenegil.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreCelenegil.defaultBlockState()));
                    config = new OreConfiguration(celenegil,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerChromium.get())
                {
                    List<OreConfiguration.TargetBlockState> chromium = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreChromium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreChromium.defaultBlockState()));
                    config = new OreConfiguration(chromium,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerChrysocolla.get())
                {
                    List<OreConfiguration.TargetBlockState> chrysocolla = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreChrysocolla.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreChrysocolla.defaultBlockState()));
                    config = new OreConfiguration(chrysocolla,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerCitrine.get())
                {
                    List<OreConfiguration.TargetBlockState> citrine = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreCitrine.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreCitrine.defaultBlockState()));
                    config = new OreConfiguration(citrine,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerCobalt.get())
                {
                    List<OreConfiguration.TargetBlockState> cobalt = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreCobalt.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreCobalt.defaultBlockState()));
                    config = new OreConfiguration(cobalt,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerCopper.get())
                {
                    List<OreConfiguration.TargetBlockState> copper = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreCopper.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreCopper.defaultBlockState()));
                    config = new OreConfiguration(copper,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerDeepIron.get())
                {
                    List<OreConfiguration.TargetBlockState> deepiron = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreDeepIron.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreDeepIron.defaultBlockState()));
                    config = new OreConfiguration(deepiron,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerDesichalkos.get())
                {
                    List<OreConfiguration.TargetBlockState> desichalkos = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreDesichalkos.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreDesichalkos.defaultBlockState()));
                    config = new OreConfiguration(desichalkos,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerEximite.get())
                {
                    List<OreConfiguration.TargetBlockState> eximite = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreEximite.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreEximite.defaultBlockState()));
                    config = new OreConfiguration(eximite,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerGallium.get())
                {
                    List<OreConfiguration.TargetBlockState> gallium = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreGallium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreGallium.defaultBlockState()));
                    config = new OreConfiguration(gallium,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerGarnet.get())
                {
                    List<OreConfiguration.TargetBlockState> garnet = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreGarnet.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreGarnet.defaultBlockState()));
                    config = new OreConfiguration(garnet,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerHaderoth.get())
                {
                    List<OreConfiguration.TargetBlockState> haderoth = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreHaderoth.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreHaderoth.defaultBlockState()));
                    config = new OreConfiguration(haderoth,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerHepatizon.get())
                {
                    List<OreConfiguration.TargetBlockState> hepatizon = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreHepatizon.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreHepatizon.defaultBlockState()));
                    config = new OreConfiguration(hepatizon,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerIndium.get())
                {
                    List<OreConfiguration.TargetBlockState> indium = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreIndium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreIndium.defaultBlockState()));
                    config = new OreConfiguration(indium,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerInfuscolium.get())
                {
                    List<OreConfiguration.TargetBlockState> infuscolium = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreInfuscolium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreInfuscolium.defaultBlockState()));
                    config = new OreConfiguration(infuscolium,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerInolashite.get())
                {
                    List<OreConfiguration.TargetBlockState> inolashite = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreInolashite.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreInolashite.defaultBlockState()));
                    config = new OreConfiguration(inolashite,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerIolite.get())
                {
                    List<OreConfiguration.TargetBlockState> iolite = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreIolite.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreIolite.defaultBlockState()));
                    config = new OreConfiguration(iolite,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerIridium.get())
                {
                    List<OreConfiguration.TargetBlockState> iridium = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreIridium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreIridium.defaultBlockState()));
                    config = new OreConfiguration(iridium,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerJade.get())
                {
                    List<OreConfiguration.TargetBlockState> jade = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreJade.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreJade.defaultBlockState()));
                    config = new OreConfiguration(jade,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerJasper.get())
                {
                    List<OreConfiguration.TargetBlockState> jasper = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreJasper.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreJasper.defaultBlockState()));
                    config = new OreConfiguration(jasper,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerKyanite.get())
                {
                    List<OreConfiguration.TargetBlockState> kyanite = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreKyanite.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreKyanite.defaultBlockState()));
                    config = new OreConfiguration(kyanite,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerLead.get())
                {
                    List<OreConfiguration.TargetBlockState> lead = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreLead.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreLead.defaultBlockState()));
                    config = new OreConfiguration(lead,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerMalachite.get())
                {
                    List<OreConfiguration.TargetBlockState> malachite = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreMalachite.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreMalachite.defaultBlockState()));
                    config = new OreConfiguration(malachite,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerManganese.get())
                {
                    List<OreConfiguration.TargetBlockState> manganese = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreManganese.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreManganese.defaultBlockState()));
                    config = new OreConfiguration(manganese,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerMeutoite.get())
                {
                    List<OreConfiguration.TargetBlockState> meutoite = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreMeutoite.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreMeutoite.defaultBlockState()));
                    config = new OreConfiguration(meutoite,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerMithril.get())
                {
                    List<OreConfiguration.TargetBlockState> mithril = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreMithril.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreMithril.defaultBlockState()));
                    config = new OreConfiguration(mithril,size);
                    height = 140;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerMolybdenum.get())
                {
                    List<OreConfiguration.TargetBlockState> molybdenum = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreMolybdenum.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreMolybdenum.defaultBlockState()));
                    config = new OreConfiguration(molybdenum,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerNeodymium.get())
                {
                    List<OreConfiguration.TargetBlockState> neodymium = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreNeodymium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreNeodymium.defaultBlockState()));
                    config = new OreConfiguration(neodymium,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerNeptunium.get())
                {
                    List<OreConfiguration.TargetBlockState> neptunium = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreNeptunium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreNeptunium.defaultBlockState()));
                    config = new OreConfiguration(neptunium,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerNickel.get())
                {
                    List<OreConfiguration.TargetBlockState> nickel = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreNickel.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreNickel.defaultBlockState()));
                    config = new OreConfiguration(nickel,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerNiobium.get())
                {
                    List<OreConfiguration.TargetBlockState> niobium = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreNiobium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreNiobium.defaultBlockState()));
                    config = new OreConfiguration(niobium,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerOnyx.get())
                {
                    List<OreConfiguration.TargetBlockState> onyx = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreOnyx.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreOnyx.defaultBlockState()));
                    config = new OreConfiguration(onyx,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerOpal.get())
                {
                    List<OreConfiguration.TargetBlockState> opal = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreOpal.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreOpal.defaultBlockState()));
                    config = new OreConfiguration(opal,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerOrichalcum.get())
                {
                    List<OreConfiguration.TargetBlockState> orichalcum = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreOrichalcum.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreOrichalcum.defaultBlockState()));
                    config = new OreConfiguration(orichalcum,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerOsmium.get())
                {
                    List<OreConfiguration.TargetBlockState> osmium = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreOsmium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreOsmium.defaultBlockState()));
                    config = new OreConfiguration(osmium,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerOureclase.get())
                {
                    List<OreConfiguration.TargetBlockState> oureclase = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreOureclase.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreOureclase.defaultBlockState()));
                    config = new OreConfiguration(oureclase,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerPalladium.get())
                {
                    List<OreConfiguration.TargetBlockState> palladium = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOrePalladium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOrePalladium.defaultBlockState()));
                    config = new OreConfiguration(palladium,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerPeridot.get())
                {
                    List<OreConfiguration.TargetBlockState> peridot = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOrePeridot.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOrePeridot.defaultBlockState()));
                    config = new OreConfiguration(peridot,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerPhoenixite.get())
                {
                    List<OreConfiguration.TargetBlockState> phoenixite = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOrePhoenixite.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOrePhoenixite.defaultBlockState()));
                    config = new OreConfiguration(phoenixite,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerPlatinum.get())
                {
                    List<OreConfiguration.TargetBlockState> platinum = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOrePlatinum.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOrePlatinum.defaultBlockState()));
                    config = new OreConfiguration(platinum,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerPlutonium.get())
                {
                    List<OreConfiguration.TargetBlockState> plutonium = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOrePlutonium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOrePlutonium.defaultBlockState()));
                    config = new OreConfiguration(plutonium,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerPolonium.get())
                {
                    List<OreConfiguration.TargetBlockState> polonium = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOrePolonium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOrePolonium.defaultBlockState()));
                    config = new OreConfiguration(polonium,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerPromethium.get())
                {
                    List<OreConfiguration.TargetBlockState> promethium = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOrePromethium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOrePromethium.defaultBlockState()));
                    config = new OreConfiguration(promethium,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerQuartz.get())
                {
                    List<OreConfiguration.TargetBlockState> quartz = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreQuartz.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreQuartz.defaultBlockState()));
                    config = new OreConfiguration(quartz,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerRhenium.get())
                {
                    List<OreConfiguration.TargetBlockState> rhenium = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreRhenium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreRhenium.defaultBlockState()));
                    config = new OreConfiguration(rhenium,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerRhodium.get())
                {
                    List<OreConfiguration.TargetBlockState> rhodium = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreRhodium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreRhodium.defaultBlockState()));
                    config = new OreConfiguration(rhodium,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerRubracium.get())
                {
                    List<OreConfiguration.TargetBlockState> rubracium = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreRubracium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreRubracium.defaultBlockState()));
                    config = new OreConfiguration(rubracium,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerRuby.get())
                {
                    List<OreConfiguration.TargetBlockState> ruby = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreRuby.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreRuby.defaultBlockState()));
                    config = new OreConfiguration(ruby,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerRuthenium.get())
                {
                    List<OreConfiguration.TargetBlockState> ruthenium = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreRuthenium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreRuthenium.defaultBlockState()));
                    config = new OreConfiguration(ruthenium,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerSilver.get())
                {
                    List<OreConfiguration.TargetBlockState> silver = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreSilver.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreSilver.defaultBlockState()));
                    config = new OreConfiguration(silver,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerSpinel.get())
                {
                    List<OreConfiguration.TargetBlockState> spinel = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreSpinel.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreSpinel.defaultBlockState()));
                    config = new OreConfiguration(spinel,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerSugilite.get())
                {
                    List<OreConfiguration.TargetBlockState> sugilite = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreSugilite.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreSugilite.defaultBlockState()));
                    config = new OreConfiguration(sugilite,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerTantalum.get())
                {
                    List<OreConfiguration.TargetBlockState> tantalum = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreTantalum.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreTantalum.defaultBlockState()));
                    config = new OreConfiguration(tantalum,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerTanzanite.get())
                {
                    List<OreConfiguration.TargetBlockState> tanzanite = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreTanzanite.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreTanzanite.defaultBlockState()));
                    config = new OreConfiguration(tanzanite,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerTartarite.get())
                {
                    List<OreConfiguration.TargetBlockState> tartarite = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreTartarite.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreTartarite.defaultBlockState()));
                    config = new OreConfiguration(tartarite,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerTechnetium.get())
                {
                    List<OreConfiguration.TargetBlockState> technetium = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreTechnetium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreTechnetium.defaultBlockState()));
                    config = new OreConfiguration(technetium,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerThallium.get())
                {
                    List<OreConfiguration.TargetBlockState> thallium = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreThallium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreThallium.defaultBlockState()));
                    config = new OreConfiguration(thallium,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerTin.get())
                {
                    List<OreConfiguration.TargetBlockState> tin = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreTin.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreTin.defaultBlockState()));
                    config = new OreConfiguration(tin,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerTitanium.get())
                {
                    List<OreConfiguration.TargetBlockState> titanium = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreTitanium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreTitanium.defaultBlockState()));
                    config = new OreConfiguration(titanium,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerTopaz.get())
                {
                    List<OreConfiguration.TargetBlockState> topaz = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreTopaz.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreTopaz.defaultBlockState()));
                    config = new OreConfiguration(topaz,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerTourmaline.get())
                {
                    List<OreConfiguration.TargetBlockState> tourmaline = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreTourmaline.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreTourmaline.defaultBlockState()));
                    config = new OreConfiguration(tourmaline,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerTungsten.get())
                {
                    List<OreConfiguration.TargetBlockState> tungsten = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreTungsten.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreTungsten.defaultBlockState()));
                    config = new OreConfiguration(tungsten,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerTurquoise.get())
                {
                    List<OreConfiguration.TargetBlockState> turquoise = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreTurquoise.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreTurquoise.defaultBlockState()));
                    config = new OreConfiguration(turquoise,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerUnobtainium.get())
                {
                    List<OreConfiguration.TargetBlockState> unobtainium = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreUnobtainium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreUnobtainium.defaultBlockState()));
                    config = new OreConfiguration(unobtainium,size);
                    height = 140;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerUranium.get())
                {
                    List<OreConfiguration.TargetBlockState> uranium = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreUranium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreUranium.defaultBlockState()));
                    config = new OreConfiguration(uranium,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerVanadium.get())
                {
                    List<OreConfiguration.TargetBlockState> vanadium = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreVanadium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreVanadium.defaultBlockState()));
                    config = new OreConfiguration(vanadium,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerYellorite.get())
                {
                    List<OreConfiguration.TargetBlockState> yellorite = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreYellorite.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreYellorite.defaultBlockState()));
                    config = new OreConfiguration(yellorite,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerZinc.get())
                {
                    List<OreConfiguration.TargetBlockState> zinc = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreZinc.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreZinc.defaultBlockState()));
                    config = new OreConfiguration(zinc,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                if(ConfigRegistryList.registerZirconium.get())
                {
                    List<OreConfiguration.TargetBlockState> zirconium = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,BlockList.blockOreZirconium.defaultBlockState()),OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreZirconium.defaultBlockState()));
                    config = new OreConfiguration(zirconium,size);
                    height = 200;
                    List<PlacementModifier> modifierList = List.of(HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))),InSquarePlacement.spread(),CountPlacement.of(rate));
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .placed(modifierList));
                }
                break;
        }
    }
}

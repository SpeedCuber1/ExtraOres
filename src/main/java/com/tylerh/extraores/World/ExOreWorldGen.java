package com.tylerh.extraores.World;

import com.tylerh.extraores.Init.BlockList;
import com.tylerh.extraores.Init.ConfigRegistryList;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.WorldGenerationContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RangeDecoratorConfiguration;
import net.minecraft.world.level.levelgen.heightproviders.HeightProvider;
import net.minecraft.world.level.levelgen.heightproviders.UniformHeight;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

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
                    config = new OreConfiguration(OreConfiguration.Predicates.NETHER_ORE_REPLACEABLES,BlockList.blockOreAldourite.defaultBlockState(),size);
                    height = 64;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .rangeUniform(VerticalAnchor.belowTop(height),VerticalAnchor.aboveBottom(-64))
                            .squared()
                            .rarity(rate));
                }
                /*if(ConfigRegistryList.registerCeruclase.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER,BlockList.blockOreCeruclase.getDefaultState(), size);
                    height = 64;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                    .range(height)
                    .square()
                    .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerIgnatius.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER,BlockList.blockOreIgnatius.getDefaultState(), size);
                    height = 64;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                    .range(height)
                    .square()
                    .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerKalendrite.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER,BlockList.blockOreKalendrite.getDefaultState(), size);
                    height = 64;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                    .range(height)
                    .square()
                    .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerLemurite.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER,BlockList.blockOreLemurite.getDefaultState(), size);
                    height = 64;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                    .range(height)
                    .square()
                    .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerMidasium.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER,BlockList.blockOreMidasium.getDefaultState(), size);
                    height = 64;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                    .range(height)
                    .square()
                    .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerSanguinite.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER,BlockList.blockOreSanguinite.getDefaultState(), size);
                    height = 64;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                    .range(height)
                    .square()
                    .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerShadowIron.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER,BlockList.blockOreShadowIron.getDefaultState(), size);
                    height = 64;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                    .range(height)
                    .square()
                    .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerVulcanite.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER,BlockList.blockOreVulcanite.getDefaultState(), size);
                    height = 64;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                    .range(height)
                    .square()
                    .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerVyroxeres.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER,BlockList.blockOreVyroxeres.getDefaultState(), size);
                    height = 64;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                    .range(height)
                    .square()
                    .func_242732_c(rate));
                }*/
                break;
            case THEEND:
                break;
            default:
                if(ConfigRegistryList.registerAdamantine.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES,BlockList.blockOreAdamantine.defaultBlockState(),size);
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                    .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(64))))
                    .squared());
                }/*
                if(ConfigRegistryList.registerAgate.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreAgate.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                    .range(height)
                    .square()
                    .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerAluminum.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreAluminum.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerAmericium.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreAmericium.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerAmethyst.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreAmethyst.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerAmetrine.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreAmetrine.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerAmordrine.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreAmordrine.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerAngmallen.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreAngmallen.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerAquamarine.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreAquamarine.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerAstralSilver.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreAstralSilver.getDefaultState(),size);
                    height = 32;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerAtlarus.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreAtlarus.getDefaultState(),size);
                    height = 32;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerBismuth.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreBismuth.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerBlackSteel.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreBlackSteel.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerCadmium.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreCadmium.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerCarmot.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreCarmot.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerCelenegil.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreCelenegil.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerChromium.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreChromium.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerChrysocolla.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreChrysocolla.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerCitrine.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreCitrine.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerCobalt.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreCobalt.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerCopper.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreCopper.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerDeepIron.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreDeepIron.getDefaultState(),size);
                    height = 32;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerDesichalkos.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreDesichalkos.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerEximite.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreEximite.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerGallium.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreGallium.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerGarnet.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreGarnet.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerHaderoth.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreHaderoth.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerHepatizon.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreHepatizon.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerIndium.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreIndium.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerInfuscolium.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreInfuscolium.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerInolashite.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreInolashite.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerIolite.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreIolite.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerIridium.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreIridium.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerJade.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreJade.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerJasper.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreJasper.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerKyanite.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreKyanite.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerLead.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreLead.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerMalachite.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreMalachite.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerManganese.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreManganese.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerMeutoite.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreMeutoite.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerMithril.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreMithril.getDefaultState(),size);
                    height = 32;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerMolybdenum.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreMolybdenum.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerNeodymium.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreNeodymium.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerNeptunium.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreNeptunium.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerNickel.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreNickel.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerNiobium.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreNiobium.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerOnyx.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreOnyx.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerOpal.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreOpal.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerOrichalcum.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreOrichalcum.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerOsmium.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreOsmium.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerOureclase.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreOureclase.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerPalladium.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOrePalladium.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerPeridot.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOrePeridot.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerPhoenixite.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOrePhoenixite.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerPlatinum.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOrePlatinum.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerPlutonium.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOrePlutonium.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerPolonium.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOrePolonium.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerPromethium.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOrePromethium.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerQuartz.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreQuartz.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerRhenium.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreRhenium.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerRhodium.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreRhodium.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerRubracium.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreRubracium.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerRuby.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreRuby.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerRuthenium.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreRuthenium.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerSilver.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreSilver.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerSpinel.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreSpinel.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerSugilite.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreSugilite.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerTantalum.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreTantalum.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerTanzanite.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreTanzanite.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerTartarite.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreTartarite.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerTechnetium.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreTechnetium.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerThallium.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreThallium.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerTin.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreTin.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerTitanium.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreTitanium.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerTopaz.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreTopaz.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerTourmaline.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreTourmaline.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerTungsten.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreTungsten.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerTurquoise.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreTurquoise.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerUnobtainium.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreUnobtainium.getDefaultState(),size);
                    height = 32;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerUranium.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreUranium.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerVanadium.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreVanadium.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerYellorite.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreYellorite.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerZinc.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreZinc.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }
                if(ConfigRegistryList.registerZirconium.get())
                {
                    config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,BlockList.blockOreZirconium.getDefaultState(),size);
                    height = 100;
                    builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
                            .range(height)
                            .square()
                            .func_242732_c(rate));
                }*/
                break;
        }
    }
}

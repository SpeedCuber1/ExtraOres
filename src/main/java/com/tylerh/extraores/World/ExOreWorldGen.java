package com.tylerh.extraores.World;

import com.tylerh.extraores.Init.BlockList;
import com.tylerh.extraores.Init.ConfigRegistryList;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExOreWorldGen
{
    private static Logger LOGGER = LogManager.getLogger();
    @SubscribeEvent
    public void onBiomesLoading(BiomeLoadingEvent event)
    {
        BiomeGenerationSettingsBuilder builder = event.getGeneration();
        OreFeatureConfig config;
        int size = ExOreWorldGenConfig.veinSize.get();
        int rate = ExOreWorldGenConfig.spawnRate.get();
        int height;
        if (ConfigRegistryList.registerAdamantine.get())
        {
            height = 32;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreAdamantine.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
            .func_242733_d(height)
            .func_242728_a()
            .func_242732_c(rate));
        }
        if(ConfigRegistryList.registerAldourite.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241883_b,BlockList.blockOreAldourite.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(config)
            .func_242733_d(height)
            .func_242728_a().func_242732_c(rate));
        }
        if (ConfigRegistryList.registerAluminum.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreAluminum.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerAmordrine.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreAmordrine.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerAngmallen.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreAngmallen.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerAstralSilver.get())
        {
            height = 32;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreAstralSilver.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerAtlarus.get())
        {
            height = 32;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreAtlarus.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerBismuth.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreBismuth.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerBlackSteel.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreBlackSteel.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerCadmium.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreCadmium.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerCarmot.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreCarmot.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerCelenegil.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreCelenegil.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerCeruclase.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241883_b, BlockList.blockOreCeruclase.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerChromium.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreChromium.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerCobalt.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreCobalt.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerCopper.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreCopper.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerDeepIron.get())
        {
            height = 32;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreDeepIron.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerDesichalkos.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreDesichalkos.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerEximite.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreEximite.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerGallium.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreGallium.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerHaderoth.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreHaderoth.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerHepatizon.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreHepatizon.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerIgnatius.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241883_b, BlockList.blockOreIgnatius.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerIndium.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreIndium.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerInfuscolium.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreInfuscolium.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerInolashite.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreInolashite.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerKalendrite.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241883_b, BlockList.blockOreKalendrite.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerLead.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreLead.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerLemurite.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241883_b, BlockList.blockOreLemurite.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerManganese.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreManganese.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerMeutoite.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreMeutoite.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerMidasium.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241883_b, BlockList.blockOreMidasium.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerMithril.get())
        {
            height = 32;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreMithril.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerMolybdenum.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreMolybdenum.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerNeodymium.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreNeodymium.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerNickel.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreNickel.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerNiobium.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreNiobium.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerOrichalcum.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreOrichalcum.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerOureclase.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreOureclase.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerPalladium.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOrePalladium.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerPlatinum.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOrePlatinum.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if(ConfigRegistryList.registerPlutonium.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOrePlutonium.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerPrometheum.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOrePrometheum.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerRhodium.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreRhodium.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerRubracium.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreRubracium.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerRuthenium.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreRuthenium.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerSanguinite.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241883_b, BlockList.blockOreSanguinite.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerShadowIron.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241883_b, BlockList.blockOreShadowIron.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerSilver.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreSilver.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if(ConfigRegistryList.registerTartarite.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreTartarite.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerTechnetium.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreTechnetium.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerThallium.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreThallium.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerTin.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreTin.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerTitanium.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreTitanium.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerTungsten.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreTungsten.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerUnobtainium.get())
        {
            height = 32;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreUnobtainium.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerUranium.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreUranium.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerVanadium.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreVanadium.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerVulcanite.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241883_b, BlockList.blockOreVulcanite.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerVyroxeres.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241883_b, BlockList.blockOreVyroxeres.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerZinc.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreZinc.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
        if (ConfigRegistryList.registerZirconium.get())
        {
            height = 100;
            config = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockList.blockOreZirconium.getDefaultState(),size);
            builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(config)
                    .func_242733_d(height)
                    .func_242728_a()
                    .func_242732_c(rate));
        }
    }
}

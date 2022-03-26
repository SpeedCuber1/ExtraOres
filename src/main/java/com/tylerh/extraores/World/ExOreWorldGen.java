package com.tylerh.extraores.World;

import com.tylerh.extraores.Init.BlockList;
import com.tylerh.extraores.Init.ConfigRegistryList;
import com.tylerh.extraores.Init.PlacedFeatureList;
import com.tylerh.extraores.Util.ModInfo;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.List;

public final class ExOreWorldGen
{
    @SubscribeEvent
    public void onBiomesLoading(BiomeLoadingEvent event)
    {
        var category = event.getCategory();
        var builder = event.getGeneration();
        if (category == Biome.BiomeCategory.NETHER)
        {
            if(ConfigRegistryList.registerAldourite.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureAldourite));
            }
            if(ConfigRegistryList.registerCeruclase.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Holder.direct(PlacedFeatureList.featureCeruclase));
            }
            if(ConfigRegistryList.registerIgnatius.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Holder.direct(PlacedFeatureList.featureIgnatius));
            }
            if(ConfigRegistryList.registerKalendrite.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Holder.direct(PlacedFeatureList.featureKalendrite));
            }
            if(ConfigRegistryList.registerLemurite.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Holder.direct(PlacedFeatureList.featureLemurite));
            }
            if(ConfigRegistryList.registerMidasium.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Holder.direct(PlacedFeatureList.featureMidasium));
            }
            if(ConfigRegistryList.registerSanguinite.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Holder.direct(PlacedFeatureList.featureSanguinite));
            }
            if(ConfigRegistryList.registerShadowIron.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Holder.direct(PlacedFeatureList.featureShadowIron));
            }
            if(ConfigRegistryList.registerVulcanite.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Holder.direct(PlacedFeatureList.featureVulcanite));
            }
            if(ConfigRegistryList.registerVyroxeres.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Holder.direct(PlacedFeatureList.featureVyroxeres));
            }
        }
        else
        {
            if (ConfigRegistryList.registerAdamantine.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureAdamantine));
            }
            if (ConfigRegistryList.registerAgate.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureAgate));
            }
            if (ConfigRegistryList.registerAluminum.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureAluminum));
            }
            if (ConfigRegistryList.registerAmericium.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureAmericium));
            }
            if (ConfigRegistryList.registerAmethyst.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureAmethyst));
            }
            if (ConfigRegistryList.registerAmetrine.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureAmetrine));
            }
            if (ConfigRegistryList.registerAmordrine.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureAmordrine));
            }
            if (ConfigRegistryList.registerAngmallen.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureAngmallen));
            }
            if (ConfigRegistryList.registerAquamarine.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureAquamarine));
            }
            if (ConfigRegistryList.registerAstralSilver.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureAstralSilver));
            }
            if (ConfigRegistryList.registerAtlarus.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureAtlarus));
            }
            if (ConfigRegistryList.registerBismuth.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureBismuth));
            }
            if (ConfigRegistryList.registerBlackSteel.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureBlackSteel));
            }
            if (ConfigRegistryList.registerCadmium.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureCadmium));
            }
            if (ConfigRegistryList.registerCarmot.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureCarmot));
            }
            if (ConfigRegistryList.registerCelenegil.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureCelenegil));
            }
            if (ConfigRegistryList.registerChromium.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureChromium));
            }
            if (ConfigRegistryList.registerChrysocolla.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureChrysocolla));
            }
            if (ConfigRegistryList.registerCitrine.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureCitrine));
            }
            if (ConfigRegistryList.registerCobalt.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureCobalt));
            }
            if (ConfigRegistryList.registerCopper.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureCopper));
            }
            if (ConfigRegistryList.registerDeepIron.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureDeepIron));
            }
            if (ConfigRegistryList.registerDesichalkos.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureDesichalkos));
            }
            if (ConfigRegistryList.registerEximite.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureEximite));
            }
            if (ConfigRegistryList.registerGallium.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureGallium));
            }
            if (ConfigRegistryList.registerGarnet.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureGarnet));
            }
            if (ConfigRegistryList.registerHaderoth.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureHaderoth));
            }
            if (ConfigRegistryList.registerHepatizon.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureHepatizon));
            }
            if (ConfigRegistryList.registerIndium.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureIndium));
            }
            if (ConfigRegistryList.registerInfuscolium.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureInfuscolium));
            }
            if (ConfigRegistryList.registerInolashite.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureInolashite));
            }
            if (ConfigRegistryList.registerIolite.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureIolite));
            }
            if (ConfigRegistryList.registerIridium.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureIridium));
            }
            if (ConfigRegistryList.registerJade.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureJade));
            }
            if (ConfigRegistryList.registerJasper.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureJasper));
            }
            if (ConfigRegistryList.registerKyanite.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureKyanite));
            }
            if (ConfigRegistryList.registerLead.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureLead));
            }
            if (ConfigRegistryList.registerMalachite.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureMalachite));
            }
            if (ConfigRegistryList.registerManganese.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureManganese));
            }
            if (ConfigRegistryList.registerMeutoite.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureMeutoite));
            }
            if (ConfigRegistryList.registerMithril.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureMithril));
            }
            if (ConfigRegistryList.registerMolybdenum.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureMolybdenum));
            }
            if (ConfigRegistryList.registerNeodymium.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureNeodymium));
            }
            if (ConfigRegistryList.registerNeptunium.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureNeptunium));
            }
            if (ConfigRegistryList.registerNickel.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureNickel));
            }
            if (ConfigRegistryList.registerNiobium.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureNiobium));
            }
            if (ConfigRegistryList.registerOnyx.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureOnyx));
            }
            if (ConfigRegistryList.registerOpal.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureOpal));
            }
            if (ConfigRegistryList.registerOrichalcum.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureOrichalcum));
            }
            if (ConfigRegistryList.registerOsmium.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureOsmium));
            }
            if (ConfigRegistryList.registerOureclase.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureOureclase));
            }
            if (ConfigRegistryList.registerPalladium.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featurePalladium));
            }
            if (ConfigRegistryList.registerPeridot.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featurePeridot));
            }
            if (ConfigRegistryList.registerPhoenixite.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featurePhoenixite));
            }
            if (ConfigRegistryList.registerPlatinum.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featurePlatinum));
            }
            if (ConfigRegistryList.registerPlutonium.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featurePlutonium));
            }
            if (ConfigRegistryList.registerPolonium.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featurePolonium));
            }
            if (ConfigRegistryList.registerPromethium.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featurePromethium));
            }
            if (ConfigRegistryList.registerQuartz.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureQuartz));
            }
            if (ConfigRegistryList.registerRhenium.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureRhenium));
            }
            if (ConfigRegistryList.registerRhodium.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureRhodium));
            }
            if (ConfigRegistryList.registerRuthenium.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureRuthenium));
            }
            if (ConfigRegistryList.registerRubracium.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(PlacedFeatureList.featureRubracium));
            }
            if (ConfigRegistryList.registerRuby.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Holder.direct(PlacedFeatureList.featureRuby));
            }
            if(ConfigRegistryList.registerSapphire.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Holder.direct(PlacedFeatureList.featureSapphire));
            }
            if(ConfigRegistryList.registerSilver.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Holder.direct(PlacedFeatureList.featureSilver));
            }
            if(ConfigRegistryList.registerSpinel.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Holder.direct(PlacedFeatureList.featureSpinel));
            }
            if(ConfigRegistryList.registerSugilite.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Holder.direct(PlacedFeatureList.featureSugilite));
            }
            if(ConfigRegistryList.registerTantalum.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Holder.direct(PlacedFeatureList.featureTantalum));
            }
            if(ConfigRegistryList.registerTanzanite.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Holder.direct(PlacedFeatureList.featureTanzanite));
            }
            if(ConfigRegistryList.registerTartarite.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Holder.direct(PlacedFeatureList.featureTartarite));
            }
            if(ConfigRegistryList.registerTechnetium.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Holder.direct(PlacedFeatureList.featureTechnetium));
            }
            if(ConfigRegistryList.registerThallium.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Holder.direct(PlacedFeatureList.featureThallium));
            }
            if(ConfigRegistryList.registerTin.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Holder.direct(PlacedFeatureList.featureTin));
            }
            if(ConfigRegistryList.registerTitanium.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Holder.direct(PlacedFeatureList.featureTitanium));
            }
            if(ConfigRegistryList.registerTopaz.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Holder.direct(PlacedFeatureList.featureTopaz));
            }
            if(ConfigRegistryList.registerTourmaline.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Holder.direct(PlacedFeatureList.featureTourmaline));
            }
            if(ConfigRegistryList.registerTungsten.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Holder.direct(PlacedFeatureList.featureTungsten));
            }
            if(ConfigRegistryList.registerTurquoise.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Holder.direct(PlacedFeatureList.featureTurquoise));
            }
            if(ConfigRegistryList.registerUnobtainium.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Holder.direct(PlacedFeatureList.featureUnobtainium));
            }
            if(ConfigRegistryList.registerUranium.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Holder.direct(PlacedFeatureList.featureUranium));
            }
            if(ConfigRegistryList.registerVanadium.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Holder.direct(PlacedFeatureList.featureVanadium));
            }
            if(ConfigRegistryList.registerYellorite.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Holder.direct(PlacedFeatureList.featureYellorite));
            }
            if(ConfigRegistryList.registerZinc.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Holder.direct(PlacedFeatureList.featureZinc));
            }
            if(ConfigRegistryList.registerZirconium.get())
            {
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Holder.direct(PlacedFeatureList.featureZirconium));
            }
        }
    }
    public static void onCommonSetup()
    {
        int size = ExOreWorldGenConfig.veinSize.get();
        int rate = ExOreWorldGenConfig.spawnRate.get();
        int height;
        List<OreConfiguration.TargetBlockState> target;
        ConfiguredFeature<OreConfiguration,?> feature;
        if(ConfigRegistryList.registerAdamantine.get())
        {
            height = ModInfo.HEIGHT_RARE;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreAdamantine.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockDeepslateOreAdamantine.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureAdamantine = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"adamantineore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"adamantineore"),PlacedFeatureList.featureAdamantine);
        }
        if(ConfigRegistryList.registerAgate.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreAgate.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreAgate.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureAgate = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"agateore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"agateore"),PlacedFeatureList.featureAgate);
        }
        if(ConfigRegistryList.registerAldourite.get())
        {
            height = ModInfo.HEIGHT_NETHER;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreAldourite.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreAldourite.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureAldourite = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"aldouriteore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"aldouriteore"),PlacedFeatureList.featureAldourite);
        }
        if(ConfigRegistryList.registerAluminum.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreAluminum.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreAluminum.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureAluminum = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"aluminumore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"aluminumore"),PlacedFeatureList.featureAluminum);
        }
        if(ConfigRegistryList.registerAmericium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreAmericium.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreAmericium.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureAmericium = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"americiumore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"americiumore"),PlacedFeatureList.featureAmericium);
        }
        if(ConfigRegistryList.registerAmethyst.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreAmethyst.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreAmethyst.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureAmethyst = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"amethystore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"amethystore"),PlacedFeatureList.featureAmethyst);
        }
        if(ConfigRegistryList.registerAmetrine.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreAmetrine.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreAmetrine.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureAmetrine = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"ametrineore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"ametrineore"),PlacedFeatureList.featureAmetrine);
        }
        if(ConfigRegistryList.registerAmordrine.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreAmordrine.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreAmordrine.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureAmordrine = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"amordrineore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"amordrineore"),PlacedFeatureList.featureAmordrine);
        }
        if(ConfigRegistryList.registerAngmallen.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreAngmallen.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreAngmallen.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureAngmallen = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"angmallenore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"angmallenore"),PlacedFeatureList.featureAngmallen);
        }
        if(ConfigRegistryList.registerAquamarine.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreAquamarine.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreAquamarine.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureAquamarine = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"aquamarineore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"aquamarineore"),PlacedFeatureList.featureAquamarine);
        }
        if(ConfigRegistryList.registerAstralSilver.get())
        {
            height = ModInfo.HEIGHT_RARE;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreAstralSilver.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreAstralSilver.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureAstralSilver = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"astralsilverore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"astralsilverore"),PlacedFeatureList.featureAstralSilver);
        }
        if(ConfigRegistryList.registerAtlarus.get())
        {
            height = ModInfo.HEIGHT_RARE;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreAtlarus.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreAtlarus.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureAtlarus = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"atlarusore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"atlarusore"),PlacedFeatureList.featureAtlarus);
        }
        if(ConfigRegistryList.registerBismuth.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreBismuth.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreBismuth.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureBismuth = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"bismuthore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"bismuthore"),PlacedFeatureList.featureBismuth);
        }
        if(ConfigRegistryList.registerBlackSteel.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreBlackSteel.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreBlackSteel.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureBlackSteel = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"blacksteelore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"blacksteelore"),PlacedFeatureList.featureBlackSteel);
        }
        if(ConfigRegistryList.registerCadmium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreCadmium.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreCadmium.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureCadmium = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"cadmiumore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"cadmiumore"),PlacedFeatureList.featureCadmium);
        }
        if(ConfigRegistryList.registerCarmot.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreCarmot.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreCarmot.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureCarmot = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"carmotore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"carmotore"),PlacedFeatureList.featureCarmot);
        }
        if(ConfigRegistryList.registerCelenegil.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreCelenegil.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreCelenegil.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureCelenegil = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"celenegilore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"celenegilore"),PlacedFeatureList.featureCelenegil);
        }
        if(ConfigRegistryList.registerCeruclase.get())
        {
            height = ModInfo.HEIGHT_NETHER;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreCeruclase.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreCeruclase.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureCeruclase = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"ceruclaseore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"ceruclaseore"),PlacedFeatureList.featureCeruclase);
        }
        if(ConfigRegistryList.registerChromium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreChromium.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreChromium.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureChromium = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"chromiumore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"chromiumore"),PlacedFeatureList.featureChromium);
        }
        if(ConfigRegistryList.registerChrysocolla.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreChrysocolla.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreChrysocolla.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureChrysocolla = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"chrysocollaore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"chrysocollaore"),PlacedFeatureList.featureChrysocolla);
        }
        if(ConfigRegistryList.registerCitrine.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreCitrine.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreCitrine.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureCitrine = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"citrineore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"citrineore"),PlacedFeatureList.featureCitrine);
        }
        if(ConfigRegistryList.registerCobalt.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreCobalt.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreCobalt.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureCobalt = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"cobaltore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"cobaltore"),PlacedFeatureList.featureCobalt);
        }
        if(ConfigRegistryList.registerCopper.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreCopper.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreCopper.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureCopper = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"copperore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"copperore"),PlacedFeatureList.featureCopper);
        }
        if(ConfigRegistryList.registerDeepIron.get())
        {
            height = ModInfo.HEIGHT_RARE;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreDeepIron.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreDeepIron.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureDeepIron = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"deepironore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"deepironore"),PlacedFeatureList.featureDeepIron);
        }
        if(ConfigRegistryList.registerDesichalkos.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreDesichalkos.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreDesichalkos.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureDesichalkos = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"desichalkosore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"desichalkosore"),PlacedFeatureList.featureDesichalkos);
        }
        if(ConfigRegistryList.registerEximite.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreEximite.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreEximite.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureEximite = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"eximiteore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"eximiteore"),PlacedFeatureList.featureEximite);
        }
        if(ConfigRegistryList.registerGallium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreGallium.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreGallium.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureGallium = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"galliumore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"galliumore"),PlacedFeatureList.featureGallium);
        }
        if(ConfigRegistryList.registerGarnet.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreGarnet.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreGarnet.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureGarnet = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"garnetore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"garnetore"),PlacedFeatureList.featureGarnet);
        }
        if(ConfigRegistryList.registerHaderoth.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreHaderoth.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreHaderoth.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureHaderoth = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"haderothore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"haderothore"),PlacedFeatureList.featureHaderoth);
        }
        if(ConfigRegistryList.registerHepatizon.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreHepatizon.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreHepatizon.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureHepatizon = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"hepatizonore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"hepatizonore"),PlacedFeatureList.featureHepatizon);
        }
        if(ConfigRegistryList.registerIgnatius.get())
        {
            height = ModInfo.HEIGHT_NETHER;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreIgnatius.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreIgnatius.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureIgnatius = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"ignatiusore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"ignatiusore"),PlacedFeatureList.featureIgnatius);
        }
        if(ConfigRegistryList.registerIndium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreIndium.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreIndium.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureIndium = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"indiumore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"indiumore"),PlacedFeatureList.featureIndium);
        }
        if(ConfigRegistryList.registerInfuscolium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreInfuscolium.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreInfuscolium.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureInfuscolium = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"infuscoliumore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"infuscoliumore"),PlacedFeatureList.featureInfuscolium);
        }
        if(ConfigRegistryList.registerInolashite.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreInolashite.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreInolashite.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureInolashite = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"inolashiteore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"inolashiteore"),PlacedFeatureList.featureInolashite);
        }
        if(ConfigRegistryList.registerIolite.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreIolite.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreIolite.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureIolite = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"ioliteore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"ioliteore"),PlacedFeatureList.featureIolite);
        }
        if(ConfigRegistryList.registerIridium.get())
        {
            height = ModInfo.HEIGHT_RARE;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreIridium.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreIridium.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureIridium = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"iridiumore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"iridiumore"),PlacedFeatureList.featureIridium);
        }
        if(ConfigRegistryList.registerJade.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreJade.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreJade.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureJade = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"jadeore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"jadeore"),PlacedFeatureList.featureJade);
        }
        if(ConfigRegistryList.registerJasper.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreJasper.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreJasper.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureJasper = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"jasperore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"jasperore"),PlacedFeatureList.featureJasper);
        }
        if(ConfigRegistryList.registerKalendrite.get())
        {
            height = ModInfo.HEIGHT_NETHER;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreKalendrite.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreKalendrite.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureKalendrite = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"kalendriteore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"kalendriteore"),PlacedFeatureList.featureKalendrite);
        }
        if(ConfigRegistryList.registerKyanite.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreKyanite.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreKyanite.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureKyanite = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"kyaniteore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"kyaniteore"),PlacedFeatureList.featureKyanite);
        }
        if(ConfigRegistryList.registerLead.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreLead.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreLead.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureLead = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"leadore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"leadore"),PlacedFeatureList.featureLead);
        }
        if(ConfigRegistryList.registerLemurite.get())
        {
            height = ModInfo.HEIGHT_NETHER;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreLemurite.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreLemurite.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureLemurite = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"lemuriteore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"lemuriteore"),PlacedFeatureList.featureLemurite);
        }
        if(ConfigRegistryList.registerMalachite.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreMalachite.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreMalachite.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureMalachite = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"malachiteore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"malachiteore"),PlacedFeatureList.featureMalachite);
        }
        if(ConfigRegistryList.registerManganese.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreManganese.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreManganese.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureManganese = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"manganeseore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"manganeseore"),PlacedFeatureList.featureManganese);
        }
        if(ConfigRegistryList.registerMeutoite.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreMeutoite.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreMeutoite.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureMeutoite = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"meutoiteore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"meutoiteore"),PlacedFeatureList.featureMeutoite);
        }
        if(ConfigRegistryList.registerMidasium.get())
        {
            height = ModInfo.HEIGHT_NETHER;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreMidasium.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreMidasium.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureMidasium = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"midasiumore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"midasiumore"),PlacedFeatureList.featureMidasium);
        }
        if(ConfigRegistryList.registerMithril.get())
        {
            height = ModInfo.HEIGHT_RARE;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreMithril.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreMithril.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureMithril = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"mithrilore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"mithrilore"),PlacedFeatureList.featureMithril);
        }
        if(ConfigRegistryList.registerMolybdenum.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreMolybdenum.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreMolybdenum.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureMolybdenum = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"molybdenumore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"molybdenumore"),PlacedFeatureList.featureMolybdenum);
        }
        if(ConfigRegistryList.registerNeodymium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreNeodymium.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreNeodymium.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureNeodymium = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"neodymiumore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"neodymiumore"),PlacedFeatureList.featureNeodymium);
        }
        if(ConfigRegistryList.registerNeptunium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreNeptunium.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreNeptunium.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureNeptunium = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"neptuniumore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"neptuniumore"),PlacedFeatureList.featureNeptunium);
        }
        if(ConfigRegistryList.registerNickel.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreNickel.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreNickel.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureNickel = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"nickelore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"nickelore"),PlacedFeatureList.featureNickel);
        }
        if(ConfigRegistryList.registerNiobium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreNiobium.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreNiobium.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureNiobium = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"niobiumore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"niobiumore"),PlacedFeatureList.featureNiobium);
        }
        if(ConfigRegistryList.registerOnyx.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreOnyx.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreOnyx.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureOnyx = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"onyxore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"onyxore"),PlacedFeatureList.featureOnyx);
        }
        if(ConfigRegistryList.registerOpal.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreOpal.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreOpal.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureOpal = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"opalore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"opalore"),PlacedFeatureList.featureOpal);
        }
        if(ConfigRegistryList.registerOrichalcum.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreOrichalcum.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreOrichalcum.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureOrichalcum = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"orichalcumore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"orichalcumore"),PlacedFeatureList.featureOrichalcum);
        }
        if(ConfigRegistryList.registerOsmium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreOsmium.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreOsmium.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureOsmium = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"osmiumore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"osmiumore"),PlacedFeatureList.featureOsmium);
        }
        if(ConfigRegistryList.registerOureclase.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreOureclase.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreOureclase.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureOureclase = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"oureclaseore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"oureclaseore"),PlacedFeatureList.featureOureclase);
        }
        if(ConfigRegistryList.registerPalladium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOrePalladium.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOrePalladium.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featurePalladium = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"palladiumore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"palladiumore"),PlacedFeatureList.featurePalladium);
        }
        if(ConfigRegistryList.registerPeridot.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOrePeridot.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOrePeridot.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featurePeridot = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"peridotore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"peridotore"),PlacedFeatureList.featurePeridot);
        }
        if(ConfigRegistryList.registerPhoenixite.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOrePhoenixite.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOrePhoenixite.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featurePhoenixite = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"phoenixiteore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"phoenixiteore"),PlacedFeatureList.featurePhoenixite);
        }
        if(ConfigRegistryList.registerPlatinum.get())
        {
            height = ModInfo.HEIGHT_RARE;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOrePlatinum.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOrePlatinum.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featurePlatinum = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"platinumore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"platinumore"),PlacedFeatureList.featurePlatinum);
        }
        if(ConfigRegistryList.registerPlutonium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOrePlutonium.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOrePlutonium.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featurePlutonium = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"plutoniumore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"plutoniumore"),PlacedFeatureList.featurePlutonium);
        }
        if(ConfigRegistryList.registerPolonium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOrePolonium.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOrePolonium.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featurePolonium = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"poloniumore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"poloniumore"),PlacedFeatureList.featurePolonium);
        }
        if(ConfigRegistryList.registerPromethium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOrePromethium.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOrePromethium.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featurePromethium = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"promethiumore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"promethiumore"),PlacedFeatureList.featurePromethium);
        }
        if(ConfigRegistryList.registerQuartz.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreQuartz.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreQuartz.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureQuartz = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"quartzore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"quartzore"),PlacedFeatureList.featureQuartz);
        }
        if(ConfigRegistryList.registerRhenium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreRhenium.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreRhenium.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureRhenium = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"rheniumore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"rheniumore"),PlacedFeatureList.featureRhenium);
        }
        if(ConfigRegistryList.registerRhodium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreRhodium.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreRhodium.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureRhodium = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"rhodiumore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"rhodiumore"),PlacedFeatureList.featureRhodium);
        }
        if(ConfigRegistryList.registerRuthenium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreRuthenium.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreRuthenium.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureRuthenium = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"rutheniumore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"rutheniumore"),PlacedFeatureList.featureRuthenium);
        }
        if(ConfigRegistryList.registerRubracium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreRubracium.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreRubracium.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureRubracium = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"rubraciumore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"rubraciumore"),PlacedFeatureList.featureRubracium);
        }
        if(ConfigRegistryList.registerRuby.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreRuby.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreRuby.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureRuby = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"rubyore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"rubyore"),PlacedFeatureList.featureRuby);
        }
        if(ConfigRegistryList.registerSanguinite.get())
        {
            height = ModInfo.HEIGHT_NETHER;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreSanguinite.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreSanguinite.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureSanguinite = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"sanguiniteore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"sanguiniteore"),PlacedFeatureList.featureSanguinite);
        }
        if(ConfigRegistryList.registerSapphire.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreSapphire.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreSapphire.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureSapphire = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"sapphireore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"sapphireore"),PlacedFeatureList.featureSapphire);
        }
        if(ConfigRegistryList.registerShadowIron.get())
        {
            height = ModInfo.HEIGHT_NETHER;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreShadowIron.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreShadowIron.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureShadowIron = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"shadowironore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"shadowironore"),PlacedFeatureList.featureShadowIron);
        }
        if(ConfigRegistryList.registerSilver.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreSilver.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreSilver.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureSilver = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"silverore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"silverore"),PlacedFeatureList.featureSilver);
        }
        if(ConfigRegistryList.registerSpinel.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreSpinel.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreSpinel.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureSpinel = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"spinelore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"spinelore"),PlacedFeatureList.featureSpinel);
        }
        if(ConfigRegistryList.registerSugilite.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreSugilite.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreSugilite.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureSugilite = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"sugiliteore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"sugiliteore"),PlacedFeatureList.featureSugilite);
        }
        if(ConfigRegistryList.registerTantalum.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreTantalum.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreTantalum.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureTantalum = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"tantalumore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"tantalumore"),PlacedFeatureList.featureTantalum);
        }
        if(ConfigRegistryList.registerTanzanite.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreTanzanite.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreTanzanite.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureTanzanite = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"tanzaniteore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"tanzaniteore"),PlacedFeatureList.featureTanzanite);
        }
        if(ConfigRegistryList.registerTartarite.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreTartarite.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreTartarite.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureTartarite = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"tartariteore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"tartariteore"),PlacedFeatureList.featureTartarite);
        }
        if(ConfigRegistryList.registerTechnetium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreTechnetium.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreTechnetium.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureTechnetium = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"technetiumore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"technetiumore"),PlacedFeatureList.featureTechnetium);
        }
        if(ConfigRegistryList.registerThallium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreThallium.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreThallium.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureThallium = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"thalliumore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"thalliumore"),PlacedFeatureList.featureThallium);
        }
        if(ConfigRegistryList.registerTin.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreTin.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreTin.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureTin = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"tinore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"tinore"),PlacedFeatureList.featureTin);
        }
        if(ConfigRegistryList.registerTitanium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreTitanium.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreTitanium.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureTitanium = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"titaniumore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"titaniumore"),PlacedFeatureList.featureTitanium);
        }
        if(ConfigRegistryList.registerTopaz.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreTopaz.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreTopaz.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureTopaz = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"topazore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"topazore"),PlacedFeatureList.featureTopaz);
        }
        if(ConfigRegistryList.registerTourmaline.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreTourmaline.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreTourmaline.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureTourmaline = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"tourmalineore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"tourmalineore"),PlacedFeatureList.featureTourmaline);
        }
        if(ConfigRegistryList.registerTungsten.get())
        {
            height = ModInfo.HEIGHT_RARE;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreTungsten.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreTungsten.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureTungsten = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"tungstenore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"tungstenore"),PlacedFeatureList.featureTungsten);
        }
        if(ConfigRegistryList.registerTurquoise.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreTurquoise.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreTurquoise.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureTurquoise = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"turquoiseore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"turquoiseore"),PlacedFeatureList.featureTurquoise);
        }
        if(ConfigRegistryList.registerUnobtainium.get())
        {
            height = ModInfo.HEIGHT_RARE;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreUnobtainium.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreUnobtainium.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureUnobtainium = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"unobtainiumore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"unobtainiumore"),PlacedFeatureList.featureUnobtainium);
        }
        if(ConfigRegistryList.registerUranium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreUranium.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreUranium.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureUranium = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"uraniumore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"uraniumore"),PlacedFeatureList.featureUranium);
        }
        if(ConfigRegistryList.registerVanadium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreVanadium.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreVanadium.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureVanadium = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"vanadiumore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"vanadiumore"),PlacedFeatureList.featureVanadium);
        }
        if(ConfigRegistryList.registerVulcanite.get())
        {
            height = ModInfo.HEIGHT_NETHER;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreVulcanite.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreVulcanite.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureVulcanite = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"vulcaniteore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"vulcaniteore"),PlacedFeatureList.featureVulcanite);
        }
        if(ConfigRegistryList.registerVyroxeres.get())
        {
            height = ModInfo.HEIGHT_NETHER;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreVyroxeres.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreVyroxeres.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureVyroxeres = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"vyroxeresore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"vyroxeresore"),PlacedFeatureList.featureVyroxeres);
        }
        if(ConfigRegistryList.registerYellorite.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreYellorite.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreYellorite.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureYellorite = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"yelloriteore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"yelloriteore"),PlacedFeatureList.featureYellorite);
        }
        if(ConfigRegistryList.registerZinc.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreZinc.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreZinc.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureZinc = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"zincore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"zincore"),PlacedFeatureList.featureZinc);
        }
        if(ConfigRegistryList.registerZirconium.get())
        {
            height = ModInfo.HEIGHT_NORMAL;
            target = List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.blockOreZirconium.defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockList.blockOreZirconium.defaultBlockState())
            );
            feature = new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(target,size));
            PlacedFeatureList.featureZirconium = new PlacedFeature(Holder.direct(feature),List.of(
                    CountPlacement.of(rate),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)),
                    BiomeFilter.biome()
            ));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"zirconiumore"),feature);
            Registry.register(BuiltinRegistries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,"zirconiumore"),PlacedFeatureList.featureZirconium);
        }
    }
}

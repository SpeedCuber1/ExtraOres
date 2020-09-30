package com.tylerh.extraores.World;
import com.tylerh.extraores.Init.BlockList;
import com.tylerh.extraores.Init.ConfigRegistryList;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;


public class ExOreWorldGen
{
    private static final CountRangeConfig ORE_NORMAL = new CountRangeConfig(20, 0, 0, 100);
    private static final CountRangeConfig ORE_RARE = new CountRangeConfig(20, 0, 0, 32);

    public static void initWorldGen()
    {
        for (Biome biome : ForgeRegistries.BIOMES)
        {
            if (ConfigRegistryList.registerAdamantine.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreAdamantine.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_RARE)));
            }
            if(ConfigRegistryList.registerAldourite.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK,BlockList.blockOreAldourite.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerAluminum.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreAluminum.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerAmordrine.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreAmordrine.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerAngmallen.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreAngmallen.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerAstralSilver.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreAstralSilver.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerAtlarus.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreAtlarus.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_RARE)));
            }
            if(ConfigRegistryList.registerBismuth.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreBismuth.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerBlackSteel.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreBlackSteel.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerCadmium.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreCadmium.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerCarmot.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreCarmot.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerCelenegil.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreCelenegil.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerCeruclase.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK,BlockList.blockOreCeruclase.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerChromium.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreChromium.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerCobalt.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreCobalt.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerCopper.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreCopper.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerDeepIron.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreDeepIron.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_RARE)));
            }
            if(ConfigRegistryList.registerDesichalkos.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreDesichalkos.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerEximite.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreEximite.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerGallium.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreGallium.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerHaderoth.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreHaderoth.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerHepatizon.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreHepatizon.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerIgnatius.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK,BlockList.blockOreIgnatius.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerIndium.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreIndium.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerInfuscolium.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreInfuscolium.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerInolashite.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreInolashite.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerKalendrite.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK,BlockList.blockOreKalendrite.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerLead.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreLead.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerLemurite.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK,BlockList.blockOreLemurite.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerManganese.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreManganese.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerMeutoite.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreMeutoite.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerMidasium.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK,BlockList.blockOreMidasium.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerMithril.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreMithril.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_RARE)));
            }
            if(ConfigRegistryList.registerMolybdenum.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreMithril.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerNeodymium.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreNeodymium.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerNickel.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreNickel.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerNiobium.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreNiobium.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerOrichalcum.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreOrichalcum.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerOureclase.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreOureclase.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerPalladium.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOrePalladium.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerPlatinum.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOrePlatinum.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_RARE)));
            }
            if(ConfigRegistryList.registerPrometheum.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOrePrometheum.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerRhodium.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreRhodium.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerRubracium.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreRubracium.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerRuthenium.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreRuthenium.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerSanguinite.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK,BlockList.blockOreSanguinite.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerShadowIron.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK,BlockList.blockOreShadowIron.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerSilver.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreSilver.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerTechnetium.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreTechnetium.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerThallium.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreThallium.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerTin.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreTin.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerTitanium.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreTitanium.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerTungsten.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreTungsten.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_RARE)));
            }
            if(ConfigRegistryList.registerUnobtainium.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreUnobtainium.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_RARE)));
            }
            if(ConfigRegistryList.registerUranium.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreUranium.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerVanadium.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreVanadium.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerVulcanite.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK,BlockList.blockOreVulcanite.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerVyroxeres.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK,BlockList.blockOreVyroxeres.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerZinc.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreZinc.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
            if(ConfigRegistryList.registerZirconium.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockList.blockOreZirconium.getDefaultState(),ExOreWorldGenConfig.chanceToSpawn.get())).withPlacement(Placement.COUNT_RANGE.configure(ORE_NORMAL)));
            }
        }
    }
}

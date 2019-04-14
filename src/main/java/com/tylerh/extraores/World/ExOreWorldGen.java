package com.tylerh.extraores.World;

import com.tylerh.extraores.Init.BlockList;
import com.tylerh.extraores.Init.ConfigRegistryList;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.CompositeFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.MinableConfig;
import net.minecraft.world.gen.placement.CountRange;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Predicate;

public class ExOreWorldGen
{
    private static final Predicate<IBlockState> IS_NETHERRACK = state -> state.getBlock() == Blocks.NETHERRACK;
    public static void initWorldGen()
    {
        CountRangeConfig oreNormal = new CountRangeConfig(20,0,0,100);
        CountRangeConfig oreRare = new CountRangeConfig(20,0,0,32);
        for(Biome biome : ForgeRegistries.BIOMES)
        {
            if(ConfigRegistryList.registerAdamantine.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, new CompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, BlockList.blockOreAdamantine.getDefaultState(), 4), new CountRange(), oreRare));
            }
            if(ConfigRegistryList.registerAldourite.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new ExOreDimGen<>(Feature.MINABLE,new MinableConfig(IS_NETHERRACK,BlockList.blockOreAldourite.getDefaultState(),4),new CountRange(), oreNormal,DimensionType.NETHER));
            }
            if(ConfigRegistryList.registerAluminum.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreAluminum.getDefaultState(),4),new CountRange(),oreNormal));
            }
            if(ConfigRegistryList.registerAmordrine.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreAmordrine.getDefaultState(),4),new CountRange(),oreNormal));
            }
            if(ConfigRegistryList.registerAngmallen.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreAngmallen.getDefaultState(),4),new CountRange(),oreNormal));
            }
            if(ConfigRegistryList.registerAstralSilver.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreAstralSilver.getDefaultState(),4),new CountRange(),oreNormal));
            }
            if(ConfigRegistryList.registerAtlarus.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreAtlarus.getDefaultState(),4),new CountRange(),oreRare));
            }
            if(ConfigRegistryList.registerBismuth.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreBismuth.getDefaultState(),4),new CountRange(),oreNormal));
            }
            if(ConfigRegistryList.registerBlackSteel.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreBlackSteel.getDefaultState(),4),new CountRange(),oreNormal));
            }
            if(ConfigRegistryList.registerCadmium.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreCadmium.getDefaultState(),4),new CountRange(),oreNormal));
            }
            if(ConfigRegistryList.registerCarmot.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreCarmot.getDefaultState(),4),new CountRange(),oreNormal));
            }
            if(ConfigRegistryList.registerCelenegil.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreCelenegil.getDefaultState(),4),new CountRange(),oreNormal));
            }
            if(ConfigRegistryList.registerCeruclase.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new ExOreDimGen<>(Feature.MINABLE,new MinableConfig(IS_NETHERRACK,BlockList.blockOreCeruclase.getDefaultState(),4),new CountRange(),oreNormal,DimensionType.NETHER));
            }
            if(ConfigRegistryList.registerChromium.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreChromium.getDefaultState(),4),new CountRange(),oreNormal));
            }
            if(ConfigRegistryList.registerCobalt.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreCobalt.getDefaultState(),4),new CountRange(),oreNormal));
            }
            if(ConfigRegistryList.registerCopper.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreCopper.getDefaultState(),4),new CountRange(), oreNormal));
            }
            if(ConfigRegistryList.registerDeepIron.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreDeepIron.getDefaultState(),4),new CountRange(),oreRare));
            }
            if(ConfigRegistryList.registerGallium.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreGallium.getDefaultState(),4),new CountRange(),oreNormal));
            }
            if(ConfigRegistryList.registerHaderoth.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreHaderoth.getDefaultState(),4),new CountRange(),oreNormal));
            }
            if(ConfigRegistryList.registerHepatizon.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreHepatizon.getDefaultState(),4),new CountRange(),oreNormal));
            }
            if(ConfigRegistryList.registerIgnatius.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new ExOreDimGen<>(Feature.MINABLE,new MinableConfig(IS_NETHERRACK,BlockList.blockOreIgnatius.getDefaultState(),4),new CountRange(),oreNormal,DimensionType.NETHER));
            }
            if(ConfigRegistryList.registerIndium.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreIndium.getDefaultState(),4),new CountRange(),oreNormal));
            }
            if(ConfigRegistryList.registerInfuscolium.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreInfuscolium.getDefaultState(),4),new CountRange(),oreNormal));
            }
            if(ConfigRegistryList.registerInolashite.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreInolashite.getDefaultState(),4),new CountRange(),oreNormal));
            }
            if(ConfigRegistryList.registerKalendrite.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new ExOreDimGen<>(Feature.MINABLE,new MinableConfig(IS_NETHERRACK,BlockList.blockOreKalendrite.getDefaultState(),4),new CountRange(),oreNormal,DimensionType.NETHER));
            }
            if(ConfigRegistryList.registerLead.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreLead.getDefaultState(),4),new CountRange(),oreNormal));
            }
            if(ConfigRegistryList.registerLemurite.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new ExOreDimGen<>(Feature.MINABLE,new MinableConfig(IS_NETHERRACK,BlockList.blockOreLemurite.getDefaultState(),4),new CountRange(),oreNormal,DimensionType.NETHER));
            }
            if(ConfigRegistryList.registerManganese.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreManganese.getDefaultState(),4),new CountRange(),oreNormal));
            }
            if(ConfigRegistryList.registerMidasium.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new ExOreDimGen<>(Feature.MINABLE,new MinableConfig(IS_NETHERRACK,BlockList.blockOreMidasium.getDefaultState(),4),new CountRange(),oreNormal,DimensionType.NETHER));
            }
            if(ConfigRegistryList.registerMithril.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreMithril.getDefaultState(),4),new CountRange(),oreRare));
            }
            if(ConfigRegistryList.registerMolybdenum.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreMolybdenum.getDefaultState(),4),new CountRange(),oreNormal));
            }
            if(ConfigRegistryList.registerNeodymium.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreNeodymium.getDefaultState(),4),new CountRange(),oreNormal));
            }
            if(ConfigRegistryList.registerNickel.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreNickel.getDefaultState(),4),new CountRange(),oreNormal));
            }
            if(ConfigRegistryList.registerNiobium.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreNiobium.getDefaultState(),4),new CountRange(),oreNormal));
            }
            if(ConfigRegistryList.registerOrichalcum.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreOrichalcum.getDefaultState(),4),new CountRange(),oreNormal));
            }
            if(ConfigRegistryList.registerOureclase.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreOureclase.getDefaultState(),4),new CountRange(),oreNormal));
            }
            if(ConfigRegistryList.registerPalladium.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOrePalladium.getDefaultState(),4),new CountRange(),oreNormal));
            }
            if(ConfigRegistryList.registerPlatinum.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOrePlatinum.getDefaultState(),4),new CountRange(),oreRare));
            }
            if(ConfigRegistryList.registerPrometheum.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOrePrometheum.getDefaultState(),4),new CountRange(),oreNormal));
            }
            if(ConfigRegistryList.registerRhodium.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreRhodium.getDefaultState(),4),new CountRange(),oreNormal));
            }
            if(ConfigRegistryList.registerRubracium.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreRubracium.getDefaultState(),4),new CountRange(),oreNormal));
            }
            if(ConfigRegistryList.registerRuthenium.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreRuthenium.getDefaultState(),4),new CountRange(),oreNormal));
            }
            if(ConfigRegistryList.registerSanguinite.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new ExOreDimGen<>(Feature.MINABLE,new MinableConfig(IS_NETHERRACK,BlockList.blockOreSanguinite.getDefaultState(),4),new CountRange(),oreNormal,DimensionType.NETHER));
            }
            if(ConfigRegistryList.registerShadowIron.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new ExOreDimGen<>(Feature.MINABLE,new MinableConfig(IS_NETHERRACK,BlockList.blockOreShadowIron.getDefaultState(),4),new CountRange(),oreNormal,DimensionType.NETHER));
            }
            if(ConfigRegistryList.registerSilver.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreSilver.getDefaultState(),4),new CountRange(),oreRare));
            }
            if(ConfigRegistryList.registerTechnetium.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreTechnetium.getDefaultState(),4),new CountRange(),oreNormal));
            }
            if(ConfigRegistryList.registerThallium.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreThallium.getDefaultState(),4),new CountRange(),oreNormal));
            }
            if(ConfigRegistryList.registerTin.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreTin.getDefaultState(),4),new CountRange(),oreNormal));
            }
            if(ConfigRegistryList.registerTitanium.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreTitanium.getDefaultState(),4),new CountRange(),oreNormal));
            }
            if(ConfigRegistryList.registerTungsten.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreTungsten.getDefaultState(),4),new CountRange(),oreNormal));
            }
            if(ConfigRegistryList.registerUnobtainium.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreUnobtainium.getDefaultState(),4),new CountRange(),oreRare));
            }
            if(ConfigRegistryList.registerVanadium.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreVanadium.getDefaultState(),4),new CountRange(),oreNormal));
            }
            if(ConfigRegistryList.registerVulcanite.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new ExOreDimGen<>(Feature.MINABLE,new MinableConfig(IS_NETHERRACK,BlockList.blockOreVulcanite.getDefaultState(),4),new CountRange(),oreNormal,DimensionType.NETHER));
            }
            if(ConfigRegistryList.registerVyroxeres.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new ExOreDimGen<>(Feature.MINABLE,new MinableConfig(IS_NETHERRACK,BlockList.blockOreVyroxeres.getDefaultState(),4),new CountRange(),oreNormal, DimensionType.NETHER));
            }
            if(ConfigRegistryList.registerZinc.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreZinc.getDefaultState(),4),new CountRange(),oreNormal));
            }
            if(ConfigRegistryList.registerZirconium.get())
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,new CompositeFeature<>(Feature.MINABLE,new MinableConfig(MinableConfig.IS_ROCK,BlockList.blockOreZirconium.getDefaultState(),4),new CountRange(),oreNormal));
            }
        }
    }
}

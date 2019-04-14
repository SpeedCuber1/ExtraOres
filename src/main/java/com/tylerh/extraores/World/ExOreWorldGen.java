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
    private static final Predicate<IBlockState> IS_END_STONE = state -> state.getBlock() == Blocks.END_STONE;
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

            }
        }
    }
}

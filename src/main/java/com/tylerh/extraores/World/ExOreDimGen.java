package com.tylerh.extraores.World;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.gen.IChunkGenSettings;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.CompositeFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.placement.BasePlacement;
import net.minecraft.world.gen.placement.IPlacementConfig;

import java.util.Random;

public class ExOreDimGen<F extends IFeatureConfig, P extends IPlacementConfig> extends CompositeFeature<F,P>
{
    private final DimensionType dimension;
    public ExOreDimGen(Feature<F> feature, F featureConfig, BasePlacement<P>basePlacement, P placementConfig,DimensionType dimension)
    {
        super(feature,featureConfig,basePlacement,placementConfig);
        this.dimension = dimension;
    }

    @Override
    public boolean func_212245_a(IWorld world, IChunkGenerator<? extends IChunkGenSettings> chunkGenerator, Random random, BlockPos pos, NoFeatureConfig noFeatureConfig)
    {
        if(world.getDimension().getType().equals(dimension))
        {
            return super.func_212245_a(world,chunkGenerator,random,pos,noFeatureConfig);
        }
        return false;
    }
}

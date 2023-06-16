package com.tylerh.extraores.Blocks;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class BlockEXOre extends Block
{
    public BlockEXOre(float hardness, float resistance)
    {
        super(BlockBehaviour.Properties.of().strength(hardness,resistance).requiresCorrectToolForDrops());
    }
    public BlockEXOre(float hardness, float resistance, SoundType sound)
    {
        super(BlockBehaviour.Properties.of().strength(hardness,resistance).sound(sound).requiresCorrectToolForDrops());
    }
}

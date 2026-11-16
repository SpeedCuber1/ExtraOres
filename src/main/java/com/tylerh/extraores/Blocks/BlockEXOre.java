package com.tylerh.extraores.Blocks;

import net.minecraft.world.level.block.Block;

public class BlockEXOre extends Block
{
    public BlockEXOre(Properties properties)
    {
        super(properties.requiresCorrectToolForDrops());
    }
}

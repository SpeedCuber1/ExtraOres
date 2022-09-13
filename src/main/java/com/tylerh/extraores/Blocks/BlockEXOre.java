package com.tylerh.extraores.Blocks;

import com.tylerh.extraores.Util.ModInfo;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;

public class BlockEXOre extends Block
{
    public BlockEXOre(Material mat, float hardness, float resistance)
    {
        super(BlockBehaviour.Properties.of(mat).strength(hardness,resistance).requiresCorrectToolForDrops());
    }
    public BlockEXOre(Material mat, float hardness, float resistance, SoundType sound)
    {
        super(BlockBehaviour.Properties.of(mat).strength(hardness,resistance).sound(sound).requiresCorrectToolForDrops());
    }
}

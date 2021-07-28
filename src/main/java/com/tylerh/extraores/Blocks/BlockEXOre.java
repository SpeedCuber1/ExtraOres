package com.tylerh.extraores.Blocks;

import com.tylerh.extraores.Util.ModInfo;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.ToolType;

public class BlockEXOre extends Block
{
    public BlockEXOre(Material mat, float hardness, float resistance, String uName)
    {
        super(BlockBehaviour.Properties.of(mat).strength(hardness,resistance).harvestLevel(2).harvestTool(ToolType.PICKAXE));
        setRegistryName(ModInfo.MOD_ID, uName);
    }

}

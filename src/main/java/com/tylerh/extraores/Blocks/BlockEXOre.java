package com.tylerh.extraores.Blocks;

import com.tylerh.extraores.Util.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

/**
 * Created by Tyler on 4/29/2016.
 */
public class BlockEXOre extends Block
{
    public BlockEXOre(Material mat, float hardness, float resistance, String uName)
    {
        super(Block.Properties.create(mat).hardnessAndResistance(hardness, resistance).harvestLevel(2).harvestTool(ToolType.PICKAXE));
        setRegistryName(ModInfo.MOD_ID, uName);
    }

}

package com.tylerh.extraores.Blocks;

import com.tylerh.extraores.Util.ModInfo;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.ToolType;

/**
 * Created by Tyler on 4/29/2016.
 */
public class BlockEXOre extends Block
{
    public BlockEXOre(Material mat, float hardness, float resistance, String uName)
    {
        super(BlockBehaviour.Properties.of(mat).explosionResistance(resistance).strength(hardness).harvestLevel(2).harvestTool(ToolType.PICKAXE));
        setRegistryName(ModInfo.MOD_ID, uName);
    }

}

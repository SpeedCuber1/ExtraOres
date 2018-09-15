package com.tylerh.extraores.Blocks;

import com.tylerh.extraores.Util.CreativeTabExtraOres;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by Tyler on 4/29/2016.
 */
public class BlockEXOre extends Block
{
    public BlockEXOre(Material mat,float hardness,float resistance,String uName)
    {
        super(mat);
        this.func_149647_a(CreativeTabExtraOres.EXTRA_ORES_TAB);
        this.blockHardness = hardness;
        this.blockResistance = resistance;
        this.func_149663_c(uName);
        setHarvestLevel("pickaxe", 2);
    }
}

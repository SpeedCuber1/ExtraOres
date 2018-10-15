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
        this.setCreativeTab(CreativeTabExtraOres.EXTRA_ORES_TAB);
        setHardness(hardness);
        setResistance(resistance);
        setUnlocalizedName(uName);
        setHarvestLevel("pickaxe", 2);
    }
}

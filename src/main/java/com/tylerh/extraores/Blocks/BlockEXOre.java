package com.tylerh.extraores.Blocks;

import com.tylerh.extraores.Init.InitBlocks;
import com.tylerh.extraores.Util.CreativeTabExtraOres;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by Tyler on 4/29/2016.
 */
public class BlockEXOre extends Block
{
    private boolean isGem;
    public BlockEXOre(Material mat,float hardness,float resistance,String uName)
    {
        super(mat);
        this.setCreativeTab(CreativeTabExtraOres.EXTRA_ORES_TAB);
        setHardness(hardness);
        setResistance(resistance);
        setUnlocalizedName(uName);
        setHarvestLevel("pickaxe", 2);
    }
    public BlockEXOre(Material mat,float hardness,float resistance,String uName,boolean gem)
    {
        super(mat);
        this.setCreativeTab(CreativeTabExtraOres.EXTRA_ORES_TAB);
        setHardness(hardness);
        setResistance(resistance);
        setUnlocalizedName(uName);
        setHarvestLevel("pickaxer",2);
        isGem = gem;
    }
    @Override
    public Item getItemDropped(IBlockState state,Random rand,int fortune)
    {
        if(this == InitBlocks.blockOreAgate)
        {
            return InitBlocks.itemGemAgate;
        }
        else if(this == InitBlocks.blockOreAmethyst)
        {
            return InitBlocks.itemGemAmethyst;
        }
        else if(this == InitBlocks.blockOreAmetrine)
        {
            return InitBlocks.itemGemAmetrine;
        }
        else if(this == InitBlocks.blockOreChrysocolla)
        {
            return InitBlocks.itemGemChrysocolla;
        }
        else if(this == InitBlocks.blockOreCitrine)
        {
            return InitBlocks.itemGemCitrine;
        }
        else if(this == InitBlocks.blockOreGarnet)
        {
            return InitBlocks.itemGemGarnet;
        }
        else if(this == InitBlocks.blockOreJade)
        {
            return InitBlocks.itemGemJade;
        }
        else if(this == InitBlocks.blockOreJasper)
        {
            return InitBlocks.itemGemJasper;
        }
        else if(this == InitBlocks.blockOreMalachite)
        {
            return InitBlocks.itemGemMalachite;
        }
        else if(this == InitBlocks.blockOreOnyx)
        {
            return InitBlocks.itemGemOnyx;
        }
        else if(this == InitBlocks.blockOrePeridot)
        {
            return InitBlocks.itemGemPeridot;
        }
        else if(this == InitBlocks.blockOrePhoenixite)
        {
            return InitBlocks.itemGemPhoenixite;
        }
        else if(this == InitBlocks.blockOreRuby)
        {
            return InitBlocks.itemGemRuby;
        }
        else if(this == InitBlocks.blockOreSapphire)
        {
            return InitBlocks.itemGemSapphire;
        }
        else if(this == InitBlocks.blockOreSpinel)
        {
            return InitBlocks.itemGemSpinel;
        }
        else if(this == InitBlocks.blockOreSugilite)
        {
            return InitBlocks.itemGemSugilite;
        }
        else if(this == InitBlocks.blockOreTopaz)
        {
            return InitBlocks.itemGemTopaz;
        }
        else if(this == InitBlocks.blockOreTourmaline)
        {
            return InitBlocks.itemGemTourmaline;
        }
        else
        {
            return super.getItemDropped(state,rand,fortune);
        }
    }
    public int quantityDropped(Random rand)
    {
        if(isGem)
        {
            return rand.nextInt(3) + 1;
        }
        else
        {
            return 1;
        }
    }

    @Override
    public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune)
    {
        Random rand = world instanceof World ? ((World)world).rand : new Random();
        if(this.getItemDropped(state,rand,fortune) != Item.getItemFromBlock(this))
        {
            return MathHelper.getInt(rand,1,5);
        }
        return 0;
    }
    public int quantityDroppedWithBonus(int fortune,Random random)
    {
        if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped(this.getBlockState().getValidStates().iterator().next(),random,fortune))
        {
            int i = random.nextInt(fortune + 2) - 1;
            if(i < 0)
            {
                i = 0;
            }
            return this.quantityDropped(random) * (i+1);
        }
        else
        {
            return this.quantityDropped(random);
        }
    }
}

package com.tylerh.extraores.Init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

/**
 * Created by Tyler on 4/29/2016.
 */
public class Recipes
{
    public static void init()
    {
        if(InitBlocks.registerCopper)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreCopper,new ItemStack(InitBlocks.itemIngotCopper,1),1.0f);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockCopper,1),new Object[]{"ccc","ccc","ccc",Character.valueOf('c'),"ingotCopper"}));
        }
        if(InitBlocks.registerTin)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreTin,new ItemStack(InitBlocks.itemIngotTin,1),1.0f);
        }
        if(InitBlocks.registerChromium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreChromium,new ItemStack(InitBlocks.itemIngotChromium,1),1.0f);
        }
        if(InitBlocks.registerCobalt)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreCobalt,new ItemStack(InitBlocks.itemIngotCobalt,1),1.0f);
        }
        if(InitBlocks.registerUnobtainium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreUnobtainium,new ItemStack(InitBlocks.itemIngotUnobtainium,1),1.0f);
        }
        if(InitBlocks.registerManganese)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreManganese,new ItemStack(InitBlocks.itemIngotManganese,1),1.0f);
        }
        if(InitBlocks.registerMolybdenum)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreMolybdenum,new ItemStack(InitBlocks.itemIngotMolybdenum,1),1.0f);
        }
        if(InitBlocks.registerAluminum)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreAluminum,new ItemStack(InitBlocks.itemIngotAluminum,1),1.0f);
        }
        if(InitBlocks.registerSilver)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreSilver,new ItemStack(InitBlocks.itemIngotSilver,1),1.0f);
        }
        if(InitBlocks.registerLead)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreLead,new ItemStack(InitBlocks.itemIngotLead,1),1.0f);
        }
        if(InitBlocks.registerPlatinum)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOrePlatinum,new ItemStack(InitBlocks.itemIngotPlatinum,1),1.0f);
        }
        if(InitBlocks.registerTungsten)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreTungsten,new ItemStack(InitBlocks.itemIngotTungsten,1),1.0f);
        }
    }
}

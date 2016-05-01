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
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotCopper,9),new Object[]{"C",Character.valueOf('C'),"blockCopper"}));
        }
        if(InitBlocks.registerTin)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreTin,new ItemStack(InitBlocks.itemIngotTin,1),1.0f);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockTin,1),new Object[]{"ttt","ttt","ttt",Character.valueOf('t'),"ingotTin"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotTin,9),new Object[]{"T",Character.valueOf('T'),"blockTin"}));
        }
        if(InitBlocks.registerChromium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreChromium,new ItemStack(InitBlocks.itemIngotChromium,1),1.0f);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockChromium,1),new Object[]{"ccc","ccc","ccc",Character.valueOf('c'),"ingotChromium"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotChromium,9),new Object[]{"C",Character.valueOf('C'),"blockChromium"}));
        }
        if(InitBlocks.registerCobalt)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreCobalt,new ItemStack(InitBlocks.itemIngotCobalt,1),1.0f);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockCobalt,1),new Object[]{"ccc","ccc","ccc",Character.valueOf('c'),"ingotCobalt"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotCobalt,9),new Object[]{"C",Character.valueOf('C'),"blockCobalt"}));
        }
        if(InitBlocks.registerUnobtainium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreUnobtainium,new ItemStack(InitBlocks.itemIngotUnobtainium,1),1.0f);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockUnobtainium,1),new Object[]{"uuu","uuu","uuu",Character.valueOf('u'),"ingotUnobtainium"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotUnobtainium,9),new Object[]{"U",Character.valueOf('U'),"blockUnobtainium"}));
        }
        if(InitBlocks.registerManganese)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreManganese,new ItemStack(InitBlocks.itemIngotManganese,1),1.0f);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockManganese,1),new Object[]{"mmm","mmm","mmm",Character.valueOf('m'),"ingotManganese"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotManganese,9),new Object[]{"M",Character.valueOf('M'),"blockManganese"}));
        }
        if(InitBlocks.registerMolybdenum)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreMolybdenum,new ItemStack(InitBlocks.itemIngotMolybdenum,1),1.0f);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockMolybdenum,1),new Object[]{"mmm","mmm","mmm",Character.valueOf('m'),"ingotMolybdenum"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotMolybdenum,9),new Object[]{"M",Character.valueOf('M'),"blockMolybdenum"}));
        }
        if(InitBlocks.registerAluminum)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreAluminum,new ItemStack(InitBlocks.itemIngotAluminum,1),1.0f);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockAluminum,1),new Object[]{"aaa","aaa","aaa",Character.valueOf('a'),"ingotAluminum"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotAluminum,9),new Object[]{"A",Character.valueOf('A'),"blockAluminum"}));
        }
        if(InitBlocks.registerSilver)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreSilver,new ItemStack(InitBlocks.itemIngotSilver,1),1.0f);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockSilver,1),new Object[]{"sss","sss","sss",Character.valueOf('s'),"ingotSilver"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotSilver,9),new Object[]{"S",Character.valueOf('S'),"blockSilver"}));
        }
        if(InitBlocks.registerLead)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreLead,new ItemStack(InitBlocks.itemIngotLead,1),1.0f);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockLead,1),new Object[]{"lll","lll","lll",Character.valueOf('l'),"ingotLead"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotLead,9),new Object[]{"L",Character.valueOf('L'),"blockLead"}));
        }
        if(InitBlocks.registerPlatinum)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOrePlatinum,new ItemStack(InitBlocks.itemIngotPlatinum,1),1.0f);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockPlatinum,1),new Object[]{"ppp","ppp","ppp",Character.valueOf('p'),"ingotPlatinum"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotPlatinum,9),new Object[]{"P",Character.valueOf('P'),"blockPlatinum"}));
        }
        if(InitBlocks.registerTungsten)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreTungsten,new ItemStack(InitBlocks.itemIngotTungsten,1),1.0f);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockTungsten,1),new Object[]{"ttt","ttt","ttt",Character.valueOf('t'),"ingotTungsten"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotTungsten,9),new Object[]{"T",Character.valueOf('T'),"blockTungsten"}));
        }
        if(InitBlocks.registerVanadium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreVanadium,new ItemStack(InitBlocks.itemIngotVanadium,1),1.0f);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockVanadium,1),new Object[]{"vvv","vvv","vvv",Character.valueOf('v'),"ingotVanadium"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotVanadium,9),new Object[]{"V",Character.valueOf('V'),"blockVanadium"}));
        }
    }
}

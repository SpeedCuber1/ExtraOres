package com.tylerh.extraores.Init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

/**
 * Created by Tyler on 4/29/2016.
 */
public class Recipes
{
    public static boolean registerDusts;
    public static void init()
    {
        if(Loader.isModLoaded("EnderIO"))
        {
            registerDusts = true;
        }
        else
        {
            registerDusts = false;
        }
        if(InitBlocks.registerCopper)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreCopper,new ItemStack(InitBlocks.itemIngotCopper,1),1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustCopper,new ItemStack(InitBlocks.itemIngotCopper,1),0);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockCopper,1),new Object[]{"ccc","ccc","ccc",Character.valueOf('c'),"ingotCopper"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotCopper,9),new Object[]{"C",Character.valueOf('C'),"blockCopper"}));
            //Pulverizing("EnderIO Req'd")
            if(registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                                    "<recipe name=\"Copper to Dust\" energyCost=\"3600\" >" +
                                        "<input>" +
                                            "<itemStack oreDictionary=\"oreCopper\" />" +
                                        "</input>" +
                                        "<output>" +
                                            "<itemStack oreDictionary=\"dustCopper\" number=\"2\" />" +
                                        "</output>" +
                                    "</recipe>" +
                                "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO","recipe:sagmill",recipe);
            }
        }
        if(InitBlocks.registerTin)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreTin,new ItemStack(InitBlocks.itemIngotTin,1),1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustTin,new ItemStack(InitBlocks.itemIngotTin,1),0);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockTin,1),new Object[]{"ttt","ttt","ttt",Character.valueOf('t'),"ingotTin"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotTin,9),new Object[]{"T",Character.valueOf('T'),"blockTin"}));
            //Pulverizing("EnderIO Req'd")
            if(registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Tin to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreTin\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustTin\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO","recipe:sagmill",recipe);
            }
        }
        if(InitBlocks.registerChromium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreChromium,new ItemStack(InitBlocks.itemIngotChromium,1),1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustChromium,new ItemStack(InitBlocks.itemIngotChromium,1),0);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockChromium,1),new Object[]{"ccc","ccc","ccc",Character.valueOf('c'),"ingotChromium"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotChromium,9),new Object[]{"C",Character.valueOf('C'),"blockChromium"}));
            //Pulverizing("EnderIO Req'd")
            if(registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Chromium to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreChromium\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustChromium\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO","recipe:sagmill",recipe);
            }
        }
        if(InitBlocks.registerCobalt)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreCobalt,new ItemStack(InitBlocks.itemIngotCobalt,1),1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustCobalt,new ItemStack(InitBlocks.itemIngotCobalt,1),0);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockCobalt,1),new Object[]{"ccc","ccc","ccc",Character.valueOf('c'),"ingotCobalt"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotCobalt,9),new Object[]{"C",Character.valueOf('C'),"blockCobalt"}));
            //Pulverizing("EnderIO Req'd")
            if(registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Cobalt to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreCobalt\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustCobalt\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO","recipe:sagmill",recipe);
            }
        }
        if(InitBlocks.registerUnobtainium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreUnobtainium,new ItemStack(InitBlocks.itemIngotUnobtainium,1),1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustUnobtainium,new ItemStack(InitBlocks.itemIngotUnobtainium,1),0);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockUnobtainium,1),new Object[]{"uuu","uuu","uuu",Character.valueOf('u'),"ingotUnobtainium"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotUnobtainium,9),new Object[]{"U",Character.valueOf('U'),"blockUnobtainium"}));
            //Pulverizing("EnderIO Req'd")
            if(registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Unobtainium to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreUnobtainium\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustUnobtainium\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO","recipe:sagmill",recipe);
            }
        }
        if(InitBlocks.registerManganese)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreManganese,new ItemStack(InitBlocks.itemIngotManganese,1),1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustManganese,new ItemStack(InitBlocks.itemIngotManganese,1),0);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockManganese,1),new Object[]{"mmm","mmm","mmm",Character.valueOf('m'),"ingotManganese"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotManganese,9),new Object[]{"M",Character.valueOf('M'),"blockManganese"}));
            //Pulverizing("EnderIO Req'd")
            if(registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Manganese to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreManganese\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustManganese\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO","recipe:sagmill",recipe);
            }
        }
        if(InitBlocks.registerMolybdenum)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreMolybdenum,new ItemStack(InitBlocks.itemIngotMolybdenum,1),1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustMolybdenum,new ItemStack(InitBlocks.itemIngotMolybdenum,1),0);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockMolybdenum,1),new Object[]{"mmm","mmm","mmm",Character.valueOf('m'),"ingotMolybdenum"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotMolybdenum,9),new Object[]{"M",Character.valueOf('M'),"blockMolybdenum"}));
            //Pulverizing("EnderIO Req'd")
            if(registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Molybdenum to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreMolybdenum\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustMolybdenum\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO","recipe:sagmill",recipe);
            }
        }
        if(InitBlocks.registerAluminum)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreAluminum,new ItemStack(InitBlocks.itemIngotAluminum,1),1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustAluminum,new ItemStack(InitBlocks.itemIngotAluminum,1),0);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockAluminum,1),new Object[]{"aaa","aaa","aaa",Character.valueOf('a'),"ingotAluminum"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotAluminum,9),new Object[]{"A",Character.valueOf('A'),"blockAluminum"}));
            //Pulverizing("EnderIO Req'd")
            if(registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Aluminum to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreAluminum\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustAluminum\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO","recipe:sagmill",recipe);
            }
        }
        if(InitBlocks.registerSilver)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreSilver,new ItemStack(InitBlocks.itemIngotSilver,1),1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustSilver,new ItemStack(InitBlocks.itemIngotSilver,1),0);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockSilver,1),new Object[]{"sss","sss","sss",Character.valueOf('s'),"ingotSilver"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotSilver,9),new Object[]{"S",Character.valueOf('S'),"blockSilver"}));
            //Pulverizing("EnderIO Req'd")
            if(registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Silver to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreSilver\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustSilver\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO","recipe:sagmill",recipe);
            }
        }
        if(InitBlocks.registerLead)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreLead,new ItemStack(InitBlocks.itemIngotLead,1),1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustLead,new ItemStack(InitBlocks.itemIngotLead,1),0);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockLead,1),new Object[]{"lll","lll","lll",Character.valueOf('l'),"ingotLead"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotLead,9),new Object[]{"L",Character.valueOf('L'),"blockLead"}));
            //Pulverizing("EnderIO Req'd")
            if(registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Lead to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreLead\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustLead\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO","recipe:sagmill",recipe);
            }
        }
        if(InitBlocks.registerPlatinum)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOrePlatinum,new ItemStack(InitBlocks.itemIngotPlatinum,1),1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustPlatinum,new ItemStack(InitBlocks.itemIngotPlatinum,1),0);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockPlatinum,1),new Object[]{"ppp","ppp","ppp",Character.valueOf('p'),"ingotPlatinum"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotPlatinum,9),new Object[]{"P",Character.valueOf('P'),"blockPlatinum"}));
            //Pulverizing("EnderIO Req'd")
            if(registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Platinum to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"orePlatinum\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustPlatinum\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO","recipe:sagmill",recipe);
            }
        }
        if(InitBlocks.registerTungsten)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreTungsten,new ItemStack(InitBlocks.itemIngotTungsten,1),1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustTungsten,new ItemStack(InitBlocks.itemIngotTungsten,1),0);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockTungsten,1),new Object[]{"ttt","ttt","ttt",Character.valueOf('t'),"ingotTungsten"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotTungsten,9),new Object[]{"T",Character.valueOf('T'),"blockTungsten"}));
            //Pulverizing("EnderIO Req'd")
            if(registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Tungsten to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreTungsten\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustTungsten\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO","recipe:sagmill",recipe);
            }
        }
        if(InitBlocks.registerVanadium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreVanadium,new ItemStack(InitBlocks.itemIngotVanadium,1),1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustVanadium,new ItemStack(InitBlocks.itemIngotVanadium,1),0);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockVanadium,1),new Object[]{"vvv","vvv","vvv",Character.valueOf('v'),"ingotVanadium"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotVanadium,9),new Object[]{"V",Character.valueOf('V'),"blockVanadium"}));
            //Pulverizing("EnderIO Req'd")
            if(registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Vanadium to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreVanadium\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustVanadium\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO","recipe:sagmill",recipe);
            }
        }
        if(InitBlocks.registerZinc)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreZinc,new ItemStack(InitBlocks.itemIngotZinc,1),1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustZinc,new ItemStack(InitBlocks.itemIngotZinc,1),0);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockZinc,1),new Object[]{"vvv","vvv","vvv",Character.valueOf('v'),"ingotZinc"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotZinc,9),new Object[]{"V",Character.valueOf('V'),"blockZinc"}));
            //Pulverizing("EnderIO Req'd")
            if(registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Zinc to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreZinc\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustZinc\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO","recipe:sagmill",recipe);
            }
        }
        if(InitBlocks.registerZirconium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreZirconium,new ItemStack(InitBlocks.itemIngotZirconium,1),1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustZirconium,new ItemStack(InitBlocks.itemIngotZirconium,1),0);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockZirconium,1),new Object[]{"vvv","vvv","vvv",Character.valueOf('v'),"ingotZirconium"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotZirconium,9),new Object[]{"V",Character.valueOf('V'),"blockZirconium"}));
            //Pulverizing("EnderIO Req'd")
            if(registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Zirconium to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreZirconium\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustZirconium\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO","recipe:sagmill",recipe);
            }
        }
        if(InitBlocks.registerNiobium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreNiobium,new ItemStack(InitBlocks.itemIngotNiobium,1),1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustNiobium,new ItemStack(InitBlocks.itemIngotNiobium,1),0);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockNiobium,1),new Object[]{"vvv","vvv","vvv",Character.valueOf('v'),"ingotNiobium"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotNiobium,9),new Object[]{"V",Character.valueOf('V'),"blockNiobium"}));
            //Pulverizing("EnderIO Req'd")
            if(registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Niobium to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreNiobium\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustNiobium\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO","recipe:sagmill",recipe);
            }
        }
        if(InitBlocks.registerTechnetium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreTechnetium,new ItemStack(InitBlocks.itemIngotTechnetium,1),1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustTechnetium,new ItemStack(InitBlocks.itemIngotTechnetium,1),0);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockTechnetium,1),new Object[]{"vvv","vvv","vvv",Character.valueOf('v'),"ingotTechnetium"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotTechnetium,9),new Object[]{"V",Character.valueOf('V'),"blockTechnetium"}));
            //Pulverizing("EnderIO Req'd")
            if(registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Technetium to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreTechnetium\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustTechnetium\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO","recipe:sagmill",recipe);
            }
        }
        if(InitBlocks.registerRuthenium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreRuthenium,new ItemStack(InitBlocks.itemIngotRuthenium,1),1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustRuthenium,new ItemStack(InitBlocks.itemIngotRuthenium,1),0);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockRuthenium,1),new Object[]{"vvv","vvv","vvv",Character.valueOf('v'),"ingotRuthenium"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotRuthenium,9),new Object[]{"V",Character.valueOf('V'),"blockRuthenium"}));
            //Pulverizing("EnderIO Req'd")
            if(registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Ruthenium to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreRuthenium\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustRuthenium\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO","recipe:sagmill",recipe);
            }
        }
        if(InitBlocks.registerRhodium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreRhodium,new ItemStack(InitBlocks.itemIngotRhodium,1),1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustRhodium,new ItemStack(InitBlocks.itemIngotRhodium,1),0);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockRhodium,1),new Object[]{"vvv","vvv","vvv",Character.valueOf('v'),"ingotRhodium"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotRhodium,9),new Object[]{"V",Character.valueOf('V'),"blockRhodium"}));
            //Pulverizing("EnderIO Req'd")
            if(registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Rhodium to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreRhodium\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustRhodium\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO","recipe:sagmill",recipe);
            }
        }
        if(InitBlocks.registerPalladium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOrePalladium,new ItemStack(InitBlocks.itemIngotPalladium,1),1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustPalladium,new ItemStack(InitBlocks.itemIngotPalladium,1),0);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockPalladium,1),new Object[]{"vvv","vvv","vvv",Character.valueOf('v'),"ingotPalladium"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotPalladium,9),new Object[]{"V",Character.valueOf('V'),"blockPalladium"}));
            //Pulverizing("EnderIO Req'd")
            if(registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Palladium to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"orePalladium\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustPalladium\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO","recipe:sagmill",recipe);
            }
        }
        if(InitBlocks.registerCadmium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreCadmium,new ItemStack(InitBlocks.itemIngotCadmium,1),1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustCadmium,new ItemStack(InitBlocks.itemIngotCadmium,1),0);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockCadmium,1),new Object[]{"vvv","vvv","vvv",Character.valueOf('v'),"ingotCadmium"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotCadmium,9),new Object[]{"V",Character.valueOf('V'),"blockCadmium"}));
            //Pulverizing("EnderIO Req'd")
            if(registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Cadmium to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreCadmium\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustCadmium\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO","recipe:sagmill",recipe);
            }
        }
        if(InitBlocks.registerNeodymium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreNeodymium,new ItemStack(InitBlocks.itemIngotNeodymium,1),1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustNeodymium,new ItemStack(InitBlocks.itemIngotNeodymium,1),0);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockNeodymium,1),new Object[]{"vvv","vvv","vvv",Character.valueOf('v'),"ingotNeodymium"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotNeodymium,9),new Object[]{"V",Character.valueOf('V'),"blockNeodymium"}));
            //Pulverizing("EnderIO Req'd")
            if(registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Neodymium to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreNeodymium\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustNeodymium\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO","recipe:sagmill",recipe);
            }
        }
        if(InitBlocks.registerBismuth)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreBismuth,new ItemStack(InitBlocks.itemIngotBismuth,1),1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustBismuth,new ItemStack(InitBlocks.itemIngotBismuth,1),0);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockBismuth,1),new Object[]{"vvv","vvv","vvv",Character.valueOf('v'),"ingotBismuth"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotBismuth,9),new Object[]{"V",Character.valueOf('V'),"blockBismuth"}));
            //Pulverizing("EnderIO Req'd")
            if(registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Bismuth to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreBismuth\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustBismuth\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO","recipe:sagmill",recipe);
            }
        }
        if(InitBlocks.registerGallium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreGallium,new ItemStack(InitBlocks.itemIngotGallium,1),1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustGallium,new ItemStack(InitBlocks.itemIngotGallium,1),0);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockGallium,1),new Object[]{"vvv","vvv","vvv",Character.valueOf('v'),"ingotGallium"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotGallium,9),new Object[]{"V",Character.valueOf('V'),"blockGallium"}));
            //Pulverizing("EnderIO Req'd")
            if(registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Gallium to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreGallium\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustGallium\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO","recipe:sagmill",recipe);
            }
        }
        if(InitBlocks.registerIndium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreIndium,new ItemStack(InitBlocks.itemIngotIndium,1),1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustIndium,new ItemStack(InitBlocks.itemIngotIndium,1),0);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockIndium,1),new Object[]{"vvv","vvv","vvv",Character.valueOf('v'),"ingotIndium"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotIndium,9),new Object[]{"V",Character.valueOf('V'),"blockIndium"}));
            //Pulverizing("EnderIO Req'd")
            if(registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Indium to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreIndium\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustIndium\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO","recipe:sagmill",recipe);
            }
        }
        if(InitBlocks.registerThallium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreThallium,new ItemStack(InitBlocks.itemIngotThallium,1),1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustThallium,new ItemStack(InitBlocks.itemIngotThallium,1),0);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockThallium,1),new Object[]{"vvv","vvv","vvv",Character.valueOf('v'),"ingotThallium"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotThallium,9),new Object[]{"V",Character.valueOf('V'),"blockThallium"}));
            //Pulverizing("EnderIO Req'd")
            if(registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Thallium to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreThallium\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustThallium\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO","recipe:sagmill",recipe);
            }
        }
        if(InitBlocks.registerTitanium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreTitanium,new ItemStack(InitBlocks.itemIngotTitanium,1),1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustTitanium,new ItemStack(InitBlocks.itemIngotTitanium,1),0);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockTitanium,1),new Object[]{"vvv","vvv","vvv",Character.valueOf('v'),"ingotTitanium"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotTitanium,9),new Object[]{"V",Character.valueOf('V'),"blockTitanium"}));
            //Pulverizing("EnderIO Req'd")
            if(registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Titanium to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreTitanium\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustTitanium\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO","recipe:sagmill",recipe);
            }
        }
        if(InitBlocks.registerNickel)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreNickel,new ItemStack(InitBlocks.itemIngotNickel,1),1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustNickel,new ItemStack(InitBlocks.itemIngotNickel,1),0);
            //Normal Crafting
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.blockNickel,1),new Object[]{"vvv","vvv","vvv",Character.valueOf('v'),"ingotNickel"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(InitBlocks.itemIngotNickel,9),new Object[]{"V",Character.valueOf('V'),"blockNickel"}));
            //Pulverizing("EnderIO Req'd")
            if(registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Nickel to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreNickel\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustNickel\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO","recipe:sagmill",recipe);
            }
        }
    }
}

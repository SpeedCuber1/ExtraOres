package com.tylerh.extraores.Init;

import com.google.gson.JsonObject;
import com.tylerh.extraores.Util.ModInfo;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.IRecipeFactory;
import net.minecraftforge.common.crafting.JsonContext;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.rmi.MarshalledObject;

/**
 * Created by Tyler on 4/29/2016.
 */
public class Recipes
{
    private static boolean registerDusts;
    private static boolean registerMek;
    public static void init()
    {
        String location;
        if (Loader.isModLoaded("EnderIO"))
        {
            registerDusts = true;
        }
        else
        {
            registerDusts = false;
        }
        if (Loader.isModLoaded("mekanism"))
        {
            registerMek = true;
        }
        else
        {
            registerMek = false;
        }
        if(InitBlocks.registerAmordrine)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreAmordrine, new ItemStack(InitBlocks.itemIngotAmordrine, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustAmordrine, new ItemStack(InitBlocks.itemIngotAmordrine, 1), 0);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":amordrineblock";
            registerHelper(location, "Compress");
            registerHelper(location, "Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Amordrine to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreAmordrine\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustAmordrine\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreAmordrine).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustAmordrine, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if(InitBlocks.registerAngmallen)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreAngmallen, new ItemStack(InitBlocks.itemIngotAngmallen, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustAngmallen, new ItemStack(InitBlocks.itemIngotAngmallen, 1), 0);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":angmallenblock";
            registerHelper(location, "Compress");
            registerHelper(location, "Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Angmallen to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreAngmallen\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustAngmallen\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreAngmallen).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustAngmallen, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if(InitBlocks.registerBlackSteel)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreBlackSteel, new ItemStack(InitBlocks.itemIngotBlackSteel, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustBlackSteel, new ItemStack(InitBlocks.itemIngotBlackSteel, 1), 0);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":blacksteelblock";
            registerHelper(location, "Compress");
            registerHelper(location, "Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Black Steel to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreBlackSteel\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustBlackSteel\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreBlackSteel).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustBlackSteel, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if(InitBlocks.registerCelenegil)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreCelenegil, new ItemStack(InitBlocks.itemIngotCelenegil, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustCelenegil, new ItemStack(InitBlocks.itemIngotCelenegil, 1), 0);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":celenegilblock";
            registerHelper(location, "Compress");
            registerHelper(location, "Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Celenegil to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreCelenegil\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustCelenegil\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreCelenegil).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustCelenegil, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if(InitBlocks.registerHaderoth)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreHaderoth, new ItemStack(InitBlocks.itemIngotHaderoth, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustHaderoth, new ItemStack(InitBlocks.itemIngotHaderoth, 1), 0);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":haderothblock";
            registerHelper(location, "Compress");
            registerHelper(location, "Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Haderoth to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreHaderoth\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustHaderoth\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreHaderoth).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustHaderoth, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if(InitBlocks.registerHepatizon)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreHepatizon, new ItemStack(InitBlocks.itemIngotHepatizon, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustHepatizon, new ItemStack(InitBlocks.itemIngotHepatizon, 1), 0);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":hepatizonblock";
            registerHelper(location, "Compress");
            registerHelper(location, "Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Hepatizon to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreHepatizon\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustHepatizon\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreHepatizon).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustHepatizon, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if(InitBlocks.registerInolashite)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreInolashite, new ItemStack(InitBlocks.itemIngotInolashite, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustInolashite, new ItemStack(InitBlocks.itemIngotInolashite, 1), 0);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":inolashiteblock";
            registerHelper(location, "Compress");
            registerHelper(location, "Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Inolashite to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreInolashite\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustInolashite\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreInolashite).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustInolashite, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerCopper)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreCopper, new ItemStack(InitBlocks.itemIngotCopper, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustCopper, new ItemStack(InitBlocks.itemIngotCopper, 1), 0);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":copperblock";
            registerHelper(location, "Compress");
            registerHelper(location, "Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
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
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreCopper).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustCopper, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerTin)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreTin, new ItemStack(InitBlocks.itemIngotTin, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustTin, new ItemStack(InitBlocks.itemIngotTin, 1), 0);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":tinblock";
            registerHelper(location, "Compress");
            registerHelper(location, "Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
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
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreTin).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustTin, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerChromium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreChromium, new ItemStack(InitBlocks.itemIngotChromium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustChromium, new ItemStack(InitBlocks.itemIngotChromium, 1), 0);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":chromiumblock";
            registerHelper(location, "Compress");
            registerHelper(location, "Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
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
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreChromium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustChromium, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerCobalt)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreCobalt, new ItemStack(InitBlocks.itemIngotCobalt, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustCobalt, new ItemStack(InitBlocks.itemIngotCobalt, 1), 0);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":cobaltblock";
            registerHelper(location, "Compress");
            registerHelper(location, "Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
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
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreCobalt).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustCobalt, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerUnobtainium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreUnobtainium, new ItemStack(InitBlocks.itemIngotUnobtainium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustUnobtainium, new ItemStack(InitBlocks.itemIngotUnobtainium, 1), 0);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":unobtainiumblock";
            registerHelper(location, "Compress");
            registerHelper(location, "Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
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
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreUnobtainium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustUnobtainium, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerManganese)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreManganese, new ItemStack(InitBlocks.itemIngotManganese, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustManganese, new ItemStack(InitBlocks.itemIngotManganese, 1), 0);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":manganeseblock";
            registerHelper(location, "Compress");
            registerHelper(location, "Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
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
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreManganese).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustManganese, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerMolybdenum)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreMolybdenum, new ItemStack(InitBlocks.itemIngotMolybdenum, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustMolybdenum, new ItemStack(InitBlocks.itemIngotMolybdenum, 1), 0);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":molybdenumblock";
            registerHelper(location, "Compress");
            registerHelper(location, "Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
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
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreMolybdenum).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustMolybdenum, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerAluminum)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreAluminum, new ItemStack(InitBlocks.itemIngotAluminum, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustAluminum, new ItemStack(InitBlocks.itemIngotAluminum, 1), 0);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":aluminumblock";
            registerHelper(location, "Compress");
            registerHelper(location, "Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
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
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreAluminum).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustAluminum, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerSilver)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreSilver, new ItemStack(InitBlocks.itemIngotSilver, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustSilver, new ItemStack(InitBlocks.itemIngotSilver, 1), 0);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":silverblock";
            registerHelper(location, "Compress");
            registerHelper(location, "Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
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
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreSilver).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustSilver, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerLead)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreLead, new ItemStack(InitBlocks.itemIngotLead, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustLead, new ItemStack(InitBlocks.itemIngotLead, 1), 0);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":leadblock";
            registerHelper(location, "Compress");
            registerHelper(location, "Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
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
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreLead).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustLead, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerPlatinum)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOrePlatinum, new ItemStack(InitBlocks.itemIngotPlatinum, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustPlatinum, new ItemStack(InitBlocks.itemIngotPlatinum, 1), 0);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":platinumblock";
            registerHelper(location, "Compress");
            registerHelper(location, "Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
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
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOrePlatinum).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustPlatinum, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerTungsten)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreTungsten, new ItemStack(InitBlocks.itemIngotTungsten, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustTungsten, new ItemStack(InitBlocks.itemIngotTungsten, 1), 0);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":tungstenblock";
            registerHelper(location, "Compress");
            registerHelper(location, "Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
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
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreTungsten).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustTungsten, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerVanadium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreVanadium, new ItemStack(InitBlocks.itemIngotVanadium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustVanadium, new ItemStack(InitBlocks.itemIngotVanadium, 1), 0);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":vanadiumblock";
            registerHelper(location, "Compress");
            registerHelper(location, "Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
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
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreVanadium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustVanadium, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerZinc)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreZinc, new ItemStack(InitBlocks.itemIngotZinc, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustZinc, new ItemStack(InitBlocks.itemIngotZinc, 1), 0);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":zincblock";
            registerHelper(location, "Compress");
            registerHelper(location, "Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
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
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreZinc).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustZinc, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerZirconium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreZirconium, new ItemStack(InitBlocks.itemIngotZirconium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustZirconium, new ItemStack(InitBlocks.itemIngotZirconium, 1), 0);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":zirconiumblock";
            registerHelper(location, "Compress");
            registerHelper(location, "Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
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
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreZirconium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustZirconium, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerNiobium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreNiobium, new ItemStack(InitBlocks.itemIngotNiobium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustNiobium, new ItemStack(InitBlocks.itemIngotNiobium, 1), 0);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":niobiumblock";
            registerHelper(location, "Compress");
            registerHelper(location, "Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
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
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreNiobium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustNiobium, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerTechnetium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreTechnetium, new ItemStack(InitBlocks.itemIngotTechnetium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustTechnetium, new ItemStack(InitBlocks.itemIngotTechnetium, 1), 0);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":technetiumblock";
            registerHelper(location, "Compress");
            registerHelper(location, "Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
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
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreTechnetium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustTechnetium, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerRuthenium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreRuthenium, new ItemStack(InitBlocks.itemIngotRuthenium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustRuthenium, new ItemStack(InitBlocks.itemIngotRuthenium, 1), 0);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":rutheniumblock";
            registerHelper(location, "Compress");
            registerHelper(location, "Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
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
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreRuthenium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustRuthenium, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerRhodium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreRhodium, new ItemStack(InitBlocks.itemIngotRhodium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustRhodium, new ItemStack(InitBlocks.itemIngotRhodium, 1), 0);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":rhodiumblock";
            registerHelper(location, "Compress");
            registerHelper(location, "Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
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
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreRhodium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustRhodium, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerPalladium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOrePalladium, new ItemStack(InitBlocks.itemIngotPalladium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustPalladium, new ItemStack(InitBlocks.itemIngotPalladium, 1), 0);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":palladiumblock";
            registerHelper(location, "Compress");
            registerHelper(location, "Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
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
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOrePalladium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustPalladium, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerCadmium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreCadmium, new ItemStack(InitBlocks.itemIngotCadmium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustCadmium, new ItemStack(InitBlocks.itemIngotCadmium, 1), 0);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":cadmiumblock";
            registerHelper(location, "Compress");
            registerHelper(location, "Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
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
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreCadmium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustCadmium, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerNeodymium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreNeodymium, new ItemStack(InitBlocks.itemIngotNeodymium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustNeodymium, new ItemStack(InitBlocks.itemIngotNeodymium, 1), 0);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":neodymiumblock";
            registerHelper(location, "Compress");
            registerHelper(location, "Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
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
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreNeodymium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustNeodymium, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerBismuth)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreBismuth, new ItemStack(InitBlocks.itemIngotBismuth, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustBismuth, new ItemStack(InitBlocks.itemIngotBismuth, 1), 0);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":bismuthblock";
            registerHelper(location, "Compress");
            registerHelper(location, "Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
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
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreBismuth).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustBismuth, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerGallium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreGallium, new ItemStack(InitBlocks.itemIngotGallium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustGallium, new ItemStack(InitBlocks.itemIngotGallium, 1), 0);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":galliumblock";
            registerHelper(location, "Compress");
            registerHelper(location, "Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
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
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreGallium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustGallium, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerIndium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreIndium, new ItemStack(InitBlocks.itemIngotIndium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustIndium, new ItemStack(InitBlocks.itemIngotIndium, 1), 0);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":indiumblock";
            registerHelper(location, "Compress");
            registerHelper(location, "Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
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
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreIndium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustIndium, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerThallium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreThallium, new ItemStack(InitBlocks.itemIngotThallium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustThallium, new ItemStack(InitBlocks.itemIngotThallium, 1), 0);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":thalliumblock";
            registerHelper(location, "Compress");
            registerHelper(location, "Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
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
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreThallium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustThallium, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerTitanium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreTitanium, new ItemStack(InitBlocks.itemIngotTitanium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustTitanium, new ItemStack(InitBlocks.itemIngotTitanium, 1), 0);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":titaniumblock";
            registerHelper(location, "Compress");
            registerHelper(location, "Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
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
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreTitanium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustTitanium, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerNickel)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreNickel, new ItemStack(InitBlocks.itemIngotNickel, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustNickel, new ItemStack(InitBlocks.itemIngotNickel, 1), 0);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":nickelblock";
            registerHelper(location, "Compress");
            registerHelper(location, "Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
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
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreNickel).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustNickel, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerAdamantine)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreAdamantine, new ItemStack(InitBlocks.itemIngotAdamantine, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustAdamantine, new ItemStack(InitBlocks.itemIngotAdamantine, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":adamantineBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Adamantine to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreAdamantine\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustAdamantine\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreAdamantine).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustAdamantine, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerAldourite)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreAldourite, new ItemStack(InitBlocks.itemIngotAldourite, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustAldourite, new ItemStack(InitBlocks.itemIngotAldourite, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":aldouriteBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Aldourite to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreAldourite\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustAldourite\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreAldourite).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustAldourite, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerAstralSilver)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreAstralSilver, new ItemStack(InitBlocks.itemIngotAstralSilver, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustAstralSilver, new ItemStack(InitBlocks.itemIngotAstralSilver, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":astralSilverBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Astral Silver to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreAstralSilver\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustAstralSilver\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreAstralSilver).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustAstralSilver, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerAtlarus)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreAtlarus, new ItemStack(InitBlocks.itemIngotAtlarus, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustAtlarus, new ItemStack(InitBlocks.itemIngotAtlarus, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":atlarusBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Atlarus to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreAtlarus\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustAtlarus\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreAtlarus).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustAtlarus, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerCarmot)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreCarmot, new ItemStack(InitBlocks.itemIngotCarmot, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustCarmot, new ItemStack(InitBlocks.itemIngotCarmot, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":carmotBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Carmot to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreCarmot\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustCarmot\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreCarmot).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustCarmot, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerCeruclase)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreCeruclase, new ItemStack(InitBlocks.itemIngotCeruclase, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustCeruclase, new ItemStack(InitBlocks.itemIngotCeruclase, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":ceruclaseBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Ceruclase to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreCeruclase\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustCeruclase\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreCeruclase).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustCeruclase, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerDeepIron)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreDeepIron, new ItemStack(InitBlocks.itemIngotDeepIron, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustDeepIron, new ItemStack(InitBlocks.itemIngotDeepIron, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":deepIronBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Deep Iron to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreDeepIron\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustDeepIron\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreDeepIron).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustDeepIron, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerIgnatius)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreIgnatius, new ItemStack(InitBlocks.itemIngotIgnatius, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustIgnatius, new ItemStack(InitBlocks.itemIngotIgnatius, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":ignatiusBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Ignatius to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreIgnatius\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustIgnatius\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreIgnatius).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustIgnatius, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerInfuscolium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreInfuscolium, new ItemStack(InitBlocks.itemIngotInfuscolium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustInfuscolium, new ItemStack(InitBlocks.itemIngotInfuscolium, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":infuscoliumBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Infuscolium to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreInfuscolium\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustInfuscolium\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreInfuscolium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustInfuscolium, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerKalendrite)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreKalendrite, new ItemStack(InitBlocks.itemIngotKalendrite, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustKalendrite, new ItemStack(InitBlocks.itemIngotKalendrite, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":kalendriteBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Kalendrite to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreKalendrite\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustKalendrite\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreKalendrite).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustKalendrite, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerLemurite)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreLemurite, new ItemStack(InitBlocks.itemIngotLemurite, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustLemurite, new ItemStack(InitBlocks.itemIngotLemurite, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":lemuriteBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Lemurite to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreLemurite\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustLemurite\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreLemurite).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustLemurite, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerMidasium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreMidasium, new ItemStack(InitBlocks.itemIngotMidasium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustMidasium, new ItemStack(InitBlocks.itemIngotMidasium, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":midasiumBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Midasium to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreMidasium\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustMidasium\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreMidasium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustMidasium, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerMithril)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreMithril, new ItemStack(InitBlocks.itemIngotMithril, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustMithril, new ItemStack(InitBlocks.itemIngotMithril, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":mithrilBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Mithril to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreMithril\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustMithril\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreMithril).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustMithril, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerOrichalcum)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreOrichalcum, new ItemStack(InitBlocks.itemIngotOrichalcum, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustOrichalcum, new ItemStack(InitBlocks.itemIngotOrichalcum, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":orichalcumBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Orichalcum to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreOrichalcum\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustOrichalcum\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreOrichalcum).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustOrichalcum, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerOureclase)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreOureclase, new ItemStack(InitBlocks.itemIngotOureclase, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustOureclase, new ItemStack(InitBlocks.itemIngotOureclase, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":oureclaseBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Oureclase to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreOureclase\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustOureclase\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreOureclase).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustOureclase, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerPrometheum)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOrePrometheum, new ItemStack(InitBlocks.itemIngotPrometheum, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustPrometheum, new ItemStack(InitBlocks.itemIngotPrometheum, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":prometheumBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Prometheum to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"orePrometheum\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustPrometheum\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOrePrometheum).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustPrometheum, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerRubracium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreRubracium, new ItemStack(InitBlocks.itemIngotRubracium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustRubracium, new ItemStack(InitBlocks.itemIngotRubracium, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":rubraciumBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Rubracium to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreRubracium\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustRubracium\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreRubracium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustRubracium, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerSanguinite)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreSanguinite, new ItemStack(InitBlocks.itemIngotSanguinite, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustSanguinite, new ItemStack(InitBlocks.itemIngotSanguinite, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":sanguiniteBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Sanguinite to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreSanguinite\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustSanguinite\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreSanguinite).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustSanguinite, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerShadowIron)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreShadowIron, new ItemStack(InitBlocks.itemIngotShadowIron, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustShadowIron, new ItemStack(InitBlocks.itemIngotShadowIron, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":shadowIronBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Shadow Iron to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreShadowIron\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustShadowIron\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreShadowIron).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustShadowIron, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerVulcanite)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreVulcanite, new ItemStack(InitBlocks.itemIngotVulcanite, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustVulcanite, new ItemStack(InitBlocks.itemIngotVulcanite, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":vulcaniteBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Vulcanite to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreVulcanite\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustVulcanite\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreVulcanite).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustVulcanite, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerVyroxeres)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreVyroxeres, new ItemStack(InitBlocks.itemIngotVyroxeres, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustVyroxeres, new ItemStack(InitBlocks.itemIngotVyroxeres, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":vyroxeresBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Vyroxeres to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreVyroxeres\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustVyroxeres\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            if (registerMek)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreVyroxeres).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustVyroxeres, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }

        }
    }
    private static void registerHelper(String resource,String mode)
    {
        ResourceLocation resourceLocation;
        if(mode.equals("Compress"))
        {
            resourceLocation = new ResourceLocation(resource + ".compressed.json");
            CraftingHelper.register(resourceLocation, new IRecipeFactory()
            {
                @Override
                public IRecipe parse(JsonContext context, JsonObject json)
                {
                    return CraftingHelper.getRecipe(json, context);
                }
            });
        }
        else if (mode.equals("Decompress"))
        {
            resourceLocation = new ResourceLocation(resource + ".decompressed.json");
            CraftingHelper.register(resourceLocation, new IRecipeFactory()
            {
                @Override
                public IRecipe parse(JsonContext context, JsonObject json)
                {
                    return CraftingHelper.getRecipe(json, context);
                }
            });
        }
    }
}

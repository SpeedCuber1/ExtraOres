package com.tylerh.extraores.Init;

import com.google.gson.JsonObject;
import com.tylerh.extraores.Util.ModInfo;
import mekanism.api.gas.GasRegistry;
import mekanism.api.gas.GasStack;
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
    private static NBTTagCompound tag;
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreAdamantine).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardAdamantine,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreAdamantine).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpAdamantine,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardAdamantine).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpAdamantine).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpAdamantine).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustAdamantine).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreAdamantine).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustAdamantine,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustAdamantine).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustAdamantine).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if(InitBlocks.registerAgate)
        {
            //Normal Crafting
            location = ModInfo.MOD_ID + ":agateBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreAldourite).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardAldourite,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreAldourite).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpAldourite,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardAldourite).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpAldourite).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpAldourite).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustAldourite).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreAldourite).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustAldourite,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustAldourite).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustAldourite).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if (InitBlocks.registerAluminum)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreAluminum, new ItemStack(InitBlocks.itemIngotAluminum, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustAluminum, new ItemStack(InitBlocks.itemIngotAluminum, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":aluminumBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreAluminum).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardAluminum,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreAluminum).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpAluminum,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardAluminum).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpAluminum).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpAluminum).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustAluminum).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreAluminum).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustAluminum,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustAluminum).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustAluminum).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if(InitBlocks.registerAmericium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreAmericium, new ItemStack(InitBlocks.itemIngotAmericium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustAmericium, new ItemStack(InitBlocks.itemIngotAmericium, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":americiumBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Americium to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreAmericium\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustAmericium\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreAmericium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardAmericium,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreAmericium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpAmericium,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardAmericium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpAmericium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpAmericium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustAmericium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreAmericium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustAmericium,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustAmericium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustAmericium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if(InitBlocks.registerAmethyst)
        {
            //Normal Crafting
            location = ModInfo.MOD_ID + ":amethystBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
        }
        if(InitBlocks.registerAmetrine)
        {
            //Normal Crafting
            location = ModInfo.MOD_ID + ":ametrineBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
        }
        if (InitBlocks.registerAmordrine)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreAmordrine, new ItemStack(InitBlocks.itemIngotAmordrine, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustAmordrine, new ItemStack(InitBlocks.itemIngotAmordrine, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":amordrineBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreAmordrine).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardAmordrine,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreAmordrine).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpAmordrine,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardAmordrine).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpAmordrine).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpAmordrine).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustAmordrine).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreAmordrine).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustAmordrine,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustAmordrine).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustAmordrine).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if (InitBlocks.registerAngmallen)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreAngmallen, new ItemStack(InitBlocks.itemIngotAngmallen, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustAngmallen, new ItemStack(InitBlocks.itemIngotAngmallen, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":angmallenBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreAngmallen).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardAngmallen,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreAngmallen).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpAngmallen,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardAngmallen).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpAngmallen).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpAngmallen).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustAngmallen).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreAngmallen).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustAngmallen,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustAngmallen).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustAngmallen).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreAstralSilver).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardAstralSilver,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreAstralSilver).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpAstralSilver,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardAstralSilver).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpAstralSilver).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpAstralSilver).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustAstralSilver).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreAstralSilver).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustAstralSilver,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustAstralSilver).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustAstralSilver).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreAtlarus).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardAtlarus,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreAtlarus).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpAtlarus,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardAtlarus).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpAtlarus).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpAtlarus).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustAtlarus).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreAtlarus).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustAtlarus,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustAtlarus).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustAtlarus).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if (InitBlocks.registerBismuth)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreBismuth, new ItemStack(InitBlocks.itemIngotBismuth, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustBismuth, new ItemStack(InitBlocks.itemIngotBismuth, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":bismuthBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreBismuth).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardBismuth,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreBismuth).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpBismuth,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardBismuth).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpBismuth).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpBismuth).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustBismuth).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreBismuth).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustBismuth,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustBismuth).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustBismuth).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if (InitBlocks.registerBlackSteel)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreBlackSteel, new ItemStack(InitBlocks.itemIngotBlackSteel, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustBlackSteel, new ItemStack(InitBlocks.itemIngotBlackSteel, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":blackSteelBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreBlackSteel).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardBlackSteel,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreBlackSteel).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpBlackSteel,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardBlackSteel).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpBlackSteel).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpBlackSteel).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustBlackSteel).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreBlackSteel).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustBlackSteel,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustBlackSteel).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustBlackSteel).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if (InitBlocks.registerCadmium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreCadmium, new ItemStack(InitBlocks.itemIngotCadmium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustCadmium, new ItemStack(InitBlocks.itemIngotCadmium, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":cadmiumBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreCadmium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardCadmium,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreCadmium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpCadmium,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardCadmium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpCadmium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpCadmium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustCadmium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreCadmium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustCadmium,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustCadmium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustCadmium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreCarmot).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardCarmot,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreCarmot).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpCarmot,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardCarmot).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpCarmot).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpCarmot).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustCarmot).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreCarmot).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustCarmot,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustCarmot).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustCarmot).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if (InitBlocks.registerCelenegil)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreCelenegil, new ItemStack(InitBlocks.itemIngotCelenegil, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustCelenegil, new ItemStack(InitBlocks.itemIngotCelenegil, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":celenegilBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreCelenegil).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardCelenegil,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreCelenegil).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpCelenegil,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardCelenegil).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpCelenegil).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpCelenegil).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustCelenegil).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreCelenegil).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustCelenegil,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustCelenegil).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustCelenegil).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreCeruclase).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardCeruclase,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreCeruclase).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpCeruclase,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardCeruclase).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpCeruclase).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpCeruclase).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustCeruclase).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreCeruclase).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustCeruclase,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustCeruclase).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustCeruclase).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if (InitBlocks.registerChromium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreChromium, new ItemStack(InitBlocks.itemIngotChromium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustChromium, new ItemStack(InitBlocks.itemIngotChromium, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":chromiumBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreChromium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardChromium,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreChromium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpChromium,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardChromium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpChromium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpChromium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustChromium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreChromium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustChromium,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustChromium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustChromium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if(InitBlocks.registerChrysocolla)
        {
            //Normal Crafting
            location = ModInfo.MOD_ID + ":chrysocollaBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
        }
        if(InitBlocks.registerCitrine)
        {
            //Normal Crafting
            location = ModInfo.MOD_ID + ":citrineBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
        }
        if (InitBlocks.registerCobalt)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreCobalt, new ItemStack(InitBlocks.itemIngotCobalt, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustCobalt, new ItemStack(InitBlocks.itemIngotCobalt, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":cobaltBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreCobalt).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardCobalt,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreCobalt).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpCobalt,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardCobalt).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpCobalt).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpCobalt).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustCobalt).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreCobalt).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustCobalt,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustCobalt).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustCobalt).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if (InitBlocks.registerCopper)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreCopper, new ItemStack(InitBlocks.itemIngotCopper, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustCopper, new ItemStack(InitBlocks.itemIngotCopper, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":copperBlock";
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreCopper).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"), 500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardCopper, 4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "ChemicalInjectionChamberRecipe", tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreCopper).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"), 500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpCopper, 3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "PurificationChamberRecipe", tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardCopper).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"), 500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpCopper).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "PurificationChamberRecipe", tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpCopper).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustCopper).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "CrusherRecipe", tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreCopper).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustCopper, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustCopper).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustCopper).writeToNBT(new NBTTagCompound()));
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
            registerHelper(location, "Compress");
            registerHelper(location, "Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreDeepIron).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"), 500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardDeepIron, 4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "ChemicalInjectionChamberRecipe", tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreDeepIron).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"), 500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpDeepIron, 3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "PurificationChamberRecipe", tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardDeepIron).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"), 500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpDeepIron).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "PurificationChamberRecipe", tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpDeepIron).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustDeepIron).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "CrusherRecipe", tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreDeepIron).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustDeepIron, 2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustDeepIron).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustDeepIron).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism", "EnrichmentChamberRecipe", tag);
            }
        }
        if (InitBlocks.registerDesichalkos)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreDesichalkos, new ItemStack(InitBlocks.itemIngotDesichalkos, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustDesichalkos, new ItemStack(InitBlocks.itemIngotDesichalkos, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":desichalkosBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Desichalkos to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreDesichalkos\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustDesichalkos\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreDesichalkos).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardDesichalkos,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreDesichalkos).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpDesichalkos,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardDesichalkos).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpDesichalkos).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpDesichalkos).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustDesichalkos).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreDesichalkos).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustDesichalkos,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustDesichalkos).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustDesichalkos).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if (InitBlocks.registerEximite)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreEximite, new ItemStack(InitBlocks.itemIngotEximite, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustEximite, new ItemStack(InitBlocks.itemIngotEximite, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":eximiteBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Eximite to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreEximite\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustEximite\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreEximite).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardEximite,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreEximite).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpEximite,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardEximite).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpEximite).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpEximite).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustEximite).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreEximite).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustEximite,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustEximite).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustEximite).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if (InitBlocks.registerGallium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreGallium, new ItemStack(InitBlocks.itemIngotGallium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustGallium, new ItemStack(InitBlocks.itemIngotGallium, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":galliumBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreGallium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardGallium,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreGallium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpGallium,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardGallium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpGallium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpGallium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustGallium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreGallium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustGallium,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustGallium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustGallium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if(InitBlocks.registerGarnet)
        {
            //Normal Crafting
            location = ModInfo.MOD_ID + ":garnetBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
        }
        if (InitBlocks.registerHaderoth)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreHaderoth, new ItemStack(InitBlocks.itemIngotHaderoth, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustHaderoth, new ItemStack(InitBlocks.itemIngotHaderoth, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":haderothBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreHaderoth).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardHaderoth,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreHaderoth).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpHaderoth,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardHaderoth).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpHaderoth).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpHaderoth).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustHaderoth).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreHaderoth).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustHaderoth,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustHaderoth).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustHaderoth).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if (InitBlocks.registerHepatizon)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreHepatizon, new ItemStack(InitBlocks.itemIngotHepatizon, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustHepatizon, new ItemStack(InitBlocks.itemIngotHepatizon, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":hepatizonBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreHepatizon).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardHepatizon,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreHepatizon).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpHepatizon,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardHepatizon).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpHepatizon).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpHepatizon).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustHepatizon).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreHepatizon).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustHepatizon,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustHepatizon).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustHepatizon).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreIgnatius).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardIgnatius,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreIgnatius).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpIgnatius,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardIgnatius).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpIgnatius).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpIgnatius).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustIgnatius).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreIgnatius).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustIgnatius,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustIgnatius).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustIgnatius).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if (InitBlocks.registerIndium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreIndium, new ItemStack(InitBlocks.itemIngotIndium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustIndium, new ItemStack(InitBlocks.itemIngotIndium, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":indiumBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreIndium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardIndium,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreIndium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpIndium,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardIndium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpIndium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpIndium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustIndium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreIndium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustIndium,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustIndium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustIndium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreInfuscolium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardInfuscolium,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreInfuscolium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpInfuscolium,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardInfuscolium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpInfuscolium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpInfuscolium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustInfuscolium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreInfuscolium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustInfuscolium,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustInfuscolium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustInfuscolium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if (InitBlocks.registerInolashite)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreInolashite, new ItemStack(InitBlocks.itemIngotInolashite, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustInolashite, new ItemStack(InitBlocks.itemIngotInolashite, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":inolashiteBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreInolashite).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardInolashite,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreInolashite).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpInolashite,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardInolashite).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpInolashite).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpInolashite).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustInolashite).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreInolashite).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustInolashite,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustInolashite).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustInolashite).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if(InitBlocks.registerIridium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreIridium, new ItemStack(InitBlocks.itemIngotIridium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustIridium, new ItemStack(InitBlocks.itemIngotIridium, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":iridiumBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Iridium to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreIridium\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustIridium\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreIridium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardIridium,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreIridium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpIridium,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardIridium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpIridium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpIridium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustIridium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreIridium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustIridium,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustIridium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustIridium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if(InitBlocks.registerJade)
        {
            //Normal Crafting
            location = ModInfo.MOD_ID + ":jadeBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
        }
        if(InitBlocks.registerJasper)
        {
            //Normal Crafting
            location = ModInfo.MOD_ID + ":jasperBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreKalendrite).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardKalendrite,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreKalendrite).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpKalendrite,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardKalendrite).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpKalendrite).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpKalendrite).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustKalendrite).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreKalendrite).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustKalendrite,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustKalendrite).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustKalendrite).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if (InitBlocks.registerLead)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreLead, new ItemStack(InitBlocks.itemIngotLead, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustLead, new ItemStack(InitBlocks.itemIngotLead, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":leadBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreLead).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardLead,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreLead).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpLead,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardLead).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpLead).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpLead).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustLead).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreLead).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustLead,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustLead).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustLead).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreLemurite).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardLemurite,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreLemurite).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpLemurite,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardLemurite).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpLemurite).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpLemurite).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustLemurite).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreLemurite).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustLemurite,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustLemurite).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustLemurite).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if(InitBlocks.registerMalachite)
        {
            //Normal Crafting
            location = ModInfo.MOD_ID + ":malachiteBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
        }
        if (InitBlocks.registerManganese)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreManganese, new ItemStack(InitBlocks.itemIngotManganese, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustManganese, new ItemStack(InitBlocks.itemIngotManganese, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":manganeseBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreManganese).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardManganese,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreManganese).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpManganese,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardManganese).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpManganese).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpManganese).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustManganese).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreManganese).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustManganese,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustManganese).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustManganese).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if (InitBlocks.registerMeutoite)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreMeutoite, new ItemStack(InitBlocks.itemIngotMeutoite, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustMeutoite, new ItemStack(InitBlocks.itemIngotMeutoite, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":meutoiteBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Meutoite to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreMeutoite\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustMeutoite\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreMeutoite).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardMeutoite,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreMeutoite).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpMeutoite,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardMeutoite).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpMeutoite).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpMeutoite).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustMeutoite).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreMeutoite).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustMeutoite,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustMeutoite).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustMeutoite).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreMidasium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardMidasium,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreMidasium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpMidasium,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardMidasium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpMidasium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpMidasium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustMidasium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreMidasium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustMidasium,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustMidasium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustMidasium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreMithril).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardMithril,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreMithril).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpMithril,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardMithril).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpMithril).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpMithril).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustMithril).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreMithril).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustMithril,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustMithril).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustMithril).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if (InitBlocks.registerMolybdenum)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreMolybdenum, new ItemStack(InitBlocks.itemIngotMolybdenum, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustMolybdenum, new ItemStack(InitBlocks.itemIngotMolybdenum, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":molybdenumBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreMolybdenum).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardMolybdenum,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreMolybdenum).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpMolybdenum,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardMolybdenum).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpMolybdenum).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpMolybdenum).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustMolybdenum).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreMolybdenum).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustMolybdenum,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustMolybdenum).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustMolybdenum).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if (InitBlocks.registerNeodymium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreNeodymium, new ItemStack(InitBlocks.itemIngotNeodymium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustNeodymium, new ItemStack(InitBlocks.itemIngotNeodymium, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":neodymiumBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreNeodymium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardNeodymium,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreNeodymium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpNeodymium,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardNeodymium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpNeodymium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpNeodymium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustNeodymium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreNeodymium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustNeodymium,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustNeodymium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustNeodymium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if(InitBlocks.registerNeptunium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreNeptunium, new ItemStack(InitBlocks.itemIngotNeptunium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustNeptunium, new ItemStack(InitBlocks.itemIngotNeptunium, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":neptuniumBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Neptunium to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreNeptunium\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustNeptunium\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreNeptunium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardNeptunium,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreNeptunium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpNeptunium,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardNeptunium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpNeptunium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpNeptunium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustNeptunium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreNeptunium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustNeptunium,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustNeptunium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustNeptunium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if (InitBlocks.registerNickel)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreNickel, new ItemStack(InitBlocks.itemIngotNickel, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustNickel, new ItemStack(InitBlocks.itemIngotNickel, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":nickelBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreNickel).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardNickel,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreNickel).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpNickel,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardNickel).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpNickel).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpNickel).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustNickel).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreNickel).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustNickel,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustNickel).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustNickel).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if (InitBlocks.registerNiobium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreNiobium, new ItemStack(InitBlocks.itemIngotNiobium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustNiobium, new ItemStack(InitBlocks.itemIngotNiobium, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":niobiumBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreNiobium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardNiobium,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreNiobium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpNiobium,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardNiobium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpNiobium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpNiobium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustNiobium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreNiobium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustNiobium,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustNiobium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustNiobium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if(InitBlocks.registerOnyx)
        {
            //Normal Crafting
            location = ModInfo.MOD_ID + ":onyxBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreOrichalcum).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardOrichalcum,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreOrichalcum).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpOrichalcum,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardOrichalcum).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpOrichalcum).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpOrichalcum).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustOrichalcum).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreOrichalcum).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustOrichalcum,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustOrichalcum).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustOrichalcum).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if(InitBlocks.registerOsmium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreOsmium, new ItemStack(InitBlocks.itemIngotOsmium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustOsmium, new ItemStack(InitBlocks.itemIngotOsmium, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":osmiumBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Osmium to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreOsmium\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustOsmium\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreOsmium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardOsmium,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreOsmium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpOsmium,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardOsmium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpOsmium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpOsmium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustOsmium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreOsmium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustOsmium,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustOsmium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustOsmium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreOureclase).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardOureclase,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreOureclase).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpOureclase,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardOureclase).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpOureclase).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpOureclase).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustOureclase).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreOureclase).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustOureclase,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustOureclase).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustOureclase).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if (InitBlocks.registerPalladium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOrePalladium, new ItemStack(InitBlocks.itemIngotPalladium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustPalladium, new ItemStack(InitBlocks.itemIngotPalladium, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":palladiumBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOrePalladium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardPalladium,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOrePalladium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpPalladium,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardPalladium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpPalladium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpPalladium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustPalladium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOrePalladium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustPalladium,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustPalladium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustPalladium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if(InitBlocks.registerPeridot)
        {
            //Normal Crafting
            location = ModInfo.MOD_ID + ":peridotBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
        }
        if(InitBlocks.registerPhoenixite)
        {
            //Normal Crafting
            location = ModInfo.MOD_ID + ":phoenixiteBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
        }
        if (InitBlocks.registerPlatinum)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOrePlatinum, new ItemStack(InitBlocks.itemIngotPlatinum, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustPlatinum, new ItemStack(InitBlocks.itemIngotPlatinum, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":platinumBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOrePlatinum).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardPlatinum,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOrePlatinum).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpPlatinum,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardPlatinum).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpPlatinum).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpPlatinum).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustPlatinum).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOrePlatinum).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustPlatinum,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustPlatinum).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustPlatinum).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if(InitBlocks.registerPlutonium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOrePlutonium, new ItemStack(InitBlocks.itemIngotPlutonium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustPlutonium, new ItemStack(InitBlocks.itemIngotPlutonium, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":plutoniumBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Plutonium to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"orePlutonium\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustPlutonium\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOrePlutonium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardPlutonium,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOrePlutonium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpPlutonium,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardPlutonium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpPlutonium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpPlutonium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustPlutonium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOrePlutonium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustPlutonium,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustPlutonium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustPlutonium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if(InitBlocks.registerPolonium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOrePolonium, new ItemStack(InitBlocks.itemIngotPolonium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustPolonium, new ItemStack(InitBlocks.itemIngotPolonium, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":poloniumBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Polonium to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"orePolonium\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustPolonium\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOrePolonium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardPolonium,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOrePolonium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpPolonium,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardPolonium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpPolonium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpPolonium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustPolonium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOrePolonium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustPolonium,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustPolonium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustPolonium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if (InitBlocks.registerPromethium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOrePromethium, new ItemStack(InitBlocks.itemIngotPromethium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustPromethium, new ItemStack(InitBlocks.itemIngotPromethium, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":promethiumBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Promethium to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"orePromethium\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustPromethium\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOrePromethium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardPromethium,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOrePromethium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpPromethium,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardPromethium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpPromethium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpPromethium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustPromethium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOrePromethium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustPromethium,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustPromethium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustPromethium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if(InitBlocks.registerRhenium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreRhenium, new ItemStack(InitBlocks.itemIngotRhenium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustRhenium, new ItemStack(InitBlocks.itemIngotRhenium, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":rheniumBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Rhenium to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreRhenium\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustRhenium\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreRhenium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardRhenium,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreRhenium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpRhenium,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardRhenium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpRhenium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpRhenium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustRhenium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreRhenium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustRhenium,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustRhenium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustRhenium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if (InitBlocks.registerRhodium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreRhodium, new ItemStack(InitBlocks.itemIngotRhodium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustRhodium, new ItemStack(InitBlocks.itemIngotRhodium, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":rhodiumBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreRhodium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardRhodium,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreRhodium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpRhodium,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardRhodium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpRhodium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpRhodium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustRhodium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreRhodium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustRhodium,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustRhodium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustRhodium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreRubracium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardRubracium,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreRubracium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpRubracium,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardRubracium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpRubracium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpRubracium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustRubracium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreRubracium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustRubracium,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustRubracium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustRubracium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if(InitBlocks.registerRuby)
        {
            //Normal Crafting
            location = ModInfo.MOD_ID + ":rubyBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
        }
        if (InitBlocks.registerRuthenium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreRuthenium, new ItemStack(InitBlocks.itemIngotRuthenium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustRuthenium, new ItemStack(InitBlocks.itemIngotRuthenium, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":rutheniumBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreRuthenium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardRuthenium,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreRuthenium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpRuthenium,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardRuthenium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpRuthenium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpRuthenium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustRuthenium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreRuthenium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustRuthenium,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustRuthenium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustRuthenium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreSanguinite).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardSanguinite,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreSanguinite).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpSanguinite,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardSanguinite).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpSanguinite).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpSanguinite).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustSanguinite).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreSanguinite).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustSanguinite,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustSanguinite).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustSanguinite).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if(InitBlocks.registerSapphire)
        {
            //Normal Crafting
            location = ModInfo.MOD_ID + ":sapphireBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreShadowIron).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardShadowIron,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreShadowIron).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpShadowIron,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardShadowIron).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpShadowIron).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpShadowIron).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustShadowIron).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreShadowIron).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustShadowIron,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustShadowIron).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustShadowIron).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if (InitBlocks.registerSilver)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreSilver, new ItemStack(InitBlocks.itemIngotSilver, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustSilver, new ItemStack(InitBlocks.itemIngotSilver, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":silverBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreSilver).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardSilver,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreSilver).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpSilver,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardSilver).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpSilver).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpSilver).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustSilver).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreSilver).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustSilver,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustSilver).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustSilver).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if(InitBlocks.registerSpinel)
        {
            //Normal Crafting
            location = ModInfo.MOD_ID + ":spinelBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
        }
        if(InitBlocks.registerSugilite)
        {
            //Normal Crafting
            location = ModInfo.MOD_ID + ":sugiliteBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
        }
        if(InitBlocks.registerTantalum)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreTantalum, new ItemStack(InitBlocks.itemIngotTantalum, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustTantalum, new ItemStack(InitBlocks.itemIngotTantalum, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":tantalumBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Tantalum to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreTantalum\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustTantalum\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreTantalum).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardTantalum,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreTantalum).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpTantalum,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardTantalum).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpTantalum).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpTantalum).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustTantalum).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreTantalum).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustTantalum,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustTantalum).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustTantalum).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if(InitBlocks.registerTartarite)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreTartarite, new ItemStack(InitBlocks.itemIngotTartarite, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustTartarite, new ItemStack(InitBlocks.itemIngotTartarite, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":tartariteBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Tartarite to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreTartarite\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustTartarite\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreTartarite).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardTartarite,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreTartarite).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpTartarite,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardTartarite).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpTartarite).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpTartarite).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustTartarite).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreTartarite).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustTartarite,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustTartarite).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustTartarite).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if (InitBlocks.registerTechnetium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreTechnetium, new ItemStack(InitBlocks.itemIngotTechnetium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustTechnetium, new ItemStack(InitBlocks.itemIngotTechnetium, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":technetiumBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreTechnetium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardTechnetium,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreTechnetium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpTechnetium,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardTechnetium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpTechnetium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpTechnetium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustTechnetium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreTechnetium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustTechnetium,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustTechnetium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustTechnetium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if (InitBlocks.registerThallium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreThallium, new ItemStack(InitBlocks.itemIngotThallium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustThallium, new ItemStack(InitBlocks.itemIngotThallium, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":thalliumBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreThallium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardThallium,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreThallium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpThallium,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardThallium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpThallium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpThallium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustThallium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreThallium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustThallium,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustThallium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustThallium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if (InitBlocks.registerTin)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreTin, new ItemStack(InitBlocks.itemIngotTin, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustTin, new ItemStack(InitBlocks.itemIngotTin, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":tinBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreTin).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardTin,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreTin).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpTin,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardTin).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpTin).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpTin).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustTin).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreTin).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustTin,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustTin).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustTin).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if (InitBlocks.registerTitanium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreTitanium, new ItemStack(InitBlocks.itemIngotTitanium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustTitanium, new ItemStack(InitBlocks.itemIngotTitanium, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":titaniumBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreTitanium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardTitanium,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreTitanium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpTitanium,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardTitanium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpTitanium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpTitanium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustTitanium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreTitanium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustTitanium,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustTitanium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustTitanium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if(InitBlocks.registerTopaz)
        {
            //Normal Crafting
            location = ModInfo.MOD_ID + ":topazBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
        }
        if(InitBlocks.registerTourmaline)
        {
            //Normal Crafting
            location = ModInfo.MOD_ID + ":tourmalineBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
        }
        if (InitBlocks.registerTungsten)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreTungsten, new ItemStack(InitBlocks.itemIngotTungsten, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustTungsten, new ItemStack(InitBlocks.itemIngotTungsten, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":tungstenBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreTungsten).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardTungsten,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreTungsten).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpTungsten,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardTungsten).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpTungsten).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpTungsten).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustTungsten).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreTungsten).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustTungsten,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustTungsten).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustTungsten).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if (InitBlocks.registerUnobtainium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreUnobtainium, new ItemStack(InitBlocks.itemIngotUnobtainium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustUnobtainium, new ItemStack(InitBlocks.itemIngotUnobtainium, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":unobtainiumBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreUnobtainium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardUnobtainium,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreUnobtainium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpUnobtainium,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardUnobtainium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpUnobtainium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpUnobtainium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustUnobtainium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreUnobtainium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustUnobtainium,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustUnobtainium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustUnobtainium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if(InitBlocks.registerUranium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreUranium, new ItemStack(InitBlocks.itemIngotUranium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustUranium, new ItemStack(InitBlocks.itemIngotUranium, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":uraniumBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Uranium to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreUranium\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustUranium\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreUranium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardUranium,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreUranium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpUranium,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardUranium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpUranium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpUranium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustUranium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreUranium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustUranium,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustUranium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustUranium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if (InitBlocks.registerVanadium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreVanadium, new ItemStack(InitBlocks.itemIngotVanadium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustVanadium, new ItemStack(InitBlocks.itemIngotVanadium, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":vanadiumBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreVanadium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardVanadium,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreVanadium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpVanadium,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardVanadium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpVanadium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpVanadium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustVanadium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreVanadium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustVanadium,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustVanadium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustVanadium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreVulcanite).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardVulcanite,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreVulcanite).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpVulcanite,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardVulcanite).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpVulcanite).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpVulcanite).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustVulcanite).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreVulcanite).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustVulcanite,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustVulcanite).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustVulcanite).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreVyroxeres).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardVyroxeres,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreVyroxeres).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpVyroxeres,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardVyroxeres).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpVyroxeres).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpVyroxeres).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustVyroxeres).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreVyroxeres).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustVyroxeres,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustVyroxeres).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustVyroxeres).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if(InitBlocks.registerYellorite)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreYellorite, new ItemStack(InitBlocks.itemIngotYellorite, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustYellorite, new ItemStack(InitBlocks.itemIngotYellorite, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":yelloriteBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
            //Pulverizing("EnderIO Req'd")
            if (registerDusts)
            {
                String recipe = "<recipeGroup name=\"ExtraOres\" >" +
                        "<recipe name=\"Yellorite to Dust\" energyCost=\"3600\" >" +
                        "<input>" +
                        "<itemStack oreDictionary=\"oreYellorite\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack oreDictionary=\"dustYellorite\" number=\"2\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
                FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
            }
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreYellorite).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardYellorite,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreYellorite).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpYellorite,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardYellorite).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpYellorite).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpYellorite).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustYellorite).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreYellorite).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustYellorite,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustYellorite).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustYellorite).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if (InitBlocks.registerZinc)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreZinc, new ItemStack(InitBlocks.itemIngotZinc, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustZinc, new ItemStack(InitBlocks.itemIngotZinc, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":zincBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreZinc).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardZinc,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreZinc).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpZinc,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardZinc).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpZinc).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpZinc).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustZinc).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreZinc).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustZinc,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustZinc).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustZinc).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
            }
        }
        if (InitBlocks.registerZirconium)
        {
            //Smelting
            GameRegistry.addSmelting(InitBlocks.blockOreZirconium, new ItemStack(InitBlocks.itemIngotZirconium, 1), 1.0f);
            GameRegistry.addSmelting(InitBlocks.itemDustZirconium, new ItemStack(InitBlocks.itemIngotZirconium, 1), 1.0f);
            //Normal Crafting
            location = ModInfo.MOD_ID + ":zirconiumBlock";
            registerHelper(location,"Compress");
            registerHelper(location,"Decompress");
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
            //Ore Quadrupling (Mekanism Req'd)
            if (registerMek)
            {
                //Chemical Injection Chamber
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreZirconium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("hydrogenChloride"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemShardZirconium,4).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","ChemicalInjectionChamberRecipe",tag);
                //Purification Chamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreZirconium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpZirconium,3).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Shard
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemShardZirconium).writeToNBT(new NBTTagCompound()));
                tag.setTag("gasType", new GasStack(GasRegistry.getGas("oxygen"),500).write(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemClumpZirconium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","PurificationChamberRecipe",tag);
                //Crusher
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemClumpZirconium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDirtyDustZirconium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","CrusherRecipe",tag);
                //EnrichmentChamber
                //Raw Ore
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.blockOreZirconium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustZirconium,2).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
                //Dirty Dust
                tag = new NBTTagCompound();
                tag.setTag("input", new ItemStack(InitBlocks.itemDirtyDustZirconium).writeToNBT(new NBTTagCompound()));
                tag.setTag("output", new ItemStack(InitBlocks.itemDustZirconium).writeToNBT(new NBTTagCompound()));
                FMLInterModComms.sendMessage("mekanism","EnrichmentChamberRecipe",tag);
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

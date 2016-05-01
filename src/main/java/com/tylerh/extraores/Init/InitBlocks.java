package com.tylerh.extraores.Init;

import com.tylerh.extraores.Blocks.BlockEXOre;
import com.tylerh.extraores.Items.ItemEXOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by Tyler on 4/29/2016.
 */
public class InitBlocks
{
    public static boolean registerCopper;
    public static boolean registerTin;
    public static boolean registerChromium;
    public static boolean registerCobalt;
    public static boolean registerUnobtainium;
    public static boolean registerManganese;
    public static boolean registerMolybdenum;
    public static boolean registerAluminum;
    public static boolean registerSilver;
    public static boolean registerLead;
    public static boolean registerPlatinum;
    public static boolean registerTungsten;
    public static boolean registerVanadium;

    //Ores
    public static Block blockOreCopper;
    public static Block blockOreTin;
    public static Block blockOreChromium;
    public static Block blockOreCobalt;
    public static Block blockOreUnobtainium;
    public static Block blockOreManganese;
    public static Block blockOreMolybdenum;
    public static Block blockOreAluminum;
    public static Block blockOreSilver;
    public static Block blockOreLead;
    public static Block blockOrePlatinum;
    public static Block blockOreTungsten;
    public static Block blockOreVanadium;

    //Ingots
    public static Item itemIngotCopper;
    public static Item itemIngotTin;
    public static Item itemIngotChromium;
    public static Item itemIngotCobalt;
    public static Item itemIngotUnobtainium;
    public static Item itemIngotManganese;
    public static Item itemIngotMolybdenum;
    public static Item itemIngotAluminum;
    public static Item itemIngotSilver;
    public static Item itemIngotLead;
    public static Item itemIngotPlatinum;
    public static Item itemIngotTungsten;
    public static Item itemIngotVanadium;
    
    //Blocks
    public static Block blockCopper;
    public static Block blockTin;
    public static Block blockChromium;
    public static Block blockCobalt;
    public static Block blockUnobtainium;
    public static Block blockManganese;
    public static Block blockMolybdenum;
    public static Block blockAluminum;
    public static Block blockSilver;
    public static Block blockLead;
    public static Block blockPlatinum;
    public static Block blockTungsten;
    public static Block blockVanadium;

    public static void init()
    {
        if(registerCopper)
        {
            blockOreCopper = new BlockEXOre(Material.rock,3.0f,5.0f,"copperOre");
            blockCopper = new BlockEXOre(Material.iron,3.0f,5.0f,"copperBlock");
            itemIngotCopper = new ItemEXOre("copperIngot");
            GameRegistry.registerBlock(blockOreCopper,"copperOre");
            GameRegistry.registerBlock(blockCopper,"copperBlock");
            GameRegistry.registerItem(itemIngotCopper,"copperIngot");
            initOreDict(blockOreCopper,"oreCopper");
            initOreDict(blockCopper,"blockCopper");
            initOreDict(itemIngotCopper,"ingotCopper");
        }
        if(registerTin)
        {
            blockOreTin = new BlockEXOre(Material.rock,3.0f,5.0f,"tinOre");
            blockTin = new BlockEXOre(Material.iron,3.0f,5.0f,"tinBlock");
            itemIngotTin = new ItemEXOre("tinIngot");
            GameRegistry.registerBlock(blockOreTin,"tinOre");
            GameRegistry.registerBlock(blockTin,"tinBlock");
            GameRegistry.registerItem(itemIngotTin,"tinIngot");
            initOreDict(blockOreTin,"oreTin");
            initOreDict(blockTin,"blockTin");
            initOreDict(itemIngotTin,"ingotTin");
        }
        if(registerChromium)
        {
            blockOreChromium = new BlockEXOre(Material.rock,3.0f,5.0f,"chromiumOre");
            blockChromium = new BlockEXOre(Material.iron,3.0f,5.0f,"chromiumBlock");
            itemIngotChromium = new ItemEXOre("chromiumIngot");
            GameRegistry.registerBlock(blockOreChromium,"chromiumOre");
            GameRegistry.registerBlock(blockChromium,"chromiumBlock");
            GameRegistry.registerItem(itemIngotChromium,"chromiumIngot");
            initOreDict(blockOreChromium,"oreChromium");
            initOreDict(blockChromium,"blockChromium");
            initOreDict(itemIngotChromium,"ingotChromium");
        }
        if(registerCobalt)
        {
            blockOreCobalt = new BlockEXOre(Material.rock,3.0f,5.0f,"cobaltOre");
            blockCobalt = new BlockEXOre(Material.iron,3.0f,5.0f,"cobaltBlock");
            itemIngotCobalt = new ItemEXOre("cobaltIngot");
            GameRegistry.registerBlock(blockOreCobalt,"cobaltOre");
            GameRegistry.registerBlock(blockCobalt,"cobaltBlock");
            GameRegistry.registerItem(itemIngotCobalt,"cobaltIngot");
            initOreDict(blockOreCobalt,"oreCobalt");
            initOreDict(blockCobalt,"blockCobalt");
            initOreDict(itemIngotCobalt,"ingotCobalt");
        }
        if(registerUnobtainium)
        {
            blockOreUnobtainium = new BlockEXOre(Material.rock,3.0f,5.0f,"unobtainiumOre");
            blockUnobtainium = new BlockEXOre(Material.iron,3.0f,5.0f,"unobtainiumBlock");
            itemIngotUnobtainium = new ItemEXOre("unobtainiumIngot");
            GameRegistry.registerBlock(blockOreUnobtainium,"unobtainiumOre");
            GameRegistry.registerBlock(blockUnobtainium,"unobtainiumBlock");
            GameRegistry.registerItem(itemIngotUnobtainium,"unobtainiumIngot");
            initOreDict(blockOreUnobtainium,"oreUnobtainium");
            initOreDict(blockUnobtainium,"blockUnobtainium");
            initOreDict(itemIngotUnobtainium,"ingotUnobtainium");
        }
        if(registerManganese)
        {
            blockOreManganese = new BlockEXOre(Material.rock,3.0f,5.0f,"manganeseOre");
            blockManganese = new BlockEXOre(Material.iron,3.0f,5.0f,"manganeseBlock");
            itemIngotManganese = new ItemEXOre("manganeseIngot");
            GameRegistry.registerBlock(blockOreManganese,"manganeseOre");
            GameRegistry.registerBlock(blockManganese,"manganeseBlock");
            GameRegistry.registerItem(itemIngotManganese,"manganeseIngot");
            initOreDict(blockOreManganese,"oreManganese");
            initOreDict(blockManganese,"blockManganese");
            initOreDict(itemIngotManganese,"ingotManganese");
        }
        if(registerMolybdenum)
        {
            blockOreMolybdenum = new BlockEXOre(Material.rock,3.0f,5.0f,"molybdenumOre");
            blockMolybdenum = new BlockEXOre(Material.iron,3.0f,5.0f,"molybdenumBlock");
            itemIngotMolybdenum = new ItemEXOre("molybdenumIngot");
            GameRegistry.registerBlock(blockOreMolybdenum,"molybdenumOre");
            GameRegistry.registerBlock(blockMolybdenum,"molybdenumBlock");
            GameRegistry.registerItem(itemIngotMolybdenum,"molybdenumIngot");
            initOreDict(blockOreMolybdenum,"oreMolybdenum");
            initOreDict(blockMolybdenum,"blockMolybdenum");
            initOreDict(itemIngotMolybdenum,"ingotMolybdenum");
        }
        if(registerAluminum)
        {
            blockOreAluminum = new BlockEXOre(Material.rock,3.0f,5.0f,"aluminumOre");
            blockAluminum = new BlockEXOre(Material.iron,3.0f,5.0f,"aluminumBlock");
            itemIngotAluminum = new ItemEXOre("aluminumIngot");
            GameRegistry.registerBlock(blockOreAluminum,"aluminumOre");
            GameRegistry.registerBlock(blockAluminum,"aluminumBlock");
            GameRegistry.registerItem(itemIngotAluminum,"aluminumIngot");
            initOreDict(blockOreAluminum,"oreAluminum");
            initOreDict(blockAluminum,"blockAluminum");
            initOreDict(itemIngotAluminum,"ingotAluminum");
        }
        if(registerSilver)
        {
            blockOreSilver = new BlockEXOre(Material.rock,3.0f,5.0f,"silverOre");
            blockSilver = new BlockEXOre(Material.iron,3.0f,5.0f,"silverBlock");
            itemIngotSilver = new ItemEXOre("silverIngot");
            GameRegistry.registerBlock(blockOreSilver,"silverOre");
            GameRegistry.registerBlock(blockSilver,"silverBlock");
            GameRegistry.registerItem(itemIngotSilver,"silverIngot");
            initOreDict(blockOreSilver,"oreSilver");
            initOreDict(blockSilver,"blockSilver");
            initOreDict(itemIngotSilver,"ingotSilver");
        }
        if(registerLead)
        {
            blockOreLead = new BlockEXOre(Material.rock,3.0f,5.0f,"leadOre");
            blockLead = new BlockEXOre(Material.iron,3.0f,5.0f,"leadBlock");
            itemIngotLead = new ItemEXOre("leadIngot");
            GameRegistry.registerBlock(blockOreLead,"leadOre");
            GameRegistry.registerBlock(blockLead,"leadBlock");
            GameRegistry.registerItem(itemIngotLead,"leadIngot");
            initOreDict(blockOreLead,"oreLead");
            initOreDict(blockLead,"blockLead");
            initOreDict(itemIngotLead,"ingotLead");
        }
        if(registerPlatinum)
        {
            blockOrePlatinum = new BlockEXOre(Material.rock,3.0f,5.0f,"platinumOre");
            blockPlatinum = new BlockEXOre(Material.iron,3.0f,5.0f,"platinumBlock");
            itemIngotPlatinum = new ItemEXOre("platinumIngot");
            GameRegistry.registerBlock(blockOrePlatinum,"platinumOre");
            GameRegistry.registerBlock(blockPlatinum,"platinumBlock");
            GameRegistry.registerItem(itemIngotPlatinum,"platinumIngot");
            initOreDict(blockOrePlatinum,"orePlatinum");
            initOreDict(blockPlatinum,"blockPlatinum");
            initOreDict(itemIngotPlatinum,"ingotPlatinum");
        }
        if(registerTungsten)
        {
            blockOreTungsten = new BlockEXOre(Material.rock,3.0f,5.0f,"tungstenOre");
            blockTungsten = new BlockEXOre(Material.iron,3.0f,5.0f,"tungstenBlock");
            itemIngotTungsten = new ItemEXOre("tungstenIngot");
            GameRegistry.registerBlock(blockOreTungsten,"tungstenOre");
            GameRegistry.registerBlock(blockTungsten,"tungstenBlock");
            GameRegistry.registerItem(itemIngotTungsten,"tungstenIngot");
            initOreDict(blockOreTungsten,"oreTungsten");
            initOreDict(blockTungsten,"blockTungsten");
            initOreDict(itemIngotTungsten,"ingotTungsten");
        }
        if(registerVanadium)
        {
            blockOreVanadium = new BlockEXOre(Material.rock,3.0f,5.0f,"vanadiumOre");
            blockVanadium = new BlockEXOre(Material.iron,3.0f,5.0f,"vanadiumBlock");
            itemIngotVanadium = new ItemEXOre("vanadiumIngot");
            GameRegistry.registerBlock(blockOreVanadium,"vanadiumOre");
            GameRegistry.registerBlock(blockVanadium,"vanadiumBlock");
            GameRegistry.registerItem(itemIngotVanadium,"vanadiumIngot");
            initOreDict(blockOreVanadium,"oreVanadium");
            initOreDict(blockVanadium,"blockVanadium");
            initOreDict(itemIngotVanadium,"ingotVanadium");
        }
    }
    public static void initOreDict(Block block, String name)
    {
        ItemStack stack = new ItemStack(block,1);
        OreDictionary.registerOre(name,stack);
    }
    public static void initOreDict(Item item, String name)
    {
        ItemStack stack = new ItemStack(item,1);
        OreDictionary.registerOre(name,stack);
    }
}

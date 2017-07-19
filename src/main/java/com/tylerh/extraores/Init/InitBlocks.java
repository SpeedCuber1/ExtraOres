package com.tylerh.extraores.Init;

import com.tylerh.extraores.Blocks.BlockEXOre;
import com.tylerh.extraores.Items.ItemEXOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
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
    public static boolean registerZinc;
    public static boolean registerZirconium;
    public static boolean registerNiobium;
    public static boolean registerTechnetium;
    public static boolean registerRuthenium;
    public static boolean registerRhodium;
    public static boolean registerPalladium;
    public static boolean registerCadmium;
    public static boolean registerNeodymium;
    public static boolean registerBismuth;
    public static boolean registerGallium;
    public static boolean registerIndium;
    public static boolean registerThallium;
    public static boolean registerTitanium;
    public static boolean registerNickel;

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
    public static Block blockOreZinc;
    public static Block blockOreZirconium;
    public static Block blockOreNiobium;
    public static Block blockOreTechnetium;
    public static Block blockOreRuthenium;
    public static Block blockOreRhodium;
    public static Block blockOrePalladium;
    public static Block blockOreCadmium;
    public static Block blockOreNeodymium;
    public static Block blockOreBismuth;
    public static Block blockOreGallium;
    public static Block blockOreIndium;
    public static Block blockOreThallium;
    public static Block blockOreTitanium;
    public static Block blockOreNickel;

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
    public static Item itemIngotZinc;
    public static Item itemIngotZirconium;
    public static Item itemIngotNiobium;
    public static Item itemIngotTechnetium;
    public static Item itemIngotRuthenium;
    public static Item itemIngotRhodium;
    public static Item itemIngotPalladium;
    public static Item itemIngotCadmium;
    public static Item itemIngotNeodymium;
    public static Item itemIngotBismuth;
    public static Item itemIngotGallium;
    public static Item itemIngotIndium;
    public static Item itemIngotThallium;
    public static Item itemIngotTitanium;
    public static Item itemIngotNickel;
    
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
    public static Block blockZinc;
    public static Block blockZirconium;
    public static Block blockNiobium;
    public static Block blockTechnetium;
    public static Block blockRuthenium;
    public static Block blockRhodium;
    public static Block blockPalladium;
    public static Block blockCadmium;
    public static Block blockNeodymium;
    public static Block blockBismuth;
    public static Block blockGallium;
    public static Block blockIndium;
    public static Block blockThallium;
    public static Block blockTitanium;
    public static Block blockNickel;

    //ItemBlocks Ores
    public static ItemBlock itemBlockOreCopper;
    public static ItemBlock itemBlockOreTin;
    public static ItemBlock itemBlockOreChromium;
    public static ItemBlock itemBlockOreCobalt;
    public static ItemBlock itemBlockOreUnobtainium;
    public static ItemBlock itemBlockOreManganese;
    public static ItemBlock itemBlockOreMolybdenum;
    public static ItemBlock itemBlockOreAluminum;
    public static ItemBlock itemBlockOreSilver;
    public static ItemBlock itemBlockOreLead;
    public static ItemBlock itemBlockOrePlatinum;
    public static ItemBlock itemBlockOreTungsten;
    public static ItemBlock itemBlockOreVanadium;
    public static ItemBlock itemBlockOreZinc;
    public static ItemBlock itemBlockOreZirconium;
    public static ItemBlock itemBlockOreNiobium;
    public static ItemBlock itemBlockOreTechnetium;
    public static ItemBlock itemBlockOreRuthenium;
    public static ItemBlock itemBlockOreRhodium;
    public static ItemBlock itemBlockOrePalladium;
    public static ItemBlock itemBlockOreCadmium;
    public static ItemBlock itemBlockOreNeodymium;
    public static ItemBlock itemBlockOreBismuth;
    public static ItemBlock itemBlockOreGallium;
    public static ItemBlock itemBlockOreIndium;
    public static ItemBlock itemBlockOreThallium;
    public static ItemBlock itemBlockOreTitanium;
    public static ItemBlock itemBlockOreNickel;
    //ItemBlocks Blocks
    public static ItemBlock itemBlockCopper;
    public static ItemBlock itemBlockTin;
    public static ItemBlock itemBlockChromium;
    public static ItemBlock itemBlockCobalt;
    public static ItemBlock itemBlockUnobtainium;
    public static ItemBlock itemBlockManganese;
    public static ItemBlock itemBlockMolybdenum;
    public static ItemBlock itemBlockAluminum;
    public static ItemBlock itemBlockSilver;
    public static ItemBlock itemBlockLead;
    public static ItemBlock itemBlockPlatinum;
    public static ItemBlock itemBlockTungsten;
    public static ItemBlock itemBlockVanadium;
    public static ItemBlock itemBlockZinc;
    public static ItemBlock itemBlockZirconium;
    public static ItemBlock itemBlockNiobium;
    public static ItemBlock itemBlockTechnetium;
    public static ItemBlock itemBlockRuthenium;
    public static ItemBlock itemBlockRhodium;
    public static ItemBlock itemBlockPalladium;
    public static ItemBlock itemBlockCadmium;
    public static ItemBlock itemBlockNeodymium;
    public static ItemBlock itemBlockBismuth;
    public static ItemBlock itemBlockGallium;
    public static ItemBlock itemBlockIndium;
    public static ItemBlock itemBlockThallium;
    public static ItemBlock itemBlockTitanium;
    public static ItemBlock itemBlockNickel;

    //Dusts
    public static Item itemDustCopper;
    public static Item itemDustTin;
    public static Item itemDustChromium;
    public static Item itemDustCobalt;
    public static Item itemDustUnobtainium;
    public static Item itemDustManganese;
    public static Item itemDustMolybdenum;
    public static Item itemDustAluminum;
    public static Item itemDustSilver;
    public static Item itemDustLead;
    public static Item itemDustPlatinum;
    public static Item itemDustTungsten;
    public static Item itemDustVanadium;
    public static Item itemDustZinc;
    public static Item itemDustZirconium;
    public static Item itemDustNiobium;
    public static Item itemDustTechnetium;
    public static Item itemDustRuthenium;
    public static Item itemDustRhodium;
    public static Item itemDustPalladium;
    public static Item itemDustCadmium;
    public static Item itemDustNeodymium;
    public static Item itemDustBismuth;
    public static Item itemDustGallium;
    public static Item itemDustIndium;
    public static Item itemDustThallium;
    public static Item itemDustTitanium;
    public static Item itemDustNickel;

    public static void init()
    {
        if(registerCopper)
        {
            blockOreCopper = new BlockEXOre(Material.ROCK,3.0f,5.0f,"copperOre");
            itemBlockOreCopper = new ItemBlock(blockOreCopper);
            blockCopper = new BlockEXOre(Material.IRON,3.0f,5.0f,"copperBlock");
            itemBlockCopper = new ItemBlock(blockCopper);
            itemIngotCopper = new ItemEXOre("copperIngot");
            itemDustCopper = new ItemEXOre("copperDust");
            createRegistry(blockOreCopper,itemBlockOreCopper,"copperOre");
            createRegistry(blockCopper,itemBlockCopper,"copperBlock");
            createRegistry(itemIngotCopper,"copperIngot");
            createRegistry(itemDustCopper,"copperDust");
            ForgeRegistries.BLOCKS.register(blockOreCopper);
            ForgeRegistries.ITEMS.register(itemBlockOreCopper);
            ForgeRegistries.BLOCKS.register(blockCopper);
            ForgeRegistries.ITEMS.register(itemBlockCopper);
            ForgeRegistries.ITEMS.register(itemIngotCopper);
            ForgeRegistries.ITEMS.register(itemDustCopper);
            initOreDict(blockOreCopper,"oreCopper");
            initOreDict(blockCopper,"blockCopper");
            initOreDict(itemIngotCopper,"ingotCopper");
            initOreDict(itemDustCopper,"dustCopper");
        }
        if(registerTin)
        {
            blockOreTin = new BlockEXOre(Material.ROCK,3.0f,5.0f,"tinOre");
            itemBlockOreTin = new ItemBlock(blockOreTin);
            blockTin = new BlockEXOre(Material.IRON,3.0f,5.0f,"tinBlock");
            itemBlockTin = new ItemBlock(blockTin);
            itemIngotTin = new ItemEXOre("tinIngot");
            itemDustTin = new ItemEXOre("tinDust");
            createRegistry(blockOreTin,itemBlockOreTin,"tinOre");
            createRegistry(blockTin,itemBlockTin,"tinBlock");
            createRegistry(itemIngotTin,"tinIngot");
            createRegistry(itemDustTin,"tinDust");
            ForgeRegistries.BLOCKS.register(blockOreTin);
            ForgeRegistries.ITEMS.register(itemBlockOreTin);
            ForgeRegistries.BLOCKS.register(blockTin);
            ForgeRegistries.ITEMS.register(itemBlockTin);
            ForgeRegistries.ITEMS.register(itemIngotTin);
            ForgeRegistries.ITEMS.register(itemDustTin);
            initOreDict(blockOreTin,"oreTin");
            initOreDict(blockTin,"blockTin");
            initOreDict(itemIngotTin,"ingotTin");
            initOreDict(itemDustTin,"dustTin");
        }
        if(registerChromium)
        {
            blockOreChromium = new BlockEXOre(Material.ROCK,3.0f,5.0f,"chromiumOre");
            itemBlockOreChromium = new ItemBlock(blockOreChromium);
            blockChromium = new BlockEXOre(Material.IRON,3.0f,5.0f,"chromiumBlock");
            itemBlockChromium = new ItemBlock(blockChromium);
            itemIngotChromium = new ItemEXOre("chromiumIngot");
            itemDustChromium = new ItemEXOre("chromiumDust");
            createRegistry(blockOreChromium,itemBlockOreChromium,"chromiumOre");
            createRegistry(blockChromium,itemBlockChromium,"chromiumBlock");
            createRegistry(itemIngotChromium,"chromiumIngot");
            createRegistry(itemDustChromium,"chromiumDust");
            ForgeRegistries.BLOCKS.register(blockOreChromium);
            ForgeRegistries.ITEMS.register(itemBlockOreChromium);
            ForgeRegistries.BLOCKS.register(blockChromium);
            ForgeRegistries.ITEMS.register(itemBlockChromium);
            ForgeRegistries.ITEMS.register(itemIngotChromium);
            ForgeRegistries.ITEMS.register(itemDustChromium);
            initOreDict(blockOreChromium,"oreChromium");
            initOreDict(blockChromium,"blockChromium");
            initOreDict(itemIngotChromium,"ingotChromium");
            initOreDict(itemDustChromium,"dustChromium");
        }
        if(registerCobalt)
        {
            blockOreCobalt = new BlockEXOre(Material.ROCK,3.0f,5.0f,"cobaltOre");
            itemBlockOreCobalt = new ItemBlock(blockOreCobalt);
            blockCobalt = new BlockEXOre(Material.IRON,3.0f,5.0f,"cobaltBlock");
            itemBlockCobalt = new ItemBlock(blockCobalt);
            itemIngotCobalt = new ItemEXOre("cobaltIngot");
            itemDustCobalt = new ItemEXOre("cobaltDust");
            createRegistry(blockOreCobalt,itemBlockOreCobalt,"cobaltOre");
            createRegistry(blockCobalt,itemBlockCobalt,"cobaltBlock");
            createRegistry(itemIngotCobalt,"cobaltIngot");
            createRegistry(itemDustCobalt,"cobaltDust");
            ForgeRegistries.BLOCKS.register(blockOreCobalt);
            ForgeRegistries.ITEMS.register(itemBlockOreCobalt);
            ForgeRegistries.BLOCKS.register(blockCobalt);
            ForgeRegistries.ITEMS.register(itemBlockCobalt);
            ForgeRegistries.ITEMS.register(itemIngotCobalt);
            ForgeRegistries.ITEMS.register(itemDustCobalt);
            initOreDict(blockOreCobalt,"oreCobalt");
            initOreDict(blockCobalt,"blockCobalt");
            initOreDict(itemIngotCobalt,"ingotCobalt");
            initOreDict(itemDustCobalt,"dustCobalt");
        }
        if(registerUnobtainium)
        {
            blockOreUnobtainium = new BlockEXOre(Material.ROCK,3.0f,5.0f,"unobtainiumOre");
            itemBlockOreUnobtainium = new ItemBlock(blockOreUnobtainium);
            blockUnobtainium = new BlockEXOre(Material.IRON,3.0f,5.0f,"unobtainiumBlock");
            itemBlockUnobtainium = new ItemBlock(blockUnobtainium);
            itemIngotUnobtainium = new ItemEXOre("unobtainiumIngot");
            itemDustUnobtainium = new ItemEXOre("unobtainiumDust");
            createRegistry(blockOreUnobtainium,itemBlockOreUnobtainium,"unobtainiumOre");
            createRegistry(blockUnobtainium,itemBlockUnobtainium,"unobtainiumBlock");
            createRegistry(itemIngotUnobtainium,"unobtainiumIngot");
            createRegistry(itemDustUnobtainium,"unobtainiumDust");
            ForgeRegistries.BLOCKS.register(blockOreUnobtainium);
            ForgeRegistries.ITEMS.register(itemBlockOreUnobtainium);
            ForgeRegistries.BLOCKS.register(blockUnobtainium);
            ForgeRegistries.ITEMS.register(itemBlockUnobtainium);
            ForgeRegistries.ITEMS.register(itemIngotUnobtainium);
            ForgeRegistries.ITEMS.register(itemDustUnobtainium);
            initOreDict(blockOreUnobtainium,"oreUnobtainium");
            initOreDict(blockUnobtainium,"blockUnobtainium");
            initOreDict(itemIngotUnobtainium,"ingotUnobtainium");
            initOreDict(itemDustUnobtainium,"dustUnobtainium");
        }
        if(registerManganese)
        {
            blockOreManganese = new BlockEXOre(Material.ROCK,3.0f,5.0f,"manganeseOre");
            itemBlockOreManganese = new ItemBlock(blockOreManganese);
            blockManganese = new BlockEXOre(Material.IRON,3.0f,5.0f,"manganeseBlock");
            itemBlockManganese = new ItemBlock(blockManganese);
            itemIngotManganese = new ItemEXOre("manganeseIngot");
            itemDustManganese = new ItemEXOre("manganeseDust");
            createRegistry(blockOreManganese,itemBlockOreManganese,"manganeseOre");
            createRegistry(blockManganese,itemBlockManganese,"manganeseBlock");
            createRegistry(itemIngotManganese,"manganeseIngot");
            createRegistry(itemDustManganese,"manganeseDust");
            ForgeRegistries.BLOCKS.register(blockOreManganese);
            ForgeRegistries.ITEMS.register(itemBlockOreManganese);
            ForgeRegistries.BLOCKS.register(blockManganese);
            ForgeRegistries.ITEMS.register(itemBlockManganese);
            ForgeRegistries.ITEMS.register(itemIngotManganese);
            ForgeRegistries.ITEMS.register(itemDustManganese);
            initOreDict(blockOreManganese,"oreManganese");
            initOreDict(blockManganese,"blockManganese");
            initOreDict(itemIngotManganese,"ingotManganese");
            initOreDict(itemDustManganese,"dustManganese");
        }
        if(registerMolybdenum)
        {
            blockOreMolybdenum = new BlockEXOre(Material.ROCK,3.0f,5.0f,"molybdenumOre");
            itemBlockOreMolybdenum = new ItemBlock(blockOreMolybdenum);
            blockMolybdenum = new BlockEXOre(Material.IRON,3.0f,5.0f,"molybdenumBlock");
            itemBlockMolybdenum = new ItemBlock(blockMolybdenum);
            itemIngotMolybdenum = new ItemEXOre("molybdenumIngot");
            itemDustMolybdenum = new ItemEXOre("molybdenumDust");
            createRegistry(blockOreMolybdenum,itemBlockOreMolybdenum,"molybdenumOre");
            createRegistry(blockMolybdenum,itemBlockMolybdenum,"molybdenumBlock");
            createRegistry(itemIngotMolybdenum,"molybdenumIngot");
            createRegistry(itemDustMolybdenum,"molybdenumDust");
            ForgeRegistries.BLOCKS.register(blockOreMolybdenum);
            ForgeRegistries.ITEMS.register(itemBlockOreMolybdenum);
            ForgeRegistries.BLOCKS.register(blockMolybdenum);
            ForgeRegistries.ITEMS.register(itemBlockMolybdenum);
            ForgeRegistries.ITEMS.register(itemIngotMolybdenum);
            ForgeRegistries.ITEMS.register(itemDustMolybdenum);
            initOreDict(blockOreMolybdenum,"oreMolybdenum");
            initOreDict(blockMolybdenum,"blockMolybdenum");
            initOreDict(itemIngotMolybdenum,"ingotMolybdenum");
            initOreDict(itemDustMolybdenum,"dustMolybdenum");
        }
        if(registerAluminum)
        {
            blockOreAluminum = new BlockEXOre(Material.ROCK,3.0f,5.0f,"aluminumOre");
            itemBlockOreAluminum = new ItemBlock(blockOreAluminum);
            blockAluminum = new BlockEXOre(Material.IRON,3.0f,5.0f,"aluminumBlock");
            itemBlockAluminum = new ItemBlock(blockAluminum);
            itemIngotAluminum = new ItemEXOre("aluminumIngot");
            itemDustAluminum = new ItemEXOre("aluminumDust");
            createRegistry(blockOreAluminum,itemBlockOreAluminum,"aluminumOre");
            createRegistry(blockAluminum,itemBlockAluminum,"aluminumBlock");
            createRegistry(itemIngotAluminum,"aluminumIngot");
            createRegistry(itemDustAluminum,"aluminumDust");
            ForgeRegistries.BLOCKS.register(blockOreAluminum);
            ForgeRegistries.ITEMS.register(itemBlockOreAluminum);
            ForgeRegistries.BLOCKS.register(blockAluminum);
            ForgeRegistries.ITEMS.register(itemBlockAluminum);
            ForgeRegistries.ITEMS.register(itemIngotAluminum);
            ForgeRegistries.ITEMS.register(itemDustAluminum);
            initOreDict(blockOreAluminum,"oreAluminum");
            initOreDict(blockAluminum,"blockAluminum");
            initOreDict(itemIngotAluminum,"ingotAluminum");
            initOreDict(itemDustAluminum,"dustAluminum");
        }
        if(registerSilver)
        {
            blockOreSilver = new BlockEXOre(Material.ROCK,3.0f,5.0f,"silverOre");
            itemBlockOreSilver = new ItemBlock(blockOreSilver);
            blockSilver = new BlockEXOre(Material.IRON,3.0f,5.0f,"silverBlock");
            itemBlockSilver = new ItemBlock(blockSilver);
            itemIngotSilver = new ItemEXOre("silverIngot");
            itemDustSilver = new ItemEXOre("silverDust");
            createRegistry(blockOreSilver,itemBlockOreSilver,"silverOre");
            createRegistry(blockSilver,itemBlockSilver,"silverBlock");
            createRegistry(itemIngotSilver,"silverIngot");
            createRegistry(itemDustSilver,"silverDust");
            ForgeRegistries.BLOCKS.register(blockOreSilver);
            ForgeRegistries.ITEMS.register(itemBlockOreSilver);
            ForgeRegistries.BLOCKS.register(blockSilver);
            ForgeRegistries.ITEMS.register(itemBlockSilver);
            ForgeRegistries.ITEMS.register(itemIngotSilver);
            ForgeRegistries.ITEMS.register(itemDustSilver);
            initOreDict(blockOreSilver,"oreSilver");
            initOreDict(blockSilver,"blockSilver");
            initOreDict(itemIngotSilver,"ingotSilver");
            initOreDict(itemDustSilver,"dustSilver");
        }
        if(registerLead)
        {
            blockOreLead = new BlockEXOre(Material.ROCK,3.0f,5.0f,"leadOre");
            itemBlockOreLead = new ItemBlock(blockOreLead);
            blockLead = new BlockEXOre(Material.IRON,3.0f,5.0f,"leadBlock");
            itemBlockLead = new ItemBlock(blockLead);
            itemIngotLead = new ItemEXOre("leadIngot");
            itemDustLead = new ItemEXOre("leadDust");
            createRegistry(blockOreLead,itemBlockOreLead,"leadOre");
            createRegistry(blockLead,itemBlockLead,"leadBlock");
            createRegistry(itemIngotLead,"leadIngot");
            createRegistry(itemDustLead,"leadDust");
            ForgeRegistries.BLOCKS.register(blockOreLead);
            ForgeRegistries.ITEMS.register(itemBlockOreLead);
            ForgeRegistries.BLOCKS.register(blockLead);
            ForgeRegistries.ITEMS.register(itemBlockLead);
            ForgeRegistries.ITEMS.register(itemIngotLead);
            ForgeRegistries.ITEMS.register(itemDustLead);
            initOreDict(blockOreLead,"oreLead");
            initOreDict(blockLead,"blockLead");
            initOreDict(itemIngotLead,"ingotLead");
            initOreDict(itemDustLead,"dustLead");
        }
        if(registerPlatinum)
        {
            blockOrePlatinum = new BlockEXOre(Material.ROCK,3.0f,5.0f,"platinumOre");
            itemBlockOrePlatinum = new ItemBlock(blockOrePlatinum);
            blockPlatinum = new BlockEXOre(Material.IRON,3.0f,5.0f,"platinumBlock");
            itemBlockPlatinum = new ItemBlock(blockPlatinum);
            itemIngotPlatinum = new ItemEXOre("platinumIngot");
            itemDustPlatinum = new ItemEXOre("platinumDust");
            createRegistry(blockOrePlatinum,itemBlockOrePlatinum,"platinumOre");
            createRegistry(blockPlatinum,itemBlockPlatinum,"platinumBlock");
            createRegistry(itemIngotPlatinum,"platinumIngot");
            createRegistry(itemDustPlatinum,"platinumDust");
            ForgeRegistries.BLOCKS.register(blockOrePlatinum);
            ForgeRegistries.ITEMS.register(itemBlockOrePlatinum);
            ForgeRegistries.BLOCKS.register(blockPlatinum);
            ForgeRegistries.ITEMS.register(itemBlockPlatinum);
            ForgeRegistries.ITEMS.register(itemIngotPlatinum);
            ForgeRegistries.ITEMS.register(itemDustPlatinum);
            initOreDict(blockOrePlatinum,"orePlatinum");
            initOreDict(blockPlatinum,"blockPlatinum");
            initOreDict(itemIngotPlatinum,"ingotPlatinum");
            initOreDict(itemDustPlatinum,"dustPlatinum");
        }
        if(registerTungsten)
        {
            blockOreTungsten = new BlockEXOre(Material.ROCK,3.0f,5.0f,"tungstenOre");
            itemBlockOreTungsten = new ItemBlock(blockOreTungsten);
            blockTungsten = new BlockEXOre(Material.IRON,3.0f,5.0f,"tungstenBlock");
            itemBlockTungsten = new ItemBlock(blockTungsten);
            itemIngotTungsten = new ItemEXOre("tungstenIngot");
            itemDustTungsten = new ItemEXOre("tungstenDust");
            createRegistry(blockOreTungsten,itemBlockOreTungsten,"tungstenOre");
            createRegistry(blockTungsten,itemBlockTungsten,"tungstenBlock");
            createRegistry(itemIngotTungsten,"tungstenIngot");
            createRegistry(itemDustTungsten,"tungstenDust");
            ForgeRegistries.BLOCKS.register(blockOreTungsten);
            ForgeRegistries.ITEMS.register(itemBlockOreTungsten);
            ForgeRegistries.BLOCKS.register(blockTungsten);
            ForgeRegistries.ITEMS.register(itemBlockTungsten);
            ForgeRegistries.ITEMS.register(itemIngotTungsten);
            ForgeRegistries.ITEMS.register(itemDustTungsten);
            initOreDict(blockOreTungsten,"oreTungsten");
            initOreDict(blockTungsten,"blockTungsten");
            initOreDict(itemIngotTungsten,"ingotTungsten");
            initOreDict(itemDustTungsten,"dustTungsten");
        }
        if(registerVanadium)
        {
            blockOreVanadium = new BlockEXOre(Material.ROCK,3.0f,5.0f,"vanadiumOre");
            itemBlockOreVanadium = new ItemBlock(blockOreVanadium);
            blockVanadium = new BlockEXOre(Material.IRON,3.0f,5.0f,"vanadiumBlock");
            itemBlockVanadium = new ItemBlock(blockVanadium);
            itemIngotVanadium = new ItemEXOre("vanadiumIngot");
            itemDustVanadium = new ItemEXOre("vanadiumDust");
            createRegistry(blockOreVanadium,itemBlockOreVanadium,"vanadiumOre");
            createRegistry(blockVanadium,itemBlockVanadium,"vanadiumBlock");
            createRegistry(itemIngotVanadium,"vanadiumIngot");
            createRegistry(itemDustVanadium,"vanadiumDust");
            ForgeRegistries.BLOCKS.register(blockOreVanadium);
            ForgeRegistries.ITEMS.register(itemBlockOreVanadium);
            ForgeRegistries.BLOCKS.register(blockVanadium);
            ForgeRegistries.ITEMS.register(itemBlockVanadium);
            ForgeRegistries.ITEMS.register(itemIngotVanadium);
            ForgeRegistries.ITEMS.register(itemDustVanadium);
            initOreDict(blockOreVanadium,"oreVanadium");
            initOreDict(blockVanadium,"blockVanadium");
            initOreDict(itemIngotVanadium,"ingotVanadium");
            initOreDict(itemDustVanadium,"dustVanadium");
        }
        if(registerZinc)
        {
            blockOreZinc = new BlockEXOre(Material.ROCK,3.0f,5.0f,"zincOre");
            itemBlockOreZinc = new ItemBlock(blockOreZinc);
            blockZinc = new BlockEXOre(Material.IRON,3.0f,5.0f,"zincBlock");
            itemBlockZinc = new ItemBlock(blockZinc);
            itemIngotZinc = new ItemEXOre("zincIngot");
            itemDustZinc = new ItemEXOre("zincDust");
            createRegistry(blockOreZinc,itemBlockOreZinc,"zincOre");
            createRegistry(blockZinc,itemBlockZinc,"zincBlock");
            createRegistry(itemIngotZinc,"zincIngot");
            createRegistry(itemDustZinc,"zincDust");
            ForgeRegistries.BLOCKS.register(blockOreZinc);
            ForgeRegistries.ITEMS.register(itemBlockOreZinc);
            ForgeRegistries.BLOCKS.register(blockZinc);
            ForgeRegistries.ITEMS.register(itemBlockZinc);
            ForgeRegistries.ITEMS.register(itemIngotZinc);
            ForgeRegistries.ITEMS.register(itemDustZinc);
            initOreDict(blockOreZinc,"oreZinc");
            initOreDict(blockZinc,"blockZinc");
            initOreDict(itemIngotZinc,"ingotZinc");
            initOreDict(itemDustZinc,"dustZinc");
        }
        if(registerZirconium)
        {
            blockOreZirconium = new BlockEXOre(Material.ROCK,3.0f,5.0f,"zirconiumOre");
            itemBlockOreZirconium = new ItemBlock(blockOreZirconium);
            blockZirconium = new BlockEXOre(Material.IRON,3.0f,5.0f,"zirconiumBlock");
            itemBlockZirconium = new ItemBlock(blockZirconium);
            itemIngotZirconium = new ItemEXOre("zirconiumIngot");
            itemDustZirconium = new ItemEXOre("zirconiumDust");
            createRegistry(blockOreZirconium,itemBlockOreZirconium,"zirconiumOre");
            createRegistry(blockZirconium,itemBlockZirconium,"zirconiumBlock");
            createRegistry(itemIngotZirconium,"zirconiumIngot");
            createRegistry(itemDustZirconium,"zirconiumDust");
            ForgeRegistries.BLOCKS.register(blockOreZirconium);
            ForgeRegistries.ITEMS.register(itemBlockOreZirconium);
            ForgeRegistries.BLOCKS.register(blockZirconium);
            ForgeRegistries.ITEMS.register(itemBlockZirconium);
            ForgeRegistries.ITEMS.register(itemIngotZirconium);
            ForgeRegistries.ITEMS.register(itemDustZirconium);
            initOreDict(blockOreZirconium,"oreZirconium");
            initOreDict(blockZirconium,"blockZirconium");
            initOreDict(itemIngotZirconium,"ingotZirconium");
            initOreDict(itemDustZirconium,"dustZirconium");
        }
        if(registerNiobium)
        {
            blockOreNiobium = new BlockEXOre(Material.ROCK,3.0f,5.0f,"niobiumOre");
            itemBlockOreNiobium = new ItemBlock(blockOreNiobium);
            blockNiobium = new BlockEXOre(Material.IRON,3.0f,5.0f,"niobiumBlock");
            itemBlockNiobium = new ItemBlock(blockNiobium);
            itemIngotNiobium = new ItemEXOre("niobiumIngot");
            itemDustNiobium = new ItemEXOre("niobiumDust");
            createRegistry(blockOreNiobium,itemBlockOreNiobium,"niobiumOre");
            createRegistry(blockNiobium,itemBlockNiobium,"niobiumBlock");
            createRegistry(itemIngotNiobium,"niobiumIngot");
            createRegistry(itemDustNiobium,"niobiumDust");
            ForgeRegistries.BLOCKS.register(blockOreNiobium);
            ForgeRegistries.ITEMS.register(itemBlockOreNiobium);
            ForgeRegistries.BLOCKS.register(blockNiobium);
            ForgeRegistries.ITEMS.register(itemBlockNiobium);
            ForgeRegistries.ITEMS.register(itemIngotNiobium);
            ForgeRegistries.ITEMS.register(itemDustNiobium);
            initOreDict(blockOreNiobium,"oreNiobium");
            initOreDict(blockNiobium,"blockNiobium");
            initOreDict(itemIngotNiobium,"ingotNiobium");
            initOreDict(itemDustNiobium,"dustNiobium");
        }
        if(registerTechnetium)
        {
            blockOreTechnetium = new BlockEXOre(Material.ROCK,3.0f,5.0f,"technetiumOre");
            itemBlockOreTechnetium = new ItemBlock(blockOreTechnetium);
            blockTechnetium = new BlockEXOre(Material.IRON,3.0f,5.0f,"technetiumBlock");
            itemBlockTechnetium = new ItemBlock(blockTechnetium);
            itemIngotTechnetium = new ItemEXOre("technetiumIngot");
            itemDustTechnetium = new ItemEXOre("technetiumDust");
            createRegistry(blockOreTechnetium,itemBlockOreTechnetium,"technetiumOre");
            createRegistry(blockTechnetium,itemBlockTechnetium,"technetiumBlock");
            createRegistry(itemIngotTechnetium,"technetiumIngot");
            createRegistry(itemDustTechnetium,"technetiumDust");
            ForgeRegistries.BLOCKS.register(blockOreTechnetium);
            ForgeRegistries.ITEMS.register(itemBlockOreTechnetium);
            ForgeRegistries.BLOCKS.register(blockTechnetium);
            ForgeRegistries.ITEMS.register(itemBlockTechnetium);
            ForgeRegistries.ITEMS.register(itemIngotTechnetium);
            ForgeRegistries.ITEMS.register(itemDustTechnetium);
            initOreDict(blockOreTechnetium,"oreTechnetium");
            initOreDict(blockTechnetium,"blockTechnetium");
            initOreDict(itemIngotTechnetium,"ingotTechnetium");
            initOreDict(itemDustTechnetium,"dustTechnetium");
        }
        if(registerRuthenium)
        {
            blockOreRuthenium = new BlockEXOre(Material.ROCK,3.0f,5.0f,"rutheniumOre");
            itemBlockOreRuthenium = new ItemBlock(blockOreRuthenium);
            blockRuthenium = new BlockEXOre(Material.IRON,3.0f,5.0f,"rutheniumBlock");
            itemBlockRuthenium = new ItemBlock(blockRuthenium);
            itemIngotRuthenium = new ItemEXOre("rutheniumIngot");
            itemDustRuthenium = new ItemEXOre("rutheniumDust");
            createRegistry(blockOreRuthenium,itemBlockOreRuthenium,"rutheniumOre");
            createRegistry(blockRuthenium,itemBlockRuthenium,"rutheniumBlock");
            createRegistry(itemIngotRuthenium,"rutheniumIngot");
            createRegistry(itemDustRuthenium,"rutheniumDust");
            ForgeRegistries.BLOCKS.register(blockOreRuthenium);
            ForgeRegistries.ITEMS.register(itemBlockOreRuthenium);
            ForgeRegistries.BLOCKS.register(blockRuthenium);
            ForgeRegistries.ITEMS.register(itemBlockRuthenium);
            ForgeRegistries.ITEMS.register(itemIngotRuthenium);
            ForgeRegistries.ITEMS.register(itemDustRuthenium);
            initOreDict(blockOreRuthenium,"oreRuthenium");
            initOreDict(blockRuthenium,"blockRuthenium");
            initOreDict(itemIngotRuthenium,"ingotRuthenium");
            initOreDict(itemDustRuthenium,"dustRuthenium");
        }
        if(registerRhodium)
        {
            blockOreRhodium = new BlockEXOre(Material.ROCK,3.0f,5.0f,"rhodiumOre");
            itemBlockOreRhodium = new ItemBlock(blockOreRhodium);
            blockRhodium = new BlockEXOre(Material.IRON,3.0f,5.0f,"rhodiumBlock");
            itemBlockRhodium = new ItemBlock(blockRhodium);
            itemIngotRhodium = new ItemEXOre("rhodiumIngot");
            itemDustRhodium = new ItemEXOre("rhodiumDust");
            createRegistry(blockOreRhodium,itemBlockOreRhodium,"rhodiumOre");
            createRegistry(blockRhodium,itemBlockRhodium,"rhodiumBlock");
            createRegistry(itemIngotRhodium,"rhodiumIngot");
            createRegistry(itemDustRhodium,"rhodiumDust");
            ForgeRegistries.BLOCKS.register(blockOreRhodium);
            ForgeRegistries.ITEMS.register(itemBlockOreRhodium);
            ForgeRegistries.BLOCKS.register(blockRhodium);
            ForgeRegistries.ITEMS.register(itemBlockRhodium);
            ForgeRegistries.ITEMS.register(itemIngotRhodium);
            ForgeRegistries.ITEMS.register(itemDustRhodium);
            initOreDict(blockOreRhodium,"oreRhodium");
            initOreDict(blockRhodium,"blockRhodium");
            initOreDict(itemIngotRhodium,"ingotRhodium");
            initOreDict(itemDustRhodium,"dustRhodium");
        }
        if(registerPalladium)
        {
            blockOrePalladium = new BlockEXOre(Material.ROCK,3.0f,5.0f,"palladiumOre");
            itemBlockOrePalladium = new ItemBlock(blockOrePalladium);
            blockPalladium = new BlockEXOre(Material.IRON,3.0f,5.0f,"palladiumBlock");
            itemBlockPalladium = new ItemBlock(blockPalladium);
            itemIngotPalladium = new ItemEXOre("palladiumIngot");
            itemDustPalladium = new ItemEXOre("palladiumDust");
            createRegistry(blockOrePalladium,itemBlockOrePalladium,"palladiumOre");
            createRegistry(blockPalladium,itemBlockPalladium,"palladiumBlock");
            createRegistry(itemIngotPalladium,"palladiumIngot");
            createRegistry(itemDustPalladium,"palladiumDust");
            ForgeRegistries.BLOCKS.register(blockOrePalladium);
            ForgeRegistries.ITEMS.register(itemBlockOrePalladium);
            ForgeRegistries.BLOCKS.register(blockPalladium);
            ForgeRegistries.ITEMS.register(itemBlockPalladium);
            ForgeRegistries.ITEMS.register(itemIngotPalladium);
            ForgeRegistries.ITEMS.register(itemDustPalladium);
            initOreDict(blockOrePalladium,"orePalladium");
            initOreDict(blockPalladium,"blockPalladium");
            initOreDict(itemIngotPalladium,"ingotPalladium");
            initOreDict(itemDustPalladium,"dustPalladium");
        }
        if(registerCadmium)
        {
            blockOreCadmium = new BlockEXOre(Material.ROCK,3.0f,5.0f,"cadmiumOre");
            itemBlockOreCadmium = new ItemBlock(blockOreCadmium);
            blockCadmium = new BlockEXOre(Material.IRON,3.0f,5.0f,"cadmiumBlock");
            itemBlockCadmium = new ItemBlock(blockCadmium);
            itemIngotCadmium = new ItemEXOre("cadmiumIngot");
            itemDustCadmium = new ItemEXOre("cadmiumDust");
            createRegistry(blockOreCadmium,itemBlockOreCadmium,"cadmiumOre");
            createRegistry(blockCadmium,itemBlockCadmium,"cadmiumBlock");
            createRegistry(itemIngotCadmium,"cadmiumIngot");
            createRegistry(itemDustCadmium,"cadmiumDust");
            ForgeRegistries.BLOCKS.register(blockOreCadmium);
            ForgeRegistries.ITEMS.register(itemBlockOreCadmium);
            ForgeRegistries.BLOCKS.register(blockCadmium);
            ForgeRegistries.ITEMS.register(itemBlockCadmium);
            ForgeRegistries.ITEMS.register(itemIngotCadmium);
            ForgeRegistries.ITEMS.register(itemDustCadmium);
            initOreDict(blockOreCadmium,"oreCadmium");
            initOreDict(blockCadmium,"blockCadmium");
            initOreDict(itemIngotCadmium,"ingotCadmium");
            initOreDict(itemDustCadmium,"dustCadmium");
        }
        if(registerNeodymium)
        {
            blockOreNeodymium = new BlockEXOre(Material.ROCK,3.0f,5.0f,"neodymiumOre");
            itemBlockOreNeodymium = new ItemBlock(blockOreNeodymium);
            blockNeodymium = new BlockEXOre(Material.IRON,3.0f,5.0f,"neodymiumBlock");
            itemBlockNeodymium = new ItemBlock(blockNeodymium);
            itemIngotNeodymium = new ItemEXOre("neodymiumIngot");
            itemDustNeodymium = new ItemEXOre("neodymiumDust");
            createRegistry(blockOreNeodymium,itemBlockOreNeodymium,"neodymiumOre");
            createRegistry(blockNeodymium,itemBlockNeodymium,"neodymiumBlock");
            createRegistry(itemIngotNeodymium,"neodymiumIngot");
            createRegistry(itemDustNeodymium,"neodymiumDust");
            ForgeRegistries.BLOCKS.register(blockOreNeodymium);
            ForgeRegistries.ITEMS.register(itemBlockOreNeodymium);
            ForgeRegistries.BLOCKS.register(blockNeodymium);
            ForgeRegistries.ITEMS.register(itemBlockNeodymium);
            ForgeRegistries.ITEMS.register(itemIngotNeodymium);
            ForgeRegistries.ITEMS.register(itemDustNeodymium);
            initOreDict(blockOreNeodymium,"oreNeodymium");
            initOreDict(blockNeodymium,"blockNeodymium");
            initOreDict(itemIngotNeodymium,"ingotNeodymium");
            initOreDict(itemDustNeodymium,"dustNeodymium");
        }
        if(registerBismuth)
        {
            blockOreBismuth = new BlockEXOre(Material.ROCK,3.0f,5.0f,"bismuthOre");
            itemBlockOreBismuth = new ItemBlock(blockOreBismuth);
            blockBismuth = new BlockEXOre(Material.IRON,3.0f,5.0f,"bismuthBlock");
            itemBlockBismuth = new ItemBlock(blockBismuth);
            itemIngotBismuth = new ItemEXOre("bismuthIngot");
            itemDustBismuth = new ItemEXOre("bismuthDust");
            createRegistry(blockOreBismuth,itemBlockOreBismuth,"bismuthOre");
            createRegistry(blockBismuth,itemBlockBismuth,"bismuthBlock");
            createRegistry(itemIngotBismuth,"bismuthIngot");
            createRegistry(itemDustBismuth,"bismuthDust");
            ForgeRegistries.BLOCKS.register(blockOreBismuth);
            ForgeRegistries.ITEMS.register(itemBlockOreBismuth);
            ForgeRegistries.BLOCKS.register(blockBismuth);
            ForgeRegistries.ITEMS.register(itemBlockBismuth);
            ForgeRegistries.ITEMS.register(itemIngotBismuth);
            ForgeRegistries.ITEMS.register(itemDustBismuth);
            initOreDict(blockOreBismuth,"oreBismuth");
            initOreDict(blockBismuth,"blockBismuth");
            initOreDict(itemIngotBismuth,"ingotBismuth");
            initOreDict(itemDustBismuth,"dustBismuth");
        }
        if(registerGallium)
        {
            blockOreGallium = new BlockEXOre(Material.ROCK,3.0f,5.0f,"galliumOre");
            itemBlockOreGallium = new ItemBlock(blockOreGallium);
            blockGallium = new BlockEXOre(Material.IRON,3.0f,5.0f,"galliumBlock");
            itemBlockGallium = new ItemBlock(blockGallium);
            itemIngotGallium = new ItemEXOre("galliumIngot");
            itemDustGallium = new ItemEXOre("galliumDust");
            createRegistry(blockOreGallium,itemBlockOreGallium,"galliumOre");
            createRegistry(blockGallium,itemBlockGallium,"galliumBlock");
            createRegistry(itemIngotGallium,"galliumIngot");
            createRegistry(itemDustGallium,"galliumDust");
            ForgeRegistries.BLOCKS.register(blockOreGallium);
            ForgeRegistries.ITEMS.register(itemBlockOreGallium);
            ForgeRegistries.BLOCKS.register(blockGallium);
            ForgeRegistries.ITEMS.register(itemBlockGallium);
            ForgeRegistries.ITEMS.register(itemIngotGallium);
            ForgeRegistries.ITEMS.register(itemDustGallium);
            initOreDict(blockOreGallium,"oreGallium");
            initOreDict(blockGallium,"blockGallium");
            initOreDict(itemIngotGallium,"ingotGallium");
            initOreDict(itemDustGallium,"dustGallium");
        }
        if(registerIndium)
        {
            blockOreIndium = new BlockEXOre(Material.ROCK,3.0f,5.0f,"indiumOre");
            itemBlockOreIndium = new ItemBlock(blockOreIndium);
            blockIndium = new BlockEXOre(Material.IRON,3.0f,5.0f,"indiumBlock");
            itemBlockIndium = new ItemBlock(blockIndium);
            itemIngotIndium = new ItemEXOre("indiumIngot");
            itemDustIndium = new ItemEXOre("indiumDust");
            createRegistry(blockOreIndium,itemBlockOreIndium,"indiumOre");
            createRegistry(blockIndium,itemBlockIndium,"indiumBlock");
            createRegistry(itemIngotIndium,"indiumIngot");
            createRegistry(itemDustIndium,"indiumDust");
            ForgeRegistries.BLOCKS.register(blockOreIndium);
            ForgeRegistries.ITEMS.register(itemBlockOreIndium);
            ForgeRegistries.BLOCKS.register(blockIndium);
            ForgeRegistries.ITEMS.register(itemBlockIndium);
            ForgeRegistries.ITEMS.register(itemIngotIndium);
            ForgeRegistries.ITEMS.register(itemDustIndium);
            initOreDict(blockOreIndium,"oreIndium");
            initOreDict(blockIndium,"blockIndium");
            initOreDict(itemIngotIndium,"ingotIndium");
            initOreDict(itemDustIndium,"dustIndium");
        }
        if(registerThallium)
        {
            blockOreThallium = new BlockEXOre(Material.ROCK,3.0f,5.0f,"thalliumOre");
            itemBlockOreThallium = new ItemBlock(blockOreThallium);
            blockThallium = new BlockEXOre(Material.IRON,3.0f,5.0f,"thalliumBlock");
            itemBlockThallium = new ItemBlock(blockThallium);
            itemIngotThallium = new ItemEXOre("thalliumIngot");
            itemDustThallium = new ItemEXOre("thalliumDust");
            createRegistry(blockOreThallium,itemBlockOreThallium,"thalliumOre");
            createRegistry(blockThallium,itemBlockThallium,"thalliumBlock");
            createRegistry(itemIngotThallium,"thalliumIngot");
            createRegistry(itemDustThallium,"thalliumDust");
            ForgeRegistries.BLOCKS.register(blockOreThallium);
            ForgeRegistries.ITEMS.register(itemBlockOreThallium);
            ForgeRegistries.BLOCKS.register(blockThallium);
            ForgeRegistries.ITEMS.register(itemBlockThallium);
            ForgeRegistries.ITEMS.register(itemIngotThallium);
            ForgeRegistries.ITEMS.register(itemDustThallium);
            initOreDict(blockOreThallium,"oreThallium");
            initOreDict(blockThallium,"blockThallium");
            initOreDict(itemIngotThallium,"ingotThallium");
            initOreDict(itemDustThallium,"dustThallium");
        }
        if(registerTitanium)
        {
            blockOreTitanium = new BlockEXOre(Material.ROCK,3.0f,5.0f,"titaniumOre");
            itemBlockOreTitanium = new ItemBlock(blockOreTitanium);
            blockTitanium = new BlockEXOre(Material.IRON,3.0f,5.0f,"titaniumBlock");
            itemBlockTitanium = new ItemBlock(blockTitanium);
            itemIngotTitanium = new ItemEXOre("titaniumIngot");
            itemDustTitanium = new ItemEXOre("titaniumDust");
            createRegistry(blockOreTitanium,itemBlockOreTitanium,"titaniumOre");
            createRegistry(blockTitanium,itemBlockTitanium,"titaniumBlock");
            createRegistry(itemIngotTitanium,"titaniumIngot");
            createRegistry(itemDustTitanium,"titaniumDust");
            ForgeRegistries.BLOCKS.register(blockOreTitanium);
            ForgeRegistries.ITEMS.register(itemBlockOreTitanium);
            ForgeRegistries.BLOCKS.register(blockTitanium);
            ForgeRegistries.ITEMS.register(itemBlockTitanium);
            ForgeRegistries.ITEMS.register(itemIngotTitanium);
            ForgeRegistries.ITEMS.register(itemDustTitanium);
            initOreDict(blockOreTitanium,"oreTitanium");
            initOreDict(blockTitanium,"blockTitanium");
            initOreDict(itemIngotTitanium,"ingotTitanium");
            initOreDict(itemDustTitanium,"dustTitanium");
        }
        if(registerNickel)
        {
            blockOreNickel = new BlockEXOre(Material.ROCK,3.0f,5.0f,"nickelOre");
            itemBlockOreNickel = new ItemBlock(blockOreNickel);
            blockNickel = new BlockEXOre(Material.IRON,3.0f,5.0f,"nickelBlock");
            itemBlockNickel = new ItemBlock(blockNickel);
            itemIngotNickel = new ItemEXOre("nickelIngot");
            itemDustNickel = new ItemEXOre("nickelDust");
            createRegistry(blockOreNickel,itemBlockOreNickel,"nickelOre");
            createRegistry(blockNickel,itemBlockNickel,"nickelBlock");
            createRegistry(itemIngotNickel,"nickelIngot");
            createRegistry(itemDustNickel,"nickelDust");
            ForgeRegistries.BLOCKS.register(blockOreNickel);
            ForgeRegistries.ITEMS.register(itemBlockOreNickel);
            ForgeRegistries.BLOCKS.register(blockNickel);
            ForgeRegistries.ITEMS.register(itemBlockNickel);
            ForgeRegistries.ITEMS.register(itemIngotNickel);
            ForgeRegistries.ITEMS.register(itemDustNickel);
            initOreDict(blockOreNickel,"oreNickel");
            initOreDict(blockNickel,"blockNickel");
            initOreDict(itemIngotNickel,"ingotNickel");
            initOreDict(itemDustNickel,"dustNickel");
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
    public static void createRegistry(Block block,ItemBlock itemBlock, String name)
    {
        block.setRegistryName("extraores",name);
        createRegitstry(itemBlock,block.getRegistryName().toString());
    }
    public static void createRegistry(Item item, String name)
    {
        item.setRegistryName("extraores",name);
    }
    public static void createRegitstry(ItemBlock itemBlock, String name)
    {
        itemBlock.setRegistryName(name);
    }
}

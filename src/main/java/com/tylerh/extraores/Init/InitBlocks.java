package com.tylerh.extraores.Init;

import com.tylerh.extraores.Blocks.BlockEXOre;
import com.tylerh.extraores.Items.ItemBlockExOre;
import com.tylerh.extraores.Items.ItemEXOre;
import com.tylerh.extraores.Util.CreativeTabExtraOres;
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
    public static boolean registerAdamantine;
    public static boolean registerAldourite;
    public static boolean registerAstralSilver;
    public static boolean registerAtlarus;
    public static boolean registerCarmot;
    public static boolean registerCeruclase;
    public static boolean registerDeepIron;
    public static boolean registerIgnatius;
    public static boolean registerInfuscolium;
    public static boolean registerKalendrite;
    public static boolean registerLemurite;
    public static boolean registerMidasium;
    public static boolean registerMithril;
    public static boolean registerOrichalcum;
    public static boolean registerOureclase;
    public static boolean registerPrometheum;
    public static boolean registerRubracium;
    public static boolean registerSanguinite;
    public static boolean registerShadowIron;
    public static boolean registerVulcanite;
    public static boolean registerVyroxeres;

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
    public static Block blockOreAdamantine;
    public static Block blockOreAldourite;
    public static Block blockOreAstralSilver;
    public static Block blockOreAtlarus;
    public static Block blockOreCarmot;
    public static Block blockOreCeruclase;
    public static Block blockOreDeepIron;
    public static Block blockOreIgnatius;
    public static Block blockOreInfuscolium;
    public static Block blockOreKalendrite;
    public static Block blockOreLemurite;
    public static Block blockOreMidasium;
    public static Block blockOreMithril;
    public static Block blockOreOrichalcum;
    public static Block blockOreOureclase;
    public static Block blockOrePrometheum;
    public static Block blockOreRubracium;
    public static Block blockOreSanguinite;
    public static Block blockOreShadowIron;
    public static Block blockOreVulcanite;
    public static Block blockOreVyroxeres;

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
    public static Item itemIngotAdamantine;
    public static Item itemIngotAldourite;
    public static Item itemIngotAstralSilver;
    public static Item itemIngotAtlarus;
    public static Item itemIngotCarmot;
    public static Item itemIngotCeruclase;
    public static Item itemIngotDeepIron;
    public static Item itemIngotIgnatius;
    public static Item itemIngotInfuscolium;
    public static Item itemIngotKalendrite;
    public static Item itemIngotLemurite;
    public static Item itemIngotMidasium;
    public static Item itemIngotMithril;
    public static Item itemIngotOrichalcum;
    public static Item itemIngotOureclase;
    public static Item itemIngotPrometheum;
    public static Item itemIngotRubracium;
    public static Item itemIngotSanguinite;
    public static Item itemIngotShadowIron;
    public static Item itemIngotVulcanite;
    public static Item itemIngotVyroxeres;
    
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
    public static Block blockAdamantine;
    public static Block blockAldourite;
    public static Block blockAstralSilver;
    public static Block blockAtlarus;
    public static Block blockCarmot;
    public static Block blockCeruclase;
    public static Block blockDeepIron;
    public static Block blockIgnatius;
    public static Block blockInfuscolium;
    public static Block blockKalendrite;
    public static Block blockLemurite;
    public static Block blockMidasium;
    public static Block blockMithril;
    public static Block blockOrichalcum;
    public static Block blockOureclase;
    public static Block blockPrometheum;
    public static Block blockRubracium;
    public static Block blockSanguinite;
    public static Block blockShadowIron;
    public static Block blockVulcanite;
    public static Block blockVyroxeres;

    //ItemBlocks Ores
    private static ItemBlock itemBlockOreCopper;
    private static ItemBlock itemBlockOreTin;
    private static ItemBlock itemBlockOreChromium;
    private static ItemBlock itemBlockOreCobalt;
    private static ItemBlock itemBlockOreUnobtainium;
    private static ItemBlock itemBlockOreManganese;
    private static ItemBlock itemBlockOreMolybdenum;
    private static ItemBlock itemBlockOreAluminum;
    private static ItemBlock itemBlockOreSilver;
    private static ItemBlock itemBlockOreLead;
    private static ItemBlock itemBlockOrePlatinum;
    private static ItemBlock itemBlockOreTungsten;
    private static ItemBlock itemBlockOreVanadium;
    private static ItemBlock itemBlockOreZinc;
    private static ItemBlock itemBlockOreZirconium;
    private static ItemBlock itemBlockOreNiobium;
    private static ItemBlock itemBlockOreTechnetium;
    private static ItemBlock itemBlockOreRuthenium;
    private static ItemBlock itemBlockOreRhodium;
    private static ItemBlock itemBlockOrePalladium;
    private static ItemBlock itemBlockOreCadmium;
    private static ItemBlock itemBlockOreNeodymium;
    private static ItemBlock itemBlockOreBismuth;
    private static ItemBlock itemBlockOreGallium;
    private static ItemBlock itemBlockOreIndium;
    private static ItemBlock itemBlockOreThallium;
    private static ItemBlock itemBlockOreTitanium;
    private static ItemBlock itemBlockOreNickel;
    private static ItemBlock itemBlockOreAdamantine;
    private static ItemBlock itemBlockOreAldourite;
    private static ItemBlock itemBlockOreAstralSilver;
    private static ItemBlock itemBlockOreAtlarus;
    private static ItemBlock itemBlockOreCarmot;
    private static ItemBlock itemBlockOreCeruclase;
    private static ItemBlock itemBlockOreDeepIron;
    private static ItemBlock itemBlockOreIgnatius;
    private static ItemBlock itemBlockOreInfuscolium;
    private static ItemBlock itemBlockOreKalendrite;
    private static ItemBlock itemBlockOreLemurite;
    private static ItemBlock itemBlockOreMidasium;
    private static ItemBlock itemBlockOreMithril;
    private static ItemBlock itemBlockOreOrichalcum;
    private static ItemBlock itemBlockOreOureclase;
    private static ItemBlock itemBlockOrePrometheum;
    private static ItemBlock itemBlockOreRubracium;
    private static ItemBlock itemBlockOreSanguinite;
    private static ItemBlock itemBlockOreShadowIron;
    private static ItemBlock itemBlockOreVulcanite;
    private static ItemBlock itemBlockOreVyroxeres;
    //ItemBlocks Blocks
    private static ItemBlock itemBlockCopper;
    private static ItemBlock itemBlockTin;
    private static ItemBlock itemBlockChromium;
    private static ItemBlock itemBlockCobalt;
    private static ItemBlock itemBlockUnobtainium;
    private static ItemBlock itemBlockManganese;
    private static ItemBlock itemBlockMolybdenum;
    private static ItemBlock itemBlockAluminum;
    private static ItemBlock itemBlockSilver;
    private static ItemBlock itemBlockLead;
    private static ItemBlock itemBlockPlatinum;
    private static ItemBlock itemBlockTungsten;
    private static ItemBlock itemBlockVanadium;
    private static ItemBlock itemBlockZinc;
    private static ItemBlock itemBlockZirconium;
    private static ItemBlock itemBlockNiobium;
    private static ItemBlock itemBlockTechnetium;
    private static ItemBlock itemBlockRuthenium;
    private static ItemBlock itemBlockRhodium;
    private static ItemBlock itemBlockPalladium;
    private static ItemBlock itemBlockCadmium;
    private static ItemBlock itemBlockNeodymium;
    private static ItemBlock itemBlockBismuth;
    private static ItemBlock itemBlockGallium;
    private static ItemBlock itemBlockIndium;
    private static ItemBlock itemBlockThallium;
    private static ItemBlock itemBlockTitanium;
    private static ItemBlock itemBlockNickel;
    private static ItemBlock itemBlockAdamantine;
    private static ItemBlock itemBlockAldourite;
    private static ItemBlock itemBlockAstralSilver;
    private static ItemBlock itemBlockAtlarus;
    private static ItemBlock itemBlockCarmot;
    private static ItemBlock itemBlockCeruclase;
    private static ItemBlock itemBlockDeepIron;
    private static ItemBlock itemBlockIgnatius;
    private static ItemBlock itemBlockInfuscolium;
    private static ItemBlock itemBlockKalendrite;
    private static ItemBlock itemBlockLemurite;
    private static ItemBlock itemBlockMidasium;
    private static ItemBlock itemBlockMithril;
    private static ItemBlock itemBlockOrichalcum;
    private static ItemBlock itemBlockOureclase;
    private static ItemBlock itemBlockPrometheum;
    private static ItemBlock itemBlockRubracium;
    private static ItemBlock itemBlockSanguinite;
    private static ItemBlock itemBlockShadowIron;
    private static ItemBlock itemBlockVulcanite;
    private static ItemBlock itemBlockVyroxeres;

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
    public static Item itemDustAdamantine;
    public static Item itemDustAldourite;
    public static Item itemDustAstralSilver;
    public static Item itemDustAtlarus;
    public static Item itemDustCarmot;
    public static Item itemDustCeruclase;
    public static Item itemDustDeepIron;
    public static Item itemDustIgnatius;
    public static Item itemDustInfuscolium;
    public static Item itemDustKalendrite;
    public static Item itemDustLemurite;
    public static Item itemDustMidasium;
    public static Item itemDustMithril;
    public static Item itemDustOrichalcum;
    public static Item itemDustOureclase;
    public static Item itemDustPrometheum;
    public static Item itemDustRubracium;
    public static Item itemDustSanguinite;
    public static Item itemDustShadowIron;
    public static Item itemDustVulcanite;
    public static Item itemDustVyroxeres;

    public static void init()
    {
        if(registerCopper)
        {
            blockOreCopper = new BlockEXOre(Material.ROCK,3.0f,5.0f,"copperOre");
            itemBlockOreCopper = new ItemBlockExOre(blockOreCopper);
            blockCopper = new BlockEXOre(Material.IRON,3.0f,5.0f,"copperBlock");
            itemBlockCopper = new ItemBlockExOre(blockCopper);
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
            itemBlockOreTin = new ItemBlockExOre(blockOreTin);
            blockTin = new BlockEXOre(Material.IRON,3.0f,5.0f,"tinBlock");
            itemBlockTin = new ItemBlockExOre(blockTin);
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
            itemBlockOreChromium = new ItemBlockExOre(blockOreChromium);
            blockChromium = new BlockEXOre(Material.IRON,3.0f,5.0f,"chromiumBlock");
            itemBlockChromium = new ItemBlockExOre(blockChromium);
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
            itemBlockOreCobalt = new ItemBlockExOre(blockOreCobalt);
            blockCobalt = new BlockEXOre(Material.IRON,3.0f,5.0f,"cobaltBlock");
            itemBlockCobalt = new ItemBlockExOre(blockCobalt);
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
            itemBlockOreUnobtainium = new ItemBlockExOre(blockOreUnobtainium);
            blockUnobtainium = new BlockEXOre(Material.IRON,3.0f,5.0f,"unobtainiumBlock");
            itemBlockUnobtainium = new ItemBlockExOre(blockUnobtainium);
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
            itemBlockOreManganese = new ItemBlockExOre(blockOreManganese);
            blockManganese = new BlockEXOre(Material.IRON,3.0f,5.0f,"manganeseBlock");
            itemBlockManganese = new ItemBlockExOre(blockManganese);
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
            itemBlockOreMolybdenum = new ItemBlockExOre(blockOreMolybdenum);
            blockMolybdenum = new BlockEXOre(Material.IRON,3.0f,5.0f,"molybdenumBlock");
            itemBlockMolybdenum = new ItemBlockExOre(blockMolybdenum);
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
            itemBlockOreAluminum = new ItemBlockExOre(blockOreAluminum);
            blockAluminum = new BlockEXOre(Material.IRON,3.0f,5.0f,"aluminumBlock");
            itemBlockAluminum = new ItemBlockExOre(blockAluminum);
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
            itemBlockOreSilver = new ItemBlockExOre(blockOreSilver);
            blockSilver = new BlockEXOre(Material.IRON,3.0f,5.0f,"silverBlock");
            itemBlockSilver = new ItemBlockExOre(blockSilver);
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
            itemBlockOreLead = new ItemBlockExOre(blockOreLead);
            blockLead = new BlockEXOre(Material.IRON,3.0f,5.0f,"leadBlock");
            itemBlockLead = new ItemBlockExOre(blockLead);
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
            itemBlockOrePlatinum = new ItemBlockExOre(blockOrePlatinum);
            blockPlatinum = new BlockEXOre(Material.IRON,3.0f,5.0f,"platinumBlock");
            itemBlockPlatinum = new ItemBlockExOre(blockPlatinum);
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
            itemBlockOreTungsten = new ItemBlockExOre(blockOreTungsten);
            blockTungsten = new BlockEXOre(Material.IRON,3.0f,5.0f,"tungstenBlock");
            itemBlockTungsten = new ItemBlockExOre(blockTungsten);
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
            itemBlockOreVanadium = new ItemBlockExOre(blockOreVanadium);
            blockVanadium = new BlockEXOre(Material.IRON,3.0f,5.0f,"vanadiumBlock");
            itemBlockVanadium = new ItemBlockExOre(blockVanadium);
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
            itemBlockOreZinc = new ItemBlockExOre(blockOreZinc);
            blockZinc = new BlockEXOre(Material.IRON,3.0f,5.0f,"zincBlock");
            itemBlockZinc = new ItemBlockExOre(blockZinc);
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
            itemBlockOreZirconium = new ItemBlockExOre(blockOreZirconium);
            blockZirconium = new BlockEXOre(Material.IRON,3.0f,5.0f,"zirconiumBlock");
            itemBlockZirconium = new ItemBlockExOre(blockZirconium);
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
            itemBlockOreNiobium = new ItemBlockExOre(blockOreNiobium);
            blockNiobium = new BlockEXOre(Material.IRON,3.0f,5.0f,"niobiumBlock");
            itemBlockNiobium = new ItemBlockExOre(blockNiobium);
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
            itemBlockOreTechnetium = new ItemBlockExOre(blockOreTechnetium);
            blockTechnetium = new BlockEXOre(Material.IRON,3.0f,5.0f,"technetiumBlock");
            itemBlockTechnetium = new ItemBlockExOre(blockTechnetium);
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
            itemBlockOreRuthenium = new ItemBlockExOre(blockOreRuthenium);
            blockRuthenium = new BlockEXOre(Material.IRON,3.0f,5.0f,"rutheniumBlock");
            itemBlockRuthenium = new ItemBlockExOre(blockRuthenium);
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
            itemBlockOreRhodium = new ItemBlockExOre(blockOreRhodium);
            blockRhodium = new BlockEXOre(Material.IRON,3.0f,5.0f,"rhodiumBlock");
            itemBlockRhodium = new ItemBlockExOre(blockRhodium);
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
            itemBlockOrePalladium = new ItemBlockExOre(blockOrePalladium);
            blockPalladium = new BlockEXOre(Material.IRON,3.0f,5.0f,"palladiumBlock");
            itemBlockPalladium = new ItemBlockExOre(blockPalladium);
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
            itemBlockOreCadmium = new ItemBlockExOre(blockOreCadmium);
            blockCadmium = new BlockEXOre(Material.IRON,3.0f,5.0f,"cadmiumBlock");
            itemBlockCadmium = new ItemBlockExOre(blockCadmium);
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
            itemBlockOreNeodymium = new ItemBlockExOre(blockOreNeodymium);
            blockNeodymium = new BlockEXOre(Material.IRON,3.0f,5.0f,"neodymiumBlock");
            itemBlockNeodymium = new ItemBlockExOre(blockNeodymium);
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
            itemBlockOreBismuth = new ItemBlockExOre(blockOreBismuth);
            blockBismuth = new BlockEXOre(Material.IRON,3.0f,5.0f,"bismuthBlock");
            itemBlockBismuth = new ItemBlockExOre(blockBismuth);
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
            itemBlockOreGallium = new ItemBlockExOre(blockOreGallium);
            blockGallium = new BlockEXOre(Material.IRON,3.0f,5.0f,"galliumBlock");
            itemBlockGallium = new ItemBlockExOre(blockGallium);
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
            itemBlockOreIndium = new ItemBlockExOre(blockOreIndium);
            blockIndium = new BlockEXOre(Material.IRON,3.0f,5.0f,"indiumBlock");
            itemBlockIndium = new ItemBlockExOre(blockIndium);
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
            itemBlockOreThallium = new ItemBlockExOre(blockOreThallium);
            blockThallium = new BlockEXOre(Material.IRON,3.0f,5.0f,"thalliumBlock");
            itemBlockThallium = new ItemBlockExOre(blockThallium);
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
            itemBlockOreTitanium = new ItemBlockExOre(blockOreTitanium);
            blockTitanium = new BlockEXOre(Material.IRON,3.0f,5.0f,"titaniumBlock");
            itemBlockTitanium = new ItemBlockExOre(blockTitanium);
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
            itemBlockOreNickel = new ItemBlockExOre(blockOreNickel);
            blockNickel = new BlockEXOre(Material.IRON,3.0f,5.0f,"nickelBlock");
            itemBlockNickel = new ItemBlockExOre(blockNickel);
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
        if(registerAdamantine)
        {
            blockOreAdamantine = new BlockEXOre(Material.ROCK,3.0f,5.0f,"adamantineOre");
            itemBlockOreAdamantine = new ItemBlockExOre(blockOreAdamantine);
            blockAdamantine = new BlockEXOre(Material.IRON,3.0f,5.0f,"adamantineBlock");
            itemBlockAdamantine = new ItemBlockExOre(blockAdamantine);
            itemIngotAdamantine = new ItemEXOre("adamantineIngot");
            itemDustAdamantine = new ItemEXOre("adamantineDust");
            createRegistry(blockOreAdamantine,itemBlockOreAdamantine,"adamantineOre");
            createRegistry(blockAdamantine,itemBlockAdamantine,"adamantineBlock");
            createRegistry(itemIngotAdamantine,"adamantineIngot");
            createRegistry(itemDustAdamantine,"adamantineDust");
            ForgeRegistries.BLOCKS.register(blockOreAdamantine);
            ForgeRegistries.ITEMS.register(itemBlockOreAdamantine);
            ForgeRegistries.BLOCKS.register(blockAdamantine);
            ForgeRegistries.ITEMS.register(itemBlockAdamantine);
            ForgeRegistries.ITEMS.register(itemIngotAdamantine);
            ForgeRegistries.ITEMS.register(itemDustAdamantine);
            initOreDict(blockOreAdamantine,"oreAdamantine");
            initOreDict(blockAdamantine,"blockAdamantine");
            initOreDict(itemIngotAdamantine,"ingotAdamantine");
            initOreDict(itemDustAdamantine,"dustAdamantine");
        }
        if(registerAldourite)
        {
            blockOreAldourite = new BlockEXOre(Material.ROCK,3.0f,5.0f,"aldouriteOre");
            itemBlockOreAldourite = new ItemBlockExOre(blockOreAldourite);
            blockAldourite = new BlockEXOre(Material.IRON,3.0f,5.0f,"aldouriteBlock");
            itemBlockAldourite = new ItemBlockExOre(blockAldourite);
            itemIngotAldourite = new ItemEXOre("aldouriteIngot");
            itemDustAldourite = new ItemEXOre("aldouriteDust");
            createRegistry(blockOreAldourite,itemBlockOreAldourite,"aldouriteOre");
            createRegistry(blockAldourite,itemBlockAldourite,"aldouriteBlock");
            createRegistry(itemIngotAldourite,"aldouriteIngot");
            createRegistry(itemDustAldourite,"aldouriteDust");
            ForgeRegistries.BLOCKS.register(blockOreAldourite);
            ForgeRegistries.ITEMS.register(itemBlockOreAldourite);
            ForgeRegistries.BLOCKS.register(blockAldourite);
            ForgeRegistries.ITEMS.register(itemBlockAldourite);
            ForgeRegistries.ITEMS.register(itemIngotAldourite);
            ForgeRegistries.ITEMS.register(itemDustAldourite);
            initOreDict(blockOreAldourite,"oreAldourite");
            initOreDict(blockAldourite,"blockAldourite");
            initOreDict(itemIngotAldourite,"ingotAldourite");
            initOreDict(itemDustAldourite,"dustAldourite");
        }
        if(registerAstralSilver)
        {
            blockOreAstralSilver = new BlockEXOre(Material.ROCK,3.0f,5.0f,"astralSilverOre");
            itemBlockOreAstralSilver = new ItemBlockExOre(blockOreAstralSilver);
            blockAstralSilver = new BlockEXOre(Material.IRON,3.0f,5.0f,"astralSilverBlock");
            itemBlockAstralSilver = new ItemBlockExOre(blockAstralSilver);
            itemIngotAstralSilver = new ItemEXOre("astralSilverIngot");
            itemDustAstralSilver = new ItemEXOre("astralSilverDust");
            createRegistry(blockOreAstralSilver,itemBlockOreAstralSilver,"astralSilverOre");
            createRegistry(blockAstralSilver,itemBlockAstralSilver,"astralSilverBlock");
            createRegistry(itemIngotAstralSilver,"astralSilverIngot");
            createRegistry(itemDustAstralSilver,"astralSilverDust");
            ForgeRegistries.BLOCKS.register(blockOreAstralSilver);
            ForgeRegistries.ITEMS.register(itemBlockOreAstralSilver);
            ForgeRegistries.BLOCKS.register(blockAstralSilver);
            ForgeRegistries.ITEMS.register(itemBlockAstralSilver);
            ForgeRegistries.ITEMS.register(itemIngotAstralSilver);
            ForgeRegistries.ITEMS.register(itemDustAstralSilver);
            initOreDict(blockOreAstralSilver,"oreAstralSilver");
            initOreDict(blockAstralSilver,"blockAstralSilver");
            initOreDict(itemIngotAstralSilver,"ingotAstralSilver");
            initOreDict(itemDustAstralSilver,"dustAstralSilver");
        }
        if(registerAtlarus)
        {
            blockOreAtlarus = new BlockEXOre(Material.ROCK,3.0f,5.0f,"atlarusOre");
            itemBlockOreAtlarus = new ItemBlockExOre(blockOreAtlarus);
            blockAtlarus = new BlockEXOre(Material.IRON,3.0f,5.0f,"atlarusBlock");
            itemBlockAtlarus = new ItemBlockExOre(blockAtlarus);
            itemIngotAtlarus = new ItemEXOre("atlarusIngot");
            itemDustAtlarus = new ItemEXOre("atlarusDust");
            createRegistry(blockOreAtlarus,itemBlockOreAtlarus,"atlarusOre");
            createRegistry(blockAtlarus,itemBlockAtlarus,"atlarusBlock");
            createRegistry(itemIngotAtlarus,"atlarusIngot");
            createRegistry(itemDustAtlarus,"atlarusDust");
            ForgeRegistries.BLOCKS.register(blockOreAtlarus);
            ForgeRegistries.ITEMS.register(itemBlockOreAtlarus);
            ForgeRegistries.BLOCKS.register(blockAtlarus);
            ForgeRegistries.ITEMS.register(itemBlockAtlarus);
            ForgeRegistries.ITEMS.register(itemIngotAtlarus);
            ForgeRegistries.ITEMS.register(itemDustAtlarus);
            initOreDict(blockOreAtlarus,"oreAtlarus");
            initOreDict(blockAtlarus,"blockAtlarus");
            initOreDict(itemIngotAtlarus,"ingotAtlarus");
            initOreDict(itemDustAtlarus,"dustAtlarus");
        }
        if(registerCarmot)
        {
            blockOreCarmot = new BlockEXOre(Material.ROCK,3.0f,5.0f,"carmotOre");
            itemBlockOreCarmot = new ItemBlockExOre(blockOreCarmot);
            blockCarmot = new BlockEXOre(Material.IRON,3.0f,5.0f,"carmotBlock");
            itemBlockCarmot = new ItemBlockExOre(blockCarmot);
            itemIngotCarmot = new ItemEXOre("carmotIngot");
            itemDustCarmot = new ItemEXOre("carmotDust");
            createRegistry(blockOreCarmot,itemBlockOreCarmot,"carmotOre");
            createRegistry(blockCarmot,itemBlockCarmot,"carmotBlock");
            createRegistry(itemIngotCarmot,"carmotIngot");
            createRegistry(itemDustCarmot,"carmotDust");
            ForgeRegistries.BLOCKS.register(blockOreCarmot);
            ForgeRegistries.ITEMS.register(itemBlockOreCarmot);
            ForgeRegistries.BLOCKS.register(blockCarmot);
            ForgeRegistries.ITEMS.register(itemBlockCarmot);
            ForgeRegistries.ITEMS.register(itemIngotCarmot);
            ForgeRegistries.ITEMS.register(itemDustCarmot);
            initOreDict(blockOreCarmot,"oreCarmot");
            initOreDict(blockCarmot,"blockCarmot");
            initOreDict(itemIngotCarmot,"ingotCarmot");
            initOreDict(itemDustCarmot,"dustCarmot");
        }
        if(registerCeruclase)
        {
            blockOreCeruclase = new BlockEXOre(Material.ROCK,3.0f,5.0f,"ceruclaseOre");
            itemBlockOreCeruclase = new ItemBlockExOre(blockOreCeruclase);
            blockCeruclase = new BlockEXOre(Material.IRON,3.0f,5.0f,"ceruclaseBlock");
            itemBlockCeruclase = new ItemBlockExOre(blockCeruclase);
            itemIngotCeruclase = new ItemEXOre("ceruclaseIngot");
            itemDustCeruclase = new ItemEXOre("ceruclaseDust");
            createRegistry(blockOreCeruclase,itemBlockOreCeruclase,"ceruclaseOre");
            createRegistry(blockCeruclase,itemBlockCeruclase,"ceruclaseBlock");
            createRegistry(itemIngotCeruclase,"ceruclaseIngot");
            createRegistry(itemDustCeruclase,"ceruclaseDust");
            ForgeRegistries.BLOCKS.register(blockOreCeruclase);
            ForgeRegistries.ITEMS.register(itemBlockOreCeruclase);
            ForgeRegistries.BLOCKS.register(blockCeruclase);
            ForgeRegistries.ITEMS.register(itemBlockCeruclase);
            ForgeRegistries.ITEMS.register(itemIngotCeruclase);
            ForgeRegistries.ITEMS.register(itemDustCeruclase);
            initOreDict(blockOreCeruclase,"oreCeruclase");
            initOreDict(blockCeruclase,"blockCeruclase");
            initOreDict(itemIngotCeruclase,"ingotCeruclase");
            initOreDict(itemDustCeruclase,"dustCeruclase");
        }
        if(registerDeepIron)
        {
            blockOreDeepIron = new BlockEXOre(Material.ROCK,3.0f,5.0f,"deepIronOre");
            itemBlockOreDeepIron = new ItemBlockExOre(blockOreDeepIron);
            blockDeepIron = new BlockEXOre(Material.IRON,3.0f,5.0f,"deepIronBlock");
            itemBlockDeepIron = new ItemBlockExOre(blockDeepIron);
            itemIngotDeepIron = new ItemEXOre("deepIronIngot");
            itemDustDeepIron = new ItemEXOre("deepIronDust");
            createRegistry(blockOreDeepIron,itemBlockOreDeepIron,"deepIronOre");
            createRegistry(blockDeepIron,itemBlockDeepIron,"deepIronBlock");
            createRegistry(itemIngotDeepIron,"deepIronIngot");
            createRegistry(itemDustDeepIron,"deepIronDust");
            ForgeRegistries.BLOCKS.register(blockOreDeepIron);
            ForgeRegistries.ITEMS.register(itemBlockOreDeepIron);
            ForgeRegistries.BLOCKS.register(blockDeepIron);
            ForgeRegistries.ITEMS.register(itemBlockDeepIron);
            ForgeRegistries.ITEMS.register(itemIngotDeepIron);
            ForgeRegistries.ITEMS.register(itemDustDeepIron);
            initOreDict(blockOreDeepIron,"oreDeepIron");
            initOreDict(blockDeepIron,"blockDeepIron");
            initOreDict(itemIngotDeepIron,"ingotDeepIron");
            initOreDict(itemDustDeepIron,"dustDeepIron");
        }
        if(registerIgnatius)
        {
            blockOreIgnatius = new BlockEXOre(Material.ROCK,3.0f,5.0f,"ignatiusOre");
            itemBlockOreIgnatius = new ItemBlockExOre(blockOreIgnatius);
            blockIgnatius = new BlockEXOre(Material.IRON,3.0f,5.0f,"ignatiusBlock");
            itemBlockIgnatius = new ItemBlockExOre(blockIgnatius);
            itemIngotIgnatius = new ItemEXOre("ignatiusIngot");
            itemDustIgnatius = new ItemEXOre("ignatiusDust");
            createRegistry(blockOreIgnatius,itemBlockOreIgnatius,"ignatiusOre");
            createRegistry(blockIgnatius,itemBlockIgnatius,"ignatiusBlock");
            createRegistry(itemIngotIgnatius,"ignatiusIngot");
            createRegistry(itemDustIgnatius,"ignatiusDust");
            ForgeRegistries.BLOCKS.register(blockOreIgnatius);
            ForgeRegistries.ITEMS.register(itemBlockOreIgnatius);
            ForgeRegistries.BLOCKS.register(blockIgnatius);
            ForgeRegistries.ITEMS.register(itemBlockIgnatius);
            ForgeRegistries.ITEMS.register(itemIngotIgnatius);
            ForgeRegistries.ITEMS.register(itemDustIgnatius);
            initOreDict(blockOreIgnatius,"oreIgnatius");
            initOreDict(blockIgnatius,"blockIgnatius");
            initOreDict(itemIngotIgnatius,"ingotIgnatius");
            initOreDict(itemDustIgnatius,"dustIgnatius");
        }
        if(registerInfuscolium)
        {
            blockOreInfuscolium = new BlockEXOre(Material.ROCK,3.0f,5.0f,"infuscoliumOre");
            itemBlockOreInfuscolium = new ItemBlockExOre(blockOreInfuscolium);
            blockInfuscolium = new BlockEXOre(Material.IRON,3.0f,5.0f,"infuscoliumBlock");
            itemBlockInfuscolium = new ItemBlockExOre(blockInfuscolium);
            itemIngotInfuscolium = new ItemEXOre("infuscoliumIngot");
            itemDustInfuscolium = new ItemEXOre("infuscoliumDust");
            createRegistry(blockOreInfuscolium,itemBlockOreInfuscolium,"infuscoliumOre");
            createRegistry(blockInfuscolium,itemBlockInfuscolium,"infuscoliumBlock");
            createRegistry(itemIngotInfuscolium,"infuscoliumIngot");
            createRegistry(itemDustInfuscolium,"infuscoliumDust");
            ForgeRegistries.BLOCKS.register(blockOreInfuscolium);
            ForgeRegistries.ITEMS.register(itemBlockOreInfuscolium);
            ForgeRegistries.BLOCKS.register(blockInfuscolium);
            ForgeRegistries.ITEMS.register(itemBlockInfuscolium);
            ForgeRegistries.ITEMS.register(itemIngotInfuscolium);
            ForgeRegistries.ITEMS.register(itemDustInfuscolium);
            initOreDict(blockOreInfuscolium,"oreInfuscolium");
            initOreDict(blockInfuscolium,"blockInfuscolium");
            initOreDict(itemIngotInfuscolium,"ingotInfuscolium");
            initOreDict(itemDustInfuscolium,"dustInfuscolium");
        }
        if(registerKalendrite)
        {
            blockOreKalendrite = new BlockEXOre(Material.ROCK,3.0f,5.0f,"kalendriteOre");
            itemBlockOreKalendrite = new ItemBlockExOre(blockOreKalendrite);
            blockKalendrite = new BlockEXOre(Material.IRON,3.0f,5.0f,"kalendriteBlock");
            itemBlockKalendrite = new ItemBlockExOre(blockKalendrite);
            itemIngotKalendrite = new ItemEXOre("kalendriteIngot");
            itemDustKalendrite = new ItemEXOre("kalendriteDust");
            createRegistry(blockOreKalendrite,itemBlockOreKalendrite,"kalendriteOre");
            createRegistry(blockKalendrite,itemBlockKalendrite,"kalendriteBlock");
            createRegistry(itemIngotKalendrite,"kalendriteIngot");
            createRegistry(itemDustKalendrite,"kalendriteDust");
            ForgeRegistries.BLOCKS.register(blockOreKalendrite);
            ForgeRegistries.ITEMS.register(itemBlockOreKalendrite);
            ForgeRegistries.BLOCKS.register(blockKalendrite);
            ForgeRegistries.ITEMS.register(itemBlockKalendrite);
            ForgeRegistries.ITEMS.register(itemIngotKalendrite);
            ForgeRegistries.ITEMS.register(itemDustKalendrite);
            initOreDict(blockOreKalendrite,"oreKalendrite");
            initOreDict(blockKalendrite,"blockKalendrite");
            initOreDict(itemIngotKalendrite,"ingotKalendrite");
            initOreDict(itemDustKalendrite,"dustKalendrite");
        }
        if(registerLemurite)
        {
            blockOreLemurite = new BlockEXOre(Material.ROCK,3.0f,5.0f,"lemuriteOre");
            itemBlockOreLemurite = new ItemBlockExOre(blockOreLemurite);
            blockLemurite = new BlockEXOre(Material.IRON,3.0f,5.0f,"lemuriteBlock");
            itemBlockLemurite = new ItemBlockExOre(blockLemurite);
            itemIngotLemurite = new ItemEXOre("lemuriteIngot");
            itemDustLemurite = new ItemEXOre("lemuriteDust");
            createRegistry(blockOreLemurite,itemBlockOreLemurite,"lemuriteOre");
            createRegistry(blockLemurite,itemBlockLemurite,"lemuriteBlock");
            createRegistry(itemIngotLemurite,"lemuriteIngot");
            createRegistry(itemDustLemurite,"lemuriteDust");
            ForgeRegistries.BLOCKS.register(blockOreLemurite);
            ForgeRegistries.ITEMS.register(itemBlockOreLemurite);
            ForgeRegistries.BLOCKS.register(blockLemurite);
            ForgeRegistries.ITEMS.register(itemBlockLemurite);
            ForgeRegistries.ITEMS.register(itemIngotLemurite);
            ForgeRegistries.ITEMS.register(itemDustLemurite);
            initOreDict(blockOreLemurite,"oreLemurite");
            initOreDict(blockLemurite,"blockLemurite");
            initOreDict(itemIngotLemurite,"ingotLemurite");
            initOreDict(itemDustLemurite,"dustLemurite");
        }
        if(registerMidasium)
        {
            blockOreMidasium = new BlockEXOre(Material.ROCK,3.0f,5.0f,"midasiumOre");
            itemBlockOreMidasium = new ItemBlockExOre(blockOreMidasium);
            blockMidasium = new BlockEXOre(Material.IRON,3.0f,5.0f,"midasiumBlock");
            itemBlockMidasium = new ItemBlockExOre(blockMidasium);
            itemIngotMidasium = new ItemEXOre("midasiumIngot");
            itemDustMidasium = new ItemEXOre("midasiumDust");
            createRegistry(blockOreMidasium,itemBlockOreMidasium,"midasiumOre");
            createRegistry(blockMidasium,itemBlockMidasium,"midasiumBlock");
            createRegistry(itemIngotMidasium,"midasiumIngot");
            createRegistry(itemDustMidasium,"midasiumDust");
            ForgeRegistries.BLOCKS.register(blockOreMidasium);
            ForgeRegistries.ITEMS.register(itemBlockOreMidasium);
            ForgeRegistries.BLOCKS.register(blockMidasium);
            ForgeRegistries.ITEMS.register(itemBlockMidasium);
            ForgeRegistries.ITEMS.register(itemIngotMidasium);
            ForgeRegistries.ITEMS.register(itemDustMidasium);
            initOreDict(blockOreMidasium,"oreMidasium");
            initOreDict(blockMidasium,"blockMidasium");
            initOreDict(itemIngotMidasium,"ingotMidasium");
            initOreDict(itemDustMidasium,"dustMidasium");
        }
        if(registerMithril)
        {
            blockOreMithril = new BlockEXOre(Material.ROCK,3.0f,5.0f,"mithrilOre");
            itemBlockOreMithril = new ItemBlockExOre(blockOreMithril);
            blockMithril = new BlockEXOre(Material.IRON,3.0f,5.0f,"mithrilBlock");
            itemBlockMithril = new ItemBlockExOre(blockMithril);
            itemIngotMithril = new ItemEXOre("mithrilIngot");
            itemDustMithril = new ItemEXOre("mithrilDust");
            createRegistry(blockOreMithril,itemBlockOreMithril,"mithrilOre");
            createRegistry(blockMithril,itemBlockMithril,"mithrilBlock");
            createRegistry(itemIngotMithril,"mithrilIngot");
            createRegistry(itemDustMithril,"mithrilDust");
            ForgeRegistries.BLOCKS.register(blockOreMithril);
            ForgeRegistries.ITEMS.register(itemBlockOreMithril);
            ForgeRegistries.BLOCKS.register(blockMithril);
            ForgeRegistries.ITEMS.register(itemBlockMithril);
            ForgeRegistries.ITEMS.register(itemIngotMithril);
            ForgeRegistries.ITEMS.register(itemDustMithril);
            initOreDict(blockOreMithril,"oreMithril");
            initOreDict(blockMithril,"blockMithril");
            initOreDict(itemIngotMithril,"ingotMithril");
            initOreDict(itemDustMithril,"dustMithril");
        }
        if(registerOrichalcum)
        {
            blockOreOrichalcum = new BlockEXOre(Material.ROCK,3.0f,5.0f,"orichalcumOre");
            itemBlockOreOrichalcum = new ItemBlockExOre(blockOreOrichalcum);
            blockOrichalcum = new BlockEXOre(Material.IRON,3.0f,5.0f,"orichalcumBlock");
            itemBlockOrichalcum = new ItemBlockExOre(blockOrichalcum);
            itemIngotOrichalcum = new ItemEXOre("orichalcumIngot");
            itemDustOrichalcum = new ItemEXOre("orichalcumDust");
            createRegistry(blockOreOrichalcum,itemBlockOreOrichalcum,"orichalcumOre");
            createRegistry(blockOrichalcum,itemBlockOrichalcum,"orichalcumBlock");
            createRegistry(itemIngotOrichalcum,"orichalcumIngot");
            createRegistry(itemDustOrichalcum,"orichalcumDust");
            ForgeRegistries.BLOCKS.register(blockOreOrichalcum);
            ForgeRegistries.ITEMS.register(itemBlockOreOrichalcum);
            ForgeRegistries.BLOCKS.register(blockOrichalcum);
            ForgeRegistries.ITEMS.register(itemBlockOrichalcum);
            ForgeRegistries.ITEMS.register(itemIngotOrichalcum);
            ForgeRegistries.ITEMS.register(itemDustOrichalcum);
            initOreDict(blockOreOrichalcum,"oreOrichalcum");
            initOreDict(blockOrichalcum,"blockOrichalcum");
            initOreDict(itemIngotOrichalcum,"ingotOrichalcum");
            initOreDict(itemDustOrichalcum,"dustOrichalcum");
        }
        if(registerOureclase)
        {
            blockOreOureclase = new BlockEXOre(Material.ROCK,3.0f,5.0f,"oureclaseOre");
            itemBlockOreOureclase = new ItemBlockExOre(blockOreOureclase);
            blockOureclase = new BlockEXOre(Material.IRON,3.0f,5.0f,"oureclaseBlock");
            itemBlockOureclase = new ItemBlockExOre(blockOureclase);
            itemIngotOureclase = new ItemEXOre("oureclaseIngot");
            itemDustOureclase = new ItemEXOre("oureclaseDust");
            createRegistry(blockOreOureclase,itemBlockOreOureclase,"oureclaseOre");
            createRegistry(blockOureclase,itemBlockOureclase,"oureclaseBlock");
            createRegistry(itemIngotOureclase,"oureclaseIngot");
            createRegistry(itemDustOureclase,"oureclaseDust");
            ForgeRegistries.BLOCKS.register(blockOreOureclase);
            ForgeRegistries.ITEMS.register(itemBlockOreOureclase);
            ForgeRegistries.BLOCKS.register(blockOureclase);
            ForgeRegistries.ITEMS.register(itemBlockOureclase);
            ForgeRegistries.ITEMS.register(itemIngotOureclase);
            ForgeRegistries.ITEMS.register(itemDustOureclase);
            initOreDict(blockOreOureclase,"oreOureclase");
            initOreDict(blockOureclase,"blockOureclase");
            initOreDict(itemIngotOureclase,"ingotOureclase");
            initOreDict(itemDustOureclase,"dustOureclase");
        }
        if(registerPrometheum)
        {
            blockOrePrometheum = new BlockEXOre(Material.ROCK,3.0f,5.0f,"prometheumOre");
            itemBlockOrePrometheum = new ItemBlockExOre(blockOrePrometheum);
            blockPrometheum = new BlockEXOre(Material.IRON,3.0f,5.0f,"prometheumBlock");
            itemBlockPrometheum = new ItemBlockExOre(blockPrometheum);
            itemIngotPrometheum = new ItemEXOre("prometheumIngot");
            itemDustPrometheum = new ItemEXOre("prometheumDust");
            createRegistry(blockOrePrometheum,itemBlockOrePrometheum,"prometheumOre");
            createRegistry(blockPrometheum,itemBlockPrometheum,"prometheumBlock");
            createRegistry(itemIngotPrometheum,"prometheumIngot");
            createRegistry(itemDustPrometheum,"prometheumDust");
            ForgeRegistries.BLOCKS.register(blockOrePrometheum);
            ForgeRegistries.ITEMS.register(itemBlockOrePrometheum);
            ForgeRegistries.BLOCKS.register(blockPrometheum);
            ForgeRegistries.ITEMS.register(itemBlockPrometheum);
            ForgeRegistries.ITEMS.register(itemIngotPrometheum);
            ForgeRegistries.ITEMS.register(itemDustPrometheum);
            initOreDict(blockOrePrometheum,"orePrometheum");
            initOreDict(blockPrometheum,"blockPrometheum");
            initOreDict(itemIngotPrometheum,"ingotPrometheum");
            initOreDict(itemDustPrometheum,"dustPrometheum");
        }
        if(registerRubracium)
        {
            blockOreRubracium = new BlockEXOre(Material.ROCK,3.0f,5.0f,"rubraciumOre");
            itemBlockOreRubracium = new ItemBlockExOre(blockOreRubracium);
            blockRubracium = new BlockEXOre(Material.IRON,3.0f,5.0f,"rubraciumBlock");
            itemBlockRubracium = new ItemBlockExOre(blockRubracium);
            itemIngotRubracium = new ItemEXOre("rubraciumIngot");
            itemDustRubracium = new ItemEXOre("rubraciumDust");
            createRegistry(blockOreRubracium,itemBlockOreRubracium,"rubraciumOre");
            createRegistry(blockRubracium,itemBlockRubracium,"rubraciumBlock");
            createRegistry(itemIngotRubracium,"rubraciumIngot");
            createRegistry(itemDustRubracium,"rubraciumDust");
            ForgeRegistries.BLOCKS.register(blockOreRubracium);
            ForgeRegistries.ITEMS.register(itemBlockOreRubracium);
            ForgeRegistries.BLOCKS.register(blockRubracium);
            ForgeRegistries.ITEMS.register(itemBlockRubracium);
            ForgeRegistries.ITEMS.register(itemIngotRubracium);
            ForgeRegistries.ITEMS.register(itemDustRubracium);
            initOreDict(blockOreRubracium,"oreRubracium");
            initOreDict(blockRubracium,"blockRubracium");
            initOreDict(itemIngotRubracium,"ingotRubracium");
            initOreDict(itemDustRubracium,"dustRubracium");
        }
        if(registerSanguinite)
        {
            blockOreSanguinite = new BlockEXOre(Material.ROCK,3.0f,5.0f,"sanguiniteOre");
            itemBlockOreSanguinite = new ItemBlockExOre(blockOreSanguinite);
            blockSanguinite = new BlockEXOre(Material.IRON,3.0f,5.0f,"sanguiniteBlock");
            itemBlockSanguinite = new ItemBlockExOre(blockSanguinite);
            itemIngotSanguinite = new ItemEXOre("sanguiniteIngot");
            itemDustSanguinite = new ItemEXOre("sanguiniteDust");
            createRegistry(blockOreSanguinite,itemBlockOreSanguinite,"sanguiniteOre");
            createRegistry(blockSanguinite,itemBlockSanguinite,"sanguiniteBlock");
            createRegistry(itemIngotSanguinite,"sanguiniteIngot");
            createRegistry(itemDustSanguinite,"sanguiniteDust");
            ForgeRegistries.BLOCKS.register(blockOreSanguinite);
            ForgeRegistries.ITEMS.register(itemBlockOreSanguinite);
            ForgeRegistries.BLOCKS.register(blockSanguinite);
            ForgeRegistries.ITEMS.register(itemBlockSanguinite);
            ForgeRegistries.ITEMS.register(itemIngotSanguinite);
            ForgeRegistries.ITEMS.register(itemDustSanguinite);
            initOreDict(blockOreSanguinite,"oreSanguinite");
            initOreDict(blockSanguinite,"blockSanguinite");
            initOreDict(itemIngotSanguinite,"ingotSanguinite");
            initOreDict(itemDustSanguinite,"dustSanguinite");
        }
        if(registerShadowIron)
        {
            blockOreShadowIron = new BlockEXOre(Material.ROCK,3.0f,5.0f,"shadowIronOre");
            itemBlockOreShadowIron = new ItemBlockExOre(blockOreShadowIron);
            blockShadowIron = new BlockEXOre(Material.IRON,3.0f,5.0f,"shadowIronBlock");
            itemBlockShadowIron = new ItemBlockExOre(blockShadowIron);
            itemIngotShadowIron = new ItemEXOre("shadowIronIngot");
            itemDustShadowIron = new ItemEXOre("shadowIronDust");
            createRegistry(blockOreShadowIron,itemBlockOreShadowIron,"shadowIronOre");
            createRegistry(blockShadowIron,itemBlockShadowIron,"shadowIronBlock");
            createRegistry(itemIngotShadowIron,"shadowIronIngot");
            createRegistry(itemDustShadowIron,"shadowIronDust");
            ForgeRegistries.BLOCKS.register(blockOreShadowIron);
            ForgeRegistries.ITEMS.register(itemBlockOreShadowIron);
            ForgeRegistries.BLOCKS.register(blockShadowIron);
            ForgeRegistries.ITEMS.register(itemBlockShadowIron);
            ForgeRegistries.ITEMS.register(itemIngotShadowIron);
            ForgeRegistries.ITEMS.register(itemDustShadowIron);
            initOreDict(blockOreShadowIron,"oreShadowIron");
            initOreDict(blockShadowIron,"blockShadowIron");
            initOreDict(itemIngotShadowIron,"ingotShadowIron");
            initOreDict(itemDustShadowIron,"dustShadowIron");
        }
        if(registerVulcanite)
        {
            blockOreVulcanite = new BlockEXOre(Material.ROCK,3.0f,5.0f,"vulcaniteOre");
            itemBlockOreVulcanite = new ItemBlockExOre(blockOreVulcanite);
            blockVulcanite = new BlockEXOre(Material.IRON,3.0f,5.0f,"vulcaniteBlock");
            itemBlockVulcanite = new ItemBlockExOre(blockVulcanite);
            itemIngotVulcanite = new ItemEXOre("vulcaniteIngot");
            itemDustVulcanite = new ItemEXOre("vulcaniteDust");
            createRegistry(blockOreVulcanite,itemBlockOreVulcanite,"vulcaniteOre");
            createRegistry(blockVulcanite,itemBlockVulcanite,"vulcaniteBlock");
            createRegistry(itemIngotVulcanite,"vulcaniteIngot");
            createRegistry(itemDustVulcanite,"vulcaniteDust");
            ForgeRegistries.BLOCKS.register(blockOreVulcanite);
            ForgeRegistries.ITEMS.register(itemBlockOreVulcanite);
            ForgeRegistries.BLOCKS.register(blockVulcanite);
            ForgeRegistries.ITEMS.register(itemBlockVulcanite);
            ForgeRegistries.ITEMS.register(itemIngotVulcanite);
            ForgeRegistries.ITEMS.register(itemDustVulcanite);
            initOreDict(blockOreVulcanite,"oreVulcanite");
            initOreDict(blockVulcanite,"blockVulcanite");
            initOreDict(itemIngotVulcanite,"ingotVulcanite");
            initOreDict(itemDustVulcanite,"dustVulcanite");
        }
        if(registerVyroxeres)
        {
            blockOreVyroxeres = new BlockEXOre(Material.ROCK,3.0f,5.0f,"vyroxeresOre");
            itemBlockOreVyroxeres = new ItemBlockExOre(blockOreVyroxeres);
            blockVyroxeres = new BlockEXOre(Material.IRON,3.0f,5.0f,"vyroxeresBlock");
            itemBlockVyroxeres = new ItemBlockExOre(blockVyroxeres);
            itemIngotVyroxeres = new ItemEXOre("vyroxeresIngot");
            itemDustVyroxeres = new ItemEXOre("vyroxeresDust");
            createRegistry(blockOreVyroxeres,itemBlockOreVyroxeres,"vyroxeresOre");
            createRegistry(blockVyroxeres,itemBlockVyroxeres,"vyroxeresBlock");
            createRegistry(itemIngotVyroxeres,"vyroxeresIngot");
            createRegistry(itemDustVyroxeres,"vyroxeresDust");
            ForgeRegistries.BLOCKS.register(blockOreVyroxeres);
            ForgeRegistries.ITEMS.register(itemBlockOreVyroxeres);
            ForgeRegistries.BLOCKS.register(blockVyroxeres);
            ForgeRegistries.ITEMS.register(itemBlockVyroxeres);
            ForgeRegistries.ITEMS.register(itemIngotVyroxeres);
            ForgeRegistries.ITEMS.register(itemDustVyroxeres);
            initOreDict(blockOreVyroxeres,"oreVyroxeres");
            initOreDict(blockVyroxeres,"blockVyroxeres");
            initOreDict(itemIngotVyroxeres,"ingotVyroxeres");
            initOreDict(itemDustVyroxeres,"dustVyroxeres");
        }
    }
    private static void initOreDict(Block block, String name)
    {
        ItemStack stack = new ItemStack(block,1);
        OreDictionary.registerOre(name,stack);
    }
    private static void initOreDict(Item item, String name)
    {
        ItemStack stack = new ItemStack(item,1);
        OreDictionary.registerOre(name,stack);
    }
    private static void createRegistry(Block block,ItemBlock itemBlock, String name)
    {
        block.setRegistryName("extraores",name);
        createRegitstry(itemBlock,block.getRegistryName().toString());
    }
    private static void createRegistry(Item item, String name)
    {
        item.setRegistryName("extraores",name);
    }
    private static void createRegitstry(ItemBlock itemBlock, String name)
    {
        itemBlock.setRegistryName(name);
    }
}

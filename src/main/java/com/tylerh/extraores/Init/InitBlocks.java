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
            blockOreCopper = new BlockEXOre(Material.rock,3.0f,5.0f,"copperOre");
            blockCopper = new BlockEXOre(Material.iron,3.0f,5.0f,"copperBlock");
            itemIngotCopper = new ItemEXOre("copperIngot");
            itemDustCopper = new ItemEXOre("copperDust");
            GameRegistry.registerBlock(blockOreCopper,"copperOre");
            GameRegistry.registerBlock(blockCopper,"copperBlock");
            GameRegistry.registerItem(itemIngotCopper,"copperIngot");
            GameRegistry.registerItem(itemDustCopper,"copperDust");
            initOreDict(blockOreCopper,"oreCopper");
            initOreDict(blockCopper,"blockCopper");
            initOreDict(itemIngotCopper,"ingotCopper");
            initOreDict(itemDustCopper,"dustCopper");
        }
        if(registerTin)
        {
            blockOreTin = new BlockEXOre(Material.rock,3.0f,5.0f,"tinOre");
            blockTin = new BlockEXOre(Material.iron,3.0f,5.0f,"tinBlock");
            itemIngotTin = new ItemEXOre("tinIngot");
            itemDustTin = new ItemEXOre("tinDust");
            GameRegistry.registerBlock(blockOreTin,"tinOre");
            GameRegistry.registerBlock(blockTin,"tinBlock");
            GameRegistry.registerItem(itemIngotTin,"tinIngot");
            GameRegistry.registerItem(itemDustTin,"tinDust");
            initOreDict(blockOreTin,"oreTin");
            initOreDict(blockTin,"blockTin");
            initOreDict(itemIngotTin,"ingotTin");
            initOreDict(itemDustTin,"dustTin");
        }
        if(registerChromium)
        {
            blockOreChromium = new BlockEXOre(Material.rock,3.0f,5.0f,"chromiumOre");
            blockChromium = new BlockEXOre(Material.iron,3.0f,5.0f,"chromiumBlock");
            itemIngotChromium = new ItemEXOre("chromiumIngot");
            itemDustChromium = new ItemEXOre("chromiumDust");
            GameRegistry.registerBlock(blockOreChromium,"chromiumOre");
            GameRegistry.registerBlock(blockChromium,"chromiumBlock");
            GameRegistry.registerItem(itemIngotChromium,"chromiumIngot");
            GameRegistry.registerItem(itemDustChromium,"chromiumDust");
            initOreDict(blockOreChromium,"oreChromium");
            initOreDict(blockChromium,"blockChromium");
            initOreDict(itemIngotChromium,"ingotChromium");
            initOreDict(itemDustChromium,"dustChromium");
        }
        if(registerCobalt)
        {
            blockOreCobalt = new BlockEXOre(Material.rock,3.0f,5.0f,"cobaltOre");
            blockCobalt = new BlockEXOre(Material.iron,3.0f,5.0f,"cobaltBlock");
            itemIngotCobalt = new ItemEXOre("cobaltIngot");
            itemDustCobalt = new ItemEXOre("cobaltDust");
            GameRegistry.registerBlock(blockOreCobalt,"cobaltOre");
            GameRegistry.registerBlock(blockCobalt,"cobaltBlock");
            GameRegistry.registerItem(itemIngotCobalt,"cobaltIngot");
            GameRegistry.registerItem(itemDustCobalt,"cobaltDust");
            initOreDict(blockOreCobalt,"oreCobalt");
            initOreDict(blockCobalt,"blockCobalt");
            initOreDict(itemIngotCobalt,"ingotCobalt");
            initOreDict(itemDustCobalt,"dustCobalt");
        }
        if(registerUnobtainium)
        {
            blockOreUnobtainium = new BlockEXOre(Material.rock,3.0f,5.0f,"unobtainiumOre");
            blockUnobtainium = new BlockEXOre(Material.iron,3.0f,5.0f,"unobtainiumBlock");
            itemIngotUnobtainium = new ItemEXOre("unobtainiumIngot");
            itemDustUnobtainium = new ItemEXOre("unobtainiumDust");
            GameRegistry.registerBlock(blockOreUnobtainium,"unobtainiumOre");
            GameRegistry.registerBlock(blockUnobtainium,"unobtainiumBlock");
            GameRegistry.registerItem(itemIngotUnobtainium,"unobtainiumIngot");
            GameRegistry.registerItem(itemDustUnobtainium,"unobtainiumDust");
            initOreDict(blockOreUnobtainium,"oreUnobtainium");
            initOreDict(blockUnobtainium,"blockUnobtainium");
            initOreDict(itemIngotUnobtainium,"ingotUnobtainium");
            initOreDict(itemDustUnobtainium,"dustUnobtainium");
        }
        if(registerManganese)
        {
            blockOreManganese = new BlockEXOre(Material.rock,3.0f,5.0f,"manganeseOre");
            blockManganese = new BlockEXOre(Material.iron,3.0f,5.0f,"manganeseBlock");
            itemIngotManganese = new ItemEXOre("manganeseIngot");
            itemDustManganese = new ItemEXOre("manganeseDust");
            GameRegistry.registerBlock(blockOreManganese,"manganeseOre");
            GameRegistry.registerBlock(blockManganese,"manganeseBlock");
            GameRegistry.registerItem(itemIngotManganese,"manganeseIngot");
            GameRegistry.registerItem(itemDustManganese,"manganeseDust");
            initOreDict(blockOreManganese,"oreManganese");
            initOreDict(blockManganese,"blockManganese");
            initOreDict(itemIngotManganese,"ingotManganese");
            initOreDict(itemDustManganese,"dustManganese");
        }
        if(registerMolybdenum)
        {
            blockOreMolybdenum = new BlockEXOre(Material.rock,3.0f,5.0f,"molybdenumOre");
            blockMolybdenum = new BlockEXOre(Material.iron,3.0f,5.0f,"molybdenumBlock");
            itemIngotMolybdenum = new ItemEXOre("molybdenumIngot");
            itemDustMolybdenum = new ItemEXOre("molybdenumDust");
            GameRegistry.registerBlock(blockOreMolybdenum,"molybdenumOre");
            GameRegistry.registerBlock(blockMolybdenum,"molybdenumBlock");
            GameRegistry.registerItem(itemIngotMolybdenum,"molybdenumIngot");
            GameRegistry.registerItem(itemDustMolybdenum,"molybdenumDust");
            initOreDict(blockOreMolybdenum,"oreMolybdenum");
            initOreDict(blockMolybdenum,"blockMolybdenum");
            initOreDict(itemIngotMolybdenum,"ingotMolybdenum");
            initOreDict(itemDustMolybdenum,"dustMolybdenum");
        }
        if(registerAluminum)
        {
            blockOreAluminum = new BlockEXOre(Material.rock,3.0f,5.0f,"aluminumOre");
            blockAluminum = new BlockEXOre(Material.iron,3.0f,5.0f,"aluminumBlock");
            itemIngotAluminum = new ItemEXOre("aluminumIngot");
            itemDustAluminum = new ItemEXOre("aluminumDust");
            GameRegistry.registerBlock(blockOreAluminum,"aluminumOre");
            GameRegistry.registerBlock(blockAluminum,"aluminumBlock");
            GameRegistry.registerItem(itemIngotAluminum,"aluminumIngot");
            GameRegistry.registerItem(itemDustAluminum,"aluminumDust");
            initOreDict(blockOreAluminum,"oreAluminum");
            initOreDict(blockAluminum,"blockAluminum");
            initOreDict(itemIngotAluminum,"ingotAluminum");
            initOreDict(itemDustAluminum,"dustAluminum");
        }
        if(registerSilver)
        {
            blockOreSilver = new BlockEXOre(Material.rock,3.0f,5.0f,"silverOre");
            blockSilver = new BlockEXOre(Material.iron,3.0f,5.0f,"silverBlock");
            itemIngotSilver = new ItemEXOre("silverIngot");
            itemDustSilver = new ItemEXOre("silverDust");
            GameRegistry.registerBlock(blockOreSilver,"silverOre");
            GameRegistry.registerBlock(blockSilver,"silverBlock");
            GameRegistry.registerItem(itemIngotSilver,"silverIngot");
            GameRegistry.registerItem(itemDustSilver,"silverDust");
            initOreDict(blockOreSilver,"oreSilver");
            initOreDict(blockSilver,"blockSilver");
            initOreDict(itemIngotSilver,"ingotSilver");
            initOreDict(itemDustSilver,"dustSilver");
        }
        if(registerLead)
        {
            blockOreLead = new BlockEXOre(Material.rock,3.0f,5.0f,"leadOre");
            blockLead = new BlockEXOre(Material.iron,3.0f,5.0f,"leadBlock");
            itemIngotLead = new ItemEXOre("leadIngot");
            itemDustLead = new ItemEXOre("leadDust");
            GameRegistry.registerBlock(blockOreLead,"leadOre");
            GameRegistry.registerBlock(blockLead,"leadBlock");
            GameRegistry.registerItem(itemIngotLead,"leadIngot");
            GameRegistry.registerItem(itemDustLead,"leadDust");
            initOreDict(blockOreLead,"oreLead");
            initOreDict(blockLead,"blockLead");
            initOreDict(itemIngotLead,"ingotLead");
            initOreDict(itemDustLead,"dustLead");
        }
        if(registerPlatinum)
        {
            blockOrePlatinum = new BlockEXOre(Material.rock,3.0f,5.0f,"platinumOre");
            blockPlatinum = new BlockEXOre(Material.iron,3.0f,5.0f,"platinumBlock");
            itemIngotPlatinum = new ItemEXOre("platinumIngot");
            itemDustPlatinum = new ItemEXOre("platinumDust");
            GameRegistry.registerBlock(blockOrePlatinum,"platinumOre");
            GameRegistry.registerBlock(blockPlatinum,"platinumBlock");
            GameRegistry.registerItem(itemIngotPlatinum,"platinumIngot");
            GameRegistry.registerItem(itemDustPlatinum,"platinumDust");
            initOreDict(blockOrePlatinum,"orePlatinum");
            initOreDict(blockPlatinum,"blockPlatinum");
            initOreDict(itemIngotPlatinum,"ingotPlatinum");
            initOreDict(itemDustPlatinum,"dustPlatinum");
        }
        if(registerTungsten)
        {
            blockOreTungsten = new BlockEXOre(Material.rock,3.0f,5.0f,"tungstenOre");
            blockTungsten = new BlockEXOre(Material.iron,3.0f,5.0f,"tungstenBlock");
            itemIngotTungsten = new ItemEXOre("tungstenIngot");
            itemDustTungsten = new ItemEXOre("tungstenDust");
            GameRegistry.registerBlock(blockOreTungsten,"tungstenOre");
            GameRegistry.registerBlock(blockTungsten,"tungstenBlock");
            GameRegistry.registerItem(itemIngotTungsten,"tungstenIngot");
            GameRegistry.registerItem(itemDustTungsten,"tungstenDust");
            initOreDict(blockOreTungsten,"oreTungsten");
            initOreDict(blockTungsten,"blockTungsten");
            initOreDict(itemIngotTungsten,"ingotTungsten");
            initOreDict(itemDustTungsten,"dustTungsten");
        }
        if(registerVanadium)
        {
            blockOreVanadium = new BlockEXOre(Material.rock,3.0f,5.0f,"vanadiumOre");
            blockVanadium = new BlockEXOre(Material.iron,3.0f,5.0f,"vanadiumBlock");
            itemIngotVanadium = new ItemEXOre("vanadiumIngot");
            itemDustVanadium = new ItemEXOre("vanadiumDust");
            GameRegistry.registerBlock(blockOreVanadium,"vanadiumOre");
            GameRegistry.registerBlock(blockVanadium,"vanadiumBlock");
            GameRegistry.registerItem(itemIngotVanadium,"vanadiumIngot");
            GameRegistry.registerItem(itemDustVanadium,"vanadiumDust");
            initOreDict(blockOreVanadium,"oreVanadium");
            initOreDict(blockVanadium,"blockVanadium");
            initOreDict(itemIngotVanadium,"ingotVanadium");
            initOreDict(itemDustVanadium,"dustVanadium");
        }
        if(registerZinc)
        {
            blockOreZinc = new BlockEXOre(Material.rock,3.0f,5.0f,"zincOre");
            blockZinc = new BlockEXOre(Material.iron,3.0f,5.0f,"zincBlock");
            itemIngotZinc = new ItemEXOre("zincIngot");
            itemDustZinc = new ItemEXOre("zincDust");
            GameRegistry.registerBlock(blockOreZinc,"zincOre");
            GameRegistry.registerBlock(blockZinc,"zincBlock");
            GameRegistry.registerItem(itemIngotZinc,"zincIngot");
            GameRegistry.registerItem(itemDustZinc,"zincDust");
            initOreDict(blockOreZinc,"oreZinc");
            initOreDict(blockZinc,"blockZinc");
            initOreDict(itemIngotZinc,"ingotZinc");
            initOreDict(itemDustZinc,"dustZinc");
        }
        if(registerZirconium)
        {
            blockOreZirconium = new BlockEXOre(Material.rock,3.0f,5.0f,"zirconiumOre");
            blockZirconium = new BlockEXOre(Material.iron,3.0f,5.0f,"zirconiumBlock");
            itemIngotZirconium = new ItemEXOre("zirconiumIngot");
            itemDustZirconium = new ItemEXOre("zirconiumDust");
            GameRegistry.registerBlock(blockOreZirconium,"zirconiumOre");
            GameRegistry.registerBlock(blockZirconium,"zirconiumBlock");
            GameRegistry.registerItem(itemIngotZirconium,"zirconiumIngot");
            GameRegistry.registerItem(itemDustZirconium,"zirconiumDust");
            initOreDict(blockOreZirconium,"oreZirconium");
            initOreDict(blockZirconium,"blockZirconium");
            initOreDict(itemIngotZirconium,"ingotZirconium");
            initOreDict(itemDustZirconium,"dustZirconium");
        }
        if(registerNiobium)
        {
            blockOreNiobium = new BlockEXOre(Material.rock,3.0f,5.0f,"niobiumOre");
            blockNiobium = new BlockEXOre(Material.iron,3.0f,5.0f,"niobiumBlock");
            itemIngotNiobium = new ItemEXOre("niobiumIngot");
            itemDustNiobium = new ItemEXOre("niobiumDust");
            GameRegistry.registerBlock(blockOreNiobium,"niobiumOre");
            GameRegistry.registerBlock(blockNiobium,"niobiumBlock");
            GameRegistry.registerItem(itemIngotNiobium,"niobiumIngot");
            GameRegistry.registerItem(itemDustNiobium,"niobiumDust");
            initOreDict(blockOreNiobium,"oreNiobium");
            initOreDict(blockNiobium,"blockNiobium");
            initOreDict(itemIngotNiobium,"ingotNiobium");
            initOreDict(itemDustNiobium,"dustNiobium");
        }
        if(registerTechnetium)
        {
            blockOreTechnetium = new BlockEXOre(Material.rock,3.0f,5.0f,"technetiumOre");
            blockTechnetium = new BlockEXOre(Material.iron,3.0f,5.0f,"technetiumBlock");
            itemIngotTechnetium = new ItemEXOre("technetiumIngot");
            itemDustTechnetium = new ItemEXOre("technetiumDust");
            GameRegistry.registerBlock(blockOreTechnetium,"technetiumOre");
            GameRegistry.registerBlock(blockTechnetium,"technetiumBlock");
            GameRegistry.registerItem(itemIngotTechnetium,"technetiumIngot");
            GameRegistry.registerItem(itemDustTechnetium,"technetiumDust");
            initOreDict(blockOreTechnetium,"oreTechnetium");
            initOreDict(blockTechnetium,"blockTechnetium");
            initOreDict(itemIngotTechnetium,"ingotTechnetium");
            initOreDict(itemDustTechnetium,"dustTechnetium");
        }
        if(registerRuthenium)
        {
            blockOreRuthenium = new BlockEXOre(Material.rock,3.0f,5.0f,"rutheniumOre");
            blockRuthenium = new BlockEXOre(Material.iron,3.0f,5.0f,"rutheniumBlock");
            itemIngotRuthenium = new ItemEXOre("rutheniumIngot");
            itemDustRuthenium = new ItemEXOre("rutheniumDust");
            GameRegistry.registerBlock(blockOreRuthenium,"rutheniumOre");
            GameRegistry.registerBlock(blockRuthenium,"rutheniumBlock");
            GameRegistry.registerItem(itemIngotRuthenium,"rutheniumIngot");
            GameRegistry.registerItem(itemDustRuthenium,"rutheniumDust");
            initOreDict(blockOreRuthenium,"oreRuthenium");
            initOreDict(blockRuthenium,"blockRuthenium");
            initOreDict(itemIngotRuthenium,"ingotRuthenium");
            initOreDict(itemDustRuthenium,"dustRuthenium");
        }
        if(registerRhodium)
        {
            blockOreRhodium = new BlockEXOre(Material.rock,3.0f,5.0f,"rhodiumOre");
            blockRhodium = new BlockEXOre(Material.iron,3.0f,5.0f,"rhodiumBlock");
            itemIngotRhodium = new ItemEXOre("rhodiumIngot");
            itemDustRhodium = new ItemEXOre("rhodiumDust");
            GameRegistry.registerBlock(blockOreRhodium,"rhodiumOre");
            GameRegistry.registerBlock(blockRhodium,"rhodiumBlock");
            GameRegistry.registerItem(itemIngotRhodium,"rhodiumIngot");
            GameRegistry.registerItem(itemDustRhodium,"rhodiumDust");
            initOreDict(blockOreRhodium,"oreRhodium");
            initOreDict(blockRhodium,"blockRhodium");
            initOreDict(itemIngotRhodium,"ingotRhodium");
            initOreDict(itemDustRhodium,"dustRhodium");
        }
        if(registerPalladium)
        {
            blockOrePalladium = new BlockEXOre(Material.rock,3.0f,5.0f,"palladiumOre");
            blockPalladium = new BlockEXOre(Material.iron,3.0f,5.0f,"palladiumBlock");
            itemIngotPalladium = new ItemEXOre("palladiumIngot");
            itemDustPalladium = new ItemEXOre("palladiumDust");
            GameRegistry.registerBlock(blockOrePalladium,"palladiumOre");
            GameRegistry.registerBlock(blockPalladium,"palladiumBlock");
            GameRegistry.registerItem(itemIngotPalladium,"palladiumIngot");
            GameRegistry.registerItem(itemDustPalladium,"palladiumDust");
            initOreDict(blockOrePalladium,"orePalladium");
            initOreDict(blockPalladium,"blockPalladium");
            initOreDict(itemIngotPalladium,"ingotPalladium");
            initOreDict(itemDustPalladium,"dustPalladium");
        }
        if(registerCadmium)
        {
            blockOreCadmium = new BlockEXOre(Material.rock,3.0f,5.0f,"cadmiumOre");
            blockCadmium = new BlockEXOre(Material.iron,3.0f,5.0f,"cadmiumBlock");
            itemIngotCadmium = new ItemEXOre("cadmiumIngot");
            itemDustCadmium = new ItemEXOre("cadmiumDust");
            GameRegistry.registerBlock(blockOreCadmium,"cadmiumOre");
            GameRegistry.registerBlock(blockCadmium,"cadmiumBlock");
            GameRegistry.registerItem(itemIngotCadmium,"cadmiumIngot");
            GameRegistry.registerItem(itemDustCadmium,"cadmiumDust");
            initOreDict(blockOreCadmium,"oreCadmium");
            initOreDict(blockCadmium,"blockCadmium");
            initOreDict(itemIngotCadmium,"ingotCadmium");
            initOreDict(itemDustCadmium,"dustCadmium");
        }
        if(registerNeodymium)
        {
            blockOreNeodymium = new BlockEXOre(Material.rock,3.0f,5.0f,"neodymiumOre");
            blockNeodymium = new BlockEXOre(Material.iron,3.0f,5.0f,"neodymiumBlock");
            itemIngotNeodymium = new ItemEXOre("neodymiumIngot");
            itemDustNeodymium = new ItemEXOre("neodymiumDust");
            GameRegistry.registerBlock(blockOreNeodymium,"neodymiumOre");
            GameRegistry.registerBlock(blockNeodymium,"neodymiumBlock");
            GameRegistry.registerItem(itemIngotNeodymium,"neodymiumIngot");
            GameRegistry.registerItem(itemDustNeodymium,"neodymiumDust");
            initOreDict(blockOreNeodymium,"oreNeodymium");
            initOreDict(blockNeodymium,"blockNeodymium");
            initOreDict(itemIngotNeodymium,"ingotNeodymium");
            initOreDict(itemDustNeodymium,"dustNeodymium");
        }
        if(registerBismuth)
        {
            blockOreBismuth = new BlockEXOre(Material.rock,3.0f,5.0f,"bismuthOre");
            blockBismuth = new BlockEXOre(Material.iron,3.0f,5.0f,"bismuthBlock");
            itemIngotBismuth = new ItemEXOre("bismuthIngot");
            itemDustBismuth = new ItemEXOre("bismuthDust");
            GameRegistry.registerBlock(blockOreBismuth,"bismuthOre");
            GameRegistry.registerBlock(blockBismuth,"bismuthBlock");
            GameRegistry.registerItem(itemIngotBismuth,"bismuthIngot");
            GameRegistry.registerItem(itemDustBismuth,"bismuthDust");
            initOreDict(blockOreBismuth,"oreBismuth");
            initOreDict(blockBismuth,"blockBismuth");
            initOreDict(itemIngotBismuth,"ingotBismuth");
            initOreDict(itemDustBismuth,"dustBismuth");
        }
        if(registerGallium)
        {
            blockOreGallium = new BlockEXOre(Material.rock,3.0f,5.0f,"galliumOre");
            blockGallium = new BlockEXOre(Material.iron,3.0f,5.0f,"galliumBlock");
            itemIngotGallium = new ItemEXOre("galliumIngot");
            itemDustGallium = new ItemEXOre("galliumDust");
            GameRegistry.registerBlock(blockOreGallium,"galliumOre");
            GameRegistry.registerBlock(blockGallium,"galliumBlock");
            GameRegistry.registerItem(itemIngotGallium,"galliumIngot");
            GameRegistry.registerItem(itemDustGallium,"galliumDust");
            initOreDict(blockOreGallium,"oreGallium");
            initOreDict(blockGallium,"blockGallium");
            initOreDict(itemIngotGallium,"ingotGallium");
            initOreDict(itemDustGallium,"dustGallium");
        }
        if(registerIndium)
        {
            blockOreIndium = new BlockEXOre(Material.rock,3.0f,5.0f,"indiumOre");
            blockIndium = new BlockEXOre(Material.iron,3.0f,5.0f,"indiumBlock");
            itemIngotIndium = new ItemEXOre("indiumIngot");
            itemDustIndium = new ItemEXOre("indiumDust");
            GameRegistry.registerBlock(blockOreIndium,"indiumOre");
            GameRegistry.registerBlock(blockIndium,"indiumBlock");
            GameRegistry.registerItem(itemIngotIndium,"indiumIngot");
            GameRegistry.registerItem(itemDustIndium,"indiumDust");
            initOreDict(blockOreIndium,"oreIndium");
            initOreDict(blockIndium,"blockIndium");
            initOreDict(itemIngotIndium,"ingotIndium");
            initOreDict(itemDustIndium,"dustIndium");
        }
        if(registerThallium)
        {
            blockOreThallium = new BlockEXOre(Material.rock,3.0f,5.0f,"thalliumOre");
            blockThallium = new BlockEXOre(Material.iron,3.0f,5.0f,"thalliumBlock");
            itemIngotThallium = new ItemEXOre("thalliumIngot");
            itemDustThallium = new ItemEXOre("thalliumDust");
            GameRegistry.registerBlock(blockOreThallium,"thalliumOre");
            GameRegistry.registerBlock(blockThallium,"thalliumBlock");
            GameRegistry.registerItem(itemIngotThallium,"thalliumIngot");
            GameRegistry.registerItem(itemDustThallium,"thalliumDust");
            initOreDict(blockOreThallium,"oreThallium");
            initOreDict(blockThallium,"blockThallium");
            initOreDict(itemIngotThallium,"ingotThallium");
            initOreDict(itemDustThallium,"dustThallium");
        }
        if(registerTitanium)
        {
            blockOreTitanium = new BlockEXOre(Material.rock,3.0f,5.0f,"titaniumOre");
            blockTitanium = new BlockEXOre(Material.iron,3.0f,5.0f,"titaniumBlock");
            itemIngotTitanium = new ItemEXOre("titaniumIngot");
            itemDustTitanium = new ItemEXOre("titaniumDust");
            GameRegistry.registerBlock(blockOreTitanium,"titaniumOre");
            GameRegistry.registerBlock(blockTitanium,"titaniumBlock");
            GameRegistry.registerItem(itemIngotTitanium,"titaniumIngot");
            GameRegistry.registerItem(itemDustTitanium,"titaniumDust");
            initOreDict(blockOreTitanium,"oreTitanium");
            initOreDict(blockTitanium,"blockTitanium");
            initOreDict(itemIngotTitanium,"ingotTitanium");
            initOreDict(itemDustTitanium,"dustTitanium");
        }
        if(registerNickel)
        {
            blockOreNickel = new BlockEXOre(Material.rock,3.0f,5.0f,"nickelOre");
            blockNickel = new BlockEXOre(Material.iron,3.0f,5.0f,"nickelBlock");
            itemIngotNickel = new ItemEXOre("nickelIngot");
            itemDustNickel = new ItemEXOre("nickelDust");
            GameRegistry.registerBlock(blockOreNickel,"nickelOre");
            GameRegistry.registerBlock(blockNickel,"nickelBlock");
            GameRegistry.registerItem(itemIngotNickel,"nickelIngot");
            GameRegistry.registerItem(itemDustNickel,"nickelDust");
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
}

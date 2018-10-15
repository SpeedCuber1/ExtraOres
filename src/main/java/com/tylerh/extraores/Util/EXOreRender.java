package com.tylerh.extraores.Util;

import com.tylerh.extraores.Init.InitBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Tyler on 4/29/2016.
 */
public class EXOreRender
{
    public static void initBlockRender()
    {
        if(InitBlocks.registerCopper)
        {
            Item itemBlockCopper = Item.getItemFromBlock(InitBlocks.blockOreCopper);
            ResourceLocation location = new ResourceLocation("extraores:copperOre");
            Register(itemBlockCopper,location.toString());
            itemBlockCopper = Item.getItemFromBlock(InitBlocks.blockCopper);
            location = new ResourceLocation("extraores:copperBlock");
            Register(itemBlockCopper,location.toString());
        }
        if(InitBlocks.registerTin)
        {
            Item itemBlockTin = Item.getItemFromBlock(InitBlocks.blockOreTin);
            ResourceLocation location = new ResourceLocation("extraores:tinOre");
            Register(itemBlockTin,location.toString());
            itemBlockTin = Item.getItemFromBlock(InitBlocks.blockTin);
            location = new ResourceLocation("extraores:tinBlock");
            Register(itemBlockTin,location.toString());
        }
        if(InitBlocks.registerChromium)
        {
            Item itemBlockChromium = Item.getItemFromBlock(InitBlocks.blockOreChromium);
            ResourceLocation location = new ResourceLocation("extraores:chromiumOre");
            Register(itemBlockChromium,location.toString());
            itemBlockChromium = Item.getItemFromBlock(InitBlocks.blockChromium);
            location = new ResourceLocation("extraores:chromiumBlock");
            Register(itemBlockChromium,location.toString());
        }
        if(InitBlocks.registerCobalt)
        {
            Item itemBlockCobalt = Item.getItemFromBlock(InitBlocks.blockOreCobalt);
            ResourceLocation location = new ResourceLocation("extraores:cobaltOre");
            Register(itemBlockCobalt,location.toString());
            itemBlockCobalt = Item.getItemFromBlock(InitBlocks.blockCobalt);
            location = new ResourceLocation("extraores:cobaltBlock");
            Register(itemBlockCobalt,location.toString());
        }
        if(InitBlocks.registerUnobtainium)
        {
            Item itemBlockUnobtainium = Item.getItemFromBlock(InitBlocks.blockOreUnobtainium);
            ResourceLocation location = new ResourceLocation("extraores:unobtainiumOre");
            Register(itemBlockUnobtainium,location.toString());
            itemBlockUnobtainium = Item.getItemFromBlock(InitBlocks.blockUnobtainium);
            location = new ResourceLocation("extraores:unobtainiumBlock");
            Register(itemBlockUnobtainium,location.toString());
        }
        if(InitBlocks.registerManganese)
        {
            Item itemBlockManganese = Item.getItemFromBlock(InitBlocks.blockOreManganese);
            ResourceLocation location = new ResourceLocation("extraores:manganeseOre");
            Register(itemBlockManganese,location.toString());
            itemBlockManganese = Item.getItemFromBlock(InitBlocks.blockManganese);
            location = new ResourceLocation("extraores:manganeseBlock");
            Register(itemBlockManganese,location.toString());
        }
        if(InitBlocks.registerMolybdenum)
        {
            Item itemBlockMolybdenum = Item.getItemFromBlock(InitBlocks.blockOreMolybdenum);
            ResourceLocation location = new ResourceLocation("extraores:molybdenumOre");
            Register(itemBlockMolybdenum,location.toString());
            itemBlockMolybdenum = Item.getItemFromBlock(InitBlocks.blockMolybdenum);
            location = new ResourceLocation("extraores:molybdenumBlock");
            Register(itemBlockMolybdenum,location.toString());
        }
        if(InitBlocks.registerAluminum)
        {
            Item itemBlockAluminum = Item.getItemFromBlock(InitBlocks.blockOreAluminum);
            ResourceLocation location = new ResourceLocation("extraores:aluminumOre");
            Register(itemBlockAluminum,location.toString());
            itemBlockAluminum = Item.getItemFromBlock(InitBlocks.blockAluminum);
            location = new ResourceLocation("extraores:aluminumBlock");
            Register(itemBlockAluminum,location.toString());
        }
        if(InitBlocks.registerSilver)
        {
            Item itemBlockSilver = Item.getItemFromBlock(InitBlocks.blockOreSilver);
            ResourceLocation location = new ResourceLocation("extraores:silverOre");
            Register(itemBlockSilver,location.toString());
            itemBlockSilver = Item.getItemFromBlock(InitBlocks.blockSilver);
            location = new ResourceLocation("extraores:silverBlock");
            Register(itemBlockSilver,location.toString());
        }
        if(InitBlocks.registerLead)
        {
            Item itemBlockLead = Item.getItemFromBlock(InitBlocks.blockOreLead);
            ResourceLocation location = new ResourceLocation("extraores:leadOre");
            Register(itemBlockLead,location.toString());
            itemBlockLead = Item.getItemFromBlock(InitBlocks.blockLead);
            location = new ResourceLocation("extraores:leadBlock");
            Register(itemBlockLead,location.toString());
        }
        if(InitBlocks.registerPlatinum)
        {
            Item itemBlockPlatinum = Item.getItemFromBlock(InitBlocks.blockOrePlatinum);
            ResourceLocation location = new ResourceLocation("extraores:platinumOre");
            Register(itemBlockPlatinum,location.toString());
            itemBlockPlatinum = Item.getItemFromBlock(InitBlocks.blockPlatinum);
            location = new ResourceLocation("extraores:platinumBlock");
            Register(itemBlockPlatinum,location.toString());
        }
        if(InitBlocks.registerTungsten)
        {
            Item itemBlockTungsten = Item.getItemFromBlock(InitBlocks.blockOreTungsten);
            ResourceLocation location = new ResourceLocation("extraores:tungstenOre");
            Register(itemBlockTungsten,location.toString());
            itemBlockTungsten = Item.getItemFromBlock(InitBlocks.blockTungsten);
            location = new ResourceLocation("extraores:tungstenBlock");
            Register(itemBlockTungsten,location.toString());
        }
        if(InitBlocks.registerVanadium)
        {
            Item itemBlockVanadium = Item.getItemFromBlock(InitBlocks.blockOreVanadium);
            ResourceLocation location = new ResourceLocation("extraores:vanadiumOre");
            Register(itemBlockVanadium,location.toString());
            itemBlockVanadium = Item.getItemFromBlock(InitBlocks.blockVanadium);
            location = new ResourceLocation("extraores:vanadiumBlock");
            Register(itemBlockVanadium,location.toString());
        }
        if(InitBlocks.registerZinc)
        {
            Item itemBlockZinc = Item.getItemFromBlock(InitBlocks.blockOreZinc);
            ResourceLocation location = new ResourceLocation("extraores:zincOre");
            Register(itemBlockZinc,location.toString());
            itemBlockZinc = Item.getItemFromBlock(InitBlocks.blockZinc);
            location = new ResourceLocation("extraores:zincBlock");
            Register(itemBlockZinc,location.toString());
        }
        if(InitBlocks.registerZirconium)
        {
            Item itemBlockZirconium = Item.getItemFromBlock(InitBlocks.blockOreZirconium);
            ResourceLocation location = new ResourceLocation("extraores:zirconiumOre");
            Register(itemBlockZirconium,location.toString());
            itemBlockZirconium = Item.getItemFromBlock(InitBlocks.blockZirconium);
            location = new ResourceLocation("extraores:zirconiumBlock");
            Register(itemBlockZirconium,location.toString());
        }
        if(InitBlocks.registerNiobium)
        {
            Item itemBlockNiobium = Item.getItemFromBlock(InitBlocks.blockOreNiobium);
            ResourceLocation location = new ResourceLocation("extraores:niobiumOre");
            Register(itemBlockNiobium,location.toString());
            itemBlockNiobium = Item.getItemFromBlock(InitBlocks.blockNiobium);
            location = new ResourceLocation("extraores:niobiumBlock");
            Register(itemBlockNiobium,location.toString());
        }
        if(InitBlocks.registerTechnetium)
        {
            Item itemBlockTechnetium = Item.getItemFromBlock(InitBlocks.blockOreTechnetium);
            ResourceLocation location = new ResourceLocation("extraores:technetiumOre");
            Register(itemBlockTechnetium,location.toString());
            itemBlockTechnetium = Item.getItemFromBlock(InitBlocks.blockTechnetium);
            location = new ResourceLocation("extraores:technetiumBlock");
            Register(itemBlockTechnetium,location.toString());
        }
        if(InitBlocks.registerRuthenium)
        {
            Item itemBlockRuthenium = Item.getItemFromBlock(InitBlocks.blockOreRuthenium);
            ResourceLocation location = new ResourceLocation("extraores:rutheniumOre");
            Register(itemBlockRuthenium,location.toString());
            itemBlockRuthenium = Item.getItemFromBlock(InitBlocks.blockRuthenium);
            location = new ResourceLocation("extraores:rutheniumBlock");
            Register(itemBlockRuthenium,location.toString());
        }
        if(InitBlocks.registerRhodium)
        {
            Item itemBlockRhodium = Item.getItemFromBlock(InitBlocks.blockOreRhodium);
            ResourceLocation location = new ResourceLocation("extraores:rhodiumOre");
            Register(itemBlockRhodium,location.toString());
            itemBlockRhodium = Item.getItemFromBlock(InitBlocks.blockRhodium);
            location = new ResourceLocation("extraores:rhodiumBlock");
            Register(itemBlockRhodium,location.toString());
        }
        if(InitBlocks.registerPalladium)
        {
            Item itemBlockPalladium = Item.getItemFromBlock(InitBlocks.blockOrePalladium);
            ResourceLocation location = new ResourceLocation("extraores:palladiumOre");
            Register(itemBlockPalladium,location.toString());
            itemBlockPalladium = Item.getItemFromBlock(InitBlocks.blockPalladium);
            location = new ResourceLocation("extraores:palladiumBlock");
            Register(itemBlockPalladium,location.toString());
        }
        if(InitBlocks.registerCadmium)
        {
            Item itemBlockCadmium = Item.getItemFromBlock(InitBlocks.blockOreCadmium);
            ResourceLocation location = new ResourceLocation("extraores:cadmiumOre");
            Register(itemBlockCadmium,location.toString());
            itemBlockCadmium = Item.getItemFromBlock(InitBlocks.blockCadmium);
            location = new ResourceLocation("extraores:cadmiumBlock");
            Register(itemBlockCadmium,location.toString());
        }
        if(InitBlocks.registerNeodymium)
        {
            Item itemBlockNeodymium = Item.getItemFromBlock(InitBlocks.blockOreNeodymium);
            ResourceLocation location = new ResourceLocation("extraores:neodymiumOre");
            Register(itemBlockNeodymium,location.toString());
            itemBlockNeodymium = Item.getItemFromBlock(InitBlocks.blockNeodymium);
            location = new ResourceLocation("extraores:neodymiumBlock");
            Register(itemBlockNeodymium,location.toString());
        }
        if(InitBlocks.registerBismuth)
        {
            Item itemBlockBismuth = Item.getItemFromBlock(InitBlocks.blockOreBismuth);
            ResourceLocation location = new ResourceLocation("extraores:bismuthOre");
            Register(itemBlockBismuth,location.toString());
            itemBlockBismuth = Item.getItemFromBlock(InitBlocks.blockBismuth);
            location = new ResourceLocation("extraores:bismuthBlock");
            Register(itemBlockBismuth,location.toString());
        }
        if(InitBlocks.registerGallium)
        {
            Item itemBlockGallium = Item.getItemFromBlock(InitBlocks.blockOreGallium);
            ResourceLocation location = new ResourceLocation("extraores:galliumOre");
            Register(itemBlockGallium,location.toString());
            itemBlockGallium = Item.getItemFromBlock(InitBlocks.blockGallium);
            location = new ResourceLocation("extraores:galliumBlock");
            Register(itemBlockGallium,location.toString());
        }
        if(InitBlocks.registerIndium)
        {
            Item itemBlockIndium = Item.getItemFromBlock(InitBlocks.blockOreIndium);
            ResourceLocation location = new ResourceLocation("extraores:indiumOre");
            Register(itemBlockIndium,location.toString());
            itemBlockIndium = Item.getItemFromBlock(InitBlocks.blockIndium);
            location = new ResourceLocation("extraores:indiumBlock");
            Register(itemBlockIndium,location.toString());
        }
        if(InitBlocks.registerThallium)
        {
            Item itemBlockThallium = Item.getItemFromBlock(InitBlocks.blockOreThallium);
            ResourceLocation location = new ResourceLocation("extraores:thalliumOre");
            Register(itemBlockThallium,location.toString());
            itemBlockThallium = Item.getItemFromBlock(InitBlocks.blockThallium);
            location = new ResourceLocation("extraores:thalliumBlock");
            Register(itemBlockThallium,location.toString());
        }
        if(InitBlocks.registerTitanium)
        {
            Item itemBlockTitanium = Item.getItemFromBlock(InitBlocks.blockOreTitanium);
            ResourceLocation location = new ResourceLocation("extraores:titaniumOre");
            Register(itemBlockTitanium,location.toString());
            itemBlockTitanium = Item.getItemFromBlock(InitBlocks.blockTitanium);
            location = new ResourceLocation("extraores:titaniumBlock");
            Register(itemBlockTitanium,location.toString());
        }
        if(InitBlocks.registerNickel)
        {
            Item itemBlockNickel = Item.getItemFromBlock(InitBlocks.blockOreNickel);
            ResourceLocation location = new ResourceLocation("extraores:nickelOre");
            Register(itemBlockNickel,location.toString());
            itemBlockNickel = Item.getItemFromBlock(InitBlocks.blockNickel);
            location = new ResourceLocation("extraores:nickelBlock");
            Register(itemBlockNickel,location.toString());
        }
        if(InitBlocks.registerAdamantine)
        {
            Item itemBlockAdamantine = Item.getItemFromBlock(InitBlocks.blockOreAdamantine);
            ResourceLocation location = new ResourceLocation("extraores:adamantineOre");
            Register(itemBlockAdamantine,location.toString());
            itemBlockAdamantine = Item.getItemFromBlock(InitBlocks.blockAdamantine);
            location = new ResourceLocation("extraores:adamantineBlock");
            Register(itemBlockAdamantine,location.toString());
        }
        if(InitBlocks.registerAldourite)
        {
            Item itemBlockAldourite = Item.getItemFromBlock(InitBlocks.blockOreAldourite);
            ResourceLocation location = new ResourceLocation("extraores:aldouriteOre");
            Register(itemBlockAldourite,location.toString());
            itemBlockAldourite = Item.getItemFromBlock(InitBlocks.blockAldourite);
            location = new ResourceLocation("extraores:aldouriteBlock");
            Register(itemBlockAldourite,location.toString());
        }
        if(InitBlocks.registerAstralSilver)
        {
            Item itemBlockAstralSilver = Item.getItemFromBlock(InitBlocks.blockOreAstralSilver);
            ResourceLocation location = new ResourceLocation("extraores:astralSilverOre");
            Register(itemBlockAstralSilver,location.toString());
            itemBlockAstralSilver = Item.getItemFromBlock(InitBlocks.blockAstralSilver);
            location = new ResourceLocation("extraores:astralSilverBlock");
            Register(itemBlockAstralSilver,location.toString());
        }
        if(InitBlocks.registerAtlarus)
        {
            Item itemBlockAtlarus = Item.getItemFromBlock(InitBlocks.blockOreAtlarus);
            ResourceLocation location = new ResourceLocation("extraores:atlarusOre");
            Register(itemBlockAtlarus,location.toString());
            itemBlockAtlarus = Item.getItemFromBlock(InitBlocks.blockAtlarus);
            location = new ResourceLocation("extraores:atlarusBlock");
            Register(itemBlockAtlarus,location.toString());
        }
        if(InitBlocks.registerCarmot)
        {
            Item itemBlockCarmot = Item.getItemFromBlock(InitBlocks.blockOreCarmot);
            ResourceLocation location = new ResourceLocation("extraores:carmotOre");
            Register(itemBlockCarmot,location.toString());
            itemBlockCarmot = Item.getItemFromBlock(InitBlocks.blockCarmot);
            location = new ResourceLocation("extraores:carmotBlock");
            Register(itemBlockCarmot,location.toString());
        }
        if(InitBlocks.registerCeruclase)
        {
            Item itemBlockCeruclase = Item.getItemFromBlock(InitBlocks.blockOreCeruclase);
            ResourceLocation location = new ResourceLocation("extraores:ceruclaseOre");
            Register(itemBlockCeruclase,location.toString());
            itemBlockCeruclase = Item.getItemFromBlock(InitBlocks.blockCeruclase);
            location = new ResourceLocation("extraores:ceruclaseBlock");
            Register(itemBlockCeruclase,location.toString());
        }
        if(InitBlocks.registerDeepIron)
        {
            Item itemBlockDeepIron = Item.getItemFromBlock(InitBlocks.blockOreDeepIron);
            ResourceLocation location = new ResourceLocation("extraores:deepIronOre");
            Register(itemBlockDeepIron,location.toString());
            itemBlockDeepIron = Item.getItemFromBlock(InitBlocks.blockDeepIron);
            location = new ResourceLocation("extraores:deepIronBlock");
            Register(itemBlockDeepIron,location.toString());
        }
        if(InitBlocks.registerIgnatius)
        {
            Item itemBlockIgnatius = Item.getItemFromBlock(InitBlocks.blockOreIgnatius);
            ResourceLocation location = new ResourceLocation("extraores:ignatiusOre");
            Register(itemBlockIgnatius,location.toString());
            itemBlockIgnatius = Item.getItemFromBlock(InitBlocks.blockIgnatius);
            location = new ResourceLocation("extraores:ignatiusBlock");
            Register(itemBlockIgnatius,location.toString());
        }
        if(InitBlocks.registerInfuscolium)
        {
            Item itemBlockInfuscolium = Item.getItemFromBlock(InitBlocks.blockOreInfuscolium);
            ResourceLocation location = new ResourceLocation("extraores:infuscoliumOre");
            Register(itemBlockInfuscolium,location.toString());
            itemBlockInfuscolium = Item.getItemFromBlock(InitBlocks.blockInfuscolium);
            location = new ResourceLocation("extraores:infuscoliumBlock");
            Register(itemBlockInfuscolium,location.toString());
        }
        if(InitBlocks.registerKalendrite)
        {
            Item itemBlockKalendrite = Item.getItemFromBlock(InitBlocks.blockOreKalendrite);
            ResourceLocation location = new ResourceLocation("extraores:kalendriteOre");
            Register(itemBlockKalendrite,location.toString());
            itemBlockKalendrite = Item.getItemFromBlock(InitBlocks.blockKalendrite);
            location = new ResourceLocation("extraores:kalendriteBlock");
            Register(itemBlockKalendrite,location.toString());
        }
        if(InitBlocks.registerLemurite)
        {
            Item itemBlockLemurite = Item.getItemFromBlock(InitBlocks.blockOreLemurite);
            ResourceLocation location = new ResourceLocation("extraores:lemuriteOre");
            Register(itemBlockLemurite,location.toString());
            itemBlockLemurite = Item.getItemFromBlock(InitBlocks.blockLemurite);
            location = new ResourceLocation("extraores:lemuriteBlock");
            Register(itemBlockLemurite,location.toString());
        }
        if(InitBlocks.registerMidasium)
        {
            Item itemBlockMidasium = Item.getItemFromBlock(InitBlocks.blockOreMidasium);
            ResourceLocation location = new ResourceLocation("extraores:midasiumOre");
            Register(itemBlockMidasium,location.toString());
            itemBlockMidasium = Item.getItemFromBlock(InitBlocks.blockMidasium);
            location = new ResourceLocation("extraores:midasiumBlock");
            Register(itemBlockMidasium,location.toString());
        }
        if(InitBlocks.registerMithril)
        {
            Item itemBlockMithril = Item.getItemFromBlock(InitBlocks.blockOreMithril);
            ResourceLocation location = new ResourceLocation("extraores:mithrilOre");
            Register(itemBlockMithril,location.toString());
            itemBlockMithril = Item.getItemFromBlock(InitBlocks.blockMithril);
            location = new ResourceLocation("extraores:mithrilBlock");
            Register(itemBlockMithril,location.toString());
        }
        if(InitBlocks.registerOrichalcum)
        {
            Item itemBlockOrichalcum = Item.getItemFromBlock(InitBlocks.blockOreOrichalcum);
            ResourceLocation location = new ResourceLocation("extraores:orichalcumOre");
            Register(itemBlockOrichalcum,location.toString());
            itemBlockOrichalcum = Item.getItemFromBlock(InitBlocks.blockOrichalcum);
            location = new ResourceLocation("extraores:orichalcumBlock");
            Register(itemBlockOrichalcum,location.toString());
        }
        if(InitBlocks.registerOureclase)
        {
            Item itemBlockOureclase = Item.getItemFromBlock(InitBlocks.blockOreOureclase);
            ResourceLocation location = new ResourceLocation("extraores:oureclaseOre");
            Register(itemBlockOureclase,location.toString());
            itemBlockOureclase = Item.getItemFromBlock(InitBlocks.blockOureclase);
            location = new ResourceLocation("extraores:oureclaseBlock");
            Register(itemBlockOureclase,location.toString());
        }
        if(InitBlocks.registerPrometheum)
        {
            Item itemBlockPrometheum = Item.getItemFromBlock(InitBlocks.blockOrePrometheum);
            ResourceLocation location = new ResourceLocation("extraores:prometheumOre");
            Register(itemBlockPrometheum,location.toString());
            itemBlockPrometheum = Item.getItemFromBlock(InitBlocks.blockPrometheum);
            location = new ResourceLocation("extraores:prometheumBlock");
            Register(itemBlockPrometheum,location.toString());
        }
        if(InitBlocks.registerRubracium)
        {
            Item itemBlockRubracium = Item.getItemFromBlock(InitBlocks.blockOreRubracium);
            ResourceLocation location = new ResourceLocation("extraores:rubraciumOre");
            Register(itemBlockRubracium,location.toString());
            itemBlockRubracium = Item.getItemFromBlock(InitBlocks.blockRubracium);
            location = new ResourceLocation("extraores:rubraciumBlock");
            Register(itemBlockRubracium,location.toString());
        }
        if(InitBlocks.registerSanguinite)
        {
            Item itemBlockSanguinite = Item.getItemFromBlock(InitBlocks.blockOreSanguinite);
            ResourceLocation location = new ResourceLocation("extraores:sanguiniteOre");
            Register(itemBlockSanguinite,location.toString());
            itemBlockSanguinite = Item.getItemFromBlock(InitBlocks.blockSanguinite);
            location = new ResourceLocation("extraores:sanguiniteBlock");
            Register(itemBlockSanguinite,location.toString());
        }
        if(InitBlocks.registerShadowIron)
        {
            Item itemBlockShadowIron = Item.getItemFromBlock(InitBlocks.blockOreShadowIron);
            ResourceLocation location = new ResourceLocation("extraores:shadowIronOre");
            Register(itemBlockShadowIron,location.toString());
            itemBlockShadowIron = Item.getItemFromBlock(InitBlocks.blockShadowIron);
            location = new ResourceLocation("extraores:shadowIronBlock");
            Register(itemBlockShadowIron,location.toString());
        }
        if(InitBlocks.registerVulcanite)
        {
            Item itemBlockVulcanite = Item.getItemFromBlock(InitBlocks.blockOreVulcanite);
            ResourceLocation location = new ResourceLocation("extraores:vulcaniteOre");
            Register(itemBlockVulcanite,location.toString());
            itemBlockVulcanite = Item.getItemFromBlock(InitBlocks.blockVulcanite);
            location = new ResourceLocation("extraores:vulcaniteBlock");
            Register(itemBlockVulcanite,location.toString());
        }
        if(InitBlocks.registerVyroxeres)
        {
            Item itemBlockVyroxeres = Item.getItemFromBlock(InitBlocks.blockOreVyroxeres);
            ResourceLocation location = new ResourceLocation("extraores:vyroxeresOre");
            Register(itemBlockVyroxeres,location.toString());
            itemBlockVyroxeres = Item.getItemFromBlock(InitBlocks.blockVyroxeres);
            location = new ResourceLocation("extraores:vyroxeresBlock");
            Register(itemBlockVyroxeres,location.toString());
        }
    }
    public static void initItemRender()
    {
        if(InitBlocks.registerCopper)
        {
            ResourceLocation location = new ResourceLocation("extraores:copperIngot");
            Register(InitBlocks.itemIngotCopper,location.toString());
            location = new ResourceLocation("extraores:copperDust");
            Register(InitBlocks.itemDustCopper,location.toString());
        }
        if(InitBlocks.registerTin)
        {
            ResourceLocation location = new ResourceLocation("extraores:tinIngot");
            Register(InitBlocks.itemIngotTin,location.toString());
            location = new ResourceLocation("extraores:tinDust");
            Register(InitBlocks.itemDustTin,location.toString());
        }
        if(InitBlocks.registerChromium)
        {
            ResourceLocation location = new ResourceLocation("extraores:chromiumIngot");
            Register(InitBlocks.itemIngotChromium,location.toString());
            location = new ResourceLocation("extraores:chromiumDust");
            Register(InitBlocks.itemDustChromium,location.toString());
        }
        if(InitBlocks.registerCobalt)
        {
            ResourceLocation location = new ResourceLocation("extraores:cobaltIngot");
            Register(InitBlocks.itemIngotCobalt,location.toString());
            location = new ResourceLocation("extraores:cobaltDust");
            Register(InitBlocks.itemDustCobalt,location.toString());
        }
        if(InitBlocks.registerUnobtainium)
        {
            ResourceLocation location = new ResourceLocation("extraores:unobtainiumIngot");
            Register(InitBlocks.itemIngotUnobtainium,location.toString());
            location = new ResourceLocation("extraores:unobtainiumDust");
            Register(InitBlocks.itemDustUnobtainium,location.toString());
        }
        if(InitBlocks.registerManganese)
        {
            ResourceLocation location = new ResourceLocation("extraores:manganeseIngot");
            Register(InitBlocks.itemIngotManganese,location.toString());
            location = new ResourceLocation("extraores:manganeseDust");
            Register(InitBlocks.itemDustManganese,location.toString());
        }
        if(InitBlocks.registerMolybdenum)
        {
            ResourceLocation location = new ResourceLocation("extraores:molybdenumIngot");
            Register(InitBlocks.itemIngotMolybdenum,location.toString());
            location = new ResourceLocation("extraores:molybdenumDust");
            Register(InitBlocks.itemDustMolybdenum,location.toString());
        }
        if(InitBlocks.registerAluminum)
        {
            ResourceLocation location = new ResourceLocation("extraores:aluminumIngot");
            Register(InitBlocks.itemIngotAluminum,location.toString());
            location = new ResourceLocation("extraores:aluminumDust");
            Register(InitBlocks.itemDustAluminum,location.toString());
        }
        if(InitBlocks.registerSilver)
        {
            ResourceLocation location = new ResourceLocation("extraores:silverIngot");
            Register(InitBlocks.itemIngotSilver,location.toString());
            location = new ResourceLocation("extraores:silverDust");
            Register(InitBlocks.itemDustSilver,location.toString());
        }
        if(InitBlocks.registerLead)
        {
            ResourceLocation location = new ResourceLocation("extraores:leadIngot");
            Register(InitBlocks.itemIngotLead,location.toString());
            location = new ResourceLocation("extraores:leadDust");
            Register(InitBlocks.itemDustLead,location.toString());
        }
        if(InitBlocks.registerPlatinum)
        {
            ResourceLocation location = new ResourceLocation("extraores:platinumIngot");
            Register(InitBlocks.itemIngotPlatinum,location.toString());
            location = new ResourceLocation("extraores:platinumDust");
            Register(InitBlocks.itemDustPlatinum,location.toString());
        }
        if(InitBlocks.registerTungsten)
        {
            ResourceLocation location = new ResourceLocation("extraores:tungstenIngot");
            Register(InitBlocks.itemIngotTungsten,location.toString());
            location = new ResourceLocation("extraores:tungstenDust");
            Register(InitBlocks.itemDustTungsten,location.toString());
        }
        if(InitBlocks.registerVanadium)
        {
            ResourceLocation location = new ResourceLocation("extraores:vanadiumIngot");
            Register(InitBlocks.itemIngotVanadium,location.toString());
            location = new ResourceLocation("extraores:vanadiumDust");
            Register(InitBlocks.itemDustVanadium,location.toString());
        }
        if(InitBlocks.registerZinc)
        {
            ResourceLocation location = new ResourceLocation("extraores:zincIngot");
            Register(InitBlocks.itemIngotZinc,location.toString());
            location = new ResourceLocation("extraores:zincDust");
            Register(InitBlocks.itemDustZinc,location.toString());
        }
        if(InitBlocks.registerZirconium)
        {
            ResourceLocation location = new ResourceLocation("extraores:zirconiumIngot");
            Register(InitBlocks.itemIngotZirconium,location.toString());
            location = new ResourceLocation("extraores:zirconiumDust");
            Register(InitBlocks.itemDustZirconium,location.toString());
        }
        if(InitBlocks.registerNiobium)
        {
            ResourceLocation location = new ResourceLocation("extraores:niobiumIngot");
            Register(InitBlocks.itemIngotNiobium,location.toString());
            location = new ResourceLocation("extraores:niobiumDust");
            Register(InitBlocks.itemDustNiobium,location.toString());
        }
        if(InitBlocks.registerTechnetium)
        {
            ResourceLocation location = new ResourceLocation("extraores:technetiumIngot");
            Register(InitBlocks.itemIngotTechnetium,location.toString());
            location = new ResourceLocation("extraores:technetiumDust");
            Register(InitBlocks.itemDustTechnetium,location.toString());
        }
        if(InitBlocks.registerRuthenium)
        {
            ResourceLocation location = new ResourceLocation("extraores:rutheniumIngot");
            Register(InitBlocks.itemIngotRuthenium,location.toString());
            location = new ResourceLocation("extraores:rutheniumDust");
            Register(InitBlocks.itemDustRuthenium,location.toString());
        }
        if(InitBlocks.registerRhodium)
        {
            ResourceLocation location = new ResourceLocation("extraores:rhodiumIngot");
            Register(InitBlocks.itemIngotRhodium,location.toString());
            location = new ResourceLocation("extraores:rhodiumDust");
            Register(InitBlocks.itemDustRhodium,location.toString());
        }
        if(InitBlocks.registerPalladium)
        {
            ResourceLocation location = new ResourceLocation("extraores:palladiumIngot");
            Register(InitBlocks.itemIngotPalladium,location.toString());
            location = new ResourceLocation("extraores:palladiumDust");
            Register(InitBlocks.itemDustPalladium,location.toString());
        }
        if(InitBlocks.registerCadmium)
        {
            ResourceLocation location = new ResourceLocation("extraores:cadmiumIngot");
            Register(InitBlocks.itemIngotCadmium,location.toString());
            location = new ResourceLocation("extraores:cadmiumDust");
            Register(InitBlocks.itemDustCadmium,location.toString());
        }
        if(InitBlocks.registerNeodymium)
        {
            ResourceLocation location = new ResourceLocation("extraores:neodymiumIngot");
            Register(InitBlocks.itemIngotNeodymium,location.toString());
            location = new ResourceLocation("extraores:neodymiumDust");
            Register(InitBlocks.itemDustNeodymium,location.toString());
        }
        if(InitBlocks.registerBismuth)
        {
            ResourceLocation location = new ResourceLocation("extraores:bismuthIngot");
            Register(InitBlocks.itemIngotBismuth,location.toString());
            location = new ResourceLocation("extraores:bismuthDust");
            Register(InitBlocks.itemDustBismuth,location.toString());
        }
        if(InitBlocks.registerGallium)
        {
            ResourceLocation location = new ResourceLocation("extraores:galliumIngot");
            Register(InitBlocks.itemIngotGallium,location.toString());
            location = new ResourceLocation("extraores:galliumDust");
            Register(InitBlocks.itemDustGallium,location.toString());
        }
        if(InitBlocks.registerIndium)
        {
            ResourceLocation location = new ResourceLocation("extraores:indiumIngot");
            Register(InitBlocks.itemIngotIndium,location.toString());
            location = new ResourceLocation("extraores:indiumDust");
            Register(InitBlocks.itemDustIndium,location.toString());
        }
        if(InitBlocks.registerThallium)
        {
            ResourceLocation location = new ResourceLocation("extraores:thalliumIngot");
            Register(InitBlocks.itemIngotThallium,location.toString());
            location = new ResourceLocation("extraores:thalliumDust");
            Register(InitBlocks.itemDustThallium,location.toString());
        }
        if(InitBlocks.registerTitanium)
        {
            ResourceLocation location = new ResourceLocation("extraores:titaniumIngot");
            Register(InitBlocks.itemIngotTitanium,location.toString());
            location = new ResourceLocation("extraores:titaniumDust");
            Register(InitBlocks.itemDustTitanium,location.toString());
        }
        if(InitBlocks.registerNickel)
        {
            ResourceLocation location = new ResourceLocation("extraores:nickelIngot");
            Register(InitBlocks.itemIngotNickel,location.toString());
            location = new ResourceLocation("extraores:nickelDust");
            Register(InitBlocks.itemDustNickel,location.toString());
        }
        if(InitBlocks.registerAdamantine)
        {
            ResourceLocation location = new ResourceLocation("extraores:adamantineIngot");
            Register(InitBlocks.itemIngotAdamantine,location.toString());
            location = new ResourceLocation("extraores:adamantineDust");
            Register(InitBlocks.itemDustAdamantine,location.toString());
        }
        if(InitBlocks.registerAldourite)
        {
            ResourceLocation location = new ResourceLocation("extraores:aldouriteIngot");
            Register(InitBlocks.itemIngotAldourite,location.toString());
            location = new ResourceLocation("extraores:aldouriteDust");
            Register(InitBlocks.itemDustAldourite,location.toString());
        }
        if(InitBlocks.registerAstralSilver)
        {
            ResourceLocation location = new ResourceLocation("extraores:astralSilverIngot");
            Register(InitBlocks.itemIngotAstralSilver,location.toString());
            location = new ResourceLocation("extraores:astralSilverDust");
            Register(InitBlocks.itemDustAstralSilver,location.toString());
        }
        if(InitBlocks.registerAtlarus)
        {
            ResourceLocation location = new ResourceLocation("extraores:atlarusIngot");
            Register(InitBlocks.itemIngotAtlarus,location.toString());
            location = new ResourceLocation("extraores:atlarusDust");
            Register(InitBlocks.itemDustAtlarus,location.toString());
        }
        if(InitBlocks.registerCarmot)
        {
            ResourceLocation location = new ResourceLocation("extraores:carmotIngot");
            Register(InitBlocks.itemIngotCarmot,location.toString());
            location = new ResourceLocation("extraores:carmotDust");
            Register(InitBlocks.itemDustCarmot,location.toString());
        }
        if(InitBlocks.registerCeruclase)
        {
            ResourceLocation location = new ResourceLocation("extraores:ceruclaseIngot");
            Register(InitBlocks.itemIngotCeruclase,location.toString());
            location = new ResourceLocation("extraores:ceruclaseDust");
            Register(InitBlocks.itemDustCeruclase,location.toString());
        }
        if(InitBlocks.registerDeepIron)
        {
            ResourceLocation location = new ResourceLocation("extraores:deepIronIngot");
            Register(InitBlocks.itemIngotDeepIron,location.toString());
            location = new ResourceLocation("extraores:deepIronDust");
            Register(InitBlocks.itemDustDeepIron,location.toString());
        }
        if(InitBlocks.registerIgnatius)
        {
            ResourceLocation location = new ResourceLocation("extraores:ignatiusIngot");
            Register(InitBlocks.itemIngotIgnatius,location.toString());
            location = new ResourceLocation("extraores:ignatiusDust");
            Register(InitBlocks.itemDustIgnatius,location.toString());
        }
        if(InitBlocks.registerInfuscolium)
        {
            ResourceLocation location = new ResourceLocation("extraores:infuscoliumIngot");
            Register(InitBlocks.itemIngotInfuscolium,location.toString());
            location = new ResourceLocation("extraores:infuscoliumDust");
            Register(InitBlocks.itemDustInfuscolium,location.toString());
        }
        if(InitBlocks.registerKalendrite)
        {
            ResourceLocation location = new ResourceLocation("extraores:kalendriteIngot");
            Register(InitBlocks.itemIngotKalendrite,location.toString());
            location = new ResourceLocation("extraores:kalendriteDust");
            Register(InitBlocks.itemDustKalendrite,location.toString());
        }
        if(InitBlocks.registerLemurite)
        {
            ResourceLocation location = new ResourceLocation("extraores:lemuriteIngot");
            Register(InitBlocks.itemIngotLemurite,location.toString());
            location = new ResourceLocation("extraores:lemuriteDust");
            Register(InitBlocks.itemDustLemurite,location.toString());
        }
        if(InitBlocks.registerMidasium)
        {
            ResourceLocation location = new ResourceLocation("extraores:midasiumIngot");
            Register(InitBlocks.itemIngotMidasium,location.toString());
            location = new ResourceLocation("extraores:midasiumDust");
            Register(InitBlocks.itemDustMidasium,location.toString());
        }
        if(InitBlocks.registerMithril)
        {
            ResourceLocation location = new ResourceLocation("extraores:mithrilIngot");
            Register(InitBlocks.itemIngotMithril,location.toString());
            location = new ResourceLocation("extraores:mithrilDust");
            Register(InitBlocks.itemDustMithril,location.toString());
        }
        if(InitBlocks.registerOrichalcum)
        {
            ResourceLocation location = new ResourceLocation("extraores:orichalcumIngot");
            Register(InitBlocks.itemIngotOrichalcum,location.toString());
            location = new ResourceLocation("extraores:orichalcumDust");
            Register(InitBlocks.itemDustOrichalcum,location.toString());
        }
        if(InitBlocks.registerOureclase)
        {
            ResourceLocation location = new ResourceLocation("extraores:oureclaseIngot");
            Register(InitBlocks.itemIngotOureclase,location.toString());
            location = new ResourceLocation("extraores:oureclaseDust");
            Register(InitBlocks.itemDustOureclase,location.toString());
        }
        if(InitBlocks.registerPrometheum)
        {
            ResourceLocation location = new ResourceLocation("extraores:prometheumIngot");
            Register(InitBlocks.itemIngotPrometheum,location.toString());
            location = new ResourceLocation("extraores:prometheumDust");
            Register(InitBlocks.itemDustPrometheum,location.toString());
        }
        if(InitBlocks.registerRubracium)
        {
            ResourceLocation location = new ResourceLocation("extraores:rubraciumIngot");
            Register(InitBlocks.itemIngotRubracium,location.toString());
            location = new ResourceLocation("extraores:rubraciumDust");
            Register(InitBlocks.itemDustRubracium,location.toString());
        }
        if(InitBlocks.registerSanguinite)
        {
            ResourceLocation location = new ResourceLocation("extraores:sanguiniteIngot");
            Register(InitBlocks.itemIngotSanguinite,location.toString());
            location = new ResourceLocation("extraores:sanguiniteDust");
            Register(InitBlocks.itemDustSanguinite,location.toString());
        }
        if(InitBlocks.registerShadowIron)
        {
            ResourceLocation location = new ResourceLocation("extraores:shadowIronIngot");
            Register(InitBlocks.itemIngotShadowIron,location.toString());
            location = new ResourceLocation("extraores:shadowIronDust");
            Register(InitBlocks.itemDustShadowIron,location.toString());
        }
        if(InitBlocks.registerVulcanite)
        {
            ResourceLocation location = new ResourceLocation("extraores:vulcaniteIngot");
            Register(InitBlocks.itemIngotVulcanite,location.toString());
            location = new ResourceLocation("extraores:vulcaniteDust");
            Register(InitBlocks.itemDustVulcanite,location.toString());
        }
        if(InitBlocks.registerVyroxeres)
        {
            ResourceLocation location = new ResourceLocation("extraores:vyroxeresIngot");
            Register(InitBlocks.itemIngotVyroxeres,location.toString());
            location = new ResourceLocation("extraores:vyroxeresDust");
            Register(InitBlocks.itemDustVyroxeres,location.toString());
        }
    }
    public static void Register(Item item, String resource)
    {
        ModelResourceLocation location = new ModelResourceLocation(resource,"inventory");
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item,0,location);
    }
}

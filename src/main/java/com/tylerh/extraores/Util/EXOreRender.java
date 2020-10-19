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
        if(InitBlocks.registerAdamantine)
        {
            Item itemBlockAdamantine = Item.getItemFromBlock(InitBlocks.blockOreAdamantine);
            ResourceLocation location = new ResourceLocation("extraores:adamantineOre");
            Register(itemBlockAdamantine,location.toString());
            itemBlockAdamantine = Item.getItemFromBlock(InitBlocks.blockAdamantine);
            location = new ResourceLocation("extraores:adamantineBlock");
            Register(itemBlockAdamantine,location.toString());
        }
        if(InitBlocks.registerAgate)
        {
            Item itemBlockAgate = Item.getItemFromBlock(InitBlocks.blockOreAgate);
            ResourceLocation location = new ResourceLocation("extraores:agateOre");
            Register(itemBlockAgate,location.toString());
            itemBlockAgate = Item.getItemFromBlock(InitBlocks.blockAgate);
            location = new ResourceLocation("extraores:agateBlock");
            Register(itemBlockAgate,location.toString());
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
        if(InitBlocks.registerAluminum)
        {
            Item itemBlockAluminum = Item.getItemFromBlock(InitBlocks.blockOreAluminum);
            ResourceLocation location = new ResourceLocation("extraores:aluminumOre");
            Register(itemBlockAluminum,location.toString());
            itemBlockAluminum = Item.getItemFromBlock(InitBlocks.blockAluminum);
            location = new ResourceLocation("extraores:aluminumBlock");
            Register(itemBlockAluminum,location.toString());
        }
        if(InitBlocks.registerAmericium)
        {
            Item itemBlockAmericium = Item.getItemFromBlock(InitBlocks.blockOreAmericium);
            ResourceLocation location = new ResourceLocation("extraores:americiumOre");
            Register(itemBlockAmericium,location.toString());
            itemBlockAmericium = Item.getItemFromBlock(InitBlocks.blockAmericium);
            location = new ResourceLocation("extraores:americiumBlock");
            Register(itemBlockAmericium,location.toString());
        }
        if(InitBlocks.registerAmethyst)
        {
            Item itemBlockAmethyst = Item.getItemFromBlock(InitBlocks.blockOreAmethyst);
            ResourceLocation location = new ResourceLocation("extraores:amethystOre");
            Register(itemBlockAmethyst,location.toString());
            itemBlockAmethyst = Item.getItemFromBlock(InitBlocks.blockAmethyst);
            location = new ResourceLocation("extraores:amethystBlock");
            Register(itemBlockAmethyst,location.toString());
        }
        if(InitBlocks.registerAmetrine)
        {
            Item itemBlockAmetrine = Item.getItemFromBlock(InitBlocks.blockOreAmetrine);
            ResourceLocation location = new ResourceLocation("extraores:ametrineOre");
            Register(itemBlockAmetrine,location.toString());
            itemBlockAmetrine = Item.getItemFromBlock(InitBlocks.blockAmetrine);
            location = new ResourceLocation("extraores:ametrineBlock");
            Register(itemBlockAmetrine,location.toString());
        }
        if(InitBlocks.registerAmordrine)
        {
            Item itemBlockAmordrine = Item.getItemFromBlock(InitBlocks.blockOreAmordrine);
            ResourceLocation location = new ResourceLocation("extraores:amordrineOre");
            Register(itemBlockAmordrine,location.toString());
            itemBlockAmordrine = Item.getItemFromBlock(InitBlocks.blockAmordrine);
            location = new ResourceLocation("extraores:amordrineBlock");
            Register(itemBlockAmordrine,location.toString());
        }
        if(InitBlocks.registerAngmallen)
        {
            Item itemBlockAngmallen = Item.getItemFromBlock(InitBlocks.blockOreAngmallen);
            ResourceLocation location = new ResourceLocation("extraores:angmallenOre");
            Register(itemBlockAngmallen,location.toString());
            itemBlockAngmallen = Item.getItemFromBlock(InitBlocks.blockAngmallen);
            location = new ResourceLocation("extraores:angmallenBlock");
            Register(itemBlockAngmallen,location.toString());
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
        if(InitBlocks.registerBismuth)
        {
            Item itemBlockBismuth = Item.getItemFromBlock(InitBlocks.blockOreBismuth);
            ResourceLocation location = new ResourceLocation("extraores:bismuthOre");
            Register(itemBlockBismuth,location.toString());
            itemBlockBismuth = Item.getItemFromBlock(InitBlocks.blockBismuth);
            location = new ResourceLocation("extraores:bismuthBlock");
            Register(itemBlockBismuth,location.toString());
        }
        if(InitBlocks.registerBlackSteel)
        {
            Item itemBlockBlackSteel = Item.getItemFromBlock(InitBlocks.blockOreBlackSteel);
            ResourceLocation location = new ResourceLocation("extraores:blackSteelOre");
            Register(itemBlockBlackSteel,location.toString());
            itemBlockBlackSteel = Item.getItemFromBlock(InitBlocks.blockBlackSteel);
            location = new ResourceLocation("extraores:blackSteelBlock");
            Register(itemBlockBlackSteel,location.toString());
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
        if(InitBlocks.registerCarmot)
        {
            Item itemBlockCarmot = Item.getItemFromBlock(InitBlocks.blockOreCarmot);
            ResourceLocation location = new ResourceLocation("extraores:carmotOre");
            Register(itemBlockCarmot,location.toString());
            itemBlockCarmot = Item.getItemFromBlock(InitBlocks.blockCarmot);
            location = new ResourceLocation("extraores:carmotBlock");
            Register(itemBlockCarmot,location.toString());
        }
        if(InitBlocks.registerCelenegil)
        {
            Item itemBlockCelenegil = Item.getItemFromBlock(InitBlocks.blockOreCelenegil);
            ResourceLocation location = new ResourceLocation("extraores:celenegilOre");
            Register(itemBlockCelenegil,location.toString());
            itemBlockCelenegil = Item.getItemFromBlock(InitBlocks.blockCelenegil);
            location = new ResourceLocation("extraores:celenegilBlock");
            Register(itemBlockCelenegil,location.toString());
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
        if(InitBlocks.registerChromium)
        {
            Item itemBlockChromium = Item.getItemFromBlock(InitBlocks.blockOreChromium);
            ResourceLocation location = new ResourceLocation("extraores:chromiumOre");
            Register(itemBlockChromium,location.toString());
            itemBlockChromium = Item.getItemFromBlock(InitBlocks.blockChromium);
            location = new ResourceLocation("extraores:chromiumBlock");
            Register(itemBlockChromium,location.toString());
        }
        if(InitBlocks.registerChrysocolla)
        {
            Item itemBlockChrysocolla = Item.getItemFromBlock(InitBlocks.blockOreChrysocolla);
            ResourceLocation location = new ResourceLocation("extraores:chrysocollaOre");
            Register(itemBlockChrysocolla,location.toString());
            itemBlockChrysocolla = Item.getItemFromBlock(InitBlocks.blockChrysocolla);
            location = new ResourceLocation("extraores:chrysocollaBlock");
            Register(itemBlockChrysocolla,location.toString());
        }
        if(InitBlocks.registerCitrine)
        {
            Item itemBlockCitrine = Item.getItemFromBlock(InitBlocks.blockOreCitrine);
            ResourceLocation location = new ResourceLocation("extraores:citrineOre");
            Register(itemBlockCitrine,location.toString());
            itemBlockCitrine = Item.getItemFromBlock(InitBlocks.blockCitrine);
            location = new ResourceLocation("extraores:citrineBlock");
            Register(itemBlockCitrine,location.toString());
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
        if(InitBlocks.registerCopper)
        {
            Item itemBlockCopper = Item.getItemFromBlock(InitBlocks.blockOreCopper);
            ResourceLocation location = new ResourceLocation("extraores:copperOre");
            Register(itemBlockCopper,location.toString());
            itemBlockCopper = Item.getItemFromBlock(InitBlocks.blockCopper);
            location = new ResourceLocation("extraores:copperBlock");
            Register(itemBlockCopper,location.toString());
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
        if(InitBlocks.registerDesichalkos)
        {
            Item itemBlockDesichalkos = Item.getItemFromBlock(InitBlocks.blockOreDesichalkos);
            ResourceLocation location = new ResourceLocation("extraores:desichalkosOre");
            Register(itemBlockDesichalkos,location.toString());
            itemBlockDesichalkos = Item.getItemFromBlock(InitBlocks.blockDesichalkos);
            location = new ResourceLocation("extraores:desichalkosBlock");
            Register(itemBlockDesichalkos,location.toString());
        }
        if(InitBlocks.registerEximite)
        {
            Item itemBlockEximite = Item.getItemFromBlock(InitBlocks.blockOreEximite);
            ResourceLocation location = new ResourceLocation("extraores:eximiteOre");
            Register(itemBlockEximite,location.toString());
            itemBlockEximite = Item.getItemFromBlock(InitBlocks.blockEximite);
            location = new ResourceLocation("extraores:eximiteBlock");
            Register(itemBlockEximite,location.toString());
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
        if(InitBlocks.registerGarnet)
        {
            Item itemBlockGarnet = Item.getItemFromBlock(InitBlocks.blockOreGarnet);
            ResourceLocation location = new ResourceLocation("extraores:garnetOre");
            Register(itemBlockGarnet,location.toString());
            itemBlockGarnet = Item.getItemFromBlock(InitBlocks.blockGarnet);
            location = new ResourceLocation("extraores:garnetBlock");
            Register(itemBlockGarnet,location.toString());
        }
        if(InitBlocks.registerHaderoth)
        {
            Item itemBlockHaderoth = Item.getItemFromBlock(InitBlocks.blockOreHaderoth);
            ResourceLocation location = new ResourceLocation("extraores:haderothOre");
            Register(itemBlockHaderoth,location.toString());
            itemBlockHaderoth = Item.getItemFromBlock(InitBlocks.blockHaderoth);
            location = new ResourceLocation("extraores:haderothBlock");
            Register(itemBlockHaderoth,location.toString());
        }
        if(InitBlocks.registerHepatizon)
        {
            Item itemBlockHepatizon = Item.getItemFromBlock(InitBlocks.blockOreHepatizon);
            ResourceLocation location = new ResourceLocation("extraores:hepatizonOre");
            Register(itemBlockHepatizon,location.toString());
            itemBlockHepatizon = Item.getItemFromBlock(InitBlocks.blockHepatizon);
            location = new ResourceLocation("extraores:hepatizonBlock");
            Register(itemBlockHepatizon,location.toString());
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
        if(InitBlocks.registerIndium)
        {
            Item itemBlockIndium = Item.getItemFromBlock(InitBlocks.blockOreIndium);
            ResourceLocation location = new ResourceLocation("extraores:indiumOre");
            Register(itemBlockIndium,location.toString());
            itemBlockIndium = Item.getItemFromBlock(InitBlocks.blockIndium);
            location = new ResourceLocation("extraores:indiumBlock");
            Register(itemBlockIndium,location.toString());
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
        if(InitBlocks.registerInolashite)
        {
            Item itemBlockInolashite = Item.getItemFromBlock(InitBlocks.blockOreInolashite);
            ResourceLocation location = new ResourceLocation("extraores:inolashiteOre");
            Register(itemBlockInolashite,location.toString());
            itemBlockInolashite = Item.getItemFromBlock(InitBlocks.blockInolashite);
            location = new ResourceLocation("extraores:inolashiteBlock");
            Register(itemBlockInolashite,location.toString());
        }
        if(InitBlocks.registerIridium)
        {
            Item itemBlockIridium = Item.getItemFromBlock(InitBlocks.blockOreIridium);
            ResourceLocation location = new ResourceLocation("extraores:iridiumOre");
            Register(itemBlockIridium,location.toString());
            itemBlockIridium = Item.getItemFromBlock(InitBlocks.blockIridium);
            location = new ResourceLocation("extraores:iridiumBlock");
            Register(itemBlockIridium,location.toString());
        }
        if(InitBlocks.registerJade)
        {
            Item itemBlockJade = Item.getItemFromBlock(InitBlocks.blockOreJade);
            ResourceLocation location = new ResourceLocation("extraores:jadeOre");
            Register(itemBlockJade,location.toString());
            itemBlockJade = Item.getItemFromBlock(InitBlocks.blockJade);
            location = new ResourceLocation("extraores:jadeBlock");
            Register(itemBlockJade,location.toString());
        }
        if(InitBlocks.registerJasper)
        {
            Item itemBlockJasper = Item.getItemFromBlock(InitBlocks.blockOreJasper);
            ResourceLocation location = new ResourceLocation("extraores:jasperOre");
            Register(itemBlockJasper,location.toString());
            itemBlockJasper = Item.getItemFromBlock(InitBlocks.blockJasper);
            location = new ResourceLocation("extraores:jasperBlock");
            Register(itemBlockJasper,location.toString());
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
        if(InitBlocks.registerLead)
        {
            Item itemBlockLead = Item.getItemFromBlock(InitBlocks.blockOreLead);
            ResourceLocation location = new ResourceLocation("extraores:leadOre");
            Register(itemBlockLead,location.toString());
            itemBlockLead = Item.getItemFromBlock(InitBlocks.blockLead);
            location = new ResourceLocation("extraores:leadBlock");
            Register(itemBlockLead,location.toString());
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
        if(InitBlocks.registerMalachite)
        {
            Item itemBlockMalachite = Item.getItemFromBlock(InitBlocks.blockOreMalachite);
            ResourceLocation location = new ResourceLocation("extraores:malachiteOre");
            Register(itemBlockMalachite,location.toString());
            itemBlockMalachite = Item.getItemFromBlock(InitBlocks.blockMalachite);
            location = new ResourceLocation("extraores:malachiteBlock");
            Register(itemBlockMalachite,location.toString());
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
        if(InitBlocks.registerMeutoite)
        {
            Item itemBlockMeutoite = Item.getItemFromBlock(InitBlocks.blockOreMeutoite);
            ResourceLocation location = new ResourceLocation("extraores:meutoiteOre");
            Register(itemBlockMeutoite,location.toString());
            itemBlockMeutoite = Item.getItemFromBlock(InitBlocks.blockMeutoite);
            location = new ResourceLocation("extraores:meutoiteBlock");
            Register(itemBlockMeutoite,location.toString());
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
        if(InitBlocks.registerMolybdenum)
        {
            Item itemBlockMolybdenum = Item.getItemFromBlock(InitBlocks.blockOreMolybdenum);
            ResourceLocation location = new ResourceLocation("extraores:molybdenumOre");
            Register(itemBlockMolybdenum,location.toString());
            itemBlockMolybdenum = Item.getItemFromBlock(InitBlocks.blockMolybdenum);
            location = new ResourceLocation("extraores:molybdenumBlock");
            Register(itemBlockMolybdenum,location.toString());
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
        if(InitBlocks.registerNeptunium)
        {
            Item itemBlockNeptunium = Item.getItemFromBlock(InitBlocks.blockOreNeptunium);
            ResourceLocation location = new ResourceLocation("extraores:neptuniumOre");
            Register(itemBlockNeptunium,location.toString());
            itemBlockNeptunium = Item.getItemFromBlock(InitBlocks.blockNeptunium);
            location = new ResourceLocation("extraores:neptuniumBlock");
            Register(itemBlockNeptunium,location.toString());
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
        if(InitBlocks.registerNiobium)
        {
            Item itemBlockNiobium = Item.getItemFromBlock(InitBlocks.blockOreNiobium);
            ResourceLocation location = new ResourceLocation("extraores:niobiumOre");
            Register(itemBlockNiobium,location.toString());
            itemBlockNiobium = Item.getItemFromBlock(InitBlocks.blockNiobium);
            location = new ResourceLocation("extraores:niobiumBlock");
            Register(itemBlockNiobium,location.toString());
        }
        if(InitBlocks.registerOnyx)
        {
            Item itemBlockOnyx = Item.getItemFromBlock(InitBlocks.blockOreOnyx);
            ResourceLocation location = new ResourceLocation("extraores:onyxOre");
            Register(itemBlockOnyx,location.toString());
            itemBlockOnyx = Item.getItemFromBlock(InitBlocks.blockOnyx);
            location = new ResourceLocation("extraores:onyxBlock");
            Register(itemBlockOnyx,location.toString());
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
        if(InitBlocks.registerOsmium)
        {
            Item itemBlockOsmium = Item.getItemFromBlock(InitBlocks.blockOreOsmium);
            ResourceLocation location = new ResourceLocation("extraores:osmiumOre");
            Register(itemBlockOsmium,location.toString());
            itemBlockOsmium = Item.getItemFromBlock(InitBlocks.blockOsmium);
            location = new ResourceLocation("extraores:osmiumBlock");
            Register(itemBlockOsmium,location.toString());
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
        if(InitBlocks.registerPalladium)
        {
            Item itemBlockPalladium = Item.getItemFromBlock(InitBlocks.blockOrePalladium);
            ResourceLocation location = new ResourceLocation("extraores:palladiumOre");
            Register(itemBlockPalladium,location.toString());
            itemBlockPalladium = Item.getItemFromBlock(InitBlocks.blockPalladium);
            location = new ResourceLocation("extraores:palladiumBlock");
            Register(itemBlockPalladium,location.toString());
        }
        if(InitBlocks.registerPeridot)
        {
            Item itemBlockPeridot = Item.getItemFromBlock(InitBlocks.blockOrePeridot);
            ResourceLocation location = new ResourceLocation("extraores:peridotOre");
            Register(itemBlockPeridot,location.toString());
            itemBlockPeridot = Item.getItemFromBlock(InitBlocks.blockPeridot);
            location = new ResourceLocation("extraores:peridotBlock");
            Register(itemBlockPeridot,location.toString());
        }
        if(InitBlocks.registerPhoenixite)
        {
            Item itemBlockPhoenixite = Item.getItemFromBlock(InitBlocks.blockOrePhoenixite);
            ResourceLocation location = new ResourceLocation("extraores:phoenixiteOre");
            Register(itemBlockPhoenixite,location.toString());
            itemBlockPhoenixite = Item.getItemFromBlock(InitBlocks.blockPhoenixite);
            location = new ResourceLocation("extraores:phoenixiteBlock");
            Register(itemBlockPhoenixite,location.toString());
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
        if(InitBlocks.registerPlutonium)
        {
            Item itemBlockPlutonium = Item.getItemFromBlock(InitBlocks.blockOrePlutonium);
            ResourceLocation location = new ResourceLocation("extraores:plutoniumOre");
            Register(itemBlockPlutonium,location.toString());
            itemBlockPlutonium = Item.getItemFromBlock(InitBlocks.blockPlutonium);
            location = new ResourceLocation("extraores:plutoniumBlock");
            Register(itemBlockPlutonium,location.toString());
        }
        if(InitBlocks.registerPolonium)
        {
            Item itemBlockPolonium = Item.getItemFromBlock(InitBlocks.blockOrePolonium);
            ResourceLocation location = new ResourceLocation("extraores:poloniumOre");
            Register(itemBlockPolonium,location.toString());
            itemBlockPolonium = Item.getItemFromBlock(InitBlocks.blockPolonium);
            location = new ResourceLocation("extraores:poloniumBlock");
            Register(itemBlockPolonium,location.toString());
        }
        if(InitBlocks.registerPromethium)
        {
            Item itemBlockPromethium = Item.getItemFromBlock(InitBlocks.blockOrePromethium);
            ResourceLocation location = new ResourceLocation("extraores:promethiumOre");
            Register(itemBlockPromethium,location.toString());
            itemBlockPromethium = Item.getItemFromBlock(InitBlocks.blockPromethium);
            location = new ResourceLocation("extraores:promethiumBlock");
            Register(itemBlockPromethium,location.toString());
        }
        if(InitBlocks.registerRhenium)
        {
            Item itemBlockRhenium = Item.getItemFromBlock(InitBlocks.blockOreRhenium);
            ResourceLocation location = new ResourceLocation("extraores:rheniumOre");
            Register(itemBlockRhenium,location.toString());
            itemBlockRhenium = Item.getItemFromBlock(InitBlocks.blockRhenium);
            location = new ResourceLocation("extraores:rheniumBlock");
            Register(itemBlockRhenium,location.toString());
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
        if(InitBlocks.registerRubracium)
        {
            Item itemBlockRubracium = Item.getItemFromBlock(InitBlocks.blockOreRubracium);
            ResourceLocation location = new ResourceLocation("extraores:rubraciumOre");
            Register(itemBlockRubracium,location.toString());
            itemBlockRubracium = Item.getItemFromBlock(InitBlocks.blockRubracium);
            location = new ResourceLocation("extraores:rubraciumBlock");
            Register(itemBlockRubracium,location.toString());
        }
        if(InitBlocks.registerRuby)
        {
            Item itemBlockRuby = Item.getItemFromBlock(InitBlocks.blockOreRuby);
            ResourceLocation location = new ResourceLocation("extraores:rubyOre");
            Register(itemBlockRuby,location.toString());
            itemBlockRuby = Item.getItemFromBlock(InitBlocks.blockRuby);
            location = new ResourceLocation("extraores:rubyBlock");
            Register(itemBlockRuby,location.toString());
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
        if(InitBlocks.registerSanguinite)
        {
            Item itemBlockSanguinite = Item.getItemFromBlock(InitBlocks.blockOreSanguinite);
            ResourceLocation location = new ResourceLocation("extraores:sanguiniteOre");
            Register(itemBlockSanguinite,location.toString());
            itemBlockSanguinite = Item.getItemFromBlock(InitBlocks.blockSanguinite);
            location = new ResourceLocation("extraores:sanguiniteBlock");
            Register(itemBlockSanguinite,location.toString());
        }
        if(InitBlocks.registerSapphire)
        {
            Item itemBlockSapphire = Item.getItemFromBlock(InitBlocks.blockOreSapphire);
            ResourceLocation location = new ResourceLocation("extraores:sapphireOre");
            Register(itemBlockSapphire,location.toString());
            itemBlockSapphire = Item.getItemFromBlock(InitBlocks.blockSapphire);
            location = new ResourceLocation("extraores:sapphireBlock");
            Register(itemBlockSapphire,location.toString());
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
        if(InitBlocks.registerSilver)
        {
            Item itemBlockSilver = Item.getItemFromBlock(InitBlocks.blockOreSilver);
            ResourceLocation location = new ResourceLocation("extraores:silverOre");
            Register(itemBlockSilver,location.toString());
            itemBlockSilver = Item.getItemFromBlock(InitBlocks.blockSilver);
            location = new ResourceLocation("extraores:silverBlock");
            Register(itemBlockSilver,location.toString());
        }
        if(InitBlocks.registerSpinel)
        {
            Item itemBlockSpinel = Item.getItemFromBlock(InitBlocks.blockOreSpinel);
            ResourceLocation location = new ResourceLocation("extraores:spinelOre");
            Register(itemBlockSpinel,location.toString());
            itemBlockSpinel = Item.getItemFromBlock(InitBlocks.blockSpinel);
            location = new ResourceLocation("extraores:spinelBlock");
            Register(itemBlockSpinel,location.toString());
        }
        if(InitBlocks.registerSugilite)
        {
            Item itemBlockSugilite = Item.getItemFromBlock(InitBlocks.blockOreSugilite);
            ResourceLocation location = new ResourceLocation("extraores:sugiliteOre");
            Register(itemBlockSugilite,location.toString());
            itemBlockSugilite = Item.getItemFromBlock(InitBlocks.blockSugilite);
            location = new ResourceLocation("extraores:sugiliteBlock");
            Register(itemBlockSugilite,location.toString());
        }
        if(InitBlocks.registerTantalum)
        {
            Item itemBlockTantalum = Item.getItemFromBlock(InitBlocks.blockOreTantalum);
            ResourceLocation location = new ResourceLocation("extraores:tantalumOre");
            Register(itemBlockTantalum,location.toString());
            itemBlockTantalum = Item.getItemFromBlock(InitBlocks.blockTantalum);
            location = new ResourceLocation("extraores:tantalumBlock");
            Register(itemBlockTantalum,location.toString());
        }
        if(InitBlocks.registerTartarite)
        {
            Item itemBlockTartarite = Item.getItemFromBlock(InitBlocks.blockOreTartarite);
            ResourceLocation location = new ResourceLocation("extraores:tartariteOre");
            Register(itemBlockTartarite,location.toString());
            itemBlockTartarite = Item.getItemFromBlock(InitBlocks.blockTartarite);
            location = new ResourceLocation("extraores:tartariteBlock");
            Register(itemBlockTartarite,location.toString());
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
        if(InitBlocks.registerThallium)
        {
            Item itemBlockThallium = Item.getItemFromBlock(InitBlocks.blockOreThallium);
            ResourceLocation location = new ResourceLocation("extraores:thalliumOre");
            Register(itemBlockThallium,location.toString());
            itemBlockThallium = Item.getItemFromBlock(InitBlocks.blockThallium);
            location = new ResourceLocation("extraores:thalliumBlock");
            Register(itemBlockThallium,location.toString());
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
        if(InitBlocks.registerTitanium)
        {
            Item itemBlockTitanium = Item.getItemFromBlock(InitBlocks.blockOreTitanium);
            ResourceLocation location = new ResourceLocation("extraores:titaniumOre");
            Register(itemBlockTitanium,location.toString());
            itemBlockTitanium = Item.getItemFromBlock(InitBlocks.blockTitanium);
            location = new ResourceLocation("extraores:titaniumBlock");
            Register(itemBlockTitanium,location.toString());
        }
        if(InitBlocks.registerTopaz)
        {
            Item itemBlockTopaz = Item.getItemFromBlock(InitBlocks.blockOreTopaz);
            ResourceLocation location = new ResourceLocation("extraores:topazOre");
            Register(itemBlockTopaz,location.toString());
            itemBlockTopaz = Item.getItemFromBlock(InitBlocks.blockTopaz);
            location = new ResourceLocation("extraores:topazBlock");
            Register(itemBlockTopaz,location.toString());
        }
        if(InitBlocks.registerTourmaline)
        {
            Item itemBlockTourmaline = Item.getItemFromBlock(InitBlocks.blockOreTourmaline);
            ResourceLocation location = new ResourceLocation("extraores:tourmalineOre");
            Register(itemBlockTourmaline,location.toString());
            itemBlockTourmaline = Item.getItemFromBlock(InitBlocks.blockTourmaline);
            location = new ResourceLocation("extraores:tourmalineBlock");
            Register(itemBlockTourmaline,location.toString());
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
        if(InitBlocks.registerUnobtainium)
        {
            Item itemBlockUnobtainium = Item.getItemFromBlock(InitBlocks.blockOreUnobtainium);
            ResourceLocation location = new ResourceLocation("extraores:unobtainiumOre");
            Register(itemBlockUnobtainium,location.toString());
            itemBlockUnobtainium = Item.getItemFromBlock(InitBlocks.blockUnobtainium);
            location = new ResourceLocation("extraores:unobtainiumBlock");
            Register(itemBlockUnobtainium,location.toString());
        }
        if(InitBlocks.registerUranium)
        {
            Item itemBlockUranium = Item.getItemFromBlock(InitBlocks.blockOreUranium);
            ResourceLocation location = new ResourceLocation("extraores:uraniumOre");
            Register(itemBlockUranium,location.toString());
            itemBlockUranium = Item.getItemFromBlock(InitBlocks.blockUranium);
            location = new ResourceLocation("extraores:uraniumBlock");
            Register(itemBlockUranium,location.toString());
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
        if(InitBlocks.registerYellorite)
        {
            Item itemBlockYellorite = Item.getItemFromBlock(InitBlocks.blockOreYellorite);
            ResourceLocation location = new ResourceLocation("extraores:yelloriteOre");
            Register(itemBlockYellorite,location.toString());
            itemBlockYellorite = Item.getItemFromBlock(InitBlocks.blockYellorite);
            location = new ResourceLocation("extraores:yelloriteBlock");
            Register(itemBlockYellorite,location.toString());
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
    }
    public static void initItemRender()
    {
        if(InitBlocks.registerAdamantine)
        {
            ResourceLocation location = new ResourceLocation("extraores:adamantineIngot");
            Register(InitBlocks.itemIngotAdamantine,location.toString());
            location = new ResourceLocation("extraores:adamantineDust");
            Register(InitBlocks.itemDustAdamantine,location.toString());
            location = new ResourceLocation("extraores:adamantineclump");
            Register(InitBlocks.itemClumpAdamantine,location.toString());
            location = new ResourceLocation("extraores:adamantineshard");
            Register(InitBlocks.itemShardAdamantine,location.toString());
            location = new ResourceLocation("extraores:adamantinedirtydust");
            Register(InitBlocks.itemDirtyDustAdamantine,location.toString());
        }
        if(InitBlocks.registerAgate)
        {
            ResourceLocation location = new ResourceLocation("extraores:agate");
            Register(InitBlocks.itemGemAgate,location.toString());
        }
        if(InitBlocks.registerAldourite)
        {
            ResourceLocation location = new ResourceLocation("extraores:aldouriteIngot");
            Register(InitBlocks.itemIngotAldourite,location.toString());
            location = new ResourceLocation("extraores:aldouriteDust");
            Register(InitBlocks.itemDustAldourite,location.toString());
            location = new ResourceLocation("extraores:aldouriteclump");
            Register(InitBlocks.itemClumpAldourite,location.toString());
            location = new ResourceLocation("extraores:aldouriteshard");
            Register(InitBlocks.itemShardAldourite,location.toString());
            location = new ResourceLocation("extraores:aldouritedirtydust");
            Register(InitBlocks.itemDirtyDustAldourite,location.toString());
        }
        if(InitBlocks.registerAluminum)
        {
            ResourceLocation location = new ResourceLocation("extraores:aluminumIngot");
            Register(InitBlocks.itemIngotAluminum,location.toString());
            location = new ResourceLocation("extraores:aluminumDust");
            Register(InitBlocks.itemDustAluminum,location.toString());
            location = new ResourceLocation("extraores:aluminumclump");
            Register(InitBlocks.itemClumpAluminum,location.toString());
            location = new ResourceLocation("extraores:aluminumshard");
            Register(InitBlocks.itemShardAluminum,location.toString());
            location = new ResourceLocation("extraores:aluminumdirtydust");
            Register(InitBlocks.itemDirtyDustAluminum,location.toString());
        }
        if(InitBlocks.registerAmericium)
        {
            ResourceLocation location = new ResourceLocation("extraores:americiumIngot");
            Register(InitBlocks.itemIngotAmericium,location.toString());
            location = new ResourceLocation("extraores:americiumDust");
            Register(InitBlocks.itemDustAmericium,location.toString());
            location = new ResourceLocation("extraores:americiumclump");
            Register(InitBlocks.itemClumpAmericium,location.toString());
            location = new ResourceLocation("extraores:americiumshard");
            Register(InitBlocks.itemShardAmericium,location.toString());
            location = new ResourceLocation("extraores:americiumdirtydust");
            Register(InitBlocks.itemDirtyDustAmericium,location.toString());
        }
        if(InitBlocks.registerAmethyst)
        {
            ResourceLocation location = new ResourceLocation("extraores:amethyst");
            Register(InitBlocks.itemGemAmethyst,location.toString());
        }
        if(InitBlocks.registerAmetrine)
        {
            ResourceLocation location = new ResourceLocation("extraores:ametrine");
            Register(InitBlocks.itemGemAmetrine,location.toString());
        }
        if(InitBlocks.registerAmordrine)
        {
            ResourceLocation location = new ResourceLocation("extraores:amordrineIngot");
            Register(InitBlocks.itemIngotAmordrine,location.toString());
            location = new ResourceLocation("extraores:amordrineDust");
            Register(InitBlocks.itemDustAmordrine,location.toString());
            location = new ResourceLocation("extraores:amordrineclump");
            Register(InitBlocks.itemClumpAmordrine,location.toString());
            location = new ResourceLocation("extraores:amordrineshard");
            Register(InitBlocks.itemShardAmordrine,location.toString());
            location = new ResourceLocation("extraores:amordrinedirtydust");
            Register(InitBlocks.itemDirtyDustAmordrine,location.toString());
        }
        if(InitBlocks.registerAngmallen)
        {
            ResourceLocation location = new ResourceLocation("extraores:angmallenIngot");
            Register(InitBlocks.itemIngotAngmallen,location.toString());
            location = new ResourceLocation("extraores:angmallenDust");
            Register(InitBlocks.itemDustAngmallen,location.toString());
            location = new ResourceLocation("extraores:angmallenclump");
            Register(InitBlocks.itemClumpAngmallen,location.toString());
            location = new ResourceLocation("extraores:angmallenshard");
            Register(InitBlocks.itemShardAngmallen,location.toString());
            location = new ResourceLocation("extraores:angmallendirtydust");
            Register(InitBlocks.itemDirtyDustAngmallen,location.toString());
        }
        if(InitBlocks.registerAstralSilver)
        {
            ResourceLocation location = new ResourceLocation("extraores:astralSilverIngot");
            Register(InitBlocks.itemIngotAstralSilver,location.toString());
            location = new ResourceLocation("extraores:astralSilverDust");
            Register(InitBlocks.itemDustAstralSilver,location.toString());
            location = new ResourceLocation("extraores:astralSilverclump");
            Register(InitBlocks.itemClumpAstralSilver,location.toString());
            location = new ResourceLocation("extraores:astralSilvershard");
            Register(InitBlocks.itemShardAstralSilver,location.toString());
            location = new ResourceLocation("extraores:astralSilverdirtydust");
            Register(InitBlocks.itemDirtyDustAstralSilver,location.toString());
        }
        if(InitBlocks.registerAtlarus)
        {
            ResourceLocation location = new ResourceLocation("extraores:atlarusIngot");
            Register(InitBlocks.itemIngotAtlarus,location.toString());
            location = new ResourceLocation("extraores:atlarusDust");
            Register(InitBlocks.itemDustAtlarus,location.toString());
            location = new ResourceLocation("extraores:atlarusclump");
            Register(InitBlocks.itemClumpAtlarus,location.toString());
            location = new ResourceLocation("extraores:atlarusshard");
            Register(InitBlocks.itemShardAtlarus,location.toString());
            location = new ResourceLocation("extraores:atlarusdirtydust");
            Register(InitBlocks.itemDirtyDustAtlarus,location.toString());
        }
        if(InitBlocks.registerBismuth)
        {
            ResourceLocation location = new ResourceLocation("extraores:bismuthIngot");
            Register(InitBlocks.itemIngotBismuth,location.toString());
            location = new ResourceLocation("extraores:bismuthDust");
            Register(InitBlocks.itemDustBismuth,location.toString());
            location = new ResourceLocation("extraores:bismuthclump");
            Register(InitBlocks.itemClumpBismuth,location.toString());
            location = new ResourceLocation("extraores:bismuthshard");
            Register(InitBlocks.itemShardBismuth,location.toString());
            location = new ResourceLocation("extraores:bismuthdirtydust");
            Register(InitBlocks.itemDirtyDustBismuth,location.toString());
        }
        if(InitBlocks.registerBlackSteel)
        {
            ResourceLocation location = new ResourceLocation("extraores:blackSteelIngot");
            Register(InitBlocks.itemIngotBlackSteel,location.toString());
            location = new ResourceLocation("extraores:blackSteelDust");
            Register(InitBlocks.itemDustBlackSteel,location.toString());
            location = new ResourceLocation("extraores:blackSteelclump");
            Register(InitBlocks.itemClumpBlackSteel,location.toString());
            location = new ResourceLocation("extraores:blackSteelshard");
            Register(InitBlocks.itemShardBlackSteel,location.toString());
            location = new ResourceLocation("extraores:blackSteeldirtydust");
            Register(InitBlocks.itemDirtyDustBlackSteel,location.toString());
        }
        if(InitBlocks.registerCadmium)
        {
            ResourceLocation location = new ResourceLocation("extraores:cadmiumIngot");
            Register(InitBlocks.itemIngotCadmium,location.toString());
            location = new ResourceLocation("extraores:cadmiumDust");
            Register(InitBlocks.itemDustCadmium,location.toString());
            location = new ResourceLocation("extraores:cadmiumclump");
            Register(InitBlocks.itemClumpCadmium,location.toString());
            location = new ResourceLocation("extraores:cadmiumshard");
            Register(InitBlocks.itemShardCadmium,location.toString());
            location = new ResourceLocation("extraores:cadmiumdirtydust");
            Register(InitBlocks.itemDirtyDustCadmium,location.toString());
        }
        if(InitBlocks.registerCarmot)
        {
            ResourceLocation location = new ResourceLocation("extraores:carmotIngot");
            Register(InitBlocks.itemIngotCarmot,location.toString());
            location = new ResourceLocation("extraores:carmotDust");
            Register(InitBlocks.itemDustCarmot,location.toString());
            location = new ResourceLocation("extraores:carmotclump");
            Register(InitBlocks.itemClumpCarmot,location.toString());
            location = new ResourceLocation("extraores:carmotshard");
            Register(InitBlocks.itemShardCarmot,location.toString());
            location = new ResourceLocation("extraores:carmotdirtydust");
            Register(InitBlocks.itemDirtyDustCarmot,location.toString());
        }
        if(InitBlocks.registerCelenegil)
        {
            ResourceLocation location = new ResourceLocation("extraores:celenegilIngot");
            Register(InitBlocks.itemIngotCelenegil,location.toString());
            location = new ResourceLocation("extraores:celenegilDust");
            Register(InitBlocks.itemDustCelenegil,location.toString());
            location = new ResourceLocation("extraores:celenegilclump");
            Register(InitBlocks.itemClumpCelenegil,location.toString());
            location = new ResourceLocation("extraores:celenegilshard");
            Register(InitBlocks.itemShardCelenegil,location.toString());
            location = new ResourceLocation("extraores:celenegildirtydust");
            Register(InitBlocks.itemDirtyDustCelenegil,location.toString());
        }
        if(InitBlocks.registerCeruclase)
        {
            ResourceLocation location = new ResourceLocation("extraores:ceruclaseIngot");
            Register(InitBlocks.itemIngotCeruclase,location.toString());
            location = new ResourceLocation("extraores:ceruclaseDust");
            Register(InitBlocks.itemDustCeruclase,location.toString());
            location = new ResourceLocation("extraores:ceruclaseclump");
            Register(InitBlocks.itemClumpCeruclase,location.toString());
            location = new ResourceLocation("extraores:ceruclaseshard");
            Register(InitBlocks.itemShardCeruclase,location.toString());
            location = new ResourceLocation("extraores:ceruclasedirtydust");
            Register(InitBlocks.itemDirtyDustCeruclase,location.toString());
        }
        if(InitBlocks.registerChromium)
        {
            ResourceLocation location = new ResourceLocation("extraores:chromiumIngot");
            Register(InitBlocks.itemIngotChromium,location.toString());
            location = new ResourceLocation("extraores:chromiumDust");
            Register(InitBlocks.itemDustChromium,location.toString());
            location = new ResourceLocation("extraores:chromiumclump");
            Register(InitBlocks.itemClumpChromium,location.toString());
            location = new ResourceLocation("extraores:chromiumshard");
            Register(InitBlocks.itemShardChromium,location.toString());
            location = new ResourceLocation("extraores:chromiumdirtydust");
            Register(InitBlocks.itemDirtyDustChromium,location.toString());
        }
        if(InitBlocks.registerChrysocolla)
        {
            ResourceLocation location = new ResourceLocation("extraores:chrysocolla");
            Register(InitBlocks.itemGemChrysocolla,location.toString());
        }
        if(InitBlocks.registerCitrine)
        {
            ResourceLocation location = new ResourceLocation("extraores:citrine");
            Register(InitBlocks.itemGemCitrine,location.toString());
        }
        if(InitBlocks.registerCobalt)
        {
            ResourceLocation location = new ResourceLocation("extraores:cobaltIngot");
            Register(InitBlocks.itemIngotCobalt,location.toString());
            location = new ResourceLocation("extraores:cobaltDust");
            Register(InitBlocks.itemDustCobalt,location.toString());
            location = new ResourceLocation("extraores:cobaltclump");
            Register(InitBlocks.itemClumpCobalt,location.toString());
            location = new ResourceLocation("extraores:cobaltshard");
            Register(InitBlocks.itemShardCobalt,location.toString());
            location = new ResourceLocation("extraores:cobaltdirtydust");
            Register(InitBlocks.itemDirtyDustCobalt,location.toString());
        }
        if(InitBlocks.registerCopper)
        {
            ResourceLocation location = new ResourceLocation("extraores:copperIngot");
            Register(InitBlocks.itemIngotCopper,location.toString());
            location = new ResourceLocation("extraores:copperDust");
            Register(InitBlocks.itemDustCopper,location.toString());
            location = new ResourceLocation("extraores:copperclump");
            Register(InitBlocks.itemClumpCopper,location.toString());
            location = new ResourceLocation("extraores:coppershard");
            Register(InitBlocks.itemShardCopper,location.toString());
            location = new ResourceLocation("extraores:copperdirtydust");
            Register(InitBlocks.itemDirtyDustCopper,location.toString());
        }
        if(InitBlocks.registerDeepIron)
        {
            ResourceLocation location = new ResourceLocation("extraores:deepIronIngot");
            Register(InitBlocks.itemIngotDeepIron,location.toString());
            location = new ResourceLocation("extraores:deepIronDust");
            Register(InitBlocks.itemDustDeepIron,location.toString());
            location = new ResourceLocation("extraores:deepIronclump");
            Register(InitBlocks.itemClumpDeepIron,location.toString());
            location = new ResourceLocation("extraores:deepIronshard");
            Register(InitBlocks.itemShardDeepIron,location.toString());
            location = new ResourceLocation("extraores:deepIrondirtydust");
            Register(InitBlocks.itemDirtyDustDeepIron,location.toString());
        }
        if(InitBlocks.registerDesichalkos)
        {
            ResourceLocation location = new ResourceLocation("extraores:desichalkosIngot");
            Register(InitBlocks.itemIngotDesichalkos,location.toString());
            location = new ResourceLocation("extraores:desichalkosDust");
            Register(InitBlocks.itemDustDesichalkos,location.toString());
            location = new ResourceLocation("extraores:desichalkosclump");
            Register(InitBlocks.itemClumpDesichalkos,location.toString());
            location = new ResourceLocation("extraores:desichalkosshard");
            Register(InitBlocks.itemShardDesichalkos,location.toString());
            location = new ResourceLocation("extraores:desichalkosdirtydust");
            Register(InitBlocks.itemDirtyDustDesichalkos,location.toString());
        }
        if(InitBlocks.registerEximite)
        {
            ResourceLocation location = new ResourceLocation("extraores:eximiteIngot");
            Register(InitBlocks.itemIngotEximite,location.toString());
            location = new ResourceLocation("extraores:eximiteDust");
            Register(InitBlocks.itemDustEximite,location.toString());
            location = new ResourceLocation("extraores:eximiteclump");
            Register(InitBlocks.itemClumpEximite,location.toString());
            location = new ResourceLocation("extraores:eximiteshard");
            Register(InitBlocks.itemShardEximite,location.toString());
            location = new ResourceLocation("extraores:eximitedirtydust");
            Register(InitBlocks.itemDirtyDustEximite,location.toString());
        }
        if(InitBlocks.registerGallium)
        {
            ResourceLocation location = new ResourceLocation("extraores:galliumIngot");
            Register(InitBlocks.itemIngotGallium,location.toString());
            location = new ResourceLocation("extraores:galliumDust");
            Register(InitBlocks.itemDustGallium,location.toString());
            location = new ResourceLocation("extraores:galliumclump");
            Register(InitBlocks.itemClumpGallium,location.toString());
            location = new ResourceLocation("extraores:galliumshard");
            Register(InitBlocks.itemShardGallium,location.toString());
            location = new ResourceLocation("extraores:galliumdirtydust");
            Register(InitBlocks.itemDirtyDustGallium,location.toString());
        }
        if(InitBlocks.registerGarnet)
        {
            ResourceLocation location = new ResourceLocation("extraores:garnet");
            Register(InitBlocks.itemGemGarnet,location.toString());
        }
        if(InitBlocks.registerHaderoth)
        {
            ResourceLocation location = new ResourceLocation("extraores:haderothIngot");
            Register(InitBlocks.itemIngotHaderoth,location.toString());
            location = new ResourceLocation("extraores:haderothDust");
            Register(InitBlocks.itemDustHaderoth,location.toString());
            location = new ResourceLocation("extraores:haderothclump");
            Register(InitBlocks.itemClumpHaderoth,location.toString());
            location = new ResourceLocation("extraores:haderothshard");
            Register(InitBlocks.itemShardHaderoth,location.toString());
            location = new ResourceLocation("extraores:haderothdirtydust");
            Register(InitBlocks.itemDirtyDustHaderoth,location.toString());
        }
        if(InitBlocks.registerHepatizon)
        {
            ResourceLocation location = new ResourceLocation("extraores:hepatizonIngot");
            Register(InitBlocks.itemIngotHepatizon,location.toString());
            location = new ResourceLocation("extraores:hepatizonDust");
            Register(InitBlocks.itemDustHepatizon,location.toString());
            location = new ResourceLocation("extraores:hepatizonclump");
            Register(InitBlocks.itemClumpHepatizon,location.toString());
            location = new ResourceLocation("extraores:hepatizonshard");
            Register(InitBlocks.itemShardHepatizon,location.toString());
            location = new ResourceLocation("extraores:hepatizondirtydust");
            Register(InitBlocks.itemDirtyDustHepatizon,location.toString());
        }
        if(InitBlocks.registerIgnatius)
        {
            ResourceLocation location = new ResourceLocation("extraores:ignatiusIngot");
            Register(InitBlocks.itemIngotIgnatius,location.toString());
            location = new ResourceLocation("extraores:ignatiusDust");
            Register(InitBlocks.itemDustIgnatius,location.toString());
            location = new ResourceLocation("extraores:ignatiusclump");
            Register(InitBlocks.itemClumpIgnatius,location.toString());
            location = new ResourceLocation("extraores:ignatiusshard");
            Register(InitBlocks.itemShardIgnatius,location.toString());
            location = new ResourceLocation("extraores:ignatiusdirtydust");
            Register(InitBlocks.itemDirtyDustIgnatius,location.toString());
        }
        if(InitBlocks.registerIndium)
        {
            ResourceLocation location = new ResourceLocation("extraores:indiumIngot");
            Register(InitBlocks.itemIngotIndium,location.toString());
            location = new ResourceLocation("extraores:indiumDust");
            Register(InitBlocks.itemDustIndium,location.toString());
            location = new ResourceLocation("extraores:indiumclump");
            Register(InitBlocks.itemClumpIndium,location.toString());
            location = new ResourceLocation("extraores:indiumshard");
            Register(InitBlocks.itemShardIndium,location.toString());
            location = new ResourceLocation("extraores:indiumdirtydust");
            Register(InitBlocks.itemDirtyDustIndium,location.toString());
        }
        if(InitBlocks.registerInfuscolium)
        {
            ResourceLocation location = new ResourceLocation("extraores:infuscoliumIngot");
            Register(InitBlocks.itemIngotInfuscolium,location.toString());
            location = new ResourceLocation("extraores:infuscoliumDust");
            Register(InitBlocks.itemDustInfuscolium,location.toString());
            location = new ResourceLocation("extraores:infuscoliumclump");
            Register(InitBlocks.itemClumpInfuscolium,location.toString());
            location = new ResourceLocation("extraores:infuscoliumshard");
            Register(InitBlocks.itemShardInfuscolium,location.toString());
            location = new ResourceLocation("extraores:infuscoliumdirtydust");
            Register(InitBlocks.itemDirtyDustInfuscolium,location.toString());
        }
        if(InitBlocks.registerInolashite)
        {
            ResourceLocation location = new ResourceLocation("extraores:inolashiteIngot");
            Register(InitBlocks.itemIngotInolashite,location.toString());
            location = new ResourceLocation("extraores:inolashiteDust");
            Register(InitBlocks.itemDustInolashite,location.toString());
            location = new ResourceLocation("extraores:inolashiteclump");
            Register(InitBlocks.itemClumpInolashite,location.toString());
            location = new ResourceLocation("extraores:inolashiteshard");
            Register(InitBlocks.itemShardInolashite,location.toString());
            location = new ResourceLocation("extraores:inolashitedirtydust");
            Register(InitBlocks.itemDirtyDustInolashite,location.toString());
        }
        if(InitBlocks.registerIridium)
        {
            ResourceLocation location = new ResourceLocation("extraores:iridiumIngot");
            Register(InitBlocks.itemIngotIridium,location.toString());
            location = new ResourceLocation("extraores:iridiumDust");
            Register(InitBlocks.itemDustIridium,location.toString());
            location = new ResourceLocation("extraores:iridiumclump");
            Register(InitBlocks.itemClumpIridium,location.toString());
            location = new ResourceLocation("extraores:iridiumshard");
            Register(InitBlocks.itemShardIridium,location.toString());
            location = new ResourceLocation("extraores:iridiumdirtydust");
            Register(InitBlocks.itemDirtyDustIridium,location.toString());
        }
        if(InitBlocks.registerJade)
        {
            ResourceLocation location = new ResourceLocation("extraores:jade");
            Register(InitBlocks.itemGemJade,location.toString());
        }
        if(InitBlocks.registerJasper)
        {
            ResourceLocation location = new ResourceLocation("extraores:jasper");
            Register(InitBlocks.itemGemJasper,location.toString());
        }
        if(InitBlocks.registerKalendrite)
        {
            ResourceLocation location = new ResourceLocation("extraores:kalendriteIngot");
            Register(InitBlocks.itemIngotKalendrite,location.toString());
            location = new ResourceLocation("extraores:kalendriteDust");
            Register(InitBlocks.itemDustKalendrite,location.toString());
            location = new ResourceLocation("extraores:kalendriteclump");
            Register(InitBlocks.itemClumpKalendrite,location.toString());
            location = new ResourceLocation("extraores:kalendriteshard");
            Register(InitBlocks.itemShardKalendrite,location.toString());
            location = new ResourceLocation("extraores:kalendritedirtydust");
            Register(InitBlocks.itemDirtyDustKalendrite,location.toString());
        }
        if(InitBlocks.registerLead)
        {
            ResourceLocation location = new ResourceLocation("extraores:leadIngot");
            Register(InitBlocks.itemIngotLead,location.toString());
            location = new ResourceLocation("extraores:leadDust");
            Register(InitBlocks.itemDustLead,location.toString());
            location = new ResourceLocation("extraores:leadclump");
            Register(InitBlocks.itemClumpLead,location.toString());
            location = new ResourceLocation("extraores:leadshard");
            Register(InitBlocks.itemShardLead,location.toString());
            location = new ResourceLocation("extraores:leaddirtydust");
            Register(InitBlocks.itemDirtyDustLead,location.toString());
        }
        if(InitBlocks.registerLemurite)
        {
            ResourceLocation location = new ResourceLocation("extraores:lemuriteIngot");
            Register(InitBlocks.itemIngotLemurite,location.toString());
            location = new ResourceLocation("extraores:lemuriteDust");
            Register(InitBlocks.itemDustLemurite,location.toString());
            location = new ResourceLocation("extraores:lemuriteclump");
            Register(InitBlocks.itemClumpLemurite,location.toString());
            location = new ResourceLocation("extraores:lemuriteshard");
            Register(InitBlocks.itemShardLemurite,location.toString());
            location = new ResourceLocation("extraores:lemuritedirtydust");
            Register(InitBlocks.itemDirtyDustLemurite,location.toString());
        }
        if(InitBlocks.registerMalachite)
        {
            ResourceLocation location = new ResourceLocation("extraores:malachite");
            Register(InitBlocks.itemGemMalachite,location.toString());
        }
        if(InitBlocks.registerManganese)
        {
            ResourceLocation location = new ResourceLocation("extraores:manganeseIngot");
            Register(InitBlocks.itemIngotManganese,location.toString());
            location = new ResourceLocation("extraores:manganeseDust");
            Register(InitBlocks.itemDustManganese,location.toString());
            location = new ResourceLocation("extraores:manganeseclump");
            Register(InitBlocks.itemClumpManganese,location.toString());
            location = new ResourceLocation("extraores:manganeseshard");
            Register(InitBlocks.itemShardManganese,location.toString());
            location = new ResourceLocation("extraores:manganesedirtydust");
            Register(InitBlocks.itemDirtyDustManganese,location.toString());
        }
        if(InitBlocks.registerMeutoite)
        {
            ResourceLocation location = new ResourceLocation("extraores:meutoiteIngot");
            Register(InitBlocks.itemIngotMeutoite,location.toString());
            location = new ResourceLocation("extraores:meutoiteDust");
            Register(InitBlocks.itemDustMeutoite,location.toString());
            location = new ResourceLocation("extraores:meutoiteclump");
            Register(InitBlocks.itemClumpMeutoite,location.toString());
            location = new ResourceLocation("extraores:meutoiteshard");
            Register(InitBlocks.itemShardMeutoite,location.toString());
            location = new ResourceLocation("extraores:meutoitedirtydust");
            Register(InitBlocks.itemDirtyDustMeutoite,location.toString());
        }
        if(InitBlocks.registerMidasium)
        {
            ResourceLocation location = new ResourceLocation("extraores:midasiumIngot");
            Register(InitBlocks.itemIngotMidasium,location.toString());
            location = new ResourceLocation("extraores:midasiumDust");
            Register(InitBlocks.itemDustMidasium,location.toString());
            location = new ResourceLocation("extraores:midasiumclump");
            Register(InitBlocks.itemClumpMidasium,location.toString());
            location = new ResourceLocation("extraores:midasiumshard");
            Register(InitBlocks.itemShardMidasium,location.toString());
            location = new ResourceLocation("extraores:midasiumdirtydust");
            Register(InitBlocks.itemDirtyDustMidasium,location.toString());
        }
        if(InitBlocks.registerMithril)
        {
            ResourceLocation location = new ResourceLocation("extraores:mithrilIngot");
            Register(InitBlocks.itemIngotMithril,location.toString());
            location = new ResourceLocation("extraores:mithrilDust");
            Register(InitBlocks.itemDustMithril,location.toString());
            location = new ResourceLocation("extraores:mithrilclump");
            Register(InitBlocks.itemClumpMithril,location.toString());
            location = new ResourceLocation("extraores:mithrilshard");
            Register(InitBlocks.itemShardMithril,location.toString());
            location = new ResourceLocation("extraores:mithrildirtydust");
            Register(InitBlocks.itemDirtyDustMithril,location.toString());
        }
        if(InitBlocks.registerMolybdenum)
        {
            ResourceLocation location = new ResourceLocation("extraores:molybdenumIngot");
            Register(InitBlocks.itemIngotMolybdenum,location.toString());
            location = new ResourceLocation("extraores:molybdenumDust");
            Register(InitBlocks.itemDustMolybdenum,location.toString());
            location = new ResourceLocation("extraores:molybdenumclump");
            Register(InitBlocks.itemClumpMolybdenum,location.toString());
            location = new ResourceLocation("extraores:molybdenumshard");
            Register(InitBlocks.itemShardMolybdenum,location.toString());
            location = new ResourceLocation("extraores:molybdenumdirtydust");
            Register(InitBlocks.itemDirtyDustMolybdenum,location.toString());
        }
        if(InitBlocks.registerNeodymium)
        {
            ResourceLocation location = new ResourceLocation("extraores:neodymiumIngot");
            Register(InitBlocks.itemIngotNeodymium,location.toString());
            location = new ResourceLocation("extraores:neodymiumDust");
            Register(InitBlocks.itemDustNeodymium,location.toString());
            location = new ResourceLocation("extraores:neodymiumclump");
            Register(InitBlocks.itemClumpNeodymium,location.toString());
            location = new ResourceLocation("extraores:neodymiumshard");
            Register(InitBlocks.itemShardNeodymium,location.toString());
            location = new ResourceLocation("extraores:neodymiumdirtydust");
            Register(InitBlocks.itemDirtyDustNeodymium,location.toString());
        }
        if(InitBlocks.registerNeptunium)
        {
            ResourceLocation location = new ResourceLocation("extraores:neptuniumIngot");
            Register(InitBlocks.itemIngotNeptunium,location.toString());
            location = new ResourceLocation("extraores:neptuniumDust");
            Register(InitBlocks.itemDustNeptunium,location.toString());
            location = new ResourceLocation("extraores:neptuniumclump");
            Register(InitBlocks.itemClumpNeptunium,location.toString());
            location = new ResourceLocation("extraores:neptuniumshard");
            Register(InitBlocks.itemShardNeptunium,location.toString());
            location = new ResourceLocation("extraores:neptuniumdirtydust");
            Register(InitBlocks.itemDirtyDustNeptunium,location.toString());
        }
        if(InitBlocks.registerNickel)
        {
            ResourceLocation location = new ResourceLocation("extraores:nickelIngot");
            Register(InitBlocks.itemIngotNickel,location.toString());
            location = new ResourceLocation("extraores:nickelDust");
            Register(InitBlocks.itemDustNickel,location.toString());
            location = new ResourceLocation("extraores:nickelclump");
            Register(InitBlocks.itemClumpNickel,location.toString());
            location = new ResourceLocation("extraores:nickelshard");
            Register(InitBlocks.itemShardNickel,location.toString());
            location = new ResourceLocation("extraores:nickeldirtydust");
            Register(InitBlocks.itemDirtyDustNickel,location.toString());
        }
        if(InitBlocks.registerNiobium)
        {
            ResourceLocation location = new ResourceLocation("extraores:niobiumIngot");
            Register(InitBlocks.itemIngotNiobium,location.toString());
            location = new ResourceLocation("extraores:niobiumDust");
            Register(InitBlocks.itemDustNiobium,location.toString());
            location = new ResourceLocation("extraores:niobiumclump");
            Register(InitBlocks.itemClumpNiobium,location.toString());
            location = new ResourceLocation("extraores:niobiumshard");
            Register(InitBlocks.itemShardNiobium,location.toString());
            location = new ResourceLocation("extraores:niobiumdirtydust");
            Register(InitBlocks.itemDirtyDustNiobium,location.toString());
        }
        if(InitBlocks.registerOnyx)
        {
            ResourceLocation location = new ResourceLocation("extraores:onyx");
            Register(InitBlocks.itemGemOnyx,location.toString());
        }
        if(InitBlocks.registerOrichalcum)
        {
            ResourceLocation location = new ResourceLocation("extraores:orichalcumIngot");
            Register(InitBlocks.itemIngotOrichalcum,location.toString());
            location = new ResourceLocation("extraores:orichalcumDust");
            Register(InitBlocks.itemDustOrichalcum,location.toString());
            location = new ResourceLocation("extraores:orichalcumclump");
            Register(InitBlocks.itemClumpOrichalcum,location.toString());
            location = new ResourceLocation("extraores:orichalcumshard");
            Register(InitBlocks.itemShardOrichalcum,location.toString());
            location = new ResourceLocation("extraores:orichalcumdirtydust");
            Register(InitBlocks.itemDirtyDustOrichalcum,location.toString());
        }
        if(InitBlocks.registerOsmium)
        {
            ResourceLocation location = new ResourceLocation("extraores:osmiumIngot");
            Register(InitBlocks.itemIngotOsmium,location.toString());
            location = new ResourceLocation("extraores:osmiumDust");
            Register(InitBlocks.itemDustOsmium,location.toString());
            location = new ResourceLocation("extraores:osmiumclump");
            Register(InitBlocks.itemClumpOsmium,location.toString());
            location = new ResourceLocation("extraores:osmiumshard");
            Register(InitBlocks.itemShardOsmium,location.toString());
            location = new ResourceLocation("extraores:osmiumdirtydust");
            Register(InitBlocks.itemDirtyDustOsmium,location.toString());
        }
        if(InitBlocks.registerOureclase)
        {
            ResourceLocation location = new ResourceLocation("extraores:oureclaseIngot");
            Register(InitBlocks.itemIngotOureclase,location.toString());
            location = new ResourceLocation("extraores:oureclaseDust");
            Register(InitBlocks.itemDustOureclase,location.toString());
            location = new ResourceLocation("extraores:oureclaseclump");
            Register(InitBlocks.itemClumpOureclase,location.toString());
            location = new ResourceLocation("extraores:oureclaseshard");
            Register(InitBlocks.itemShardOureclase,location.toString());
            location = new ResourceLocation("extraores:oureclasedirtydust");
            Register(InitBlocks.itemDirtyDustOureclase,location.toString());
        }
        if(InitBlocks.registerPalladium)
        {
            ResourceLocation location = new ResourceLocation("extraores:palladiumIngot");
            Register(InitBlocks.itemIngotPalladium,location.toString());
            location = new ResourceLocation("extraores:palladiumDust");
            Register(InitBlocks.itemDustPalladium,location.toString());
            location = new ResourceLocation("extraores:palladiumclump");
            Register(InitBlocks.itemClumpPalladium,location.toString());
            location = new ResourceLocation("extraores:palladiumshard");
            Register(InitBlocks.itemShardPalladium,location.toString());
            location = new ResourceLocation("extraores:palladiumdirtydust");
            Register(InitBlocks.itemDirtyDustPalladium,location.toString());
        }
        if(InitBlocks.registerPeridot)
        {
            ResourceLocation location = new ResourceLocation("extraores:peridot");
            Register(InitBlocks.itemGemPeridot,location.toString());
        }
        if(InitBlocks.registerPhoenixite)
        {
            ResourceLocation location = new ResourceLocation("extraores:phoenixite");
            Register(InitBlocks.itemGemPhoenixite,location.toString());
        }
        if(InitBlocks.registerPlatinum)
        {
            ResourceLocation location = new ResourceLocation("extraores:platinumIngot");
            Register(InitBlocks.itemIngotPlatinum,location.toString());
            location = new ResourceLocation("extraores:platinumDust");
            Register(InitBlocks.itemDustPlatinum,location.toString());
            location = new ResourceLocation("extraores:platinumclump");
            Register(InitBlocks.itemClumpPlatinum,location.toString());
            location = new ResourceLocation("extraores:platinumshard");
            Register(InitBlocks.itemShardPlatinum,location.toString());
            location = new ResourceLocation("extraores:platinumdirtydust");
            Register(InitBlocks.itemDirtyDustPlatinum,location.toString());
        }
        if(InitBlocks.registerPlutonium)
        {
            ResourceLocation location = new ResourceLocation("extraores:plutoniumIngot");
            Register(InitBlocks.itemIngotPlutonium,location.toString());
            location = new ResourceLocation("extraores:plutoniumDust");
            Register(InitBlocks.itemDustPlutonium,location.toString());
            location = new ResourceLocation("extraores:plutoniumclump");
            Register(InitBlocks.itemClumpPlutonium,location.toString());
            location = new ResourceLocation("extraores:plutoniumshard");
            Register(InitBlocks.itemShardPlutonium,location.toString());
            location = new ResourceLocation("extraores:plutoniumdirtydust");
            Register(InitBlocks.itemDirtyDustPlutonium,location.toString());
        }
        if(InitBlocks.registerPolonium)
        {
            ResourceLocation location = new ResourceLocation("extraores:poloniumIngot");
            Register(InitBlocks.itemIngotPolonium,location.toString());
            location = new ResourceLocation("extraores:poloniumDust");
            Register(InitBlocks.itemDustPolonium,location.toString());
            location = new ResourceLocation("extraores:poloniumclump");
            Register(InitBlocks.itemClumpPolonium,location.toString());
            location = new ResourceLocation("extraores:poloniumshard");
            Register(InitBlocks.itemShardPolonium,location.toString());
            location = new ResourceLocation("extraores:poloniumdirtydust");
            Register(InitBlocks.itemDirtyDustPolonium,location.toString());
        }
        if(InitBlocks.registerPromethium)
        {
            ResourceLocation location = new ResourceLocation("extraores:promethiumIngot");
            Register(InitBlocks.itemIngotPromethium,location.toString());
            location = new ResourceLocation("extraores:promethiumDust");
            Register(InitBlocks.itemDustPromethium,location.toString());
            location = new ResourceLocation("extraores:promethiumclump");
            Register(InitBlocks.itemClumpPromethium,location.toString());
            location = new ResourceLocation("extraores:promethiumshard");
            Register(InitBlocks.itemShardPromethium,location.toString());
            location = new ResourceLocation("extraores:promethiumdirtydust");
            Register(InitBlocks.itemDirtyDustPromethium,location.toString());
        }
        if(InitBlocks.registerRhenium)
        {
            ResourceLocation location = new ResourceLocation("extraores:rheniumIngot");
            Register(InitBlocks.itemIngotRhenium,location.toString());
            location = new ResourceLocation("extraores:rheniumDust");
            Register(InitBlocks.itemDustRhenium,location.toString());
            location = new ResourceLocation("extraores:rheniumclump");
            Register(InitBlocks.itemClumpRhenium,location.toString());
            location = new ResourceLocation("extraores:rheniumshard");
            Register(InitBlocks.itemShardRhenium,location.toString());
            location = new ResourceLocation("extraores:rheniumdirtydust");
            Register(InitBlocks.itemDirtyDustRhenium,location.toString());
        }
        if(InitBlocks.registerRhodium)
        {
            ResourceLocation location = new ResourceLocation("extraores:rhodiumIngot");
            Register(InitBlocks.itemIngotRhodium,location.toString());
            location = new ResourceLocation("extraores:rhodiumDust");
            Register(InitBlocks.itemDustRhodium,location.toString());
            location = new ResourceLocation("extraores:rhodiumclump");
            Register(InitBlocks.itemClumpRhodium,location.toString());
            location = new ResourceLocation("extraores:rhodiumshard");
            Register(InitBlocks.itemShardRhodium,location.toString());
            location = new ResourceLocation("extraores:rhodiumdirtydust");
            Register(InitBlocks.itemDirtyDustRhodium,location.toString());
        }
        if(InitBlocks.registerRubracium)
        {
            ResourceLocation location = new ResourceLocation("extraores:rubraciumIngot");
            Register(InitBlocks.itemIngotRubracium,location.toString());
            location = new ResourceLocation("extraores:rubraciumDust");
            Register(InitBlocks.itemDustRubracium,location.toString());
            location = new ResourceLocation("extraores:rubraciumclump");
            Register(InitBlocks.itemClumpRubracium,location.toString());
            location = new ResourceLocation("extraores:rubraciumshard");
            Register(InitBlocks.itemShardRubracium,location.toString());
            location = new ResourceLocation("extraores:rubraciumdirtydust");
            Register(InitBlocks.itemDirtyDustRubracium,location.toString());
        }
        if(InitBlocks.registerRuby)
        {
            ResourceLocation location = new ResourceLocation("extraores:ruby");
            Register(InitBlocks.itemGemRuby,location.toString());
        }
        if(InitBlocks.registerRuthenium)
        {
            ResourceLocation location = new ResourceLocation("extraores:rutheniumIngot");
            Register(InitBlocks.itemIngotRuthenium,location.toString());
            location = new ResourceLocation("extraores:rutheniumDust");
            Register(InitBlocks.itemDustRuthenium,location.toString());
            location = new ResourceLocation("extraores:rutheniumclump");
            Register(InitBlocks.itemClumpRuthenium,location.toString());
            location = new ResourceLocation("extraores:rutheniumshard");
            Register(InitBlocks.itemShardRuthenium,location.toString());
            location = new ResourceLocation("extraores:rutheniumdirtydust");
            Register(InitBlocks.itemDirtyDustRuthenium,location.toString());
        }
        if(InitBlocks.registerSanguinite)
        {
            ResourceLocation location = new ResourceLocation("extraores:sanguiniteIngot");
            Register(InitBlocks.itemIngotSanguinite,location.toString());
            location = new ResourceLocation("extraores:sanguiniteDust");
            Register(InitBlocks.itemDustSanguinite,location.toString());
            location = new ResourceLocation("extraores:sanguiniteclump");
            Register(InitBlocks.itemClumpSanguinite,location.toString());
            location = new ResourceLocation("extraores:sanguiniteshard");
            Register(InitBlocks.itemShardSanguinite,location.toString());
            location = new ResourceLocation("extraores:sanguinitedirtydust");
            Register(InitBlocks.itemDirtyDustSanguinite,location.toString());
        }
        if(InitBlocks.registerSapphire)
        {
            ResourceLocation location = new ResourceLocation("extraores:sapphire");
            Register(InitBlocks.itemGemSapphire,location.toString());
        }
        if(InitBlocks.registerShadowIron)
        {
            ResourceLocation location = new ResourceLocation("extraores:shadowIronIngot");
            Register(InitBlocks.itemIngotShadowIron,location.toString());
            location = new ResourceLocation("extraores:shadowIronDust");
            Register(InitBlocks.itemDustShadowIron,location.toString());
            location = new ResourceLocation("extraores:shadowIronclump");
            Register(InitBlocks.itemClumpShadowIron,location.toString());
            location = new ResourceLocation("extraores:shadowIronshard");
            Register(InitBlocks.itemShardShadowIron,location.toString());
            location = new ResourceLocation("extraores:shadowIrondirtydust");
            Register(InitBlocks.itemDirtyDustShadowIron,location.toString());
        }
        if(InitBlocks.registerSilver)
        {
            ResourceLocation location = new ResourceLocation("extraores:silverIngot");
            Register(InitBlocks.itemIngotSilver,location.toString());
            location = new ResourceLocation("extraores:silverDust");
            Register(InitBlocks.itemDustSilver,location.toString());
            location = new ResourceLocation("extraores:silverclump");
            Register(InitBlocks.itemClumpSilver,location.toString());
            location = new ResourceLocation("extraores:silvershard");
            Register(InitBlocks.itemShardSilver,location.toString());
            location = new ResourceLocation("extraores:silverdirtydust");
            Register(InitBlocks.itemDirtyDustSilver,location.toString());
        }
        if(InitBlocks.registerSpinel)
        {
            ResourceLocation location = new ResourceLocation("extraores:spinel");
            Register(InitBlocks.itemGemSpinel,location.toString());
        }
        if(InitBlocks.registerSugilite)
        {
            ResourceLocation location = new ResourceLocation("extraores:sugilite");
            Register(InitBlocks.itemGemSugilite,location.toString());
        }
        if(InitBlocks.registerTantalum)
        {
            ResourceLocation location = new ResourceLocation("extraores:tantalumIngot");
            Register(InitBlocks.itemIngotTantalum,location.toString());
            location = new ResourceLocation("extraores:tantalumDust");
            Register(InitBlocks.itemDustTantalum,location.toString());
            location = new ResourceLocation("extraores:tantalumclump");
            Register(InitBlocks.itemClumpTantalum,location.toString());
            location = new ResourceLocation("extraores:tantalumshard");
            Register(InitBlocks.itemShardTantalum,location.toString());
            location = new ResourceLocation("extraores:tantalumdirtydust");
            Register(InitBlocks.itemDirtyDustTantalum,location.toString());
        }
        if(InitBlocks.registerTartarite)
        {
            ResourceLocation location = new ResourceLocation("extraores:tartariteIngot");
            Register(InitBlocks.itemIngotTartarite,location.toString());
            location = new ResourceLocation("extraores:tartariteDust");
            Register(InitBlocks.itemDustTartarite,location.toString());
            location = new ResourceLocation("extraores:tartariteclump");
            Register(InitBlocks.itemClumpTartarite,location.toString());
            location = new ResourceLocation("extraores:tartariteshard");
            Register(InitBlocks.itemShardTartarite,location.toString());
            location = new ResourceLocation("extraores:tartaritedirtydust");
            Register(InitBlocks.itemDirtyDustTartarite,location.toString());
        }
        if(InitBlocks.registerTechnetium)
        {
            ResourceLocation location = new ResourceLocation("extraores:technetiumIngot");
            Register(InitBlocks.itemIngotTechnetium,location.toString());
            location = new ResourceLocation("extraores:technetiumDust");
            Register(InitBlocks.itemDustTechnetium,location.toString());
            location = new ResourceLocation("extraores:technetiumclump");
            Register(InitBlocks.itemClumpTechnetium,location.toString());
            location = new ResourceLocation("extraores:technetiumshard");
            Register(InitBlocks.itemShardTechnetium,location.toString());
            location = new ResourceLocation("extraores:technetiumdirtydust");
            Register(InitBlocks.itemDirtyDustTechnetium,location.toString());
        }
        if(InitBlocks.registerThallium)
        {
            ResourceLocation location = new ResourceLocation("extraores:thalliumIngot");
            Register(InitBlocks.itemIngotThallium,location.toString());
            location = new ResourceLocation("extraores:thalliumDust");
            Register(InitBlocks.itemDustThallium,location.toString());
            location = new ResourceLocation("extraores:thalliumclump");
            Register(InitBlocks.itemClumpThallium,location.toString());
            location = new ResourceLocation("extraores:thalliumshard");
            Register(InitBlocks.itemShardThallium,location.toString());
            location = new ResourceLocation("extraores:thalliumdirtydust");
            Register(InitBlocks.itemDirtyDustThallium,location.toString());
        }
        if(InitBlocks.registerTin)
        {
            ResourceLocation location = new ResourceLocation("extraores:tinIngot");
            Register(InitBlocks.itemIngotTin,location.toString());
            location = new ResourceLocation("extraores:tinDust");
            Register(InitBlocks.itemDustTin,location.toString());
            location = new ResourceLocation("extraores:tinclump");
            Register(InitBlocks.itemClumpTin,location.toString());
            location = new ResourceLocation("extraores:tinshard");
            Register(InitBlocks.itemShardTin,location.toString());
            location = new ResourceLocation("extraores:tindirtydust");
            Register(InitBlocks.itemDirtyDustTin,location.toString());
        }
        if(InitBlocks.registerTitanium)
        {
            ResourceLocation location = new ResourceLocation("extraores:titaniumIngot");
            Register(InitBlocks.itemIngotTitanium,location.toString());
            location = new ResourceLocation("extraores:titaniumDust");
            Register(InitBlocks.itemDustTitanium,location.toString());
            location = new ResourceLocation("extraores:titaniumclump");
            Register(InitBlocks.itemClumpTitanium,location.toString());
            location = new ResourceLocation("extraores:titaniumshard");
            Register(InitBlocks.itemShardTitanium,location.toString());
            location = new ResourceLocation("extraores:titaniumdirtydust");
            Register(InitBlocks.itemDirtyDustTitanium,location.toString());
        }
        if(InitBlocks.registerTopaz)
        {
            ResourceLocation location = new ResourceLocation("extraores:topaz");
            Register(InitBlocks.itemGemTopaz,location.toString());
        }
        if(InitBlocks.registerTourmaline)
        {
            ResourceLocation location = new ResourceLocation("extraores:tourmaline");
            Register(InitBlocks.itemGemTourmaline,location.toString());
        }
        if(InitBlocks.registerTungsten)
        {
            ResourceLocation location = new ResourceLocation("extraores:tungstenIngot");
            Register(InitBlocks.itemIngotTungsten,location.toString());
            location = new ResourceLocation("extraores:tungstenDust");
            Register(InitBlocks.itemDustTungsten,location.toString());
            location = new ResourceLocation("extraores:tungstenclump");
            Register(InitBlocks.itemClumpTungsten,location.toString());
            location = new ResourceLocation("extraores:tungstenshard");
            Register(InitBlocks.itemShardTungsten,location.toString());
            location = new ResourceLocation("extraores:tungstendirtydust");
            Register(InitBlocks.itemDirtyDustTungsten,location.toString());
        }
        if(InitBlocks.registerUnobtainium)
        {
            ResourceLocation location = new ResourceLocation("extraores:unobtainiumIngot");
            Register(InitBlocks.itemIngotUnobtainium,location.toString());
            location = new ResourceLocation("extraores:unobtainiumDust");
            Register(InitBlocks.itemDustUnobtainium,location.toString());
            location = new ResourceLocation("extraores:unobtainiumclump");
            Register(InitBlocks.itemClumpUnobtainium,location.toString());
            location = new ResourceLocation("extraores:unobtainiumshard");
            Register(InitBlocks.itemShardUnobtainium,location.toString());
            location = new ResourceLocation("extraores:unobtainiumdirtydust");
            Register(InitBlocks.itemDirtyDustUnobtainium,location.toString());
        }
        if(InitBlocks.registerUranium)
        {
            ResourceLocation location = new ResourceLocation("extraores:uraniumIngot");
            Register(InitBlocks.itemIngotUranium,location.toString());
            location = new ResourceLocation("extraores:uraniumDust");
            Register(InitBlocks.itemDustUranium,location.toString());
            location = new ResourceLocation("extraores:uraniumclump");
            Register(InitBlocks.itemClumpUranium,location.toString());
            location = new ResourceLocation("extraores:uraniumshard");
            Register(InitBlocks.itemShardUranium,location.toString());
            location = new ResourceLocation("extraores:uraniumdirtydust");
            Register(InitBlocks.itemDirtyDustUranium,location.toString());
        }
        if(InitBlocks.registerVanadium)
        {
            ResourceLocation location = new ResourceLocation("extraores:vanadiumIngot");
            Register(InitBlocks.itemIngotVanadium,location.toString());
            location = new ResourceLocation("extraores:vanadiumDust");
            Register(InitBlocks.itemDustVanadium,location.toString());
            location = new ResourceLocation("extraores:vanadiumclump");
            Register(InitBlocks.itemClumpVanadium,location.toString());
            location = new ResourceLocation("extraores:vanadiumshard");
            Register(InitBlocks.itemShardVanadium,location.toString());
            location = new ResourceLocation("extraores:vanadiumdirtydust");
            Register(InitBlocks.itemDirtyDustVanadium,location.toString());
        }
        if(InitBlocks.registerVulcanite)
        {
            ResourceLocation location = new ResourceLocation("extraores:vulcaniteIngot");
            Register(InitBlocks.itemIngotVulcanite,location.toString());
            location = new ResourceLocation("extraores:vulcaniteDust");
            Register(InitBlocks.itemDustVulcanite,location.toString());
            location = new ResourceLocation("extraores:vulcaniteclump");
            Register(InitBlocks.itemClumpVulcanite,location.toString());
            location = new ResourceLocation("extraores:vulcaniteshard");
            Register(InitBlocks.itemShardVulcanite,location.toString());
            location = new ResourceLocation("extraores:vulcanitedirtydust");
            Register(InitBlocks.itemDirtyDustVulcanite,location.toString());
        }
        if(InitBlocks.registerVyroxeres)
        {
            ResourceLocation location = new ResourceLocation("extraores:vyroxeresIngot");
            Register(InitBlocks.itemIngotVyroxeres,location.toString());
            location = new ResourceLocation("extraores:vyroxeresDust");
            Register(InitBlocks.itemDustVyroxeres,location.toString());
            location = new ResourceLocation("extraores:vyroxeresclump");
            Register(InitBlocks.itemClumpVyroxeres,location.toString());
            location = new ResourceLocation("extraores:vyroxeresshard");
            Register(InitBlocks.itemShardVyroxeres,location.toString());
            location = new ResourceLocation("extraores:vyroxeresdirtydust");
            Register(InitBlocks.itemDirtyDustVyroxeres,location.toString());
        }
        if(InitBlocks.registerYellorite)
        {
            ResourceLocation location = new ResourceLocation("extraores:yelloriteIngot");
            Register(InitBlocks.itemIngotYellorite,location.toString());
            location = new ResourceLocation("extraores:yelloriteDust");
            Register(InitBlocks.itemDustYellorite,location.toString());
            location = new ResourceLocation("extraores:yelloriteclump");
            Register(InitBlocks.itemClumpYellorite,location.toString());
            location = new ResourceLocation("extraores:yelloriteshard");
            Register(InitBlocks.itemShardYellorite,location.toString());
            location = new ResourceLocation("extraores:yelloritedirtydust");
            Register(InitBlocks.itemDirtyDustYellorite,location.toString());
        }
        if(InitBlocks.registerZinc)
        {
            ResourceLocation location = new ResourceLocation("extraores:zincIngot");
            Register(InitBlocks.itemIngotZinc,location.toString());
            location = new ResourceLocation("extraores:zincDust");
            Register(InitBlocks.itemDustZinc,location.toString());
            location = new ResourceLocation("extraores:zincclump");
            Register(InitBlocks.itemClumpZinc,location.toString());
            location = new ResourceLocation("extraores:zincshard");
            Register(InitBlocks.itemShardZinc,location.toString());
            location = new ResourceLocation("extraores:zincdirtydust");
            Register(InitBlocks.itemDirtyDustZinc,location.toString());
        }
        if(InitBlocks.registerZirconium)
        {
            ResourceLocation location = new ResourceLocation("extraores:zirconiumIngot");
            Register(InitBlocks.itemIngotZirconium,location.toString());
            location = new ResourceLocation("extraores:zirconiumDust");
            Register(InitBlocks.itemDustZirconium,location.toString());
            location = new ResourceLocation("extraores:zirconiumclump");
            Register(InitBlocks.itemClumpZirconium,location.toString());
            location = new ResourceLocation("extraores:zirconiumshard");
            Register(InitBlocks.itemShardZirconium,location.toString());
            location = new ResourceLocation("extraores:zirconiumdirtydust");
            Register(InitBlocks.itemDirtyDustZirconium,location.toString());
        }
    }
    private static void Register(Item item, String resource)
    {
        ModelResourceLocation location = new ModelResourceLocation(resource,"inventory");
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item,0,location);
    }
}

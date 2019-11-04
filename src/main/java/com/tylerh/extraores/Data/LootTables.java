package com.tylerh.extraores.Data;

import com.tylerh.extraores.Init.BlockList;
import net.minecraft.data.DataGenerator;

public class LootTables extends BaseLootTableProvider
{

    public LootTables(DataGenerator dataGeneratorIn)
    {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables()
    {
        //Ores
        lootTables.put(BlockList.blockOreAdamantine,createStandardTable("adamantineore",BlockList.blockOreAdamantine));
        lootTables.put(BlockList.blockOreAldourite,createStandardTable("aldouriteore",BlockList.blockOreAldourite));
        lootTables.put(BlockList.blockOreAluminum,createStandardTable("aluminumore",BlockList.blockOreAluminum));
        lootTables.put(BlockList.blockOreAmordrine,createStandardTable("amordrineore",BlockList.blockOreAmordrine));
        lootTables.put(BlockList.blockOreAngmallen,createStandardTable("angmallenore",BlockList.blockOreAngmallen));
        lootTables.put(BlockList.blockOreAstralSilver,createStandardTable("astralsilverore",BlockList.blockOreAstralSilver));
        lootTables.put(BlockList.blockOreAtlarus,createStandardTable("atlarusore",BlockList.blockOreAtlarus));
        lootTables.put(BlockList.blockOreBismuth,createStandardTable("bismuthore",BlockList.blockOreBismuth));
        lootTables.put(BlockList.blockOreBlackSteel,createStandardTable("blacksteelore",BlockList.blockOreBlackSteel));
        lootTables.put(BlockList.blockOreCadmium,createStandardTable("cadmiumore",BlockList.blockOreCadmium));
        lootTables.put(BlockList.blockOreCarmot,createStandardTable("carmotore",BlockList.blockOreCarmot));
        lootTables.put(BlockList.blockOreCelenegil,createStandardTable("celenegilore",BlockList.blockOreCelenegil));
        lootTables.put(BlockList.blockOreCeruclase,createStandardTable("ceruclaseore",BlockList.blockOreCeruclase));
        lootTables.put(BlockList.blockOreChromium,createStandardTable("chromiumore",BlockList.blockOreChromium));
        lootTables.put(BlockList.blockOreCobalt,createStandardTable("cobaltore",BlockList.blockOreCobalt));
        lootTables.put(BlockList.blockOreCopper,createStandardTable("copperore",BlockList.blockOreCopper));
        lootTables.put(BlockList.blockOreDeepIron,createStandardTable("deepironore",BlockList.blockOreDeepIron));
        lootTables.put(BlockList.blockOreGallium,createStandardTable("galliumore",BlockList.blockOreGallium));
        lootTables.put(BlockList.blockOreHaderoth,createStandardTable("haderothore",BlockList.blockOreHaderoth));
        lootTables.put(BlockList.blockOreHepatizon,createStandardTable("hepatizonore",BlockList.blockOreHepatizon));
        lootTables.put(BlockList.blockOreIgnatius,createStandardTable("ignatiusore",BlockList.blockOreIgnatius));
        lootTables.put(BlockList.blockOreIndium,createStandardTable("indiumore",BlockList.blockOreIndium));
        lootTables.put(BlockList.blockOreInfuscolium,createStandardTable("infuscoliumore",BlockList.blockOreInfuscolium));
        lootTables.put(BlockList.blockOreInolashite,createStandardTable("inolashiteore",BlockList.blockOreInolashite));
        lootTables.put(BlockList.blockOreKalendrite,createStandardTable("kalendriteore",BlockList.blockOreKalendrite));
        lootTables.put(BlockList.blockOreLead,createStandardTable("leadore",BlockList.blockOreLead));
        lootTables.put(BlockList.blockOreLemurite,createStandardTable("lemuriteore",BlockList.blockOreLemurite));
        lootTables.put(BlockList.blockOreManganese,createStandardTable("manganeseore",BlockList.blockOreManganese));
        lootTables.put(BlockList.blockOreMidasium,createStandardTable("midasiumore",BlockList.blockOreMidasium));
        lootTables.put(BlockList.blockOreMithril,createStandardTable("mithrilore",BlockList.blockOreMithril));
        lootTables.put(BlockList.blockOreMolybdenum,createStandardTable("molybdenumore",BlockList.blockOreMolybdenum));
        lootTables.put(BlockList.blockOreNeodymium,createStandardTable("neodymiumore",BlockList.blockOreNeodymium));
        lootTables.put(BlockList.blockOreNickel,createStandardTable("nickelore",BlockList.blockOreNickel));
        lootTables.put(BlockList.blockOreNiobium,createStandardTable("niobiumore",BlockList.blockOreNiobium));
        lootTables.put(BlockList.blockOreOrichalcum,createStandardTable("orichalcumore",BlockList.blockOreOrichalcum));
        lootTables.put(BlockList.blockOreOureclase,createStandardTable("ourecolaseore",BlockList.blockOreOureclase));
        lootTables.put(BlockList.blockOrePalladium,createStandardTable("palladiumore",BlockList.blockOrePalladium));
        lootTables.put(BlockList.blockOrePlatinum,createStandardTable("platinumore",BlockList.blockOrePlatinum));
        lootTables.put(BlockList.blockOrePrometheum,createStandardTable("prometheumore",BlockList.blockOrePrometheum));
        lootTables.put(BlockList.blockOreRhodium,createStandardTable("rhodiumore",BlockList.blockOreRhodium));
        lootTables.put(BlockList.blockOreRubracium,createStandardTable("rubraciumore",BlockList.blockOreRubracium));
        lootTables.put(BlockList.blockOreRuthenium,createStandardTable("rutheniumore",BlockList.blockOreRuthenium));
        lootTables.put(BlockList.blockOreSanguinite,createStandardTable("sanguiniteore",BlockList.blockOreSanguinite));
        lootTables.put(BlockList.blockOreShadowIron,createStandardTable("shadowironore",BlockList.blockOreShadowIron));
        lootTables.put(BlockList.blockOreSilver,createStandardTable("silverore",BlockList.blockOreSilver));
        lootTables.put(BlockList.blockOreTechnetium,createStandardTable("technetiumore",BlockList.blockOreTechnetium));
        lootTables.put(BlockList.blockOreThallium,createStandardTable("thalliumore",BlockList.blockOreThallium));
        lootTables.put(BlockList.blockOreTin,createStandardTable("tinore",BlockList.blockOreTin));
        lootTables.put(BlockList.blockOreTitanium,createStandardTable("titaniumore",BlockList.blockOreTitanium));
        lootTables.put(BlockList.blockOreTungsten,createStandardTable("tungstenore",BlockList.blockOreTungsten));
        lootTables.put(BlockList.blockOreUnobtainium,createStandardTable("unobtainiumore",BlockList.blockOreUnobtainium));
        lootTables.put(BlockList.blockOreVanadium,createStandardTable("vanadiumore",BlockList.blockOreVanadium));
        lootTables.put(BlockList.blockOreVulcanite,createStandardTable("vulcaniteore",BlockList.blockOreVulcanite));
        lootTables.put(BlockList.blockOreVyroxeres,createStandardTable("vyroxeresore",BlockList.blockOreVyroxeres));
        lootTables.put(BlockList.blockOreZinc,createStandardTable("zincore",BlockList.blockOreZinc));
        lootTables.put(BlockList.blockOreZirconium,createStandardTable("zirconiumore",BlockList.blockOreZirconium));
        //Blocks
        lootTables.put(BlockList.blockAdamantine,createStandardTable("adamantineblock",BlockList.blockAdamantine));
        lootTables.put(BlockList.blockAldourite,createStandardTable("aldouriteblock",BlockList.blockAldourite));
        lootTables.put(BlockList.blockAluminum,createStandardTable("aluminumblock",BlockList.blockAluminum));
        lootTables.put(BlockList.blockAmordrine,createStandardTable("amordrineblock",BlockList.blockAmordrine));
        lootTables.put(BlockList.blockAngmallen,createStandardTable("angmallenblock",BlockList.blockAngmallen));
        lootTables.put(BlockList.blockAstralSilver,createStandardTable("astralsilverblock",BlockList.blockAstralSilver));
        lootTables.put(BlockList.blockAtlarus,createStandardTable("atlarusblock",BlockList.blockAtlarus));
        lootTables.put(BlockList.blockBismuth,createStandardTable("bismuthblock",BlockList.blockBismuth));
        lootTables.put(BlockList.blockBlackSteel,createStandardTable("blacksteelblock",BlockList.blockBlackSteel));
        lootTables.put(BlockList.blockCadmium,createStandardTable("cadmiumblock",BlockList.blockCadmium));
        lootTables.put(BlockList.blockCarmot,createStandardTable("carmotblock",BlockList.blockCarmot));
        lootTables.put(BlockList.blockCelenegil,createStandardTable("celenegilblock",BlockList.blockCelenegil));
        lootTables.put(BlockList.blockCeruclase,createStandardTable("ceruclaseblock",BlockList.blockCeruclase));
        lootTables.put(BlockList.blockChromium,createStandardTable("chromiumblock",BlockList.blockChromium));
        lootTables.put(BlockList.blockCobalt,createStandardTable("cobaltblock",BlockList.blockCobalt));
        lootTables.put(BlockList.blockCopper,createStandardTable("copperblock",BlockList.blockCopper));
        lootTables.put(BlockList.blockDeepIron,createStandardTable("deepironblock",BlockList.blockDeepIron));
        lootTables.put(BlockList.blockGallium,createStandardTable("galliumblock",BlockList.blockGallium));
        lootTables.put(BlockList.blockHaderoth,createStandardTable("haderothblock",BlockList.blockHaderoth));
        lootTables.put(BlockList.blockHepatizon,createStandardTable("hepatizonblock",BlockList.blockHepatizon));
        lootTables.put(BlockList.blockIgnatius,createStandardTable("ignatiusblock",BlockList.blockIgnatius));
        lootTables.put(BlockList.blockIndium,createStandardTable("indiumblock",BlockList.blockIndium));
        lootTables.put(BlockList.blockInfuscolium,createStandardTable("infuscoliumblock",BlockList.blockInfuscolium));
        lootTables.put(BlockList.blockInolashite,createStandardTable("inolashiteblock",BlockList.blockInolashite));
        lootTables.put(BlockList.blockKalendrite,createStandardTable("kalendriteblock",BlockList.blockKalendrite));
        lootTables.put(BlockList.blockLead,createStandardTable("leadblock",BlockList.blockLead));
        lootTables.put(BlockList.blockLemurite,createStandardTable("lemuriteblock",BlockList.blockLemurite));
        lootTables.put(BlockList.blockManganese,createStandardTable("manganeseblock",BlockList.blockManganese));
        lootTables.put(BlockList.blockMidasium,createStandardTable("midasiumblock",BlockList.blockMidasium));
        lootTables.put(BlockList.blockMithril,createStandardTable("mithrilblock",BlockList.blockMithril));
        lootTables.put(BlockList.blockMolybdenum,createStandardTable("molybdenumblock",BlockList.blockMolybdenum));
        lootTables.put(BlockList.blockNeodymium,createStandardTable("neodymiumblock",BlockList.blockNeodymium));
        lootTables.put(BlockList.blockNickel,createStandardTable("nickelblock",BlockList.blockNickel));
        lootTables.put(BlockList.blockNiobium,createStandardTable("niobiumblock",BlockList.blockNiobium));
        lootTables.put(BlockList.blockOrichalcum,createStandardTable("orichalcumblock",BlockList.blockOrichalcum));
        lootTables.put(BlockList.blockOureclase,createStandardTable("ourecolaseblock",BlockList.blockOureclase));
        lootTables.put(BlockList.blockPalladium,createStandardTable("palladiumblock",BlockList.blockPalladium));
        lootTables.put(BlockList.blockPlatinum,createStandardTable("platinumblock",BlockList.blockPlatinum));
        lootTables.put(BlockList.blockPrometheum,createStandardTable("prometheumblock",BlockList.blockPrometheum));
        lootTables.put(BlockList.blockRhodium,createStandardTable("rhodiumblock",BlockList.blockRhodium));
        lootTables.put(BlockList.blockRubracium,createStandardTable("rubraciumblock",BlockList.blockRubracium));
        lootTables.put(BlockList.blockRuthenium,createStandardTable("rutheniumblock",BlockList.blockRuthenium));
        lootTables.put(BlockList.blockSanguinite,createStandardTable("sanguiniteblock",BlockList.blockSanguinite));
        lootTables.put(BlockList.blockShadowIron,createStandardTable("shadowironblock",BlockList.blockShadowIron));
        lootTables.put(BlockList.blockSilver,createStandardTable("silverblock",BlockList.blockSilver));
        lootTables.put(BlockList.blockTechnetium,createStandardTable("technetiumblock",BlockList.blockTechnetium));
        lootTables.put(BlockList.blockThallium,createStandardTable("thalliumblock",BlockList.blockThallium));
        lootTables.put(BlockList.blockTin,createStandardTable("tinblock",BlockList.blockTin));
        lootTables.put(BlockList.blockTitanium,createStandardTable("titaniumblock",BlockList.blockTitanium));
        lootTables.put(BlockList.blockTungsten,createStandardTable("tungstenblock",BlockList.blockTungsten));
        lootTables.put(BlockList.blockUnobtainium,createStandardTable("unobtainiumblock",BlockList.blockUnobtainium));
        lootTables.put(BlockList.blockVanadium,createStandardTable("vanadiumblock",BlockList.blockVanadium));
        lootTables.put(BlockList.blockVulcanite,createStandardTable("vulcaniteblock",BlockList.blockVulcanite));
        lootTables.put(BlockList.blockVyroxeres,createStandardTable("vyroxeresblock",BlockList.blockVyroxeres));
        lootTables.put(BlockList.blockZinc,createStandardTable("zincblock",BlockList.blockZinc));
        lootTables.put(BlockList.blockZirconium,createStandardTable("zirconiumblock",BlockList.blockZirconium));
    }
}
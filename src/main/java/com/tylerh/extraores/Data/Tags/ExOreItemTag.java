package com.tylerh.extraores.Data.Tags;

import com.tylerh.extraores.Init.ItemList;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeItemTagsProvider;

public class ExOreItemTag extends ForgeItemTagsProvider
{
    public ExOreItemTag(DataGenerator gen, BlockTagsProvider blockTagsProvider, ExistingFileHelper existingFileHelper)
    {
        super(gen,blockTagsProvider,existingFileHelper);
    }

    @Override
    public void registerTags()
    {
        //Ores
        copy(BlockTagList.ORES,ItemTagList.ORES);
        copy(BlockTagList.oreAdamantine,ItemTagList.oreAdamantine);
        copy(BlockTagList.oreAldourite,ItemTagList.oreAldourite);
        copy(BlockTagList.oreAluminum,ItemTagList.oreAluminum);
        copy(BlockTagList.oreAmericium,ItemTagList.oreAmericium);
        copy(BlockTagList.oreAmordrine,ItemTagList.oreAmordrine);
        copy(BlockTagList.oreAngmallen,ItemTagList.oreAngmallen);
        copy(BlockTagList.oreAstralSilver,ItemTagList.oreAstralSilver);
        copy(BlockTagList.oreAtlarus,ItemTagList.oreAtlarus);
        copy(BlockTagList.oreBismuth,ItemTagList.oreBismuth);
        copy(BlockTagList.oreBlackSteel,ItemTagList.oreBlackSteel);
        copy(BlockTagList.oreCadmium,ItemTagList.oreCadmium);
        copy(BlockTagList.oreCarmot,ItemTagList.oreCarmot);
        copy(BlockTagList.oreCelenegil,ItemTagList.oreCelenegil);
        copy(BlockTagList.oreCeruclase,ItemTagList.oreCeruclase);
        copy(BlockTagList.oreChromium,ItemTagList.oreChromium);
        copy(BlockTagList.oreCobalt,ItemTagList.oreCobalt);
        copy(BlockTagList.oreCopper,ItemTagList.oreCopper);
        copy(BlockTagList.oreDeepIron,ItemTagList.oreDeepIron);
        copy(BlockTagList.oreDesichalkos,ItemTagList.oreDesichalkos);
        copy(BlockTagList.oreEximite,ItemTagList.oreEximite);
        copy(BlockTagList.oreGallium,ItemTagList.oreGallium);
        copy(BlockTagList.oreHaderoth,ItemTagList.oreHaderoth);
        copy(BlockTagList.oreHepatizon,ItemTagList.oreHepatizon);
        copy(BlockTagList.oreIgnatius,ItemTagList.oreIgnatius);
        copy(BlockTagList.oreIndium,ItemTagList.oreIndium);
        copy(BlockTagList.oreInfuscolium,ItemTagList.oreInfuscolium);
        copy(BlockTagList.oreInolashite,ItemTagList.oreInolashite);
        copy(BlockTagList.oreIridium,ItemTagList.oreIridium);
        copy(BlockTagList.oreKalendrite,ItemTagList.oreKalendrite);
        copy(BlockTagList.oreLead,ItemTagList.oreLead);
        copy(BlockTagList.oreLemurite,ItemTagList.oreLemurite);
        copy(BlockTagList.oreManganese,ItemTagList.oreManganese);
        copy(BlockTagList.oreMeutoite,ItemTagList.oreMeutoite);
        copy(BlockTagList.oreMidasium,ItemTagList.oreMidasium);
        copy(BlockTagList.oreMithril,ItemTagList.oreMithril);
        copy(BlockTagList.oreMolybdenum,ItemTagList.oreMolybdenum);
        copy(BlockTagList.oreNeodymium,ItemTagList.oreNeodymium);
        copy(BlockTagList.oreNeptunium,ItemTagList.oreNeptunium);
        copy(BlockTagList.oreNickel,ItemTagList.oreNickel);
        copy(BlockTagList.oreNiobium,ItemTagList.oreNiobium);
        copy(BlockTagList.oreOrichalcum,ItemTagList.oreOrichalcum);
        copy(BlockTagList.oreOsmium,ItemTagList.oreOsmium);
        copy(BlockTagList.oreOureclase,ItemTagList.oreOureclase);
        copy(BlockTagList.orePalladium,ItemTagList.orePalladium);
        copy(BlockTagList.orePlatinum,ItemTagList.orePlatinum);
        copy(BlockTagList.orePlutonium,ItemTagList.orePlutonium);
        copy(BlockTagList.orePolonium,ItemTagList.orePolonium);
        copy(BlockTagList.orePromethium,ItemTagList.orePromethium);
        copy(BlockTagList.oreRhenium,ItemTagList.oreRhenium);
        copy(BlockTagList.oreRhodium,ItemTagList.oreRhodium);
        copy(BlockTagList.oreRubracium,ItemTagList.oreRubracium);
        copy(BlockTagList.oreRuthenium,ItemTagList.oreRuthenium);
        copy(BlockTagList.oreSanguinite,ItemTagList.oreSanguinite);
        copy(BlockTagList.oreShadowIron,ItemTagList.oreShadowIron);
        copy(BlockTagList.oreSilver,ItemTagList.oreSilver);
        copy(BlockTagList.oreTantalum,ItemTagList.oreTantalum);
        copy(BlockTagList.oreTartarite,ItemTagList.oreTartarite);
        copy(BlockTagList.oreTechnetium,ItemTagList.oreTechnetium);
        copy(BlockTagList.oreThallium,ItemTagList.oreThallium);
        copy(BlockTagList.oreTin,ItemTagList.oreTin);
        copy(BlockTagList.oreTitanium,ItemTagList.oreTitanium);
        copy(BlockTagList.oreTungsten,ItemTagList.oreTungsten);
        copy(BlockTagList.oreUnobtainium,ItemTagList.oreUnobtainium);
        copy(BlockTagList.oreUranium,ItemTagList.oreUranium);
        copy(BlockTagList.oreVanadium,ItemTagList.oreVanadium);
        copy(BlockTagList.oreVulcanite,ItemTagList.oreVulcanite);
        copy(BlockTagList.oreVyroxeres,ItemTagList.oreVyroxeres);
        copy(BlockTagList.oreYellorite,ItemTagList.oreYellorite);
        copy(BlockTagList.oreZinc,ItemTagList.oreZinc);
        copy(BlockTagList.oreZirconium,ItemTagList.oreZirconium);
        //Blocks
        copy(BlockTagList.STORAGE_BLOCKS,ItemTagList.STORAGE_BLOCKS);
        copy(BlockTagList.blockAdamantine,ItemTagList.blockAdamantine);
        copy(BlockTagList.blockAldourite,ItemTagList.blockAldourite);
        copy(BlockTagList.blockAluminum,ItemTagList.blockAluminum);
        copy(BlockTagList.blockAmericium,ItemTagList.blockAmericium);
        copy(BlockTagList.blockAmordrine,ItemTagList.blockAmordrine);
        copy(BlockTagList.blockAngmallen,ItemTagList.blockAngmallen);
        copy(BlockTagList.blockAstralSilver,ItemTagList.blockAstralSilver);
        copy(BlockTagList.blockAtlarus,ItemTagList.blockAtlarus);
        copy(BlockTagList.blockBismuth,ItemTagList.blockBismuth);
        copy(BlockTagList.blockBlackSteel,ItemTagList.blockBlackSteel);
        copy(BlockTagList.blockCadmium,ItemTagList.blockCadmium);
        copy(BlockTagList.blockCarmot,ItemTagList.blockCarmot);
        copy(BlockTagList.blockCelenegil,ItemTagList.blockCelenegil);
        copy(BlockTagList.blockCeruclase,ItemTagList.blockCeruclase);
        copy(BlockTagList.blockChromium,ItemTagList.blockChromium);
        copy(BlockTagList.blockCobalt,ItemTagList.blockCobalt);
        copy(BlockTagList.blockCopper,ItemTagList.blockCopper);
        copy(BlockTagList.blockDeepIron,ItemTagList.blockDeepIron);
        copy(BlockTagList.blockDesichalkos,ItemTagList.blockDesichalkos);
        copy(BlockTagList.blockEximite,ItemTagList.blockEximite);
        copy(BlockTagList.blockGallium,ItemTagList.blockGallium);
        copy(BlockTagList.blockHaderoth,ItemTagList.blockHaderoth);
        copy(BlockTagList.blockHepatizon,ItemTagList.blockHepatizon);
        copy(BlockTagList.blockIgnatius,ItemTagList.blockIgnatius);
        copy(BlockTagList.blockIndium,ItemTagList.blockIndium);
        copy(BlockTagList.blockInfuscolium,ItemTagList.blockInfuscolium);
        copy(BlockTagList.blockInolashite,ItemTagList.blockInolashite);
        copy(BlockTagList.blockIridium,ItemTagList.blockIridium);
        copy(BlockTagList.blockKalendrite,ItemTagList.blockKalendrite);
        copy(BlockTagList.blockLead,ItemTagList.blockLead);
        copy(BlockTagList.blockLemurite,ItemTagList.blockLemurite);
        copy(BlockTagList.blockManganese,ItemTagList.blockManganese);
        copy(BlockTagList.blockMeutoite,ItemTagList.blockMeutoite);
        copy(BlockTagList.blockMidasium,ItemTagList.blockMidasium);
        copy(BlockTagList.blockMithril,ItemTagList.blockMithril);
        copy(BlockTagList.blockMolybdenum,ItemTagList.blockMolybdenum);
        copy(BlockTagList.blockNeodymium,ItemTagList.blockNeodymium);
        copy(BlockTagList.blockNeptunium,ItemTagList.blockNeptunium);
        copy(BlockTagList.blockNickel,ItemTagList.blockNickel);
        copy(BlockTagList.blockNiobium,ItemTagList.blockNiobium);
        copy(BlockTagList.blockOrichalcum,ItemTagList.blockOrichalcum);
        copy(BlockTagList.blockOsmium,ItemTagList.blockOsmium);
        copy(BlockTagList.blockOureclase,ItemTagList.blockOureclase);
        copy(BlockTagList.blockPalladium,ItemTagList.blockPalladium);
        copy(BlockTagList.blockPlatinum,ItemTagList.blockPlatinum);
        copy(BlockTagList.blockPlutonium,ItemTagList.blockPlutonium);
        copy(BlockTagList.blockPolonium,ItemTagList.blockPolonium);
        copy(BlockTagList.blockPromethium,ItemTagList.blockPromethium);
        copy(BlockTagList.blockRhenium,ItemTagList.blockRhenium);
        copy(BlockTagList.blockRhodium,ItemTagList.blockRhodium);
        copy(BlockTagList.blockRubracium,ItemTagList.blockRubracium);
        copy(BlockTagList.blockRuthenium,ItemTagList.blockRuthenium);
        copy(BlockTagList.blockSanguinite,ItemTagList.blockSanguinite);
        copy(BlockTagList.blockShadowIron,ItemTagList.blockShadowIron);
        copy(BlockTagList.blockSilver,ItemTagList.blockSilver);
        copy(BlockTagList.blockTantalum,ItemTagList.blockTantalum);
        copy(BlockTagList.blockTartarite,ItemTagList.blockTartarite);
        copy(BlockTagList.blockTechnetium,ItemTagList.blockTechnetium);
        copy(BlockTagList.blockThallium,ItemTagList.blockThallium);
        copy(BlockTagList.blockTin,ItemTagList.blockTin);
        copy(BlockTagList.blockTitanium,ItemTagList.blockTitanium);
        copy(BlockTagList.blockTungsten,ItemTagList.blockTungsten);
        copy(BlockTagList.blockUnobtainium,ItemTagList.blockUnobtainium);
        copy(BlockTagList.blockUranium,ItemTagList.blockUranium);
        copy(BlockTagList.blockVanadium,ItemTagList.blockVanadium);
        copy(BlockTagList.blockVulcanite,ItemTagList.blockVulcanite);
        copy(BlockTagList.blockVyroxeres,ItemTagList.blockVyroxeres);
        copy(BlockTagList.blockYellorite,ItemTagList.blockYellorite);
        copy(BlockTagList.blockZinc,ItemTagList.blockZinc);
        copy(BlockTagList.blockZirconium,ItemTagList.blockZirconium);
        //Ingots
        getOrCreateBuilder(ItemTagList.ingotAdamantine).add(ItemList.itemIngotAdamantine);
        getOrCreateBuilder(ItemTagList.ingotAldourite).add(ItemList.itemIngotAldourite);
        getOrCreateBuilder(ItemTagList.ingotAluminum).add(ItemList.itemIngotAluminum);
        getOrCreateBuilder(ItemTagList.ingotAmericium).add(ItemList.itemIngotAmericium);
        getOrCreateBuilder(ItemTagList.ingotAmordrine).add(ItemList.itemIngotAmordrine);
        getOrCreateBuilder(ItemTagList.ingotAngmallen).add(ItemList.itemIngotAngmallen);
        getOrCreateBuilder(ItemTagList.ingotAstralSilver).add(ItemList.itemIngotAstralSilver);
        getOrCreateBuilder(ItemTagList.ingotAtlarus).add(ItemList.itemIngotAtlarus);
        getOrCreateBuilder(ItemTagList.ingotBismuth).add(ItemList.itemIngotBismuth);
        getOrCreateBuilder(ItemTagList.ingotBlackSteel).add(ItemList.itemIngotBlackSteel);
        getOrCreateBuilder(ItemTagList.ingotCadmium).add(ItemList.itemIngotCadmium);
        getOrCreateBuilder(ItemTagList.ingotCarmot).add(ItemList.itemIngotCarmot);
        getOrCreateBuilder(ItemTagList.ingotCelenegil).add(ItemList.itemIngotCelenegil);
        getOrCreateBuilder(ItemTagList.ingotCeruclase).add(ItemList.itemIngotCeruclase);
        getOrCreateBuilder(ItemTagList.ingotChromium).add(ItemList.itemIngotChromium);
        getOrCreateBuilder(ItemTagList.ingotCobalt).add(ItemList.itemIngotCobalt);
        getOrCreateBuilder(ItemTagList.ingotCopper).add(ItemList.itemIngotCopper);
        getOrCreateBuilder(ItemTagList.ingotDeepIron).add(ItemList.itemIngotDeepIron);
        getOrCreateBuilder(ItemTagList.ingotDesichalkos).add(ItemList.itemIngotDesichalkos);
        getOrCreateBuilder(ItemTagList.ingotEximite).add(ItemList.itemIngotEximite);
        getOrCreateBuilder(ItemTagList.ingotGallium).add(ItemList.itemIngotGallium);
        getOrCreateBuilder(ItemTagList.ingotHaderoth).add(ItemList.itemIngotHaderoth);
        getOrCreateBuilder(ItemTagList.ingotHepatizon).add(ItemList.itemIngotHepatizon);
        getOrCreateBuilder(ItemTagList.ingotIgnatius).add(ItemList.itemIngotIgnatius);
        getOrCreateBuilder(ItemTagList.ingotIndium).add(ItemList.itemIngotIndium);
        getOrCreateBuilder(ItemTagList.ingotInfuscolium).add(ItemList.itemIngotInfuscolium);
        getOrCreateBuilder(ItemTagList.ingotInolashite).add(ItemList.itemIngotInolashite);
        getOrCreateBuilder(ItemTagList.ingotIridium).add(ItemList.itemIngotIridium);
        getOrCreateBuilder(ItemTagList.ingotKalendrite).add(ItemList.itemIngotKalendrite);
        getOrCreateBuilder(ItemTagList.ingotLead).add(ItemList.itemIngotLead);
        getOrCreateBuilder(ItemTagList.ingotLemurite).add(ItemList.itemIngotLemurite);
        getOrCreateBuilder(ItemTagList.ingotManganese).add(ItemList.itemIngotManganese);
        getOrCreateBuilder(ItemTagList.ingotMeutoite).add(ItemList.itemIngotMeutoite);
        getOrCreateBuilder(ItemTagList.ingotMidasium).add(ItemList.itemIngotMidasium);
        getOrCreateBuilder(ItemTagList.ingotMithril).add(ItemList.itemIngotMithril);
        getOrCreateBuilder(ItemTagList.ingotMolybdenum).add(ItemList.itemIngotMolybdenum);
        getOrCreateBuilder(ItemTagList.ingotNeodymium).add(ItemList.itemIngotNeodymium);
        getOrCreateBuilder(ItemTagList.ingotNeptunium).add(ItemList.itemIngotNeptunium);
        getOrCreateBuilder(ItemTagList.ingotNickel).add(ItemList.itemIngotNickel);
        getOrCreateBuilder(ItemTagList.ingotNiobium).add(ItemList.itemIngotNiobium);
        getOrCreateBuilder(ItemTagList.ingotOrichalcum).add(ItemList.itemIngotOrichalcum);
        getOrCreateBuilder(ItemTagList.ingotOsmium).add(ItemList.itemIngotOsmium);
        getOrCreateBuilder(ItemTagList.ingotOureclase).add(ItemList.itemIngotOureclase);
        getOrCreateBuilder(ItemTagList.ingotPalladium).add(ItemList.itemIngotPalladium);
        getOrCreateBuilder(ItemTagList.ingotPlatinum).add(ItemList.itemIngotPlatinum);
        getOrCreateBuilder(ItemTagList.ingotPlutonium).add(ItemList.itemIngotPlutonium);
        getOrCreateBuilder(ItemTagList.ingotPolonium).add(ItemList.itemIngotPolonium);
        getOrCreateBuilder(ItemTagList.ingotPromethium).add(ItemList.itemIngotPromethium);
        getOrCreateBuilder(ItemTagList.ingotRhenium).add(ItemList.itemIngotRhenium);
        getOrCreateBuilder(ItemTagList.ingotRhodium).add(ItemList.itemIngotRhodium);
        getOrCreateBuilder(ItemTagList.ingotRubracium).add(ItemList.itemIngotRubracium);
        getOrCreateBuilder(ItemTagList.ingotRuthenium).add(ItemList.itemIngotRuthenium);
        getOrCreateBuilder(ItemTagList.ingotSanguinite).add(ItemList.itemIngotSanguinite);
        getOrCreateBuilder(ItemTagList.ingotShadowIron).add(ItemList.itemIngotShadowIron);
        getOrCreateBuilder(ItemTagList.ingotSilver).add(ItemList.itemIngotSilver);
        getOrCreateBuilder(ItemTagList.ingotTantalum).add(ItemList.itemIngotTantalum);
        getOrCreateBuilder(ItemTagList.ingotTartarite).add(ItemList.itemIngotTartarite);
        getOrCreateBuilder(ItemTagList.ingotTechnetium).add(ItemList.itemIngotTechnetium);
        getOrCreateBuilder(ItemTagList.ingotThallium).add(ItemList.itemIngotThallium);
        getOrCreateBuilder(ItemTagList.ingotTin).add(ItemList.itemIngotTin);
        getOrCreateBuilder(ItemTagList.ingotTitanium).add(ItemList.itemIngotTitanium);
        getOrCreateBuilder(ItemTagList.ingotTungsten).add(ItemList.itemIngotTungsten);
        getOrCreateBuilder(ItemTagList.ingotUnobtainium).add(ItemList.itemIngotUnobtainium);
        getOrCreateBuilder(ItemTagList.ingotUranium).add(ItemList.itemIngotUranium);
        getOrCreateBuilder(ItemTagList.ingotVanadium).add(ItemList.itemIngotVanadium);
        getOrCreateBuilder(ItemTagList.ingotVulcanite).add(ItemList.itemIngotVulcanite);
        getOrCreateBuilder(ItemTagList.ingotVyroxeres).add(ItemList.itemIngotVyroxeres);
        getOrCreateBuilder(ItemTagList.ingotYellorite).add(ItemList.itemIngotYellorite);
        getOrCreateBuilder(ItemTagList.ingotZinc).add(ItemList.itemIngotZinc);
        getOrCreateBuilder(ItemTagList.ingotZirconium).add(ItemList.itemIngotZirconium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotAdamantine);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotAldourite);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotAluminum);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotAmericium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotAmordrine);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotAngmallen);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotAstralSilver);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotAtlarus);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotBismuth);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotBlackSteel);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotCadmium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotCarmot);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotCelenegil);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotCeruclase);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotChromium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotCobalt);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotCopper);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotDeepIron);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotDesichalkos);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotEximite);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotGallium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotHaderoth);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotHepatizon);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotIgnatius);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotIndium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotInfuscolium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotInolashite);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotIridium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotKalendrite);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotLead);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotLemurite);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotManganese);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotMeutoite);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotMidasium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotMithril);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotMolybdenum);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotNeodymium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotNeptunium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotNickel);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotNiobium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotOrichalcum);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotOsmium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotOureclase);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotPalladium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotPlatinum);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotPlutonium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotPolonium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotPromethium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotRhenium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotRhodium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotRubracium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotRuthenium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotSanguinite);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotShadowIron);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotSilver);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotTantalum);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotTartarite);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotTechnetium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotThallium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotTin);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotTitanium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotTungsten);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotUnobtainium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotUranium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotVanadium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotVulcanite);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotVyroxeres);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotYellorite);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotZinc);
        getOrCreateBuilder(ItemTagList.INGOTS).addTags(ItemTagList.ingotZirconium);
        //Dusts
        getOrCreateBuilder(ItemTagList.dustAdamantine).add(ItemList.itemDustAdamantine);
        getOrCreateBuilder(ItemTagList.dustAldourite).add(ItemList.itemDustAldourite);
        getOrCreateBuilder(ItemTagList.dustAluminum).add(ItemList.itemDustAluminum);
        getOrCreateBuilder(ItemTagList.dustAmericium).add(ItemList.itemDustAmericium);
        getOrCreateBuilder(ItemTagList.dustAmordrine).add(ItemList.itemDustAmordrine);
        getOrCreateBuilder(ItemTagList.dustAngmallen).add(ItemList.itemDustAngmallen);
        getOrCreateBuilder(ItemTagList.dustAstralSilver).add(ItemList.itemDustAstralSilver);
        getOrCreateBuilder(ItemTagList.dustAtlarus).add(ItemList.itemDustAtlarus);
        getOrCreateBuilder(ItemTagList.dustBismuth).add(ItemList.itemDustBismuth);
        getOrCreateBuilder(ItemTagList.dustBlackSteel).add(ItemList.itemDustBlackSteel);
        getOrCreateBuilder(ItemTagList.dustCadmium).add(ItemList.itemDustCadmium);
        getOrCreateBuilder(ItemTagList.dustCarmot).add(ItemList.itemDustCarmot);
        getOrCreateBuilder(ItemTagList.dustCelenegil).add(ItemList.itemDustCelenegil);
        getOrCreateBuilder(ItemTagList.dustCeruclase).add(ItemList.itemDustCeruclase);
        getOrCreateBuilder(ItemTagList.dustChromium).add(ItemList.itemDustChromium);
        getOrCreateBuilder(ItemTagList.dustCobalt).add(ItemList.itemDustCobalt);
        getOrCreateBuilder(ItemTagList.dustCopper).add(ItemList.itemDustCopper);
        getOrCreateBuilder(ItemTagList.dustDeepIron).add(ItemList.itemDustDeepIron);
        getOrCreateBuilder(ItemTagList.dustDesichalkos).add(ItemList.itemDustDesichalkos);
        getOrCreateBuilder(ItemTagList.dustEximite).add(ItemList.itemDustEximite);
        getOrCreateBuilder(ItemTagList.dustGallium).add(ItemList.itemDustGallium);
        getOrCreateBuilder(ItemTagList.dustHaderoth).add(ItemList.itemDustHaderoth);
        getOrCreateBuilder(ItemTagList.dustHepatizon).add(ItemList.itemDustHepatizon);
        getOrCreateBuilder(ItemTagList.dustIgnatius).add(ItemList.itemDustIgnatius);
        getOrCreateBuilder(ItemTagList.dustIndium).add(ItemList.itemDustIndium);
        getOrCreateBuilder(ItemTagList.dustInfuscolium).add(ItemList.itemDustInfuscolium);
        getOrCreateBuilder(ItemTagList.dustInolashite).add(ItemList.itemDustInolashite);
        getOrCreateBuilder(ItemTagList.dustIridium).add(ItemList.itemDustIridium);
        getOrCreateBuilder(ItemTagList.dustKalendrite).add(ItemList.itemDustKalendrite);
        getOrCreateBuilder(ItemTagList.dustLead).add(ItemList.itemDustLead);
        getOrCreateBuilder(ItemTagList.dustLemurite).add(ItemList.itemDustLemurite);
        getOrCreateBuilder(ItemTagList.dustManganese).add(ItemList.itemDustManganese);
        getOrCreateBuilder(ItemTagList.dustMeutoite).add(ItemList.itemDustMeutoite);
        getOrCreateBuilder(ItemTagList.dustMidasium).add(ItemList.itemDustMidasium);
        getOrCreateBuilder(ItemTagList.dustMithril).add(ItemList.itemDustMithril);
        getOrCreateBuilder(ItemTagList.dustMolybdenum).add(ItemList.itemDustMolybdenum);
        getOrCreateBuilder(ItemTagList.dustNeodymium).add(ItemList.itemDustNeodymium);
        getOrCreateBuilder(ItemTagList.dustNeptunium).add(ItemList.itemDustNeptunium);
        getOrCreateBuilder(ItemTagList.dustNickel).add(ItemList.itemDustNickel);
        getOrCreateBuilder(ItemTagList.dustNiobium).add(ItemList.itemDustNiobium);
        getOrCreateBuilder(ItemTagList.dustOrichalcum).add(ItemList.itemDustOrichalcum);
        getOrCreateBuilder(ItemTagList.dustOsmium).add(ItemList.itemDustOsmium);
        getOrCreateBuilder(ItemTagList.dustOureclase).add(ItemList.itemDustOureclase);
        getOrCreateBuilder(ItemTagList.dustPalladium).add(ItemList.itemDustPalladium);
        getOrCreateBuilder(ItemTagList.dustPlatinum).add(ItemList.itemDustPlatinum);
        getOrCreateBuilder(ItemTagList.dustPlutonium).add(ItemList.itemDustPlutonium);
        getOrCreateBuilder(ItemTagList.dustPolonium).add(ItemList.itemDustPolonium);
        getOrCreateBuilder(ItemTagList.dustPromethium).add(ItemList.itemDustPromethium);
        getOrCreateBuilder(ItemTagList.dustRhenium).add(ItemList.itemDustRhenium);
        getOrCreateBuilder(ItemTagList.dustRhodium).add(ItemList.itemDustRhodium);
        getOrCreateBuilder(ItemTagList.dustRubracium).add(ItemList.itemDustRubracium);
        getOrCreateBuilder(ItemTagList.dustRuthenium).add(ItemList.itemDustRuthenium);
        getOrCreateBuilder(ItemTagList.dustSanguinite).add(ItemList.itemDustSanguinite);
        getOrCreateBuilder(ItemTagList.dustShadowIron).add(ItemList.itemDustShadowIron);
        getOrCreateBuilder(ItemTagList.dustSilver).add(ItemList.itemDustSilver);
        getOrCreateBuilder(ItemTagList.dustTantalum).add(ItemList.itemDustTantalum);
        getOrCreateBuilder(ItemTagList.dustTartarite).add(ItemList.itemDustTartarite);
        getOrCreateBuilder(ItemTagList.dustTechnetium).add(ItemList.itemDustTechnetium);
        getOrCreateBuilder(ItemTagList.dustThallium).add(ItemList.itemDustThallium);
        getOrCreateBuilder(ItemTagList.dustTin).add(ItemList.itemDustTin);
        getOrCreateBuilder(ItemTagList.dustTitanium).add(ItemList.itemDustTitanium);
        getOrCreateBuilder(ItemTagList.dustTungsten).add(ItemList.itemDustTungsten);
        getOrCreateBuilder(ItemTagList.dustUnobtainium).add(ItemList.itemDustUnobtainium);
        getOrCreateBuilder(ItemTagList.dustUranium).add(ItemList.itemDustUranium);
        getOrCreateBuilder(ItemTagList.dustVanadium).add(ItemList.itemDustVanadium);
        getOrCreateBuilder(ItemTagList.dustVulcanite).add(ItemList.itemDustVulcanite);
        getOrCreateBuilder(ItemTagList.dustVyroxeres).add(ItemList.itemDustVyroxeres);
        getOrCreateBuilder(ItemTagList.dustYellorite).add(ItemList.itemDustYellorite);
        getOrCreateBuilder(ItemTagList.dustZinc).add(ItemList.itemDustZinc);
        getOrCreateBuilder(ItemTagList.dustZirconium).add(ItemList.itemDustZirconium);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustAdamantine);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustAldourite);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustAluminum);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustAmericium);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustAmordrine);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustAngmallen);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustAstralSilver);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustAtlarus);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustBismuth);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustBlackSteel);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustCadmium);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustCarmot);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustCelenegil);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustCeruclase);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustChromium);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustCobalt);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustCopper);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustDeepIron);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustDesichalkos);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustEximite);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustGallium);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustHaderoth);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustHepatizon);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustIgnatius);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustIndium);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustInfuscolium);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustInolashite);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustIridium);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustKalendrite);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustLead);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustLemurite);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustManganese);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustMeutoite);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustMidasium);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustMithril);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustMolybdenum);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustNeodymium);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustNeptunium);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustNickel);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustNiobium);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustOrichalcum);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustOsmium);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustOureclase);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustPalladium);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustPlatinum);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustPlutonium);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustPolonium);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustPromethium);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustRhenium);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustRhodium);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustRubracium);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustRuthenium);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustSanguinite);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustShadowIron);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustSilver);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustTantalum);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustTartarite);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustTechnetium);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustThallium);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustTin);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustTitanium);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustTungsten);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustUnobtainium);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustUranium);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustVanadium);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustVulcanite);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustVyroxeres);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustYellorite);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustZinc);
        getOrCreateBuilder(ItemTagList.DUSTS).addTags(ItemTagList.dustZirconium);
    }

    @Override
    public String getName()
    {
        return "Extra Ores Item Tags";
    }
}

package com.tylerh.extraores.Data.Loot_Tables;

import com.tylerh.extraores.Init.BlockList;
import com.tylerh.extraores.Init.InitBlocks;
import com.tylerh.extraores.Init.ItemList;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ExOreLootTable extends BlockLootSubProvider
{
    public ExOreLootTable()
    {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate()
    {
        //Ore Normal
        createFortune(BlockList.blockOreAdamantine, ItemList.itemRawAdamantine);
        createFortune(BlockList.blockOreAgate,ItemList.itemGemAgate);
        createFortune(BlockList.blockOreAldourite,ItemList.itemRawAldourite);
        createFortune(BlockList.blockOreAluminum,ItemList.itemRawAluminum);
        createFortune(BlockList.blockOreAmericium,ItemList.itemRawAmericium);
        createFortune(BlockList.blockOreAmethyst,ItemList.itemGemAmethyst);
        createFortune(BlockList.blockOreAmetrine,ItemList.itemGemAmetrine);
        createFortune(BlockList.blockOreAmordrine,ItemList.itemRawAmordrine);
        createFortune(BlockList.blockOreAngmallen,ItemList.itemRawAngmallen);
        createFortune(BlockList.blockOreAquamarine,ItemList.itemGemAquamarine);
        createFortune(BlockList.blockOreAstralSilver,ItemList.itemRawAstralSilver);
        createFortune(BlockList.blockOreAtlarus,ItemList.itemRawAtlarus);
        createFortune(BlockList.blockOreBismuth,ItemList.itemRawBismuth);
        createFortune(BlockList.blockOreBlackSteel,ItemList.itemRawBlackSteel);
        createFortune(BlockList.blockOreCadmium,ItemList.itemRawCadmium);
        createFortune(BlockList.blockOreCarmot,ItemList.itemRawCarmot);
        createFortune(BlockList.blockOreCelenegil,ItemList.itemRawCelenegil);
        createFortune(BlockList.blockOreCeruclase,ItemList.itemRawCeruclase);
        createFortune(BlockList.blockOreChromium,ItemList.itemRawChromium);
        createFortune(BlockList.blockOreChrysocolla,ItemList.itemGemChrysocolla);
        createFortune(BlockList.blockOreCitrine,ItemList.itemGemCitrine);
        createFortune(BlockList.blockOreCobalt,ItemList.itemRawCobalt);
        createFortune(BlockList.blockOreCopper,ItemList.itemRawCopper);
        createFortune(BlockList.blockOreCrimsonSteel,ItemList.itemRawCrimsonSteel);
        createFortune(BlockList.blockOreDeepIron,ItemList.itemRawDeepIron);
        createFortune(BlockList.blockOreDesichalkos,ItemList.itemRawDesichalkos);
        createFortune(BlockList.blockOreEximite,ItemList.itemRawEximite);
        createFortune(BlockList.blockOreGallium,ItemList.itemRawGallium);
        createFortune(BlockList.blockOreGarnet,ItemList.itemGemGarnet);
        createFortune(BlockList.blockOreHaderoth,ItemList.itemRawHaderoth);
        createFortune(BlockList.blockOreHepatizon,ItemList.itemRawHepatizon);
        createFortune(BlockList.blockOreIgnatius,ItemList.itemRawIgnatius);
        createFortune(BlockList.blockOreIndium,ItemList.itemRawIndium);
        createFortune(BlockList.blockOreInfuscolium,ItemList.itemRawInfuscolium);
        createFortune(BlockList.blockOreInolashite,ItemList.itemRawInolashite);
        createFortune(BlockList.blockOreIolite,ItemList.itemGemIolite);
        createFortune(BlockList.blockOreIridium,ItemList.itemRawIridium);
        createFortune(BlockList.blockOreJade,ItemList.itemGemJade);
        createFortune(BlockList.blockOreJasper,ItemList.itemGemJasper);
        createFortune(BlockList.blockOreKalendrite,ItemList.itemRawKalendrite);
        createFortune(BlockList.blockOreKyanite,ItemList.itemGemKyanite);
        createFortune(BlockList.blockOreLead,ItemList.itemRawLead);
        createFortune(BlockList.blockOreLemurite,ItemList.itemRawLemurite);
        createFortune(BlockList.blockOreMalachite,ItemList.itemGemMalachite);
        createFortune(BlockList.blockOreManganese,ItemList.itemRawManganese);
        createFortune(BlockList.blockOreMeutoite,ItemList.itemRawMeutoite);
        createFortune(BlockList.blockOreMidasium,ItemList.itemRawMidasium);
        createFortune(BlockList.blockOreMithril,ItemList.itemRawMithril);
        createFortune(BlockList.blockOreMolybdenum,ItemList.itemRawMolybdenum);
        createFortune(BlockList.blockOreNeodymium,ItemList.itemRawNeodymium);
        createFortune(BlockList.blockOreNeptunium,ItemList.itemRawNeptunium);
        createFortune(BlockList.blockOreNickel,ItemList.itemRawNickel);
        createFortune(BlockList.blockOreNiobium,ItemList.itemRawNiobium);
        createFortune(BlockList.blockOreOnyx,ItemList.itemGemOnyx);
        createFortune(BlockList.blockOreOpal,ItemList.itemGemOpal);
        createFortune(BlockList.blockOreOrichalcum,ItemList.itemRawOrichalcum);
        createFortune(BlockList.blockOreOsmium,ItemList.itemRawOsmium);
        createFortune(BlockList.blockOreOureclase,ItemList.itemRawOureclase);
        createFortune(BlockList.blockOrePalladium,ItemList.itemRawPalladium);
        createFortune(BlockList.blockOrePeridot,ItemList.itemGemPeridot);
        createFortune(BlockList.blockOrePhoenixite,ItemList.itemGemPhoenixite);
        createFortune(BlockList.blockOrePlatinum,ItemList.itemRawPlatinum);
        createFortune(BlockList.blockOrePlutonium,ItemList.itemRawPlutonium);
        createFortune(BlockList.blockOrePolonium,ItemList.itemRawPolonium);
        createFortune(BlockList.blockOrePromethium,ItemList.itemRawPromethium);
        createFortune(BlockList.blockOreQuartz,ItemList.itemGemQuartz);
        createFortune(BlockList.blockOreRhenium,ItemList.itemRawRhenium);
        createFortune(BlockList.blockOreRhodium,ItemList.itemRawRhodium);
        createFortune(BlockList.blockOreRubracium,ItemList.itemRawRubracium);
        createFortune(BlockList.blockOreRuby,ItemList.itemGemRuby);
        createFortune(BlockList.blockOreRuthenium,ItemList.itemRawRuthenium);
        createFortune(BlockList.blockOreSanguinite,ItemList.itemRawSanguinite);
        createFortune(BlockList.blockOreSapphire,ItemList.itemGemSapphire);
        createFortune(BlockList.blockOreShadowIron,ItemList.itemRawShadowIron);
        createFortune(BlockList.blockOreSilver,ItemList.itemRawSilver);
        createFortune(BlockList.blockOreSpinel,ItemList.itemGemSpinel);
        createFortune(BlockList.blockOreSugilite,ItemList.itemGemSugilite);
        createFortune(BlockList.blockOreTantalum,ItemList.itemRawTantalum);
        createFortune(BlockList.blockOreTanzanite,ItemList.itemGemTanzanite);
        createFortune(BlockList.blockOreTartarite,ItemList.itemRawTartarite);
        createFortune(BlockList.blockOreTechnetium,ItemList.itemRawTechnetium);
        createFortune(BlockList.blockOreThallium,ItemList.itemRawThallium);
        createFortune(BlockList.blockOreTin,ItemList.itemRawTin);
        createFortune(BlockList.blockOreTitanium,ItemList.itemRawTitanium);
        createFortune(BlockList.blockOreTopaz,ItemList.itemGemTopaz);
        createFortune(BlockList.blockOreTourmaline,ItemList.itemGemTourmaline);
        createFortune(BlockList.blockOreTritium,ItemList.itemRawTritium);
        createFortune(BlockList.blockOreTungsten,ItemList.itemRawTungsten);
        createFortune(BlockList.blockOreTurquoise,ItemList.itemGemTurquoise);
        createFortune(BlockList.blockOreUnobtainium,ItemList.itemRawUnobtainium);
        createFortune(BlockList.blockOreUranium,ItemList.itemRawUranium);
        createFortune(BlockList.blockOreVanadium,ItemList.itemRawVanadium);
        createFortune(BlockList.blockOreVibranium,ItemList.itemRawVibranium);
        createFortune(BlockList.blockOreVulcanite,ItemList.itemRawVulcanite);
        createFortune(BlockList.blockOreVyroxeres,ItemList.itemRawVyroxeres);
        createFortune(BlockList.blockOreYellorite,ItemList.itemRawYellorite);
        createFortune(BlockList.blockOreZinc,ItemList.itemRawZinc);
        createFortune(BlockList.blockOreZirconium,ItemList.itemRawZirconium);
        //Ore Deepslate
        createFortune(BlockList.blockDeepslateOreAdamantine, ItemList.itemRawAdamantine);
        createFortune(BlockList.blockDeepslateOreAgate,ItemList.itemGemAgate);
        createFortune(BlockList.blockDeepslateOreAluminum,ItemList.itemRawAluminum);
        createFortune(BlockList.blockDeepslateOreAmericium,ItemList.itemRawAmericium);
        createFortune(BlockList.blockDeepslateOreAmethyst,ItemList.itemGemAmethyst);
        createFortune(BlockList.blockDeepslateOreAmetrine,ItemList.itemGemAmetrine);
        createFortune(BlockList.blockDeepslateOreAmordrine,ItemList.itemRawAmordrine);
        createFortune(BlockList.blockDeepslateOreAngmallen,ItemList.itemRawAngmallen);
        createFortune(BlockList.blockDeepslateOreAquamarine,ItemList.itemGemAquamarine);
        createFortune(BlockList.blockDeepslateOreAstralSilver,ItemList.itemRawAstralSilver);
        createFortune(BlockList.blockDeepslateOreAtlarus,ItemList.itemRawAtlarus);
        createFortune(BlockList.blockDeepslateOreBismuth,ItemList.itemRawBismuth);
        createFortune(BlockList.blockDeepslateOreBlackSteel,ItemList.itemRawBlackSteel);
        createFortune(BlockList.blockDeepslateOreCadmium,ItemList.itemRawCadmium);
        createFortune(BlockList.blockDeepslateOreCarmot,ItemList.itemRawCarmot);
        createFortune(BlockList.blockDeepslateOreCelenegil,ItemList.itemRawCelenegil);
        createFortune(BlockList.blockDeepslateOreChromium,ItemList.itemRawChromium);
        createFortune(BlockList.blockDeepslateOreChrysocolla,ItemList.itemGemChrysocolla);
        createFortune(BlockList.blockDeepslateOreCitrine,ItemList.itemGemCitrine);
        createFortune(BlockList.blockDeepslateOreCobalt,ItemList.itemRawCobalt);
        createFortune(BlockList.blockDeepslateOreCopper,ItemList.itemRawCopper);
        createFortune(BlockList.blockDeepslateOreCrimsonSteel,ItemList.itemRawCrimsonSteel);
        createFortune(BlockList.blockDeepslateOreDeepIron,ItemList.itemRawDeepIron);
        createFortune(BlockList.blockDeepslateOreDesichalkos,ItemList.itemRawDesichalkos);
        createFortune(BlockList.blockDeepslateOreEximite,ItemList.itemRawEximite);
        createFortune(BlockList.blockDeepslateOreGallium,ItemList.itemRawGallium);
        createFortune(BlockList.blockDeepslateOreGarnet,ItemList.itemGemGarnet);
        createFortune(BlockList.blockDeepslateOreHaderoth,ItemList.itemRawHaderoth);
        createFortune(BlockList.blockDeepslateOreHepatizon,ItemList.itemRawHepatizon);
        createFortune(BlockList.blockDeepslateOreIndium,ItemList.itemRawIndium);
        createFortune(BlockList.blockDeepslateOreInfuscolium,ItemList.itemRawInfuscolium);
        createFortune(BlockList.blockDeepslateOreInolashite,ItemList.itemRawInolashite);
        createFortune(BlockList.blockDeepslateOreIolite,ItemList.itemGemIolite);
        createFortune(BlockList.blockDeepslateOreIridium,ItemList.itemRawIridium);
        createFortune(BlockList.blockDeepslateOreJade,ItemList.itemGemJade);
        createFortune(BlockList.blockDeepslateOreJasper,ItemList.itemGemJasper);
        createFortune(BlockList.blockDeepslateOreKyanite,ItemList.itemGemKyanite);
        createFortune(BlockList.blockDeepslateOreLead,ItemList.itemRawLead);
        createFortune(BlockList.blockDeepslateOreMalachite,ItemList.itemGemMalachite);
        createFortune(BlockList.blockDeepslateOreManganese,ItemList.itemRawManganese);
        createFortune(BlockList.blockDeepslateOreMeutoite,ItemList.itemRawMeutoite);
        createFortune(BlockList.blockDeepslateOreMithril,ItemList.itemRawMithril);
        createFortune(BlockList.blockDeepslateOreMolybdenum,ItemList.itemRawMolybdenum);
        createFortune(BlockList.blockDeepslateOreNeodymium,ItemList.itemRawNeodymium);
        createFortune(BlockList.blockDeepslateOreNeptunium,ItemList.itemRawNeptunium);
        createFortune(BlockList.blockDeepslateOreNickel,ItemList.itemRawNickel);
        createFortune(BlockList.blockDeepslateOreNiobium,ItemList.itemRawNiobium);
        createFortune(BlockList.blockDeepslateOreOnyx,ItemList.itemGemOnyx);
        createFortune(BlockList.blockDeepslateOreOpal,ItemList.itemGemOpal);
        createFortune(BlockList.blockDeepslateOreOrichalcum,ItemList.itemRawOrichalcum);
        createFortune(BlockList.blockDeepslateOreOsmium,ItemList.itemRawOsmium);
        createFortune(BlockList.blockDeepslateOreOureclase,ItemList.itemRawOureclase);
        createFortune(BlockList.blockDeepslateOrePalladium,ItemList.itemRawPalladium);
        createFortune(BlockList.blockDeepslateOrePeridot,ItemList.itemGemPeridot);
        createFortune(BlockList.blockDeepslateOrePhoenixite,ItemList.itemGemPhoenixite);
        createFortune(BlockList.blockDeepslateOrePlatinum,ItemList.itemRawPlatinum);
        createFortune(BlockList.blockDeepslateOrePlutonium,ItemList.itemRawPlutonium);
        createFortune(BlockList.blockDeepslateOrePolonium,ItemList.itemRawPolonium);
        createFortune(BlockList.blockDeepslateOrePromethium,ItemList.itemRawPromethium);
        createFortune(BlockList.blockDeepslateOreQuartz,ItemList.itemGemQuartz);
        createFortune(BlockList.blockDeepslateOreRhenium,ItemList.itemRawRhenium);
        createFortune(BlockList.blockDeepslateOreRhodium,ItemList.itemRawRhodium);
        createFortune(BlockList.blockDeepslateOreRubracium,ItemList.itemRawRubracium);
        createFortune(BlockList.blockDeepslateOreRuby,ItemList.itemGemRuby);
        createFortune(BlockList.blockDeepslateOreRuthenium,ItemList.itemRawRuthenium);
        createFortune(BlockList.blockDeepslateOreSapphire,ItemList.itemGemSapphire);
        createFortune(BlockList.blockDeepslateOreSilver,ItemList.itemRawSilver);
        createFortune(BlockList.blockDeepslateOreSpinel,ItemList.itemGemSpinel);
        createFortune(BlockList.blockDeepslateOreSugilite,ItemList.itemGemSugilite);
        createFortune(BlockList.blockDeepslateOreTantalum,ItemList.itemRawTantalum);
        createFortune(BlockList.blockDeepslateOreTanzanite,ItemList.itemGemTanzanite);
        createFortune(BlockList.blockDeepslateOreTartarite,ItemList.itemRawTartarite);
        createFortune(BlockList.blockDeepslateOreTechnetium,ItemList.itemRawTechnetium);
        createFortune(BlockList.blockDeepslateOreThallium,ItemList.itemRawThallium);
        createFortune(BlockList.blockDeepslateOreTin,ItemList.itemRawTin);
        createFortune(BlockList.blockDeepslateOreTitanium,ItemList.itemRawTitanium);
        createFortune(BlockList.blockDeepslateOreTopaz,ItemList.itemGemTopaz);
        createFortune(BlockList.blockDeepslateOreTourmaline,ItemList.itemGemTourmaline);
        createFortune(BlockList.blockDeepslateOreTritium,ItemList.itemRawTritium);
        createFortune(BlockList.blockDeepslateOreTungsten,ItemList.itemRawTungsten);
        createFortune(BlockList.blockDeepslateOreTurquoise,ItemList.itemGemTurquoise);
        createFortune(BlockList.blockDeepslateOreUnobtainium,ItemList.itemRawUnobtainium);
        createFortune(BlockList.blockDeepslateOreUranium,ItemList.itemRawUranium);
        createFortune(BlockList.blockDeepslateOreVanadium,ItemList.itemRawVanadium);
        createFortune(BlockList.blockDeepslateOreVibranium,ItemList.itemRawVibranium);
        createFortune(BlockList.blockDeepslateOreYellorite,ItemList.itemRawYellorite);
        createFortune(BlockList.blockDeepslateOreZinc,ItemList.itemRawZinc);
        createFortune(BlockList.blockDeepslateOreZirconium,ItemList.itemRawZirconium);
        //Blocks
        createStandardTable(BlockList.blockAdamantine);
        createStandardTable(BlockList.blockAgate);
        createStandardTable(BlockList.blockAldourite);
        createStandardTable(BlockList.blockAluminum);
        createStandardTable(BlockList.blockAmericium);
        createStandardTable(BlockList.blockAmethyst);
        createStandardTable(BlockList.blockAmetrine);
        createStandardTable(BlockList.blockAmordrine);
        createStandardTable(BlockList.blockAngmallen);
        createStandardTable(BlockList.blockAquamarine);
        createStandardTable(BlockList.blockAstralSilver);
        createStandardTable(BlockList.blockAtlarus);
        createStandardTable(BlockList.blockBismuth);
        createStandardTable(BlockList.blockBlackSteel);
        createStandardTable(BlockList.blockCadmium);
        createStandardTable(BlockList.blockCarmot);
        createStandardTable(BlockList.blockCelenegil);
        createStandardTable(BlockList.blockCeruclase);
        createStandardTable(BlockList.blockChromium);
        createStandardTable(BlockList.blockChrysocolla);
        createStandardTable(BlockList.blockCitrine);
        createStandardTable(BlockList.blockCobalt);
        createStandardTable(BlockList.blockCopper);
        createStandardTable(BlockList.blockCrimsonSteel);
        createStandardTable(BlockList.blockDeepIron);
        createStandardTable(BlockList.blockDesichalkos);
        createStandardTable(BlockList.blockEximite);
        createStandardTable(BlockList.blockGallium);
        createStandardTable(BlockList.blockGarnet);
        createStandardTable(BlockList.blockHaderoth);
        createStandardTable(BlockList.blockHepatizon);
        createStandardTable(BlockList.blockIgnatius);
        createStandardTable(BlockList.blockIndium);
        createStandardTable(BlockList.blockInfuscolium);
        createStandardTable(BlockList.blockInolashite);
        createStandardTable(BlockList.blockIolite);
        createStandardTable(BlockList.blockIridium);
        createStandardTable(BlockList.blockJade);
        createStandardTable(BlockList.blockJasper);
        createStandardTable(BlockList.blockKalendrite);
        createStandardTable(BlockList.blockKyanite);
        createStandardTable(BlockList.blockLead);
        createStandardTable(BlockList.blockLemurite);
        createStandardTable(BlockList.blockMalachite);
        createStandardTable(BlockList.blockManganese);
        createStandardTable(BlockList.blockMeutoite);
        createStandardTable(BlockList.blockMidasium);
        createStandardTable(BlockList.blockMithril);
        createStandardTable(BlockList.blockMolybdenum);
        createStandardTable(BlockList.blockNeodymium);
        createStandardTable(BlockList.blockNeptunium);
        createStandardTable(BlockList.blockNickel);
        createStandardTable(BlockList.blockNiobium);
        createStandardTable(BlockList.blockOnyx);
        createStandardTable(BlockList.blockOpal);
        createStandardTable(BlockList.blockOrichalcum);
        createStandardTable(BlockList.blockOsmium);
        createStandardTable(BlockList.blockOureclase);
        createStandardTable(BlockList.blockPalladium);
        createStandardTable(BlockList.blockPeridot);
        createStandardTable(BlockList.blockPhoenixite);
        createStandardTable(BlockList.blockPlatinum);
        createStandardTable(BlockList.blockPlutonium);
        createStandardTable(BlockList.blockPolonium);
        createStandardTable(BlockList.blockPromethium);
        createStandardTable(BlockList.blockQuartz);
        createStandardTable(BlockList.blockRhenium);
        createStandardTable(BlockList.blockRhodium);
        createStandardTable(BlockList.blockRuby);
        createStandardTable(BlockList.blockRuthenium);
        createStandardTable(BlockList.blockRubracium);
        createStandardTable(BlockList.blockSanguinite);
        createStandardTable(BlockList.blockSapphire);
        createStandardTable(BlockList.blockShadowIron);
        createStandardTable(BlockList.blockSilver);
        createStandardTable(BlockList.blockSpinel);
        createStandardTable(BlockList.blockSugilite);
        createStandardTable(BlockList.blockTantalum);
        createStandardTable(BlockList.blockTanzanite);
        createStandardTable(BlockList.blockTartarite);
        createStandardTable(BlockList.blockTechnetium);
        createStandardTable(BlockList.blockThallium);
        createStandardTable(BlockList.blockTin);
        createStandardTable(BlockList.blockTitanium);
        createStandardTable(BlockList.blockTopaz);
        createStandardTable(BlockList.blockTourmaline);
        createStandardTable(BlockList.blockTritium);
        createStandardTable(BlockList.blockTungsten);
        createStandardTable(BlockList.blockTurquoise);
        createStandardTable(BlockList.blockUnobtainium);
        createStandardTable(BlockList.blockUranium);
        createStandardTable(BlockList.blockVanadium);
        createStandardTable(BlockList.blockVibranium);
        createStandardTable(BlockList.blockVulcanite);
        createStandardTable(BlockList.blockVyroxeres);
        createStandardTable(BlockList.blockYellorite);
        createStandardTable(BlockList.blockZinc);
        createStandardTable(BlockList.blockZirconium);
    }
    private void createStandardTable(RegistryObject<Block> blockRegistryObject)
    {
        dropSelf(blockRegistryObject.get());
    }
    private void createFortune(RegistryObject<Block> blockRegistryObject,RegistryObject<Item> itemRegistryObject)
    {
        add(blockRegistryObject.get(),(block) -> createOreDrop(blockRegistryObject.get(),itemRegistryObject.get()));
    }
    @Override
    protected Iterable<Block> getKnownBlocks()
    {
        return InitBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}

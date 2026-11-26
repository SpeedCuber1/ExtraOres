package com.tylerh.extraores.Data.Loot_Tables;

import com.tylerh.extraores.Init.BlockList;
import com.tylerh.extraores.Init.InitBlocks;
import com.tylerh.extraores.Init.ItemList;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;

import java.util.Set;

public class ExOreLootTableProvider extends BlockLootSubProvider
{
    public ExOreLootTableProvider(HolderLookup.Provider registries)
    {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(),registries);
    }

    @Override
    protected void generate()
    {
        registerBlocks();
        registerOres();
    }
    @Override
    protected Iterable<Block> getKnownBlocks()
    {
        return InitBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
    private void registerBlocks()
    {
        dropSelf(BlockList.blockAdamantine.get());
        dropSelf(BlockList.blockAgate.get());
        dropSelf(BlockList.blockAldourite.get());
        dropSelf(BlockList.blockAluminum.get());
        dropSelf(BlockList.blockAmericium.get());
        dropSelf(BlockList.blockAmethyst.get());
        dropSelf(BlockList.blockAmetrine.get());
        dropSelf(BlockList.blockAmordrine.get());
        dropSelf(BlockList.blockAngmallen.get());
        dropSelf(BlockList.blockAquamarine.get());
        dropSelf(BlockList.blockAstralSilver.get());
        dropSelf(BlockList.blockAtlarus.get());
        dropSelf(BlockList.blockAzureSilver.get());
        dropSelf(BlockList.blockBismuth.get());
        dropSelf(BlockList.blockBlackSteel.get());
        dropSelf(BlockList.blockCadmium.get());
        dropSelf(BlockList.blockCarmot.get());
        dropSelf(BlockList.blockCelenegil.get());
        dropSelf(BlockList.blockCeruclase.get());
        dropSelf(BlockList.blockChromium.get());
        dropSelf(BlockList.blockChrysocolla.get());
        dropSelf(BlockList.blockCitrine.get());
        dropSelf(BlockList.blockCobalt.get());
        dropSelf(BlockList.blockCopper.get());
        dropSelf(BlockList.blockCrimsonSteel.get());
        dropSelf(BlockList.blockDeepIron.get());
        dropSelf(BlockList.blockDesichalkos.get());
        dropSelf(BlockList.blockEximite.get());
        dropSelf(BlockList.blockGallium.get());
        dropSelf(BlockList.blockGarnet.get());
        dropSelf(BlockList.blockHaderoth.get());
        dropSelf(BlockList.blockHepatizon.get());
        dropSelf(BlockList.blockIgnatius.get());
        dropSelf(BlockList.blockIndium.get());
        dropSelf(BlockList.blockInfuscolium.get());
        dropSelf(BlockList.blockInolashite.get());
        dropSelf(BlockList.blockIolite.get());
        dropSelf(BlockList.blockIridium.get());
        dropSelf(BlockList.blockJade.get());
        dropSelf(BlockList.blockJasper.get());
        dropSelf(BlockList.blockKalendrite.get());
        dropSelf(BlockList.blockKryptonite.get());
        dropSelf(BlockList.blockKyanite.get());
        dropSelf(BlockList.blockLead.get());
        dropSelf(BlockList.blockLemurite.get());
        dropSelf(BlockList.blockMalachite.get());
        dropSelf(BlockList.blockManganese.get());
        dropSelf(BlockList.blockMeutoite.get());
        dropSelf(BlockList.blockMidasium.get());
        dropSelf(BlockList.blockMithril.get());
        dropSelf(BlockList.blockMolybdenum.get());
        dropSelf(BlockList.blockNeodymium.get());
        dropSelf(BlockList.blockNeptunium.get());
        dropSelf(BlockList.blockNickel.get());
        dropSelf(BlockList.blockNiobium.get());
        dropSelf(BlockList.blockOnyx.get());
        dropSelf(BlockList.blockOpal.get());
        dropSelf(BlockList.blockOrichalcum.get());
        dropSelf(BlockList.blockOsmium.get());
        dropSelf(BlockList.blockOureclase.get());
        dropSelf(BlockList.blockPalladium.get());
        dropSelf(BlockList.blockPeridot.get());
        dropSelf(BlockList.blockPhoenixite.get());
        dropSelf(BlockList.blockPlatinum.get());
        dropSelf(BlockList.blockPlutonium.get());
        dropSelf(BlockList.blockPolonium.get());
        dropSelf(BlockList.blockPromethium.get());
        dropSelf(BlockList.blockQuartz.get());
        dropSelf(BlockList.blockRhenium.get());
        dropSelf(BlockList.blockRhodium.get());
        dropSelf(BlockList.blockRuby.get());
        dropSelf(BlockList.blockRuthenium.get());
        dropSelf(BlockList.blockRubracium.get());
        dropSelf(BlockList.blockSanguinite.get());
        dropSelf(BlockList.blockSapphire.get());
        dropSelf(BlockList.blockShadowIron.get());
        dropSelf(BlockList.blockSilver.get());
        dropSelf(BlockList.blockSpinel.get());
        dropSelf(BlockList.blockSugilite.get());
        dropSelf(BlockList.blockTantalum.get());
        dropSelf(BlockList.blockTanzanite.get());
        dropSelf(BlockList.blockTartarite.get());
        dropSelf(BlockList.blockTechnetium.get());
        dropSelf(BlockList.blockThallium.get());
        dropSelf(BlockList.blockTin.get());
        dropSelf(BlockList.blockTitanium.get());
        dropSelf(BlockList.blockTopaz.get());
        dropSelf(BlockList.blockTourmaline.get());
        dropSelf(BlockList.blockTritium.get());
        dropSelf(BlockList.blockTungsten.get());
        dropSelf(BlockList.blockTurquoise.get());
        dropSelf(BlockList.blockUnobtainium.get());
        dropSelf(BlockList.blockUranium.get());
        dropSelf(BlockList.blockVanadium.get());
        dropSelf(BlockList.blockVibranium.get());
        dropSelf(BlockList.blockVulcanite.get());
        dropSelf(BlockList.blockVyroxeres.get());
        dropSelf(BlockList.blockYellorite.get());
        dropSelf(BlockList.blockZinc.get());
        dropSelf(BlockList.blockZirconium.get());
    }
    private void registerOres()
    {
        //Ore Normal
        add(BlockList.blockOreAdamantine.get(), createFortune(BlockList.blockOreAdamantine.get(), ItemList.itemRawAdamantine.get()));
        add(BlockList.blockOreAgate.get(), createFortune(BlockList.blockOreAgate.get(), ItemList.itemGemAgate.get()));
        add(BlockList.blockOreAldourite.get(), createFortune(BlockList.blockOreAldourite.get(), ItemList.itemRawAldourite.get()));
        add(BlockList.blockOreAluminum.get(), createFortune(BlockList.blockOreAluminum.get(), ItemList.itemRawAluminum.get()));
        add(BlockList.blockOreAmericium.get(), createFortune(BlockList.blockOreAmericium.get(), ItemList.itemRawAmericium.get()));
        add(BlockList.blockOreAmethyst.get(), createFortune(BlockList.blockOreAmethyst.get(), ItemList.itemGemAmethyst.get()));
        add(BlockList.blockOreAmetrine.get(), createFortune(BlockList.blockOreAmetrine.get(), ItemList.itemGemAmetrine.get()));
        add(BlockList.blockOreAmordrine.get(), createFortune(BlockList.blockOreAmordrine.get(), ItemList.itemRawAmordrine.get()));
        add(BlockList.blockOreAngmallen.get(), createFortune(BlockList.blockOreAngmallen.get(), ItemList.itemRawAngmallen.get()));
        add(BlockList.blockOreAquamarine.get(), createFortune(BlockList.blockOreAquamarine.get(), ItemList.itemGemAquamarine.get()));
        add(BlockList.blockOreAstralSilver.get(), createFortune(BlockList.blockOreAstralSilver.get(), ItemList.itemRawAstralSilver.get()));
        add(BlockList.blockOreAtlarus.get(), createFortune(BlockList.blockOreAtlarus.get(), ItemList.itemRawAtlarus.get()));
        add(BlockList.blockOreAzureSilver.get(), createFortune(BlockList.blockOreAzureSilver.get(), ItemList.itemRawAzureSilver.get()));
        add(BlockList.blockOreBismuth.get(), createFortune(BlockList.blockOreBismuth.get(), ItemList.itemRawBismuth.get()));
        add(BlockList.blockOreBlackSteel.get(), createFortune(BlockList.blockOreBlackSteel.get(), ItemList.itemRawBlackSteel.get()));
        add(BlockList.blockOreCadmium.get(), createFortune(BlockList.blockOreCadmium.get(), ItemList.itemRawCadmium.get()));
        add(BlockList.blockOreCarmot.get(), createFortune(BlockList.blockOreCarmot.get(), ItemList.itemRawCarmot.get()));
        add(BlockList.blockOreCelenegil.get(), createFortune(BlockList.blockOreCelenegil.get(), ItemList.itemRawCelenegil.get()));
        add(BlockList.blockOreCeruclase.get(), createFortune(BlockList.blockOreCeruclase.get(), ItemList.itemRawCeruclase.get()));
        add(BlockList.blockOreChromium.get(), createFortune(BlockList.blockOreChromium.get(), ItemList.itemRawChromium.get()));
        add(BlockList.blockOreChrysocolla.get(), createFortune(BlockList.blockOreChrysocolla.get(), ItemList.itemGemChrysocolla.get()));
        add(BlockList.blockOreCitrine.get(), createFortune(BlockList.blockOreCitrine.get(), ItemList.itemGemCitrine.get()));
        add(BlockList.blockOreCobalt.get(), createFortune(BlockList.blockOreCobalt.get(), ItemList.itemRawCobalt.get()));
        add(BlockList.blockOreCopper.get(), createFortune(BlockList.blockOreCopper.get(), ItemList.itemRawCopper.get()));
        add(BlockList.blockOreCrimsonSteel.get(), createFortune(BlockList.blockOreCrimsonSteel.get(), ItemList.itemRawCrimsonSteel.get()));
        add(BlockList.blockOreDeepIron.get(), createFortune(BlockList.blockOreDeepIron.get(), ItemList.itemRawDeepIron.get()));
        add(BlockList.blockOreDesichalkos.get(), createFortune(BlockList.blockOreDesichalkos.get(), ItemList.itemRawDesichalkos.get()));
        add(BlockList.blockOreEximite.get(), createFortune(BlockList.blockOreEximite.get(), ItemList.itemRawEximite.get()));
        add(BlockList.blockOreGallium.get(), createFortune(BlockList.blockOreGallium.get(), ItemList.itemRawGallium.get()));
        add(BlockList.blockOreGarnet.get(), createFortune(BlockList.blockOreGarnet.get(), ItemList.itemGemGarnet.get()));
        add(BlockList.blockOreHaderoth.get(), createFortune(BlockList.blockOreHaderoth.get(), ItemList.itemRawHaderoth.get()));
        add(BlockList.blockOreHepatizon.get(), createFortune(BlockList.blockOreHepatizon.get(), ItemList.itemRawHepatizon.get()));
        add(BlockList.blockOreIgnatius.get(), createFortune(BlockList.blockOreIgnatius.get(), ItemList.itemRawIgnatius.get()));
        add(BlockList.blockOreIndium.get(), createFortune(BlockList.blockOreIndium.get(), ItemList.itemRawIndium.get()));
        add(BlockList.blockOreInfuscolium.get(), createFortune(BlockList.blockOreInfuscolium.get(), ItemList.itemRawInfuscolium.get()));
        add(BlockList.blockOreInolashite.get(), createFortune(BlockList.blockOreInolashite.get(), ItemList.itemRawInolashite.get()));
        add(BlockList.blockOreIolite.get(), createFortune(BlockList.blockOreIolite.get(), ItemList.itemGemIolite.get()));
        add(BlockList.blockOreIridium.get(), createFortune(BlockList.blockOreIridium.get(), ItemList.itemRawIridium.get()));
        add(BlockList.blockOreJade.get(), createFortune(BlockList.blockOreJade.get(), ItemList.itemGemJade.get()));
        add(BlockList.blockOreJasper.get(), createFortune(BlockList.blockOreJasper.get(), ItemList.itemGemJasper.get()));
        add(BlockList.blockOreKalendrite.get(), createFortune(BlockList.blockOreKalendrite.get(), ItemList.itemRawKalendrite.get()));
        add(BlockList.blockOreKryptonite.get(), createFortune(BlockList.blockOreKryptonite.get(), ItemList.itemGemKryptonite.get()));
        add(BlockList.blockOreKyanite.get(), createFortune(BlockList.blockOreKyanite.get(), ItemList.itemGemKyanite.get()));
        add(BlockList.blockOreLead.get(), createFortune(BlockList.blockOreLead.get(), ItemList.itemRawLead.get()));
        add(BlockList.blockOreLemurite.get(), createFortune(BlockList.blockOreLemurite.get(), ItemList.itemRawLemurite.get()));
        add(BlockList.blockOreMalachite.get(), createFortune(BlockList.blockOreMalachite.get(), ItemList.itemGemMalachite.get()));
        add(BlockList.blockOreManganese.get(), createFortune(BlockList.blockOreManganese.get(), ItemList.itemRawManganese.get()));
        add(BlockList.blockOreMeutoite.get(), createFortune(BlockList.blockOreMeutoite.get(), ItemList.itemRawMeutoite.get()));
        add(BlockList.blockOreMidasium.get(), createFortune(BlockList.blockOreMidasium.get(), ItemList.itemRawMidasium.get()));
        add(BlockList.blockOreMithril.get(), createFortune(BlockList.blockOreMithril.get(), ItemList.itemRawMithril.get()));
        add(BlockList.blockOreMolybdenum.get(), createFortune(BlockList.blockOreMolybdenum.get(), ItemList.itemRawMolybdenum.get()));
        add(BlockList.blockOreNeodymium.get(), createFortune(BlockList.blockOreNeodymium.get(), ItemList.itemRawNeodymium.get()));
        add(BlockList.blockOreNeptunium.get(), createFortune(BlockList.blockOreNeptunium.get(), ItemList.itemRawNeptunium.get()));
        add(BlockList.blockOreNickel.get(), createFortune(BlockList.blockOreNickel.get(), ItemList.itemRawNickel.get()));
        add(BlockList.blockOreNiobium.get(), createFortune(BlockList.blockOreNiobium.get(), ItemList.itemRawNiobium.get()));
        add(BlockList.blockOreOnyx.get(), createFortune(BlockList.blockOreOnyx.get(), ItemList.itemGemOnyx.get()));
        add(BlockList.blockOreOpal.get(), createFortune(BlockList.blockOreOpal.get(), ItemList.itemGemOpal.get()));
        add(BlockList.blockOreOrichalcum.get(), createFortune(BlockList.blockOreOrichalcum.get(), ItemList.itemRawOrichalcum.get()));
        add(BlockList.blockOreOsmium.get(), createFortune(BlockList.blockOreOsmium.get(), ItemList.itemRawOsmium.get()));
        add(BlockList.blockOreOureclase.get(), createFortune(BlockList.blockOreOureclase.get(), ItemList.itemRawOureclase.get()));
        add(BlockList.blockOrePalladium.get(), createFortune(BlockList.blockOrePalladium.get(), ItemList.itemRawPalladium.get()));
        add(BlockList.blockOrePeridot.get(), createFortune(BlockList.blockOrePeridot.get(), ItemList.itemGemPeridot.get()));
        add(BlockList.blockOrePhoenixite.get(), createFortune(BlockList.blockOrePhoenixite.get(), ItemList.itemGemPhoenixite.get()));
        add(BlockList.blockOrePlatinum.get(), createFortune(BlockList.blockOrePlatinum.get(), ItemList.itemRawPlatinum.get()));
        add(BlockList.blockOrePlutonium.get(), createFortune(BlockList.blockOrePlutonium.get(), ItemList.itemRawPlutonium.get()));
        add(BlockList.blockOrePolonium.get(), createFortune(BlockList.blockOrePolonium.get(), ItemList.itemRawPolonium.get()));
        add(BlockList.blockOrePromethium.get(), createFortune(BlockList.blockOrePromethium.get(), ItemList.itemRawPromethium.get()));
        add(BlockList.blockOreQuartz.get(), createFortune(BlockList.blockOreQuartz.get(), ItemList.itemGemQuartz.get()));
        add(BlockList.blockOreRhenium.get(), createFortune(BlockList.blockOreRhenium.get(), ItemList.itemRawRhenium.get()));
        add(BlockList.blockOreRhodium.get(), createFortune(BlockList.blockOreRhodium.get(), ItemList.itemRawRhodium.get()));
        add(BlockList.blockOreRubracium.get(), createFortune(BlockList.blockOreRubracium.get(), ItemList.itemRawRubracium.get()));
        add(BlockList.blockOreRuby.get(), createFortune(BlockList.blockOreRuby.get(), ItemList.itemGemRuby.get()));
        add(BlockList.blockOreRuthenium.get(), createFortune(BlockList.blockOreRuthenium.get(), ItemList.itemRawRuthenium.get()));
        add(BlockList.blockOreSanguinite.get(), createFortune(BlockList.blockOreSanguinite.get(), ItemList.itemRawSanguinite.get()));
        add(BlockList.blockOreSapphire.get(), createFortune(BlockList.blockOreSapphire.get(), ItemList.itemGemSapphire.get()));
        add(BlockList.blockOreShadowIron.get(), createFortune(BlockList.blockOreShadowIron.get(), ItemList.itemRawShadowIron.get()));
        add(BlockList.blockOreSilver.get(), createFortune(BlockList.blockOreSilver.get(), ItemList.itemRawSilver.get()));
        add(BlockList.blockOreSpinel.get(), createFortune(BlockList.blockOreSpinel.get(), ItemList.itemGemSpinel.get()));
        add(BlockList.blockOreSugilite.get(), createFortune(BlockList.blockOreSugilite.get(), ItemList.itemGemSugilite.get()));
        add(BlockList.blockOreTantalum.get(), createFortune(BlockList.blockOreTantalum.get(), ItemList.itemRawTantalum.get()));
        add(BlockList.blockOreTanzanite.get(), createFortune(BlockList.blockOreTanzanite.get(), ItemList.itemGemTanzanite.get()));
        add(BlockList.blockOreTartarite.get(), createFortune(BlockList.blockOreTartarite.get(), ItemList.itemRawTartarite.get()));
        add(BlockList.blockOreTechnetium.get(), createFortune(BlockList.blockOreTechnetium.get(), ItemList.itemRawTechnetium.get()));
        add(BlockList.blockOreThallium.get(), createFortune(BlockList.blockOreThallium.get(), ItemList.itemRawThallium.get()));
        add(BlockList.blockOreTin.get(), createFortune(BlockList.blockOreTin.get(), ItemList.itemRawTin.get()));
        add(BlockList.blockOreTitanium.get(), createFortune(BlockList.blockOreTitanium.get(), ItemList.itemRawTitanium.get()));
        add(BlockList.blockOreTopaz.get(), createFortune(BlockList.blockOreTopaz.get(), ItemList.itemGemTopaz.get()));
        add(BlockList.blockOreTourmaline.get(), createFortune(BlockList.blockOreTourmaline.get(), ItemList.itemGemTourmaline.get()));
        add(BlockList.blockOreTritium.get(), createFortune(BlockList.blockOreTritium.get(), ItemList.itemRawTritium.get()));
        add(BlockList.blockOreTungsten.get(), createFortune(BlockList.blockOreTungsten.get(), ItemList.itemRawTungsten.get()));
        add(BlockList.blockOreTurquoise.get(), createFortune(BlockList.blockOreTurquoise.get(), ItemList.itemGemTurquoise.get()));
        add(BlockList.blockOreUnobtainium.get(), createFortune(BlockList.blockOreUnobtainium.get(), ItemList.itemRawUnobtainium.get()));
        add(BlockList.blockOreUranium.get(), createFortune(BlockList.blockOreUranium.get(), ItemList.itemRawUranium.get()));
        add(BlockList.blockOreVanadium.get(), createFortune(BlockList.blockOreVanadium.get(), ItemList.itemRawVanadium.get()));
        add(BlockList.blockOreVibranium.get(), createFortune(BlockList.blockOreVibranium.get(), ItemList.itemRawVibranium.get()));
        add(BlockList.blockOreVulcanite.get(), createFortune(BlockList.blockOreVulcanite.get(), ItemList.itemRawVulcanite.get()));
        add(BlockList.blockOreVyroxeres.get(), createFortune(BlockList.blockOreVyroxeres.get(), ItemList.itemRawVyroxeres.get()));
        add(BlockList.blockOreYellorite.get(), createFortune(BlockList.blockOreYellorite.get(), ItemList.itemRawYellorite.get()));
        add(BlockList.blockOreZinc.get(), createFortune(BlockList.blockOreZinc.get(), ItemList.itemRawZinc.get()));
        add(BlockList.blockOreZirconium.get(), createFortune(BlockList.blockOreZirconium.get(), ItemList.itemRawZirconium.get()));
        //Ore Deepslate
        add(BlockList.blockDeepslateOreAdamantine.get(), createFortune(BlockList.blockDeepslateOreAdamantine.get(), ItemList.itemRawAdamantine.get()));
        add(BlockList.blockDeepslateOreAgate.get(), createFortune(BlockList.blockDeepslateOreAgate.get(), ItemList.itemGemAgate.get()));
        add(BlockList.blockDeepslateOreAluminum.get(), createFortune(BlockList.blockDeepslateOreAluminum.get(), ItemList.itemRawAluminum.get()));
        add(BlockList.blockDeepslateOreAmericium.get(), createFortune(BlockList.blockDeepslateOreAmericium.get(), ItemList.itemRawAmericium.get()));
        add(BlockList.blockDeepslateOreAmethyst.get(), createFortune(BlockList.blockDeepslateOreAmethyst.get(), ItemList.itemGemAmethyst.get()));
        add(BlockList.blockDeepslateOreAmetrine.get(), createFortune(BlockList.blockDeepslateOreAmetrine.get(), ItemList.itemGemAmetrine.get()));
        add(BlockList.blockDeepslateOreAmordrine.get(), createFortune(BlockList.blockDeepslateOreAmordrine.get(), ItemList.itemRawAmordrine.get()));
        add(BlockList.blockDeepslateOreAngmallen.get(), createFortune(BlockList.blockDeepslateOreAngmallen.get(), ItemList.itemRawAngmallen.get()));
        add(BlockList.blockDeepslateOreAquamarine.get(), createFortune(BlockList.blockDeepslateOreAquamarine.get(), ItemList.itemGemAquamarine.get()));
        add(BlockList.blockDeepslateOreAstralSilver.get(), createFortune(BlockList.blockDeepslateOreAstralSilver.get(), ItemList.itemRawAstralSilver.get()));
        add(BlockList.blockDeepslateOreAtlarus.get(), createFortune(BlockList.blockDeepslateOreAtlarus.get(), ItemList.itemRawAtlarus.get()));
        add(BlockList.blockDeepslateOreAzureSilver.get(), createFortune(BlockList.blockDeepslateOreAzureSilver.get(), ItemList.itemRawAzureSilver.get()));
        add(BlockList.blockDeepslateOreBismuth.get(), createFortune(BlockList.blockDeepslateOreBismuth.get(), ItemList.itemRawBismuth.get()));
        add(BlockList.blockDeepslateOreBlackSteel.get(), createFortune(BlockList.blockDeepslateOreBlackSteel.get(), ItemList.itemRawBlackSteel.get()));
        add(BlockList.blockDeepslateOreCadmium.get(), createFortune(BlockList.blockDeepslateOreCadmium.get(), ItemList.itemRawCadmium.get()));
        add(BlockList.blockDeepslateOreCarmot.get(), createFortune(BlockList.blockDeepslateOreCarmot.get(), ItemList.itemRawCarmot.get()));
        add(BlockList.blockDeepslateOreCelenegil.get(), createFortune(BlockList.blockDeepslateOreCelenegil.get(), ItemList.itemRawCelenegil.get()));
        add(BlockList.blockDeepslateOreChromium.get(), createFortune(BlockList.blockDeepslateOreChromium.get(), ItemList.itemRawChromium.get()));
        add(BlockList.blockDeepslateOreChrysocolla.get(), createFortune(BlockList.blockDeepslateOreChrysocolla.get(), ItemList.itemGemChrysocolla.get()));
        add(BlockList.blockDeepslateOreCitrine.get(), createFortune(BlockList.blockDeepslateOreCitrine.get(), ItemList.itemGemCitrine.get()));
        add(BlockList.blockDeepslateOreCobalt.get(), createFortune(BlockList.blockDeepslateOreCobalt.get(), ItemList.itemRawCobalt.get()));
        add(BlockList.blockDeepslateOreCopper.get(), createFortune(BlockList.blockDeepslateOreCopper.get(), ItemList.itemRawCopper.get()));
        add(BlockList.blockDeepslateOreCrimsonSteel.get(), createFortune(BlockList.blockDeepslateOreCrimsonSteel.get(), ItemList.itemRawCrimsonSteel.get()));
        add(BlockList.blockDeepslateOreDeepIron.get(), createFortune(BlockList.blockDeepslateOreDeepIron.get(), ItemList.itemRawDeepIron.get()));
        add(BlockList.blockDeepslateOreDesichalkos.get(), createFortune(BlockList.blockDeepslateOreDesichalkos.get(), ItemList.itemRawDesichalkos.get()));
        add(BlockList.blockDeepslateOreEximite.get(), createFortune(BlockList.blockDeepslateOreEximite.get(), ItemList.itemRawEximite.get()));
        add(BlockList.blockDeepslateOreGallium.get(), createFortune(BlockList.blockDeepslateOreGallium.get(), ItemList.itemRawGallium.get()));
        add(BlockList.blockDeepslateOreGarnet.get(), createFortune(BlockList.blockDeepslateOreGarnet.get(), ItemList.itemGemGarnet.get()));
        add(BlockList.blockDeepslateOreHaderoth.get(), createFortune(BlockList.blockDeepslateOreHaderoth.get(), ItemList.itemRawHaderoth.get()));
        add(BlockList.blockDeepslateOreHepatizon.get(), createFortune(BlockList.blockDeepslateOreHepatizon.get(), ItemList.itemRawHepatizon.get()));
        add(BlockList.blockDeepslateOreIndium.get(), createFortune(BlockList.blockDeepslateOreIndium.get(), ItemList.itemRawIndium.get()));
        add(BlockList.blockDeepslateOreInfuscolium.get(), createFortune(BlockList.blockDeepslateOreInfuscolium.get(), ItemList.itemRawInfuscolium.get()));
        add(BlockList.blockDeepslateOreInolashite.get(), createFortune(BlockList.blockDeepslateOreInolashite.get(), ItemList.itemRawInolashite.get()));
        add(BlockList.blockDeepslateOreIolite.get(), createFortune(BlockList.blockDeepslateOreIolite.get(), ItemList.itemGemIolite.get()));
        add(BlockList.blockDeepslateOreIridium.get(), createFortune(BlockList.blockDeepslateOreIridium.get(), ItemList.itemRawIridium.get()));
        add(BlockList.blockDeepslateOreJade.get(), createFortune(BlockList.blockDeepslateOreJade.get(), ItemList.itemGemJade.get()));
        add(BlockList.blockDeepslateOreJasper.get(), createFortune(BlockList.blockDeepslateOreJasper.get(), ItemList.itemGemJasper.get()));
        add(BlockList.blockDeepslateOreKryptonite.get(), createFortune(BlockList.blockDeepslateOreKryptonite.get(), ItemList.itemGemKryptonite.get()));
        add(BlockList.blockDeepslateOreKyanite.get(), createFortune(BlockList.blockDeepslateOreKyanite.get(), ItemList.itemGemKyanite.get()));
        add(BlockList.blockDeepslateOreLead.get(), createFortune(BlockList.blockDeepslateOreLead.get(), ItemList.itemRawLead.get()));
        add(BlockList.blockDeepslateOreMalachite.get(), createFortune(BlockList.blockDeepslateOreMalachite.get(), ItemList.itemGemMalachite.get()));
        add(BlockList.blockDeepslateOreManganese.get(), createFortune(BlockList.blockDeepslateOreManganese.get(), ItemList.itemRawManganese.get()));
        add(BlockList.blockDeepslateOreMeutoite.get(), createFortune(BlockList.blockDeepslateOreMeutoite.get(), ItemList.itemRawMeutoite.get()));
        add(BlockList.blockDeepslateOreMithril.get(), createFortune(BlockList.blockDeepslateOreMithril.get(), ItemList.itemRawMithril.get()));
        add(BlockList.blockDeepslateOreMolybdenum.get(), createFortune(BlockList.blockDeepslateOreMolybdenum.get(), ItemList.itemRawMolybdenum.get()));
        add(BlockList.blockDeepslateOreNeodymium.get(), createFortune(BlockList.blockDeepslateOreNeodymium.get(), ItemList.itemRawNeodymium.get()));
        add(BlockList.blockDeepslateOreNeptunium.get(), createFortune(BlockList.blockDeepslateOreNeptunium.get(), ItemList.itemRawNeptunium.get()));
        add(BlockList.blockDeepslateOreNickel.get(), createFortune(BlockList.blockDeepslateOreNickel.get(), ItemList.itemRawNickel.get()));
        add(BlockList.blockDeepslateOreNiobium.get(), createFortune(BlockList.blockDeepslateOreNiobium.get(), ItemList.itemRawNiobium.get()));
        add(BlockList.blockDeepslateOreOnyx.get(), createFortune(BlockList.blockDeepslateOreOnyx.get(), ItemList.itemGemOnyx.get()));
        add(BlockList.blockDeepslateOreOpal.get(), createFortune(BlockList.blockDeepslateOreOpal.get(), ItemList.itemGemOpal.get()));
        add(BlockList.blockDeepslateOreOrichalcum.get(), createFortune(BlockList.blockDeepslateOreOrichalcum.get(), ItemList.itemRawOrichalcum.get()));
        add(BlockList.blockDeepslateOreOsmium.get(), createFortune(BlockList.blockDeepslateOreOsmium.get(), ItemList.itemRawOsmium.get()));
        add(BlockList.blockDeepslateOreOureclase.get(), createFortune(BlockList.blockDeepslateOreOureclase.get(), ItemList.itemRawOureclase.get()));
        add(BlockList.blockDeepslateOrePalladium.get(), createFortune(BlockList.blockDeepslateOrePalladium.get(), ItemList.itemRawPalladium.get()));
        add(BlockList.blockDeepslateOrePeridot.get(), createFortune(BlockList.blockDeepslateOrePeridot.get(), ItemList.itemGemPeridot.get()));
        add(BlockList.blockDeepslateOrePhoenixite.get(), createFortune(BlockList.blockDeepslateOrePhoenixite.get(), ItemList.itemGemPhoenixite.get()));
        add(BlockList.blockDeepslateOrePlatinum.get(), createFortune(BlockList.blockDeepslateOrePlatinum.get(), ItemList.itemRawPlatinum.get()));
        add(BlockList.blockDeepslateOrePlutonium.get(), createFortune(BlockList.blockDeepslateOrePlutonium.get(), ItemList.itemRawPlutonium.get()));
        add(BlockList.blockDeepslateOrePolonium.get(), createFortune(BlockList.blockDeepslateOrePolonium.get(), ItemList.itemRawPolonium.get()));
        add(BlockList.blockDeepslateOrePromethium.get(), createFortune(BlockList.blockDeepslateOrePromethium.get(), ItemList.itemRawPromethium.get()));
        add(BlockList.blockDeepslateOreQuartz.get(), createFortune(BlockList.blockDeepslateOreQuartz.get(), ItemList.itemGemQuartz.get()));
        add(BlockList.blockDeepslateOreRhenium.get(), createFortune(BlockList.blockDeepslateOreRhenium.get(), ItemList.itemRawRhenium.get()));
        add(BlockList.blockDeepslateOreRhodium.get(), createFortune(BlockList.blockDeepslateOreRhodium.get(), ItemList.itemRawRhodium.get()));
        add(BlockList.blockDeepslateOreRubracium.get(), createFortune(BlockList.blockDeepslateOreRubracium.get(), ItemList.itemRawRubracium.get()));
        add(BlockList.blockDeepslateOreRuby.get(), createFortune(BlockList.blockDeepslateOreRuby.get(), ItemList.itemGemRuby.get()));
        add(BlockList.blockDeepslateOreRuthenium.get(), createFortune(BlockList.blockDeepslateOreRuthenium.get(), ItemList.itemRawRuthenium.get()));
        add(BlockList.blockDeepslateOreSapphire.get(), createFortune(BlockList.blockDeepslateOreSapphire.get(), ItemList.itemGemSapphire.get()));
        add(BlockList.blockDeepslateOreSilver.get(), createFortune(BlockList.blockDeepslateOreSilver.get(), ItemList.itemRawSilver.get()));
        add(BlockList.blockDeepslateOreSpinel.get(), createFortune(BlockList.blockDeepslateOreSpinel.get(), ItemList.itemGemSpinel.get()));
        add(BlockList.blockDeepslateOreSugilite.get(), createFortune(BlockList.blockDeepslateOreSugilite.get(), ItemList.itemGemSugilite.get()));
        add(BlockList.blockDeepslateOreTantalum.get(), createFortune(BlockList.blockDeepslateOreTantalum.get(), ItemList.itemRawTantalum.get()));
        add(BlockList.blockDeepslateOreTanzanite.get(), createFortune(BlockList.blockDeepslateOreTanzanite.get(), ItemList.itemGemTanzanite.get()));
        add(BlockList.blockDeepslateOreTartarite.get(), createFortune(BlockList.blockDeepslateOreTartarite.get(), ItemList.itemRawTartarite.get()));
        add(BlockList.blockDeepslateOreTechnetium.get(), createFortune(BlockList.blockDeepslateOreTechnetium.get(), ItemList.itemRawTechnetium.get()));
        add(BlockList.blockDeepslateOreThallium.get(), createFortune(BlockList.blockDeepslateOreThallium.get(), ItemList.itemRawThallium.get()));
        add(BlockList.blockDeepslateOreTin.get(), createFortune(BlockList.blockDeepslateOreTin.get(), ItemList.itemRawTin.get()));
        add(BlockList.blockDeepslateOreTitanium.get(), createFortune(BlockList.blockDeepslateOreTitanium.get(), ItemList.itemRawTitanium.get()));
        add(BlockList.blockDeepslateOreTopaz.get(), createFortune(BlockList.blockDeepslateOreTopaz.get(), ItemList.itemGemTopaz.get()));
        add(BlockList.blockDeepslateOreTourmaline.get(), createFortune(BlockList.blockDeepslateOreTourmaline.get(), ItemList.itemGemTourmaline.get()));
        add(BlockList.blockDeepslateOreTritium.get(), createFortune(BlockList.blockDeepslateOreTritium.get(), ItemList.itemRawTritium.get()));
        add(BlockList.blockDeepslateOreTungsten.get(), createFortune(BlockList.blockDeepslateOreTungsten.get(), ItemList.itemRawTungsten.get()));
        add(BlockList.blockDeepslateOreTurquoise.get(), createFortune(BlockList.blockDeepslateOreTurquoise.get(), ItemList.itemGemTurquoise.get()));
        add(BlockList.blockDeepslateOreUnobtainium.get(), createFortune(BlockList.blockDeepslateOreUnobtainium.get(), ItemList.itemRawUnobtainium.get()));
        add(BlockList.blockDeepslateOreUranium.get(), createFortune(BlockList.blockDeepslateOreUranium.get(), ItemList.itemRawUranium.get()));
        add(BlockList.blockDeepslateOreVanadium.get(), createFortune(BlockList.blockDeepslateOreVanadium.get(), ItemList.itemRawVanadium.get()));
        add(BlockList.blockDeepslateOreVibranium.get(), createFortune(BlockList.blockDeepslateOreVibranium.get(), ItemList.itemRawVibranium.get()));
        add(BlockList.blockDeepslateOreYellorite.get(), createFortune(BlockList.blockDeepslateOreYellorite.get(), ItemList.itemRawYellorite.get()));
        add(BlockList.blockDeepslateOreZinc.get(), createFortune(BlockList.blockDeepslateOreZinc.get(), ItemList.itemRawZinc.get()));
        add(BlockList.blockDeepslateOreZirconium.get(), createFortune(BlockList.blockDeepslateOreZirconium.get(), ItemList.itemRawZirconium.get()));
        //Ore End Stone
        add(BlockList.blockEnderOreAgate.get(), createFortune(BlockList.blockEnderOreAgate.get(), ItemList.itemGemAgate.get()));
        add(BlockList.blockEnderOreAmethyst.get(), createFortune(BlockList.blockEnderOreAmethyst.get(), ItemList.itemGemAmethyst.get()));
        add(BlockList.blockEnderOreAmetrine.get(), createFortune(BlockList.blockEnderOreAmetrine.get(), ItemList.itemGemAmetrine.get()));
        add(BlockList.blockEnderOreAquamarine.get(), createFortune(BlockList.blockEnderOreAquamarine.get(), ItemList.itemGemAquamarine.get()));
        add(BlockList.blockEnderOreChrysocolla.get(), createFortune(BlockList.blockEnderOreChrysocolla.get(), ItemList.itemGemChrysocolla.get()));
        add(BlockList.blockEnderOreCitrine.get(), createFortune(BlockList.blockEnderOreCitrine.get(), ItemList.itemGemCitrine.get()));
        add(BlockList.blockEnderOreGarnet.get(), createFortune(BlockList.blockEnderOreGarnet.get(), ItemList.itemGemGarnet.get()));
        add(BlockList.blockEnderOreIolite.get(), createFortune(BlockList.blockEnderOreIolite.get(), ItemList.itemGemIolite.get()));
        add(BlockList.blockEnderOreJade.get(), createFortune(BlockList.blockEnderOreJade.get(), ItemList.itemGemJade.get()));
        add(BlockList.blockEnderOreJasper.get(), createFortune(BlockList.blockEnderOreJasper.get(), ItemList.itemGemJasper.get()));
        add(BlockList.blockEnderOreKryptonite.get(), createFortune(BlockList.blockEnderOreKryptonite.get(), ItemList.itemGemKryptonite.get()));
        add(BlockList.blockEnderOreKyanite.get(), createFortune(BlockList.blockEnderOreKyanite.get(), ItemList.itemGemKyanite.get()));
        add(BlockList.blockEnderOreMalachite.get(), createFortune(BlockList.blockEnderOreMalachite.get(), ItemList.itemGemMalachite.get()));
        add(BlockList.blockEnderOreOnyx.get(), createFortune(BlockList.blockEnderOreOnyx.get(), ItemList.itemGemOnyx.get()));
        add(BlockList.blockEnderOreOpal.get(), createFortune(BlockList.blockEnderOreOpal.get(), ItemList.itemGemOpal.get()));
        add(BlockList.blockEnderOrePeridot.get(), createFortune(BlockList.blockEnderOrePeridot.get(), ItemList.itemGemPeridot.get()));
        add(BlockList.blockEnderOrePhoenixite.get(), createFortune(BlockList.blockEnderOrePhoenixite.get(), ItemList.itemGemPhoenixite.get()));
        add(BlockList.blockEnderOreQuartz.get(), createFortune(BlockList.blockEnderOreQuartz.get(), ItemList.itemGemQuartz.get()));
        add(BlockList.blockEnderOreRuby.get(), createFortune(BlockList.blockEnderOreRuby.get(), ItemList.itemGemRuby.get()));
        add(BlockList.blockEnderOreSapphire.get(), createFortune(BlockList.blockEnderOreSapphire.get(), ItemList.itemGemSapphire.get()));
        add(BlockList.blockEnderOreSpinel.get(), createFortune(BlockList.blockEnderOreSpinel.get(), ItemList.itemGemSpinel.get()));
        add(BlockList.blockEnderOreSugilite.get(), createFortune(BlockList.blockEnderOreSugilite.get(), ItemList.itemGemSugilite.get()));
        add(BlockList.blockEnderOreTanzanite.get(), createFortune(BlockList.blockEnderOreTanzanite.get(), ItemList.itemGemTanzanite.get()));
        add(BlockList.blockEnderOreTopaz.get(), createFortune(BlockList.blockEnderOreTopaz.get(), ItemList.itemGemTopaz.get()));
        add(BlockList.blockEnderOreTourmaline.get(), createFortune(BlockList.blockEnderOreTourmaline.get(), ItemList.itemGemTourmaline.get()));
        add(BlockList.blockEnderOreTurquoise.get(), createFortune(BlockList.blockEnderOreTurquoise.get(), ItemList.itemGemTurquoise.get()));
    }
    protected LootTable.Builder createFortune(Block block, Item item)
    {
        HolderLookup.RegistryLookup<Enchantment> enchantments = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(
                block,
                this.applyExplosionDecay(
                        block,
                        LootItem.lootTableItem(item)
                                .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))
                )
        );
    }
}

package com.tylerh.extraores.Data.Tags;

import com.tylerh.extraores.Init.ItemList;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeItemTagsProvider;

public class ExOreItemTag extends ForgeItemTagsProvider
{
    public ExOreItemTag(DataGenerator gen, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper)
    {
        super(gen, blockTagProvider, existingFileHelper);
    }

    @Override
    public void registerTags()
    {
        getOrCreateBuilder(ItemTagList.Adamantine).add(ItemList.itemIngotAdamantine);
        getOrCreateBuilder(ItemTagList.Aldourite).add(ItemList.itemIngotAldourite);
        getOrCreateBuilder(ItemTagList.Aluminum).add(ItemList.itemIngotAluminum);
        getOrCreateBuilder(ItemTagList.Amordrine).add(ItemList.itemIngotAmordrine);
        getOrCreateBuilder(ItemTagList.Angmallen).add(ItemList.itemIngotAngmallen);
        getOrCreateBuilder(ItemTagList.AstralSilver).add(ItemList.itemIngotAstralSilver);
        getOrCreateBuilder(ItemTagList.Atlarus).add(ItemList.itemIngotAtlarus);
        getOrCreateBuilder(ItemTagList.Bismuth).add(ItemList.itemIngotBismuth);
        getOrCreateBuilder(ItemTagList.BlackSteel).add(ItemList.itemIngotBlackSteel);
        getOrCreateBuilder(ItemTagList.Cadmium).add(ItemList.itemIngotCadmium);
        getOrCreateBuilder(ItemTagList.Carmot).add(ItemList.itemIngotCarmot);
        getOrCreateBuilder(ItemTagList.Celenegil).add(ItemList.itemIngotCelenegil);
        getOrCreateBuilder(ItemTagList.Ceruclase).add(ItemList.itemIngotCeruclase);
        getOrCreateBuilder(ItemTagList.Chromium).add(ItemList.itemIngotChromium);
        getOrCreateBuilder(ItemTagList.Cobalt).add(ItemList.itemIngotCobalt);
        getOrCreateBuilder(ItemTagList.Copper).add(ItemList.itemIngotCopper);
        getOrCreateBuilder(ItemTagList.DeepIron).add(ItemList.itemIngotDeepIron);
        getOrCreateBuilder(ItemTagList.Desichalkos).add(ItemList.itemIngotDesichalkos);
        getOrCreateBuilder(ItemTagList.Eximite).add(ItemList.itemIngotEximite);
        getOrCreateBuilder(ItemTagList.Gallium).add(ItemList.itemIngotGallium);
        getOrCreateBuilder(ItemTagList.Haderoth).add(ItemList.itemIngotHaderoth);
        getOrCreateBuilder(ItemTagList.Hepatizon).add(ItemList.itemIngotHepatizon);
        getOrCreateBuilder(ItemTagList.Ignatius).add(ItemList.itemIngotIgnatius);
        getOrCreateBuilder(ItemTagList.Indium).add(ItemList.itemIngotIndium);
        getOrCreateBuilder(ItemTagList.Infuscolium).add(ItemList.itemIngotInfuscolium);
        getOrCreateBuilder(ItemTagList.Inolashite).add(ItemList.itemIngotInolashite);
        getOrCreateBuilder(ItemTagList.Kalendrite).add(ItemList.itemIngotKalendrite);
        getOrCreateBuilder(ItemTagList.Lead).add(ItemList.itemIngotLead);
        getOrCreateBuilder(ItemTagList.Lemurite).add(ItemList.itemIngotLemurite);
        getOrCreateBuilder(ItemTagList.Manganese).add(ItemList.itemIngotManganese);
        getOrCreateBuilder(ItemTagList.Meutoite).add(ItemList.itemIngotMeutoite);
        getOrCreateBuilder(ItemTagList.Midasium).add(ItemList.itemIngotMidasium);
        getOrCreateBuilder(ItemTagList.Mithril).add(ItemList.itemIngotMithril);
        getOrCreateBuilder(ItemTagList.Molybdenum).add(ItemList.itemIngotMolybdenum);
        getOrCreateBuilder(ItemTagList.Neodymium).add(ItemList.itemIngotNeodymium);
        getOrCreateBuilder(ItemTagList.Nickel).add(ItemList.itemIngotNickel);
        getOrCreateBuilder(ItemTagList.Niobium).add(ItemList.itemIngotNiobium);
        getOrCreateBuilder(ItemTagList.Orichalcum).add(ItemList.itemIngotOrichalcum);
        getOrCreateBuilder(ItemTagList.Oureclase).add(ItemList.itemIngotOureclase);
        getOrCreateBuilder(ItemTagList.Palladium).add(ItemList.itemIngotPalladium);
        getOrCreateBuilder(ItemTagList.Platinum).add(ItemList.itemIngotPlatinum);
        getOrCreateBuilder(ItemTagList.Plutonium).add(ItemList.itemIngotPlutonium);
        getOrCreateBuilder(ItemTagList.Prometheum).add(ItemList.itemIngotPrometheum);
        getOrCreateBuilder(ItemTagList.Rhodium).add(ItemList.itemIngotRhodium);
        getOrCreateBuilder(ItemTagList.Rubracium).add(ItemList.itemIngotRubracium);
        getOrCreateBuilder(ItemTagList.Ruthenium).add(ItemList.itemIngotRuthenium);
        getOrCreateBuilder(ItemTagList.Sanguinite).add(ItemList.itemIngotSanguinite);
        getOrCreateBuilder(ItemTagList.ShadowIron).add(ItemList.itemIngotShadowIron);
        getOrCreateBuilder(ItemTagList.Silver).add(ItemList.itemIngotSilver);
        getOrCreateBuilder(ItemTagList.Tartarite).add(ItemList.itemIngotTartarite);
        getOrCreateBuilder(ItemTagList.Technetium).add(ItemList.itemIngotTechnetium);
        getOrCreateBuilder(ItemTagList.Thallium).add(ItemList.itemIngotThallium);
        getOrCreateBuilder(ItemTagList.Tin).add(ItemList.itemIngotTin);
        getOrCreateBuilder(ItemTagList.Titanium).add(ItemList.itemIngotTitanium);
        getOrCreateBuilder(ItemTagList.Tungsten).add(ItemList.itemIngotTungsten);
        getOrCreateBuilder(ItemTagList.Unobtainium).add(ItemList.itemIngotUnobtainium);
        getOrCreateBuilder(ItemTagList.Uranium).add(ItemList.itemIngotUranium);
        getOrCreateBuilder(ItemTagList.Vanadium).add(ItemList.itemIngotVanadium);
        getOrCreateBuilder(ItemTagList.Vulcanite).add(ItemList.itemIngotVulcanite);
        getOrCreateBuilder(ItemTagList.Vyroxeres).add(ItemList.itemIngotVyroxeres);
        getOrCreateBuilder(ItemTagList.Zinc).add(ItemList.itemIngotZinc);
        getOrCreateBuilder(ItemTagList.Zirconium).add(ItemList.itemIngotZirconium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Adamantine);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Aldourite);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Aluminum);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Amordrine);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Angmallen);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.AstralSilver);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Atlarus);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Bismuth);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.BlackSteel);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Cadmium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Carmot);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Celenegil);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Ceruclase);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Chromium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Cobalt);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Copper);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.DeepIron);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Desichalkos);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Eximite);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Gallium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Haderoth);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Hepatizon);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Ignatius);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Indium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Infuscolium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Inolashite);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Kalendrite);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Lead);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Lemurite);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Manganese);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Meutoite);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Midasium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Mithril);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Molybdenum);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Neodymium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Nickel);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Niobium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Orichalcum);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Oureclase);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Palladium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Platinum);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Plutonium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Prometheum);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Rhodium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Rubracium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Ruthenium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Sanguinite);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.ShadowIron);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Silver);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Tartarite);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Technetium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Thallium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Tin);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Titanium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Tungsten);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Unobtainium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Uranium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Vanadium);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Vulcanite);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Vyroxeres);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Zinc);
        getOrCreateBuilder(ItemTagList.INGOTS).addTag(ItemTagList.Zirconium);
    }

    @Override
    public String getName()
    {
        return "Extra Ores Item Tags";
    }
}

package com.tylerh.extraores.Util;

import com.tylerh.extraores.Init.InitBlocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.common.Loader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ConfigHandler
{
    private static Configuration config = null;

    public static void preInit()
    {
        File configFile = new File(Loader.instance().getConfigDir(), "ExtraOres.cfg");
        config = new Configuration(configFile);
        syncFromFile();
    }

    public static void clientPreInit()
    {
        MinecraftForge.EVENT_BUS.register(new ExOreEventHandler());
    }

    public static Configuration getConfig()
    {
        return config;
    }

    public static void syncFromFile()
    {
        syncConfig(true, true);
    }

    public static void syncFromGUI()
    {
        syncConfig(false, true);
    }

    public static void syncFromFields()
    {
        syncConfig(false, false);
    }

    private static void syncConfig(boolean loadConfigFromFile, boolean readFieldsFromConfig)
    {
        if (loadConfigFromFile)
        {
            config.load();
        }
        Property propAdamantine = config.get(ModInfo.GUI_CATEGORY,"Adamantine",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propAldourite = config.get(ModInfo.GUI_CATEGORY,"Aldourite",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propAluminum = config.get(ModInfo.GUI_CATEGORY, "Aluminum", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propAmericium = config.get(ModInfo.GUI_CATEGORY,"Americium",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propAmordrine = config.get(ModInfo.GUI_CATEGORY, "Amordrine",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propAngmallen = config.get(ModInfo.GUI_CATEGORY,"Angmallen",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propAstralSilver = config.get(ModInfo.GUI_CATEGORY,"Astral_Silver",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propAtlarus = config.get(ModInfo.GUI_CATEGORY,"Atlarus",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propBismuth = config.get(ModInfo.GUI_CATEGORY, "Bismuth", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propBlackSteel = config.get(ModInfo.GUI_CATEGORY,"Black_Steel",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propCadmium = config.get(ModInfo.GUI_CATEGORY, "Cadmium", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propCarmot = config.get(ModInfo.GUI_CATEGORY,"Carmot",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propCelenegil = config.get(ModInfo.GUI_CATEGORY,"Celenegil",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propCeruclase = config.get(ModInfo.GUI_CATEGORY,"Ceruclase",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propChromium = config.get(ModInfo.GUI_CATEGORY, "Chromium", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propCobalt = config.get(ModInfo.GUI_CATEGORY, "Cobalt", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propCopper = config.get(ModInfo.GUI_CATEGORY, "Copper", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propDeepIron = config.get(ModInfo.GUI_CATEGORY,"Deep_Iron",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propDesichalkos = config.get(ModInfo.GUI_CATEGORY,"Desichalkos",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propEximite = config.get(ModInfo.GUI_CATEGORY,"Eximite",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propGallium = config.get(ModInfo.GUI_CATEGORY, "Gallium", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propHaderoth = config.get(ModInfo.GUI_CATEGORY,"Haderoth",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propHepatizon = config.get(ModInfo.GUI_CATEGORY,"Hepatizon",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propIgnatius = config.get(ModInfo.GUI_CATEGORY,"Ignatius",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propIndium = config.get(ModInfo.GUI_CATEGORY, "Indium", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propInfuscolium = config.get(ModInfo.GUI_CATEGORY,"Infuscolium",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propInolashite = config.get(ModInfo.GUI_CATEGORY,"Inolashite",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propIridium = config.get(ModInfo.GUI_CATEGORY,"Iridium",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propKalendrite = config.get(ModInfo.GUI_CATEGORY,"Kalendrite",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propLead = config.get(ModInfo.GUI_CATEGORY, "Lead", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propLemurite = config.get(ModInfo.GUI_CATEGORY,"Lemurite",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propManganese = config.get(ModInfo.GUI_CATEGORY, "Manganese", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propMeutoite = config.get(ModInfo.GUI_CATEGORY,"Meutoite",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propMidasium = config.get(ModInfo.GUI_CATEGORY,"Midasium",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propMithril = config.get(ModInfo.GUI_CATEGORY,"Mithril",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propMolybdenum = config.get(ModInfo.GUI_CATEGORY, "Molybdenum", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propNeodymium = config.get(ModInfo.GUI_CATEGORY, "Neodymium", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propNeptunium = config.get(ModInfo.GUI_CATEGORY,"Neptunium",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propNickel = config.get(ModInfo.GUI_CATEGORY, "Nickel", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propNiobium = config.get(ModInfo.GUI_CATEGORY, "Niobium", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propOrichalcum = config.get(ModInfo.GUI_CATEGORY,"Orichalcum",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propOsmium = config.get(ModInfo.GUI_CATEGORY,"Osmium",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propOureclase = config.get(ModInfo.GUI_CATEGORY,"Oureclase",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propPalladium = config.get(ModInfo.GUI_CATEGORY, "Palladium", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propPlatinum = config.get(ModInfo.GUI_CATEGORY, "Platinum", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propPlutonium = config.get(ModInfo.GUI_CATEGORY,"Plutonium",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propPolonium = config.get(ModInfo.GUI_CATEGORY,"Polonium",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propPromethium = config.get(ModInfo.GUI_CATEGORY,"Promethium",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propRhenium = config.get(ModInfo.GUI_CATEGORY,"Rhenium",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propRhodium = config.get(ModInfo.GUI_CATEGORY, "Rhodium", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propRubracium = config.get(ModInfo.GUI_CATEGORY,"Rubracium",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propRuthenium = config.get(ModInfo.GUI_CATEGORY, "Ruthenium", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propSanguinite = config.get(ModInfo.GUI_CATEGORY,"Sanguinite",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propShadowIron = config.get(ModInfo.GUI_CATEGORY,"Shadow_Iron",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propSilver = config.get(ModInfo.GUI_CATEGORY, "Silver", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propTantalum = config.get(ModInfo.GUI_CATEGORY,"Tantalum",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propTartarite = config.get(ModInfo.GUI_CATEGORY,"Tartarite",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propTechnetium = config.get(ModInfo.GUI_CATEGORY, "Technetium", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propThallium = config.get(ModInfo.GUI_CATEGORY, "Thallium", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propTin = config.get(ModInfo.GUI_CATEGORY, "Tin", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propTitanium = config.get(ModInfo.GUI_CATEGORY, "Titanium", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propTungsten = config.get(ModInfo.GUI_CATEGORY, "Tungsten", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propUnobtainium = config.get(ModInfo.GUI_CATEGORY, "Unobtainium", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propUranium = config.get(ModInfo.GUI_CATEGORY,"Uranium",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propVanadium = config.get(ModInfo.GUI_CATEGORY, "Vanadium", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propVulcanite = config. get(ModInfo.GUI_CATEGORY,"Vulcanite",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propVyroxeres = config.get(ModInfo.GUI_CATEGORY,"Vyroxeres",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propYellorite = config.get(ModInfo.GUI_CATEGORY,"Yellorite",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propZinc = config.get(ModInfo.GUI_CATEGORY, "Zinc", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propZirconium = config.get(ModInfo.GUI_CATEGORY, "Zirconium", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);

        List<String> propOrder = new ArrayList<String>();
        propOrder.add(propAdamantine.getName());
        propOrder.add(propAldourite.getName());
        propOrder.add(propAluminum.getName());
        propOrder.add(propAmericium.getName());
        propOrder.add(propAmordrine.getName());
        propOrder.add(propAngmallen.getName());
        propOrder.add(propAstralSilver.getName());
        propOrder.add(propAtlarus.getName());
        propOrder.add(propBismuth.getName());
        propOrder.add(propBlackSteel.getName());
        propOrder.add(propCadmium.getName());
        propOrder.add(propCarmot.getName());
        propOrder.add(propCelenegil.getName());
        propOrder.add(propCeruclase.getName());
        propOrder.add(propChromium.getName());
        propOrder.add(propCobalt.getName());
        propOrder.add(propCopper.getName());
        propOrder.add(propDeepIron.getName());
        propOrder.add(propDesichalkos.getName());
        propOrder.add(propEximite.getName());
        propOrder.add(propGallium.getName());
        propOrder.add(propHaderoth.getName());
        propOrder.add(propHepatizon.getName());
        propOrder.add(propIgnatius.getName());
        propOrder.add(propIndium.getName());
        propOrder.add(propInfuscolium.getName());
        propOrder.add(propInolashite.getName());
        propOrder.add(propIridium.getName());
        propOrder.add(propKalendrite.getName());
        propOrder.add(propLead.getName());
        propOrder.add(propLemurite.getName());
        propOrder.add(propManganese.getName());
        propOrder.add(propMeutoite.getName());
        propOrder.add(propMidasium.getName());
        propOrder.add(propMithril.getName());
        propOrder.add(propMolybdenum.getName());
        propOrder.add(propNeodymium.getName());
        propOrder.add(propNeptunium.getName());
        propOrder.add(propNickel.getName());
        propOrder.add(propNiobium.getName());
        propOrder.add(propOrichalcum.getName());
        propOrder.add(propOsmium.getName());
        propOrder.add(propOureclase.getName());
        propOrder.add(propPalladium.getName());
        propOrder.add(propPlatinum.getName());
        propOrder.add(propPlutonium.getName());
        propOrder.add(propPolonium.getName());
        propOrder.add(propPromethium.getName());
        propOrder.add(propRhenium.getName());
        propOrder.add(propRhodium.getName());
        propOrder.add(propRubracium.getName());
        propOrder.add(propRuthenium.getName());
        propOrder.add(propSanguinite.getName());
        propOrder.add(propShadowIron.getName());
        propOrder.add(propSilver.getName());
        propOrder.add(propTantalum.getName());
        propOrder.add(propTartarite.getName());
        propOrder.add(propTechnetium.getName());
        propOrder.add(propThallium.getName());
        propOrder.add(propTin.getName());
        propOrder.add(propTitanium.getName());
        propOrder.add(propTungsten.getName());
        propOrder.add(propUnobtainium.getName());
        propOrder.add(propUranium.getName());
        propOrder.add(propVanadium.getName());
        propOrder.add(propVulcanite.getName());
        propOrder.add(propVyroxeres.getName());
        propOrder.add(propYellorite.getName());
        propOrder.add(propZinc.getName());
        propOrder.add(propZirconium.getName());

        config.setCategoryPropertyOrder(ModInfo.GUI_CATEGORY, propOrder);
        if (readFieldsFromConfig)
        {
            InitBlocks.registerAdamantine = propAdamantine.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerAldourite = propAldourite.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerAluminum = propAluminum.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerAmericium = propAmericium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerAmordrine = propAmordrine.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerAngmallen = propAngmallen.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerAstralSilver = propAstralSilver.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerAtlarus = propAtlarus.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerBismuth = propBismuth.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerBlackSteel = propBlackSteel.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerCadmium = propCadmium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerCarmot = propCarmot.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerCelenegil = propCelenegil.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerCeruclase = propCeruclase.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerChromium = propChromium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerCobalt = propCobalt.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerCopper = propCopper.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerDeepIron = propDeepIron.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerDesichalkos = propDesichalkos.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerEximite = propEximite.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerGallium = propGallium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerHaderoth = propHaderoth.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerHepatizon = propHepatizon.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerIgnatius = propIgnatius.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerIndium = propIndium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerInfuscolium = propInfuscolium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerInolashite = propInolashite.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerIridium = propIridium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerKalendrite = propKalendrite.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerLead = propLead.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerLemurite = propLemurite.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerManganese = propManganese.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerMeutoite = propMeutoite.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerMidasium = propMidasium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerMithril = propMithril.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerMolybdenum = propMolybdenum.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerNeodymium = propNeodymium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerNeptunium = propNeptunium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerNickel = propNickel.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerNiobium = propNiobium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerOrichalcum = propOrichalcum.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerOsmium = propOsmium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerOureclase = propOureclase.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerPalladium = propPalladium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerPlatinum = propPlatinum.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerPlutonium = propPlutonium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerPolonium = propPolonium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerPromethium = propPromethium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerRhenium = propRhenium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerRhodium = propRhodium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerRubracium = propRubracium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerRuthenium = propRuthenium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerSanguinite = propSanguinite.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerShadowIron = propShadowIron.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerSilver = propSilver.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerTantalum = propTantalum.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerTartarite = propTartarite.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerTechnetium = propTechnetium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerThallium = propThallium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerTin = propTin.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerTitanium = propTitanium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerTungsten = propTungsten.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerUnobtainium = propUnobtainium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerUranium = propUranium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerVanadium = propVanadium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerVulcanite = propVulcanite.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerVyroxeres = propVyroxeres.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerYellorite = propYellorite.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerZinc = propZinc.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerZirconium = propZirconium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
        }
        propAdamantine.set(InitBlocks.registerAdamantine);
        propAldourite.set(InitBlocks.registerAldourite);
        propAluminum.set(InitBlocks.registerAluminum);
        propAmericium.set(InitBlocks.registerAmericium);
        propAmordrine.set(InitBlocks.registerAmordrine);
        propAngmallen.set(InitBlocks.registerAngmallen);
        propAstralSilver.set(InitBlocks.registerAstralSilver);
        propAtlarus.set(InitBlocks.registerAtlarus);
        propBismuth.set(InitBlocks.registerBismuth);
        propBlackSteel.set(InitBlocks.registerBlackSteel);
        propCadmium.set(InitBlocks.registerCadmium);
        propCarmot.set(InitBlocks.registerCarmot);
        propCelenegil.set(InitBlocks.registerCelenegil);
        propCeruclase.set(InitBlocks.registerCeruclase);
        propChromium.set(InitBlocks.registerChromium);
        propCobalt.set(InitBlocks.registerCobalt);
        propCopper.set(InitBlocks.registerCopper);
        propDeepIron.set(InitBlocks.registerDeepIron);
        propDesichalkos.set(InitBlocks.registerDesichalkos);
        propEximite.set(InitBlocks.registerEximite);
        propGallium.set(InitBlocks.registerGallium);
        propHaderoth.set(InitBlocks.registerHaderoth);
        propHepatizon.set(InitBlocks.registerHepatizon);
        propIgnatius.set(InitBlocks.registerIgnatius);
        propIndium.set(InitBlocks.registerIndium);
        propInfuscolium.set(InitBlocks.registerInfuscolium);
        propInolashite.set(InitBlocks.registerInolashite);
        propIridium.set(InitBlocks.registerIridium);
        propKalendrite.set(InitBlocks.registerKalendrite);
        propLead.set(InitBlocks.registerLead);
        propLemurite.set(InitBlocks.registerLemurite);
        propManganese.set(InitBlocks.registerManganese);
        propMeutoite.set(InitBlocks.registerMeutoite);
        propMidasium.set(InitBlocks.registerMidasium);
        propMithril.set(InitBlocks.registerMithril);
        propMolybdenum.set(InitBlocks.registerMolybdenum);
        propNeodymium.set(InitBlocks.registerNeodymium);
        propNeptunium.set(InitBlocks.registerNeptunium);
        propNickel.set(InitBlocks.registerNickel);
        propNiobium.set(InitBlocks.registerNiobium);
        propOrichalcum.set(InitBlocks.registerOrichalcum);
        propOsmium.set(InitBlocks.registerOsmium);
        propOureclase.set(InitBlocks.registerOureclase);
        propPalladium.set(InitBlocks.registerPalladium);
        propPlatinum.set(InitBlocks.registerPlatinum);
        propPlutonium.set(InitBlocks.registerPlutonium);
        propPolonium.set(InitBlocks.registerPolonium);
        propPromethium.set(InitBlocks.registerPromethium);
        propRhenium.set(InitBlocks.registerRhenium);
        propRhodium.set(InitBlocks.registerRhodium);
        propRubracium.set(InitBlocks.registerRubracium);
        propRuthenium.set(InitBlocks.registerRuthenium);
        propSanguinite.set(InitBlocks.registerSanguinite);
        propShadowIron.set(InitBlocks.registerShadowIron);
        propSilver.set(InitBlocks.registerSilver);
        propTantalum.set(InitBlocks.registerTantalum);
        propTartarite.set(InitBlocks.registerTartarite);
        propTechnetium.set(InitBlocks.registerTechnetium);
        propThallium.set(InitBlocks.registerThallium);
        propTin.set(InitBlocks.registerTin);
        propTitanium.set(InitBlocks.registerTitanium);
        propTungsten.set(InitBlocks.registerTungsten);
        propUnobtainium.set(InitBlocks.registerUnobtainium);
        propUranium.set(InitBlocks.registerUranium);
        propVanadium.set(InitBlocks.registerVanadium);
        propVulcanite.set(InitBlocks.registerVulcanite);
        propVyroxeres.set(InitBlocks.registerVyroxeres);
        propYellorite.set(InitBlocks.registerYellorite);
        propZinc.set(InitBlocks.registerZinc);
        propZirconium.set(InitBlocks.registerZirconium);

        if (config.hasChanged())
        {
            config.save();
        }
    }
}

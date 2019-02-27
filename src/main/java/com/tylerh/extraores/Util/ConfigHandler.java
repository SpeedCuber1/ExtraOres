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
        Property propCopper = config.get(ModInfo.GUI_CATEGORY, "Copper", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propTin = config.get(ModInfo.GUI_CATEGORY, "Tin", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propChromium = config.get(ModInfo.GUI_CATEGORY, "Chromium", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propCobalt = config.get(ModInfo.GUI_CATEGORY, "Cobalt", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propUnobtainium = config.get(ModInfo.GUI_CATEGORY, "Unobtainium", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propManganese = config.get(ModInfo.GUI_CATEGORY, "Manganese", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propMolybdenum = config.get(ModInfo.GUI_CATEGORY, "Molybdenum", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propAluminum = config.get(ModInfo.GUI_CATEGORY, "Aluminum", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propSilver = config.get(ModInfo.GUI_CATEGORY, "Silver", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propLead = config.get(ModInfo.GUI_CATEGORY, "Lead", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propPlatinum = config.get(ModInfo.GUI_CATEGORY, "Platinum", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propTungsten = config.get(ModInfo.GUI_CATEGORY, "Tungsten", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propVanadium = config.get(ModInfo.GUI_CATEGORY, "Vanadium", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propZinc = config.get(ModInfo.GUI_CATEGORY, "Zinc", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propZirconium = config.get(ModInfo.GUI_CATEGORY, "Zirconium", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propNiobium = config.get(ModInfo.GUI_CATEGORY, "Niobium", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propTechnetium = config.get(ModInfo.GUI_CATEGORY, "Technetium", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propRuthenium = config.get(ModInfo.GUI_CATEGORY, "Ruthenium", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propRhodium = config.get(ModInfo.GUI_CATEGORY, "Rhodium", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propPalladium = config.get(ModInfo.GUI_CATEGORY, "Palladium", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propCadmium = config.get(ModInfo.GUI_CATEGORY, "Cadmium", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propNeodymium = config.get(ModInfo.GUI_CATEGORY, "Neodymium", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propBismuth = config.get(ModInfo.GUI_CATEGORY, "Bismuth", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propGallium = config.get(ModInfo.GUI_CATEGORY, "Gallium", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propIndium = config.get(ModInfo.GUI_CATEGORY, "Indium", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propThallium = config.get(ModInfo.GUI_CATEGORY, "Thallium", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propTitanium = config.get(ModInfo.GUI_CATEGORY, "Titanium", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propNickel = config.get(ModInfo.GUI_CATEGORY, "Nickel", ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propAdamantine = config.get(ModInfo.GUI_CATEGORY,"Adamantine",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propAldourite = config.get(ModInfo.GUI_CATEGORY,"Aldourite",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propAstralSilver = config.get(ModInfo.GUI_CATEGORY,"Astral_Silver",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propAtlarus = config.get(ModInfo.GUI_CATEGORY,"Atlarus",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propCarmot = config.get(ModInfo.GUI_CATEGORY,"Carmot",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propCeruclase = config.get(ModInfo.GUI_CATEGORY,"Ceruclase",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propDeepIron = config.get(ModInfo.GUI_CATEGORY,"Deep_Iron",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propIgnatius = config.get(ModInfo.GUI_CATEGORY,"Ignatius",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propInfuscolium = config.get(ModInfo.GUI_CATEGORY,"Infuscolium",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propKalendrite = config.get(ModInfo.GUI_CATEGORY,"Kalendrite",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propLemurite = config.get(ModInfo.GUI_CATEGORY,"Lemurite",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propMidasium = config.get(ModInfo.GUI_CATEGORY,"Midasium",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propMithril = config.get(ModInfo.GUI_CATEGORY,"Mithril",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propOrichalcum = config.get(ModInfo.GUI_CATEGORY,"Orichalcum",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propOureclase = config.get(ModInfo.GUI_CATEGORY,"Oureclase",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propPrometheum = config.get(ModInfo.GUI_CATEGORY,"Prometheum",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propRubracium = config.get(ModInfo.GUI_CATEGORY,"Rubracium",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propSanguinite = config.get(ModInfo.GUI_CATEGORY,"Sanguinite",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propShadowIron = config.get(ModInfo.GUI_CATEGORY,"Shadow_Iron",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propVulcanite = config. get(ModInfo.GUI_CATEGORY,"Vulcanite",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propVyroxeres = config.get(ModInfo.GUI_CATEGORY,"Vyroxeres",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propAmordrine = config.get(ModInfo.GUI_CATEGORY, "Amordrine",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propAngmallen = config.get(ModInfo.GUI_CATEGORY,"Angmallen",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propBlackSteel = config.get(ModInfo.GUI_CATEGORY,"Black_Steel",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propCelenegil = config.get(ModInfo.GUI_CATEGORY,"Celenegil",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propHaderoth = config.get(ModInfo.GUI_CATEGORY,"Haderoth",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propHepatizon = config.get(ModInfo.GUI_CATEGORY,"Hepatizon",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);
        Property propInolashite = config.get(ModInfo.GUI_CATEGORY,"Inolashite",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(ModInfo.GUI_DEFAULT_VALUE);

        List<String> propOrder = new ArrayList<String>();
        propOrder.add(propAmordrine.getName());
        propOrder.add(propAngmallen.getName());
        propOrder.add(propBlackSteel.getName());
        propOrder.add(propCelenegil.getName());
        propOrder.add(propHaderoth.getName());
        propOrder.add(propHepatizon.getName());
        propOrder.add(propInolashite.getName());
        propOrder.add(propCopper.getName());
        propOrder.add(propTin.getName());
        propOrder.add(propChromium.getName());
        propOrder.add(propCobalt.getName());
        propOrder.add(propUnobtainium.getName());
        propOrder.add(propManganese.getName());
        propOrder.add(propMolybdenum.getName());
        propOrder.add(propAluminum.getName());
        propOrder.add(propSilver.getName());
        propOrder.add(propLead.getName());
        propOrder.add(propPlatinum.getName());
        propOrder.add(propTungsten.getName());
        propOrder.add(propVanadium.getName());
        propOrder.add(propZinc.getName());
        propOrder.add(propZirconium.getName());
        propOrder.add(propNiobium.getName());
        propOrder.add(propTechnetium.getName());
        propOrder.add(propRuthenium.getName());
        propOrder.add(propRhodium.getName());
        propOrder.add(propPalladium.getName());
        propOrder.add(propCadmium.getName());
        propOrder.add(propNeodymium.getName());
        propOrder.add(propBismuth.getName());
        propOrder.add(propGallium.getName());
        propOrder.add(propIndium.getName());
        propOrder.add(propThallium.getName());
        propOrder.add(propTitanium.getName());
        propOrder.add(propNickel.getName());
        propOrder.add(propAdamantine.getName());
        propOrder.add(propAldourite.getName());
        propOrder.add(propAstralSilver.getName());
        propOrder.add(propAtlarus.getName());
        propOrder.add(propCarmot.getName());
        propOrder.add(propCeruclase.getName());
        propOrder.add(propDeepIron.getName());
        propOrder.add(propIgnatius.getName());
        propOrder.add(propInfuscolium.getName());
        propOrder.add(propKalendrite.getName());
        propOrder.add(propLemurite.getName());
        propOrder.add(propMidasium.getName());
        propOrder.add(propMithril.getName());
        propOrder.add(propOrichalcum.getName());
        propOrder.add(propOureclase.getName());
        propOrder.add(propPrometheum.getName());
        propOrder.add(propRubracium.getName());
        propOrder.add(propSanguinite.getName());
        propOrder.add(propShadowIron.getName());
        propOrder.add(propVulcanite.getName());
        propOrder.add(propVyroxeres.getName());

        config.setCategoryPropertyOrder(ModInfo.GUI_CATEGORY, propOrder);
        if (readFieldsFromConfig)
        {
            InitBlocks.registerAmordrine = propAmordrine.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerAngmallen = propAngmallen.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerBlackSteel = propBlackSteel.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerCelenegil = propCelenegil.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerHaderoth = propHaderoth.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerHepatizon = propHepatizon.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerInolashite = propInolashite.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerCopper = propCopper.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerTin = propTin.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerChromium = propChromium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerCobalt = propCobalt.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerUnobtainium = propUnobtainium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerManganese = propManganese.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerMolybdenum = propMolybdenum.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerAluminum = propAluminum.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerSilver = propSilver.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerLead = propLead.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerPlatinum = propPlatinum.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerTungsten = propTungsten.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerVanadium = propVanadium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerZinc = propZinc.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerZirconium = propZirconium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerNiobium = propNiobium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerTechnetium = propTechnetium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerRuthenium = propRuthenium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerRhodium = propRhodium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerPalladium = propPalladium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerCadmium = propCadmium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerNeodymium = propNeodymium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerBismuth = propBismuth.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerGallium = propGallium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerIndium = propIndium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerThallium = propThallium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerTitanium = propTitanium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerNickel = propNickel.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerAdamantine = propAdamantine.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerAldourite = propAldourite.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerAstralSilver = propAstralSilver.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerAtlarus = propAtlarus.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerCarmot = propCarmot.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerCeruclase = propCeruclase.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerDeepIron = propDeepIron.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerIgnatius = propIgnatius.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerInfuscolium = propInfuscolium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerKalendrite = propKalendrite.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerLemurite = propLemurite.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerMidasium = propMidasium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerMithril = propMithril.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerOrichalcum = propOrichalcum.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerOureclase = propOureclase.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerPrometheum = propPrometheum.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerRubracium = propRubracium.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerSanguinite = propSanguinite.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerShadowIron = propShadowIron.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerVulcanite = propVulcanite.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
            InitBlocks.registerVyroxeres = propVyroxeres.getBoolean(ModInfo.GUI_DEFAULT_VALUE);
        }
        propAmordrine.set(InitBlocks.registerAmordrine);
        propAngmallen.set(InitBlocks.registerAngmallen);
        propBlackSteel.set(InitBlocks.registerBlackSteel);
        propCelenegil.set(InitBlocks.registerCelenegil);
        propHaderoth.set(InitBlocks.registerHaderoth);
        propHepatizon.set(InitBlocks.registerHepatizon);
        propInolashite.set(InitBlocks.registerInolashite);
        propCopper.set(InitBlocks.registerCopper);
        propTin.set(InitBlocks.registerTin);
        propChromium.set(InitBlocks.registerChromium);
        propCobalt.set(InitBlocks.registerCobalt);
        propUnobtainium.set(InitBlocks.registerUnobtainium);
        propManganese.set(InitBlocks.registerManganese);
        propMolybdenum.set(InitBlocks.registerMolybdenum);
        propAluminum.set(InitBlocks.registerAluminum);
        propSilver.set(InitBlocks.registerSilver);
        propLead.set(InitBlocks.registerLead);
        propPlatinum.set(InitBlocks.registerPlatinum);
        propTungsten.set(InitBlocks.registerTungsten);
        propVanadium.set(InitBlocks.registerVanadium);
        propZinc.set(InitBlocks.registerZinc);
        propZirconium.set(InitBlocks.registerZirconium);
        propNiobium.set(InitBlocks.registerNiobium);
        propTechnetium.set(InitBlocks.registerTechnetium);
        propRuthenium.set(InitBlocks.registerRuthenium);
        propRhodium.set(InitBlocks.registerRhodium);
        propPalladium.set(InitBlocks.registerPalladium);
        propCadmium.set(InitBlocks.registerCadmium);
        propNeodymium.set(InitBlocks.registerNeodymium);
        propBismuth.set(InitBlocks.registerBismuth);
        propGallium.set(InitBlocks.registerGallium);
        propIndium.set(InitBlocks.registerIndium);
        propThallium.set(InitBlocks.registerThallium);
        propTitanium.set(InitBlocks.registerTitanium);
        propNickel.set(InitBlocks.registerNickel);
        propAdamantine.set(InitBlocks.registerAdamantine);
        propAldourite.set(InitBlocks.registerAldourite);
        propAstralSilver.set(InitBlocks.registerAstralSilver);
        propAtlarus.set(InitBlocks.registerAtlarus);
        propCarmot.set(InitBlocks.registerCarmot);
        propCeruclase.set(InitBlocks.registerCeruclase);
        propDeepIron.set(InitBlocks.registerDeepIron);
        propIgnatius.set(InitBlocks.registerIgnatius);
        propInfuscolium.set(InitBlocks.registerInfuscolium);
        propKalendrite.set(InitBlocks.registerKalendrite);
        propLemurite.set(InitBlocks.registerLemurite);
        propMidasium.set(InitBlocks.registerMidasium);
        propMithril.set(InitBlocks.registerMithril);
        propOrichalcum.set(InitBlocks.registerOrichalcum);
        propOureclase.set(InitBlocks.registerOureclase);
        propPrometheum.set(InitBlocks.registerPrometheum);
        propRubracium.set(InitBlocks.registerRubracium);
        propSanguinite.set(InitBlocks.registerSanguinite);
        propShadowIron.set(InitBlocks.registerShadowIron);
        propVulcanite.set(InitBlocks.registerVulcanite);
        propVyroxeres.set(InitBlocks.registerVyroxeres);

        if (config.hasChanged())
        {
            config.save();
        }
    }
}

package com.tylerh.extraores.Util;

import com.tylerh.extraores.Init.InitBlocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tyler on 4/29/2016.
 */
public class ConfigHandler
{
    public static void preInit()
    {
        File configFile = new File(Loader.instance().getConfigDir(),"ExtraOres.cfg");
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
        syncConfig(true,true);
    }
    public static void syncFromGUI()
    {
        syncConfig(false,true);
    }
    public static void syncFromFields()
    {
        syncConfig(false,false);
    }
    private static void syncConfig(boolean loadConfigFromFile, boolean readFieldsFromConfig)
    {
        if(loadConfigFromFile)
        {
            config.load();
        }
        Property propCopper = config.get(ModInfo.GUI_CATEGORY,"Copper",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(true);
        Property propTin = config.get(ModInfo.GUI_CATEGORY,"Tin",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(true);
        Property propChromium = config.get(ModInfo.GUI_CATEGORY,"Chromium",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(true);
        Property propCobalt = config.get(ModInfo.GUI_CATEGORY,"Cobalt",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(true);
        Property propUnobtainium = config.get(ModInfo.GUI_CATEGORY,"Unobtainium",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(true);
        Property propManganese = config.get(ModInfo.GUI_CATEGORY,"Manganese",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(true);
        Property propMolybdenum = config.get(ModInfo.GUI_CATEGORY,"Molybdenum",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(true);
        Property propAluminum = config.get(ModInfo.GUI_CATEGORY,"Aluminum",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(true);
        Property propSilver = config.get(ModInfo.GUI_CATEGORY,"Silver",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(true);
        Property propLead = config.get(ModInfo.GUI_CATEGORY,"Lead",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(true);
        Property propPlatinum = config.get(ModInfo.GUI_CATEGORY,"Platinum",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(true);
        Property propTungsten = config.get(ModInfo.GUI_CATEGORY,"Tungstem",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(true);
        Property propVanadium = config.get(ModInfo.GUI_CATEGORY,"Vanadium",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(true);
        Property propZinc = config.get(ModInfo.GUI_CATEGORY,"Zinc",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(true);
        Property propZirconium = config.get(ModInfo.GUI_CATEGORY,"Zirconium",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(true);
        Property propNiobium = config.get(ModInfo.GUI_CATEGORY,"Niobium",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(true);
        Property propTechnetium = config.get(ModInfo.GUI_CATEGORY,"Technetium",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(true);
        Property propRuthenium = config.get(ModInfo.GUI_CATEGORY,"Ruthenium",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(true);
        Property propRhodium = config.get(ModInfo.GUI_CATEGORY,"Rhodium",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(true);
        Property propPalladium = config.get(ModInfo.GUI_CATEGORY,"Palladium",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(true);
        Property propCadmium = config.get(ModInfo.GUI_CATEGORY,"Cadmium",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(true);
        Property propNeodymium = config.get(ModInfo.GUI_CATEGORY,"Neodymium",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(true);
        Property propBismuth = config.get(ModInfo.GUI_CATEGORY,"Bismuth",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(true);
        Property propGallium = config.get(ModInfo.GUI_CATEGORY,"Gallium",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(true);
        Property propIndium = config.get(ModInfo.GUI_CATEGORY,"Indium",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(true);
        Property propThallium = config.get(ModInfo.GUI_CATEGORY,"Thallium",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(true);
        Property propTitanium = config.get(ModInfo.GUI_CATEGORY,"Titanium",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(true);
        Property propNickel = config.get(ModInfo.GUI_CATEGORY,"Nickel",ModInfo.GUI_DEFAULT_VALUE).setRequiresMcRestart(true);

        List<String> propOrder = new ArrayList<String>();
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

        config.setCategoryPropertyOrder(ModInfo.GUI_CATEGORY,propOrder);
        if(readFieldsFromConfig)
        {
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
        }
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
        if(config.hasChanged())
        {
            config.save();
        }
    }
    private static Configuration config = null;
}
package com.tylerh.extraores.Util;

import com.tylerh.extraores.Init.InitBlocks;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Tyler on 4/29/2016.
 */
public class ConfigHandler
{
    public static Configuration config;

    public static void init(File file)
    {
        if (config == null)
        {
            config = new Configuration(file);
            loadConfig();
        }
    }
    public static void loadConfig()
    {
        try
        {
            config.load();
            InitBlocks.registerCopper = config.get("ores","Copper",true).getBoolean(true);
            InitBlocks.registerTin = config.get("ores","Tin",true).getBoolean(true);
            InitBlocks.registerChromium = config.get("ores","Chromium",true).getBoolean(true);
            InitBlocks.registerCobalt = config.get("ores","Cobalt",true).getBoolean(true);
            InitBlocks.registerUnobtainium = config.get("ores","Unobtainium",true).getBoolean(true);
            InitBlocks.registerManganese = config.get("ores","Manganese",true).getBoolean(true);
            InitBlocks.registerMolybdenum = config.get("ores","Molybdenum",true).getBoolean(true);
            InitBlocks.registerAluminum = config.get("ores","Aluminum",true,"Set true to enable world gen and smelting").getBoolean(true);
            InitBlocks.registerSilver = config.get("ores","Silver",true).getBoolean(true);
            InitBlocks.registerLead = config.get("ores","Lead",true).getBoolean(true);
            InitBlocks.registerPlatinum = config.get("ores","Platinum",true).getBoolean(true);
            InitBlocks.registerTungsten = config.get("ores","Tungsten",true).getBoolean(true);
            InitBlocks.registerVanadium = config.get("ores","Vanadium",true).getBoolean(true);
            InitBlocks.registerZinc = config.get("ores","Zinc",true).getBoolean(true);
            InitBlocks.registerZirconium = config.get("ores","Zirconium",true).getBoolean(true);
            InitBlocks.registerNiobium = config.get("ores","Niobium",true).getBoolean(true);
            InitBlocks.registerTechnetium = config.get("ores","Technetium",true).getBoolean(true);
            InitBlocks.registerRuthenium = config.get("ores","Ruthenium",true).getBoolean(true);
            InitBlocks.registerRhodium = config.get("ores","Rhodium",true).getBoolean(true);
            InitBlocks.registerPalladium = config.get("ores","Palladium",true).getBoolean(true);
            InitBlocks.registerCadmium = config.get("ores","Cadmium",true).getBoolean(true);
            InitBlocks.registerNeodymium = config.get("ores","Neodymium",true).getBoolean(true);
            InitBlocks.registerBismuth = config.get("ores","Bismuth",true).getBoolean(true);
            InitBlocks.registerGallium = config.get("ores","Gallium",true).getBoolean(true);
            InitBlocks.registerIndium = config.get("ores","Indium",true).getBoolean(true);
            InitBlocks.registerThallium = config.get("ores","Thallium",true).getBoolean(true);
            InitBlocks.registerTitanium = config.get("ores","Titanium",true).getBoolean(true);
            InitBlocks.registerNickel = config.get("ores","Nickel",true).getBoolean(true);
        }
        catch(Exception e)
        {

        }
        finally
        {
            if(config.hasChanged())
            {
                config.save();
            }
        }
    }
}

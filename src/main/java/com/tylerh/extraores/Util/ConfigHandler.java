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

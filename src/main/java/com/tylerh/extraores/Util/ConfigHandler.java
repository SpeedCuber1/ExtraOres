package com.tylerh.extraores.Util;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import com.tylerh.extraores.Init.ConfigRegistryList;
import com.tylerh.extraores.World.ExOreWorldGenConfig;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

import java.nio.file.Path;

@Mod.EventBusSubscriber
public class ConfigHandler
{
    private static final ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

    public static final ForgeConfigSpec spec;

    static
    {
        ConfigRegistryList.initConfig(builder);
        ExOreWorldGenConfig.init(builder);
        spec = builder.build();
    }

    public static void loadConfig(ForgeConfigSpec configSpec, Path path)
    {
        final CommentedFileConfig config = CommentedFileConfig.builder(path).sync().autosave().writingMode(WritingMode.REPLACE).build();
        config.load();
        configSpec.setConfig(config);
    }
}

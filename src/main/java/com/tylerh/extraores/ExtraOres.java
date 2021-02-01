package com.tylerh.extraores;

import com.tylerh.extraores.Util.ConfigHandler;
import com.tylerh.extraores.Util.ModInfo;
import com.tylerh.extraores.World.ExOreWorldGen;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;

@Mod(ModInfo.MOD_ID)
public class ExtraOres
{
    public ExtraOres()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ConfigHandler.spec);
        MinecraftForge.EVENT_BUS.register(new ExOreWorldGen());
        ConfigHandler.loadConfig(ConfigHandler.spec, FMLPaths.CONFIGDIR.get().resolve("extraores-common.toml"));
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(FMLCommonSetupEvent event)
    {
    }

    private void clientRegistries(FMLClientSetupEvent event)
    {
    }
}
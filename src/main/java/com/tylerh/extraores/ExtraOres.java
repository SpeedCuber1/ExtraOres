package com.tylerh.extraores;

import com.tylerh.extraores.Util.ConfigHandler;
import com.tylerh.extraores.Util.ModInfo;
import com.tylerh.extraores.World.ExOreWorldGen;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
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
        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        bus.addListener(this::clientRegistries);
        bus.register(this);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ConfigHandler.spec);
        ConfigHandler.loadConfig(ConfigHandler.spec, FMLPaths.CONFIGDIR.get().resolve("extraores-common.toml"));
        MinecraftForge.EVENT_BUS.register(new ExOreWorldGen());
        MinecraftForge.EVENT_BUS.register(this);
    }
    @SubscribeEvent
    public void setup(FMLCommonSetupEvent event)
    {
        event.enqueueWork(ExOreWorldGen::onCommonSetup);
    }
    private void clientRegistries(FMLClientSetupEvent event)
    {
    }
}
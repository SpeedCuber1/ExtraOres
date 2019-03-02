package com.tylerh.extraores;

import com.tylerh.extraores.Proxy.CommonProxy;
import com.tylerh.extraores.Util.LogHelper;
import com.tylerh.extraores.Util.ModInfo;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Tyler on 4/29/2016.
 */
@Mod(modid = ModInfo.MOD_ID, name = ModInfo.MOD_NAME, version = ModInfo.MOD_VERSION, guiFactory = ModInfo.GUI_FACTORY)
public class ExtraOres
{
    @Instance
    public static ExtraOres instance;
   @SidedProxy(clientSide = ModInfo.CLIENT_PROXY, serverSide = ModInfo.COMMON_PROXY)
    private static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
        LogHelper.info("Extra Ores has finished Pre-Initialization");
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
        LogHelper.info("Extra Ores has finished Initialization");
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
        LogHelper.info("Extra Ores has finished Post-Initialization");
    }
}

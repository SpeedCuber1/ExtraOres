package com.tylerh.extraores.Proxy;

import com.tylerh.extraores.Init.InitBlocks;
import com.tylerh.extraores.Init.Recipes;
import com.tylerh.extraores.Util.ConfigHandler;
import com.tylerh.extraores.Util.EXOreWorldGen;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Tyler on 4/29/2016.
 */
public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigHandler.preInit();
        InitBlocks.init();
    }
    public void init(FMLInitializationEvent event)
    {
        GameRegistry.registerWorldGenerator(new EXOreWorldGen(),0);
    }
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}

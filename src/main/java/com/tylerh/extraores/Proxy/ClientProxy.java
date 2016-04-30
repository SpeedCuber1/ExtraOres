package com.tylerh.extraores.Proxy;

import com.tylerh.extraores.Util.EXOreRender;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Tyler on 4/29/2016.
 */
public class ClientProxy extends CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
        super.preInit(event);
    }
    public void init(FMLInitializationEvent event)
    {
        super.init(event);
        EXOreRender.initBlockRender();
        EXOreRender.initItemRender();
    }
    public void postInit(FMLPostInitializationEvent event)
    {
        super.postInit(event);
    }
}

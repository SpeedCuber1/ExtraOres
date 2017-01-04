package com.tylerh.extraores.Util;

import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by User on 1/4/2017.
 */
public class ExOreEventHandler
{
    @SubscribeEvent(priority = EventPriority.NORMAL)
    public void onEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(ModInfo.MOD_ID.equals(event.getModID()) && !event.isWorldRunning())
        {
            if(event.getConfigID().equals(ModInfo.GUI_CATEGORY))
            {
                ConfigHandler.syncFromGUI();
            }
        }
    }
}

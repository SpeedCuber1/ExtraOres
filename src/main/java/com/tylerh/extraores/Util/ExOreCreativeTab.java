package com.tylerh.extraores.Util;

import com.tylerh.extraores.Init.BlockList;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ModInfo.MOD_ID,bus = Mod.EventBusSubscriber.Bus.MOD)
public class ExOreCreativeTab
{
    public static CreativeModeTab EXORES;
    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event)
    {
        EXORES = event.registerCreativeModeTab(new ResourceLocation(ModInfo.MOD_ID,"extra_ores_tab"),
                builder -> builder.icon(() -> new ItemStack(BlockList.blockOreCopper.get())).title(Component.translatable("Extra Ores")).build());
    }
}

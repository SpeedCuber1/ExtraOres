package com.tylerh.extraores.Util;

import com.tylerh.extraores.Init.BlockList;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ExOreCreativeTab
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ModInfo.MOD_ID);
    public static final DeferredHolder<CreativeModeTab,CreativeModeTab> EXORES = CREATIVE_TABS.register("exores_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemgroup.extraores"))
            .icon(() -> BlockList.blockOreAdamantine.get().asItem().getDefaultInstance()).build());
}

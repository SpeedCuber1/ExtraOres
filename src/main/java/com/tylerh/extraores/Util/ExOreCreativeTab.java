package com.tylerh.extraores.Util;

import com.tylerh.extraores.Init.BlockList;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = ModInfo.MOD_ID,bus = Mod.EventBusSubscriber.Bus.MOD)
public class ExOreCreativeTab
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ModInfo.MOD_ID);
    public static final RegistryObject<CreativeModeTab> EXORES = CREATIVE_TABS.register("exores_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemgroup.extraores"))
            .icon(() -> BlockList.blockOreAdamantine.get().asItem().getDefaultInstance()).build());
}

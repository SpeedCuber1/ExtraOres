package com.tylerh.extraores.Util;

import com.tylerh.extraores.Init.InitBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by Tyler on 4/29/2016.
 */
public class CreativeTabExtraOres
{
    public static final CreativeTabs EXTRA_ORES_TAB = new CreativeTabs(ModInfo.MOD_ID)
    {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Item.getItemFromBlock(InitBlocks.blockOreCopper));
        }

        @Override
        public String getTranslationKey() {
            return ModInfo.MOD_NAME;
        }
    };
}

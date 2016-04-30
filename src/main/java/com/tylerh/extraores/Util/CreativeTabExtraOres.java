package com.tylerh.extraores.Util;

import com.tylerh.extraores.Init.InitBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Tyler on 4/29/2016.
 */
public class CreativeTabExtraOres
{
    public static final CreativeTabs EXTRA_ORES_TAB = new CreativeTabs(ModInfo.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return Item.getItemFromBlock(InitBlocks.blockOreCopper);
        }
        @Override
        public String getTranslatedTabLabel()
        {
            return "Extra Ores";
        }
    };
}

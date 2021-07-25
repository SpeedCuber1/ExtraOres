package com.tylerh.extraores.Util;

import com.tylerh.extraores.Init.BlockList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ItemGroupExOre extends CreativeModeTab
{
    public ItemGroupExOre()
    {
        super("extraores");
    }

    @Override
    public ItemStack makeIcon()
    {
        return new ItemStack(BlockList.blockOreAdamantine);
    }
}

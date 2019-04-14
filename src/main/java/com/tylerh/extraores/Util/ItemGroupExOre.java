package com.tylerh.extraores.Util;

import com.tylerh.extraores.Init.BlockList;
import com.tylerh.extraores.Init.InitBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemGroupExOre extends ItemGroup
{
    public ItemGroupExOre()
    {
        super(ModInfo.MOD_NAME);
    }

    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(BlockList.blockOreAdamantine);
    }
}

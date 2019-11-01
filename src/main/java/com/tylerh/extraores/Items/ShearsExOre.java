package com.tylerh.extraores.Items;

import com.tylerh.extraores.Util.ModInfo;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShearsItem;

public class ShearsExOre extends ShearsItem
{
    public ShearsExOre(ItemGroup group,String uName)
    {
        super(new Item.Properties().group(group));
        setRegistryName(ModInfo.MOD_ID,uName);
    }
}

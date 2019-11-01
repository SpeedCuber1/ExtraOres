package com.tylerh.extraores.Items;

import com.tylerh.extraores.Util.ModInfo;
import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class HoeExOre extends HoeItem
{
    public HoeExOre(IItemTier tier, float attackSpeed, ItemGroup group,String uName)
    {
        super(tier,attackSpeed,new Item.Properties().group(group));
        setRegistryName(ModInfo.MOD_ID,uName);
    }
}

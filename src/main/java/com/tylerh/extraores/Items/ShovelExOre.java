package com.tylerh.extraores.Items;

import com.tylerh.extraores.Util.ModInfo;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;

public class ShovelExOre extends ShovelItem
{
    public ShovelExOre(IItemTier tier, float attackDamage, float attackSpeed, ItemGroup group,String uName)
    {
        super(tier,attackDamage,attackSpeed,new Item.Properties().group(group));
        setRegistryName(ModInfo.MOD_ID,uName);
    }
}

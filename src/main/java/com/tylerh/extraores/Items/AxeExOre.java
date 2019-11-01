package com.tylerh.extraores.Items;

import com.tylerh.extraores.Util.ModInfo;
import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class AxeExOre extends AxeItem
{
    public AxeExOre(IItemTier tier, float attackDamage, float attackSpeed, ItemGroup group,String uName)
    {
        super(tier,attackDamage,attackSpeed,new Item.Properties().group(group));
        setRegistryName(ModInfo.MOD_ID,uName);
    }
}

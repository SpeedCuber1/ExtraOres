package com.tylerh.extraores.Init;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;

public class ItemTierExOre implements IItemTier
{
    private int harvestLevel,maxUses,enchantability;
    private float efficiency,attackDamage;
    private Item repairItem;
    public ItemTierExOre(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability)
    {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
    }
    public void setRepairItem(Item item)
    {
        this.repairItem = item;
    }
    @Override
    public int getMaxUses()
    {
        return this.maxUses;
    }

    @Override
    public float getEfficiency()
    {
        return this.efficiency;
    }

    @Override
    public float getAttackDamage()
    {
        return this.attackDamage;
    }

    @Override
    public int getHarvestLevel()
    {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantability()
    {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairMaterial()
    {
        return Ingredient.fromItems(this.repairItem);
    }
}

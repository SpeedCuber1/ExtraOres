package com.tylerh.extraores.Data.Loot_Tables;

import com.google.common.collect.Maps;
import net.minecraft.advancements.critereon.EnchantmentPredicate;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.MinMaxBounds;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;

import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class LootTables implements Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>
{
    private static final LootItemCondition.Builder SILK_TOUCH = MatchTool.toolMatches(ItemPredicate.Builder.item().hasEnchantment(new EnchantmentPredicate(Enchantments.SILK_TOUCH, MinMaxBounds.Ints.atLeast(1))));
    private final Map<ResourceLocation, LootTable.Builder> map = Maps.newHashMap();
    public LootTables()
    {

    }

    @Override
    public void accept(BiConsumer<ResourceLocation, LootTable.Builder> resourceLocationBuilderBiConsumer)
    {

    }
}

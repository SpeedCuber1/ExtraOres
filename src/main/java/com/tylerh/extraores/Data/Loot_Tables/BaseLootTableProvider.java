package com.tylerh.extraores.Data.Loot_Tables;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minecraft.advancements.criterion.EnchantmentPredicate;
import net.minecraft.advancements.criterion.ItemPredicate;
import net.minecraft.advancements.criterion.MinMaxBounds;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DirectoryCache;
import net.minecraft.data.IDataProvider;
import net.minecraft.data.LootTableProvider;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.*;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraft.loot.conditions.MatchTool;
import net.minecraft.loot.functions.*;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;


public abstract class BaseLootTableProvider extends LootTableProvider
{

    private static final Logger LOGGER = LogManager.getLogger();
    private static LootPool.Builder builder;
    private static final ILootCondition.IBuilder SILK_TOUCH = MatchTool.toolMatches(ItemPredicate.Builder.item().hasEnchantment(new EnchantmentPredicate(Enchantments.SILK_TOUCH,MinMaxBounds.IntBound.atLeast(1))));
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    protected final Map<Block, LootTable.Builder> lootTables = new HashMap<>();
    private final DataGenerator generator;
    public BaseLootTableProvider(DataGenerator dataGeneratorIn)
    {
        super(dataGeneratorIn);
        this.generator = dataGeneratorIn;
    }
    protected abstract void addTables();
    protected LootTable.Builder createFortune(String name,Block block,Item item)
    {
        return createSilkTouch(name,block,ItemLootEntry.lootTableItem(item).apply(ApplyBonus.addOreBonusCount(Enchantments.BLOCK_FORTUNE)));
    }
    protected LootTable.Builder createSilkTouch(String name,Block block,LootEntry.Builder<?> builder)
    {
        return createDropping(name,block,SILK_TOUCH,builder);
    }
    protected LootTable.Builder createDropping(String name,Block block,ILootCondition.IBuilder iBuilder,LootEntry.Builder<?> builder)
    {
        return createLootPool(name,block,iBuilder,builder);
    }
    protected LootTable.Builder createLootPool(String name,Block block,ILootCondition.IBuilder iBuilder,LootEntry.Builder<?> alt)
    {
        builder = LootPool.lootPool()
                .name(name)
                .setRolls(ConstantRange.exactly(1))
                .add(ItemLootEntry.lootTableItem(block)
                        .apply((ILootFunction.IBuilder) iBuilder)
                        .otherwise(alt));
        return LootTable.lootTable().withPool(builder);
    }
    protected LootTable.Builder createStandardTable(String name, Block block)
    {
        builder = LootPool.lootPool()
                .name(name)
                .setRolls(ConstantRange.exactly(1))
                .add(ItemLootEntry.lootTableItem(block)
                        .apply(CopyName.copyName(CopyName.Source.BLOCK_ENTITY))
                        .apply(CopyNbt.copyData(CopyNbt.Source.BLOCK_ENTITY)
                                .copy("inv", "BlockEntityTag.inv", CopyNbt.Action.REPLACE)
                                .copy("energy", "BlockEntityTag.energy", CopyNbt.Action.REPLACE))
                        .apply(SetContents.setContents()
                                .withEntry(DynamicLootEntry.dynamicEntry(new ResourceLocation("minecraft", "contents"))))
                );
        return LootTable.lootTable().withPool(builder);
    }
    @Override
    public void run(DirectoryCache cache)
    {
        addTables();

        Map<ResourceLocation, LootTable> tables = new HashMap<>();
        for (Map.Entry<Block, LootTable.Builder> entry : lootTables.entrySet())
        {
            tables.put(entry.getKey().getLootTable(), entry.getValue().setParamSet(LootParameterSets.BLOCK).build());
        }
        writeTables(cache, tables);
    }

    private void writeTables(DirectoryCache cache, Map<ResourceLocation, LootTable> tables)
    {
        Path outputFolder = this.generator.getOutputFolder();
        tables.forEach((key, lootTable) ->
        {
            Path path = outputFolder.resolve("data/" + key.getNamespace() + "/loot_tables/" + key.getPath() + ".json");
            try
            {
                IDataProvider.save(GSON, cache, LootTableManager.serialize(lootTable), path);
            }
            catch (IOException e)
            {
                LOGGER.error("Couldn't write loot table {}", path, e);
            }
        });
    }

    @Override
    public String getName()
    {
        return "Extra Ores Loot Tables";
    }
}

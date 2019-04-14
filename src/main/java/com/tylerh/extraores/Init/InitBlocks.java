package com.tylerh.extraores.Init;

import com.tylerh.extraores.Blocks.BlockEXOre;
import com.tylerh.extraores.Items.ItemBlockExOre;
import com.tylerh.extraores.Items.ItemEXOre;
import com.tylerh.extraores.Util.ItemGroupExOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class InitBlocks
{
    private static final ItemGroup EXORES = new ItemGroupExOre();
    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event)
    {
        if(ConfigRegistryList.registerAdamantine.get())
        {
            BlockList.blockOreAdamantine = new BlockEXOre(Material.ROCK,3.0f,5.0f,"adamantineore");
            BlockList.blockAdamantine = new BlockEXOre(Material.IRON,3.0f,5.0f,"adamantineblock");
            blockRegistry(BlockList.blockOreAdamantine,event);
            blockRegistry(BlockList.blockAdamantine,event);
        }
        if(ConfigRegistryList.registerAldourite.get())
        {
            BlockList.blockOreAldourite = new BlockEXOre(Material.ROCK,3.0f,5.0f,"aldouriteore");
            BlockList.blockAldourite = new BlockEXOre(Material.IRON,3.0f,5.0f,"aldouriteblock");
            blockRegistry(BlockList.blockOreAldourite,event);
            blockRegistry(BlockList.blockAldourite,event);
        }
        if(ConfigRegistryList.registerAluminum.get())
        {
            BlockList.blockOreAluminum = new BlockEXOre(Material.ROCK,3.0f,5.0f,"aluminumore");
            BlockList.blockAluminum = new BlockEXOre(Material.IRON,3.0f,5.0f,"aluminumblock");
            blockRegistry(BlockList.blockOreAluminum,event);
            blockRegistry(BlockList.blockAluminum,event);
        }
    }
    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event)
    {
        if(ConfigRegistryList.registerAdamantine.get())
        {
            ItemList.itemIngotAdamantine = new ItemEXOre(EXORES,"adamantineingot");
            ItemList.itemDustAdamantine = new ItemEXOre(EXORES,"adamantinedust");
            ItemBlockList.itemBlockOreAdamantine = new ItemBlockExOre(BlockList.blockOreAdamantine,EXORES);
            ItemBlockList.itemBlockAdamantine = new ItemBlockExOre(BlockList.blockAdamantine,EXORES);
            itemRegistry(ItemList.itemIngotAdamantine,event);
            itemRegistry(ItemList.itemDustAdamantine,event);
            itemRegistry(ItemBlockList.itemBlockOreAdamantine,event);
            itemRegistry(ItemBlockList.itemBlockAdamantine,event);
        }
        if(ConfigRegistryList.registerAldourite.get())
        {
            ItemList.itemIngotAldourite = new ItemEXOre(EXORES,"aldouriteingot");
            ItemList.itemDustAldourite = new ItemEXOre(EXORES,"aldouritedust");
            ItemBlockList.itemBlockOreAldourite = new ItemBlockExOre(BlockList.blockOreAldourite,EXORES);
            ItemBlockList.itemBlockAldourite = new ItemBlockExOre(BlockList.blockAldourite,EXORES);
            itemRegistry(ItemList.itemIngotAldourite,event);
            itemRegistry(ItemList.itemDustAldourite,event);
            itemRegistry(ItemBlockList.itemBlockOreAldourite,event);
            itemRegistry(ItemBlockList.itemBlockAldourite,event);
        }
        if(ConfigRegistryList.registerAluminum.get())
        {
            ItemList.itemIngotAluminum = new ItemEXOre(EXORES,"aluminumingot");
            ItemList.itemDustAluminum = new ItemEXOre(EXORES,"aluminumdust");
            ItemBlockList.itemBlockOreAluminum = new ItemBlockExOre(BlockList.blockOreAluminum,EXORES);
            ItemBlockList.itemBlockAluminum = new ItemBlockExOre(BlockList.blockAluminum,EXORES);
            itemRegistry(ItemList.itemIngotAluminum,event);
            itemRegistry(ItemList.itemDustAluminum,event);
            itemRegistry(ItemBlockList.itemBlockOreAluminum,event);
            itemRegistry(ItemBlockList.itemBlockAluminum,event);
        }
    }
    private static void blockRegistry(Block block, RegistryEvent.Register<Block> regEvent)
    {
        regEvent.getRegistry().register(block);
    }
    private static void itemRegistry(Item item, RegistryEvent.Register<Item> regEvent)
    {
        regEvent.getRegistry().register(item);
    }
}

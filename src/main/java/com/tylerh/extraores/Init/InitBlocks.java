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
        if(ConfigRegistryList.registerAmordrine.get())
        {
            BlockList.blockOreAmordrine = new BlockEXOre(Material.ROCK,3.0f,5.0f,"amordrineore");
            BlockList.blockAmordrine = new BlockEXOre(Material.IRON,3.0f,5.0f,"amordrineblock");
            blockRegistry(BlockList.blockOreAmordrine,event);
            blockRegistry(BlockList.blockAmordrine,event);
        }
        if(ConfigRegistryList.registerAngmallen.get())
        {
            BlockList.blockOreAngmallen = new BlockEXOre(Material.ROCK,3.0f,5.0f,"angmallenore");
            BlockList.blockAngmallen = new BlockEXOre(Material.IRON,3.0f,5.0f,"angmallenblock");
            blockRegistry(BlockList.blockOreAngmallen,event);
            blockRegistry(BlockList.blockAngmallen,event);
        }
        if(ConfigRegistryList.registerAstralSilver.get())
        {
            BlockList.blockOreAstralSilver = new BlockEXOre(Material.ROCK,3.0f,5.0f,"astralsilverore");
            BlockList.blockAstralSilver = new BlockEXOre(Material.IRON,3.0f,5.0f,"astralsilverblock");
            blockRegistry(BlockList.blockOreAstralSilver,event);
            blockRegistry(BlockList.blockAstralSilver,event);
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
        if(ConfigRegistryList.registerAmordrine.get())
        {
            ItemList.itemIngotAmordrine = new ItemEXOre(EXORES,"amordrineingot");
            ItemList.itemDustAmordrine = new ItemEXOre(EXORES,"amordrinedust");
            ItemBlockList.itemBlockOreAmordrine = new ItemBlockExOre(BlockList.blockOreAmordrine,EXORES);
            ItemBlockList.itemBlockAmordrine = new ItemBlockExOre(BlockList.blockAmordrine,EXORES);
            itemRegistry(ItemList.itemIngotAmordrine,event);
            itemRegistry(ItemList.itemDustAmordrine,event);
            itemRegistry(ItemBlockList.itemBlockOreAmordrine,event);
            itemRegistry(ItemBlockList.itemBlockAmordrine,event);
        }
        if(ConfigRegistryList.registerAngmallen.get())
        {
            ItemList.itemIngotAngmallen = new ItemEXOre(EXORES,"angmalleningot");
            ItemList.itemDustAngmallen = new ItemEXOre(EXORES,"angmallendust");
            ItemBlockList.itemBlockOreAngmallen = new ItemBlockExOre(BlockList.blockOreAngmallen,EXORES);
            ItemBlockList.itemBlockAngmallen = new ItemBlockExOre(BlockList.blockAngmallen,EXORES);
            itemRegistry(ItemList.itemIngotAngmallen,event);
            itemRegistry(ItemList.itemDustAngmallen,event);
            itemRegistry(ItemBlockList.itemBlockOreAngmallen,event);
            itemRegistry(ItemBlockList.itemBlockAngmallen,event);
        }
        if(ConfigRegistryList.registerAstralSilver.get())
        {
            ItemList.itemIngotAstralSilver = new ItemEXOre(EXORES,"astralsilveringot");
            ItemList.itemDustAstralSilver = new ItemEXOre(EXORES,"astralsilverdust");
            ItemBlockList.itemBlockOreAstralSilver = new ItemBlockExOre(BlockList.blockOreAstralSilver,EXORES);
            ItemBlockList.itemBlockAstralSilver = new ItemBlockExOre(BlockList.blockAstralSilver,EXORES);
            itemRegistry(ItemList.itemIngotAstralSilver,event);
            itemRegistry(ItemList.itemDustAstralSilver,event);
            itemRegistry(ItemBlockList.itemBlockOreAstralSilver,event);
            itemRegistry(ItemBlockList.itemBlockAstralSilver,event);
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

package com.tylerh.extraores.Util;

import com.tylerh.extraores.Init.InitBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Tyler on 4/29/2016.
 */
public class EXOreRender
{
    public static void initBlockRender()
    {
        if(InitBlocks.registerCopper)
        {
            Item itemBlockCopper = Item.getItemFromBlock(InitBlocks.blockOreCopper);
            ResourceLocation location = new ResourceLocation("extraores:copperOre");
            Register(itemBlockCopper,location.toString());
            itemBlockCopper = Item.getItemFromBlock(InitBlocks.blockCopper);
            location = new ResourceLocation("extraores:copperBlock");
            Register(itemBlockCopper,location.toString());
        }
        if(InitBlocks.registerTin)
        {
            Item itemBlockTin = Item.getItemFromBlock(InitBlocks.blockOreTin);
            ResourceLocation location = new ResourceLocation("extraores:tinOre");
            Register(itemBlockTin,location.toString());
            itemBlockTin = Item.getItemFromBlock(InitBlocks.blockTin);
            location = new ResourceLocation("extraores:tinBlock");
            Register(itemBlockTin,location.toString());
        }
        if(InitBlocks.registerChromium)
        {
            Item itemBlockChromium = Item.getItemFromBlock(InitBlocks.blockOreChromium);
            ResourceLocation location = new ResourceLocation("extraores:chromiumOre");
            Register(itemBlockChromium,location.toString());
            itemBlockChromium = Item.getItemFromBlock(InitBlocks.blockChromium);
            location = new ResourceLocation("extraores:chromiumBlock");
            Register(itemBlockChromium,location.toString());
        }
        if(InitBlocks.registerCobalt)
        {
            Item itemBlockCobalt = Item.getItemFromBlock(InitBlocks.blockOreCobalt);
            ResourceLocation location = new ResourceLocation("extraores:cobaltOre");
            Register(itemBlockCobalt,location.toString());
            itemBlockCobalt = Item.getItemFromBlock(InitBlocks.blockCobalt);
            location = new ResourceLocation("extraores:cobaltBlock");
            Register(itemBlockCobalt,location.toString());
        }
        if(InitBlocks.registerUnobtainium)
        {
            Item itemBlockUnobtainium = Item.getItemFromBlock(InitBlocks.blockOreUnobtainium);
            ResourceLocation location = new ResourceLocation("extraores:unobtainiumOre");
            Register(itemBlockUnobtainium,location.toString());
            itemBlockUnobtainium = Item.getItemFromBlock(InitBlocks.blockUnobtainium);
            location = new ResourceLocation("extraores:unobtainiumBlock");
            Register(itemBlockUnobtainium,location.toString());
        }
        if(InitBlocks.registerManganese)
        {
            Item itemBlockManganese = Item.getItemFromBlock(InitBlocks.blockOreManganese);
            ResourceLocation location = new ResourceLocation("extraores:manganeseOre");
            Register(itemBlockManganese,location.toString());
            itemBlockManganese = Item.getItemFromBlock(InitBlocks.blockManganese);
            location = new ResourceLocation("extraores:manganeseBlock");
            Register(itemBlockManganese,location.toString());
        }
        if(InitBlocks.registerMolybdenum)
        {
            Item itemBlockMolybdenum = Item.getItemFromBlock(InitBlocks.blockOreMolybdenum);
            ResourceLocation location = new ResourceLocation("extraores:molybdenumOre");
            Register(itemBlockMolybdenum,location.toString());
            itemBlockMolybdenum = Item.getItemFromBlock(InitBlocks.blockMolybdenum);
            location = new ResourceLocation("extraores:molybdenumBlock");
            Register(itemBlockMolybdenum,location.toString());
        }
        if(InitBlocks.registerAluminum)
        {
            Item itemBlockAluminum = Item.getItemFromBlock(InitBlocks.blockOreAluminum);
            ResourceLocation location = new ResourceLocation("extraores:aluminumOre");
            Register(itemBlockAluminum,location.toString());
            itemBlockAluminum = Item.getItemFromBlock(InitBlocks.blockAluminum);
            location = new ResourceLocation("extraores:aluminumBlock");
            Register(itemBlockAluminum,location.toString());
        }
        if(InitBlocks.registerSilver)
        {
            Item itemBlockSilver = Item.getItemFromBlock(InitBlocks.blockOreSilver);
            ResourceLocation location = new ResourceLocation("extraores:silverOre");
            Register(itemBlockSilver,location.toString());
            itemBlockSilver = Item.getItemFromBlock(InitBlocks.blockSilver);
            location = new ResourceLocation("extraores:silverBlock");
            Register(itemBlockSilver,location.toString());
        }
        if(InitBlocks.registerLead)
        {
            Item itemBlockLead = Item.getItemFromBlock(InitBlocks.blockOreLead);
            ResourceLocation location = new ResourceLocation("extraores:leadOre");
            Register(itemBlockLead,location.toString());
            itemBlockLead = Item.getItemFromBlock(InitBlocks.blockLead);
            location = new ResourceLocation("extraores:leadBlock");
            Register(itemBlockLead,location.toString());
        }
        if(InitBlocks.registerPlatinum)
        {
            Item itemBlockPlatinum = Item.getItemFromBlock(InitBlocks.blockOrePlatinum);
            ResourceLocation location = new ResourceLocation("extraores:platinumOre");
            Register(itemBlockPlatinum,location.toString());
            itemBlockPlatinum = Item.getItemFromBlock(InitBlocks.blockPlatinum);
            location = new ResourceLocation("extraores:platinumBlock");
            Register(itemBlockPlatinum,location.toString());
        }
        if(InitBlocks.registerTungsten)
        {
            Item itemBlockTungsten = Item.getItemFromBlock(InitBlocks.blockOreTungsten);
            ResourceLocation location = new ResourceLocation("extraores:tungstenOre");
            Register(itemBlockTungsten,location.toString());
            itemBlockTungsten = Item.getItemFromBlock(InitBlocks.blockTungsten);
            location = new ResourceLocation("extraores:tungstenBlock");
            Register(itemBlockTungsten,location.toString());
        }
        if(InitBlocks.registerVanadium)
        {
            Item itemBlockVanadium = Item.getItemFromBlock(InitBlocks.blockOreVanadium);
            ResourceLocation location = new ResourceLocation("extraores:vanadiumOre");
            Register(itemBlockVanadium,location.toString());
            itemBlockVanadium = Item.getItemFromBlock(InitBlocks.blockVanadium);
            location = new ResourceLocation("extraores:vanadiumBlock");
            Register(itemBlockVanadium,location.toString());
        }
    }
    public static void initItemRender()
    {
        if(InitBlocks.registerCopper)
        {
            ResourceLocation location = new ResourceLocation("extraores:copperIngot");
            Register(InitBlocks.itemIngotCopper,location.toString());
            location = new ResourceLocation("extraores:copperDust");
            Register(InitBlocks.itemDustCopper,location.toString());
        }
        if(InitBlocks.registerTin)
        {
            ResourceLocation location = new ResourceLocation("extraores:tinIngot");
            Register(InitBlocks.itemIngotTin,location.toString());
            location = new ResourceLocation("extraores:tinDust");
            Register(InitBlocks.itemDustTin,location.toString());
        }
        if(InitBlocks.registerChromium)
        {
            ResourceLocation location = new ResourceLocation("extraores:chromiumIngot");
            Register(InitBlocks.itemIngotChromium,location.toString());
            location = new ResourceLocation("extraores:chromiumDust");
            Register(InitBlocks.itemDustChromium,location.toString());
        }
        if(InitBlocks.registerCobalt)
        {
            ResourceLocation location = new ResourceLocation("extraores:cobaltIngot");
            Register(InitBlocks.itemIngotCobalt,location.toString());
            location = new ResourceLocation("extraores:cobaltDust");
            Register(InitBlocks.itemDustCobalt,location.toString());
        }
        if(InitBlocks.registerUnobtainium)
        {
            ResourceLocation location = new ResourceLocation("extraores:unobtainiumIngot");
            Register(InitBlocks.itemIngotUnobtainium,location.toString());
            location = new ResourceLocation("extraores:unobtainiumDust");
            Register(InitBlocks.itemDustUnobtainium,location.toString());
        }
        if(InitBlocks.registerManganese)
        {
            ResourceLocation location = new ResourceLocation("extraores:manganeseIngot");
            Register(InitBlocks.itemIngotManganese,location.toString());
            location = new ResourceLocation("extraores:manganeseDust");
            Register(InitBlocks.itemDustManganese,location.toString());
        }
        if(InitBlocks.registerMolybdenum)
        {
            ResourceLocation location = new ResourceLocation("extraores:molybdenumIngot");
            Register(InitBlocks.itemIngotMolybdenum,location.toString());
            location = new ResourceLocation("extraores:molybdenumDust");
            Register(InitBlocks.itemDustMolybdenum,location.toString());
        }
        if(InitBlocks.registerAluminum)
        {
            ResourceLocation location = new ResourceLocation("extraores:aluminumIngot");
            Register(InitBlocks.itemIngotAluminum,location.toString());
            location = new ResourceLocation("extraores:aluminumDust");
            Register(InitBlocks.itemDustAluminum,location.toString());
        }
        if(InitBlocks.registerSilver)
        {
            ResourceLocation location = new ResourceLocation("extraores:silverIngot");
            Register(InitBlocks.itemIngotSilver,location.toString());
            location = new ResourceLocation("extraores:silverDust");
            Register(InitBlocks.itemDustSilver,location.toString());
        }
        if(InitBlocks.registerLead)
        {
            ResourceLocation location = new ResourceLocation("extraores:leadIngot");
            Register(InitBlocks.itemIngotLead,location.toString());
            location = new ResourceLocation("extraores:leadDust");
            Register(InitBlocks.itemDustLead,location.toString());
        }
        if(InitBlocks.registerPlatinum)
        {
            ResourceLocation location = new ResourceLocation("extraores:platinumIngot");
            Register(InitBlocks.itemIngotPlatinum,location.toString());
            location = new ResourceLocation("extraores:platinumDust");
            Register(InitBlocks.itemDustPlatinum,location.toString());
        }
        if(InitBlocks.registerTungsten)
        {
            ResourceLocation location = new ResourceLocation("extraores:tungstenIngot");
            Register(InitBlocks.itemIngotTungsten,location.toString());
            location = new ResourceLocation("extraores:tungstenDust");
            Register(InitBlocks.itemDustTungsten,location.toString());
        }
        if(InitBlocks.registerVanadium)
        {
            ResourceLocation location = new ResourceLocation("extraores:vanadiumIngot");
            Register(InitBlocks.itemIngotVanadium,location.toString());
            location = new ResourceLocation("extraores:vanadiumDust");
            Register(InitBlocks.itemDustVanadium,location.toString());
        }
    }
    public static void Register(Item item, String resource)
    {
        ModelResourceLocation location = new ModelResourceLocation(resource,"inventory");
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item,0,location);
    }
}

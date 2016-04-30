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
            Item itemBlockOreCopper = Item.getItemFromBlock(InitBlocks.blockOreCopper);
            ResourceLocation location = new ResourceLocation("extraores:copperOre");
            Register(itemBlockOreCopper,location.toString());
        }
        if(InitBlocks.registerTin)
        {
            Item itemBlockOreTin = Item.getItemFromBlock(InitBlocks.blockOreTin);
            ResourceLocation location = new ResourceLocation("extraores:tinOre");
            Register(itemBlockOreTin,location.toString());
        }
        if(InitBlocks.registerChromium)
        {
            Item itemBlockOreChromium = Item.getItemFromBlock(InitBlocks.blockOreChromium);
            ResourceLocation location = new ResourceLocation("extraores:chromiumOre");
            Register(itemBlockOreChromium,location.toString());
        }
        if(InitBlocks.registerCobalt)
        {
            Item itemBlockOreCobalt = Item.getItemFromBlock(InitBlocks.blockOreCobalt);
            ResourceLocation location = new ResourceLocation("extraores:cobaltOre");
            Register(itemBlockOreCobalt,location.toString());
        }
        if(InitBlocks.registerUnobtainium)
        {
            Item itemBlockOreUnobtainium = Item.getItemFromBlock(InitBlocks.blockOreUnobtainium);
            ResourceLocation location = new ResourceLocation("extraores:unobtainiumOre");
            Register(itemBlockOreUnobtainium,location.toString());
        }
        if(InitBlocks.registerManganese)
        {
            Item itemBlockOreManganese = Item.getItemFromBlock(InitBlocks.blockOreManganese);
            ResourceLocation location = new ResourceLocation("extraores:manganeseOre");
            Register(itemBlockOreManganese,location.toString());
        }
        if(InitBlocks.registerMolybdenum)
        {
            Item itemBlockOreMolybdenum = Item.getItemFromBlock(InitBlocks.blockOreMolybdenum);
            ResourceLocation location = new ResourceLocation("extraores:molybdenumOre");
            Register(itemBlockOreMolybdenum,location.toString());
        }
        if(InitBlocks.registerAluminum)
        {
            Item itemBlockOreAluminum = Item.getItemFromBlock(InitBlocks.blockOreAluminum);
            ResourceLocation location = new ResourceLocation("extraores:aluminumOre");
            Register(itemBlockOreAluminum,location.toString());
        }
        if(InitBlocks.registerSilver)
        {
            Item itemBlockOreSilver = Item.getItemFromBlock(InitBlocks.blockOreSilver);
            ResourceLocation location = new ResourceLocation("extraores:silverOre");
            Register(itemBlockOreSilver,location.toString());
        }
        if(InitBlocks.registerLead)
        {
            Item itemBlockOreLead = Item.getItemFromBlock(InitBlocks.blockOreLead);
            ResourceLocation location = new ResourceLocation("extraores:leadOre");
            Register(itemBlockOreLead,location.toString());
        }
        if(InitBlocks.registerPlatinum)
        {
            Item itemBlockOrePlatinum = Item.getItemFromBlock(InitBlocks.blockOrePlatinum);
            ResourceLocation location = new ResourceLocation("extraores:platinumOre");
            Register(itemBlockOrePlatinum,location.toString());
        }
        if(InitBlocks.registerTungsten)
        {
            Item itemBlockOreTungsten = Item.getItemFromBlock(InitBlocks.blockOreTungsten);
            ResourceLocation location = new ResourceLocation("extraores:tungstenOre");
            Register(itemBlockOreTungsten,location.toString());
        }
        if(InitBlocks.registerVanadium)
        {
            Item itemBlockOreVanadium = Item.getItemFromBlock(InitBlocks.blockOreVanadium);
            ResourceLocation location = new ResourceLocation("extraores:vanadiumOre");
            Register(itemBlockOreVanadium,location.toString());
        }
    }
    public static void initItemRender()
    {
        if(InitBlocks.registerCopper)
        {
            ResourceLocation location = new ResourceLocation("extraores:copperIngot");
            Register(InitBlocks.itemIngotCopper,location.toString());
        }
        if(InitBlocks.registerTin)
        {
            ResourceLocation location = new ResourceLocation("extraores:tinIngot");
            Register(InitBlocks.itemIngotTin,location.toString());
        }
        if(InitBlocks.registerChromium)
        {
            ResourceLocation location = new ResourceLocation("extraores:chromiumIngot");
            Register(InitBlocks.itemIngotChromium,location.toString());
        }
        if(InitBlocks.registerCobalt)
        {
            ResourceLocation location = new ResourceLocation("extraores:cobaltIngot");
            Register(InitBlocks.itemIngotCobalt,location.toString());
        }
        if(InitBlocks.registerUnobtainium)
        {
            ResourceLocation location = new ResourceLocation("extraores:unobtainiumIngot");
            Register(InitBlocks.itemIngotUnobtainium,location.toString());
        }
        if(InitBlocks.registerManganese)
        {
            ResourceLocation location = new ResourceLocation("extraores:manganeseIngot");
            Register(InitBlocks.itemIngotManganese,location.toString());
        }
        if(InitBlocks.registerMolybdenum)
        {
            ResourceLocation location = new ResourceLocation("extraores:molybdenumIngot");
            Register(InitBlocks.itemIngotMolybdenum,location.toString());
        }
        if(InitBlocks.registerAluminum)
        {
            ResourceLocation location = new ResourceLocation("extraores:aluminumIngot");
            Register(InitBlocks.itemIngotAluminum,location.toString());
        }
        if(InitBlocks.registerSilver)
        {
            ResourceLocation location = new ResourceLocation("extraores:silverIngot");
            Register(InitBlocks.itemIngotSilver,location.toString());
        }
        if(InitBlocks.registerLead)
        {
            ResourceLocation location = new ResourceLocation("extraores:leadIngot");
            Register(InitBlocks.itemIngotLead,location.toString());
        }
        if(InitBlocks.registerPlatinum)
        {
            ResourceLocation location = new ResourceLocation("extraores:platinumIngot");
            Register(InitBlocks.itemIngotPlatinum,location.toString());
        }
        if(InitBlocks.registerTungsten)
        {
            ResourceLocation location = new ResourceLocation("extraores:tungstenIngot");
            Register(InitBlocks.itemIngotTungsten,location.toString());
        }
        if(InitBlocks.registerVanadium)
        {
            ResourceLocation location = new ResourceLocation("extraores:vanadiumIngot");
            Register(InitBlocks.itemIngotVanadium,location.toString());
        }
    }
    public static void Register(Item item, String resource)
    {
        ModelResourceLocation location = new ModelResourceLocation(resource,"inventory");
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item,0,location);
    }
}

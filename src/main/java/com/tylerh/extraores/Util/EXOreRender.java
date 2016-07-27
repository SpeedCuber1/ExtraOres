package com.tylerh.extraores.Util;

import com.tylerh.extraores.Init.InitBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
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
        if(InitBlocks.registerZinc)
        {
            Item itemBlockZinc = Item.getItemFromBlock(InitBlocks.blockOreZinc);
            ResourceLocation location = new ResourceLocation("extraores:zincOre");
            Register(itemBlockZinc,location.toString());
            itemBlockZinc = Item.getItemFromBlock(InitBlocks.blockZinc);
            location = new ResourceLocation("extraores:zincBlock");
            Register(itemBlockZinc,location.toString());
        }
        if(InitBlocks.registerZirconium)
        {
            Item itemBlockZirconium = Item.getItemFromBlock(InitBlocks.blockOreZirconium);
            ResourceLocation location = new ResourceLocation("extraores:zirconiumOre");
            Register(itemBlockZirconium,location.toString());
            itemBlockZirconium = Item.getItemFromBlock(InitBlocks.blockZirconium);
            location = new ResourceLocation("extraores:zirconiumBlock");
            Register(itemBlockZirconium,location.toString());
        }
        if(InitBlocks.registerNiobium)
        {
            Item itemBlockNiobium = Item.getItemFromBlock(InitBlocks.blockOreNiobium);
            ResourceLocation location = new ResourceLocation("extraores:niobiumOre");
            Register(itemBlockNiobium,location.toString());
            itemBlockNiobium = Item.getItemFromBlock(InitBlocks.blockNiobium);
            location = new ResourceLocation("extraores:niobiumBlock");
            Register(itemBlockNiobium,location.toString());
        }
        if(InitBlocks.registerTechnetium)
        {
            Item itemBlockTechnetium = Item.getItemFromBlock(InitBlocks.blockOreTechnetium);
            ResourceLocation location = new ResourceLocation("extraores:technetiumOre");
            Register(itemBlockTechnetium,location.toString());
            itemBlockTechnetium = Item.getItemFromBlock(InitBlocks.blockTechnetium);
            location = new ResourceLocation("extraores:technetiumBlock");
            Register(itemBlockTechnetium,location.toString());
        }
        if(InitBlocks.registerRuthenium)
        {
            Item itemBlockRuthenium = Item.getItemFromBlock(InitBlocks.blockOreRuthenium);
            ResourceLocation location = new ResourceLocation("extraores:rutheniumOre");
            Register(itemBlockRuthenium,location.toString());
            itemBlockRuthenium = Item.getItemFromBlock(InitBlocks.blockRuthenium);
            location = new ResourceLocation("extraores:rutheniumBlock");
            Register(itemBlockRuthenium,location.toString());
        }
        if(InitBlocks.registerRhodium)
        {
            Item itemBlockRhodium = Item.getItemFromBlock(InitBlocks.blockOreRhodium);
            ResourceLocation location = new ResourceLocation("extraores:rhodiumOre");
            Register(itemBlockRhodium,location.toString());
            itemBlockRhodium = Item.getItemFromBlock(InitBlocks.blockRhodium);
            location = new ResourceLocation("extraores:rhodiumBlock");
            Register(itemBlockRhodium,location.toString());
        }
        if(InitBlocks.registerPalladium)
        {
            Item itemBlockPalladium = Item.getItemFromBlock(InitBlocks.blockOrePalladium);
            ResourceLocation location = new ResourceLocation("extraores:palladiumOre");
            Register(itemBlockPalladium,location.toString());
            itemBlockPalladium = Item.getItemFromBlock(InitBlocks.blockPalladium);
            location = new ResourceLocation("extraores:palladiumBlock");
            Register(itemBlockPalladium,location.toString());
        }
        if(InitBlocks.registerCadmium)
        {
            Item itemBlockCadmium = Item.getItemFromBlock(InitBlocks.blockOreCadmium);
            ResourceLocation location = new ResourceLocation("extraores:cadmiumOre");
            Register(itemBlockCadmium,location.toString());
            itemBlockCadmium = Item.getItemFromBlock(InitBlocks.blockCadmium);
            location = new ResourceLocation("extraores:cadmiumBlock");
            Register(itemBlockCadmium,location.toString());
        }
        if(InitBlocks.registerNeodymium)
        {
            Item itemBlockNeodymium = Item.getItemFromBlock(InitBlocks.blockOreNeodymium);
            ResourceLocation location = new ResourceLocation("extraores:neodymiumOre");
            Register(itemBlockNeodymium,location.toString());
            itemBlockNeodymium = Item.getItemFromBlock(InitBlocks.blockNeodymium);
            location = new ResourceLocation("extraores:neodymiumBlock");
            Register(itemBlockNeodymium,location.toString());
        }
        if(InitBlocks.registerBismuth)
        {
            Item itemBlockBismuth = Item.getItemFromBlock(InitBlocks.blockOreBismuth);
            ResourceLocation location = new ResourceLocation("extraores:bismuthOre");
            Register(itemBlockBismuth,location.toString());
            itemBlockBismuth = Item.getItemFromBlock(InitBlocks.blockBismuth);
            location = new ResourceLocation("extraores:bismuthBlock");
            Register(itemBlockBismuth,location.toString());
        }
        if(InitBlocks.registerGallium)
        {
            Item itemBlockGallium = Item.getItemFromBlock(InitBlocks.blockOreGallium);
            ResourceLocation location = new ResourceLocation("extraores:galliumOre");
            Register(itemBlockGallium,location.toString());
            itemBlockGallium = Item.getItemFromBlock(InitBlocks.blockGallium);
            location = new ResourceLocation("extraores:galliumBlock");
            Register(itemBlockGallium,location.toString());
        }
        if(InitBlocks.registerIndium)
        {
            Item itemBlockIndium = Item.getItemFromBlock(InitBlocks.blockOreIndium);
            ResourceLocation location = new ResourceLocation("extraores:indiumOre");
            Register(itemBlockIndium,location.toString());
            itemBlockIndium = Item.getItemFromBlock(InitBlocks.blockIndium);
            location = new ResourceLocation("extraores:indiumBlock");
            Register(itemBlockIndium,location.toString());
        }
        if(InitBlocks.registerThallium)
        {
            Item itemBlockThallium = Item.getItemFromBlock(InitBlocks.blockOreThallium);
            ResourceLocation location = new ResourceLocation("extraores:thalliumOre");
            Register(itemBlockThallium,location.toString());
            itemBlockThallium = Item.getItemFromBlock(InitBlocks.blockThallium);
            location = new ResourceLocation("extraores:thalliumBlock");
            Register(itemBlockThallium,location.toString());
        }
        if(InitBlocks.registerTitanium)
        {
            Item itemBlockTitanium = Item.getItemFromBlock(InitBlocks.blockOreTitanium);
            ResourceLocation location = new ResourceLocation("extraores:titaniumOre");
            Register(itemBlockTitanium,location.toString());
            itemBlockTitanium = Item.getItemFromBlock(InitBlocks.blockTitanium);
            location = new ResourceLocation("extraores:titaniumBlock");
            Register(itemBlockTitanium,location.toString());
        }
        if(InitBlocks.registerNickel)
        {
            Item itemBlockNickel = Item.getItemFromBlock(InitBlocks.blockOreNickel);
            ResourceLocation location = new ResourceLocation("extraores:nickelOre");
            Register(itemBlockNickel,location.toString());
            itemBlockNickel = Item.getItemFromBlock(InitBlocks.blockNickel);
            location = new ResourceLocation("extraores:nickelBlock");
            Register(itemBlockNickel,location.toString());
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
        if(InitBlocks.registerZinc)
        {
            ResourceLocation location = new ResourceLocation("extraores:zincIngot");
            Register(InitBlocks.itemIngotZinc,location.toString());
            location = new ResourceLocation("extraores:zincDust");
            Register(InitBlocks.itemDustZinc,location.toString());
        }
        if(InitBlocks.registerZirconium)
        {
            ResourceLocation location = new ResourceLocation("extraores:zirconiumIngot");
            Register(InitBlocks.itemIngotZirconium,location.toString());
            location = new ResourceLocation("extraores:zirconiumDust");
            Register(InitBlocks.itemDustZirconium,location.toString());
        }
        if(InitBlocks.registerNiobium)
        {
            ResourceLocation location = new ResourceLocation("extraores:niobiumIngot");
            Register(InitBlocks.itemIngotNiobium,location.toString());
            location = new ResourceLocation("extraores:niobiumDust");
            Register(InitBlocks.itemDustNiobium,location.toString());
        }
        if(InitBlocks.registerTechnetium)
        {
            ResourceLocation location = new ResourceLocation("extraores:technetiumIngot");
            Register(InitBlocks.itemIngotTechnetium,location.toString());
            location = new ResourceLocation("extraores:technetiumDust");
            Register(InitBlocks.itemDustTechnetium,location.toString());
        }
        if(InitBlocks.registerRuthenium)
        {
            ResourceLocation location = new ResourceLocation("extraores:rutheniumIngot");
            Register(InitBlocks.itemIngotRuthenium,location.toString());
            location = new ResourceLocation("extraores:rutheniumDust");
            Register(InitBlocks.itemDustRuthenium,location.toString());
        }
        if(InitBlocks.registerRhodium)
        {
            ResourceLocation location = new ResourceLocation("extraores:rhodiumIngot");
            Register(InitBlocks.itemIngotRhodium,location.toString());
            location = new ResourceLocation("extraores:rhodiumDust");
            Register(InitBlocks.itemDustRhodium,location.toString());
        }
        if(InitBlocks.registerPalladium)
        {
            ResourceLocation location = new ResourceLocation("extraores:palladiumIngot");
            Register(InitBlocks.itemIngotPalladium,location.toString());
            location = new ResourceLocation("extraores:palladiumDust");
            Register(InitBlocks.itemDustPalladium,location.toString());
        }
        if(InitBlocks.registerCadmium)
        {
            ResourceLocation location = new ResourceLocation("extraores:cadmiumIngot");
            Register(InitBlocks.itemIngotCadmium,location.toString());
            location = new ResourceLocation("extraores:cadmiumDust");
            Register(InitBlocks.itemDustCadmium,location.toString());
        }
        if(InitBlocks.registerNeodymium)
        {
            ResourceLocation location = new ResourceLocation("extraores:neodymiumIngot");
            Register(InitBlocks.itemIngotNeodymium,location.toString());
            location = new ResourceLocation("extraores:neodymiumDust");
            Register(InitBlocks.itemDustNeodymium,location.toString());
        }
        if(InitBlocks.registerBismuth)
        {
            ResourceLocation location = new ResourceLocation("extraores:bismuthIngot");
            Register(InitBlocks.itemIngotBismuth,location.toString());
            location = new ResourceLocation("extraores:bismuthDust");
            Register(InitBlocks.itemDustBismuth,location.toString());
        }
        if(InitBlocks.registerGallium)
        {
            ResourceLocation location = new ResourceLocation("extraores:galliumIngot");
            Register(InitBlocks.itemIngotGallium,location.toString());
            location = new ResourceLocation("extraores:galliumDust");
            Register(InitBlocks.itemDustGallium,location.toString());
        }
        if(InitBlocks.registerIndium)
        {
            ResourceLocation location = new ResourceLocation("extraores:indiumIngot");
            Register(InitBlocks.itemIngotIndium,location.toString());
            location = new ResourceLocation("extraores:indiumDust");
            Register(InitBlocks.itemDustIndium,location.toString());
        }
        if(InitBlocks.registerThallium)
        {
            ResourceLocation location = new ResourceLocation("extraores:thalliumIngot");
            Register(InitBlocks.itemIngotThallium,location.toString());
            location = new ResourceLocation("extraores:thalliumDust");
            Register(InitBlocks.itemDustThallium,location.toString());
        }
        if(InitBlocks.registerTitanium)
        {
            ResourceLocation location = new ResourceLocation("extraores:titaniumIngot");
            Register(InitBlocks.itemIngotTitanium,location.toString());
            location = new ResourceLocation("extraores:titaniumDust");
            Register(InitBlocks.itemDustTitanium,location.toString());
        }
        if(InitBlocks.registerNickel)
        {
            ResourceLocation location = new ResourceLocation("extraores:nickelIngot");
            Register(InitBlocks.itemIngotNickel,location.toString());
            location = new ResourceLocation("extraores:nickelDust");
            Register(InitBlocks.itemDustNickel,location.toString());
        }
    }
    public static void Register(Item item, String resource)
    {
        ModelResourceLocation location = new ModelResourceLocation(resource,"inventory");
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item,0,location);
    }
}

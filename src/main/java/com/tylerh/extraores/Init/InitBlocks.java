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
import org.lwjgl.system.CallbackI;

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
        if(ConfigRegistryList.registerAtlarus.get())
        {
            BlockList.blockOreAtlarus = new BlockEXOre(Material.ROCK,3.0f,5.0f,"atlarusore");
            BlockList.blockAtlarus = new BlockEXOre(Material.IRON,3.0f,5.0f,"atlarusblock");
            blockRegistry(BlockList.blockOreAtlarus,event);
            blockRegistry(BlockList.blockAtlarus,event);
        }
        if(ConfigRegistryList.registerBismuth.get())
        {
            BlockList.blockOreBismuth = new BlockEXOre(Material.ROCK,3.0f,5.0f,"bismuthore");
            BlockList.blockBismuth = new BlockEXOre(Material.IRON,3.0f,5.0f,"bismuthblock");
            blockRegistry(BlockList.blockOreBismuth,event);
            blockRegistry(BlockList.blockBismuth,event);
        }
        if(ConfigRegistryList.registerBlackSteel.get())
        {
            BlockList.blockOreBlackSteel = new BlockEXOre(Material.ROCK,3.0f,5.0f,"blacksteelore");
            BlockList.blockBlackSteel = new BlockEXOre(Material.IRON,3.0f,5.0f,"blacksteelblock");
            blockRegistry(BlockList.blockOreBlackSteel,event);
            blockRegistry(BlockList.blockBlackSteel,event);
        }
        if(ConfigRegistryList.registerCadmium.get())
        {
            BlockList.blockOreCadmium = new BlockEXOre(Material.ROCK,3.0f,5.0f,"cadmiumore");
            BlockList.blockCadmium = new BlockEXOre(Material.IRON,3.0f,5.0f,"cadmiumblock");
            blockRegistry(BlockList.blockOreCadmium,event);
            blockRegistry(BlockList.blockCadmium,event);
        }
        if(ConfigRegistryList.registerCarmot.get())
        {
            BlockList.blockOreCarmot = new BlockEXOre(Material.ROCK,3.0f,5.0f,"carmotore");
            BlockList.blockCarmot = new BlockEXOre(Material.IRON,3.0f,5.0f,"carmotblock");
            blockRegistry(BlockList.blockOreCarmot,event);
            blockRegistry(BlockList.blockCarmot,event);
        }
        if(ConfigRegistryList.registerCelenegil.get())
        {
            BlockList.blockOreCelenegil = new BlockEXOre(Material.ROCK,3.0f,5.0f,"celenegilore");
            BlockList.blockCelenegil = new BlockEXOre(Material.IRON,3.0f,5.0f,"celenegilblock");
            blockRegistry(BlockList.blockOreCelenegil,event);
            blockRegistry(BlockList.blockCelenegil,event);
        }
        if(ConfigRegistryList.registerCeruclase.get())
        {
            BlockList.blockOreCeruclase = new BlockEXOre(Material.ROCK,3.0f,5.0f,"ceruclaseore");
            BlockList.blockCeruclase = new BlockEXOre(Material.IRON,3.0f,5.0f,"ceruclaseblock");
            blockRegistry(BlockList.blockOreCeruclase,event);
            blockRegistry(BlockList.blockCeruclase,event);
        }
        if(ConfigRegistryList.registerChromium.get())
        {
            BlockList.blockOreChromium = new BlockEXOre(Material.ROCK,3.0f,5.0f,"chromiumore");
            BlockList.blockChromium = new BlockEXOre(Material.IRON,3.0f,5.0f,"chromiumblock");
            blockRegistry(BlockList.blockOreChromium,event);
            blockRegistry(BlockList.blockChromium,event);
        }
        if(ConfigRegistryList.registerCobalt.get())
        {
            BlockList.blockOreCobalt = new BlockEXOre(Material.ROCK,3.0f,5.0f,"cobaltore");
            BlockList.blockCobalt = new BlockEXOre(Material.IRON,3.0f,5.0f,"cobaltblock");
            blockRegistry(BlockList.blockOreCobalt,event);
            blockRegistry(BlockList.blockCobalt,event);
        }
        if(ConfigRegistryList.registerCopper.get())
        {
            BlockList.blockOreCopper = new BlockEXOre(Material.ROCK,3.0f,5.0f,"copperore");
            BlockList.blockCopper = new BlockEXOre(Material.IRON,3.0f,5.0f,"copperblock");
            blockRegistry(BlockList.blockOreCopper,event);
            blockRegistry(BlockList.blockCopper,event);
        }
        if(ConfigRegistryList.registerDeepIron.get())
        {
            BlockList.blockOreDeepIron = new BlockEXOre(Material.ROCK,3.0f,5.0f,"deepironore");
            BlockList.blockDeepIron = new BlockEXOre(Material.IRON,3.0f,5.0f,"deepironblock");
            blockRegistry(BlockList.blockOreDeepIron,event);
            blockRegistry(BlockList.blockDeepIron,event);
        }
        if(ConfigRegistryList.registerGallium.get())
        {
            BlockList.blockOreGallium = new BlockEXOre(Material.ROCK,3.0f,5.0f,"galliumore");
            BlockList.blockGallium = new BlockEXOre(Material.IRON,3.0f,5.0f,"galliumblock");
            blockRegistry(BlockList.blockOreGallium,event);
            blockRegistry(BlockList.blockGallium,event);
        }
        if(ConfigRegistryList.registerHaderoth.get())
        {
            BlockList.blockOreHaderoth = new BlockEXOre(Material.ROCK,3.0f,5.0f,"haderothore");
            BlockList.blockHaderoth = new BlockEXOre(Material.IRON,3.0f,5.0f,"haderothblock");
            blockRegistry(BlockList.blockOreHaderoth,event);
            blockRegistry(BlockList.blockHaderoth,event);
        }
        if(ConfigRegistryList.registerHepatizon.get())
        {
            BlockList.blockOreHepatizon = new BlockEXOre(Material.ROCK,3.0f,5.0f,"hepatizonore");
            BlockList.blockHepatizon = new BlockEXOre(Material.IRON,3.0f,5.0f,"hepatizonblock");
            blockRegistry(BlockList.blockOreHepatizon,event);
            blockRegistry(BlockList.blockHepatizon,event);
        }
        if(ConfigRegistryList.registerIgnatius.get())
        {
            BlockList.blockOreIgnatius = new BlockEXOre(Material.ROCK,3.0f,5.0f,"ignatiusore");
            BlockList.blockIgnatius = new BlockEXOre(Material.IRON,3.0f,5.0f,"ignatiusblock");
            blockRegistry(BlockList.blockOreIgnatius,event);
            blockRegistry(BlockList.blockIgnatius,event);
        }
        if(ConfigRegistryList.registerIndium.get())
        {
            BlockList.blockOreIndium = new BlockEXOre(Material.ROCK,3.0f,5.0f,"indiumore");
            BlockList.blockIndium = new BlockEXOre(Material.IRON,3.0f,5.0f,"indiumblock");
            blockRegistry(BlockList.blockOreIndium,event);
            blockRegistry(BlockList.blockIndium,event);
        }
        if(ConfigRegistryList.registerInfuscolium.get())
        {
            BlockList.blockOreInfuscolium = new BlockEXOre(Material.ROCK,3.0f,5.0f,"infuscoliumore");
            BlockList.blockInfuscolium = new BlockEXOre(Material.IRON,3.0f,5.0f,"infuscoliumblock");
            blockRegistry(BlockList.blockOreInfuscolium,event);
            blockRegistry(BlockList.blockInfuscolium,event);
        }
        if(ConfigRegistryList.registerInolashite.get())
        {
            BlockList.blockOreInolashite = new BlockEXOre(Material.ROCK,3.0f,5.0f,"inolashiteore");
            BlockList.blockInolashite = new BlockEXOre(Material.IRON,3.0f,5.0f,"inolashiteblock");
            blockRegistry(BlockList.blockOreInolashite,event);
            blockRegistry(BlockList.blockInolashite,event);
        }
        if(ConfigRegistryList.registerKalendrite.get())
        {
            BlockList.blockOreKalendrite = new BlockEXOre(Material.ROCK,3.0f,5.0f,"kalendriteore");
            BlockList.blockKalendrite = new BlockEXOre(Material.IRON,3.0f,5.0f,"kalendriteblock");
            blockRegistry(BlockList.blockOreKalendrite,event);
            blockRegistry(BlockList.blockKalendrite,event);
        }
        if(ConfigRegistryList.registerLead.get())
        {
            BlockList.blockOreLead = new BlockEXOre(Material.ROCK,3.0f,5.0f,"leadore");
            BlockList.blockLead = new BlockEXOre(Material.IRON,3.0f,5.0f,"leadblock");
            blockRegistry(BlockList.blockOreLead,event);
            blockRegistry(BlockList.blockLead,event);
        }
        if(ConfigRegistryList.registerLemurite.get())
        {
            BlockList.blockOreLemurite = new BlockEXOre(Material.ROCK,3.0f,5.0f,"lemuriteore");
            BlockList.blockLemurite = new BlockEXOre(Material.IRON,3.0f,5.0f,"lemuriteblock");
            blockRegistry(BlockList.blockOreLemurite,event);
            blockRegistry(BlockList.blockLemurite,event);
        }
        if(ConfigRegistryList.registerManganese.get())
        {
            BlockList.blockOreManganese = new BlockEXOre(Material.ROCK,3.0f,5.0f,"manganeseore");
            BlockList.blockManganese = new BlockEXOre(Material.IRON,3.0f,5.0f,"manganeseblock");
            blockRegistry(BlockList.blockOreManganese,event);
            blockRegistry(BlockList.blockManganese,event);
        }
        if(ConfigRegistryList.registerMidasium.get())
        {
            BlockList.blockOreMidasium = new BlockEXOre(Material.ROCK,3.0f,5.0f,"midasiumore");
            BlockList.blockMidasium = new BlockEXOre(Material.IRON,3.0f,5.0f,"midasiumblock");
            blockRegistry(BlockList.blockOreMidasium,event);
            blockRegistry(BlockList.blockMidasium,event);
        }
        if(ConfigRegistryList.registerMithril.get())
        {
            BlockList.blockOreMithril = new BlockEXOre(Material.ROCK,3.0f,5.0f,"mithrilore");
            BlockList.blockMithril = new BlockEXOre(Material.IRON,3.0f,5.0f,"mithrilblock");
            blockRegistry(BlockList.blockOreMithril,event);
            blockRegistry(BlockList.blockMithril,event);
        }
        if(ConfigRegistryList.registerMolybdenum.get())
        {
            BlockList.blockOreMolybdenum = new BlockEXOre(Material.ROCK,3.0f,5.0f,"molybdenumore");
            BlockList.blockMolybdenum = new BlockEXOre(Material.IRON,3.0f,5.0f,"molybdenumblock");
            blockRegistry(BlockList.blockOreMolybdenum,event);
            blockRegistry(BlockList.blockMolybdenum,event);
        }
        if(ConfigRegistryList.registerNeodymium.get())
        {
            BlockList.blockOreNeodymium = new BlockEXOre(Material.ROCK,3.0f,5.0f,"neodymiumore");
            BlockList.blockNeodymium = new BlockEXOre(Material.IRON,3.0f,5.0f,"neodymiumblock");
            blockRegistry(BlockList.blockOreNeodymium,event);
            blockRegistry(BlockList.blockNeodymium,event);
        }
        if(ConfigRegistryList.registerNickel.get())
        {
            BlockList.blockOreNickel = new BlockEXOre(Material.ROCK,3.0f,5.0f,"nickelore");
            BlockList.blockNickel = new BlockEXOre(Material.IRON,3.0f,5.0f,"nickelblock");
            blockRegistry(BlockList.blockOreNickel,event);
            blockRegistry(BlockList.blockNickel,event);
        }
        if(ConfigRegistryList.registerNiobium.get())
        {
            BlockList.blockOreNiobium = new BlockEXOre(Material.ROCK,3.0f,5.0f,"niobiumore");
            BlockList.blockNiobium = new BlockEXOre(Material.IRON,3.0f,5.0f,"niobiumblock");
            blockRegistry(BlockList.blockOreNiobium,event);
            blockRegistry(BlockList.blockNiobium,event);
        }
        if(ConfigRegistryList.registerOrichalcum.get())
        {
            BlockList.blockOreOrichalcum = new BlockEXOre(Material.ROCK,3.0f,5.0f,"orichalcumore");
            BlockList.blockOrichalcum = new BlockEXOre(Material.IRON,3.0f,5.0f,"orichalcumblock");
            blockRegistry(BlockList.blockOreOrichalcum,event);
            blockRegistry(BlockList.blockOrichalcum,event);
        }
        if(ConfigRegistryList.registerOureclase.get())
        {
            BlockList.blockOreOureclase = new BlockEXOre(Material.ROCK,3.0f,5.0f,"oureclaseore");
            BlockList.blockOureclase = new BlockEXOre(Material.IRON,3.0f,5.0f,"oureclaseblock");
            blockRegistry(BlockList.blockOreOureclase,event);
            blockRegistry(BlockList.blockOureclase,event);
        }
        if(ConfigRegistryList.registerPalladium.get())
        {
            BlockList.blockOrePalladium = new BlockEXOre(Material.ROCK,3.0f,5.0f,"palladiumore");
            BlockList.blockPalladium = new BlockEXOre(Material.IRON,3.0f,5.0f,"palladiumblock");
            blockRegistry(BlockList.blockOrePalladium,event);
            blockRegistry(BlockList.blockPalladium,event);
        }
        if(ConfigRegistryList.registerPlatinum.get())
        {
            BlockList.blockOrePlatinum = new BlockEXOre(Material.ROCK,3.0f,5.0f,"platinumore");
            BlockList.blockPlatinum = new BlockEXOre(Material.IRON,3.0f,5.0f,"platinumblock");
            blockRegistry(BlockList.blockOrePlatinum,event);
            blockRegistry(BlockList.blockPlatinum,event);
        }
        if(ConfigRegistryList.registerPrometheum.get())
        {
            BlockList.blockOrePrometheum = new BlockEXOre(Material.ROCK,3.0f,5.0f,"prometheumore");
            BlockList.blockPrometheum = new BlockEXOre(Material.IRON,3.0f,5.0f,"prometheumblock");
            blockRegistry(BlockList.blockOrePrometheum,event);
            blockRegistry(BlockList.blockPrometheum,event);
        }
        if(ConfigRegistryList.registerRhodium.get())
        {
            BlockList.blockOreRhodium = new BlockEXOre(Material.ROCK,3.0f,5.0f,"rhodiumore");
            BlockList.blockRhodium = new BlockEXOre(Material.IRON,3.0f,5.0f,"rhodiumblock");
            blockRegistry(BlockList.blockOreRhodium,event);
            blockRegistry(BlockList.blockRhodium,event);
        }
        if(ConfigRegistryList.registerRubracium.get())
        {
            BlockList.blockOreRubracium = new BlockEXOre(Material.ROCK,3.0f,5.0f,"rubraciumore");
            BlockList.blockRubracium = new BlockEXOre(Material.IRON,3.0f,5.0f,"rubraciumblock");
            blockRegistry(BlockList.blockOreRubracium,event);
            blockRegistry(BlockList.blockRubracium,event);
        }
        if(ConfigRegistryList.registerRuthenium.get())
        {
            BlockList.blockOreRuthenium = new BlockEXOre(Material.ROCK,3.0f,5.0f,"rutheniumore");
            BlockList.blockRuthenium = new BlockEXOre(Material.IRON,3.0f,5.0f,"rutheniumblock");
            blockRegistry(BlockList.blockOreRuthenium,event);
            blockRegistry(BlockList.blockRuthenium,event);
        }
        if(ConfigRegistryList.registerSanguinite.get())
        {
            BlockList.blockOreSanguinite = new BlockEXOre(Material.ROCK,3.0f,5.0f,"sanguiniteore");
            BlockList.blockSanguinite = new BlockEXOre(Material.IRON,3.0f,5.0f,"sanguiniteblock");
            blockRegistry(BlockList.blockOreSanguinite,event);
            blockRegistry(BlockList.blockSanguinite,event);
        }
        if(ConfigRegistryList.registerShadowIron.get())
        {
            BlockList.blockOreShadowIron = new BlockEXOre(Material.ROCK,3.0f,5.0f,"shadowironore");
            BlockList.blockShadowIron = new BlockEXOre(Material.IRON,3.0f,5.0f,"shadowironblock");
            blockRegistry(BlockList.blockOreShadowIron,event);
            blockRegistry(BlockList.blockShadowIron,event);
        }
        if(ConfigRegistryList.registerSilver.get())
        {
            BlockList.blockOreSilver = new BlockEXOre(Material.ROCK,3.0f,5.0f,"silverore");
            BlockList.blockSilver = new BlockEXOre(Material.IRON,3.0f,5.0f,"silverblock");
            blockRegistry(BlockList.blockOreSilver,event);
            blockRegistry(BlockList.blockSilver,event);
        }
        if(ConfigRegistryList.registerTechnetium.get())
        {
            BlockList.blockOreTechnetium = new BlockEXOre(Material.ROCK,3.0f,5.0f,"technetiumore");
            BlockList.blockTechnetium = new BlockEXOre(Material.IRON,3.0f,5.0f,"technetiumblock");
            blockRegistry(BlockList.blockOreTechnetium,event);
            blockRegistry(BlockList.blockTechnetium,event);
        }
        if(ConfigRegistryList.registerTin.get())
        {
            BlockList.blockOreTin = new BlockEXOre(Material.ROCK,3.0f,5.0f,"tinore");
            BlockList.blockTin = new BlockEXOre(Material.IRON,3.0f,5.0f,"tinblock");
            blockRegistry(BlockList.blockOreTin,event);
            blockRegistry(BlockList.blockTin,event);
        }
        if(ConfigRegistryList.registerTitanium.get())
        {
            BlockList.blockOreTitanium = new BlockEXOre(Material.ROCK,3.0f,5.0f,"titaniumore");
            BlockList.blockTitanium = new BlockEXOre(Material.IRON,3.0f,5.0f,"titaniumblock");
            blockRegistry(BlockList.blockOreTitanium,event);
            blockRegistry(BlockList.blockTitanium,event);
        }
        if(ConfigRegistryList.registerTungsten.get())
        {
            BlockList.blockOreTungsten = new BlockEXOre(Material.ROCK,3.0f,5.0f,"tungstenore");
            BlockList.blockTungsten = new BlockEXOre(Material.IRON,3.0f,5.0f,"tungstenblock");
            blockRegistry(BlockList.blockOreTungsten,event);
            blockRegistry(BlockList.blockTungsten,event);
        }
        if(ConfigRegistryList.registerUnobtainium.get())
        {
            BlockList.blockOreUnobtainium = new BlockEXOre(Material.ROCK,3.0f,5.0f,"unobtainiumore");
            BlockList.blockUnobtainium = new BlockEXOre(Material.IRON,3.0f,5.0f,"unobtainiumblock");
            blockRegistry(BlockList.blockOreUnobtainium,event);
            blockRegistry(BlockList.blockUnobtainium,event);
        }
        if(ConfigRegistryList.registerVanadium.get())
        {
            BlockList.blockOreVanadium = new BlockEXOre(Material.ROCK,3.0f,5.0f,"vanadiumore");
            BlockList.blockVanadium = new BlockEXOre(Material.IRON,3.0f,5.0f,"vanadiumblock");
            blockRegistry(BlockList.blockOreVanadium,event);
            blockRegistry(BlockList.blockVanadium,event);
        }
        if(ConfigRegistryList.registerVulcanite.get())
        {
            BlockList.blockOreVulcanite = new BlockEXOre(Material.ROCK,3.0f,5.0f,"vulcaniteore");
            BlockList.blockVulcanite = new BlockEXOre(Material.IRON,3.0f,5.0f,"vulcaniteblock");
            blockRegistry(BlockList.blockOreVulcanite,event);
            blockRegistry(BlockList.blockVulcanite,event);
        }
        if(ConfigRegistryList.registerVyroxeres.get())
        {
            BlockList.blockOreVyroxeres = new BlockEXOre(Material.ROCK,3.0f,5.0f,"vyroxeresore");
            BlockList.blockVyroxeres = new BlockEXOre(Material.IRON,3.0f,5.0f,"vyroxeresblock");
            blockRegistry(BlockList.blockOreVyroxeres,event);
            blockRegistry(BlockList.blockVyroxeres,event);
        }
        if(ConfigRegistryList.registerZinc.get())
        {
            BlockList.blockOreZinc = new BlockEXOre(Material.ROCK,3.0f,5.0f,"zincore");
            BlockList.blockZinc = new BlockEXOre(Material.IRON,3.0f,5.0f,"zincblock");
            blockRegistry(BlockList.blockOreZinc,event);
            blockRegistry(BlockList.blockZinc,event);
        }
        if(ConfigRegistryList.registerZirconium.get())
        {
            BlockList.blockOreZirconium = new BlockEXOre(Material.ROCK,3.0f,5.0f,"zirconiumore");
            BlockList.blockZirconium = new BlockEXOre(Material.IRON,3.0f,5.0f,"zirconiumblock");
            blockRegistry(BlockList.blockOreZirconium,event);
            blockRegistry(BlockList.blockZirconium,event);
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
        if(ConfigRegistryList.registerAtlarus.get())
        {
            ItemList.itemIngotAtlarus = new ItemEXOre(EXORES,"atlarusingot");
            ItemList.itemDustAtlarus = new ItemEXOre(EXORES,"atlarusdust");
            ItemBlockList.itemBlockOreAtlarus = new ItemBlockExOre(BlockList.blockOreAtlarus,EXORES);
            ItemBlockList.itemBlockAtlarus = new ItemBlockExOre(BlockList.blockAtlarus,EXORES);
            itemRegistry(ItemList.itemIngotAtlarus,event);
            itemRegistry(ItemList.itemDustAtlarus,event);
            itemRegistry(ItemBlockList.itemBlockOreAtlarus,event);
            itemRegistry(ItemBlockList.itemBlockAtlarus,event);
        }
        if(ConfigRegistryList.registerBismuth.get())
        {
            ItemList.itemIngotBismuth = new ItemEXOre(EXORES,"bismuthingot");
            ItemList.itemDustBismuth = new ItemEXOre(EXORES,"bismuthdust");
            ItemBlockList.itemBlockOreBismuth = new ItemBlockExOre(BlockList.blockOreBismuth,EXORES);
            ItemBlockList.itemBlockBismuth = new ItemBlockExOre(BlockList.blockBismuth,EXORES);
            itemRegistry(ItemList.itemIngotBismuth,event);
            itemRegistry(ItemList.itemDustBismuth,event);
            itemRegistry(ItemBlockList.itemBlockOreBismuth,event);
            itemRegistry(ItemBlockList.itemBlockBismuth,event);
        }
        if(ConfigRegistryList.registerBlackSteel.get())
        {
            ItemList.itemIngotBlackSteel = new ItemEXOre(EXORES,"blacksteelingot");
            ItemList.itemDustBlackSteel = new ItemEXOre(EXORES,"blacksteeldust");
            ItemBlockList.itemBlockOreBlackSteel = new ItemBlockExOre(BlockList.blockOreBlackSteel,EXORES);
            ItemBlockList.itemBlockBlackSteel = new ItemBlockExOre(BlockList.blockBlackSteel,EXORES);
            itemRegistry(ItemList.itemIngotBlackSteel,event);
            itemRegistry(ItemList.itemDustBlackSteel,event);
            itemRegistry(ItemBlockList.itemBlockOreBlackSteel,event);
            itemRegistry(ItemBlockList.itemBlockBlackSteel,event);
        }
        if(ConfigRegistryList.registerCadmium.get())
        {
            ItemList.itemIngotCadmium = new ItemEXOre(EXORES,"cadmiumingot");
            ItemList.itemDustCadmium = new ItemEXOre(EXORES,"cadmiumdust");
            ItemBlockList.itemBlockOreCadmium = new ItemBlockExOre(BlockList.blockOreCadmium,EXORES);
            ItemBlockList.itemBlockCadmium = new ItemBlockExOre(BlockList.blockCadmium,EXORES);
            itemRegistry(ItemList.itemIngotCadmium,event);
            itemRegistry(ItemList.itemDustCadmium,event);
            itemRegistry(ItemBlockList.itemBlockOreCadmium,event);
            itemRegistry(ItemBlockList.itemBlockCadmium,event);
        }
        if(ConfigRegistryList.registerCarmot.get())
        {
            ItemList.itemIngotCarmot = new ItemEXOre(EXORES,"carmotingot");
            ItemList.itemDustCarmot = new ItemEXOre(EXORES,"carmotdust");
            ItemBlockList.itemBlockOreCarmot = new ItemBlockExOre(BlockList.blockOreCarmot,EXORES);
            ItemBlockList.itemBlockCarmot = new ItemBlockExOre(BlockList.blockCarmot,EXORES);
            itemRegistry(ItemList.itemIngotCarmot,event);
            itemRegistry(ItemList.itemDustCarmot,event);
            itemRegistry(ItemBlockList.itemBlockOreCarmot,event);
            itemRegistry(ItemBlockList.itemBlockCarmot,event);
        }
        if(ConfigRegistryList.registerCelenegil.get())
        {
            ItemList.itemIngotCelenegil = new ItemEXOre(EXORES,"celenegilingot");
            ItemList.itemDustCelenegil = new ItemEXOre(EXORES,"celenegildust");
            ItemBlockList.itemBlockOreCelenegil = new ItemBlockExOre(BlockList.blockOreCelenegil,EXORES);
            ItemBlockList.itemBlockCelenegil = new ItemBlockExOre(BlockList.blockCelenegil,EXORES);
            itemRegistry(ItemList.itemIngotCelenegil,event);
            itemRegistry(ItemList.itemDustCelenegil,event);
            itemRegistry(ItemBlockList.itemBlockOreCelenegil,event);
            itemRegistry(ItemBlockList.itemBlockCelenegil,event);
        }
        if(ConfigRegistryList.registerCeruclase.get())
        {
            ItemList.itemIngotCeruclase = new ItemEXOre(EXORES,"ceruclaseingot");
            ItemList.itemDustCeruclase = new ItemEXOre(EXORES,"ceruclasedust");
            ItemBlockList.itemBlockOreCeruclase = new ItemBlockExOre(BlockList.blockOreCeruclase,EXORES);
            ItemBlockList.itemBlockCeruclase = new ItemBlockExOre(BlockList.blockCeruclase,EXORES);
            itemRegistry(ItemList.itemIngotCeruclase,event);
            itemRegistry(ItemList.itemDustCeruclase,event);
            itemRegistry(ItemBlockList.itemBlockOreCeruclase,event);
            itemRegistry(ItemBlockList.itemBlockCeruclase,event);
        }
        if(ConfigRegistryList.registerChromium.get())
        {
            ItemList.itemIngotChromium = new ItemEXOre(EXORES,"chromiumingot");
            ItemList.itemDustChromium = new ItemEXOre(EXORES,"chromiumdust");
            ItemBlockList.itemBlockOreChromium = new ItemBlockExOre(BlockList.blockOreChromium,EXORES);
            ItemBlockList.itemBlockChromium = new ItemBlockExOre(BlockList.blockChromium,EXORES);
            itemRegistry(ItemList.itemIngotChromium,event);
            itemRegistry(ItemList.itemDustChromium,event);
            itemRegistry(ItemBlockList.itemBlockOreChromium,event);
            itemRegistry(ItemBlockList.itemBlockChromium,event);
        }
        if(ConfigRegistryList.registerCobalt.get())
        {
            ItemList.itemIngotCobalt = new ItemEXOre(EXORES,"cobaltingot");
            ItemList.itemDustCobalt = new ItemEXOre(EXORES,"cobaltdust");
            ItemBlockList.itemBlockOreCobalt = new ItemBlockExOre(BlockList.blockOreCobalt,EXORES);
            ItemBlockList.itemBlockCobalt = new ItemBlockExOre(BlockList.blockCobalt,EXORES);
            itemRegistry(ItemList.itemIngotCobalt,event);
            itemRegistry(ItemList.itemDustCobalt,event);
            itemRegistry(ItemBlockList.itemBlockOreCobalt,event);
            itemRegistry(ItemBlockList.itemBlockCobalt,event);
        }
        if(ConfigRegistryList.registerCopper.get())
        {
            ItemList.itemIngotCopper = new ItemEXOre(EXORES,"copperingot");
            ItemList.itemDustCopper = new ItemEXOre(EXORES,"copperdust");
            ItemBlockList.itemBlockOreCopper = new ItemBlockExOre(BlockList.blockOreCopper,EXORES);
            ItemBlockList.itemBlockCopper = new ItemBlockExOre(BlockList.blockCopper,EXORES);
            itemRegistry(ItemList.itemIngotCopper,event);
            itemRegistry(ItemList.itemDustCopper,event);
            itemRegistry(ItemBlockList.itemBlockOreCopper,event);
            itemRegistry(ItemBlockList.itemBlockCopper,event);
        }
        if(ConfigRegistryList.registerDeepIron.get())
        {
            ItemList.itemIngotDeepIron = new ItemEXOre(EXORES,"deepironingot");
            ItemList.itemDustDeepIron = new ItemEXOre(EXORES,"deepirondust");
            ItemBlockList.itemBlockOreDeepIron = new ItemBlockExOre(BlockList.blockOreDeepIron,EXORES);
            ItemBlockList.itemBlockDeepIron = new ItemBlockExOre(BlockList.blockDeepIron,EXORES);
            itemRegistry(ItemList.itemIngotDeepIron,event);
            itemRegistry(ItemList.itemDustDeepIron,event);
            itemRegistry(ItemBlockList.itemBlockOreDeepIron,event);
            itemRegistry(ItemBlockList.itemBlockDeepIron,event);
        }
        if(ConfigRegistryList.registerGallium.get())
        {
            ItemList.itemIngotGallium = new ItemEXOre(EXORES,"galliumingot");
            ItemList.itemDustGallium = new ItemEXOre(EXORES,"galliumdust");
            ItemBlockList.itemBlockOreGallium = new ItemBlockExOre(BlockList.blockOreGallium,EXORES);
            ItemBlockList.itemBlockGallium = new ItemBlockExOre(BlockList.blockGallium,EXORES);
            itemRegistry(ItemList.itemIngotGallium,event);
            itemRegistry(ItemList.itemDustGallium,event);
            itemRegistry(ItemBlockList.itemBlockOreGallium,event);
            itemRegistry(ItemBlockList.itemBlockGallium,event);
        }
        if(ConfigRegistryList.registerHaderoth.get())
        {
            ItemList.itemIngotHaderoth = new ItemEXOre(EXORES,"haderothingot");
            ItemList.itemDustHaderoth = new ItemEXOre(EXORES,"haderothdust");
            ItemBlockList.itemBlockOreHaderoth = new ItemBlockExOre(BlockList.blockOreHaderoth,EXORES);
            ItemBlockList.itemBlockHaderoth = new ItemBlockExOre(BlockList.blockHaderoth,EXORES);
            itemRegistry(ItemList.itemIngotHaderoth,event);
            itemRegistry(ItemList.itemDustHaderoth,event);
            itemRegistry(ItemBlockList.itemBlockOreHaderoth,event);
            itemRegistry(ItemBlockList.itemBlockHaderoth,event);
        }
        if(ConfigRegistryList.registerHepatizon.get())
        {
            ItemList.itemIngotHepatizon = new ItemEXOre(EXORES,"hepatizoningot");
            ItemList.itemDustHepatizon = new ItemEXOre(EXORES,"hepatizondust");
            ItemBlockList.itemBlockOreHepatizon = new ItemBlockExOre(BlockList.blockOreHepatizon,EXORES);
            ItemBlockList.itemBlockHepatizon = new ItemBlockExOre(BlockList.blockHepatizon,EXORES);
            itemRegistry(ItemList.itemIngotHepatizon,event);
            itemRegistry(ItemList.itemDustHepatizon,event);
            itemRegistry(ItemBlockList.itemBlockOreHepatizon,event);
            itemRegistry(ItemBlockList.itemBlockHepatizon,event);
        }
        if(ConfigRegistryList.registerIgnatius.get())
        {
            ItemList.itemIngotIgnatius = new ItemEXOre(EXORES,"ignatiusingot");
            ItemList.itemDustIgnatius = new ItemEXOre(EXORES,"ignatiusdust");
            ItemBlockList.itemBlockOreIgnatius = new ItemBlockExOre(BlockList.blockOreIgnatius,EXORES);
            ItemBlockList.itemBlockIgnatius = new ItemBlockExOre(BlockList.blockIgnatius,EXORES);
            itemRegistry(ItemList.itemIngotIgnatius,event);
            itemRegistry(ItemList.itemDustIgnatius,event);
            itemRegistry(ItemBlockList.itemBlockOreIgnatius,event);
            itemRegistry(ItemBlockList.itemBlockIgnatius,event);
        }
        if(ConfigRegistryList.registerIndium.get())
        {
            ItemList.itemIngotIndium = new ItemEXOre(EXORES,"indiumingot");
            ItemList.itemDustIndium = new ItemEXOre(EXORES,"indiumdust");
            ItemBlockList.itemBlockOreIndium = new ItemBlockExOre(BlockList.blockOreIndium,EXORES);
            ItemBlockList.itemBlockIndium = new ItemBlockExOre(BlockList.blockIndium,EXORES);
            itemRegistry(ItemList.itemIngotIndium,event);
            itemRegistry(ItemList.itemDustIndium,event);
            itemRegistry(ItemBlockList.itemBlockOreIndium,event);
            itemRegistry(ItemBlockList.itemBlockIndium,event);
        }
        if(ConfigRegistryList.registerInfuscolium.get())
        {
            ItemList.itemIngotInfuscolium = new ItemEXOre(EXORES,"infuscoliumingot");
            ItemList.itemDustInfuscolium = new ItemEXOre(EXORES,"infuscoliumdust");
            ItemBlockList.itemBlockOreInfuscolium = new ItemBlockExOre(BlockList.blockOreInfuscolium,EXORES);
            ItemBlockList.itemBlockInfuscolium = new ItemBlockExOre(BlockList.blockInfuscolium,EXORES);
            itemRegistry(ItemList.itemIngotInfuscolium,event);
            itemRegistry(ItemList.itemDustInfuscolium,event);
            itemRegistry(ItemBlockList.itemBlockOreInfuscolium,event);
            itemRegistry(ItemBlockList.itemBlockInfuscolium,event);
        }
        if(ConfigRegistryList.registerInolashite.get())
        {
            ItemList.itemIngotInolashite = new ItemEXOre(EXORES,"inolashiteingot");
            ItemList.itemDustInolashite = new ItemEXOre(EXORES,"inolashitedust");
            ItemBlockList.itemBlockOreInolashite = new ItemBlockExOre(BlockList.blockOreInolashite,EXORES);
            ItemBlockList.itemBlockInolashite = new ItemBlockExOre(BlockList.blockInolashite,EXORES);
            itemRegistry(ItemList.itemIngotInolashite,event);
            itemRegistry(ItemList.itemDustInolashite,event);
            itemRegistry(ItemBlockList.itemBlockOreInolashite,event);
            itemRegistry(ItemBlockList.itemBlockInolashite,event);
        }
        if(ConfigRegistryList.registerKalendrite.get())
        {
            ItemList.itemIngotKalendrite = new ItemEXOre(EXORES,"kalendriteingot");
            ItemList.itemDustKalendrite = new ItemEXOre(EXORES,"kalendritedust");
            ItemBlockList.itemBlockOreKalendrite = new ItemBlockExOre(BlockList.blockOreKalendrite,EXORES);
            ItemBlockList.itemBlockKalendrite = new ItemBlockExOre(BlockList.blockKalendrite,EXORES);
            itemRegistry(ItemList.itemIngotKalendrite,event);
            itemRegistry(ItemList.itemDustKalendrite,event);
            itemRegistry(ItemBlockList.itemBlockOreKalendrite,event);
            itemRegistry(ItemBlockList.itemBlockKalendrite,event);
        }
        if(ConfigRegistryList.registerLead.get())
        {
            ItemList.itemIngotLead = new ItemEXOre(EXORES,"leadingot");
            ItemList.itemDustLead = new ItemEXOre(EXORES,"leaddust");
            ItemBlockList.itemBlockOreLead = new ItemBlockExOre(BlockList.blockOreLead,EXORES);
            ItemBlockList.itemBlockLead = new ItemBlockExOre(BlockList.blockLead,EXORES);
            itemRegistry(ItemList.itemIngotLead,event);
            itemRegistry(ItemList.itemDustLead,event);
            itemRegistry(ItemBlockList.itemBlockOreLead,event);
            itemRegistry(ItemBlockList.itemBlockLead,event);
        }
        if(ConfigRegistryList.registerLemurite.get())
        {
            ItemList.itemIngotLemurite = new ItemEXOre(EXORES,"lemuriteingot");
            ItemList.itemDustLemurite = new ItemEXOre(EXORES,"lemuritedust");
            ItemBlockList.itemBlockOreLemurite = new ItemBlockExOre(BlockList.blockOreLemurite,EXORES);
            ItemBlockList.itemBlockLemurite = new ItemBlockExOre(BlockList.blockLemurite,EXORES);
            itemRegistry(ItemList.itemIngotLemurite,event);
            itemRegistry(ItemList.itemDustLemurite,event);
            itemRegistry(ItemBlockList.itemBlockOreLemurite,event);
            itemRegistry(ItemBlockList.itemBlockLemurite,event);
        }
        if(ConfigRegistryList.registerManganese.get())
        {
            ItemList.itemIngotManganese = new ItemEXOre(EXORES,"manganeseingot");
            ItemList.itemDustManganese = new ItemEXOre(EXORES,"manganesedust");
            ItemBlockList.itemBlockOreManganese = new ItemBlockExOre(BlockList.blockOreManganese,EXORES);
            ItemBlockList.itemBlockManganese = new ItemBlockExOre(BlockList.blockManganese,EXORES);
            itemRegistry(ItemList.itemIngotManganese,event);
            itemRegistry(ItemList.itemDustManganese,event);
            itemRegistry(ItemBlockList.itemBlockOreManganese,event);
            itemRegistry(ItemBlockList.itemBlockManganese,event);
        }
        if(ConfigRegistryList.registerMidasium.get())
        {
            ItemList.itemIngotMidasium = new ItemEXOre(EXORES,"midasiumingot");
            ItemList.itemDustMidasium = new ItemEXOre(EXORES,"midasiumdust");
            ItemBlockList.itemBlockOreMidasium = new ItemBlockExOre(BlockList.blockOreMidasium,EXORES);
            ItemBlockList.itemBlockMidasium = new ItemBlockExOre(BlockList.blockMidasium,EXORES);
            itemRegistry(ItemList.itemIngotMidasium,event);
            itemRegistry(ItemList.itemDustMidasium,event);
            itemRegistry(ItemBlockList.itemBlockOreMidasium,event);
            itemRegistry(ItemBlockList.itemBlockMidasium,event);
        }
        if(ConfigRegistryList.registerMithril.get())
        {
            ItemList.itemIngotMithril = new ItemEXOre(EXORES,"mithrilingot");
            ItemList.itemDustMithril = new ItemEXOre(EXORES,"mithrildust");
            ItemBlockList.itemBlockOreMithril = new ItemBlockExOre(BlockList.blockOreMithril,EXORES);
            ItemBlockList.itemBlockMithril = new ItemBlockExOre(BlockList.blockMithril,EXORES);
            itemRegistry(ItemList.itemIngotMithril,event);
            itemRegistry(ItemList.itemDustMithril,event);
            itemRegistry(ItemBlockList.itemBlockOreMithril,event);
            itemRegistry(ItemBlockList.itemBlockMithril,event);
        }
        if(ConfigRegistryList.registerMolybdenum.get())
        {
            ItemList.itemIngotMolybdenum = new ItemEXOre(EXORES,"molybdenumingot");
            ItemList.itemDustMolybdenum = new ItemEXOre(EXORES,"molybdenumdust");
            ItemBlockList.itemBlockOreMolybdenum = new ItemBlockExOre(BlockList.blockOreMolybdenum,EXORES);
            ItemBlockList.itemBlockMolybdenum = new ItemBlockExOre(BlockList.blockMolybdenum,EXORES);
            itemRegistry(ItemList.itemIngotMolybdenum,event);
            itemRegistry(ItemList.itemDustMolybdenum,event);
            itemRegistry(ItemBlockList.itemBlockOreMolybdenum,event);
            itemRegistry(ItemBlockList.itemBlockMolybdenum,event);
        }
        if(ConfigRegistryList.registerNeodymium.get())
        {
            ItemList.itemIngotNeodymium = new ItemEXOre(EXORES,"neodymiumingot");
            ItemList.itemDustNeodymium = new ItemEXOre(EXORES,"neodymiumdust");
            ItemBlockList.itemBlockOreNeodymium = new ItemBlockExOre(BlockList.blockOreNeodymium,EXORES);
            ItemBlockList.itemBlockNeodymium = new ItemBlockExOre(BlockList.blockNeodymium,EXORES);
            itemRegistry(ItemList.itemIngotNeodymium,event);
            itemRegistry(ItemList.itemDustNeodymium,event);
            itemRegistry(ItemBlockList.itemBlockOreNeodymium,event);
            itemRegistry(ItemBlockList.itemBlockNeodymium,event);
        }
        if(ConfigRegistryList.registerNickel.get())
        {
            ItemList.itemIngotNickel = new ItemEXOre(EXORES,"nickelingot");
            ItemList.itemDustNickel = new ItemEXOre(EXORES,"nickeldust");
            ItemBlockList.itemBlockOreNickel = new ItemBlockExOre(BlockList.blockOreNickel,EXORES);
            ItemBlockList.itemBlockNickel = new ItemBlockExOre(BlockList.blockNickel,EXORES);
            itemRegistry(ItemList.itemIngotNickel,event);
            itemRegistry(ItemList.itemDustNickel,event);
            itemRegistry(ItemBlockList.itemBlockOreNickel,event);
            itemRegistry(ItemBlockList.itemBlockNickel,event);
        }
        if(ConfigRegistryList.registerNiobium.get())
        {
            ItemList.itemIngotNiobium = new ItemEXOre(EXORES,"niobiumingot");
            ItemList.itemDustNiobium = new ItemEXOre(EXORES,"niobiumdust");
            ItemBlockList.itemBlockOreNiobium = new ItemBlockExOre(BlockList.blockOreNiobium,EXORES);
            ItemBlockList.itemBlockNiobium = new ItemBlockExOre(BlockList.blockNiobium,EXORES);
            itemRegistry(ItemList.itemIngotNiobium,event);
            itemRegistry(ItemList.itemDustNiobium,event);
            itemRegistry(ItemBlockList.itemBlockOreNiobium,event);
            itemRegistry(ItemBlockList.itemBlockNiobium,event);
        }
        if(ConfigRegistryList.registerOrichalcum.get())
        {
            ItemList.itemIngotOrichalcum = new ItemEXOre(EXORES,"orichalcumingot");
            ItemList.itemDustOrichalcum = new ItemEXOre(EXORES,"orichalcumdust");
            ItemBlockList.itemBlockOreOrichalcum = new ItemBlockExOre(BlockList.blockOreOrichalcum,EXORES);
            ItemBlockList.itemBlockOrichalcum = new ItemBlockExOre(BlockList.blockOrichalcum,EXORES);
            itemRegistry(ItemList.itemIngotOrichalcum,event);
            itemRegistry(ItemList.itemDustOrichalcum,event);
            itemRegistry(ItemBlockList.itemBlockOreOrichalcum,event);
            itemRegistry(ItemBlockList.itemBlockOrichalcum,event);
        }
        if(ConfigRegistryList.registerOureclase.get())
        {
            ItemList.itemIngotOureclase = new ItemEXOre(EXORES,"oureclaseingot");
            ItemList.itemDustOureclase = new ItemEXOre(EXORES,"oureclasedust");
            ItemBlockList.itemBlockOreOureclase = new ItemBlockExOre(BlockList.blockOreOureclase,EXORES);
            ItemBlockList.itemBlockOureclase = new ItemBlockExOre(BlockList.blockOureclase,EXORES);
            itemRegistry(ItemList.itemIngotOureclase,event);
            itemRegistry(ItemList.itemDustOureclase,event);
            itemRegistry(ItemBlockList.itemBlockOreOureclase,event);
            itemRegistry(ItemBlockList.itemBlockOureclase,event);
        }
        if(ConfigRegistryList.registerPalladium.get())
        {
            ItemList.itemIngotPalladium = new ItemEXOre(EXORES,"palladiumingot");
            ItemList.itemDustPalladium = new ItemEXOre(EXORES,"palladiumdust");
            ItemBlockList.itemBlockOrePalladium = new ItemBlockExOre(BlockList.blockOrePalladium,EXORES);
            ItemBlockList.itemBlockPalladium = new ItemBlockExOre(BlockList.blockPalladium,EXORES);
            itemRegistry(ItemList.itemIngotPalladium,event);
            itemRegistry(ItemList.itemDustPalladium,event);
            itemRegistry(ItemBlockList.itemBlockOrePalladium,event);
            itemRegistry(ItemBlockList.itemBlockPalladium,event);
        }
        if(ConfigRegistryList.registerPlatinum.get())
        {
            ItemList.itemIngotPlatinum = new ItemEXOre(EXORES,"platinumingot");
            ItemList.itemDustPlatinum = new ItemEXOre(EXORES,"platinumdust");
            ItemBlockList.itemBlockOrePlatinum = new ItemBlockExOre(BlockList.blockOrePlatinum,EXORES);
            ItemBlockList.itemBlockPlatinum = new ItemBlockExOre(BlockList.blockPlatinum,EXORES);
            itemRegistry(ItemList.itemIngotPlatinum,event);
            itemRegistry(ItemList.itemDustPlatinum,event);
            itemRegistry(ItemBlockList.itemBlockOrePlatinum,event);
            itemRegistry(ItemBlockList.itemBlockPlatinum,event);
        }
        if(ConfigRegistryList.registerPrometheum.get())
        {
            ItemList.itemIngotPrometheum = new ItemEXOre(EXORES,"prometheumingot");
            ItemList.itemDustPrometheum = new ItemEXOre(EXORES,"prometheumdust");
            ItemBlockList.itemBlockOrePrometheum = new ItemBlockExOre(BlockList.blockOrePrometheum,EXORES);
            ItemBlockList.itemBlockPrometheum = new ItemBlockExOre(BlockList.blockPrometheum,EXORES);
            itemRegistry(ItemList.itemIngotPrometheum,event);
            itemRegistry(ItemList.itemDustPrometheum,event);
            itemRegistry(ItemBlockList.itemBlockOrePrometheum,event);
            itemRegistry(ItemBlockList.itemBlockPrometheum,event);
        }
        if(ConfigRegistryList.registerRhodium.get())
        {
            ItemList.itemIngotRhodium = new ItemEXOre(EXORES,"rhodiumingot");
            ItemList.itemDustRhodium = new ItemEXOre(EXORES,"rhodiumdust");
            ItemBlockList.itemBlockOreRhodium = new ItemBlockExOre(BlockList.blockOreRhodium,EXORES);
            ItemBlockList.itemBlockRhodium = new ItemBlockExOre(BlockList.blockRhodium,EXORES);
            itemRegistry(ItemList.itemIngotRhodium,event);
            itemRegistry(ItemList.itemDustRhodium,event);
            itemRegistry(ItemBlockList.itemBlockOreRhodium,event);
            itemRegistry(ItemBlockList.itemBlockRhodium,event);
        }
        if(ConfigRegistryList.registerRubracium.get())
        {
            ItemList.itemIngotRubracium = new ItemEXOre(EXORES,"rubraciumingot");
            ItemList.itemDustRubracium = new ItemEXOre(EXORES,"rubraciumdust");
            ItemBlockList.itemBlockOreRubracium = new ItemBlockExOre(BlockList.blockOreRubracium,EXORES);
            ItemBlockList.itemBlockRubracium = new ItemBlockExOre(BlockList.blockRubracium,EXORES);
            itemRegistry(ItemList.itemIngotRubracium,event);
            itemRegistry(ItemList.itemDustRubracium,event);
            itemRegistry(ItemBlockList.itemBlockOreRubracium,event);
            itemRegistry(ItemBlockList.itemBlockRubracium,event);
        }
        if(ConfigRegistryList.registerRuthenium.get())
        {
            ItemList.itemIngotRuthenium = new ItemEXOre(EXORES,"rutheniumingot");
            ItemList.itemDustRuthenium = new ItemEXOre(EXORES,"rutheniumdust");
            ItemBlockList.itemBlockOreRuthenium = new ItemBlockExOre(BlockList.blockOreRuthenium,EXORES);
            ItemBlockList.itemBlockRuthenium = new ItemBlockExOre(BlockList.blockRuthenium,EXORES);
            itemRegistry(ItemList.itemIngotRuthenium,event);
            itemRegistry(ItemList.itemDustRuthenium,event);
            itemRegistry(ItemBlockList.itemBlockOreRuthenium,event);
            itemRegistry(ItemBlockList.itemBlockRuthenium,event);
        }
        if(ConfigRegistryList.registerSanguinite.get())
        {
            ItemList.itemIngotSanguinite = new ItemEXOre(EXORES,"sanguiniteingot");
            ItemList.itemDustSanguinite = new ItemEXOre(EXORES,"sanguinitedust");
            ItemBlockList.itemBlockOreSanguinite = new ItemBlockExOre(BlockList.blockOreSanguinite,EXORES);
            ItemBlockList.itemBlockSanguinite = new ItemBlockExOre(BlockList.blockSanguinite,EXORES);
            itemRegistry(ItemList.itemIngotSanguinite,event);
            itemRegistry(ItemList.itemDustSanguinite,event);
            itemRegistry(ItemBlockList.itemBlockOreSanguinite,event);
            itemRegistry(ItemBlockList.itemBlockSanguinite,event);
        }
        if(ConfigRegistryList.registerShadowIron.get())
        {
            ItemList.itemIngotShadowIron = new ItemEXOre(EXORES,"shadowironingot");
            ItemList.itemDustShadowIron = new ItemEXOre(EXORES,"shadowirondust");
            ItemBlockList.itemBlockOreShadowIron = new ItemBlockExOre(BlockList.blockOreShadowIron,EXORES);
            ItemBlockList.itemBlockShadowIron = new ItemBlockExOre(BlockList.blockShadowIron,EXORES);
            itemRegistry(ItemList.itemIngotShadowIron,event);
            itemRegistry(ItemList.itemDustShadowIron,event);
            itemRegistry(ItemBlockList.itemBlockOreShadowIron,event);
            itemRegistry(ItemBlockList.itemBlockShadowIron,event);
        }
        if(ConfigRegistryList.registerSilver.get())
        {
            ItemList.itemIngotSilver = new ItemEXOre(EXORES,"silveringot");
            ItemList.itemDustSilver = new ItemEXOre(EXORES,"silverdust");
            ItemBlockList.itemBlockOreSilver = new ItemBlockExOre(BlockList.blockOreSilver,EXORES);
            ItemBlockList.itemBlockSilver = new ItemBlockExOre(BlockList.blockSilver,EXORES);
            itemRegistry(ItemList.itemIngotSilver,event);
            itemRegistry(ItemList.itemDustSilver,event);
            itemRegistry(ItemBlockList.itemBlockOreSilver,event);
            itemRegistry(ItemBlockList.itemBlockSilver,event);
        }
        if(ConfigRegistryList.registerTechnetium.get())
        {
            ItemList.itemIngotTechnetium = new ItemEXOre(EXORES,"technetiumingot");
            ItemList.itemDustTechnetium = new ItemEXOre(EXORES,"technetiumdust");
            ItemBlockList.itemBlockOreTechnetium = new ItemBlockExOre(BlockList.blockOreTechnetium,EXORES);
            ItemBlockList.itemBlockTechnetium = new ItemBlockExOre(BlockList.blockTechnetium,EXORES);
            itemRegistry(ItemList.itemIngotTechnetium,event);
            itemRegistry(ItemList.itemDustTechnetium,event);
            itemRegistry(ItemBlockList.itemBlockOreTechnetium,event);
            itemRegistry(ItemBlockList.itemBlockTechnetium,event);
        }
        if(ConfigRegistryList.registerThallium.get())
        {
            ItemList.itemIngotThallium = new ItemEXOre(EXORES,"thalliumingot");
            ItemList.itemDustThallium = new ItemEXOre(EXORES,"thalliumdust");
            ItemBlockList.itemBlockOreThallium = new ItemBlockExOre(BlockList.blockOreThallium,EXORES);
            ItemBlockList.itemBlockThallium = new ItemBlockExOre(BlockList.blockThallium,EXORES);
            itemRegistry(ItemList.itemIngotThallium,event);
            itemRegistry(ItemList.itemDustThallium,event);
            itemRegistry(ItemBlockList.itemBlockOreThallium,event);
            itemRegistry(ItemBlockList.itemBlockThallium,event);
        }
        if(ConfigRegistryList.registerTin.get())
        {
            ItemList.itemIngotTin = new ItemEXOre(EXORES,"tiningot");
            ItemList.itemDustTin = new ItemEXOre(EXORES,"tindust");
            ItemBlockList.itemBlockOreTin = new ItemBlockExOre(BlockList.blockOreTin,EXORES);
            ItemBlockList.itemBlockTin = new ItemBlockExOre(BlockList.blockTin,EXORES);
            itemRegistry(ItemList.itemIngotTin,event);
            itemRegistry(ItemList.itemDustTin,event);
            itemRegistry(ItemBlockList.itemBlockOreTin,event);
            itemRegistry(ItemBlockList.itemBlockTin,event);
        }
        if(ConfigRegistryList.registerTitanium.get())
        {
            ItemList.itemIngotTitanium = new ItemEXOre(EXORES,"titaniumingot");
            ItemList.itemDustTitanium = new ItemEXOre(EXORES,"titaniumdust");
            ItemBlockList.itemBlockOreTitanium = new ItemBlockExOre(BlockList.blockOreTitanium,EXORES);
            ItemBlockList.itemBlockTitanium = new ItemBlockExOre(BlockList.blockTitanium,EXORES);
            itemRegistry(ItemList.itemIngotTitanium,event);
            itemRegistry(ItemList.itemDustTitanium,event);
            itemRegistry(ItemBlockList.itemBlockOreTitanium,event);
            itemRegistry(ItemBlockList.itemBlockTitanium,event);
        }
        if(ConfigRegistryList.registerTungsten.get())
        {
            ItemList.itemIngotTungsten = new ItemEXOre(EXORES,"tungsteningot");
            ItemList.itemDustTungsten = new ItemEXOre(EXORES,"tungstendust");
            ItemBlockList.itemBlockOreTungsten = new ItemBlockExOre(BlockList.blockOreTungsten,EXORES);
            ItemBlockList.itemBlockTungsten = new ItemBlockExOre(BlockList.blockTungsten,EXORES);
            itemRegistry(ItemList.itemIngotTungsten,event);
            itemRegistry(ItemList.itemDustTungsten,event);
            itemRegistry(ItemBlockList.itemBlockOreTungsten,event);
            itemRegistry(ItemBlockList.itemBlockTungsten,event);
        }
        if(ConfigRegistryList.registerUnobtainium.get())
        {
            ItemList.itemIngotUnobtainium = new ItemEXOre(EXORES,"unobtainiumingot");
            ItemList.itemDustUnobtainium = new ItemEXOre(EXORES,"unobtainiumdust");
            ItemBlockList.itemBlockOreUnobtainium = new ItemBlockExOre(BlockList.blockOreUnobtainium,EXORES);
            ItemBlockList.itemBlockUnobtainium = new ItemBlockExOre(BlockList.blockUnobtainium,EXORES);
            itemRegistry(ItemList.itemIngotUnobtainium,event);
            itemRegistry(ItemList.itemDustUnobtainium,event);
            itemRegistry(ItemBlockList.itemBlockOreUnobtainium,event);
            itemRegistry(ItemBlockList.itemBlockUnobtainium,event);
        }
        if(ConfigRegistryList.registerVanadium.get())
        {
            ItemList.itemIngotVanadium = new ItemEXOre(EXORES,"vanadiumingot");
            ItemList.itemDustVanadium = new ItemEXOre(EXORES,"vanadiumdust");
            ItemBlockList.itemBlockOreVanadium = new ItemBlockExOre(BlockList.blockOreVanadium,EXORES);
            ItemBlockList.itemBlockVanadium = new ItemBlockExOre(BlockList.blockVanadium,EXORES);
            itemRegistry(ItemList.itemIngotVanadium,event);
            itemRegistry(ItemList.itemDustVanadium,event);
            itemRegistry(ItemBlockList.itemBlockOreVanadium,event);
            itemRegistry(ItemBlockList.itemBlockVanadium,event);
        }
        if(ConfigRegistryList.registerVulcanite.get())
        {
            ItemList.itemIngotVulcanite = new ItemEXOre(EXORES,"vulcaniteingot");
            ItemList.itemDustVulcanite = new ItemEXOre(EXORES,"vulcanitedust");
            ItemBlockList.itemBlockOreVulcanite = new ItemBlockExOre(BlockList.blockOreVulcanite,EXORES);
            ItemBlockList.itemBlockVulcanite = new ItemBlockExOre(BlockList.blockVulcanite,EXORES);
            itemRegistry(ItemList.itemIngotVulcanite,event);
            itemRegistry(ItemList.itemDustVulcanite,event);
            itemRegistry(ItemBlockList.itemBlockOreVulcanite,event);
            itemRegistry(ItemBlockList.itemBlockVulcanite,event);
        }
        if(ConfigRegistryList.registerVyroxeres.get())
        {
            ItemList.itemIngotVyroxeres = new ItemEXOre(EXORES,"vyroxeresingot");
            ItemList.itemDustVyroxeres = new ItemEXOre(EXORES,"vyroxeresdust");
            ItemBlockList.itemBlockOreVyroxeres = new ItemBlockExOre(BlockList.blockOreVyroxeres,EXORES);
            ItemBlockList.itemBlockVyroxeres = new ItemBlockExOre(BlockList.blockVyroxeres,EXORES);
            itemRegistry(ItemList.itemIngotVyroxeres,event);
            itemRegistry(ItemList.itemDustVyroxeres,event);
            itemRegistry(ItemBlockList.itemBlockOreVyroxeres,event);
            itemRegistry(ItemBlockList.itemBlockVyroxeres,event);
        }
        if(ConfigRegistryList.registerZinc.get())
        {
            ItemList.itemIngotZinc = new ItemEXOre(EXORES,"zincingot");
            ItemList.itemDustZinc = new ItemEXOre(EXORES,"zincdust");
            ItemBlockList.itemBlockOreZinc = new ItemBlockExOre(BlockList.blockOreZinc,EXORES);
            ItemBlockList.itemBlockZinc = new ItemBlockExOre(BlockList.blockZinc,EXORES);
            itemRegistry(ItemList.itemIngotZinc,event);
            itemRegistry(ItemList.itemDustZinc,event);
            itemRegistry(ItemBlockList.itemBlockOreZinc,event);
            itemRegistry(ItemBlockList.itemBlockZinc,event);
        }
        if(ConfigRegistryList.registerZirconium.get())
        {
            ItemList.itemIngotZirconium = new ItemEXOre(EXORES,"zirconiumingot");
            ItemList.itemDustZirconium = new ItemEXOre(EXORES,"zirconiumdust");
            ItemBlockList.itemBlockOreZirconium = new ItemBlockExOre(BlockList.blockOreZirconium,EXORES);
            ItemBlockList.itemBlockZirconium = new ItemBlockExOre(BlockList.blockZirconium,EXORES);
            itemRegistry(ItemList.itemIngotZirconium,event);
            itemRegistry(ItemList.itemDustZirconium,event);
            itemRegistry(ItemBlockList.itemBlockOreZirconium,event);
            itemRegistry(ItemBlockList.itemBlockZirconium,event);
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

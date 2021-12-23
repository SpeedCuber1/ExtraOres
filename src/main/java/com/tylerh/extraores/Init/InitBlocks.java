package com.tylerh.extraores.Init;

import com.tylerh.extraores.Blocks.BlockEXOre;
import com.tylerh.extraores.Items.*;
import com.tylerh.extraores.Util.ItemGroupExOre;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class InitBlocks
{
    private static final CreativeModeTab EXORES = new ItemGroupExOre();
    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event)
    {
        if (ConfigRegistryList.registerAdamantine.get())
        {
            BlockList.blockOreAdamantine = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "adamantineore");
            BlockList.blockAdamantine = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "adamantineblock");
            //BlockList.blockDeepslateOreAdamantine = new BlockEXOre(Material.STONE,1.5F,1.5F,"deepslateadamantineore");
            blockRegistry(BlockList.blockOreAdamantine, event);
            //blockRegistry(BlockList.blockDeepslateOreAdamantine,event);
            blockRegistry(BlockList.blockAdamantine, event);
        }
        if(ConfigRegistryList.registerAgate.get())
        {
            BlockList.blockOreAgate = new BlockEXOre(Material.STONE,1.5F,1.5F,"agateore");
            BlockList.blockAgate = new BlockEXOre(Material.METAL,1.5F,1.5F,"agateblock");
            blockRegistry(BlockList.blockOreAgate,event);
            blockRegistry(BlockList.blockAgate,event);
        }
        if (ConfigRegistryList.registerAldourite.get())
        {
            BlockList.blockOreAldourite = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "aldouriteore");
            BlockList.blockAldourite = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "aldouriteblock");
            blockRegistry(BlockList.blockOreAldourite, event);
            blockRegistry(BlockList.blockAldourite, event);
        }
        if (ConfigRegistryList.registerAluminum.get())
        {
            BlockList.blockOreAluminum = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "aluminumore");
            BlockList.blockAluminum = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "aluminumblock");
            blockRegistry(BlockList.blockOreAluminum, event);
            blockRegistry(BlockList.blockAluminum, event);
        }
        if(ConfigRegistryList.registerAmericium.get())
        {
            BlockList.blockOreAmericium = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "americiumore");
            BlockList.blockAmericium = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "americiumblock");
            blockRegistry(BlockList.blockOreAmericium, event);
            blockRegistry(BlockList.blockAmericium, event);
        }
        if(ConfigRegistryList.registerAmethyst.get())
        {
            BlockList.blockOreAmethyst = new BlockEXOre(Material.STONE,1.5F,1.5F,"amethystore");
            BlockList.blockAmethyst = new BlockEXOre(Material.STONE,1.5F,1.5F,"amethystblock");
            blockRegistry(BlockList.blockOreAmethyst,event);
            blockRegistry(BlockList.blockAmethyst,event);
        }
        if(ConfigRegistryList.registerAmetrine.get())
        {
            BlockList.blockOreAmetrine = new BlockEXOre(Material.STONE,1.5F,1.5F,"ametrineore");
            BlockList.blockAmetrine = new BlockEXOre(Material.STONE,1.5F,1.5F,"ametrineblock");
            blockRegistry(BlockList.blockOreAmetrine,event);
            blockRegistry(BlockList.blockAmetrine,event);
        }
        if (ConfigRegistryList.registerAmordrine.get())
        {
            BlockList.blockOreAmordrine = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "amordrineore");
            BlockList.blockAmordrine = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "amordrineblock");
            blockRegistry(BlockList.blockOreAmordrine, event);
            blockRegistry(BlockList.blockAmordrine, event);
        }
        if (ConfigRegistryList.registerAngmallen.get())
        {
            BlockList.blockOreAngmallen = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "angmallenore");
            BlockList.blockAngmallen = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "angmallenblock");
            blockRegistry(BlockList.blockOreAngmallen, event);
            blockRegistry(BlockList.blockAngmallen, event);
        }
        if(ConfigRegistryList.registerAquamarine.get())
        {
            BlockList.blockOreAquamarine = new BlockEXOre(Material.STONE,1.5F,1.5F,"aquamarineore");
            BlockList.blockAquamarine = new BlockEXOre(Material.STONE,1.5F,1.5F,"aquamarineblock");
            blockRegistry(BlockList.blockOreAquamarine,event);
            blockRegistry(BlockList.blockAquamarine,event);
        }
        if (ConfigRegistryList.registerAstralSilver.get())
        {
            BlockList.blockOreAstralSilver = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "astralsilverore");
            BlockList.blockAstralSilver = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "astralsilverblock");
            blockRegistry(BlockList.blockOreAstralSilver, event);
            blockRegistry(BlockList.blockAstralSilver, event);
        }
        if (ConfigRegistryList.registerAtlarus.get())
        {
            BlockList.blockOreAtlarus = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "atlarusore");
            BlockList.blockAtlarus = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "atlarusblock");
            blockRegistry(BlockList.blockOreAtlarus, event);
            blockRegistry(BlockList.blockAtlarus, event);
        }
        if (ConfigRegistryList.registerBismuth.get())
        {
            BlockList.blockOreBismuth = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "bismuthore");
            BlockList.blockBismuth = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "bismuthblock");
            blockRegistry(BlockList.blockOreBismuth, event);
            blockRegistry(BlockList.blockBismuth, event);
        }
        if (ConfigRegistryList.registerBlackSteel.get())
        {
            BlockList.blockOreBlackSteel = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "blacksteelore");
            BlockList.blockBlackSteel = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "blacksteelblock");
            blockRegistry(BlockList.blockOreBlackSteel, event);
            blockRegistry(BlockList.blockBlackSteel, event);
        }
        if (ConfigRegistryList.registerCadmium.get())
        {
            BlockList.blockOreCadmium = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "cadmiumore");
            BlockList.blockCadmium = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "cadmiumblock");
            blockRegistry(BlockList.blockOreCadmium, event);
            blockRegistry(BlockList.blockCadmium, event);
        }
        if (ConfigRegistryList.registerCarmot.get())
        {
            BlockList.blockOreCarmot = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "carmotore");
            BlockList.blockCarmot = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "carmotblock");
            blockRegistry(BlockList.blockOreCarmot, event);
            blockRegistry(BlockList.blockCarmot, event);
        }
        if (ConfigRegistryList.registerCelenegil.get())
        {
            BlockList.blockOreCelenegil = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "celenegilore");
            BlockList.blockCelenegil = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "celenegilblock");
            blockRegistry(BlockList.blockOreCelenegil, event);
            blockRegistry(BlockList.blockCelenegil, event);
        }
        if (ConfigRegistryList.registerCeruclase.get())
        {
            BlockList.blockOreCeruclase = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "ceruclaseore");
            BlockList.blockCeruclase = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "ceruclaseblock");
            blockRegistry(BlockList.blockOreCeruclase, event);
            blockRegistry(BlockList.blockCeruclase, event);
        }
        if (ConfigRegistryList.registerChromium.get())
        {
            BlockList.blockOreChromium = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "chromiumore");
            BlockList.blockChromium = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "chromiumblock");
            blockRegistry(BlockList.blockOreChromium, event);
            blockRegistry(BlockList.blockChromium, event);
        }
        if(ConfigRegistryList.registerChrysocolla.get())
        {
            BlockList.blockOreChrysocolla = new BlockEXOre(Material.STONE,1.5F,1.5F,"chrysocollaore");
            BlockList.blockChrysocolla = new BlockEXOre(Material.STONE,1.5F,1.5F,"chrysocollablock");
            blockRegistry(BlockList.blockOreChrysocolla,event);
            blockRegistry(BlockList.blockChrysocolla,event);
        }
        if(ConfigRegistryList.registerCitrine.get())
        {
            BlockList.blockOreCitrine = new BlockEXOre(Material.STONE,1.5F,1.5F,"citrineore");
            BlockList.blockCitrine = new BlockEXOre(Material.STONE,1.5F,1.5F,"citrineblock");
            blockRegistry(BlockList.blockOreCitrine,event);
            blockRegistry(BlockList.blockCitrine,event);
        }
        if (ConfigRegistryList.registerCobalt.get())
        {
            BlockList.blockOreCobalt = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "cobaltore");
            BlockList.blockCobalt = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "cobaltblock");
            blockRegistry(BlockList.blockOreCobalt, event);
            blockRegistry(BlockList.blockCobalt, event);
        }
        if (ConfigRegistryList.registerCopper.get())
        {
            BlockList.blockOreCopper = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "copperore");
            BlockList.blockCopper = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "copperblock");
            blockRegistry(BlockList.blockOreCopper, event);
            blockRegistry(BlockList.blockCopper, event);
        }
        if (ConfigRegistryList.registerDeepIron.get())
        {
            BlockList.blockOreDeepIron = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "deepironore");
            BlockList.blockDeepIron = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "deepironblock");
            blockRegistry(BlockList.blockOreDeepIron, event);
            blockRegistry(BlockList.blockDeepIron, event);
        }
        if(ConfigRegistryList.registerDesichalkos.get())
        {
            BlockList.blockOreDesichalkos = new BlockEXOre(Material.STONE,1.5F,1.5F,"desichalkosore");
            BlockList.blockDesichalkos = new BlockEXOre(Material.METAL,1.5F,1.5F,"desichalkosblock");
            blockRegistry(BlockList.blockOreDesichalkos,event);
            blockRegistry(BlockList.blockDesichalkos,event);
        }
        if(ConfigRegistryList.registerEximite.get())
        {
            BlockList.blockOreEximite = new BlockEXOre(Material.STONE,1.5F,1.5F,"eximiteore");
            BlockList.blockEximite = new BlockEXOre(Material.METAL,1.5F,1.5F,"eximiteblock");
            blockRegistry(BlockList.blockOreEximite,event);
            blockRegistry(BlockList.blockEximite,event);
        }
        if (ConfigRegistryList.registerGallium.get())
        {
            BlockList.blockOreGallium = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "galliumore");
            BlockList.blockGallium = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "galliumblock");
            blockRegistry(BlockList.blockOreGallium, event);
            blockRegistry(BlockList.blockGallium, event);
        }
        if(ConfigRegistryList.registerGarnet.get())
        {
            BlockList.blockOreGarnet = new BlockEXOre(Material.STONE,1.5F,1.5F,"garnetore");
            BlockList.blockGarnet = new BlockEXOre(Material.STONE,1.5F,1.5F,"garnetblock");
            blockRegistry(BlockList.blockOreGarnet,event);
            blockRegistry(BlockList.blockGarnet,event);
        }
        if (ConfigRegistryList.registerHaderoth.get())
        {
            BlockList.blockOreHaderoth = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "haderothore");
            BlockList.blockHaderoth = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "haderothblock");
            blockRegistry(BlockList.blockOreHaderoth, event);
            blockRegistry(BlockList.blockHaderoth, event);
        }
        if (ConfigRegistryList.registerHepatizon.get())
        {
            BlockList.blockOreHepatizon = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "hepatizonore");
            BlockList.blockHepatizon = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "hepatizonblock");
            blockRegistry(BlockList.blockOreHepatizon, event);
            blockRegistry(BlockList.blockHepatizon, event);
        }
        if (ConfigRegistryList.registerIgnatius.get())
        {
            BlockList.blockOreIgnatius = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "ignatiusore");
            BlockList.blockIgnatius = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "ignatiusblock");
            blockRegistry(BlockList.blockOreIgnatius, event);
            blockRegistry(BlockList.blockIgnatius, event);
        }
        if (ConfigRegistryList.registerIndium.get())
        {
            BlockList.blockOreIndium = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "indiumore");
            BlockList.blockIndium = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "indiumblock");
            blockRegistry(BlockList.blockOreIndium, event);
            blockRegistry(BlockList.blockIndium, event);
        }
        if (ConfigRegistryList.registerInfuscolium.get())
        {
            BlockList.blockOreInfuscolium = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "infuscoliumore");
            BlockList.blockInfuscolium = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "infuscoliumblock");
            blockRegistry(BlockList.blockOreInfuscolium, event);
            blockRegistry(BlockList.blockInfuscolium, event);
        }
        if (ConfigRegistryList.registerInolashite.get())
        {
            BlockList.blockOreInolashite = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "inolashiteore");
            BlockList.blockInolashite = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "inolashiteblock");
            blockRegistry(BlockList.blockOreInolashite, event);
            blockRegistry(BlockList.blockInolashite, event);
        }
        if(ConfigRegistryList.registerIolite.get())
        {
            BlockList.blockOreIolite = new BlockEXOre(Material.STONE,1.5F,1.5F,"ioliteore");
            BlockList.blockIolite = new BlockEXOre(Material.STONE,1.5F,1.5F,"ioliteblock");
            blockRegistry(BlockList.blockOreIolite,event);
            blockRegistry(BlockList.blockIolite,event);
        }
        if(ConfigRegistryList.registerIridium.get())
        {
            BlockList.blockOreIridium = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "iridiumore");
            BlockList.blockIridium = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "iridiumblock");
            blockRegistry(BlockList.blockOreIridium, event);
            blockRegistry(BlockList.blockIridium, event);
        }
        if(ConfigRegistryList.registerJade.get())
        {
            BlockList.blockOreJade = new BlockEXOre(Material.STONE,1.5F,1.5F,"jadeore");
            BlockList.blockJade = new BlockEXOre(Material.STONE,1.5F,1.5F,"jadeblock");
            blockRegistry(BlockList.blockOreJade,event);
            blockRegistry(BlockList.blockJade,event);
        }
        if(ConfigRegistryList.registerJasper.get())
        {
            BlockList.blockOreJasper = new BlockEXOre(Material.STONE,1.5F,1.5F,"jasperore");
            BlockList.blockJasper = new BlockEXOre(Material.STONE,1.5F,1.5F,"jasperblock");
            blockRegistry(BlockList.blockOreJasper,event);
            blockRegistry(BlockList.blockJasper,event);
        }
        if (ConfigRegistryList.registerKalendrite.get())
        {
            BlockList.blockOreKalendrite = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "kalendriteore");
            BlockList.blockKalendrite = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "kalendriteblock");
            blockRegistry(BlockList.blockOreKalendrite, event);
            blockRegistry(BlockList.blockKalendrite, event);
        }
        if(ConfigRegistryList.registerKyanite.get())
        {
            BlockList.blockOreKyanite = new BlockEXOre(Material.STONE,1.5F,1.5F,"kyaniteore");
            BlockList.blockKyanite = new BlockEXOre(Material.STONE,1.5F,1.5F,"kyaniteblock");
            blockRegistry(BlockList.blockOreKyanite,event);
            blockRegistry(BlockList.blockKyanite,event);
        }
        if (ConfigRegistryList.registerLead.get())
        {
            BlockList.blockOreLead = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "leadore");
            BlockList.blockLead = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "leadblock");
            blockRegistry(BlockList.blockOreLead, event);
            blockRegistry(BlockList.blockLead, event);
        }
        if (ConfigRegistryList.registerLemurite.get())
        {
            BlockList.blockOreLemurite = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "lemuriteore");
            BlockList.blockLemurite = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "lemuriteblock");
            blockRegistry(BlockList.blockOreLemurite, event);
            blockRegistry(BlockList.blockLemurite, event);
        }
        if(ConfigRegistryList.registerMalachite.get())
        {
            BlockList.blockOreMalachite = new BlockEXOre(Material.STONE,1.5F,1.5F,"malachiteore");
            BlockList.blockMalachite = new BlockEXOre(Material.STONE,1.5F,1.5F,"malachiteblock");
            blockRegistry(BlockList.blockOreMalachite,event);
            blockRegistry(BlockList.blockMalachite,event);
        }
        if (ConfigRegistryList.registerManganese.get())
        {
            BlockList.blockOreManganese = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "manganeseore");
            BlockList.blockManganese = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "manganeseblock");
            blockRegistry(BlockList.blockOreManganese, event);
            blockRegistry(BlockList.blockManganese, event);
        }
        if(ConfigRegistryList.registerMeutoite.get())
        {
            BlockList.blockOreMeutoite = new BlockEXOre(Material.STONE,1.5F,1.5F,"meutoiteore");
            BlockList.blockMeutoite = new BlockEXOre(Material.METAL,1.5F,1.5F,"meutoiteblock");
            blockRegistry(BlockList.blockOreMeutoite,event);
            blockRegistry(BlockList.blockMeutoite,event);
        }
        if (ConfigRegistryList.registerMidasium.get())
        {
            BlockList.blockOreMidasium = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "midasiumore");
            BlockList.blockMidasium = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "midasiumblock");
            blockRegistry(BlockList.blockOreMidasium, event);
            blockRegistry(BlockList.blockMidasium, event);
        }
        if (ConfigRegistryList.registerMithril.get())
        {
            BlockList.blockOreMithril = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "mithrilore");
            BlockList.blockMithril = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "mithrilblock");
            blockRegistry(BlockList.blockOreMithril, event);
            blockRegistry(BlockList.blockMithril, event);
        }
        if (ConfigRegistryList.registerMolybdenum.get())
        {
            BlockList.blockOreMolybdenum = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "molybdenumore");
            BlockList.blockMolybdenum = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "molybdenumblock");
            blockRegistry(BlockList.blockOreMolybdenum, event);
            blockRegistry(BlockList.blockMolybdenum, event);
        }
        if (ConfigRegistryList.registerNeodymium.get())
        {
            BlockList.blockOreNeodymium = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "neodymiumore");
            BlockList.blockNeodymium = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "neodymiumblock");
            blockRegistry(BlockList.blockOreNeodymium, event);
            blockRegistry(BlockList.blockNeodymium, event);
        }
        if(ConfigRegistryList.registerNeptunium.get())
        {
            BlockList.blockOreNeptunium = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "neptuniumore");
            BlockList.blockNeptunium = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "neptuniumblock");
            blockRegistry(BlockList.blockOreNeptunium, event);
            blockRegistry(BlockList.blockNeptunium, event);
        }
        if (ConfigRegistryList.registerNickel.get())
        {
            BlockList.blockOreNickel = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "nickelore");
            BlockList.blockNickel = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "nickelblock");
            blockRegistry(BlockList.blockOreNickel, event);
            blockRegistry(BlockList.blockNickel, event);
        }
        if (ConfigRegistryList.registerNiobium.get())
        {
            BlockList.blockOreNiobium = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "niobiumore");
            BlockList.blockNiobium = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "niobiumblock");
            blockRegistry(BlockList.blockOreNiobium, event);
            blockRegistry(BlockList.blockNiobium, event);
        }
        if(ConfigRegistryList.registerOnyx.get())
        {
            BlockList.blockOreOnyx = new BlockEXOre(Material.STONE,1.5F,1.5F,"onyxore");
            BlockList.blockOnyx = new BlockEXOre(Material.STONE,1.5F,1.5F,"onyxblock");
            blockRegistry(BlockList.blockOreOnyx,event);
            blockRegistry(BlockList.blockOnyx,event);
        }
        if(ConfigRegistryList.registerOpal.get())
        {
            BlockList.blockOreOpal = new BlockEXOre(Material.STONE,1.5F,1.5F,"opalore");
            BlockList.blockOpal = new BlockEXOre(Material.STONE,1.5F,1.5F,"opalblock");
            blockRegistry(BlockList.blockOreOpal,event);
            blockRegistry(BlockList.blockOpal,event);
        }
        if (ConfigRegistryList.registerOrichalcum.get())
        {
            BlockList.blockOreOrichalcum = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "orichalcumore");
            BlockList.blockOrichalcum = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "orichalcumblock");
            blockRegistry(BlockList.blockOreOrichalcum, event);
            blockRegistry(BlockList.blockOrichalcum, event);
        }
        if(ConfigRegistryList.registerOsmium.get())
        {
            BlockList.blockOreOsmium = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "osmiumore");
            BlockList.blockOsmium = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "osmiumblock");
            blockRegistry(BlockList.blockOreOsmium, event);
            blockRegistry(BlockList.blockOsmium, event);
        }
        if (ConfigRegistryList.registerOureclase.get())
        {
            BlockList.blockOreOureclase = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "oureclaseore");
            BlockList.blockOureclase = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "oureclaseblock");
            blockRegistry(BlockList.blockOreOureclase, event);
            blockRegistry(BlockList.blockOureclase, event);
        }
        if (ConfigRegistryList.registerPalladium.get())
        {
            BlockList.blockOrePalladium = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "palladiumore");
            BlockList.blockPalladium = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "palladiumblock");
            blockRegistry(BlockList.blockOrePalladium, event);
            blockRegistry(BlockList.blockPalladium, event);
        }
        if(ConfigRegistryList.registerPeridot.get())
        {
            BlockList.blockOrePeridot = new BlockEXOre(Material.STONE,1.5F,1.5F,"peridotore");
            BlockList.blockPeridot = new BlockEXOre(Material.STONE,1.5F,1.5F,"peridotblock");
            blockRegistry(BlockList.blockOrePeridot,event);
            blockRegistry(BlockList.blockPeridot,event);
        }
        if(ConfigRegistryList.registerPhoenixite.get())
        {
            BlockList.blockOrePhoenixite = new BlockEXOre(Material.STONE,1.5F,1.5F,"phoenixiteore");
            BlockList.blockPhoenixite = new BlockEXOre(Material.STONE,1.5F,1.5F,"phoenixiteblock");
            blockRegistry(BlockList.blockOrePhoenixite,event);
            blockRegistry(BlockList.blockPhoenixite,event);
        }
        if (ConfigRegistryList.registerPlatinum.get())
        {
            BlockList.blockOrePlatinum = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "platinumore");
            BlockList.blockPlatinum = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "platinumblock");
            blockRegistry(BlockList.blockOrePlatinum, event);
            blockRegistry(BlockList.blockPlatinum, event);
        }
        if(ConfigRegistryList.registerPlutonium.get())
        {
            BlockList.blockOrePlutonium = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "plutoniumore");
            BlockList.blockPlutonium = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "plutoniumblock");
            blockRegistry(BlockList.blockOrePlutonium, event);
            blockRegistry(BlockList.blockPlutonium, event);
        }
        if(ConfigRegistryList.registerPolonium.get())
        {
            BlockList.blockOrePolonium = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "poloniumore");
            BlockList.blockPolonium = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "poloniumblock");
            blockRegistry(BlockList.blockOrePolonium, event);
            blockRegistry(BlockList.blockPolonium, event);
        }
        if (ConfigRegistryList.registerPromethium.get())
        {
            BlockList.blockOrePromethium = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "promethiumore");
            BlockList.blockPromethium = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "promethiumblock");
            blockRegistry(BlockList.blockOrePromethium, event);
            blockRegistry(BlockList.blockPromethium, event);
        }
        if(ConfigRegistryList.registerQuartz.get())
        {
            BlockList.blockOreQuartz = new BlockEXOre(Material.STONE,1.5F,1.5F,"quartzore");
            BlockList.blockQuartz = new BlockEXOre(Material.STONE,1.5F,1.5F,"quartzblock");
            blockRegistry(BlockList.blockOreQuartz,event);
            blockRegistry(BlockList.blockQuartz,event);
        }
        if(ConfigRegistryList.registerRhenium.get())
        {
            BlockList.blockOreRhenium = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "rheniumore");
            BlockList.blockRhenium = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "rheniumblock");
            blockRegistry(BlockList.blockOreRhenium, event);
            blockRegistry(BlockList.blockRhenium, event);
        }
        if (ConfigRegistryList.registerRhodium.get())
        {
            BlockList.blockOreRhodium = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "rhodiumore");
            BlockList.blockRhodium = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "rhodiumblock");
            blockRegistry(BlockList.blockOreRhodium, event);
            blockRegistry(BlockList.blockRhodium, event);
        }
        if (ConfigRegistryList.registerRubracium.get())
        {
            BlockList.blockOreRubracium = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "rubraciumore");
            BlockList.blockRubracium = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "rubraciumblock");
            blockRegistry(BlockList.blockOreRubracium, event);
            blockRegistry(BlockList.blockRubracium, event);
        }
        if(ConfigRegistryList.registerRuby.get())
        {
            BlockList.blockOreRuby = new BlockEXOre(Material.STONE,1.5F,1.5F,"rubyore");
            BlockList.blockRuby = new BlockEXOre(Material.STONE,1.5F,1.5F,"rubyblock");
            blockRegistry(BlockList.blockOreRuby,event);
            blockRegistry(BlockList.blockRuby,event);
        }
        if (ConfigRegistryList.registerRuthenium.get())
        {
            BlockList.blockOreRuthenium = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "rutheniumore");
            BlockList.blockRuthenium = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "rutheniumblock");
            blockRegistry(BlockList.blockOreRuthenium, event);
            blockRegistry(BlockList.blockRuthenium, event);
        }
        if (ConfigRegistryList.registerSanguinite.get())
        {
            BlockList.blockOreSanguinite = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "sanguiniteore");
            BlockList.blockSanguinite = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "sanguiniteblock");
            blockRegistry(BlockList.blockOreSanguinite, event);
            blockRegistry(BlockList.blockSanguinite, event);
        }
        if(ConfigRegistryList.registerSapphire.get())
        {
            BlockList.blockOreSapphire = new BlockEXOre(Material.STONE,1.5F,1.5F,"sapphireore");
            BlockList.blockSapphire = new BlockEXOre(Material.STONE,1.5F,1.5F,"sapphireblock");
            blockRegistry(BlockList.blockOreSapphire,event);
            blockRegistry(BlockList.blockSapphire,event);
        }
        if (ConfigRegistryList.registerShadowIron.get())
        {
            BlockList.blockOreShadowIron = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "shadowironore");
            BlockList.blockShadowIron = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "shadowironblock");
            blockRegistry(BlockList.blockOreShadowIron, event);
            blockRegistry(BlockList.blockShadowIron, event);
        }
        if (ConfigRegistryList.registerSilver.get())
        {
            BlockList.blockOreSilver = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "silverore");
            BlockList.blockSilver = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "silverblock");
            blockRegistry(BlockList.blockOreSilver, event);
            blockRegistry(BlockList.blockSilver, event);
        }
        if(ConfigRegistryList.registerSpinel.get())
        {
            BlockList.blockOreSpinel = new BlockEXOre(Material.STONE,1.5F,1.5F,"spinelore");
            BlockList.blockSpinel = new BlockEXOre(Material.STONE,1.5F,1.5F,"spinelblock");
            blockRegistry(BlockList.blockOreSpinel,event);
            blockRegistry(BlockList.blockSpinel,event);
        }
        if(ConfigRegistryList.registerSugilite.get())
        {
            BlockList.blockOreSugilite = new BlockEXOre(Material.STONE,1.5F,1.5F,"sugiliteore");
            BlockList.blockSugilite = new BlockEXOre(Material.STONE,1.5F,1.5F,"sugiliteblock");
            blockRegistry(BlockList.blockOreSugilite,event);
            blockRegistry(BlockList.blockSugilite,event);
        }
        if(ConfigRegistryList.registerTantalum.get())
        {
            BlockList.blockOreTantalum = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "tantalumore");
            BlockList.blockTantalum = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "tantalumblock");
            blockRegistry(BlockList.blockOreTantalum, event);
            blockRegistry(BlockList.blockTantalum, event);
        }
        if(ConfigRegistryList.registerTanzanite.get())
        {
            BlockList.blockOreTanzanite = new BlockEXOre(Material.STONE,1.5F,1.5F,"tanzaniteore");
            BlockList.blockTanzanite = new BlockEXOre(Material.STONE,1.5F,1.5F,"tanzaniteblock");
            blockRegistry(BlockList.blockOreTanzanite,event);
            blockRegistry(BlockList.blockTanzanite,event);
        }
        if(ConfigRegistryList.registerTartarite.get())
        {
            BlockList.blockOreTartarite = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "tartariteore");
            BlockList.blockTartarite = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "tartariteblock");
            blockRegistry(BlockList.blockOreTartarite, event);
            blockRegistry(BlockList.blockTartarite, event);
        }
        if (ConfigRegistryList.registerTechnetium.get())
        {
            BlockList.blockOreTechnetium = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "technetiumore");
            BlockList.blockTechnetium = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "technetiumblock");
            blockRegistry(BlockList.blockOreTechnetium, event);
            blockRegistry(BlockList.blockTechnetium, event);
        }
        if (ConfigRegistryList.registerThallium.get())
        {
            BlockList.blockOreThallium = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "thalliumore");
            BlockList.blockThallium = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "thalliumblock");
            blockRegistry(BlockList.blockOreThallium, event);
            blockRegistry(BlockList.blockThallium, event);
        }
        if (ConfigRegistryList.registerTin.get())
        {
            BlockList.blockOreTin = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "tinore");
            BlockList.blockTin = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "tinblock");
            blockRegistry(BlockList.blockOreTin, event);
            blockRegistry(BlockList.blockTin, event);
        }
        if (ConfigRegistryList.registerTitanium.get())
        {
            BlockList.blockOreTitanium = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "titaniumore");
            BlockList.blockTitanium = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "titaniumblock");
            blockRegistry(BlockList.blockOreTitanium, event);
            blockRegistry(BlockList.blockTitanium, event);
        }
        if(ConfigRegistryList.registerTopaz.get())
        {
            BlockList.blockOreTopaz = new BlockEXOre(Material.STONE,1.5F,1.5F,"topazore");
            BlockList.blockTopaz = new BlockEXOre(Material.STONE,1.5F,1.5F,"topazblock");
            blockRegistry(BlockList.blockOreTopaz,event);
            blockRegistry(BlockList.blockTopaz,event);
        }
        if(ConfigRegistryList.registerTourmaline.get())
        {
            BlockList.blockOreTourmaline = new BlockEXOre(Material.STONE,1.5F,1.5F,"tourmalineore");
            BlockList.blockTourmaline = new BlockEXOre(Material.STONE,1.5F,1.5F,"tourmalineblock");
            blockRegistry(BlockList.blockOreTourmaline,event);
            blockRegistry(BlockList.blockTourmaline,event);
        }
        if (ConfigRegistryList.registerTungsten.get())
        {
            BlockList.blockOreTungsten = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "tungstenore");
            BlockList.blockTungsten = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "tungstenblock");
            blockRegistry(BlockList.blockOreTungsten, event);
            blockRegistry(BlockList.blockTungsten, event);
        }
        if(ConfigRegistryList.registerTurquoise.get())
        {
            BlockList.blockOreTurquoise = new BlockEXOre(Material.STONE,1.5F,1.5F,"turquoiseore");
            BlockList.blockTurquoise = new BlockEXOre(Material.STONE,1.5F,1.5F,"turquoiseblock");
            blockRegistry(BlockList.blockOreTurquoise,event);
            blockRegistry(BlockList.blockTurquoise,event);
        }
        if (ConfigRegistryList.registerUnobtainium.get())
        {
            BlockList.blockOreUnobtainium = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "unobtainiumore");
            BlockList.blockUnobtainium = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "unobtainiumblock");
            blockRegistry(BlockList.blockOreUnobtainium, event);
            blockRegistry(BlockList.blockUnobtainium, event);
        }
        if (ConfigRegistryList.registerUranium.get())
        {
            BlockList.blockOreUranium = new BlockEXOre(Material.STONE,1.5F,1.5F,"uraniumore");
            BlockList.blockUranium = new BlockEXOre(Material.METAL,1.5F,1.5F,"uraniumblock");
            blockRegistry(BlockList.blockOreUranium,event);
            blockRegistry(BlockList.blockUranium,event);
        }
        if (ConfigRegistryList.registerVanadium.get())
        {
            BlockList.blockOreVanadium = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "vanadiumore");
            BlockList.blockVanadium = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "vanadiumblock");
            blockRegistry(BlockList.blockOreVanadium, event);
            blockRegistry(BlockList.blockVanadium, event);
        }
        if (ConfigRegistryList.registerVulcanite.get())
        {
            BlockList.blockOreVulcanite = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "vulcaniteore");
            BlockList.blockVulcanite = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "vulcaniteblock");
            blockRegistry(BlockList.blockOreVulcanite, event);
            blockRegistry(BlockList.blockVulcanite, event);
        }
        if (ConfigRegistryList.registerVyroxeres.get())
        {
            BlockList.blockOreVyroxeres = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "vyroxeresore");
            BlockList.blockVyroxeres = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "vyroxeresblock");
            blockRegistry(BlockList.blockOreVyroxeres, event);
            blockRegistry(BlockList.blockVyroxeres, event);
        }
        if(ConfigRegistryList.registerYellorite.get())
        {
            BlockList.blockOreYellorite = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "yelloriteore");
            BlockList.blockYellorite = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "yelloriteblock");
            blockRegistry(BlockList.blockOreYellorite, event);
            blockRegistry(BlockList.blockYellorite, event);
        }
        if (ConfigRegistryList.registerZinc.get())
        {
            BlockList.blockOreZinc = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "zincore");
            BlockList.blockZinc = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "zincblock");
            blockRegistry(BlockList.blockOreZinc, event);
            blockRegistry(BlockList.blockZinc, event);
        }
        if (ConfigRegistryList.registerZirconium.get())
        {
            BlockList.blockOreZirconium = new BlockEXOre(Material.STONE, 1.5F, 1.5F, "zirconiumore");
            BlockList.blockZirconium = new BlockEXOre(Material.METAL, 1.5F, 1.5F, "zirconiumblock");
            blockRegistry(BlockList.blockOreZirconium, event);
            blockRegistry(BlockList.blockZirconium, event);
        }
    }

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event)
    {
        if (ConfigRegistryList.registerAdamantine.get())
        {
            ItemList.itemIngotAdamantine = new ItemEXOre(EXORES, "adamantineingot");
            ItemList.itemDustAdamantine = new ItemEXOre(EXORES, "adamantinedust");
            ItemList.itemShardAdamantine = new ItemEXOre(EXORES,"adamantineshard");
            ItemList.itemClumpAdamantine = new ItemEXOre(EXORES,"adamantineclump");
            ItemList.itemDirtyDustAdamantine = new ItemEXOre(EXORES,"adamantinedirtydust");
            ItemList.itemRawAdamantine = new ItemEXOre(EXORES,"rawadamantine");
            ItemBlockList.itemBlockOreAdamantine = new ItemBlockExOre(BlockList.blockOreAdamantine, EXORES);
            //ItemBlockList.itemBlockDeepslateOreAdamantine = new ItemBlockExOre(BlockList.blockDeepslateOreAdamantine,EXORES);
            ItemBlockList.itemBlockAdamantine = new ItemBlockExOre(BlockList.blockAdamantine, EXORES);
            itemRegistry(ItemList.itemIngotAdamantine, event);
            itemRegistry(ItemList.itemDustAdamantine, event);
            itemRegistry(ItemList.itemShardAdamantine,event);
            itemRegistry(ItemList.itemClumpAdamantine,event);
            itemRegistry(ItemList.itemDirtyDustAdamantine,event);
            itemRegistry(ItemList.itemRawAdamantine,event);
            itemRegistry(ItemBlockList.itemBlockOreAdamantine, event);
            //itemRegistry(ItemBlockList.itemBlockDeepslateOreAdamantine,event);
            itemRegistry(ItemBlockList.itemBlockAdamantine, event);
        }
        if(ConfigRegistryList.registerAgate.get())
        {
            ItemList.itemGemAgate = new ItemEXOre(EXORES,"agate");
            ItemBlockList.itemBlockOreAgate = new ItemBlockExOre(BlockList.blockOreAgate,EXORES);
            ItemBlockList.itemBlockAgate = new ItemBlockExOre(BlockList.blockAgate,EXORES);
            itemRegistry(ItemBlockList.itemBlockOreAgate,event);
            itemRegistry(ItemBlockList.itemBlockAgate,event);
            itemRegistry(ItemList.itemGemAgate,event);
        }
        if (ConfigRegistryList.registerAldourite.get())
        {
            ItemList.itemIngotAldourite = new ItemEXOre(EXORES, "aldouriteingot");
            ItemList.itemDustAldourite = new ItemEXOre(EXORES, "aldouritedust");
            ItemList.itemShardAldourite = new ItemEXOre(EXORES,"aldouriteshard");
            ItemList.itemClumpAldourite = new ItemEXOre(EXORES,"aldouriteclump");
            ItemList.itemDirtyDustAldourite = new ItemEXOre(EXORES,"aldouritedirtydust");
            ItemList.itemRawAldourite = new ItemEXOre(EXORES,"rawaldourite");
            ItemBlockList.itemBlockOreAldourite = new ItemBlockExOre(BlockList.blockOreAldourite, EXORES);
            ItemBlockList.itemBlockAldourite = new ItemBlockExOre(BlockList.blockAldourite, EXORES);
            itemRegistry(ItemList.itemIngotAldourite, event);
            itemRegistry(ItemList.itemDustAldourite, event);
            itemRegistry(ItemList.itemShardAldourite,event);
            itemRegistry(ItemList.itemClumpAldourite,event);
            itemRegistry(ItemList.itemDirtyDustAldourite,event);
            itemRegistry(ItemList.itemRawAldourite,event);
            itemRegistry(ItemBlockList.itemBlockOreAldourite, event);
            itemRegistry(ItemBlockList.itemBlockAldourite, event);
        }
        if (ConfigRegistryList.registerAluminum.get())
        {
            ItemList.itemIngotAluminum = new ItemEXOre(EXORES, "aluminumingot");
            ItemList.itemDustAluminum = new ItemEXOre(EXORES, "aluminumdust");
            ItemList.itemShardAluminum = new ItemEXOre(EXORES,"aluminumshard");
            ItemList.itemClumpAluminum = new ItemEXOre(EXORES,"aluminumclump");
            ItemList.itemDirtyDustAluminum = new ItemEXOre(EXORES,"aluminumdirtydust");
            ItemList.itemRawAluminum = new ItemEXOre(EXORES,"rawaluminum");
            ItemBlockList.itemBlockOreAluminum = new ItemBlockExOre(BlockList.blockOreAluminum, EXORES);
            ItemBlockList.itemBlockAluminum = new ItemBlockExOre(BlockList.blockAluminum, EXORES);
            itemRegistry(ItemList.itemIngotAluminum, event);
            itemRegistry(ItemList.itemDustAluminum, event);
            itemRegistry(ItemList.itemShardAluminum,event);
            itemRegistry(ItemList.itemClumpAluminum,event);
            itemRegistry(ItemList.itemDirtyDustAluminum,event);
            itemRegistry(ItemList.itemRawAluminum,event);
            itemRegistry(ItemBlockList.itemBlockOreAluminum, event);
            itemRegistry(ItemBlockList.itemBlockAluminum, event);
        }
        if(ConfigRegistryList.registerAmericium.get())
        {
            ItemList.itemIngotAmericium = new ItemEXOre(EXORES, "americiumingot");
            ItemList.itemDustAmericium = new ItemEXOre(EXORES, "americiumdust");
            ItemList.itemShardAmericium = new ItemEXOre(EXORES,"americiumshard");
            ItemList.itemClumpAmericium = new ItemEXOre(EXORES,"americiumclump");
            ItemList.itemDirtyDustAmericium = new ItemEXOre(EXORES,"americiumdirtydust");
            ItemList.itemRawAmericium = new ItemEXOre(EXORES,"rawamericium");
            ItemBlockList.itemBlockOreAmericium = new ItemBlockExOre(BlockList.blockOreAmericium, EXORES);
            ItemBlockList.itemBlockAmericium = new ItemBlockExOre(BlockList.blockAmericium, EXORES);
            itemRegistry(ItemList.itemIngotAmericium, event);
            itemRegistry(ItemList.itemDustAmericium, event);
            itemRegistry(ItemList.itemShardAmericium,event);
            itemRegistry(ItemList.itemClumpAmericium,event);
            itemRegistry(ItemList.itemDirtyDustAmericium,event);
            itemRegistry(ItemList.itemRawAmericium,event);
            itemRegistry(ItemBlockList.itemBlockOreAmericium, event);
            itemRegistry(ItemBlockList.itemBlockAmericium, event);
        }
        if(ConfigRegistryList.registerAmethyst.get())
        {
            ItemList.itemGemAmethyst = new ItemEXOre(EXORES,"amethyst");
            ItemBlockList.itemBlockOreAmethyst = new ItemBlockExOre(BlockList.blockOreAmethyst,EXORES);
            ItemBlockList.itemBlockAmethyst = new ItemBlockExOre(BlockList.blockAmethyst,EXORES);
            itemRegistry(ItemBlockList.itemBlockOreAmethyst,event);
            itemRegistry(ItemBlockList.itemBlockAmethyst,event);
            itemRegistry(ItemList.itemGemAmethyst,event);
        }
        if(ConfigRegistryList.registerAmetrine.get())
        {
            ItemList.itemGemAmetrine = new ItemEXOre(EXORES,"ametrine");
            ItemBlockList.itemBlockOreAmetrine = new ItemBlockExOre(BlockList.blockOreAmetrine,EXORES);
            ItemBlockList.itemBlockAmetrine = new ItemBlockExOre(BlockList.blockAmetrine,EXORES);
            itemRegistry(ItemBlockList.itemBlockOreAmetrine,event);
            itemRegistry(ItemBlockList.itemBlockAmetrine,event);
            itemRegistry(ItemList.itemGemAmetrine,event);
        }
        if (ConfigRegistryList.registerAmordrine.get())
        {
            ItemList.itemIngotAmordrine = new ItemEXOre(EXORES, "amordrineingot");
            ItemList.itemDustAmordrine = new ItemEXOre(EXORES, "amordrinedust");
            ItemList.itemShardAmordrine = new ItemEXOre(EXORES,"amordrineshard");
            ItemList.itemClumpAmordrine = new ItemEXOre(EXORES,"amordrineclump");
            ItemList.itemDirtyDustAmordrine = new ItemEXOre(EXORES,"amordrinedirtydust");
            ItemList.itemRawAmordrine = new ItemEXOre(EXORES,"rawamordrine");
            ItemBlockList.itemBlockOreAmordrine = new ItemBlockExOre(BlockList.blockOreAmordrine, EXORES);
            ItemBlockList.itemBlockAmordrine = new ItemBlockExOre(BlockList.blockAmordrine, EXORES);
            itemRegistry(ItemList.itemIngotAmordrine, event);
            itemRegistry(ItemList.itemDustAmordrine, event);
            itemRegistry(ItemList.itemShardAmordrine,event);
            itemRegistry(ItemList.itemClumpAmordrine,event);
            itemRegistry(ItemList.itemDirtyDustAmordrine,event);
            itemRegistry(ItemList.itemRawAmordrine,event);
            itemRegistry(ItemBlockList.itemBlockOreAmordrine, event);
            itemRegistry(ItemBlockList.itemBlockAmordrine, event);
        }
        if (ConfigRegistryList.registerAngmallen.get())
        {
            ItemList.itemIngotAngmallen = new ItemEXOre(EXORES, "angmalleningot");
            ItemList.itemDustAngmallen = new ItemEXOre(EXORES, "angmallendust");
            ItemList.itemShardAngmallen = new ItemEXOre(EXORES,"angmallenshard");
            ItemList.itemClumpAngmallen = new ItemEXOre(EXORES,"angmallenclump");
            ItemList.itemDirtyDustAngmallen = new ItemEXOre(EXORES,"angmallendirtydust");
            ItemList.itemRawAngmallen = new ItemEXOre(EXORES,"rawangmallen");
            ItemBlockList.itemBlockOreAngmallen = new ItemBlockExOre(BlockList.blockOreAngmallen, EXORES);
            ItemBlockList.itemBlockAngmallen = new ItemBlockExOre(BlockList.blockAngmallen, EXORES);
            itemRegistry(ItemList.itemIngotAngmallen, event);
            itemRegistry(ItemList.itemDustAngmallen, event);
            itemRegistry(ItemList.itemShardAngmallen,event);
            itemRegistry(ItemList.itemClumpAngmallen,event);
            itemRegistry(ItemList.itemDirtyDustAngmallen,event);
            itemRegistry(ItemList.itemRawAngmallen,event);
            itemRegistry(ItemBlockList.itemBlockOreAngmallen, event);
            itemRegistry(ItemBlockList.itemBlockAngmallen, event);
        }
        if(ConfigRegistryList.registerAquamarine.get())
        {
            ItemList.itemGemAquamarine = new ItemEXOre(EXORES,"aquamarine");
            ItemBlockList.itemBlockOreAquamarine = new ItemBlockExOre(BlockList.blockOreAquamarine,EXORES);
            ItemBlockList.itemBlockAquamarine = new ItemBlockExOre(BlockList.blockAquamarine,EXORES);
            itemRegistry(ItemBlockList.itemBlockOreAquamarine,event);
            itemRegistry(ItemBlockList.itemBlockAquamarine,event);
            itemRegistry(ItemList.itemGemAquamarine,event);
        }
        if (ConfigRegistryList.registerAstralSilver.get())
        {
            ItemList.itemIngotAstralSilver = new ItemEXOre(EXORES, "astralsilveringot");
            ItemList.itemDustAstralSilver = new ItemEXOre(EXORES, "astralsilverdust");
            ItemList.itemShardAstralSilver = new ItemEXOre(EXORES,"astralsilvershard");
            ItemList.itemClumpAstralSilver = new ItemEXOre(EXORES,"astralsilverclump");
            ItemList.itemDirtyDustAstralSilver = new ItemEXOre(EXORES,"astralsilverdirtydust");
            ItemList.itemRawAstralSilver = new ItemEXOre(EXORES,"rawastralsilver");
            ItemBlockList.itemBlockOreAstralSilver = new ItemBlockExOre(BlockList.blockOreAstralSilver, EXORES);
            ItemBlockList.itemBlockAstralSilver = new ItemBlockExOre(BlockList.blockAstralSilver, EXORES);
            itemRegistry(ItemList.itemIngotAstralSilver, event);
            itemRegistry(ItemList.itemDustAstralSilver, event);
            itemRegistry(ItemList.itemShardAstralSilver,event);
            itemRegistry(ItemList.itemClumpAstralSilver,event);
            itemRegistry(ItemList.itemDirtyDustAstralSilver,event);
            itemRegistry(ItemList.itemRawAstralSilver,event);
            itemRegistry(ItemBlockList.itemBlockOreAstralSilver, event);
            itemRegistry(ItemBlockList.itemBlockAstralSilver, event);
        }
        if (ConfigRegistryList.registerAtlarus.get())
        {
            ItemList.itemIngotAtlarus = new ItemEXOre(EXORES, "atlarusingot");
            ItemList.itemDustAtlarus = new ItemEXOre(EXORES, "atlarusdust");
            ItemList.itemShardAtlarus = new ItemEXOre(EXORES,"atlarusshard");
            ItemList.itemClumpAtlarus = new ItemEXOre(EXORES,"atlarusclump");
            ItemList.itemDirtyDustAtlarus = new ItemEXOre(EXORES,"atlarusdirtydust");
            ItemList.itemRawAtlarus = new ItemEXOre(EXORES,"rawatlarus");
            ItemBlockList.itemBlockOreAtlarus = new ItemBlockExOre(BlockList.blockOreAtlarus, EXORES);
            ItemBlockList.itemBlockAtlarus = new ItemBlockExOre(BlockList.blockAtlarus, EXORES);
            itemRegistry(ItemList.itemIngotAtlarus, event);
            itemRegistry(ItemList.itemDustAtlarus, event);
            itemRegistry(ItemList.itemShardAtlarus,event);
            itemRegistry(ItemList.itemClumpAtlarus,event);
            itemRegistry(ItemList.itemDirtyDustAtlarus,event);
            itemRegistry(ItemList.itemRawAtlarus,event);
            itemRegistry(ItemBlockList.itemBlockOreAtlarus, event);
            itemRegistry(ItemBlockList.itemBlockAtlarus, event);
        }
        if (ConfigRegistryList.registerBismuth.get())
        {
            ItemList.itemIngotBismuth = new ItemEXOre(EXORES, "bismuthingot");
            ItemList.itemDustBismuth = new ItemEXOre(EXORES, "bismuthdust");
            ItemList.itemShardBismuth = new ItemEXOre(EXORES,"bismuthshard");
            ItemList.itemClumpBismuth = new ItemEXOre(EXORES,"bismuthclump");
            ItemList.itemDirtyDustBismuth = new ItemEXOre(EXORES,"bismuthdirtydust");
            ItemList.itemRawBismuth = new ItemEXOre(EXORES,"rawbismuth");
            ItemBlockList.itemBlockOreBismuth = new ItemBlockExOre(BlockList.blockOreBismuth, EXORES);
            ItemBlockList.itemBlockBismuth = new ItemBlockExOre(BlockList.blockBismuth, EXORES);
            itemRegistry(ItemList.itemIngotBismuth, event);
            itemRegistry(ItemList.itemDustBismuth, event);
            itemRegistry(ItemList.itemShardBismuth,event);
            itemRegistry(ItemList.itemClumpBismuth,event);
            itemRegistry(ItemList.itemDirtyDustBismuth,event);
            itemRegistry(ItemList.itemRawBismuth,event);
            itemRegistry(ItemBlockList.itemBlockOreBismuth, event);
            itemRegistry(ItemBlockList.itemBlockBismuth, event);
        }
        if (ConfigRegistryList.registerBlackSteel.get())
        {
            ItemList.itemIngotBlackSteel = new ItemEXOre(EXORES, "blacksteelingot");
            ItemList.itemDustBlackSteel = new ItemEXOre(EXORES, "blacksteeldust");
            ItemList.itemShardBlackSteel = new ItemEXOre(EXORES,"blacksteelshard");
            ItemList.itemClumpBlackSteel = new ItemEXOre(EXORES,"blacksteelclump");
            ItemList.itemDirtyDustBlackSteel = new ItemEXOre(EXORES,"blacksteeldirtydust");
            ItemList.itemRawBlackSteel = new ItemEXOre(EXORES,"rawblacksteel");
            ItemBlockList.itemBlockOreBlackSteel = new ItemBlockExOre(BlockList.blockOreBlackSteel, EXORES);
            ItemBlockList.itemBlockBlackSteel = new ItemBlockExOre(BlockList.blockBlackSteel, EXORES);
            itemRegistry(ItemList.itemIngotBlackSteel, event);
            itemRegistry(ItemList.itemDustBlackSteel, event);
            itemRegistry(ItemList.itemShardBlackSteel,event);
            itemRegistry(ItemList.itemClumpBlackSteel,event);
            itemRegistry(ItemList.itemDirtyDustBlackSteel,event);
            itemRegistry(ItemList.itemRawBlackSteel,event);
            itemRegistry(ItemBlockList.itemBlockOreBlackSteel, event);
            itemRegistry(ItemBlockList.itemBlockBlackSteel, event);
        }
        if (ConfigRegistryList.registerCadmium.get())
        {
            ItemList.itemIngotCadmium = new ItemEXOre(EXORES, "cadmiumingot");
            ItemList.itemDustCadmium = new ItemEXOre(EXORES, "cadmiumdust");
            ItemList.itemShardCadmium = new ItemEXOre(EXORES,"cadmiumshard");
            ItemList.itemClumpCadmium = new ItemEXOre(EXORES,"cadmiumclump");
            ItemList.itemDirtyDustCadmium = new ItemEXOre(EXORES,"cadmiumdirtydust");
            ItemList.itemRawCadmium = new ItemEXOre(EXORES,"rawcadmium");
            ItemBlockList.itemBlockOreCadmium = new ItemBlockExOre(BlockList.blockOreCadmium, EXORES);
            ItemBlockList.itemBlockCadmium = new ItemBlockExOre(BlockList.blockCadmium, EXORES);
            itemRegistry(ItemList.itemIngotCadmium, event);
            itemRegistry(ItemList.itemDustCadmium, event);
            itemRegistry(ItemList.itemShardCadmium,event);
            itemRegistry(ItemList.itemClumpCadmium,event);
            itemRegistry(ItemList.itemDirtyDustCadmium,event);
            itemRegistry(ItemList.itemRawCadmium,event);
            itemRegistry(ItemBlockList.itemBlockOreCadmium, event);
            itemRegistry(ItemBlockList.itemBlockCadmium, event);
        }
        if (ConfigRegistryList.registerCarmot.get())
        {
            ItemList.itemIngotCarmot = new ItemEXOre(EXORES, "carmotingot");
            ItemList.itemDustCarmot = new ItemEXOre(EXORES, "carmotdust");
            ItemList.itemShardCarmot = new ItemEXOre(EXORES,"carmotshard");
            ItemList.itemClumpCarmot = new ItemEXOre(EXORES,"carmotclump");
            ItemList.itemDirtyDustCarmot = new ItemEXOre(EXORES,"carmotdirtydust");
            ItemList.itemRawCarmot = new ItemEXOre(EXORES,"rawcarmot");
            ItemBlockList.itemBlockOreCarmot = new ItemBlockExOre(BlockList.blockOreCarmot, EXORES);
            ItemBlockList.itemBlockCarmot = new ItemBlockExOre(BlockList.blockCarmot, EXORES);
            itemRegistry(ItemList.itemIngotCarmot, event);
            itemRegistry(ItemList.itemDustCarmot, event);
            itemRegistry(ItemList.itemShardCarmot,event);
            itemRegistry(ItemList.itemClumpCarmot,event);
            itemRegistry(ItemList.itemDirtyDustCarmot,event);
            itemRegistry(ItemList.itemRawCarmot,event);
            itemRegistry(ItemBlockList.itemBlockOreCarmot, event);
            itemRegistry(ItemBlockList.itemBlockCarmot, event);
        }
        if (ConfigRegistryList.registerCelenegil.get())
        {
            ItemList.itemIngotCelenegil = new ItemEXOre(EXORES, "celenegilingot");
            ItemList.itemDustCelenegil = new ItemEXOre(EXORES, "celenegildust");
            ItemList.itemShardCelenegil = new ItemEXOre(EXORES,"celenegilshard");
            ItemList.itemClumpCelenegil = new ItemEXOre(EXORES,"celenegilclump");
            ItemList.itemDirtyDustCelenegil = new ItemEXOre(EXORES,"celenegildirtydust");
            ItemList.itemRawCelenegil = new ItemEXOre(EXORES,"rawcelenegil");
            ItemBlockList.itemBlockOreCelenegil = new ItemBlockExOre(BlockList.blockOreCelenegil, EXORES);
            ItemBlockList.itemBlockCelenegil = new ItemBlockExOre(BlockList.blockCelenegil, EXORES);
            itemRegistry(ItemList.itemIngotCelenegil, event);
            itemRegistry(ItemList.itemDustCelenegil, event);
            itemRegistry(ItemList.itemShardCelenegil,event);
            itemRegistry(ItemList.itemClumpCelenegil,event);
            itemRegistry(ItemList.itemDirtyDustCelenegil,event);
            itemRegistry(ItemList.itemRawCelenegil,event);
            itemRegistry(ItemBlockList.itemBlockOreCelenegil, event);
            itemRegistry(ItemBlockList.itemBlockCelenegil, event);
        }
        if (ConfigRegistryList.registerCeruclase.get())
        {
            ItemList.itemIngotCeruclase = new ItemEXOre(EXORES, "ceruclaseingot");
            ItemList.itemDustCeruclase = new ItemEXOre(EXORES, "ceruclasedust");
            ItemList.itemShardCeruclase = new ItemEXOre(EXORES,"ceruclaseshard");
            ItemList.itemClumpCeruclase = new ItemEXOre(EXORES,"ceruclaseclump");
            ItemList.itemDirtyDustCeruclase = new ItemEXOre(EXORES,"ceruclasedirtydust");
            ItemList.itemRawCeruclase = new ItemEXOre(EXORES,"rawceruclase");
            ItemBlockList.itemBlockOreCeruclase = new ItemBlockExOre(BlockList.blockOreCeruclase, EXORES);
            ItemBlockList.itemBlockCeruclase = new ItemBlockExOre(BlockList.blockCeruclase, EXORES);
            itemRegistry(ItemList.itemIngotCeruclase, event);
            itemRegistry(ItemList.itemDustCeruclase, event);
            itemRegistry(ItemList.itemShardCeruclase,event);
            itemRegistry(ItemList.itemClumpCeruclase,event);
            itemRegistry(ItemList.itemDirtyDustCeruclase,event);
            itemRegistry(ItemList.itemRawCeruclase,event);
            itemRegistry(ItemBlockList.itemBlockOreCeruclase, event);
            itemRegistry(ItemBlockList.itemBlockCeruclase, event);
        }
        if (ConfigRegistryList.registerChromium.get())
        {
            ItemList.itemIngotChromium = new ItemEXOre(EXORES, "chromiumingot");
            ItemList.itemDustChromium = new ItemEXOre(EXORES, "chromiumdust");
            ItemList.itemShardChromium = new ItemEXOre(EXORES,"chromiumshard");
            ItemList.itemClumpChromium = new ItemEXOre(EXORES,"chromiumclump");
            ItemList.itemDirtyDustChromium = new ItemEXOre(EXORES,"chromiumdirtydust");
            ItemList.itemRawChromium = new ItemEXOre(EXORES,"rawchromium");
            ItemBlockList.itemBlockOreChromium = new ItemBlockExOre(BlockList.blockOreChromium, EXORES);
            ItemBlockList.itemBlockChromium = new ItemBlockExOre(BlockList.blockChromium, EXORES);
            itemRegistry(ItemList.itemIngotChromium, event);
            itemRegistry(ItemList.itemDustChromium, event);
            itemRegistry(ItemList.itemShardChromium,event);
            itemRegistry(ItemList.itemClumpChromium,event);
            itemRegistry(ItemList.itemDirtyDustChromium,event);
            itemRegistry(ItemList.itemRawChromium,event);
            itemRegistry(ItemBlockList.itemBlockOreChromium, event);
            itemRegistry(ItemBlockList.itemBlockChromium, event);
        }
        if(ConfigRegistryList.registerChrysocolla.get())
        {
            ItemList.itemGemChrysocolla = new ItemEXOre(EXORES,"chrysocolla");
            ItemBlockList.itemBlockOreChrysocolla = new ItemBlockExOre(BlockList.blockOreChrysocolla,EXORES);
            ItemBlockList.itemBlockChrysocolla = new ItemBlockExOre(BlockList.blockChrysocolla,EXORES);
            itemRegistry(ItemBlockList.itemBlockOreChrysocolla,event);
            itemRegistry(ItemBlockList.itemBlockChrysocolla,event);
            itemRegistry(ItemList.itemGemChrysocolla,event);
        }
        if(ConfigRegistryList.registerCitrine.get())
        {
            ItemList.itemGemCitrine = new ItemEXOre(EXORES,"citrine");
            ItemBlockList.itemBlockOreCitrine = new ItemBlockExOre(BlockList.blockOreCitrine,EXORES);
            ItemBlockList.itemBlockCitrine = new ItemBlockExOre(BlockList.blockCitrine,EXORES);
            itemRegistry(ItemBlockList.itemBlockOreCitrine,event);
            itemRegistry(ItemBlockList.itemBlockCitrine,event);
            itemRegistry(ItemList.itemGemCitrine,event);
        }
        if (ConfigRegistryList.registerCobalt.get())
        {
            ItemList.itemIngotCobalt = new ItemEXOre(EXORES, "cobaltingot");
            ItemList.itemDustCobalt = new ItemEXOre(EXORES, "cobaltdust");
            ItemList.itemShardCobalt = new ItemEXOre(EXORES,"cobaltshard");
            ItemList.itemClumpCobalt = new ItemEXOre(EXORES,"cobaltclump");
            ItemList.itemDirtyDustCobalt = new ItemEXOre(EXORES,"cobaltdirtydust");
            ItemList.itemRawCobalt = new ItemEXOre(EXORES,"rawcobalt");
            ItemBlockList.itemBlockOreCobalt = new ItemBlockExOre(BlockList.blockOreCobalt, EXORES);
            ItemBlockList.itemBlockCobalt = new ItemBlockExOre(BlockList.blockCobalt, EXORES);
            itemRegistry(ItemList.itemIngotCobalt, event);
            itemRegistry(ItemList.itemDustCobalt, event);
            itemRegistry(ItemList.itemShardCobalt,event);
            itemRegistry(ItemList.itemClumpCobalt,event);
            itemRegistry(ItemList.itemDirtyDustCobalt,event);
            itemRegistry(ItemList.itemRawCobalt,event);
            itemRegistry(ItemBlockList.itemBlockOreCobalt, event);
            itemRegistry(ItemBlockList.itemBlockCobalt, event);
        }
        if (ConfigRegistryList.registerCopper.get())
        {
            ItemList.itemIngotCopper = new ItemEXOre(EXORES, "copperingot");
            ItemList.itemDustCopper = new ItemEXOre(EXORES, "copperdust");
            ItemList.itemShardCopper = new ItemEXOre(EXORES,"coppershard");
            ItemList.itemClumpCopper = new ItemEXOre(EXORES,"copperclump");
            ItemList.itemDirtyDustCopper = new ItemEXOre(EXORES,"copperdirtydust");
            ItemList.itemRawCopper = new ItemEXOre(EXORES,"rawcopper");
            ItemBlockList.itemBlockOreCopper = new ItemBlockExOre(BlockList.blockOreCopper, EXORES);
            ItemBlockList.itemBlockCopper = new ItemBlockExOre(BlockList.blockCopper, EXORES);
            itemRegistry(ItemList.itemIngotCopper, event);
            itemRegistry(ItemList.itemDustCopper, event);
            itemRegistry(ItemList.itemShardCopper,event);
            itemRegistry(ItemList.itemClumpCopper,event);
            itemRegistry(ItemList.itemDirtyDustCopper,event);
            itemRegistry(ItemList.itemRawCopper,event);
            itemRegistry(ItemBlockList.itemBlockOreCopper, event);
            itemRegistry(ItemBlockList.itemBlockCopper, event);
        }
        if (ConfigRegistryList.registerDeepIron.get())
        {
            ItemList.itemIngotDeepIron = new ItemEXOre(EXORES, "deepironingot");
            ItemList.itemDustDeepIron = new ItemEXOre(EXORES, "deepirondust");
            ItemList.itemShardDeepIron = new ItemEXOre(EXORES,"deepironshard");
            ItemList.itemClumpDeepIron = new ItemEXOre(EXORES,"deepironclump");
            ItemList.itemDirtyDustDeepIron = new ItemEXOre(EXORES,"deepirondirtydust");
            ItemList.itemRawDeepIron = new ItemEXOre(EXORES,"rawdeepiron");
            ItemBlockList.itemBlockOreDeepIron = new ItemBlockExOre(BlockList.blockOreDeepIron, EXORES);
            ItemBlockList.itemBlockDeepIron = new ItemBlockExOre(BlockList.blockDeepIron, EXORES);
            itemRegistry(ItemList.itemIngotDeepIron, event);
            itemRegistry(ItemList.itemDustDeepIron, event);
            itemRegistry(ItemList.itemShardDeepIron,event);
            itemRegistry(ItemList.itemClumpDeepIron,event);
            itemRegistry(ItemList.itemDirtyDustDeepIron,event);
            itemRegistry(ItemList.itemRawDeepIron,event);
            itemRegistry(ItemBlockList.itemBlockOreDeepIron, event);
            itemRegistry(ItemBlockList.itemBlockDeepIron, event);
        }
        if(ConfigRegistryList.registerDesichalkos.get())
        {
            ItemList.itemIngotDesichalkos = new ItemEXOre(EXORES, "desichalkosingot");
            ItemList.itemDustDesichalkos = new ItemEXOre(EXORES, "desichalkosdust");
            ItemList.itemShardDesichalkos = new ItemEXOre(EXORES,"desichalkosshard");
            ItemList.itemClumpDesichalkos = new ItemEXOre(EXORES,"desichalkosclump");
            ItemList.itemDirtyDustDesichalkos = new ItemEXOre(EXORES,"desichalkosdirtydust");
            ItemList.itemRawDesichalkos = new ItemEXOre(EXORES,"rawdesichalkos");
            ItemBlockList.itemBlockOreDesichalkos = new ItemBlockExOre(BlockList.blockOreDesichalkos, EXORES);
            ItemBlockList.itemBlockDesichalkos = new ItemBlockExOre(BlockList.blockDesichalkos, EXORES);
            itemRegistry(ItemList.itemIngotDesichalkos, event);
            itemRegistry(ItemList.itemDustDesichalkos, event);
            itemRegistry(ItemList.itemShardDesichalkos,event);
            itemRegistry(ItemList.itemClumpDesichalkos,event);
            itemRegistry(ItemList.itemDirtyDustDesichalkos,event);
            itemRegistry(ItemList.itemRawDesichalkos,event);
            itemRegistry(ItemBlockList.itemBlockOreDesichalkos, event);
            itemRegistry(ItemBlockList.itemBlockDesichalkos, event);
        }
        if(ConfigRegistryList.registerEximite.get())
        {
            ItemList.itemIngotEximite = new ItemEXOre(EXORES, "eximiteingot");
            ItemList.itemDustEximite = new ItemEXOre(EXORES, "eximitedust");
            ItemList.itemShardEximite = new ItemEXOre(EXORES,"eximiteshard");
            ItemList.itemClumpEximite = new ItemEXOre(EXORES,"eximiteclump");
            ItemList.itemDirtyDustEximite = new ItemEXOre(EXORES,"eximitedirtydust");
            ItemList.itemRawEximite = new ItemEXOre(EXORES,"raweximite");
            ItemBlockList.itemBlockOreEximite = new ItemBlockExOre(BlockList.blockOreEximite, EXORES);
            ItemBlockList.itemBlockEximite = new ItemBlockExOre(BlockList.blockEximite, EXORES);
            itemRegistry(ItemList.itemIngotEximite, event);
            itemRegistry(ItemList.itemDustEximite, event);
            itemRegistry(ItemList.itemShardEximite,event);
            itemRegistry(ItemList.itemClumpEximite,event);
            itemRegistry(ItemList.itemDirtyDustEximite,event);
            itemRegistry(ItemList.itemRawEximite,event);
            itemRegistry(ItemBlockList.itemBlockOreEximite, event);
            itemRegistry(ItemBlockList.itemBlockEximite, event);
        }
        if (ConfigRegistryList.registerGallium.get())
        {
            ItemList.itemIngotGallium = new ItemEXOre(EXORES, "galliumingot");
            ItemList.itemDustGallium = new ItemEXOre(EXORES, "galliumdust");
            ItemList.itemShardGallium = new ItemEXOre(EXORES,"galliumshard");
            ItemList.itemClumpGallium = new ItemEXOre(EXORES,"galliumclump");
            ItemList.itemDirtyDustGallium = new ItemEXOre(EXORES,"galliumdirtydust");
            ItemList.itemRawGallium = new ItemEXOre(EXORES,"rawgallium");
            ItemBlockList.itemBlockOreGallium = new ItemBlockExOre(BlockList.blockOreGallium, EXORES);
            ItemBlockList.itemBlockGallium = new ItemBlockExOre(BlockList.blockGallium, EXORES);
            itemRegistry(ItemList.itemIngotGallium, event);
            itemRegistry(ItemList.itemDustGallium, event);
            itemRegistry(ItemList.itemShardGallium,event);
            itemRegistry(ItemList.itemClumpGallium,event);
            itemRegistry(ItemList.itemDirtyDustGallium,event);
            itemRegistry(ItemList.itemRawGallium,event);
            itemRegistry(ItemBlockList.itemBlockOreGallium, event);
            itemRegistry(ItemBlockList.itemBlockGallium, event);
        }
        if(ConfigRegistryList.registerGarnet.get())
        {
            ItemList.itemGemGarnet = new ItemEXOre(EXORES,"garnet");
            ItemBlockList.itemBlockOreGarnet = new ItemBlockExOre(BlockList.blockOreGarnet,EXORES);
            ItemBlockList.itemBlockGarnet = new ItemBlockExOre(BlockList.blockGarnet,EXORES);
            itemRegistry(ItemBlockList.itemBlockOreGarnet,event);
            itemRegistry(ItemBlockList.itemBlockGarnet,event);
            itemRegistry(ItemList.itemGemGarnet,event);
        }
        if (ConfigRegistryList.registerHaderoth.get())
        {
            ItemList.itemIngotHaderoth = new ItemEXOre(EXORES, "haderothingot");
            ItemList.itemDustHaderoth = new ItemEXOre(EXORES, "haderothdust");
            ItemList.itemShardHaderoth = new ItemEXOre(EXORES,"haderothshard");
            ItemList.itemClumpHaderoth = new ItemEXOre(EXORES,"haderothclump");
            ItemList.itemDirtyDustHaderoth = new ItemEXOre(EXORES,"haderothdirtydust");
            ItemList.itemRawHaderoth = new ItemEXOre(EXORES,"rawhaderoth");
            ItemBlockList.itemBlockOreHaderoth = new ItemBlockExOre(BlockList.blockOreHaderoth, EXORES);
            ItemBlockList.itemBlockHaderoth = new ItemBlockExOre(BlockList.blockHaderoth, EXORES);
            itemRegistry(ItemList.itemIngotHaderoth, event);
            itemRegistry(ItemList.itemDustHaderoth, event);
            itemRegistry(ItemList.itemShardHaderoth,event);
            itemRegistry(ItemList.itemClumpHaderoth,event);
            itemRegistry(ItemList.itemDirtyDustHaderoth,event);
            itemRegistry(ItemList.itemRawHaderoth,event);
            itemRegistry(ItemBlockList.itemBlockOreHaderoth, event);
            itemRegistry(ItemBlockList.itemBlockHaderoth, event);
        }
        if (ConfigRegistryList.registerHepatizon.get())
        {
            ItemList.itemIngotHepatizon = new ItemEXOre(EXORES, "hepatizoningot");
            ItemList.itemDustHepatizon = new ItemEXOre(EXORES, "hepatizondust");
            ItemList.itemShardHepatizon = new ItemEXOre(EXORES,"hepatizonshard");
            ItemList.itemClumpHepatizon = new ItemEXOre(EXORES,"hepatizonclump");
            ItemList.itemDirtyDustHepatizon = new ItemEXOre(EXORES,"hepatizondirtydust");
            ItemList.itemRawHepatizon = new ItemEXOre(EXORES,"rawhepatizon");
            ItemBlockList.itemBlockOreHepatizon = new ItemBlockExOre(BlockList.blockOreHepatizon, EXORES);
            ItemBlockList.itemBlockHepatizon = new ItemBlockExOre(BlockList.blockHepatizon, EXORES);
            itemRegistry(ItemList.itemIngotHepatizon, event);
            itemRegistry(ItemList.itemDustHepatizon, event);
            itemRegistry(ItemList.itemShardHepatizon,event);
            itemRegistry(ItemList.itemClumpHepatizon,event);
            itemRegistry(ItemList.itemDirtyDustHepatizon,event);
            itemRegistry(ItemList.itemRawHepatizon,event);
            itemRegistry(ItemBlockList.itemBlockOreHepatizon, event);
            itemRegistry(ItemBlockList.itemBlockHepatizon, event);
        }
        if (ConfigRegistryList.registerIgnatius.get())
        {
            ItemList.itemIngotIgnatius = new ItemEXOre(EXORES, "ignatiusingot");
            ItemList.itemDustIgnatius = new ItemEXOre(EXORES, "ignatiusdust");
            ItemList.itemShardIgnatius = new ItemEXOre(EXORES,"ignatiusshard");
            ItemList.itemClumpIgnatius = new ItemEXOre(EXORES,"ignatiusclump");
            ItemList.itemDirtyDustIgnatius = new ItemEXOre(EXORES,"ignatiusdirtydust");
            ItemList.itemRawIgnatius = new ItemEXOre(EXORES,"rawignatius");
            ItemBlockList.itemBlockOreIgnatius = new ItemBlockExOre(BlockList.blockOreIgnatius, EXORES);
            ItemBlockList.itemBlockIgnatius = new ItemBlockExOre(BlockList.blockIgnatius, EXORES);
            itemRegistry(ItemList.itemIngotIgnatius, event);
            itemRegistry(ItemList.itemDustIgnatius, event);
            itemRegistry(ItemList.itemShardIgnatius,event);
            itemRegistry(ItemList.itemClumpIgnatius,event);
            itemRegistry(ItemList.itemDirtyDustIgnatius,event);
            itemRegistry(ItemList.itemRawIgnatius,event);
            itemRegistry(ItemBlockList.itemBlockOreIgnatius, event);
            itemRegistry(ItemBlockList.itemBlockIgnatius, event);
        }
        if (ConfigRegistryList.registerIndium.get())
        {
            ItemList.itemIngotIndium = new ItemEXOre(EXORES, "indiumingot");
            ItemList.itemDustIndium = new ItemEXOre(EXORES, "indiumdust");
            ItemList.itemShardIndium = new ItemEXOre(EXORES,"indiumshard");
            ItemList.itemClumpIndium = new ItemEXOre(EXORES,"indiumclump");
            ItemList.itemDirtyDustIndium = new ItemEXOre(EXORES,"indiumdirtydust");
            ItemList.itemRawIndium = new ItemEXOre(EXORES,"rawindium");
            ItemBlockList.itemBlockOreIndium = new ItemBlockExOre(BlockList.blockOreIndium, EXORES);
            ItemBlockList.itemBlockIndium = new ItemBlockExOre(BlockList.blockIndium, EXORES);
            itemRegistry(ItemList.itemIngotIndium, event);
            itemRegistry(ItemList.itemDustIndium, event);
            itemRegistry(ItemList.itemShardIndium,event);
            itemRegistry(ItemList.itemClumpIndium,event);
            itemRegistry(ItemList.itemDirtyDustIndium,event);
            itemRegistry(ItemList.itemRawIndium,event);
            itemRegistry(ItemBlockList.itemBlockOreIndium, event);
            itemRegistry(ItemBlockList.itemBlockIndium, event);
        }
        if (ConfigRegistryList.registerInfuscolium.get())
        {
            ItemList.itemIngotInfuscolium = new ItemEXOre(EXORES, "infuscoliumingot");
            ItemList.itemDustInfuscolium = new ItemEXOre(EXORES, "infuscoliumdust");
            ItemList.itemShardInfuscolium = new ItemEXOre(EXORES,"infuscoliumshard");
            ItemList.itemClumpInfuscolium = new ItemEXOre(EXORES,"infuscoliumclump");
            ItemList.itemDirtyDustInfuscolium = new ItemEXOre(EXORES,"infuscoliumdirtydust");
            ItemList.itemRawInfuscolium = new ItemEXOre(EXORES,"rawinfuscolium");
            ItemBlockList.itemBlockOreInfuscolium = new ItemBlockExOre(BlockList.blockOreInfuscolium, EXORES);
            ItemBlockList.itemBlockInfuscolium = new ItemBlockExOre(BlockList.blockInfuscolium, EXORES);
            itemRegistry(ItemList.itemIngotInfuscolium, event);
            itemRegistry(ItemList.itemDustInfuscolium, event);
            itemRegistry(ItemList.itemShardInfuscolium,event);
            itemRegistry(ItemList.itemClumpInfuscolium,event);
            itemRegistry(ItemList.itemDirtyDustInfuscolium,event);
            itemRegistry(ItemList.itemRawInfuscolium,event);
            itemRegistry(ItemBlockList.itemBlockOreInfuscolium, event);
            itemRegistry(ItemBlockList.itemBlockInfuscolium, event);
        }
        if (ConfigRegistryList.registerInolashite.get())
        {
            ItemList.itemIngotInolashite = new ItemEXOre(EXORES, "inolashiteingot");
            ItemList.itemDustInolashite = new ItemEXOre(EXORES, "inolashitedust");
            ItemList.itemShardInolashite = new ItemEXOre(EXORES,"inolashiteshard");
            ItemList.itemClumpInolashite = new ItemEXOre(EXORES,"inolashiteclump");
            ItemList.itemDirtyDustInolashite = new ItemEXOre(EXORES,"inolashitedirtydust");
            ItemList.itemRawInolashite = new ItemEXOre(EXORES,"rawinolashite");
            ItemBlockList.itemBlockOreInolashite = new ItemBlockExOre(BlockList.blockOreInolashite, EXORES);
            ItemBlockList.itemBlockInolashite = new ItemBlockExOre(BlockList.blockInolashite, EXORES);
            itemRegistry(ItemList.itemIngotInolashite, event);
            itemRegistry(ItemList.itemDustInolashite, event);
            itemRegistry(ItemList.itemShardInolashite,event);
            itemRegistry(ItemList.itemClumpInolashite,event);
            itemRegistry(ItemList.itemDirtyDustInolashite,event);
            itemRegistry(ItemList.itemRawInolashite,event);
            itemRegistry(ItemBlockList.itemBlockOreInolashite, event);
            itemRegistry(ItemBlockList.itemBlockInolashite, event);
        }
        if(ConfigRegistryList.registerIolite.get())
        {
            ItemList.itemGemIolite = new ItemEXOre(EXORES,"iolite");
            ItemBlockList.itemBlockOreIolite = new ItemBlockExOre(BlockList.blockOreIolite,EXORES);
            ItemBlockList.itemBlockIolite = new ItemBlockExOre(BlockList.blockIolite,EXORES);
            itemRegistry(ItemBlockList.itemBlockOreIolite,event);
            itemRegistry(ItemBlockList.itemBlockIolite,event);
            itemRegistry(ItemList.itemGemIolite,event);
        }
        if(ConfigRegistryList.registerIridium.get())
        {
            ItemList.itemIngotIridium = new ItemEXOre(EXORES, "iridiumingot");
            ItemList.itemDustIridium = new ItemEXOre(EXORES, "iridiumdust");
            ItemList.itemShardIridium = new ItemEXOre(EXORES,"iridiumshard");
            ItemList.itemClumpIridium = new ItemEXOre(EXORES,"iridiumclump");
            ItemList.itemDirtyDustIridium = new ItemEXOre(EXORES,"iridiumdirtydust");
            ItemList.itemRawIridium = new ItemEXOre(EXORES,"rawiridium");
            ItemBlockList.itemBlockOreIridium = new ItemBlockExOre(BlockList.blockOreIridium, EXORES);
            ItemBlockList.itemBlockIridium = new ItemBlockExOre(BlockList.blockIridium, EXORES);
            itemRegistry(ItemList.itemIngotIridium, event);
            itemRegistry(ItemList.itemDustIridium, event);
            itemRegistry(ItemList.itemShardIridium,event);
            itemRegistry(ItemList.itemClumpIridium,event);
            itemRegistry(ItemList.itemDirtyDustIridium,event);
            itemRegistry(ItemList.itemRawIridium,event);
            itemRegistry(ItemBlockList.itemBlockOreIridium, event);
            itemRegistry(ItemBlockList.itemBlockIridium, event);
        }
        if(ConfigRegistryList.registerJade.get())
        {
            ItemList.itemGemJade = new ItemEXOre(EXORES,"jade");
            ItemBlockList.itemBlockOreJade = new ItemBlockExOre(BlockList.blockOreJade,EXORES);
            ItemBlockList.itemBlockJade = new ItemBlockExOre(BlockList.blockJade,EXORES);
            itemRegistry(ItemBlockList.itemBlockOreJade,event);
            itemRegistry(ItemBlockList.itemBlockJade,event);
            itemRegistry(ItemList.itemGemJade,event);
        }
        if(ConfigRegistryList.registerJasper.get())
        {
            ItemList.itemGemJasper = new ItemEXOre(EXORES,"jasper");
            ItemBlockList.itemBlockOreJasper = new ItemBlockExOre(BlockList.blockOreJasper,EXORES);
            ItemBlockList.itemBlockJasper = new ItemBlockExOre(BlockList.blockJasper,EXORES);
            itemRegistry(ItemBlockList.itemBlockOreJasper,event);
            itemRegistry(ItemBlockList.itemBlockJasper,event);
            itemRegistry(ItemList.itemGemJasper,event);
        }
        if (ConfigRegistryList.registerKalendrite.get())
        {
            ItemList.itemIngotKalendrite = new ItemEXOre(EXORES, "kalendriteingot");
            ItemList.itemDustKalendrite = new ItemEXOre(EXORES, "kalendritedust");
            ItemList.itemShardKalendrite = new ItemEXOre(EXORES,"kalendriteshard");
            ItemList.itemClumpKalendrite = new ItemEXOre(EXORES,"kalendriteclump");
            ItemList.itemDirtyDustKalendrite = new ItemEXOre(EXORES,"kalendritedirtydust");
            ItemList.itemRawKalendrite = new ItemEXOre(EXORES,"rawkalendrite");
            ItemBlockList.itemBlockOreKalendrite = new ItemBlockExOre(BlockList.blockOreKalendrite, EXORES);
            ItemBlockList.itemBlockKalendrite = new ItemBlockExOre(BlockList.blockKalendrite, EXORES);
            itemRegistry(ItemList.itemIngotKalendrite, event);
            itemRegistry(ItemList.itemDustKalendrite, event);
            itemRegistry(ItemList.itemShardKalendrite,event);
            itemRegistry(ItemList.itemClumpKalendrite,event);
            itemRegistry(ItemList.itemDirtyDustKalendrite,event);
            itemRegistry(ItemList.itemRawKalendrite,event);
            itemRegistry(ItemBlockList.itemBlockOreKalendrite, event);
            itemRegistry(ItemBlockList.itemBlockKalendrite, event);
        }
        if(ConfigRegistryList.registerKyanite.get())
        {
            ItemList.itemGemKyanite = new ItemEXOre(EXORES,"kyanite");
            ItemBlockList.itemBlockOreKyanite = new ItemBlockExOre(BlockList.blockOreKyanite,EXORES);
            ItemBlockList.itemBlockKyanite = new ItemBlockExOre(BlockList.blockKyanite,EXORES);
            itemRegistry(ItemBlockList.itemBlockOreKyanite,event);
            itemRegistry(ItemBlockList.itemBlockKyanite,event);
            itemRegistry(ItemList.itemGemKyanite,event);
        }
        if (ConfigRegistryList.registerLead.get())
        {
            ItemList.itemIngotLead = new ItemEXOre(EXORES, "leadingot");
            ItemList.itemDustLead = new ItemEXOre(EXORES, "leaddust");
            ItemList.itemShardLead = new ItemEXOre(EXORES,"leadshard");
            ItemList.itemClumpLead = new ItemEXOre(EXORES,"leadclump");
            ItemList.itemDirtyDustLead = new ItemEXOre(EXORES,"leaddirtydust");
            ItemList.itemRawLead = new ItemEXOre(EXORES,"rawlead");
            ItemBlockList.itemBlockOreLead = new ItemBlockExOre(BlockList.blockOreLead, EXORES);
            ItemBlockList.itemBlockLead = new ItemBlockExOre(BlockList.blockLead, EXORES);
            itemRegistry(ItemList.itemIngotLead, event);
            itemRegistry(ItemList.itemDustLead, event);
            itemRegistry(ItemList.itemShardLead,event);
            itemRegistry(ItemList.itemClumpLead,event);
            itemRegistry(ItemList.itemDirtyDustLead,event);
            itemRegistry(ItemList.itemRawLead,event);
            itemRegistry(ItemBlockList.itemBlockOreLead, event);
            itemRegistry(ItemBlockList.itemBlockLead, event);
        }
        if (ConfigRegistryList.registerLemurite.get())
        {
            ItemList.itemIngotLemurite = new ItemEXOre(EXORES, "lemuriteingot");
            ItemList.itemDustLemurite = new ItemEXOre(EXORES, "lemuritedust");
            ItemList.itemShardLemurite = new ItemEXOre(EXORES,"lemuriteshard");
            ItemList.itemClumpLemurite = new ItemEXOre(EXORES,"lemuriteclump");
            ItemList.itemDirtyDustLemurite = new ItemEXOre(EXORES,"lemuritedirtydust");
            ItemList.itemRawLemurite = new ItemEXOre(EXORES,"rawlemurite");
            ItemBlockList.itemBlockOreLemurite = new ItemBlockExOre(BlockList.blockOreLemurite, EXORES);
            ItemBlockList.itemBlockLemurite = new ItemBlockExOre(BlockList.blockLemurite, EXORES);
            itemRegistry(ItemList.itemIngotLemurite, event);
            itemRegistry(ItemList.itemDustLemurite, event);
            itemRegistry(ItemList.itemShardLemurite,event);
            itemRegistry(ItemList.itemClumpLemurite,event);
            itemRegistry(ItemList.itemDirtyDustLemurite,event);
            itemRegistry(ItemList.itemRawLemurite,event);
            itemRegistry(ItemBlockList.itemBlockOreLemurite, event);
            itemRegistry(ItemBlockList.itemBlockLemurite, event);
        }
        if(ConfigRegistryList.registerMalachite.get())
        {
            ItemList.itemGemMalachite = new ItemEXOre(EXORES,"malachite");
            ItemBlockList.itemBlockOreMalachite = new ItemBlockExOre(BlockList.blockOreMalachite,EXORES);
            ItemBlockList.itemBlockMalachite = new ItemBlockExOre(BlockList.blockMalachite,EXORES);
            itemRegistry(ItemBlockList.itemBlockOreMalachite,event);
            itemRegistry(ItemBlockList.itemBlockMalachite,event);
            itemRegistry(ItemList.itemGemMalachite,event);
        }
        if (ConfigRegistryList.registerManganese.get())
        {
            ItemList.itemIngotManganese = new ItemEXOre(EXORES, "manganeseingot");
            ItemList.itemDustManganese = new ItemEXOre(EXORES, "manganesedust");
            ItemList.itemShardManganese = new ItemEXOre(EXORES,"manganeseshard");
            ItemList.itemClumpManganese = new ItemEXOre(EXORES,"manganeseclump");
            ItemList.itemDirtyDustManganese = new ItemEXOre(EXORES,"manganesedirtydust");
            ItemList.itemRawManganese = new ItemEXOre(EXORES,"rawmanganese");
            ItemBlockList.itemBlockOreManganese = new ItemBlockExOre(BlockList.blockOreManganese, EXORES);
            ItemBlockList.itemBlockManganese = new ItemBlockExOre(BlockList.blockManganese, EXORES);
            itemRegistry(ItemList.itemIngotManganese, event);
            itemRegistry(ItemList.itemDustManganese, event);
            itemRegistry(ItemList.itemShardManganese,event);
            itemRegistry(ItemList.itemClumpManganese,event);
            itemRegistry(ItemList.itemDirtyDustManganese,event);
            itemRegistry(ItemList.itemRawManganese,event);
            itemRegistry(ItemBlockList.itemBlockOreManganese, event);
            itemRegistry(ItemBlockList.itemBlockManganese, event);
        }
        if(ConfigRegistryList.registerMeutoite.get())
        {
            ItemList.itemIngotMeutoite = new ItemEXOre(EXORES, "meutoiteingot");
            ItemList.itemDustMeutoite = new ItemEXOre(EXORES, "meutoitedust");
            ItemList.itemShardMeutoite = new ItemEXOre(EXORES,"meutoiteshard");
            ItemList.itemClumpMeutoite = new ItemEXOre(EXORES,"meutoiteclump");
            ItemList.itemDirtyDustMeutoite = new ItemEXOre(EXORES,"meutoitedirtydust");
            ItemList.itemRawMeutoite = new ItemEXOre(EXORES,"rawmeutoite");
            ItemBlockList.itemBlockOreMeutoite = new ItemBlockExOre(BlockList.blockOreMeutoite, EXORES);
            ItemBlockList.itemBlockMeutoite = new ItemBlockExOre(BlockList.blockMeutoite, EXORES);
            itemRegistry(ItemList.itemIngotMeutoite, event);
            itemRegistry(ItemList.itemDustMeutoite, event);
            itemRegistry(ItemList.itemShardMeutoite,event);
            itemRegistry(ItemList.itemClumpMeutoite,event);
            itemRegistry(ItemList.itemDirtyDustMeutoite,event);
            itemRegistry(ItemList.itemRawMeutoite,event);
            itemRegistry(ItemBlockList.itemBlockOreMeutoite, event);
            itemRegistry(ItemBlockList.itemBlockMeutoite, event);
        }
        if (ConfigRegistryList.registerMidasium.get())
        {
            ItemList.itemIngotMidasium = new ItemEXOre(EXORES, "midasiumingot");
            ItemList.itemDustMidasium = new ItemEXOre(EXORES, "midasiumdust");
            ItemList.itemShardMidasium = new ItemEXOre(EXORES,"midasiumshard");
            ItemList.itemClumpMidasium = new ItemEXOre(EXORES,"midasiumclump");
            ItemList.itemDirtyDustMidasium = new ItemEXOre(EXORES,"midasiumdirtydust");
            ItemList.itemRawMidasium = new ItemEXOre(EXORES,"rawmidasium");
            ItemBlockList.itemBlockOreMidasium = new ItemBlockExOre(BlockList.blockOreMidasium, EXORES);
            ItemBlockList.itemBlockMidasium = new ItemBlockExOre(BlockList.blockMidasium, EXORES);
            itemRegistry(ItemList.itemIngotMidasium, event);
            itemRegistry(ItemList.itemDustMidasium, event);
            itemRegistry(ItemList.itemShardMidasium,event);
            itemRegistry(ItemList.itemClumpMidasium,event);
            itemRegistry(ItemList.itemDirtyDustMidasium,event);
            itemRegistry(ItemList.itemRawMidasium,event);
            itemRegistry(ItemBlockList.itemBlockOreMidasium, event);
            itemRegistry(ItemBlockList.itemBlockMidasium, event);
        }
        if (ConfigRegistryList.registerMithril.get())
        {
            ItemList.itemIngotMithril = new ItemEXOre(EXORES, "mithrilingot");
            ItemList.itemDustMithril = new ItemEXOre(EXORES, "mithrildust");
            ItemList.itemShardMithril = new ItemEXOre(EXORES,"mithrilshard");
            ItemList.itemClumpMithril = new ItemEXOre(EXORES,"mithrilclump");
            ItemList.itemDirtyDustMithril = new ItemEXOre(EXORES,"mithrildirtydust");
            ItemList.itemRawMithril = new ItemEXOre(EXORES,"rawmithril");
            ItemBlockList.itemBlockOreMithril = new ItemBlockExOre(BlockList.blockOreMithril, EXORES);
            ItemBlockList.itemBlockMithril = new ItemBlockExOre(BlockList.blockMithril, EXORES);
            itemRegistry(ItemList.itemIngotMithril, event);
            itemRegistry(ItemList.itemDustMithril, event);
            itemRegistry(ItemList.itemShardMithril,event);
            itemRegistry(ItemList.itemClumpMithril,event);
            itemRegistry(ItemList.itemDirtyDustMithril,event);
            itemRegistry(ItemList.itemRawMithril,event);
            itemRegistry(ItemBlockList.itemBlockOreMithril, event);
            itemRegistry(ItemBlockList.itemBlockMithril, event);
        }
        if (ConfigRegistryList.registerMolybdenum.get())
        {
            ItemList.itemIngotMolybdenum = new ItemEXOre(EXORES, "molybdenumingot");
            ItemList.itemDustMolybdenum = new ItemEXOre(EXORES, "molybdenumdust");
            ItemList.itemShardMolybdenum = new ItemEXOre(EXORES,"molybdenumshard");
            ItemList.itemClumpMolybdenum = new ItemEXOre(EXORES,"molybdenumclump");
            ItemList.itemDirtyDustMolybdenum = new ItemEXOre(EXORES,"molybdenumdirtydust");
            ItemList.itemRawMolybdenum = new ItemEXOre(EXORES,"rawmolybdenum");
            ItemBlockList.itemBlockOreMolybdenum = new ItemBlockExOre(BlockList.blockOreMolybdenum, EXORES);
            ItemBlockList.itemBlockMolybdenum = new ItemBlockExOre(BlockList.blockMolybdenum, EXORES);
            itemRegistry(ItemList.itemIngotMolybdenum, event);
            itemRegistry(ItemList.itemDustMolybdenum, event);
            itemRegistry(ItemList.itemShardMolybdenum,event);
            itemRegistry(ItemList.itemClumpMolybdenum,event);
            itemRegistry(ItemList.itemDirtyDustMolybdenum,event);
            itemRegistry(ItemList.itemRawMolybdenum,event);
            itemRegistry(ItemBlockList.itemBlockOreMolybdenum, event);
            itemRegistry(ItemBlockList.itemBlockMolybdenum, event);
        }
        if (ConfigRegistryList.registerNeodymium.get())
        {
            ItemList.itemIngotNeodymium = new ItemEXOre(EXORES, "neodymiumingot");
            ItemList.itemDustNeodymium = new ItemEXOre(EXORES, "neodymiumdust");
            ItemList.itemShardNeodymium = new ItemEXOre(EXORES,"neodymiumshard");
            ItemList.itemClumpNeodymium = new ItemEXOre(EXORES,"neodymiumclump");
            ItemList.itemDirtyDustNeodymium = new ItemEXOre(EXORES,"neodymiumdirtydust");
            ItemList.itemRawNeodymium = new ItemEXOre(EXORES,"rawneodymium");
            ItemBlockList.itemBlockOreNeodymium = new ItemBlockExOre(BlockList.blockOreNeodymium, EXORES);
            ItemBlockList.itemBlockNeodymium = new ItemBlockExOre(BlockList.blockNeodymium, EXORES);
            itemRegistry(ItemList.itemIngotNeodymium, event);
            itemRegistry(ItemList.itemDustNeodymium, event);
            itemRegistry(ItemList.itemShardNeodymium,event);
            itemRegistry(ItemList.itemClumpNeodymium,event);
            itemRegistry(ItemList.itemDirtyDustNeodymium,event);
            itemRegistry(ItemList.itemRawNeodymium,event);
            itemRegistry(ItemBlockList.itemBlockOreNeodymium, event);
            itemRegistry(ItemBlockList.itemBlockNeodymium, event);
        }
        if(ConfigRegistryList.registerNeptunium.get())
        {
            ItemList.itemIngotNeptunium = new ItemEXOre(EXORES, "neptuniumingot");
            ItemList.itemDustNeptunium = new ItemEXOre(EXORES, "neptuniumdust");
            ItemList.itemShardNeptunium = new ItemEXOre(EXORES,"neptuniumshard");
            ItemList.itemClumpNeptunium = new ItemEXOre(EXORES,"neptuniumclump");
            ItemList.itemDirtyDustNeptunium = new ItemEXOre(EXORES,"neptuniumdirtydust");
            ItemList.itemRawNeptunium = new ItemEXOre(EXORES,"rawneptunium");
            ItemBlockList.itemBlockOreNeptunium = new ItemBlockExOre(BlockList.blockOreNeptunium, EXORES);
            ItemBlockList.itemBlockNeptunium = new ItemBlockExOre(BlockList.blockNeptunium, EXORES);
            itemRegistry(ItemList.itemIngotNeptunium, event);
            itemRegistry(ItemList.itemDustNeptunium, event);
            itemRegistry(ItemList.itemShardNeptunium,event);
            itemRegistry(ItemList.itemClumpNeptunium,event);
            itemRegistry(ItemList.itemDirtyDustNeptunium,event);
            itemRegistry(ItemList.itemRawNeptunium,event);
            itemRegistry(ItemBlockList.itemBlockOreNeptunium, event);
            itemRegistry(ItemBlockList.itemBlockNeptunium, event);
        }
        if (ConfigRegistryList.registerNickel.get())
        {
            ItemList.itemIngotNickel = new ItemEXOre(EXORES, "nickelingot");
            ItemList.itemDustNickel = new ItemEXOre(EXORES, "nickeldust");
            ItemList.itemShardNickel = new ItemEXOre(EXORES,"nickelshard");
            ItemList.itemClumpNickel = new ItemEXOre(EXORES,"nickelclump");
            ItemList.itemDirtyDustNickel = new ItemEXOre(EXORES,"nickeldirtydust");
            ItemList.itemRawNickel = new ItemEXOre(EXORES,"rawnickel");
            ItemBlockList.itemBlockOreNickel = new ItemBlockExOre(BlockList.blockOreNickel, EXORES);
            ItemBlockList.itemBlockNickel = new ItemBlockExOre(BlockList.blockNickel, EXORES);
            itemRegistry(ItemList.itemIngotNickel, event);
            itemRegistry(ItemList.itemDustNickel, event);
            itemRegistry(ItemList.itemShardNickel,event);
            itemRegistry(ItemList.itemClumpNickel,event);
            itemRegistry(ItemList.itemDirtyDustNickel,event);
            itemRegistry(ItemList.itemRawNickel,event);
            itemRegistry(ItemBlockList.itemBlockOreNickel, event);
            itemRegistry(ItemBlockList.itemBlockNickel, event);
        }
        if (ConfigRegistryList.registerNiobium.get())
        {
            ItemList.itemIngotNiobium = new ItemEXOre(EXORES, "niobiumingot");
            ItemList.itemDustNiobium = new ItemEXOre(EXORES, "niobiumdust");
            ItemList.itemShardNiobium = new ItemEXOre(EXORES,"niobiumshard");
            ItemList.itemClumpNiobium = new ItemEXOre(EXORES,"niobiumclump");
            ItemList.itemDirtyDustNiobium = new ItemEXOre(EXORES,"niobiumdirtydust");
            ItemList.itemRawNiobium = new ItemEXOre(EXORES,"rawniobium");
            ItemBlockList.itemBlockOreNiobium = new ItemBlockExOre(BlockList.blockOreNiobium, EXORES);
            ItemBlockList.itemBlockNiobium = new ItemBlockExOre(BlockList.blockNiobium, EXORES);
            itemRegistry(ItemList.itemIngotNiobium, event);
            itemRegistry(ItemList.itemDustNiobium, event);
            itemRegistry(ItemList.itemShardNiobium,event);
            itemRegistry(ItemList.itemClumpNiobium,event);
            itemRegistry(ItemList.itemDirtyDustNiobium,event);
            itemRegistry(ItemList.itemRawNiobium,event);
            itemRegistry(ItemBlockList.itemBlockOreNiobium, event);
            itemRegistry(ItemBlockList.itemBlockNiobium, event);
        }
        if(ConfigRegistryList.registerOnyx.get())
        {
            ItemList.itemGemOnyx = new ItemEXOre(EXORES,"onyx");
            ItemBlockList.itemBlockOreOnyx = new ItemBlockExOre(BlockList.blockOreOnyx,EXORES);
            ItemBlockList.itemBlockOnyx = new ItemBlockExOre(BlockList.blockOnyx,EXORES);
            itemRegistry(ItemBlockList.itemBlockOreOnyx,event);
            itemRegistry(ItemBlockList.itemBlockOnyx,event);
            itemRegistry(ItemList.itemGemOnyx,event);
        }
        if(ConfigRegistryList.registerOpal.get())
        {
            ItemList.itemGemOpal = new ItemEXOre(EXORES,"opal");
            ItemBlockList.itemBlockOreOpal = new ItemBlockExOre(BlockList.blockOreOpal,EXORES);
            ItemBlockList.itemBlockOpal = new ItemBlockExOre(BlockList.blockOpal,EXORES);
            itemRegistry(ItemBlockList.itemBlockOreOpal,event);
            itemRegistry(ItemBlockList.itemBlockOpal,event);
            itemRegistry(ItemList.itemGemOpal,event);
        }
        if (ConfigRegistryList.registerOrichalcum.get())
        {
            ItemList.itemIngotOrichalcum = new ItemEXOre(EXORES, "orichalcumingot");
            ItemList.itemDustOrichalcum = new ItemEXOre(EXORES, "orichalcumdust");
            ItemList.itemShardOrichalcum = new ItemEXOre(EXORES,"orichalcumshard");
            ItemList.itemClumpOrichalcum = new ItemEXOre(EXORES,"orichalcumclump");
            ItemList.itemDirtyDustOrichalcum = new ItemEXOre(EXORES,"orichalcumdirtydust");
            ItemList.itemRawOrichalcum = new ItemEXOre(EXORES,"raworichalcum");
            ItemBlockList.itemBlockOreOrichalcum = new ItemBlockExOre(BlockList.blockOreOrichalcum, EXORES);
            ItemBlockList.itemBlockOrichalcum = new ItemBlockExOre(BlockList.blockOrichalcum, EXORES);
            itemRegistry(ItemList.itemIngotOrichalcum, event);
            itemRegistry(ItemList.itemDustOrichalcum, event);
            itemRegistry(ItemList.itemShardOrichalcum,event);
            itemRegistry(ItemList.itemClumpOrichalcum,event);
            itemRegistry(ItemList.itemDirtyDustOrichalcum,event);
            itemRegistry(ItemList.itemRawOrichalcum,event);
            itemRegistry(ItemBlockList.itemBlockOreOrichalcum, event);
            itemRegistry(ItemBlockList.itemBlockOrichalcum, event);
        }
        if(ConfigRegistryList.registerOsmium.get())
        {
            ItemList.itemIngotOsmium = new ItemEXOre(EXORES, "osmiumingot");
            ItemList.itemDustOsmium = new ItemEXOre(EXORES, "osmiumdust");
            ItemList.itemShardOsmium = new ItemEXOre(EXORES,"osmiumshard");
            ItemList.itemClumpOsmium = new ItemEXOre(EXORES,"osmiumclump");
            ItemList.itemDirtyDustOsmium = new ItemEXOre(EXORES,"osmiumdirtydust");
            ItemList.itemRawOsmium = new ItemEXOre(EXORES,"rawosmium");
            ItemBlockList.itemBlockOreOsmium = new ItemBlockExOre(BlockList.blockOreOsmium, EXORES);
            ItemBlockList.itemBlockOsmium = new ItemBlockExOre(BlockList.blockOsmium, EXORES);
            itemRegistry(ItemList.itemIngotOsmium, event);
            itemRegistry(ItemList.itemDustOsmium, event);
            itemRegistry(ItemList.itemShardOsmium,event);
            itemRegistry(ItemList.itemClumpOsmium,event);
            itemRegistry(ItemList.itemDirtyDustOsmium,event);
            itemRegistry(ItemList.itemRawOsmium,event);
            itemRegistry(ItemBlockList.itemBlockOreOsmium, event);
            itemRegistry(ItemBlockList.itemBlockOsmium, event);
        }
        if (ConfigRegistryList.registerOureclase.get())
        {
            ItemList.itemIngotOureclase = new ItemEXOre(EXORES, "oureclaseingot");
            ItemList.itemDustOureclase = new ItemEXOre(EXORES, "oureclasedust");
            ItemList.itemShardOureclase = new ItemEXOre(EXORES,"oureclaseshard");
            ItemList.itemClumpOureclase = new ItemEXOre(EXORES,"oureclaseclump");
            ItemList.itemDirtyDustOureclase = new ItemEXOre(EXORES,"oureclasedirtydust");
            ItemList.itemRawOureclase = new ItemEXOre(EXORES,"rawoureclase");
            ItemBlockList.itemBlockOreOureclase = new ItemBlockExOre(BlockList.blockOreOureclase, EXORES);
            ItemBlockList.itemBlockOureclase = new ItemBlockExOre(BlockList.blockOureclase, EXORES);
            itemRegistry(ItemList.itemIngotOureclase, event);
            itemRegistry(ItemList.itemDustOureclase, event);
            itemRegistry(ItemList.itemShardOureclase,event);
            itemRegistry(ItemList.itemClumpOureclase,event);
            itemRegistry(ItemList.itemDirtyDustOureclase,event);
            itemRegistry(ItemList.itemRawOureclase,event);
            itemRegistry(ItemBlockList.itemBlockOreOureclase, event);
            itemRegistry(ItemBlockList.itemBlockOureclase, event);
        }
        if (ConfigRegistryList.registerPalladium.get())
        {
            ItemList.itemIngotPalladium = new ItemEXOre(EXORES, "palladiumingot");
            ItemList.itemDustPalladium = new ItemEXOre(EXORES, "palladiumdust");
            ItemList.itemShardPalladium = new ItemEXOre(EXORES,"palladiumshard");
            ItemList.itemClumpPalladium = new ItemEXOre(EXORES,"palladiumclump");
            ItemList.itemDirtyDustPalladium = new ItemEXOre(EXORES,"palladiumdirtydust");
            ItemList.itemRawPalladium = new ItemEXOre(EXORES,"rawpalladium");
            ItemBlockList.itemBlockOrePalladium = new ItemBlockExOre(BlockList.blockOrePalladium, EXORES);
            ItemBlockList.itemBlockPalladium = new ItemBlockExOre(BlockList.blockPalladium, EXORES);
            itemRegistry(ItemList.itemIngotPalladium, event);
            itemRegistry(ItemList.itemDustPalladium, event);
            itemRegistry(ItemList.itemShardPalladium,event);
            itemRegistry(ItemList.itemClumpPalladium,event);
            itemRegistry(ItemList.itemDirtyDustPalladium,event);
            itemRegistry(ItemList.itemRawPalladium,event);
            itemRegistry(ItemBlockList.itemBlockOrePalladium, event);
            itemRegistry(ItemBlockList.itemBlockPalladium, event);
        }
        if(ConfigRegistryList.registerPeridot.get())
        {
            ItemList.itemGemPeridot = new ItemEXOre(EXORES,"peridot");
            ItemBlockList.itemBlockOrePeridot = new ItemBlockExOre(BlockList.blockOrePeridot,EXORES);
            ItemBlockList.itemBlockPeridot = new ItemBlockExOre(BlockList.blockPeridot,EXORES);
            itemRegistry(ItemBlockList.itemBlockOrePeridot,event);
            itemRegistry(ItemBlockList.itemBlockPeridot,event);
            itemRegistry(ItemList.itemGemPeridot,event);
        }
        if(ConfigRegistryList.registerPhoenixite.get())
        {
            ItemList.itemGemPhoenixite = new ItemEXOre(EXORES,"phoenixite");
            ItemBlockList.itemBlockOrePhoenixite = new ItemBlockExOre(BlockList.blockOrePhoenixite,EXORES);
            ItemBlockList.itemBlockPhoenixite = new ItemBlockExOre(BlockList.blockPhoenixite,EXORES);
            itemRegistry(ItemBlockList.itemBlockOrePhoenixite,event);
            itemRegistry(ItemBlockList.itemBlockPhoenixite,event);
            itemRegistry(ItemList.itemGemPhoenixite,event);
        }
        if (ConfigRegistryList.registerPlatinum.get())
        {
            ItemList.itemIngotPlatinum = new ItemEXOre(EXORES, "platinumingot");
            ItemList.itemDustPlatinum = new ItemEXOre(EXORES, "platinumdust");
            ItemList.itemShardPlatinum = new ItemEXOre(EXORES,"platinumshard");
            ItemList.itemClumpPlatinum = new ItemEXOre(EXORES,"platinumclump");
            ItemList.itemDirtyDustPlatinum = new ItemEXOre(EXORES,"platinumdirtydust");
            ItemList.itemRawPlatinum = new ItemEXOre(EXORES,"rawplatinum");
            ItemBlockList.itemBlockOrePlatinum = new ItemBlockExOre(BlockList.blockOrePlatinum, EXORES);
            ItemBlockList.itemBlockPlatinum = new ItemBlockExOre(BlockList.blockPlatinum, EXORES);
            itemRegistry(ItemList.itemIngotPlatinum, event);
            itemRegistry(ItemList.itemDustPlatinum, event);
            itemRegistry(ItemList.itemShardPlatinum,event);
            itemRegistry(ItemList.itemClumpPlatinum,event);
            itemRegistry(ItemList.itemDirtyDustPlatinum,event);
            itemRegistry(ItemList.itemRawPlatinum,event);
            itemRegistry(ItemBlockList.itemBlockOrePlatinum, event);
            itemRegistry(ItemBlockList.itemBlockPlatinum, event);
        }
        if(ConfigRegistryList.registerPlutonium.get())
        {
            ItemList.itemIngotPlutonium = new ItemEXOre(EXORES, "plutoniumingot");
            ItemList.itemDustPlutonium = new ItemEXOre(EXORES, "plutoniumdust");
            ItemList.itemShardPlutonium = new ItemEXOre(EXORES,"plutoniumshard");
            ItemList.itemClumpPlutonium = new ItemEXOre(EXORES,"plutoniumclump");
            ItemList.itemDirtyDustPlutonium = new ItemEXOre(EXORES,"plutoniumdirtydust");
            ItemList.itemRawPlutonium = new ItemEXOre(EXORES,"rawplutonium");
            ItemBlockList.itemBlockOrePlutonium = new ItemBlockExOre(BlockList.blockOrePlutonium, EXORES);
            ItemBlockList.itemBlockPlutonium = new ItemBlockExOre(BlockList.blockPlutonium, EXORES);
            itemRegistry(ItemList.itemIngotPlutonium, event);
            itemRegistry(ItemList.itemDustPlutonium, event);
            itemRegistry(ItemList.itemShardPlutonium,event);
            itemRegistry(ItemList.itemClumpPlutonium,event);
            itemRegistry(ItemList.itemDirtyDustPlutonium,event);
            itemRegistry(ItemList.itemRawPlutonium,event);
            itemRegistry(ItemBlockList.itemBlockOrePlutonium, event);
            itemRegistry(ItemBlockList.itemBlockPlutonium, event);
        }
        if(ConfigRegistryList.registerPolonium.get())
        {
            ItemList.itemIngotPolonium = new ItemEXOre(EXORES, "poloniumingot");
            ItemList.itemDustPolonium = new ItemEXOre(EXORES, "poloniumdust");
            ItemList.itemShardPolonium = new ItemEXOre(EXORES,"poloniumshard");
            ItemList.itemClumpPolonium = new ItemEXOre(EXORES,"poloniumclump");
            ItemList.itemDirtyDustPolonium = new ItemEXOre(EXORES,"poloniumdirtydust");
            ItemList.itemRawPolonium = new ItemEXOre(EXORES,"rawpolonium");
            ItemBlockList.itemBlockOrePolonium = new ItemBlockExOre(BlockList.blockOrePolonium, EXORES);
            ItemBlockList.itemBlockPolonium = new ItemBlockExOre(BlockList.blockPolonium, EXORES);
            itemRegistry(ItemList.itemIngotPolonium, event);
            itemRegistry(ItemList.itemDustPolonium, event);
            itemRegistry(ItemList.itemShardPolonium,event);
            itemRegistry(ItemList.itemClumpPolonium,event);
            itemRegistry(ItemList.itemDirtyDustPolonium,event);
            itemRegistry(ItemList.itemRawPolonium,event);
            itemRegistry(ItemBlockList.itemBlockOrePolonium, event);
            itemRegistry(ItemBlockList.itemBlockPolonium, event);
        }
        if (ConfigRegistryList.registerPromethium.get())
        {
            ItemList.itemIngotPromethium = new ItemEXOre(EXORES, "promethiumingot");
            ItemList.itemDustPromethium = new ItemEXOre(EXORES, "promethiumdust");
            ItemList.itemShardPromethium = new ItemEXOre(EXORES,"promethiumshard");
            ItemList.itemClumpPromethium = new ItemEXOre(EXORES,"promethiumclump");
            ItemList.itemDirtyDustPromethium = new ItemEXOre(EXORES,"promethiumdirtydust");
            ItemList.itemRawPromethium = new ItemEXOre(EXORES,"rawpromethium");
            ItemBlockList.itemBlockOrePromethium = new ItemBlockExOre(BlockList.blockOrePromethium, EXORES);
            ItemBlockList.itemBlockPromethium = new ItemBlockExOre(BlockList.blockPromethium, EXORES);
            itemRegistry(ItemList.itemIngotPromethium, event);
            itemRegistry(ItemList.itemDustPromethium, event);
            itemRegistry(ItemList.itemShardPromethium,event);
            itemRegistry(ItemList.itemClumpPromethium,event);
            itemRegistry(ItemList.itemDirtyDustPromethium,event);
            itemRegistry(ItemList.itemRawPromethium,event);
            itemRegistry(ItemBlockList.itemBlockOrePromethium, event);
            itemRegistry(ItemBlockList.itemBlockPromethium, event);
        }
        if(ConfigRegistryList.registerQuartz.get())
        {
            ItemList.itemGemQuartz = new ItemEXOre(EXORES,"quartz");
            ItemBlockList.itemBlockOreQuartz = new ItemBlockExOre(BlockList.blockOreQuartz,EXORES);
            ItemBlockList.itemBlockQuartz = new ItemBlockExOre(BlockList.blockQuartz,EXORES);
            itemRegistry(ItemList.itemGemQuartz,event);
            itemRegistry(ItemBlockList.itemBlockOreQuartz,event);
            itemRegistry(ItemBlockList.itemBlockQuartz,event);
        }
        if(ConfigRegistryList.registerRhenium.get())
        {
            ItemList.itemIngotRhenium = new ItemEXOre(EXORES, "rheniumingot");
            ItemList.itemDustRhenium = new ItemEXOre(EXORES, "rheniumdust");
            ItemList.itemShardRhenium = new ItemEXOre(EXORES,"rheniumshard");
            ItemList.itemClumpRhenium = new ItemEXOre(EXORES,"rheniumclump");
            ItemList.itemDirtyDustRhenium = new ItemEXOre(EXORES,"rheniumdirtydust");
            ItemList.itemRawRhenium = new ItemEXOre(EXORES,"rawrhenium");
            ItemBlockList.itemBlockOreRhenium = new ItemBlockExOre(BlockList.blockOreRhenium, EXORES);
            ItemBlockList.itemBlockRhenium = new ItemBlockExOre(BlockList.blockRhenium, EXORES);
            itemRegistry(ItemList.itemIngotRhenium, event);
            itemRegistry(ItemList.itemDustRhenium, event);
            itemRegistry(ItemList.itemShardRhenium,event);
            itemRegistry(ItemList.itemClumpRhenium,event);
            itemRegistry(ItemList.itemDirtyDustRhenium,event);
            itemRegistry(ItemList.itemRawRhenium,event);
            itemRegistry(ItemBlockList.itemBlockOreRhenium, event);
            itemRegistry(ItemBlockList.itemBlockRhenium, event);
        }
        if (ConfigRegistryList.registerRhodium.get())
        {
            ItemList.itemIngotRhodium = new ItemEXOre(EXORES, "rhodiumingot");
            ItemList.itemDustRhodium = new ItemEXOre(EXORES, "rhodiumdust");
            ItemList.itemShardRhodium = new ItemEXOre(EXORES,"rhodiumshard");
            ItemList.itemClumpRhodium = new ItemEXOre(EXORES,"rhodiumclump");
            ItemList.itemDirtyDustRhodium = new ItemEXOre(EXORES,"rhodiumdirtydust");
            ItemList.itemRawRhodium = new ItemEXOre(EXORES,"rawrhodium");
            ItemBlockList.itemBlockOreRhodium = new ItemBlockExOre(BlockList.blockOreRhodium, EXORES);
            ItemBlockList.itemBlockRhodium = new ItemBlockExOre(BlockList.blockRhodium, EXORES);
            itemRegistry(ItemList.itemIngotRhodium, event);
            itemRegistry(ItemList.itemDustRhodium, event);
            itemRegistry(ItemList.itemShardRhodium,event);
            itemRegistry(ItemList.itemClumpRhodium,event);
            itemRegistry(ItemList.itemDirtyDustRhodium,event);
            itemRegistry(ItemList.itemRawRhodium,event);
            itemRegistry(ItemBlockList.itemBlockOreRhodium, event);
            itemRegistry(ItemBlockList.itemBlockRhodium, event);
        }
        if (ConfigRegistryList.registerRubracium.get())
        {
            ItemList.itemIngotRubracium = new ItemEXOre(EXORES, "rubraciumingot");
            ItemList.itemDustRubracium = new ItemEXOre(EXORES, "rubraciumdust");
            ItemList.itemShardRubracium = new ItemEXOre(EXORES,"rubraciumshard");
            ItemList.itemClumpRubracium = new ItemEXOre(EXORES,"rubraciumclump");
            ItemList.itemDirtyDustRubracium = new ItemEXOre(EXORES,"rubraciumdirtydust");
            ItemList.itemRawRubracium = new ItemEXOre(EXORES,"rawrubracium");
            ItemBlockList.itemBlockOreRubracium = new ItemBlockExOre(BlockList.blockOreRubracium, EXORES);
            ItemBlockList.itemBlockRubracium = new ItemBlockExOre(BlockList.blockRubracium, EXORES);
            itemRegistry(ItemList.itemIngotRubracium, event);
            itemRegistry(ItemList.itemDustRubracium, event);
            itemRegistry(ItemList.itemShardRubracium,event);
            itemRegistry(ItemList.itemClumpRubracium,event);
            itemRegistry(ItemList.itemDirtyDustRubracium,event);
            itemRegistry(ItemList.itemRawRubracium,event);
            itemRegistry(ItemBlockList.itemBlockOreRubracium, event);
            itemRegistry(ItemBlockList.itemBlockRubracium, event);
        }
        if(ConfigRegistryList.registerRuby.get())
        {
            ItemList.itemGemRuby = new ItemEXOre(EXORES,"ruby");
            ItemBlockList.itemBlockOreRuby = new ItemBlockExOre(BlockList.blockOreRuby,EXORES);
            ItemBlockList.itemBlockRuby = new ItemBlockExOre(BlockList.blockRuby,EXORES);
            itemRegistry(ItemBlockList.itemBlockOreRuby,event);
            itemRegistry(ItemBlockList.itemBlockRuby,event);
            itemRegistry(ItemList.itemGemRuby,event);
        }
        if (ConfigRegistryList.registerRuthenium.get())
        {
            ItemList.itemIngotRuthenium = new ItemEXOre(EXORES, "rutheniumingot");
            ItemList.itemDustRuthenium = new ItemEXOre(EXORES, "rutheniumdust");
            ItemList.itemShardRuthenium = new ItemEXOre(EXORES,"rutheniumshard");
            ItemList.itemClumpRuthenium = new ItemEXOre(EXORES,"rutheniumclump");
            ItemList.itemDirtyDustRuthenium = new ItemEXOre(EXORES,"rutheniumdirtydust");
            ItemList.itemRawRuthenium = new ItemEXOre(EXORES,"rawruthenium");
            ItemBlockList.itemBlockOreRuthenium = new ItemBlockExOre(BlockList.blockOreRuthenium, EXORES);
            ItemBlockList.itemBlockRuthenium = new ItemBlockExOre(BlockList.blockRuthenium, EXORES);
            itemRegistry(ItemList.itemIngotRuthenium, event);
            itemRegistry(ItemList.itemDustRuthenium, event);
            itemRegistry(ItemList.itemShardRuthenium,event);
            itemRegistry(ItemList.itemClumpRuthenium,event);
            itemRegistry(ItemList.itemDirtyDustRuthenium,event);
            itemRegistry(ItemList.itemRawRuthenium,event);
            itemRegistry(ItemBlockList.itemBlockOreRuthenium, event);
            itemRegistry(ItemBlockList.itemBlockRuthenium, event);
        }
        if (ConfigRegistryList.registerSanguinite.get())
        {
            ItemList.itemIngotSanguinite = new ItemEXOre(EXORES, "sanguiniteingot");
            ItemList.itemDustSanguinite = new ItemEXOre(EXORES, "sanguinitedust");
            ItemList.itemShardSanguinite = new ItemEXOre(EXORES,"sanguiniteshard");
            ItemList.itemClumpSanguinite = new ItemEXOre(EXORES,"sanguiniteclump");
            ItemList.itemDirtyDustSanguinite = new ItemEXOre(EXORES,"sanguinitedirtydust");
            ItemList.itemRawSanguinite = new ItemEXOre(EXORES,"rawsanguinite");
            ItemBlockList.itemBlockOreSanguinite = new ItemBlockExOre(BlockList.blockOreSanguinite, EXORES);
            ItemBlockList.itemBlockSanguinite = new ItemBlockExOre(BlockList.blockSanguinite, EXORES);
            itemRegistry(ItemList.itemIngotSanguinite, event);
            itemRegistry(ItemList.itemDustSanguinite, event);
            itemRegistry(ItemList.itemShardSanguinite,event);
            itemRegistry(ItemList.itemClumpSanguinite,event);
            itemRegistry(ItemList.itemDirtyDustSanguinite,event);
            itemRegistry(ItemList.itemRawSanguinite,event);
            itemRegistry(ItemBlockList.itemBlockOreSanguinite, event);
            itemRegistry(ItemBlockList.itemBlockSanguinite, event);
        }
        if(ConfigRegistryList.registerSapphire.get())
        {
            ItemList.itemGemSapphire = new ItemEXOre(EXORES,"sapphire");
            ItemBlockList.itemBlockOreSapphire = new ItemBlockExOre(BlockList.blockOreSapphire,EXORES);
            ItemBlockList.itemBlockSapphire = new ItemBlockExOre(BlockList.blockSapphire,EXORES);
            itemRegistry(ItemBlockList.itemBlockOreSapphire,event);
            itemRegistry(ItemBlockList.itemBlockSapphire,event);
            itemRegistry(ItemList.itemGemSapphire,event);
        }
        if (ConfigRegistryList.registerShadowIron.get())
        {
            ItemList.itemIngotShadowIron = new ItemEXOre(EXORES, "shadowironingot");
            ItemList.itemDustShadowIron = new ItemEXOre(EXORES, "shadowirondust");
            ItemList.itemShardShadowIron = new ItemEXOre(EXORES,"shadowironshard");
            ItemList.itemClumpShadowIron = new ItemEXOre(EXORES,"shadowironclump");
            ItemList.itemDirtyDustShadowIron = new ItemEXOre(EXORES,"shadowirondirtydust");
            ItemList.itemRawShadowIron = new ItemEXOre(EXORES,"rawshadowiron");
            ItemBlockList.itemBlockOreShadowIron = new ItemBlockExOre(BlockList.blockOreShadowIron, EXORES);
            ItemBlockList.itemBlockShadowIron = new ItemBlockExOre(BlockList.blockShadowIron, EXORES);
            itemRegistry(ItemList.itemIngotShadowIron, event);
            itemRegistry(ItemList.itemDustShadowIron, event);
            itemRegistry(ItemList.itemShardShadowIron,event);
            itemRegistry(ItemList.itemClumpShadowIron,event);
            itemRegistry(ItemList.itemDirtyDustShadowIron,event);
            itemRegistry(ItemList.itemRawShadowIron,event);
            itemRegistry(ItemBlockList.itemBlockOreShadowIron, event);
            itemRegistry(ItemBlockList.itemBlockShadowIron, event);
        }
        if (ConfigRegistryList.registerSilver.get())
        {
            ItemList.itemIngotSilver = new ItemEXOre(EXORES, "silveringot");
            ItemList.itemDustSilver = new ItemEXOre(EXORES, "silverdust");
            ItemList.itemShardSilver = new ItemEXOre(EXORES,"silvershard");
            ItemList.itemClumpSilver = new ItemEXOre(EXORES,"silverclump");
            ItemList.itemDirtyDustSilver = new ItemEXOre(EXORES,"silverdirtydust");
            ItemList.itemRawSilver = new ItemEXOre(EXORES,"rawsilver");
            ItemBlockList.itemBlockOreSilver = new ItemBlockExOre(BlockList.blockOreSilver, EXORES);
            ItemBlockList.itemBlockSilver = new ItemBlockExOre(BlockList.blockSilver, EXORES);
            itemRegistry(ItemList.itemIngotSilver, event);
            itemRegistry(ItemList.itemDustSilver, event);
            itemRegistry(ItemList.itemShardSilver,event);
            itemRegistry(ItemList.itemClumpSilver,event);
            itemRegistry(ItemList.itemDirtyDustSilver,event);
            itemRegistry(ItemList.itemRawSilver,event);
            itemRegistry(ItemBlockList.itemBlockOreSilver, event);
            itemRegistry(ItemBlockList.itemBlockSilver, event);
        }
        if(ConfigRegistryList.registerSpinel.get())
        {
            ItemList.itemGemSpinel = new ItemEXOre(EXORES,"spinel");
            ItemBlockList.itemBlockOreSpinel = new ItemBlockExOre(BlockList.blockOreSpinel,EXORES);
            ItemBlockList.itemBlockSpinel = new ItemBlockExOre(BlockList.blockSpinel,EXORES);
            itemRegistry(ItemBlockList.itemBlockOreSpinel,event);
            itemRegistry(ItemBlockList.itemBlockSpinel,event);
            itemRegistry(ItemList.itemGemSpinel,event);
        }
        if(ConfigRegistryList.registerSugilite.get())
        {
            ItemList.itemGemSugilite = new ItemEXOre(EXORES,"sugilite");
            ItemBlockList.itemBlockOreSugilite = new ItemBlockExOre(BlockList.blockOreSugilite,EXORES);
            ItemBlockList.itemBlockSugilite = new ItemBlockExOre(BlockList.blockSugilite,EXORES);
            itemRegistry(ItemBlockList.itemBlockOreSugilite,event);
            itemRegistry(ItemBlockList.itemBlockSugilite,event);
            itemRegistry(ItemList.itemGemSugilite,event);
        }
        if(ConfigRegistryList.registerTantalum.get())
        {
            ItemList.itemIngotTantalum = new ItemEXOre(EXORES, "tantalumingot");
            ItemList.itemDustTantalum = new ItemEXOre(EXORES, "tantalumdust");
            ItemList.itemShardTantalum = new ItemEXOre(EXORES,"tantalumshard");
            ItemList.itemClumpTantalum = new ItemEXOre(EXORES,"tantalumclump");
            ItemList.itemDirtyDustTantalum = new ItemEXOre(EXORES,"tantalumdirtydust");
            ItemList.itemRawTantalum = new ItemEXOre(EXORES,"rawtantalum");
            ItemBlockList.itemBlockOreTantalum = new ItemBlockExOre(BlockList.blockOreTantalum, EXORES);
            ItemBlockList.itemBlockTantalum = new ItemBlockExOre(BlockList.blockTantalum, EXORES);
            itemRegistry(ItemList.itemIngotTantalum, event);
            itemRegistry(ItemList.itemDustTantalum, event);
            itemRegistry(ItemList.itemShardTantalum,event);
            itemRegistry(ItemList.itemClumpTantalum,event);
            itemRegistry(ItemList.itemDirtyDustTantalum,event);
            itemRegistry(ItemList.itemRawTantalum,event);
            itemRegistry(ItemBlockList.itemBlockOreTantalum, event);
            itemRegistry(ItemBlockList.itemBlockTantalum, event);
        }
        if(ConfigRegistryList.registerTanzanite.get())
        {
            ItemList.itemGemTanzanite = new ItemEXOre(EXORES,"tanzanite");
            ItemBlockList.itemBlockOreTanzanite = new ItemBlockExOre(BlockList.blockOreTanzanite,EXORES);
            ItemBlockList.itemBlockTanzanite = new ItemBlockExOre(BlockList.blockTanzanite,EXORES);
            itemRegistry(ItemBlockList.itemBlockOreTanzanite,event);
            itemRegistry(ItemBlockList.itemBlockTanzanite,event);
            itemRegistry(ItemList.itemGemTanzanite,event);
        }
        if(ConfigRegistryList.registerTartarite.get())
        {
            ItemList.itemIngotTartarite = new ItemEXOre(EXORES, "tartariteingot");
            ItemList.itemDustTartarite = new ItemEXOre(EXORES, "tartaritedust");
            ItemList.itemShardTartarite = new ItemEXOre(EXORES,"tartariteshard");
            ItemList.itemClumpTartarite = new ItemEXOre(EXORES,"tartariteclump");
            ItemList.itemDirtyDustTartarite = new ItemEXOre(EXORES,"tartaritedirtydust");
            ItemList.itemRawTartarite = new ItemEXOre(EXORES,"rawtartarite");
            ItemBlockList.itemBlockOreTartarite = new ItemBlockExOre(BlockList.blockOreTartarite, EXORES);
            ItemBlockList.itemBlockTartarite = new ItemBlockExOre(BlockList.blockTartarite, EXORES);
            itemRegistry(ItemList.itemIngotTartarite, event);
            itemRegistry(ItemList.itemDustTartarite, event);
            itemRegistry(ItemList.itemShardTartarite,event);
            itemRegistry(ItemList.itemClumpTartarite,event);
            itemRegistry(ItemList.itemDirtyDustTartarite,event);
            itemRegistry(ItemList.itemRawTartarite,event);
            itemRegistry(ItemBlockList.itemBlockOreTartarite, event);
            itemRegistry(ItemBlockList.itemBlockTartarite, event);
        }
        if (ConfigRegistryList.registerTechnetium.get())
        {
            ItemList.itemIngotTechnetium = new ItemEXOre(EXORES, "technetiumingot");
            ItemList.itemDustTechnetium = new ItemEXOre(EXORES, "technetiumdust");
            ItemList.itemShardTechnetium = new ItemEXOre(EXORES,"technetiumshard");
            ItemList.itemClumpTechnetium = new ItemEXOre(EXORES,"technetiumclump");
            ItemList.itemDirtyDustTechnetium = new ItemEXOre(EXORES,"technetiumdirtydust");
            ItemList.itemRawTechnetium = new ItemEXOre(EXORES,"rawtechnetium");
            ItemBlockList.itemBlockOreTechnetium = new ItemBlockExOre(BlockList.blockOreTechnetium, EXORES);
            ItemBlockList.itemBlockTechnetium = new ItemBlockExOre(BlockList.blockTechnetium, EXORES);
            itemRegistry(ItemList.itemIngotTechnetium, event);
            itemRegistry(ItemList.itemDustTechnetium, event);
            itemRegistry(ItemList.itemShardTechnetium,event);
            itemRegistry(ItemList.itemClumpTechnetium,event);
            itemRegistry(ItemList.itemDirtyDustTechnetium,event);
            itemRegistry(ItemList.itemRawTechnetium,event);
            itemRegistry(ItemBlockList.itemBlockOreTechnetium, event);
            itemRegistry(ItemBlockList.itemBlockTechnetium, event);
        }
        if (ConfigRegistryList.registerThallium.get())
        {
            ItemList.itemIngotThallium = new ItemEXOre(EXORES, "thalliumingot");
            ItemList.itemDustThallium = new ItemEXOre(EXORES, "thalliumdust");
            ItemList.itemShardThallium = new ItemEXOre(EXORES,"thalliumshard");
            ItemList.itemClumpThallium = new ItemEXOre(EXORES,"thalliumclump");
            ItemList.itemDirtyDustThallium = new ItemEXOre(EXORES,"thalliumdirtydust");
            ItemList.itemRawThallium = new ItemEXOre(EXORES,"rawthallium");
            ItemBlockList.itemBlockOreThallium = new ItemBlockExOre(BlockList.blockOreThallium, EXORES);
            ItemBlockList.itemBlockThallium = new ItemBlockExOre(BlockList.blockThallium, EXORES);
            itemRegistry(ItemList.itemIngotThallium, event);
            itemRegistry(ItemList.itemDustThallium, event);
            itemRegistry(ItemList.itemShardThallium,event);
            itemRegistry(ItemList.itemClumpThallium,event);
            itemRegistry(ItemList.itemDirtyDustThallium,event);
            itemRegistry(ItemList.itemRawThallium,event);
            itemRegistry(ItemBlockList.itemBlockOreThallium, event);
            itemRegistry(ItemBlockList.itemBlockThallium, event);
        }
        if (ConfigRegistryList.registerTin.get())
        {
            ItemList.itemIngotTin = new ItemEXOre(EXORES, "tiningot");
            ItemList.itemDustTin = new ItemEXOre(EXORES, "tindust");
            ItemList.itemShardTin = new ItemEXOre(EXORES,"tinshard");
            ItemList.itemClumpTin = new ItemEXOre(EXORES,"tinclump");
            ItemList.itemDirtyDustTin = new ItemEXOre(EXORES,"tindirtydust");
            ItemList.itemRawTin = new ItemEXOre(EXORES,"rawtin");
            ItemBlockList.itemBlockOreTin = new ItemBlockExOre(BlockList.blockOreTin, EXORES);
            ItemBlockList.itemBlockTin = new ItemBlockExOre(BlockList.blockTin, EXORES);
            itemRegistry(ItemList.itemIngotTin, event);
            itemRegistry(ItemList.itemDustTin, event);
            itemRegistry(ItemList.itemShardTin,event);
            itemRegistry(ItemList.itemClumpTin,event);
            itemRegistry(ItemList.itemDirtyDustTin,event);
            itemRegistry(ItemList.itemRawTin,event);
            itemRegistry(ItemBlockList.itemBlockOreTin, event);
            itemRegistry(ItemBlockList.itemBlockTin, event);
        }
        if (ConfigRegistryList.registerTitanium.get())
        {
            ItemList.itemIngotTitanium = new ItemEXOre(EXORES, "titaniumingot");
            ItemList.itemDustTitanium = new ItemEXOre(EXORES, "titaniumdust");
            ItemList.itemShardTitanium = new ItemEXOre(EXORES,"titaniumshard");
            ItemList.itemClumpTitanium = new ItemEXOre(EXORES,"titaniumclump");
            ItemList.itemDirtyDustTitanium = new ItemEXOre(EXORES,"titaniumdirtydust");
            ItemList.itemRawTitanium = new ItemEXOre(EXORES,"rawtitanium");
            ItemBlockList.itemBlockOreTitanium = new ItemBlockExOre(BlockList.blockOreTitanium, EXORES);
            ItemBlockList.itemBlockTitanium = new ItemBlockExOre(BlockList.blockTitanium, EXORES);
            itemRegistry(ItemList.itemIngotTitanium, event);
            itemRegistry(ItemList.itemDustTitanium, event);
            itemRegistry(ItemList.itemShardTitanium,event);
            itemRegistry(ItemList.itemClumpTitanium,event);
            itemRegistry(ItemList.itemDirtyDustTitanium,event);
            itemRegistry(ItemList.itemRawTitanium,event);
            itemRegistry(ItemBlockList.itemBlockOreTitanium, event);
            itemRegistry(ItemBlockList.itemBlockTitanium, event);
        }
        if(ConfigRegistryList.registerTopaz.get())
        {
            ItemList.itemGemTopaz = new ItemEXOre(EXORES,"topaz");
            ItemBlockList.itemBlockOreTopaz = new ItemBlockExOre(BlockList.blockOreTopaz,EXORES);
            ItemBlockList.itemBlockTopaz = new ItemBlockExOre(BlockList.blockTopaz,EXORES);
            itemRegistry(ItemBlockList.itemBlockOreTopaz,event);
            itemRegistry(ItemBlockList.itemBlockTopaz,event);
            itemRegistry(ItemList.itemGemTopaz,event);
        }
        if(ConfigRegistryList.registerTourmaline.get())
        {
            ItemList.itemGemTourmaline = new ItemEXOre(EXORES,"tourmaline");
            ItemBlockList.itemBlockOreTourmaline = new ItemBlockExOre(BlockList.blockOreTourmaline,EXORES);
            ItemBlockList.itemBlockTourmaline = new ItemBlockExOre(BlockList.blockTourmaline,EXORES);
            itemRegistry(ItemBlockList.itemBlockOreTourmaline,event);
            itemRegistry(ItemBlockList.itemBlockTourmaline,event);
            itemRegistry(ItemList.itemGemTourmaline,event);
        }
        if (ConfigRegistryList.registerTungsten.get())
        {
            ItemList.itemIngotTungsten = new ItemEXOre(EXORES, "tungsteningot");
            ItemList.itemDustTungsten = new ItemEXOre(EXORES, "tungstendust");
            ItemList.itemShardTungsten = new ItemEXOre(EXORES,"tungstenshard");
            ItemList.itemClumpTungsten = new ItemEXOre(EXORES,"tungstenclump");
            ItemList.itemDirtyDustTungsten = new ItemEXOre(EXORES,"tungstendirtydust");
            ItemList.itemRawTungsten = new ItemEXOre(EXORES,"rawtungsten");
            ItemBlockList.itemBlockOreTungsten = new ItemBlockExOre(BlockList.blockOreTungsten, EXORES);
            ItemBlockList.itemBlockTungsten = new ItemBlockExOre(BlockList.blockTungsten, EXORES);
            itemRegistry(ItemList.itemIngotTungsten, event);
            itemRegistry(ItemList.itemDustTungsten, event);
            itemRegistry(ItemList.itemShardTungsten,event);
            itemRegistry(ItemList.itemClumpTungsten,event);
            itemRegistry(ItemList.itemDirtyDustTungsten,event);
            itemRegistry(ItemList.itemRawTungsten,event);
            itemRegistry(ItemBlockList.itemBlockOreTungsten, event);
            itemRegistry(ItemBlockList.itemBlockTungsten, event);
        }
        if(ConfigRegistryList.registerTurquoise.get())
        {
            ItemList.itemGemTurquoise = new ItemEXOre(EXORES,"turquoise");
            ItemBlockList.itemBlockOreTurquoise = new ItemBlockExOre(BlockList.blockOreTurquoise,EXORES);
            ItemBlockList.itemBlockTurquoise = new ItemBlockExOre(BlockList.blockTurquoise,EXORES);
            itemRegistry(ItemBlockList.itemBlockOreTurquoise,event);
            itemRegistry(ItemBlockList.itemBlockTurquoise,event);
            itemRegistry(ItemList.itemGemTurquoise,event);
        }
        if (ConfigRegistryList.registerUnobtainium.get())
        {
            ItemList.itemIngotUnobtainium = new ItemEXOre(EXORES, "unobtainiumingot");
            ItemList.itemDustUnobtainium = new ItemEXOre(EXORES, "unobtainiumdust");
            ItemList.itemShardUnobtainium = new ItemEXOre(EXORES,"unobtainiumshard");
            ItemList.itemClumpUnobtainium = new ItemEXOre(EXORES,"unobtainiumclump");
            ItemList.itemDirtyDustUnobtainium = new ItemEXOre(EXORES,"unobtainiumdirtydust");
            ItemList.itemRawUnobtainium = new ItemEXOre(EXORES,"rawunobtainium");
            ItemBlockList.itemBlockOreUnobtainium = new ItemBlockExOre(BlockList.blockOreUnobtainium, EXORES);
            ItemBlockList.itemBlockUnobtainium = new ItemBlockExOre(BlockList.blockUnobtainium, EXORES);
            itemRegistry(ItemList.itemIngotUnobtainium, event);
            itemRegistry(ItemList.itemDustUnobtainium, event);
            itemRegistry(ItemList.itemShardUnobtainium,event);
            itemRegistry(ItemList.itemClumpUnobtainium,event);
            itemRegistry(ItemList.itemDirtyDustUnobtainium,event);
            itemRegistry(ItemList.itemRawUnobtainium,event);
            itemRegistry(ItemBlockList.itemBlockOreUnobtainium, event);
            itemRegistry(ItemBlockList.itemBlockUnobtainium, event);
        }
        if (ConfigRegistryList.registerUranium.get())
        {
            ItemList.itemIngotUranium = new ItemEXOre(EXORES, "uraniumingot");
            ItemList.itemDustUranium = new ItemEXOre(EXORES, "uraniumdust");
            ItemList.itemShardUranium = new ItemEXOre(EXORES,"uraniumshard");
            ItemList.itemClumpUranium = new ItemEXOre(EXORES,"uraniumclump");
            ItemList.itemDirtyDustUranium = new ItemEXOre(EXORES,"uraniumdirtydust");
            ItemList.itemRawUranium = new ItemEXOre(EXORES,"rawuranium");
            ItemBlockList.itemBlockOreUranium = new ItemBlockExOre(BlockList.blockOreUranium, EXORES);
            ItemBlockList.itemBlockUranium = new ItemBlockExOre(BlockList.blockUranium, EXORES);
            itemRegistry(ItemList.itemIngotUranium, event);
            itemRegistry(ItemList.itemDustUranium, event);
            itemRegistry(ItemList.itemShardUranium,event);
            itemRegistry(ItemList.itemClumpUranium,event);
            itemRegistry(ItemList.itemDirtyDustUranium,event);
            itemRegistry(ItemList.itemRawUranium,event);
            itemRegistry(ItemBlockList.itemBlockOreUranium, event);
            itemRegistry(ItemBlockList.itemBlockUranium, event);
        }
        if (ConfigRegistryList.registerVanadium.get())
        {
            ItemList.itemIngotVanadium = new ItemEXOre(EXORES, "vanadiumingot");
            ItemList.itemDustVanadium = new ItemEXOre(EXORES, "vanadiumdust");
            ItemList.itemShardVanadium = new ItemEXOre(EXORES,"vanadiumshard");
            ItemList.itemClumpVanadium = new ItemEXOre(EXORES,"vanadiumclump");
            ItemList.itemDirtyDustVanadium = new ItemEXOre(EXORES,"vanadiumdirtydust");
            ItemList.itemRawVanadium = new ItemEXOre(EXORES,"rawvanadium");
            ItemBlockList.itemBlockOreVanadium = new ItemBlockExOre(BlockList.blockOreVanadium, EXORES);
            ItemBlockList.itemBlockVanadium = new ItemBlockExOre(BlockList.blockVanadium, EXORES);
            itemRegistry(ItemList.itemIngotVanadium, event);
            itemRegistry(ItemList.itemDustVanadium, event);
            itemRegistry(ItemList.itemShardVanadium,event);
            itemRegistry(ItemList.itemClumpVanadium,event);
            itemRegistry(ItemList.itemDirtyDustVanadium,event);
            itemRegistry(ItemList.itemRawVanadium,event);
            itemRegistry(ItemBlockList.itemBlockOreVanadium, event);
            itemRegistry(ItemBlockList.itemBlockVanadium, event);
        }
        if (ConfigRegistryList.registerVulcanite.get())
        {
            ItemList.itemIngotVulcanite = new ItemEXOre(EXORES, "vulcaniteingot");
            ItemList.itemDustVulcanite = new ItemEXOre(EXORES, "vulcanitedust");
            ItemList.itemShardVulcanite = new ItemEXOre(EXORES,"vulcaniteshard");
            ItemList.itemClumpVulcanite = new ItemEXOre(EXORES,"vulcaniteclump");
            ItemList.itemDirtyDustVulcanite = new ItemEXOre(EXORES,"vulcanitedirtydust");
            ItemList.itemRawVulcanite = new ItemEXOre(EXORES,"rawvulcanite");
            ItemBlockList.itemBlockOreVulcanite = new ItemBlockExOre(BlockList.blockOreVulcanite, EXORES);
            ItemBlockList.itemBlockVulcanite = new ItemBlockExOre(BlockList.blockVulcanite, EXORES);
            itemRegistry(ItemList.itemIngotVulcanite, event);
            itemRegistry(ItemList.itemDustVulcanite, event);
            itemRegistry(ItemList.itemShardVulcanite,event);
            itemRegistry(ItemList.itemClumpVulcanite,event);
            itemRegistry(ItemList.itemDirtyDustVulcanite,event);
            itemRegistry(ItemList.itemRawVulcanite,event);
            itemRegistry(ItemBlockList.itemBlockOreVulcanite, event);
            itemRegistry(ItemBlockList.itemBlockVulcanite, event);
        }
        if (ConfigRegistryList.registerVyroxeres.get())
        {
            ItemList.itemIngotVyroxeres = new ItemEXOre(EXORES, "vyroxeresingot");
            ItemList.itemDustVyroxeres = new ItemEXOre(EXORES, "vyroxeresdust");
            ItemList.itemShardVyroxeres = new ItemEXOre(EXORES,"vyroxeresshard");
            ItemList.itemClumpVyroxeres = new ItemEXOre(EXORES,"vyroxeresclump");
            ItemList.itemDirtyDustVyroxeres = new ItemEXOre(EXORES,"vyroxeresdirtydust");
            ItemList.itemRawVyroxeres = new ItemEXOre(EXORES,"rawvyroxeres");
            ItemBlockList.itemBlockOreVyroxeres = new ItemBlockExOre(BlockList.blockOreVyroxeres, EXORES);
            ItemBlockList.itemBlockVyroxeres = new ItemBlockExOre(BlockList.blockVyroxeres, EXORES);
            itemRegistry(ItemList.itemIngotVyroxeres, event);
            itemRegistry(ItemList.itemDustVyroxeres, event);
            itemRegistry(ItemList.itemShardVyroxeres,event);
            itemRegistry(ItemList.itemClumpVyroxeres,event);
            itemRegistry(ItemList.itemDirtyDustVyroxeres,event);
            itemRegistry(ItemList.itemRawVyroxeres,event);
            itemRegistry(ItemBlockList.itemBlockOreVyroxeres, event);
            itemRegistry(ItemBlockList.itemBlockVyroxeres, event);
        }
        if(ConfigRegistryList.registerYellorite.get())
        {
            ItemList.itemIngotYellorite = new ItemEXOre(EXORES, "yelloriteingot");
            ItemList.itemDustYellorite = new ItemEXOre(EXORES, "yelloritedust");
            ItemList.itemShardYellorite = new ItemEXOre(EXORES,"yelloriteshard");
            ItemList.itemClumpYellorite = new ItemEXOre(EXORES,"yelloriteclump");
            ItemList.itemDirtyDustYellorite = new ItemEXOre(EXORES,"yelloritedirtydust");
            ItemList.itemRawYellorite = new ItemEXOre(EXORES,"rawyellorite");
            ItemBlockList.itemBlockOreYellorite = new ItemBlockExOre(BlockList.blockOreYellorite, EXORES);
            ItemBlockList.itemBlockYellorite = new ItemBlockExOre(BlockList.blockYellorite, EXORES);
            itemRegistry(ItemList.itemIngotYellorite, event);
            itemRegistry(ItemList.itemDustYellorite, event);
            itemRegistry(ItemList.itemShardYellorite,event);
            itemRegistry(ItemList.itemClumpYellorite,event);
            itemRegistry(ItemList.itemDirtyDustYellorite,event);
            itemRegistry(ItemList.itemRawYellorite,event);
            itemRegistry(ItemBlockList.itemBlockOreYellorite, event);
            itemRegistry(ItemBlockList.itemBlockYellorite, event);
        }
        if (ConfigRegistryList.registerZinc.get())
        {
            ItemList.itemIngotZinc = new ItemEXOre(EXORES, "zincingot");
            ItemList.itemDustZinc = new ItemEXOre(EXORES, "zincdust");
            ItemList.itemShardZinc = new ItemEXOre(EXORES,"zincshard");
            ItemList.itemClumpZinc = new ItemEXOre(EXORES,"zincclump");
            ItemList.itemDirtyDustZinc = new ItemEXOre(EXORES,"zincdirtydust");
            ItemList.itemRawZinc = new ItemEXOre(EXORES,"rawzinc");
            ItemBlockList.itemBlockOreZinc = new ItemBlockExOre(BlockList.blockOreZinc, EXORES);
            ItemBlockList.itemBlockZinc = new ItemBlockExOre(BlockList.blockZinc, EXORES);
            itemRegistry(ItemList.itemIngotZinc, event);
            itemRegistry(ItemList.itemDustZinc, event);
            itemRegistry(ItemList.itemShardZinc,event);
            itemRegistry(ItemList.itemClumpZinc,event);
            itemRegistry(ItemList.itemDirtyDustZinc,event);
            itemRegistry(ItemList.itemRawZinc,event);
            itemRegistry(ItemBlockList.itemBlockOreZinc, event);
            itemRegistry(ItemBlockList.itemBlockZinc, event);
        }
        if (ConfigRegistryList.registerZirconium.get())
        {
            ItemList.itemIngotZirconium = new ItemEXOre(EXORES, "zirconiumingot");
            ItemList.itemDustZirconium = new ItemEXOre(EXORES, "zirconiumdust");
            ItemList.itemShardZirconium = new ItemEXOre(EXORES,"zirconiumshard");
            ItemList.itemClumpZirconium = new ItemEXOre(EXORES,"zirconiumclump");
            ItemList.itemDirtyDustZirconium = new ItemEXOre(EXORES,"zirconiumdirtydust");
            ItemList.itemRawZirconium = new ItemEXOre(EXORES,"rawzirconium");
            ItemBlockList.itemBlockOreZirconium = new ItemBlockExOre(BlockList.blockOreZirconium, EXORES);
            ItemBlockList.itemBlockZirconium = new ItemBlockExOre(BlockList.blockZirconium, EXORES);
            itemRegistry(ItemList.itemIngotZirconium, event);
            itemRegistry(ItemList.itemDustZirconium, event);
            itemRegistry(ItemList.itemShardZirconium,event);
            itemRegistry(ItemList.itemClumpZirconium,event);
            itemRegistry(ItemList.itemDirtyDustZirconium,event);
            itemRegistry(ItemList.itemRawZirconium,event);
            itemRegistry(ItemBlockList.itemBlockOreZirconium, event);
            itemRegistry(ItemBlockList.itemBlockZirconium, event);
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

package com.tylerh.extraores.Init;

import com.tylerh.extraores.Blocks.BlockEXOre;
import com.tylerh.extraores.Items.*;
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
        if (ConfigRegistryList.registerAdamantine.get())
        {
            BlockList.blockOreAdamantine = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "adamantineore");
            BlockList.blockAdamantine = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "adamantineblock");
            blockRegistry(BlockList.blockOreAdamantine, event);
            blockRegistry(BlockList.blockAdamantine, event);
        }
        if (ConfigRegistryList.registerAldourite.get())
        {
            BlockList.blockOreAldourite = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "aldouriteore");
            BlockList.blockAldourite = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "aldouriteblock");
            blockRegistry(BlockList.blockOreAldourite, event);
            blockRegistry(BlockList.blockAldourite, event);
        }
        if (ConfigRegistryList.registerAluminum.get())
        {
            BlockList.blockOreAluminum = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "aluminumore");
            BlockList.blockAluminum = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "aluminumblock");
            blockRegistry(BlockList.blockOreAluminum, event);
            blockRegistry(BlockList.blockAluminum, event);
        }
        if (ConfigRegistryList.registerAmordrine.get())
        {
            BlockList.blockOreAmordrine = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "amordrineore");
            BlockList.blockAmordrine = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "amordrineblock");
            blockRegistry(BlockList.blockOreAmordrine, event);
            blockRegistry(BlockList.blockAmordrine, event);
        }
        if (ConfigRegistryList.registerAngmallen.get())
        {
            BlockList.blockOreAngmallen = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "angmallenore");
            BlockList.blockAngmallen = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "angmallenblock");
            blockRegistry(BlockList.blockOreAngmallen, event);
            blockRegistry(BlockList.blockAngmallen, event);
        }
        if (ConfigRegistryList.registerAstralSilver.get())
        {
            BlockList.blockOreAstralSilver = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "astralsilverore");
            BlockList.blockAstralSilver = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "astralsilverblock");
            blockRegistry(BlockList.blockOreAstralSilver, event);
            blockRegistry(BlockList.blockAstralSilver, event);
        }
        if (ConfigRegistryList.registerAtlarus.get())
        {
            BlockList.blockOreAtlarus = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "atlarusore");
            BlockList.blockAtlarus = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "atlarusblock");
            blockRegistry(BlockList.blockOreAtlarus, event);
            blockRegistry(BlockList.blockAtlarus, event);
        }
        if (ConfigRegistryList.registerBismuth.get())
        {
            BlockList.blockOreBismuth = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "bismuthore");
            BlockList.blockBismuth = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "bismuthblock");
            blockRegistry(BlockList.blockOreBismuth, event);
            blockRegistry(BlockList.blockBismuth, event);
        }
        if (ConfigRegistryList.registerBlackSteel.get())
        {
            BlockList.blockOreBlackSteel = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "blacksteelore");
            BlockList.blockBlackSteel = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "blacksteelblock");
            blockRegistry(BlockList.blockOreBlackSteel, event);
            blockRegistry(BlockList.blockBlackSteel, event);
        }
        if (ConfigRegistryList.registerCadmium.get())
        {
            BlockList.blockOreCadmium = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "cadmiumore");
            BlockList.blockCadmium = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "cadmiumblock");
            blockRegistry(BlockList.blockOreCadmium, event);
            blockRegistry(BlockList.blockCadmium, event);
        }
        if (ConfigRegistryList.registerCarmot.get())
        {
            BlockList.blockOreCarmot = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "carmotore");
            BlockList.blockCarmot = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "carmotblock");
            blockRegistry(BlockList.blockOreCarmot, event);
            blockRegistry(BlockList.blockCarmot, event);
        }
        if (ConfigRegistryList.registerCelenegil.get())
        {
            BlockList.blockOreCelenegil = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "celenegilore");
            BlockList.blockCelenegil = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "celenegilblock");
            blockRegistry(BlockList.blockOreCelenegil, event);
            blockRegistry(BlockList.blockCelenegil, event);
        }
        if (ConfigRegistryList.registerCeruclase.get())
        {
            BlockList.blockOreCeruclase = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "ceruclaseore");
            BlockList.blockCeruclase = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "ceruclaseblock");
            blockRegistry(BlockList.blockOreCeruclase, event);
            blockRegistry(BlockList.blockCeruclase, event);
        }
        if (ConfigRegistryList.registerChromium.get())
        {
            BlockList.blockOreChromium = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "chromiumore");
            BlockList.blockChromium = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "chromiumblock");
            blockRegistry(BlockList.blockOreChromium, event);
            blockRegistry(BlockList.blockChromium, event);
        }
        if (ConfigRegistryList.registerCobalt.get())
        {
            BlockList.blockOreCobalt = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "cobaltore");
            BlockList.blockCobalt = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "cobaltblock");
            blockRegistry(BlockList.blockOreCobalt, event);
            blockRegistry(BlockList.blockCobalt, event);
        }
        if (ConfigRegistryList.registerCopper.get())
        {
            BlockList.blockOreCopper = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "copperore");
            BlockList.blockCopper = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "copperblock");
            blockRegistry(BlockList.blockOreCopper, event);
            blockRegistry(BlockList.blockCopper, event);
        }
        if (ConfigRegistryList.registerDeepIron.get())
        {
            BlockList.blockOreDeepIron = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "deepironore");
            BlockList.blockDeepIron = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "deepironblock");
            blockRegistry(BlockList.blockOreDeepIron, event);
            blockRegistry(BlockList.blockDeepIron, event);
        }
        if(ConfigRegistryList.registerDesichalkos.get())
        {
            BlockList.blockOreDesichalkos = new BlockEXOre(Material.ROCK,3.0f,5.0f,"desichalkosore");
            BlockList.blockDesichalkos = new BlockEXOre(Material.IRON,3.0f,5.0f,"desichalkosblock");
            blockRegistry(BlockList.blockOreDesichalkos,event);
            blockRegistry(BlockList.blockDesichalkos,event);
        }
        if(ConfigRegistryList.registerEximite.get())
        {
            BlockList.blockOreEximite = new BlockEXOre(Material.ROCK,3.0f,5.0f,"eximiteore");
            BlockList.blockEximite = new BlockEXOre(Material.IRON,3.0f,5.0f,"eximiteblock");
            blockRegistry(BlockList.blockOreEximite,event);
            blockRegistry(BlockList.blockEximite,event);
        }
        if (ConfigRegistryList.registerGallium.get())
        {
            BlockList.blockOreGallium = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "galliumore");
            BlockList.blockGallium = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "galliumblock");
            blockRegistry(BlockList.blockOreGallium, event);
            blockRegistry(BlockList.blockGallium, event);
        }
        if (ConfigRegistryList.registerHaderoth.get())
        {
            BlockList.blockOreHaderoth = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "haderothore");
            BlockList.blockHaderoth = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "haderothblock");
            blockRegistry(BlockList.blockOreHaderoth, event);
            blockRegistry(BlockList.blockHaderoth, event);
        }
        if (ConfigRegistryList.registerHepatizon.get())
        {
            BlockList.blockOreHepatizon = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "hepatizonore");
            BlockList.blockHepatizon = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "hepatizonblock");
            blockRegistry(BlockList.blockOreHepatizon, event);
            blockRegistry(BlockList.blockHepatizon, event);
        }
        if (ConfigRegistryList.registerIgnatius.get())
        {
            BlockList.blockOreIgnatius = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "ignatiusore");
            BlockList.blockIgnatius = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "ignatiusblock");
            blockRegistry(BlockList.blockOreIgnatius, event);
            blockRegistry(BlockList.blockIgnatius, event);
        }
        if (ConfigRegistryList.registerIndium.get())
        {
            BlockList.blockOreIndium = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "indiumore");
            BlockList.blockIndium = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "indiumblock");
            blockRegistry(BlockList.blockOreIndium, event);
            blockRegistry(BlockList.blockIndium, event);
        }
        if (ConfigRegistryList.registerInfuscolium.get())
        {
            BlockList.blockOreInfuscolium = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "infuscoliumore");
            BlockList.blockInfuscolium = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "infuscoliumblock");
            blockRegistry(BlockList.blockOreInfuscolium, event);
            blockRegistry(BlockList.blockInfuscolium, event);
        }
        if (ConfigRegistryList.registerInolashite.get())
        {
            BlockList.blockOreInolashite = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "inolashiteore");
            BlockList.blockInolashite = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "inolashiteblock");
            blockRegistry(BlockList.blockOreInolashite, event);
            blockRegistry(BlockList.blockInolashite, event);
        }
        if (ConfigRegistryList.registerKalendrite.get())
        {
            BlockList.blockOreKalendrite = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "kalendriteore");
            BlockList.blockKalendrite = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "kalendriteblock");
            blockRegistry(BlockList.blockOreKalendrite, event);
            blockRegistry(BlockList.blockKalendrite, event);
        }
        if (ConfigRegistryList.registerLead.get())
        {
            BlockList.blockOreLead = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "leadore");
            BlockList.blockLead = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "leadblock");
            blockRegistry(BlockList.blockOreLead, event);
            blockRegistry(BlockList.blockLead, event);
        }
        if (ConfigRegistryList.registerLemurite.get())
        {
            BlockList.blockOreLemurite = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "lemuriteore");
            BlockList.blockLemurite = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "lemuriteblock");
            blockRegistry(BlockList.blockOreLemurite, event);
            blockRegistry(BlockList.blockLemurite, event);
        }
        if (ConfigRegistryList.registerManganese.get())
        {
            BlockList.blockOreManganese = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "manganeseore");
            BlockList.blockManganese = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "manganeseblock");
            blockRegistry(BlockList.blockOreManganese, event);
            blockRegistry(BlockList.blockManganese, event);
        }
        if(ConfigRegistryList.registerMeutoite.get())
        {
            BlockList.blockOreMeutoite = new BlockEXOre(Material.ROCK,3.0f,5.0f,"meutoiteore");
            BlockList.blockMeutoite = new BlockEXOre(Material.IRON,3.0f,5.0f,"meutoiteblock");
            blockRegistry(BlockList.blockOreMeutoite,event);
            blockRegistry(BlockList.blockMeutoite,event);
        }
        if (ConfigRegistryList.registerMidasium.get())
        {
            BlockList.blockOreMidasium = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "midasiumore");
            BlockList.blockMidasium = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "midasiumblock");
            blockRegistry(BlockList.blockOreMidasium, event);
            blockRegistry(BlockList.blockMidasium, event);
        }
        if (ConfigRegistryList.registerMithril.get())
        {
            BlockList.blockOreMithril = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "mithrilore");
            BlockList.blockMithril = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "mithrilblock");
            blockRegistry(BlockList.blockOreMithril, event);
            blockRegistry(BlockList.blockMithril, event);
        }
        if (ConfigRegistryList.registerMolybdenum.get())
        {
            BlockList.blockOreMolybdenum = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "molybdenumore");
            BlockList.blockMolybdenum = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "molybdenumblock");
            blockRegistry(BlockList.blockOreMolybdenum, event);
            blockRegistry(BlockList.blockMolybdenum, event);
        }
        if (ConfigRegistryList.registerNeodymium.get())
        {
            BlockList.blockOreNeodymium = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "neodymiumore");
            BlockList.blockNeodymium = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "neodymiumblock");
            blockRegistry(BlockList.blockOreNeodymium, event);
            blockRegistry(BlockList.blockNeodymium, event);
        }
        if (ConfigRegistryList.registerNickel.get())
        {
            BlockList.blockOreNickel = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "nickelore");
            BlockList.blockNickel = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "nickelblock");
            blockRegistry(BlockList.blockOreNickel, event);
            blockRegistry(BlockList.blockNickel, event);
        }
        if (ConfigRegistryList.registerNiobium.get())
        {
            BlockList.blockOreNiobium = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "niobiumore");
            BlockList.blockNiobium = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "niobiumblock");
            blockRegistry(BlockList.blockOreNiobium, event);
            blockRegistry(BlockList.blockNiobium, event);
        }
        if (ConfigRegistryList.registerOrichalcum.get())
        {
            BlockList.blockOreOrichalcum = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "orichalcumore");
            BlockList.blockOrichalcum = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "orichalcumblock");
            blockRegistry(BlockList.blockOreOrichalcum, event);
            blockRegistry(BlockList.blockOrichalcum, event);
        }
        if (ConfigRegistryList.registerOureclase.get())
        {
            BlockList.blockOreOureclase = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "oureclaseore");
            BlockList.blockOureclase = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "oureclaseblock");
            blockRegistry(BlockList.blockOreOureclase, event);
            blockRegistry(BlockList.blockOureclase, event);
        }
        if (ConfigRegistryList.registerPalladium.get())
        {
            BlockList.blockOrePalladium = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "palladiumore");
            BlockList.blockPalladium = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "palladiumblock");
            blockRegistry(BlockList.blockOrePalladium, event);
            blockRegistry(BlockList.blockPalladium, event);
        }
        if (ConfigRegistryList.registerPlatinum.get())
        {
            BlockList.blockOrePlatinum = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "platinumore");
            BlockList.blockPlatinum = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "platinumblock");
            blockRegistry(BlockList.blockOrePlatinum, event);
            blockRegistry(BlockList.blockPlatinum, event);
        }
        if (ConfigRegistryList.registerPrometheum.get())
        {
            BlockList.blockOrePrometheum = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "prometheumore");
            BlockList.blockPrometheum = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "prometheumblock");
            blockRegistry(BlockList.blockOrePrometheum, event);
            blockRegistry(BlockList.blockPrometheum, event);
        }
        if (ConfigRegistryList.registerRhodium.get())
        {
            BlockList.blockOreRhodium = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "rhodiumore");
            BlockList.blockRhodium = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "rhodiumblock");
            blockRegistry(BlockList.blockOreRhodium, event);
            blockRegistry(BlockList.blockRhodium, event);
        }
        if (ConfigRegistryList.registerRubracium.get())
        {
            BlockList.blockOreRubracium = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "rubraciumore");
            BlockList.blockRubracium = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "rubraciumblock");
            blockRegistry(BlockList.blockOreRubracium, event);
            blockRegistry(BlockList.blockRubracium, event);
        }
        if (ConfigRegistryList.registerRuthenium.get())
        {
            BlockList.blockOreRuthenium = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "rutheniumore");
            BlockList.blockRuthenium = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "rutheniumblock");
            blockRegistry(BlockList.blockOreRuthenium, event);
            blockRegistry(BlockList.blockRuthenium, event);
        }
        if (ConfigRegistryList.registerSanguinite.get())
        {
            BlockList.blockOreSanguinite = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "sanguiniteore");
            BlockList.blockSanguinite = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "sanguiniteblock");
            blockRegistry(BlockList.blockOreSanguinite, event);
            blockRegistry(BlockList.blockSanguinite, event);
        }
        if (ConfigRegistryList.registerShadowIron.get())
        {
            BlockList.blockOreShadowIron = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "shadowironore");
            BlockList.blockShadowIron = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "shadowironblock");
            blockRegistry(BlockList.blockOreShadowIron, event);
            blockRegistry(BlockList.blockShadowIron, event);
        }
        if (ConfigRegistryList.registerSilver.get())
        {
            BlockList.blockOreSilver = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "silverore");
            BlockList.blockSilver = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "silverblock");
            blockRegistry(BlockList.blockOreSilver, event);
            blockRegistry(BlockList.blockSilver, event);
        }
        if (ConfigRegistryList.registerTechnetium.get())
        {
            BlockList.blockOreTechnetium = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "technetiumore");
            BlockList.blockTechnetium = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "technetiumblock");
            blockRegistry(BlockList.blockOreTechnetium, event);
            blockRegistry(BlockList.blockTechnetium, event);
        }
        if (ConfigRegistryList.registerThallium.get())
        {
            BlockList.blockOreThallium = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "thalliumore");
            BlockList.blockThallium = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "thalliumblock");
            blockRegistry(BlockList.blockOreThallium, event);
            blockRegistry(BlockList.blockThallium, event);
        }
        if (ConfigRegistryList.registerTin.get())
        {
            BlockList.blockOreTin = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "tinore");
            BlockList.blockTin = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "tinblock");
            blockRegistry(BlockList.blockOreTin, event);
            blockRegistry(BlockList.blockTin, event);
        }
        if (ConfigRegistryList.registerTitanium.get())
        {
            BlockList.blockOreTitanium = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "titaniumore");
            BlockList.blockTitanium = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "titaniumblock");
            blockRegistry(BlockList.blockOreTitanium, event);
            blockRegistry(BlockList.blockTitanium, event);
        }
        if (ConfigRegistryList.registerTungsten.get())
        {
            BlockList.blockOreTungsten = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "tungstenore");
            BlockList.blockTungsten = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "tungstenblock");
            blockRegistry(BlockList.blockOreTungsten, event);
            blockRegistry(BlockList.blockTungsten, event);
        }
        if (ConfigRegistryList.registerUnobtainium.get())
        {
            BlockList.blockOreUnobtainium = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "unobtainiumore");
            BlockList.blockUnobtainium = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "unobtainiumblock");
            blockRegistry(BlockList.blockOreUnobtainium, event);
            blockRegistry(BlockList.blockUnobtainium, event);
        }
        if (ConfigRegistryList.registerVanadium.get())
        {
            BlockList.blockOreVanadium = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "vanadiumore");
            BlockList.blockVanadium = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "vanadiumblock");
            blockRegistry(BlockList.blockOreVanadium, event);
            blockRegistry(BlockList.blockVanadium, event);
        }
        if (ConfigRegistryList.registerVulcanite.get())
        {
            BlockList.blockOreVulcanite = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "vulcaniteore");
            BlockList.blockVulcanite = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "vulcaniteblock");
            blockRegistry(BlockList.blockOreVulcanite, event);
            blockRegistry(BlockList.blockVulcanite, event);
        }
        if (ConfigRegistryList.registerVyroxeres.get())
        {
            BlockList.blockOreVyroxeres = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "vyroxeresore");
            BlockList.blockVyroxeres = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "vyroxeresblock");
            blockRegistry(BlockList.blockOreVyroxeres, event);
            blockRegistry(BlockList.blockVyroxeres, event);
        }
        if (ConfigRegistryList.registerZinc.get())
        {
            BlockList.blockOreZinc = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "zincore");
            BlockList.blockZinc = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "zincblock");
            blockRegistry(BlockList.blockOreZinc, event);
            blockRegistry(BlockList.blockZinc, event);
        }
        if (ConfigRegistryList.registerZirconium.get())
        {
            BlockList.blockOreZirconium = new BlockEXOre(Material.ROCK, 3.0f, 5.0f, "zirconiumore");
            BlockList.blockZirconium = new BlockEXOre(Material.IRON, 3.0f, 5.0f, "zirconiumblock");
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
            ItemBlockList.itemBlockOreAdamantine = new ItemBlockExOre(BlockList.blockOreAdamantine, EXORES);
            ItemBlockList.itemBlockAdamantine = new ItemBlockExOre(BlockList.blockAdamantine, EXORES);
            itemRegistry(ItemList.itemIngotAdamantine, event);
            itemRegistry(ItemList.itemDustAdamantine, event);
            itemRegistry(ItemList.itemShardAdamantine,event);
            itemRegistry(ItemList.itemClumpAdamantine,event);
            itemRegistry(ItemList.itemDirtyDustAdamantine,event);
            itemRegistry(ItemBlockList.itemBlockOreAdamantine, event);
            itemRegistry(ItemBlockList.itemBlockAdamantine, event);
        }
        if (ConfigRegistryList.registerAldourite.get())
        {
            ItemList.itemIngotAldourite = new ItemEXOre(EXORES, "aldouriteingot");
            ItemList.itemDustAldourite = new ItemEXOre(EXORES, "aldouritedust");
            ItemList.itemShardAldourite = new ItemEXOre(EXORES,"aldouriteshard");
            ItemList.itemClumpAldourite = new ItemEXOre(EXORES,"aldouriteclump");
            ItemList.itemDirtyDustAldourite = new ItemEXOre(EXORES,"aldouritedirtydust");
            ItemBlockList.itemBlockOreAldourite = new ItemBlockExOre(BlockList.blockOreAldourite, EXORES);
            ItemBlockList.itemBlockAldourite = new ItemBlockExOre(BlockList.blockAldourite, EXORES);
            itemRegistry(ItemList.itemIngotAldourite, event);
            itemRegistry(ItemList.itemDustAldourite, event);
            itemRegistry(ItemList.itemShardAldourite,event);
            itemRegistry(ItemList.itemClumpAldourite,event);
            itemRegistry(ItemList.itemDirtyDustAldourite,event);
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
            ItemBlockList.itemBlockOreAluminum = new ItemBlockExOre(BlockList.blockOreAluminum, EXORES);
            ItemBlockList.itemBlockAluminum = new ItemBlockExOre(BlockList.blockAluminum, EXORES);
            itemRegistry(ItemList.itemIngotAluminum, event);
            itemRegistry(ItemList.itemDustAluminum, event);
            itemRegistry(ItemList.itemShardAluminum,event);
            itemRegistry(ItemList.itemClumpAluminum,event);
            itemRegistry(ItemList.itemDirtyDustAluminum,event);
            itemRegistry(ItemBlockList.itemBlockOreAluminum, event);
            itemRegistry(ItemBlockList.itemBlockAluminum, event);
        }
        if (ConfigRegistryList.registerAmordrine.get())
        {
            ItemList.itemIngotAmordrine = new ItemEXOre(EXORES, "amordrineingot");
            ItemList.itemDustAmordrine = new ItemEXOre(EXORES, "amordrinedust");
            ItemList.itemShardAmordrine = new ItemEXOre(EXORES,"amordrineshard");
            ItemList.itemClumpAmordrine = new ItemEXOre(EXORES,"amordrineclump");
            ItemList.itemDirtyDustAmordrine = new ItemEXOre(EXORES,"amordrinedirtydust");
            ItemBlockList.itemBlockOreAmordrine = new ItemBlockExOre(BlockList.blockOreAmordrine, EXORES);
            ItemBlockList.itemBlockAmordrine = new ItemBlockExOre(BlockList.blockAmordrine, EXORES);
            itemRegistry(ItemList.itemIngotAmordrine, event);
            itemRegistry(ItemList.itemDustAmordrine, event);
            itemRegistry(ItemList.itemShardAmordrine,event);
            itemRegistry(ItemList.itemClumpAmordrine,event);
            itemRegistry(ItemList.itemDirtyDustAmordrine,event);
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
            ItemBlockList.itemBlockOreAngmallen = new ItemBlockExOre(BlockList.blockOreAngmallen, EXORES);
            ItemBlockList.itemBlockAngmallen = new ItemBlockExOre(BlockList.blockAngmallen, EXORES);
            itemRegistry(ItemList.itemIngotAngmallen, event);
            itemRegistry(ItemList.itemDustAngmallen, event);
            itemRegistry(ItemList.itemShardAngmallen,event);
            itemRegistry(ItemList.itemClumpAngmallen,event);
            itemRegistry(ItemList.itemDirtyDustAngmallen,event);
            itemRegistry(ItemBlockList.itemBlockOreAngmallen, event);
            itemRegistry(ItemBlockList.itemBlockAngmallen, event);
        }
        if (ConfigRegistryList.registerAstralSilver.get())
        {
            ItemList.itemIngotAstralSilver = new ItemEXOre(EXORES, "astralsilveringot");
            ItemList.itemDustAstralSilver = new ItemEXOre(EXORES, "astralsilverdust");
            ItemList.itemShardAstralSilver = new ItemEXOre(EXORES,"astralsilvershard");
            ItemList.itemClumpAstralSilver = new ItemEXOre(EXORES,"astralsilverclump");
            ItemList.itemDirtyDustAstralSilver = new ItemEXOre(EXORES,"astralsilverdirtydust");
            ItemBlockList.itemBlockOreAstralSilver = new ItemBlockExOre(BlockList.blockOreAstralSilver, EXORES);
            ItemBlockList.itemBlockAstralSilver = new ItemBlockExOre(BlockList.blockAstralSilver, EXORES);
            itemRegistry(ItemList.itemIngotAstralSilver, event);
            itemRegistry(ItemList.itemDustAstralSilver, event);
            itemRegistry(ItemList.itemShardAstralSilver,event);
            itemRegistry(ItemList.itemClumpAstralSilver,event);
            itemRegistry(ItemList.itemDirtyDustAstralSilver,event);
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
            ItemBlockList.itemBlockOreAtlarus = new ItemBlockExOre(BlockList.blockOreAtlarus, EXORES);
            ItemBlockList.itemBlockAtlarus = new ItemBlockExOre(BlockList.blockAtlarus, EXORES);
            itemRegistry(ItemList.itemIngotAtlarus, event);
            itemRegistry(ItemList.itemDustAtlarus, event);
            itemRegistry(ItemList.itemShardAtlarus,event);
            itemRegistry(ItemList.itemClumpAtlarus,event);
            itemRegistry(ItemList.itemDirtyDustAtlarus,event);
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
            ItemBlockList.itemBlockOreBismuth = new ItemBlockExOre(BlockList.blockOreBismuth, EXORES);
            ItemBlockList.itemBlockBismuth = new ItemBlockExOre(BlockList.blockBismuth, EXORES);
            itemRegistry(ItemList.itemIngotBismuth, event);
            itemRegistry(ItemList.itemDustBismuth, event);
            itemRegistry(ItemList.itemShardBismuth,event);
            itemRegistry(ItemList.itemClumpBismuth,event);
            itemRegistry(ItemList.itemDirtyDustBismuth,event);
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
            ItemBlockList.itemBlockOreBlackSteel = new ItemBlockExOre(BlockList.blockOreBlackSteel, EXORES);
            ItemBlockList.itemBlockBlackSteel = new ItemBlockExOre(BlockList.blockBlackSteel, EXORES);
            itemRegistry(ItemList.itemIngotBlackSteel, event);
            itemRegistry(ItemList.itemDustBlackSteel, event);
            itemRegistry(ItemList.itemShardBlackSteel,event);
            itemRegistry(ItemList.itemClumpBlackSteel,event);
            itemRegistry(ItemList.itemDirtyDustBlackSteel,event);
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
            ItemBlockList.itemBlockOreCadmium = new ItemBlockExOre(BlockList.blockOreCadmium, EXORES);
            ItemBlockList.itemBlockCadmium = new ItemBlockExOre(BlockList.blockCadmium, EXORES);
            itemRegistry(ItemList.itemIngotCadmium, event);
            itemRegistry(ItemList.itemDustCadmium, event);
            itemRegistry(ItemList.itemShardCadmium,event);
            itemRegistry(ItemList.itemClumpCadmium,event);
            itemRegistry(ItemList.itemDirtyDustCadmium,event);
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
            ItemBlockList.itemBlockOreCarmot = new ItemBlockExOre(BlockList.blockOreCarmot, EXORES);
            ItemBlockList.itemBlockCarmot = new ItemBlockExOre(BlockList.blockCarmot, EXORES);
            itemRegistry(ItemList.itemIngotCarmot, event);
            itemRegistry(ItemList.itemDustCarmot, event);
            itemRegistry(ItemList.itemShardCarmot,event);
            itemRegistry(ItemList.itemClumpCarmot,event);
            itemRegistry(ItemList.itemDirtyDustCarmot,event);
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
            ItemBlockList.itemBlockOreCelenegil = new ItemBlockExOre(BlockList.blockOreCelenegil, EXORES);
            ItemBlockList.itemBlockCelenegil = new ItemBlockExOre(BlockList.blockCelenegil, EXORES);
            itemRegistry(ItemList.itemIngotCelenegil, event);
            itemRegistry(ItemList.itemDustCelenegil, event);
            itemRegistry(ItemList.itemShardCelenegil,event);
            itemRegistry(ItemList.itemClumpCelenegil,event);
            itemRegistry(ItemList.itemDirtyDustCelenegil,event);
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
            ItemBlockList.itemBlockOreCeruclase = new ItemBlockExOre(BlockList.blockOreCeruclase, EXORES);
            ItemBlockList.itemBlockCeruclase = new ItemBlockExOre(BlockList.blockCeruclase, EXORES);
            itemRegistry(ItemList.itemIngotCeruclase, event);
            itemRegistry(ItemList.itemDustCeruclase, event);
            itemRegistry(ItemList.itemShardCeruclase,event);
            itemRegistry(ItemList.itemClumpCeruclase,event);
            itemRegistry(ItemList.itemDirtyDustCeruclase,event);
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
            ItemBlockList.itemBlockOreChromium = new ItemBlockExOre(BlockList.blockOreChromium, EXORES);
            ItemBlockList.itemBlockChromium = new ItemBlockExOre(BlockList.blockChromium, EXORES);
            itemRegistry(ItemList.itemIngotChromium, event);
            itemRegistry(ItemList.itemDustChromium, event);
            itemRegistry(ItemList.itemShardChromium,event);
            itemRegistry(ItemList.itemClumpChromium,event);
            itemRegistry(ItemList.itemDirtyDustChromium,event);
            itemRegistry(ItemBlockList.itemBlockOreChromium, event);
            itemRegistry(ItemBlockList.itemBlockChromium, event);
        }
        if (ConfigRegistryList.registerCobalt.get())
        {
            ItemList.itemIngotCobalt = new ItemEXOre(EXORES, "cobaltingot");
            ItemList.itemDustCobalt = new ItemEXOre(EXORES, "cobaltdust");
            ItemList.itemShardCobalt = new ItemEXOre(EXORES,"cobaltshard");
            ItemList.itemClumpCobalt = new ItemEXOre(EXORES,"cobaltclump");
            ItemList.itemDirtyDustCobalt = new ItemEXOre(EXORES,"cobaltdirtydust");
            ItemBlockList.itemBlockOreCobalt = new ItemBlockExOre(BlockList.blockOreCobalt, EXORES);
            ItemBlockList.itemBlockCobalt = new ItemBlockExOre(BlockList.blockCobalt, EXORES);
            itemRegistry(ItemList.itemIngotCobalt, event);
            itemRegistry(ItemList.itemDustCobalt, event);
            itemRegistry(ItemList.itemShardCobalt,event);
            itemRegistry(ItemList.itemClumpCobalt,event);
            itemRegistry(ItemList.itemDirtyDustCobalt,event);
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
            ItemBlockList.itemBlockOreCopper = new ItemBlockExOre(BlockList.blockOreCopper, EXORES);
            ItemBlockList.itemBlockCopper = new ItemBlockExOre(BlockList.blockCopper, EXORES);
            itemRegistry(ItemList.itemIngotCopper, event);
            itemRegistry(ItemList.itemDustCopper, event);
            itemRegistry(ItemList.itemShardCopper,event);
            itemRegistry(ItemList.itemClumpCopper,event);
            itemRegistry(ItemList.itemDirtyDustCopper,event);
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
            ItemBlockList.itemBlockOreDeepIron = new ItemBlockExOre(BlockList.blockOreDeepIron, EXORES);
            ItemBlockList.itemBlockDeepIron = new ItemBlockExOre(BlockList.blockDeepIron, EXORES);
            itemRegistry(ItemList.itemIngotDeepIron, event);
            itemRegistry(ItemList.itemDustDeepIron, event);
            itemRegistry(ItemList.itemShardDeepIron,event);
            itemRegistry(ItemList.itemClumpDeepIron,event);
            itemRegistry(ItemList.itemDirtyDustDeepIron,event);
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
            ItemBlockList.itemBlockOreDesichalkos = new ItemBlockExOre(BlockList.blockOreDesichalkos, EXORES);
            ItemBlockList.itemBlockDesichalkos = new ItemBlockExOre(BlockList.blockDesichalkos, EXORES);
            itemRegistry(ItemList.itemIngotDesichalkos, event);
            itemRegistry(ItemList.itemDustDesichalkos, event);
            itemRegistry(ItemList.itemShardDesichalkos,event);
            itemRegistry(ItemList.itemClumpDesichalkos,event);
            itemRegistry(ItemList.itemDirtyDustDesichalkos,event);
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
            ItemBlockList.itemBlockOreEximite = new ItemBlockExOre(BlockList.blockOreEximite, EXORES);
            ItemBlockList.itemBlockEximite = new ItemBlockExOre(BlockList.blockEximite, EXORES);
            itemRegistry(ItemList.itemIngotEximite, event);
            itemRegistry(ItemList.itemDustEximite, event);
            itemRegistry(ItemList.itemShardEximite,event);
            itemRegistry(ItemList.itemClumpEximite,event);
            itemRegistry(ItemList.itemDirtyDustEximite,event);
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
            ItemBlockList.itemBlockOreGallium = new ItemBlockExOre(BlockList.blockOreGallium, EXORES);
            ItemBlockList.itemBlockGallium = new ItemBlockExOre(BlockList.blockGallium, EXORES);
            itemRegistry(ItemList.itemIngotGallium, event);
            itemRegistry(ItemList.itemDustGallium, event);
            itemRegistry(ItemList.itemShardGallium,event);
            itemRegistry(ItemList.itemClumpGallium,event);
            itemRegistry(ItemList.itemDirtyDustGallium,event);
            itemRegistry(ItemBlockList.itemBlockOreGallium, event);
            itemRegistry(ItemBlockList.itemBlockGallium, event);
        }
        if (ConfigRegistryList.registerHaderoth.get())
        {
            ItemList.itemIngotHaderoth = new ItemEXOre(EXORES, "haderothingot");
            ItemList.itemDustHaderoth = new ItemEXOre(EXORES, "haderothdust");
            ItemList.itemShardHaderoth = new ItemEXOre(EXORES,"haderothshard");
            ItemList.itemClumpHaderoth = new ItemEXOre(EXORES,"haderothclump");
            ItemList.itemDirtyDustHaderoth = new ItemEXOre(EXORES,"haderothdirtydust");
            ItemBlockList.itemBlockOreHaderoth = new ItemBlockExOre(BlockList.blockOreHaderoth, EXORES);
            ItemBlockList.itemBlockHaderoth = new ItemBlockExOre(BlockList.blockHaderoth, EXORES);
            itemRegistry(ItemList.itemIngotHaderoth, event);
            itemRegistry(ItemList.itemDustHaderoth, event);
            itemRegistry(ItemList.itemShardHaderoth,event);
            itemRegistry(ItemList.itemClumpHaderoth,event);
            itemRegistry(ItemList.itemDirtyDustHaderoth,event);
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
            ItemBlockList.itemBlockOreHepatizon = new ItemBlockExOre(BlockList.blockOreHepatizon, EXORES);
            ItemBlockList.itemBlockHepatizon = new ItemBlockExOre(BlockList.blockHepatizon, EXORES);
            itemRegistry(ItemList.itemIngotHepatizon, event);
            itemRegistry(ItemList.itemDustHepatizon, event);
            itemRegistry(ItemList.itemShardHepatizon,event);
            itemRegistry(ItemList.itemClumpHepatizon,event);
            itemRegistry(ItemList.itemDirtyDustHepatizon,event);
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
            ItemBlockList.itemBlockOreIgnatius = new ItemBlockExOre(BlockList.blockOreIgnatius, EXORES);
            ItemBlockList.itemBlockIgnatius = new ItemBlockExOre(BlockList.blockIgnatius, EXORES);
            itemRegistry(ItemList.itemIngotIgnatius, event);
            itemRegistry(ItemList.itemDustIgnatius, event);
            itemRegistry(ItemList.itemShardIgnatius,event);
            itemRegistry(ItemList.itemClumpIgnatius,event);
            itemRegistry(ItemList.itemDirtyDustIgnatius,event);
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
            ItemBlockList.itemBlockOreIndium = new ItemBlockExOre(BlockList.blockOreIndium, EXORES);
            ItemBlockList.itemBlockIndium = new ItemBlockExOre(BlockList.blockIndium, EXORES);
            itemRegistry(ItemList.itemIngotIndium, event);
            itemRegistry(ItemList.itemDustIndium, event);
            itemRegistry(ItemList.itemShardIndium,event);
            itemRegistry(ItemList.itemClumpIndium,event);
            itemRegistry(ItemList.itemDirtyDustIndium,event);
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
            ItemBlockList.itemBlockOreInfuscolium = new ItemBlockExOre(BlockList.blockOreInfuscolium, EXORES);
            ItemBlockList.itemBlockInfuscolium = new ItemBlockExOre(BlockList.blockInfuscolium, EXORES);
            itemRegistry(ItemList.itemIngotInfuscolium, event);
            itemRegistry(ItemList.itemDustInfuscolium, event);
            itemRegistry(ItemList.itemShardInfuscolium,event);
            itemRegistry(ItemList.itemClumpInfuscolium,event);
            itemRegistry(ItemList.itemDirtyDustInfuscolium,event);
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
            ItemBlockList.itemBlockOreInolashite = new ItemBlockExOre(BlockList.blockOreInolashite, EXORES);
            ItemBlockList.itemBlockInolashite = new ItemBlockExOre(BlockList.blockInolashite, EXORES);
            itemRegistry(ItemList.itemIngotInolashite, event);
            itemRegistry(ItemList.itemDustInolashite, event);
            itemRegistry(ItemList.itemShardInolashite,event);
            itemRegistry(ItemList.itemClumpInolashite,event);
            itemRegistry(ItemList.itemDirtyDustInolashite,event);
            itemRegistry(ItemBlockList.itemBlockOreInolashite, event);
            itemRegistry(ItemBlockList.itemBlockInolashite, event);
        }
        if (ConfigRegistryList.registerKalendrite.get())
        {
            ItemList.itemIngotKalendrite = new ItemEXOre(EXORES, "kalendriteingot");
            ItemList.itemDustKalendrite = new ItemEXOre(EXORES, "kalendritedust");
            ItemList.itemShardKalendrite = new ItemEXOre(EXORES,"kalendriteshard");
            ItemList.itemClumpKalendrite = new ItemEXOre(EXORES,"kalendriteclump");
            ItemList.itemDirtyDustKalendrite = new ItemEXOre(EXORES,"kalendritedirtydust");
            ItemBlockList.itemBlockOreKalendrite = new ItemBlockExOre(BlockList.blockOreKalendrite, EXORES);
            ItemBlockList.itemBlockKalendrite = new ItemBlockExOre(BlockList.blockKalendrite, EXORES);
            itemRegistry(ItemList.itemIngotKalendrite, event);
            itemRegistry(ItemList.itemDustKalendrite, event);
            itemRegistry(ItemList.itemShardKalendrite,event);
            itemRegistry(ItemList.itemClumpKalendrite,event);
            itemRegistry(ItemList.itemDirtyDustKalendrite,event);
            itemRegistry(ItemBlockList.itemBlockOreKalendrite, event);
            itemRegistry(ItemBlockList.itemBlockKalendrite, event);
        }
        if (ConfigRegistryList.registerLead.get())
        {
            ItemList.itemIngotLead = new ItemEXOre(EXORES, "leadingot");
            ItemList.itemDustLead = new ItemEXOre(EXORES, "leaddust");
            ItemList.itemShardLead = new ItemEXOre(EXORES,"leadshard");
            ItemList.itemClumpLead = new ItemEXOre(EXORES,"leadclump");
            ItemList.itemDirtyDustLead = new ItemEXOre(EXORES,"leaddirtydust");
            ItemBlockList.itemBlockOreLead = new ItemBlockExOre(BlockList.blockOreLead, EXORES);
            ItemBlockList.itemBlockLead = new ItemBlockExOre(BlockList.blockLead, EXORES);
            itemRegistry(ItemList.itemIngotLead, event);
            itemRegistry(ItemList.itemDustLead, event);
            itemRegistry(ItemList.itemShardLead,event);
            itemRegistry(ItemList.itemClumpLead,event);
            itemRegistry(ItemList.itemDirtyDustLead,event);
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
            ItemBlockList.itemBlockOreLemurite = new ItemBlockExOre(BlockList.blockOreLemurite, EXORES);
            ItemBlockList.itemBlockLemurite = new ItemBlockExOre(BlockList.blockLemurite, EXORES);
            itemRegistry(ItemList.itemIngotLemurite, event);
            itemRegistry(ItemList.itemDustLemurite, event);
            itemRegistry(ItemList.itemShardLemurite,event);
            itemRegistry(ItemList.itemClumpLemurite,event);
            itemRegistry(ItemList.itemDirtyDustLemurite,event);
            itemRegistry(ItemBlockList.itemBlockOreLemurite, event);
            itemRegistry(ItemBlockList.itemBlockLemurite, event);
        }
        if (ConfigRegistryList.registerManganese.get())
        {
            ItemList.itemIngotManganese = new ItemEXOre(EXORES, "manganeseingot");
            ItemList.itemDustManganese = new ItemEXOre(EXORES, "manganesedust");
            ItemList.itemShardManganese = new ItemEXOre(EXORES,"manganeseshard");
            ItemList.itemClumpManganese = new ItemEXOre(EXORES,"manganeseclump");
            ItemList.itemDirtyDustManganese = new ItemEXOre(EXORES,"manganesedirtydust");
            ItemBlockList.itemBlockOreManganese = new ItemBlockExOre(BlockList.blockOreManganese, EXORES);
            ItemBlockList.itemBlockManganese = new ItemBlockExOre(BlockList.blockManganese, EXORES);
            itemRegistry(ItemList.itemIngotManganese, event);
            itemRegistry(ItemList.itemDustManganese, event);
            itemRegistry(ItemList.itemShardManganese,event);
            itemRegistry(ItemList.itemClumpManganese,event);
            itemRegistry(ItemList.itemDirtyDustManganese,event);
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
            ItemBlockList.itemBlockOreMeutoite = new ItemBlockExOre(BlockList.blockOreMeutoite, EXORES);
            ItemBlockList.itemBlockMeutoite = new ItemBlockExOre(BlockList.blockMeutoite, EXORES);
            itemRegistry(ItemList.itemIngotMeutoite, event);
            itemRegistry(ItemList.itemDustMeutoite, event);
            itemRegistry(ItemList.itemShardMeutoite,event);
            itemRegistry(ItemList.itemClumpMeutoite,event);
            itemRegistry(ItemList.itemDirtyDustMeutoite,event);
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
            ItemBlockList.itemBlockOreMidasium = new ItemBlockExOre(BlockList.blockOreMidasium, EXORES);
            ItemBlockList.itemBlockMidasium = new ItemBlockExOre(BlockList.blockMidasium, EXORES);
            itemRegistry(ItemList.itemIngotMidasium, event);
            itemRegistry(ItemList.itemDustMidasium, event);
            itemRegistry(ItemList.itemShardMidasium,event);
            itemRegistry(ItemList.itemClumpMidasium,event);
            itemRegistry(ItemList.itemDirtyDustMidasium,event);
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
            ItemBlockList.itemBlockOreMithril = new ItemBlockExOre(BlockList.blockOreMithril, EXORES);
            ItemBlockList.itemBlockMithril = new ItemBlockExOre(BlockList.blockMithril, EXORES);
            itemRegistry(ItemList.itemIngotMithril, event);
            itemRegistry(ItemList.itemDustMithril, event);
            itemRegistry(ItemList.itemShardMithril,event);
            itemRegistry(ItemList.itemClumpMithril,event);
            itemRegistry(ItemList.itemDirtyDustMithril,event);
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
            ItemBlockList.itemBlockOreMolybdenum = new ItemBlockExOre(BlockList.blockOreMolybdenum, EXORES);
            ItemBlockList.itemBlockMolybdenum = new ItemBlockExOre(BlockList.blockMolybdenum, EXORES);
            itemRegistry(ItemList.itemIngotMolybdenum, event);
            itemRegistry(ItemList.itemDustMolybdenum, event);
            itemRegistry(ItemList.itemShardMolybdenum,event);
            itemRegistry(ItemList.itemClumpMolybdenum,event);
            itemRegistry(ItemList.itemDirtyDustMolybdenum,event);
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
            ItemBlockList.itemBlockOreNeodymium = new ItemBlockExOre(BlockList.blockOreNeodymium, EXORES);
            ItemBlockList.itemBlockNeodymium = new ItemBlockExOre(BlockList.blockNeodymium, EXORES);
            itemRegistry(ItemList.itemIngotNeodymium, event);
            itemRegistry(ItemList.itemDustNeodymium, event);
            itemRegistry(ItemList.itemShardNeodymium,event);
            itemRegistry(ItemList.itemClumpNeodymium,event);
            itemRegistry(ItemList.itemDirtyDustNeodymium,event);
            itemRegistry(ItemBlockList.itemBlockOreNeodymium, event);
            itemRegistry(ItemBlockList.itemBlockNeodymium, event);
        }
        if (ConfigRegistryList.registerNickel.get())
        {
            ItemList.itemIngotNickel = new ItemEXOre(EXORES, "nickelingot");
            ItemList.itemDustNickel = new ItemEXOre(EXORES, "nickeldust");
            ItemList.itemShardNickel = new ItemEXOre(EXORES,"nickelshard");
            ItemList.itemClumpNickel = new ItemEXOre(EXORES,"nickelclump");
            ItemList.itemDirtyDustNickel = new ItemEXOre(EXORES,"nickeldirtydust");
            ItemBlockList.itemBlockOreNickel = new ItemBlockExOre(BlockList.blockOreNickel, EXORES);
            ItemBlockList.itemBlockNickel = new ItemBlockExOre(BlockList.blockNickel, EXORES);
            itemRegistry(ItemList.itemIngotNickel, event);
            itemRegistry(ItemList.itemDustNickel, event);
            itemRegistry(ItemList.itemShardNickel,event);
            itemRegistry(ItemList.itemClumpNickel,event);
            itemRegistry(ItemList.itemDirtyDustNickel,event);
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
            ItemBlockList.itemBlockOreNiobium = new ItemBlockExOre(BlockList.blockOreNiobium, EXORES);
            ItemBlockList.itemBlockNiobium = new ItemBlockExOre(BlockList.blockNiobium, EXORES);
            itemRegistry(ItemList.itemIngotNiobium, event);
            itemRegistry(ItemList.itemDustNiobium, event);
            itemRegistry(ItemList.itemShardNiobium,event);
            itemRegistry(ItemList.itemClumpNiobium,event);
            itemRegistry(ItemList.itemDirtyDustNiobium,event);
            itemRegistry(ItemBlockList.itemBlockOreNiobium, event);
            itemRegistry(ItemBlockList.itemBlockNiobium, event);
        }
        if (ConfigRegistryList.registerOrichalcum.get())
        {
            ItemList.itemIngotOrichalcum = new ItemEXOre(EXORES, "orichalcumingot");
            ItemList.itemDustOrichalcum = new ItemEXOre(EXORES, "orichalcumdust");
            ItemList.itemShardOrichalcum = new ItemEXOre(EXORES,"orichalcumshard");
            ItemList.itemClumpOrichalcum = new ItemEXOre(EXORES,"orichalcumclump");
            ItemList.itemDirtyDustOrichalcum = new ItemEXOre(EXORES,"orichalcumdirtydust");
            ItemBlockList.itemBlockOreOrichalcum = new ItemBlockExOre(BlockList.blockOreOrichalcum, EXORES);
            ItemBlockList.itemBlockOrichalcum = new ItemBlockExOre(BlockList.blockOrichalcum, EXORES);
            itemRegistry(ItemList.itemIngotOrichalcum, event);
            itemRegistry(ItemList.itemDustOrichalcum, event);
            itemRegistry(ItemList.itemShardOrichalcum,event);
            itemRegistry(ItemList.itemClumpOrichalcum,event);
            itemRegistry(ItemList.itemDirtyDustOrichalcum,event);
            itemRegistry(ItemBlockList.itemBlockOreOrichalcum, event);
            itemRegistry(ItemBlockList.itemBlockOrichalcum, event);
        }
        if (ConfigRegistryList.registerOureclase.get())
        {
            ItemList.itemIngotOureclase = new ItemEXOre(EXORES, "oureclaseingot");
            ItemList.itemDustOureclase = new ItemEXOre(EXORES, "oureclasedust");
            ItemList.itemShardOureclase = new ItemEXOre(EXORES,"oureclaseshard");
            ItemList.itemClumpOureclase = new ItemEXOre(EXORES,"oureclaseclump");
            ItemList.itemDirtyDustOureclase = new ItemEXOre(EXORES,"oureclasedirtydust");
            ItemBlockList.itemBlockOreOureclase = new ItemBlockExOre(BlockList.blockOreOureclase, EXORES);
            ItemBlockList.itemBlockOureclase = new ItemBlockExOre(BlockList.blockOureclase, EXORES);
            itemRegistry(ItemList.itemIngotOureclase, event);
            itemRegistry(ItemList.itemDustOureclase, event);
            itemRegistry(ItemList.itemShardOureclase,event);
            itemRegistry(ItemList.itemClumpOureclase,event);
            itemRegistry(ItemList.itemDirtyDustOureclase,event);
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
            ItemBlockList.itemBlockOrePalladium = new ItemBlockExOre(BlockList.blockOrePalladium, EXORES);
            ItemBlockList.itemBlockPalladium = new ItemBlockExOre(BlockList.blockPalladium, EXORES);
            itemRegistry(ItemList.itemIngotPalladium, event);
            itemRegistry(ItemList.itemDustPalladium, event);
            itemRegistry(ItemList.itemShardPalladium,event);
            itemRegistry(ItemList.itemClumpPalladium,event);
            itemRegistry(ItemList.itemDirtyDustPalladium,event);
            itemRegistry(ItemBlockList.itemBlockOrePalladium, event);
            itemRegistry(ItemBlockList.itemBlockPalladium, event);
        }
        if (ConfigRegistryList.registerPlatinum.get())
        {
            ItemList.itemIngotPlatinum = new ItemEXOre(EXORES, "platinumingot");
            ItemList.itemDustPlatinum = new ItemEXOre(EXORES, "platinumdust");
            ItemList.itemShardPlatinum = new ItemEXOre(EXORES,"platinumshard");
            ItemList.itemClumpPlatinum = new ItemEXOre(EXORES,"platinumclump");
            ItemList.itemDirtyDustPlatinum = new ItemEXOre(EXORES,"platinumdirtydust");
            ItemBlockList.itemBlockOrePlatinum = new ItemBlockExOre(BlockList.blockOrePlatinum, EXORES);
            ItemBlockList.itemBlockPlatinum = new ItemBlockExOre(BlockList.blockPlatinum, EXORES);
            itemRegistry(ItemList.itemIngotPlatinum, event);
            itemRegistry(ItemList.itemDustPlatinum, event);
            itemRegistry(ItemList.itemShardPlatinum,event);
            itemRegistry(ItemList.itemClumpPlatinum,event);
            itemRegistry(ItemList.itemDirtyDustPlatinum,event);
            itemRegistry(ItemBlockList.itemBlockOrePlatinum, event);
            itemRegistry(ItemBlockList.itemBlockPlatinum, event);
        }
        if (ConfigRegistryList.registerPrometheum.get())
        {
            ItemList.itemIngotPrometheum = new ItemEXOre(EXORES, "prometheumingot");
            ItemList.itemDustPrometheum = new ItemEXOre(EXORES, "prometheumdust");
            ItemList.itemShardPrometheum = new ItemEXOre(EXORES,"prometheumshard");
            ItemList.itemClumpPrometheum = new ItemEXOre(EXORES,"prometheumclump");
            ItemList.itemDirtyDustPrometheum = new ItemEXOre(EXORES,"prometheumdirtydust");
            ItemBlockList.itemBlockOrePrometheum = new ItemBlockExOre(BlockList.blockOrePrometheum, EXORES);
            ItemBlockList.itemBlockPrometheum = new ItemBlockExOre(BlockList.blockPrometheum, EXORES);
            itemRegistry(ItemList.itemIngotPrometheum, event);
            itemRegistry(ItemList.itemDustPrometheum, event);
            itemRegistry(ItemList.itemShardPrometheum,event);
            itemRegistry(ItemList.itemClumpPrometheum,event);
            itemRegistry(ItemList.itemDirtyDustPrometheum,event);
            itemRegistry(ItemBlockList.itemBlockOrePrometheum, event);
            itemRegistry(ItemBlockList.itemBlockPrometheum, event);
        }
        if (ConfigRegistryList.registerRhodium.get())
        {
            ItemList.itemIngotRhodium = new ItemEXOre(EXORES, "rhodiumingot");
            ItemList.itemDustRhodium = new ItemEXOre(EXORES, "rhodiumdust");
            ItemList.itemShardRhodium = new ItemEXOre(EXORES,"rhodiumshard");
            ItemList.itemClumpRhodium = new ItemEXOre(EXORES,"rhodiumclump");
            ItemList.itemDirtyDustRhodium = new ItemEXOre(EXORES,"rhodiumdirtydust");
            ItemBlockList.itemBlockOreRhodium = new ItemBlockExOre(BlockList.blockOreRhodium, EXORES);
            ItemBlockList.itemBlockRhodium = new ItemBlockExOre(BlockList.blockRhodium, EXORES);
            itemRegistry(ItemList.itemIngotRhodium, event);
            itemRegistry(ItemList.itemDustRhodium, event);
            itemRegistry(ItemList.itemShardRhodium,event);
            itemRegistry(ItemList.itemClumpRhodium,event);
            itemRegistry(ItemList.itemDirtyDustRhodium,event);
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
            ItemBlockList.itemBlockOreRubracium = new ItemBlockExOre(BlockList.blockOreRubracium, EXORES);
            ItemBlockList.itemBlockRubracium = new ItemBlockExOre(BlockList.blockRubracium, EXORES);
            itemRegistry(ItemList.itemIngotRubracium, event);
            itemRegistry(ItemList.itemDustRubracium, event);
            itemRegistry(ItemList.itemShardRubracium,event);
            itemRegistry(ItemList.itemClumpRubracium,event);
            itemRegistry(ItemList.itemDirtyDustRubracium,event);
            itemRegistry(ItemBlockList.itemBlockOreRubracium, event);
            itemRegistry(ItemBlockList.itemBlockRubracium, event);
        }
        if (ConfigRegistryList.registerRuthenium.get())
        {
            ItemList.itemIngotRuthenium = new ItemEXOre(EXORES, "rutheniumingot");
            ItemList.itemDustRuthenium = new ItemEXOre(EXORES, "rutheniumdust");
            ItemList.itemShardRuthenium = new ItemEXOre(EXORES,"rutheniumshard");
            ItemList.itemClumpRuthenium = new ItemEXOre(EXORES,"rutheniumclump");
            ItemList.itemDirtyDustRuthenium = new ItemEXOre(EXORES,"rutheniumdirtydust");
            ItemBlockList.itemBlockOreRuthenium = new ItemBlockExOre(BlockList.blockOreRuthenium, EXORES);
            ItemBlockList.itemBlockRuthenium = new ItemBlockExOre(BlockList.blockRuthenium, EXORES);
            itemRegistry(ItemList.itemIngotRuthenium, event);
            itemRegistry(ItemList.itemDustRuthenium, event);
            itemRegistry(ItemList.itemShardRuthenium,event);
            itemRegistry(ItemList.itemClumpRuthenium,event);
            itemRegistry(ItemList.itemDirtyDustRuthenium,event);
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
            ItemBlockList.itemBlockOreSanguinite = new ItemBlockExOre(BlockList.blockOreSanguinite, EXORES);
            ItemBlockList.itemBlockSanguinite = new ItemBlockExOre(BlockList.blockSanguinite, EXORES);
            itemRegistry(ItemList.itemIngotSanguinite, event);
            itemRegistry(ItemList.itemDustSanguinite, event);
            itemRegistry(ItemList.itemShardSanguinite,event);
            itemRegistry(ItemList.itemClumpSanguinite,event);
            itemRegistry(ItemList.itemDirtyDustSanguinite,event);
            itemRegistry(ItemBlockList.itemBlockOreSanguinite, event);
            itemRegistry(ItemBlockList.itemBlockSanguinite, event);
        }
        if (ConfigRegistryList.registerShadowIron.get())
        {
            ItemList.itemIngotShadowIron = new ItemEXOre(EXORES, "shadowironingot");
            ItemList.itemDustShadowIron = new ItemEXOre(EXORES, "shadowirondust");
            ItemList.itemShardShadowIron = new ItemEXOre(EXORES,"shadowironshard");
            ItemList.itemClumpShadowIron = new ItemEXOre(EXORES,"shadowironclump");
            ItemList.itemDirtyDustShadowIron = new ItemEXOre(EXORES,"shadowirondirtydust");
            ItemBlockList.itemBlockOreShadowIron = new ItemBlockExOre(BlockList.blockOreShadowIron, EXORES);
            ItemBlockList.itemBlockShadowIron = new ItemBlockExOre(BlockList.blockShadowIron, EXORES);
            itemRegistry(ItemList.itemIngotShadowIron, event);
            itemRegistry(ItemList.itemDustShadowIron, event);
            itemRegistry(ItemList.itemShardShadowIron,event);
            itemRegistry(ItemList.itemClumpShadowIron,event);
            itemRegistry(ItemList.itemDirtyDustShadowIron,event);
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
            ItemBlockList.itemBlockOreSilver = new ItemBlockExOre(BlockList.blockOreSilver, EXORES);
            ItemBlockList.itemBlockSilver = new ItemBlockExOre(BlockList.blockSilver, EXORES);
            itemRegistry(ItemList.itemIngotSilver, event);
            itemRegistry(ItemList.itemDustSilver, event);
            itemRegistry(ItemList.itemShardSilver,event);
            itemRegistry(ItemList.itemClumpSilver,event);
            itemRegistry(ItemList.itemDirtyDustSilver,event);
            itemRegistry(ItemBlockList.itemBlockOreSilver, event);
            itemRegistry(ItemBlockList.itemBlockSilver, event);
        }
        if (ConfigRegistryList.registerTechnetium.get())
        {
            ItemList.itemIngotTechnetium = new ItemEXOre(EXORES, "technetiumingot");
            ItemList.itemDustTechnetium = new ItemEXOre(EXORES, "technetiumdust");
            ItemList.itemShardTechnetium = new ItemEXOre(EXORES,"technetiumshard");
            ItemList.itemClumpTechnetium = new ItemEXOre(EXORES,"technetiumclump");
            ItemList.itemDirtyDustTechnetium = new ItemEXOre(EXORES,"technetiumdirtydust");
            ItemBlockList.itemBlockOreTechnetium = new ItemBlockExOre(BlockList.blockOreTechnetium, EXORES);
            ItemBlockList.itemBlockTechnetium = new ItemBlockExOre(BlockList.blockTechnetium, EXORES);
            itemRegistry(ItemList.itemIngotTechnetium, event);
            itemRegistry(ItemList.itemDustTechnetium, event);
            itemRegistry(ItemList.itemShardTechnetium,event);
            itemRegistry(ItemList.itemClumpTechnetium,event);
            itemRegistry(ItemList.itemDirtyDustTechnetium,event);
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
            ItemBlockList.itemBlockOreThallium = new ItemBlockExOre(BlockList.blockOreThallium, EXORES);
            ItemBlockList.itemBlockThallium = new ItemBlockExOre(BlockList.blockThallium, EXORES);
            itemRegistry(ItemList.itemIngotThallium, event);
            itemRegistry(ItemList.itemDustThallium, event);
            itemRegistry(ItemList.itemShardThallium,event);
            itemRegistry(ItemList.itemClumpThallium,event);
            itemRegistry(ItemList.itemDirtyDustThallium,event);
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
            ItemBlockList.itemBlockOreTin = new ItemBlockExOre(BlockList.blockOreTin, EXORES);
            ItemBlockList.itemBlockTin = new ItemBlockExOre(BlockList.blockTin, EXORES);
            itemRegistry(ItemList.itemIngotTin, event);
            itemRegistry(ItemList.itemDustTin, event);
            itemRegistry(ItemList.itemShardTin,event);
            itemRegistry(ItemList.itemClumpTin,event);
            itemRegistry(ItemList.itemDirtyDustTin,event);
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
            ItemBlockList.itemBlockOreTitanium = new ItemBlockExOre(BlockList.blockOreTitanium, EXORES);
            ItemBlockList.itemBlockTitanium = new ItemBlockExOre(BlockList.blockTitanium, EXORES);
            itemRegistry(ItemList.itemIngotTitanium, event);
            itemRegistry(ItemList.itemDustTitanium, event);
            itemRegistry(ItemList.itemShardTitanium,event);
            itemRegistry(ItemList.itemClumpTitanium,event);
            itemRegistry(ItemList.itemDirtyDustTitanium,event);
            itemRegistry(ItemBlockList.itemBlockOreTitanium, event);
            itemRegistry(ItemBlockList.itemBlockTitanium, event);
        }
        if (ConfigRegistryList.registerTungsten.get())
        {
            ItemList.itemIngotTungsten = new ItemEXOre(EXORES, "tungsteningot");
            ItemList.itemDustTungsten = new ItemEXOre(EXORES, "tungstendust");
            ItemList.itemShardTungsten = new ItemEXOre(EXORES,"tungstenshard");
            ItemList.itemClumpTungsten = new ItemEXOre(EXORES,"tungstenclump");
            ItemList.itemDirtyDustTungsten = new ItemEXOre(EXORES,"tungstendirtydust");
            ItemBlockList.itemBlockOreTungsten = new ItemBlockExOre(BlockList.blockOreTungsten, EXORES);
            ItemBlockList.itemBlockTungsten = new ItemBlockExOre(BlockList.blockTungsten, EXORES);
            itemRegistry(ItemList.itemIngotTungsten, event);
            itemRegistry(ItemList.itemDustTungsten, event);
            itemRegistry(ItemList.itemShardTungsten,event);
            itemRegistry(ItemList.itemClumpTungsten,event);
            itemRegistry(ItemList.itemDirtyDustTungsten,event);
            itemRegistry(ItemBlockList.itemBlockOreTungsten, event);
            itemRegistry(ItemBlockList.itemBlockTungsten, event);
        }
        if (ConfigRegistryList.registerUnobtainium.get())
        {
            ItemList.itemIngotUnobtainium = new ItemEXOre(EXORES, "unobtainiumingot");
            ItemList.itemDustUnobtainium = new ItemEXOre(EXORES, "unobtainiumdust");
            ItemList.itemShardUnobtainium = new ItemEXOre(EXORES,"unobtainiumshard");
            ItemList.itemClumpUnobtainium = new ItemEXOre(EXORES,"unobtainiumclump");
            ItemList.itemDirtyDustUnobtainium = new ItemEXOre(EXORES,"unobtainiumdirtydust");
            ItemBlockList.itemBlockOreUnobtainium = new ItemBlockExOre(BlockList.blockOreUnobtainium, EXORES);
            ItemBlockList.itemBlockUnobtainium = new ItemBlockExOre(BlockList.blockUnobtainium, EXORES);
            itemRegistry(ItemList.itemIngotUnobtainium, event);
            itemRegistry(ItemList.itemDustUnobtainium, event);
            itemRegistry(ItemList.itemShardUnobtainium,event);
            itemRegistry(ItemList.itemClumpUnobtainium,event);
            itemRegistry(ItemList.itemDirtyDustUnobtainium,event);
            itemRegistry(ItemBlockList.itemBlockOreUnobtainium, event);
            itemRegistry(ItemBlockList.itemBlockUnobtainium, event);
        }
        if (ConfigRegistryList.registerVanadium.get())
        {
            ItemList.itemIngotVanadium = new ItemEXOre(EXORES, "vanadiumingot");
            ItemList.itemDustVanadium = new ItemEXOre(EXORES, "vanadiumdust");
            ItemList.itemShardVanadium = new ItemEXOre(EXORES,"vanadiumshard");
            ItemList.itemClumpVanadium = new ItemEXOre(EXORES,"vanadiumclump");
            ItemList.itemDirtyDustVanadium = new ItemEXOre(EXORES,"vanadiumdirtydust");
            ItemBlockList.itemBlockOreVanadium = new ItemBlockExOre(BlockList.blockOreVanadium, EXORES);
            ItemBlockList.itemBlockVanadium = new ItemBlockExOre(BlockList.blockVanadium, EXORES);
            itemRegistry(ItemList.itemIngotVanadium, event);
            itemRegistry(ItemList.itemDustVanadium, event);
            itemRegistry(ItemList.itemShardVanadium,event);
            itemRegistry(ItemList.itemClumpVanadium,event);
            itemRegistry(ItemList.itemDirtyDustVanadium,event);
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
            ItemBlockList.itemBlockOreVulcanite = new ItemBlockExOre(BlockList.blockOreVulcanite, EXORES);
            ItemBlockList.itemBlockVulcanite = new ItemBlockExOre(BlockList.blockVulcanite, EXORES);
            itemRegistry(ItemList.itemIngotVulcanite, event);
            itemRegistry(ItemList.itemDustVulcanite, event);
            itemRegistry(ItemList.itemShardVulcanite,event);
            itemRegistry(ItemList.itemClumpVulcanite,event);
            itemRegistry(ItemList.itemDirtyDustVulcanite,event);
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
            ItemBlockList.itemBlockOreVyroxeres = new ItemBlockExOre(BlockList.blockOreVyroxeres, EXORES);
            ItemBlockList.itemBlockVyroxeres = new ItemBlockExOre(BlockList.blockVyroxeres, EXORES);
            itemRegistry(ItemList.itemIngotVyroxeres, event);
            itemRegistry(ItemList.itemDustVyroxeres, event);
            itemRegistry(ItemList.itemShardVyroxeres,event);
            itemRegistry(ItemList.itemClumpVyroxeres,event);
            itemRegistry(ItemList.itemDirtyDustVyroxeres,event);
            itemRegistry(ItemBlockList.itemBlockOreVyroxeres, event);
            itemRegistry(ItemBlockList.itemBlockVyroxeres, event);
        }
        if (ConfigRegistryList.registerZinc.get())
        {
            ItemList.itemIngotZinc = new ItemEXOre(EXORES, "zincingot");
            ItemList.itemDustZinc = new ItemEXOre(EXORES, "zincdust");
            ItemList.itemShardZinc = new ItemEXOre(EXORES,"zincshard");
            ItemList.itemClumpZinc = new ItemEXOre(EXORES,"zincclump");
            ItemList.itemDirtyDustZinc = new ItemEXOre(EXORES,"zincdirtydust");
            ItemBlockList.itemBlockOreZinc = new ItemBlockExOre(BlockList.blockOreZinc, EXORES);
            ItemBlockList.itemBlockZinc = new ItemBlockExOre(BlockList.blockZinc, EXORES);
            itemRegistry(ItemList.itemIngotZinc, event);
            itemRegistry(ItemList.itemDustZinc, event);
            itemRegistry(ItemList.itemShardZinc,event);
            itemRegistry(ItemList.itemClumpZinc,event);
            itemRegistry(ItemList.itemDirtyDustZinc,event);
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
            ItemBlockList.itemBlockOreZirconium = new ItemBlockExOre(BlockList.blockOreZirconium, EXORES);
            ItemBlockList.itemBlockZirconium = new ItemBlockExOre(BlockList.blockZirconium, EXORES);
            itemRegistry(ItemList.itemIngotZirconium, event);
            itemRegistry(ItemList.itemDustZirconium, event);
            itemRegistry(ItemList.itemShardZirconium,event);
            itemRegistry(ItemList.itemClumpZirconium,event);
            itemRegistry(ItemList.itemDirtyDustZirconium,event);
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

package com.tylerh.extraores.Init;

import com.tylerh.extraores.Blocks.BlockEXOre;
import com.tylerh.extraores.Items.*;
import com.tylerh.extraores.Util.ModInfo;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class InitBlocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ModInfo.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModInfo.MOD_ID);
    private static <T extends Block>RegistryObject<T> register(String name, Supplier<T> supplier)
    {
        RegistryObject<T> block = BLOCKS.register(name,supplier);
        ITEMS.register(name, () -> new ItemBlockExOre(block.get()));
        return block;
    }
    public static void registerBlocks()
    {
        if (ConfigRegistryList.registerAdamantine.get())
        {
            BlockList.blockOreAdamantine = register("adamantineore", () -> new BlockEXOre( 1.5F, 1.5F));
            BlockList.blockAdamantine = register("adamantineblock", () -> new BlockEXOre( 1.5F, 1.5F));
            BlockList.blockDeepslateOreAdamantine = register("deepslateadamantineore", () -> new BlockEXOre( 1.5F, 1.5F, SoundType.DEEPSLATE));
        }

        if(ConfigRegistryList.registerAgate.get())
        {
            BlockList.blockOreAgate = register("agateore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockAgate = register("agateblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreAgate = register("deepslateagateore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerAldourite.get())
        {
            BlockList.blockOreAldourite = register("aldouriteore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockAldourite = register("aldouriteblock", () -> new BlockEXOre(1.5F,1.5F));
        }
        if (ConfigRegistryList.registerAluminum.get())
        {
            BlockList.blockOreAluminum = register("aluminumore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockAluminum = register("aluminumblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreAluminum = register("deepslatealuminumore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerAmericium.get())
        {
            BlockList.blockOreAmericium = register("americiumore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockAmericium = register("americiumblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreAmericium = register("deepslateamericiumore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerAmethyst.get())
        {
            BlockList.blockOreAmethyst = register("amethystore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockAmethyst = register("amethystblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreAmethyst = register("deepslateamethystore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerAmetrine.get())
        {
            BlockList.blockOreAmetrine = register("ametrineore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockAmetrine = register("ametrineblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreAmetrine = register("deepslateametrineore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerAmordrine.get())
        {
            BlockList.blockOreAmordrine = register("amordrineore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockAmordrine = register("amordrineblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreAmordrine = register("deepslateamordrineore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerAngmallen.get())
        {
            BlockList.blockOreAngmallen = register("angmallenore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockAngmallen = register("angmallenblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreAngmallen = register("deepslateangmallenore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerAquamarine.get())
        {
            BlockList.blockOreAquamarine = register("aquamarineore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockAquamarine = register("aquamarineblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreAquamarine = register("deepslateaquamarineore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerAstralSilver.get())
        {
            BlockList.blockOreAstralSilver = register("astralsilverore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockAstralSilver = register("astralsilverblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreAstralSilver = register("deepslateastralsilverore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerAtlarus.get())
        {
            BlockList.blockOreAtlarus = register("atlarusore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockAtlarus = register("atlarusblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreAtlarus = register("deepslateatlarusore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerAzureSilver.get())
        {
            BlockList.blockOreAzureSilver = register("azuresilverore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockAzureSilver = register("azuresilverblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreAzureSilver = register("deepslateazuresilverore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerBismuth.get())
        {
            BlockList.blockOreBismuth = register("bismuthore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockBismuth = register("bismuthblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreBismuth = register("deepslatebismuthore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerBlackSteel.get())
        {
            BlockList.blockOreBlackSteel = register("blacksteelore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockBlackSteel = register("blacksteelblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreBlackSteel = register("deepslateblacksteelore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerCadmium.get())
        {
            BlockList.blockOreCadmium = register("cadmiumore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockCadmium = register("cadmiumblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreCadmium = register("deepslatecadmiumore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerCarmot.get())
        {
            BlockList.blockOreCarmot = register("carmotore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockCarmot = register("carmotblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreCarmot = register("deepslatecarmotore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerCelenegil.get())
        {
            BlockList.blockOreCelenegil = register("celenegilore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockCelenegil = register("celenegilblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreCelenegil = register("deepslatecelenegilore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerCeruclase.get())
        {
            BlockList.blockOreCeruclase = register("ceruclaseore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockCeruclase = register("ceruclaseblock", () -> new BlockEXOre(1.5F,1.5F));
        }
        if (ConfigRegistryList.registerChromium.get())
        {
            BlockList.blockOreChromium = register("chromiumore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockChromium = register("chromiumblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreChromium = register("deepslatechromiumore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerChrysocolla.get())
        {
            BlockList.blockOreChrysocolla = register("chrysocollaore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockChrysocolla = register("chrysocollablock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreChrysocolla = register("deepslatechrysocollaore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerCitrine.get())
        {
            BlockList.blockOreCitrine = register("citrineore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockCitrine = register("citrineblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreCitrine = register("deepslatecitrineore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerCobalt.get())
        {
            BlockList.blockOreCobalt = register("cobaltore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockCobalt = register("cobaltblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreCobalt = register("deepslatecobaltore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerCopper.get())
        {
            BlockList.blockOreCopper = register("copperore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockCopper = register("copperblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreCopper = register("deepslatecopperore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerCrimsonSteel.get())
        {
            BlockList.blockOreCrimsonSteel = register("crimsonsteelore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockCrimsonSteel = register("crimsonsteelblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreCrimsonSteel = register("deepslatecrimsonsteelore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerDeepIron.get())
        {
            BlockList.blockOreDeepIron = register("deepironore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepIron = register("deepironblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreDeepIron = register("deepslatedeepironore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerDesichalkos.get())
        {
            BlockList.blockOreDesichalkos = register("desichalkosore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDesichalkos = register("desichalkosblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreDesichalkos = register("deepslatedesichalkosore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerEximite.get())
        {
            BlockList.blockOreEximite = register("eximiteore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockEximite = register("eximiteblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreEximite = register("deepslateeximiteore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerGallium.get())
        {
            BlockList.blockOreGallium = register("galliumore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockGallium = register("galliumblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreGallium = register("deepslategalliumore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerGarnet.get())
        {
            BlockList.blockOreGarnet = register("garnetore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockGarnet = register("garnetblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreGarnet = register("deepslategarnetore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerHaderoth.get())
        {
            BlockList.blockOreHaderoth = register("haderothore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockHaderoth = register("haderothblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreHaderoth = register("deepslatehaderothore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerHepatizon.get())
        {
            BlockList.blockOreHepatizon = register("hepatizonore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockHepatizon = register("hepatizonblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreHepatizon = register("deepslatehepatizonore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerIgnatius.get())
        {
            BlockList.blockOreIgnatius = register("ignatiusore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockIgnatius = register("ignatiusblock", () -> new BlockEXOre(1.5F,1.5F));
        }
        if (ConfigRegistryList.registerIndium.get())
        {
            BlockList.blockOreIndium = register("indiumore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockIndium = register("indiumblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreIndium = register("deepslateindiumore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerInfuscolium.get())
        {
            BlockList.blockOreInfuscolium = register("infuscoliumore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockInfuscolium = register("infuscoliumblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreInfuscolium = register("deepslateinfuscoliumore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerInolashite.get())
        {
            BlockList.blockOreInolashite = register("inolashiteore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockInolashite = register("inolashiteblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreInolashite = register("deepslateinolashiteore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerIolite.get())
        {
            BlockList.blockOreIolite = register("ioliteore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockIolite = register("ioliteblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreIolite = register("deepslateioliteore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerIridium.get())
        {
            BlockList.blockOreIridium = register("iridiumore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockIridium = register("iridiumblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreIridium = register("deepslateiridiumore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerJade.get())
        {
            BlockList.blockOreJade = register("jadeore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockJade = register("jadeblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreJade = register("deepslatejadeore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerJasper.get())
        {
            BlockList.blockOreJasper = register("jasperore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockJasper = register("jasperblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreJasper = register("deepslatejasperore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerKalendrite.get())
        {
            BlockList.blockOreKalendrite = register("kalendriteore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockKalendrite = register("kalendriteblock", () -> new BlockEXOre(1.5F,1.5F));
        }
        if(ConfigRegistryList.registerKyanite.get())
        {
            BlockList.blockOreKyanite = register("kyaniteore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockKyanite = register("kyaniteblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreKyanite = register("deepslatekyaniteore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerLead.get())
        {
            BlockList.blockOreLead = register("leadore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockLead = register("leadblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreLead = register("deepslateleadore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerLemurite.get())
        {
            BlockList.blockOreLemurite = register("lemuriteore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockLemurite = register("lemuriteblock", () -> new BlockEXOre(1.5F,1.5F));
        }
        if(ConfigRegistryList.registerMalachite.get())
        {
            BlockList.blockOreMalachite = register("malachiteore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockMalachite = register("malachiteblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreMalachite = register("deepslatemalachiteore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerManganese.get())
        {
            BlockList.blockOreManganese = register("manganeseore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockManganese = register("manganeseblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreManganese = register("deepslatemanganeseore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerMeutoite.get())
        {
            BlockList.blockOreMeutoite = register("meutoiteore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockMeutoite = register("meutoiteblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreMeutoite = register("deepslatemeutoiteore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerMidasium.get())
        {
            BlockList.blockOreMidasium = register("midasiumore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockMidasium = register("midasiumblock", () -> new BlockEXOre(1.5F,1.5F));
        }
        if (ConfigRegistryList.registerMithril.get())
        {
            BlockList.blockOreMithril = register("mithrilore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockMithril = register("mithrilblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreMithril = register("deepslatemithrilore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerMolybdenum.get())
        {
            BlockList.blockOreMolybdenum = register("molybdenumore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockMolybdenum = register("molybdenumblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreMolybdenum = register("deepslatemolybdenumore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerNeodymium.get())
        {
            BlockList.blockOreNeodymium = register("neodymiumore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockNeodymium = register("neodymiumblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreNeodymium = register("deepslateneodymiumore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerNeptunium.get())
        {
            BlockList.blockOreNeptunium = register("neptuniumore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockNeptunium = register("neptuniumblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreNeptunium = register("deepslateneptuniumore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerNickel.get())
        {
            BlockList.blockOreNickel = register("nickelore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockNickel = register("nickelblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreNickel = register("deepslatenickelore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerNiobium.get())
        {
            BlockList.blockOreNiobium = register("niobiumore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockNiobium = register("niobiumblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreNiobium = register("deepslateniobiumore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerOnyx.get())
        {
            BlockList.blockOreOnyx = register("onyxore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockOnyx = register("onyxblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreOnyx = register("deepslateonyxore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerOpal.get())
        {
            BlockList.blockOreOpal = register("opalore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockOpal = register("opalblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreOpal = register("deepslateopalore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerOrichalcum.get())
        {
            BlockList.blockOreOrichalcum = register("orichalcumore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockOrichalcum = register("orichalcumblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreOrichalcum = register("deepslateorichalcumore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerOsmium.get())
        {
            BlockList.blockOreOsmium = register("osmiumore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockOsmium = register("osmiumblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreOsmium = register("deepslateosmiumore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerOureclase.get())
        {
            BlockList.blockOreOureclase = register("oureclaseore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockOureclase = register("oureclaseblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreOureclase = register("deepslateoureclaseore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerPalladium.get())
        {
            BlockList.blockOrePalladium = register("palladiumore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockPalladium = register("palladiumblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOrePalladium = register("deepslatepalladiumore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerPeridot.get())
        {
            BlockList.blockOrePeridot = register("peridotore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockPeridot = register("peridotblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOrePeridot = register("deepslateperidotore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerPhoenixite.get())
        {
            BlockList.blockOrePhoenixite = register("phoenixiteore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockPhoenixite = register("phoenixiteblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOrePhoenixite = register("deepslatephoenixiteore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerPlatinum.get())
        {
            BlockList.blockOrePlatinum = register("platinumore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockPlatinum = register("platinumblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOrePlatinum = register("deepslateplatinumore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerPlutonium.get())
        {
            BlockList.blockOrePlutonium = register("plutoniumore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockPlutonium = register("plutoniumblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOrePlutonium = register("deepslateplutoniumore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerPolonium.get())
        {
            BlockList.blockOrePolonium = register("poloniumore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockPolonium = register("poloniumblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOrePolonium = register("deepslatepoloniumore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerPromethium.get())
        {
            BlockList.blockOrePromethium = register("promethiumore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockPromethium = register("promethiumblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOrePromethium = register("deepslatepromethiumore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerQuartz.get())
        {
            BlockList.blockOreQuartz = register("quartzore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockQuartz = register("quartzblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreQuartz = register("deepslatequartzore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerRhenium.get())
        {
            BlockList.blockOreRhenium = register("rheniumore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockRhenium = register("rheniumblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreRhenium = register("deepslaterheniumore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerRhodium.get())
        {
            BlockList.blockOreRhodium = register("rhodiumore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockRhodium = register("rhodiumblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreRhodium = register("deepslaterhodiumore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerRubracium.get())
        {
            BlockList.blockOreRubracium = register("rubraciumore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockRubracium = register("rubraciumblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreRubracium = register("deepslaterubraciumore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerRuby.get())
        {
            BlockList.blockOreRuby = register("rubyore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockRuby = register("rubyblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreRuby = register("deepslaterubyore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerRuthenium.get())
        {
            BlockList.blockOreRuthenium = register("rutheniumore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockRuthenium = register("rutheniumblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreRuthenium = register("deepslaterutheniumore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerSanguinite.get())
        {
            BlockList.blockOreSanguinite = register("sanguiniteore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockSanguinite = register("sanguiniteblock", () -> new BlockEXOre(1.5F,1.5F));
        }
        if(ConfigRegistryList.registerSapphire.get())
        {
            BlockList.blockOreSapphire = register("sapphireore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockSapphire = register("sapphireblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreSapphire = register("deepslatesapphireore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerShadowIron.get())
        {
            BlockList.blockOreShadowIron = register("shadowironore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockShadowIron = register("shadowironblock", () -> new BlockEXOre(1.5F,1.5F));
        }
        if (ConfigRegistryList.registerSilver.get())
        {
            BlockList.blockOreSilver = register("silverore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockSilver = register("silverblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreSilver = register("deepslatesilverore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerSpinel.get())
        {
            BlockList.blockOreSpinel = register("spinelore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockSpinel = register("spinelblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreSpinel = register("deepslatespinelore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerSugilite.get())
        {
            BlockList.blockOreSugilite = register("sugiliteore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockSugilite = register("sugiliteblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreSugilite = register("deepslatesugiliteore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerTantalum.get())
        {
            BlockList.blockOreTantalum = register("tantalumore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockTantalum = register("tantalumblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreTantalum = register("deepslatetantalumore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerTanzanite.get())
        {
            BlockList.blockOreTanzanite = register("tanzaniteore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockTanzanite = register("tanzaniteblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreTanzanite = register("deepslatetanzaniteore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerTartarite.get())
        {
            BlockList.blockOreTartarite = register("tartariteore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockTartarite = register("tartariteblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreTartarite = register("deepslatetartariteore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerTechnetium.get())
        {
            BlockList.blockOreTechnetium = register("technetiumore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockTechnetium = register("technetiumblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreTechnetium = register("deepslatetechnetiumore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerThallium.get())
        {
            BlockList.blockOreThallium = register("thalliumore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockThallium = register("thalliumblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreThallium = register("deepslatethalliumore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerTin.get())
        {
            BlockList.blockOreTin = register("tinore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockTin = register("tinblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreTin = register("deepslatetinore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerTitanium.get())
        {
            BlockList.blockOreTitanium = register("titaniumore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockTitanium = register("titaniumblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreTitanium = register("deepslatetitaniumore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerTopaz.get())
        {
            BlockList.blockOreTopaz = register("topazore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockTopaz = register("topazblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreTopaz = register("deepslatetopazore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerTourmaline.get())
        {
            BlockList.blockOreTourmaline = register("tourmalineore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockTourmaline = register("tourmalineblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreTourmaline = register("deepslatetourmalineore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerTritium.get())
        {
            BlockList.blockOreTritium = register("tritiumore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockTritium = register("tritiumblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreTritium = register("deepslatetritiumore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerTungsten.get())
        {
            BlockList.blockOreTungsten = register("tungstenore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockTungsten = register("tungstenblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreTungsten = register("deepslatetungstenore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerTurquoise.get())
        {
            BlockList.blockOreTurquoise = register("turquoiseore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockTurquoise = register("turquoiseblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreTurquoise = register("deepslateturquoiseore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerUnobtainium.get())
        {
            BlockList.blockOreUnobtainium = register("unobtainiumore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockUnobtainium = register("unobtainiumblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreUnobtainium = register("deepslateunobtainiumore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerUranium.get())
        {
            BlockList.blockOreUranium = register("uraniumore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockUranium = register("uraniumblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreUranium = register("deepslateuraniumore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerVanadium.get())
        {
            BlockList.blockOreVanadium = register("vanadiumore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockVanadium = register("vanadiumblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreVanadium = register("deepslatevanadiumore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerVibranium.get())
        {
            BlockList.blockOreVibranium = register("vibraniumore",() -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockVibranium = register("vibraniumblock",() -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreVibranium = register("deepslatevibraniumore",() -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerVulcanite.get())
        {
            BlockList.blockOreVulcanite = register("vulcaniteore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockVulcanite = register("vulcaniteblock", () -> new BlockEXOre(1.5F,1.5F));
        }
        if (ConfigRegistryList.registerVyroxeres.get())
        {
            BlockList.blockOreVyroxeres = register("vyroxeresore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockVyroxeres = register("vyroxeresblock", () -> new BlockEXOre(1.5F,1.5F));
        }
        if(ConfigRegistryList.registerYellorite.get())
        {
            BlockList.blockOreYellorite = register("yelloriteore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockYellorite = register("yelloriteblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreYellorite = register("deepslateyelloriteore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerZinc.get())
        {
            BlockList.blockOreZinc = register("zincore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockZinc = register("zincblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreZinc = register("deepslatezincore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerZirconium.get())
        {
            BlockList.blockOreZirconium = register("zirconiumore", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockZirconium = register("zirconiumblock", () -> new BlockEXOre(1.5F,1.5F));
            BlockList.blockDeepslateOreZirconium = register("deepslatezirconiumore", () -> new BlockEXOre(1.5F,1.5F,SoundType.DEEPSLATE));
        }
    }

    public static void registerItems()
    {
        if (ConfigRegistryList.registerAdamantine.get())
        {
            ItemList.itemIngotAdamantine = ITEMS.register("adamantineingot", () -> new ItemEXOre());
            ItemList.itemDustAdamantine = ITEMS.register("adamantinedust", () -> new ItemEXOre());
            ItemList.itemShardAdamantine = ITEMS.register("adamantineshard", () -> new ItemEXOre());
            ItemList.itemClumpAdamantine = ITEMS.register("adamantineclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustAdamantine = ITEMS.register("adamantinedirtydust", () -> new ItemEXOre());
            ItemList.itemRawAdamantine = ITEMS.register("rawadamantine", () -> new ItemEXOre());
        }
        
        if (ConfigRegistryList.registerAgate.get())
        {
            ItemList.itemGemAgate = ITEMS.register("agate", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerAldourite.get())
        {
            ItemList.itemIngotAldourite = ITEMS.register("aldouriteingot", () -> new ItemEXOre());
            ItemList.itemDustAldourite = ITEMS.register("aldouritedust", () -> new ItemEXOre());
            ItemList.itemShardAldourite = ITEMS.register("aldouriteshard", () -> new ItemEXOre());
            ItemList.itemClumpAldourite = ITEMS.register("aldouriteclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustAldourite = ITEMS.register("aldouritedirtydust", () -> new ItemEXOre());
            ItemList.itemRawAldourite = ITEMS.register("rawaldourite", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerAluminum.get())
        {
            ItemList.itemIngotAluminum = ITEMS.register("aluminumingot", () -> new ItemEXOre());
            ItemList.itemDustAluminum = ITEMS.register("aluminumdust", () -> new ItemEXOre());
            ItemList.itemShardAluminum = ITEMS.register("aluminumshard", () -> new ItemEXOre());
            ItemList.itemClumpAluminum = ITEMS.register("aluminumclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustAluminum = ITEMS.register("aluminumdirtydust", () -> new ItemEXOre());
            ItemList.itemRawAluminum = ITEMS.register("rawaluminum", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerAmericium.get())
        {
            ItemList.itemIngotAmericium = ITEMS.register("americiumingot", () -> new ItemEXOre());
            ItemList.itemDustAmericium = ITEMS.register("americiumdust", () -> new ItemEXOre());
            ItemList.itemShardAmericium = ITEMS.register("americiumshard", () -> new ItemEXOre());
            ItemList.itemClumpAmericium = ITEMS.register("americiumclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustAmericium = ITEMS.register("americiumdirtydust", () -> new ItemEXOre());
            ItemList.itemRawAmericium = ITEMS.register("rawamericium", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerAmethyst.get())
        {
            ItemList.itemGemAmethyst = ITEMS.register("amethyst", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerAmetrine.get())
        {
            ItemList.itemGemAmetrine = ITEMS.register("ametrine", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerAmordrine.get())
        {
            ItemList.itemIngotAmordrine = ITEMS.register("amordrineingot", () -> new ItemEXOre());
            ItemList.itemDustAmordrine = ITEMS.register("amordrinedust", () -> new ItemEXOre());
            ItemList.itemShardAmordrine = ITEMS.register("amordrineshard", () -> new ItemEXOre());
            ItemList.itemClumpAmordrine = ITEMS.register("amordrineclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustAmordrine = ITEMS.register("amordrinedirtydust", () -> new ItemEXOre());
            ItemList.itemRawAmordrine = ITEMS.register("rawamordrine", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerAngmallen.get())
        {
            ItemList.itemIngotAngmallen = ITEMS.register("angmalleningot", () -> new ItemEXOre());
            ItemList.itemDustAngmallen = ITEMS.register("angmallendust", () -> new ItemEXOre());
            ItemList.itemShardAngmallen = ITEMS.register("angmallenshard", () -> new ItemEXOre());
            ItemList.itemClumpAngmallen = ITEMS.register("angmallenclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustAngmallen = ITEMS.register("angmallendirtydust", () -> new ItemEXOre());
            ItemList.itemRawAngmallen = ITEMS.register("rawangmallen", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerAquamarine.get())
        {
            ItemList.itemGemAquamarine = ITEMS.register("aquamarine", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerAstralSilver.get())
        {
            ItemList.itemIngotAstralSilver = ITEMS.register("astralsilveringot", () -> new ItemEXOre());
            ItemList.itemDustAstralSilver = ITEMS.register("astralsilverdust", () -> new ItemEXOre());
            ItemList.itemShardAstralSilver = ITEMS.register("astralsilvershard", () -> new ItemEXOre());
            ItemList.itemClumpAstralSilver = ITEMS.register("astralsilverclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustAstralSilver = ITEMS.register("astralsilverdirtydust", () -> new ItemEXOre());
            ItemList.itemRawAstralSilver = ITEMS.register("rawastralsilver", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerAtlarus.get())
        {
            ItemList.itemIngotAtlarus = ITEMS.register("atlarusingot", () -> new ItemEXOre());
            ItemList.itemDustAtlarus = ITEMS.register("atlarusdust", () -> new ItemEXOre());
            ItemList.itemShardAtlarus = ITEMS.register("atlarusshard", () -> new ItemEXOre());
            ItemList.itemClumpAtlarus = ITEMS.register("atlarusclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustAtlarus = ITEMS.register("atlarusdirtydust", () -> new ItemEXOre());
            ItemList.itemRawAtlarus = ITEMS.register("rawatlarus", () -> new ItemEXOre());
        }
        if(ConfigRegistryList.registerAzureSilver.get())
        {
            ItemList.itemIngotAzureSilver = ITEMS.register("azuresilveringot", () -> new ItemEXOre());
            ItemList.itemDustAzureSilver = ITEMS.register("azuresilverdust", () -> new ItemEXOre());
            ItemList.itemShardAzureSilver = ITEMS.register("azuresilvershard", () -> new ItemEXOre());
            ItemList.itemClumpAzureSilver = ITEMS.register("azuresilverclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustAzureSilver = ITEMS.register("azuresilverdirtydust", () -> new ItemEXOre());
            ItemList.itemRawAzureSilver = ITEMS.register("rawazuresilver", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerBismuth.get())
        {
            ItemList.itemIngotBismuth = ITEMS.register("bismuthingot", () -> new ItemEXOre());
            ItemList.itemDustBismuth = ITEMS.register("bismuthdust", () -> new ItemEXOre());
            ItemList.itemShardBismuth = ITEMS.register("bismuthshard", () -> new ItemEXOre());
            ItemList.itemClumpBismuth = ITEMS.register("bismuthclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustBismuth = ITEMS.register("bismuthdirtydust", () -> new ItemEXOre());
            ItemList.itemRawBismuth = ITEMS.register("rawbismuth", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerBlackSteel.get())
        {
            ItemList.itemIngotBlackSteel = ITEMS.register("blacksteelingot", () -> new ItemEXOre());
            ItemList.itemDustBlackSteel = ITEMS.register("blacksteeldust", () -> new ItemEXOre());
            ItemList.itemShardBlackSteel = ITEMS.register("blacksteelshard", () -> new ItemEXOre());
            ItemList.itemClumpBlackSteel = ITEMS.register("blacksteelclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustBlackSteel = ITEMS.register("blacksteeldirtydust", () -> new ItemEXOre());
            ItemList.itemRawBlackSteel = ITEMS.register("rawblacksteel", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerCadmium.get())
        {
            ItemList.itemIngotCadmium = ITEMS.register("cadmiumingot", () -> new ItemEXOre());
            ItemList.itemDustCadmium = ITEMS.register("cadmiumdust", () -> new ItemEXOre());
            ItemList.itemShardCadmium = ITEMS.register("cadmiumshard", () -> new ItemEXOre());
            ItemList.itemClumpCadmium = ITEMS.register("cadmiumclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustCadmium = ITEMS.register("cadmiumdirtydust", () -> new ItemEXOre());
            ItemList.itemRawCadmium = ITEMS.register("rawcadmium", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerCarmot.get())
        {
            ItemList.itemIngotCarmot = ITEMS.register("carmotingot", () -> new ItemEXOre());
            ItemList.itemDustCarmot = ITEMS.register("carmotdust", () -> new ItemEXOre());
            ItemList.itemShardCarmot = ITEMS.register("carmotshard", () -> new ItemEXOre());
            ItemList.itemClumpCarmot = ITEMS.register("carmotclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustCarmot = ITEMS.register("carmotdirtydust", () -> new ItemEXOre());
            ItemList.itemRawCarmot = ITEMS.register("rawcarmot", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerCelenegil.get())
        {
            ItemList.itemIngotCelenegil = ITEMS.register("celenegilingot", () -> new ItemEXOre());
            ItemList.itemDustCelenegil = ITEMS.register("celenegildust", () -> new ItemEXOre());
            ItemList.itemShardCelenegil = ITEMS.register("celenegilshard", () -> new ItemEXOre());
            ItemList.itemClumpCelenegil = ITEMS.register("celenegilclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustCelenegil = ITEMS.register("celenegildirtydust", () -> new ItemEXOre());
            ItemList.itemRawCelenegil = ITEMS.register("rawcelenegil", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerCeruclase.get())
        {
            ItemList.itemIngotCeruclase = ITEMS.register("ceruclaseingot", () -> new ItemEXOre());
            ItemList.itemDustCeruclase = ITEMS.register("ceruclasedust", () -> new ItemEXOre());
            ItemList.itemShardCeruclase = ITEMS.register("ceruclaseshard", () -> new ItemEXOre());
            ItemList.itemClumpCeruclase = ITEMS.register("ceruclaseclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustCeruclase = ITEMS.register("ceruclasedirtydust", () -> new ItemEXOre());
            ItemList.itemRawCeruclase = ITEMS.register("rawceruclase", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerChromium.get())
        {
            ItemList.itemIngotChromium = ITEMS.register("chromiumingot", () -> new ItemEXOre());
            ItemList.itemDustChromium = ITEMS.register("chromiumdust", () -> new ItemEXOre());
            ItemList.itemShardChromium = ITEMS.register("chromiumshard", () -> new ItemEXOre());
            ItemList.itemClumpChromium = ITEMS.register("chromiumclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustChromium = ITEMS.register("chromiumdirtydust", () -> new ItemEXOre());
            ItemList.itemRawChromium = ITEMS.register("rawchromium", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerChrysocolla.get())
        {
            ItemList.itemGemChrysocolla = ITEMS.register("chrysocolla", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerCitrine.get())
        {
            ItemList.itemGemCitrine = ITEMS.register("citrine", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerCobalt.get())
        {
            ItemList.itemIngotCobalt = ITEMS.register("cobaltingot", () -> new ItemEXOre());
            ItemList.itemDustCobalt = ITEMS.register("cobaltdust", () -> new ItemEXOre());
            ItemList.itemShardCobalt = ITEMS.register("cobaltshard", () -> new ItemEXOre());
            ItemList.itemClumpCobalt = ITEMS.register("cobaltclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustCobalt = ITEMS.register("cobaltdirtydust", () -> new ItemEXOre());
            ItemList.itemRawCobalt = ITEMS.register("rawcobalt", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerCopper.get())
        {
            ItemList.itemIngotCopper = ITEMS.register("copperingot", () -> new ItemEXOre());
            ItemList.itemDustCopper = ITEMS.register("copperdust", () -> new ItemEXOre());
            ItemList.itemShardCopper = ITEMS.register("coppershard", () -> new ItemEXOre());
            ItemList.itemClumpCopper = ITEMS.register("copperclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustCopper = ITEMS.register("copperdirtydust", () -> new ItemEXOre());
            ItemList.itemRawCopper = ITEMS.register("rawcopper", () -> new ItemEXOre());
        }
        if(ConfigRegistryList.registerCrimsonSteel.get())
        {
            ItemList.itemIngotCrimsonSteel = ITEMS.register("crimsonsteelingot", () -> new ItemEXOre());
            ItemList.itemDustCrimsonSteel = ITEMS.register("crimsonsteeldust", () -> new ItemEXOre());
            ItemList.itemShardCrimsonSteel = ITEMS.register("crimsonsteelshard", () -> new ItemEXOre());
            ItemList.itemClumpCrimsonSteel = ITEMS.register("crimsonsteelclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustCrimsonSteel = ITEMS.register("crimsonsteeldirtydust", () -> new ItemEXOre());
            ItemList.itemRawCrimsonSteel = ITEMS.register("rawcrimsonsteel", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerDeepIron.get())
        {
            ItemList.itemIngotDeepIron = ITEMS.register("deepironingot", () -> new ItemEXOre());
            ItemList.itemDustDeepIron = ITEMS.register("deepirondust", () -> new ItemEXOre());
            ItemList.itemShardDeepIron = ITEMS.register("deepironshard", () -> new ItemEXOre());
            ItemList.itemClumpDeepIron = ITEMS.register("deepironclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustDeepIron = ITEMS.register("deepirondirtydust", () -> new ItemEXOre());
            ItemList.itemRawDeepIron = ITEMS.register("rawdeepiron", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerDesichalkos.get())
        {
            ItemList.itemIngotDesichalkos = ITEMS.register("desichalkosingot", () -> new ItemEXOre());
            ItemList.itemDustDesichalkos = ITEMS.register("desichalkosdust", () -> new ItemEXOre());
            ItemList.itemShardDesichalkos = ITEMS.register("desichalkosshard", () -> new ItemEXOre());
            ItemList.itemClumpDesichalkos = ITEMS.register("desichalkosclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustDesichalkos = ITEMS.register("desichalkosdirtydust", () -> new ItemEXOre());
            ItemList.itemRawDesichalkos = ITEMS.register("rawdesichalkos", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerEximite.get())
        {
            ItemList.itemIngotEximite = ITEMS.register("eximiteingot", () -> new ItemEXOre());
            ItemList.itemDustEximite = ITEMS.register("eximitedust", () -> new ItemEXOre());
            ItemList.itemShardEximite = ITEMS.register("eximiteshard", () -> new ItemEXOre());
            ItemList.itemClumpEximite = ITEMS.register("eximiteclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustEximite = ITEMS.register("eximitedirtydust", () -> new ItemEXOre());
            ItemList.itemRawEximite = ITEMS.register("raweximite", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerGallium.get())
        {
            ItemList.itemIngotGallium = ITEMS.register("galliumingot", () -> new ItemEXOre());
            ItemList.itemDustGallium = ITEMS.register("galliumdust", () -> new ItemEXOre());
            ItemList.itemShardGallium = ITEMS.register("galliumshard", () -> new ItemEXOre());
            ItemList.itemClumpGallium = ITEMS.register("galliumclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustGallium = ITEMS.register("galliumdirtydust", () -> new ItemEXOre());
            ItemList.itemRawGallium = ITEMS.register("rawgallium", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerGarnet.get())
        {
            ItemList.itemGemGarnet = ITEMS.register("garnet", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerHaderoth.get())
        {
            ItemList.itemIngotHaderoth = ITEMS.register("haderothingot", () -> new ItemEXOre());
            ItemList.itemDustHaderoth = ITEMS.register("haderothdust", () -> new ItemEXOre());
            ItemList.itemShardHaderoth = ITEMS.register("haderothshard", () -> new ItemEXOre());
            ItemList.itemClumpHaderoth = ITEMS.register("haderothclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustHaderoth = ITEMS.register("haderothdirtydust", () -> new ItemEXOre());
            ItemList.itemRawHaderoth = ITEMS.register("rawhaderoth", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerHepatizon.get())
        {
            ItemList.itemIngotHepatizon = ITEMS.register("hepatizoningot", () -> new ItemEXOre());
            ItemList.itemDustHepatizon = ITEMS.register("hepatizondust", () -> new ItemEXOre());
            ItemList.itemShardHepatizon = ITEMS.register("hepatizonshard", () -> new ItemEXOre());
            ItemList.itemClumpHepatizon = ITEMS.register("hepatizonclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustHepatizon = ITEMS.register("hepatizondirtydust", () -> new ItemEXOre());
            ItemList.itemRawHepatizon = ITEMS.register("rawhepatizon", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerIgnatius.get())
        {
            ItemList.itemIngotIgnatius = ITEMS.register("ignatiusingot", () -> new ItemEXOre());
            ItemList.itemDustIgnatius = ITEMS.register("ignatiusdust", () -> new ItemEXOre());
            ItemList.itemShardIgnatius = ITEMS.register("ignatiusshard", () -> new ItemEXOre());
            ItemList.itemClumpIgnatius = ITEMS.register("ignatiusclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustIgnatius = ITEMS.register("ignatiusdirtydust", () -> new ItemEXOre());
            ItemList.itemRawIgnatius = ITEMS.register("rawignatius", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerIndium.get())
        {
            ItemList.itemIngotIndium = ITEMS.register("indiumingot", () -> new ItemEXOre());
            ItemList.itemDustIndium = ITEMS.register("indiumdust", () -> new ItemEXOre());
            ItemList.itemShardIndium = ITEMS.register("indiumshard", () -> new ItemEXOre());
            ItemList.itemClumpIndium = ITEMS.register("indiumclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustIndium = ITEMS.register("indiumdirtydust", () -> new ItemEXOre());
            ItemList.itemRawIndium = ITEMS.register("rawindium", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerInfuscolium.get())
        {
            ItemList.itemIngotInfuscolium = ITEMS.register("infuscoliumingot", () -> new ItemEXOre());
            ItemList.itemDustInfuscolium = ITEMS.register("infuscoliumdust", () -> new ItemEXOre());
            ItemList.itemShardInfuscolium = ITEMS.register("infuscoliumshard", () -> new ItemEXOre());
            ItemList.itemClumpInfuscolium = ITEMS.register("infuscoliumclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustInfuscolium = ITEMS.register("infuscoliumdirtydust", () -> new ItemEXOre());
            ItemList.itemRawInfuscolium = ITEMS.register("rawinfuscolium", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerInolashite.get())
        {
            ItemList.itemIngotInolashite = ITEMS.register("inolashiteingot", () -> new ItemEXOre());
            ItemList.itemDustInolashite = ITEMS.register("inolashitedust", () -> new ItemEXOre());
            ItemList.itemShardInolashite = ITEMS.register("inolashiteshard", () -> new ItemEXOre());
            ItemList.itemClumpInolashite = ITEMS.register("inolashiteclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustInolashite = ITEMS.register("inolashitedirtydust", () -> new ItemEXOre());
            ItemList.itemRawInolashite = ITEMS.register("rawinolashite", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerIolite.get())
        {
            ItemList.itemGemIolite = ITEMS.register("iolite", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerIridium.get())
        {
            ItemList.itemIngotIridium = ITEMS.register("iridiumingot", () -> new ItemEXOre());
            ItemList.itemDustIridium = ITEMS.register("iridiumdust", () -> new ItemEXOre());
            ItemList.itemShardIridium = ITEMS.register("iridiumshard", () -> new ItemEXOre());
            ItemList.itemClumpIridium = ITEMS.register("iridiumclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustIridium = ITEMS.register("iridiumdirtydust", () -> new ItemEXOre());
            ItemList.itemRawIridium = ITEMS.register("rawiridium", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerJade.get())
        {
            ItemList.itemGemJade = ITEMS.register("jade", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerJasper.get())
        {
            ItemList.itemGemJasper = ITEMS.register("jasper", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerKalendrite.get())
        {
            ItemList.itemIngotKalendrite = ITEMS.register("kalendriteingot", () -> new ItemEXOre());
            ItemList.itemDustKalendrite = ITEMS.register("kalendritedust", () -> new ItemEXOre());
            ItemList.itemShardKalendrite = ITEMS.register("kalendriteshard", () -> new ItemEXOre());
            ItemList.itemClumpKalendrite = ITEMS.register("kalendriteclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustKalendrite = ITEMS.register("kalendritedirtydust", () -> new ItemEXOre());
            ItemList.itemRawKalendrite = ITEMS.register("rawkalendrite", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerKyanite.get())
        {
            ItemList.itemGemKyanite = ITEMS.register("kyanite", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerLead.get())
        {
            ItemList.itemIngotLead = ITEMS.register("leadingot", () -> new ItemEXOre());
            ItemList.itemDustLead = ITEMS.register("leaddust", () -> new ItemEXOre());
            ItemList.itemShardLead = ITEMS.register("leadshard", () -> new ItemEXOre());
            ItemList.itemClumpLead = ITEMS.register("leadclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustLead = ITEMS.register("leaddirtydust", () -> new ItemEXOre());
            ItemList.itemRawLead = ITEMS.register("rawlead", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerLemurite.get())
        {
            ItemList.itemIngotLemurite = ITEMS.register("lemuriteingot", () -> new ItemEXOre());
            ItemList.itemDustLemurite = ITEMS.register("lemuritedust", () -> new ItemEXOre());
            ItemList.itemShardLemurite = ITEMS.register("lemuriteshard", () -> new ItemEXOre());
            ItemList.itemClumpLemurite = ITEMS.register("lemuriteclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustLemurite = ITEMS.register("lemuritedirtydust", () -> new ItemEXOre());
            ItemList.itemRawLemurite = ITEMS.register("rawlemurite", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerMalachite.get())
        {
            ItemList.itemGemMalachite = ITEMS.register("malachite", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerManganese.get())
        {
            ItemList.itemIngotManganese = ITEMS.register("manganeseingot", () -> new ItemEXOre());
            ItemList.itemDustManganese = ITEMS.register("manganesedust", () -> new ItemEXOre());
            ItemList.itemShardManganese = ITEMS.register("manganeseshard", () -> new ItemEXOre());
            ItemList.itemClumpManganese = ITEMS.register("manganeseclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustManganese = ITEMS.register("manganesedirtydust", () -> new ItemEXOre());
            ItemList.itemRawManganese = ITEMS.register("rawmanganese", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerMeutoite.get())
        {
            ItemList.itemIngotMeutoite = ITEMS.register("meutoiteingot", () -> new ItemEXOre());
            ItemList.itemDustMeutoite = ITEMS.register("meutoitedust", () -> new ItemEXOre());
            ItemList.itemShardMeutoite = ITEMS.register("meutoiteshard", () -> new ItemEXOre());
            ItemList.itemClumpMeutoite = ITEMS.register("meutoiteclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustMeutoite = ITEMS.register("meutoitedirtydust", () -> new ItemEXOre());
            ItemList.itemRawMeutoite = ITEMS.register("rawmeutoite", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerMidasium.get())
        {
            ItemList.itemIngotMidasium = ITEMS.register("midasiumingot", () -> new ItemEXOre());
            ItemList.itemDustMidasium = ITEMS.register("midasiumdust", () -> new ItemEXOre());
            ItemList.itemShardMidasium = ITEMS.register("midasiumshard", () -> new ItemEXOre());
            ItemList.itemClumpMidasium = ITEMS.register("midasiumclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustMidasium = ITEMS.register("midasiumdirtydust", () -> new ItemEXOre());
            ItemList.itemRawMidasium = ITEMS.register("rawmidasium", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerMithril.get())
        {
            ItemList.itemIngotMithril = ITEMS.register("mithrilingot", () -> new ItemEXOre());
            ItemList.itemDustMithril = ITEMS.register("mithrildust", () -> new ItemEXOre());
            ItemList.itemShardMithril = ITEMS.register("mithrilshard", () -> new ItemEXOre());
            ItemList.itemClumpMithril = ITEMS.register("mithrilclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustMithril = ITEMS.register("mithrildirtydust", () -> new ItemEXOre());
            ItemList.itemRawMithril = ITEMS.register("rawmithril", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerMolybdenum.get())
        {
            ItemList.itemIngotMolybdenum = ITEMS.register("molybdenumingot", () -> new ItemEXOre());
            ItemList.itemDustMolybdenum = ITEMS.register("molybdenumdust", () -> new ItemEXOre());
            ItemList.itemShardMolybdenum = ITEMS.register("molybdenumshard", () -> new ItemEXOre());
            ItemList.itemClumpMolybdenum = ITEMS.register("molybdenumclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustMolybdenum = ITEMS.register("molybdenumdirtydust", () -> new ItemEXOre());
            ItemList.itemRawMolybdenum = ITEMS.register("rawmolybdenum", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerNeodymium.get())
        {
            ItemList.itemIngotNeodymium = ITEMS.register("neodymiumingot", () -> new ItemEXOre());
            ItemList.itemDustNeodymium = ITEMS.register("neodymiumdust", () -> new ItemEXOre());
            ItemList.itemShardNeodymium = ITEMS.register("neodymiumshard", () -> new ItemEXOre());
            ItemList.itemClumpNeodymium = ITEMS.register("neodymiumclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustNeodymium = ITEMS.register("neodymiumdirtydust", () -> new ItemEXOre());
            ItemList.itemRawNeodymium = ITEMS.register("rawneodymium", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerNeptunium.get())
        {
            ItemList.itemIngotNeptunium = ITEMS.register("neptuniumingot", () -> new ItemEXOre());
            ItemList.itemDustNeptunium = ITEMS.register("neptuniumdust", () -> new ItemEXOre());
            ItemList.itemShardNeptunium = ITEMS.register("neptuniumshard", () -> new ItemEXOre());
            ItemList.itemClumpNeptunium = ITEMS.register("neptuniumclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustNeptunium = ITEMS.register("neptuniumdirtydust", () -> new ItemEXOre());
            ItemList.itemRawNeptunium = ITEMS.register("rawneptunium", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerNickel.get())
        {
            ItemList.itemIngotNickel = ITEMS.register("nickelingot", () -> new ItemEXOre());
            ItemList.itemDustNickel = ITEMS.register("nickeldust", () -> new ItemEXOre());
            ItemList.itemShardNickel = ITEMS.register("nickelshard", () -> new ItemEXOre());
            ItemList.itemClumpNickel = ITEMS.register("nickelclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustNickel = ITEMS.register("nickeldirtydust", () -> new ItemEXOre());
            ItemList.itemRawNickel = ITEMS.register("rawnickel", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerNiobium.get())
        {
            ItemList.itemIngotNiobium = ITEMS.register("niobiumingot", () -> new ItemEXOre());
            ItemList.itemDustNiobium = ITEMS.register("niobiumdust", () -> new ItemEXOre());
            ItemList.itemShardNiobium = ITEMS.register("niobiumshard", () -> new ItemEXOre());
            ItemList.itemClumpNiobium = ITEMS.register("niobiumclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustNiobium = ITEMS.register("niobiumdirtydust", () -> new ItemEXOre());
            ItemList.itemRawNiobium = ITEMS.register("rawniobium", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerOnyx.get())
        {
            ItemList.itemGemOnyx = ITEMS.register("onyx", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerOpal.get())
        {
            ItemList.itemGemOpal = ITEMS.register("opal", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerOrichalcum.get())
        {
            ItemList.itemIngotOrichalcum = ITEMS.register("orichalcumingot", () -> new ItemEXOre());
            ItemList.itemDustOrichalcum = ITEMS.register("orichalcumdust", () -> new ItemEXOre());
            ItemList.itemShardOrichalcum = ITEMS.register("orichalcumshard", () -> new ItemEXOre());
            ItemList.itemClumpOrichalcum = ITEMS.register("orichalcumclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustOrichalcum = ITEMS.register("orichalcumdirtydust", () -> new ItemEXOre());
            ItemList.itemRawOrichalcum = ITEMS.register("raworichalcum", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerOsmium.get())
        {
            ItemList.itemIngotOsmium = ITEMS.register("osmiumingot", () -> new ItemEXOre());
            ItemList.itemDustOsmium = ITEMS.register("osmiumdust", () -> new ItemEXOre());
            ItemList.itemShardOsmium = ITEMS.register("osmiumshard", () -> new ItemEXOre());
            ItemList.itemClumpOsmium = ITEMS.register("osmiumclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustOsmium = ITEMS.register("osmiumdirtydust", () -> new ItemEXOre());
            ItemList.itemRawOsmium = ITEMS.register("rawosmium", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerOureclase.get())
        {
            ItemList.itemIngotOureclase = ITEMS.register("oureclaseingot", () -> new ItemEXOre());
            ItemList.itemDustOureclase = ITEMS.register("oureclasedust", () -> new ItemEXOre());
            ItemList.itemShardOureclase = ITEMS.register("oureclaseshard", () -> new ItemEXOre());
            ItemList.itemClumpOureclase = ITEMS.register("oureclaseclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustOureclase = ITEMS.register("oureclasedirtydust", () -> new ItemEXOre());
            ItemList.itemRawOureclase = ITEMS.register("rawoureclase", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerPalladium.get())
        {
            ItemList.itemIngotPalladium = ITEMS.register("palladiumingot", () -> new ItemEXOre());
            ItemList.itemDustPalladium = ITEMS.register("palladiumdust", () -> new ItemEXOre());
            ItemList.itemShardPalladium = ITEMS.register("palladiumshard", () -> new ItemEXOre());
            ItemList.itemClumpPalladium = ITEMS.register("palladiumclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustPalladium = ITEMS.register("palladiumdirtydust", () -> new ItemEXOre());
            ItemList.itemRawPalladium = ITEMS.register("rawpalladium", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerPeridot.get())
        {
            ItemList.itemGemPeridot = ITEMS.register("peridot", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerPhoenixite.get())
        {
            ItemList.itemGemPhoenixite = ITEMS.register("phoenixite", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerPlatinum.get())
        {
            ItemList.itemIngotPlatinum = ITEMS.register("platinumingot", () -> new ItemEXOre());
            ItemList.itemDustPlatinum = ITEMS.register("platinumdust", () -> new ItemEXOre());
            ItemList.itemShardPlatinum = ITEMS.register("platinumshard", () -> new ItemEXOre());
            ItemList.itemClumpPlatinum = ITEMS.register("platinumclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustPlatinum = ITEMS.register("platinumdirtydust", () -> new ItemEXOre());
            ItemList.itemRawPlatinum = ITEMS.register("rawplatinum", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerPlutonium.get())
        {
            ItemList.itemIngotPlutonium = ITEMS.register("plutoniumingot", () -> new ItemEXOre());
            ItemList.itemDustPlutonium = ITEMS.register("plutoniumdust", () -> new ItemEXOre());
            ItemList.itemShardPlutonium = ITEMS.register("plutoniumshard", () -> new ItemEXOre());
            ItemList.itemClumpPlutonium = ITEMS.register("plutoniumclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustPlutonium = ITEMS.register("plutoniumdirtydust", () -> new ItemEXOre());
            ItemList.itemRawPlutonium = ITEMS.register("rawplutonium", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerPolonium.get())
        {
            ItemList.itemIngotPolonium = ITEMS.register("poloniumingot", () -> new ItemEXOre());
            ItemList.itemDustPolonium = ITEMS.register("poloniumdust", () -> new ItemEXOre());
            ItemList.itemShardPolonium = ITEMS.register("poloniumshard", () -> new ItemEXOre());
            ItemList.itemClumpPolonium = ITEMS.register("poloniumclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustPolonium = ITEMS.register("poloniumdirtydust", () -> new ItemEXOre());
            ItemList.itemRawPolonium = ITEMS.register("rawpolonium", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerPromethium.get())
        {
            ItemList.itemIngotPromethium = ITEMS.register("promethiumingot", () -> new ItemEXOre());
            ItemList.itemDustPromethium = ITEMS.register("promethiumdust", () -> new ItemEXOre());
            ItemList.itemShardPromethium = ITEMS.register("promethiumshard", () -> new ItemEXOre());
            ItemList.itemClumpPromethium = ITEMS.register("promethiumclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustPromethium = ITEMS.register("promethiumdirtydust", () -> new ItemEXOre());
            ItemList.itemRawPromethium = ITEMS.register("rawpromethium", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerQuartz.get())
        {
            ItemList.itemGemQuartz = ITEMS.register("quartz", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerRhenium.get())
        {
            ItemList.itemIngotRhenium = ITEMS.register("rheniumingot", () -> new ItemEXOre());
            ItemList.itemDustRhenium = ITEMS.register("rheniumdust", () -> new ItemEXOre());
            ItemList.itemShardRhenium = ITEMS.register("rheniumshard", () -> new ItemEXOre());
            ItemList.itemClumpRhenium = ITEMS.register("rheniumclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustRhenium = ITEMS.register("rheniumdirtydust", () -> new ItemEXOre());
            ItemList.itemRawRhenium = ITEMS.register("rawrhenium", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerRhodium.get())
        {
            ItemList.itemIngotRhodium = ITEMS.register("rhodiumingot", () -> new ItemEXOre());
            ItemList.itemDustRhodium = ITEMS.register("rhodiumdust", () -> new ItemEXOre());
            ItemList.itemShardRhodium = ITEMS.register("rhodiumshard", () -> new ItemEXOre());
            ItemList.itemClumpRhodium = ITEMS.register("rhodiumclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustRhodium = ITEMS.register("rhodiumdirtydust", () -> new ItemEXOre());
            ItemList.itemRawRhodium = ITEMS.register("rawrhodium", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerRubracium.get())
        {
            ItemList.itemIngotRubracium = ITEMS.register("rubraciumingot", () -> new ItemEXOre());
            ItemList.itemDustRubracium = ITEMS.register("rubraciumdust", () -> new ItemEXOre());
            ItemList.itemShardRubracium = ITEMS.register("rubraciumshard", () -> new ItemEXOre());
            ItemList.itemClumpRubracium = ITEMS.register("rubraciumclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustRubracium = ITEMS.register("rubraciumdirtydust", () -> new ItemEXOre());
            ItemList.itemRawRubracium = ITEMS.register("rawrubracium", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerRuby.get())
        {
            ItemList.itemGemRuby = ITEMS.register("ruby", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerRuthenium.get())
        {
            ItemList.itemIngotRuthenium = ITEMS.register("rutheniumingot", () -> new ItemEXOre());
            ItemList.itemDustRuthenium = ITEMS.register("rutheniumdust", () -> new ItemEXOre());
            ItemList.itemShardRuthenium = ITEMS.register("rutheniumshard", () -> new ItemEXOre());
            ItemList.itemClumpRuthenium = ITEMS.register("rutheniumclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustRuthenium = ITEMS.register("rutheniumdirtydust", () -> new ItemEXOre());
            ItemList.itemRawRuthenium = ITEMS.register("rawruthenium", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerSanguinite.get())
        {
            ItemList.itemIngotSanguinite = ITEMS.register("sanguiniteingot", () -> new ItemEXOre());
            ItemList.itemDustSanguinite = ITEMS.register("sanguinitedust", () -> new ItemEXOre());
            ItemList.itemShardSanguinite = ITEMS.register("sanguiniteshard", () -> new ItemEXOre());
            ItemList.itemClumpSanguinite = ITEMS.register("sanguiniteclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustSanguinite = ITEMS.register("sanguinitedirtydust", () -> new ItemEXOre());
            ItemList.itemRawSanguinite = ITEMS.register("rawsanguinite", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerSapphire.get())
        {
            ItemList.itemGemSapphire = ITEMS.register("sapphire", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerShadowIron.get())
        {
            ItemList.itemIngotShadowIron = ITEMS.register("shadowironingot", () -> new ItemEXOre());
            ItemList.itemDustShadowIron = ITEMS.register("shadowirondust", () -> new ItemEXOre());
            ItemList.itemShardShadowIron = ITEMS.register("shadowironshard", () -> new ItemEXOre());
            ItemList.itemClumpShadowIron = ITEMS.register("shadowironclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustShadowIron = ITEMS.register("shadowirondirtydust", () -> new ItemEXOre());
            ItemList.itemRawShadowIron = ITEMS.register("rawshadowiron", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerSilver.get())
        {
            ItemList.itemIngotSilver = ITEMS.register("silveringot", () -> new ItemEXOre());
            ItemList.itemDustSilver = ITEMS.register("silverdust", () -> new ItemEXOre());
            ItemList.itemShardSilver = ITEMS.register("silvershard", () -> new ItemEXOre());
            ItemList.itemClumpSilver = ITEMS.register("silverclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustSilver = ITEMS.register("silverdirtydust", () -> new ItemEXOre());
            ItemList.itemRawSilver = ITEMS.register("rawsilver", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerSpinel.get())
        {
            ItemList.itemGemSpinel = ITEMS.register("spinel", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerSugilite.get())
        {
            ItemList.itemGemSugilite = ITEMS.register("sugilite", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerTantalum.get())
        {
            ItemList.itemIngotTantalum = ITEMS.register("tantalumingot", () -> new ItemEXOre());
            ItemList.itemDustTantalum = ITEMS.register("tantalumdust", () -> new ItemEXOre());
            ItemList.itemShardTantalum = ITEMS.register("tantalumshard", () -> new ItemEXOre());
            ItemList.itemClumpTantalum = ITEMS.register("tantalumclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustTantalum = ITEMS.register("tantalumdirtydust", () -> new ItemEXOre());
            ItemList.itemRawTantalum = ITEMS.register("rawtantalum", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerTanzanite.get())
        {
            ItemList.itemGemTanzanite = ITEMS.register("tanzanite", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerTartarite.get())
        {
            ItemList.itemIngotTartarite = ITEMS.register("tartariteingot", () -> new ItemEXOre());
            ItemList.itemDustTartarite = ITEMS.register("tartaritedust", () -> new ItemEXOre());
            ItemList.itemShardTartarite = ITEMS.register("tartariteshard", () -> new ItemEXOre());
            ItemList.itemClumpTartarite = ITEMS.register("tartariteclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustTartarite = ITEMS.register("tartaritedirtydust", () -> new ItemEXOre());
            ItemList.itemRawTartarite = ITEMS.register("rawtartarite", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerTechnetium.get())
        {
            ItemList.itemIngotTechnetium = ITEMS.register("technetiumingot", () -> new ItemEXOre());
            ItemList.itemDustTechnetium = ITEMS.register("technetiumdust", () -> new ItemEXOre());
            ItemList.itemShardTechnetium = ITEMS.register("technetiumshard", () -> new ItemEXOre());
            ItemList.itemClumpTechnetium = ITEMS.register("technetiumclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustTechnetium = ITEMS.register("technetiumdirtydust", () -> new ItemEXOre());
            ItemList.itemRawTechnetium = ITEMS.register("rawtechnetium", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerThallium.get())
        {
            ItemList.itemIngotThallium = ITEMS.register("thalliumingot", () -> new ItemEXOre());
            ItemList.itemDustThallium = ITEMS.register("thalliumdust", () -> new ItemEXOre());
            ItemList.itemShardThallium = ITEMS.register("thalliumshard", () -> new ItemEXOre());
            ItemList.itemClumpThallium = ITEMS.register("thalliumclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustThallium = ITEMS.register("thalliumdirtydust", () -> new ItemEXOre());
            ItemList.itemRawThallium = ITEMS.register("rawthallium", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerTin.get())
        {
            ItemList.itemIngotTin = ITEMS.register("tiningot", () -> new ItemEXOre());
            ItemList.itemDustTin = ITEMS.register("tindust", () -> new ItemEXOre());
            ItemList.itemShardTin = ITEMS.register("tinshard", () -> new ItemEXOre());
            ItemList.itemClumpTin = ITEMS.register("tinclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustTin = ITEMS.register("tindirtydust", () -> new ItemEXOre());
            ItemList.itemRawTin = ITEMS.register("rawtin", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerTitanium.get())
        {
            ItemList.itemIngotTitanium = ITEMS.register("titaniumingot", () -> new ItemEXOre());
            ItemList.itemDustTitanium = ITEMS.register("titaniumdust", () -> new ItemEXOre());
            ItemList.itemShardTitanium = ITEMS.register("titaniumshard", () -> new ItemEXOre());
            ItemList.itemClumpTitanium = ITEMS.register("titaniumclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustTitanium = ITEMS.register("titaniumdirtydust", () -> new ItemEXOre());
            ItemList.itemRawTitanium = ITEMS.register("rawtitanium", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerTopaz.get())
        {
            ItemList.itemGemTopaz = ITEMS.register("topaz", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerTourmaline.get())
        {
            ItemList.itemGemTourmaline = ITEMS.register("tourmaline", () -> new ItemEXOre());
        }
        if(ConfigRegistryList.registerTritium.get())
        {
            ItemList.itemIngotTritium = ITEMS.register("tritiumingot", () -> new ItemEXOre());
            ItemList.itemDustTritium = ITEMS.register("tritiumdust", () -> new ItemEXOre());
            ItemList.itemShardTritium = ITEMS.register("tritiumshard", () -> new ItemEXOre());
            ItemList.itemClumpTritium = ITEMS.register("tritiumclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustTritium = ITEMS.register("tritiumdirtydust", () -> new ItemEXOre());
            ItemList.itemRawTritium = ITEMS.register("rawtritium", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerTungsten.get())
        {
            ItemList.itemIngotTungsten = ITEMS.register("tungsteningot", () -> new ItemEXOre());
            ItemList.itemDustTungsten = ITEMS.register("tungstendust", () -> new ItemEXOre());
            ItemList.itemShardTungsten = ITEMS.register("tungstenshard", () -> new ItemEXOre());
            ItemList.itemClumpTungsten = ITEMS.register("tungstenclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustTungsten = ITEMS.register("tungstendirtydust", () -> new ItemEXOre());
            ItemList.itemRawTungsten = ITEMS.register("rawtungsten", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerTurquoise.get())
        {
            ItemList.itemGemTurquoise = ITEMS.register("turquoise", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerUnobtainium.get())
        {
            ItemList.itemIngotUnobtainium = ITEMS.register("unobtainiumingot", () -> new ItemEXOre());
            ItemList.itemDustUnobtainium = ITEMS.register("unobtainiumdust", () -> new ItemEXOre());
            ItemList.itemShardUnobtainium = ITEMS.register("unobtainiumshard", () -> new ItemEXOre());
            ItemList.itemClumpUnobtainium = ITEMS.register("unobtainiumclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustUnobtainium = ITEMS.register("unobtainiumdirtydust", () -> new ItemEXOre());
            ItemList.itemRawUnobtainium = ITEMS.register("rawunobtainium", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerUranium.get())
        {
            ItemList.itemIngotUranium = ITEMS.register("uraniumingot", () -> new ItemEXOre());
            ItemList.itemDustUranium = ITEMS.register("uraniumdust", () -> new ItemEXOre());
            ItemList.itemShardUranium = ITEMS.register("uraniumshard", () -> new ItemEXOre());
            ItemList.itemClumpUranium = ITEMS.register("uraniumclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustUranium = ITEMS.register("uraniumdirtydust", () -> new ItemEXOre());
            ItemList.itemRawUranium = ITEMS.register("rawuranium", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerVanadium.get())
        {
            ItemList.itemIngotVanadium = ITEMS.register("vanadiumingot", () -> new ItemEXOre());
            ItemList.itemDustVanadium = ITEMS.register("vanadiumdust", () -> new ItemEXOre());
            ItemList.itemShardVanadium = ITEMS.register("vanadiumshard", () -> new ItemEXOre());
            ItemList.itemClumpVanadium = ITEMS.register("vanadiumclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustVanadium = ITEMS.register("vanadiumdirtydust", () -> new ItemEXOre());
            ItemList.itemRawVanadium = ITEMS.register("rawvanadium", () -> new ItemEXOre());
        }
        if(ConfigRegistryList.registerVibranium.get())
        {
            ItemList.itemIngotVibranium = ITEMS.register("vibraniumingot", () -> new ItemEXOre());
            ItemList.itemDustVibranium = ITEMS.register("vibraniumdust", () -> new ItemEXOre());
            ItemList.itemShardVibranium = ITEMS.register("vibraniumshard", () -> new ItemEXOre());
            ItemList.itemClumpVibranium = ITEMS.register("vibraniumclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustVibranium = ITEMS.register("vibraniumdirtydust", () -> new ItemEXOre());
            ItemList.itemRawVibranium = ITEMS.register("rawvibranium", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerVulcanite.get())
        {
            ItemList.itemIngotVulcanite = ITEMS.register("vulcaniteingot", () -> new ItemEXOre());
            ItemList.itemDustVulcanite = ITEMS.register("vulcanitedust", () -> new ItemEXOre());
            ItemList.itemShardVulcanite = ITEMS.register("vulcaniteshard", () -> new ItemEXOre());
            ItemList.itemClumpVulcanite = ITEMS.register("vulcaniteclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustVulcanite = ITEMS.register("vulcanitedirtydust", () -> new ItemEXOre());
            ItemList.itemRawVulcanite = ITEMS.register("rawvulcanite", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerVyroxeres.get())
        {
            ItemList.itemIngotVyroxeres = ITEMS.register("vyroxeresingot", () -> new ItemEXOre());
            ItemList.itemDustVyroxeres = ITEMS.register("vyroxeresdust", () -> new ItemEXOre());
            ItemList.itemShardVyroxeres = ITEMS.register("vyroxeresshard", () -> new ItemEXOre());
            ItemList.itemClumpVyroxeres = ITEMS.register("vyroxeresclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustVyroxeres = ITEMS.register("vyroxeresdirtydust", () -> new ItemEXOre());
            ItemList.itemRawVyroxeres = ITEMS.register("rawvyroxeres", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerYellorite.get())
        {
            ItemList.itemIngotYellorite = ITEMS.register("yelloriteingot", () -> new ItemEXOre());
            ItemList.itemDustYellorite = ITEMS.register("yelloritedust", () -> new ItemEXOre());
            ItemList.itemShardYellorite = ITEMS.register("yelloriteshard", () -> new ItemEXOre());
            ItemList.itemClumpYellorite = ITEMS.register("yelloriteclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustYellorite = ITEMS.register("yelloritedirtydust", () -> new ItemEXOre());
            ItemList.itemRawYellorite = ITEMS.register("rawyellorite", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerZinc.get())
        {
            ItemList.itemIngotZinc = ITEMS.register("zincingot", () -> new ItemEXOre());
            ItemList.itemDustZinc = ITEMS.register("zincdust", () -> new ItemEXOre());
            ItemList.itemShardZinc = ITEMS.register("zincshard", () -> new ItemEXOre());
            ItemList.itemClumpZinc = ITEMS.register("zincclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustZinc = ITEMS.register("zincdirtydust", () -> new ItemEXOre());
            ItemList.itemRawZinc = ITEMS.register("rawzinc", () -> new ItemEXOre());
        }
        if (ConfigRegistryList.registerZirconium.get())
        {
            ItemList.itemIngotZirconium = ITEMS.register("zirconiumingot", () -> new ItemEXOre());
            ItemList.itemDustZirconium = ITEMS.register("zirconiumdust", () -> new ItemEXOre());
            ItemList.itemShardZirconium = ITEMS.register("zirconiumshard", () -> new ItemEXOre());
            ItemList.itemClumpZirconium = ITEMS.register("zirconiumclump", () -> new ItemEXOre());
            ItemList.itemDirtyDustZirconium = ITEMS.register("zirconiumdirtydust", () -> new ItemEXOre());
            ItemList.itemRawZirconium = ITEMS.register("rawzirconium", () -> new ItemEXOre());
        }
    }
}

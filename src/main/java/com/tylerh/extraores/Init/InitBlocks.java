package com.tylerh.extraores.Init;

import com.tylerh.extraores.Blocks.BlockEXOre;
import com.tylerh.extraores.Items.*;
import com.tylerh.extraores.Util.ItemGroupExOre;
import com.tylerh.extraores.Util.ModInfo;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class InitBlocks
{
    private static final CreativeModeTab EXORES = new ItemGroupExOre();
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ModInfo.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModInfo.MOD_ID);
    private static <T extends Block>RegistryObject<T> register(String name, Supplier<T> supplier)
    {
        RegistryObject<T> block = BLOCKS.register(name,supplier);
        ITEMS.register(name, () -> new ItemBlockExOre(block.get(),EXORES));
        return block;
    }
    public static void registerBlocks()
    {
        if (ConfigRegistryList.registerAdamantine.get())
        {
            BlockList.blockOreAdamantine = register("adamantineore", () -> new BlockEXOre(Material.STONE, 1.5F, 1.5F));
            BlockList.blockAdamantine = register("adamantineblock", () -> new BlockEXOre(Material.METAL, 1.5F, 1.5F));
            BlockList.blockDeepslateOreAdamantine = register("deepslateadamantineore", () -> new BlockEXOre(Material.STONE, 1.5F, 1.5F, SoundType.DEEPSLATE));
        }

        if(ConfigRegistryList.registerAgate.get())
        {
            BlockList.blockOreAgate = register("agateore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockAgate = register("agateblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreAgate = register("deepslateagateore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerAldourite.get())
        {
            BlockList.blockOreAldourite = register("aldouriteore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockAldourite = register("aldouriteblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
        }
        if (ConfigRegistryList.registerAluminum.get())
        {
            BlockList.blockOreAluminum = register("aluminumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockAluminum = register("aluminumblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreAluminum = register("deepslatealuminumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerAmericium.get())
        {
            BlockList.blockOreAmericium = register("americiumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockAmericium = register("americiumblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreAmericium = register("deepslateamericiumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerAmethyst.get())
        {
            BlockList.blockOreAmethyst = register("amethystore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockAmethyst = register("amethystblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreAmethyst = register("deepslateamethystore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerAmetrine.get())
        {
            BlockList.blockOreAmetrine = register("ametrineore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockAmetrine = register("ametrineblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreAmetrine = register("deepslateametrineore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerAmordrine.get())
        {
            BlockList.blockOreAmordrine = register("amordrineore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockAmordrine = register("amordrineblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreAmordrine = register("deepslateamordrineore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerAngmallen.get())
        {
            BlockList.blockOreAngmallen = register("angmallenore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockAngmallen = register("angmallenblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreAngmallen = register("deepslateangmallenore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerAquamarine.get())
        {
            BlockList.blockOreAquamarine = register("aquamarineore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockAquamarine = register("aquamarineblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreAquamarine = register("deepslateaquamarineore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerAstralSilver.get())
        {
            BlockList.blockOreAstralSilver = register("astralsilverore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockAstralSilver = register("astralsilverblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreAstralSilver = register("deepslateastralsilverore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerAtlarus.get())
        {
            BlockList.blockOreAtlarus = register("atlarusore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockAtlarus = register("atlarusblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreAtlarus = register("deepslateatlarusore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerAzureSilver.get())
        {
            BlockList.blockOreAzureSilver = register("azuresilverore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockAzureSilver = register("azuresilverblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreAzureSilver = register("deepslateazuresilverore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerBismuth.get())
        {
            BlockList.blockOreBismuth = register("bismuthore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockBismuth = register("bismuthblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreBismuth = register("deepslatebismuthore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerBlackSteel.get())
        {
            BlockList.blockOreBlackSteel = register("blacksteelore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockBlackSteel = register("blacksteelblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreBlackSteel = register("deepslateblacksteelore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerCadmium.get())
        {
            BlockList.blockOreCadmium = register("cadmiumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockCadmium = register("cadmiumblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreCadmium = register("deepslatecadmiumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerCarmot.get())
        {
            BlockList.blockOreCarmot = register("carmotore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockCarmot = register("carmotblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreCarmot = register("deepslatecarmotore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerCelenegil.get())
        {
            BlockList.blockOreCelenegil = register("celenegilore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockCelenegil = register("celenegilblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreCelenegil = register("deepslatecelenegilore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerCeruclase.get())
        {
            BlockList.blockOreCeruclase = register("ceruclaseore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockCeruclase = register("ceruclaseblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
        }
        if (ConfigRegistryList.registerChromium.get())
        {
            BlockList.blockOreChromium = register("chromiumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockChromium = register("chromiumblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreChromium = register("deepslatechromiumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerChrysocolla.get())
        {
            BlockList.blockOreChrysocolla = register("chrysocollaore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockChrysocolla = register("chrysocollablock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreChrysocolla = register("deepslatechrysocollaore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerCitrine.get())
        {
            BlockList.blockOreCitrine = register("citrineore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockCitrine = register("citrineblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreCitrine = register("deepslatecitrineore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerCobalt.get())
        {
            BlockList.blockOreCobalt = register("cobaltore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockCobalt = register("cobaltblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreCobalt = register("deepslatecobaltore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerCopper.get())
        {
            BlockList.blockOreCopper = register("copperore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockCopper = register("copperblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreCopper = register("deepslatecopperore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerCrimsonSteel.get())
        {
            BlockList.blockOreCrimsonSteel = register("crimsonsteelore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockCrimsonSteel = register("crimsonsteelblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreCrimsonSteel = register("deepslatecrimsonsteelore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerDeepIron.get())
        {
            BlockList.blockOreDeepIron = register("deepironore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockDeepIron = register("deepironblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreDeepIron = register("deepslatedeepironore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerDesichalkos.get())
        {
            BlockList.blockOreDesichalkos = register("desichalkosore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockDesichalkos = register("desichalkosblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreDesichalkos = register("deepslatedesichalkosore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerEximite.get())
        {
            BlockList.blockOreEximite = register("eximiteore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockEximite = register("eximiteblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreEximite = register("deepslateeximiteore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerGallium.get())
        {
            BlockList.blockOreGallium = register("galliumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockGallium = register("galliumblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreGallium = register("deepslategalliumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerGarnet.get())
        {
            BlockList.blockOreGarnet = register("garnetore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockGarnet = register("garnetblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreGarnet = register("deepslategarnetore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerHaderoth.get())
        {
            BlockList.blockOreHaderoth = register("haderothore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockHaderoth = register("haderothblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreHaderoth = register("deepslatehaderothore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerHepatizon.get())
        {
            BlockList.blockOreHepatizon = register("hepatizonore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockHepatizon = register("hepatizonblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreHepatizon = register("deepslatehepatizonore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerIgnatius.get())
        {
            BlockList.blockOreIgnatius = register("ignatiusore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockIgnatius = register("ignatiusblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
        }
        if (ConfigRegistryList.registerIndium.get())
        {
            BlockList.blockOreIndium = register("indiumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockIndium = register("indiumblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreIndium = register("deepslateindiumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerInfuscolium.get())
        {
            BlockList.blockOreInfuscolium = register("infuscoliumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockInfuscolium = register("infuscoliumblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreInfuscolium = register("deepslateinfuscoliumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerInolashite.get())
        {
            BlockList.blockOreInolashite = register("inolashiteore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockInolashite = register("inolashiteblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreInolashite = register("deepslateinolashiteore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerIolite.get())
        {
            BlockList.blockOreIolite = register("ioliteore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockIolite = register("ioliteblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreIolite = register("deepslateioliteore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerIridium.get())
        {
            BlockList.blockOreIridium = register("iridiumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockIridium = register("iridiumblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreIridium = register("deepslateiridiumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerJade.get())
        {
            BlockList.blockOreJade = register("jadeore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockJade = register("jadeblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreJade = register("deepslatejadeore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerJasper.get())
        {
            BlockList.blockOreJasper = register("jasperore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockJasper = register("jasperblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreJasper = register("deepslatejasperore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerKalendrite.get())
        {
            BlockList.blockOreKalendrite = register("kalendriteore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockKalendrite = register("kalendriteblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
        }
        if(ConfigRegistryList.registerKyanite.get())
        {
            BlockList.blockOreKyanite = register("kyaniteore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockKyanite = register("kyaniteblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreKyanite = register("deepslatekyaniteore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerLead.get())
        {
            BlockList.blockOreLead = register("leadore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockLead = register("leadblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreLead = register("deepslateleadore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerLemurite.get())
        {
            BlockList.blockOreLemurite = register("lemuriteore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockLemurite = register("lemuriteblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
        }
        if(ConfigRegistryList.registerMalachite.get())
        {
            BlockList.blockOreMalachite = register("malachiteore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockMalachite = register("malachiteblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreMalachite = register("deepslatemalachiteore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerManganese.get())
        {
            BlockList.blockOreManganese = register("manganeseore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockManganese = register("manganeseblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreManganese = register("deepslatemanganeseore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerMeutoite.get())
        {
            BlockList.blockOreMeutoite = register("meutoiteore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockMeutoite = register("meutoiteblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreMeutoite = register("deepslatemeutoiteore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerMidasium.get())
        {
            BlockList.blockOreMidasium = register("midasiumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockMidasium = register("midasiumblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
        }
        if (ConfigRegistryList.registerMithril.get())
        {
            BlockList.blockOreMithril = register("mithrilore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockMithril = register("mithrilblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreMithril = register("deepslatemithrilore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerMolybdenum.get())
        {
            BlockList.blockOreMolybdenum = register("molybdenumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockMolybdenum = register("molybdenumblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreMolybdenum = register("deepslatemolybdenumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerNeodymium.get())
        {
            BlockList.blockOreNeodymium = register("neodymiumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockNeodymium = register("neodymiumblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreNeodymium = register("deepslateneodymiumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerNeptunium.get())
        {
            BlockList.blockOreNeptunium = register("neptuniumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockNeptunium = register("neptuniumblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreNeptunium = register("deepslateneptuniumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerNickel.get())
        {
            BlockList.blockOreNickel = register("nickelore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockNickel = register("nickelblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreNickel = register("deepslatenickelore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerNiobium.get())
        {
            BlockList.blockOreNiobium = register("niobiumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockNiobium = register("niobiumblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreNiobium = register("deepslateniobiumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerOnyx.get())
        {
            BlockList.blockOreOnyx = register("onyxore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockOnyx = register("onyxblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreOnyx = register("deepslateonyxore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerOpal.get())
        {
            BlockList.blockOreOpal = register("opalore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockOpal = register("opalblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreOpal = register("deepslateopalore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerOrichalcum.get())
        {
            BlockList.blockOreOrichalcum = register("orichalcumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockOrichalcum = register("orichalcumblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreOrichalcum = register("deepslateorichalcumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerOsmium.get())
        {
            BlockList.blockOreOsmium = register("osmiumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockOsmium = register("osmiumblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreOsmium = register("deepslateosmiumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerOureclase.get())
        {
            BlockList.blockOreOureclase = register("oureclaseore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockOureclase = register("oureclaseblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreOureclase = register("deepslateoureclaseore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerPalladium.get())
        {
            BlockList.blockOrePalladium = register("palladiumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockPalladium = register("palladiumblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOrePalladium = register("deepslatepalladiumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerPeridot.get())
        {
            BlockList.blockOrePeridot = register("peridotore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockPeridot = register("peridotblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOrePeridot = register("deepslateperidotore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerPhoenixite.get())
        {
            BlockList.blockOrePhoenixite = register("phoenixiteore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockPhoenixite = register("phoenixiteblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOrePhoenixite = register("deepslatephoenixiteore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerPlatinum.get())
        {
            BlockList.blockOrePlatinum = register("platinumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockPlatinum = register("platinumblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOrePlatinum = register("deepslateplatinumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerPlutonium.get())
        {
            BlockList.blockOrePlutonium = register("plutoniumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockPlutonium = register("plutoniumblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOrePlutonium = register("deepslateplutoniumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerPolonium.get())
        {
            BlockList.blockOrePolonium = register("poloniumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockPolonium = register("poloniumblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOrePolonium = register("deepslatepoloniumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerPromethium.get())
        {
            BlockList.blockOrePromethium = register("promethiumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockPromethium = register("promethiumblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOrePromethium = register("deepslatepromethiumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerQuartz.get())
        {
            BlockList.blockOreQuartz = register("quartzore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockQuartz = register("quartzblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreQuartz = register("deepslatequartzore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerRhenium.get())
        {
            BlockList.blockOreRhenium = register("rheniumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockRhenium = register("rheniumblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreRhenium = register("deepslaterheniumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerRhodium.get())
        {
            BlockList.blockOreRhodium = register("rhodiumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockRhodium = register("rhodiumblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreRhodium = register("deepslaterhodiumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerRubracium.get())
        {
            BlockList.blockOreRubracium = register("rubraciumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockRubracium = register("rubraciumblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreRubracium = register("deepslaterubraciumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerRuby.get())
        {
            BlockList.blockOreRuby = register("rubyore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockRuby = register("rubyblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreRuby = register("deepslaterubyore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerRuthenium.get())
        {
            BlockList.blockOreRuthenium = register("rutheniumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockRuthenium = register("rutheniumblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreRuthenium = register("deepslaterutheniumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerSanguinite.get())
        {
            BlockList.blockOreSanguinite = register("sanguiniteore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockSanguinite = register("sanguiniteblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
        }
        if(ConfigRegistryList.registerSapphire.get())
        {
            BlockList.blockOreSapphire = register("sapphireore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockSapphire = register("sapphireblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreSapphire = register("deepslatesapphireore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerShadowIron.get())
        {
            BlockList.blockOreShadowIron = register("shadowironore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockShadowIron = register("shadowironblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
        }
        if (ConfigRegistryList.registerSilver.get())
        {
            BlockList.blockOreSilver = register("silverore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockSilver = register("silverblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreSilver = register("deepslatesilverore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerSpinel.get())
        {
            BlockList.blockOreSpinel = register("spinelore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockSpinel = register("spinelblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreSpinel = register("deepslatespinelore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerSugilite.get())
        {
            BlockList.blockOreSugilite = register("sugiliteore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockSugilite = register("sugiliteblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreSugilite = register("deepslatesugiliteore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerTantalum.get())
        {
            BlockList.blockOreTantalum = register("tantalumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockTantalum = register("tantalumblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreTantalum = register("deepslatetantalumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerTanzanite.get())
        {
            BlockList.blockOreTanzanite = register("tanzaniteore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockTanzanite = register("tanzaniteblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreTanzanite = register("deepslatetanzaniteore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerTartarite.get())
        {
            BlockList.blockOreTartarite = register("tartariteore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockTartarite = register("tartariteblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreTartarite = register("deepslatetartariteore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerTechnetium.get())
        {
            BlockList.blockOreTechnetium = register("technetiumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockTechnetium = register("technetiumblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreTechnetium = register("deepslatetechnetiumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerThallium.get())
        {
            BlockList.blockOreThallium = register("thalliumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockThallium = register("thalliumblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreThallium = register("deepslatethalliumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerTin.get())
        {
            BlockList.blockOreTin = register("tinore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockTin = register("tinblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreTin = register("deepslatetinore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerTitanium.get())
        {
            BlockList.blockOreTitanium = register("titaniumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockTitanium = register("titaniumblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreTitanium = register("deepslatetitaniumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerTopaz.get())
        {
            BlockList.blockOreTopaz = register("topazore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockTopaz = register("topazblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreTopaz = register("deepslatetopazore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerTourmaline.get())
        {
            BlockList.blockOreTourmaline = register("tourmalineore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockTourmaline = register("tourmalineblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreTourmaline = register("deepslatetourmalineore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerTritium.get())
        {
            BlockList.blockOreTritium = register("tritiumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockTritium = register("tritiumblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreTritium = register("deepslatetritiumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerTungsten.get())
        {
            BlockList.blockOreTungsten = register("tungstenore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockTungsten = register("tungstenblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreTungsten = register("deepslatetungstenore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerTurquoise.get())
        {
            BlockList.blockOreTurquoise = register("turquoiseore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockTurquoise = register("turquoiseblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreTurquoise = register("deepslateturquoiseore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerUnobtainium.get())
        {
            BlockList.blockOreUnobtainium = register("unobtainiumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockUnobtainium = register("unobtainiumblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreUnobtainium = register("deepslateunobtainiumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerUranium.get())
        {
            BlockList.blockOreUranium = register("uraniumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockUranium = register("uraniumblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreUranium = register("deepslateuraniumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerVanadium.get())
        {
            BlockList.blockOreVanadium = register("vanadiumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockVanadium = register("vanadiumblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreVanadium = register("deepslatevanadiumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if(ConfigRegistryList.registerVibranium.get())
        {
            BlockList.blockOreVibranium = register("vibraniumore",() -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockVibranium = register("vibraniumblock",() -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreVibranium = register("deepslatevibraniumore",() -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerVulcanite.get())
        {
            BlockList.blockOreVulcanite = register("vulcaniteore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockVulcanite = register("vulcaniteblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
        }
        if (ConfigRegistryList.registerVyroxeres.get())
        {
            BlockList.blockOreVyroxeres = register("vyroxeresore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockVyroxeres = register("vyroxeresblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
        }
        if(ConfigRegistryList.registerYellorite.get())
        {
            BlockList.blockOreYellorite = register("yelloriteore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockYellorite = register("yelloriteblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreYellorite = register("deepslateyelloriteore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerZinc.get())
        {
            BlockList.blockOreZinc = register("zincore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockZinc = register("zincblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreZinc = register("deepslatezincore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
        if (ConfigRegistryList.registerZirconium.get())
        {
            BlockList.blockOreZirconium = register("zirconiumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F));
            BlockList.blockZirconium = register("zirconiumblock", () -> new BlockEXOre(Material.METAL,1.5F,1.5F));
            BlockList.blockDeepslateOreZirconium = register("deepslatezirconiumore", () -> new BlockEXOre(Material.STONE,1.5F,1.5F,SoundType.DEEPSLATE));
        }
    }

    public static void registerItems()
    {
        if (ConfigRegistryList.registerAdamantine.get())
        {
            ItemList.itemIngotAdamantine = ITEMS.register("adamantineingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustAdamantine = ITEMS.register("adamantinedust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardAdamantine = ITEMS.register("adamantineshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpAdamantine = ITEMS.register("adamantineclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustAdamantine = ITEMS.register("adamantinedirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawAdamantine = ITEMS.register("rawadamantine", () -> new ItemEXOre(EXORES));
        }
        
        if (ConfigRegistryList.registerAgate.get())
        {
            ItemList.itemGemAgate = ITEMS.register("agate", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerAldourite.get())
        {
            ItemList.itemIngotAldourite = ITEMS.register("aldouriteingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustAldourite = ITEMS.register("aldouritedust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardAldourite = ITEMS.register("aldouriteshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpAldourite = ITEMS.register("aldouriteclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustAldourite = ITEMS.register("aldouritedirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawAldourite = ITEMS.register("rawaldourite", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerAluminum.get())
        {
            ItemList.itemIngotAluminum = ITEMS.register("aluminumingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustAluminum = ITEMS.register("aluminumdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardAluminum = ITEMS.register("aluminumshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpAluminum = ITEMS.register("aluminumclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustAluminum = ITEMS.register("aluminumdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawAluminum = ITEMS.register("rawaluminum", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerAmericium.get())
        {
            ItemList.itemIngotAmericium = ITEMS.register("americiumingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustAmericium = ITEMS.register("americiumdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardAmericium = ITEMS.register("americiumshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpAmericium = ITEMS.register("americiumclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustAmericium = ITEMS.register("americiumdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawAmericium = ITEMS.register("rawamericium", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerAmethyst.get())
        {
            ItemList.itemGemAmethyst = ITEMS.register("amethyst", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerAmetrine.get())
        {
            ItemList.itemGemAmetrine = ITEMS.register("ametrine", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerAmordrine.get())
        {
            ItemList.itemIngotAmordrine = ITEMS.register("amordrineingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustAmordrine = ITEMS.register("amordrinedust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardAmordrine = ITEMS.register("amordrineshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpAmordrine = ITEMS.register("amordrineclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustAmordrine = ITEMS.register("amordrinedirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawAmordrine = ITEMS.register("rawamordrine", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerAngmallen.get())
        {
            ItemList.itemIngotAngmallen = ITEMS.register("angmalleningot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustAngmallen = ITEMS.register("angmallendust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardAngmallen = ITEMS.register("angmallenshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpAngmallen = ITEMS.register("angmallenclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustAngmallen = ITEMS.register("angmallendirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawAngmallen = ITEMS.register("rawangmallen", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerAquamarine.get())
        {
            ItemList.itemGemAquamarine = ITEMS.register("aquamarine", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerAstralSilver.get())
        {
            ItemList.itemIngotAstralSilver = ITEMS.register("astralsilveringot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustAstralSilver = ITEMS.register("astralsilverdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardAstralSilver = ITEMS.register("astralsilvershard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpAstralSilver = ITEMS.register("astralsilverclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustAstralSilver = ITEMS.register("astralsilverdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawAstralSilver = ITEMS.register("rawastralsilver", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerAtlarus.get())
        {
            ItemList.itemIngotAtlarus = ITEMS.register("atlarusingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustAtlarus = ITEMS.register("atlarusdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardAtlarus = ITEMS.register("atlarusshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpAtlarus = ITEMS.register("atlarusclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustAtlarus = ITEMS.register("atlarusdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawAtlarus = ITEMS.register("rawatlarus", () -> new ItemEXOre(EXORES));
        }
        if(ConfigRegistryList.registerAzureSilver.get())
        {
            ItemList.itemIngotAzureSilver = ITEMS.register("azuresilveringot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustAzureSilver = ITEMS.register("azuresilverdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardAzureSilver = ITEMS.register("azuresilvershard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpAzureSilver = ITEMS.register("azuresilverclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustAzureSilver = ITEMS.register("azuresilverdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawAzureSilver = ITEMS.register("rawazuresilver", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerBismuth.get())
        {
            ItemList.itemIngotBismuth = ITEMS.register("bismuthingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustBismuth = ITEMS.register("bismuthdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardBismuth = ITEMS.register("bismuthshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpBismuth = ITEMS.register("bismuthclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustBismuth = ITEMS.register("bismuthdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawBismuth = ITEMS.register("rawbismuth", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerBlackSteel.get())
        {
            ItemList.itemIngotBlackSteel = ITEMS.register("blacksteelingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustBlackSteel = ITEMS.register("blacksteeldust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardBlackSteel = ITEMS.register("blacksteelshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpBlackSteel = ITEMS.register("blacksteelclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustBlackSteel = ITEMS.register("blacksteeldirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawBlackSteel = ITEMS.register("rawblacksteel", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerCadmium.get())
        {
            ItemList.itemIngotCadmium = ITEMS.register("cadmiumingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustCadmium = ITEMS.register("cadmiumdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardCadmium = ITEMS.register("cadmiumshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpCadmium = ITEMS.register("cadmiumclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustCadmium = ITEMS.register("cadmiumdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawCadmium = ITEMS.register("rawcadmium", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerCarmot.get())
        {
            ItemList.itemIngotCarmot = ITEMS.register("carmotingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustCarmot = ITEMS.register("carmotdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardCarmot = ITEMS.register("carmotshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpCarmot = ITEMS.register("carmotclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustCarmot = ITEMS.register("carmotdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawCarmot = ITEMS.register("rawcarmot", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerCelenegil.get())
        {
            ItemList.itemIngotCelenegil = ITEMS.register("celenegilingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustCelenegil = ITEMS.register("celenegildust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardCelenegil = ITEMS.register("celenegilshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpCelenegil = ITEMS.register("celenegilclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustCelenegil = ITEMS.register("celenegildirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawCelenegil = ITEMS.register("rawcelenegil", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerCeruclase.get())
        {
            ItemList.itemIngotCeruclase = ITEMS.register("ceruclaseingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustCeruclase = ITEMS.register("ceruclasedust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardCeruclase = ITEMS.register("ceruclaseshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpCeruclase = ITEMS.register("ceruclaseclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustCeruclase = ITEMS.register("ceruclasedirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawCeruclase = ITEMS.register("rawceruclase", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerChromium.get())
        {
            ItemList.itemIngotChromium = ITEMS.register("chromiumingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustChromium = ITEMS.register("chromiumdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardChromium = ITEMS.register("chromiumshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpChromium = ITEMS.register("chromiumclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustChromium = ITEMS.register("chromiumdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawChromium = ITEMS.register("rawchromium", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerChrysocolla.get())
        {
            ItemList.itemGemChrysocolla = ITEMS.register("chrysocolla", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerCitrine.get())
        {
            ItemList.itemGemCitrine = ITEMS.register("citrine", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerCobalt.get())
        {
            ItemList.itemIngotCobalt = ITEMS.register("cobaltingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustCobalt = ITEMS.register("cobaltdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardCobalt = ITEMS.register("cobaltshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpCobalt = ITEMS.register("cobaltclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustCobalt = ITEMS.register("cobaltdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawCobalt = ITEMS.register("rawcobalt", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerCopper.get())
        {
            ItemList.itemIngotCopper = ITEMS.register("copperingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustCopper = ITEMS.register("copperdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardCopper = ITEMS.register("coppershard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpCopper = ITEMS.register("copperclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustCopper = ITEMS.register("copperdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawCopper = ITEMS.register("rawcopper", () -> new ItemEXOre(EXORES));
        }
        if(ConfigRegistryList.registerCrimsonSteel.get())
        {
            ItemList.itemIngotCrimsonSteel = ITEMS.register("crimsonsteelingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustCrimsonSteel = ITEMS.register("crimsonsteeldust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardCrimsonSteel = ITEMS.register("crimsonsteelshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpCrimsonSteel = ITEMS.register("crimsonsteelclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustCrimsonSteel = ITEMS.register("crimsonsteeldirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawCrimsonSteel = ITEMS.register("rawcrimsonsteel", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerDeepIron.get())
        {
            ItemList.itemIngotDeepIron = ITEMS.register("deepironingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustDeepIron = ITEMS.register("deepirondust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardDeepIron = ITEMS.register("deepironshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpDeepIron = ITEMS.register("deepironclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustDeepIron = ITEMS.register("deepirondirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawDeepIron = ITEMS.register("rawdeepiron", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerDesichalkos.get())
        {
            ItemList.itemIngotDesichalkos = ITEMS.register("desichalkosingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustDesichalkos = ITEMS.register("desichalkosdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardDesichalkos = ITEMS.register("desichalkosshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpDesichalkos = ITEMS.register("desichalkosclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustDesichalkos = ITEMS.register("desichalkosdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawDesichalkos = ITEMS.register("rawdesichalkos", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerEximite.get())
        {
            ItemList.itemIngotEximite = ITEMS.register("eximiteingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustEximite = ITEMS.register("eximitedust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardEximite = ITEMS.register("eximiteshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpEximite = ITEMS.register("eximiteclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustEximite = ITEMS.register("eximitedirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawEximite = ITEMS.register("raweximite", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerGallium.get())
        {
            ItemList.itemIngotGallium = ITEMS.register("galliumingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustGallium = ITEMS.register("galliumdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardGallium = ITEMS.register("galliumshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpGallium = ITEMS.register("galliumclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustGallium = ITEMS.register("galliumdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawGallium = ITEMS.register("rawgallium", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerGarnet.get())
        {
            ItemList.itemGemGarnet = ITEMS.register("garnet", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerHaderoth.get())
        {
            ItemList.itemIngotHaderoth = ITEMS.register("haderothingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustHaderoth = ITEMS.register("haderothdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardHaderoth = ITEMS.register("haderothshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpHaderoth = ITEMS.register("haderothclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustHaderoth = ITEMS.register("haderothdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawHaderoth = ITEMS.register("rawhaderoth", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerHepatizon.get())
        {
            ItemList.itemIngotHepatizon = ITEMS.register("hepatizoningot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustHepatizon = ITEMS.register("hepatizondust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardHepatizon = ITEMS.register("hepatizonshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpHepatizon = ITEMS.register("hepatizonclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustHepatizon = ITEMS.register("hepatizondirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawHepatizon = ITEMS.register("rawhepatizon", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerIgnatius.get())
        {
            ItemList.itemIngotIgnatius = ITEMS.register("ignatiusingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustIgnatius = ITEMS.register("ignatiusdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardIgnatius = ITEMS.register("ignatiusshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpIgnatius = ITEMS.register("ignatiusclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustIgnatius = ITEMS.register("ignatiusdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawIgnatius = ITEMS.register("rawignatius", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerIndium.get())
        {
            ItemList.itemIngotIndium = ITEMS.register("indiumingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustIndium = ITEMS.register("indiumdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardIndium = ITEMS.register("indiumshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpIndium = ITEMS.register("indiumclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustIndium = ITEMS.register("indiumdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawIndium = ITEMS.register("rawindium", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerInfuscolium.get())
        {
            ItemList.itemIngotInfuscolium = ITEMS.register("infuscoliumingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustInfuscolium = ITEMS.register("infuscoliumdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardInfuscolium = ITEMS.register("infuscoliumshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpInfuscolium = ITEMS.register("infuscoliumclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustInfuscolium = ITEMS.register("infuscoliumdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawInfuscolium = ITEMS.register("rawinfuscolium", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerInolashite.get())
        {
            ItemList.itemIngotInolashite = ITEMS.register("inolashiteingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustInolashite = ITEMS.register("inolashitedust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardInolashite = ITEMS.register("inolashiteshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpInolashite = ITEMS.register("inolashiteclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustInolashite = ITEMS.register("inolashitedirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawInolashite = ITEMS.register("rawinolashite", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerIolite.get())
        {
            ItemList.itemGemIolite = ITEMS.register("iolite", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerIridium.get())
        {
            ItemList.itemIngotIridium = ITEMS.register("iridiumingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustIridium = ITEMS.register("iridiumdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardIridium = ITEMS.register("iridiumshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpIridium = ITEMS.register("iridiumclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustIridium = ITEMS.register("iridiumdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawIridium = ITEMS.register("rawiridium", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerJade.get())
        {
            ItemList.itemGemJade = ITEMS.register("jade", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerJasper.get())
        {
            ItemList.itemGemJasper = ITEMS.register("jasper", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerKalendrite.get())
        {
            ItemList.itemIngotKalendrite = ITEMS.register("kalendriteingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustKalendrite = ITEMS.register("kalendritedust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardKalendrite = ITEMS.register("kalendriteshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpKalendrite = ITEMS.register("kalendriteclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustKalendrite = ITEMS.register("kalendritedirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawKalendrite = ITEMS.register("rawkalendrite", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerKyanite.get())
        {
            ItemList.itemGemKyanite = ITEMS.register("kyanite", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerLead.get())
        {
            ItemList.itemIngotLead = ITEMS.register("leadingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustLead = ITEMS.register("leaddust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardLead = ITEMS.register("leadshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpLead = ITEMS.register("leadclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustLead = ITEMS.register("leaddirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawLead = ITEMS.register("rawlead", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerLemurite.get())
        {
            ItemList.itemIngotLemurite = ITEMS.register("lemuriteingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustLemurite = ITEMS.register("lemuritedust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardLemurite = ITEMS.register("lemuriteshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpLemurite = ITEMS.register("lemuriteclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustLemurite = ITEMS.register("lemuritedirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawLemurite = ITEMS.register("rawlemurite", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerMalachite.get())
        {
            ItemList.itemGemMalachite = ITEMS.register("malachite", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerManganese.get())
        {
            ItemList.itemIngotManganese = ITEMS.register("manganeseingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustManganese = ITEMS.register("manganesedust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardManganese = ITEMS.register("manganeseshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpManganese = ITEMS.register("manganeseclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustManganese = ITEMS.register("manganesedirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawManganese = ITEMS.register("rawmanganese", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerMeutoite.get())
        {
            ItemList.itemIngotMeutoite = ITEMS.register("meutoiteingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustMeutoite = ITEMS.register("meutoitedust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardMeutoite = ITEMS.register("meutoiteshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpMeutoite = ITEMS.register("meutoiteclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustMeutoite = ITEMS.register("meutoitedirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawMeutoite = ITEMS.register("rawmeutoite", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerMidasium.get())
        {
            ItemList.itemIngotMidasium = ITEMS.register("midasiumingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustMidasium = ITEMS.register("midasiumdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardMidasium = ITEMS.register("midasiumshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpMidasium = ITEMS.register("midasiumclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustMidasium = ITEMS.register("midasiumdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawMidasium = ITEMS.register("rawmidasium", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerMithril.get())
        {
            ItemList.itemIngotMithril = ITEMS.register("mithrilingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustMithril = ITEMS.register("mithrildust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardMithril = ITEMS.register("mithrilshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpMithril = ITEMS.register("mithrilclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustMithril = ITEMS.register("mithrildirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawMithril = ITEMS.register("rawmithril", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerMolybdenum.get())
        {
            ItemList.itemIngotMolybdenum = ITEMS.register("molybdenumingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustMolybdenum = ITEMS.register("molybdenumdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardMolybdenum = ITEMS.register("molybdenumshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpMolybdenum = ITEMS.register("molybdenumclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustMolybdenum = ITEMS.register("molybdenumdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawMolybdenum = ITEMS.register("rawmolybdenum", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerNeodymium.get())
        {
            ItemList.itemIngotNeodymium = ITEMS.register("neodymiumingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustNeodymium = ITEMS.register("neodymiumdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardNeodymium = ITEMS.register("neodymiumshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpNeodymium = ITEMS.register("neodymiumclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustNeodymium = ITEMS.register("neodymiumdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawNeodymium = ITEMS.register("rawneodymium", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerNeptunium.get())
        {
            ItemList.itemIngotNeptunium = ITEMS.register("neptuniumingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustNeptunium = ITEMS.register("neptuniumdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardNeptunium = ITEMS.register("neptuniumshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpNeptunium = ITEMS.register("neptuniumclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustNeptunium = ITEMS.register("neptuniumdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawNeptunium = ITEMS.register("rawneptunium", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerNickel.get())
        {
            ItemList.itemIngotNickel = ITEMS.register("nickelingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustNickel = ITEMS.register("nickeldust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardNickel = ITEMS.register("nickelshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpNickel = ITEMS.register("nickelclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustNickel = ITEMS.register("nickeldirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawNickel = ITEMS.register("rawnickel", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerNiobium.get())
        {
            ItemList.itemIngotNiobium = ITEMS.register("niobiumingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustNiobium = ITEMS.register("niobiumdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardNiobium = ITEMS.register("niobiumshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpNiobium = ITEMS.register("niobiumclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustNiobium = ITEMS.register("niobiumdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawNiobium = ITEMS.register("rawniobium", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerOnyx.get())
        {
            ItemList.itemGemOnyx = ITEMS.register("onyx", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerOpal.get())
        {
            ItemList.itemGemOpal = ITEMS.register("opal", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerOrichalcum.get())
        {
            ItemList.itemIngotOrichalcum = ITEMS.register("orichalcumingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustOrichalcum = ITEMS.register("orichalcumdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardOrichalcum = ITEMS.register("orichalcumshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpOrichalcum = ITEMS.register("orichalcumclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustOrichalcum = ITEMS.register("orichalcumdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawOrichalcum = ITEMS.register("raworichalcum", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerOsmium.get())
        {
            ItemList.itemIngotOsmium = ITEMS.register("osmiumingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustOsmium = ITEMS.register("osmiumdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardOsmium = ITEMS.register("osmiumshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpOsmium = ITEMS.register("osmiumclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustOsmium = ITEMS.register("osmiumdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawOsmium = ITEMS.register("rawosmium", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerOureclase.get())
        {
            ItemList.itemIngotOureclase = ITEMS.register("oureclaseingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustOureclase = ITEMS.register("oureclasedust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardOureclase = ITEMS.register("oureclaseshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpOureclase = ITEMS.register("oureclaseclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustOureclase = ITEMS.register("oureclasedirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawOureclase = ITEMS.register("rawoureclase", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerPalladium.get())
        {
            ItemList.itemIngotPalladium = ITEMS.register("palladiumingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustPalladium = ITEMS.register("palladiumdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardPalladium = ITEMS.register("palladiumshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpPalladium = ITEMS.register("palladiumclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustPalladium = ITEMS.register("palladiumdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawPalladium = ITEMS.register("rawpalladium", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerPeridot.get())
        {
            ItemList.itemGemPeridot = ITEMS.register("peridot", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerPhoenixite.get())
        {
            ItemList.itemGemPhoenixite = ITEMS.register("phoenixite", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerPlatinum.get())
        {
            ItemList.itemIngotPlatinum = ITEMS.register("platinumingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustPlatinum = ITEMS.register("platinumdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardPlatinum = ITEMS.register("platinumshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpPlatinum = ITEMS.register("platinumclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustPlatinum = ITEMS.register("platinumdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawPlatinum = ITEMS.register("rawplatinum", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerPlutonium.get())
        {
            ItemList.itemIngotPlutonium = ITEMS.register("plutoniumingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustPlutonium = ITEMS.register("plutoniumdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardPlutonium = ITEMS.register("plutoniumshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpPlutonium = ITEMS.register("plutoniumclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustPlutonium = ITEMS.register("plutoniumdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawPlutonium = ITEMS.register("rawplutonium", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerPolonium.get())
        {
            ItemList.itemIngotPolonium = ITEMS.register("poloniumingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustPolonium = ITEMS.register("poloniumdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardPolonium = ITEMS.register("poloniumshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpPolonium = ITEMS.register("poloniumclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustPolonium = ITEMS.register("poloniumdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawPolonium = ITEMS.register("rawpolonium", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerPromethium.get())
        {
            ItemList.itemIngotPromethium = ITEMS.register("promethiumingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustPromethium = ITEMS.register("promethiumdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardPromethium = ITEMS.register("promethiumshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpPromethium = ITEMS.register("promethiumclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustPromethium = ITEMS.register("promethiumdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawPromethium = ITEMS.register("rawpromethium", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerQuartz.get())
        {
            ItemList.itemGemQuartz = ITEMS.register("quartz", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerRhenium.get())
        {
            ItemList.itemIngotRhenium = ITEMS.register("rheniumingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustRhenium = ITEMS.register("rheniumdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardRhenium = ITEMS.register("rheniumshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpRhenium = ITEMS.register("rheniumclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustRhenium = ITEMS.register("rheniumdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawRhenium = ITEMS.register("rawrhenium", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerRhodium.get())
        {
            ItemList.itemIngotRhodium = ITEMS.register("rhodiumingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustRhodium = ITEMS.register("rhodiumdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardRhodium = ITEMS.register("rhodiumshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpRhodium = ITEMS.register("rhodiumclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustRhodium = ITEMS.register("rhodiumdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawRhodium = ITEMS.register("rawrhodium", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerRubracium.get())
        {
            ItemList.itemIngotRubracium = ITEMS.register("rubraciumingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustRubracium = ITEMS.register("rubraciumdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardRubracium = ITEMS.register("rubraciumshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpRubracium = ITEMS.register("rubraciumclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustRubracium = ITEMS.register("rubraciumdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawRubracium = ITEMS.register("rawrubracium", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerRuby.get())
        {
            ItemList.itemGemRuby = ITEMS.register("ruby", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerRuthenium.get())
        {
            ItemList.itemIngotRuthenium = ITEMS.register("rutheniumingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustRuthenium = ITEMS.register("rutheniumdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardRuthenium = ITEMS.register("rutheniumshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpRuthenium = ITEMS.register("rutheniumclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustRuthenium = ITEMS.register("rutheniumdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawRuthenium = ITEMS.register("rawruthenium", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerSanguinite.get())
        {
            ItemList.itemIngotSanguinite = ITEMS.register("sanguiniteingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustSanguinite = ITEMS.register("sanguinitedust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardSanguinite = ITEMS.register("sanguiniteshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpSanguinite = ITEMS.register("sanguiniteclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustSanguinite = ITEMS.register("sanguinitedirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawSanguinite = ITEMS.register("rawsanguinite", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerSapphire.get())
        {
            ItemList.itemGemSapphire = ITEMS.register("sapphire", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerShadowIron.get())
        {
            ItemList.itemIngotShadowIron = ITEMS.register("shadowironingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustShadowIron = ITEMS.register("shadowirondust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardShadowIron = ITEMS.register("shadowironshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpShadowIron = ITEMS.register("shadowironclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustShadowIron = ITEMS.register("shadowirondirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawShadowIron = ITEMS.register("rawshadowiron", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerSilver.get())
        {
            ItemList.itemIngotSilver = ITEMS.register("silveringot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustSilver = ITEMS.register("silverdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardSilver = ITEMS.register("silvershard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpSilver = ITEMS.register("silverclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustSilver = ITEMS.register("silverdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawSilver = ITEMS.register("rawsilver", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerSpinel.get())
        {
            ItemList.itemGemSpinel = ITEMS.register("spinel", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerSugilite.get())
        {
            ItemList.itemGemSugilite = ITEMS.register("sugilite", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerTantalum.get())
        {
            ItemList.itemIngotTantalum = ITEMS.register("tantalumingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustTantalum = ITEMS.register("tantalumdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardTantalum = ITEMS.register("tantalumshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpTantalum = ITEMS.register("tantalumclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustTantalum = ITEMS.register("tantalumdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawTantalum = ITEMS.register("rawtantalum", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerTanzanite.get())
        {
            ItemList.itemGemTanzanite = ITEMS.register("tanzanite", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerTartarite.get())
        {
            ItemList.itemIngotTartarite = ITEMS.register("tartariteingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustTartarite = ITEMS.register("tartaritedust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardTartarite = ITEMS.register("tartariteshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpTartarite = ITEMS.register("tartariteclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustTartarite = ITEMS.register("tartaritedirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawTartarite = ITEMS.register("rawtartarite", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerTechnetium.get())
        {
            ItemList.itemIngotTechnetium = ITEMS.register("technetiumingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustTechnetium = ITEMS.register("technetiumdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardTechnetium = ITEMS.register("technetiumshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpTechnetium = ITEMS.register("technetiumclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustTechnetium = ITEMS.register("technetiumdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawTechnetium = ITEMS.register("rawtechnetium", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerThallium.get())
        {
            ItemList.itemIngotThallium = ITEMS.register("thalliumingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustThallium = ITEMS.register("thalliumdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardThallium = ITEMS.register("thalliumshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpThallium = ITEMS.register("thalliumclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustThallium = ITEMS.register("thalliumdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawThallium = ITEMS.register("rawthallium", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerTin.get())
        {
            ItemList.itemIngotTin = ITEMS.register("tiningot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustTin = ITEMS.register("tindust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardTin = ITEMS.register("tinshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpTin = ITEMS.register("tinclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustTin = ITEMS.register("tindirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawTin = ITEMS.register("rawtin", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerTitanium.get())
        {
            ItemList.itemIngotTitanium = ITEMS.register("titaniumingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustTitanium = ITEMS.register("titaniumdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardTitanium = ITEMS.register("titaniumshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpTitanium = ITEMS.register("titaniumclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustTitanium = ITEMS.register("titaniumdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawTitanium = ITEMS.register("rawtitanium", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerTopaz.get())
        {
            ItemList.itemGemTopaz = ITEMS.register("topaz", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerTourmaline.get())
        {
            ItemList.itemGemTourmaline = ITEMS.register("tourmaline", () -> new ItemEXOre(EXORES));
        }
        if(ConfigRegistryList.registerTritium.get())
        {
            ItemList.itemIngotTritium = ITEMS.register("tritiumingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustTritium = ITEMS.register("tritiumdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardTritium = ITEMS.register("tritiumshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpTritium = ITEMS.register("tritiumclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustTritium = ITEMS.register("tritiumdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawTritium = ITEMS.register("rawtritium", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerTungsten.get())
        {
            ItemList.itemIngotTungsten = ITEMS.register("tungsteningot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustTungsten = ITEMS.register("tungstendust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardTungsten = ITEMS.register("tungstenshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpTungsten = ITEMS.register("tungstenclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustTungsten = ITEMS.register("tungstendirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawTungsten = ITEMS.register("rawtungsten", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerTurquoise.get())
        {
            ItemList.itemGemTurquoise = ITEMS.register("turquoise", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerUnobtainium.get())
        {
            ItemList.itemIngotUnobtainium = ITEMS.register("unobtainiumingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustUnobtainium = ITEMS.register("unobtainiumdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardUnobtainium = ITEMS.register("unobtainiumshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpUnobtainium = ITEMS.register("unobtainiumclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustUnobtainium = ITEMS.register("unobtainiumdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawUnobtainium = ITEMS.register("rawunobtainium", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerUranium.get())
        {
            ItemList.itemIngotUranium = ITEMS.register("uraniumingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustUranium = ITEMS.register("uraniumdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardUranium = ITEMS.register("uraniumshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpUranium = ITEMS.register("uraniumclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustUranium = ITEMS.register("uraniumdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawUranium = ITEMS.register("rawuranium", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerVanadium.get())
        {
            ItemList.itemIngotVanadium = ITEMS.register("vanadiumingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustVanadium = ITEMS.register("vanadiumdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardVanadium = ITEMS.register("vanadiumshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpVanadium = ITEMS.register("vanadiumclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustVanadium = ITEMS.register("vanadiumdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawVanadium = ITEMS.register("rawvanadium", () -> new ItemEXOre(EXORES));
        }
        if(ConfigRegistryList.registerVibranium.get())
        {
            ItemList.itemIngotVibranium = ITEMS.register("vibraniumingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustVibranium = ITEMS.register("vibraniumdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardVibranium = ITEMS.register("vibraniumshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpVibranium = ITEMS.register("vibraniumclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustVibranium = ITEMS.register("vibraniumdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawVibranium = ITEMS.register("rawvibranium", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerVulcanite.get())
        {
            ItemList.itemIngotVulcanite = ITEMS.register("vulcaniteingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustVulcanite = ITEMS.register("vulcanitedust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardVulcanite = ITEMS.register("vulcaniteshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpVulcanite = ITEMS.register("vulcaniteclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustVulcanite = ITEMS.register("vulcanitedirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawVulcanite = ITEMS.register("rawvulcanite", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerVyroxeres.get())
        {
            ItemList.itemIngotVyroxeres = ITEMS.register("vyroxeresingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustVyroxeres = ITEMS.register("vyroxeresdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardVyroxeres = ITEMS.register("vyroxeresshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpVyroxeres = ITEMS.register("vyroxeresclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustVyroxeres = ITEMS.register("vyroxeresdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawVyroxeres = ITEMS.register("rawvyroxeres", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerYellorite.get())
        {
            ItemList.itemIngotYellorite = ITEMS.register("yelloriteingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustYellorite = ITEMS.register("yelloritedust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardYellorite = ITEMS.register("yelloriteshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpYellorite = ITEMS.register("yelloriteclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustYellorite = ITEMS.register("yelloritedirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawYellorite = ITEMS.register("rawyellorite", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerZinc.get())
        {
            ItemList.itemIngotZinc = ITEMS.register("zincingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustZinc = ITEMS.register("zincdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardZinc = ITEMS.register("zincshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpZinc = ITEMS.register("zincclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustZinc = ITEMS.register("zincdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawZinc = ITEMS.register("rawzinc", () -> new ItemEXOre(EXORES));
        }
        if (ConfigRegistryList.registerZirconium.get())
        {
            ItemList.itemIngotZirconium = ITEMS.register("zirconiumingot", () -> new ItemEXOre(EXORES));
            ItemList.itemDustZirconium = ITEMS.register("zirconiumdust", () -> new ItemEXOre(EXORES));
            ItemList.itemShardZirconium = ITEMS.register("zirconiumshard", () -> new ItemEXOre(EXORES));
            ItemList.itemClumpZirconium = ITEMS.register("zirconiumclump", () -> new ItemEXOre(EXORES));
            ItemList.itemDirtyDustZirconium = ITEMS.register("zirconiumdirtydust", () -> new ItemEXOre(EXORES));
            ItemList.itemRawZirconium = ITEMS.register("rawzirconium", () -> new ItemEXOre(EXORES));
        }
    }
}

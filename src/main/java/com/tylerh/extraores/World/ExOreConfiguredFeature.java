package com.tylerh.extraores.World;

import com.tylerh.extraores.Init.BlockList;
import com.tylerh.extraores.Init.ConfiguredFeatureList;
import com.tylerh.extraores.Util.ModInfo;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ExOreConfiguredFeature
{
    public static void bootstrap(BootstrapContext<ConfiguredFeature<?,?>> context)
    {
        int size = 8;
        List<OreConfiguration.TargetBlockState> target;
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endReplaceables = new BlockMatchTest(Blocks.END_STONE);
            ConfiguredFeatureList.featureAdamantine = registerKey("adamantineore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreAdamantine.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreAdamantine.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureAdamantine,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureAgate = registerKey("agateore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreAgate.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreAgate.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreAgate.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureAgate,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureAldourite = registerKey("aldouriteore");
            target = List.of(
                    OreConfiguration.target(netherReplaceables,BlockList.blockOreAldourite.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureAldourite,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureAluminum = registerKey("aluminumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreAluminum.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreAluminum.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureAluminum,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureAmericium = registerKey("americiumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreAmericium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreAmericium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureAmericium,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureAmethyst = registerKey("amethystore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreAmethyst.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreAmethyst.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreAmethyst.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureAmethyst,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureAmetrine = registerKey("ametrineore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreAmetrine.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreAmetrine.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreAmetrine.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureAmetrine,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureAmordrine = registerKey("amordrineore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreAmordrine.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreAmordrine.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureAmordrine,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureAngmallen = registerKey("angmallenore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreAngmallen.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreAngmallen.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureAngmallen,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureAquamarine = registerKey("aquamarineore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreAquamarine.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreAquamarine.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreAquamarine.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureAquamarine,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureAstralSilver = registerKey("astralsilverore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreAstralSilver.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreAstralSilver.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureAstralSilver,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureAtlarus = registerKey("atlarusore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreAtlarus.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreAtlarus.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureAtlarus,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureAzureSilver = registerKey("azuresilverore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreAzureSilver.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreAzureSilver.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureAzureSilver,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureBismuth = registerKey("bismuthore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreBismuth.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreBismuth.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureBismuth,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureBlackSteel = registerKey("blacksteelore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreBlackSteel.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreBlackSteel.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureBlackSteel,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureCadmium = registerKey("cadmiumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreCadmium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreCadmium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureCadmium,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureCarmot = registerKey("carmotore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreCarmot.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreCarmot.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureCarmot,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureCelenegil = registerKey("celenegilore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreCelenegil.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreCelenegil.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureCelenegil,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureCeruclase = registerKey("ceruclaseore");
            target = List.of(
                    OreConfiguration.target(netherReplaceables,BlockList.blockOreCeruclase.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureCeruclase,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureChromium = registerKey("chromiumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreChromium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreChromium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureChromium,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureChrysocolla = registerKey("chrysocollaore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreChrysocolla.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreChrysocolla.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreChrysocolla.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureChrysocolla,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureCitrine = registerKey("citrineore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreCitrine.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreCitrine.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreCitrine.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureCitrine,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureCobalt = registerKey("cobaltore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreCobalt.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreCobalt.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureCobalt,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureCopper = registerKey("copperore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreCopper.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreCopper.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureCopper,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureCrimsonSteel = registerKey("crimsonsteelore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreCrimsonSteel.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreCrimsonSteel.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureCrimsonSteel,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureDeepIron = registerKey("deepironore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreDeepIron.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreDeepIron.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureDeepIron,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureDesichalkos = registerKey("desichalkosore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreDesichalkos.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreDesichalkos.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureDesichalkos,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureEximite = registerKey("eximiteore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreEximite.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreEximite.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureEximite,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureGallium = registerKey("galliumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreGallium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreGallium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureGallium,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureGarnet = registerKey("garnetore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreGarnet.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreGarnet.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreGarnet.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureGarnet,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureHaderoth = registerKey("haderothore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreHaderoth.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreHaderoth.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureHaderoth,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureHepatizon = registerKey("hepatizonore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreHepatizon.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreHepatizon.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureHepatizon,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureIgnatius = registerKey("ignatiusore");
            target = List.of(
                    OreConfiguration.target(netherReplaceables,BlockList.blockOreIgnatius.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureIgnatius,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureIndium = registerKey("indiumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreIndium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreIndium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureIndium,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureInfuscolium = registerKey("infuscoliumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreInfuscolium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreInfuscolium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureInfuscolium,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureInolashite = registerKey("inolashiteore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreInolashite.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreInolashite.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureInolashite,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureIolite = registerKey("ioliteore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreIolite.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreIolite.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreIolite.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureIolite,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureIridium = registerKey("iridiumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreIridium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreIridium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureIridium,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureJade = registerKey("jadeore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreJade.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreJade.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreJade.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureJade,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureJasper = registerKey("jasperore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreJasper.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreJasper.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreJasper.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureJasper,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureKalendrite = registerKey("kalendriteore");
            target = List.of(
                    OreConfiguration.target(netherReplaceables,BlockList.blockOreKalendrite.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureKalendrite,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureKyanite = registerKey("kyaniteore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreKyanite.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreKyanite.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreKyanite.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureKyanite,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureLead = registerKey("leadore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreLead.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreLead.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureLead,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureLemurite = registerKey("lemuriteore");
            target = List.of(
                    OreConfiguration.target(netherReplaceables,BlockList.blockOreLemurite.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureLemurite,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureMalachite = registerKey("malachiteore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreMalachite.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreMalachite.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreMalachite.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureMalachite,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureManganese = registerKey("manganeseore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreManganese.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreManganese.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureManganese,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureMeutoite = registerKey("meutoiteore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreMeutoite.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreMeutoite.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureMeutoite,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureMidasium = registerKey("midasiumore");
            target = List.of(
                    OreConfiguration.target(netherReplaceables,BlockList.blockOreMidasium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureMidasium,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureMithril = registerKey("mithrilore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreMithril.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreMithril.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureMithril,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureMolybdenum = registerKey("molybdenumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreMolybdenum.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreMolybdenum.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureMolybdenum,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureNeodymium = registerKey("neodymiumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreNeodymium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreNeodymium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureNeodymium,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureNeptunium = registerKey("neptuniumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreNeptunium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreNeptunium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureNeptunium,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureNickel = registerKey("nickelore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreNickel.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreNickel.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureNickel,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureNiobium = registerKey("niobiumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreNiobium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreNiobium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureNiobium,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureOnyx = registerKey("onyxore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreOnyx.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreOnyx.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreOnyx.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureOnyx,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureOpal = registerKey("opalore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreOpal.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreOpal.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreOpal.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureOpal,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureOrichalcum = registerKey("orichalcumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreOrichalcum.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreOrichalcum.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureOrichalcum,Feature.ORE,new OreConfiguration(target,size));

            ConfiguredFeatureList.featureOsmium = registerKey("osmiumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreOsmium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreOsmium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureOsmium,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureOureclase = registerKey("oureclaseore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreOureclase.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreOureclase.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureOureclase,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featurePalladium = registerKey("palladiumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOrePalladium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOrePalladium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featurePalladium,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featurePeridot = registerKey("peridotore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOrePeridot.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOrePeridot.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOrePeridot.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featurePeridot,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featurePhoenixite = registerKey("phoenixiteore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOrePhoenixite.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOrePhoenixite.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOrePhoenixite.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featurePhoenixite,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featurePlatinum = registerKey("platinumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOrePlatinum.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOrePlatinum.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featurePlatinum,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featurePlutonium = registerKey("plutoniumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOrePlutonium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOrePlutonium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featurePlutonium,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featurePolonium = registerKey("poloniumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOrePolonium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOrePolonium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featurePolonium,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featurePromethium = registerKey("promethiumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOrePromethium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOrePromethium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featurePromethium,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureQuartz = registerKey("quartzore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreQuartz.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreQuartz.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreQuartz.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureQuartz,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureRhenium = registerKey("rheniumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreRhenium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreRhenium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureRhenium,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureRhodium = registerKey("rhodiumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreRhodium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreRhodium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureRhodium,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureRubracium = registerKey("rubraciumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreRubracium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreRubracium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureRubracium,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureRuby = registerKey("rubyore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreRuby.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreRuby.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreRuby.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureRuby,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureRuthenium = registerKey("rutheniumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreRuthenium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreRuthenium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureRuthenium,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureSanguinite = registerKey("sanguiniteore");
            target = List.of(
                    OreConfiguration.target(netherReplaceables,BlockList.blockOreSanguinite.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureSanguinite,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureSapphire = registerKey("sapphireore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreSapphire.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreSapphire.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreSapphire.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureSapphire,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureShadowIron = registerKey("shadowironore");
            target = List.of(
                    OreConfiguration.target(netherReplaceables,BlockList.blockOreShadowIron.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureShadowIron,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureSilver = registerKey("silverore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreSilver.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreSilver.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureSilver,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureSpinel = registerKey("spinelore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreSpinel.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreSpinel.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreSpinel.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureSpinel,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureSugilite = registerKey("sugiliteore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreSugilite.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreSugilite.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreSugilite.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureSugilite,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureTantalum = registerKey("tantalumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreTantalum.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreTantalum.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureTantalum,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureTanzanite = registerKey("tanzaniteore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreTanzanite.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreTanzanite.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreTanzanite.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureTanzanite,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureTartarite = registerKey("tartariteore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreTartarite.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreTartarite.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureTartarite,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureTechnetium = registerKey("technetiumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreTechnetium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreTechnetium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureTechnetium,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureThallium = registerKey("thalliumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreThallium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreThallium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureThallium,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureTin = registerKey("tinore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreTin.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreTin.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureTin,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureTitanium = registerKey("titaniumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreTitanium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreTitanium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureTitanium,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureTopaz = registerKey("topazore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreTopaz.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreTopaz.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreTopaz.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureTopaz,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureTourmaline = registerKey("tourmalineore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreTourmaline.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreTourmaline.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreTourmaline.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureTourmaline,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureTritium = registerKey("tritiumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreTritium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreTritium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureTritium,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureTungsten = registerKey("tungstenore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreTungsten.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreTungsten.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureTungsten,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureTurquoise = registerKey("turquoiseore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreTurquoise.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreTurquoise.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreTurquoise.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureTurquoise,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureUnobtainium = registerKey("unobtainiumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreUnobtainium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreUnobtainium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureUnobtainium,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureUranium = registerKey("uraniumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreUranium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreUranium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureUranium,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureVanadium = registerKey("vanadiumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreVanadium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreVanadium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureVanadium,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureVibranium = registerKey("vibraniumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreVibranium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreVibranium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureVibranium,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureVulcanite = registerKey("vulcaniteore");
            target = List.of(
                    OreConfiguration.target(netherReplaceables,BlockList.blockOreVulcanite.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureVulcanite,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureVyroxeres = registerKey("vyroxeresore");
            target = List.of(
                    OreConfiguration.target(netherReplaceables,BlockList.blockOreVyroxeres.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureVyroxeres,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureYellorite = registerKey("yelloriteore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreYellorite.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreYellorite.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureYellorite,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureZinc = registerKey("zincore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreZinc.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreZinc.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureZinc,Feature.ORE,new OreConfiguration(target,size));
            ConfiguredFeatureList.featureZirconium = registerKey("zirconiumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreZirconium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreZirconium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureZirconium,Feature.ORE,new OreConfiguration(target,size));
    }
    public static ResourceKey<ConfiguredFeature<?,?>> registerKey(String name)
    {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE,ResourceLocation.fromNamespaceAndPath(ModInfo.MOD_ID,name));
    }
    private static <FC extends FeatureConfiguration,F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?,?>> context,ResourceKey<ConfiguredFeature<?,?>> key,F feature,FC configuration)
    {
        context.register(key,new ConfiguredFeature<>(feature,configuration));
    }
}

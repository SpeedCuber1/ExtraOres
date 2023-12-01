package com.tylerh.extraores.World;

import com.tylerh.extraores.Init.BlockList;
import com.tylerh.extraores.Init.ConfigRegistryList;
import com.tylerh.extraores.Init.ConfiguredFeatureList;
import com.tylerh.extraores.Util.ModInfo;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
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
    public static void bootstrap(BootstapContext<ConfiguredFeature<?,?>> context)
    {
        int size = ExOreWorldGenConfig.veinSize.get();
        List<OreConfiguration.TargetBlockState> target;
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endReplaceables = new BlockMatchTest(Blocks.END_STONE);
        if(ConfigRegistryList.registerAdamantine.get())
        {
            ConfiguredFeatureList.featureAdamantine = registerKey("adamantineore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreAdamantine.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreAdamantine.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureAdamantine,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerAgate.get())
        {
            ConfiguredFeatureList.featureAgate = registerKey("agateore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreAgate.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreAgate.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreAgate.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureAgate,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerAldourite.get())
        {
            ConfiguredFeatureList.featureAldourite = registerKey("aldouriteore");
            target = List.of(
                    OreConfiguration.target(netherReplaceables,BlockList.blockOreAldourite.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureAldourite,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerAluminum.get())
        {
            ConfiguredFeatureList.featureAluminum = registerKey("aluminumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreAluminum.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreAluminum.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureAluminum,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerAmericium.get())
        {
            ConfiguredFeatureList.featureAmericium = registerKey("americiumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreAmericium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreAmericium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureAmericium,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerAmethyst.get())
        {
            ConfiguredFeatureList.featureAmethyst = registerKey("amethystore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreAmethyst.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreAmethyst.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreAmethyst.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureAmethyst,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerAmetrine.get())
        {
            ConfiguredFeatureList.featureAmetrine = registerKey("ametrineore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreAmetrine.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreAmetrine.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreAmetrine.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureAmetrine,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerAmordrine.get())
        {
            ConfiguredFeatureList.featureAmordrine = registerKey("amordrineore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreAmordrine.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreAmordrine.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureAmordrine,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerAngmallen.get())
        {
            ConfiguredFeatureList.featureAngmallen = registerKey("angmallenore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreAngmallen.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreAngmallen.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureAngmallen,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerAquamarine.get())
        {
            ConfiguredFeatureList.featureAquamarine = registerKey("aquamarineore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreAquamarine.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreAquamarine.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreAquamarine.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureAquamarine,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerAstralSilver.get())
        {
            ConfiguredFeatureList.featureAstralSilver = registerKey("astralsilverore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreAstralSilver.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreAstralSilver.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureAstralSilver,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerAtlarus.get())
        {
            ConfiguredFeatureList.featureAtlarus = registerKey("atlarusore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreAtlarus.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreAtlarus.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureAtlarus,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerAzureSilver.get())
        {
            ConfiguredFeatureList.featureAzureSilver = registerKey("azuresilverore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreAzureSilver.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreAzureSilver.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureAzureSilver,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerBismuth.get())
        {
            ConfiguredFeatureList.featureBismuth = registerKey("bismuthore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreBismuth.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreBismuth.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureBismuth,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerBlackSteel.get())
        {
            ConfiguredFeatureList.featureBlackSteel = registerKey("blacksteelore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreBlackSteel.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreBlackSteel.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureBlackSteel,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerCadmium.get())
        {
            ConfiguredFeatureList.featureCadmium = registerKey("cadmiumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreCadmium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreCadmium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureCadmium,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerCarmot.get())
        {
            ConfiguredFeatureList.featureCarmot = registerKey("carmotore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreCarmot.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreCarmot.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureCarmot,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerCelenegil.get())
        {
            ConfiguredFeatureList.featureCelenegil = registerKey("celenegilore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreCelenegil.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreCelenegil.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureCelenegil,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerCeruclase.get())
        {
            ConfiguredFeatureList.featureCeruclase = registerKey("ceruclaseore");
            target = List.of(
                    OreConfiguration.target(netherReplaceables,BlockList.blockOreCeruclase.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureCeruclase,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerChromium.get())
        {
            ConfiguredFeatureList.featureChromium = registerKey("chromiumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreChromium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreChromium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureChromium,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerChrysocolla.get())
        {
            ConfiguredFeatureList.featureChrysocolla = registerKey("chrysocollaore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreChrysocolla.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreChrysocolla.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreChrysocolla.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureChrysocolla,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerCitrine.get())
        {
            ConfiguredFeatureList.featureCitrine = registerKey("citrineore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreCitrine.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreCitrine.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreCitrine.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureCitrine,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerCobalt.get())
        {
            ConfiguredFeatureList.featureCobalt = registerKey("cobaltore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreCobalt.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreCobalt.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureCobalt,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerCopper.get())
        {
            ConfiguredFeatureList.featureCopper = registerKey("copperore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreCopper.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreCopper.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureCopper,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerCrimsonSteel.get())
        {
            ConfiguredFeatureList.featureCrimsonSteel = registerKey("crimsonsteelore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreCrimsonSteel.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreCrimsonSteel.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureCrimsonSteel,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerDeepIron.get())
        {
            ConfiguredFeatureList.featureDeepIron = registerKey("deepironore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreDeepIron.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreDeepIron.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureDeepIron,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerDesichalkos.get())
        {
            ConfiguredFeatureList.featureDesichalkos = registerKey("desichalkosore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreDesichalkos.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreDesichalkos.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureDesichalkos,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerEximite.get())
        {
            ConfiguredFeatureList.featureEximite = registerKey("eximiteore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreEximite.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreEximite.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureEximite,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerGallium.get())
        {
            ConfiguredFeatureList.featureGallium = registerKey("galliumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreGallium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreGallium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureGallium,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerGarnet.get())
        {
            ConfiguredFeatureList.featureGarnet = registerKey("garnetore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreGarnet.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreGarnet.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreGarnet.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureGarnet,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerHaderoth.get())
        {
            ConfiguredFeatureList.featureHaderoth = registerKey("haderothore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreHaderoth.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreHaderoth.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureHaderoth,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerHepatizon.get())
        {
            ConfiguredFeatureList.featureHepatizon = registerKey("hepatizonore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreHepatizon.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreHepatizon.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureHepatizon,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerIgnatius.get())
        {
            ConfiguredFeatureList.featureIgnatius = registerKey("ignatiusore");
            target = List.of(
                    OreConfiguration.target(netherReplaceables,BlockList.blockOreIgnatius.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureIgnatius,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerIndium.get())
        {
            ConfiguredFeatureList.featureIndium = registerKey("indiumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreIndium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreIndium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureIndium,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerInfuscolium.get())
        {
            ConfiguredFeatureList.featureInfuscolium = registerKey("infuscoliumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreInfuscolium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreInfuscolium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureInfuscolium,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerInolashite.get())
        {
            ConfiguredFeatureList.featureInolashite = registerKey("inolashiteore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreInolashite.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreInolashite.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureInolashite,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerIolite.get())
        {
            ConfiguredFeatureList.featureIolite = registerKey("ioliteore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreIolite.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreIolite.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreIolite.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureIolite,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerIridium.get())
        {
            ConfiguredFeatureList.featureIridium = registerKey("iridiumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreIridium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreIridium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureIridium,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerJade.get())
        {
            ConfiguredFeatureList.featureJade = registerKey("jadeore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreJade.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreJade.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreJade.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureJade,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerJasper.get())
        {
            ConfiguredFeatureList.featureJasper = registerKey("jasperore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreJasper.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreJasper.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreJasper.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureJasper,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerKalendrite.get())
        {
            ConfiguredFeatureList.featureKalendrite = registerKey("kalendriteore");
            target = List.of(
                    OreConfiguration.target(netherReplaceables,BlockList.blockOreKalendrite.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureKalendrite,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerKyanite.get())
        {
            ConfiguredFeatureList.featureKyanite = registerKey("kyaniteore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreKyanite.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreKyanite.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreKyanite.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureKyanite,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerLead.get())
        {
            ConfiguredFeatureList.featureLead = registerKey("leadore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreLead.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreLead.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureLead,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerLemurite.get())
        {
            ConfiguredFeatureList.featureLemurite = registerKey("lemuriteore");
            target = List.of(
                    OreConfiguration.target(netherReplaceables,BlockList.blockOreLemurite.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureLemurite,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerMalachite.get())
        {
            ConfiguredFeatureList.featureMalachite = registerKey("malachiteore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreMalachite.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreMalachite.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreMalachite.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureMalachite,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerManganese.get())
        {
            ConfiguredFeatureList.featureManganese = registerKey("manganeseore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreManganese.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreManganese.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureManganese,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerMeutoite.get())
        {
            ConfiguredFeatureList.featureMeutoite = registerKey("meutoiteore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreMeutoite.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreMeutoite.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureMeutoite,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerMidasium.get())
        {
            ConfiguredFeatureList.featureMidasium = registerKey("midasiumore");
            target = List.of(
                    OreConfiguration.target(netherReplaceables,BlockList.blockOreMidasium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureMidasium,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerMithril.get())
        {
            ConfiguredFeatureList.featureMithril = registerKey("mithrilore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreMithril.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreMithril.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureMithril,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerMolybdenum.get())
        {
            ConfiguredFeatureList.featureMolybdenum = registerKey("molybdenumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreMolybdenum.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreMolybdenum.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureMolybdenum,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerNeodymium.get())
        {
            ConfiguredFeatureList.featureNeodymium = registerKey("neodymiumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreNeodymium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreNeodymium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureNeodymium,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerNeptunium.get())
        {
            ConfiguredFeatureList.featureNeptunium = registerKey("neptuniumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreNeptunium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreNeptunium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureNeptunium,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerNickel.get())
        {
            ConfiguredFeatureList.featureNickel = registerKey("nickelore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreNickel.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreNickel.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureNickel,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerNiobium.get())
        {
            ConfiguredFeatureList.featureNiobium = registerKey("niobiumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreNiobium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreNiobium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureNiobium,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerOnyx.get())
        {
            ConfiguredFeatureList.featureOnyx = registerKey("onyxore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreOnyx.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreOnyx.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreOnyx.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureOnyx,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerOpal.get())
        {
            ConfiguredFeatureList.featureOpal = registerKey("opalore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreOpal.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreOpal.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreOpal.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureOpal,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerOrichalcum.get())
        {
            ConfiguredFeatureList.featureOrichalcum = registerKey("orichalcumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreOrichalcum.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreOrichalcum.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureOrichalcum,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerOsmium.get())
        {
            ConfiguredFeatureList.featureOsmium = registerKey("osmiumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreOsmium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreOsmium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureOsmium,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerOureclase.get())
        {
            ConfiguredFeatureList.featureOureclase = registerKey("oureclaseore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreOureclase.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreOureclase.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureOureclase,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerPalladium.get())
        {
            ConfiguredFeatureList.featurePalladium = registerKey("palladiumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOrePalladium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOrePalladium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featurePalladium,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerPeridot.get())
        {
            ConfiguredFeatureList.featurePeridot = registerKey("peridotore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOrePeridot.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOrePeridot.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOrePeridot.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featurePeridot,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerPhoenixite.get())
        {
            ConfiguredFeatureList.featurePhoenixite = registerKey("phoenixiteore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOrePhoenixite.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOrePhoenixite.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOrePhoenixite.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featurePhoenixite,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerPlatinum.get())
        {
            ConfiguredFeatureList.featurePlatinum = registerKey("platinumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOrePlatinum.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOrePlatinum.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featurePlatinum,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerPlutonium.get())
        {
            ConfiguredFeatureList.featurePlutonium = registerKey("plutoniumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOrePlutonium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOrePlutonium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featurePlutonium,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerPolonium.get())
        {
            ConfiguredFeatureList.featurePolonium = registerKey("poloniumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOrePolonium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOrePolonium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featurePolonium,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerPromethium.get())
        {
            ConfiguredFeatureList.featurePromethium = registerKey("promethiumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOrePromethium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOrePromethium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featurePromethium,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerQuartz.get())
        {
            ConfiguredFeatureList.featureQuartz = registerKey("quartzore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreQuartz.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreQuartz.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreQuartz.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureQuartz,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerRhenium.get())
        {
            ConfiguredFeatureList.featureRhenium = registerKey("rheniumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreRhenium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreRhenium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureRhenium,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerRhodium.get())
        {
            ConfiguredFeatureList.featureRhodium = registerKey("rhodiumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreRhodium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreRhodium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureRhodium,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerRubracium.get())
        {
            ConfiguredFeatureList.featureRubracium = registerKey("rubraciumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreRubracium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreRubracium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureRubracium,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerRuby.get())
        {
            ConfiguredFeatureList.featureRuby = registerKey("rubyore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreRuby.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreRuby.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreRuby.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureRuby,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerRuthenium.get())
        {
            ConfiguredFeatureList.featureRuthenium = registerKey("rutheniumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreRuthenium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreRuthenium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureRuthenium,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerSanguinite.get())
        {
            ConfiguredFeatureList.featureSanguinite = registerKey("sanguiniteore");
            target = List.of(
                    OreConfiguration.target(netherReplaceables,BlockList.blockOreSanguinite.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureSanguinite,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerSapphire.get())
        {
            ConfiguredFeatureList.featureSapphire = registerKey("sapphireore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreSapphire.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreSapphire.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreSapphire.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureSapphire,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerShadowIron.get())
        {
            ConfiguredFeatureList.featureShadowIron = registerKey("shadowironore");
            target = List.of(
                    OreConfiguration.target(netherReplaceables,BlockList.blockOreShadowIron.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureShadowIron,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerSilver.get())
        {
            ConfiguredFeatureList.featureSilver = registerKey("silverore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreSilver.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreSilver.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureSilver,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerSpinel.get())
        {
            ConfiguredFeatureList.featureSpinel = registerKey("spinelore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreSpinel.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreSpinel.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreSpinel.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureSpinel,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerSugilite.get())
        {
            ConfiguredFeatureList.featureSugilite = registerKey("sugiliteore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreSugilite.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreSugilite.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreSugilite.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureSugilite,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerTantalum.get())
        {
            ConfiguredFeatureList.featureTantalum = registerKey("tantalumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreTantalum.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreTantalum.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureTantalum,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerTanzanite.get())
        {
            ConfiguredFeatureList.featureTanzanite = registerKey("tanzaniteore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreTanzanite.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreTanzanite.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreTanzanite.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureTanzanite,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerTartarite.get())
        {
            ConfiguredFeatureList.featureTartarite = registerKey("tartariteore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreTartarite.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreTartarite.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureTartarite,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerTechnetium.get())
        {
            ConfiguredFeatureList.featureTechnetium = registerKey("technetiumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreTechnetium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreTechnetium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureTechnetium,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerThallium.get())
        {
            ConfiguredFeatureList.featureThallium = registerKey("thalliumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreThallium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreThallium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureThallium,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerTin.get())
        {
            ConfiguredFeatureList.featureTin = registerKey("tinore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreTin.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreTin.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureTin,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerTitanium.get())
        {
            ConfiguredFeatureList.featureTitanium = registerKey("titaniumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreTitanium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreTitanium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureTitanium,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerTopaz.get())
        {
            ConfiguredFeatureList.featureTopaz = registerKey("topazore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreTopaz.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreTopaz.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreTopaz.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureTopaz,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerTourmaline.get())
        {
            ConfiguredFeatureList.featureTourmaline = registerKey("tourmalineore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreTourmaline.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreTourmaline.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreTourmaline.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureTourmaline,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerTritium.get())
        {
            ConfiguredFeatureList.featureTritium = registerKey("tritiumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreTritium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreTritium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureTritium,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerTungsten.get())
        {
            ConfiguredFeatureList.featureTungsten = registerKey("tungstenore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreTungsten.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreTungsten.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureTungsten,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerTurquoise.get())
        {
            ConfiguredFeatureList.featureTurquoise = registerKey("turquoiseore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreTurquoise.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreTurquoise.get().defaultBlockState()),
                    OreConfiguration.target(endReplaceables,BlockList.blockEnderOreTurquoise.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureTurquoise,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerUnobtainium.get())
        {
            ConfiguredFeatureList.featureUnobtainium = registerKey("unobtainiumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreUnobtainium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreUnobtainium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureUnobtainium,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerUranium.get())
        {
            ConfiguredFeatureList.featureUranium = registerKey("uraniumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreUranium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreUranium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureUranium,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerVanadium.get())
        {
            ConfiguredFeatureList.featureVanadium = registerKey("vanadiumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreVanadium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreVanadium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureVanadium,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerVibranium.get())
        {
            ConfiguredFeatureList.featureVibranium = registerKey("vibraniumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreVibranium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreVibranium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureVibranium,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerVulcanite.get())
        {
            ConfiguredFeatureList.featureVulcanite = registerKey("vulcaniteore");
            target = List.of(
                    OreConfiguration.target(netherReplaceables,BlockList.blockOreVulcanite.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureVulcanite,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerVyroxeres.get())
        {
            ConfiguredFeatureList.featureVyroxeres = registerKey("vyroxeresore");
            target = List.of(
                    OreConfiguration.target(netherReplaceables,BlockList.blockOreVyroxeres.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureVyroxeres,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerYellorite.get())
        {
            ConfiguredFeatureList.featureYellorite = registerKey("yelloriteore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreYellorite.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreYellorite.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureYellorite,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerZinc.get())
        {
            ConfiguredFeatureList.featureZinc = registerKey("zincore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreZinc.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreZinc.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureZinc,Feature.ORE,new OreConfiguration(target,size));
        }
        if(ConfigRegistryList.registerZirconium.get())
        {
            ConfiguredFeatureList.featureZirconium = registerKey("zirconiumore");
            target = List.of(
                    OreConfiguration.target(stoneReplaceables, BlockList.blockOreZirconium.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,BlockList.blockDeepslateOreZirconium.get().defaultBlockState())
            );
            register(context,ConfiguredFeatureList.featureZirconium,Feature.ORE,new OreConfiguration(target,size));
        }
    }
    public static ResourceKey<ConfiguredFeature<?,?>> registerKey(String name)
    {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,name));
    }
    private static <FC extends FeatureConfiguration,F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?,?>> context,ResourceKey<ConfiguredFeature<?,?>> key,F feature,FC configuration)
    {
        context.register(key,new ConfiguredFeature<>(feature,configuration));
    }
}

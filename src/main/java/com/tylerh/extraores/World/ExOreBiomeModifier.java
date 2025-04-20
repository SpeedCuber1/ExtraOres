package com.tylerh.extraores.World;

import com.tylerh.extraores.Init.BiomeModifierList;
import com.tylerh.extraores.Init.PlacedFeatureList;
import com.tylerh.extraores.Util.ModInfo;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ExOreBiomeModifier
{
    public static void bootstrap(BootstrapContext<BiomeModifier> context)
    {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);
        BiomeModifierList.modifierAdamantine = registerKey("adamantineore");
        context.register(BiomeModifierList.modifierAdamantine,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureAdamantine)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierAgate = registerKey("agateore");
        context.register(BiomeModifierList.modifierAgate,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureAgate)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierAgate = registerKey("endagateore");
        context.register(BiomeModifierList.modifierAgate,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureAgate)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierAldourite = registerKey("aldouriteore");
        context.register(BiomeModifierList.modifierAldourite,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureAldourite)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierAluminum = registerKey("aluminumore");
        context.register(BiomeModifierList.modifierAluminum,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureAluminum)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierAmericium = registerKey("americiumore");
        context.register(BiomeModifierList.modifierAmericium,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureAmericium)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierAmethyst = registerKey("amethystore");
        context.register(BiomeModifierList.modifierAmethyst,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureAmethyst)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));        BiomeModifierList.modifierAmethyst = registerKey("endamethystore");
        context.register(BiomeModifierList.modifierAmethyst,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureAmethyst)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierAmetrine = registerKey("ametrineore");
        context.register(BiomeModifierList.modifierAmetrine,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureAmetrine)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierAmetrine = registerKey("endametrineore");
        context.register(BiomeModifierList.modifierAmetrine,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureAmetrine)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierAmordrine = registerKey("amordrineore");
        context.register(BiomeModifierList.modifierAmordrine,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureAmordrine)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierAngmallen = registerKey("angmallenore");
        context.register(BiomeModifierList.modifierAngmallen,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureAngmallen)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierAquamarine = registerKey("aquamarineore");
        context.register(BiomeModifierList.modifierAquamarine,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureAquamarine)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierAquamarine = registerKey("endaquamarineore");
        context.register(BiomeModifierList.modifierAquamarine,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureAquamarine)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierAstralSilver = registerKey("astralsilverore");
        context.register(BiomeModifierList.modifierAstralSilver,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureAstralSilver)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierAtlarus = registerKey("atlarusore");
        context.register(BiomeModifierList.modifierAtlarus,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureAtlarus)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierAzureSilver = registerKey("azuresilverore");
        context.register(BiomeModifierList.modifierAzureSilver,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureAzureSilver)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierBismuth = registerKey("bismuthore");
        context.register(BiomeModifierList.modifierBismuth,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureBismuth)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierBlackSteel = registerKey("blacksteelore");
        context.register(BiomeModifierList.modifierBlackSteel,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureBlackSteel)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierCadmium = registerKey("cadmiumore");
        context.register(BiomeModifierList.modifierCadmium,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureCadmium)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierCarmot = registerKey("carmotore");
        context.register(BiomeModifierList.modifierCarmot,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureCarmot)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierCelenegil = registerKey("celenegilore");
        context.register(BiomeModifierList.modifierCelenegil,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureCelenegil)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierCeruclase = registerKey("ceruclaseore");
        context.register(BiomeModifierList.modifierCeruclase,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureCeruclase)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierChromium = registerKey("chromiumore");
        context.register(BiomeModifierList.modifierChromium,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureChromium)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierChrysocolla = registerKey("chrysocollaore");
        context.register(BiomeModifierList.modifierChrysocolla,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureChrysocolla)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierChrysocolla = registerKey("endchrysocollaore");
        context.register(BiomeModifierList.modifierChrysocolla,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureChrysocolla)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierCitrine = registerKey("citrineore");
        context.register(BiomeModifierList.modifierCitrine,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureCitrine)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierCitrine = registerKey("endcitrineore");
        context.register(BiomeModifierList.modifierCitrine,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureCitrine)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierCobalt = registerKey("cobaltore");
        context.register(BiomeModifierList.modifierCobalt,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureCobalt)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierCopper = registerKey("copperore");
        context.register(BiomeModifierList.modifierCopper,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureCopper)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierCrimsonSteel = registerKey("crimsonsteelore");
        context.register(BiomeModifierList.modifierCrimsonSteel,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureCrimsonSteel)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierDeepIron = registerKey("deepironore");
        context.register(BiomeModifierList.modifierDeepIron,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureDeepIron)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierDesichalkos = registerKey("desichalkosore");
        context.register(BiomeModifierList.modifierDesichalkos,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureDesichalkos)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierEximite = registerKey("eximiteore");
        context.register(BiomeModifierList.modifierEximite,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureEximite)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierGallium = registerKey("galliumore");
        context.register(BiomeModifierList.modifierGallium,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureGallium)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierGarnet = registerKey("garnetore");
        context.register(BiomeModifierList.modifierGarnet,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureGarnet)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierGarnet = registerKey("endgarnetore");
        context.register(BiomeModifierList.modifierGarnet,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureGarnet)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierHaderoth = registerKey("haderothore");
        context.register(BiomeModifierList.modifierHaderoth,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureHaderoth)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierHepatizon = registerKey("hepatizonore");
        context.register(BiomeModifierList.modifierHepatizon,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureHepatizon)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierIgnatius = registerKey("ignatiusore");
        context.register(BiomeModifierList.modifierIgnatius,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureIgnatius)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierIndium = registerKey("indiumore");
        context.register(BiomeModifierList.modifierIndium,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureIndium)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierInfuscolium = registerKey("infuscoliumore");
        context.register(BiomeModifierList.modifierInfuscolium,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureInfuscolium)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierInolashite = registerKey("inolashiteore");
        context.register(BiomeModifierList.modifierInolashite,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureInolashite)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierIolite = registerKey("ioliteore");
        context.register(BiomeModifierList.modifierIolite,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureIolite)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierIolite = registerKey("endioliteore");
        context.register(BiomeModifierList.modifierIolite,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureIolite)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierIridium = registerKey("iridiumore");
        context.register(BiomeModifierList.modifierIridium,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureIridium)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierJade = registerKey("jadeore");
        context.register(BiomeModifierList.modifierJade,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureJade)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierJade = registerKey("endjadeore");
        context.register(BiomeModifierList.modifierJade,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureJade)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierJasper = registerKey("jasperore");
        context.register(BiomeModifierList.modifierJasper,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureJasper)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierJasper = registerKey("endjasperore");
        context.register(BiomeModifierList.modifierJasper,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureJasper)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierKalendrite = registerKey("kalendriteore");
        context.register(BiomeModifierList.modifierKalendrite,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureKalendrite)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierKyanite = registerKey("kyaniteore");
        context.register(BiomeModifierList.modifierKyanite,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureKyanite)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierKyanite = registerKey("endkyaniteore");
        context.register(BiomeModifierList.modifierKyanite,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureKyanite)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierLead = registerKey("leadore");
        context.register(BiomeModifierList.modifierLead,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureLead)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierLemurite = registerKey("lemuriteore");
        context.register(BiomeModifierList.modifierLemurite,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureLemurite)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierMalachite = registerKey("malachiteore");
        context.register(BiomeModifierList.modifierMalachite,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureMalachite)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierMalachite = registerKey("endmalachiteore");
        context.register(BiomeModifierList.modifierMalachite,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureMalachite)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierManganese = registerKey("manganeseore");
        context.register(BiomeModifierList.modifierManganese,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureManganese)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierMeutoite = registerKey("meutoiteore");
        context.register(BiomeModifierList.modifierMeutoite,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureMeutoite)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierMidasium = registerKey("midasiumore");
        context.register(BiomeModifierList.modifierMidasium,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureMidasium)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierMithril = registerKey("mithrilore");
        context.register(BiomeModifierList.modifierMithril,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureMithril)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierMolybdenum = registerKey("molybdenumore");
        context.register(BiomeModifierList.modifierMolybdenum,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureMolybdenum)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierNeodymium = registerKey("neodymiumore");
        context.register(BiomeModifierList.modifierNeodymium,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureNeodymium)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierNeptunium = registerKey("neptuniumore");
        context.register(BiomeModifierList.modifierNeptunium,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureNeptunium)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierNickel = registerKey("nickelore");
        context.register(BiomeModifierList.modifierNickel,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureNickel)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierNiobium = registerKey("niobiumore");
        context.register(BiomeModifierList.modifierNiobium,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureNiobium)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierOnyx = registerKey("onyxore");
        context.register(BiomeModifierList.modifierOnyx,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureOnyx)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierOnyx = registerKey("endonyxore");
        context.register(BiomeModifierList.modifierOnyx,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureOnyx)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierOpal = registerKey("opalore");
        context.register(BiomeModifierList.modifierOpal,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureOpal)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierOpal = registerKey("endopalore");
        context.register(BiomeModifierList.modifierOpal,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureOpal)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierOrichalcum = registerKey("orichalcumore");
        context.register(BiomeModifierList.modifierOrichalcum,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureOrichalcum)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierOsmium = registerKey("osmiumore");
        context.register(BiomeModifierList.modifierOsmium,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureOsmium)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierOureclase = registerKey("oureclaseore");
        context.register(BiomeModifierList.modifierOureclase,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureOureclase)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierPalladium = registerKey("palladiumore");
        context.register(BiomeModifierList.modifierPalladium,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeaturePalladium)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierPeridot = registerKey("peridotore");
        context.register(BiomeModifierList.modifierPeridot,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeaturePeridot)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierPeridot = registerKey("endperidotore");
        context.register(BiomeModifierList.modifierPeridot,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeaturePeridot)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierPhoenixite = registerKey("phoenixiteore");
        context.register(BiomeModifierList.modifierPhoenixite,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeaturePhoenixite)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierPhoenixite = registerKey("endphoenixiteore");
        context.register(BiomeModifierList.modifierPhoenixite,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeaturePhoenixite)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierPlatinum = registerKey("platinumore");
        context.register(BiomeModifierList.modifierPlatinum,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeaturePlatinum)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierPlutonium = registerKey("plutoniumore");
        context.register(BiomeModifierList.modifierPlutonium,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeaturePlutonium)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierPolonium = registerKey("poloniumore");
        context.register(BiomeModifierList.modifierPolonium,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeaturePolonium)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierPromethium = registerKey("promethiumore");
        context.register(BiomeModifierList.modifierPromethium,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeaturePromethium)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierQuartz = registerKey("quartzore");
        context.register(BiomeModifierList.modifierQuartz,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureQuartz)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierQuartz = registerKey("endquartzore");
        context.register(BiomeModifierList.modifierQuartz,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureQuartz)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierRhenium = registerKey("rheniumore");
        context.register(BiomeModifierList.modifierRhenium,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureRhenium)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierRhodium = registerKey("rhodiumore");
        context.register(BiomeModifierList.modifierRhodium,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureRhodium)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierRubracium = registerKey("rubraciumore");
        context.register(BiomeModifierList.modifierRubracium,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureRubracium)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierRuby = registerKey("rubyore");
        context.register(BiomeModifierList.modifierRuby,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureRuby)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierRuby = registerKey("endrubyore");
        context.register(BiomeModifierList.modifierRuby,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureRuby)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierRuthenium = registerKey("rutheniumore");
        context.register(BiomeModifierList.modifierRuthenium,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureRuthenium)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierSanguinite = registerKey("sanguiniteore");
        context.register(BiomeModifierList.modifierSanguinite,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureSanguinite)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierSapphire = registerKey("sapphireore");
        context.register(BiomeModifierList.modifierSapphire,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureSapphire)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierSapphire = registerKey("endsapphireore");
        context.register(BiomeModifierList.modifierSapphire,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureSapphire)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierShadowIron = registerKey("shadowironore");
        context.register(BiomeModifierList.modifierShadowIron,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureShadowIron)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierSilver = registerKey("silverore");
        context.register(BiomeModifierList.modifierSilver,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureSilver)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierSpinel = registerKey("spinelore");
        context.register(BiomeModifierList.modifierSpinel,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureSpinel)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierSpinel = registerKey("endspinelore");
        context.register(BiomeModifierList.modifierSpinel,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureSpinel)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierSugilite = registerKey("sugiliteore");
        context.register(BiomeModifierList.modifierSugilite,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureSugilite)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierSugilite = registerKey("endsugiliteore");
        context.register(BiomeModifierList.modifierSugilite,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureSugilite)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierTantalum = registerKey("tantalumore");
        context.register(BiomeModifierList.modifierTantalum,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureTantalum)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierTanzanite = registerKey("tanzaniteore");
        context.register(BiomeModifierList.modifierTanzanite,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureTanzanite)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierTanzanite = registerKey("endtanzaniteore");
        context.register(BiomeModifierList.modifierTanzanite,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureTanzanite)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierTartarite = registerKey("tartariteore");
        context.register(BiomeModifierList.modifierTartarite,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureTartarite)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierTechnetium = registerKey("technetiumore");
        context.register(BiomeModifierList.modifierTechnetium,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureTechnetium)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierThallium = registerKey("thalliumore");
        context.register(BiomeModifierList.modifierThallium,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureThallium)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierTin = registerKey("tinore");
        context.register(BiomeModifierList.modifierTin,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureTin)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierTitanium = registerKey("titaniumore");
        context.register(BiomeModifierList.modifierTitanium,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureTitanium)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierTopaz = registerKey("topazore");
        context.register(BiomeModifierList.modifierTopaz,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureTopaz)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierTopaz = registerKey("endtopazore");
        context.register(BiomeModifierList.modifierTopaz,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureTopaz)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierTourmaline = registerKey("tourmalineore");
        context.register(BiomeModifierList.modifierTourmaline,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureTourmaline)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierTourmaline = registerKey("endtourmalineore");
        context.register(BiomeModifierList.modifierTourmaline,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureTourmaline)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierTritium = registerKey("tritiumore");
        context.register(BiomeModifierList.modifierTritium,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureTritium)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierTungsten = registerKey("tungstenore");
        context.register(BiomeModifierList.modifierTungsten,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureTungsten)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierTurquoise = registerKey("turquoiseore");
        context.register(BiomeModifierList.modifierTurquoise,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureTurquoise)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierTurquoise = registerKey("endturquoiseore");
        context.register(BiomeModifierList.modifierTurquoise,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureTurquoise)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierUnobtainium = registerKey("unobtainiumore");
        context.register(BiomeModifierList.modifierUnobtainium,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureUnobtainium)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierUranium = registerKey("uraniumore");
        context.register(BiomeModifierList.modifierUranium,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureUranium)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierVanadium = registerKey("vanadiumore");
        context.register(BiomeModifierList.modifierVanadium,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureVanadium)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierVibranium = registerKey("vibraniumore");
        context.register(BiomeModifierList.modifierVibranium,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureVibranium)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierVulcanite = registerKey("vulcaniteore");
        context.register(BiomeModifierList.modifierVulcanite,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureVulcanite)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierVyroxeres = registerKey("vyroxeresore");
        context.register(BiomeModifierList.modifierVyroxeres,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureVyroxeres)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierYellorite = registerKey("yelloriteore");
        context.register(BiomeModifierList.modifierYellorite,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureYellorite)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierZinc = registerKey("zincore");
        context.register(BiomeModifierList.modifierZinc,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureZinc)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        BiomeModifierList.modifierZirconium = registerKey("zirconiumore");
        context.register(BiomeModifierList.modifierZirconium,new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.placedFeatureZirconium)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
    }
    private static ResourceKey<BiomeModifier> registerKey(String name)
    {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(ModInfo.MOD_ID,name));
    }
}

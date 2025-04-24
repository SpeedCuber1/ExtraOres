package com.tylerh.extraores.World;

import com.tylerh.extraores.Init.BiomeModifierList;
import com.tylerh.extraores.Init.ConfigRegistryList;
import com.tylerh.extraores.Init.PlacedFeatureList;
import com.tylerh.extraores.Util.ModInfo;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class ExOreBiomeModifier
{
    public static void bootstrap(BootstapContext<BiomeModifier> context)
    {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);
        if(ConfigRegistryList.registerAdamantine.get())
        {
            BiomeModifierList.modifierAdamantine = registerKey("adamantineore");
            context.register(BiomeModifierList.modifierAdamantine,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureAdamantinePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerAgate.get())
        {
            BiomeModifierList.modifierAgate = registerKey("agateore");
            context.register(BiomeModifierList.modifierAgate,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureAgatePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
            BiomeModifierList.modifierAgate = registerKey("endagateore");
            context.register(BiomeModifierList.modifierAgate,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_END),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureAgatePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerAldourite.get())
        {
            BiomeModifierList.modifierAldourite = registerKey("aldouriteore");
            context.register(BiomeModifierList.modifierAldourite,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_NETHER),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureAldouritePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerAluminum.get())
        {
            BiomeModifierList.modifierAluminum = registerKey("aluminumore");
            context.register(BiomeModifierList.modifierAluminum,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureAluminumPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerAmericium.get())
        {
            BiomeModifierList.modifierAmericium = registerKey("americiumore");
            context.register(BiomeModifierList.modifierAmericium,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureAmericiumPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerAmethyst.get())
        {
            BiomeModifierList.modifierAmethyst = registerKey("amethystore");
            context.register(BiomeModifierList.modifierAmethyst,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureAmethystPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
            BiomeModifierList.modifierAmethyst = registerKey("endamethystore");
            context.register(BiomeModifierList.modifierAmethyst,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_END),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureAmethystPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerAmetrine.get())
        {
            BiomeModifierList.modifierAmetrine = registerKey("ametrineore");
            context.register(BiomeModifierList.modifierAmetrine,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureAmetrinePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
            BiomeModifierList.modifierAmetrine = registerKey("endametrineore");
            context.register(BiomeModifierList.modifierAmetrine,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_END),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureAmetrinePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerAmordrine.get())
        {
            BiomeModifierList.modifierAmordrine = registerKey("amordrineore");
            context.register(BiomeModifierList.modifierAmordrine,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureAmordrinePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerAngmallen.get())
        {
            BiomeModifierList.modifierAngmallen = registerKey("angmallenore");
            context.register(BiomeModifierList.modifierAngmallen,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureAngmallenPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerAquamarine.get())
        {
            BiomeModifierList.modifierAquamarine = registerKey("aquamarineore");
            context.register(BiomeModifierList.modifierAquamarine,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureAquamarinePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
            BiomeModifierList.modifierAquamarine = registerKey("endaquamarineore");
            context.register(BiomeModifierList.modifierAquamarine,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_END),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureAquamarinePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerAstralSilver.get())
        {
            BiomeModifierList.modifierAstralSilver = registerKey("astralsilverore");
            context.register(BiomeModifierList.modifierAstralSilver,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureAstralSilverPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerAtlarus.get())
        {
            BiomeModifierList.modifierAtlarus = registerKey("atlarusore");
            context.register(BiomeModifierList.modifierAtlarus,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureAtlarusPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerAzureSilver.get())
        {
            BiomeModifierList.modifierAzureSilver = registerKey("azuresilverore");
            context.register(BiomeModifierList.modifierAzureSilver,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureAzureSilverPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerBismuth.get())
        {
            BiomeModifierList.modifierBismuth = registerKey("bismuthore");
            context.register(BiomeModifierList.modifierBismuth,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureBismuthPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerBlackSteel.get())
        {
            BiomeModifierList.modifierBlackSteel = registerKey("blacksteelore");
            context.register(BiomeModifierList.modifierBlackSteel,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureBlackSteelPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerCadmium.get())
        {
            BiomeModifierList.modifierCadmium = registerKey("cadmiumore");
            context.register(BiomeModifierList.modifierCadmium,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureCadmiumPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerCarmot.get())
        {
            BiomeModifierList.modifierCarmot = registerKey("carmotore");
            context.register(BiomeModifierList.modifierCarmot,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureCarmotPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerCelenegil.get())
        {
            BiomeModifierList.modifierCelenegil = registerKey("celenegilore");
            context.register(BiomeModifierList.modifierCelenegil,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureCelenegilPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerCeruclase.get())
        {
            BiomeModifierList.modifierCeruclase = registerKey("ceruclaseore");
            context.register(BiomeModifierList.modifierCeruclase,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_NETHER),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureCeruclasePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerChromium.get())
        {
            BiomeModifierList.modifierChromium = registerKey("chromiumore");
            context.register(BiomeModifierList.modifierChromium,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureChromiumPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerChrysocolla.get())
        {
            BiomeModifierList.modifierChrysocolla = registerKey("chrysocollaore");
            context.register(BiomeModifierList.modifierChrysocolla,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureChrysocollaPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
            BiomeModifierList.modifierChrysocolla = registerKey("endchrysocollaore");
            context.register(BiomeModifierList.modifierChrysocolla,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_END),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureChrysocollaPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerCitrine.get())
        {
            BiomeModifierList.modifierCitrine = registerKey("citrineore");
            context.register(BiomeModifierList.modifierCitrine,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureCitrinePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
            BiomeModifierList.modifierCitrine = registerKey("endcitrineore");
            context.register(BiomeModifierList.modifierCitrine,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_END),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureCitrinePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerCobalt.get())
        {
            BiomeModifierList.modifierCobalt = registerKey("cobaltore");
            context.register(BiomeModifierList.modifierCobalt,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureCobaltPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerCopper.get())
        {
            BiomeModifierList.modifierCopper = registerKey("copperore");
            context.register(BiomeModifierList.modifierCopper,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureCopperPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerCrimsonSteel.get())
        {
            BiomeModifierList.modifierCrimsonSteel = registerKey("crimsonsteelore");
            context.register(BiomeModifierList.modifierCrimsonSteel,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureCrimsonSteelPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerDeepIron.get())
        {
            BiomeModifierList.modifierDeepIron = registerKey("deepironore");
            context.register(BiomeModifierList.modifierDeepIron,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureDeepIronPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerDesichalkos.get())
        {
            BiomeModifierList.modifierDesichalkos = registerKey("desichalkosore");
            context.register(BiomeModifierList.modifierDesichalkos,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureDesichalkosPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerEximite.get())
        {
            BiomeModifierList.modifierEximite = registerKey("eximiteore");
            context.register(BiomeModifierList.modifierEximite,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureEximitePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerGallium.get())
        {
            BiomeModifierList.modifierGallium = registerKey("galliumore");
            context.register(BiomeModifierList.modifierGallium,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureGalliumPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerGarnet.get())
        {
            BiomeModifierList.modifierGarnet = registerKey("garnetore");
            context.register(BiomeModifierList.modifierGarnet,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureGarnetPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
            BiomeModifierList.modifierGarnet = registerKey("endgarnetore");
            context.register(BiomeModifierList.modifierGarnet,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_END),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureGarnetPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerHaderoth.get())
        {
            BiomeModifierList.modifierHaderoth = registerKey("haderothore");
            context.register(BiomeModifierList.modifierHaderoth,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureHaderothPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerHepatizon.get())
        {
            BiomeModifierList.modifierHepatizon = registerKey("hepatizonore");
            context.register(BiomeModifierList.modifierHepatizon,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureHepatizonPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerIgnatius.get())
        {
            BiomeModifierList.modifierIgnatius = registerKey("ignatiusore");
            context.register(BiomeModifierList.modifierIgnatius,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_NETHER),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureIgnatiusPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerIndium.get())
        {
            BiomeModifierList.modifierIndium = registerKey("indiumore");
            context.register(BiomeModifierList.modifierIndium,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureIndiumPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerInfuscolium.get())
        {
            BiomeModifierList.modifierInfuscolium = registerKey("infuscoliumore");
            context.register(BiomeModifierList.modifierInfuscolium,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureInfuscoliumPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerInolashite.get())
        {
            BiomeModifierList.modifierInolashite = registerKey("inolashiteore");
            context.register(BiomeModifierList.modifierInolashite,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureInolashitePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerIolite.get())
        {
            BiomeModifierList.modifierIolite = registerKey("ioliteore");
            context.register(BiomeModifierList.modifierIolite,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureIolitePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
            BiomeModifierList.modifierIolite = registerKey("endioliteore");
            context.register(BiomeModifierList.modifierIolite,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_END),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureIolitePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerIridium.get())
        {
            BiomeModifierList.modifierIridium = registerKey("iridiumore");
            context.register(BiomeModifierList.modifierIridium,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureIridiumPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerJade.get())
        {
            BiomeModifierList.modifierJade = registerKey("jadeore");
            context.register(BiomeModifierList.modifierJade,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureJadePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
            BiomeModifierList.modifierJade = registerKey("endjadeore");
            context.register(BiomeModifierList.modifierJade,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_END),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureJadePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerJasper.get())
        {
            BiomeModifierList.modifierJasper = registerKey("jasperore");
            context.register(BiomeModifierList.modifierJasper,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureJasperPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
            BiomeModifierList.modifierJasper = registerKey("endjasperore");
            context.register(BiomeModifierList.modifierJasper,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_END),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureJasperPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerKalendrite.get())
        {
            BiomeModifierList.modifierKalendrite = registerKey("kalendriteore");
            context.register(BiomeModifierList.modifierKalendrite,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_NETHER),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureKalendritePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerKyanite.get())
        {
            BiomeModifierList.modifierKyanite = registerKey("kyaniteore");
            context.register(BiomeModifierList.modifierKyanite,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureKyanitePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
            BiomeModifierList.modifierKyanite = registerKey("endkyaniteore");
            context.register(BiomeModifierList.modifierKyanite,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_END),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureKyanitePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerLead.get())
        {
            BiomeModifierList.modifierLead = registerKey("leadore");
            context.register(BiomeModifierList.modifierLead,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureLeadPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerLemurite.get())
        {
            BiomeModifierList.modifierLemurite = registerKey("lemuriteore");
            context.register(BiomeModifierList.modifierLemurite,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_NETHER),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureLemuritePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerMalachite.get())
        {
            BiomeModifierList.modifierMalachite = registerKey("malachiteore");
            context.register(BiomeModifierList.modifierMalachite,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureMalachitePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
            BiomeModifierList.modifierMalachite = registerKey("endmalachiteore");
            context.register(BiomeModifierList.modifierMalachite,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_END),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureMalachitePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerManganese.get())
        {
            BiomeModifierList.modifierManganese = registerKey("manganeseore");
            context.register(BiomeModifierList.modifierManganese,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureManganesePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerMeutoite.get())
        {
            BiomeModifierList.modifierMeutoite = registerKey("meutoiteore");
            context.register(BiomeModifierList.modifierMeutoite,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureMeutoitePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerMidasium.get())
        {
            BiomeModifierList.modifierMidasium = registerKey("midasiumore");
            context.register(BiomeModifierList.modifierMidasium,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_NETHER),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureMidasiumPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerMithril.get())
        {
            BiomeModifierList.modifierMithril = registerKey("mithrilore");
            context.register(BiomeModifierList.modifierMithril,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureMithrilPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerMolybdenum.get())
        {
            BiomeModifierList.modifierMolybdenum = registerKey("molybdenumore");
            context.register(BiomeModifierList.modifierMolybdenum,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureMolybdenumPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerNeodymium.get())
        {
            BiomeModifierList.modifierNeodymium = registerKey("neodymiumore");
            context.register(BiomeModifierList.modifierNeodymium,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureNeodymiumPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerNeptunium.get())
        {
            BiomeModifierList.modifierNeptunium = registerKey("neptuniumore");
            context.register(BiomeModifierList.modifierNeptunium,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureNeptuniumPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerNickel.get())
        {
            BiomeModifierList.modifierNickel = registerKey("nickelore");
            context.register(BiomeModifierList.modifierNickel,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureNickelPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerNiobium.get())
        {
            BiomeModifierList.modifierNiobium = registerKey("niobiumore");
            context.register(BiomeModifierList.modifierNiobium,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureNiobiumPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerOnyx.get())
        {
            BiomeModifierList.modifierOnyx = registerKey("onyxore");
            context.register(BiomeModifierList.modifierOnyx,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureOnyxPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
            BiomeModifierList.modifierOnyx = registerKey("endonyxore");
            context.register(BiomeModifierList.modifierOnyx,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_END),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureOnyxPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerOpal.get())
        {
            BiomeModifierList.modifierOpal = registerKey("opalore");
            context.register(BiomeModifierList.modifierOpal,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureOpalPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
            BiomeModifierList.modifierOpal = registerKey("endopalore");
            context.register(BiomeModifierList.modifierOpal,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_END),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureOpalPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerOrichalcum.get())
        {
            BiomeModifierList.modifierOrichalcum = registerKey("orichalcumore");
            context.register(BiomeModifierList.modifierOrichalcum,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureOrichalcumPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerOsmium.get())
        {
            BiomeModifierList.modifierOsmium = registerKey("osmiumore");
            context.register(BiomeModifierList.modifierOsmium,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureOsmiumPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerOureclase.get())
        {
            BiomeModifierList.modifierOureclase = registerKey("oureclaseore");
            context.register(BiomeModifierList.modifierOureclase,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureOureclasePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerPalladium.get())
        {
            BiomeModifierList.modifierPalladium = registerKey("palladiumore");
            context.register(BiomeModifierList.modifierPalladium,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featurePalladiumPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerPeridot.get())
        {
            BiomeModifierList.modifierPeridot = registerKey("peridotore");
            context.register(BiomeModifierList.modifierPeridot,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featurePeridotPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
            BiomeModifierList.modifierPeridot = registerKey("endperidotore");
            context.register(BiomeModifierList.modifierPeridot,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_END),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featurePeridotPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerPhoenixite.get())
        {
            BiomeModifierList.modifierPhoenixite = registerKey("phoenixiteore");
            context.register(BiomeModifierList.modifierPhoenixite,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featurePhoenixitePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
            BiomeModifierList.modifierPhoenixite = registerKey("endphoenixiteore");
            context.register(BiomeModifierList.modifierPhoenixite,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_END),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featurePhoenixitePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerPlatinum.get())
        {
            BiomeModifierList.modifierPlatinum = registerKey("platinumore");
            context.register(BiomeModifierList.modifierPlatinum,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featurePlatinumPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerPlutonium.get())
        {
            BiomeModifierList.modifierPlutonium = registerKey("plutoniumore");
            context.register(BiomeModifierList.modifierPlutonium,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featurePlutoniumPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerPolonium.get())
        {
            BiomeModifierList.modifierPolonium = registerKey("poloniumore");
            context.register(BiomeModifierList.modifierPolonium,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featurePoloniumPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerPromethium.get())
        {
            BiomeModifierList.modifierPromethium = registerKey("promethiumore");
            context.register(BiomeModifierList.modifierPromethium,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featurePromethiumPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerQuartz.get())
        {
            BiomeModifierList.modifierQuartz = registerKey("quartzore");
            context.register(BiomeModifierList.modifierQuartz,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureQuartzPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
            BiomeModifierList.modifierQuartz = registerKey("endquartzore");
            context.register(BiomeModifierList.modifierQuartz,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_END),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureQuartzPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerRhenium.get())
        {
            BiomeModifierList.modifierRhenium = registerKey("rheniumore");
            context.register(BiomeModifierList.modifierRhenium,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureRheniumPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerRhodium.get())
        {
            BiomeModifierList.modifierRhodium = registerKey("rhodiumore");
            context.register(BiomeModifierList.modifierRhodium,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureRhodiumPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerRubracium.get())
        {
            BiomeModifierList.modifierRubracium = registerKey("rubraciumore");
            context.register(BiomeModifierList.modifierRubracium,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureRubraciumPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerRuby.get())
        {
            BiomeModifierList.modifierRuby = registerKey("rubyore");
            context.register(BiomeModifierList.modifierRuby,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureRubyPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
            BiomeModifierList.modifierRuby = registerKey("endrubyore");
            context.register(BiomeModifierList.modifierRuby,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_END),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureRubyPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerRuthenium.get())
        {
            BiomeModifierList.modifierRuthenium = registerKey("rutheniumore");
            context.register(BiomeModifierList.modifierRuthenium,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureRutheniumPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerSanguinite.get())
        {
            BiomeModifierList.modifierSanguinite = registerKey("sanguiniteore");
            context.register(BiomeModifierList.modifierSanguinite,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_NETHER),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureSanguinitePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerSapphire.get())
        {
            BiomeModifierList.modifierSapphire = registerKey("sapphireore");
            context.register(BiomeModifierList.modifierSapphire,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureSapphirePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
            BiomeModifierList.modifierSapphire = registerKey("endsapphireore");
            context.register(BiomeModifierList.modifierSapphire,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_END),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureSapphirePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerShadowIron.get())
        {
            BiomeModifierList.modifierShadowIron = registerKey("shadowironore");
            context.register(BiomeModifierList.modifierShadowIron,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_NETHER),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureShadowIronPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerSilver.get())
        {
            BiomeModifierList.modifierSilver = registerKey("silverore");
            context.register(BiomeModifierList.modifierSilver,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureSilverPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerSpinel.get())
        {
            BiomeModifierList.modifierSpinel = registerKey("spinelore");
            context.register(BiomeModifierList.modifierSpinel,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureSpinelPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
            BiomeModifierList.modifierSpinel = registerKey("endspinelore");
            context.register(BiomeModifierList.modifierSpinel,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_END),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureSpinelPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerSugilite.get())
        {
            BiomeModifierList.modifierSugilite = registerKey("sugiliteore");
            context.register(BiomeModifierList.modifierSugilite,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureSugilitePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
            BiomeModifierList.modifierSugilite = registerKey("endsugiliteore");
            context.register(BiomeModifierList.modifierSugilite,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_END),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureSugilitePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerTantalum.get())
        {
            BiomeModifierList.modifierTantalum = registerKey("tantalumore");
            context.register(BiomeModifierList.modifierTantalum,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureTantalumPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerTanzanite.get())
        {
            BiomeModifierList.modifierTanzanite = registerKey("tanzaniteore");
            context.register(BiomeModifierList.modifierTanzanite,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureTanzanitePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
            BiomeModifierList.modifierTanzanite = registerKey("endtanzaniteore");
            context.register(BiomeModifierList.modifierTanzanite,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_END),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureTanzanitePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerTartarite.get())
        {
            BiomeModifierList.modifierTartarite = registerKey("tartariteore");
            context.register(BiomeModifierList.modifierTartarite,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureTartaritePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerTechnetium.get())
        {
            BiomeModifierList.modifierTechnetium = registerKey("technetiumore");
            context.register(BiomeModifierList.modifierTechnetium,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureTechnetiumPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerThallium.get())
        {
            BiomeModifierList.modifierThallium = registerKey("thalliumore");
            context.register(BiomeModifierList.modifierThallium,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureThalliumPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerTin.get())
        {
            BiomeModifierList.modifierTin = registerKey("tinore");
            context.register(BiomeModifierList.modifierTin,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureTinPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerTitanium.get())
        {
            BiomeModifierList.modifierTitanium = registerKey("titaniumore");
            context.register(BiomeModifierList.modifierTitanium,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureTitaniumPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerTopaz.get())
        {
            BiomeModifierList.modifierTopaz = registerKey("topazore");
            context.register(BiomeModifierList.modifierTopaz,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureTopazPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
            BiomeModifierList.modifierTopaz = registerKey("endtopazore");
            context.register(BiomeModifierList.modifierTopaz,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_END),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureTopazPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerTourmaline.get())
        {
            BiomeModifierList.modifierTourmaline = registerKey("tourmalineore");
            context.register(BiomeModifierList.modifierTourmaline,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureTourmalinePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
            BiomeModifierList.modifierTourmaline = registerKey("endtourmalineore");
            context.register(BiomeModifierList.modifierTourmaline,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_END),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureTourmalinePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerTritium.get())
        {
            BiomeModifierList.modifierTritium = registerKey("tritiumore");
            context.register(BiomeModifierList.modifierTritium,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureTritiumPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerTungsten.get())
        {
            BiomeModifierList.modifierTungsten = registerKey("tungstenore");
            context.register(BiomeModifierList.modifierTungsten,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureTungstenPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerTurquoise.get())
        {
            BiomeModifierList.modifierTurquoise = registerKey("turquoiseore");
            context.register(BiomeModifierList.modifierTurquoise,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureTurquoisePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
            BiomeModifierList.modifierTurquoise = registerKey("endturquoiseore");
            context.register(BiomeModifierList.modifierTurquoise,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_END),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureTurquoisePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerUnobtainium.get())
        {
            BiomeModifierList.modifierUnobtainium = registerKey("unobtainiumore");
            context.register(BiomeModifierList.modifierUnobtainium,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureUnobtainiumPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerUranium.get())
        {
            BiomeModifierList.modifierUranium = registerKey("uraniumore");
            context.register(BiomeModifierList.modifierUranium,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureUraniumPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerVanadium.get())
        {
            BiomeModifierList.modifierVanadium = registerKey("vanadiumore");
            context.register(BiomeModifierList.modifierVanadium,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureVanadiumPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerVibranium.get())
        {
            BiomeModifierList.modifierVibranium = registerKey("vibraniumore");
            context.register(BiomeModifierList.modifierVibranium,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureVibraniumPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerVulcanite.get())
        {
            BiomeModifierList.modifierVulcanite = registerKey("vulcaniteore");
            context.register(BiomeModifierList.modifierVulcanite,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_NETHER),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureVulcanitePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerVyroxeres.get())
        {
            BiomeModifierList.modifierVyroxeres = registerKey("vyroxeresore");
            context.register(BiomeModifierList.modifierVyroxeres,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_NETHER),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureVyroxeresPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerYellorite.get())
        {
            BiomeModifierList.modifierYellorite = registerKey("yelloriteore");
            context.register(BiomeModifierList.modifierYellorite,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureYelloritePlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerZinc.get())
        {
            BiomeModifierList.modifierZinc = registerKey("zincore");
            context.register(BiomeModifierList.modifierZinc,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureZincPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
        if(ConfigRegistryList.registerZirconium.get())
        {
            BiomeModifierList.modifierZirconium = registerKey("zirconiumore");
            context.register(BiomeModifierList.modifierZirconium,new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatureList.featureZirconiumPlaced)),
                    GenerationStep.Decoration.UNDERGROUND_ORES
            ));
        }
    }
    private static ResourceKey<BiomeModifier> registerKey(String name)
    {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(ModInfo.MOD_ID,name));
    }
}

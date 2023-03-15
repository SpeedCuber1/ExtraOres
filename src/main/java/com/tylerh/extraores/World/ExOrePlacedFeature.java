package com.tylerh.extraores.World;

import com.tylerh.extraores.Init.ConfigRegistryList;
import com.tylerh.extraores.Init.ConfiguredFeatureList;
import com.tylerh.extraores.Init.PlacedFeatureList;
import com.tylerh.extraores.Util.ModInfo;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ExOrePlacedFeature
{
    public static void bootstrap(BootstapContext<PlacedFeature> context)
    {
        int rate = ExOreWorldGenConfig.spawnRate.get();
        int height;
        HolderGetter<ConfiguredFeature<?,?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);
        if(ConfigRegistryList.registerAdamantine.get())
        {
            PlacedFeatureList.featureAdamantinePlaced = createKey("adamantineore");
            height = ModInfo.HEIGHT_RARE;
            register(context,PlacedFeatureList.featureAdamantinePlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureAdamantine),rate,height);
        }
        if(ConfigRegistryList.registerAgate.get())
        {
            PlacedFeatureList.featureAgatePlaced = createKey("agateore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureAgatePlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureAgate),rate,height);
        }
        if(ConfigRegistryList.registerAldourite.get())
        {
            PlacedFeatureList.featureAldouritePlaced = createKey("aldouriteore");
            height = ModInfo.HEIGHT_NETHER;
            register(context,PlacedFeatureList.featureAldouritePlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureAldourite),rate,height);
        }
        if(ConfigRegistryList.registerAluminum.get())
        {
            PlacedFeatureList.featureAluminumPlaced = createKey("aluminumore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureAluminumPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureAluminum),rate,height);
        }
        if(ConfigRegistryList.registerAmericium.get())
        {
            PlacedFeatureList.featureAmericiumPlaced = createKey("americiumore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureAmericiumPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureAmericium),rate,height);
        }
        if(ConfigRegistryList.registerAmethyst.get())
        {
            PlacedFeatureList.featureAmethystPlaced = createKey("amethystore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureAmethystPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureAmethyst),rate,height);
        }
        if(ConfigRegistryList.registerAmetrine.get())
        {
            PlacedFeatureList.featureAmetrinePlaced = createKey("ametrineore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureAmetrinePlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureAmetrine),rate,height);
        }
        if(ConfigRegistryList.registerAmordrine.get())
        {
            PlacedFeatureList.featureAmordrinePlaced = createKey("amordrineore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureAmordrinePlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureAmordrine),rate,height);
        }
        if(ConfigRegistryList.registerAngmallen.get())
        {
            PlacedFeatureList.featureAngmallenPlaced = createKey("angmallenore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureAngmallenPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureAngmallen),rate,height);
        }
        if(ConfigRegistryList.registerAquamarine.get())
        {
            PlacedFeatureList.featureAquamarinePlaced = createKey("aquamarineore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureAquamarinePlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureAquamarine),rate,height);
        }
        if(ConfigRegistryList.registerAstralSilver.get())
        {
            PlacedFeatureList.featureAstralSilverPlaced = createKey("astralsilverore");
            height = ModInfo.HEIGHT_RARE;
            register(context,PlacedFeatureList.featureAstralSilverPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureAstralSilver),rate,height);
        }
        if(ConfigRegistryList.registerAtlarus.get())
        {
            PlacedFeatureList.featureAtlarusPlaced = createKey("atlarusore");
            height = ModInfo.HEIGHT_RARE;
            register(context,PlacedFeatureList.featureAtlarusPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureAtlarus),rate,height);
        }
        if(ConfigRegistryList.registerAzureSilver.get())
        {
            PlacedFeatureList.featureAzureSilverPlaced = createKey("azuresilverore");
            height = ModInfo.HEIGHT_RARE;
            register(context,PlacedFeatureList.featureAzureSilverPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureAzureSilver),rate,height);
        }
        if(ConfigRegistryList.registerBismuth.get())
        {
            PlacedFeatureList.featureBismuthPlaced = createKey("bismuthore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureBismuthPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureBismuth),rate,height);
        }
        if(ConfigRegistryList.registerBlackSteel.get())
        {
            PlacedFeatureList.featureBlackSteelPlaced = createKey("blacksteelore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureBlackSteelPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureBlackSteel),rate,height);
        }
        if(ConfigRegistryList.registerCadmium.get())
        {
            PlacedFeatureList.featureCadmiumPlaced = createKey("cadmiumore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureCadmiumPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureCadmium),rate,height);
        }
        if(ConfigRegistryList.registerCarmot.get())
        {
            PlacedFeatureList.featureCarmotPlaced = createKey("carmotore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureCarmotPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureCarmot),rate,height);
        }
        if(ConfigRegistryList.registerCelenegil.get())
        {
            PlacedFeatureList.featureCelenegilPlaced = createKey("celenegilore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureCelenegilPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureCelenegil),rate,height);
        }
        if(ConfigRegistryList.registerCeruclase.get())
        {
            PlacedFeatureList.featureCeruclasePlaced = createKey("ceruclaseore");
            height = ModInfo.HEIGHT_NETHER;
            register(context,PlacedFeatureList.featureCeruclasePlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureCeruclase),rate,height);
        }
        if(ConfigRegistryList.registerChromium.get())
        {
            PlacedFeatureList.featureChromiumPlaced = createKey("chromiumore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureChromiumPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureChromium),rate,height);
        }
        if(ConfigRegistryList.registerChrysocolla.get())
        {
            PlacedFeatureList.featureChrysocollaPlaced = createKey("chrysocollaore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureChrysocollaPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureChrysocolla),rate,height);
        }
        if(ConfigRegistryList.registerCitrine.get())
        {
            PlacedFeatureList.featureCitrinePlaced = createKey("citrineore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureCitrinePlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureCitrine),rate,height);
        }
        if(ConfigRegistryList.registerCobalt.get())
        {
            PlacedFeatureList.featureCobaltPlaced = createKey("cobaltore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureCobaltPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureCobalt),rate,height);
        }
        if(ConfigRegistryList.registerCopper.get())
        {
            PlacedFeatureList.featureCopperPlaced = createKey("copperore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureCopperPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureCopper),rate,height);
        }
        if(ConfigRegistryList.registerCrimsonSteel.get())
        {
            PlacedFeatureList.featureCrimsonSteelPlaced = createKey("crimsonsteelore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureCrimsonSteelPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureCrimsonSteel),rate,height);
        }
        if(ConfigRegistryList.registerDeepIron.get())
        {
            PlacedFeatureList.featureDeepIronPlaced = createKey("deepironore");
            height = ModInfo.HEIGHT_RARE;
            register(context,PlacedFeatureList.featureDeepIronPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureDeepIron),rate,height);
        }
        if(ConfigRegistryList.registerDesichalkos.get())
        {
            PlacedFeatureList.featureDesichalkosPlaced = createKey("desichalkosore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureDesichalkosPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureDesichalkos),rate,height);
        }
        if(ConfigRegistryList.registerEximite.get())
        {
            PlacedFeatureList.featureEximitePlaced = createKey("eximiteore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureEximitePlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureEximite),rate,height);
        }
        if(ConfigRegistryList.registerGallium.get())
        {
            PlacedFeatureList.featureGalliumPlaced = createKey("galliumore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureGalliumPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureGallium),rate,height);
        }
        if(ConfigRegistryList.registerGarnet.get())
        {
            PlacedFeatureList.featureGarnetPlaced = createKey("garnetore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureGarnetPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureGarnet),rate,height);
        }
        if(ConfigRegistryList.registerHaderoth.get())
        {
            PlacedFeatureList.featureHaderothPlaced = createKey("haderothore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureHaderothPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureHaderoth),rate,height);
        }
        if(ConfigRegistryList.registerHepatizon.get())
        {
            PlacedFeatureList.featureHepatizonPlaced = createKey("hepatizonore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureHepatizonPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureHepatizon),rate,height);
        }
        if(ConfigRegistryList.registerIgnatius.get())
        {
            PlacedFeatureList.featureIgnatiusPlaced = createKey("ignatiusore");
            height = ModInfo.HEIGHT_NETHER;
            register(context,PlacedFeatureList.featureIgnatiusPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureIgnatius),rate,height);
        }
        if(ConfigRegistryList.registerIndium.get())
        {
            PlacedFeatureList.featureIndiumPlaced = createKey("indiumore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureIndiumPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureIndium),rate,height);
        }
        if(ConfigRegistryList.registerInfuscolium.get())
        {
            PlacedFeatureList.featureInfuscoliumPlaced = createKey("infuscoliumore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureInfuscoliumPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureInfuscolium),rate,height);
        }
        if(ConfigRegistryList.registerInolashite.get())
        {
            PlacedFeatureList.featureInolashitePlaced = createKey("inolashiteore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureInolashitePlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureInolashite),rate,height);
        }
        if(ConfigRegistryList.registerIolite.get())
        {
            PlacedFeatureList.featureIolitePlaced = createKey("ioliteore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureIolitePlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureIolite),rate,height);
        }
        if(ConfigRegistryList.registerIridium.get())
        {
            PlacedFeatureList.featureIridiumPlaced = createKey("iridiumore");
            height = ModInfo.HEIGHT_RARE;
            register(context,PlacedFeatureList.featureIridiumPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureIridium),rate,height);
        }
        if(ConfigRegistryList.registerJade.get())
        {
            PlacedFeatureList.featureJadePlaced = createKey("jadeore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureJadePlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureJade),rate,height);
        }
        if(ConfigRegistryList.registerJasper.get())
        {
            PlacedFeatureList.featureJasperPlaced = createKey("jasperore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureJasperPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureJasper),rate,height);
        }
        if(ConfigRegistryList.registerKalendrite.get())
        {
            PlacedFeatureList.featureKalendritePlaced = createKey("kalendriteore");
            height = ModInfo.HEIGHT_NETHER;
            register(context,PlacedFeatureList.featureKalendritePlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureKalendrite),rate,height);
        }
        if(ConfigRegistryList.registerKyanite.get())
        {
            PlacedFeatureList.featureKyanitePlaced = createKey("kyaniteore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureKyanitePlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureKyanite),rate,height);
        }
        if(ConfigRegistryList.registerLead.get())
        {
            PlacedFeatureList.featureLeadPlaced = createKey("leadore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureLeadPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureLead),rate,height);
        }
        if(ConfigRegistryList.registerLemurite.get())
        {
            PlacedFeatureList.featureLemuritePlaced = createKey("lemuriteore");
            height = ModInfo.HEIGHT_NETHER;
            register(context,PlacedFeatureList.featureLemuritePlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureLemurite),rate,height);
        }
        if(ConfigRegistryList.registerMalachite.get())
        {
            PlacedFeatureList.featureMalachitePlaced = createKey("malachiteore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureMalachitePlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureMalachite),rate,height);
        }
        if(ConfigRegistryList.registerManganese.get())
        {
            PlacedFeatureList.featureManganesePlaced = createKey("manganeseore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureManganesePlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureManganese),rate,height);
        }
        if(ConfigRegistryList.registerMeutoite.get())
        {
            PlacedFeatureList.featureMeutoitePlaced = createKey("meutoiteore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureMeutoitePlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureMeutoite),rate,height);
        }
        if(ConfigRegistryList.registerMidasium.get())
        {
            PlacedFeatureList.featureMidasiumPlaced = createKey("midasiumore");
            height = ModInfo.HEIGHT_NETHER;
            register(context,PlacedFeatureList.featureMidasiumPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureMidasium),rate,height);
        }
        if(ConfigRegistryList.registerMithril.get())
        {
            PlacedFeatureList.featureMithrilPlaced = createKey("mithrilore");
            height = ModInfo.HEIGHT_RARE;
            register(context,PlacedFeatureList.featureMithrilPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureMithril),rate,height);
        }
        if(ConfigRegistryList.registerMolybdenum.get())
        {
            PlacedFeatureList.featureMolybdenumPlaced = createKey("molybdenumore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureMolybdenumPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureMolybdenum),rate,height);
        }
        if(ConfigRegistryList.registerNeodymium.get())
        {
            PlacedFeatureList.featureNeodymiumPlaced = createKey("neodymiumore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureNeodymiumPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureNeodymium),rate,height);
        }
        if(ConfigRegistryList.registerNeptunium.get())
        {
            PlacedFeatureList.featureNeptuniumPlaced = createKey("neptuniumore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureNeptuniumPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureNeptunium),rate,height);
        }
        if(ConfigRegistryList.registerNickel.get())
        {
            PlacedFeatureList.featureNickelPlaced = createKey("nickelore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureNickelPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureNickel),rate,height);
        }
        if(ConfigRegistryList.registerNiobium.get())
        {
            PlacedFeatureList.featureNiobiumPlaced = createKey("niobiumore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureNiobiumPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureNiobium),rate,height);
        }
        if(ConfigRegistryList.registerOnyx.get())
        {
            PlacedFeatureList.featureOnyxPlaced = createKey("onyxore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureOnyxPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureOnyx),rate,height);
        }
        if(ConfigRegistryList.registerOpal.get())
        {
            PlacedFeatureList.featureOpalPlaced = createKey("opalore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureOpalPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureOpal),rate,height);
        }
        if(ConfigRegistryList.registerOrichalcum.get())
        {
            PlacedFeatureList.featureOrichalcumPlaced = createKey("orichalcumore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureOrichalcumPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureOrichalcum),rate,height);
        }
        if(ConfigRegistryList.registerOsmium.get())
        {
            PlacedFeatureList.featureOsmiumPlaced = createKey("osmiumore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureOsmiumPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureOsmium),rate,height);
        }
        if(ConfigRegistryList.registerOureclase.get())
        {
            PlacedFeatureList.featureOureclasePlaced = createKey("oureclaseore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureOureclasePlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureOureclase),rate,height);
        }
        if(ConfigRegistryList.registerPalladium.get())
        {
            PlacedFeatureList.featurePalladiumPlaced = createKey("palladiumore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featurePalladiumPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featurePalladium),rate,height);
        }
        if(ConfigRegistryList.registerPeridot.get())
        {
            PlacedFeatureList.featurePeridotPlaced = createKey("peridotore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featurePeridotPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featurePeridot),rate,height);
        }
        if(ConfigRegistryList.registerPhoenixite.get())
        {
            PlacedFeatureList.featurePhoenixitePlaced = createKey("phoenixiteore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featurePhoenixitePlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featurePhoenixite),rate,height);
        }
        if(ConfigRegistryList.registerPlatinum.get())
        {
            PlacedFeatureList.featurePlatinumPlaced = createKey("platinumore");
            height = ModInfo.HEIGHT_RARE;
            register(context,PlacedFeatureList.featurePlatinumPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featurePlatinum),rate,height);
        }
        if(ConfigRegistryList.registerPlutonium.get())
        {
            PlacedFeatureList.featurePlutoniumPlaced = createKey("plutoniumore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featurePlutoniumPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featurePlutonium),rate,height);
        }
        if(ConfigRegistryList.registerPolonium.get())
        {
            PlacedFeatureList.featurePoloniumPlaced = createKey("poloniumore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featurePoloniumPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featurePolonium),rate,height);
        }
        if(ConfigRegistryList.registerPromethium.get())
        {
            PlacedFeatureList.featurePromethiumPlaced = createKey("promethiumore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featurePromethiumPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featurePromethium),rate,height);
        }
        if(ConfigRegistryList.registerQuartz.get())
        {
            PlacedFeatureList.featureQuartzPlaced = createKey("quartzore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureQuartzPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureQuartz),rate,height);
        }
        if(ConfigRegistryList.registerRhenium.get())
        {
            PlacedFeatureList.featureRheniumPlaced = createKey("rheniumore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureRheniumPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureRhenium),rate,height);
        }
        if(ConfigRegistryList.registerRhodium.get())
        {
            PlacedFeatureList.featureRhodiumPlaced = createKey("rhodiumore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureRhodiumPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureRhodium),rate,height);
        }
        if(ConfigRegistryList.registerRubracium.get())
        {
            PlacedFeatureList.featureRubraciumPlaced = createKey("rubraciumore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureRubraciumPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureRubracium),rate,height);
        }
        if(ConfigRegistryList.registerRuby.get())
        {
            PlacedFeatureList.featureRubyPlaced = createKey("rubyore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureRubyPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureRuby),rate,height);
        }
        if(ConfigRegistryList.registerRuthenium.get())
        {
            PlacedFeatureList.featureRutheniumPlaced = createKey("rutheniumore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureRutheniumPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureRuthenium),rate,height);
        }
        if(ConfigRegistryList.registerSanguinite.get())
        {
            PlacedFeatureList.featureSanguinitePlaced = createKey("sanguiniteore");
            height = ModInfo.HEIGHT_NETHER;
            register(context,PlacedFeatureList.featureSanguinitePlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureSanguinite),rate,height);
        }
        if(ConfigRegistryList.registerSapphire.get())
        {
            PlacedFeatureList.featureSapphirePlaced = createKey("sapphireore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureSapphirePlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureSapphire),rate,height);
        }
        if(ConfigRegistryList.registerShadowIron.get())
        {
            PlacedFeatureList.featureShadowIronPlaced = createKey("shadowironore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureShadowIronPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureShadowIron),rate,height);
        }
        if(ConfigRegistryList.registerSilver.get())
        {
            PlacedFeatureList.featureSilverPlaced = createKey("silverore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureSilverPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureSilver),rate,height);
        }
        if(ConfigRegistryList.registerSpinel.get())
        {
            PlacedFeatureList.featureSpinelPlaced = createKey("spinelore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureSpinelPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureSpinel),rate,height);
        }
        if(ConfigRegistryList.registerSugilite.get())
        {
            PlacedFeatureList.featureSugilitePlaced = createKey("sugiliteore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureSugilitePlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureSugilite),rate,height);
        }
        if(ConfigRegistryList.registerTantalum.get())
        {
            PlacedFeatureList.featureTantalumPlaced = createKey("tantalumore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureTantalumPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureTantalum),rate,height);
        }
        if(ConfigRegistryList.registerTanzanite.get())
        {
            PlacedFeatureList.featureTanzanitePlaced = createKey("tanzaniteore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureTanzanitePlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureTanzanite),rate,height);
        }
        if(ConfigRegistryList.registerTartarite.get())
        {
            PlacedFeatureList.featureTartaritePlaced = createKey("tartariteore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureTartaritePlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureTartarite),rate,height);
        }
        if(ConfigRegistryList.registerTechnetium.get())
        {
            PlacedFeatureList.featureTechnetiumPlaced = createKey("technetiumore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureTechnetiumPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureTechnetium),rate,height);
        }
        if(ConfigRegistryList.registerThallium.get())
        {
            PlacedFeatureList.featureThalliumPlaced = createKey("thalliumore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureThalliumPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureThallium),rate,height);
        }
        if(ConfigRegistryList.registerTin.get())
        {
            PlacedFeatureList.featureTinPlaced = createKey("tinore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureTinPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureTin),rate,height);
        }
        if(ConfigRegistryList.registerTitanium.get())
        {
            PlacedFeatureList.featureTitaniumPlaced = createKey("titaniumore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureTitaniumPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureTitanium),rate,height);
        }
        if(ConfigRegistryList.registerTopaz.get())
        {
            PlacedFeatureList.featureTopazPlaced = createKey("topazore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureTopazPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureTopaz),rate,height);
        }
        if(ConfigRegistryList.registerTourmaline.get())
        {
            PlacedFeatureList.featureTourmalinePlaced = createKey("tourmalineore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureTourmalinePlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureTourmaline),rate,height);
        }
        if(ConfigRegistryList.registerTritium.get())
        {
            PlacedFeatureList.featureTritiumPlaced = createKey("tritiumore");
            height = ModInfo.HEIGHT_RARE;
            register(context,PlacedFeatureList.featureTritiumPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureTritium),rate,height);
        }
        if(ConfigRegistryList.registerTungsten.get())
        {
            PlacedFeatureList.featureTungstenPlaced = createKey("tungstenore");
            height = ModInfo.HEIGHT_RARE;
            register(context,PlacedFeatureList.featureTungstenPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureTungsten),rate,height);
        }
        if(ConfigRegistryList.registerTurquoise.get())
        {
            PlacedFeatureList.featureTurquoisePlaced = createKey("turquoiseore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureTurquoisePlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureTurquoise),rate,height);
        }
        if(ConfigRegistryList.registerUnobtainium.get())
        {
            PlacedFeatureList.featureUnobtainiumPlaced = createKey("unobtainiumore");
            height = ModInfo.HEIGHT_RARE;
            register(context,PlacedFeatureList.featureUnobtainiumPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureUnobtainium),rate,height);
        }
        if(ConfigRegistryList.registerUranium.get())
        {
            PlacedFeatureList.featureUraniumPlaced = createKey("uraniumore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureUraniumPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureUranium),rate,height);
        }
        if(ConfigRegistryList.registerVanadium.get())
        {
            PlacedFeatureList.featureVanadiumPlaced = createKey("vanadiumore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureVanadiumPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureVanadium),rate,height);
        }
        if(ConfigRegistryList.registerVibranium.get())
        {
            PlacedFeatureList.featureVibraniumPlaced = createKey("vibraniumore");
            height = ModInfo.HEIGHT_RARE;
            register(context,PlacedFeatureList.featureVibraniumPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureVibranium),rate,height);
        }
        if(ConfigRegistryList.registerVulcanite.get())
        {
            PlacedFeatureList.featureVulcanitePlaced = createKey("vulcaniteore");
            height = ModInfo.HEIGHT_NETHER;
            register(context,PlacedFeatureList.featureVulcanitePlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureVulcanite),rate,height);
        }
        if(ConfigRegistryList.registerVyroxeres.get())
        {
            PlacedFeatureList.featureVyroxeresPlaced = createKey("vyroxeresore");
            height = ModInfo.HEIGHT_NETHER;
            register(context,PlacedFeatureList.featureVyroxeresPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureVyroxeres),rate,height);
        }
        if(ConfigRegistryList.registerYellorite.get())
        {
            PlacedFeatureList.featureYelloritePlaced = createKey("yelloriteore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureYelloritePlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureYellorite),rate,height);
        }
        if(ConfigRegistryList.registerZinc.get())
        {
            PlacedFeatureList.featureZincPlaced = createKey("zincore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureZincPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureZinc),rate,height);
        }
        if(ConfigRegistryList.registerZirconium.get())
        {
            PlacedFeatureList.featureZirconiumPlaced = createKey("zirconiumore");
            height = ModInfo.HEIGHT_NORMAL;
            register(context,PlacedFeatureList.featureZirconiumPlaced,configuredFeatures.getOrThrow(ConfiguredFeatureList.featureZirconium),rate,height);
        }
    }
    private static ResourceKey<PlacedFeature> createKey(String name)
    {
        return ResourceKey.create(Registries.PLACED_FEATURE,new ResourceLocation(ModInfo.MOD_ID,name));
    }
    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?,?>> configuration,int rate,int height)
    {
        context.register(key,new PlacedFeature(configuration,List.of(CountPlacement.of(rate), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.BOTTOM,VerticalAnchor.aboveBottom(height)), BiomeFilter.biome())));
    }
}

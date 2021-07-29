package com.tylerh.extraores.World;

import com.tylerh.extraores.Init.BlockList;
import com.tylerh.extraores.Init.ConfigRegistryList;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RangeDecoratorConfiguration;
import net.minecraft.world.level.levelgen.heightproviders.UniformHeight;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExOreWorldGen
{
    private static Logger LOGGER = LogManager.getLogger();
    @SubscribeEvent
    public void onBiomesLoading(BiomeLoadingEvent event)
    {
        Biome.BiomeCategory category = event.getCategory();
        BiomeGenerationSettingsBuilder builder = event.getGeneration();
        OreConfiguration config;
        int height;
        int rate = ExOreWorldGenConfig.spawnRate.get();
        int size = ExOreWorldGenConfig.veinSize.get();
        switch (category)
        {
            case NETHER:
                if (ConfigRegistryList.registerAldourite.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NETHER_ORE_REPLACEABLES,BlockList.blockOreAldourite.defaultBlockState(),size);
                    height = 64;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerCeruclase.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NETHER_ORE_REPLACEABLES,BlockList.blockOreCeruclase.defaultBlockState(), size);
                    height = 64;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                    .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                    .squared()
                    .count(rate));
                }
                if(ConfigRegistryList.registerIgnatius.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NETHER_ORE_REPLACEABLES,BlockList.blockOreIgnatius.defaultBlockState(), size);
                    height = 64;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                    .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                    .squared()
                    .count(rate));
                }
                if(ConfigRegistryList.registerKalendrite.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NETHER_ORE_REPLACEABLES,BlockList.blockOreKalendrite.defaultBlockState(), size);
                    height = 64;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                    .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                    .squared()
                    .count(rate));
                }
                if(ConfigRegistryList.registerLemurite.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NETHER_ORE_REPLACEABLES,BlockList.blockOreLemurite.defaultBlockState(), size);
                    height = 64;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                    .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                    .squared()
                    .count(rate));
                }
                if(ConfigRegistryList.registerMidasium.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NETHER_ORE_REPLACEABLES,BlockList.blockOreMidasium.defaultBlockState(), size);
                    height = 64;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                    .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                    .squared()
                    .count(rate));
                }
                if(ConfigRegistryList.registerSanguinite.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NETHER_ORE_REPLACEABLES,BlockList.blockOreSanguinite.defaultBlockState(), size);
                    height = 64;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                    .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                    .squared()
                    .count(rate));
                }
                if(ConfigRegistryList.registerShadowIron.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NETHER_ORE_REPLACEABLES,BlockList.blockOreShadowIron.defaultBlockState(), size);
                    height = 64;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                    .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                    .squared()
                    .count(rate));
                }
                if(ConfigRegistryList.registerVulcanite.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NETHER_ORE_REPLACEABLES,BlockList.blockOreVulcanite.defaultBlockState(), size);
                    height = 64;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                    .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                    .squared()
                    .count(rate));
                }
                if(ConfigRegistryList.registerVyroxeres.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NETHER_ORE_REPLACEABLES,BlockList.blockOreVyroxeres.defaultBlockState(), size);
                    height = 64;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                    .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                    .squared()
                    .count(rate));
                }
                break;
            case THEEND:
                break;
            default:
                if(ConfigRegistryList.registerAdamantine.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreAdamantine.defaultBlockState(),size);
                    height = 32;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                    .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                    .squared()
                    .count(rate));
                }
                if(ConfigRegistryList.registerAgate.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreAgate.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                    .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                    .squared()
                    .count(rate));
                }
                if(ConfigRegistryList.registerAluminum.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreAluminum.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerAmericium.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreAmericium.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerAmethyst.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreAmethyst.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerAmetrine.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreAmetrine.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerAmordrine.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreAmordrine.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerAngmallen.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreAngmallen.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerAquamarine.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreAquamarine.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerAstralSilver.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreAstralSilver.defaultBlockState(),size);
                    height = 32;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerAtlarus.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreAtlarus.defaultBlockState(),size);
                    height = 32;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerBismuth.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreBismuth.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerBlackSteel.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreBlackSteel.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerCadmium.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreCadmium.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerCarmot.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreCarmot.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerCelenegil.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreCelenegil.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerChromium.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreChromium.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerChrysocolla.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreChrysocolla.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerCitrine.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreCitrine.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerCobalt.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreCobalt.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerCopper.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreCopper.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerDeepIron.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreDeepIron.defaultBlockState(),size);
                    height = 32;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerDesichalkos.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreDesichalkos.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerEximite.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreEximite.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerGallium.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreGallium.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerGarnet.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreGarnet.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerHaderoth.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreHaderoth.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerHepatizon.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreHepatizon.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerIndium.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreIndium.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerInfuscolium.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreInfuscolium.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerInolashite.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreInolashite.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerIolite.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreIolite.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerIridium.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreIridium.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerJade.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreJade.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerJasper.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreJasper.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerKyanite.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreKyanite.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerLead.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreLead.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerMalachite.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreMalachite.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerManganese.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreManganese.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerMeutoite.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreMeutoite.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerMithril.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreMithril.defaultBlockState(),size);
                    height = 32;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerMolybdenum.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreMolybdenum.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerNeodymium.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreNeodymium.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerNeptunium.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreNeptunium.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerNickel.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreNickel.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerNiobium.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreNiobium.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerOnyx.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreOnyx.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerOpal.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreOpal.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerOrichalcum.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreOrichalcum.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerOsmium.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreOsmium.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerOureclase.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreOureclase.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerPalladium.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOrePalladium.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerPeridot.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOrePeridot.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerPhoenixite.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOrePhoenixite.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerPlatinum.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOrePlatinum.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerPlutonium.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOrePlutonium.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerPolonium.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOrePolonium.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerPromethium.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOrePromethium.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerQuartz.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreQuartz.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerRhenium.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreRhenium.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerRhodium.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreRhodium.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerRubracium.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreRubracium.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerRuby.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreRuby.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerRuthenium.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreRuthenium.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerSilver.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreSilver.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerSpinel.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreSpinel.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerSugilite.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreSugilite.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerTantalum.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreTantalum.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerTanzanite.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreTanzanite.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerTartarite.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreTartarite.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerTechnetium.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreTechnetium.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerThallium.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreThallium.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerTin.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreTin.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerTitanium.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreTitanium.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerTopaz.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreTopaz.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerTourmaline.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreTourmaline.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerTungsten.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreTungsten.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerTurquoise.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreTurquoise.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerUnobtainium.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreUnobtainium.defaultBlockState(),size);
                    height = 32;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerUranium.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreUranium.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerVanadium.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreVanadium.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerYellorite.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreYellorite.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerZinc.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreZinc.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                if(ConfigRegistryList.registerZirconium.get())
                {
                    config = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,BlockList.blockOreZirconium.defaultBlockState(),size);
                    height = 100;
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,Feature.ORE.configured(config)
                            .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.bottom(),VerticalAnchor.absolute(height))))
                            .squared()
                            .count(rate));
                }
                break;
        }
    }
}

package com.tylerh.extraores.Data.Tags;

import com.tylerh.extraores.Init.BlockList;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.TagsProvider;
import net.minecraft.tags.TagCollection;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

import java.nio.file.Path;

public class ExOreBlockTag extends TagsProvider<Block>
{
    public ExOreBlockTag(DataGenerator generator)
    {
        super(generator, Registry.BLOCK);
    }

    @Override
    protected void registerTags()
    {
        this.getBuilder(BlockTagList.ORES).add(
                BlockList.blockOreAdamantine,
                BlockList.blockOreAldourite,
                BlockList.blockOreAluminum,
                BlockList.blockOreAmordrine,
                BlockList.blockOreAngmallen,
                BlockList.blockOreAstralSilver,
                BlockList.blockOreAtlarus,
                BlockList.blockOreBismuth,
                BlockList.blockOreBlackSteel,
                BlockList.blockOreCadmium,
                BlockList.blockOreCarmot,
                BlockList.blockOreCelenegil,
                BlockList.blockOreCeruclase,
                BlockList.blockOreChromium,
                BlockList.blockOreCobalt,
                BlockList.blockOreCopper,
                BlockList.blockOreDeepIron,
                BlockList.blockOreDesichalkos,
                BlockList.blockOreEximite,
                BlockList.blockOreGallium,
                BlockList.blockOreHaderoth,
                BlockList.blockOreHepatizon,
                BlockList.blockOreIgnatius,
                BlockList.blockOreIndium,
                BlockList.blockOreInfuscolium,
                BlockList.blockOreInolashite,
                BlockList.blockOreKalendrite,
                BlockList.blockOreLead,
                BlockList.blockOreLemurite,
                BlockList.blockOreManganese,
                BlockList.blockOreMeutoite,
                BlockList.blockOreMidasium,
                BlockList.blockOreMithril,
                BlockList.blockOreMolybdenum,
                BlockList.blockOreNeodymium,
                BlockList.blockOreNickel,
                BlockList.blockOreNiobium,
                BlockList.blockOreOrichalcum,
                BlockList.blockOreOureclase,
                BlockList.blockOrePalladium,
                BlockList.blockOrePlatinum,
                BlockList.blockOrePrometheum,
                BlockList.blockOreRhodium,
                BlockList.blockOreRuthenium,
                BlockList.blockOreRubracium,
                BlockList.blockOreSanguinite,
                BlockList.blockOreShadowIron,
                BlockList.blockOreSilver,
                BlockList.blockOreTechnetium,
                BlockList.blockOreThallium,
                BlockList.blockOreTin,
                BlockList.blockOreTitanium,
                BlockList.blockOreTungsten,
                BlockList.blockOreUnobtainium,
                BlockList.blockOreVanadium,
                BlockList.blockOreVulcanite,
                BlockList.blockOreVyroxeres,
                BlockList.blockOreZinc,
                BlockList.blockOreZirconium
        );
        this.getBuilder(BlockTagList.BLOCKS).add(
                BlockList.blockAdamantine,
                BlockList.blockAldourite,
                BlockList.blockAluminum,
                BlockList.blockAmordrine,
                BlockList.blockAngmallen,
                BlockList.blockAstralSilver,
                BlockList.blockAtlarus,
                BlockList.blockBismuth,
                BlockList.blockBlackSteel,
                BlockList.blockCadmium,
                BlockList.blockCarmot,
                BlockList.blockCelenegil,
                BlockList.blockCeruclase,
                BlockList.blockChromium,
                BlockList.blockCobalt,
                BlockList.blockCopper,
                BlockList.blockDeepIron,
                BlockList.blockDesichalkos,
                BlockList.blockEximite,
                BlockList.blockGallium,
                BlockList.blockHaderoth,
                BlockList.blockHepatizon,
                BlockList.blockIgnatius,
                BlockList.blockIndium,
                BlockList.blockInfuscolium,
                BlockList.blockInolashite,
                BlockList.blockKalendrite,
                BlockList.blockLead,
                BlockList.blockLemurite,
                BlockList.blockManganese,
                BlockList.blockMeutoite,
                BlockList.blockMidasium,
                BlockList.blockMithril,
                BlockList.blockMolybdenum,
                BlockList.blockNeodymium,
                BlockList.blockNickel,
                BlockList.blockNiobium,
                BlockList.blockOrichalcum,
                BlockList.blockOureclase,
                BlockList.blockPalladium,
                BlockList.blockPlatinum,
                BlockList.blockPrometheum,
                BlockList.blockRhodium,
                BlockList.blockRubracium,
                BlockList.blockRuthenium,
                BlockList.blockSanguinite,
                BlockList.blockShadowIron,
                BlockList.blockSilver,
                BlockList.blockTechnetium,
                BlockList.blockThallium,
                BlockList.blockTin,
                BlockList.blockTitanium,
                BlockList.blockTungsten,
                BlockList.blockUnobtainium,
                BlockList.blockVanadium,
                BlockList.blockVulcanite,
                BlockList.blockVyroxeres,
                BlockList.blockZinc,
                BlockList.blockZirconium);
    }

    @Override
    protected void setCollection(TagCollection<Block> colectionIn)
    {
        BlockTagList.setCollection(colectionIn);
    }

    @Override
    protected Path makePath(ResourceLocation id)
    {
        return this.generator.getOutputFolder().resolve("data/" + id.getNamespace() + "/tags/blocks/" + id.getPath() + ".json");
    }

    @Override
    public String getName()
    {
        return "Extra Ores Block Tags";
    }
}

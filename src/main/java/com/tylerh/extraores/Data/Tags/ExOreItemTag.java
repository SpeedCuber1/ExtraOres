package com.tylerh.extraores.Data.Tags;

import com.tylerh.extraores.Init.ItemList;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.TagsProvider;
import net.minecraft.item.Item;
import net.minecraft.tags.TagCollection;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.nio.file.Path;

public class ExOreItemTag extends TagsProvider<Item>
{
    private static final Logger LOGGER = LogManager.getLogger();
    public ExOreItemTag(DataGenerator generator)
    {
        super(generator, Registry.ITEM);
    }

    @Override
    protected void registerTags()
    {
        this.getBuilder(ItemTagList.INGOTS).add(
        ItemList.itemIngotAdamantine,
        ItemList.itemIngotAldourite,
        ItemList.itemIngotAluminum,
        ItemList.itemIngotAmordrine,
        ItemList.itemIngotAngmallen,
        ItemList.itemIngotAstralSilver,
        ItemList.itemIngotAtlarus,
        ItemList.itemIngotBismuth,
        ItemList.itemIngotBlackSteel,
        ItemList.itemIngotCadmium,
        ItemList.itemIngotCarmot,
        ItemList.itemIngotCelenegil,
        ItemList.itemIngotCeruclase,
        ItemList.itemIngotChromium,
        ItemList.itemIngotCobalt,
        ItemList.itemIngotCopper,
        ItemList.itemIngotDeepIron,
        ItemList.itemIngotDesichalkos,
        ItemList.itemIngotEximite,
        ItemList.itemIngotGallium,
        ItemList.itemIngotHaderoth,
        ItemList.itemIngotHepatizon,
        ItemList.itemIngotIgnatius,
        ItemList.itemIngotIndium,
        ItemList.itemIngotInfuscolium,
        ItemList.itemIngotInolashite,
        ItemList.itemIngotKalendrite,
        ItemList.itemIngotLead,
        ItemList.itemIngotLemurite,
        ItemList.itemIngotManganese,
        ItemList.itemIngotMeutoite,
        ItemList.itemIngotMidasium,
        ItemList.itemIngotMithril,
        ItemList.itemIngotMolybdenum,
        ItemList.itemIngotNeodymium,
        ItemList.itemIngotNickel,
        ItemList.itemIngotNiobium,
        ItemList.itemIngotOrichalcum,
        ItemList.itemIngotOureclase,
        ItemList.itemIngotPalladium,
        ItemList.itemIngotPlatinum,
        ItemList.itemIngotPrometheum,
        ItemList.itemIngotRhodium,
        ItemList.itemIngotRuthenium,
        ItemList.itemIngotRubracium,
        ItemList.itemIngotSanguinite,
        ItemList.itemIngotShadowIron,
        ItemList.itemIngotSilver,
        ItemList.itemIngotTechnetium,
        ItemList.itemIngotThallium,
        ItemList.itemIngotTin,
        ItemList.itemIngotTitanium,
        ItemList.itemIngotTungsten,
        ItemList.itemIngotUnobtainium,
        ItemList.itemIngotVanadium,
        ItemList.itemIngotVulcanite,
        ItemList.itemIngotVyroxeres,
        ItemList.itemIngotZinc,
        ItemList.itemIngotZirconium
        );
    }

    @Override
    protected void setCollection(TagCollection<Item> colectionIn)
    {
        ItemTagList.setCollection(colectionIn);
    }

    @Override
    protected Path makePath(ResourceLocation id)
    {
        return this.generator.getOutputFolder().resolve("data/" + id.getNamespace() + "/tags/items/" + id.getPath() + ".json");
    }

    @Override
    public String getName()
    {
        return "Extra Ores Item Tags";
    }
}

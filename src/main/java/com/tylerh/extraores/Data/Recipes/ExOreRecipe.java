package com.tylerh.extraores.Data.Recipes;

import com.tylerh.extraores.Data.Tags.ItemTagList;
import com.tylerh.extraores.Init.BlockList;
import com.tylerh.extraores.Init.ItemList;
/*import mekanism.api.MekanismAPI;
import mekanism.api.chemical.gas.GasStack;
import mekanism.api.datagen.recipe.builder.ItemStackChemicalToItemStackRecipeBuilder;
import mekanism.api.datagen.recipe.builder.ItemStackToItemStackRecipeBuilder;
import mekanism.api.recipes.ingredients.creator.IngredientCreatorAccess;*/
import net.minecraft.data.*;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ExOreRecipe extends RecipeProvider implements IConditionBuilder
{
    public ExOreRecipe(PackOutput output)
    {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer)
    {
        buildShapedRecipes(consumer);
        buildShapelessRecipes(consumer);
        buildSmeltingRecipes(consumer);
        buildBlastingRecipes(consumer);
        /*buildMekanismInjecting(consumer);
        buildMekanismPurifying(consumer);
        buildMekanismCrushing(consumer);
        buildMekanismEnriching(consumer);*/
    }

    protected void buildShapedRecipes(Consumer<FinishedRecipe> consumer)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockAdamantine.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotAdamantine.get())
                .unlockedBy("adamantineblock", has(BlockList.blockAdamantine.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockAgate.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemAgate.get())
                .unlockedBy("agateblock", has(BlockList.blockAgate.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockAldourite.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotAldourite.get())
                .unlockedBy("aldouriteblock", has(BlockList.blockAldourite.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockAluminum.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotAluminum.get())
                .unlockedBy("aluminumblock", has(BlockList.blockAluminum.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockAmericium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotAmericium.get())
                .unlockedBy("americiumblock", has(BlockList.blockAmericium.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockAmethyst.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemAmethyst.get())
                .unlockedBy("amethystblock", has(BlockList.blockAmethyst.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockAmetrine.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemAmetrine.get())
                .unlockedBy("ametrineblock", has(BlockList.blockAmetrine.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockAmordrine.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotAmordrine.get())
                .unlockedBy("amordrineblock", has(BlockList.blockAmordrine.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockAngmallen.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotAngmallen.get())
                .unlockedBy("angmallenblock", has(BlockList.blockAngmallen.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockAquamarine.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemAquamarine.get())
                .unlockedBy("aquamarineblock", has(BlockList.blockAquamarine.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockAstralSilver.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotAstralSilver.get())
                .unlockedBy("astralsilverblock", has(BlockList.blockAstralSilver.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockAtlarus.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotAtlarus.get())
                .unlockedBy("atlarusblock", has(BlockList.blockAtlarus.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockBismuth.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotBismuth.get())
                .unlockedBy("bismuthblock", has(BlockList.blockBismuth.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockBlackSteel.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotBlackSteel.get())
                .unlockedBy("blacksteelblock", has(BlockList.blockBlackSteel.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockCadmium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotCadmium.get())
                .unlockedBy("cadmiumblock", has(BlockList.blockCadmium.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockCarmot.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotCarmot.get())
                .unlockedBy("carmotblock", has(BlockList.blockCarmot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockCelenegil.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotCelenegil.get())
                .unlockedBy("celenegilblock", has(BlockList.blockCelenegil.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockCeruclase.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotCeruclase.get())
                .unlockedBy("ceruclaseblock", has(BlockList.blockCeruclase.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockChromium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotChromium.get())
                .unlockedBy("chromiumblock", has(BlockList.blockChromium.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockChrysocolla.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemChrysocolla.get())
                .unlockedBy("chrysocollablock", has(BlockList.blockChrysocolla.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockCitrine.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemCitrine.get())
                .unlockedBy("citrineblock", has(BlockList.blockCitrine.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockCobalt.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotCobalt.get())
                .unlockedBy("cobaltblock", has(BlockList.blockCobalt.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockCopper.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotCopper.get())
                .unlockedBy("copperblock", has(BlockList.blockCopper.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockCrimsonSteel.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotCrimsonSteel.get())
                .unlockedBy("crimsonsteelblock", has(BlockList.blockCrimsonSteel.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockDeepIron.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotDeepIron.get())
                .unlockedBy("deepironblock", has(BlockList.blockDeepIron.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockDesichalkos.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotDesichalkos.get())
                .unlockedBy("desichalkosblock", has(BlockList.blockDesichalkos.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockEximite.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotEximite.get())
                .unlockedBy("eximiteblock", has(BlockList.blockEximite.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockGallium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotGallium.get())
                .unlockedBy("galliumblock", has(BlockList.blockGallium.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockGarnet.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemGarnet.get())
                .unlockedBy("garnetblock", has(BlockList.blockGarnet.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockHaderoth.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotHaderoth.get())
                .unlockedBy("haderothblock", has(BlockList.blockHaderoth.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockHepatizon.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotHepatizon.get())
                .unlockedBy("hepatizonblock", has(BlockList.blockHepatizon.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockIgnatius.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotIgnatius.get())
                .unlockedBy("ignatiusblock", has(BlockList.blockIgnatius.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockIndium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotIndium.get())
                .unlockedBy("indiumblock", has(BlockList.blockIndium.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockInfuscolium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotInfuscolium.get())
                .unlockedBy("infuscoliumblock", has(BlockList.blockInfuscolium.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockInolashite.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotInolashite.get())
                .unlockedBy("inolashiteblock", has(BlockList.blockInolashite.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockIolite.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemIolite.get())
                .unlockedBy("ioliteblock", has(BlockList.blockIolite.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockIridium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotIridium.get())
                .unlockedBy("iridiumblock", has(BlockList.blockIridium.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockJade.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemJade.get())
                .unlockedBy("jadeblock", has(BlockList.blockJade.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockJasper.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemJasper.get())
                .unlockedBy("jasperblock", has(BlockList.blockJasper.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockKalendrite.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotKalendrite.get())
                .unlockedBy("kalendriteblock", has(BlockList.blockKalendrite.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockKyanite.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemKyanite.get())
                .unlockedBy("kyaniteblock", has(BlockList.blockKyanite.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockLead.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotLead.get())
                .unlockedBy("leadblock", has(BlockList.blockLead.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockLemurite.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotLemurite.get())
                .unlockedBy("lemuriteblock", has(BlockList.blockLemurite.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockMalachite.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemMalachite.get())
                .unlockedBy("malachiteblock", has(BlockList.blockMalachite.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockManganese.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotManganese.get())
                .unlockedBy("manganeseblock", has(BlockList.blockManganese.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockMeutoite.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotMeutoite.get())
                .unlockedBy("meutoiteblock", has(BlockList.blockMeutoite.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockMidasium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotMidasium.get())
                .unlockedBy("midasiumblock", has(BlockList.blockMidasium.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockMithril.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotMithril.get())
                .unlockedBy("mithrilblock", has(BlockList.blockMithril.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockMolybdenum.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotMolybdenum.get())
                .unlockedBy("molybdenumblock", has(BlockList.blockMolybdenum.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockNeodymium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotNeodymium.get())
                .unlockedBy("neodymiumblock", has(BlockList.blockNeodymium.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockNeptunium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotNeptunium.get())
                .unlockedBy("neptuniumblock", has(BlockList.blockNeptunium.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockNickel.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotNickel.get())
                .unlockedBy("nickelblock", has(BlockList.blockNickel.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockNiobium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotNiobium.get())
                .unlockedBy("niobiumblock", has(BlockList.blockNiobium.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockOnyx.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemOnyx.get())
                .unlockedBy("onyxblock", has(BlockList.blockOnyx.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockOpal.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemOpal.get())
                .unlockedBy("opalblock", has(BlockList.blockOpal.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockOrichalcum.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotOrichalcum.get())
                .unlockedBy("orichalcumblock", has(BlockList.blockOrichalcum.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockOsmium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotOsmium.get())
                .unlockedBy("osmiumblock", has(BlockList.blockOsmium.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockOureclase.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotOureclase.get())
                .unlockedBy("oureclaseblock", has(BlockList.blockOureclase.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockPalladium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotPalladium.get())
                .unlockedBy("palladiumblock", has(BlockList.blockPalladium.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockPeridot.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemPeridot.get())
                .unlockedBy("peridotblock", has(BlockList.blockPeridot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockPhoenixite.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemPhoenixite.get())
                .unlockedBy("phoenixiteblock", has(BlockList.blockPhoenixite.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockPlatinum.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotPlatinum.get())
                .unlockedBy("platinumblock", has(BlockList.blockPlatinum.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockPlutonium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotPlutonium.get())
                .unlockedBy("plutoniumblock", has(BlockList.blockPlutonium.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockPolonium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotPolonium.get())
                .unlockedBy("poloniumblock", has(BlockList.blockPolonium.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockPromethium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotPromethium.get())
                .unlockedBy("promethiumblock", has(BlockList.blockPromethium.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockQuartz.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemQuartz.get())
                .unlockedBy("quartzblock", has(BlockList.blockQuartz.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockRhenium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotRhenium.get())
                .unlockedBy("rheniumblock", has(BlockList.blockRhenium.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockRhodium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotRhodium.get())
                .unlockedBy("rhodiumblock", has(BlockList.blockRhodium.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockRubracium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotRubracium.get())
                .unlockedBy("rubraciumblock", has(BlockList.blockRubracium.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockRuby.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemRuby.get())
                .unlockedBy("rubyblock", has(BlockList.blockRuby.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockRuthenium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotRuthenium.get())
                .unlockedBy("rutheniumblock", has(BlockList.blockRuthenium.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockSanguinite.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotSanguinite.get())
                .unlockedBy("sanguiniteblock", has(BlockList.blockSanguinite.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockSapphire.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemSapphire.get())
                .unlockedBy("sapphireblock", has(BlockList.blockSapphire.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockShadowIron.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotShadowIron.get())
                .unlockedBy("shadowironblock", has(BlockList.blockShadowIron.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockSilver.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotSilver.get())
                .unlockedBy("silverblock", has(BlockList.blockSilver.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockSpinel.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemSpinel.get())
                .unlockedBy("spinelblock", has(BlockList.blockSpinel.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockSugilite.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemSugilite.get())
                .unlockedBy("sugiliteore", has(BlockList.blockSugilite.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockTantalum.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotTantalum.get())
                .unlockedBy("tantalumblock", has(BlockList.blockTantalum.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockTanzanite.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemTanzanite.get())
                .unlockedBy("tanzaniteblock", has(BlockList.blockTanzanite.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockTartarite.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotTartarite.get())
                .unlockedBy("tartariteblock", has(BlockList.blockTartarite.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockTechnetium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotTechnetium.get())
                .unlockedBy("technetiumblock", has(BlockList.blockTechnetium.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockThallium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotThallium.get())
                .unlockedBy("thalliumblock", has(BlockList.blockThallium.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockTin.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotTin.get())
                .unlockedBy("tinblock", has(BlockList.blockTin.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockTitanium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotTitanium.get())
                .unlockedBy("titaniumblock", has(BlockList.blockTitanium.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockTopaz.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemTopaz.get())
                .unlockedBy("topazblock", has(BlockList.blockTopaz.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockTourmaline.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemTourmaline.get())
                .unlockedBy("tourmalineblock", has(BlockList.blockTourmaline.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockTritium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotTritium.get())
                .unlockedBy("tritiumblock", has(BlockList.blockTritium.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockTungsten.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotTungsten.get())
                .unlockedBy("tungstenblock", has(BlockList.blockTungsten.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockTurquoise.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemTurquoise.get())
                .unlockedBy("turquoiseblock", has(BlockList.blockTurquoise.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockUnobtainium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotUnobtainium.get())
                .unlockedBy("unobtainiumblock", has(BlockList.blockUnobtainium.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockUranium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotUranium.get())
                .unlockedBy("uraniumblock", has(BlockList.blockUranium.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockVanadium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotVanadium.get())
                .unlockedBy("vanadiumblock", has(BlockList.blockVanadium.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockVibranium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotVibranium.get())
                .unlockedBy("vibraniumblock", has(BlockList.blockVibranium.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockVulcanite.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotVulcanite.get())
                .unlockedBy("vulcaniteblock", has(BlockList.blockVulcanite.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockVyroxeres.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotVyroxeres.get())
                .unlockedBy("vyroxeresblock", has(BlockList.blockVyroxeres.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockYellorite.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotYellorite.get())
                .unlockedBy("yelloriteblock", has(BlockList.blockYellorite.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockZinc.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotZinc.get())
                .unlockedBy("zincblock", has(BlockList.blockZinc.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockZirconium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotZirconium.get())
                .unlockedBy("zirconiumblock", has(BlockList.blockZirconium.get()))
                .save(consumer);
    }

    protected void buildShapelessRecipes(Consumer<FinishedRecipe> consumer)
    {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotAdamantine.get(), 9)
                .requires(Ingredient.of(BlockList.blockAdamantine.get().asItem()))
                .unlockedBy("adamantineingot", has(ItemList.itemIngotAdamantine.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemGemAgate.get(), 9)
                .requires(Ingredient.of(BlockList.blockAgate.get().asItem()))
                .unlockedBy("agate", has(ItemList.itemGemAgate.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotAldourite.get(), 9)
                .requires(Ingredient.of(BlockList.blockAldourite.get().asItem()))
                .unlockedBy("aldouriteingot", has(ItemList.itemIngotAldourite.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotAluminum.get(), 9)
                .requires(Ingredient.of(BlockList.blockAluminum.get().asItem()))
                .unlockedBy("aluminumingot", has(ItemList.itemIngotAluminum.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotAmericium.get(), 9)
                .requires(Ingredient.of(BlockList.blockAmericium.get().asItem()))
                .unlockedBy("americiumingot", has(ItemList.itemIngotAmericium.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemGemAmethyst.get(), 9)
                .requires(Ingredient.of(BlockList.blockAmethyst.get().asItem()))
                .unlockedBy("amethyst", has(ItemList.itemGemAmethyst.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemGemAmetrine.get(), 9)
                .requires(Ingredient.of(BlockList.blockAmetrine.get()))
                .unlockedBy("ametrine", has(ItemList.itemGemAmetrine.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotAmordrine.get(), 9)
                .requires(Ingredient.of(BlockList.blockAmordrine.get().asItem()))
                .unlockedBy("amordrineingot", has(ItemList.itemIngotAmordrine.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotAngmallen.get(), 9)
                .requires(Ingredient.of(BlockList.blockAngmallen.get().asItem()))
                .unlockedBy("angmalleningot", has(ItemList.itemIngotAngmallen.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemGemAquamarine.get(), 9)
                .requires(Ingredient.of(BlockList.blockAquamarine.get().asItem()))
                .unlockedBy("aquamarine", has(ItemList.itemGemAquamarine.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotAstralSilver.get(), 9)
                .requires(Ingredient.of(BlockList.blockAstralSilver.get().asItem()))
                .unlockedBy("astralsilveringot", has(ItemList.itemIngotAstralSilver.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotAtlarus.get(), 9)
                .requires(Ingredient.of(BlockList.blockAtlarus.get().asItem()))
                .unlockedBy("atlarusingot", has(ItemList.itemIngotAtlarus.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotBismuth.get(), 9)
                .requires(Ingredient.of(BlockList.blockBismuth.get().asItem()))
                .unlockedBy("bismuthingot", has(ItemList.itemIngotBismuth.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotBlackSteel.get(), 9)
                .requires(Ingredient.of(BlockList.blockBlackSteel.get().asItem()))
                .unlockedBy("blacksteelingot", has(ItemList.itemIngotBlackSteel.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotCadmium.get(), 9)
                .requires(Ingredient.of(BlockList.blockCadmium.get().asItem()))
                .unlockedBy("cadmiumingot", has(ItemList.itemIngotCadmium.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotCarmot.get(), 9)
                .requires(Ingredient.of(BlockList.blockCarmot.get().asItem()))
                .unlockedBy("carmotingot", has(ItemList.itemIngotCarmot.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotCelenegil.get(), 9)
                .requires(Ingredient.of(BlockList.blockCelenegil.get().asItem()))
                .unlockedBy("celenegilingot", has(ItemList.itemIngotCelenegil.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotCeruclase.get(), 9)
                .requires(Ingredient.of(BlockList.blockCeruclase.get().asItem()))
                .unlockedBy("ceruclaseingot", has(ItemList.itemIngotCeruclase.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotChromium.get(), 9)
                .requires(Ingredient.of(BlockList.blockChromium.get().asItem()))
                .unlockedBy("chromiumingot", has(ItemList.itemIngotChromium.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemGemChrysocolla.get(), 9)
                .requires(Ingredient.of(BlockList.blockChrysocolla.get().asItem()))
                .unlockedBy("chrysocolla", has(ItemList.itemGemChrysocolla.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemGemCitrine.get(), 9)
                .requires(Ingredient.of(BlockList.blockCitrine.get().asItem()))
                .unlockedBy("citrine", has(ItemList.itemGemCitrine.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotCobalt.get(), 9)
                .requires(Ingredient.of(BlockList.blockCobalt.get().asItem()))
                .unlockedBy("cobaltingot", has(ItemList.itemIngotCobalt.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotCopper.get(), 9)
                .requires(Ingredient.of(BlockList.blockCopper.get().asItem()))
                .unlockedBy("copperingot", has(ItemList.itemIngotCopper.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotCrimsonSteel.get(), 9)
                .requires(Ingredient.of(BlockList.blockCrimsonSteel.get().asItem()))
                .unlockedBy("crimsonsteelingot", has(ItemList.itemIngotCrimsonSteel.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotDeepIron.get(), 9)
                .requires(Ingredient.of(BlockList.blockDeepIron.get().asItem()))
                .unlockedBy("deepironingot", has(ItemList.itemIngotDeepIron.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotDesichalkos.get(), 9)
                .requires(Ingredient.of(BlockList.blockDesichalkos.get().asItem()))
                .unlockedBy("desichalkosingot", has(ItemList.itemIngotDesichalkos.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotEximite.get(), 9)
                .requires(Ingredient.of(BlockList.blockEximite.get().asItem()))
                .unlockedBy("eximiteingot", has(ItemList.itemIngotEximite.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotGallium.get(), 9)
                .requires(Ingredient.of(BlockList.blockGallium.get().asItem()))
                .unlockedBy("galliumingot", has(ItemList.itemIngotGallium.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemGemGarnet.get(), 9)
                .requires(Ingredient.of(BlockList.blockGarnet.get().asItem()))
                .unlockedBy("garnet", has(ItemList.itemGemGarnet.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotHaderoth.get(), 9)
                .requires(Ingredient.of(BlockList.blockHaderoth.get().asItem()))
                .unlockedBy("haderothingot", has(ItemList.itemIngotHaderoth.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotHepatizon.get(), 9)
                .requires(Ingredient.of(BlockList.blockHepatizon.get().asItem()))
                .unlockedBy("hepatizoningot", has(ItemList.itemIngotHepatizon.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotIgnatius.get(), 9)
                .requires(Ingredient.of(BlockList.blockIgnatius.get().asItem()))
                .unlockedBy("ignatiusingot", has(ItemList.itemIngotIgnatius.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotIndium.get(), 9)
                .requires(Ingredient.of(BlockList.blockIndium.get().asItem()))
                .unlockedBy("indiumingot", has(ItemList.itemIngotIndium.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotInfuscolium.get(), 9)
                .requires(Ingredient.of(BlockList.blockInfuscolium.get().asItem()))
                .unlockedBy("infuscoliumingot", has(ItemList.itemIngotInfuscolium.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotInolashite.get(), 9)
                .requires(Ingredient.of(BlockList.blockInolashite.get().asItem()))
                .unlockedBy("inolashiteingot", has(ItemList.itemIngotInolashite.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemGemIolite.get(), 9)
                .requires(Ingredient.of(BlockList.blockIolite.get().asItem()))
                .unlockedBy("iolite", has(ItemList.itemGemIolite.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotIridium.get(), 9)
                .requires(Ingredient.of(BlockList.blockIridium.get().asItem()))
                .unlockedBy("iridiumingot", has(ItemList.itemIngotIridium.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemGemJade.get(), 9)
                .requires(Ingredient.of(BlockList.blockJade.get().asItem()))
                .unlockedBy("jade", has(ItemList.itemGemJade.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemGemJasper.get(), 9)
                .requires(Ingredient.of(BlockList.blockJasper.get().asItem()))
                .unlockedBy("jasper", has(ItemList.itemGemJasper.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotKalendrite.get(), 9)
                .requires(Ingredient.of(BlockList.blockKalendrite.get().asItem()))
                .unlockedBy("kalendriteingot", has(ItemList.itemIngotKalendrite.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemGemKyanite.get(), 9)
                .requires(Ingredient.of(BlockList.blockKyanite.get().asItem()))
                .unlockedBy("kyanite", has(ItemList.itemGemKyanite.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotLead.get(), 9)
                .requires(Ingredient.of(BlockList.blockLead.get().asItem()))
                .unlockedBy("leadingot", has(ItemList.itemIngotLead.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotLemurite.get(), 9)
                .requires(Ingredient.of(BlockList.blockLemurite.get().asItem()))
                .unlockedBy("lemuriteingot", has(ItemList.itemIngotLemurite.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemGemMalachite.get(), 9)
                .requires(Ingredient.of(BlockList.blockMalachite.get()))
                .unlockedBy("malachite", has(ItemList.itemGemMalachite.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotManganese.get(), 9)
                .requires(Ingredient.of(BlockList.blockManganese.get().asItem()))
                .unlockedBy("manganeseingot", has(ItemList.itemIngotManganese.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotMeutoite.get(), 9)
                .requires(Ingredient.of(BlockList.blockMeutoite.get().asItem()))
                .unlockedBy("meutoiteingot", has(ItemList.itemIngotMeutoite.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotMidasium.get(), 9)
                .requires(Ingredient.of(BlockList.blockMidasium.get().asItem()))
                .unlockedBy("midasiumingot", has(ItemList.itemIngotMidasium.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotMithril.get(), 9)
                .requires(Ingredient.of(BlockList.blockMithril.get().asItem()))
                .unlockedBy("mithrilingot", has(ItemList.itemIngotMithril.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotMolybdenum.get(), 9)
                .requires(Ingredient.of(BlockList.blockMolybdenum.get().asItem()))
                .unlockedBy("molybdenumingot", has(ItemList.itemIngotMolybdenum.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotNeodymium.get(), 9)
                .requires(Ingredient.of(BlockList.blockNeodymium.get().asItem()))
                .unlockedBy("neodymiumingot", has(ItemList.itemIngotNeodymium.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotNeptunium.get(), 9)
                .requires(Ingredient.of(BlockList.blockNeptunium.get().asItem()))
                .unlockedBy("neptuniumingot", has(ItemList.itemIngotNeptunium.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotNickel.get(), 9)
                .requires(Ingredient.of(BlockList.blockNickel.get().asItem()))
                .unlockedBy("nickelingot", has(ItemList.itemIngotNickel.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotNiobium.get(), 9)
                .requires(Ingredient.of(BlockList.blockNiobium.get().asItem()))
                .unlockedBy("niobiumingot", has(ItemList.itemIngotNiobium.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemGemOnyx.get(), 9)
                .requires(Ingredient.of(BlockList.blockOnyx.get().asItem()))
                .unlockedBy("onyx", has(ItemList.itemGemOnyx.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemGemOpal.get(), 9)
                .requires(Ingredient.of(BlockList.blockOpal.get().asItem()))
                .unlockedBy("opal", has(ItemList.itemGemOpal.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotOrichalcum.get(), 9)
                .requires(Ingredient.of(BlockList.blockOrichalcum.get().asItem()))
                .unlockedBy("orichalcumingot", has(ItemList.itemIngotOrichalcum.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotOsmium.get(), 9)
                .requires(Ingredient.of(BlockList.blockOsmium.get().asItem()))
                .unlockedBy("osmiumingot", has(ItemList.itemIngotOsmium.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotOureclase.get(), 9)
                .requires(Ingredient.of(BlockList.blockOureclase.get().asItem()))
                .unlockedBy("oureclaseingot", has(ItemList.itemIngotOureclase.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotPalladium.get(), 9)
                .requires(Ingredient.of(BlockList.blockPalladium.get().asItem()))
                .unlockedBy("palladiumingot", has(ItemList.itemIngotPalladium.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemGemPeridot.get(), 9)
                .requires(Ingredient.of(BlockList.blockPeridot.get().asItem()))
                .unlockedBy("peridot", has(ItemList.itemGemPeridot.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemGemPhoenixite.get(), 9)
                .requires(Ingredient.of(BlockList.blockPhoenixite.get().asItem()))
                .unlockedBy("phoenixite", has(ItemList.itemGemPhoenixite.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotPlatinum.get(), 9)
                .requires(Ingredient.of(BlockList.blockPlatinum.get().asItem()))
                .unlockedBy("platinumingot", has(ItemList.itemIngotPlatinum.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotPlutonium.get(), 9)
                .requires(Ingredient.of(BlockList.blockPlutonium.get().asItem()))
                .unlockedBy("plutoniumingot", has(ItemList.itemIngotPlutonium.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotPolonium.get(), 9)
                .requires(Ingredient.of(BlockList.blockPolonium.get().asItem()))
                .unlockedBy("poloniumingot", has(ItemList.itemIngotPolonium.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotPromethium.get(), 9)
                .requires(Ingredient.of(BlockList.blockPromethium.get().asItem()))
                .unlockedBy("promethiumingot", has(ItemList.itemIngotPromethium.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemGemQuartz.get(), 9)
                .requires(Ingredient.of(BlockList.blockQuartz.get().asItem()))
                .unlockedBy("quartz", has(ItemList.itemGemQuartz.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotRhenium.get(), 9)
                .requires(Ingredient.of(BlockList.blockRhenium.get().asItem()))
                .unlockedBy("rheniumingot", has(ItemList.itemIngotRhenium.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotRhodium.get(), 9)
                .requires(Ingredient.of(BlockList.blockRhodium.get().asItem()))
                .unlockedBy("rhodiumingot", has(ItemList.itemIngotRhodium.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotRubracium.get(), 9)
                .requires(Ingredient.of(BlockList.blockRubracium.get().asItem()))
                .unlockedBy("rubraciumingot", has(ItemList.itemIngotRubracium.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemGemRuby.get(), 9)
                .requires(Ingredient.of(BlockList.blockRuby.get().asItem()))
                .unlockedBy("ruby", has(ItemList.itemGemRuby.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotRuthenium.get(), 9)
                .requires(Ingredient.of(BlockList.blockRuthenium.get().asItem()))
                .unlockedBy("rutheniumingot", has(ItemList.itemIngotRuthenium.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotSanguinite.get(), 9)
                .requires(Ingredient.of(BlockList.blockSanguinite.get().asItem()))
                .unlockedBy("sanguiniteingot", has(ItemList.itemIngotSanguinite.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemGemSapphire.get(), 9)
                .requires(Ingredient.of(BlockList.blockSapphire.get().asItem()))
                .unlockedBy("sapphire", has(ItemList.itemGemSapphire.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotShadowIron.get(), 9)
                .requires(Ingredient.of(BlockList.blockShadowIron.get().asItem()))
                .unlockedBy("shadowironingot", has(ItemList.itemIngotShadowIron.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotSilver.get(), 9)
                .requires(Ingredient.of(BlockList.blockSilver.get().asItem()))
                .unlockedBy("silveringot", has(ItemList.itemIngotSilver.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemGemSpinel.get(), 9)
                .requires(Ingredient.of(BlockList.blockSpinel.get().asItem()))
                .unlockedBy("spinel", has(ItemList.itemGemSpinel.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemGemSugilite.get(), 9)
                .requires(Ingredient.of(BlockList.blockSugilite.get().asItem()))
                .unlockedBy("sugilite", has(ItemList.itemGemSugilite.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotTantalum.get(), 9)
                .requires(Ingredient.of(BlockList.blockTantalum.get().asItem()))
                .unlockedBy("tantalumingot", has(ItemList.itemIngotTantalum.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemGemTanzanite.get(), 9)
                .requires(Ingredient.of(BlockList.blockTanzanite.get().asItem()))
                .unlockedBy("tanzanite", has(ItemList.itemGemTanzanite.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotTartarite.get(), 9)
                .requires(Ingredient.of(BlockList.blockTartarite.get().asItem()))
                .unlockedBy("tartariteingot", has(ItemList.itemIngotTartarite.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotTechnetium.get(), 9)
                .requires(Ingredient.of(BlockList.blockTechnetium.get().asItem()))
                .unlockedBy("technetiumingot", has(ItemList.itemIngotTechnetium.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotThallium.get(), 9)
                .requires(Ingredient.of(BlockList.blockThallium.get().asItem()))
                .unlockedBy("thalliumingot", has(ItemList.itemIngotThallium.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotTin.get(), 9)
                .requires(Ingredient.of(BlockList.blockTin.get().asItem()))
                .unlockedBy("tiningot", has(ItemList.itemIngotTin.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotTitanium.get(), 9)
                .requires(Ingredient.of(BlockList.blockTitanium.get().asItem()))
                .unlockedBy("titaniumingot", has(ItemList.itemIngotTitanium.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemGemTopaz.get(), 9)
                .requires(Ingredient.of(BlockList.blockTopaz.get().asItem()))
                .unlockedBy("topaz", has(ItemList.itemGemTopaz.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemGemTourmaline.get(), 9)
                .requires(Ingredient.of(BlockList.blockTourmaline.get().asItem()))
                .unlockedBy("tourmaline", has(ItemList.itemGemTourmaline.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotTritium.get(), 9)
                .requires(Ingredient.of(BlockList.blockTritium.get().asItem()))
                .unlockedBy("tritiumingot", has(ItemList.itemIngotTritium.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotTungsten.get(), 9)
                .requires(Ingredient.of(BlockList.blockTungsten.get().asItem()))
                .unlockedBy("tungsteningot", has(ItemList.itemIngotTungsten.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemGemTurquoise.get(), 9)
                .requires(Ingredient.of(BlockList.blockTurquoise.get().asItem()))
                .unlockedBy("turquoise", has(ItemList.itemGemTurquoise.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotUnobtainium.get(), 9)
                .requires(Ingredient.of(BlockList.blockUnobtainium.get().asItem()))
                .unlockedBy("unobtainiumingot", has(ItemList.itemIngotUnobtainium.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotUranium.get(), 9)
                .requires(Ingredient.of(BlockList.blockUranium.get().asItem()))
                .unlockedBy("uraniumingot", has(ItemList.itemIngotUranium.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotVanadium.get(), 9)
                .requires(Ingredient.of(BlockList.blockVanadium.get().asItem()))
                .unlockedBy("vanadiumingot", has(ItemList.itemIngotVanadium.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotVibranium.get(), 9)
                .requires(Ingredient.of(BlockList.blockVibranium.get().asItem()))
                .unlockedBy("vibraniumingot", has(ItemList.itemIngotVibranium.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotVulcanite.get(), 9)
                .requires(Ingredient.of(BlockList.blockVulcanite.get().asItem()))
                .unlockedBy("vulcaniteingot", has(ItemList.itemIngotVulcanite.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotVyroxeres.get(), 9)
                .requires(Ingredient.of(BlockList.blockVyroxeres.get().asItem()))
                .unlockedBy("vyroxeresingot", has(ItemList.itemIngotVyroxeres.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotYellorite.get(), 9)
                .requires(Ingredient.of(BlockList.blockYellorite.get().asItem()))
                .unlockedBy("yelloriteingot", has(ItemList.itemIngotYellorite.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotZinc.get(), 9)
                .requires(Ingredient.of(BlockList.blockZinc.get().asItem()))
                .unlockedBy("zincingot", has(ItemList.itemIngotZinc.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotZirconium.get(), 9)
                .requires(Ingredient.of(BlockList.blockZirconium.get().asItem()))
                .unlockedBy("zirconiumingot", has(ItemList.itemIngotZirconium.get()))
                .save(consumer);
    }

    protected void buildSmeltingRecipes(Consumer<FinishedRecipe> consumer)
    {
        //Smelting Ore
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreAdamantine), RecipeCategory.MISC, ItemList.itemIngotAdamantine.get(), 0.75F, 40)
                .unlockedBy("smeltadamantineore", has(ItemList.itemIngotAdamantine.get()))
                .save(consumer, new ResourceLocation("extraores:smeltadamantineore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreAldourite), RecipeCategory.MISC, ItemList.itemIngotAldourite.get(), 0.75F, 40)
                .unlockedBy("smeltaldouriteore", has(ItemList.itemIngotAldourite.get()))
                .save(consumer, new ResourceLocation("extraores:smeltaldouriteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreAluminum), RecipeCategory.MISC, ItemList.itemIngotAluminum.get(), 0.75F, 40)
                .unlockedBy("smeltaluminumore", has(ItemList.itemIngotAluminum.get()))
                .save(consumer, new ResourceLocation("extraores:smeltaluminumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreAmericium), RecipeCategory.MISC, ItemList.itemIngotAmericium.get(), 0.75F, 40)
                .unlockedBy("smeltamericiumore", has(ItemList.itemIngotAmericium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltamericiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreAmordrine), RecipeCategory.MISC, ItemList.itemIngotAmordrine.get(), 0.75F, 40)
                .unlockedBy("smeltamordrineore", has(ItemList.itemIngotAmordrine.get()))
                .save(consumer, new ResourceLocation("extraores:smeltamordrineore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreAngmallen), RecipeCategory.MISC, ItemList.itemIngotAngmallen.get(), 0.75F, 40)
                .unlockedBy("smeltangmallenore", has(ItemList.itemIngotAngmallen.get()))
                .save(consumer, new ResourceLocation("extraores:smeltangmallenore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreAstralSilver), RecipeCategory.MISC, ItemList.itemIngotAstralSilver.get(), 0.75F, 40)
                .unlockedBy("smeltastralsilverore", has(ItemList.itemIngotAstralSilver.get()))
                .save(consumer, new ResourceLocation("extraores:smeltastralsilverore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreAtlarus), RecipeCategory.MISC, ItemList.itemIngotAtlarus.get(), 0.75F, 40)
                .unlockedBy("smeltatlarusore", has(ItemList.itemIngotAtlarus.get()))
                .save(consumer, new ResourceLocation("extraores:smeltatlarusore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreBismuth), RecipeCategory.MISC, ItemList.itemIngotBismuth.get(), 0.75F, 40)
                .unlockedBy("smeltbismuthore", has(ItemList.itemIngotBismuth.get()))
                .save(consumer, new ResourceLocation("extraores:smeltbismuthore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreBlackSteel), RecipeCategory.MISC, ItemList.itemIngotBlackSteel.get(), 0.75F, 40)
                .unlockedBy("smeltblacksteelore", has(ItemList.itemIngotBlackSteel.get()))
                .save(consumer, new ResourceLocation("extraores:smeltblacksteelore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreCadmium), RecipeCategory.MISC, ItemList.itemIngotCadmium.get(), 0.75F, 40)
                .unlockedBy("smeltcadmiumore", has(ItemList.itemIngotCadmium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltcadmiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreCarmot), RecipeCategory.MISC, ItemList.itemIngotCarmot.get(), 0.75F, 40)
                .unlockedBy("smeltcarmotore", has(ItemList.itemIngotCarmot.get()))
                .save(consumer, new ResourceLocation("extraores:smeltcarmotore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreCelenegil), RecipeCategory.MISC, ItemList.itemIngotCelenegil.get(), 0.75F, 40)
                .unlockedBy("smeltcelenegilore", has(ItemList.itemIngotCelenegil.get()))
                .save(consumer, new ResourceLocation("extraores:smeltcelenegilore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreCeruclase), RecipeCategory.MISC, ItemList.itemIngotCeruclase.get(), 0.75F, 40)
                .unlockedBy("smeltceruclaseore", has(ItemList.itemIngotCeruclase.get()))
                .save(consumer, new ResourceLocation("extraores:smeltceruclaseore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreChromium), RecipeCategory.MISC, ItemList.itemIngotChromium.get(), 0.75F, 40)
                .unlockedBy("smeltchromiumore", has(ItemList.itemIngotChromium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltchromiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreCobalt), RecipeCategory.MISC, ItemList.itemIngotCobalt.get(), 0.75F, 40)
                .unlockedBy("smeltcobaltore", has(ItemList.itemIngotCobalt.get()))
                .save(consumer, new ResourceLocation("extraores:smeltcobaltore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreCopper), RecipeCategory.MISC, ItemList.itemIngotCopper.get(), 0.75F, 40)
                .unlockedBy("smeltcopperore", has(ItemList.itemIngotCopper.get()))
                .save(consumer, new ResourceLocation("extraores:smeltcopperore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreCrimsonSteel), RecipeCategory.MISC, ItemList.itemIngotCrimsonSteel.get(), 0.75F, 40)
                .unlockedBy("smeltcrimsonsteelore", has(ItemList.itemIngotCrimsonSteel.get()))
                .save(consumer, new ResourceLocation("extraores:smeltcrimsonsteelore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreDeepIron), RecipeCategory.MISC, ItemList.itemIngotDeepIron.get(), 0.75F, 40)
                .unlockedBy("smeltdeepironore", has(ItemList.itemIngotDeepIron.get()))
                .save(consumer, new ResourceLocation("extraores:smeltdeepironore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreDesichalkos), RecipeCategory.MISC, ItemList.itemIngotDesichalkos.get(), 0.75F, 40)
                .unlockedBy("smeltdesichalkosore", has(ItemList.itemIngotDesichalkos.get()))
                .save(consumer, new ResourceLocation("extraores:smeltdesichalkosore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreEximite), RecipeCategory.MISC, ItemList.itemIngotEximite.get(), 0.75F, 40)
                .unlockedBy("smelteximiteore", has(ItemList.itemIngotEximite.get()))
                .save(consumer, new ResourceLocation("extraores:smelteximiteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreGallium), RecipeCategory.MISC, ItemList.itemIngotGallium.get(), 0.75F, 40)
                .unlockedBy("smeltgalliumore", has(ItemList.itemIngotGallium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltgalliumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreHaderoth), RecipeCategory.MISC, ItemList.itemIngotHaderoth.get(), 0.75F, 40)
                .unlockedBy("smelthaderothore", has(ItemList.itemIngotHaderoth.get()))
                .save(consumer, new ResourceLocation("extraores:smelthaderothore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreHepatizon), RecipeCategory.MISC, ItemList.itemIngotHepatizon.get(), 0.75F, 40)
                .unlockedBy("smelthepatizonore", has(ItemList.itemIngotHepatizon.get()))
                .save(consumer, new ResourceLocation("extraores:smelthepatizonore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreIgnatius), RecipeCategory.MISC, ItemList.itemIngotIgnatius.get(), 0.75F, 40)
                .unlockedBy("smeltignatiusore", has(ItemList.itemIngotIgnatius.get()))
                .save(consumer, new ResourceLocation("extraores:smeltignatiusore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreIndium), RecipeCategory.MISC, ItemList.itemIngotIndium.get(), 0.75F, 40)
                .unlockedBy("smeltindiumore", has(ItemList.itemIngotIndium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltindiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreInfuscolium), RecipeCategory.MISC, ItemList.itemIngotInfuscolium.get(), 0.75F, 40)
                .unlockedBy("smeltinfuscoliumore", has(ItemList.itemIngotInfuscolium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltinfuscoliumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreInolashite), RecipeCategory.MISC, ItemList.itemIngotInolashite.get(), 0.75F, 40)
                .unlockedBy("smeltinolashiteore", has(ItemList.itemIngotInolashite.get()))
                .save(consumer, new ResourceLocation("extraores:smeltinolashiteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreIridium), RecipeCategory.MISC, ItemList.itemIngotIridium.get(), 0.75F, 40)
                .unlockedBy("smeltiridiumore", has(ItemList.itemIngotIridium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltiridiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreKalendrite), RecipeCategory.MISC, ItemList.itemIngotKalendrite.get(), 0.75F, 40)
                .unlockedBy("smeltkalendriteore", has(ItemList.itemIngotKalendrite.get()))
                .save(consumer, new ResourceLocation("extraores:smeltkalendriteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreLead), RecipeCategory.MISC, ItemList.itemIngotLead.get(), 0.75F, 40)
                .unlockedBy("smeltleadore", has(ItemList.itemIngotLead.get()))
                .save(consumer, new ResourceLocation("extraores:smeltleadore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreLemurite), RecipeCategory.MISC, ItemList.itemIngotLemurite.get(), 0.75F, 40)
                .unlockedBy("smeltlemuriteore", has(ItemList.itemIngotLemurite.get()))
                .save(consumer, new ResourceLocation("extraores:smeltlemuriteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreManganese), RecipeCategory.MISC, ItemList.itemIngotManganese.get(), 0.75F, 40)
                .unlockedBy("smeltmanganeseore", has(ItemList.itemIngotManganese.get()))
                .save(consumer, new ResourceLocation("extraores:smeltmanganeseore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreMeutoite), RecipeCategory.MISC, ItemList.itemIngotMeutoite.get(), 0.75F, 40)
                .unlockedBy("smeltmeutoiteore", has(ItemList.itemIngotMeutoite.get()))
                .save(consumer, new ResourceLocation("extraores:smeltmeutoiteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreMidasium), RecipeCategory.MISC, ItemList.itemIngotMidasium.get(), 0.75F, 40)
                .unlockedBy("smeltmidasiumore", has(ItemList.itemIngotMidasium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltmidasiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreMithril), RecipeCategory.MISC, ItemList.itemIngotMithril.get(), 0.75F, 40)
                .unlockedBy("smeltmithrilore", has(ItemList.itemIngotMithril.get()))
                .save(consumer, new ResourceLocation("extraores:smeltmithrilore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreMolybdenum), RecipeCategory.MISC, ItemList.itemIngotMolybdenum.get(), 0.75F, 40)
                .unlockedBy("smeltmolybdenumore", has(ItemList.itemIngotMolybdenum.get()))
                .save(consumer, new ResourceLocation("extraores:smeltmolybdenumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreNeodymium), RecipeCategory.MISC, ItemList.itemIngotNeodymium.get(), 0.75F, 40)
                .unlockedBy("smeltneodymiumore", has(ItemList.itemIngotNeodymium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltneodymiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreNeptunium), RecipeCategory.MISC, ItemList.itemIngotNeptunium.get(), 0.75F, 40)
                .unlockedBy("smeltneptuniumore", has(ItemList.itemIngotNeptunium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltneptuniumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreNickel), RecipeCategory.MISC, ItemList.itemIngotNickel.get(), 0.75F, 40)
                .unlockedBy("smeltnickelore", has(ItemList.itemIngotNickel.get()))
                .save(consumer, new ResourceLocation("extraores:smeltnickelore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreNiobium), RecipeCategory.MISC, ItemList.itemIngotNiobium.get(), 0.75F, 40)
                .unlockedBy("smeltniobiumore", has(ItemList.itemIngotNiobium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltniobiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreOrichalcum), RecipeCategory.MISC, ItemList.itemIngotOrichalcum.get(), 0.75F, 40)
                .unlockedBy("smeltorichalcumore", has(ItemList.itemIngotOrichalcum.get()))
                .save(consumer, new ResourceLocation("extraores:smeltorichalcumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreOsmium), RecipeCategory.MISC, ItemList.itemIngotOsmium.get(), 0.75F, 40)
                .unlockedBy("smeltosmiumore", has(ItemList.itemIngotOsmium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltosmiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreOureclase), RecipeCategory.MISC, ItemList.itemIngotOureclase.get(), 0.75F, 40)
                .unlockedBy("smeltoureclaseore", has(ItemList.itemIngotOureclase.get()))
                .save(consumer, new ResourceLocation("extraores:smeltoureclaseore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.orePalladium), RecipeCategory.MISC, ItemList.itemIngotPalladium.get(), 0.75F, 40)
                .unlockedBy("smeltpalladiumore", has(ItemList.itemIngotPalladium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltpalladiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.orePlatinum), RecipeCategory.MISC, ItemList.itemIngotPlatinum.get(), 0.75F, 40)
                .unlockedBy("smeltplatinumore", has(ItemList.itemIngotPlatinum.get()))
                .save(consumer, new ResourceLocation("extraores:smeltplatinumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.orePlutonium), RecipeCategory.MISC, ItemList.itemIngotPlutonium.get(), 0.75F, 40)
                .unlockedBy("smeltplutoniumore", has(ItemList.itemIngotPlutonium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltplutoniumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.orePolonium), RecipeCategory.MISC, ItemList.itemIngotPolonium.get(), 0.75F, 40)
                .unlockedBy("smeltpoloniumore", has(ItemList.itemIngotPolonium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltpoloniumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.orePromethium), RecipeCategory.MISC, ItemList.itemIngotPromethium.get(), 0.75F, 40)
                .unlockedBy("smeltpromethiumore", has(ItemList.itemIngotPromethium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltpromethiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreRhenium), RecipeCategory.MISC, ItemList.itemIngotRhenium.get(), 0.75F, 40)
                .unlockedBy("smeltrheniumore", has(ItemList.itemIngotRhenium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrheniumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreRhodium), RecipeCategory.MISC, ItemList.itemIngotRhodium.get(), 0.75F, 40)
                .unlockedBy("smeltrhodiumore", has(ItemList.itemIngotRhodium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrhodiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreRubracium), RecipeCategory.MISC, ItemList.itemIngotRubracium.get(), 0.75F, 40)
                .unlockedBy("smeltrubraciumore", has(ItemList.itemIngotRubracium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrubraciumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreRuthenium), RecipeCategory.MISC, ItemList.itemIngotRuthenium.get(), 0.75F, 40)
                .unlockedBy("smeltrutheniumore", has(ItemList.itemIngotRuthenium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrutheniumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreSanguinite), RecipeCategory.MISC, ItemList.itemIngotSanguinite.get(), 0.75F, 40)
                .unlockedBy("smeltsanguiniteore", has(ItemList.itemIngotSanguinite.get()))
                .save(consumer, new ResourceLocation("extraores:smeltsanguiniteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreShadowIron), RecipeCategory.MISC, ItemList.itemIngotShadowIron.get(), 0.75F, 40)
                .unlockedBy("smeltshadowironore", has(ItemList.itemIngotShadowIron.get()))
                .save(consumer, new ResourceLocation("extraores:smeltshadowironore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreSilver), RecipeCategory.MISC, ItemList.itemIngotSilver.get(), 0.75F, 40)
                .unlockedBy("smeltsilverore", has(ItemList.itemIngotSilver.get()))
                .save(consumer, new ResourceLocation("extraores:smeltsilverore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreTantalum), RecipeCategory.MISC, ItemList.itemIngotTantalum.get(), 0.75F, 40)
                .unlockedBy("smelttantalumore", has(ItemList.itemIngotTantalum.get()))
                .save(consumer, new ResourceLocation("extraores:smelttantalumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreTartarite), RecipeCategory.MISC, ItemList.itemIngotTartarite.get(), 0.75F, 40)
                .unlockedBy("smelttartariteore", has(ItemList.itemIngotTartarite.get()))
                .save(consumer, new ResourceLocation("extraores:smelttartariteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreTechnetium), RecipeCategory.MISC, ItemList.itemIngotTechnetium.get(), 0.75F, 40)
                .unlockedBy("smelttechnetiumore", has(ItemList.itemIngotTechnetium.get()))
                .save(consumer, new ResourceLocation("extraores:smelttechnetiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreThallium), RecipeCategory.MISC, ItemList.itemIngotThallium.get(), 0.75F, 40)
                .unlockedBy("smeltthalliumore", has(ItemList.itemIngotThallium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltthalliumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreTin), RecipeCategory.MISC, ItemList.itemIngotTin.get(), 0.75F, 40)
                .unlockedBy("smelttinore", has(ItemList.itemIngotTin.get()))
                .save(consumer, new ResourceLocation("extraores:smelttinore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreTitanium), RecipeCategory.MISC, ItemList.itemIngotTitanium.get(), 0.75F, 40)
                .unlockedBy("smelttitaniumore", has(ItemList.itemIngotTitanium.get()))
                .save(consumer, new ResourceLocation("extraores:smelttitaniumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreTritium), RecipeCategory.MISC, ItemList.itemIngotTritium.get(), 0.75F, 40)
                .unlockedBy("smelttritiumore", has(ItemList.itemIngotTritium.get()))
                .save(consumer, new ResourceLocation("extraores:smelttritiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreTungsten), RecipeCategory.MISC, ItemList.itemIngotTungsten.get(), 0.75F, 40)
                .unlockedBy("smelttungstenore", has(ItemList.itemIngotTungsten.get()))
                .save(consumer, new ResourceLocation("extraores:smelttungstenore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreUnobtainium), RecipeCategory.MISC, ItemList.itemIngotUnobtainium.get(), 0.75F, 40)
                .unlockedBy("smeltunobtainiumore", has(ItemList.itemIngotUnobtainium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltunobtainiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreUranium), RecipeCategory.MISC, ItemList.itemIngotUranium.get(), 0.75f, 40)
                .unlockedBy("smelturaniumore", has(ItemList.itemIngotUranium.get()))
                .save(consumer, new ResourceLocation("extraores:smelturaniumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreVanadium), RecipeCategory.MISC, ItemList.itemIngotVanadium.get(), 0.75F, 40)
                .unlockedBy("smeltvanadiumore", has(ItemList.itemIngotVanadium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltvanadiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreVibranium), RecipeCategory.MISC, ItemList.itemIngotVibranium.get(), 0.75F, 40)
                .unlockedBy("smeltvibraniumore", has(ItemList.itemIngotVibranium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltvibraniumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreVulcanite), RecipeCategory.MISC, ItemList.itemIngotVulcanite.get(), 0.75F, 40)
                .unlockedBy("smeltvulcaniteore", has(ItemList.itemIngotVulcanite.get()))
                .save(consumer, new ResourceLocation("extraores:smeltvulcaniteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreVyroxeres), RecipeCategory.MISC, ItemList.itemIngotVyroxeres.get(), 0.75F, 40)
                .unlockedBy("smeltvyroxeresore", has(ItemList.itemIngotVyroxeres.get()))
                .save(consumer, new ResourceLocation("extraores:smeltvyroxeresore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreYellorite), RecipeCategory.MISC, ItemList.itemIngotYellorite.get(), 0.75F, 40)
                .unlockedBy("smeltyelloriteore", has(ItemList.itemIngotYellorite.get()))
                .save(consumer, new ResourceLocation("extraores:smeltyelloriteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreZinc), RecipeCategory.MISC, ItemList.itemIngotZinc.get(), 0.75F, 40)
                .unlockedBy("smeltzincore", has(ItemList.itemIngotZinc.get()))
                .save(consumer, new ResourceLocation("extraores:smeltzincore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreZirconium), RecipeCategory.MISC, ItemList.itemIngotZirconium.get(), 0.75F, 40)
                .unlockedBy("smeltzirconiumore", has(ItemList.itemIngotZirconium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltzirconiumore"));
        //Smelting Raw
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawAdamantine), RecipeCategory.MISC, ItemList.itemIngotAdamantine.get(), 0.75F, 40)
                .unlockedBy("smeltrawadamantine", has(ItemList.itemIngotAdamantine.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawadamantine"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawAldourite), RecipeCategory.MISC, ItemList.itemIngotAldourite.get(), 0.75F, 40)
                .unlockedBy("smeltrawaldourite", has(ItemList.itemIngotAldourite.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawaldourite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawAluminum), RecipeCategory.MISC, ItemList.itemIngotAluminum.get(), 0.75F, 40)
                .unlockedBy("smeltrawaluminum", has(ItemList.itemIngotAluminum.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawaluminum"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawAmericium), RecipeCategory.MISC, ItemList.itemIngotAmericium.get(), 0.75F, 40)
                .unlockedBy("smeltrawamericium", has(ItemList.itemIngotAmericium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawamericium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawAmordrine), RecipeCategory.MISC, ItemList.itemIngotAmordrine.get(), 0.75F, 40)
                .unlockedBy("smeltrawamordrine", has(ItemList.itemIngotAmordrine.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawamordrine"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawAngmallen), RecipeCategory.MISC, ItemList.itemIngotAngmallen.get(), 0.75F, 40)
                .unlockedBy("smeltrawangmallen", has(ItemList.itemIngotAngmallen.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawangmallen"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawAstralSilver), RecipeCategory.MISC, ItemList.itemIngotAstralSilver.get(), 0.75F, 40)
                .unlockedBy("smeltrawastralsilver", has(ItemList.itemIngotAstralSilver.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawastralsilver"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawAtlarus), RecipeCategory.MISC, ItemList.itemIngotAtlarus.get(), 0.75F, 40)
                .unlockedBy("smeltrawatlarus", has(ItemList.itemIngotAtlarus.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawatlarus"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawBismuth), RecipeCategory.MISC, ItemList.itemIngotBismuth.get(), 0.75F, 40)
                .unlockedBy("smeltrawbismuth", has(ItemList.itemIngotBismuth.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawbismuth"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawBlackSteel), RecipeCategory.MISC, ItemList.itemIngotBlackSteel.get(), 0.75F, 40)
                .unlockedBy("smeltrawblacksteel", has(ItemList.itemIngotBlackSteel.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawblacksteel"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawCadmium), RecipeCategory.MISC, ItemList.itemIngotCadmium.get(), 0.75F, 40)
                .unlockedBy("smeltrawcadmium", has(ItemList.itemIngotCadmium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawcadmium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawCarmot), RecipeCategory.MISC, ItemList.itemIngotCarmot.get(), 0.75F, 40)
                .unlockedBy("smeltrawcarmot", has(ItemList.itemIngotCarmot.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawcarmot"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawCelenegil), RecipeCategory.MISC, ItemList.itemIngotCelenegil.get(), 0.75F, 40)
                .unlockedBy("smeltrawcelenegil", has(ItemList.itemIngotCelenegil.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawcelenegil"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawCeruclase), RecipeCategory.MISC, ItemList.itemIngotCeruclase.get(), 0.75F, 40)
                .unlockedBy("smeltrawceruclase", has(ItemList.itemIngotCeruclase.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawceruclase"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawChromium), RecipeCategory.MISC, ItemList.itemIngotChromium.get(), 0.75F, 40)
                .unlockedBy("smeltrawchromium", has(ItemList.itemIngotChromium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawchromium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawCobalt), RecipeCategory.MISC, ItemList.itemIngotCobalt.get(), 0.75F, 40)
                .unlockedBy("smeltrawcobalt", has(ItemList.itemIngotCobalt.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawcobalt"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawCopper), RecipeCategory.MISC, ItemList.itemIngotCopper.get(), 0.75F, 40)
                .unlockedBy("smeltrawcopper", has(ItemList.itemIngotCopper.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawcopper"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawCrimsonSteel), RecipeCategory.MISC, ItemList.itemIngotCrimsonSteel.get(), 0.75F, 40)
                .unlockedBy("smeltrawcrimsonsteel", has(ItemList.itemIngotCrimsonSteel.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawcrimsonsteel"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawDeepIron), RecipeCategory.MISC, ItemList.itemIngotDeepIron.get(), 0.75F, 40)
                .unlockedBy("smeltrawdeepiron", has(ItemList.itemIngotDeepIron.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawdeepiron"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawDesichalkos), RecipeCategory.MISC, ItemList.itemIngotDesichalkos.get(), 0.75F, 40)
                .unlockedBy("smeltrawdesichalkos", has(ItemList.itemIngotDesichalkos.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawdesichalkos"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawEximite), RecipeCategory.MISC, ItemList.itemIngotEximite.get(), 0.75F, 40)
                .unlockedBy("smeltraweximite", has(ItemList.itemIngotEximite.get()))
                .save(consumer, new ResourceLocation("extraores:smeltraweximite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawGallium), RecipeCategory.MISC, ItemList.itemIngotGallium.get(), 0.75F, 40)
                .unlockedBy("smeltrawgallium", has(ItemList.itemIngotGallium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawgallium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawHaderoth), RecipeCategory.MISC, ItemList.itemIngotHaderoth.get(), 0.75F, 40)
                .unlockedBy("smeltrawhaderoth", has(ItemList.itemIngotHaderoth.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawhaderoth"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawHepatizon), RecipeCategory.MISC, ItemList.itemIngotHepatizon.get(), 0.75F, 40)
                .unlockedBy("smeltrawhepatizon", has(ItemList.itemIngotHepatizon.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawhepatizon"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawIgnatius), RecipeCategory.MISC, ItemList.itemIngotIgnatius.get(), 0.75F, 40)
                .unlockedBy("smeltrawignatius", has(ItemList.itemIngotIgnatius.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawignatius"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawIndium), RecipeCategory.MISC, ItemList.itemIngotIndium.get(), 0.75F, 40)
                .unlockedBy("smeltrawindium", has(ItemList.itemIngotIndium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawindium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawInfuscolium), RecipeCategory.MISC, ItemList.itemIngotInfuscolium.get(), 0.75F, 40)
                .unlockedBy("smeltrawinfuscolium", has(ItemList.itemIngotInfuscolium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawinfuscolium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawInolashite), RecipeCategory.MISC, ItemList.itemIngotInolashite.get(), 0.75F, 40)
                .unlockedBy("smeltrawinolashite", has(ItemList.itemIngotInolashite.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawinolashite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawIridium), RecipeCategory.MISC, ItemList.itemIngotIridium.get(), 0.75F, 40)
                .unlockedBy("smeltrawiridium", has(ItemList.itemIngotIridium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawiridium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawKalendrite), RecipeCategory.MISC, ItemList.itemIngotKalendrite.get(), 0.75F, 40)
                .unlockedBy("smeltrawkalendrite", has(ItemList.itemIngotKalendrite.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawkalendrite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawLead), RecipeCategory.MISC, ItemList.itemIngotLead.get(), 0.75F, 40)
                .unlockedBy("smeltrawlead", has(ItemList.itemIngotLead.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawlead"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawLemurite), RecipeCategory.MISC, ItemList.itemIngotLemurite.get(), 0.75F, 40)
                .unlockedBy("smeltrawlemurite", has(ItemList.itemIngotLemurite.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawlemurite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawManganese), RecipeCategory.MISC, ItemList.itemIngotManganese.get(), 0.75F, 40)
                .unlockedBy("smeltrawmanganese", has(ItemList.itemIngotManganese.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawmanganese"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawMeutoite), RecipeCategory.MISC, ItemList.itemIngotMeutoite.get(), 0.75F, 40)
                .unlockedBy("smeltrawmeutoite", has(ItemList.itemIngotMeutoite.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawmeutoite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawMidasium), RecipeCategory.MISC, ItemList.itemIngotMidasium.get(), 0.75F, 40)
                .unlockedBy("smeltrawmidasium", has(ItemList.itemIngotMidasium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawmidasium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawMithril), RecipeCategory.MISC, ItemList.itemIngotMithril.get(), 0.75F, 40)
                .unlockedBy("smeltrawmithril", has(ItemList.itemIngotMithril.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawmithril"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawMolybdenum), RecipeCategory.MISC, ItemList.itemIngotMolybdenum.get(), 0.75F, 40)
                .unlockedBy("smeltrawmolybdenum", has(ItemList.itemIngotMolybdenum.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawmolybdenum"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawNeodymium), RecipeCategory.MISC, ItemList.itemIngotNeodymium.get(), 0.75F, 40)
                .unlockedBy("smeltrawneodymium", has(ItemList.itemIngotNeodymium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawneodymium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawNeptunium), RecipeCategory.MISC, ItemList.itemIngotNeptunium.get(), 0.75F, 40)
                .unlockedBy("smeltrawneptunium", has(ItemList.itemIngotNeptunium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawneptunium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawNickel), RecipeCategory.MISC, ItemList.itemIngotNickel.get(), 0.75F, 40)
                .unlockedBy("smeltrawnickel", has(ItemList.itemIngotNickel.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawnickel"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawNiobium), RecipeCategory.MISC, ItemList.itemIngotNiobium.get(), 0.75F, 40)
                .unlockedBy("smeltrawniobium", has(ItemList.itemIngotNiobium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawniobium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawOrichalcum), RecipeCategory.MISC, ItemList.itemIngotOrichalcum.get(), 0.75F, 40)
                .unlockedBy("smeltraworichalcum", has(ItemList.itemIngotOrichalcum.get()))
                .save(consumer, new ResourceLocation("extraores:smeltraworichalcum"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawOsmium), RecipeCategory.MISC, ItemList.itemIngotOsmium.get(), 0.75F, 40)
                .unlockedBy("smeltrawosmium", has(ItemList.itemIngotOureclase.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawosmium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawOureclase), RecipeCategory.MISC, ItemList.itemIngotOureclase.get(), 0.75F, 40)
                .unlockedBy("smeltrawoureclase", has(ItemList.itemIngotOureclase.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawoureclase"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawPalladium), RecipeCategory.MISC, ItemList.itemIngotPalladium.get(), 0.75F, 40)
                .unlockedBy("smeltrawpalladium", has(ItemList.itemIngotPalladium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawpalladium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawPlatinum), RecipeCategory.MISC, ItemList.itemIngotPlatinum.get(), 0.75F, 40)
                .unlockedBy("smeltrawplatinum", has(ItemList.itemIngotPlatinum.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawplatinum"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawPlutonium), RecipeCategory.MISC, ItemList.itemIngotPlutonium.get(), 0.75F, 40)
                .unlockedBy("smeltrawplutonium", has(ItemList.itemIngotPlutonium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawplutonium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawPolonium), RecipeCategory.MISC, ItemList.itemIngotPolonium.get(), 0.75F, 40)
                .unlockedBy("smeltrawpolonium", has(ItemList.itemIngotPolonium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawpolonium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawPromethium), RecipeCategory.MISC, ItemList.itemIngotPromethium.get(), 0.75F, 40)
                .unlockedBy("smeltrawpromethium", has(ItemList.itemIngotPromethium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawpromethium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawRhenium), RecipeCategory.MISC, ItemList.itemIngotRhenium.get(), 0.75F, 40)
                .unlockedBy("smeltrawrhenium", has(ItemList.itemIngotRhenium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawrhenium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawRhodium), RecipeCategory.MISC, ItemList.itemIngotRhodium.get(), 0.75F, 40)
                .unlockedBy("smeltrawrhodium", has(ItemList.itemIngotRhodium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawrhodium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawRubracium), RecipeCategory.MISC, ItemList.itemIngotRubracium.get(), 0.75F, 40)
                .unlockedBy("smeltrawrubracium", has(ItemList.itemIngotRubracium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawrubracium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawRuthenium), RecipeCategory.MISC, ItemList.itemIngotRuthenium.get(), 0.75F, 40)
                .unlockedBy("smeltrawruthenium", has(ItemList.itemIngotRuthenium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawruthenium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawSanguinite), RecipeCategory.MISC, ItemList.itemIngotSanguinite.get(), 0.75F, 40)
                .unlockedBy("smeltrawsanguinite", has(ItemList.itemIngotSanguinite.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawsanguinite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawShadowIron), RecipeCategory.MISC, ItemList.itemIngotShadowIron.get(), 0.75F, 40)
                .unlockedBy("smeltrawshadowiron", has(ItemList.itemIngotShadowIron.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawshadowiron"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawSilver), RecipeCategory.MISC, ItemList.itemIngotSilver.get(), 0.75F, 40)
                .unlockedBy("smeltrawsilver", has(ItemList.itemIngotSilver.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawsilver"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawTantalum), RecipeCategory.MISC, ItemList.itemIngotTantalum.get(), 0.75F, 40)
                .unlockedBy("smeltrawtantalum", has(ItemList.itemIngotTantalum.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawtantalum"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawTartarite), RecipeCategory.MISC, ItemList.itemIngotTartarite.get(), 0.75F, 40)
                .unlockedBy("smeltrawtartarite", has(ItemList.itemIngotTartarite.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawtartarite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawTechnetium), RecipeCategory.MISC, ItemList.itemIngotTechnetium.get(), 0.75F, 40)
                .unlockedBy("smeltrawtechnetium", has(ItemList.itemIngotTechnetium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawtechnetium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawThallium), RecipeCategory.MISC, ItemList.itemIngotThallium.get(), 0.75F, 40)
                .unlockedBy("smeltrawthallium", has(ItemList.itemIngotThallium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawthallium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawTin), RecipeCategory.MISC, ItemList.itemIngotTin.get(), 0.75F, 40)
                .unlockedBy("smeltrawtin", has(ItemList.itemIngotTin.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawtin"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawTitanium), RecipeCategory.MISC, ItemList.itemIngotTitanium.get(), 0.75F, 40)
                .unlockedBy("smeltrawtitanium", has(ItemList.itemIngotTitanium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawtitanium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawTritium), RecipeCategory.MISC, ItemList.itemIngotTritium.get(), 0.75F, 40)
                .unlockedBy("smeltrawtritium", has(ItemList.itemIngotTritium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawtritium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawTungsten), RecipeCategory.MISC, ItemList.itemIngotTungsten.get(), 0.75F, 40)
                .unlockedBy("smeltrawtungsten", has(ItemList.itemIngotTungsten.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawtungsten"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawUnobtainium), RecipeCategory.MISC, ItemList.itemIngotUnobtainium.get(), 0.75F, 40)
                .unlockedBy("smeltrawunobtainium", has(ItemList.itemIngotUnobtainium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawunobtainium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawUranium), RecipeCategory.MISC, ItemList.itemIngotUranium.get(), 0.75f, 40)
                .unlockedBy("smeltrawuranium", has(ItemList.itemIngotUranium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawuranium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawVanadium), RecipeCategory.MISC, ItemList.itemIngotVanadium.get(), 0.75F, 40)
                .unlockedBy("smeltrawvanadium", has(ItemList.itemIngotVanadium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawvanadium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawVibranium), RecipeCategory.MISC, ItemList.itemIngotVibranium.get(), 0.75F, 40)
                .unlockedBy("smeltrawvibranium", has(ItemList.itemIngotVibranium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawvibranium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawVulcanite), RecipeCategory.MISC, ItemList.itemIngotVulcanite.get(), 0.75F, 40)
                .unlockedBy("smeltrawvulcanite", has(ItemList.itemIngotVulcanite.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawvulcanite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawVyroxeres), RecipeCategory.MISC, ItemList.itemIngotVyroxeres.get(), 0.75F, 40)
                .unlockedBy("smeltrawvyroxeres", has(ItemList.itemIngotVyroxeres.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawvyroxeres"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawYellorite), RecipeCategory.MISC, ItemList.itemIngotYellorite.get(), 0.75F, 40)
                .unlockedBy("smeltrawyellorite", has(ItemList.itemIngotYellorite.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawyellorite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawZinc), RecipeCategory.MISC, ItemList.itemIngotZinc.get(), 0.75F, 40)
                .unlockedBy("smeltrawzinc", has(ItemList.itemIngotZinc.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawzinc"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawZirconium), RecipeCategory.MISC, ItemList.itemIngotZirconium.get(), 0.75F, 40)
                .unlockedBy("smeltrawzirconium", has(ItemList.itemIngotZirconium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrawzirconium"));
        //Smelting Dust
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustAdamantine), RecipeCategory.MISC, ItemList.itemIngotAdamantine.get(), 0.75F, 20)
                .unlockedBy("smeltadamantinedust", has(ItemList.itemIngotAdamantine.get()))
                .save(consumer, new ResourceLocation("extraores:smeltadamantinedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustAldourite), RecipeCategory.MISC, ItemList.itemIngotAldourite.get(), 0.75F, 20)
                .unlockedBy("smeltaldouritedust", has(ItemList.itemIngotAldourite.get()))
                .save(consumer, new ResourceLocation("extraores:smeltaldouritedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustAluminum), RecipeCategory.MISC, ItemList.itemIngotAluminum.get(), 0.75F, 20)
                .unlockedBy("smeltaluminumdust", has(ItemList.itemIngotAluminum.get()))
                .save(consumer, new ResourceLocation("extraores:smeltaluminumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustAmericium), RecipeCategory.MISC, ItemList.itemIngotAmericium.get(), 0.75F, 20)
                .unlockedBy("smeltamericiumdust", has(ItemList.itemIngotAmericium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltamericiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustAmordrine), RecipeCategory.MISC, ItemList.itemIngotAmordrine.get(), 0.75F, 20)
                .unlockedBy("smeltamordrinedust", has(ItemList.itemIngotAmordrine.get()))
                .save(consumer, new ResourceLocation("extraores:smeltamordrinedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustAngmallen), RecipeCategory.MISC, ItemList.itemIngotAngmallen.get(), 0.75F, 20)
                .unlockedBy("smeltangmallendust", has(ItemList.itemIngotAngmallen.get()))
                .save(consumer, new ResourceLocation("extraores:smeltangmallendust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustAstralSilver), RecipeCategory.MISC, ItemList.itemIngotAstralSilver.get(), 0.75F, 20)
                .unlockedBy("smeltastralsilverdust", has(ItemList.itemIngotAstralSilver.get()))
                .save(consumer, new ResourceLocation("extraores:smeltastralsilverdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustAtlarus), RecipeCategory.MISC, ItemList.itemIngotAtlarus.get(), 0.75F, 20)
                .unlockedBy("smeltatlarusdust", has(ItemList.itemIngotAtlarus.get()))
                .save(consumer, new ResourceLocation("extraores:smeltatlarusdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustBismuth), RecipeCategory.MISC, ItemList.itemIngotBismuth.get(), 0.75F, 20)
                .unlockedBy("smeltbismuthdust", has(ItemList.itemIngotBismuth.get()))
                .save(consumer, new ResourceLocation("extraores:smeltbismuthdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustBlackSteel), RecipeCategory.MISC, ItemList.itemIngotBlackSteel.get(), 0.75F, 20)
                .unlockedBy("smeltblacksteeldust", has(ItemList.itemIngotBlackSteel.get()))
                .save(consumer, new ResourceLocation("extraores:smeltblacksteeldust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustCadmium), RecipeCategory.MISC, ItemList.itemIngotCadmium.get(), 0.75F, 20)
                .unlockedBy("smeltcadmiumdust", has(ItemList.itemIngotCadmium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltcadmiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustCarmot), RecipeCategory.MISC, ItemList.itemIngotCarmot.get(), 0.75F, 20)
                .unlockedBy("smeltcarmotdust", has(ItemList.itemIngotCarmot.get()))
                .save(consumer, new ResourceLocation("extraores:smeltcarmotdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustCelenegil), RecipeCategory.MISC, ItemList.itemIngotCelenegil.get(), 0.75F, 20)
                .unlockedBy("smeltcelenegildust", has(ItemList.itemIngotCelenegil.get()))
                .save(consumer, new ResourceLocation("extraores:smeltcelenegildust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustCeruclase), RecipeCategory.MISC, ItemList.itemIngotCeruclase.get(), 0.75F, 20)
                .unlockedBy("smeltceruclasedust", has(ItemList.itemIngotCeruclase.get()))
                .save(consumer, new ResourceLocation("extraores:smeltceruclasedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustChromium), RecipeCategory.MISC, ItemList.itemIngotChromium.get(), 0.75F, 20)
                .unlockedBy("smeltchromiumdust", has(ItemList.itemIngotChromium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltchromiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustCobalt), RecipeCategory.MISC, ItemList.itemIngotCobalt.get(), 0.75F, 20)
                .unlockedBy("smeltcobaltdust", has(ItemList.itemIngotCobalt.get()))
                .save(consumer, new ResourceLocation("extraores:smeltcobaltdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustCopper), RecipeCategory.MISC, ItemList.itemIngotCopper.get(), 0.75F, 20)
                .unlockedBy("smeltcopperdust", has(ItemList.itemIngotCopper.get()))
                .save(consumer, new ResourceLocation("extraores:smeltcopperdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustCrimsonSteel), RecipeCategory.MISC, ItemList.itemIngotCrimsonSteel.get(), 0.75F, 20)
                .unlockedBy("smeltcrimsonsteeldust", has(ItemList.itemIngotCrimsonSteel.get()))
                .save(consumer, new ResourceLocation("extraores:smeltcrimsonsteeldust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustDeepIron), RecipeCategory.MISC, ItemList.itemIngotDeepIron.get(), 0.75F, 20)
                .unlockedBy("smeltdeepirondust", has(ItemList.itemIngotDeepIron.get()))
                .save(consumer, new ResourceLocation("extraores:smeltdeepirondust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustDesichalkos), RecipeCategory.MISC, ItemList.itemIngotDesichalkos.get(), 0.75F, 20)
                .unlockedBy("smeltdesichalkosdust", has(ItemList.itemIngotDesichalkos.get()))
                .save(consumer, new ResourceLocation("extraores:smeltdesichalkosdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustEximite), RecipeCategory.MISC, ItemList.itemIngotEximite.get(), 0.75F, 20)
                .unlockedBy("smelteximitedust", has(ItemList.itemIngotEximite.get()))
                .save(consumer, new ResourceLocation("extraores:smelteximitedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustGallium), RecipeCategory.MISC, ItemList.itemIngotGallium.get(), 0.75F, 20)
                .unlockedBy("smeltgalliumdust", has(ItemList.itemIngotGallium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltgalliumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustHaderoth), RecipeCategory.MISC, ItemList.itemIngotHaderoth.get(), 0.75F, 20)
                .unlockedBy("smelthaderothdust", has(ItemList.itemIngotHaderoth.get()))
                .save(consumer, new ResourceLocation("extraores:smelthaderothdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustHepatizon), RecipeCategory.MISC, ItemList.itemIngotHepatizon.get(), 0.75F, 20)
                .unlockedBy("smelthepatizondust", has(ItemList.itemIngotHepatizon.get()))
                .save(consumer, new ResourceLocation("extraores:smelthepatizondust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustIgnatius), RecipeCategory.MISC, ItemList.itemIngotIgnatius.get(), 0.75F, 20)
                .unlockedBy("smeltignatiusdust", has(ItemList.itemIngotIgnatius.get()))
                .save(consumer, new ResourceLocation("extraores:smeltignatiusdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustIndium), RecipeCategory.MISC, ItemList.itemIngotIndium.get(), 0.75F, 20)
                .unlockedBy("smeltindiumdust", has(ItemList.itemIngotIndium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltindiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustInfuscolium), RecipeCategory.MISC, ItemList.itemIngotInfuscolium.get(), 0.75F, 20)
                .unlockedBy("smeltinfuscoliumdust", has(ItemList.itemIngotInfuscolium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltinfuscoliumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustInolashite), RecipeCategory.MISC, ItemList.itemIngotInolashite.get(), 0.75F, 20)
                .unlockedBy("smeltinolashitedust", has(ItemList.itemIngotInolashite.get()))
                .save(consumer, new ResourceLocation("extraores:smeltinolashitedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustIridium), RecipeCategory.MISC, ItemList.itemIngotIridium.get(), 0.75F, 20)
                .unlockedBy("smeltiridiumdust", has(ItemList.itemIngotIridium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltiridiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustKalendrite), RecipeCategory.MISC, ItemList.itemIngotKalendrite.get(), 0.75F, 20)
                .unlockedBy("smeltkalendritedust", has(ItemList.itemIngotKalendrite.get()))
                .save(consumer, new ResourceLocation("extraores:smeltkalendritedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustLead), RecipeCategory.MISC, ItemList.itemIngotLead.get(), 0.75F, 20)
                .unlockedBy("smeltleaddust", has(ItemList.itemIngotLead.get()))
                .save(consumer, new ResourceLocation("extraores:smeltleaddust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustLemurite), RecipeCategory.MISC, ItemList.itemIngotLemurite.get(), 0.75F, 20)
                .unlockedBy("smeltlemuritedust", has(ItemList.itemIngotLemurite.get()))
                .save(consumer, new ResourceLocation("extraores:smeltlemuritedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustManganese), RecipeCategory.MISC, ItemList.itemIngotManganese.get(), 0.75F, 20)
                .unlockedBy("smeltmanganesedust", has(ItemList.itemIngotManganese.get()))
                .save(consumer, new ResourceLocation("extraores:smeltmanganesedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustMeutoite), RecipeCategory.MISC, ItemList.itemIngotMeutoite.get(), 0.75F, 20)
                .unlockedBy("smeltmeutoitedust", has(ItemList.itemIngotMeutoite.get()))
                .save(consumer, new ResourceLocation("extraores:smeltmeutoitedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustMidasium), RecipeCategory.MISC, ItemList.itemIngotMidasium.get(), 0.75F, 20)
                .unlockedBy("smeltmidasiumdust", has(ItemList.itemIngotMidasium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltmidasiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustMithril), RecipeCategory.MISC, ItemList.itemIngotMithril.get(), 0.75F, 20)
                .unlockedBy("smeltmithrildust", has(ItemList.itemIngotMithril.get()))
                .save(consumer, new ResourceLocation("extraores:smeltmithrildust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustMolybdenum), RecipeCategory.MISC, ItemList.itemIngotMolybdenum.get(), 0.75F, 20)
                .unlockedBy("smeltmolybdenumdust", has(ItemList.itemIngotMolybdenum.get()))
                .save(consumer, new ResourceLocation("extraores:smeltmolybdenumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustNeodymium), RecipeCategory.MISC, ItemList.itemIngotNeodymium.get(), 0.75F, 20)
                .unlockedBy("smeltneodymiumdust", has(ItemList.itemIngotNeodymium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltneodymiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustNeptunium), RecipeCategory.MISC, ItemList.itemIngotNeptunium.get(), 0.75F, 20)
                .unlockedBy("smeltneptuniumdust", has(ItemList.itemIngotNeptunium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltneptuniumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustNickel), RecipeCategory.MISC, ItemList.itemIngotNickel.get(), 0.75F, 20)
                .unlockedBy("smeltnickeldust", has(ItemList.itemIngotNickel.get()))
                .save(consumer, new ResourceLocation("extraores:smeltnickeldust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustNiobium), RecipeCategory.MISC, ItemList.itemIngotNiobium.get(), 0.75F, 20)
                .unlockedBy("smeltniobiumdust", has(ItemList.itemIngotNiobium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltniobiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustOrichalcum), RecipeCategory.MISC, ItemList.itemIngotOrichalcum.get(), 0.75F, 20)
                .unlockedBy("smeltorichalcumdust", has(ItemList.itemIngotOrichalcum.get()))
                .save(consumer, new ResourceLocation("extraores:smeltorichalcumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustOsmium), RecipeCategory.MISC, ItemList.itemIngotOsmium.get(), 0.75F, 20)
                .unlockedBy("smeltosmiumdust", has(ItemList.itemIngotOsmium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltosmiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustOureclase), RecipeCategory.MISC, ItemList.itemIngotOureclase.get(), 0.75F, 20)
                .unlockedBy("smeltoureclasedust", has(ItemList.itemIngotOureclase.get()))
                .save(consumer, new ResourceLocation("extraores:smeltoureclasedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustPalladium), RecipeCategory.MISC, ItemList.itemIngotPalladium.get(), 0.75F, 20)
                .unlockedBy("smeltpalladiumdust", has(ItemList.itemIngotPalladium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltpalladiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustPlatinum), RecipeCategory.MISC, ItemList.itemIngotPlatinum.get(), 0.75F, 20)
                .unlockedBy("smeltplatinumdust", has(ItemList.itemIngotPlatinum.get()))
                .save(consumer, new ResourceLocation("extraores:smeltplatinumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustPlutonium), RecipeCategory.MISC, ItemList.itemIngotPlutonium.get(), 0.75F, 20)
                .unlockedBy("smeltplutoniumdust", has(ItemList.itemIngotPlutonium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltplutoniumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustPolonium), RecipeCategory.MISC, ItemList.itemIngotPolonium.get(), 0.75F, 20)
                .unlockedBy("smeltpoloniumdust", has(ItemList.itemIngotPolonium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltpoloniumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustPromethium), RecipeCategory.MISC, ItemList.itemIngotPromethium.get(), 0.75F, 20)
                .unlockedBy("smeltpromethiumdust", has(ItemList.itemIngotPromethium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltpromethiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustRhenium), RecipeCategory.MISC, ItemList.itemIngotRhenium.get(), 0.75F, 20)
                .unlockedBy("smeltrheniumdust", has(ItemList.itemIngotRhenium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrheniumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustRhodium), RecipeCategory.MISC, ItemList.itemIngotRhodium.get(), 0.75F, 20)
                .unlockedBy("smeltrhodiumdust", has(ItemList.itemIngotRhodium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrhodiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustRubracium), RecipeCategory.MISC, ItemList.itemIngotRubracium.get(), 0.75F, 20)
                .unlockedBy("smeltrubraciumdust", has(ItemList.itemIngotRubracium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrubraciumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustRuthenium), RecipeCategory.MISC, ItemList.itemIngotRuthenium.get(), 0.75F, 20)
                .unlockedBy("smeltrutheniumdust", has(ItemList.itemIngotRuthenium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltrutheniumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustSanguinite), RecipeCategory.MISC, ItemList.itemIngotSanguinite.get(), 0.75F, 20)
                .unlockedBy("smeltsanguinitedust", has(ItemList.itemIngotSanguinite.get()))
                .save(consumer, new ResourceLocation("extraores:smeltsanguinitedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustShadowIron), RecipeCategory.MISC, ItemList.itemIngotShadowIron.get(), 0.75F, 20)
                .unlockedBy("smeltshadowirondust", has(ItemList.itemIngotShadowIron.get()))
                .save(consumer, new ResourceLocation("extraores:smeltshadowirondust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustSilver), RecipeCategory.MISC, ItemList.itemIngotSilver.get(), 0.75F, 20)
                .unlockedBy("smeltsilverdust", has(ItemList.itemIngotSilver.get()))
                .save(consumer, new ResourceLocation("extraores:smeltsilverdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustTantalum), RecipeCategory.MISC, ItemList.itemIngotTantalum.get(), 0.75F, 20)
                .unlockedBy("smelttantalumdust", has(ItemList.itemIngotTantalum.get()))
                .save(consumer, new ResourceLocation("extraores:smelttantalumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustTartarite), RecipeCategory.MISC, ItemList.itemIngotTartarite.get(), 0.75F, 20)
                .unlockedBy("smelttartaritedust", has(ItemList.itemIngotTartarite.get()))
                .save(consumer, new ResourceLocation("extraores:smelttartaritedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustTechnetium), RecipeCategory.MISC, ItemList.itemIngotTechnetium.get(), 0.75F, 20)
                .unlockedBy("smelttechnetiumdust", has(ItemList.itemIngotTechnetium.get()))
                .save(consumer, new ResourceLocation("extraores:smelttechnetiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustThallium), RecipeCategory.MISC, ItemList.itemIngotThallium.get(), 0.75F, 20)
                .unlockedBy("smeltthalliumdust", has(ItemList.itemIngotThallium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltthalliumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustTin), RecipeCategory.MISC, ItemList.itemIngotTin.get(), 0.75F, 20)
                .unlockedBy("smelttindust", has(ItemList.itemIngotTin.get()))
                .save(consumer, new ResourceLocation("extraores:smelttindust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustTitanium), RecipeCategory.MISC, ItemList.itemIngotTitanium.get(), 0.75F, 20)
                .unlockedBy("smelttitaniumdust", has(ItemList.itemIngotTitanium.get()))
                .save(consumer, new ResourceLocation("extraores:smelttitaniumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustTritium), RecipeCategory.MISC, ItemList.itemIngotTritium.get(), 0.75F, 20)
                .unlockedBy("smelttritiumdust", has(ItemList.itemIngotTritium.get()))
                .save(consumer, new ResourceLocation("extraores:smelttritiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustTungsten), RecipeCategory.MISC, ItemList.itemIngotTungsten.get(), 0.75F, 20)
                .unlockedBy("smelttungstendust", has(ItemList.itemIngotTungsten.get()))
                .save(consumer, new ResourceLocation("extraores:smelttungstendust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustUnobtainium), RecipeCategory.MISC, ItemList.itemIngotUnobtainium.get(), 0.75F, 20)
                .unlockedBy("smeltunobtainiumdust", has(ItemList.itemIngotUnobtainium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltunobtainiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustUranium), RecipeCategory.MISC, ItemList.itemIngotUranium.get(), 0.75f, 20)
                .unlockedBy("smelturaniumdust", has(ItemList.itemIngotUranium.get()))
                .save(consumer, new ResourceLocation("extraores:smelturaniumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustVanadium), RecipeCategory.MISC, ItemList.itemIngotVanadium.get(), 0.75F, 20)
                .unlockedBy("smeltvanadiumdust", has(ItemList.itemIngotVanadium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltvanadiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustVibranium), RecipeCategory.MISC, ItemList.itemIngotVibranium.get(), 0.75F, 20)
                .unlockedBy("smeltvibraniumdust", has(ItemList.itemIngotVibranium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltvibraniumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustVulcanite), RecipeCategory.MISC, ItemList.itemIngotVulcanite.get(), 0.75F, 20)
                .unlockedBy("smeltvulcanitedust", has(ItemList.itemIngotVulcanite.get()))
                .save(consumer, new ResourceLocation("extraores:smeltvulcanitedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustVyroxeres), RecipeCategory.MISC, ItemList.itemIngotVyroxeres.get(), 0.75F, 20)
                .unlockedBy("smeltvyroxeresdust", has(ItemList.itemIngotVyroxeres.get()))
                .save(consumer, new ResourceLocation("extraores:smeltvyroxeresdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustYellorite), RecipeCategory.MISC, ItemList.itemIngotYellorite.get(), 0.75F, 20)
                .unlockedBy("smeltyelloritedust", has(ItemList.itemIngotYellorite.get()))
                .save(consumer, new ResourceLocation("extraores:smeltyelloritedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustZinc), RecipeCategory.MISC, ItemList.itemIngotZinc.get(), 0.75F, 20)
                .unlockedBy("smeltzincdust", has(ItemList.itemIngotZinc.get()))
                .save(consumer, new ResourceLocation("extraores:smeltzincdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustZirconium), RecipeCategory.MISC, ItemList.itemIngotZirconium.get(), 0.75F, 20)
                .unlockedBy("smeltzirconiumdust", has(ItemList.itemIngotZirconium.get()))
                .save(consumer, new ResourceLocation("extraores:smeltzirconiumdust"));
    }

    protected void buildBlastingRecipes(Consumer<FinishedRecipe> consumer)
    {
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreAdamantine.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotAdamantine.get(), 0.75F, 20)
                .unlockedBy("blastadamantineore", has(ItemList.itemIngotAdamantine.get()))
                .save(consumer, new ResourceLocation("extraores:blastadamantineore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreAldourite.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotAldourite.get(), 0.75F, 20)
                .unlockedBy("blastaldouriteore", has(ItemList.itemIngotAldourite.get()))
                .save(consumer, new ResourceLocation("extraores:blastaldouriteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreAluminum.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotAluminum.get(), 0.75F, 20)
                .unlockedBy("blastaluminumore", has(ItemList.itemIngotAluminum.get()))
                .save(consumer, new ResourceLocation("extraores:blastaluminumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreAmericium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotAmericium.get(), 0.75F, 20)
                .unlockedBy("blastamericiumore", has(ItemList.itemIngotAmericium.get()))
                .save(consumer, new ResourceLocation("extraores:blastamericiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreAmordrine.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotAmordrine.get(), 0.75F, 20)
                .unlockedBy("blastamordrineore", has(ItemList.itemIngotAmordrine.get()))
                .save(consumer, new ResourceLocation("extraores:blastamordrineore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreAngmallen.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotAngmallen.get(), 0.75F, 20)
                .unlockedBy("blastangmallenore", has(ItemList.itemIngotAngmallen.get()))
                .save(consumer, new ResourceLocation("extraores:blastangmallenore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreAstralSilver.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotAstralSilver.get(), 0.75F, 20)
                .unlockedBy("blastastralsilverore", has(ItemList.itemIngotAstralSilver.get()))
                .save(consumer, new ResourceLocation("extraores:blastastralsilverore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreAtlarus.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotAtlarus.get(), 0.75F, 20)
                .unlockedBy("blastatlarusore", has(ItemList.itemIngotAtlarus.get()))
                .save(consumer, new ResourceLocation("extraores:blastatlarusore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreBismuth.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotBismuth.get(), 0.75F, 20)
                .unlockedBy("blastbismuthore", has(ItemList.itemIngotBismuth.get()))
                .save(consumer, new ResourceLocation("extraores:blastbismuthore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreBlackSteel.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotBlackSteel.get(), 0.75F, 20)
                .unlockedBy("blastblacksteelore", has(ItemList.itemIngotBlackSteel.get()))
                .save(consumer, new ResourceLocation("extraores:blastblacksteelore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreCadmium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotCadmium.get(), 0.75F, 20)
                .unlockedBy("blastcadmiumore", has(ItemList.itemIngotCadmium.get()))
                .save(consumer, new ResourceLocation("extraores:blastcadmiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreCarmot.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotCarmot.get(), 0.75F, 20)
                .unlockedBy("blastcarmotore", has(ItemList.itemIngotCarmot.get()))
                .save(consumer, new ResourceLocation("extraores:blastcarmotore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreCelenegil.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotCelenegil.get(), 0.75F, 20)
                .unlockedBy("blastcelenegilore", has(ItemList.itemIngotCelenegil.get()))
                .save(consumer, new ResourceLocation("extraores:blastcelenegilore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreCeruclase.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotCeruclase.get(), 0.75F, 20)
                .unlockedBy("blastceruclaseore", has(ItemList.itemIngotCeruclase.get()))
                .save(consumer, new ResourceLocation("extraores:blastceruclaseore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreChromium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotChromium.get(), 0.75F, 20)
                .unlockedBy("blastchromiumore", has(ItemList.itemIngotChromium.get()))
                .save(consumer, new ResourceLocation("extraores:blastchromiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreCobalt.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotCobalt.get(), 0.75F, 20)
                .unlockedBy("blastcobaltore", has(ItemList.itemIngotCobalt.get()))
                .save(consumer, new ResourceLocation("extraores:blastcobaltore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreCopper.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotCopper.get(), 0.75F, 20)
                .unlockedBy("blastcopperore", has(ItemList.itemIngotCopper.get()))
                .save(consumer, new ResourceLocation("extraores:blastcopperore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreCrimsonSteel.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotCrimsonSteel.get(), 0.75F, 20)
                .unlockedBy("blastcrimsonsteelore", has(ItemList.itemIngotCrimsonSteel.get()))
                .save(consumer, new ResourceLocation("extraores:blastcrimsonsteelore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreDeepIron.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotDeepIron.get(), 0.75F, 20)
                .unlockedBy("blastdeepironore", has(ItemList.itemIngotDeepIron.get()))
                .save(consumer, new ResourceLocation("extraores:blastdeepironore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreDesichalkos.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotDesichalkos.get(), 0.75F, 20)
                .unlockedBy("blastdesichalkosore", has(ItemList.itemIngotDesichalkos.get()))
                .save(consumer, new ResourceLocation("extraores:blastdesichalkosore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreEximite.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotEximite.get(), 0.75F, 20)
                .unlockedBy("blasteximiteore", has(ItemList.itemIngotEximite.get()))
                .save(consumer, new ResourceLocation("extraores:blasteximiteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreGallium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotGallium.get(), 0.75F, 20)
                .unlockedBy("blastgalliumore", has(ItemList.itemIngotGallium.get()))
                .save(consumer, new ResourceLocation("extraores:blastgalliumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreHaderoth.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotHaderoth.get(), 0.75F, 20)
                .unlockedBy("blasthaderothore", has(ItemList.itemIngotHaderoth.get()))
                .save(consumer, new ResourceLocation("extraores:blasthaderothore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreHepatizon.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotHepatizon.get(), 0.75F, 20)
                .unlockedBy("blasthepatizonore", has(ItemList.itemIngotHepatizon.get()))
                .save(consumer, new ResourceLocation("extraores:blasthepatizonore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreIgnatius.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotIgnatius.get(), 0.75F, 20)
                .unlockedBy("blastignatiusore", has(ItemList.itemIngotIgnatius.get()))
                .save(consumer, new ResourceLocation("extraores:blastignatiusore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreIndium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotIndium.get(), 0.75F, 20)
                .unlockedBy("blastindiumore", has(ItemList.itemIngotIndium.get()))
                .save(consumer, new ResourceLocation("extraores:blastindiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreInfuscolium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotInfuscolium.get(), 0.75F, 20)
                .unlockedBy("blastinfuscoliumore", has(ItemList.itemIngotInfuscolium.get()))
                .save(consumer, new ResourceLocation("extraores:blastinfuscoliumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreInolashite.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotInolashite.get(), 0.75F, 20)
                .unlockedBy("blastinolashiteore", has(ItemList.itemIngotInolashite.get()))
                .save(consumer, new ResourceLocation("extraores:blastinolashiteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreIridium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotIridium.get(), 0.75F, 20)
                .unlockedBy("blastiridiumore", has(ItemList.itemIngotIridium.get()))
                .save(consumer, new ResourceLocation("extraores:blastiridiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreKalendrite.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotKalendrite.get(), 0.75F, 20)
                .unlockedBy("blastkalendriteore", has(ItemList.itemIngotKalendrite.get()))
                .save(consumer, new ResourceLocation("extraores:blastkalendriteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreLead.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotLead.get(), 0.75F, 20)
                .unlockedBy("blastleadore", has(ItemList.itemIngotLead.get()))
                .save(consumer, new ResourceLocation("extraores:blastleadore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreLemurite.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotLemurite.get(), 0.75F, 20)
                .unlockedBy("blastlemuriteore", has(ItemList.itemIngotLemurite.get()))
                .save(consumer, new ResourceLocation("extraores:blastlemuriteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreManganese.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotManganese.get(), 0.75F, 20)
                .unlockedBy("blastmanganeseore", has(ItemList.itemIngotManganese.get()))
                .save(consumer, new ResourceLocation("extraores:blastmanganeseore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreMeutoite.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotMeutoite.get(), 0.75F, 20)
                .unlockedBy("blastmeutoiteore", has(ItemList.itemIngotMeutoite.get()))
                .save(consumer, new ResourceLocation("extraores:blastmeutoiteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreMidasium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotMidasium.get(), 0.75F, 20)
                .unlockedBy("blastmidasiumore", has(ItemList.itemIngotMidasium.get()))
                .save(consumer, new ResourceLocation("extraores:blastmidasiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreMithril.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotMithril.get(), 0.75F, 20)
                .unlockedBy("blastmithrilore", has(ItemList.itemIngotMithril.get()))
                .save(consumer, new ResourceLocation("extraores:blastmithrilore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreMolybdenum.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotMolybdenum.get(), 0.75F, 20)
                .unlockedBy("blastmolybdenumore", has(ItemList.itemIngotMolybdenum.get()))
                .save(consumer, new ResourceLocation("extraores:blastmolybdenumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreNeodymium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotNeodymium.get(), 0.75F, 20)
                .unlockedBy("blastneodymiumore", has(ItemList.itemIngotNeodymium.get()))
                .save(consumer, new ResourceLocation("extraores:blastneodymiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreNeptunium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotNeptunium.get(), 0.75F, 20)
                .unlockedBy("blastneptuniumore", has(ItemList.itemIngotNeptunium.get()))
                .save(consumer, new ResourceLocation("extraores:blastneptuniumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreNickel.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotNickel.get(), 0.75F, 20)
                .unlockedBy("blastnickelore", has(ItemList.itemIngotNickel.get()))
                .save(consumer, new ResourceLocation("extraores:blastnickelore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreNiobium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotNiobium.get(), 0.75F, 20)
                .unlockedBy("blastniobiumore", has(ItemList.itemIngotNiobium.get()))
                .save(consumer, new ResourceLocation("extraores:blastniobiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreOrichalcum.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotOrichalcum.get(), 0.75F, 20)
                .unlockedBy("blastorichalcumore", has(ItemList.itemIngotOrichalcum.get()))
                .save(consumer, new ResourceLocation("extraores:blastorichalcumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreOureclase.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotOureclase.get(), 0.75F, 20)
                .unlockedBy("blastoureclaseore", has(ItemList.itemIngotOureclase.get()))
                .save(consumer, new ResourceLocation("extraores:blastoureclaseore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOrePalladium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotPalladium.get(), 0.75F, 20)
                .unlockedBy("blastpalladiumore", has(ItemList.itemIngotPalladium.get()))
                .save(consumer, new ResourceLocation("extraores:blastpalladiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOrePlatinum.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotPlatinum.get(), 0.75F, 20)
                .unlockedBy("blastplatinumore", has(ItemList.itemIngotPlatinum.get()))
                .save(consumer, new ResourceLocation("extraores:blastplatinumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOrePlutonium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotPlutonium.get(), 0.75F, 20)
                .unlockedBy("blastplutoniumore", has(ItemList.itemIngotPlutonium.get()))
                .save(consumer, new ResourceLocation("extraores:blastplutoniumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOrePolonium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotPolonium.get(), 0.75F, 20)
                .unlockedBy("blastpoloniumore", has(ItemList.itemIngotPolonium.get()))
                .save(consumer, new ResourceLocation("extraores:blastpoloniumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOrePromethium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotPromethium.get(), 0.75F, 20)
                .unlockedBy("blastpromethiumore", has(ItemList.itemIngotPromethium.get()))
                .save(consumer, new ResourceLocation("extraores:blastpromethiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreRhenium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotRhenium.get(), 0.75F, 20)
                .unlockedBy("blastrheniumore", has(ItemList.itemIngotRhenium.get()))
                .save(consumer, new ResourceLocation("extraores:blastrheniumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreRhodium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotRhodium.get(), 0.75F, 20)
                .unlockedBy("blastrhodiumore", has(ItemList.itemIngotRhodium.get()))
                .save(consumer, new ResourceLocation("extraores:blastrhodiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreRubracium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotRubracium.get(), 0.75F, 20)
                .unlockedBy("blastrubraciumore", has(ItemList.itemIngotRubracium.get()))
                .save(consumer, new ResourceLocation("extraores:blastrubraciumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreRuthenium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotRuthenium.get(), 0.75F, 20)
                .unlockedBy("blastrutheniumore", has(ItemList.itemIngotRuthenium.get()))
                .save(consumer, new ResourceLocation("extraores:blastrutheniumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreSanguinite.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotSanguinite.get(), 0.75F, 20)
                .unlockedBy("blastsanguiniteore", has(ItemList.itemIngotSanguinite.get()))
                .save(consumer, new ResourceLocation("extraores:blastsanguiniteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreShadowIron.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotShadowIron.get(), 0.75F, 20)
                .unlockedBy("blastshadowironore", has(ItemList.itemIngotShadowIron.get()))
                .save(consumer, new ResourceLocation("extraores:blastshadowironore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreSilver.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotSilver.get(), 0.75F, 20)
                .unlockedBy("blastsilverore", has(ItemList.itemIngotSilver.get()))
                .save(consumer, new ResourceLocation("extraores:blastsilverore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreTantalum.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotTantalum.get(), 0.75F, 20)
                .unlockedBy("blasttantalumore", has(ItemList.itemIngotTantalum.get()))
                .save(consumer, new ResourceLocation("extraores:blasttantalumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreTartarite.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotTartarite.get(), 0.75F, 20)
                .unlockedBy("blasttartariteore", has(ItemList.itemIngotTartarite.get()))
                .save(consumer, new ResourceLocation("extraores:blasttartariteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreTechnetium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotTechnetium.get(), 0.75F, 20)
                .unlockedBy("blasttechnetiumore", has(ItemList.itemIngotTechnetium.get()))
                .save(consumer, new ResourceLocation("extraores:blasttechnetiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreThallium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotThallium.get(), 0.75F, 20)
                .unlockedBy("blastthalliumore", has(ItemList.itemIngotThallium.get()))
                .save(consumer, new ResourceLocation("extraores:blastthalliumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreTin.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotTin.get(), 0.75F, 20)
                .unlockedBy("blasttinore", has(ItemList.itemIngotTin.get()))
                .save(consumer, new ResourceLocation("extraores:blasttinore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreTitanium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotTitanium.get(), 0.75F, 20)
                .unlockedBy("blasttitaniumore", has(ItemList.itemIngotTitanium.get()))
                .save(consumer, new ResourceLocation("extraores:blasttitaniumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreTritium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotTritium.get(), 0.75F, 20)
                .unlockedBy("blasttritiumore", has(ItemList.itemIngotTritium.get()))
                .save(consumer, new ResourceLocation("extraores:blasttritiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreTungsten.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotTungsten.get(), 0.75F, 20)
                .unlockedBy("blasttungstenore", has(ItemList.itemIngotTungsten.get()))
                .save(consumer, new ResourceLocation("extraores:blasttungstenore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreUnobtainium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotUnobtainium.get(), 0.75F, 20)
                .unlockedBy("blastunobtainiumore", has(ItemList.itemIngotUnobtainium.get()))
                .save(consumer, new ResourceLocation("extraores:blastunobtainiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreUranium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotUranium.get(), 0.75f, 20)
                .unlockedBy("blasturaniumore", has(ItemList.itemIngotUranium.get()))
                .save(consumer, new ResourceLocation("extraores:blasturaniumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreVanadium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotVanadium.get(), 0.75F, 20)
                .unlockedBy("blastvanadiumore", has(ItemList.itemIngotVanadium.get()))
                .save(consumer, new ResourceLocation("extraores:blastvanadiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreVibranium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotVibranium.get(), 0.75F, 20)
                .unlockedBy("blastvibraniumore", has(ItemList.itemIngotVibranium.get()))
                .save(consumer, new ResourceLocation("extraores:blastvibraniumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreVulcanite.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotVulcanite.get(), 0.75F, 20)
                .unlockedBy("blastvulcaniteore", has(ItemList.itemIngotVulcanite.get()))
                .save(consumer, new ResourceLocation("extraores:blastvulcaniteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreVyroxeres.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotVyroxeres.get(), 0.75F, 20)
                .unlockedBy("blastvyroxeresore", has(ItemList.itemIngotVyroxeres.get()))
                .save(consumer, new ResourceLocation("extraores:blastvyroxeresore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreYellorite.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotYellorite.get(), 0.75F, 20)
                .unlockedBy("blastyelloriteore", has(ItemList.itemIngotYellorite.get()))
                .save(consumer, new ResourceLocation("extraores:blastyelloriteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreZinc.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotZinc.get(), 0.75F, 20)
                .unlockedBy("blastzincore", has(ItemList.itemIngotZinc.get()))
                .save(consumer, new ResourceLocation("extraores:blastzincore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreZirconium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotZirconium.get(), 0.75F, 20)
                .unlockedBy("blastzirconiumore", has(ItemList.itemIngotZirconium.get()))
                .save(consumer, new ResourceLocation("extraores:blastzirconiumore"));
        //Blasting Dust
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustAdamantine.get()), RecipeCategory.MISC, ItemList.itemIngotAdamantine.get(), 0.75F, 10)
                .unlockedBy("blastadamantinedust", has(ItemList.itemIngotAdamantine.get()))
                .save(consumer, new ResourceLocation("extraores:blastadamantinedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustAldourite.get()), RecipeCategory.MISC, ItemList.itemIngotAldourite.get(), 0.75F, 10)
                .unlockedBy("blastaldouritedust", has(ItemList.itemIngotAldourite.get()))
                .save(consumer, new ResourceLocation("extraores:blastaldouritedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustAluminum.get()), RecipeCategory.MISC, ItemList.itemIngotAluminum.get(), 0.75F, 10)
                .unlockedBy("blastaluminumdust", has(ItemList.itemIngotAluminum.get()))
                .save(consumer, new ResourceLocation("extraores:blastaluminumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustAmericium.get()), RecipeCategory.MISC, ItemList.itemIngotAmericium.get(), 0.75F, 10)
                .unlockedBy("blastamericiumdust", has(ItemList.itemIngotAmericium.get()))
                .save(consumer, new ResourceLocation("extraores:blastamericiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustAmordrine.get()), RecipeCategory.MISC, ItemList.itemIngotAmordrine.get(), 0.75F, 10)
                .unlockedBy("blastamordrinedust", has(ItemList.itemIngotAmordrine.get()))
                .save(consumer, new ResourceLocation("extraores:blastamordrinedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustAngmallen.get()), RecipeCategory.MISC, ItemList.itemIngotAngmallen.get(), 0.75F, 10)
                .unlockedBy("blastangmallendust", has(ItemList.itemIngotAngmallen.get()))
                .save(consumer, new ResourceLocation("extraores:blastangmallendust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustAstralSilver.get()), RecipeCategory.MISC, ItemList.itemIngotAstralSilver.get(), 0.75F, 10)
                .unlockedBy("blastastralsilverdust", has(ItemList.itemIngotAstralSilver.get()))
                .save(consumer, new ResourceLocation("extraores:blastastralsilverdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustAtlarus.get()), RecipeCategory.MISC, ItemList.itemIngotAtlarus.get(), 0.75F, 10)
                .unlockedBy("blastatlarusdust", has(ItemList.itemIngotAtlarus.get()))
                .save(consumer, new ResourceLocation("extraores:blastatlarusdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustBismuth.get()), RecipeCategory.MISC, ItemList.itemIngotBismuth.get(), 0.75F, 10)
                .unlockedBy("blastbismuthdust", has(ItemList.itemIngotBismuth.get()))
                .save(consumer, new ResourceLocation("extraores:blastbismuthdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustBlackSteel.get()), RecipeCategory.MISC, ItemList.itemIngotBlackSteel.get(), 0.75F, 10)
                .unlockedBy("blastblacksteeldust", has(ItemList.itemIngotBlackSteel.get()))
                .save(consumer, new ResourceLocation("extraores:blastblacksteeldust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustCadmium.get()), RecipeCategory.MISC, ItemList.itemIngotCadmium.get(), 0.75F, 10)
                .unlockedBy("blastcadmiumdust", has(ItemList.itemIngotCadmium.get()))
                .save(consumer, new ResourceLocation("extraores:blastcadmiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustCarmot.get()), RecipeCategory.MISC, ItemList.itemIngotCarmot.get(), 0.75F, 10)
                .unlockedBy("blastcarmotdust", has(ItemList.itemIngotCarmot.get()))
                .save(consumer, new ResourceLocation("extraores:blastcarmotdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustCelenegil.get()), RecipeCategory.MISC, ItemList.itemIngotCelenegil.get(), 0.75F, 10)
                .unlockedBy("blastcelenegildust", has(ItemList.itemIngotCelenegil.get()))
                .save(consumer, new ResourceLocation("extraores:blastcelenegildust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustCeruclase.get()), RecipeCategory.MISC, ItemList.itemIngotCeruclase.get(), 0.75F, 10)
                .unlockedBy("blastceruclasedust", has(ItemList.itemIngotCeruclase.get()))
                .save(consumer, new ResourceLocation("extraores:blastceruclasedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustChromium.get()), RecipeCategory.MISC, ItemList.itemIngotChromium.get(), 0.75F, 10)
                .unlockedBy("blastchromiumdust", has(ItemList.itemIngotChromium.get()))
                .save(consumer, new ResourceLocation("extraores:blastchromiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustCobalt.get()), RecipeCategory.MISC, ItemList.itemIngotCobalt.get(), 0.75F, 10)
                .unlockedBy("blastcobaltdust", has(ItemList.itemIngotCobalt.get()))
                .save(consumer, new ResourceLocation("extraores:blastcobaltdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustCopper.get()), RecipeCategory.MISC, ItemList.itemIngotCopper.get(), 0.75F, 10)
                .unlockedBy("blastcopperdust", has(ItemList.itemIngotCopper.get()))
                .save(consumer, new ResourceLocation("extraores:blastcopperdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustCrimsonSteel.get()), RecipeCategory.MISC, ItemList.itemIngotCrimsonSteel.get(), 0.75F, 10)
                .unlockedBy("blastcrimsonsteeldust", has(ItemList.itemIngotCrimsonSteel.get()))
                .save(consumer, new ResourceLocation("extraores:blastcrimsonsteeldust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustDeepIron.get()), RecipeCategory.MISC, ItemList.itemIngotDeepIron.get(), 0.75F, 10)
                .unlockedBy("blastdeepirondust", has(ItemList.itemIngotDeepIron.get()))
                .save(consumer, new ResourceLocation("extraores:blastdeepirondust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustDesichalkos.get()), RecipeCategory.MISC, ItemList.itemIngotDesichalkos.get(), 0.75F, 10)
                .unlockedBy("blastdesichalkosdust", has(ItemList.itemIngotDesichalkos.get()))
                .save(consumer, new ResourceLocation("extraores:blastdesichalkosdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustEximite.get()), RecipeCategory.MISC, ItemList.itemIngotEximite.get(), 0.75F, 10)
                .unlockedBy("blasteximitedust", has(ItemList.itemIngotEximite.get()))
                .save(consumer, new ResourceLocation("extraores:blasteximitedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustGallium.get()), RecipeCategory.MISC, ItemList.itemIngotGallium.get(), 0.75F, 10)
                .unlockedBy("blastgalliumdust", has(ItemList.itemIngotGallium.get()))
                .save(consumer, new ResourceLocation("extraores:blastgalliumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustHaderoth.get()), RecipeCategory.MISC, ItemList.itemIngotHaderoth.get(), 0.75F, 10)
                .unlockedBy("blasthaderothdust", has(ItemList.itemIngotHaderoth.get()))
                .save(consumer, new ResourceLocation("extraores:blasthaderothdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustHepatizon.get()), RecipeCategory.MISC, ItemList.itemIngotHepatizon.get(), 0.75F, 10)
                .unlockedBy("blasthepatizondust", has(ItemList.itemIngotHepatizon.get()))
                .save(consumer, new ResourceLocation("extraores:blasthepatizondust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustIgnatius.get()), RecipeCategory.MISC, ItemList.itemIngotIgnatius.get(), 0.75F, 10)
                .unlockedBy("blastignatiusdust", has(ItemList.itemIngotIgnatius.get()))
                .save(consumer, new ResourceLocation("extraores:blastignatiusdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustIndium.get()), RecipeCategory.MISC, ItemList.itemIngotIndium.get(), 0.75F, 10)
                .unlockedBy("blastindiumdust", has(ItemList.itemIngotIndium.get()))
                .save(consumer, new ResourceLocation("extraores:blastindiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustInfuscolium.get()), RecipeCategory.MISC, ItemList.itemIngotInfuscolium.get(), 0.75F, 10)
                .unlockedBy("blastinfuscoliumdust", has(ItemList.itemIngotInfuscolium.get()))
                .save(consumer, new ResourceLocation("extraores:blastinfuscoliumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustInolashite.get()), RecipeCategory.MISC, ItemList.itemIngotInolashite.get(), 0.75F, 10)
                .unlockedBy("blastinolashitedust", has(ItemList.itemIngotInolashite.get()))
                .save(consumer, new ResourceLocation("extraores:blastinolashitedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustIridium.get()), RecipeCategory.MISC, ItemList.itemIngotIridium.get(), 0.75F, 10)
                .unlockedBy("blastiridiumdust", has(ItemList.itemIngotIridium.get()))
                .save(consumer, new ResourceLocation("extraores:blastiridiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustKalendrite.get()), RecipeCategory.MISC, ItemList.itemIngotKalendrite.get(), 0.75F, 10)
                .unlockedBy("blastkalendritedust", has(ItemList.itemIngotKalendrite.get()))
                .save(consumer, new ResourceLocation("extraores:blastkalendritedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustLead.get()), RecipeCategory.MISC, ItemList.itemIngotLead.get(), 0.75F, 10)
                .unlockedBy("blastleaddust", has(ItemList.itemIngotLead.get()))
                .save(consumer, new ResourceLocation("extraores:blastleaddust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustLemurite.get()), RecipeCategory.MISC, ItemList.itemIngotLemurite.get(), 0.75F, 10)
                .unlockedBy("blastlemuritedust", has(ItemList.itemIngotLemurite.get()))
                .save(consumer, new ResourceLocation("extraores:blastlemuritedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustManganese.get()), RecipeCategory.MISC, ItemList.itemIngotManganese.get(), 0.75F, 10)
                .unlockedBy("blastmanganesedust", has(ItemList.itemIngotManganese.get()))
                .save(consumer, new ResourceLocation("extraores:blastmanganesedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustMeutoite.get()), RecipeCategory.MISC, ItemList.itemIngotMeutoite.get(), 0.75F, 10)
                .unlockedBy("blastmeutoitedust", has(ItemList.itemIngotMeutoite.get()))
                .save(consumer, new ResourceLocation("extraores:blastmeutoitedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustMidasium.get()), RecipeCategory.MISC, ItemList.itemIngotMidasium.get(), 0.75F, 10)
                .unlockedBy("blastmidasiumdust", has(ItemList.itemIngotMidasium.get()))
                .save(consumer, new ResourceLocation("extraores:blastmidasiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustMithril.get()), RecipeCategory.MISC, ItemList.itemIngotMithril.get(), 0.75F, 10)
                .unlockedBy("blastmithrildust", has(ItemList.itemIngotMithril.get()))
                .save(consumer, new ResourceLocation("extraores:blastmithrildust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustMolybdenum.get()), RecipeCategory.MISC, ItemList.itemIngotMolybdenum.get(), 0.75F, 10)
                .unlockedBy("blastmolybdenumdust", has(ItemList.itemIngotMolybdenum.get()))
                .save(consumer, new ResourceLocation("extraores:blastmolybdenumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustNeodymium.get()), RecipeCategory.MISC, ItemList.itemIngotNeodymium.get(), 0.75F, 10)
                .unlockedBy("blastneodymiumdust", has(ItemList.itemIngotNeodymium.get()))
                .save(consumer, new ResourceLocation("extraores:blastneodymiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustNeptunium.get()), RecipeCategory.MISC, ItemList.itemIngotNeptunium.get(), 0.75F, 10)
                .unlockedBy("blastneptuniumdust", has(ItemList.itemIngotNeptunium.get()))
                .save(consumer, new ResourceLocation("extraores:blastneptuniumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustNickel.get()), RecipeCategory.MISC, ItemList.itemIngotNickel.get(), 0.75F, 10)
                .unlockedBy("blastnickeldust", has(ItemList.itemIngotNickel.get()))
                .save(consumer, new ResourceLocation("extraores:blastnickeldust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustNiobium.get()), RecipeCategory.MISC, ItemList.itemIngotNiobium.get(), 0.75F, 10)
                .unlockedBy("blastniobiumdust", has(ItemList.itemIngotNiobium.get()))
                .save(consumer, new ResourceLocation("extraores:blastniobiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustOrichalcum.get()), RecipeCategory.MISC, ItemList.itemIngotOrichalcum.get(), 0.75F, 10)
                .unlockedBy("blastorichalcumdust", has(ItemList.itemIngotOrichalcum.get()))
                .save(consumer, new ResourceLocation("extraores:blastorichalcumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustOureclase.get()), RecipeCategory.MISC, ItemList.itemIngotOureclase.get(), 0.75F, 10)
                .unlockedBy("blastoureclasedust", has(ItemList.itemIngotOureclase.get()))
                .save(consumer, new ResourceLocation("extraores:blastoureclasedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustPalladium.get()), RecipeCategory.MISC, ItemList.itemIngotPalladium.get(), 0.75F, 10)
                .unlockedBy("blastpalladiumdust", has(ItemList.itemIngotPalladium.get()))
                .save(consumer, new ResourceLocation("extraores:blastpalladiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustPlatinum.get()), RecipeCategory.MISC, ItemList.itemIngotPlatinum.get(), 0.75F, 10)
                .unlockedBy("blastplatinumdust", has(ItemList.itemIngotPlatinum.get()))
                .save(consumer, new ResourceLocation("extraores:blastplatinumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustPlutonium.get()), RecipeCategory.MISC, ItemList.itemIngotPlutonium.get(), 0.75F, 10)
                .unlockedBy("blastplutoniumdust", has(ItemList.itemIngotPlutonium.get()))
                .save(consumer, new ResourceLocation("extraores:blastplutoniumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustPolonium.get()), RecipeCategory.MISC, ItemList.itemIngotPolonium.get(), 0.75F, 10)
                .unlockedBy("blastpoloniumdust", has(ItemList.itemIngotPolonium.get()))
                .save(consumer, new ResourceLocation("extraores:blastpoloniumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustPromethium.get()), RecipeCategory.MISC, ItemList.itemIngotPromethium.get(), 0.75F, 10)
                .unlockedBy("blastpromethiumdust", has(ItemList.itemIngotPromethium.get()))
                .save(consumer, new ResourceLocation("extraores:blastpromethiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustRhenium.get()), RecipeCategory.MISC, ItemList.itemIngotRhenium.get(), 0.75F, 10)
                .unlockedBy("blastrheniumdust", has(ItemList.itemIngotRhenium.get()))
                .save(consumer, new ResourceLocation("extraores:blastrheniumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustRhodium.get()), RecipeCategory.MISC, ItemList.itemIngotRhodium.get(), 0.75F, 10)
                .unlockedBy("blastrhodiumdust", has(ItemList.itemIngotRhodium.get()))
                .save(consumer, new ResourceLocation("extraores:blastrhodiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustRubracium.get()), RecipeCategory.MISC, ItemList.itemIngotRubracium.get(), 0.75F, 10)
                .unlockedBy("blastrubraciumdust", has(ItemList.itemIngotRubracium.get()))
                .save(consumer, new ResourceLocation("extraores:blastrubraciumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustRuthenium.get()), RecipeCategory.MISC, ItemList.itemIngotRuthenium.get(), 0.75F, 10)
                .unlockedBy("blastrutheniumdust", has(ItemList.itemIngotRuthenium.get()))
                .save(consumer, new ResourceLocation("extraores:blastrutheniumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustSanguinite.get()), RecipeCategory.MISC, ItemList.itemIngotSanguinite.get(), 0.75F, 10)
                .unlockedBy("blastsanguinitedust", has(ItemList.itemIngotSanguinite.get()))
                .save(consumer, new ResourceLocation("extraores:blastsanguinitedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustShadowIron.get()), RecipeCategory.MISC, ItemList.itemIngotShadowIron.get(), 0.75F, 10)
                .unlockedBy("blastshadowirondust", has(ItemList.itemIngotShadowIron.get()))
                .save(consumer, new ResourceLocation("extraores:blastshadowirondust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustSilver.get()), RecipeCategory.MISC, ItemList.itemIngotSilver.get(), 0.75F, 10)
                .unlockedBy("blastsilverdust", has(ItemList.itemIngotSilver.get()))
                .save(consumer, new ResourceLocation("extraores:blastsilverdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustTantalum.get()), RecipeCategory.MISC, ItemList.itemIngotTantalum.get(), 0.75F, 10)
                .unlockedBy("blasttantalumdust", has(ItemList.itemIngotTantalum.get()))
                .save(consumer, new ResourceLocation("extraores:blasttantalumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustTartarite.get()), RecipeCategory.MISC, ItemList.itemIngotTartarite.get(), 0.75F, 10)
                .unlockedBy("blasttartaritedust", has(ItemList.itemIngotTartarite.get()))
                .save(consumer, new ResourceLocation("extraores:blasttartaritedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustTechnetium.get()), RecipeCategory.MISC, ItemList.itemIngotTechnetium.get(), 0.75F, 10)
                .unlockedBy("blasttechnetiumdust", has(ItemList.itemIngotTechnetium.get()))
                .save(consumer, new ResourceLocation("extraores:blasttechnetiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustThallium.get()), RecipeCategory.MISC, ItemList.itemIngotThallium.get(), 0.75F, 10)
                .unlockedBy("blastthalliumdust", has(ItemList.itemIngotThallium.get()))
                .save(consumer, new ResourceLocation("extraores:blastthalliumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustTin.get()), RecipeCategory.MISC, ItemList.itemIngotTin.get(), 0.75F, 10)
                .unlockedBy("blasttindust", has(ItemList.itemIngotTin.get()))
                .save(consumer, new ResourceLocation("extraores:blasttindust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustTitanium.get()), RecipeCategory.MISC, ItemList.itemIngotTitanium.get(), 0.75F, 10)
                .unlockedBy("blasttitaniumdust", has(ItemList.itemIngotTitanium.get()))
                .save(consumer, new ResourceLocation("extraores:blasttitaniumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustTritium.get()), RecipeCategory.MISC, ItemList.itemIngotTritium.get(), 0.75F, 10)
                .unlockedBy("blasttritiumdust", has(ItemList.itemIngotTritium.get()))
                .save(consumer, new ResourceLocation("extraores:blasttritiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustTungsten.get()), RecipeCategory.MISC, ItemList.itemIngotTungsten.get(), 0.75F, 10)
                .unlockedBy("blasttungstendust", has(ItemList.itemIngotTungsten.get()))
                .save(consumer, new ResourceLocation("extraores:blasttungstendust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustUnobtainium.get()), RecipeCategory.MISC, ItemList.itemIngotUnobtainium.get(), 0.75F, 10)
                .unlockedBy("blastunobtainiumdust", has(ItemList.itemIngotUnobtainium.get()))
                .save(consumer, new ResourceLocation("extraores:blastunobtainiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustUranium.get()), RecipeCategory.MISC, ItemList.itemIngotUranium.get(), 0.75f, 10)
                .unlockedBy("blasturaniumdust", has(ItemList.itemIngotUranium.get()))
                .save(consumer, new ResourceLocation("extraores:blasturaniumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustVanadium.get()), RecipeCategory.MISC, ItemList.itemIngotVanadium.get(), 0.75F, 10)
                .unlockedBy("blastvanadiumdust", has(ItemList.itemIngotVanadium.get()))
                .save(consumer, new ResourceLocation("extraores:blastvanadiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustVibranium.get()), RecipeCategory.MISC, ItemList.itemIngotVibranium.get(), 0.75F, 10)
                .unlockedBy("blastvibraniumdust", has(ItemList.itemIngotVibranium.get()))
                .save(consumer, new ResourceLocation("extraores:blastvibraniumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustVulcanite.get()), RecipeCategory.MISC, ItemList.itemIngotVulcanite.get(), 0.75F, 10)
                .unlockedBy("blastvulcanitedust", has(ItemList.itemIngotVulcanite.get()))
                .save(consumer, new ResourceLocation("extraores:blastvulcanitedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustVyroxeres.get()), RecipeCategory.MISC, ItemList.itemIngotVyroxeres.get(), 0.75F, 10)
                .unlockedBy("blastvyroxeresdust", has(ItemList.itemIngotVyroxeres.get()))
                .save(consumer, new ResourceLocation("extraores:blastvyroxeresdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustYellorite.get()), RecipeCategory.MISC, ItemList.itemIngotYellorite.get(), 0.75F, 10)
                .unlockedBy("blastyelloritedust", has(ItemList.itemIngotYellorite.get()))
                .save(consumer, new ResourceLocation("extraores:blastyelloritedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustZinc.get()), RecipeCategory.MISC, ItemList.itemIngotZinc.get(), 0.75F, 10)
                .unlockedBy("blastzincdust", has(ItemList.itemIngotZinc.get()))
                .save(consumer, new ResourceLocation("extraores:blastzincdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustZirconium.get()), RecipeCategory.MISC, ItemList.itemIngotZirconium.get(), 0.75F, 10)
                .unlockedBy("blastzirconiumdust", has(ItemList.itemIngotZirconium.get()))
                .save(consumer, new ResourceLocation("extraores:blastzirconiumdust"));
    }
    /*
    protected void buildMekanismInjecting(Consumer<FinishedRecipe> consumer)
    {
        //Ore
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreAdamantine), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardAdamantine.get(),4))
                .addCriterion("injectadamantineore",has(BlockList.blockOreAdamantine.get()))
                .build(consumer,new ResourceLocation("extraores:injectadamantineore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreAldourite),IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardAldourite.get(),4))
                .addCriterion("injectaldouriteore",has(BlockList.blockOreAldourite.get()))
                .build(consumer,new ResourceLocation("extraores:injectaldouriteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreAluminum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardAluminum.get(),4))
                .addCriterion("injectaluminumore",has(BlockList.blockOreAluminum.get()))
                .build(consumer,new ResourceLocation("extraores:injectaluminumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreAmericium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardAmericium.get(),4))
                .addCriterion("injectamericiumore",has(BlockList.blockOreAmericium.get()))
                .build(consumer,new ResourceLocation("extraores:injectamericiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreAmordrine), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardAmordrine.get(),4))
                .addCriterion("injectamordrineore",has(BlockList.blockOreAmordrine.get()))
                .build(consumer,new ResourceLocation("extraores:injectamordrineore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreAngmallen), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardAngmallen.get(),4))
                .addCriterion("injectangmallenore",has(BlockList.blockOreAngmallen.get()))
                .build(consumer,new ResourceLocation("extraores:injectangmallenore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreAstralSilver), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardAstralSilver.get(),4))
                .addCriterion("injectastralsilverore",has(BlockList.blockOreAstralSilver.get()))
                .build(consumer,new ResourceLocation("extraores:injectastralsilverore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreAtlarus), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardAtlarus.get(),4))
                .addCriterion("injectatlarusore",has(BlockList.blockOreAtlarus.get()))
                .build(consumer,new ResourceLocation("extraores:injectatlarusore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreBismuth), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardBismuth.get(),4))
                .addCriterion("injectbismuthore",has(BlockList.blockOreBismuth.get()))
                .build(consumer,new ResourceLocation("extraores:injectbismuthore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreBlackSteel), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardBlackSteel.get(),4))
                .addCriterion("injectblacksteelore",has(BlockList.blockOreBlackSteel.get()))
                .build(consumer,new ResourceLocation("extraores:injectblacksteelore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreCadmium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardCadmium.get(),4))
                .addCriterion("injectcadmiumore",has(BlockList.blockOreCadmium.get()))
                .build(consumer,new ResourceLocation("extraores:injectcadmiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreCarmot), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardCarmot.get(),4))
                .addCriterion("injectcarmotore",has(BlockList.blockOreCarmot.get()))
                .build(consumer,new ResourceLocation("extraores:injectcarmotore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreCelenegil), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardCelenegil.get(),4))
                .addCriterion("injectcelenegilore",has(BlockList.blockOreCelenegil.get()))
                .build(consumer,new ResourceLocation("extraores:injectcelenegilore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreCeruclase), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardCeruclase.get(),4))
                .addCriterion("injectceruclaseore",has(BlockList.blockOreCeruclase.get()))
                .build(consumer,new ResourceLocation("extraores:injectceruclaseore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreChromium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardChromium.get(),4))
                .addCriterion("injectchromiumore",has(BlockList.blockOreChromium.get()))
                .build(consumer,new ResourceLocation("extraores:injectchromiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreCobalt), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardCobalt.get(),4))
                .addCriterion("injectcobaltore",has(BlockList.blockOreCobalt.get()))
                .build(consumer,new ResourceLocation("extraores:injectcobaltore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreCopper), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardCopper.get(),4))
                .addCriterion("injectcopperore",has(BlockList.blockOreCopper.get()))
                .build(consumer,new ResourceLocation("extraores:injectcopperore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreCrimsonSteel), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardCrimsonSteel.get(),4))
                .addCriterion("injectcrimsonsteelore",has(BlockList.blockOreCrimsonSteel.get()))
                .build(consumer,new ResourceLocation("extraores:injectcrimsonsteelore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreDeepIron), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardDeepIron.get(),4))
                .addCriterion("injectdeepironore",has(BlockList.blockOreDeepIron.get()))
                .build(consumer,new ResourceLocation("extraores:injectdeepironore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreDesichalkos), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardDesichalkos.get(),4))
                .addCriterion("injectdesichalkosore",has(BlockList.blockOreDesichalkos.get()))
                .build(consumer,new ResourceLocation("extraores:injectdesichalkosore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreEximite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardEximite.get(),4))
                .addCriterion("injecteximiteore",has(BlockList.blockOreEximite.get()))
                .build(consumer,new ResourceLocation("extraores:injecteximiteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreGallium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardGallium.get(),4))
                .addCriterion("injectgalliumore",has(BlockList.blockOreGallium.get()))
                .build(consumer,new ResourceLocation("extraores:injectgalliumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreHaderoth), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardHaderoth.get(),4))
                .addCriterion("injecthaderothore",has(BlockList.blockOreHaderoth.get()))
                .build(consumer,new ResourceLocation("extraores:injecthaderothore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreHepatizon), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardHepatizon.get(),4))
                .addCriterion("injecthepatizonore",has(BlockList.blockOreHepatizon.get()))
                .build(consumer,new ResourceLocation("extraores:injecthepatizonore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreIgnatius), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardIgnatius.get(),4))
                .addCriterion("injectignatiusore",has(BlockList.blockOreIgnatius.get()))
                .build(consumer,new ResourceLocation("extraores:injectignatiusore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreIndium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardIndium.get(),4))
                .addCriterion("injectindiumore",has(BlockList.blockOreIndium.get()))
                .build(consumer,new ResourceLocation("extraores:injectindiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreInfuscolium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardInfuscolium.get(),4))
                .addCriterion("injectinfuscoliumore",has(BlockList.blockOreInfuscolium.get()))
                .build(consumer,new ResourceLocation("extraores:injectinfuscoliumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreInolashite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardInolashite.get(),4))
                .addCriterion("injectinolashiteore",has(BlockList.blockOreInolashite.get()))
                .build(consumer,new ResourceLocation("extraores:injectinolashiteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreIridium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardIridium.get(),4))
                .addCriterion("injectiridiumore",has(BlockList.blockOreIridium.get()))
                .build(consumer,new ResourceLocation("extraores:injectiridiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreKalendrite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardKalendrite.get(),4))
                .addCriterion("injectkalendriteore",has(BlockList.blockOreKalendrite.get()))
                .build(consumer,new ResourceLocation("extraores:injectkalendriteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreLead), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardLead.get(),4))
                .addCriterion("injectleadore",has(BlockList.blockOreLead.get()))
                .build(consumer,new ResourceLocation("extraores:injectleadore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreLemurite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardLemurite.get(),4))
                .addCriterion("injectlemuriteore",has(BlockList.blockOreLemurite.get()))
                .build(consumer,new ResourceLocation("extraores:injectlemuriteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreManganese), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardManganese.get(),4))
                .addCriterion("injectmanganeseore",has(BlockList.blockOreManganese.get()))
                .build(consumer,new ResourceLocation("extraores:injectmanganeseore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreMeutoite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardMeutoite.get(),4))
                .addCriterion("injectmeutoiteore",has(BlockList.blockOreMeutoite.get()))
                .build(consumer,new ResourceLocation("extraores:injectmeutoiteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreMidasium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardMidasium.get(),4))
                .addCriterion("injectmidasiumore",has(BlockList.blockOreMidasium.get()))
                .build(consumer,new ResourceLocation("extraores:injectmidasiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreMithril), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardMithril.get(),4))
                .addCriterion("injectmithrilore",has(BlockList.blockOreMithril.get()))
                .build(consumer,new ResourceLocation("extraores:injectmithrilore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreMolybdenum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardMolybdenum.get(),4))
                .addCriterion("injectmolybdenumore",has(BlockList.blockOreMolybdenum.get()))
                .build(consumer,new ResourceLocation("extraores:injectmolybdenumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreNeodymium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardNeodymium.get(),4))
                .addCriterion("injectneodymiumore",has(BlockList.blockOreNeodymium.get()))
                .build(consumer,new ResourceLocation("extraores:injectneodymiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreNeptunium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardNeptunium.get(),4))
                .addCriterion("injectneptuniumore",has(BlockList.blockOreNeptunium.get()))
                .build(consumer,new ResourceLocation("extraores:injectneptuniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreNickel), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardNickel.get(),4))
                .addCriterion("injectnickelore",has(BlockList.blockOreNickel.get()))
                .build(consumer,new ResourceLocation("extraores:injectnickelore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreNiobium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardNiobium.get(),4))
                .addCriterion("injectniobiumore",has(BlockList.blockOreNiobium.get()))
                .build(consumer,new ResourceLocation("extraores:injectniobiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreOrichalcum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardOrichalcum.get(),4))
                .addCriterion("injectorichalcumore",has(BlockList.blockOreOrichalcum.get()))
                .build(consumer,new ResourceLocation("extraores:injectorichalcumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreOsmium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardOsmium.get(),4))
                .addCriterion("injectosmiumore",has(BlockList.blockOreOsmium.get()))
                .build(consumer,new ResourceLocation("extraores:injectosmiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreOureclase), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardOureclase.get(),4))
                .addCriterion("injectoureclaseore",has(BlockList.blockOreOureclase.get()))
                .build(consumer,new ResourceLocation("extraores:injectoureclaseore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.orePalladium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardPalladium.get(),4))
                .addCriterion("injectpalladiumore",has(BlockList.blockOrePalladium.get()))
                .build(consumer,new ResourceLocation("extraores:injectpalladiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.orePlatinum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardPlatinum.get(),4))
                .addCriterion("injectplatinumore",has(BlockList.blockOrePlatinum.get()))
                .build(consumer,new ResourceLocation("extraores:injectplatinumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.orePlutonium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardPlutonium.get(),4))
                .addCriterion("injectplutoniumore",has(BlockList.blockOrePlutonium.get()))
                .build(consumer,new ResourceLocation("extraores:injectplutoniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.orePolonium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardPolonium.get(),4))
                .addCriterion("injectpoloniumore",has(BlockList.blockOrePolonium.get()))
                .build(consumer,new ResourceLocation("extraores:injectpoloniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.orePromethium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardPromethium.get(),4))
                .addCriterion("injectpromethiumore",has(BlockList.blockOrePromethium.get()))
                .build(consumer,new ResourceLocation("extraores:injectpromethiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreRhenium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardRhenium.get(),4))
                .addCriterion("injectrheniumore",has(BlockList.blockOreRhenium.get()))
                .build(consumer,new ResourceLocation("extraores:injectrheniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreRhodium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardRhodium.get(),4))
                .addCriterion("injectrhodiumore",has(BlockList.blockOreRhodium.get()))
                .build(consumer,new ResourceLocation("extraores:injectrhodiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreRubracium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardRubracium.get(),4))
                .addCriterion("injectrubraciumore",has(BlockList.blockOreRubracium.get()))
                .build(consumer,new ResourceLocation("extraores:injectrubraciumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreRuthenium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardRuthenium.get(),4))
                .addCriterion("injectrutheniumore",has(BlockList.blockOreRuthenium.get()))
                .build(consumer,new ResourceLocation("extraores:injectrutheniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreSanguinite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardSanguinite.get(),4))
                .addCriterion("injectsanguiniteore",has(BlockList.blockOreSanguinite.get()))
                .build(consumer,new ResourceLocation("extraores:injectsanguiniteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreShadowIron), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardShadowIron.get(),4))
                .addCriterion("injectshadowironore",has(BlockList.blockOreShadowIron.get()))
                .build(consumer,new ResourceLocation("extraores:injectshadowironore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreSilver), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardSilver.get(),4))
                .addCriterion("injectsilverore",has(BlockList.blockOreSilver.get()))
                .build(consumer,new ResourceLocation("extraores:injectsilverore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreTantalum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardTantalum.get(),4))
                .addCriterion("injecttantalumore",has(BlockList.blockOreTantalum.get()))
                .build(consumer,new ResourceLocation("extraores:injecttantalumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreTartarite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardTartarite.get(),4))
                .addCriterion("injecttartariteore",has(BlockList.blockOreTartarite.get()))
                .build(consumer,new ResourceLocation("extraores:injecttartariteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreTechnetium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardTechnetium.get(),4))
                .addCriterion("injecttechnetiumore",has(BlockList.blockOreTechnetium.get()))
                .build(consumer,new ResourceLocation("extraores:injecttechnetiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreThallium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardThallium.get(),4))
                .addCriterion("injectthalliumore",has(BlockList.blockOreThallium.get()))
                .build(consumer,new ResourceLocation("extraores:injectthalliumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreTin), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardTin.get(),4))
                .addCriterion("injecttinore",has(BlockList.blockOreTin.get()))
                .build(consumer,new ResourceLocation("extraores:injecttinore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreTritium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardTritium.get(),4))
                .addCriterion("injecttritiumore",has(BlockList.blockOreTritium.get()))
                .build(consumer,new ResourceLocation("extraores:injecttritiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreTungsten), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardTungsten.get(),4))
                .addCriterion("injecttungstenore",has(BlockList.blockOreTungsten.get()))
                .build(consumer,new ResourceLocation("extraores:injecttungstenore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreUnobtainium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardUnobtainium.get(),4))
                .addCriterion("injectunobtainiumore",has(BlockList.blockOreUnobtainium.get()))
                .build(consumer,new ResourceLocation("extraores:injectunobtainiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreUranium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardUranium.get(),4))
                .addCriterion("injecturaniumore",has(BlockList.blockOreUranium.get()))
                .build(consumer,new ResourceLocation("extraores:injecturaniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreVanadium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardVanadium.get(),4))
                .addCriterion("injectvanadiumore",has(BlockList.blockOreVanadium.get()))
                .build(consumer,new ResourceLocation("extraores:injectvanadiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreVibranium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardVibranium.get(),4))
                .addCriterion("injectvibraniumore",has(BlockList.blockOreVibranium.get()))
                .build(consumer,new ResourceLocation("extraores:injectvibraniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreVulcanite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardVulcanite.get(),4))
                .addCriterion("injectvulcaniteore",has(BlockList.blockOreVulcanite.get()))
                .build(consumer,new ResourceLocation("extraores:injectvulcaniteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreVyroxeres), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardVyroxeres.get(),4))
                .addCriterion("injectvyroxeresore",has(BlockList.blockOreVyroxeres.get()))
                .build(consumer,new ResourceLocation("extraores:injectvyroxeresore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreYellorite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardYellorite.get(),4))
                .addCriterion("injectyelloriteore",has(BlockList.blockOreYellorite.get()))
                .build(consumer,new ResourceLocation("extraores:injectyelloriteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreZinc), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardZinc.get(),4))
                .addCriterion("injectzincore",has(BlockList.blockOreZinc.get()))
                .build(consumer,new ResourceLocation("extraores:injectzincore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreZirconium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardZirconium.get(),4))
                .addCriterion("injectzirconiumore",has(BlockList.blockOreZirconium.get()))
                .build(consumer,new ResourceLocation("extraores:injectzirconiumore"));
        //Raw
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawAdamantine), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardAdamantine.get(),4))
                .addCriterion("injectrawadamantine",has(BlockList.blockOreAdamantine.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawadamantine"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawAldourite),IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardAldourite.get(),4))
                .addCriterion("injectrawaldourite",has(BlockList.blockOreAldourite.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawaldourite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawAluminum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardAluminum.get(),4))
                .addCriterion("injectrawaluminum",has(BlockList.blockOreAluminum.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawaluminum"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawAmericium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardAmericium.get(),4))
                .addCriterion("injectrawamericium",has(BlockList.blockOreAmericium.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawamericium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawAmordrine), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardAmordrine.get(),4))
                .addCriterion("injectrawamordrine",has(BlockList.blockOreAmordrine.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawamordrine"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawAngmallen), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardAngmallen.get(),4))
                .addCriterion("injectrawangmallen",has(BlockList.blockOreAngmallen.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawangmallen"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawAstralSilver), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardAstralSilver.get(),4))
                .addCriterion("injectrawastralsilver",has(BlockList.blockOreAstralSilver.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawastralsilver"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawAtlarus), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardAtlarus.get(),4))
                .addCriterion("injectrawatlarus",has(BlockList.blockOreAtlarus.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawatlarus"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawBismuth), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardBismuth.get(),4))
                .addCriterion("injectrawbismuth",has(BlockList.blockOreBismuth.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawbismuth"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawBlackSteel), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardBlackSteel.get(),4))
                .addCriterion("injectrawblacksteel",has(BlockList.blockOreBlackSteel.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawblacksteel"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawCadmium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardCadmium.get(),4))
                .addCriterion("injectrawcadmium",has(BlockList.blockOreCadmium.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawcadmium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawCarmot), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardCarmot.get(),4))
                .addCriterion("injectrawcarmot",has(BlockList.blockOreCarmot.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawcarmot"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawCelenegil), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardCelenegil.get(),4))
                .addCriterion("injectrawcelenegil",has(BlockList.blockOreCelenegil.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawcelenegil"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawCeruclase), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardCeruclase.get(),4))
                .addCriterion("injectrawceruclase",has(BlockList.blockOreCeruclase.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawceruclase"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawChromium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardChromium.get(),4))
                .addCriterion("injectrawchromium",has(BlockList.blockOreChromium.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawchromium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawCobalt), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardCobalt.get(),4))
                .addCriterion("injectrawcobalt",has(BlockList.blockOreCobalt.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawcobalt"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawCopper), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardCopper.get(),4))
                .addCriterion("injectrawcopper",has(BlockList.blockOreCopper.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawcopper"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawCrimsonSteel), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardCrimsonSteel.get(),4))
                .addCriterion("injectrawcrimsonsteel",has(BlockList.blockOreCrimsonSteel.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawcrimsonsteel"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawDeepIron), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardDeepIron.get(),4))
                .addCriterion("injectrawdeepiron",has(BlockList.blockOreDeepIron.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawdeepiron"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawDesichalkos), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardDesichalkos.get(),4))
                .addCriterion("injectrawdesichalkos",has(BlockList.blockOreDesichalkos.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawdesichalkos"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawEximite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardEximite.get(),4))
                .addCriterion("injectraweximite",has(BlockList.blockOreEximite.get()))
                .build(consumer,new ResourceLocation("extraores:injectraweximite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawGallium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardGallium.get(),4))
                .addCriterion("injectrawgallium",has(BlockList.blockOreGallium.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawgallium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawHaderoth), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardHaderoth.get(),4))
                .addCriterion("injectrawhaderoth",has(BlockList.blockOreHaderoth.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawhaderoth"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawHepatizon), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardHepatizon.get(),4))
                .addCriterion("injectrawhepatizon",has(BlockList.blockOreHepatizon.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawhepatizon"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawIgnatius), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardIgnatius.get(),4))
                .addCriterion("injectrawignatius",has(BlockList.blockOreIgnatius.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawignatius"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawIndium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardIndium.get(),4))
                .addCriterion("injectrawindium",has(BlockList.blockOreIndium.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawindium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawInfuscolium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardInfuscolium.get(),4))
                .addCriterion("injectrawinfuscolium",has(BlockList.blockOreInfuscolium.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawinfuscolium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawInolashite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardInolashite.get(),4))
                .addCriterion("injectrawinolashite",has(BlockList.blockOreInolashite.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawinolashite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawIridium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardIridium.get(),4))
                .addCriterion("injectrawiridium",has(BlockList.blockOreIridium.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawiridium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawKalendrite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardKalendrite.get(),4))
                .addCriterion("injectrawkalendrite",has(BlockList.blockOreKalendrite.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawkalendrite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawLead), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardLead.get(),4))
                .addCriterion("injectrawlead",has(BlockList.blockOreLead.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawlead"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawLemurite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardLemurite.get(),4))
                .addCriterion("injectrawlemurite",has(BlockList.blockOreLemurite.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawlemurite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawManganese), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardManganese.get(),4))
                .addCriterion("injectrawmanganese",has(BlockList.blockOreManganese.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawmanganese"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawMeutoite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardMeutoite.get(),4))
                .addCriterion("injectrawmeutoite",has(BlockList.blockOreMeutoite.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawmeutoite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawMidasium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardMidasium.get(),4))
                .addCriterion("injectrawmidasium",has(BlockList.blockOreMidasium.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawmidasium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawMithril), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardMithril.get(),4))
                .addCriterion("injectrawmithril",has(BlockList.blockOreMithril.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawmithril"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawMolybdenum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardMolybdenum.get(),4))
                .addCriterion("injectrawmolybdenum",has(BlockList.blockOreMolybdenum.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawmolybdenum"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawNeodymium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardNeodymium.get(),4))
                .addCriterion("injectrawneodymium",has(BlockList.blockOreNeodymium.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawneodymium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawNeptunium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardNeptunium.get(),4))
                .addCriterion("injectrawneptunium",has(BlockList.blockOreNeptunium.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawneptunium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawNickel), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardNickel.get(),4))
                .addCriterion("injectrawnickel",has(BlockList.blockOreNickel.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawnickel"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawNiobium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardNiobium.get(),4))
                .addCriterion("injectrawniobium",has(BlockList.blockOreNiobium.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawniobium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawOrichalcum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardOrichalcum.get(),4))
                .addCriterion("injectraworichalcum",has(BlockList.blockOreOrichalcum.get()))
                .build(consumer,new ResourceLocation("extraores:injectraworichalcum"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawOsmium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardOsmium.get(),4))
                .addCriterion("injectrawosmium",has(BlockList.blockOreOsmium.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawosmium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawOureclase), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardOureclase.get(),4))
                .addCriterion("injectrawoureclase",has(BlockList.blockOreOureclase.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawoureclase"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawPalladium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardPalladium.get(),4))
                .addCriterion("injectrawpalladium",has(BlockList.blockOrePalladium.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawpalladium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawPlatinum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardPlatinum.get(),4))
                .addCriterion("injectrawplatinum",has(BlockList.blockOrePlatinum.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawplatinum"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawPlutonium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardPlutonium.get(),4))
                .addCriterion("injectrawplutonium",has(BlockList.blockOrePlutonium.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawplutonium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawPolonium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardPolonium.get(),4))
                .addCriterion("injectrawpolonium",has(BlockList.blockOrePolonium.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawpolonium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawPromethium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardPromethium.get(),4))
                .addCriterion("injectrawpromethium",has(BlockList.blockOrePromethium.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawpromethium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawRhenium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardRhenium.get(),4))
                .addCriterion("injectrawrhenium",has(BlockList.blockOreRhenium.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawrhenium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawRhodium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardRhodium.get(),4))
                .addCriterion("injectrawrhodium",has(BlockList.blockOreRhodium.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawrhodium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawRubracium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardRubracium.get(),4))
                .addCriterion("injectrawrubracium",has(BlockList.blockOreRubracium.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawrubracium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawRuthenium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardRuthenium.get(),4))
                .addCriterion("injectrawruthenium",has(BlockList.blockOreRuthenium.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawruthenium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawSanguinite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardSanguinite.get(),4))
                .addCriterion("injectrawsanguinite",has(BlockList.blockOreSanguinite.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawsanguinite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawShadowIron), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardShadowIron.get(),4))
                .addCriterion("injectrawshadowiron",has(BlockList.blockOreShadowIron.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawshadowiron"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawSilver), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardSilver.get(),4))
                .addCriterion("injectrawsilver",has(BlockList.blockOreSilver.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawsilver"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawTantalum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardTantalum.get(),4))
                .addCriterion("injectrawtantalum",has(BlockList.blockOreTantalum.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawtantalum"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawTartarite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardTartarite.get(),4))
                .addCriterion("injectrawtartarite",has(BlockList.blockOreTartarite.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawtartarite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawTechnetium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardTechnetium.get(),4))
                .addCriterion("injectrawtechnetium",has(BlockList.blockOreTechnetium.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawtechnetium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawThallium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardThallium.get(),4))
                .addCriterion("injectrawthallium",has(BlockList.blockOreThallium.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawthallium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawTin), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardTin.get(),4))
                .addCriterion("injectrawtin",has(BlockList.blockOreTin.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawtin"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawTitanium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardTitanium.get(),4))
                .addCriterion("injectrawtitanium",has(BlockList.blockOreTitanium.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawtitanium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawTritium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardTritium.get(),4))
                .addCriterion("injectrawtritium",has(BlockList.blockOreTritium.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawtritium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawTungsten), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardTungsten.get(),4))
                .addCriterion("injectrawtungsten",has(BlockList.blockOreTungsten.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawtungsten"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawUnobtainium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardUnobtainium.get(),4))
                .addCriterion("injectrawunobtainium",has(BlockList.blockOreUnobtainium.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawunobtainium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawUranium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardUranium.get(),4))
                .addCriterion("injectrawuranium",has(BlockList.blockOreUranium.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawuranium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawVanadium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardVanadium.get(),4))
                .addCriterion("injectrawvanadium",has(BlockList.blockOreVanadium.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawvanadium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawVibranium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardVibranium.get(),4))
                .addCriterion("injectrawvibranium",has(BlockList.blockOreVibranium.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawvibranium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawVulcanite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardVulcanite.get(),4))
                .addCriterion("injectrawvulcanite",has(BlockList.blockOreVulcanite.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawvulcanite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawVyroxeres), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardVyroxeres.get(),4))
                .addCriterion("injectrawvyroxeres",has(BlockList.blockOreVyroxeres.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawvyroxeres"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawYellorite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardYellorite.get(),4))
                .addCriterion("injectrawyellorite",has(BlockList.blockOreYellorite.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawyellorite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawZinc), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardZinc.get(),4))
                .addCriterion("injectrawzinc",has(BlockList.blockOreZinc.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawzinc"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawZirconium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardZirconium.get(),4))
                .addCriterion("injectrawzirconium",has(BlockList.blockOreZirconium.get()))
                .build(consumer,new ResourceLocation("extraores:injectrawzirconium"));
    }
    protected void buildMekanismPurifying(Consumer<FinishedRecipe> consumer)
    {
        //Ore
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreAdamantine), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAdamantine.get(),3))
                .addCriterion("purifyadamantineore",has(BlockList.blockOreAdamantine.get()))
                .build(consumer,new ResourceLocation("extraores:purifyadamantineore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreAldourite),IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAldourite.get(),3))
                .addCriterion("purifyaldouriteore",has(BlockList.blockOreAldourite.get()))
                .build(consumer,new ResourceLocation("extraores:purifyaldouriteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreAluminum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAluminum.get(),3))
                .addCriterion("purifyaluminumore",has(BlockList.blockOreAluminum.get()))
                .build(consumer,new ResourceLocation("extraores:purifyaluminumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreAmericium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAmericium.get(),3))
                .addCriterion("purifyamericiumore",has(BlockList.blockOreAmericium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyamericiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreAmordrine), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAmordrine.get(),3))
                .addCriterion("purifyamordrineore",has(BlockList.blockOreAmordrine.get()))
                .build(consumer,new ResourceLocation("extraores:purifyamordrineore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreAngmallen), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAngmallen.get(),3))
                .addCriterion("purifyangmallenore",has(BlockList.blockOreAngmallen.get()))
                .build(consumer,new ResourceLocation("extraores:purifyangmallenore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreAstralSilver), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAstralSilver.get(),3))
                .addCriterion("purifyastralsilverore",has(BlockList.blockOreAstralSilver.get()))
                .build(consumer,new ResourceLocation("extraores:purifyastralsilverore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreAtlarus), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAtlarus.get(),3))
                .addCriterion("purifyatlarusore",has(BlockList.blockOreAtlarus.get()))
                .build(consumer,new ResourceLocation("extraores:purifyatlarusore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreBismuth), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpBismuth.get(),3))
                .addCriterion("purifybismuthore",has(BlockList.blockOreBismuth.get()))
                .build(consumer,new ResourceLocation("extraores:purifybismuthore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreBlackSteel), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpBlackSteel.get(),3))
                .addCriterion("purifyblacksteelore",has(BlockList.blockOreBlackSteel.get()))
                .build(consumer,new ResourceLocation("extraores:purifyblacksteelore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreCadmium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCadmium.get(),3))
                .addCriterion("purifycadmiumore",has(BlockList.blockOreCadmium.get()))
                .build(consumer,new ResourceLocation("extraores:purifycadmiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreCarmot), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCarmot.get(),3))
                .addCriterion("purifycarmotore",has(BlockList.blockOreCarmot.get()))
                .build(consumer,new ResourceLocation("extraores:purifycarmotore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreCelenegil), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCelenegil.get(),3))
                .addCriterion("purifycelenegilore",has(BlockList.blockOreCelenegil.get()))
                .build(consumer,new ResourceLocation("extraores:purifycelenegilore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreCeruclase), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCeruclase.get(),3))
                .addCriterion("purifyceruclaseore",has(BlockList.blockOreCeruclase.get()))
                .build(consumer,new ResourceLocation("extraores:purifyceruclaseore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreChromium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpChromium.get(),3))
                .addCriterion("purifychromiumore",has(BlockList.blockOreChromium.get()))
                .build(consumer,new ResourceLocation("extraores:purifychromiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreCobalt), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCobalt.get(),3))
                .addCriterion("purifycobaltore",has(BlockList.blockOreCobalt.get()))
                .build(consumer,new ResourceLocation("extraores:purifycobaltore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreCopper), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCopper.get(),3))
                .addCriterion("purifycopperore",has(BlockList.blockOreCopper.get()))
                .build(consumer,new ResourceLocation("extraores:purifycopperore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreCrimsonSteel), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCrimsonSteel.get(),3))
                .addCriterion("purifycrimsonsteelore",has(BlockList.blockOreCrimsonSteel.get()))
                .build(consumer,new ResourceLocation("extraores:purifycrimsonsteelore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreDeepIron), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpDeepIron.get(),3))
                .addCriterion("purifydeepironore",has(BlockList.blockOreDeepIron.get()))
                .build(consumer,new ResourceLocation("extraores:purifydeepironore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreDesichalkos), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpDesichalkos.get(),3))
                .addCriterion("purifydesichalkosore",has(BlockList.blockOreDesichalkos.get()))
                .build(consumer,new ResourceLocation("extraores:purifydesichalkosore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreEximite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpEximite.get(),3))
                .addCriterion("purifyeximiteore",has(BlockList.blockOreEximite.get()))
                .build(consumer,new ResourceLocation("extraores:purifyeximiteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreGallium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpGallium.get(),3))
                .addCriterion("purifygalliumore",has(BlockList.blockOreGallium.get()))
                .build(consumer,new ResourceLocation("extraores:purifygalliumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreHaderoth), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpHaderoth.get(),3))
                .addCriterion("purifyhaderothore",has(BlockList.blockOreHaderoth.get()))
                .build(consumer,new ResourceLocation("extraores:purifyhaderothore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreHepatizon), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpHepatizon.get(),3))
                .addCriterion("purifyhepatizonore",has(BlockList.blockOreHepatizon.get()))
                .build(consumer,new ResourceLocation("extraores:purifyhepatizonore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreIgnatius), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpIgnatius.get(),3))
                .addCriterion("purifyignatiusore",has(BlockList.blockOreIgnatius.get()))
                .build(consumer,new ResourceLocation("extraores:purifyignatiusore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreIndium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpIndium.get(),3))
                .addCriterion("purifyindiumore",has(BlockList.blockOreIndium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyindiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreInfuscolium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpInfuscolium.get(),3))
                .addCriterion("purifyinfuscoliumore",has(BlockList.blockOreInfuscolium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyinfuscoliumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreInolashite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpInolashite.get(),3))
                .addCriterion("purifyinolashiteore",has(BlockList.blockOreInolashite.get()))
                .build(consumer,new ResourceLocation("extraores:purifyinolashiteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreIridium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpIridium.get(),3))
                .addCriterion("purifyiridiumore",has(BlockList.blockOreIridium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyiridiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreKalendrite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpKalendrite.get(),3))
                .addCriterion("purifykalendriteore",has(BlockList.blockOreKalendrite.get()))
                .build(consumer,new ResourceLocation("extraores:purifykalendriteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreLead), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpLead.get(),3))
                .addCriterion("purifyleadore",has(BlockList.blockOreLead.get()))
                .build(consumer,new ResourceLocation("extraores:purifyleadore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreLemurite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpLemurite.get(),3))
                .addCriterion("purifylemuriteore",has(BlockList.blockOreLemurite.get()))
                .build(consumer,new ResourceLocation("extraores:purifylemuriteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreManganese), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpManganese.get(),3))
                .addCriterion("purifymanganeseore",has(BlockList.blockOreManganese.get()))
                .build(consumer,new ResourceLocation("extraores:purifymanganeseore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreMeutoite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpMeutoite.get(),3))
                .addCriterion("purifymeutoiteore",has(BlockList.blockOreMeutoite.get()))
                .build(consumer,new ResourceLocation("extraores:purifymeutoiteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreMidasium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpMidasium.get(),3))
                .addCriterion("purifymidasiumore",has(BlockList.blockOreMidasium.get()))
                .build(consumer,new ResourceLocation("extraores:purifymidasiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreMithril), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpMithril.get(),3))
                .addCriterion("purifymithrilore",has(BlockList.blockOreMithril.get()))
                .build(consumer,new ResourceLocation("extraores:purifymithrilore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreMolybdenum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpMolybdenum.get(),3))
                .addCriterion("purifymolybdenumore",has(BlockList.blockOreMolybdenum.get()))
                .build(consumer,new ResourceLocation("extraores:purifymolybdenumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreNeodymium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpNeodymium.get(),3))
                .addCriterion("purifyneodymiumore",has(BlockList.blockOreNeodymium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyneodymiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreNeptunium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpNeptunium.get(),3))
                .addCriterion("purifyneptuniumore",has(BlockList.blockOreNeptunium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyneptuniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreNickel), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpNickel.get(),3))
                .addCriterion("purifynickelore",has(BlockList.blockOreNickel.get()))
                .build(consumer,new ResourceLocation("extraores:purifynickelore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreNiobium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpNiobium.get(),3))
                .addCriterion("purifyniobiumore",has(BlockList.blockOreNiobium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyniobiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreOrichalcum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpOrichalcum.get(),3))
                .addCriterion("purifyorichalcumore",has(BlockList.blockOreOrichalcum.get()))
                .build(consumer,new ResourceLocation("extraores:purifyorichalcumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreOsmium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpOsmium.get(),3))
                .addCriterion("purifyosmiumore",has(BlockList.blockOreOsmium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyosmiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreOureclase), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpOureclase.get(),3))
                .addCriterion("purifyoureclaseore",has(BlockList.blockOreOureclase.get()))
                .build(consumer,new ResourceLocation("extraores:purifyoureclaseore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.orePalladium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpPalladium.get(),3))
                .addCriterion("purifypalladiumore",has(BlockList.blockOrePalladium.get()))
                .build(consumer,new ResourceLocation("extraores:purifypalladiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.orePlatinum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpPlatinum.get(),3))
                .addCriterion("purifyplatinumore",has(BlockList.blockOrePlatinum.get()))
                .build(consumer,new ResourceLocation("extraores:purifyplatinumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.orePlutonium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpPlutonium.get(),3))
                .addCriterion("purifyplutoniumore",has(BlockList.blockOrePlutonium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyplutoniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.orePolonium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpPolonium.get(),3))
                .addCriterion("purifypoloniumore",has(BlockList.blockOrePolonium.get()))
                .build(consumer,new ResourceLocation("extraores:purifypoloniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.orePromethium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpPromethium.get(),3))
                .addCriterion("purifypromethiumore",has(BlockList.blockOrePromethium.get()))
                .build(consumer,new ResourceLocation("extraores:purifypromethiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreRhenium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpRhenium.get(),3))
                .addCriterion("purifyrheniumore",has(BlockList.blockOreRhenium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrheniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreRhodium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpRhodium.get(),3))
                .addCriterion("purifyrhodiumore",has(BlockList.blockOreRhodium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrhodiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreRubracium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpRubracium.get(),3))
                .addCriterion("purifyrubraciumore",has(BlockList.blockOreRubracium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrubraciumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreRuthenium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpRuthenium.get(),3))
                .addCriterion("purifyrutheniumore",has(BlockList.blockOreRuthenium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrutheniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreSanguinite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpSanguinite.get(),3))
                .addCriterion("purifysanguiniteore",has(BlockList.blockOreSanguinite.get()))
                .build(consumer,new ResourceLocation("extraores:purifysanguiniteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreShadowIron), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpShadowIron.get(),3))
                .addCriterion("purifyshadowironore",has(BlockList.blockOreShadowIron.get()))
                .build(consumer,new ResourceLocation("extraores:purifyshadowironore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreSilver), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpSilver.get(),3))
                .addCriterion("purifysilverore",has(BlockList.blockOreSilver.get()))
                .build(consumer,new ResourceLocation("extraores:purifysilverore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreTantalum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTantalum.get(),3))
                .addCriterion("purifytantalumore",has(BlockList.blockOreTantalum.get()))
                .build(consumer,new ResourceLocation("extraores:purifytantalumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreTartarite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTartarite.get(),3))
                .addCriterion("purifytartariteore",has(BlockList.blockOreTartarite.get()))
                .build(consumer,new ResourceLocation("extraores:purifytartariteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreTechnetium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTechnetium.get(),3))
                .addCriterion("purifytechnetiumore",has(BlockList.blockOreTechnetium.get()))
                .build(consumer,new ResourceLocation("extraores:purifytechnetiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreThallium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpThallium.get(),3))
                .addCriterion("purifythalliumore",has(BlockList.blockOreThallium.get()))
                .build(consumer,new ResourceLocation("extraores:purifythalliumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreTin), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTin.get(),3))
                .addCriterion("purifytinore",has(BlockList.blockOreTin.get()))
                .build(consumer,new ResourceLocation("extraores:purifytinore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreTitanium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTitanium.get(),3))
                .addCriterion("purifytitaniumore",has(BlockList.blockOreTitanium.get()))
                .build(consumer,new ResourceLocation("extraores:purifytitaniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreTritium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTritium.get(),3))
                .addCriterion("purifytritiumore",has(BlockList.blockOreTritium.get()))
                .build(consumer,new ResourceLocation("extraores:purifytritiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreTungsten), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTungsten.get(),3))
                .addCriterion("purifytungstenore",has(BlockList.blockOreTungsten.get()))
                .build(consumer,new ResourceLocation("extraores:purifytungstenore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreUnobtainium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpUnobtainium.get(),3))
                .addCriterion("purifyunobtainiumore",has(BlockList.blockOreUnobtainium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyunobtainiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreUranium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpUranium.get(),3))
                .addCriterion("purifyuraniumore",has(BlockList.blockOreUranium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyuraniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreVanadium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpVanadium.get(),3))
                .addCriterion("purifyvanadiumore",has(BlockList.blockOreVanadium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyvanadiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreVibranium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpVibranium.get(),3))
                .addCriterion("purifyvibraniumore",has(BlockList.blockOreVibranium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyvibraniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreVulcanite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpVulcanite.get(),3))
                .addCriterion("purifyvulcaniteore",has(BlockList.blockOreVulcanite.get()))
                .build(consumer,new ResourceLocation("extraores:purifyvulcaniteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreVyroxeres), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpVyroxeres.get(),3))
                .addCriterion("purifyvyroxeresore",has(BlockList.blockOreVyroxeres.get()))
                .build(consumer,new ResourceLocation("extraores:purifyvyroxeresore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreYellorite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpYellorite.get(),3))
                .addCriterion("purifyyelloriteore",has(BlockList.blockOreYellorite.get()))
                .build(consumer,new ResourceLocation("extraores:purifyyelloriteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreZinc), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpZinc.get(),3))
                .addCriterion("purifyzincore",has(BlockList.blockOreZinc.get()))
                .build(consumer,new ResourceLocation("extraores:purifyzincore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreZirconium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpZirconium.get(),3))
                .addCriterion("purifyzirconiumore",has(BlockList.blockOreZirconium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyzirconiumore"));
        //Raw
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawAdamantine), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAdamantine.get(),3))
                .addCriterion("purifyrawadamantine",has(ItemList.itemRawAdamantine.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawadamantine"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawAldourite),IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAldourite.get(),3))
                .addCriterion("purifyrawaldourite",has(ItemList.itemRawAldourite.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawaldourite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawAluminum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAluminum.get(),3))
                .addCriterion("purifyrawaluminum",has(ItemList.itemRawAluminum.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawaluminum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawAmericium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAmericium.get(),3))
                .addCriterion("purifyrawamericium",has(ItemList.itemRawAmericium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawamericium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawAmordrine), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAmordrine.get(),3))
                .addCriterion("purifyrawamordrine",has(ItemList.itemRawAmordrine.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawamordrine"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawAngmallen), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAngmallen.get(),3))
                .addCriterion("purifyrawangmallen",has(ItemList.itemRawAngmallen.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawangmallen"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawAstralSilver), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAstralSilver.get(),3))
                .addCriterion("purifyrawastralsilver",has(ItemList.itemRawAstralSilver.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawastralsilver"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawAtlarus), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAtlarus.get(),3))
                .addCriterion("purifyrawatlarus",has(ItemList.itemRawAtlarus.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawatlarus"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawBismuth), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpBismuth.get(),3))
                .addCriterion("purifyrawbismuth",has(ItemList.itemRawBismuth.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawbismuth"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawBlackSteel), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpBlackSteel.get(),3))
                .addCriterion("purifyrawblacksteel",has(ItemList.itemRawBlackSteel.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawblacksteel"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawCadmium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCadmium.get(),3))
                .addCriterion("purifyrawcadmium",has(ItemList.itemRawCadmium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawcadmium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawCarmot), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCarmot.get(),3))
                .addCriterion("purifyrawcarmot",has(ItemList.itemRawCarmot.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawcarmot"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawCelenegil), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCelenegil.get(),3))
                .addCriterion("purifyrawcelenegil",has(ItemList.itemRawCelenegil.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawcelenegil"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawCeruclase), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCeruclase.get(),3))
                .addCriterion("purifyrawceruclase",has(ItemList.itemRawCeruclase.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawceruclase"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawChromium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpChromium.get(),3))
                .addCriterion("purifyrawchromium",has(ItemList.itemRawChromium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawchromium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawCobalt), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCobalt.get(),3))
                .addCriterion("purifyrawcobalt",has(ItemList.itemRawCobalt.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawcobalt"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawCopper), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCopper.get(),3))
                .addCriterion("purifyrawcopper",has(ItemList.itemRawCopper.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawcopper"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawCrimsonSteel), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCrimsonSteel.get(),3))
                .addCriterion("purifyrawcrimsonsteel",has(ItemList.itemRawCrimsonSteel.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawcrimsonsteel"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawDeepIron), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpDeepIron.get(),3))
                .addCriterion("purifyrawdeepiron",has(ItemList.itemRawDeepIron.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawdeepiron"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawDesichalkos), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpDesichalkos.get(),3))
                .addCriterion("purifyrawdesichalkos",has(ItemList.itemRawDesichalkos.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawdesichalkos"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawEximite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpEximite.get(),3))
                .addCriterion("purifyraweximite",has(ItemList.itemRawEximite.get()))
                .build(consumer,new ResourceLocation("extraores:purifyraweximite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawGallium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpGallium.get(),3))
                .addCriterion("purifyrawgallium",has(ItemList.itemRawGallium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawgallium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawHaderoth), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpHaderoth.get(),3))
                .addCriterion("purifyrawhaderoth",has(ItemList.itemRawHaderoth.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawhaderoth"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawHepatizon), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpHepatizon.get(),3))
                .addCriterion("purifyrawhepatizon",has(ItemList.itemRawHepatizon.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawhepatizon"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawIgnatius), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpIgnatius.get(),3))
                .addCriterion("purifyrawignatius",has(ItemList.itemRawIgnatius.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawignatius"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawIndium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpIndium.get(),3))
                .addCriterion("purifyrawindium",has(ItemList.itemRawIndium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawindium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawInfuscolium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpInfuscolium.get(),3))
                .addCriterion("purifyrawinfuscolium",has(ItemList.itemRawInfuscolium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawinfuscolium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawInolashite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpInolashite.get(),3))
                .addCriterion("purifyrawinolashite",has(ItemList.itemRawInolashite.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawinolashite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawIridium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpIridium.get(),3))
                .addCriterion("purifyrawiridium",has(ItemList.itemRawIridium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawiridium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawKalendrite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpKalendrite.get(),3))
                .addCriterion("purifyrawkalendrite",has(ItemList.itemRawKalendrite.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawkalendrite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawLead), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpLead.get(),3))
                .addCriterion("purifyrawlead",has(ItemList.itemRawLead.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawlead"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawLemurite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpLemurite.get(),3))
                .addCriterion("purifyrawlemurite",has(ItemList.itemRawLemurite.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawlemurite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawManganese), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpManganese.get(),3))
                .addCriterion("purifyrawmanganese",has(ItemList.itemRawManganese.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawmanganese"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawMeutoite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpMeutoite.get(),3))
                .addCriterion("purifyrawmeutoite",has(ItemList.itemRawMeutoite.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawmeutoite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawMidasium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpMidasium.get(),3))
                .addCriterion("purifyrawmidasium",has(ItemList.itemRawMidasium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawmidasium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawMithril), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpMithril.get(),3))
                .addCriterion("purifyrawmithril",has(ItemList.itemRawMithril.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawmithril"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawMolybdenum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpMolybdenum.get(),3))
                .addCriterion("purifyrawmolybdenum",has(ItemList.itemRawMolybdenum.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawmolybdenum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawNeodymium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpNeodymium.get(),3))
                .addCriterion("purifyrawneodymium",has(ItemList.itemRawNeodymium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawneodymium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawNeptunium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpNeptunium.get(),3))
                .addCriterion("purifyrawneptunium",has(ItemList.itemRawNeptunium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawneptunium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawNickel), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpNickel.get(),3))
                .addCriterion("purifyrawnickel",has(ItemList.itemRawNickel.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawnickel"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawNiobium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpNiobium.get(),3))
                .addCriterion("purifyrawniobium",has(ItemList.itemRawNiobium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawniobium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawOrichalcum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpOrichalcum.get(),3))
                .addCriterion("purifyraworichalcum",has(ItemList.itemRawOrichalcum.get()))
                .build(consumer,new ResourceLocation("extraores:purifyraworichalcum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawOsmium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpOsmium.get(),3))
                .addCriterion("purifyrawosmium",has(ItemList.itemRawOsmium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawosmium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawOureclase), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpOureclase.get(),3))
                .addCriterion("purifyrawoureclase",has(ItemList.itemRawOureclase.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawoureclase"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawPalladium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpPalladium.get(),3))
                .addCriterion("purifyrawpalladium",has(ItemList.itemRawPalladium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawpalladium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawPlatinum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpPlatinum.get(),3))
                .addCriterion("purifyrawplatinum",has(ItemList.itemRawPlatinum.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawplatinum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawPlutonium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpPlutonium.get(),3))
                .addCriterion("purifyrawplutonium",has(ItemList.itemRawPlutonium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawplutonium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawPolonium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpPolonium.get(),3))
                .addCriterion("purifyrawpolonium",has(ItemList.itemRawPolonium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawpolonium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawPromethium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpPromethium.get(),3))
                .addCriterion("purifyrawpromethium",has(ItemList.itemRawPromethium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawpromethium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawRhenium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpRhenium.get(),3))
                .addCriterion("purifyrawrhenium",has(ItemList.itemRawRhenium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawrhenium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawRhodium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpRhodium.get(),3))
                .addCriterion("purifyrawrhodium",has(ItemList.itemRawRhodium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawrhodium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawRubracium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpRubracium.get(),3))
                .addCriterion("purifyrawrubracium",has(ItemList.itemRawRubracium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawrubracium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawRuthenium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpRuthenium.get(),3))
                .addCriterion("purifyrawruthenium",has(ItemList.itemRawRuthenium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawruthenium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawSanguinite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpSanguinite.get(),3))
                .addCriterion("purifyrawsanguinite",has(ItemList.itemRawSanguinite.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawsanguinite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawShadowIron), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpShadowIron.get(),3))
                .addCriterion("purifyrawshadowiron",has(ItemList.itemRawShadowIron.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawshadowiron"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawSilver), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpSilver.get(),3))
                .addCriterion("purifyrawsilver",has(ItemList.itemRawSilver.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawsilver"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawTantalum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTantalum.get(),3))
                .addCriterion("purifyrawtantalum",has(ItemList.itemRawTantalum.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawtantalum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawTartarite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTartarite.get(),3))
                .addCriterion("purifyrawtartarite",has(ItemList.itemRawTartarite.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawtartarite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawTechnetium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTechnetium.get(),3))
                .addCriterion("purifyrawtechnetium",has(ItemList.itemRawTechnetium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawtechnetium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawThallium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpThallium.get(),3))
                .addCriterion("purifyrawthallium",has(ItemList.itemRawThallium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawthallium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawTin), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTin.get(),3))
                .addCriterion("purifyrawtin",has(ItemList.itemRawTin.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawtin"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawTitanium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTitanium.get(),3))
                .addCriterion("purifyrawtitanium",has(ItemList.itemRawTitanium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawtitanium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawTritium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTritium.get(),3))
                .addCriterion("purifyrawtritium",has(ItemList.itemRawTritium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawtritium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawTungsten), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTungsten.get(),3))
                .addCriterion("purifyrawtungsten",has(ItemList.itemRawTungsten.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawtungsten"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawUnobtainium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpUnobtainium.get(),3))
                .addCriterion("purifyrawunobtainium",has(ItemList.itemRawUnobtainium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawunobtainium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawUranium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpUranium.get(),3))
                .addCriterion("purifyrawuranium",has(ItemList.itemRawUranium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawuranium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawVanadium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpVanadium.get(),3))
                .addCriterion("purifyrawvanadium",has(ItemList.itemRawVanadium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawvanadium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawVibranium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpVibranium.get(),3))
                .addCriterion("purifyrawvibranium",has(ItemList.itemRawVibranium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawvibranium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawVulcanite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpVulcanite.get(),3))
                .addCriterion("purifyrawvulcanite",has(ItemList.itemRawVulcanite.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawvulcanite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawVyroxeres), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpVyroxeres.get(),3))
                .addCriterion("purifyrawvyroxeres",has(ItemList.itemRawVyroxeres.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawvyroxeres"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawYellorite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpYellorite.get(),3))
                .addCriterion("purifyrawyellorite",has(ItemList.itemRawYellorite.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawyellorite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawZinc), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpZinc.get(),3))
                .addCriterion("purifyrawzinc",has(ItemList.itemRawZinc.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawzinc"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawZirconium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpZirconium.get(),3))
                .addCriterion("purifyrawzirconium",has(ItemList.itemRawZirconium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrawzirconium"));
        //Shard
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardAdamantine), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAdamantine.get()))
                .addCriterion("purifyadamantine",has(ItemList.itemShardAdamantine.get()))
                .build(consumer,new ResourceLocation("extraores:purifyadamantine"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardAldourite),IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAldourite.get()))
                .addCriterion("purifyaldourite",has(ItemList.itemShardAldourite.get()))
                .build(consumer,new ResourceLocation("extraores:purifyaldourite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardAluminum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAluminum.get()))
                .addCriterion("purifyaluminum",has(ItemList.itemShardAluminum.get()))
                .build(consumer,new ResourceLocation("extraores:purifyaluminum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardAmericium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAmericium.get()))
                .addCriterion("purifyamericium",has(ItemList.itemShardAmericium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyamericium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardAmordrine), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAmordrine.get()))
                .addCriterion("purifyamordrine",has(ItemList.itemShardAmordrine.get()))
                .build(consumer,new ResourceLocation("extraores:purifyamordrine"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardAngmallen), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAngmallen.get()))
                .addCriterion("purifyangmallen",has(ItemList.itemShardAngmallen.get()))
                .build(consumer,new ResourceLocation("extraores:purifyangmallen"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardAstralSilver), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAstralSilver.get()))
                .addCriterion("purifyastralsilver",has(ItemList.itemShardAstralSilver.get()))
                .build(consumer,new ResourceLocation("extraores:purifyastralsilver"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardAtlarus), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAtlarus.get()))
                .addCriterion("purifyatlarus",has(ItemList.itemShardAtlarus.get()))
                .build(consumer,new ResourceLocation("extraores:purifyatlarus"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardBismuth), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpBismuth.get()))
                .addCriterion("purifybismuth",has(ItemList.itemShardBismuth.get()))
                .build(consumer,new ResourceLocation("extraores:purifybismuth"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardBlackSteel), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpBlackSteel.get()))
                .addCriterion("purifyblacksteel",has(ItemList.itemShardBlackSteel.get()))
                .build(consumer,new ResourceLocation("extraores:purifyblacksteel"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardCadmium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCadmium.get()))
                .addCriterion("purifycadmium",has(ItemList.itemShardCadmium.get()))
                .build(consumer,new ResourceLocation("extraores:purifycadmium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardCarmot), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCarmot.get()))
                .addCriterion("purifycarmot",has(ItemList.itemShardCarmot.get()))
                .build(consumer,new ResourceLocation("extraores:purifycarmot"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardCelenegil), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCelenegil.get()))
                .addCriterion("purifycelenegil",has(ItemList.itemShardCelenegil.get()))
                .build(consumer,new ResourceLocation("extraores:purifycelenegil"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardCeruclase), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCeruclase.get()))
                .addCriterion("purifyceruclase",has(ItemList.itemShardCeruclase.get()))
                .build(consumer,new ResourceLocation("extraores:purifyceruclase"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardChromium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpChromium.get()))
                .addCriterion("purifychromium",has(ItemList.itemShardChromium.get()))
                .build(consumer,new ResourceLocation("extraores:purifychromium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardCobalt), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCobalt.get()))
                .addCriterion("purifycobalt",has(ItemList.itemShardCobalt.get()))
                .build(consumer,new ResourceLocation("extraores:purifycobalt"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardCopper), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCopper.get()))
                .addCriterion("purifycopper",has(ItemList.itemShardCopper.get()))
                .build(consumer,new ResourceLocation("extraores:purifycopper"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardCrimsonSteel), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCrimsonSteel.get()))
                .addCriterion("purifycrimsonsteel",has(ItemList.itemShardCrimsonSteel.get()))
                .build(consumer,new ResourceLocation("extraores:purifycrimsonsteel"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardDeepIron), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpDeepIron.get()))
                .addCriterion("purifydeepiron",has(ItemList.itemShardDeepIron.get()))
                .build(consumer,new ResourceLocation("extraores:purifydeepiron"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardDesichalkos), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpDesichalkos.get()))
                .addCriterion("purifydesichalkos",has(ItemList.itemShardDesichalkos.get()))
                .build(consumer,new ResourceLocation("extraores:purifydesichalkos"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardEximite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpEximite.get()))
                .addCriterion("purifyeximite",has(ItemList.itemShardEximite.get()))
                .build(consumer,new ResourceLocation("extraores:purifyeximite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardGallium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpGallium.get()))
                .addCriterion("purifygallium",has(ItemList.itemShardGallium.get()))
                .build(consumer,new ResourceLocation("extraores:purifygallium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardHaderoth), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpHaderoth.get()))
                .addCriterion("purifyhaderoth",has(ItemList.itemShardHaderoth.get()))
                .build(consumer,new ResourceLocation("extraores:purifyhaderoth"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardHepatizon), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpHepatizon.get()))
                .addCriterion("purifyhepatizon",has(ItemList.itemShardHepatizon.get()))
                .build(consumer,new ResourceLocation("extraores:purifyhepatizon"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardIgnatius), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpIgnatius.get()))
                .addCriterion("purifyignatius",has(ItemList.itemShardIgnatius.get()))
                .build(consumer,new ResourceLocation("extraores:purifyignatius"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardIndium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpIndium.get()))
                .addCriterion("purifyindium",has(ItemList.itemShardIndium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyindium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardInfuscolium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpInfuscolium.get()))
                .addCriterion("purifyinfuscolium",has(ItemList.itemShardInfuscolium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyinfuscolium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardInolashite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpInolashite.get()))
                .addCriterion("purifyinolashite",has(ItemList.itemShardInolashite.get()))
                .build(consumer,new ResourceLocation("extraores:purifyinolashite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardIridium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpIridium.get()))
                .addCriterion("purifyiridium",has(ItemList.itemShardIridium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyiridium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardKalendrite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpKalendrite.get()))
                .addCriterion("purifykalendrite",has(ItemList.itemShardKalendrite.get()))
                .build(consumer,new ResourceLocation("extraores:purifykalendrite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardLead), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpLead.get()))
                .addCriterion("purifylead",has(ItemList.itemShardLead.get()))
                .build(consumer,new ResourceLocation("extraores:purifylead"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardLemurite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpLemurite.get()))
                .addCriterion("purifylemurite",has(ItemList.itemShardLemurite.get()))
                .build(consumer,new ResourceLocation("extraores:purifylemurite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardManganese), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpManganese.get()))
                .addCriterion("purifymanganese",has(ItemList.itemShardManganese.get()))
                .build(consumer,new ResourceLocation("extraores:purifymanganese"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardMeutoite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpMeutoite.get()))
                .addCriterion("purifymeutoite",has(ItemList.itemShardMeutoite.get()))
                .build(consumer,new ResourceLocation("extraores:purifymeutoite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardMidasium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpMidasium.get()))
                .addCriterion("purifymidasium",has(ItemList.itemShardMidasium.get()))
                .build(consumer,new ResourceLocation("extraores:purifymidasium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardMithril), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpMithril.get()))
                .addCriterion("purifymithril",has(ItemList.itemShardMithril.get()))
                .build(consumer,new ResourceLocation("extraores:purifymithril"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardMolybdenum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpMolybdenum.get()))
                .addCriterion("purifymolybdenum",has(ItemList.itemShardMolybdenum.get()))
                .build(consumer,new ResourceLocation("extraores:purifymolybdenum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardNeodymium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpNeodymium.get()))
                .addCriterion("purifyneodymium",has(ItemList.itemShardNeodymium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyneodymium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardNeptunium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpNeptunium.get()))
                .addCriterion("purifyneptunium",has(ItemList.itemShardNeptunium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyneptunium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardNickel), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpNickel.get()))
                .addCriterion("purifynickel",has(ItemList.itemShardNickel.get()))
                .build(consumer,new ResourceLocation("extraores:purifynickel"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardNiobium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpNiobium.get()))
                .addCriterion("purifyniobium",has(ItemList.itemShardNiobium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyniobium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardOrichalcum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpOrichalcum.get()))
                .addCriterion("purifyorichalcum",has(ItemList.itemShardOrichalcum.get()))
                .build(consumer,new ResourceLocation("extraores:purifyorichalcum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardOsmium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpOsmium.get()))
                .addCriterion("purifyosmium",has(ItemList.itemShardOsmium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyosmium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardOureclase), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpOureclase.get()))
                .addCriterion("purifyoureclase",has(ItemList.itemShardOureclase.get()))
                .build(consumer,new ResourceLocation("extraores:purifyoureclase"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardPalladium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpPalladium.get()))
                .addCriterion("purifypalladium",has(ItemList.itemShardPalladium.get()))
                .build(consumer,new ResourceLocation("extraores:purifypalladium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardPlatinum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpPlatinum.get()))
                .addCriterion("purifyplatinum",has(ItemList.itemShardPlatinum.get()))
                .build(consumer,new ResourceLocation("extraores:purifyplatinum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardPlutonium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpPlutonium.get()))
                .addCriterion("purifyplutonium",has(ItemList.itemShardPlutonium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyplutonium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardPolonium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpPolonium.get()))
                .addCriterion("purifypolonium",has(ItemList.itemShardPolonium.get()))
                .build(consumer,new ResourceLocation("extraores:purifypolonium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardPromethium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpPromethium.get()))
                .addCriterion("purifypromethium",has(ItemList.itemShardPromethium.get()))
                .build(consumer,new ResourceLocation("extraores:purifypromethium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardRhenium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpRhenium.get()))
                .addCriterion("purifyrhenium",has(ItemList.itemShardRhenium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrhenium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardRhodium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpRhodium.get()))
                .addCriterion("purifyrhodium",has(ItemList.itemShardRhodium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrhodium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardRubracium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpRubracium.get()))
                .addCriterion("purifyrubracium",has(ItemList.itemShardRubracium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyrubracium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardRuthenium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpRuthenium.get()))
                .addCriterion("purifyruthenium",has(ItemList.itemShardRuthenium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyruthenium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardSanguinite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpSanguinite.get()))
                .addCriterion("purifysanguinite",has(ItemList.itemShardSanguinite.get()))
                .build(consumer,new ResourceLocation("extraores:purifysanguinite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardShadowIron), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpShadowIron.get()))
                .addCriterion("purifyshadowiron",has(ItemList.itemShardShadowIron.get()))
                .build(consumer,new ResourceLocation("extraores:purifyshadowiron"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardSilver), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpSilver.get()))
                .addCriterion("purifysilver",has(ItemList.itemShardSilver.get()))
                .build(consumer,new ResourceLocation("extraores:purifysilver"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardTantalum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTantalum.get()))
                .addCriterion("purifytantalum",has(ItemList.itemShardTantalum.get()))
                .build(consumer,new ResourceLocation("extraores:purifytantalum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardTartarite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTartarite.get()))
                .addCriterion("purifytartarite",has(ItemList.itemShardTartarite.get()))
                .build(consumer,new ResourceLocation("extraores:purifytartarite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardTechnetium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTechnetium.get()))
                .addCriterion("purifytechnetium",has(ItemList.itemShardTechnetium.get()))
                .build(consumer,new ResourceLocation("extraores:purifytechnetium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardThallium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpThallium.get()))
                .addCriterion("purifythallium",has(ItemList.itemShardThallium.get()))
                .build(consumer,new ResourceLocation("extraores:purifythallium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardTin), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTin.get()))
                .addCriterion("purifytin",has(ItemList.itemShardTin.get()))
                .build(consumer,new ResourceLocation("extraores:purifytin"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardTitanium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTitanium.get()))
                .addCriterion("purifytitanium",has(ItemList.itemShardTitanium.get()))
                .build(consumer,new ResourceLocation("extraores:purifytitanium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardTritium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTritium.get()))
                .addCriterion("purifytritium",has(ItemList.itemShardTritium.get()))
                .build(consumer,new ResourceLocation("extraores:purifytritium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardTungsten), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTungsten.get()))
                .addCriterion("purifytungsten",has(ItemList.itemShardTungsten.get()))
                .build(consumer,new ResourceLocation("extraores:purifytungsten"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardUnobtainium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpUnobtainium.get()))
                .addCriterion("purifyunobtainium",has(ItemList.itemShardUnobtainium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyunobtainium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardUranium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpUranium.get()))
                .addCriterion("purifyuranium",has(ItemList.itemShardUranium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyuranium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardVanadium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpVanadium.get()))
                .addCriterion("purifyvanadium",has(ItemList.itemShardVanadium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyvanadium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardVibranium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpVibranium.get()))
                .addCriterion("purifyvibranium",has(ItemList.itemShardVibranium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyvibranium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardVulcanite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpVulcanite.get()))
                .addCriterion("purifyvulcanite",has(ItemList.itemShardVulcanite.get()))
                .build(consumer,new ResourceLocation("extraores:purifyvulcanite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardVyroxeres), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpVyroxeres.get()))
                .addCriterion("purifyvyroxeres",has(ItemList.itemShardVyroxeres.get()))
                .build(consumer,new ResourceLocation("extraores:purifyvyroxeres"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardYellorite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpYellorite.get()))
                .addCriterion("purifyyellorite",has(ItemList.itemShardYellorite.get()))
                .build(consumer,new ResourceLocation("extraores:purifyyellorite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardZinc), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpZinc.get()))
                .addCriterion("purifyzinc",has(ItemList.itemShardZinc.get()))
                .build(consumer,new ResourceLocation("extraores:purifyzinc"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardZirconium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpZirconium.get()))
                .addCriterion("purifyzirconium",has(ItemList.itemShardZirconium.get()))
                .build(consumer,new ResourceLocation("extraores:purifyzirconium"));
    }
    protected void buildMekanismCrushing(Consumer<FinishedRecipe> consumer)
    {
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpAdamantine),new ItemStack(ItemList.itemDirtyDustAdamantine.get()))
                .addCriterion("crushadamantine",has(ItemList.itemClumpAdamantine.get()))
                .build(consumer,new ResourceLocation("extraores:crushadamantine"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpAldourite),new ItemStack(ItemList.itemDirtyDustAldourite.get()))
                .addCriterion("crushaldourite",has(ItemList.itemClumpAldourite.get()))
                .build(consumer,new ResourceLocation("extraores:crushaldourite"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpAluminum),new ItemStack(ItemList.itemDirtyDustAluminum.get()))
                .addCriterion("crushaluminum",has(ItemList.itemClumpAluminum.get()))
                .build(consumer,new ResourceLocation("extraores:crushaluminum"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpAmericium),new ItemStack(ItemList.itemDirtyDustAmericium.get()))
                .addCriterion("crushamericium",has(ItemList.itemClumpAmericium.get()))
                .build(consumer,new ResourceLocation("extraores:crushamericium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpAmordrine),new ItemStack(ItemList.itemDirtyDustAmordrine.get()))
                .addCriterion("crushamordrine",has(ItemList.itemClumpAmordrine.get()))
                .build(consumer,new ResourceLocation("extraores:crushamordrine"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpAngmallen),new ItemStack(ItemList.itemDirtyDustAngmallen.get()))
                .addCriterion("crushangmallen",has(ItemList.itemClumpAngmallen.get()))
                .build(consumer,new ResourceLocation("extraores:crushangmallen"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpAstralSilver),new ItemStack(ItemList.itemDirtyDustAstralSilver.get()))
                .addCriterion("crushastralsilver",has(ItemList.itemClumpAstralSilver.get()))
                .build(consumer,new ResourceLocation("extraores:crushastralsilver"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpAtlarus),new ItemStack(ItemList.itemDirtyDustAtlarus.get()))
                .addCriterion("crushatlarus",has(ItemList.itemClumpAtlarus.get()))
                .build(consumer,new ResourceLocation("extraores:crushatlarus"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpBismuth),new ItemStack(ItemList.itemDirtyDustBismuth.get()))
                .addCriterion("crushbismuth",has(ItemList.itemClumpBismuth.get()))
                .build(consumer,new ResourceLocation("extraores:crushbismuth"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpBlackSteel),new ItemStack(ItemList.itemDirtyDustBlackSteel.get()))
                .addCriterion("crushblacksteel",has(ItemList.itemClumpBlackSteel.get()))
                .build(consumer,new ResourceLocation("extraores:crushblacksteel"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpCadmium),new ItemStack(ItemList.itemDirtyDustCadmium.get()))
                .addCriterion("crushcadmium",has(ItemList.itemClumpCadmium.get()))
                .build(consumer,new ResourceLocation("extraores:crushcadmium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpCarmot),new ItemStack(ItemList.itemDirtyDustCarmot.get()))
                .addCriterion("crushcarmot",has(ItemList.itemClumpCarmot.get()))
                .build(consumer,new ResourceLocation("extraores:crushcarmot"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpCelenegil),new ItemStack(ItemList.itemDirtyDustCelenegil.get()))
                .addCriterion("crushcelenegil",has(ItemList.itemClumpCelenegil.get()))
                .build(consumer,new ResourceLocation("extraores:crushcelenegil"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpCeruclase),new ItemStack(ItemList.itemDirtyDustCeruclase.get()))
                .addCriterion("crushceruclase",has(ItemList.itemClumpCeruclase.get()))
                .build(consumer,new ResourceLocation("extraores:crushceruclase"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpChromium),new ItemStack(ItemList.itemDirtyDustChromium.get()))
                .addCriterion("crushchromium",has(ItemList.itemClumpChromium.get()))
                .build(consumer,new ResourceLocation("extraores:crushchromium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpCobalt),new ItemStack(ItemList.itemDirtyDustCobalt.get()))
                .addCriterion("crushcobalt",has(ItemList.itemClumpCobalt.get()))
                .build(consumer,new ResourceLocation("extraores:crushcobalt"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpCopper),new ItemStack(ItemList.itemDirtyDustCopper.get()))
                .addCriterion("crushcopper",has(ItemList.itemClumpCopper.get()))
                .build(consumer,new ResourceLocation("extraores:crushcopper"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpCrimsonSteel),new ItemStack(ItemList.itemDirtyDustCrimsonSteel.get()))
                .addCriterion("crushcrimsonsteel",has(ItemList.itemClumpCrimsonSteel.get()))
                .build(consumer,new ResourceLocation("extraores:crushcrimsonsteel"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpDeepIron),new ItemStack(ItemList.itemDirtyDustDeepIron.get()))
                .addCriterion("crushdeepiron",has(ItemList.itemClumpDeepIron.get()))
                .build(consumer,new ResourceLocation("extraores:crushdeepiron"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpDesichalkos),new ItemStack(ItemList.itemDirtyDustDesichalkos.get()))
                .addCriterion("crushdesichalkos",has(ItemList.itemClumpDesichalkos.get()))
                .build(consumer,new ResourceLocation("extraores:crushdesichalkos"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpEximite),new ItemStack(ItemList.itemDirtyDustEximite.get()))
                .addCriterion("crusheximite",has(ItemList.itemClumpEximite.get()))
                .build(consumer,new ResourceLocation("extraores:crusheximite"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpGallium),new ItemStack(ItemList.itemDirtyDustGallium.get()))
                .addCriterion("crushgallium",has(ItemList.itemClumpGallium.get()))
                .build(consumer,new ResourceLocation("extraores:crushgallium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpHaderoth),new ItemStack(ItemList.itemDirtyDustHaderoth.get()))
                .addCriterion("crushhaderoth",has(ItemList.itemClumpHaderoth.get()))
                .build(consumer,new ResourceLocation("extraores:crushhaderoth"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpHepatizon),new ItemStack(ItemList.itemDirtyDustHepatizon.get()))
                .addCriterion("crushhepatizon",has(ItemList.itemClumpHepatizon.get()))
                .build(consumer,new ResourceLocation("extraores:crushhepatizon"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpIgnatius),new ItemStack(ItemList.itemDirtyDustIgnatius.get()))
                .addCriterion("crushignatius",has(ItemList.itemClumpIgnatius.get()))
                .build(consumer,new ResourceLocation("extraores:crushignatius"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpIndium),new ItemStack(ItemList.itemDirtyDustIndium.get()))
                .addCriterion("crushindium",has(ItemList.itemClumpIndium.get()))
                .build(consumer,new ResourceLocation("extraores:crushindium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpInfuscolium),new ItemStack(ItemList.itemDirtyDustInfuscolium.get()))
                .addCriterion("crushinfuscolium",has(ItemList.itemClumpInfuscolium.get()))
                .build(consumer,new ResourceLocation("extraores:crushinfuscolium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpInolashite),new ItemStack(ItemList.itemDirtyDustInolashite.get()))
                .addCriterion("crushinolashite",has(ItemList.itemClumpInolashite.get()))
                .build(consumer,new ResourceLocation("extraores:crushinolashite"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpIridium),new ItemStack(ItemList.itemDirtyDustIridium.get()))
                .addCriterion("crushiridium",has(ItemList.itemClumpIridium.get()))
                .build(consumer,new ResourceLocation("extraores:crushiridium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpKalendrite),new ItemStack(ItemList.itemDirtyDustKalendrite.get()))
                .addCriterion("crushkalendrite",has(ItemList.itemClumpKalendrite.get()))
                .build(consumer,new ResourceLocation("extraores:crushkalendrite"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpLead),new ItemStack(ItemList.itemDirtyDustLead.get()))
                .addCriterion("crushlead",has(ItemList.itemClumpLead.get()))
                .build(consumer,new ResourceLocation("extraores:crushlead"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpLemurite),new ItemStack(ItemList.itemDirtyDustLemurite.get()))
                .addCriterion("crushlemurite",has(ItemList.itemClumpLemurite.get()))
                .build(consumer,new ResourceLocation("extraores:crushlemurite"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpManganese),new ItemStack(ItemList.itemDirtyDustManganese.get()))
                .addCriterion("crushmanganese",has(ItemList.itemClumpManganese.get()))
                .build(consumer,new ResourceLocation("extraores:crushmanganese"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpMeutoite),new ItemStack(ItemList.itemDirtyDustMeutoite.get()))
                .addCriterion("crushmeutoite",has(ItemList.itemClumpMeutoite.get()))
                .build(consumer,new ResourceLocation("extraores:crushmeutoite"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpMidasium),new ItemStack(ItemList.itemDirtyDustMidasium.get()))
                .addCriterion("crushmidasium",has(ItemList.itemClumpMidasium.get()))
                .build(consumer,new ResourceLocation("extraores:crushmidasium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpMithril),new ItemStack(ItemList.itemDirtyDustMithril.get()))
                .addCriterion("crushmithril",has(ItemList.itemClumpMithril.get()))
                .build(consumer,new ResourceLocation("extraores:crushmithril"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpMolybdenum),new ItemStack(ItemList.itemDirtyDustMolybdenum.get()))
                .addCriterion("crushmolybdenum",has(ItemList.itemClumpMolybdenum.get()))
                .build(consumer,new ResourceLocation("extraores:crushmolybdenum"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpNeodymium),new ItemStack(ItemList.itemDirtyDustNeodymium.get()))
                .addCriterion("crushneodymium",has(ItemList.itemClumpNeodymium.get()))
                .build(consumer,new ResourceLocation("extraores:crushneodymium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpNeptunium),new ItemStack(ItemList.itemDirtyDustNeptunium.get()))
                .addCriterion("crushneptunium",has(ItemList.itemClumpNeptunium.get()))
                .build(consumer,new ResourceLocation("extraores:crushneptunium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpNickel),new ItemStack(ItemList.itemDirtyDustNickel.get()))
                .addCriterion("crushnickel",has(ItemList.itemClumpNickel.get()))
                .build(consumer,new ResourceLocation("extraores:crushnickel"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpNiobium),new ItemStack(ItemList.itemDirtyDustNiobium.get()))
                .addCriterion("crushniobium",has(ItemList.itemClumpNiobium.get()))
                .build(consumer,new ResourceLocation("extraores:crushniobium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpOrichalcum),new ItemStack(ItemList.itemDirtyDustOrichalcum.get()))
                .addCriterion("crushorichalcum",has(ItemList.itemClumpOrichalcum.get()))
                .build(consumer,new ResourceLocation("extraores:crushorichalcum"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpOsmium),new ItemStack(ItemList.itemDirtyDustOsmium.get()))
                .addCriterion("crushosmium",has(ItemList.itemClumpOsmium.get()))
                .build(consumer,new ResourceLocation("extraores:crushosmium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpOureclase),new ItemStack(ItemList.itemDirtyDustOureclase.get()))
                .addCriterion("crushoureclase",has(ItemList.itemClumpOureclase.get()))
                .build(consumer,new ResourceLocation("extraores:crushoureclase"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpPalladium),new ItemStack(ItemList.itemDirtyDustPalladium.get()))
                .addCriterion("crushpalladium",has(ItemList.itemClumpPalladium.get()))
                .build(consumer,new ResourceLocation("extraores:crushpalladium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpPlatinum),new ItemStack(ItemList.itemDirtyDustPlatinum.get()))
                .addCriterion("crushplatinum",has(ItemList.itemClumpPlatinum.get()))
                .build(consumer,new ResourceLocation("extraores:crushplatinum"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpPlutonium),new ItemStack(ItemList.itemDirtyDustPlutonium.get()))
                .addCriterion("crushplutonium",has(ItemList.itemClumpPlutonium.get()))
                .build(consumer,new ResourceLocation("extraores:crushplutonium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpPolonium),new ItemStack(ItemList.itemDirtyDustPolonium.get()))
                .addCriterion("crushpolonium",has(ItemList.itemClumpPolonium.get()))
                .build(consumer,new ResourceLocation("extraores:crushpolonium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpPromethium),new ItemStack(ItemList.itemDirtyDustPromethium.get()))
                .addCriterion("crushpromethium",has(ItemList.itemClumpPromethium.get()))
                .build(consumer,new ResourceLocation("extraores:crushpromethium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpRhenium),new ItemStack(ItemList.itemDirtyDustRhenium.get()))
                .addCriterion("crushrhenium",has(ItemList.itemClumpRhenium.get()))
                .build(consumer,new ResourceLocation("extraores:crushrhenium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpRhodium),new ItemStack(ItemList.itemDirtyDustRhodium.get()))
                .addCriterion("crushrhodium",has(ItemList.itemClumpRhodium.get()))
                .build(consumer,new ResourceLocation("extraores:crushrhodium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpRubracium),new ItemStack(ItemList.itemDirtyDustRubracium.get()))
                .addCriterion("crushrubracium",has(ItemList.itemClumpRubracium.get()))
                .build(consumer,new ResourceLocation("extraores:crushrubracium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpRuthenium),new ItemStack(ItemList.itemDirtyDustRuthenium.get()))
                .addCriterion("crushruthenium",has(ItemList.itemClumpRuthenium.get()))
                .build(consumer,new ResourceLocation("extraores:crushruthenium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpSanguinite),new ItemStack(ItemList.itemDirtyDustSanguinite.get()))
                .addCriterion("crushsanguinite",has(ItemList.itemClumpSanguinite.get()))
                .build(consumer,new ResourceLocation("extraores:crushsanguinite"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpShadowIron),new ItemStack(ItemList.itemDirtyDustShadowIron.get()))
                .addCriterion("crushshadowiron",has(ItemList.itemClumpShadowIron.get()))
                .build(consumer,new ResourceLocation("extraores:crushshadowiron"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpSilver),new ItemStack(ItemList.itemDirtyDustSilver.get()))
                .addCriterion("crushsilver",has(ItemList.itemClumpSilver.get()))
                .build(consumer,new ResourceLocation("extraores:crushsilver"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpTantalum),new ItemStack(ItemList.itemDirtyDustTantalum.get()))
                .addCriterion("crushtantalum",has(ItemList.itemClumpTantalum.get()))
                .build(consumer,new ResourceLocation("extraores:crushtantalum"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpTartarite),new ItemStack(ItemList.itemDirtyDustTartarite.get()))
                .addCriterion("crushtartarite",has(ItemList.itemClumpTartarite.get()))
                .build(consumer,new ResourceLocation("extraores:crushtartarite"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpTechnetium),new ItemStack(ItemList.itemDirtyDustTechnetium.get()))
                .addCriterion("crushtechnetium",has(ItemList.itemClumpTechnetium.get()))
                .build(consumer,new ResourceLocation("extraores:crushtechnetium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpThallium),new ItemStack(ItemList.itemDirtyDustThallium.get()))
                .addCriterion("crushthallium",has(ItemList.itemClumpThallium.get()))
                .build(consumer,new ResourceLocation("extraores:crushthallium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpTin),new ItemStack(ItemList.itemDirtyDustTin.get()))
                .addCriterion("crushtin",has(ItemList.itemClumpTin.get()))
                .build(consumer,new ResourceLocation("extraores:crushtin"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpTitanium),new ItemStack(ItemList.itemDirtyDustTitanium.get()))
                .addCriterion("crushtitanium",has(ItemList.itemClumpTitanium.get()))
                .build(consumer,new ResourceLocation("extraores:crushtitanium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpTritium),new ItemStack(ItemList.itemDirtyDustTritium.get()))
                .addCriterion("crushtritium",has(ItemList.itemClumpTritium.get()))
                .build(consumer,new ResourceLocation("extraores:crushtritium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpTungsten),new ItemStack(ItemList.itemDirtyDustTungsten.get()))
                .addCriterion("crushtungsten",has(ItemList.itemClumpTungsten.get()))
                .build(consumer,new ResourceLocation("extraores:crushtungsten"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpUnobtainium),new ItemStack(ItemList.itemDirtyDustUnobtainium.get()))
                .addCriterion("crushunobtainium",has(ItemList.itemClumpUnobtainium.get()))
                .build(consumer,new ResourceLocation("extraores:crushunobtainium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpUranium),new ItemStack(ItemList.itemDirtyDustUranium.get()))
                .addCriterion("crushuranium",has(ItemList.itemClumpUranium.get()))
                .build(consumer,new ResourceLocation("extraores:crushuranium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpVanadium),new ItemStack(ItemList.itemDirtyDustVanadium.get()))
                .addCriterion("crushvanadium",has(ItemList.itemClumpVanadium.get()))
                .build(consumer,new ResourceLocation("extraores:crushvanadium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpVibranium),new ItemStack(ItemList.itemDirtyDustVibranium.get()))
                .addCriterion("crushvibranium",has(ItemList.itemClumpVibranium.get()))
                .build(consumer,new ResourceLocation("extraores:crushvibranium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpVulcanite),new ItemStack(ItemList.itemDirtyDustVulcanite.get()))
                .addCriterion("crushvulcanite",has(ItemList.itemClumpVulcanite.get()))
                .build(consumer,new ResourceLocation("extraores:crushvulcanite"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpVyroxeres),new ItemStack(ItemList.itemDirtyDustVyroxeres.get()))
                .addCriterion("crushvyroxeres",has(ItemList.itemClumpVyroxeres.get()))
                .build(consumer,new ResourceLocation("extraores:crushvyroxeres"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpYellorite),new ItemStack(ItemList.itemDirtyDustYellorite.get()))
                .addCriterion("crushyellorite",has(ItemList.itemClumpYellorite.get()))
                .build(consumer,new ResourceLocation("extraores:crushyellorite"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpZinc),new ItemStack(ItemList.itemDirtyDustZinc.get()))
                .addCriterion("crushzinc",has(ItemList.itemClumpZinc.get()))
                .build(consumer,new ResourceLocation("extraores:crushzinc"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpZirconium),new ItemStack(ItemList.itemDirtyDustZirconium.get()))
                .addCriterion("crushzirconium",has(ItemList.itemClumpZirconium.get()))
                .build(consumer,new ResourceLocation("extraores:crushzirconium"));
    }
    protected void buildMekanismEnriching(Consumer<FinishedRecipe> consumer)
    {
        //Ore
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreAdamantine),new ItemStack(ItemList.itemDustAdamantine.get(),2))
                .addCriterion("enrichadamantineore",has(BlockList.blockOreAdamantine.get()))
                .build(consumer,new ResourceLocation("extraores:enrichadamantineore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreAldourite),new ItemStack(ItemList.itemDustAldourite.get(),2))
                .addCriterion("enrichaldouriteore",has(BlockList.blockOreAldourite.get()))
                .build(consumer,new ResourceLocation("extraores:enrichaldouriteore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreAluminum),new ItemStack(ItemList.itemDustAluminum.get(),2))
                .addCriterion("enrichaluminumore",has(BlockList.blockOreAluminum.get()))
                .build(consumer,new ResourceLocation("extraores:enrichaluminumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreAmericium),new ItemStack(ItemList.itemDustAmericium.get(),2))
                .addCriterion("enrichamericiumore",has(BlockList.blockOreAmericium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichamericiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreAmordrine),new ItemStack(ItemList.itemDustAmordrine.get(),2))
                .addCriterion("enrichamordrineore",has(BlockList.blockOreAmordrine.get()))
                .build(consumer,new ResourceLocation("extraores:enrichamordrineore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreAngmallen),new ItemStack(ItemList.itemDustAngmallen.get(),2))
                .addCriterion("enrichangmallenore",has(BlockList.blockOreAngmallen.get()))
                .build(consumer,new ResourceLocation("extraores:enrichangmallenore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreAstralSilver),new ItemStack(ItemList.itemDustAstralSilver.get(),2))
                .addCriterion("enrichastralsilverore",has(BlockList.blockOreAstralSilver.get()))
                .build(consumer,new ResourceLocation("extraores:enrichastralsilverore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreAtlarus),new ItemStack(ItemList.itemDustAtlarus.get(),2))
                .addCriterion("enrichatlarusore",has(BlockList.blockOreAtlarus.get()))
                .build(consumer,new ResourceLocation("extraores:enrichatlarusore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreBismuth),new ItemStack(ItemList.itemDustBismuth.get(),2))
                .addCriterion("enrichbismuthore",has(BlockList.blockOreBismuth.get()))
                .build(consumer,new ResourceLocation("extraores:enrichbismuthore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreBlackSteel),new ItemStack(ItemList.itemDustBlackSteel.get(),2))
                .addCriterion("enrichblacksteelore",has(BlockList.blockOreBlackSteel.get()))
                .build(consumer,new ResourceLocation("extraores:enrichblacksteelore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreCadmium),new ItemStack(ItemList.itemDustCadmium.get(),2))
                .addCriterion("enrichcadmiumore",has(BlockList.blockOreCadmium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichcadmiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreCarmot),new ItemStack(ItemList.itemDustCarmot.get(),2))
                .addCriterion("enrichcarmotore",has(BlockList.blockOreCarmot.get()))
                .build(consumer,new ResourceLocation("extraores:enrichcarmotore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreCelenegil),new ItemStack(ItemList.itemDustCelenegil.get(),2))
                .addCriterion("enrichcelenegilore",has(BlockList.blockOreCelenegil.get()))
                .build(consumer,new ResourceLocation("extraores:enrichcelenegilore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreCeruclase),new ItemStack(ItemList.itemDustCeruclase.get(),2))
                .addCriterion("enrichceruclaseore",has(BlockList.blockOreCeruclase.get()))
                .build(consumer,new ResourceLocation("extraores:enrichceruclaseore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreChromium),new ItemStack(ItemList.itemDustChromium.get(),2))
                .addCriterion("enrichchromiumore",has(BlockList.blockOreChromium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichchromiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreCobalt),new ItemStack(ItemList.itemDustCobalt.get(),2))
                .addCriterion("enrichcobaltore",has(BlockList.blockOreCobalt.get()))
                .build(consumer,new ResourceLocation("extraores:enrichcobaltore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreCopper),new ItemStack(ItemList.itemDustCopper.get(),2))
                .addCriterion("enrichcopperore",has(BlockList.blockOreCopper.get()))
                .build(consumer,new ResourceLocation("extraores:enrichcopperore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreCrimsonSteel),new ItemStack(ItemList.itemDustCrimsonSteel.get(),2))
                .addCriterion("enrichcrimsonsteelore",has(BlockList.blockOreCrimsonSteel.get()))
                .build(consumer,new ResourceLocation("extraores:enrichcrimsonsteelore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreDeepIron),new ItemStack(ItemList.itemDustDeepIron.get(),2))
                .addCriterion("enrichdeepironore",has(BlockList.blockOreDeepIron.get()))
                .build(consumer,new ResourceLocation("extraores:enrichdeepironore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreDesichalkos),new ItemStack(ItemList.itemDustDesichalkos.get(),2))
                .addCriterion("enrichdesichalkosore",has(BlockList.blockOreDesichalkos.get()))
                .build(consumer,new ResourceLocation("extraores:enrichdesichalkosore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreEximite),new ItemStack(ItemList.itemDustEximite.get(),2))
                .addCriterion("enricheximiteore",has(BlockList.blockOreEximite.get()))
                .build(consumer,new ResourceLocation("extraores:enricheximiteore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreGallium),new ItemStack(ItemList.itemDustGallium.get(),2))
                .addCriterion("enrichgalliumore",has(BlockList.blockOreGallium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichgalliumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreHaderoth),new ItemStack(ItemList.itemDustHaderoth.get(),2))
                .addCriterion("enrichhaderothore",has(BlockList.blockOreHaderoth.get()))
                .build(consumer,new ResourceLocation("extraores:enrichhaderothore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreHepatizon),new ItemStack(ItemList.itemDustHepatizon.get(),2))
                .addCriterion("enrichhepatizonore",has(BlockList.blockOreHepatizon.get()))
                .build(consumer,new ResourceLocation("extraores:enrichhepatizonore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreIgnatius),new ItemStack(ItemList.itemDustIgnatius.get(),2))
                .addCriterion("enrichignatiusore",has(BlockList.blockOreIgnatius.get()))
                .build(consumer,new ResourceLocation("extraores:enrichignatiusore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreIndium),new ItemStack(ItemList.itemDustIndium.get(),2))
                .addCriterion("enrichindiumore",has(BlockList.blockOreIndium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichindiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreInfuscolium),new ItemStack(ItemList.itemDustInfuscolium.get(),2))
                .addCriterion("enrichinfuscoliumore",has(BlockList.blockOreInfuscolium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichinfuscoliumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreInolashite),new ItemStack(ItemList.itemDustInolashite.get(),2))
                .addCriterion("enrichinolashiteore",has(BlockList.blockOreInolashite.get()))
                .build(consumer,new ResourceLocation("extraores:enrichinolashiteore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreIridium),new ItemStack(ItemList.itemDustIridium.get(),2))
                .addCriterion("enrichiridiumore",has(BlockList.blockOreIridium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichiridiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreKalendrite),new ItemStack(ItemList.itemDustKalendrite.get(),2))
                .addCriterion("enrichkalendriteore",has(BlockList.blockOreKalendrite.get()))
                .build(consumer,new ResourceLocation("extraores:enrichkalendriteore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreLead),new ItemStack(ItemList.itemDustLead.get(),2))
                .addCriterion("enrichleadore",has(BlockList.blockOreLead.get()))
                .build(consumer,new ResourceLocation("extraores:enrichleadore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreLemurite),new ItemStack(ItemList.itemDustLemurite.get(),2))
                .addCriterion("enrichlemuriteore",has(BlockList.blockOreLemurite.get()))
                .build(consumer,new ResourceLocation("extraores:enrichlemuriteore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreManganese),new ItemStack(ItemList.itemDustManganese.get(),2))
                .addCriterion("enrichmanganeseore",has(BlockList.blockOreManganese.get()))
                .build(consumer,new ResourceLocation("extraores:enrichmanganeseore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreMeutoite),new ItemStack(ItemList.itemDustMeutoite.get(),2))
                .addCriterion("enrichmeutoiteore",has(BlockList.blockOreMeutoite.get()))
                .build(consumer,new ResourceLocation("extraores:enrichmeutoiteore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreMidasium),new ItemStack(ItemList.itemDustMidasium.get(),2))
                .addCriterion("enrichmidasiumore",has(BlockList.blockOreMidasium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichmidasiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreMithril),new ItemStack(ItemList.itemDustMithril.get(),2))
                .addCriterion("enrichmithrilore",has(BlockList.blockOreMithril.get()))
                .build(consumer,new ResourceLocation("extraores:enrichmithrilore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreMolybdenum),new ItemStack(ItemList.itemDustMolybdenum.get(),2))
                .addCriterion("enrichmolybdenumore",has(BlockList.blockOreMolybdenum.get()))
                .build(consumer,new ResourceLocation("extraores:enrichmolybdenumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreNeodymium),new ItemStack(ItemList.itemDustNeodymium.get(),2))
                .addCriterion("enrichneodymiumore",has(BlockList.blockOreNeodymium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichneodymiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreNeptunium),new ItemStack(ItemList.itemDustNeptunium.get(),2))
                .addCriterion("enrichneptuniumore",has(BlockList.blockOreNeptunium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichneptuniumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreNickel),new ItemStack(ItemList.itemDustNickel.get(),2))
                .addCriterion("enrichnickelore",has(BlockList.blockOreNickel.get()))
                .build(consumer,new ResourceLocation("extraores:enrichnickelore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreNiobium),new ItemStack(ItemList.itemDustNiobium.get(),2))
                .addCriterion("enrichniobiumore",has(BlockList.blockOreNiobium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichniobiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreOrichalcum),new ItemStack(ItemList.itemDustOrichalcum.get(),2))
                .addCriterion("enrichorichalcumore",has(BlockList.blockOreOrichalcum.get()))
                .build(consumer,new ResourceLocation("extraores:enrichorichalcumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreOsmium),new ItemStack(ItemList.itemDustOsmium.get(),2))
                .addCriterion("enrichosmiumore",has(BlockList.blockOreOsmium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichosmiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreOureclase),new ItemStack(ItemList.itemDustOureclase.get(),2))
                .addCriterion("enrichoureclaseore",has(BlockList.blockOreOureclase.get()))
                .build(consumer,new ResourceLocation("extraores:enrichoureclaseore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.orePalladium),new ItemStack(ItemList.itemDustPalladium.get(),2))
                .addCriterion("enrichpalladiumore",has(BlockList.blockOrePalladium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichpalladiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.orePlatinum),new ItemStack(ItemList.itemDustPlatinum.get(),2))
                .addCriterion("enrichplatinumore",has(BlockList.blockOrePlatinum.get()))
                .build(consumer,new ResourceLocation("extraores:enrichplatinumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.orePlutonium),new ItemStack(ItemList.itemDustPlutonium.get(),2))
                .addCriterion("enrichplutoniumore",has(BlockList.blockOrePlutonium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichplutoniumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.orePolonium),new ItemStack(ItemList.itemDustPolonium.get(),2))
                .addCriterion("enrichpoloniumore",has(BlockList.blockOrePolonium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichpoloniumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.orePromethium),new ItemStack(ItemList.itemDustPromethium.get(),2))
                .addCriterion("enrichpromethiumore",has(BlockList.blockOrePromethium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichpromethiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreRhenium),new ItemStack(ItemList.itemDustRhenium.get(),2))
                .addCriterion("enrichrheniumore",has(BlockList.blockOreRhenium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrheniumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreRhodium),new ItemStack(ItemList.itemDustRhodium.get(),2))
                .addCriterion("enrichrhodiumore",has(BlockList.blockOreRhodium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrhodiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreRubracium),new ItemStack(ItemList.itemDustRubracium.get(),2))
                .addCriterion("enrichrubraciumore",has(BlockList.blockOreRubracium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrubraciumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreRuthenium),new ItemStack(ItemList.itemDustRuthenium.get(),2))
                .addCriterion("enrichrutheniumore",has(BlockList.blockOreRuthenium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrutheniumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreSanguinite),new ItemStack(ItemList.itemDustSanguinite.get(),2))
                .addCriterion("enrichsanguiniteore",has(BlockList.blockOreSanguinite.get()))
                .build(consumer,new ResourceLocation("extraores:enrichsanguiniteore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreShadowIron),new ItemStack(ItemList.itemDustShadowIron.get(),2))
                .addCriterion("enrichshadowironore",has(BlockList.blockOreShadowIron.get()))
                .build(consumer,new ResourceLocation("extraores:enrichshadowironore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreSilver),new ItemStack(ItemList.itemDustSilver.get(),2))
                .addCriterion("enrichsilverore",has(BlockList.blockOreSilver.get()))
                .build(consumer,new ResourceLocation("extraores:enrichsilverore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreTantalum),new ItemStack(ItemList.itemDustTantalum.get(),2))
                .addCriterion("enrichtantalumore",has(BlockList.blockOreTantalum.get()))
                .build(consumer,new ResourceLocation("extraores:enrichtantalumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreTartarite),new ItemStack(ItemList.itemDustTartarite.get(),2))
                .addCriterion("enrichtartariteore",has(BlockList.blockOreTartarite.get()))
                .build(consumer,new ResourceLocation("extraores:enrichtartariteore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreTechnetium),new ItemStack(ItemList.itemDustTechnetium.get(),2))
                .addCriterion("enrichtechnetiumore",has(BlockList.blockOreTechnetium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichtechnetiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreThallium),new ItemStack(ItemList.itemDustThallium.get(),2))
                .addCriterion("enrichthalliumore",has(BlockList.blockOreThallium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichthalliumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreTin),new ItemStack(ItemList.itemDustTin.get(),2))
                .addCriterion("enrichtinore",has(BlockList.blockOreTin.get()))
                .build(consumer,new ResourceLocation("extraores:enrichtinore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreTitanium),new ItemStack(ItemList.itemDustTitanium.get(),2))
                .addCriterion("enrichtitaniumore",has(BlockList.blockOreTitanium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichtitaniumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreTritium),new ItemStack(ItemList.itemDustTritium.get(),2))
                .addCriterion("enrichtritiumore",has(BlockList.blockOreTritium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichtritiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreTungsten),new ItemStack(ItemList.itemDustTungsten.get(),2))
                .addCriterion("enrichtungstenore",has(BlockList.blockOreTungsten.get()))
                .build(consumer,new ResourceLocation("extraores:enrichtungstenore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreUnobtainium),new ItemStack(ItemList.itemDustUnobtainium.get(),2))
                .addCriterion("enrichunobtainiumore",has(BlockList.blockOreUnobtainium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichunobtainiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreUranium),new ItemStack(ItemList.itemDustUranium.get(),2))
                .addCriterion("enrichuraniumore",has(BlockList.blockOreUranium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichuraniumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreVanadium),new ItemStack(ItemList.itemDustVanadium.get(),2))
                .addCriterion("enrichvanadiumore",has(BlockList.blockOreVanadium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichvanadiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreVibranium),new ItemStack(ItemList.itemDustVibranium.get(),2))
                .addCriterion("enrichvibraniumore",has(BlockList.blockOreVibranium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichvibraniumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreVulcanite),new ItemStack(ItemList.itemDustVulcanite.get(),2))
                .addCriterion("enrichvulcaniteore",has(BlockList.blockOreVulcanite.get()))
                .build(consumer,new ResourceLocation("extraores:enrichvulcaniteore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreVyroxeres),new ItemStack(ItemList.itemDustVyroxeres.get(),2))
                .addCriterion("enrichvyroxeresore",has(BlockList.blockOreVyroxeres.get()))
                .build(consumer,new ResourceLocation("extraores:enrichvyroxeresore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreYellorite),new ItemStack(ItemList.itemDustYellorite.get(),2))
                .addCriterion("enrichyelloriteore",has(BlockList.blockOreYellorite.get()))
                .build(consumer,new ResourceLocation("extraores:enrichyelloriteore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreZinc),new ItemStack(ItemList.itemDustZinc.get(),2))
                .addCriterion("enrichzincore",has(BlockList.blockOreZinc.get()))
                .build(consumer,new ResourceLocation("extraores:enrichzincore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreZirconium),new ItemStack(ItemList.itemDustZirconium.get(),2))
                .addCriterion("enrichzirconiumore",has(BlockList.blockOreZirconium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichzirconiumore"));
        //Raw
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawAdamantine),new ItemStack(ItemList.itemDustAdamantine.get(),2))
                .addCriterion("enrichrawadamantine",has(ItemList.itemRawAdamantine.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawadamantine"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawAldourite),new ItemStack(ItemList.itemDustAldourite.get(),2))
                .addCriterion("enrichrawaldourite",has(ItemList.itemRawAldourite.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawaldourite"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawAluminum),new ItemStack(ItemList.itemDustAluminum.get(),2))
                .addCriterion("enrichrawaluminum",has(ItemList.itemRawAluminum.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawaluminum"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawAmericium),new ItemStack(ItemList.itemDustAmericium.get(),2))
                .addCriterion("enrichrawamericium",has(ItemList.itemRawAmericium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawamericium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawAmordrine),new ItemStack(ItemList.itemDustAmordrine.get(),2))
                .addCriterion("enrichrawamordrine",has(ItemList.itemRawAmordrine.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawamordrine"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawAngmallen),new ItemStack(ItemList.itemDustAngmallen.get(),2))
                .addCriterion("enrichrawangmallen",has(ItemList.itemRawAngmallen.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawangmallen"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawAstralSilver),new ItemStack(ItemList.itemDustAstralSilver.get(),2))
                .addCriterion("enrichrawastralsilver",has(ItemList.itemRawAstralSilver.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawastralsilver"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawAtlarus),new ItemStack(ItemList.itemDustAtlarus.get(),2))
                .addCriterion("enrichrawatlarus",has(ItemList.itemRawAtlarus.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawatlarus"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawBismuth),new ItemStack(ItemList.itemDustBismuth.get(),2))
                .addCriterion("enrichrawbismuth",has(ItemList.itemRawBismuth.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawbismuth"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawBlackSteel),new ItemStack(ItemList.itemDustBlackSteel.get(),2))
                .addCriterion("enrichrawblacksteel",has(ItemList.itemRawBlackSteel.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawblacksteel"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawCadmium),new ItemStack(ItemList.itemDustCadmium.get(),2))
                .addCriterion("enrichrawcadmium",has(ItemList.itemRawCadmium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawcadmium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawCarmot),new ItemStack(ItemList.itemDustCarmot.get(),2))
                .addCriterion("enrichrawcarmot",has(ItemList.itemRawCarmot.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawcarmot"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawCelenegil),new ItemStack(ItemList.itemDustCelenegil.get(),2))
                .addCriterion("enrichrawcelenegil",has(ItemList.itemRawCelenegil.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawcelenegil"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawCeruclase),new ItemStack(ItemList.itemDustCeruclase.get(),2))
                .addCriterion("enrichrawceruclase",has(ItemList.itemRawCeruclase.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawceruclase"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawChromium),new ItemStack(ItemList.itemDustChromium.get(),2))
                .addCriterion("enrichrawchromium",has(ItemList.itemRawChromium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawchromium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawCobalt),new ItemStack(ItemList.itemDustCobalt.get(),2))
                .addCriterion("enrichrawcobalt",has(ItemList.itemRawCobalt.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawcobalt"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawCopper),new ItemStack(ItemList.itemDustCopper.get(),2))
                .addCriterion("enrichrawcopper",has(ItemList.itemRawCopper.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawcopper"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawCrimsonSteel),new ItemStack(ItemList.itemDustCrimsonSteel.get(),2))
                .addCriterion("enrichrawcrimsonsteel",has(ItemList.itemRawCrimsonSteel.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawcrimsonsteel"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawDeepIron),new ItemStack(ItemList.itemDustDeepIron.get(),2))
                .addCriterion("enrichrawdeepiron",has(ItemList.itemRawDeepIron.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawdeepiron"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawDesichalkos),new ItemStack(ItemList.itemDustDesichalkos.get(),2))
                .addCriterion("enrichrawdesichalkos",has(ItemList.itemRawDesichalkos.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawdesichalkos"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawEximite),new ItemStack(ItemList.itemDustEximite.get(),2))
                .addCriterion("enrichraweximite",has(ItemList.itemRawEximite.get()))
                .build(consumer,new ResourceLocation("extraores:enrichraweximite"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawGallium),new ItemStack(ItemList.itemDustGallium.get(),2))
                .addCriterion("enrichrawgallium",has(ItemList.itemRawGallium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawgallium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawHaderoth),new ItemStack(ItemList.itemDustHaderoth.get(),2))
                .addCriterion("enrichrawhaderoth",has(ItemList.itemRawHaderoth.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawhaderoth"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawHepatizon),new ItemStack(ItemList.itemDustHepatizon.get(),2))
                .addCriterion("enrichrawhepatizon",has(ItemList.itemRawHepatizon.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawhepatizon"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawIgnatius),new ItemStack(ItemList.itemDustIgnatius.get(),2))
                .addCriterion("enrichrawignatius",has(ItemList.itemRawIgnatius.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawignatius"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawIndium),new ItemStack(ItemList.itemDustIndium.get(),2))
                .addCriterion("enrichrawindium",has(ItemList.itemRawIndium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawindium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawInfuscolium),new ItemStack(ItemList.itemDustInfuscolium.get(),2))
                .addCriterion("enrichrawinfuscolium",has(ItemList.itemRawInfuscolium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawinfuscolium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawInolashite),new ItemStack(ItemList.itemDustInolashite.get(),2))
                .addCriterion("enrichrawinolashite",has(ItemList.itemRawInolashite.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawinolashite"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawIridium),new ItemStack(ItemList.itemDustIridium.get(),2))
                .addCriterion("enrichrawiridium",has(ItemList.itemRawIridium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawiridium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawKalendrite),new ItemStack(ItemList.itemDustKalendrite.get(),2))
                .addCriterion("enrichrawkalendrite",has(ItemList.itemRawKalendrite.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawkalendrite"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawLead),new ItemStack(ItemList.itemDustLead.get(),2))
                .addCriterion("enrichrawlead",has(ItemList.itemRawLead.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawlead"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawLemurite),new ItemStack(ItemList.itemDustLemurite.get(),2))
                .addCriterion("enrichrawlemurite",has(ItemList.itemRawLemurite.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawlemurite"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawManganese),new ItemStack(ItemList.itemDustManganese.get(),2))
                .addCriterion("enrichrawmanganese",has(ItemList.itemRawManganese.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawmanganese"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawMeutoite),new ItemStack(ItemList.itemDustMeutoite.get(),2))
                .addCriterion("enrichrawmeutoite",has(ItemList.itemRawMeutoite.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawmeutoite"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawMidasium),new ItemStack(ItemList.itemDustMidasium.get(),2))
                .addCriterion("enrichrawmidasium",has(ItemList.itemRawMidasium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawmidasium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawMithril),new ItemStack(ItemList.itemDustMithril.get(),2))
                .addCriterion("enrichrawmithril",has(ItemList.itemRawMithril.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawmithril"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawMolybdenum),new ItemStack(ItemList.itemDustMolybdenum.get(),2))
                .addCriterion("enrichrawmolybdenum",has(ItemList.itemRawMolybdenum.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawmolybdenum"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawNeodymium),new ItemStack(ItemList.itemDustNeodymium.get(),2))
                .addCriterion("enrichrawneodymium",has(ItemList.itemRawNeodymium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawneodymium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawNeptunium),new ItemStack(ItemList.itemDustNeptunium.get(),2))
                .addCriterion("enrichrawneptunium",has(ItemList.itemRawNeptunium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawneptunium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawNickel),new ItemStack(ItemList.itemDustNickel.get(),2))
                .addCriterion("enrichrawnickel",has(ItemList.itemRawNickel.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawnickel"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawNiobium),new ItemStack(ItemList.itemDustNiobium.get(),2))
                .addCriterion("enrichrawniobium",has(ItemList.itemRawNiobium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawniobium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawOrichalcum),new ItemStack(ItemList.itemDustOrichalcum.get(),2))
                .addCriterion("enrichraworichalcum",has(ItemList.itemRawOrichalcum.get()))
                .build(consumer,new ResourceLocation("extraores:enrichraworichalcum"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawOsmium),new ItemStack(ItemList.itemDustOsmium.get(),2))
                .addCriterion("enrichrawosmium",has(ItemList.itemRawOsmium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawosmium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawOureclase),new ItemStack(ItemList.itemDustOureclase.get(),2))
                .addCriterion("enrichrawoureclase",has(ItemList.itemRawOureclase.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawoureclase"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawPalladium),new ItemStack(ItemList.itemDustPalladium.get(),2))
                .addCriterion("enrichrawpalladium",has(ItemList.itemRawPalladium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawpalladium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawPlatinum),new ItemStack(ItemList.itemDustPlatinum.get(),2))
                .addCriterion("enrichrawplatinum",has(ItemList.itemRawPlatinum.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawplatinum"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawPlutonium),new ItemStack(ItemList.itemDustPlutonium.get(),2))
                .addCriterion("enrichrawplutonium",has(ItemList.itemRawPlutonium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawplutonium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawPolonium),new ItemStack(ItemList.itemDustPolonium.get(),2))
                .addCriterion("enrichrawpolonium",has(ItemList.itemRawPolonium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawpolonium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawPromethium),new ItemStack(ItemList.itemDustPromethium.get(),2))
                .addCriterion("enrichrawpromethium",has(ItemList.itemRawPromethium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawpromethium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawRhenium),new ItemStack(ItemList.itemDustRhenium.get(),2))
                .addCriterion("enrichrawrhenium",has(ItemList.itemRawRhenium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawrhenium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawRhodium),new ItemStack(ItemList.itemDustRhodium.get(),2))
                .addCriterion("enrichrawrhodium",has(ItemList.itemRawRhodium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawrhodium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawRubracium),new ItemStack(ItemList.itemDustRubracium.get(),2))
                .addCriterion("enrichrawrubracium",has(ItemList.itemRawRubracium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawrubracium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawRuthenium),new ItemStack(ItemList.itemDustRuthenium.get(),2))
                .addCriterion("enrichrawruthenium",has(ItemList.itemRawRuthenium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawruthenium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawSanguinite),new ItemStack(ItemList.itemDustSanguinite.get(),2))
                .addCriterion("enrichrawsanguinite",has(ItemList.itemRawSanguinite.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawsanguinite"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawShadowIron),new ItemStack(ItemList.itemDustShadowIron.get(),2))
                .addCriterion("enrichrawshadowiron",has(ItemList.itemRawShadowIron.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawshadowiron"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawSilver),new ItemStack(ItemList.itemDustSilver.get(),2))
                .addCriterion("enrichrawsilver",has(ItemList.itemRawSilver.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawsilver"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawTantalum),new ItemStack(ItemList.itemDustTantalum.get(),2))
                .addCriterion("enrichrawtantalum",has(ItemList.itemRawTantalum.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawtantalum"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawTartarite),new ItemStack(ItemList.itemDustTartarite.get(),2))
                .addCriterion("enrichrawtartarite",has(ItemList.itemRawTartarite.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawtartarite"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawTechnetium),new ItemStack(ItemList.itemDustTechnetium.get(),2))
                .addCriterion("enrichrawtechnetium",has(ItemList.itemRawTechnetium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawtechnetium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawThallium),new ItemStack(ItemList.itemDustThallium.get(),2))
                .addCriterion("enrichrawthallium",has(ItemList.itemRawThallium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawthallium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawTin),new ItemStack(ItemList.itemDustTin.get(),2))
                .addCriterion("enrichrawtin",has(ItemList.itemRawTin.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawtin"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawTitanium),new ItemStack(ItemList.itemDustTitanium.get(),2))
                .addCriterion("enrichrawtitanium",has(ItemList.itemRawTitanium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawtitanium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawTritium),new ItemStack(ItemList.itemDustTritium.get(),2))
                .addCriterion("enrichrawtritium",has(ItemList.itemRawTritium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawtritium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawTungsten),new ItemStack(ItemList.itemDustTungsten.get(),2))
                .addCriterion("enrichrawtungsten",has(ItemList.itemRawTungsten.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawtungsten"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawUnobtainium),new ItemStack(ItemList.itemDustUnobtainium.get(),2))
                .addCriterion("enrichrawunobtainium",has(ItemList.itemRawUnobtainium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawunobtainium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawUranium),new ItemStack(ItemList.itemDustUranium.get(),2))
                .addCriterion("enrichrawuranium",has(ItemList.itemRawUranium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawuranium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawVanadium),new ItemStack(ItemList.itemDustVanadium.get(),2))
                .addCriterion("enrichrawvanadium",has(ItemList.itemRawVanadium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawvanadium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawVibranium),new ItemStack(ItemList.itemDustVibranium.get(),2))
                .addCriterion("enrichrawvibranium",has(ItemList.itemRawVibranium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawvibranium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawVulcanite),new ItemStack(ItemList.itemDustVulcanite.get(),2))
                .addCriterion("enrichrawvulcanite",has(ItemList.itemRawVulcanite.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawvulcanite"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawVyroxeres),new ItemStack(ItemList.itemDustVyroxeres.get(),2))
                .addCriterion("enrichrawvyroxeres",has(ItemList.itemRawVyroxeres.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawvyroxeres"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawYellorite),new ItemStack(ItemList.itemDustYellorite.get(),2))
                .addCriterion("enrichrawyellorite",has(ItemList.itemRawYellorite.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawyellorite"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawZinc),new ItemStack(ItemList.itemDustZinc.get(),2))
                .addCriterion("enrichrawzinc",has(ItemList.itemRawZinc.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawzinc"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawZirconium),new ItemStack(ItemList.itemDustZirconium.get(),2))
                .addCriterion("enrichrawzirconium",has(ItemList.itemRawZirconium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrawzirconium"));
        //Dirty Dust
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustAdamantine),new ItemStack(ItemList.itemDustAdamantine.get()))
                .addCriterion("enrichadamantinedirtydust",has(BlockList.blockOreAdamantine.get()))
                .build(consumer,new ResourceLocation("extraores:enrichadamantinedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustAldourite),new ItemStack(ItemList.itemDustAldourite.get()))
                .addCriterion("enrichaldouritedirtydust",has(BlockList.blockOreAldourite.get()))
                .build(consumer,new ResourceLocation("extraores:enrichaldouritedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustAluminum),new ItemStack(ItemList.itemDustAluminum.get()))
                .addCriterion("enrichaluminumdirtydust",has(BlockList.blockOreAluminum.get()))
                .build(consumer,new ResourceLocation("extraores:enrichaluminumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustAmericium),new ItemStack(ItemList.itemDustAmericium.get()))
                .addCriterion("enrichamericiumdirtydust",has(BlockList.blockOreAmericium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichamericiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustAmordrine),new ItemStack(ItemList.itemDustAmordrine.get()))
                .addCriterion("enrichamordrinedirtydust",has(BlockList.blockOreAmordrine.get()))
                .build(consumer,new ResourceLocation("extraores:enrichamordrinedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustAngmallen),new ItemStack(ItemList.itemDustAngmallen.get()))
                .addCriterion("enrichangmallendirtydust",has(BlockList.blockOreAngmallen.get()))
                .build(consumer,new ResourceLocation("extraores:enrichangmallendirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustAstralSilver),new ItemStack(ItemList.itemDustAstralSilver.get()))
                .addCriterion("enrichastralsilverdirtydust",has(BlockList.blockOreAstralSilver.get()))
                .build(consumer,new ResourceLocation("extraores:enrichastralsilverdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustAtlarus),new ItemStack(ItemList.itemDustAtlarus.get()))
                .addCriterion("enrichatlarusdirtydust",has(BlockList.blockOreAtlarus.get()))
                .build(consumer,new ResourceLocation("extraores:enrichatlarusdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustBismuth),new ItemStack(ItemList.itemDustBismuth.get()))
                .addCriterion("enrichbismuthdirtydust",has(BlockList.blockOreBismuth.get()))
                .build(consumer,new ResourceLocation("extraores:enrichbismuthdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustBlackSteel),new ItemStack(ItemList.itemDustBlackSteel.get()))
                .addCriterion("enrichblacksteeldirtydust",has(BlockList.blockOreBlackSteel.get()))
                .build(consumer,new ResourceLocation("extraores:enrichblacksteeldirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustCadmium),new ItemStack(ItemList.itemDustCadmium.get()))
                .addCriterion("enrichcadmiumdirtydust",has(BlockList.blockOreCadmium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichcadmiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustCarmot),new ItemStack(ItemList.itemDustCarmot.get()))
                .addCriterion("enrichcarmotdirtydust",has(BlockList.blockOreCarmot.get()))
                .build(consumer,new ResourceLocation("extraores:enrichcarmotdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustCelenegil),new ItemStack(ItemList.itemDustCelenegil.get()))
                .addCriterion("enrichcelenegildirtydust",has(BlockList.blockOreCelenegil.get()))
                .build(consumer,new ResourceLocation("extraores:enrichcelenegildirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustCeruclase),new ItemStack(ItemList.itemDustCeruclase.get()))
                .addCriterion("enrichceruclasedirtydust",has(BlockList.blockOreCeruclase.get()))
                .build(consumer,new ResourceLocation("extraores:enrichceruclasedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustChromium),new ItemStack(ItemList.itemDustChromium.get()))
                .addCriterion("enrichchromiumdirtydust",has(BlockList.blockOreChromium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichchromiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustCobalt),new ItemStack(ItemList.itemDustCobalt.get()))
                .addCriterion("enrichcobaltdirtydust",has(BlockList.blockOreCobalt.get()))
                .build(consumer,new ResourceLocation("extraores:enrichcobaltdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustCopper),new ItemStack(ItemList.itemDustCopper.get()))
                .addCriterion("enrichcopperdirtydust",has(BlockList.blockOreCopper.get()))
                .build(consumer,new ResourceLocation("extraores:enrichcopperdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustCrimsonSteel),new ItemStack(ItemList.itemDustCrimsonSteel.get()))
                .addCriterion("enrichcrimsonsteeldirtydust",has(BlockList.blockOreCrimsonSteel.get()))
                .build(consumer,new ResourceLocation("extraores:enrichcrimsonsteeldirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustDeepIron),new ItemStack(ItemList.itemDustDeepIron.get()))
                .addCriterion("enrichdeepirondirtydust",has(BlockList.blockOreDeepIron.get()))
                .build(consumer,new ResourceLocation("extraores:enrichdeepirondirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustDesichalkos),new ItemStack(ItemList.itemDustDesichalkos.get()))
                .addCriterion("enrichdesichalkosdirtydust",has(BlockList.blockOreDesichalkos.get()))
                .build(consumer,new ResourceLocation("extraores:enrichdesichalkosdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustEximite),new ItemStack(ItemList.itemDustEximite.get()))
                .addCriterion("enricheximitedirtydust",has(BlockList.blockOreEximite.get()))
                .build(consumer,new ResourceLocation("extraores:enricheximitedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustGallium),new ItemStack(ItemList.itemDustGallium.get()))
                .addCriterion("enrichgalliumdirtydust",has(BlockList.blockOreGallium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichgalliumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustHaderoth),new ItemStack(ItemList.itemDustHaderoth.get()))
                .addCriterion("enrichhaderothdirtydust",has(BlockList.blockOreHaderoth.get()))
                .build(consumer,new ResourceLocation("extraores:enrichhaderothdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustHepatizon),new ItemStack(ItemList.itemDustHepatizon.get()))
                .addCriterion("enrichhepatizondirtydust",has(BlockList.blockOreHepatizon.get()))
                .build(consumer,new ResourceLocation("extraores:enrichhepatizondirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustIgnatius),new ItemStack(ItemList.itemDustIgnatius.get()))
                .addCriterion("enrichignatiusdirtydust",has(BlockList.blockOreIgnatius.get()))
                .build(consumer,new ResourceLocation("extraores:enrichignatiusdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustIndium),new ItemStack(ItemList.itemDustIndium.get()))
                .addCriterion("enrichindiumdirtydust",has(BlockList.blockOreIndium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichindiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustInfuscolium),new ItemStack(ItemList.itemDustInfuscolium.get()))
                .addCriterion("enrichinfuscoliumdirtydust",has(BlockList.blockOreInfuscolium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichinfuscoliumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustInolashite),new ItemStack(ItemList.itemDustInolashite.get()))
                .addCriterion("enrichinolashitedirtydust",has(BlockList.blockOreInolashite.get()))
                .build(consumer,new ResourceLocation("extraores:enrichinolashitedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustIridium),new ItemStack(ItemList.itemDustIridium.get()))
                .addCriterion("enrichiridiumdirtydust",has(BlockList.blockOreIridium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichiridiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustKalendrite),new ItemStack(ItemList.itemDustKalendrite.get()))
                .addCriterion("enrichkalendritedirtydust",has(BlockList.blockOreKalendrite.get()))
                .build(consumer,new ResourceLocation("extraores:enrichkalendritedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustLead),new ItemStack(ItemList.itemDustLead.get()))
                .addCriterion("enrichleaddirtydust",has(BlockList.blockOreLead.get()))
                .build(consumer,new ResourceLocation("extraores:enrichleaddirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustLemurite),new ItemStack(ItemList.itemDustLemurite.get()))
                .addCriterion("enrichlemuritedirtydust",has(BlockList.blockOreLemurite.get()))
                .build(consumer,new ResourceLocation("extraores:enrichlemuritedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustManganese),new ItemStack(ItemList.itemDustManganese.get()))
                .addCriterion("enrichmanganesedirtydust",has(BlockList.blockOreManganese.get()))
                .build(consumer,new ResourceLocation("extraores:enrichmanganesedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustMeutoite),new ItemStack(ItemList.itemDustMeutoite.get()))
                .addCriterion("enrichmeutoitedirtydust",has(BlockList.blockOreMeutoite.get()))
                .build(consumer,new ResourceLocation("extraores:enrichmeutoitedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustMidasium),new ItemStack(ItemList.itemDustMidasium.get()))
                .addCriterion("enrichmidasiumdirtydust",has(BlockList.blockOreMidasium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichmidasiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustMithril),new ItemStack(ItemList.itemDustMithril.get()))
                .addCriterion("enrichmithrildirtydust",has(BlockList.blockOreMithril.get()))
                .build(consumer,new ResourceLocation("extraores:enrichmithrildirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustMolybdenum),new ItemStack(ItemList.itemDustMolybdenum.get()))
                .addCriterion("enrichmolybdenumdirtydust",has(BlockList.blockOreMolybdenum.get()))
                .build(consumer,new ResourceLocation("extraores:enrichmolybdenumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustNeodymium),new ItemStack(ItemList.itemDustNeodymium.get()))
                .addCriterion("enrichneodymiumdirtydust",has(BlockList.blockOreNeodymium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichneodymiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustNeptunium),new ItemStack(ItemList.itemDustNeptunium.get()))
                .addCriterion("enrichneptuniumdirtydust",has(BlockList.blockOreNeptunium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichneptuniumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustNickel),new ItemStack(ItemList.itemDustNickel.get()))
                .addCriterion("enrichnickeldirtydust",has(BlockList.blockOreNickel.get()))
                .build(consumer,new ResourceLocation("extraores:enrichnickeldirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustNiobium),new ItemStack(ItemList.itemDustNiobium.get()))
                .addCriterion("enrichniobiumdirtydust",has(BlockList.blockOreNiobium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichniobiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustOrichalcum),new ItemStack(ItemList.itemDustOrichalcum.get()))
                .addCriterion("enrichorichalcumdirtydust",has(BlockList.blockOreOrichalcum.get()))
                .build(consumer,new ResourceLocation("extraores:enrichorichalcumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustOsmium),new ItemStack(ItemList.itemDustOsmium.get()))
                .addCriterion("enrichosmiumdirtydust",has(BlockList.blockOreOsmium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichosmiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustOureclase),new ItemStack(ItemList.itemDustOureclase.get()))
                .addCriterion("enrichoureclasedirtydust",has(BlockList.blockOreOureclase.get()))
                .build(consumer,new ResourceLocation("extraores:enrichoureclasedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustPalladium),new ItemStack(ItemList.itemDustPalladium.get()))
                .addCriterion("enrichpalladiumdirtydust",has(BlockList.blockOrePalladium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichpalladiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustPlatinum),new ItemStack(ItemList.itemDustPlatinum.get()))
                .addCriterion("enrichplatinumdirtydust",has(BlockList.blockOrePlatinum.get()))
                .build(consumer,new ResourceLocation("extraores:enrichplatinumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustPlutonium),new ItemStack(ItemList.itemDustPlutonium.get()))
                .addCriterion("enrichplutoniumdirtydust",has(BlockList.blockOrePlutonium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichplutoniumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustPolonium),new ItemStack(ItemList.itemDustPolonium.get()))
                .addCriterion("enrichpoloniumdirtydust",has(BlockList.blockOrePolonium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichpoloniumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustPromethium),new ItemStack(ItemList.itemDustPromethium.get()))
                .addCriterion("enrichpromethiumdirtydust",has(BlockList.blockOrePromethium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichpromethiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustRhenium),new ItemStack(ItemList.itemDustRhenium.get()))
                .addCriterion("enrichrheniumdirtydust",has(BlockList.blockOreRhenium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrheniumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustRhodium),new ItemStack(ItemList.itemDustRhodium.get()))
                .addCriterion("enrichrhodiumdirtydust",has(BlockList.blockOreRhodium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrhodiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustRubracium),new ItemStack(ItemList.itemDustRubracium.get()))
                .addCriterion("enrichrubraciumdirtydust",has(BlockList.blockOreRubracium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrubraciumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustRuthenium),new ItemStack(ItemList.itemDustRuthenium.get()))
                .addCriterion("enrichrutheniumdirtydust",has(BlockList.blockOreRuthenium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichrutheniumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustSanguinite),new ItemStack(ItemList.itemDustSanguinite.get()))
                .addCriterion("enrichsanguinitedirtydust",has(BlockList.blockOreSanguinite.get()))
                .build(consumer,new ResourceLocation("extraores:enrichsanguinitedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustShadowIron),new ItemStack(ItemList.itemDustShadowIron.get()))
                .addCriterion("enrichshadowirondirtydust",has(BlockList.blockOreShadowIron.get()))
                .build(consumer,new ResourceLocation("extraores:enrichshadowirondirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustSilver),new ItemStack(ItemList.itemDustSilver.get()))
                .addCriterion("enrichsilverdirtydust",has(BlockList.blockOreSilver.get()))
                .build(consumer,new ResourceLocation("extraores:enrichsilverdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustTantalum),new ItemStack(ItemList.itemDustTantalum.get()))
                .addCriterion("enrichtantalumdirtydust",has(BlockList.blockOreTantalum.get()))
                .build(consumer,new ResourceLocation("extraores:enrichtantalumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustTartarite),new ItemStack(ItemList.itemDustTartarite.get()))
                .addCriterion("enrichtartaritedirtydust",has(BlockList.blockOreTartarite.get()))
                .build(consumer,new ResourceLocation("extraores:enrichtartaritedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustTechnetium),new ItemStack(ItemList.itemDustTechnetium.get()))
                .addCriterion("enrichtechnetiumdirtydust",has(BlockList.blockOreTechnetium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichtechnetiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustThallium),new ItemStack(ItemList.itemDustThallium.get()))
                .addCriterion("enrichthalliumdirtydust",has(BlockList.blockOreThallium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichthalliumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustTin),new ItemStack(ItemList.itemDustTin.get()))
                .addCriterion("enrichtindirtydust",has(BlockList.blockOreTin.get()))
                .build(consumer,new ResourceLocation("extraores:enrichtindirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustTitanium),new ItemStack(ItemList.itemDustTitanium.get()))
                .addCriterion("enrichtitaniumdirtydust",has(BlockList.blockOreTitanium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichtitaniumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustTritium),new ItemStack(ItemList.itemDustTritium.get()))
                .addCriterion("enrichtritiumdirtydust",has(BlockList.blockOreTritium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichtritiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustTungsten),new ItemStack(ItemList.itemDustTungsten.get()))
                .addCriterion("enrichtungstendirtydust",has(BlockList.blockOreTungsten.get()))
                .build(consumer,new ResourceLocation("extraores:enrichtungstendirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustUnobtainium),new ItemStack(ItemList.itemDustUnobtainium.get()))
                .addCriterion("enrichunobtainiumdirtydust",has(BlockList.blockOreUnobtainium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichunobtainiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustUranium),new ItemStack(ItemList.itemDustUranium.get()))
                .addCriterion("enrichuraniumdirtydust",has(BlockList.blockOreUranium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichuraniumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustVanadium),new ItemStack(ItemList.itemDustVanadium.get()))
                .addCriterion("enrichvanadiumdirtydust",has(BlockList.blockOreVanadium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichvanadiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustVibranium),new ItemStack(ItemList.itemDustVibranium.get()))
                .addCriterion("enrichvibraniumdirtydust",has(BlockList.blockOreVibranium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichvibraniumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustVulcanite),new ItemStack(ItemList.itemDustVulcanite.get()))
                .addCriterion("enrichvulcanitedirtydust",has(BlockList.blockOreVulcanite.get()))
                .build(consumer,new ResourceLocation("extraores:enrichvulcanitedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustVyroxeres),new ItemStack(ItemList.itemDustVyroxeres.get()))
                .addCriterion("enrichvyroxeresdirtydust",has(BlockList.blockOreVyroxeres.get()))
                .build(consumer,new ResourceLocation("extraores:enrichvyroxeresdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustYellorite),new ItemStack(ItemList.itemDustYellorite.get()))
                .addCriterion("enrichyelloritedirtydust",has(BlockList.blockOreYellorite.get()))
                .build(consumer,new ResourceLocation("extraores:enrichyelloritedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustZinc),new ItemStack(ItemList.itemDustZinc.get()))
                .addCriterion("enrichzincdirtydust",has(BlockList.blockOreZinc.get()))
                .build(consumer,new ResourceLocation("extraores:enrichzincdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustZirconium),new ItemStack(ItemList.itemDustZirconium.get()))
                .addCriterion("enrichzirconiumdirtydust",has(BlockList.blockOreZirconium.get()))
                .build(consumer,new ResourceLocation("extraores:enrichzirconiumdirtydust"));*/
}

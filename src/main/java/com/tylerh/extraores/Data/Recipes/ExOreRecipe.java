package com.tylerh.extraores.Data.Recipes;

import com.tylerh.extraores.Data.Tags.ItemTagList;
import com.tylerh.extraores.Init.BlockList;
import com.tylerh.extraores.Init.ItemList;
import mekanism.api.MekanismAPI;
import mekanism.api.datagen.recipe.builder.ItemStackChemicalToItemStackRecipeBuilder;
import mekanism.api.datagen.recipe.builder.ItemStackToItemStackRecipeBuilder;
import mekanism.api.recipes.ingredients.GasStackIngredient;
import mekanism.api.recipes.ingredients.creator.IngredientCreatorAccess;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.*;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import java.util.concurrent.CompletableFuture;

public class ExOreRecipe extends RecipeProvider implements IConditionBuilder
{
    public ExOreRecipe(PackOutput output, CompletableFuture<HolderLookup.Provider> provider)
    {
        super(output,provider);
    }

    @Override
    protected void buildRecipes(RecipeOutput consumer)
    {
        buildShapedRecipes(consumer);
        buildShapelessRecipes(consumer);
        buildSmeltingRecipes(consumer);
        buildBlastingRecipes(consumer);
        buildMekanismInjecting(consumer);
        buildMekanismPurifying(consumer);
        buildMekanismCrushing(consumer);
        buildMekanismEnriching(consumer);
    }

    protected void buildShapedRecipes(RecipeOutput consumer)
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
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockAzureSilver.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotAzureSilver.get())
                .unlockedBy("azuresilverblock", has(BlockList.blockAzureSilver.get()))
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

    protected void buildShapelessRecipes(RecipeOutput consumer)
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
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemList.itemIngotAzureSilver.get(), 9)
                .requires(Ingredient.of(BlockList.blockAzureSilver.get().asItem()))
                .unlockedBy("azuresilveringot", has(ItemList.itemIngotAzureSilver.get()))
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

    protected void buildSmeltingRecipes(RecipeOutput consumer)
    {
        //Smelting Ore
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreAdamantine), RecipeCategory.MISC, ItemList.itemIngotAdamantine.get(), 0.75F, 40)
                .unlockedBy("smeltadamantineore", has(ItemList.itemIngotAdamantine.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltadamantineore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreAldourite), RecipeCategory.MISC, ItemList.itemIngotAldourite.get(), 0.75F, 40)
                .unlockedBy("smeltaldouriteore", has(ItemList.itemIngotAldourite.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltaldouriteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreAluminum), RecipeCategory.MISC, ItemList.itemIngotAluminum.get(), 0.75F, 40)
                .unlockedBy("smeltaluminumore", has(ItemList.itemIngotAluminum.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltaluminumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreAmericium), RecipeCategory.MISC, ItemList.itemIngotAmericium.get(), 0.75F, 40)
                .unlockedBy("smeltamericiumore", has(ItemList.itemIngotAmericium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltamericiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreAmordrine), RecipeCategory.MISC, ItemList.itemIngotAmordrine.get(), 0.75F, 40)
                .unlockedBy("smeltamordrineore", has(ItemList.itemIngotAmordrine.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltamordrineore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreAngmallen), RecipeCategory.MISC, ItemList.itemIngotAngmallen.get(), 0.75F, 40)
                .unlockedBy("smeltangmallenore", has(ItemList.itemIngotAngmallen.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltangmallenore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreAstralSilver), RecipeCategory.MISC, ItemList.itemIngotAstralSilver.get(), 0.75F, 40)
                .unlockedBy("smeltastralsilverore", has(ItemList.itemIngotAstralSilver.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltastralsilverore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreAtlarus), RecipeCategory.MISC, ItemList.itemIngotAtlarus.get(), 0.75F, 40)
                .unlockedBy("smeltatlarusore", has(ItemList.itemIngotAtlarus.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltatlarusore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreAzureSilver), RecipeCategory.MISC, ItemList.itemIngotAzureSilver.get(), 0.75F, 40)
                .unlockedBy("smeltazuresilverore", has(ItemList.itemIngotAzureSilver.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltazuresilverore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreBismuth), RecipeCategory.MISC, ItemList.itemIngotBismuth.get(), 0.75F, 40)
                .unlockedBy("smeltbismuthore", has(ItemList.itemIngotBismuth.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltbismuthore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreBlackSteel), RecipeCategory.MISC, ItemList.itemIngotBlackSteel.get(), 0.75F, 40)
                .unlockedBy("smeltblacksteelore", has(ItemList.itemIngotBlackSteel.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltblacksteelore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreCadmium), RecipeCategory.MISC, ItemList.itemIngotCadmium.get(), 0.75F, 40)
                .unlockedBy("smeltcadmiumore", has(ItemList.itemIngotCadmium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltcadmiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreCarmot), RecipeCategory.MISC, ItemList.itemIngotCarmot.get(), 0.75F, 40)
                .unlockedBy("smeltcarmotore", has(ItemList.itemIngotCarmot.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltcarmotore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreCelenegil), RecipeCategory.MISC, ItemList.itemIngotCelenegil.get(), 0.75F, 40)
                .unlockedBy("smeltcelenegilore", has(ItemList.itemIngotCelenegil.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltcelenegilore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreCeruclase), RecipeCategory.MISC, ItemList.itemIngotCeruclase.get(), 0.75F, 40)
                .unlockedBy("smeltceruclaseore", has(ItemList.itemIngotCeruclase.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltceruclaseore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreChromium), RecipeCategory.MISC, ItemList.itemIngotChromium.get(), 0.75F, 40)
                .unlockedBy("smeltchromiumore", has(ItemList.itemIngotChromium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltchromiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreCobalt), RecipeCategory.MISC, ItemList.itemIngotCobalt.get(), 0.75F, 40)
                .unlockedBy("smeltcobaltore", has(ItemList.itemIngotCobalt.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltcobaltore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreCopper), RecipeCategory.MISC, ItemList.itemIngotCopper.get(), 0.75F, 40)
                .unlockedBy("smeltcopperore", has(ItemList.itemIngotCopper.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltcopperore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreCrimsonSteel), RecipeCategory.MISC, ItemList.itemIngotCrimsonSteel.get(), 0.75F, 40)
                .unlockedBy("smeltcrimsonsteelore", has(ItemList.itemIngotCrimsonSteel.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltcrimsonsteelore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreDeepIron), RecipeCategory.MISC, ItemList.itemIngotDeepIron.get(), 0.75F, 40)
                .unlockedBy("smeltdeepironore", has(ItemList.itemIngotDeepIron.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltdeepironore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreDesichalkos), RecipeCategory.MISC, ItemList.itemIngotDesichalkos.get(), 0.75F, 40)
                .unlockedBy("smeltdesichalkosore", has(ItemList.itemIngotDesichalkos.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltdesichalkosore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreEximite), RecipeCategory.MISC, ItemList.itemIngotEximite.get(), 0.75F, 40)
                .unlockedBy("smelteximiteore", has(ItemList.itemIngotEximite.get()))
                .save(consumer, ResourceLocation.parse("extraores:smelteximiteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreGallium), RecipeCategory.MISC, ItemList.itemIngotGallium.get(), 0.75F, 40)
                .unlockedBy("smeltgalliumore", has(ItemList.itemIngotGallium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltgalliumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreHaderoth), RecipeCategory.MISC, ItemList.itemIngotHaderoth.get(), 0.75F, 40)
                .unlockedBy("smelthaderothore", has(ItemList.itemIngotHaderoth.get()))
                .save(consumer, ResourceLocation.parse("extraores:smelthaderothore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreHepatizon), RecipeCategory.MISC, ItemList.itemIngotHepatizon.get(), 0.75F, 40)
                .unlockedBy("smelthepatizonore", has(ItemList.itemIngotHepatizon.get()))
                .save(consumer, ResourceLocation.parse("extraores:smelthepatizonore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreIgnatius), RecipeCategory.MISC, ItemList.itemIngotIgnatius.get(), 0.75F, 40)
                .unlockedBy("smeltignatiusore", has(ItemList.itemIngotIgnatius.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltignatiusore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreIndium), RecipeCategory.MISC, ItemList.itemIngotIndium.get(), 0.75F, 40)
                .unlockedBy("smeltindiumore", has(ItemList.itemIngotIndium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltindiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreInfuscolium), RecipeCategory.MISC, ItemList.itemIngotInfuscolium.get(), 0.75F, 40)
                .unlockedBy("smeltinfuscoliumore", has(ItemList.itemIngotInfuscolium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltinfuscoliumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreInolashite), RecipeCategory.MISC, ItemList.itemIngotInolashite.get(), 0.75F, 40)
                .unlockedBy("smeltinolashiteore", has(ItemList.itemIngotInolashite.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltinolashiteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreIridium), RecipeCategory.MISC, ItemList.itemIngotIridium.get(), 0.75F, 40)
                .unlockedBy("smeltiridiumore", has(ItemList.itemIngotIridium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltiridiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreKalendrite), RecipeCategory.MISC, ItemList.itemIngotKalendrite.get(), 0.75F, 40)
                .unlockedBy("smeltkalendriteore", has(ItemList.itemIngotKalendrite.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltkalendriteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreLead), RecipeCategory.MISC, ItemList.itemIngotLead.get(), 0.75F, 40)
                .unlockedBy("smeltleadore", has(ItemList.itemIngotLead.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltleadore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreLemurite), RecipeCategory.MISC, ItemList.itemIngotLemurite.get(), 0.75F, 40)
                .unlockedBy("smeltlemuriteore", has(ItemList.itemIngotLemurite.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltlemuriteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreManganese), RecipeCategory.MISC, ItemList.itemIngotManganese.get(), 0.75F, 40)
                .unlockedBy("smeltmanganeseore", has(ItemList.itemIngotManganese.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltmanganeseore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreMeutoite), RecipeCategory.MISC, ItemList.itemIngotMeutoite.get(), 0.75F, 40)
                .unlockedBy("smeltmeutoiteore", has(ItemList.itemIngotMeutoite.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltmeutoiteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreMidasium), RecipeCategory.MISC, ItemList.itemIngotMidasium.get(), 0.75F, 40)
                .unlockedBy("smeltmidasiumore", has(ItemList.itemIngotMidasium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltmidasiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreMithril), RecipeCategory.MISC, ItemList.itemIngotMithril.get(), 0.75F, 40)
                .unlockedBy("smeltmithrilore", has(ItemList.itemIngotMithril.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltmithrilore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreMolybdenum), RecipeCategory.MISC, ItemList.itemIngotMolybdenum.get(), 0.75F, 40)
                .unlockedBy("smeltmolybdenumore", has(ItemList.itemIngotMolybdenum.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltmolybdenumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreNeodymium), RecipeCategory.MISC, ItemList.itemIngotNeodymium.get(), 0.75F, 40)
                .unlockedBy("smeltneodymiumore", has(ItemList.itemIngotNeodymium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltneodymiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreNeptunium), RecipeCategory.MISC, ItemList.itemIngotNeptunium.get(), 0.75F, 40)
                .unlockedBy("smeltneptuniumore", has(ItemList.itemIngotNeptunium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltneptuniumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreNickel), RecipeCategory.MISC, ItemList.itemIngotNickel.get(), 0.75F, 40)
                .unlockedBy("smeltnickelore", has(ItemList.itemIngotNickel.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltnickelore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreNiobium), RecipeCategory.MISC, ItemList.itemIngotNiobium.get(), 0.75F, 40)
                .unlockedBy("smeltniobiumore", has(ItemList.itemIngotNiobium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltniobiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreOrichalcum), RecipeCategory.MISC, ItemList.itemIngotOrichalcum.get(), 0.75F, 40)
                .unlockedBy("smeltorichalcumore", has(ItemList.itemIngotOrichalcum.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltorichalcumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreOsmium), RecipeCategory.MISC, ItemList.itemIngotOsmium.get(), 0.75F, 40)
                .unlockedBy("smeltosmiumore", has(ItemList.itemIngotOsmium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltosmiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreOureclase), RecipeCategory.MISC, ItemList.itemIngotOureclase.get(), 0.75F, 40)
                .unlockedBy("smeltoureclaseore", has(ItemList.itemIngotOureclase.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltoureclaseore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.orePalladium), RecipeCategory.MISC, ItemList.itemIngotPalladium.get(), 0.75F, 40)
                .unlockedBy("smeltpalladiumore", has(ItemList.itemIngotPalladium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltpalladiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.orePlatinum), RecipeCategory.MISC, ItemList.itemIngotPlatinum.get(), 0.75F, 40)
                .unlockedBy("smeltplatinumore", has(ItemList.itemIngotPlatinum.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltplatinumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.orePlutonium), RecipeCategory.MISC, ItemList.itemIngotPlutonium.get(), 0.75F, 40)
                .unlockedBy("smeltplutoniumore", has(ItemList.itemIngotPlutonium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltplutoniumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.orePolonium), RecipeCategory.MISC, ItemList.itemIngotPolonium.get(), 0.75F, 40)
                .unlockedBy("smeltpoloniumore", has(ItemList.itemIngotPolonium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltpoloniumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.orePromethium), RecipeCategory.MISC, ItemList.itemIngotPromethium.get(), 0.75F, 40)
                .unlockedBy("smeltpromethiumore", has(ItemList.itemIngotPromethium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltpromethiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreRhenium), RecipeCategory.MISC, ItemList.itemIngotRhenium.get(), 0.75F, 40)
                .unlockedBy("smeltrheniumore", has(ItemList.itemIngotRhenium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrheniumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreRhodium), RecipeCategory.MISC, ItemList.itemIngotRhodium.get(), 0.75F, 40)
                .unlockedBy("smeltrhodiumore", has(ItemList.itemIngotRhodium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrhodiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreRubracium), RecipeCategory.MISC, ItemList.itemIngotRubracium.get(), 0.75F, 40)
                .unlockedBy("smeltrubraciumore", has(ItemList.itemIngotRubracium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrubraciumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreRuthenium), RecipeCategory.MISC, ItemList.itemIngotRuthenium.get(), 0.75F, 40)
                .unlockedBy("smeltrutheniumore", has(ItemList.itemIngotRuthenium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrutheniumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreSanguinite), RecipeCategory.MISC, ItemList.itemIngotSanguinite.get(), 0.75F, 40)
                .unlockedBy("smeltsanguiniteore", has(ItemList.itemIngotSanguinite.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltsanguiniteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreShadowIron), RecipeCategory.MISC, ItemList.itemIngotShadowIron.get(), 0.75F, 40)
                .unlockedBy("smeltshadowironore", has(ItemList.itemIngotShadowIron.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltshadowironore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreSilver), RecipeCategory.MISC, ItemList.itemIngotSilver.get(), 0.75F, 40)
                .unlockedBy("smeltsilverore", has(ItemList.itemIngotSilver.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltsilverore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreTantalum), RecipeCategory.MISC, ItemList.itemIngotTantalum.get(), 0.75F, 40)
                .unlockedBy("smelttantalumore", has(ItemList.itemIngotTantalum.get()))
                .save(consumer, ResourceLocation.parse("extraores:smelttantalumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreTartarite), RecipeCategory.MISC, ItemList.itemIngotTartarite.get(), 0.75F, 40)
                .unlockedBy("smelttartariteore", has(ItemList.itemIngotTartarite.get()))
                .save(consumer, ResourceLocation.parse("extraores:smelttartariteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreTechnetium), RecipeCategory.MISC, ItemList.itemIngotTechnetium.get(), 0.75F, 40)
                .unlockedBy("smelttechnetiumore", has(ItemList.itemIngotTechnetium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smelttechnetiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreThallium), RecipeCategory.MISC, ItemList.itemIngotThallium.get(), 0.75F, 40)
                .unlockedBy("smeltthalliumore", has(ItemList.itemIngotThallium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltthalliumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreTin), RecipeCategory.MISC, ItemList.itemIngotTin.get(), 0.75F, 40)
                .unlockedBy("smelttinore", has(ItemList.itemIngotTin.get()))
                .save(consumer, ResourceLocation.parse("extraores:smelttinore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreTitanium), RecipeCategory.MISC, ItemList.itemIngotTitanium.get(), 0.75F, 40)
                .unlockedBy("smelttitaniumore", has(ItemList.itemIngotTitanium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smelttitaniumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreTritium), RecipeCategory.MISC, ItemList.itemIngotTritium.get(), 0.75F, 40)
                .unlockedBy("smelttritiumore", has(ItemList.itemIngotTritium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smelttritiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreTungsten), RecipeCategory.MISC, ItemList.itemIngotTungsten.get(), 0.75F, 40)
                .unlockedBy("smelttungstenore", has(ItemList.itemIngotTungsten.get()))
                .save(consumer, ResourceLocation.parse("extraores:smelttungstenore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreUnobtainium), RecipeCategory.MISC, ItemList.itemIngotUnobtainium.get(), 0.75F, 40)
                .unlockedBy("smeltunobtainiumore", has(ItemList.itemIngotUnobtainium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltunobtainiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreUranium), RecipeCategory.MISC, ItemList.itemIngotUranium.get(), 0.75f, 40)
                .unlockedBy("smelturaniumore", has(ItemList.itemIngotUranium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smelturaniumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreVanadium), RecipeCategory.MISC, ItemList.itemIngotVanadium.get(), 0.75F, 40)
                .unlockedBy("smeltvanadiumore", has(ItemList.itemIngotVanadium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltvanadiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreVibranium), RecipeCategory.MISC, ItemList.itemIngotVibranium.get(), 0.75F, 40)
                .unlockedBy("smeltvibraniumore", has(ItemList.itemIngotVibranium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltvibraniumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreVulcanite), RecipeCategory.MISC, ItemList.itemIngotVulcanite.get(), 0.75F, 40)
                .unlockedBy("smeltvulcaniteore", has(ItemList.itemIngotVulcanite.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltvulcaniteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreVyroxeres), RecipeCategory.MISC, ItemList.itemIngotVyroxeres.get(), 0.75F, 40)
                .unlockedBy("smeltvyroxeresore", has(ItemList.itemIngotVyroxeres.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltvyroxeresore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreYellorite), RecipeCategory.MISC, ItemList.itemIngotYellorite.get(), 0.75F, 40)
                .unlockedBy("smeltyelloriteore", has(ItemList.itemIngotYellorite.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltyelloriteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreZinc), RecipeCategory.MISC, ItemList.itemIngotZinc.get(), 0.75F, 40)
                .unlockedBy("smeltzincore", has(ItemList.itemIngotZinc.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltzincore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreZirconium), RecipeCategory.MISC, ItemList.itemIngotZirconium.get(), 0.75F, 40)
                .unlockedBy("smeltzirconiumore", has(ItemList.itemIngotZirconium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltzirconiumore"));
        //Smelting Raw
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawAdamantine), RecipeCategory.MISC, ItemList.itemIngotAdamantine.get(), 0.75F, 40)
                .unlockedBy("smeltrawadamantine", has(ItemList.itemIngotAdamantine.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawadamantine"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawAldourite), RecipeCategory.MISC, ItemList.itemIngotAldourite.get(), 0.75F, 40)
                .unlockedBy("smeltrawaldourite", has(ItemList.itemIngotAldourite.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawaldourite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawAluminum), RecipeCategory.MISC, ItemList.itemIngotAluminum.get(), 0.75F, 40)
                .unlockedBy("smeltrawaluminum", has(ItemList.itemIngotAluminum.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawaluminum"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawAmericium), RecipeCategory.MISC, ItemList.itemIngotAmericium.get(), 0.75F, 40)
                .unlockedBy("smeltrawamericium", has(ItemList.itemIngotAmericium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawamericium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawAmordrine), RecipeCategory.MISC, ItemList.itemIngotAmordrine.get(), 0.75F, 40)
                .unlockedBy("smeltrawamordrine", has(ItemList.itemIngotAmordrine.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawamordrine"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawAngmallen), RecipeCategory.MISC, ItemList.itemIngotAngmallen.get(), 0.75F, 40)
                .unlockedBy("smeltrawangmallen", has(ItemList.itemIngotAngmallen.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawangmallen"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawAstralSilver), RecipeCategory.MISC, ItemList.itemIngotAstralSilver.get(), 0.75F, 40)
                .unlockedBy("smeltrawastralsilver", has(ItemList.itemIngotAstralSilver.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawastralsilver"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawAtlarus), RecipeCategory.MISC, ItemList.itemIngotAtlarus.get(), 0.75F, 40)
                .unlockedBy("smeltrawatlarus", has(ItemList.itemIngotAtlarus.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawatlarus"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawAzureSilver), RecipeCategory.MISC, ItemList.itemIngotAzureSilver.get(), 0.75F, 40)
                .unlockedBy("smeltrawazuresilver", has(ItemList.itemIngotAzureSilver.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawazuresilver"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawBismuth), RecipeCategory.MISC, ItemList.itemIngotBismuth.get(), 0.75F, 40)
                .unlockedBy("smeltrawbismuth", has(ItemList.itemIngotBismuth.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawbismuth"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawBlackSteel), RecipeCategory.MISC, ItemList.itemIngotBlackSteel.get(), 0.75F, 40)
                .unlockedBy("smeltrawblacksteel", has(ItemList.itemIngotBlackSteel.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawblacksteel"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawCadmium), RecipeCategory.MISC, ItemList.itemIngotCadmium.get(), 0.75F, 40)
                .unlockedBy("smeltrawcadmium", has(ItemList.itemIngotCadmium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawcadmium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawCarmot), RecipeCategory.MISC, ItemList.itemIngotCarmot.get(), 0.75F, 40)
                .unlockedBy("smeltrawcarmot", has(ItemList.itemIngotCarmot.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawcarmot"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawCelenegil), RecipeCategory.MISC, ItemList.itemIngotCelenegil.get(), 0.75F, 40)
                .unlockedBy("smeltrawcelenegil", has(ItemList.itemIngotCelenegil.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawcelenegil"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawCeruclase), RecipeCategory.MISC, ItemList.itemIngotCeruclase.get(), 0.75F, 40)
                .unlockedBy("smeltrawceruclase", has(ItemList.itemIngotCeruclase.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawceruclase"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawChromium), RecipeCategory.MISC, ItemList.itemIngotChromium.get(), 0.75F, 40)
                .unlockedBy("smeltrawchromium", has(ItemList.itemIngotChromium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawchromium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawCobalt), RecipeCategory.MISC, ItemList.itemIngotCobalt.get(), 0.75F, 40)
                .unlockedBy("smeltrawcobalt", has(ItemList.itemIngotCobalt.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawcobalt"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawCopper), RecipeCategory.MISC, ItemList.itemIngotCopper.get(), 0.75F, 40)
                .unlockedBy("smeltrawcopper", has(ItemList.itemIngotCopper.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawcopper"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawCrimsonSteel), RecipeCategory.MISC, ItemList.itemIngotCrimsonSteel.get(), 0.75F, 40)
                .unlockedBy("smeltrawcrimsonsteel", has(ItemList.itemIngotCrimsonSteel.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawcrimsonsteel"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawDeepIron), RecipeCategory.MISC, ItemList.itemIngotDeepIron.get(), 0.75F, 40)
                .unlockedBy("smeltrawdeepiron", has(ItemList.itemIngotDeepIron.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawdeepiron"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawDesichalkos), RecipeCategory.MISC, ItemList.itemIngotDesichalkos.get(), 0.75F, 40)
                .unlockedBy("smeltrawdesichalkos", has(ItemList.itemIngotDesichalkos.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawdesichalkos"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawEximite), RecipeCategory.MISC, ItemList.itemIngotEximite.get(), 0.75F, 40)
                .unlockedBy("smeltraweximite", has(ItemList.itemIngotEximite.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltraweximite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawGallium), RecipeCategory.MISC, ItemList.itemIngotGallium.get(), 0.75F, 40)
                .unlockedBy("smeltrawgallium", has(ItemList.itemIngotGallium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawgallium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawHaderoth), RecipeCategory.MISC, ItemList.itemIngotHaderoth.get(), 0.75F, 40)
                .unlockedBy("smeltrawhaderoth", has(ItemList.itemIngotHaderoth.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawhaderoth"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawHepatizon), RecipeCategory.MISC, ItemList.itemIngotHepatizon.get(), 0.75F, 40)
                .unlockedBy("smeltrawhepatizon", has(ItemList.itemIngotHepatizon.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawhepatizon"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawIgnatius), RecipeCategory.MISC, ItemList.itemIngotIgnatius.get(), 0.75F, 40)
                .unlockedBy("smeltrawignatius", has(ItemList.itemIngotIgnatius.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawignatius"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawIndium), RecipeCategory.MISC, ItemList.itemIngotIndium.get(), 0.75F, 40)
                .unlockedBy("smeltrawindium", has(ItemList.itemIngotIndium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawindium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawInfuscolium), RecipeCategory.MISC, ItemList.itemIngotInfuscolium.get(), 0.75F, 40)
                .unlockedBy("smeltrawinfuscolium", has(ItemList.itemIngotInfuscolium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawinfuscolium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawInolashite), RecipeCategory.MISC, ItemList.itemIngotInolashite.get(), 0.75F, 40)
                .unlockedBy("smeltrawinolashite", has(ItemList.itemIngotInolashite.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawinolashite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawIridium), RecipeCategory.MISC, ItemList.itemIngotIridium.get(), 0.75F, 40)
                .unlockedBy("smeltrawiridium", has(ItemList.itemIngotIridium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawiridium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawKalendrite), RecipeCategory.MISC, ItemList.itemIngotKalendrite.get(), 0.75F, 40)
                .unlockedBy("smeltrawkalendrite", has(ItemList.itemIngotKalendrite.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawkalendrite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawLead), RecipeCategory.MISC, ItemList.itemIngotLead.get(), 0.75F, 40)
                .unlockedBy("smeltrawlead", has(ItemList.itemIngotLead.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawlead"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawLemurite), RecipeCategory.MISC, ItemList.itemIngotLemurite.get(), 0.75F, 40)
                .unlockedBy("smeltrawlemurite", has(ItemList.itemIngotLemurite.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawlemurite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawManganese), RecipeCategory.MISC, ItemList.itemIngotManganese.get(), 0.75F, 40)
                .unlockedBy("smeltrawmanganese", has(ItemList.itemIngotManganese.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawmanganese"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawMeutoite), RecipeCategory.MISC, ItemList.itemIngotMeutoite.get(), 0.75F, 40)
                .unlockedBy("smeltrawmeutoite", has(ItemList.itemIngotMeutoite.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawmeutoite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawMidasium), RecipeCategory.MISC, ItemList.itemIngotMidasium.get(), 0.75F, 40)
                .unlockedBy("smeltrawmidasium", has(ItemList.itemIngotMidasium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawmidasium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawMithril), RecipeCategory.MISC, ItemList.itemIngotMithril.get(), 0.75F, 40)
                .unlockedBy("smeltrawmithril", has(ItemList.itemIngotMithril.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawmithril"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawMolybdenum), RecipeCategory.MISC, ItemList.itemIngotMolybdenum.get(), 0.75F, 40)
                .unlockedBy("smeltrawmolybdenum", has(ItemList.itemIngotMolybdenum.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawmolybdenum"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawNeodymium), RecipeCategory.MISC, ItemList.itemIngotNeodymium.get(), 0.75F, 40)
                .unlockedBy("smeltrawneodymium", has(ItemList.itemIngotNeodymium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawneodymium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawNeptunium), RecipeCategory.MISC, ItemList.itemIngotNeptunium.get(), 0.75F, 40)
                .unlockedBy("smeltrawneptunium", has(ItemList.itemIngotNeptunium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawneptunium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawNickel), RecipeCategory.MISC, ItemList.itemIngotNickel.get(), 0.75F, 40)
                .unlockedBy("smeltrawnickel", has(ItemList.itemIngotNickel.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawnickel"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawNiobium), RecipeCategory.MISC, ItemList.itemIngotNiobium.get(), 0.75F, 40)
                .unlockedBy("smeltrawniobium", has(ItemList.itemIngotNiobium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawniobium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawOrichalcum), RecipeCategory.MISC, ItemList.itemIngotOrichalcum.get(), 0.75F, 40)
                .unlockedBy("smeltraworichalcum", has(ItemList.itemIngotOrichalcum.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltraworichalcum"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawOsmium), RecipeCategory.MISC, ItemList.itemIngotOsmium.get(), 0.75F, 40)
                .unlockedBy("smeltrawosmium", has(ItemList.itemIngotOureclase.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawosmium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawOureclase), RecipeCategory.MISC, ItemList.itemIngotOureclase.get(), 0.75F, 40)
                .unlockedBy("smeltrawoureclase", has(ItemList.itemIngotOureclase.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawoureclase"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawPalladium), RecipeCategory.MISC, ItemList.itemIngotPalladium.get(), 0.75F, 40)
                .unlockedBy("smeltrawpalladium", has(ItemList.itemIngotPalladium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawpalladium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawPlatinum), RecipeCategory.MISC, ItemList.itemIngotPlatinum.get(), 0.75F, 40)
                .unlockedBy("smeltrawplatinum", has(ItemList.itemIngotPlatinum.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawplatinum"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawPlutonium), RecipeCategory.MISC, ItemList.itemIngotPlutonium.get(), 0.75F, 40)
                .unlockedBy("smeltrawplutonium", has(ItemList.itemIngotPlutonium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawplutonium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawPolonium), RecipeCategory.MISC, ItemList.itemIngotPolonium.get(), 0.75F, 40)
                .unlockedBy("smeltrawpolonium", has(ItemList.itemIngotPolonium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawpolonium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawPromethium), RecipeCategory.MISC, ItemList.itemIngotPromethium.get(), 0.75F, 40)
                .unlockedBy("smeltrawpromethium", has(ItemList.itemIngotPromethium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawpromethium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawRhenium), RecipeCategory.MISC, ItemList.itemIngotRhenium.get(), 0.75F, 40)
                .unlockedBy("smeltrawrhenium", has(ItemList.itemIngotRhenium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawrhenium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawRhodium), RecipeCategory.MISC, ItemList.itemIngotRhodium.get(), 0.75F, 40)
                .unlockedBy("smeltrawrhodium", has(ItemList.itemIngotRhodium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawrhodium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawRubracium), RecipeCategory.MISC, ItemList.itemIngotRubracium.get(), 0.75F, 40)
                .unlockedBy("smeltrawrubracium", has(ItemList.itemIngotRubracium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawrubracium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawRuthenium), RecipeCategory.MISC, ItemList.itemIngotRuthenium.get(), 0.75F, 40)
                .unlockedBy("smeltrawruthenium", has(ItemList.itemIngotRuthenium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawruthenium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawSanguinite), RecipeCategory.MISC, ItemList.itemIngotSanguinite.get(), 0.75F, 40)
                .unlockedBy("smeltrawsanguinite", has(ItemList.itemIngotSanguinite.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawsanguinite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawShadowIron), RecipeCategory.MISC, ItemList.itemIngotShadowIron.get(), 0.75F, 40)
                .unlockedBy("smeltrawshadowiron", has(ItemList.itemIngotShadowIron.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawshadowiron"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawSilver), RecipeCategory.MISC, ItemList.itemIngotSilver.get(), 0.75F, 40)
                .unlockedBy("smeltrawsilver", has(ItemList.itemIngotSilver.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawsilver"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawTantalum), RecipeCategory.MISC, ItemList.itemIngotTantalum.get(), 0.75F, 40)
                .unlockedBy("smeltrawtantalum", has(ItemList.itemIngotTantalum.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawtantalum"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawTartarite), RecipeCategory.MISC, ItemList.itemIngotTartarite.get(), 0.75F, 40)
                .unlockedBy("smeltrawtartarite", has(ItemList.itemIngotTartarite.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawtartarite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawTechnetium), RecipeCategory.MISC, ItemList.itemIngotTechnetium.get(), 0.75F, 40)
                .unlockedBy("smeltrawtechnetium", has(ItemList.itemIngotTechnetium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawtechnetium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawThallium), RecipeCategory.MISC, ItemList.itemIngotThallium.get(), 0.75F, 40)
                .unlockedBy("smeltrawthallium", has(ItemList.itemIngotThallium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawthallium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawTin), RecipeCategory.MISC, ItemList.itemIngotTin.get(), 0.75F, 40)
                .unlockedBy("smeltrawtin", has(ItemList.itemIngotTin.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawtin"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawTitanium), RecipeCategory.MISC, ItemList.itemIngotTitanium.get(), 0.75F, 40)
                .unlockedBy("smeltrawtitanium", has(ItemList.itemIngotTitanium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawtitanium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawTritium), RecipeCategory.MISC, ItemList.itemIngotTritium.get(), 0.75F, 40)
                .unlockedBy("smeltrawtritium", has(ItemList.itemIngotTritium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawtritium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawTungsten), RecipeCategory.MISC, ItemList.itemIngotTungsten.get(), 0.75F, 40)
                .unlockedBy("smeltrawtungsten", has(ItemList.itemIngotTungsten.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawtungsten"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawUnobtainium), RecipeCategory.MISC, ItemList.itemIngotUnobtainium.get(), 0.75F, 40)
                .unlockedBy("smeltrawunobtainium", has(ItemList.itemIngotUnobtainium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawunobtainium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawUranium), RecipeCategory.MISC, ItemList.itemIngotUranium.get(), 0.75f, 40)
                .unlockedBy("smeltrawuranium", has(ItemList.itemIngotUranium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawuranium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawVanadium), RecipeCategory.MISC, ItemList.itemIngotVanadium.get(), 0.75F, 40)
                .unlockedBy("smeltrawvanadium", has(ItemList.itemIngotVanadium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawvanadium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawVibranium), RecipeCategory.MISC, ItemList.itemIngotVibranium.get(), 0.75F, 40)
                .unlockedBy("smeltrawvibranium", has(ItemList.itemIngotVibranium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawvibranium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawVulcanite), RecipeCategory.MISC, ItemList.itemIngotVulcanite.get(), 0.75F, 40)
                .unlockedBy("smeltrawvulcanite", has(ItemList.itemIngotVulcanite.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawvulcanite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawVyroxeres), RecipeCategory.MISC, ItemList.itemIngotVyroxeres.get(), 0.75F, 40)
                .unlockedBy("smeltrawvyroxeres", has(ItemList.itemIngotVyroxeres.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawvyroxeres"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawYellorite), RecipeCategory.MISC, ItemList.itemIngotYellorite.get(), 0.75F, 40)
                .unlockedBy("smeltrawyellorite", has(ItemList.itemIngotYellorite.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawyellorite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawZinc), RecipeCategory.MISC, ItemList.itemIngotZinc.get(), 0.75F, 40)
                .unlockedBy("smeltrawzinc", has(ItemList.itemIngotZinc.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawzinc"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawZirconium), RecipeCategory.MISC, ItemList.itemIngotZirconium.get(), 0.75F, 40)
                .unlockedBy("smeltrawzirconium", has(ItemList.itemIngotZirconium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrawzirconium"));
        //Smelting Dust
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustAdamantine), RecipeCategory.MISC, ItemList.itemIngotAdamantine.get(), 0.75F, 20)
                .unlockedBy("smeltadamantinedust", has(ItemList.itemIngotAdamantine.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltadamantinedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustAldourite), RecipeCategory.MISC, ItemList.itemIngotAldourite.get(), 0.75F, 20)
                .unlockedBy("smeltaldouritedust", has(ItemList.itemIngotAldourite.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltaldouritedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustAluminum), RecipeCategory.MISC, ItemList.itemIngotAluminum.get(), 0.75F, 20)
                .unlockedBy("smeltaluminumdust", has(ItemList.itemIngotAluminum.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltaluminumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustAmericium), RecipeCategory.MISC, ItemList.itemIngotAmericium.get(), 0.75F, 20)
                .unlockedBy("smeltamericiumdust", has(ItemList.itemIngotAmericium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltamericiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustAmordrine), RecipeCategory.MISC, ItemList.itemIngotAmordrine.get(), 0.75F, 20)
                .unlockedBy("smeltamordrinedust", has(ItemList.itemIngotAmordrine.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltamordrinedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustAngmallen), RecipeCategory.MISC, ItemList.itemIngotAngmallen.get(), 0.75F, 20)
                .unlockedBy("smeltangmallendust", has(ItemList.itemIngotAngmallen.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltangmallendust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustAstralSilver), RecipeCategory.MISC, ItemList.itemIngotAstralSilver.get(), 0.75F, 20)
                .unlockedBy("smeltastralsilverdust", has(ItemList.itemIngotAstralSilver.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltastralsilverdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustAtlarus), RecipeCategory.MISC, ItemList.itemIngotAtlarus.get(), 0.75F, 20)
                .unlockedBy("smeltatlarusdust", has(ItemList.itemIngotAtlarus.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltatlarusdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustAzureSilver), RecipeCategory.MISC, ItemList.itemIngotAzureSilver.get(), 0.75F, 20)
                .unlockedBy("smeltazuresilverdust", has(ItemList.itemIngotAzureSilver.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltazuresilverdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustBismuth), RecipeCategory.MISC, ItemList.itemIngotBismuth.get(), 0.75F, 20)
                .unlockedBy("smeltbismuthdust", has(ItemList.itemIngotBismuth.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltbismuthdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustBlackSteel), RecipeCategory.MISC, ItemList.itemIngotBlackSteel.get(), 0.75F, 20)
                .unlockedBy("smeltblacksteeldust", has(ItemList.itemIngotBlackSteel.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltblacksteeldust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustCadmium), RecipeCategory.MISC, ItemList.itemIngotCadmium.get(), 0.75F, 20)
                .unlockedBy("smeltcadmiumdust", has(ItemList.itemIngotCadmium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltcadmiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustCarmot), RecipeCategory.MISC, ItemList.itemIngotCarmot.get(), 0.75F, 20)
                .unlockedBy("smeltcarmotdust", has(ItemList.itemIngotCarmot.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltcarmotdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustCelenegil), RecipeCategory.MISC, ItemList.itemIngotCelenegil.get(), 0.75F, 20)
                .unlockedBy("smeltcelenegildust", has(ItemList.itemIngotCelenegil.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltcelenegildust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustCeruclase), RecipeCategory.MISC, ItemList.itemIngotCeruclase.get(), 0.75F, 20)
                .unlockedBy("smeltceruclasedust", has(ItemList.itemIngotCeruclase.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltceruclasedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustChromium), RecipeCategory.MISC, ItemList.itemIngotChromium.get(), 0.75F, 20)
                .unlockedBy("smeltchromiumdust", has(ItemList.itemIngotChromium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltchromiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustCobalt), RecipeCategory.MISC, ItemList.itemIngotCobalt.get(), 0.75F, 20)
                .unlockedBy("smeltcobaltdust", has(ItemList.itemIngotCobalt.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltcobaltdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustCopper), RecipeCategory.MISC, ItemList.itemIngotCopper.get(), 0.75F, 20)
                .unlockedBy("smeltcopperdust", has(ItemList.itemIngotCopper.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltcopperdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustCrimsonSteel), RecipeCategory.MISC, ItemList.itemIngotCrimsonSteel.get(), 0.75F, 20)
                .unlockedBy("smeltcrimsonsteeldust", has(ItemList.itemIngotCrimsonSteel.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltcrimsonsteeldust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustDeepIron), RecipeCategory.MISC, ItemList.itemIngotDeepIron.get(), 0.75F, 20)
                .unlockedBy("smeltdeepirondust", has(ItemList.itemIngotDeepIron.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltdeepirondust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustDesichalkos), RecipeCategory.MISC, ItemList.itemIngotDesichalkos.get(), 0.75F, 20)
                .unlockedBy("smeltdesichalkosdust", has(ItemList.itemIngotDesichalkos.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltdesichalkosdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustEximite), RecipeCategory.MISC, ItemList.itemIngotEximite.get(), 0.75F, 20)
                .unlockedBy("smelteximitedust", has(ItemList.itemIngotEximite.get()))
                .save(consumer, ResourceLocation.parse("extraores:smelteximitedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustGallium), RecipeCategory.MISC, ItemList.itemIngotGallium.get(), 0.75F, 20)
                .unlockedBy("smeltgalliumdust", has(ItemList.itemIngotGallium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltgalliumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustHaderoth), RecipeCategory.MISC, ItemList.itemIngotHaderoth.get(), 0.75F, 20)
                .unlockedBy("smelthaderothdust", has(ItemList.itemIngotHaderoth.get()))
                .save(consumer, ResourceLocation.parse("extraores:smelthaderothdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustHepatizon), RecipeCategory.MISC, ItemList.itemIngotHepatizon.get(), 0.75F, 20)
                .unlockedBy("smelthepatizondust", has(ItemList.itemIngotHepatizon.get()))
                .save(consumer, ResourceLocation.parse("extraores:smelthepatizondust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustIgnatius), RecipeCategory.MISC, ItemList.itemIngotIgnatius.get(), 0.75F, 20)
                .unlockedBy("smeltignatiusdust", has(ItemList.itemIngotIgnatius.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltignatiusdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustIndium), RecipeCategory.MISC, ItemList.itemIngotIndium.get(), 0.75F, 20)
                .unlockedBy("smeltindiumdust", has(ItemList.itemIngotIndium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltindiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustInfuscolium), RecipeCategory.MISC, ItemList.itemIngotInfuscolium.get(), 0.75F, 20)
                .unlockedBy("smeltinfuscoliumdust", has(ItemList.itemIngotInfuscolium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltinfuscoliumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustInolashite), RecipeCategory.MISC, ItemList.itemIngotInolashite.get(), 0.75F, 20)
                .unlockedBy("smeltinolashitedust", has(ItemList.itemIngotInolashite.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltinolashitedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustIridium), RecipeCategory.MISC, ItemList.itemIngotIridium.get(), 0.75F, 20)
                .unlockedBy("smeltiridiumdust", has(ItemList.itemIngotIridium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltiridiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustKalendrite), RecipeCategory.MISC, ItemList.itemIngotKalendrite.get(), 0.75F, 20)
                .unlockedBy("smeltkalendritedust", has(ItemList.itemIngotKalendrite.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltkalendritedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustLead), RecipeCategory.MISC, ItemList.itemIngotLead.get(), 0.75F, 20)
                .unlockedBy("smeltleaddust", has(ItemList.itemIngotLead.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltleaddust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustLemurite), RecipeCategory.MISC, ItemList.itemIngotLemurite.get(), 0.75F, 20)
                .unlockedBy("smeltlemuritedust", has(ItemList.itemIngotLemurite.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltlemuritedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustManganese), RecipeCategory.MISC, ItemList.itemIngotManganese.get(), 0.75F, 20)
                .unlockedBy("smeltmanganesedust", has(ItemList.itemIngotManganese.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltmanganesedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustMeutoite), RecipeCategory.MISC, ItemList.itemIngotMeutoite.get(), 0.75F, 20)
                .unlockedBy("smeltmeutoitedust", has(ItemList.itemIngotMeutoite.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltmeutoitedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustMidasium), RecipeCategory.MISC, ItemList.itemIngotMidasium.get(), 0.75F, 20)
                .unlockedBy("smeltmidasiumdust", has(ItemList.itemIngotMidasium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltmidasiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustMithril), RecipeCategory.MISC, ItemList.itemIngotMithril.get(), 0.75F, 20)
                .unlockedBy("smeltmithrildust", has(ItemList.itemIngotMithril.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltmithrildust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustMolybdenum), RecipeCategory.MISC, ItemList.itemIngotMolybdenum.get(), 0.75F, 20)
                .unlockedBy("smeltmolybdenumdust", has(ItemList.itemIngotMolybdenum.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltmolybdenumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustNeodymium), RecipeCategory.MISC, ItemList.itemIngotNeodymium.get(), 0.75F, 20)
                .unlockedBy("smeltneodymiumdust", has(ItemList.itemIngotNeodymium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltneodymiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustNeptunium), RecipeCategory.MISC, ItemList.itemIngotNeptunium.get(), 0.75F, 20)
                .unlockedBy("smeltneptuniumdust", has(ItemList.itemIngotNeptunium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltneptuniumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustNickel), RecipeCategory.MISC, ItemList.itemIngotNickel.get(), 0.75F, 20)
                .unlockedBy("smeltnickeldust", has(ItemList.itemIngotNickel.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltnickeldust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustNiobium), RecipeCategory.MISC, ItemList.itemIngotNiobium.get(), 0.75F, 20)
                .unlockedBy("smeltniobiumdust", has(ItemList.itemIngotNiobium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltniobiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustOrichalcum), RecipeCategory.MISC, ItemList.itemIngotOrichalcum.get(), 0.75F, 20)
                .unlockedBy("smeltorichalcumdust", has(ItemList.itemIngotOrichalcum.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltorichalcumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustOsmium), RecipeCategory.MISC, ItemList.itemIngotOsmium.get(), 0.75F, 20)
                .unlockedBy("smeltosmiumdust", has(ItemList.itemIngotOsmium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltosmiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustOureclase), RecipeCategory.MISC, ItemList.itemIngotOureclase.get(), 0.75F, 20)
                .unlockedBy("smeltoureclasedust", has(ItemList.itemIngotOureclase.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltoureclasedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustPalladium), RecipeCategory.MISC, ItemList.itemIngotPalladium.get(), 0.75F, 20)
                .unlockedBy("smeltpalladiumdust", has(ItemList.itemIngotPalladium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltpalladiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustPlatinum), RecipeCategory.MISC, ItemList.itemIngotPlatinum.get(), 0.75F, 20)
                .unlockedBy("smeltplatinumdust", has(ItemList.itemIngotPlatinum.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltplatinumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustPlutonium), RecipeCategory.MISC, ItemList.itemIngotPlutonium.get(), 0.75F, 20)
                .unlockedBy("smeltplutoniumdust", has(ItemList.itemIngotPlutonium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltplutoniumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustPolonium), RecipeCategory.MISC, ItemList.itemIngotPolonium.get(), 0.75F, 20)
                .unlockedBy("smeltpoloniumdust", has(ItemList.itemIngotPolonium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltpoloniumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustPromethium), RecipeCategory.MISC, ItemList.itemIngotPromethium.get(), 0.75F, 20)
                .unlockedBy("smeltpromethiumdust", has(ItemList.itemIngotPromethium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltpromethiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustRhenium), RecipeCategory.MISC, ItemList.itemIngotRhenium.get(), 0.75F, 20)
                .unlockedBy("smeltrheniumdust", has(ItemList.itemIngotRhenium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrheniumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustRhodium), RecipeCategory.MISC, ItemList.itemIngotRhodium.get(), 0.75F, 20)
                .unlockedBy("smeltrhodiumdust", has(ItemList.itemIngotRhodium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrhodiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustRubracium), RecipeCategory.MISC, ItemList.itemIngotRubracium.get(), 0.75F, 20)
                .unlockedBy("smeltrubraciumdust", has(ItemList.itemIngotRubracium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrubraciumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustRuthenium), RecipeCategory.MISC, ItemList.itemIngotRuthenium.get(), 0.75F, 20)
                .unlockedBy("smeltrutheniumdust", has(ItemList.itemIngotRuthenium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltrutheniumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustSanguinite), RecipeCategory.MISC, ItemList.itemIngotSanguinite.get(), 0.75F, 20)
                .unlockedBy("smeltsanguinitedust", has(ItemList.itemIngotSanguinite.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltsanguinitedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustShadowIron), RecipeCategory.MISC, ItemList.itemIngotShadowIron.get(), 0.75F, 20)
                .unlockedBy("smeltshadowirondust", has(ItemList.itemIngotShadowIron.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltshadowirondust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustSilver), RecipeCategory.MISC, ItemList.itemIngotSilver.get(), 0.75F, 20)
                .unlockedBy("smeltsilverdust", has(ItemList.itemIngotSilver.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltsilverdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustTantalum), RecipeCategory.MISC, ItemList.itemIngotTantalum.get(), 0.75F, 20)
                .unlockedBy("smelttantalumdust", has(ItemList.itemIngotTantalum.get()))
                .save(consumer, ResourceLocation.parse("extraores:smelttantalumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustTartarite), RecipeCategory.MISC, ItemList.itemIngotTartarite.get(), 0.75F, 20)
                .unlockedBy("smelttartaritedust", has(ItemList.itemIngotTartarite.get()))
                .save(consumer, ResourceLocation.parse("extraores:smelttartaritedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustTechnetium), RecipeCategory.MISC, ItemList.itemIngotTechnetium.get(), 0.75F, 20)
                .unlockedBy("smelttechnetiumdust", has(ItemList.itemIngotTechnetium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smelttechnetiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustThallium), RecipeCategory.MISC, ItemList.itemIngotThallium.get(), 0.75F, 20)
                .unlockedBy("smeltthalliumdust", has(ItemList.itemIngotThallium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltthalliumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustTin), RecipeCategory.MISC, ItemList.itemIngotTin.get(), 0.75F, 20)
                .unlockedBy("smelttindust", has(ItemList.itemIngotTin.get()))
                .save(consumer, ResourceLocation.parse("extraores:smelttindust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustTitanium), RecipeCategory.MISC, ItemList.itemIngotTitanium.get(), 0.75F, 20)
                .unlockedBy("smelttitaniumdust", has(ItemList.itemIngotTitanium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smelttitaniumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustTritium), RecipeCategory.MISC, ItemList.itemIngotTritium.get(), 0.75F, 20)
                .unlockedBy("smelttritiumdust", has(ItemList.itemIngotTritium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smelttritiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustTungsten), RecipeCategory.MISC, ItemList.itemIngotTungsten.get(), 0.75F, 20)
                .unlockedBy("smelttungstendust", has(ItemList.itemIngotTungsten.get()))
                .save(consumer, ResourceLocation.parse("extraores:smelttungstendust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustUnobtainium), RecipeCategory.MISC, ItemList.itemIngotUnobtainium.get(), 0.75F, 20)
                .unlockedBy("smeltunobtainiumdust", has(ItemList.itemIngotUnobtainium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltunobtainiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustUranium), RecipeCategory.MISC, ItemList.itemIngotUranium.get(), 0.75f, 20)
                .unlockedBy("smelturaniumdust", has(ItemList.itemIngotUranium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smelturaniumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustVanadium), RecipeCategory.MISC, ItemList.itemIngotVanadium.get(), 0.75F, 20)
                .unlockedBy("smeltvanadiumdust", has(ItemList.itemIngotVanadium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltvanadiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustVibranium), RecipeCategory.MISC, ItemList.itemIngotVibranium.get(), 0.75F, 20)
                .unlockedBy("smeltvibraniumdust", has(ItemList.itemIngotVibranium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltvibraniumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustVulcanite), RecipeCategory.MISC, ItemList.itemIngotVulcanite.get(), 0.75F, 20)
                .unlockedBy("smeltvulcanitedust", has(ItemList.itemIngotVulcanite.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltvulcanitedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustVyroxeres), RecipeCategory.MISC, ItemList.itemIngotVyroxeres.get(), 0.75F, 20)
                .unlockedBy("smeltvyroxeresdust", has(ItemList.itemIngotVyroxeres.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltvyroxeresdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustYellorite), RecipeCategory.MISC, ItemList.itemIngotYellorite.get(), 0.75F, 20)
                .unlockedBy("smeltyelloritedust", has(ItemList.itemIngotYellorite.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltyelloritedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustZinc), RecipeCategory.MISC, ItemList.itemIngotZinc.get(), 0.75F, 20)
                .unlockedBy("smeltzincdust", has(ItemList.itemIngotZinc.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltzincdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustZirconium), RecipeCategory.MISC, ItemList.itemIngotZirconium.get(), 0.75F, 20)
                .unlockedBy("smeltzirconiumdust", has(ItemList.itemIngotZirconium.get()))
                .save(consumer, ResourceLocation.parse("extraores:smeltzirconiumdust"));
    }

    protected void buildBlastingRecipes(RecipeOutput consumer)
    {
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreAdamantine.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotAdamantine.get(), 0.75F, 20)
                .unlockedBy("blastadamantineore", has(ItemList.itemIngotAdamantine.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastadamantineore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreAldourite.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotAldourite.get(), 0.75F, 20)
                .unlockedBy("blastaldouriteore", has(ItemList.itemIngotAldourite.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastaldouriteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreAluminum.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotAluminum.get(), 0.75F, 20)
                .unlockedBy("blastaluminumore", has(ItemList.itemIngotAluminum.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastaluminumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreAmericium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotAmericium.get(), 0.75F, 20)
                .unlockedBy("blastamericiumore", has(ItemList.itemIngotAmericium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastamericiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreAmordrine.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotAmordrine.get(), 0.75F, 20)
                .unlockedBy("blastamordrineore", has(ItemList.itemIngotAmordrine.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastamordrineore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreAngmallen.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotAngmallen.get(), 0.75F, 20)
                .unlockedBy("blastangmallenore", has(ItemList.itemIngotAngmallen.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastangmallenore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreAstralSilver.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotAstralSilver.get(), 0.75F, 20)
                .unlockedBy("blastastralsilverore", has(ItemList.itemIngotAstralSilver.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastastralsilverore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreAtlarus.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotAtlarus.get(), 0.75F, 20)
                .unlockedBy("blastatlarusore", has(ItemList.itemIngotAtlarus.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastatlarusore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreAzureSilver.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotAzureSilver.get(), 0.75F, 20)
                .unlockedBy("blastazuresilverore", has(ItemList.itemIngotAzureSilver.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastazuresilverore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreBismuth.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotBismuth.get(), 0.75F, 20)
                .unlockedBy("blastbismuthore", has(ItemList.itemIngotBismuth.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastbismuthore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreBlackSteel.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotBlackSteel.get(), 0.75F, 20)
                .unlockedBy("blastblacksteelore", has(ItemList.itemIngotBlackSteel.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastblacksteelore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreCadmium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotCadmium.get(), 0.75F, 20)
                .unlockedBy("blastcadmiumore", has(ItemList.itemIngotCadmium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastcadmiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreCarmot.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotCarmot.get(), 0.75F, 20)
                .unlockedBy("blastcarmotore", has(ItemList.itemIngotCarmot.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastcarmotore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreCelenegil.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotCelenegil.get(), 0.75F, 20)
                .unlockedBy("blastcelenegilore", has(ItemList.itemIngotCelenegil.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastcelenegilore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreCeruclase.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotCeruclase.get(), 0.75F, 20)
                .unlockedBy("blastceruclaseore", has(ItemList.itemIngotCeruclase.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastceruclaseore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreChromium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotChromium.get(), 0.75F, 20)
                .unlockedBy("blastchromiumore", has(ItemList.itemIngotChromium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastchromiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreCobalt.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotCobalt.get(), 0.75F, 20)
                .unlockedBy("blastcobaltore", has(ItemList.itemIngotCobalt.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastcobaltore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreCopper.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotCopper.get(), 0.75F, 20)
                .unlockedBy("blastcopperore", has(ItemList.itemIngotCopper.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastcopperore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreCrimsonSteel.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotCrimsonSteel.get(), 0.75F, 20)
                .unlockedBy("blastcrimsonsteelore", has(ItemList.itemIngotCrimsonSteel.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastcrimsonsteelore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreDeepIron.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotDeepIron.get(), 0.75F, 20)
                .unlockedBy("blastdeepironore", has(ItemList.itemIngotDeepIron.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastdeepironore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreDesichalkos.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotDesichalkos.get(), 0.75F, 20)
                .unlockedBy("blastdesichalkosore", has(ItemList.itemIngotDesichalkos.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastdesichalkosore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreEximite.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotEximite.get(), 0.75F, 20)
                .unlockedBy("blasteximiteore", has(ItemList.itemIngotEximite.get()))
                .save(consumer, ResourceLocation.parse("extraores:blasteximiteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreGallium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotGallium.get(), 0.75F, 20)
                .unlockedBy("blastgalliumore", has(ItemList.itemIngotGallium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastgalliumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreHaderoth.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotHaderoth.get(), 0.75F, 20)
                .unlockedBy("blasthaderothore", has(ItemList.itemIngotHaderoth.get()))
                .save(consumer, ResourceLocation.parse("extraores:blasthaderothore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreHepatizon.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotHepatizon.get(), 0.75F, 20)
                .unlockedBy("blasthepatizonore", has(ItemList.itemIngotHepatizon.get()))
                .save(consumer, ResourceLocation.parse("extraores:blasthepatizonore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreIgnatius.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotIgnatius.get(), 0.75F, 20)
                .unlockedBy("blastignatiusore", has(ItemList.itemIngotIgnatius.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastignatiusore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreIndium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotIndium.get(), 0.75F, 20)
                .unlockedBy("blastindiumore", has(ItemList.itemIngotIndium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastindiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreInfuscolium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotInfuscolium.get(), 0.75F, 20)
                .unlockedBy("blastinfuscoliumore", has(ItemList.itemIngotInfuscolium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastinfuscoliumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreInolashite.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotInolashite.get(), 0.75F, 20)
                .unlockedBy("blastinolashiteore", has(ItemList.itemIngotInolashite.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastinolashiteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreIridium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotIridium.get(), 0.75F, 20)
                .unlockedBy("blastiridiumore", has(ItemList.itemIngotIridium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastiridiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreKalendrite.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotKalendrite.get(), 0.75F, 20)
                .unlockedBy("blastkalendriteore", has(ItemList.itemIngotKalendrite.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastkalendriteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreLead.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotLead.get(), 0.75F, 20)
                .unlockedBy("blastleadore", has(ItemList.itemIngotLead.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastleadore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreLemurite.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotLemurite.get(), 0.75F, 20)
                .unlockedBy("blastlemuriteore", has(ItemList.itemIngotLemurite.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastlemuriteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreManganese.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotManganese.get(), 0.75F, 20)
                .unlockedBy("blastmanganeseore", has(ItemList.itemIngotManganese.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastmanganeseore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreMeutoite.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotMeutoite.get(), 0.75F, 20)
                .unlockedBy("blastmeutoiteore", has(ItemList.itemIngotMeutoite.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastmeutoiteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreMidasium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotMidasium.get(), 0.75F, 20)
                .unlockedBy("blastmidasiumore", has(ItemList.itemIngotMidasium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastmidasiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreMithril.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotMithril.get(), 0.75F, 20)
                .unlockedBy("blastmithrilore", has(ItemList.itemIngotMithril.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastmithrilore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreMolybdenum.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotMolybdenum.get(), 0.75F, 20)
                .unlockedBy("blastmolybdenumore", has(ItemList.itemIngotMolybdenum.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastmolybdenumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreNeodymium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotNeodymium.get(), 0.75F, 20)
                .unlockedBy("blastneodymiumore", has(ItemList.itemIngotNeodymium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastneodymiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreNeptunium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotNeptunium.get(), 0.75F, 20)
                .unlockedBy("blastneptuniumore", has(ItemList.itemIngotNeptunium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastneptuniumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreNickel.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotNickel.get(), 0.75F, 20)
                .unlockedBy("blastnickelore", has(ItemList.itemIngotNickel.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastnickelore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreNiobium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotNiobium.get(), 0.75F, 20)
                .unlockedBy("blastniobiumore", has(ItemList.itemIngotNiobium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastniobiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreOrichalcum.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotOrichalcum.get(), 0.75F, 20)
                .unlockedBy("blastorichalcumore", has(ItemList.itemIngotOrichalcum.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastorichalcumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreOureclase.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotOureclase.get(), 0.75F, 20)
                .unlockedBy("blastoureclaseore", has(ItemList.itemIngotOureclase.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastoureclaseore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOrePalladium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotPalladium.get(), 0.75F, 20)
                .unlockedBy("blastpalladiumore", has(ItemList.itemIngotPalladium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastpalladiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOrePlatinum.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotPlatinum.get(), 0.75F, 20)
                .unlockedBy("blastplatinumore", has(ItemList.itemIngotPlatinum.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastplatinumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOrePlutonium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotPlutonium.get(), 0.75F, 20)
                .unlockedBy("blastplutoniumore", has(ItemList.itemIngotPlutonium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastplutoniumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOrePolonium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotPolonium.get(), 0.75F, 20)
                .unlockedBy("blastpoloniumore", has(ItemList.itemIngotPolonium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastpoloniumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOrePromethium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotPromethium.get(), 0.75F, 20)
                .unlockedBy("blastpromethiumore", has(ItemList.itemIngotPromethium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastpromethiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreRhenium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotRhenium.get(), 0.75F, 20)
                .unlockedBy("blastrheniumore", has(ItemList.itemIngotRhenium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastrheniumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreRhodium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotRhodium.get(), 0.75F, 20)
                .unlockedBy("blastrhodiumore", has(ItemList.itemIngotRhodium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastrhodiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreRubracium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotRubracium.get(), 0.75F, 20)
                .unlockedBy("blastrubraciumore", has(ItemList.itemIngotRubracium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastrubraciumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreRuthenium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotRuthenium.get(), 0.75F, 20)
                .unlockedBy("blastrutheniumore", has(ItemList.itemIngotRuthenium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastrutheniumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreSanguinite.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotSanguinite.get(), 0.75F, 20)
                .unlockedBy("blastsanguiniteore", has(ItemList.itemIngotSanguinite.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastsanguiniteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreShadowIron.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotShadowIron.get(), 0.75F, 20)
                .unlockedBy("blastshadowironore", has(ItemList.itemIngotShadowIron.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastshadowironore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreSilver.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotSilver.get(), 0.75F, 20)
                .unlockedBy("blastsilverore", has(ItemList.itemIngotSilver.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastsilverore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreTantalum.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotTantalum.get(), 0.75F, 20)
                .unlockedBy("blasttantalumore", has(ItemList.itemIngotTantalum.get()))
                .save(consumer, ResourceLocation.parse("extraores:blasttantalumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreTartarite.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotTartarite.get(), 0.75F, 20)
                .unlockedBy("blasttartariteore", has(ItemList.itemIngotTartarite.get()))
                .save(consumer, ResourceLocation.parse("extraores:blasttartariteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreTechnetium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotTechnetium.get(), 0.75F, 20)
                .unlockedBy("blasttechnetiumore", has(ItemList.itemIngotTechnetium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blasttechnetiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreThallium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotThallium.get(), 0.75F, 20)
                .unlockedBy("blastthalliumore", has(ItemList.itemIngotThallium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastthalliumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreTin.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotTin.get(), 0.75F, 20)
                .unlockedBy("blasttinore", has(ItemList.itemIngotTin.get()))
                .save(consumer, ResourceLocation.parse("extraores:blasttinore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreTitanium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotTitanium.get(), 0.75F, 20)
                .unlockedBy("blasttitaniumore", has(ItemList.itemIngotTitanium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blasttitaniumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreTritium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotTritium.get(), 0.75F, 20)
                .unlockedBy("blasttritiumore", has(ItemList.itemIngotTritium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blasttritiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreTungsten.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotTungsten.get(), 0.75F, 20)
                .unlockedBy("blasttungstenore", has(ItemList.itemIngotTungsten.get()))
                .save(consumer, ResourceLocation.parse("extraores:blasttungstenore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreUnobtainium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotUnobtainium.get(), 0.75F, 20)
                .unlockedBy("blastunobtainiumore", has(ItemList.itemIngotUnobtainium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastunobtainiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreUranium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotUranium.get(), 0.75f, 20)
                .unlockedBy("blasturaniumore", has(ItemList.itemIngotUranium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blasturaniumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreVanadium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotVanadium.get(), 0.75F, 20)
                .unlockedBy("blastvanadiumore", has(ItemList.itemIngotVanadium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastvanadiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreVibranium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotVibranium.get(), 0.75F, 20)
                .unlockedBy("blastvibraniumore", has(ItemList.itemIngotVibranium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastvibraniumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreVulcanite.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotVulcanite.get(), 0.75F, 20)
                .unlockedBy("blastvulcaniteore", has(ItemList.itemIngotVulcanite.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastvulcaniteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreVyroxeres.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotVyroxeres.get(), 0.75F, 20)
                .unlockedBy("blastvyroxeresore", has(ItemList.itemIngotVyroxeres.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastvyroxeresore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreYellorite.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotYellorite.get(), 0.75F, 20)
                .unlockedBy("blastyelloriteore", has(ItemList.itemIngotYellorite.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastyelloriteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreZinc.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotZinc.get(), 0.75F, 20)
                .unlockedBy("blastzincore", has(ItemList.itemIngotZinc.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastzincore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreZirconium.get().asItem()), RecipeCategory.MISC, ItemList.itemIngotZirconium.get(), 0.75F, 20)
                .unlockedBy("blastzirconiumore", has(ItemList.itemIngotZirconium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastzirconiumore"));
        //Blasting Dust
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustAdamantine.get()), RecipeCategory.MISC, ItemList.itemIngotAdamantine.get(), 0.75F, 10)
                .unlockedBy("blastadamantinedust", has(ItemList.itemIngotAdamantine.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastadamantinedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustAldourite.get()), RecipeCategory.MISC, ItemList.itemIngotAldourite.get(), 0.75F, 10)
                .unlockedBy("blastaldouritedust", has(ItemList.itemIngotAldourite.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastaldouritedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustAluminum.get()), RecipeCategory.MISC, ItemList.itemIngotAluminum.get(), 0.75F, 10)
                .unlockedBy("blastaluminumdust", has(ItemList.itemIngotAluminum.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastaluminumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustAmericium.get()), RecipeCategory.MISC, ItemList.itemIngotAmericium.get(), 0.75F, 10)
                .unlockedBy("blastamericiumdust", has(ItemList.itemIngotAmericium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastamericiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustAmordrine.get()), RecipeCategory.MISC, ItemList.itemIngotAmordrine.get(), 0.75F, 10)
                .unlockedBy("blastamordrinedust", has(ItemList.itemIngotAmordrine.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastamordrinedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustAngmallen.get()), RecipeCategory.MISC, ItemList.itemIngotAngmallen.get(), 0.75F, 10)
                .unlockedBy("blastangmallendust", has(ItemList.itemIngotAngmallen.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastangmallendust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustAstralSilver.get()), RecipeCategory.MISC, ItemList.itemIngotAstralSilver.get(), 0.75F, 10)
                .unlockedBy("blastastralsilverdust", has(ItemList.itemIngotAstralSilver.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastastralsilverdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustAtlarus.get()), RecipeCategory.MISC, ItemList.itemIngotAtlarus.get(), 0.75F, 10)
                .unlockedBy("blastatlarusdust", has(ItemList.itemIngotAtlarus.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastatlarusdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustAzureSilver.get()), RecipeCategory.MISC, ItemList.itemIngotAzureSilver.get(), 0.75F, 10)
                .unlockedBy("blastazuresilverdust", has(ItemList.itemIngotAzureSilver.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastazuresilverdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustBismuth.get()), RecipeCategory.MISC, ItemList.itemIngotBismuth.get(), 0.75F, 10)
                .unlockedBy("blastbismuthdust", has(ItemList.itemIngotBismuth.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastbismuthdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustBlackSteel.get()), RecipeCategory.MISC, ItemList.itemIngotBlackSteel.get(), 0.75F, 10)
                .unlockedBy("blastblacksteeldust", has(ItemList.itemIngotBlackSteel.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastblacksteeldust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustCadmium.get()), RecipeCategory.MISC, ItemList.itemIngotCadmium.get(), 0.75F, 10)
                .unlockedBy("blastcadmiumdust", has(ItemList.itemIngotCadmium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastcadmiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustCarmot.get()), RecipeCategory.MISC, ItemList.itemIngotCarmot.get(), 0.75F, 10)
                .unlockedBy("blastcarmotdust", has(ItemList.itemIngotCarmot.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastcarmotdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustCelenegil.get()), RecipeCategory.MISC, ItemList.itemIngotCelenegil.get(), 0.75F, 10)
                .unlockedBy("blastcelenegildust", has(ItemList.itemIngotCelenegil.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastcelenegildust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustCeruclase.get()), RecipeCategory.MISC, ItemList.itemIngotCeruclase.get(), 0.75F, 10)
                .unlockedBy("blastceruclasedust", has(ItemList.itemIngotCeruclase.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastceruclasedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustChromium.get()), RecipeCategory.MISC, ItemList.itemIngotChromium.get(), 0.75F, 10)
                .unlockedBy("blastchromiumdust", has(ItemList.itemIngotChromium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastchromiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustCobalt.get()), RecipeCategory.MISC, ItemList.itemIngotCobalt.get(), 0.75F, 10)
                .unlockedBy("blastcobaltdust", has(ItemList.itemIngotCobalt.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastcobaltdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustCopper.get()), RecipeCategory.MISC, ItemList.itemIngotCopper.get(), 0.75F, 10)
                .unlockedBy("blastcopperdust", has(ItemList.itemIngotCopper.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastcopperdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustCrimsonSteel.get()), RecipeCategory.MISC, ItemList.itemIngotCrimsonSteel.get(), 0.75F, 10)
                .unlockedBy("blastcrimsonsteeldust", has(ItemList.itemIngotCrimsonSteel.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastcrimsonsteeldust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustDeepIron.get()), RecipeCategory.MISC, ItemList.itemIngotDeepIron.get(), 0.75F, 10)
                .unlockedBy("blastdeepirondust", has(ItemList.itemIngotDeepIron.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastdeepirondust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustDesichalkos.get()), RecipeCategory.MISC, ItemList.itemIngotDesichalkos.get(), 0.75F, 10)
                .unlockedBy("blastdesichalkosdust", has(ItemList.itemIngotDesichalkos.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastdesichalkosdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustEximite.get()), RecipeCategory.MISC, ItemList.itemIngotEximite.get(), 0.75F, 10)
                .unlockedBy("blasteximitedust", has(ItemList.itemIngotEximite.get()))
                .save(consumer, ResourceLocation.parse("extraores:blasteximitedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustGallium.get()), RecipeCategory.MISC, ItemList.itemIngotGallium.get(), 0.75F, 10)
                .unlockedBy("blastgalliumdust", has(ItemList.itemIngotGallium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastgalliumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustHaderoth.get()), RecipeCategory.MISC, ItemList.itemIngotHaderoth.get(), 0.75F, 10)
                .unlockedBy("blasthaderothdust", has(ItemList.itemIngotHaderoth.get()))
                .save(consumer, ResourceLocation.parse("extraores:blasthaderothdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustHepatizon.get()), RecipeCategory.MISC, ItemList.itemIngotHepatizon.get(), 0.75F, 10)
                .unlockedBy("blasthepatizondust", has(ItemList.itemIngotHepatizon.get()))
                .save(consumer, ResourceLocation.parse("extraores:blasthepatizondust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustIgnatius.get()), RecipeCategory.MISC, ItemList.itemIngotIgnatius.get(), 0.75F, 10)
                .unlockedBy("blastignatiusdust", has(ItemList.itemIngotIgnatius.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastignatiusdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustIndium.get()), RecipeCategory.MISC, ItemList.itemIngotIndium.get(), 0.75F, 10)
                .unlockedBy("blastindiumdust", has(ItemList.itemIngotIndium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastindiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustInfuscolium.get()), RecipeCategory.MISC, ItemList.itemIngotInfuscolium.get(), 0.75F, 10)
                .unlockedBy("blastinfuscoliumdust", has(ItemList.itemIngotInfuscolium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastinfuscoliumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustInolashite.get()), RecipeCategory.MISC, ItemList.itemIngotInolashite.get(), 0.75F, 10)
                .unlockedBy("blastinolashitedust", has(ItemList.itemIngotInolashite.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastinolashitedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustIridium.get()), RecipeCategory.MISC, ItemList.itemIngotIridium.get(), 0.75F, 10)
                .unlockedBy("blastiridiumdust", has(ItemList.itemIngotIridium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastiridiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustKalendrite.get()), RecipeCategory.MISC, ItemList.itemIngotKalendrite.get(), 0.75F, 10)
                .unlockedBy("blastkalendritedust", has(ItemList.itemIngotKalendrite.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastkalendritedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustLead.get()), RecipeCategory.MISC, ItemList.itemIngotLead.get(), 0.75F, 10)
                .unlockedBy("blastleaddust", has(ItemList.itemIngotLead.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastleaddust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustLemurite.get()), RecipeCategory.MISC, ItemList.itemIngotLemurite.get(), 0.75F, 10)
                .unlockedBy("blastlemuritedust", has(ItemList.itemIngotLemurite.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastlemuritedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustManganese.get()), RecipeCategory.MISC, ItemList.itemIngotManganese.get(), 0.75F, 10)
                .unlockedBy("blastmanganesedust", has(ItemList.itemIngotManganese.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastmanganesedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustMeutoite.get()), RecipeCategory.MISC, ItemList.itemIngotMeutoite.get(), 0.75F, 10)
                .unlockedBy("blastmeutoitedust", has(ItemList.itemIngotMeutoite.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastmeutoitedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustMidasium.get()), RecipeCategory.MISC, ItemList.itemIngotMidasium.get(), 0.75F, 10)
                .unlockedBy("blastmidasiumdust", has(ItemList.itemIngotMidasium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastmidasiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustMithril.get()), RecipeCategory.MISC, ItemList.itemIngotMithril.get(), 0.75F, 10)
                .unlockedBy("blastmithrildust", has(ItemList.itemIngotMithril.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastmithrildust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustMolybdenum.get()), RecipeCategory.MISC, ItemList.itemIngotMolybdenum.get(), 0.75F, 10)
                .unlockedBy("blastmolybdenumdust", has(ItemList.itemIngotMolybdenum.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastmolybdenumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustNeodymium.get()), RecipeCategory.MISC, ItemList.itemIngotNeodymium.get(), 0.75F, 10)
                .unlockedBy("blastneodymiumdust", has(ItemList.itemIngotNeodymium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastneodymiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustNeptunium.get()), RecipeCategory.MISC, ItemList.itemIngotNeptunium.get(), 0.75F, 10)
                .unlockedBy("blastneptuniumdust", has(ItemList.itemIngotNeptunium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastneptuniumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustNickel.get()), RecipeCategory.MISC, ItemList.itemIngotNickel.get(), 0.75F, 10)
                .unlockedBy("blastnickeldust", has(ItemList.itemIngotNickel.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastnickeldust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustNiobium.get()), RecipeCategory.MISC, ItemList.itemIngotNiobium.get(), 0.75F, 10)
                .unlockedBy("blastniobiumdust", has(ItemList.itemIngotNiobium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastniobiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustOrichalcum.get()), RecipeCategory.MISC, ItemList.itemIngotOrichalcum.get(), 0.75F, 10)
                .unlockedBy("blastorichalcumdust", has(ItemList.itemIngotOrichalcum.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastorichalcumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustOureclase.get()), RecipeCategory.MISC, ItemList.itemIngotOureclase.get(), 0.75F, 10)
                .unlockedBy("blastoureclasedust", has(ItemList.itemIngotOureclase.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastoureclasedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustPalladium.get()), RecipeCategory.MISC, ItemList.itemIngotPalladium.get(), 0.75F, 10)
                .unlockedBy("blastpalladiumdust", has(ItemList.itemIngotPalladium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastpalladiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustPlatinum.get()), RecipeCategory.MISC, ItemList.itemIngotPlatinum.get(), 0.75F, 10)
                .unlockedBy("blastplatinumdust", has(ItemList.itemIngotPlatinum.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastplatinumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustPlutonium.get()), RecipeCategory.MISC, ItemList.itemIngotPlutonium.get(), 0.75F, 10)
                .unlockedBy("blastplutoniumdust", has(ItemList.itemIngotPlutonium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastplutoniumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustPolonium.get()), RecipeCategory.MISC, ItemList.itemIngotPolonium.get(), 0.75F, 10)
                .unlockedBy("blastpoloniumdust", has(ItemList.itemIngotPolonium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastpoloniumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustPromethium.get()), RecipeCategory.MISC, ItemList.itemIngotPromethium.get(), 0.75F, 10)
                .unlockedBy("blastpromethiumdust", has(ItemList.itemIngotPromethium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastpromethiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustRhenium.get()), RecipeCategory.MISC, ItemList.itemIngotRhenium.get(), 0.75F, 10)
                .unlockedBy("blastrheniumdust", has(ItemList.itemIngotRhenium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastrheniumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustRhodium.get()), RecipeCategory.MISC, ItemList.itemIngotRhodium.get(), 0.75F, 10)
                .unlockedBy("blastrhodiumdust", has(ItemList.itemIngotRhodium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastrhodiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustRubracium.get()), RecipeCategory.MISC, ItemList.itemIngotRubracium.get(), 0.75F, 10)
                .unlockedBy("blastrubraciumdust", has(ItemList.itemIngotRubracium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastrubraciumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustRuthenium.get()), RecipeCategory.MISC, ItemList.itemIngotRuthenium.get(), 0.75F, 10)
                .unlockedBy("blastrutheniumdust", has(ItemList.itemIngotRuthenium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastrutheniumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustSanguinite.get()), RecipeCategory.MISC, ItemList.itemIngotSanguinite.get(), 0.75F, 10)
                .unlockedBy("blastsanguinitedust", has(ItemList.itemIngotSanguinite.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastsanguinitedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustShadowIron.get()), RecipeCategory.MISC, ItemList.itemIngotShadowIron.get(), 0.75F, 10)
                .unlockedBy("blastshadowirondust", has(ItemList.itemIngotShadowIron.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastshadowirondust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustSilver.get()), RecipeCategory.MISC, ItemList.itemIngotSilver.get(), 0.75F, 10)
                .unlockedBy("blastsilverdust", has(ItemList.itemIngotSilver.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastsilverdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustTantalum.get()), RecipeCategory.MISC, ItemList.itemIngotTantalum.get(), 0.75F, 10)
                .unlockedBy("blasttantalumdust", has(ItemList.itemIngotTantalum.get()))
                .save(consumer, ResourceLocation.parse("extraores:blasttantalumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustTartarite.get()), RecipeCategory.MISC, ItemList.itemIngotTartarite.get(), 0.75F, 10)
                .unlockedBy("blasttartaritedust", has(ItemList.itemIngotTartarite.get()))
                .save(consumer, ResourceLocation.parse("extraores:blasttartaritedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustTechnetium.get()), RecipeCategory.MISC, ItemList.itemIngotTechnetium.get(), 0.75F, 10)
                .unlockedBy("blasttechnetiumdust", has(ItemList.itemIngotTechnetium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blasttechnetiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustThallium.get()), RecipeCategory.MISC, ItemList.itemIngotThallium.get(), 0.75F, 10)
                .unlockedBy("blastthalliumdust", has(ItemList.itemIngotThallium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastthalliumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustTin.get()), RecipeCategory.MISC, ItemList.itemIngotTin.get(), 0.75F, 10)
                .unlockedBy("blasttindust", has(ItemList.itemIngotTin.get()))
                .save(consumer, ResourceLocation.parse("extraores:blasttindust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustTitanium.get()), RecipeCategory.MISC, ItemList.itemIngotTitanium.get(), 0.75F, 10)
                .unlockedBy("blasttitaniumdust", has(ItemList.itemIngotTitanium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blasttitaniumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustTritium.get()), RecipeCategory.MISC, ItemList.itemIngotTritium.get(), 0.75F, 10)
                .unlockedBy("blasttritiumdust", has(ItemList.itemIngotTritium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blasttritiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustTungsten.get()), RecipeCategory.MISC, ItemList.itemIngotTungsten.get(), 0.75F, 10)
                .unlockedBy("blasttungstendust", has(ItemList.itemIngotTungsten.get()))
                .save(consumer, ResourceLocation.parse("extraores:blasttungstendust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustUnobtainium.get()), RecipeCategory.MISC, ItemList.itemIngotUnobtainium.get(), 0.75F, 10)
                .unlockedBy("blastunobtainiumdust", has(ItemList.itemIngotUnobtainium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastunobtainiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustUranium.get()), RecipeCategory.MISC, ItemList.itemIngotUranium.get(), 0.75f, 10)
                .unlockedBy("blasturaniumdust", has(ItemList.itemIngotUranium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blasturaniumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustVanadium.get()), RecipeCategory.MISC, ItemList.itemIngotVanadium.get(), 0.75F, 10)
                .unlockedBy("blastvanadiumdust", has(ItemList.itemIngotVanadium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastvanadiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustVibranium.get()), RecipeCategory.MISC, ItemList.itemIngotVibranium.get(), 0.75F, 10)
                .unlockedBy("blastvibraniumdust", has(ItemList.itemIngotVibranium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastvibraniumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustVulcanite.get()), RecipeCategory.MISC, ItemList.itemIngotVulcanite.get(), 0.75F, 10)
                .unlockedBy("blastvulcanitedust", has(ItemList.itemIngotVulcanite.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastvulcanitedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustVyroxeres.get()), RecipeCategory.MISC, ItemList.itemIngotVyroxeres.get(), 0.75F, 10)
                .unlockedBy("blastvyroxeresdust", has(ItemList.itemIngotVyroxeres.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastvyroxeresdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustYellorite.get()), RecipeCategory.MISC, ItemList.itemIngotYellorite.get(), 0.75F, 10)
                .unlockedBy("blastyelloritedust", has(ItemList.itemIngotYellorite.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastyelloritedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustZinc.get()), RecipeCategory.MISC, ItemList.itemIngotZinc.get(), 0.75F, 10)
                .unlockedBy("blastzincdust", has(ItemList.itemIngotZinc.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastzincdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustZirconium.get()), RecipeCategory.MISC, ItemList.itemIngotZirconium.get(), 0.75F, 10)
                .unlockedBy("blastzirconiumdust", has(ItemList.itemIngotZirconium.get()))
                .save(consumer, ResourceLocation.parse("extraores:blastzirconiumdust"));
    }

    protected void buildMekanismInjecting(RecipeOutput consumer)
    {
        //Ore
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreAdamantine), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardAdamantine.get(), 4))
                .unlockedBy("injectadamantineore", has(BlockList.blockOreAdamantine.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectadamantineore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreAldourite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardAldourite.get(), 4))
                .unlockedBy("injectaldouriteore", has(BlockList.blockOreAldourite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectaldouriteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreAluminum), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardAluminum.get(), 4))
                .unlockedBy("injectaluminumore", has(BlockList.blockOreAluminum.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectaluminumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreAmericium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardAmericium.get(), 4))
                .unlockedBy("injectamericiumore", has(BlockList.blockOreAmericium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectamericiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreAmordrine), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardAmordrine.get(), 4))
                .unlockedBy("injectamordrineore", has(BlockList.blockOreAmordrine.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectamordrineore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreAngmallen), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardAngmallen.get(), 4))
                .unlockedBy("injectangmallenore", has(BlockList.blockOreAngmallen.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectangmallenore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreAstralSilver), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardAstralSilver.get(), 4))
                .unlockedBy("injectastralsilverore", has(BlockList.blockOreAstralSilver.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectastralsilverore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreAtlarus), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardAtlarus.get(), 4))
                .unlockedBy("injectatlarusore", has(BlockList.blockOreAtlarus.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectatlarusore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreAzureSilver),GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1),new ItemStack(ItemList.itemShardAzureSilver.get(),4))
                .unlockedBy("injectazuresilverore",has(BlockList.blockOreAzureSilver.get()))
                .build(consumer,ResourceLocation.parse("extraores:injectazuresilverore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreBismuth), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardBismuth.get(), 4))
                .unlockedBy("injectbismuthore", has(BlockList.blockOreBismuth.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectbismuthore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreBlackSteel), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardBlackSteel.get(), 4))
                .unlockedBy("injectblacksteelore", has(BlockList.blockOreBlackSteel.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectblacksteelore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreCadmium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardCadmium.get(), 4))
                .unlockedBy("injectcadmiumore", has(BlockList.blockOreCadmium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectcadmiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreCarmot), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardCarmot.get(), 4))
                .unlockedBy("injectcarmotore", has(BlockList.blockOreCarmot.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectcarmotore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreCelenegil), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardCelenegil.get(), 4))
                .unlockedBy("injectcelenegilore", has(BlockList.blockOreCelenegil.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectcelenegilore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreCeruclase), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardCeruclase.get(), 4))
                .unlockedBy("injectceruclaseore", has(BlockList.blockOreCeruclase.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectceruclaseore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreChromium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardChromium.get(), 4))
                .unlockedBy("injectchromiumore", has(BlockList.blockOreChromium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectchromiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreCobalt), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardCobalt.get(), 4))
                .unlockedBy("injectcobaltore", has(BlockList.blockOreCobalt.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectcobaltore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreCopper), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardCopper.get(), 4))
                .unlockedBy("injectcopperore", has(BlockList.blockOreCopper.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectcopperore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreCrimsonSteel), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardCrimsonSteel.get(), 4))
                .unlockedBy("injectcrimsonsteelore", has(BlockList.blockOreCrimsonSteel.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectcrimsonsteelore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreDeepIron), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardDeepIron.get(), 4))
                .unlockedBy("injectdeepironore", has(BlockList.blockOreDeepIron.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectdeepironore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreDesichalkos), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardDesichalkos.get(), 4))
                .unlockedBy("injectdesichalkosore", has(BlockList.blockOreDesichalkos.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectdesichalkosore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreEximite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardEximite.get(), 4))
                .unlockedBy("injecteximiteore", has(BlockList.blockOreEximite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injecteximiteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreGallium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardGallium.get(), 4))
                .unlockedBy("injectgalliumore", has(BlockList.blockOreGallium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectgalliumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreHaderoth), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardHaderoth.get(), 4))
                .unlockedBy("injecthaderothore", has(BlockList.blockOreHaderoth.get()))
                .build(consumer, ResourceLocation.parse("extraores:injecthaderothore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreHepatizon), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardHepatizon.get(), 4))
                .unlockedBy("injecthepatizonore", has(BlockList.blockOreHepatizon.get()))
                .build(consumer, ResourceLocation.parse("extraores:injecthepatizonore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreIgnatius), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardIgnatius.get(), 4))
                .unlockedBy("injectignatiusore", has(BlockList.blockOreIgnatius.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectignatiusore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreIndium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardIndium.get(), 4))
                .unlockedBy("injectindiumore", has(BlockList.blockOreIndium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectindiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreInfuscolium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardInfuscolium.get(), 4))
                .unlockedBy("injectinfuscoliumore", has(BlockList.blockOreInfuscolium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectinfuscoliumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreInolashite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardInolashite.get(), 4))
                .unlockedBy("injectinolashiteore", has(BlockList.blockOreInolashite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectinolashiteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreIridium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardIridium.get(), 4))
                .unlockedBy("injectiridiumore", has(BlockList.blockOreIridium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectiridiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreKalendrite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardKalendrite.get(), 4))
                .unlockedBy("injectkalendriteore", has(BlockList.blockOreKalendrite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectkalendriteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreLead), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardLead.get(), 4))
                .unlockedBy("injectleadore", has(BlockList.blockOreLead.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectleadore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreLemurite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardLemurite.get(), 4))
                .unlockedBy("injectlemuriteore", has(BlockList.blockOreLemurite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectlemuriteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreManganese), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardManganese.get(), 4))
                .unlockedBy("injectmanganeseore", has(BlockList.blockOreManganese.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectmanganeseore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreMeutoite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardMeutoite.get(), 4))
                .unlockedBy("injectmeutoiteore", has(BlockList.blockOreMeutoite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectmeutoiteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreMidasium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardMidasium.get(), 4))
                .unlockedBy("injectmidasiumore", has(BlockList.blockOreMidasium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectmidasiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreMithril), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardMithril.get(), 4))
                .unlockedBy("injectmithrilore", has(BlockList.blockOreMithril.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectmithrilore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreMolybdenum), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardMolybdenum.get(), 4))
                .unlockedBy("injectmolybdenumore", has(BlockList.blockOreMolybdenum.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectmolybdenumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreNeodymium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardNeodymium.get(), 4))
                .unlockedBy("injectneodymiumore", has(BlockList.blockOreNeodymium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectneodymiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreNeptunium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardNeptunium.get(), 4))
                .unlockedBy("injectneptuniumore", has(BlockList.blockOreNeptunium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectneptuniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreNickel), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardNickel.get(), 4))
                .unlockedBy("injectnickelore", has(BlockList.blockOreNickel.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectnickelore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreNiobium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardNiobium.get(), 4))
                .unlockedBy("injectniobiumore", has(BlockList.blockOreNiobium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectniobiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreOrichalcum), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardOrichalcum.get(), 4))
                .unlockedBy("injectorichalcumore", has(BlockList.blockOreOrichalcum.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectorichalcumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreOsmium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardOsmium.get(), 4))
                .unlockedBy("injectosmiumore", has(BlockList.blockOreOsmium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectosmiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreOureclase), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardOureclase.get(), 4))
                .unlockedBy("injectoureclaseore", has(BlockList.blockOreOureclase.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectoureclaseore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.orePalladium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardPalladium.get(), 4))
                .unlockedBy("injectpalladiumore", has(BlockList.blockOrePalladium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectpalladiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.orePlatinum), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardPlatinum.get(), 4))
                .unlockedBy("injectplatinumore", has(BlockList.blockOrePlatinum.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectplatinumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.orePlutonium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardPlutonium.get(), 4))
                .unlockedBy("injectplutoniumore", has(BlockList.blockOrePlutonium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectplutoniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.orePolonium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardPolonium.get(), 4))
                .unlockedBy("injectpoloniumore", has(BlockList.blockOrePolonium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectpoloniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.orePromethium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardPromethium.get(), 4))
                .unlockedBy("injectpromethiumore", has(BlockList.blockOrePromethium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectpromethiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreRhenium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardRhenium.get(), 4))
                .unlockedBy("injectrheniumore", has(BlockList.blockOreRhenium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrheniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreRhodium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardRhodium.get(), 4))
                .unlockedBy("injectrhodiumore", has(BlockList.blockOreRhodium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrhodiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreRubracium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardRubracium.get(), 4))
                .unlockedBy("injectrubraciumore", has(BlockList.blockOreRubracium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrubraciumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreRuthenium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardRuthenium.get(), 4))
                .unlockedBy("injectrutheniumore", has(BlockList.blockOreRuthenium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrutheniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreSanguinite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardSanguinite.get(), 4))
                .unlockedBy("injectsanguiniteore", has(BlockList.blockOreSanguinite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectsanguiniteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreShadowIron), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardShadowIron.get(), 4))
                .unlockedBy("injectshadowironore", has(BlockList.blockOreShadowIron.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectshadowironore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreSilver), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardSilver.get(), 4))
                .unlockedBy("injectsilverore", has(BlockList.blockOreSilver.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectsilverore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreTantalum), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardTantalum.get(), 4))
                .unlockedBy("injecttantalumore", has(BlockList.blockOreTantalum.get()))
                .build(consumer, ResourceLocation.parse("extraores:injecttantalumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreTartarite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardTartarite.get(), 4))
                .unlockedBy("injecttartariteore", has(BlockList.blockOreTartarite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injecttartariteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreTechnetium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardTechnetium.get(), 4))
                .unlockedBy("injecttechnetiumore", has(BlockList.blockOreTechnetium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injecttechnetiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreThallium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardThallium.get(), 4))
                .unlockedBy("injectthalliumore", has(BlockList.blockOreThallium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectthalliumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreTin), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardTin.get(), 4))
                .unlockedBy("injecttinore", has(BlockList.blockOreTin.get()))
                .build(consumer, ResourceLocation.parse("extraores:injecttinore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreTritium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardTritium.get(), 4))
                .unlockedBy("injecttritiumore", has(BlockList.blockOreTritium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injecttritiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreTungsten), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardTungsten.get(), 4))
                .unlockedBy("injecttungstenore", has(BlockList.blockOreTungsten.get()))
                .build(consumer, ResourceLocation.parse("extraores:injecttungstenore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreUnobtainium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardUnobtainium.get(), 4))
                .unlockedBy("injectunobtainiumore", has(BlockList.blockOreUnobtainium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectunobtainiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreUranium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardUranium.get(), 4))
                .unlockedBy("injecturaniumore", has(BlockList.blockOreUranium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injecturaniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreVanadium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardVanadium.get(), 4))
                .unlockedBy("injectvanadiumore", has(BlockList.blockOreVanadium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectvanadiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreVibranium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardVibranium.get(), 4))
                .unlockedBy("injectvibraniumore", has(BlockList.blockOreVibranium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectvibraniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreVulcanite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardVulcanite.get(), 4))
                .unlockedBy("injectvulcaniteore", has(BlockList.blockOreVulcanite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectvulcaniteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreVyroxeres), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardVyroxeres.get(), 4))
                .unlockedBy("injectvyroxeresore", has(BlockList.blockOreVyroxeres.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectvyroxeresore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreYellorite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardYellorite.get(), 4))
                .unlockedBy("injectyelloriteore", has(BlockList.blockOreYellorite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectyelloriteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreZinc), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardZinc.get(), 4))
                .unlockedBy("injectzincore", has(BlockList.blockOreZinc.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectzincore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreZirconium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardZirconium.get(), 4))
                .unlockedBy("injectzirconiumore", has(BlockList.blockOreZirconium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectzirconiumore"));
        //Raw
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawAdamantine), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardAdamantine.get(), 4))
                .unlockedBy("injectrawadamantine", has(ItemList.itemRawAdamantine.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawadamantine"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawAldourite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardAldourite.get(), 4))
                .unlockedBy("injectrawaldourite", has(ItemList.itemRawAldourite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawaldourite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawAluminum), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardAluminum.get(), 4))
                .unlockedBy("injectrawaluminum", has(ItemList.itemRawAluminum.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawaluminum"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawAmericium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardAmericium.get(), 4))
                .unlockedBy("injectrawamericium", has(ItemList.itemRawAmericium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawamericium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawAmordrine), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardAmordrine.get(), 4))
                .unlockedBy("injectrawamordrine", has(ItemList.itemRawAmordrine.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawamordrine"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawAngmallen), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardAngmallen.get(), 4))
                .unlockedBy("injectrawangmallen", has(ItemList.itemRawAngmallen.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawangmallen"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawAstralSilver), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardAstralSilver.get(), 4))
                .unlockedBy("injectrawastralsilver", has(ItemList.itemRawAstralSilver.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawastralsilver"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawAtlarus), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardAtlarus.get(), 4))
                .unlockedBy("injectrawatlarus", has(ItemList.itemRawAtlarus.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawatlarus"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawAzureSilver),GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1),new ItemStack(ItemList.itemShardAzureSilver.get(),4))
                .unlockedBy("injectrawazuresilver",has(ItemList.itemRawAzureSilver.get()))
                .build(consumer,ResourceLocation.parse("extraores:injectrawazuresilver"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawBismuth), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardBismuth.get(), 4))
                .unlockedBy("injectrawbismuth", has(ItemList.itemRawBismuth.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawbismuth"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawBlackSteel), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardBlackSteel.get(), 4))
                .unlockedBy("injectrawblacksteel", has(ItemList.itemRawBlackSteel.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawblacksteel"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawCadmium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardCadmium.get(), 4))
                .unlockedBy("injectrawcadmium", has(ItemList.itemRawCadmium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawcadmium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawCarmot), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardCarmot.get(), 4))
                .unlockedBy("injectrawcarmot", has(ItemList.itemRawCarmot.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawcarmot"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawCelenegil), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardCelenegil.get(), 4))
                .unlockedBy("injectrawcelenegil", has(ItemList.itemRawCelenegil.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawcelenegil"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawCeruclase), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardCeruclase.get(), 4))
                .unlockedBy("injectrawceruclase", has(ItemList.itemRawCeruclase.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawceruclase"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawChromium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardChromium.get(), 4))
                .unlockedBy("injectrawchromium", has(ItemList.itemRawChromium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawchromium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawCobalt), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardCobalt.get(), 4))
                .unlockedBy("injectrawcobalt", has(ItemList.itemRawCobalt.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawcobalt"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawCopper), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardCopper.get(), 4))
                .unlockedBy("injectrawcopper", has(ItemList.itemRawCopper.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawcopper"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawCrimsonSteel), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardCrimsonSteel.get(), 4))
                .unlockedBy("injectrawcrimsonsteel", has(ItemList.itemRawCrimsonSteel.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawcrimsonsteel"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawDeepIron), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardDeepIron.get(), 4))
                .unlockedBy("injectrawdeepiron", has(ItemList.itemRawDeepIron.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawdeepiron"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawDesichalkos), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardDesichalkos.get(), 4))
                .unlockedBy("injectrawdesichalkos", has(ItemList.itemRawDesichalkos.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawdesichalkos"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawEximite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardEximite.get(), 4))
                .unlockedBy("injectraweximite", has(ItemList.itemRawEximite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectraweximite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawGallium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardGallium.get(), 4))
                .unlockedBy("injectrawgallium", has(ItemList.itemRawGallium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawgallium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawHaderoth), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardHaderoth.get(), 4))
                .unlockedBy("injectrawhaderoth", has(ItemList.itemRawHaderoth.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawhaderoth"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawHepatizon), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardHepatizon.get(), 4))
                .unlockedBy("injectrawhepatizon", has(ItemList.itemRawHepatizon.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawhepatizon"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawIgnatius), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardIgnatius.get(), 4))
                .unlockedBy("injectrawignatius", has(ItemList.itemRawIgnatius.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawignatius"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawIndium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardIndium.get(), 4))
                .unlockedBy("injectrawindium", has(ItemList.itemRawIndium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawindium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawInfuscolium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardInfuscolium.get(), 4))
                .unlockedBy("injectrawinfuscolium", has(ItemList.itemRawInfuscolium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawinfuscolium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawInolashite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardInolashite.get(), 4))
                .unlockedBy("injectrawinolashite", has(ItemList.itemRawInolashite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawinolashite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawIridium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardIridium.get(), 4))
                .unlockedBy("injectrawiridium", has(ItemList.itemRawIridium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawiridium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawKalendrite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardKalendrite.get(), 4))
                .unlockedBy("injectrawkalendrite", has(ItemList.itemRawKalendrite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawkalendrite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawLead), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardLead.get(), 4))
                .unlockedBy("injectrawlead", has(ItemList.itemRawLead.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawlead"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawLemurite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardLemurite.get(), 4))
                .unlockedBy("injectrawlemurite", has(ItemList.itemRawLemurite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawlemurite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawManganese), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardManganese.get(), 4))
                .unlockedBy("injectrawmanganese", has(ItemList.itemRawManganese.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawmanganese"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawMeutoite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardMeutoite.get(), 4))
                .unlockedBy("injectrawmeutoite", has(ItemList.itemRawMeutoite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawmeutoite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawMidasium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardMidasium.get(), 4))
                .unlockedBy("injectrawmidasium", has(ItemList.itemRawMidasium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawmidasium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawMithril), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardMithril.get(), 4))
                .unlockedBy("injectrawmithril", has(ItemList.itemRawMithril.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawmithril"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawMolybdenum), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardMolybdenum.get(), 4))
                .unlockedBy("injectrawmolybdenum", has(ItemList.itemRawMolybdenum.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawmolybdenum"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawNeodymium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardNeodymium.get(), 4))
                .unlockedBy("injectrawneodymium", has(ItemList.itemRawNeodymium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawneodymium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawNeptunium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardNeptunium.get(), 4))
                .unlockedBy("injectrawneptunium", has(ItemList.itemRawNeptunium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawneptunium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawNickel), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardNickel.get(), 4))
                .unlockedBy("injectrawnickel", has(ItemList.itemRawNickel.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawnickel"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawNiobium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardNiobium.get(), 4))
                .unlockedBy("injectrawniobium", has(ItemList.itemRawNiobium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawniobium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawOrichalcum), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardOrichalcum.get(), 4))
                .unlockedBy("injectraworichalcum", has(ItemList.itemRawOrichalcum.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectraworichalcum"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawOsmium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardOsmium.get(), 4))
                .unlockedBy("injectrawosmium", has(ItemList.itemRawOsmium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawosmium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawOureclase), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardOureclase.get(), 4))
                .unlockedBy("injectrawoureclase", has(ItemList.itemRawOureclase.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawoureclase"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawPalladium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardPalladium.get(), 4))
                .unlockedBy("injectrawpalladium", has(ItemList.itemRawPalladium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawpalladium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawPlatinum), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardPlatinum.get(), 4))
                .unlockedBy("injectrawplatinum", has(ItemList.itemRawPlatinum.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawplatinum"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawPlutonium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardPlutonium.get(), 4))
                .unlockedBy("injectrawplutonium", has(ItemList.itemRawPlutonium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawplutonium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawPolonium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardPolonium.get(), 4))
                .unlockedBy("injectrawpolonium", has(ItemList.itemRawPolonium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawpolonium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawPromethium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardPromethium.get(), 4))
                .unlockedBy("injectrawpromethium", has(ItemList.itemRawPromethium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawpromethium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawRhenium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardRhenium.get(), 4))
                .unlockedBy("injectrawrhenium", has(ItemList.itemRawRhenium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawrhenium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawRhodium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardRhodium.get(), 4))
                .unlockedBy("injectrawrhodium", has(ItemList.itemRawRhodium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawrhodium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawRubracium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardRubracium.get(), 4))
                .unlockedBy("injectrawrubracium", has(ItemList.itemRawRubracium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawrubracium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawRuthenium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardRuthenium.get(), 4))
                .unlockedBy("injectrawruthenium", has(ItemList.itemRawRuthenium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawruthenium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawSanguinite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardSanguinite.get(), 4))
                .unlockedBy("injectrawsanguinite", has(ItemList.itemRawSanguinite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawsanguinite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawShadowIron), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardShadowIron.get(), 4))
                .unlockedBy("injectrawshadowiron", has(ItemList.itemRawShadowIron.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawshadowiron"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawSilver), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardSilver.get(), 4))
                .unlockedBy("injectrawsilver", has(ItemList.itemRawSilver.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawsilver"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawTantalum), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardTantalum.get(), 4))
                .unlockedBy("injectrawtantalum", has(ItemList.itemRawTantalum.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawtantalum"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawTartarite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardTartarite.get(), 4))
                .unlockedBy("injectrawtartarite", has(ItemList.itemRawTartarite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawtartarite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawTechnetium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardTechnetium.get(), 4))
                .unlockedBy("injectrawtechnetium", has(ItemList.itemRawTechnetium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawtechnetium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawThallium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardThallium.get(), 4))
                .unlockedBy("injectrawthallium", has(ItemList.itemRawThallium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawthallium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawTin), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardTin.get(), 4))
                .unlockedBy("injectrawtin", has(ItemList.itemRawTin.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawtin"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawTitanium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardTitanium.get(), 4))
                .unlockedBy("injectrawtitanium", has(ItemList.itemRawTitanium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawtitanium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawTritium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardTritium.get(), 4))
                .unlockedBy("injectrawtritium", has(ItemList.itemRawTritium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawtritium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawTungsten), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardTungsten.get(), 4))
                .unlockedBy("injectrawtungsten", has(ItemList.itemRawTungsten.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawtungsten"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawUnobtainium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardUnobtainium.get(), 4))
                .unlockedBy("injectrawunobtainium", has(ItemList.itemRawUnobtainium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawunobtainium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawUranium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardUranium.get(), 4))
                .unlockedBy("injectrawuranium", has(ItemList.itemRawUranium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawuranium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawVanadium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardVanadium.get(), 4))
                .unlockedBy("injectrawvanadium", has(ItemList.itemRawVanadium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawvanadium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawVibranium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardVibranium.get(), 4))
                .unlockedBy("injectrawvibranium", has(ItemList.itemRawVibranium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawvibranium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawVulcanite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardVulcanite.get(), 4))
                .unlockedBy("injectrawvulcanite", has(ItemList.itemRawVulcanite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawvulcanite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawVyroxeres), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardVyroxeres.get(), 4))
                .unlockedBy("injectrawvyroxeres", has(ItemList.itemRawVyroxeres.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawvyroxeres"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawYellorite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardYellorite.get(), 4))
                .unlockedBy("injectrawyellorite", has(ItemList.itemRawYellorite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawyellorite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawZinc), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardZinc.get(), 4))
                .unlockedBy("injectrawzinc", has(ItemList.itemRawZinc.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawzinc"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawZirconium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardZirconium.get(), 4))
                .unlockedBy("injectrawzirconium", has(ItemList.itemRawZirconium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawzirconium"));
    }

    protected void buildMekanismPurifying(RecipeOutput consumer)
    {
        //Ore
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreAdamantine), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAdamantine.get(), 3))
                .unlockedBy("purifyadamantineore", has(BlockList.blockOreAdamantine.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyadamantineore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreAldourite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAldourite.get(), 3))
                .unlockedBy("purifyaldouriteore", has(BlockList.blockOreAldourite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyaldouriteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreAluminum), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAluminum.get(), 3))
                .unlockedBy("purifyaluminumore", has(BlockList.blockOreAluminum.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyaluminumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreAmericium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAmericium.get(), 3))
                .unlockedBy("purifyamericiumore", has(BlockList.blockOreAmericium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyamericiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreAmordrine), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAmordrine.get(), 3))
                .unlockedBy("purifyamordrineore", has(BlockList.blockOreAmordrine.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyamordrineore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreAngmallen), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAngmallen.get(), 3))
                .unlockedBy("purifyangmallenore", has(BlockList.blockOreAngmallen.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyangmallenore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreAstralSilver), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAstralSilver.get(), 3))
                .unlockedBy("purifyastralsilverore", has(BlockList.blockOreAstralSilver.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyastralsilverore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreAtlarus), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAtlarus.get(), 3))
                .unlockedBy("purifyatlarusore", has(BlockList.blockOreAtlarus.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyatlarusore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreAzureSilver),GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1),new ItemStack(ItemList.itemClumpAzureSilver.get(),3))
                .unlockedBy("purifyazuresilverore",has(BlockList.blockOreAzureSilver.get()))
                .build(consumer,ResourceLocation.parse("extraores:purifyazuresilverore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreBismuth), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpBismuth.get(), 3))
                .unlockedBy("purifybismuthore", has(BlockList.blockOreBismuth.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifybismuthore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreBlackSteel), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpBlackSteel.get(), 3))
                .unlockedBy("purifyblacksteelore", has(BlockList.blockOreBlackSteel.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyblacksteelore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreCadmium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCadmium.get(), 3))
                .unlockedBy("purifycadmiumore", has(BlockList.blockOreCadmium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifycadmiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreCarmot), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCarmot.get(), 3))
                .unlockedBy("purifycarmotore", has(BlockList.blockOreCarmot.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifycarmotore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreCelenegil), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCelenegil.get(), 3))
                .unlockedBy("purifycelenegilore", has(BlockList.blockOreCelenegil.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifycelenegilore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreCeruclase), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCeruclase.get(), 3))
                .unlockedBy("purifyceruclaseore", has(BlockList.blockOreCeruclase.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyceruclaseore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreChromium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpChromium.get(), 3))
                .unlockedBy("purifychromiumore", has(BlockList.blockOreChromium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifychromiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreCobalt), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCobalt.get(), 3))
                .unlockedBy("purifycobaltore", has(BlockList.blockOreCobalt.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifycobaltore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreCopper), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCopper.get(), 3))
                .unlockedBy("purifycopperore", has(BlockList.blockOreCopper.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifycopperore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreCrimsonSteel), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCrimsonSteel.get(), 3))
                .unlockedBy("purifycrimsonsteelore", has(BlockList.blockOreCrimsonSteel.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifycrimsonsteelore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreDeepIron), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpDeepIron.get(), 3))
                .unlockedBy("purifydeepironore", has(BlockList.blockOreDeepIron.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifydeepironore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreDesichalkos), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpDesichalkos.get(), 3))
                .unlockedBy("purifydesichalkosore", has(BlockList.blockOreDesichalkos.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifydesichalkosore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreEximite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpEximite.get(), 3))
                .unlockedBy("purifyeximiteore", has(BlockList.blockOreEximite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyeximiteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreGallium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpGallium.get(), 3))
                .unlockedBy("purifygalliumore", has(BlockList.blockOreGallium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifygalliumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreHaderoth), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpHaderoth.get(), 3))
                .unlockedBy("purifyhaderothore", has(BlockList.blockOreHaderoth.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyhaderothore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreHepatizon), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpHepatizon.get(), 3))
                .unlockedBy("purifyhepatizonore", has(BlockList.blockOreHepatizon.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyhepatizonore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreIgnatius), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpIgnatius.get(), 3))
                .unlockedBy("purifyignatiusore", has(BlockList.blockOreIgnatius.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyignatiusore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreIndium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpIndium.get(), 3))
                .unlockedBy("purifyindiumore", has(BlockList.blockOreIndium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyindiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreInfuscolium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpInfuscolium.get(), 3))
                .unlockedBy("purifyinfuscoliumore", has(BlockList.blockOreInfuscolium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyinfuscoliumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreInolashite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpInolashite.get(), 3))
                .unlockedBy("purifyinolashiteore", has(BlockList.blockOreInolashite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyinolashiteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreIridium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpIridium.get(), 3))
                .unlockedBy("purifyiridiumore", has(BlockList.blockOreIridium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyiridiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreKalendrite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpKalendrite.get(), 3))
                .unlockedBy("purifykalendriteore", has(BlockList.blockOreKalendrite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifykalendriteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreLead), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpLead.get(), 3))
                .unlockedBy("purifyleadore", has(BlockList.blockOreLead.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyleadore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreLemurite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpLemurite.get(), 3))
                .unlockedBy("purifylemuriteore", has(BlockList.blockOreLemurite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifylemuriteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreManganese), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpManganese.get(), 3))
                .unlockedBy("purifymanganeseore", has(BlockList.blockOreManganese.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifymanganeseore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreMeutoite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpMeutoite.get(), 3))
                .unlockedBy("purifymeutoiteore", has(BlockList.blockOreMeutoite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifymeutoiteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreMidasium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpMidasium.get(), 3))
                .unlockedBy("purifymidasiumore", has(BlockList.blockOreMidasium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifymidasiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreMithril), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpMithril.get(), 3))
                .unlockedBy("purifymithrilore", has(BlockList.blockOreMithril.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifymithrilore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreMolybdenum), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpMolybdenum.get(), 3))
                .unlockedBy("purifymolybdenumore", has(BlockList.blockOreMolybdenum.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifymolybdenumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreNeodymium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpNeodymium.get(), 3))
                .unlockedBy("purifyneodymiumore", has(BlockList.blockOreNeodymium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyneodymiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreNeptunium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpNeptunium.get(), 3))
                .unlockedBy("purifyneptuniumore", has(BlockList.blockOreNeptunium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyneptuniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreNickel), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpNickel.get(), 3))
                .unlockedBy("purifynickelore", has(BlockList.blockOreNickel.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifynickelore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreNiobium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpNiobium.get(), 3))
                .unlockedBy("purifyniobiumore", has(BlockList.blockOreNiobium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyniobiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreOrichalcum), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpOrichalcum.get(), 3))
                .unlockedBy("purifyorichalcumore", has(BlockList.blockOreOrichalcum.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyorichalcumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreOsmium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpOsmium.get(), 3))
                .unlockedBy("purifyosmiumore", has(BlockList.blockOreOsmium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyosmiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreOureclase), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpOureclase.get(), 3))
                .unlockedBy("purifyoureclaseore", has(BlockList.blockOreOureclase.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyoureclaseore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.orePalladium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpPalladium.get(), 3))
                .unlockedBy("purifypalladiumore", has(BlockList.blockOrePalladium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifypalladiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.orePlatinum), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpPlatinum.get(), 3))
                .unlockedBy("purifyplatinumore", has(BlockList.blockOrePlatinum.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyplatinumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.orePlutonium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpPlutonium.get(), 3))
                .unlockedBy("purifyplutoniumore", has(BlockList.blockOrePlutonium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyplutoniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.orePolonium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpPolonium.get(), 3))
                .unlockedBy("purifypoloniumore", has(BlockList.blockOrePolonium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifypoloniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.orePromethium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpPromethium.get(), 3))
                .unlockedBy("purifypromethiumore", has(BlockList.blockOrePromethium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifypromethiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreRhenium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpRhenium.get(), 3))
                .unlockedBy("purifyrheniumore", has(BlockList.blockOreRhenium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrheniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreRhodium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpRhodium.get(), 3))
                .unlockedBy("purifyrhodiumore", has(BlockList.blockOreRhodium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrhodiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreRubracium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpRubracium.get(), 3))
                .unlockedBy("purifyrubraciumore", has(BlockList.blockOreRubracium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrubraciumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreRuthenium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpRuthenium.get(), 3))
                .unlockedBy("purifyrutheniumore", has(BlockList.blockOreRuthenium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrutheniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreSanguinite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpSanguinite.get(), 3))
                .unlockedBy("purifysanguiniteore", has(BlockList.blockOreSanguinite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifysanguiniteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreShadowIron), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpShadowIron.get(), 3))
                .unlockedBy("purifyshadowironore", has(BlockList.blockOreShadowIron.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyshadowironore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreSilver), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpSilver.get(), 3))
                .unlockedBy("purifysilverore", has(BlockList.blockOreSilver.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifysilverore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreTantalum), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTantalum.get(), 3))
                .unlockedBy("purifytantalumore", has(BlockList.blockOreTantalum.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifytantalumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreTartarite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTartarite.get(), 3))
                .unlockedBy("purifytartariteore", has(BlockList.blockOreTartarite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifytartariteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreTechnetium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTechnetium.get(), 3))
                .unlockedBy("purifytechnetiumore", has(BlockList.blockOreTechnetium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifytechnetiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreThallium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpThallium.get(), 3))
                .unlockedBy("purifythalliumore", has(BlockList.blockOreThallium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifythalliumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreTin), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTin.get(), 3))
                .unlockedBy("purifytinore", has(BlockList.blockOreTin.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifytinore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreTitanium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTitanium.get(), 3))
                .unlockedBy("purifytitaniumore", has(BlockList.blockOreTitanium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifytitaniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreTritium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTritium.get(), 3))
                .unlockedBy("purifytritiumore", has(BlockList.blockOreTritium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifytritiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreTungsten), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTungsten.get(), 3))
                .unlockedBy("purifytungstenore", has(BlockList.blockOreTungsten.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifytungstenore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreUnobtainium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpUnobtainium.get(), 3))
                .unlockedBy("purifyunobtainiumore", has(BlockList.blockOreUnobtainium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyunobtainiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreUranium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpUranium.get(), 3))
                .unlockedBy("purifyuraniumore", has(BlockList.blockOreUranium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyuraniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreVanadium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpVanadium.get(), 3))
                .unlockedBy("purifyvanadiumore", has(BlockList.blockOreVanadium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyvanadiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreVibranium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpVibranium.get(), 3))
                .unlockedBy("purifyvibraniumore", has(BlockList.blockOreVibranium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyvibraniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreVulcanite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpVulcanite.get(), 3))
                .unlockedBy("purifyvulcaniteore", has(BlockList.blockOreVulcanite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyvulcaniteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreVyroxeres), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpVyroxeres.get(), 3))
                .unlockedBy("purifyvyroxeresore", has(BlockList.blockOreVyroxeres.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyvyroxeresore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreYellorite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpYellorite.get(), 3))
                .unlockedBy("purifyyelloriteore", has(BlockList.blockOreYellorite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyyelloriteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreZinc), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpZinc.get(), 3))
                .unlockedBy("purifyzincore", has(BlockList.blockOreZinc.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyzincore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreZirconium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpZirconium.get(), 3))
                .unlockedBy("purifyzirconiumore", has(BlockList.blockOreZirconium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyzirconiumore"));
        //Raw
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawAdamantine), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAdamantine.get(), 3))
                .unlockedBy("purifyrawadamantine", has(ItemList.itemRawAdamantine.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawadamantine"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawAldourite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAldourite.get(), 3))
                .unlockedBy("purifyrawaldourite", has(ItemList.itemRawAldourite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawaldourite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawAluminum), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAluminum.get(), 3))
                .unlockedBy("purifyrawaluminum", has(ItemList.itemRawAluminum.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawaluminum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawAmericium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAmericium.get(), 3))
                .unlockedBy("purifyrawamericium", has(ItemList.itemRawAmericium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawamericium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawAmordrine), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAmordrine.get(), 3))
                .unlockedBy("purifyrawamordrine", has(ItemList.itemRawAmordrine.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawamordrine"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawAngmallen), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAngmallen.get(), 3))
                .unlockedBy("purifyrawangmallen", has(ItemList.itemRawAngmallen.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawangmallen"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawAstralSilver), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAstralSilver.get(), 3))
                .unlockedBy("purifyrawastralsilver", has(ItemList.itemRawAstralSilver.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawastralsilver"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawAzureSilver),GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1),new ItemStack(ItemList.itemClumpAzureSilver.get(),3))
                .unlockedBy("purifyrawazuresilver",has(ItemList.itemRawAzureSilver.get()))
                .build(consumer,ResourceLocation.parse("extraores:purifyrawazuresilver"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawAtlarus), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAtlarus.get(), 3))
                .unlockedBy("purifyrawatlarus", has(ItemList.itemRawAtlarus.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawatlarus"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawBismuth), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpBismuth.get(), 3))
                .unlockedBy("purifyrawbismuth", has(ItemList.itemRawBismuth.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawbismuth"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawBlackSteel), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpBlackSteel.get(), 3))
                .unlockedBy("purifyrawblacksteel", has(ItemList.itemRawBlackSteel.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawblacksteel"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawCadmium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCadmium.get(), 3))
                .unlockedBy("purifyrawcadmium", has(ItemList.itemRawCadmium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawcadmium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawCarmot), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCarmot.get(), 3))
                .unlockedBy("purifyrawcarmot", has(ItemList.itemRawCarmot.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawcarmot"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawCelenegil), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCelenegil.get(), 3))
                .unlockedBy("purifyrawcelenegil", has(ItemList.itemRawCelenegil.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawcelenegil"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawCeruclase), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCeruclase.get(), 3))
                .unlockedBy("purifyrawceruclase", has(ItemList.itemRawCeruclase.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawceruclase"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawChromium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpChromium.get(), 3))
                .unlockedBy("purifyrawchromium", has(ItemList.itemRawChromium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawchromium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawCobalt), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCobalt.get(), 3))
                .unlockedBy("purifyrawcobalt", has(ItemList.itemRawCobalt.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawcobalt"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawCopper), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCopper.get(), 3))
                .unlockedBy("purifyrawcopper", has(ItemList.itemRawCopper.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawcopper"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawCrimsonSteel), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCrimsonSteel.get(), 3))
                .unlockedBy("purifyrawcrimsonsteel", has(ItemList.itemRawCrimsonSteel.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawcrimsonsteel"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawDeepIron), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpDeepIron.get(), 3))
                .unlockedBy("purifyrawdeepiron", has(ItemList.itemRawDeepIron.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawdeepiron"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawDesichalkos), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpDesichalkos.get(), 3))
                .unlockedBy("purifyrawdesichalkos", has(ItemList.itemRawDesichalkos.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawdesichalkos"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawEximite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpEximite.get(), 3))
                .unlockedBy("purifyraweximite", has(ItemList.itemRawEximite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyraweximite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawGallium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpGallium.get(), 3))
                .unlockedBy("purifyrawgallium", has(ItemList.itemRawGallium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawgallium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawHaderoth), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpHaderoth.get(), 3))
                .unlockedBy("purifyrawhaderoth", has(ItemList.itemRawHaderoth.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawhaderoth"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawHepatizon), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpHepatizon.get(), 3))
                .unlockedBy("purifyrawhepatizon", has(ItemList.itemRawHepatizon.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawhepatizon"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawIgnatius), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpIgnatius.get(), 3))
                .unlockedBy("purifyrawignatius", has(ItemList.itemRawIgnatius.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawignatius"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawIndium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpIndium.get(), 3))
                .unlockedBy("purifyrawindium", has(ItemList.itemRawIndium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawindium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawInfuscolium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpInfuscolium.get(), 3))
                .unlockedBy("purifyrawinfuscolium", has(ItemList.itemRawInfuscolium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawinfuscolium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawInolashite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpInolashite.get(), 3))
                .unlockedBy("purifyrawinolashite", has(ItemList.itemRawInolashite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawinolashite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawIridium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpIridium.get(), 3))
                .unlockedBy("purifyrawiridium", has(ItemList.itemRawIridium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawiridium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawKalendrite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpKalendrite.get(), 3))
                .unlockedBy("purifyrawkalendrite", has(ItemList.itemRawKalendrite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawkalendrite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawLead), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpLead.get(), 3))
                .unlockedBy("purifyrawlead", has(ItemList.itemRawLead.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawlead"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawLemurite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpLemurite.get(), 3))
                .unlockedBy("purifyrawlemurite", has(ItemList.itemRawLemurite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawlemurite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawManganese), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpManganese.get(), 3))
                .unlockedBy("purifyrawmanganese", has(ItemList.itemRawManganese.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawmanganese"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawMeutoite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpMeutoite.get(), 3))
                .unlockedBy("purifyrawmeutoite", has(ItemList.itemRawMeutoite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawmeutoite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawMidasium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpMidasium.get(), 3))
                .unlockedBy("purifyrawmidasium", has(ItemList.itemRawMidasium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawmidasium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawMithril), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpMithril.get(), 3))
                .unlockedBy("purifyrawmithril", has(ItemList.itemRawMithril.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawmithril"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawMolybdenum), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpMolybdenum.get(), 3))
                .unlockedBy("purifyrawmolybdenum", has(ItemList.itemRawMolybdenum.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawmolybdenum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawNeodymium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpNeodymium.get(), 3))
                .unlockedBy("purifyrawneodymium", has(ItemList.itemRawNeodymium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawneodymium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawNeptunium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpNeptunium.get(), 3))
                .unlockedBy("purifyrawneptunium", has(ItemList.itemRawNeptunium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawneptunium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawNickel), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpNickel.get(), 3))
                .unlockedBy("purifyrawnickel", has(ItemList.itemRawNickel.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawnickel"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawNiobium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpNiobium.get(), 3))
                .unlockedBy("purifyrawniobium", has(ItemList.itemRawNiobium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawniobium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawOrichalcum), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpOrichalcum.get(), 3))
                .unlockedBy("purifyraworichalcum", has(ItemList.itemRawOrichalcum.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyraworichalcum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawOsmium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpOsmium.get(), 3))
                .unlockedBy("purifyrawosmium", has(ItemList.itemRawOsmium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawosmium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawOureclase), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpOureclase.get(), 3))
                .unlockedBy("purifyrawoureclase", has(ItemList.itemRawOureclase.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawoureclase"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawPalladium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpPalladium.get(), 3))
                .unlockedBy("purifyrawpalladium", has(ItemList.itemRawPalladium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawpalladium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawPlatinum), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpPlatinum.get(), 3))
                .unlockedBy("purifyrawplatinum", has(ItemList.itemRawPlatinum.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawplatinum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawPlutonium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpPlutonium.get(), 3))
                .unlockedBy("purifyrawplutonium", has(ItemList.itemRawPlutonium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawplutonium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawPolonium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpPolonium.get(), 3))
                .unlockedBy("purifyrawpolonium", has(ItemList.itemRawPolonium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawpolonium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawPromethium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpPromethium.get(), 3))
                .unlockedBy("purifyrawpromethium", has(ItemList.itemRawPromethium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawpromethium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawRhenium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpRhenium.get(), 3))
                .unlockedBy("purifyrawrhenium", has(ItemList.itemRawRhenium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawrhenium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawRhodium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpRhodium.get(), 3))
                .unlockedBy("purifyrawrhodium", has(ItemList.itemRawRhodium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawrhodium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawRubracium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpRubracium.get(), 3))
                .unlockedBy("purifyrawrubracium", has(ItemList.itemRawRubracium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawrubracium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawRuthenium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpRuthenium.get(), 3))
                .unlockedBy("purifyrawruthenium", has(ItemList.itemRawRuthenium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawruthenium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawSanguinite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpSanguinite.get(), 3))
                .unlockedBy("purifyrawsanguinite", has(ItemList.itemRawSanguinite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawsanguinite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawShadowIron), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpShadowIron.get(), 3))
                .unlockedBy("purifyrawshadowiron", has(ItemList.itemRawShadowIron.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawshadowiron"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawSilver), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpSilver.get(), 3))
                .unlockedBy("purifyrawsilver", has(ItemList.itemRawSilver.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawsilver"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawTantalum), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTantalum.get(), 3))
                .unlockedBy("purifyrawtantalum", has(ItemList.itemRawTantalum.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawtantalum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawTartarite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTartarite.get(), 3))
                .unlockedBy("purifyrawtartarite", has(ItemList.itemRawTartarite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawtartarite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawTechnetium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTechnetium.get(), 3))
                .unlockedBy("purifyrawtechnetium", has(ItemList.itemRawTechnetium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawtechnetium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawThallium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpThallium.get(), 3))
                .unlockedBy("purifyrawthallium", has(ItemList.itemRawThallium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawthallium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawTin), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTin.get(), 3))
                .unlockedBy("purifyrawtin", has(ItemList.itemRawTin.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawtin"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawTitanium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTitanium.get(), 3))
                .unlockedBy("purifyrawtitanium", has(ItemList.itemRawTitanium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawtitanium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawTritium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTritium.get(), 3))
                .unlockedBy("purifyrawtritium", has(ItemList.itemRawTritium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawtritium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawTungsten), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTungsten.get(), 3))
                .unlockedBy("purifyrawtungsten", has(ItemList.itemRawTungsten.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawtungsten"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawUnobtainium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpUnobtainium.get(), 3))
                .unlockedBy("purifyrawunobtainium", has(ItemList.itemRawUnobtainium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawunobtainium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawUranium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpUranium.get(), 3))
                .unlockedBy("purifyrawuranium", has(ItemList.itemRawUranium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawuranium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawVanadium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpVanadium.get(), 3))
                .unlockedBy("purifyrawvanadium", has(ItemList.itemRawVanadium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawvanadium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawVibranium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpVibranium.get(), 3))
                .unlockedBy("purifyrawvibranium", has(ItemList.itemRawVibranium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawvibranium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawVulcanite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpVulcanite.get(), 3))
                .unlockedBy("purifyrawvulcanite", has(ItemList.itemRawVulcanite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawvulcanite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawVyroxeres), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpVyroxeres.get(), 3))
                .unlockedBy("purifyrawvyroxeres", has(ItemList.itemRawVyroxeres.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawvyroxeres"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawYellorite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpYellorite.get(), 3))
                .unlockedBy("purifyrawyellorite", has(ItemList.itemRawYellorite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawyellorite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawZinc), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpZinc.get(), 3))
                .unlockedBy("purifyrawzinc", has(ItemList.itemRawZinc.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawzinc"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawZirconium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpZirconium.get(), 3))
                .unlockedBy("purifyrawzirconium", has(ItemList.itemRawZirconium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawzirconium"));
        //Shard
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardAdamantine), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAdamantine.get()))
                .unlockedBy("purifyadamantine", has(ItemList.itemShardAdamantine.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyadamantine"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardAldourite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAldourite.get()))
                .unlockedBy("purifyaldourite", has(ItemList.itemShardAldourite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyaldourite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardAluminum), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAluminum.get()))
                .unlockedBy("purifyaluminum", has(ItemList.itemShardAluminum.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyaluminum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardAmericium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAmericium.get()))
                .unlockedBy("purifyamericium", has(ItemList.itemShardAmericium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyamericium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardAmordrine), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAmordrine.get()))
                .unlockedBy("purifyamordrine", has(ItemList.itemShardAmordrine.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyamordrine"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardAngmallen), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAngmallen.get()))
                .unlockedBy("purifyangmallen", has(ItemList.itemShardAngmallen.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyangmallen"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardAstralSilver), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAstralSilver.get()))
                .unlockedBy("purifyastralsilver", has(ItemList.itemShardAstralSilver.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyastralsilver"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardAtlarus), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAtlarus.get()))
                .unlockedBy("purifyatlarus", has(ItemList.itemShardAtlarus.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyatlarus"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardAzureSilver),GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1),new ItemStack(ItemList.itemClumpAzureSilver.get()))
                .unlockedBy("purifyazuresilver",has(ItemList.itemShardAzureSilver.get()))
                .build(consumer,ResourceLocation.parse("extraores:purifyazuresilver"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardBismuth), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpBismuth.get()))
                .unlockedBy("purifybismuth", has(ItemList.itemShardBismuth.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifybismuth"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardBlackSteel), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpBlackSteel.get()))
                .unlockedBy("purifyblacksteel", has(ItemList.itemShardBlackSteel.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyblacksteel"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardCadmium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCadmium.get()))
                .unlockedBy("purifycadmium", has(ItemList.itemShardCadmium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifycadmium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardCarmot), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCarmot.get()))
                .unlockedBy("purifycarmot", has(ItemList.itemShardCarmot.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifycarmot"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardCelenegil), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCelenegil.get()))
                .unlockedBy("purifycelenegil", has(ItemList.itemShardCelenegil.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifycelenegil"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardCeruclase), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCeruclase.get()))
                .unlockedBy("purifyceruclase", has(ItemList.itemShardCeruclase.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyceruclase"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardChromium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpChromium.get()))
                .unlockedBy("purifychromium", has(ItemList.itemShardChromium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifychromium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardCobalt), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCobalt.get()))
                .unlockedBy("purifycobalt", has(ItemList.itemShardCobalt.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifycobalt"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardCopper), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCopper.get()))
                .unlockedBy("purifycopper", has(ItemList.itemShardCopper.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifycopper"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardCrimsonSteel), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCrimsonSteel.get()))
                .unlockedBy("purifycrimsonsteel", has(ItemList.itemShardCrimsonSteel.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifycrimsonsteel"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardDeepIron), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpDeepIron.get()))
                .unlockedBy("purifydeepiron", has(ItemList.itemShardDeepIron.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifydeepiron"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardDesichalkos), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpDesichalkos.get()))
                .unlockedBy("purifydesichalkos", has(ItemList.itemShardDesichalkos.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifydesichalkos"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardEximite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpEximite.get()))
                .unlockedBy("purifyeximite", has(ItemList.itemShardEximite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyeximite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardGallium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpGallium.get()))
                .unlockedBy("purifygallium", has(ItemList.itemShardGallium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifygallium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardHaderoth), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpHaderoth.get()))
                .unlockedBy("purifyhaderoth", has(ItemList.itemShardHaderoth.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyhaderoth"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardHepatizon), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpHepatizon.get()))
                .unlockedBy("purifyhepatizon", has(ItemList.itemShardHepatizon.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyhepatizon"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardIgnatius), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpIgnatius.get()))
                .unlockedBy("purifyignatius", has(ItemList.itemShardIgnatius.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyignatius"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardIndium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpIndium.get()))
                .unlockedBy("purifyindium", has(ItemList.itemShardIndium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyindium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardInfuscolium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpInfuscolium.get()))
                .unlockedBy("purifyinfuscolium", has(ItemList.itemShardInfuscolium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyinfuscolium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardInolashite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpInolashite.get()))
                .unlockedBy("purifyinolashite", has(ItemList.itemShardInolashite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyinolashite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardIridium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpIridium.get()))
                .unlockedBy("purifyiridium", has(ItemList.itemShardIridium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyiridium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardKalendrite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpKalendrite.get()))
                .unlockedBy("purifykalendrite", has(ItemList.itemShardKalendrite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifykalendrite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardLead), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpLead.get()))
                .unlockedBy("purifylead", has(ItemList.itemShardLead.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifylead"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardLemurite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpLemurite.get()))
                .unlockedBy("purifylemurite", has(ItemList.itemShardLemurite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifylemurite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardManganese), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpManganese.get()))
                .unlockedBy("purifymanganese", has(ItemList.itemShardManganese.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifymanganese"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardMeutoite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpMeutoite.get()))
                .unlockedBy("purifymeutoite", has(ItemList.itemShardMeutoite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifymeutoite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardMidasium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpMidasium.get()))
                .unlockedBy("purifymidasium", has(ItemList.itemShardMidasium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifymidasium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardMithril), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpMithril.get()))
                .unlockedBy("purifymithril", has(ItemList.itemShardMithril.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifymithril"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardMolybdenum), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpMolybdenum.get()))
                .unlockedBy("purifymolybdenum", has(ItemList.itemShardMolybdenum.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifymolybdenum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardNeodymium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpNeodymium.get()))
                .unlockedBy("purifyneodymium", has(ItemList.itemShardNeodymium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyneodymium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardNeptunium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpNeptunium.get()))
                .unlockedBy("purifyneptunium", has(ItemList.itemShardNeptunium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyneptunium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardNickel), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpNickel.get()))
                .unlockedBy("purifynickel", has(ItemList.itemShardNickel.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifynickel"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardNiobium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpNiobium.get()))
                .unlockedBy("purifyniobium", has(ItemList.itemShardNiobium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyniobium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardOrichalcum), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpOrichalcum.get()))
                .unlockedBy("purifyorichalcum", has(ItemList.itemShardOrichalcum.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyorichalcum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardOsmium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpOsmium.get()))
                .unlockedBy("purifyosmium", has(ItemList.itemShardOsmium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyosmium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardOureclase), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpOureclase.get()))
                .unlockedBy("purifyoureclase", has(ItemList.itemShardOureclase.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyoureclase"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardPalladium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpPalladium.get()))
                .unlockedBy("purifypalladium", has(ItemList.itemShardPalladium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifypalladium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardPlatinum), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpPlatinum.get()))
                .unlockedBy("purifyplatinum", has(ItemList.itemShardPlatinum.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyplatinum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardPlutonium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpPlutonium.get()))
                .unlockedBy("purifyplutonium", has(ItemList.itemShardPlutonium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyplutonium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardPolonium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpPolonium.get()))
                .unlockedBy("purifypolonium", has(ItemList.itemShardPolonium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifypolonium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardPromethium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpPromethium.get()))
                .unlockedBy("purifypromethium", has(ItemList.itemShardPromethium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifypromethium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardRhenium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpRhenium.get()))
                .unlockedBy("purifyrhenium", has(ItemList.itemShardRhenium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrhenium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardRhodium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpRhodium.get()))
                .unlockedBy("purifyrhodium", has(ItemList.itemShardRhodium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrhodium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardRubracium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpRubracium.get()))
                .unlockedBy("purifyrubracium", has(ItemList.itemShardRubracium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrubracium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardRuthenium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpRuthenium.get()))
                .unlockedBy("purifyruthenium", has(ItemList.itemShardRuthenium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyruthenium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardSanguinite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpSanguinite.get()))
                .unlockedBy("purifysanguinite", has(ItemList.itemShardSanguinite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifysanguinite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardShadowIron), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpShadowIron.get()))
                .unlockedBy("purifyshadowiron", has(ItemList.itemShardShadowIron.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyshadowiron"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardSilver), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpSilver.get()))
                .unlockedBy("purifysilver", has(ItemList.itemShardSilver.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifysilver"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardTantalum), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTantalum.get()))
                .unlockedBy("purifytantalum", has(ItemList.itemShardTantalum.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifytantalum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardTartarite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTartarite.get()))
                .unlockedBy("purifytartarite", has(ItemList.itemShardTartarite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifytartarite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardTechnetium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTechnetium.get()))
                .unlockedBy("purifytechnetium", has(ItemList.itemShardTechnetium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifytechnetium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardThallium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpThallium.get()))
                .unlockedBy("purifythallium", has(ItemList.itemShardThallium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifythallium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardTin), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTin.get()))
                .unlockedBy("purifytin", has(ItemList.itemShardTin.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifytin"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardTitanium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTitanium.get()))
                .unlockedBy("purifytitanium", has(ItemList.itemShardTitanium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifytitanium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardTritium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTritium.get()))
                .unlockedBy("purifytritium", has(ItemList.itemShardTritium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifytritium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardTungsten), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTungsten.get()))
                .unlockedBy("purifytungsten", has(ItemList.itemShardTungsten.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifytungsten"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardUnobtainium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpUnobtainium.get()))
                .unlockedBy("purifyunobtainium", has(ItemList.itemShardUnobtainium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyunobtainium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardUranium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpUranium.get()))
                .unlockedBy("purifyuranium", has(ItemList.itemShardUranium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyuranium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardVanadium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpVanadium.get()))
                .unlockedBy("purifyvanadium", has(ItemList.itemShardVanadium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyvanadium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardVibranium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpVibranium.get()))
                .unlockedBy("purifyvibranium", has(ItemList.itemShardVibranium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyvibranium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardVulcanite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpVulcanite.get()))
                .unlockedBy("purifyvulcanite", has(ItemList.itemShardVulcanite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyvulcanite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardVyroxeres), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpVyroxeres.get()))
                .unlockedBy("purifyvyroxeres", has(ItemList.itemShardVyroxeres.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyvyroxeres"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardYellorite), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpYellorite.get()))
                .unlockedBy("purifyyellorite", has(ItemList.itemShardYellorite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyyellorite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardZinc), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpZinc.get()))
                .unlockedBy("purifyzinc", has(ItemList.itemShardZinc.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyzinc"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardZirconium), GasStackIngredient.of(IngredientCreatorAccess.gas().of(MekanismAPI.GAS_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpZirconium.get()))
                .unlockedBy("purifyzirconium", has(ItemList.itemShardZirconium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyzirconium"));
    }

    protected void buildMekanismCrushing(RecipeOutput consumer)
    {
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpAdamantine), new ItemStack(ItemList.itemDirtyDustAdamantine.get()))
                .unlockedBy("crushadamantine", has(ItemList.itemClumpAdamantine.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushadamantine"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpAldourite), new ItemStack(ItemList.itemDirtyDustAldourite.get()))
                .unlockedBy("crushaldourite", has(ItemList.itemClumpAldourite.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushaldourite"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpAluminum), new ItemStack(ItemList.itemDirtyDustAluminum.get()))
                .unlockedBy("crushaluminum", has(ItemList.itemClumpAluminum.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushaluminum"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpAmericium), new ItemStack(ItemList.itemDirtyDustAmericium.get()))
                .unlockedBy("crushamericium", has(ItemList.itemClumpAmericium.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushamericium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpAmordrine), new ItemStack(ItemList.itemDirtyDustAmordrine.get()))
                .unlockedBy("crushamordrine", has(ItemList.itemClumpAmordrine.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushamordrine"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpAngmallen), new ItemStack(ItemList.itemDirtyDustAngmallen.get()))
                .unlockedBy("crushangmallen", has(ItemList.itemClumpAngmallen.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushangmallen"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpAstralSilver), new ItemStack(ItemList.itemDirtyDustAstralSilver.get()))
                .unlockedBy("crushastralsilver", has(ItemList.itemClumpAstralSilver.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushastralsilver"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpAtlarus), new ItemStack(ItemList.itemDirtyDustAtlarus.get()))
                .unlockedBy("crushatlarus", has(ItemList.itemClumpAtlarus.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushatlarus"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpAzureSilver),new ItemStack(ItemList.itemDirtyDustAzureSilver.get()))
                .unlockedBy("crushazuresilver",has(ItemList.itemClumpAzureSilver.get()))
                .build(consumer,ResourceLocation.parse("extraores:crushazuresilver"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpBismuth), new ItemStack(ItemList.itemDirtyDustBismuth.get()))
                .unlockedBy("crushbismuth", has(ItemList.itemClumpBismuth.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushbismuth"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpBlackSteel), new ItemStack(ItemList.itemDirtyDustBlackSteel.get()))
                .unlockedBy("crushblacksteel", has(ItemList.itemClumpBlackSteel.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushblacksteel"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpCadmium), new ItemStack(ItemList.itemDirtyDustCadmium.get()))
                .unlockedBy("crushcadmium", has(ItemList.itemClumpCadmium.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushcadmium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpCarmot), new ItemStack(ItemList.itemDirtyDustCarmot.get()))
                .unlockedBy("crushcarmot", has(ItemList.itemClumpCarmot.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushcarmot"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpCelenegil), new ItemStack(ItemList.itemDirtyDustCelenegil.get()))
                .unlockedBy("crushcelenegil", has(ItemList.itemClumpCelenegil.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushcelenegil"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpCeruclase), new ItemStack(ItemList.itemDirtyDustCeruclase.get()))
                .unlockedBy("crushceruclase", has(ItemList.itemClumpCeruclase.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushceruclase"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpChromium), new ItemStack(ItemList.itemDirtyDustChromium.get()))
                .unlockedBy("crushchromium", has(ItemList.itemClumpChromium.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushchromium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpCobalt), new ItemStack(ItemList.itemDirtyDustCobalt.get()))
                .unlockedBy("crushcobalt", has(ItemList.itemClumpCobalt.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushcobalt"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpCopper), new ItemStack(ItemList.itemDirtyDustCopper.get()))
                .unlockedBy("crushcopper", has(ItemList.itemClumpCopper.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushcopper"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpCrimsonSteel), new ItemStack(ItemList.itemDirtyDustCrimsonSteel.get()))
                .unlockedBy("crushcrimsonsteel", has(ItemList.itemClumpCrimsonSteel.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushcrimsonsteel"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpDeepIron), new ItemStack(ItemList.itemDirtyDustDeepIron.get()))
                .unlockedBy("crushdeepiron", has(ItemList.itemClumpDeepIron.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushdeepiron"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpDesichalkos), new ItemStack(ItemList.itemDirtyDustDesichalkos.get()))
                .unlockedBy("crushdesichalkos", has(ItemList.itemClumpDesichalkos.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushdesichalkos"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpEximite), new ItemStack(ItemList.itemDirtyDustEximite.get()))
                .unlockedBy("crusheximite", has(ItemList.itemClumpEximite.get()))
                .build(consumer, ResourceLocation.parse("extraores:crusheximite"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpGallium), new ItemStack(ItemList.itemDirtyDustGallium.get()))
                .unlockedBy("crushgallium", has(ItemList.itemClumpGallium.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushgallium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpHaderoth), new ItemStack(ItemList.itemDirtyDustHaderoth.get()))
                .unlockedBy("crushhaderoth", has(ItemList.itemClumpHaderoth.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushhaderoth"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpHepatizon), new ItemStack(ItemList.itemDirtyDustHepatizon.get()))
                .unlockedBy("crushhepatizon", has(ItemList.itemClumpHepatizon.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushhepatizon"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpIgnatius), new ItemStack(ItemList.itemDirtyDustIgnatius.get()))
                .unlockedBy("crushignatius", has(ItemList.itemClumpIgnatius.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushignatius"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpIndium), new ItemStack(ItemList.itemDirtyDustIndium.get()))
                .unlockedBy("crushindium", has(ItemList.itemClumpIndium.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushindium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpInfuscolium), new ItemStack(ItemList.itemDirtyDustInfuscolium.get()))
                .unlockedBy("crushinfuscolium", has(ItemList.itemClumpInfuscolium.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushinfuscolium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpInolashite), new ItemStack(ItemList.itemDirtyDustInolashite.get()))
                .unlockedBy("crushinolashite", has(ItemList.itemClumpInolashite.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushinolashite"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpIridium), new ItemStack(ItemList.itemDirtyDustIridium.get()))
                .unlockedBy("crushiridium", has(ItemList.itemClumpIridium.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushiridium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpKalendrite), new ItemStack(ItemList.itemDirtyDustKalendrite.get()))
                .unlockedBy("crushkalendrite", has(ItemList.itemClumpKalendrite.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushkalendrite"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpLead), new ItemStack(ItemList.itemDirtyDustLead.get()))
                .unlockedBy("crushlead", has(ItemList.itemClumpLead.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushlead"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpLemurite), new ItemStack(ItemList.itemDirtyDustLemurite.get()))
                .unlockedBy("crushlemurite", has(ItemList.itemClumpLemurite.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushlemurite"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpManganese), new ItemStack(ItemList.itemDirtyDustManganese.get()))
                .unlockedBy("crushmanganese", has(ItemList.itemClumpManganese.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushmanganese"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpMeutoite), new ItemStack(ItemList.itemDirtyDustMeutoite.get()))
                .unlockedBy("crushmeutoite", has(ItemList.itemClumpMeutoite.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushmeutoite"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpMidasium), new ItemStack(ItemList.itemDirtyDustMidasium.get()))
                .unlockedBy("crushmidasium", has(ItemList.itemClumpMidasium.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushmidasium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpMithril), new ItemStack(ItemList.itemDirtyDustMithril.get()))
                .unlockedBy("crushmithril", has(ItemList.itemClumpMithril.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushmithril"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpMolybdenum), new ItemStack(ItemList.itemDirtyDustMolybdenum.get()))
                .unlockedBy("crushmolybdenum", has(ItemList.itemClumpMolybdenum.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushmolybdenum"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpNeodymium), new ItemStack(ItemList.itemDirtyDustNeodymium.get()))
                .unlockedBy("crushneodymium", has(ItemList.itemClumpNeodymium.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushneodymium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpNeptunium), new ItemStack(ItemList.itemDirtyDustNeptunium.get()))
                .unlockedBy("crushneptunium", has(ItemList.itemClumpNeptunium.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushneptunium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpNickel), new ItemStack(ItemList.itemDirtyDustNickel.get()))
                .unlockedBy("crushnickel", has(ItemList.itemClumpNickel.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushnickel"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpNiobium), new ItemStack(ItemList.itemDirtyDustNiobium.get()))
                .unlockedBy("crushniobium", has(ItemList.itemClumpNiobium.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushniobium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpOrichalcum), new ItemStack(ItemList.itemDirtyDustOrichalcum.get()))
                .unlockedBy("crushorichalcum", has(ItemList.itemClumpOrichalcum.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushorichalcum"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpOsmium), new ItemStack(ItemList.itemDirtyDustOsmium.get()))
                .unlockedBy("crushosmium", has(ItemList.itemClumpOsmium.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushosmium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpOureclase), new ItemStack(ItemList.itemDirtyDustOureclase.get()))
                .unlockedBy("crushoureclase", has(ItemList.itemClumpOureclase.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushoureclase"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpPalladium), new ItemStack(ItemList.itemDirtyDustPalladium.get()))
                .unlockedBy("crushpalladium", has(ItemList.itemClumpPalladium.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushpalladium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpPlatinum), new ItemStack(ItemList.itemDirtyDustPlatinum.get()))
                .unlockedBy("crushplatinum", has(ItemList.itemClumpPlatinum.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushplatinum"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpPlutonium), new ItemStack(ItemList.itemDirtyDustPlutonium.get()))
                .unlockedBy("crushplutonium", has(ItemList.itemClumpPlutonium.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushplutonium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpPolonium), new ItemStack(ItemList.itemDirtyDustPolonium.get()))
                .unlockedBy("crushpolonium", has(ItemList.itemClumpPolonium.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushpolonium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpPromethium), new ItemStack(ItemList.itemDirtyDustPromethium.get()))
                .unlockedBy("crushpromethium", has(ItemList.itemClumpPromethium.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushpromethium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpRhenium), new ItemStack(ItemList.itemDirtyDustRhenium.get()))
                .unlockedBy("crushrhenium", has(ItemList.itemClumpRhenium.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushrhenium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpRhodium), new ItemStack(ItemList.itemDirtyDustRhodium.get()))
                .unlockedBy("crushrhodium", has(ItemList.itemClumpRhodium.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushrhodium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpRubracium), new ItemStack(ItemList.itemDirtyDustRubracium.get()))
                .unlockedBy("crushrubracium", has(ItemList.itemClumpRubracium.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushrubracium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpRuthenium), new ItemStack(ItemList.itemDirtyDustRuthenium.get()))
                .unlockedBy("crushruthenium", has(ItemList.itemClumpRuthenium.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushruthenium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpSanguinite), new ItemStack(ItemList.itemDirtyDustSanguinite.get()))
                .unlockedBy("crushsanguinite", has(ItemList.itemClumpSanguinite.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushsanguinite"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpShadowIron), new ItemStack(ItemList.itemDirtyDustShadowIron.get()))
                .unlockedBy("crushshadowiron", has(ItemList.itemClumpShadowIron.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushshadowiron"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpSilver), new ItemStack(ItemList.itemDirtyDustSilver.get()))
                .unlockedBy("crushsilver", has(ItemList.itemClumpSilver.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushsilver"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpTantalum), new ItemStack(ItemList.itemDirtyDustTantalum.get()))
                .unlockedBy("crushtantalum", has(ItemList.itemClumpTantalum.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushtantalum"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpTartarite), new ItemStack(ItemList.itemDirtyDustTartarite.get()))
                .unlockedBy("crushtartarite", has(ItemList.itemClumpTartarite.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushtartarite"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpTechnetium), new ItemStack(ItemList.itemDirtyDustTechnetium.get()))
                .unlockedBy("crushtechnetium", has(ItemList.itemClumpTechnetium.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushtechnetium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpThallium), new ItemStack(ItemList.itemDirtyDustThallium.get()))
                .unlockedBy("crushthallium", has(ItemList.itemClumpThallium.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushthallium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpTin), new ItemStack(ItemList.itemDirtyDustTin.get()))
                .unlockedBy("crushtin", has(ItemList.itemClumpTin.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushtin"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpTitanium), new ItemStack(ItemList.itemDirtyDustTitanium.get()))
                .unlockedBy("crushtitanium", has(ItemList.itemClumpTitanium.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushtitanium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpTritium), new ItemStack(ItemList.itemDirtyDustTritium.get()))
                .unlockedBy("crushtritium", has(ItemList.itemClumpTritium.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushtritium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpTungsten), new ItemStack(ItemList.itemDirtyDustTungsten.get()))
                .unlockedBy("crushtungsten", has(ItemList.itemClumpTungsten.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushtungsten"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpUnobtainium), new ItemStack(ItemList.itemDirtyDustUnobtainium.get()))
                .unlockedBy("crushunobtainium", has(ItemList.itemClumpUnobtainium.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushunobtainium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpUranium), new ItemStack(ItemList.itemDirtyDustUranium.get()))
                .unlockedBy("crushuranium", has(ItemList.itemClumpUranium.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushuranium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpVanadium), new ItemStack(ItemList.itemDirtyDustVanadium.get()))
                .unlockedBy("crushvanadium", has(ItemList.itemClumpVanadium.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushvanadium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpVibranium), new ItemStack(ItemList.itemDirtyDustVibranium.get()))
                .unlockedBy("crushvibranium", has(ItemList.itemClumpVibranium.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushvibranium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpVulcanite), new ItemStack(ItemList.itemDirtyDustVulcanite.get()))
                .unlockedBy("crushvulcanite", has(ItemList.itemClumpVulcanite.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushvulcanite"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpVyroxeres), new ItemStack(ItemList.itemDirtyDustVyroxeres.get()))
                .unlockedBy("crushvyroxeres", has(ItemList.itemClumpVyroxeres.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushvyroxeres"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpYellorite), new ItemStack(ItemList.itemDirtyDustYellorite.get()))
                .unlockedBy("crushyellorite", has(ItemList.itemClumpYellorite.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushyellorite"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpZinc), new ItemStack(ItemList.itemDirtyDustZinc.get()))
                .unlockedBy("crushzinc", has(ItemList.itemClumpZinc.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushzinc"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpZirconium), new ItemStack(ItemList.itemDirtyDustZirconium.get()))
                .unlockedBy("crushzirconium", has(ItemList.itemClumpZirconium.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushzirconium"));
    }

    protected void buildMekanismEnriching(RecipeOutput consumer)
    {
        //Ore
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreAdamantine), new ItemStack(ItemList.itemDustAdamantine.get(), 2))
                .unlockedBy("enrichadamantineore", has(BlockList.blockOreAdamantine.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichadamantineore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreAldourite), new ItemStack(ItemList.itemDustAldourite.get(), 2))
                .unlockedBy("enrichaldouriteore", has(BlockList.blockOreAldourite.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichaldouriteore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreAluminum), new ItemStack(ItemList.itemDustAluminum.get(), 2))
                .unlockedBy("enrichaluminumore", has(BlockList.blockOreAluminum.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichaluminumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreAmericium), new ItemStack(ItemList.itemDustAmericium.get(), 2))
                .unlockedBy("enrichamericiumore", has(BlockList.blockOreAmericium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichamericiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreAmordrine), new ItemStack(ItemList.itemDustAmordrine.get(), 2))
                .unlockedBy("enrichamordrineore", has(BlockList.blockOreAmordrine.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichamordrineore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreAngmallen), new ItemStack(ItemList.itemDustAngmallen.get(), 2))
                .unlockedBy("enrichangmallenore", has(BlockList.blockOreAngmallen.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichangmallenore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreAstralSilver), new ItemStack(ItemList.itemDustAstralSilver.get(), 2))
                .unlockedBy("enrichastralsilverore", has(BlockList.blockOreAstralSilver.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichastralsilverore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreAzureSilver),new ItemStack(ItemList.itemDustAzureSilver.get(),2))
                .unlockedBy("enrichazuresilverore",has(BlockList.blockOreAzureSilver.get()))
                .build(consumer,ResourceLocation.parse("extraores:enrichazuresilver"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreAtlarus), new ItemStack(ItemList.itemDustAtlarus.get(), 2))
                .unlockedBy("enrichatlarusore", has(BlockList.blockOreAtlarus.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichatlarusore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreBismuth), new ItemStack(ItemList.itemDustBismuth.get(), 2))
                .unlockedBy("enrichbismuthore", has(BlockList.blockOreBismuth.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichbismuthore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreBlackSteel), new ItemStack(ItemList.itemDustBlackSteel.get(), 2))
                .unlockedBy("enrichblacksteelore", has(BlockList.blockOreBlackSteel.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichblacksteelore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreCadmium), new ItemStack(ItemList.itemDustCadmium.get(), 2))
                .unlockedBy("enrichcadmiumore", has(BlockList.blockOreCadmium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichcadmiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreCarmot), new ItemStack(ItemList.itemDustCarmot.get(), 2))
                .unlockedBy("enrichcarmotore", has(BlockList.blockOreCarmot.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichcarmotore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreCelenegil), new ItemStack(ItemList.itemDustCelenegil.get(), 2))
                .unlockedBy("enrichcelenegilore", has(BlockList.blockOreCelenegil.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichcelenegilore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreCeruclase), new ItemStack(ItemList.itemDustCeruclase.get(), 2))
                .unlockedBy("enrichceruclaseore", has(BlockList.blockOreCeruclase.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichceruclaseore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreChromium), new ItemStack(ItemList.itemDustChromium.get(), 2))
                .unlockedBy("enrichchromiumore", has(BlockList.blockOreChromium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichchromiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreCobalt), new ItemStack(ItemList.itemDustCobalt.get(), 2))
                .unlockedBy("enrichcobaltore", has(BlockList.blockOreCobalt.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichcobaltore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreCopper), new ItemStack(ItemList.itemDustCopper.get(), 2))
                .unlockedBy("enrichcopperore", has(BlockList.blockOreCopper.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichcopperore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreCrimsonSteel), new ItemStack(ItemList.itemDustCrimsonSteel.get(), 2))
                .unlockedBy("enrichcrimsonsteelore", has(BlockList.blockOreCrimsonSteel.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichcrimsonsteelore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreDeepIron), new ItemStack(ItemList.itemDustDeepIron.get(), 2))
                .unlockedBy("enrichdeepironore", has(BlockList.blockOreDeepIron.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichdeepironore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreDesichalkos), new ItemStack(ItemList.itemDustDesichalkos.get(), 2))
                .unlockedBy("enrichdesichalkosore", has(BlockList.blockOreDesichalkos.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichdesichalkosore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreEximite), new ItemStack(ItemList.itemDustEximite.get(), 2))
                .unlockedBy("enricheximiteore", has(BlockList.blockOreEximite.get()))
                .build(consumer, ResourceLocation.parse("extraores:enricheximiteore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreGallium), new ItemStack(ItemList.itemDustGallium.get(), 2))
                .unlockedBy("enrichgalliumore", has(BlockList.blockOreGallium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichgalliumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreHaderoth), new ItemStack(ItemList.itemDustHaderoth.get(), 2))
                .unlockedBy("enrichhaderothore", has(BlockList.blockOreHaderoth.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichhaderothore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreHepatizon), new ItemStack(ItemList.itemDustHepatizon.get(), 2))
                .unlockedBy("enrichhepatizonore", has(BlockList.blockOreHepatizon.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichhepatizonore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreIgnatius), new ItemStack(ItemList.itemDustIgnatius.get(), 2))
                .unlockedBy("enrichignatiusore", has(BlockList.blockOreIgnatius.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichignatiusore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreIndium), new ItemStack(ItemList.itemDustIndium.get(), 2))
                .unlockedBy("enrichindiumore", has(BlockList.blockOreIndium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichindiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreInfuscolium), new ItemStack(ItemList.itemDustInfuscolium.get(), 2))
                .unlockedBy("enrichinfuscoliumore", has(BlockList.blockOreInfuscolium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichinfuscoliumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreInolashite), new ItemStack(ItemList.itemDustInolashite.get(), 2))
                .unlockedBy("enrichinolashiteore", has(BlockList.blockOreInolashite.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichinolashiteore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreIridium), new ItemStack(ItemList.itemDustIridium.get(), 2))
                .unlockedBy("enrichiridiumore", has(BlockList.blockOreIridium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichiridiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreKalendrite), new ItemStack(ItemList.itemDustKalendrite.get(), 2))
                .unlockedBy("enrichkalendriteore", has(BlockList.blockOreKalendrite.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichkalendriteore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreLead), new ItemStack(ItemList.itemDustLead.get(), 2))
                .unlockedBy("enrichleadore", has(BlockList.blockOreLead.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichleadore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreLemurite), new ItemStack(ItemList.itemDustLemurite.get(), 2))
                .unlockedBy("enrichlemuriteore", has(BlockList.blockOreLemurite.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichlemuriteore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreManganese), new ItemStack(ItemList.itemDustManganese.get(), 2))
                .unlockedBy("enrichmanganeseore", has(BlockList.blockOreManganese.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichmanganeseore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreMeutoite), new ItemStack(ItemList.itemDustMeutoite.get(), 2))
                .unlockedBy("enrichmeutoiteore", has(BlockList.blockOreMeutoite.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichmeutoiteore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreMidasium), new ItemStack(ItemList.itemDustMidasium.get(), 2))
                .unlockedBy("enrichmidasiumore", has(BlockList.blockOreMidasium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichmidasiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreMithril), new ItemStack(ItemList.itemDustMithril.get(), 2))
                .unlockedBy("enrichmithrilore", has(BlockList.blockOreMithril.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichmithrilore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreMolybdenum), new ItemStack(ItemList.itemDustMolybdenum.get(), 2))
                .unlockedBy("enrichmolybdenumore", has(BlockList.blockOreMolybdenum.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichmolybdenumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreNeodymium), new ItemStack(ItemList.itemDustNeodymium.get(), 2))
                .unlockedBy("enrichneodymiumore", has(BlockList.blockOreNeodymium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichneodymiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreNeptunium), new ItemStack(ItemList.itemDustNeptunium.get(), 2))
                .unlockedBy("enrichneptuniumore", has(BlockList.blockOreNeptunium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichneptuniumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreNickel), new ItemStack(ItemList.itemDustNickel.get(), 2))
                .unlockedBy("enrichnickelore", has(BlockList.blockOreNickel.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichnickelore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreNiobium), new ItemStack(ItemList.itemDustNiobium.get(), 2))
                .unlockedBy("enrichniobiumore", has(BlockList.blockOreNiobium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichniobiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreOrichalcum), new ItemStack(ItemList.itemDustOrichalcum.get(), 2))
                .unlockedBy("enrichorichalcumore", has(BlockList.blockOreOrichalcum.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichorichalcumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreOsmium), new ItemStack(ItemList.itemDustOsmium.get(), 2))
                .unlockedBy("enrichosmiumore", has(BlockList.blockOreOsmium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichosmiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreOureclase), new ItemStack(ItemList.itemDustOureclase.get(), 2))
                .unlockedBy("enrichoureclaseore", has(BlockList.blockOreOureclase.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichoureclaseore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.orePalladium), new ItemStack(ItemList.itemDustPalladium.get(), 2))
                .unlockedBy("enrichpalladiumore", has(BlockList.blockOrePalladium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichpalladiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.orePlatinum), new ItemStack(ItemList.itemDustPlatinum.get(), 2))
                .unlockedBy("enrichplatinumore", has(BlockList.blockOrePlatinum.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichplatinumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.orePlutonium), new ItemStack(ItemList.itemDustPlutonium.get(), 2))
                .unlockedBy("enrichplutoniumore", has(BlockList.blockOrePlutonium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichplutoniumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.orePolonium), new ItemStack(ItemList.itemDustPolonium.get(), 2))
                .unlockedBy("enrichpoloniumore", has(BlockList.blockOrePolonium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichpoloniumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.orePromethium), new ItemStack(ItemList.itemDustPromethium.get(), 2))
                .unlockedBy("enrichpromethiumore", has(BlockList.blockOrePromethium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichpromethiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreRhenium), new ItemStack(ItemList.itemDustRhenium.get(), 2))
                .unlockedBy("enrichrheniumore", has(BlockList.blockOreRhenium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrheniumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreRhodium), new ItemStack(ItemList.itemDustRhodium.get(), 2))
                .unlockedBy("enrichrhodiumore", has(BlockList.blockOreRhodium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrhodiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreRubracium), new ItemStack(ItemList.itemDustRubracium.get(), 2))
                .unlockedBy("enrichrubraciumore", has(BlockList.blockOreRubracium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrubraciumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreRuthenium), new ItemStack(ItemList.itemDustRuthenium.get(), 2))
                .unlockedBy("enrichrutheniumore", has(BlockList.blockOreRuthenium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrutheniumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreSanguinite), new ItemStack(ItemList.itemDustSanguinite.get(), 2))
                .unlockedBy("enrichsanguiniteore", has(BlockList.blockOreSanguinite.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichsanguiniteore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreShadowIron), new ItemStack(ItemList.itemDustShadowIron.get(), 2))
                .unlockedBy("enrichshadowironore", has(BlockList.blockOreShadowIron.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichshadowironore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreSilver), new ItemStack(ItemList.itemDustSilver.get(), 2))
                .unlockedBy("enrichsilverore", has(BlockList.blockOreSilver.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichsilverore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreTantalum), new ItemStack(ItemList.itemDustTantalum.get(), 2))
                .unlockedBy("enrichtantalumore", has(BlockList.blockOreTantalum.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichtantalumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreTartarite), new ItemStack(ItemList.itemDustTartarite.get(), 2))
                .unlockedBy("enrichtartariteore", has(BlockList.blockOreTartarite.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichtartariteore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreTechnetium), new ItemStack(ItemList.itemDustTechnetium.get(), 2))
                .unlockedBy("enrichtechnetiumore", has(BlockList.blockOreTechnetium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichtechnetiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreThallium), new ItemStack(ItemList.itemDustThallium.get(), 2))
                .unlockedBy("enrichthalliumore", has(BlockList.blockOreThallium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichthalliumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreTin), new ItemStack(ItemList.itemDustTin.get(), 2))
                .unlockedBy("enrichtinore", has(BlockList.blockOreTin.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichtinore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreTitanium), new ItemStack(ItemList.itemDustTitanium.get(), 2))
                .unlockedBy("enrichtitaniumore", has(BlockList.blockOreTitanium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichtitaniumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreTritium), new ItemStack(ItemList.itemDustTritium.get(), 2))
                .unlockedBy("enrichtritiumore", has(BlockList.blockOreTritium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichtritiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreTungsten), new ItemStack(ItemList.itemDustTungsten.get(), 2))
                .unlockedBy("enrichtungstenore", has(BlockList.blockOreTungsten.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichtungstenore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreUnobtainium), new ItemStack(ItemList.itemDustUnobtainium.get(), 2))
                .unlockedBy("enrichunobtainiumore", has(BlockList.blockOreUnobtainium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichunobtainiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreUranium), new ItemStack(ItemList.itemDustUranium.get(), 2))
                .unlockedBy("enrichuraniumore", has(BlockList.blockOreUranium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichuraniumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreVanadium), new ItemStack(ItemList.itemDustVanadium.get(), 2))
                .unlockedBy("enrichvanadiumore", has(BlockList.blockOreVanadium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichvanadiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreVibranium), new ItemStack(ItemList.itemDustVibranium.get(), 2))
                .unlockedBy("enrichvibraniumore", has(BlockList.blockOreVibranium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichvibraniumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreVulcanite), new ItemStack(ItemList.itemDustVulcanite.get(), 2))
                .unlockedBy("enrichvulcaniteore", has(BlockList.blockOreVulcanite.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichvulcaniteore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreVyroxeres), new ItemStack(ItemList.itemDustVyroxeres.get(), 2))
                .unlockedBy("enrichvyroxeresore", has(BlockList.blockOreVyroxeres.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichvyroxeresore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreYellorite), new ItemStack(ItemList.itemDustYellorite.get(), 2))
                .unlockedBy("enrichyelloriteore", has(BlockList.blockOreYellorite.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichyelloriteore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreZinc), new ItemStack(ItemList.itemDustZinc.get(), 2))
                .unlockedBy("enrichzincore", has(BlockList.blockOreZinc.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichzincore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreZirconium), new ItemStack(ItemList.itemDustZirconium.get(), 2))
                .unlockedBy("enrichzirconiumore", has(BlockList.blockOreZirconium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichzirconiumore"));
        //Raw
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawAdamantine), new ItemStack(ItemList.itemDustAdamantine.get(), 2))
                .unlockedBy("enrichrawadamantine", has(ItemList.itemRawAdamantine.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawadamantine"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawAldourite), new ItemStack(ItemList.itemDustAldourite.get(), 2))
                .unlockedBy("enrichrawaldourite", has(ItemList.itemRawAldourite.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawaldourite"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawAluminum), new ItemStack(ItemList.itemDustAluminum.get(), 2))
                .unlockedBy("enrichrawaluminum", has(ItemList.itemRawAluminum.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawaluminum"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawAmericium), new ItemStack(ItemList.itemDustAmericium.get(), 2))
                .unlockedBy("enrichrawamericium", has(ItemList.itemRawAmericium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawamericium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawAmordrine), new ItemStack(ItemList.itemDustAmordrine.get(), 2))
                .unlockedBy("enrichrawamordrine", has(ItemList.itemRawAmordrine.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawamordrine"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawAngmallen), new ItemStack(ItemList.itemDustAngmallen.get(), 2))
                .unlockedBy("enrichrawangmallen", has(ItemList.itemRawAngmallen.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawangmallen"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawAstralSilver), new ItemStack(ItemList.itemDustAstralSilver.get(), 2))
                .unlockedBy("enrichrawastralsilver", has(ItemList.itemRawAstralSilver.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawastralsilver"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawAtlarus), new ItemStack(ItemList.itemDustAtlarus.get(), 2))
                .unlockedBy("enrichrawatlarus", has(ItemList.itemRawAtlarus.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawatlarus"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawAzureSilver),new ItemStack(ItemList.itemDustAzureSilver.get(),2))
                .unlockedBy("enrichrawazuresilver",has(ItemList.itemRawAzureSilver.get()))
                .build(consumer,ResourceLocation.parse("extraores:enrichrawazuresilver"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawBismuth), new ItemStack(ItemList.itemDustBismuth.get(), 2))
                .unlockedBy("enrichrawbismuth", has(ItemList.itemRawBismuth.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawbismuth"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawBlackSteel), new ItemStack(ItemList.itemDustBlackSteel.get(), 2))
                .unlockedBy("enrichrawblacksteel", has(ItemList.itemRawBlackSteel.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawblacksteel"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawCadmium), new ItemStack(ItemList.itemDustCadmium.get(), 2))
                .unlockedBy("enrichrawcadmium", has(ItemList.itemRawCadmium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawcadmium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawCarmot), new ItemStack(ItemList.itemDustCarmot.get(), 2))
                .unlockedBy("enrichrawcarmot", has(ItemList.itemRawCarmot.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawcarmot"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawCelenegil), new ItemStack(ItemList.itemDustCelenegil.get(), 2))
                .unlockedBy("enrichrawcelenegil", has(ItemList.itemRawCelenegil.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawcelenegil"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawCeruclase), new ItemStack(ItemList.itemDustCeruclase.get(), 2))
                .unlockedBy("enrichrawceruclase", has(ItemList.itemRawCeruclase.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawceruclase"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawChromium), new ItemStack(ItemList.itemDustChromium.get(), 2))
                .unlockedBy("enrichrawchromium", has(ItemList.itemRawChromium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawchromium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawCobalt), new ItemStack(ItemList.itemDustCobalt.get(), 2))
                .unlockedBy("enrichrawcobalt", has(ItemList.itemRawCobalt.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawcobalt"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawCopper), new ItemStack(ItemList.itemDustCopper.get(), 2))
                .unlockedBy("enrichrawcopper", has(ItemList.itemRawCopper.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawcopper"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawCrimsonSteel), new ItemStack(ItemList.itemDustCrimsonSteel.get(), 2))
                .unlockedBy("enrichrawcrimsonsteel", has(ItemList.itemRawCrimsonSteel.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawcrimsonsteel"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawDeepIron), new ItemStack(ItemList.itemDustDeepIron.get(), 2))
                .unlockedBy("enrichrawdeepiron", has(ItemList.itemRawDeepIron.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawdeepiron"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawDesichalkos), new ItemStack(ItemList.itemDustDesichalkos.get(), 2))
                .unlockedBy("enrichrawdesichalkos", has(ItemList.itemRawDesichalkos.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawdesichalkos"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawEximite), new ItemStack(ItemList.itemDustEximite.get(), 2))
                .unlockedBy("enrichraweximite", has(ItemList.itemRawEximite.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichraweximite"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawGallium), new ItemStack(ItemList.itemDustGallium.get(), 2))
                .unlockedBy("enrichrawgallium", has(ItemList.itemRawGallium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawgallium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawHaderoth), new ItemStack(ItemList.itemDustHaderoth.get(), 2))
                .unlockedBy("enrichrawhaderoth", has(ItemList.itemRawHaderoth.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawhaderoth"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawHepatizon), new ItemStack(ItemList.itemDustHepatizon.get(), 2))
                .unlockedBy("enrichrawhepatizon", has(ItemList.itemRawHepatizon.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawhepatizon"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawIgnatius), new ItemStack(ItemList.itemDustIgnatius.get(), 2))
                .unlockedBy("enrichrawignatius", has(ItemList.itemRawIgnatius.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawignatius"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawIndium), new ItemStack(ItemList.itemDustIndium.get(), 2))
                .unlockedBy("enrichrawindium", has(ItemList.itemRawIndium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawindium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawInfuscolium), new ItemStack(ItemList.itemDustInfuscolium.get(), 2))
                .unlockedBy("enrichrawinfuscolium", has(ItemList.itemRawInfuscolium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawinfuscolium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawInolashite), new ItemStack(ItemList.itemDustInolashite.get(), 2))
                .unlockedBy("enrichrawinolashite", has(ItemList.itemRawInolashite.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawinolashite"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawIridium), new ItemStack(ItemList.itemDustIridium.get(), 2))
                .unlockedBy("enrichrawiridium", has(ItemList.itemRawIridium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawiridium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawKalendrite), new ItemStack(ItemList.itemDustKalendrite.get(), 2))
                .unlockedBy("enrichrawkalendrite", has(ItemList.itemRawKalendrite.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawkalendrite"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawLead), new ItemStack(ItemList.itemDustLead.get(), 2))
                .unlockedBy("enrichrawlead", has(ItemList.itemRawLead.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawlead"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawLemurite), new ItemStack(ItemList.itemDustLemurite.get(), 2))
                .unlockedBy("enrichrawlemurite", has(ItemList.itemRawLemurite.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawlemurite"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawManganese), new ItemStack(ItemList.itemDustManganese.get(), 2))
                .unlockedBy("enrichrawmanganese", has(ItemList.itemRawManganese.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawmanganese"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawMeutoite), new ItemStack(ItemList.itemDustMeutoite.get(), 2))
                .unlockedBy("enrichrawmeutoite", has(ItemList.itemRawMeutoite.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawmeutoite"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawMidasium), new ItemStack(ItemList.itemDustMidasium.get(), 2))
                .unlockedBy("enrichrawmidasium", has(ItemList.itemRawMidasium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawmidasium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawMithril), new ItemStack(ItemList.itemDustMithril.get(), 2))
                .unlockedBy("enrichrawmithril", has(ItemList.itemRawMithril.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawmithril"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawMolybdenum), new ItemStack(ItemList.itemDustMolybdenum.get(), 2))
                .unlockedBy("enrichrawmolybdenum", has(ItemList.itemRawMolybdenum.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawmolybdenum"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawNeodymium), new ItemStack(ItemList.itemDustNeodymium.get(), 2))
                .unlockedBy("enrichrawneodymium", has(ItemList.itemRawNeodymium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawneodymium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawNeptunium), new ItemStack(ItemList.itemDustNeptunium.get(), 2))
                .unlockedBy("enrichrawneptunium", has(ItemList.itemRawNeptunium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawneptunium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawNickel), new ItemStack(ItemList.itemDustNickel.get(), 2))
                .unlockedBy("enrichrawnickel", has(ItemList.itemRawNickel.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawnickel"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawNiobium), new ItemStack(ItemList.itemDustNiobium.get(), 2))
                .unlockedBy("enrichrawniobium", has(ItemList.itemRawNiobium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawniobium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawOrichalcum), new ItemStack(ItemList.itemDustOrichalcum.get(), 2))
                .unlockedBy("enrichraworichalcum", has(ItemList.itemRawOrichalcum.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichraworichalcum"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawOsmium), new ItemStack(ItemList.itemDustOsmium.get(), 2))
                .unlockedBy("enrichrawosmium", has(ItemList.itemRawOsmium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawosmium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawOureclase), new ItemStack(ItemList.itemDustOureclase.get(), 2))
                .unlockedBy("enrichrawoureclase", has(ItemList.itemRawOureclase.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawoureclase"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawPalladium), new ItemStack(ItemList.itemDustPalladium.get(), 2))
                .unlockedBy("enrichrawpalladium", has(ItemList.itemRawPalladium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawpalladium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawPlatinum), new ItemStack(ItemList.itemDustPlatinum.get(), 2))
                .unlockedBy("enrichrawplatinum", has(ItemList.itemRawPlatinum.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawplatinum"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawPlutonium), new ItemStack(ItemList.itemDustPlutonium.get(), 2))
                .unlockedBy("enrichrawplutonium", has(ItemList.itemRawPlutonium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawplutonium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawPolonium), new ItemStack(ItemList.itemDustPolonium.get(), 2))
                .unlockedBy("enrichrawpolonium", has(ItemList.itemRawPolonium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawpolonium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawPromethium), new ItemStack(ItemList.itemDustPromethium.get(), 2))
                .unlockedBy("enrichrawpromethium", has(ItemList.itemRawPromethium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawpromethium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawRhenium), new ItemStack(ItemList.itemDustRhenium.get(), 2))
                .unlockedBy("enrichrawrhenium", has(ItemList.itemRawRhenium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawrhenium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawRhodium), new ItemStack(ItemList.itemDustRhodium.get(), 2))
                .unlockedBy("enrichrawrhodium", has(ItemList.itemRawRhodium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawrhodium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawRubracium), new ItemStack(ItemList.itemDustRubracium.get(), 2))
                .unlockedBy("enrichrawrubracium", has(ItemList.itemRawRubracium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawrubracium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawRuthenium), new ItemStack(ItemList.itemDustRuthenium.get(), 2))
                .unlockedBy("enrichrawruthenium", has(ItemList.itemRawRuthenium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawruthenium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawSanguinite), new ItemStack(ItemList.itemDustSanguinite.get(), 2))
                .unlockedBy("enrichrawsanguinite", has(ItemList.itemRawSanguinite.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawsanguinite"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawShadowIron), new ItemStack(ItemList.itemDustShadowIron.get(), 2))
                .unlockedBy("enrichrawshadowiron", has(ItemList.itemRawShadowIron.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawshadowiron"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawSilver), new ItemStack(ItemList.itemDustSilver.get(), 2))
                .unlockedBy("enrichrawsilver", has(ItemList.itemRawSilver.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawsilver"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawTantalum), new ItemStack(ItemList.itemDustTantalum.get(), 2))
                .unlockedBy("enrichrawtantalum", has(ItemList.itemRawTantalum.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawtantalum"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawTartarite), new ItemStack(ItemList.itemDustTartarite.get(), 2))
                .unlockedBy("enrichrawtartarite", has(ItemList.itemRawTartarite.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawtartarite"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawTechnetium), new ItemStack(ItemList.itemDustTechnetium.get(), 2))
                .unlockedBy("enrichrawtechnetium", has(ItemList.itemRawTechnetium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawtechnetium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawThallium), new ItemStack(ItemList.itemDustThallium.get(), 2))
                .unlockedBy("enrichrawthallium", has(ItemList.itemRawThallium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawthallium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawTin), new ItemStack(ItemList.itemDustTin.get(), 2))
                .unlockedBy("enrichrawtin", has(ItemList.itemRawTin.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawtin"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawTitanium), new ItemStack(ItemList.itemDustTitanium.get(), 2))
                .unlockedBy("enrichrawtitanium", has(ItemList.itemRawTitanium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawtitanium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawTritium), new ItemStack(ItemList.itemDustTritium.get(), 2))
                .unlockedBy("enrichrawtritium", has(ItemList.itemRawTritium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawtritium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawTungsten), new ItemStack(ItemList.itemDustTungsten.get(), 2))
                .unlockedBy("enrichrawtungsten", has(ItemList.itemRawTungsten.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawtungsten"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawUnobtainium), new ItemStack(ItemList.itemDustUnobtainium.get(), 2))
                .unlockedBy("enrichrawunobtainium", has(ItemList.itemRawUnobtainium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawunobtainium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawUranium), new ItemStack(ItemList.itemDustUranium.get(), 2))
                .unlockedBy("enrichrawuranium", has(ItemList.itemRawUranium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawuranium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawVanadium), new ItemStack(ItemList.itemDustVanadium.get(), 2))
                .unlockedBy("enrichrawvanadium", has(ItemList.itemRawVanadium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawvanadium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawVibranium), new ItemStack(ItemList.itemDustVibranium.get(), 2))
                .unlockedBy("enrichrawvibranium", has(ItemList.itemRawVibranium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawvibranium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawVulcanite), new ItemStack(ItemList.itemDustVulcanite.get(), 2))
                .unlockedBy("enrichrawvulcanite", has(ItemList.itemRawVulcanite.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawvulcanite"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawVyroxeres), new ItemStack(ItemList.itemDustVyroxeres.get(), 2))
                .unlockedBy("enrichrawvyroxeres", has(ItemList.itemRawVyroxeres.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawvyroxeres"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawYellorite), new ItemStack(ItemList.itemDustYellorite.get(), 2))
                .unlockedBy("enrichrawyellorite", has(ItemList.itemRawYellorite.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawyellorite"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawZinc), new ItemStack(ItemList.itemDustZinc.get(), 2))
                .unlockedBy("enrichrawzinc", has(ItemList.itemRawZinc.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawzinc"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawZirconium), new ItemStack(ItemList.itemDustZirconium.get(), 2))
                .unlockedBy("enrichrawzirconium", has(ItemList.itemRawZirconium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawzirconium"));
        //Dirty Dust
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustAdamantine), new ItemStack(ItemList.itemDustAdamantine.get()))
                .unlockedBy("enrichadamantinedirtydust", has(BlockList.blockOreAdamantine.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichadamantinedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustAldourite), new ItemStack(ItemList.itemDustAldourite.get()))
                .unlockedBy("enrichaldouritedirtydust", has(BlockList.blockOreAldourite.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichaldouritedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustAluminum), new ItemStack(ItemList.itemDustAluminum.get()))
                .unlockedBy("enrichaluminumdirtydust", has(BlockList.blockOreAluminum.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichaluminumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustAmericium), new ItemStack(ItemList.itemDustAmericium.get()))
                .unlockedBy("enrichamericiumdirtydust", has(BlockList.blockOreAmericium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichamericiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustAmordrine), new ItemStack(ItemList.itemDustAmordrine.get()))
                .unlockedBy("enrichamordrinedirtydust", has(BlockList.blockOreAmordrine.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichamordrinedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustAngmallen), new ItemStack(ItemList.itemDustAngmallen.get()))
                .unlockedBy("enrichangmallendirtydust", has(BlockList.blockOreAngmallen.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichangmallendirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustAstralSilver), new ItemStack(ItemList.itemDustAstralSilver.get()))
                .unlockedBy("enrichastralsilverdirtydust", has(BlockList.blockOreAstralSilver.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichastralsilverdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustAtlarus), new ItemStack(ItemList.itemDustAtlarus.get()))
                .unlockedBy("enrichatlarusdirtydust", has(BlockList.blockOreAtlarus.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichatlarusdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustAzureSilver),new ItemStack(ItemList.itemDustAzureSilver.get()))
                .unlockedBy("enrichazuresilverdirtydust",has(BlockList.blockOreAzureSilver.get()))
                .build(consumer,ResourceLocation.parse("extraores:enrichazuresilverdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustBismuth), new ItemStack(ItemList.itemDustBismuth.get()))
                .unlockedBy("enrichbismuthdirtydust", has(BlockList.blockOreBismuth.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichbismuthdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustBlackSteel), new ItemStack(ItemList.itemDustBlackSteel.get()))
                .unlockedBy("enrichblacksteeldirtydust", has(BlockList.blockOreBlackSteel.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichblacksteeldirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustCadmium), new ItemStack(ItemList.itemDustCadmium.get()))
                .unlockedBy("enrichcadmiumdirtydust", has(BlockList.blockOreCadmium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichcadmiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustCarmot), new ItemStack(ItemList.itemDustCarmot.get()))
                .unlockedBy("enrichcarmotdirtydust", has(BlockList.blockOreCarmot.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichcarmotdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustCelenegil), new ItemStack(ItemList.itemDustCelenegil.get()))
                .unlockedBy("enrichcelenegildirtydust", has(BlockList.blockOreCelenegil.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichcelenegildirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustCeruclase), new ItemStack(ItemList.itemDustCeruclase.get()))
                .unlockedBy("enrichceruclasedirtydust", has(BlockList.blockOreCeruclase.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichceruclasedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustChromium), new ItemStack(ItemList.itemDustChromium.get()))
                .unlockedBy("enrichchromiumdirtydust", has(BlockList.blockOreChromium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichchromiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustCobalt), new ItemStack(ItemList.itemDustCobalt.get()))
                .unlockedBy("enrichcobaltdirtydust", has(BlockList.blockOreCobalt.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichcobaltdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustCopper), new ItemStack(ItemList.itemDustCopper.get()))
                .unlockedBy("enrichcopperdirtydust", has(BlockList.blockOreCopper.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichcopperdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustCrimsonSteel), new ItemStack(ItemList.itemDustCrimsonSteel.get()))
                .unlockedBy("enrichcrimsonsteeldirtydust", has(BlockList.blockOreCrimsonSteel.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichcrimsonsteeldirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustDeepIron), new ItemStack(ItemList.itemDustDeepIron.get()))
                .unlockedBy("enrichdeepirondirtydust", has(BlockList.blockOreDeepIron.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichdeepirondirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustDesichalkos), new ItemStack(ItemList.itemDustDesichalkos.get()))
                .unlockedBy("enrichdesichalkosdirtydust", has(BlockList.blockOreDesichalkos.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichdesichalkosdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustEximite), new ItemStack(ItemList.itemDustEximite.get()))
                .unlockedBy("enricheximitedirtydust", has(BlockList.blockOreEximite.get()))
                .build(consumer, ResourceLocation.parse("extraores:enricheximitedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustGallium), new ItemStack(ItemList.itemDustGallium.get()))
                .unlockedBy("enrichgalliumdirtydust", has(BlockList.blockOreGallium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichgalliumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustHaderoth), new ItemStack(ItemList.itemDustHaderoth.get()))
                .unlockedBy("enrichhaderothdirtydust", has(BlockList.blockOreHaderoth.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichhaderothdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustHepatizon), new ItemStack(ItemList.itemDustHepatizon.get()))
                .unlockedBy("enrichhepatizondirtydust", has(BlockList.blockOreHepatizon.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichhepatizondirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustIgnatius), new ItemStack(ItemList.itemDustIgnatius.get()))
                .unlockedBy("enrichignatiusdirtydust", has(BlockList.blockOreIgnatius.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichignatiusdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustIndium), new ItemStack(ItemList.itemDustIndium.get()))
                .unlockedBy("enrichindiumdirtydust", has(BlockList.blockOreIndium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichindiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustInfuscolium), new ItemStack(ItemList.itemDustInfuscolium.get()))
                .unlockedBy("enrichinfuscoliumdirtydust", has(BlockList.blockOreInfuscolium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichinfuscoliumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustInolashite), new ItemStack(ItemList.itemDustInolashite.get()))
                .unlockedBy("enrichinolashitedirtydust", has(BlockList.blockOreInolashite.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichinolashitedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustIridium), new ItemStack(ItemList.itemDustIridium.get()))
                .unlockedBy("enrichiridiumdirtydust", has(BlockList.blockOreIridium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichiridiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustKalendrite), new ItemStack(ItemList.itemDustKalendrite.get()))
                .unlockedBy("enrichkalendritedirtydust", has(BlockList.blockOreKalendrite.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichkalendritedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustLead), new ItemStack(ItemList.itemDustLead.get()))
                .unlockedBy("enrichleaddirtydust", has(BlockList.blockOreLead.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichleaddirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustLemurite), new ItemStack(ItemList.itemDustLemurite.get()))
                .unlockedBy("enrichlemuritedirtydust", has(BlockList.blockOreLemurite.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichlemuritedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustManganese), new ItemStack(ItemList.itemDustManganese.get()))
                .unlockedBy("enrichmanganesedirtydust", has(BlockList.blockOreManganese.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichmanganesedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustMeutoite), new ItemStack(ItemList.itemDustMeutoite.get()))
                .unlockedBy("enrichmeutoitedirtydust", has(BlockList.blockOreMeutoite.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichmeutoitedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustMidasium), new ItemStack(ItemList.itemDustMidasium.get()))
                .unlockedBy("enrichmidasiumdirtydust", has(BlockList.blockOreMidasium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichmidasiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustMithril), new ItemStack(ItemList.itemDustMithril.get()))
                .unlockedBy("enrichmithrildirtydust", has(BlockList.blockOreMithril.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichmithrildirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustMolybdenum), new ItemStack(ItemList.itemDustMolybdenum.get()))
                .unlockedBy("enrichmolybdenumdirtydust", has(BlockList.blockOreMolybdenum.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichmolybdenumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustNeodymium), new ItemStack(ItemList.itemDustNeodymium.get()))
                .unlockedBy("enrichneodymiumdirtydust", has(BlockList.blockOreNeodymium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichneodymiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustNeptunium), new ItemStack(ItemList.itemDustNeptunium.get()))
                .unlockedBy("enrichneptuniumdirtydust", has(BlockList.blockOreNeptunium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichneptuniumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustNickel), new ItemStack(ItemList.itemDustNickel.get()))
                .unlockedBy("enrichnickeldirtydust", has(BlockList.blockOreNickel.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichnickeldirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustNiobium), new ItemStack(ItemList.itemDustNiobium.get()))
                .unlockedBy("enrichniobiumdirtydust", has(BlockList.blockOreNiobium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichniobiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustOrichalcum), new ItemStack(ItemList.itemDustOrichalcum.get()))
                .unlockedBy("enrichorichalcumdirtydust", has(BlockList.blockOreOrichalcum.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichorichalcumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustOsmium), new ItemStack(ItemList.itemDustOsmium.get()))
                .unlockedBy("enrichosmiumdirtydust", has(BlockList.blockOreOsmium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichosmiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustOureclase), new ItemStack(ItemList.itemDustOureclase.get()))
                .unlockedBy("enrichoureclasedirtydust", has(BlockList.blockOreOureclase.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichoureclasedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustPalladium), new ItemStack(ItemList.itemDustPalladium.get()))
                .unlockedBy("enrichpalladiumdirtydust", has(BlockList.blockOrePalladium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichpalladiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustPlatinum), new ItemStack(ItemList.itemDustPlatinum.get()))
                .unlockedBy("enrichplatinumdirtydust", has(BlockList.blockOrePlatinum.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichplatinumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustPlutonium), new ItemStack(ItemList.itemDustPlutonium.get()))
                .unlockedBy("enrichplutoniumdirtydust", has(BlockList.blockOrePlutonium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichplutoniumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustPolonium), new ItemStack(ItemList.itemDustPolonium.get()))
                .unlockedBy("enrichpoloniumdirtydust", has(BlockList.blockOrePolonium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichpoloniumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustPromethium), new ItemStack(ItemList.itemDustPromethium.get()))
                .unlockedBy("enrichpromethiumdirtydust", has(BlockList.blockOrePromethium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichpromethiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustRhenium), new ItemStack(ItemList.itemDustRhenium.get()))
                .unlockedBy("enrichrheniumdirtydust", has(BlockList.blockOreRhenium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrheniumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustRhodium), new ItemStack(ItemList.itemDustRhodium.get()))
                .unlockedBy("enrichrhodiumdirtydust", has(BlockList.blockOreRhodium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrhodiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustRubracium), new ItemStack(ItemList.itemDustRubracium.get()))
                .unlockedBy("enrichrubraciumdirtydust", has(BlockList.blockOreRubracium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrubraciumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustRuthenium), new ItemStack(ItemList.itemDustRuthenium.get()))
                .unlockedBy("enrichrutheniumdirtydust", has(BlockList.blockOreRuthenium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrutheniumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustSanguinite), new ItemStack(ItemList.itemDustSanguinite.get()))
                .unlockedBy("enrichsanguinitedirtydust", has(BlockList.blockOreSanguinite.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichsanguinitedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustShadowIron), new ItemStack(ItemList.itemDustShadowIron.get()))
                .unlockedBy("enrichshadowirondirtydust", has(BlockList.blockOreShadowIron.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichshadowirondirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustSilver), new ItemStack(ItemList.itemDustSilver.get()))
                .unlockedBy("enrichsilverdirtydust", has(BlockList.blockOreSilver.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichsilverdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustTantalum), new ItemStack(ItemList.itemDustTantalum.get()))
                .unlockedBy("enrichtantalumdirtydust", has(BlockList.blockOreTantalum.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichtantalumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustTartarite), new ItemStack(ItemList.itemDustTartarite.get()))
                .unlockedBy("enrichtartaritedirtydust", has(BlockList.blockOreTartarite.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichtartaritedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustTechnetium), new ItemStack(ItemList.itemDustTechnetium.get()))
                .unlockedBy("enrichtechnetiumdirtydust", has(BlockList.blockOreTechnetium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichtechnetiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustThallium), new ItemStack(ItemList.itemDustThallium.get()))
                .unlockedBy("enrichthalliumdirtydust", has(BlockList.blockOreThallium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichthalliumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustTin), new ItemStack(ItemList.itemDustTin.get()))
                .unlockedBy("enrichtindirtydust", has(BlockList.blockOreTin.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichtindirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustTitanium), new ItemStack(ItemList.itemDustTitanium.get()))
                .unlockedBy("enrichtitaniumdirtydust", has(BlockList.blockOreTitanium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichtitaniumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustTritium), new ItemStack(ItemList.itemDustTritium.get()))
                .unlockedBy("enrichtritiumdirtydust", has(BlockList.blockOreTritium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichtritiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustTungsten), new ItemStack(ItemList.itemDustTungsten.get()))
                .unlockedBy("enrichtungstendirtydust", has(BlockList.blockOreTungsten.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichtungstendirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustUnobtainium), new ItemStack(ItemList.itemDustUnobtainium.get()))
                .unlockedBy("enrichunobtainiumdirtydust", has(BlockList.blockOreUnobtainium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichunobtainiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustUranium), new ItemStack(ItemList.itemDustUranium.get()))
                .unlockedBy("enrichuraniumdirtydust", has(BlockList.blockOreUranium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichuraniumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustVanadium), new ItemStack(ItemList.itemDustVanadium.get()))
                .unlockedBy("enrichvanadiumdirtydust", has(BlockList.blockOreVanadium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichvanadiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustVibranium), new ItemStack(ItemList.itemDustVibranium.get()))
                .unlockedBy("enrichvibraniumdirtydust", has(BlockList.blockOreVibranium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichvibraniumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustVulcanite), new ItemStack(ItemList.itemDustVulcanite.get()))
                .unlockedBy("enrichvulcanitedirtydust", has(BlockList.blockOreVulcanite.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichvulcanitedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustVyroxeres), new ItemStack(ItemList.itemDustVyroxeres.get()))
                .unlockedBy("enrichvyroxeresdirtydust", has(BlockList.blockOreVyroxeres.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichvyroxeresdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustYellorite), new ItemStack(ItemList.itemDustYellorite.get()))
                .unlockedBy("enrichyelloritedirtydust", has(BlockList.blockOreYellorite.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichyelloritedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustZinc), new ItemStack(ItemList.itemDustZinc.get()))
                .unlockedBy("enrichzincdirtydust", has(BlockList.blockOreZinc.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichzincdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustZirconium), new ItemStack(ItemList.itemDustZirconium.get()))
                .unlockedBy("enrichzirconiumdirtydust", has(BlockList.blockOreZirconium.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichzirconiumdirtydust"));
    }
}
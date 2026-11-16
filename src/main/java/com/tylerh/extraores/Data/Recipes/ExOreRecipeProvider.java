package com.tylerh.extraores.Data.Recipes;

/*import mekanism.api.MekanismAPI;
import mekanism.api.datagen.recipe.builder.ItemStackChemicalToItemStackRecipeBuilder;
import mekanism.api.datagen.recipe.builder.ItemStackToItemStackRecipeBuilder;
import mekanism.api.recipes.ingredients.ChemicalStackIngredient;
import mekanism.api.recipes.ingredients.creator.IngredientCreatorAccess;*/
import com.tylerh.extraores.Init.BlockList;
import com.tylerh.extraores.Init.ItemList;
import com.tylerh.extraores.Init.RecipeSmeltablesList;
import com.tylerh.extraores.Util.ModInfo;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.*;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ExOreRecipeProvider extends RecipeProvider
{

    public ExOreRecipeProvider(HolderLookup.Provider registries, RecipeOutput output)
    {
        super(registries, output);
    }
    @Override
    protected void buildRecipes()
    {
        
        buildShapedRecipes();
        buildShapelessRecipes();
        buildSmeltingRecipes();
        buildBlastingRecipes();
        /*buildMekanismInjecting(consumer);
        buildMekanismPurifying(consumer);
        buildMekanismCrushing(consumer);
        buildMekanismEnriching(consumer);*/
    }
    public static class Runner extends RecipeProvider.Runner
    {

        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries)
        {
            super(packOutput, registries);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output)
        {
            return new ExOreRecipeProvider(registries,output);
        }

        @Override
        public String getName()
        {
            return "Extra Ores Recipes";
        }
    }

    @Override
    protected <T extends AbstractCookingRecipe> void oreCooking(AbstractCookingRecipe.Factory<T> factory, List<ItemLike> smeltables, RecipeCategory craftingCategory, CookingBookCategory cookingCategory, ItemLike result, float experience, int cookingTime, String group, String fromDesc)
    {
        for (ItemLike item : smeltables)
        {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(item), craftingCategory, cookingCategory, result, experience, cookingTime, factory)
                    .group(group)
                    .unlockedBy(getHasName(item), this.has(item))
                    .save(output, Identifier.fromNamespaceAndPath(ModInfo.MOD_ID,getItemName(result) + fromDesc + "_" + getItemName(item)).toString());
        }
    }
    protected void buildShapedRecipes()
    {
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockAdamantine.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotAdamantine.get())
                .unlockedBy("adamantineblock", has(BlockList.blockAdamantine.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockAgate.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemAgate.get())
                .unlockedBy("agateblock", has(BlockList.blockAgate.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockAldourite.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotAldourite.get())
                .unlockedBy("aldouriteblock", has(BlockList.blockAldourite.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockAluminum.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotAluminum.get())
                .unlockedBy("aluminumblock", has(BlockList.blockAluminum.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockAmericium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotAmericium.get())
                .unlockedBy("americiumblock", has(BlockList.blockAmericium.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockAmethyst.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemAmethyst.get())
                .unlockedBy("amethystblock", has(BlockList.blockAmethyst.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockAmetrine.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemAmetrine.get())
                .unlockedBy("ametrineblock", has(BlockList.blockAmetrine.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockAmordrine.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotAmordrine.get())
                .unlockedBy("amordrineblock", has(BlockList.blockAmordrine.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockAngmallen.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotAngmallen.get())
                .unlockedBy("angmallenblock", has(BlockList.blockAngmallen.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockAquamarine.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemAquamarine.get())
                .unlockedBy("aquamarineblock", has(BlockList.blockAquamarine.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockAstralSilver.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotAstralSilver.get())
                .unlockedBy("astralsilverblock", has(BlockList.blockAstralSilver.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockAtlarus.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotAtlarus.get())
                .unlockedBy("atlarusblock", has(BlockList.blockAtlarus.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockAzureSilver.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotAzureSilver.get())
                .unlockedBy("azuresilverblock", has(BlockList.blockAzureSilver.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockBismuth.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotBismuth.get())
                .unlockedBy("bismuthblock", has(BlockList.blockBismuth.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockBlackSteel.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotBlackSteel.get())
                .unlockedBy("blacksteelblock", has(BlockList.blockBlackSteel.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockCadmium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotCadmium.get())
                .unlockedBy("cadmiumblock", has(BlockList.blockCadmium.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockCarmot.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotCarmot.get())
                .unlockedBy("carmotblock", has(BlockList.blockCarmot.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockCelenegil.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotCelenegil.get())
                .unlockedBy("celenegilblock", has(BlockList.blockCelenegil.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockCeruclase.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotCeruclase.get())
                .unlockedBy("ceruclaseblock", has(BlockList.blockCeruclase.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockChromium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotChromium.get())
                .unlockedBy("chromiumblock", has(BlockList.blockChromium.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockChrysocolla.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemChrysocolla.get())
                .unlockedBy("chrysocollablock", has(BlockList.blockChrysocolla.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockCitrine.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemCitrine.get())
                .unlockedBy("citrineblock", has(BlockList.blockCitrine.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockCobalt.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotCobalt.get())
                .unlockedBy("cobaltblock", has(BlockList.blockCobalt.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockCopper.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotCopper.get())
                .unlockedBy("copperblock", has(BlockList.blockCopper.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockCrimsonSteel.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotCrimsonSteel.get())
                .unlockedBy("crimsonsteelblock", has(BlockList.blockCrimsonSteel.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockDeepIron.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotDeepIron.get())
                .unlockedBy("deepironblock", has(BlockList.blockDeepIron.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockDesichalkos.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotDesichalkos.get())
                .unlockedBy("desichalkosblock", has(BlockList.blockDesichalkos.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockEximite.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotEximite.get())
                .unlockedBy("eximiteblock", has(BlockList.blockEximite.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockGallium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotGallium.get())
                .unlockedBy("galliumblock", has(BlockList.blockGallium.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockGarnet.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemGarnet.get())
                .unlockedBy("garnetblock", has(BlockList.blockGarnet.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockHaderoth.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotHaderoth.get())
                .unlockedBy("haderothblock", has(BlockList.blockHaderoth.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockHepatizon.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotHepatizon.get())
                .unlockedBy("hepatizonblock", has(BlockList.blockHepatizon.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockIgnatius.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotIgnatius.get())
                .unlockedBy("ignatiusblock", has(BlockList.blockIgnatius.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockIndium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotIndium.get())
                .unlockedBy("indiumblock", has(BlockList.blockIndium.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockInfuscolium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotInfuscolium.get())
                .unlockedBy("infuscoliumblock", has(BlockList.blockInfuscolium.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockInolashite.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotInolashite.get())
                .unlockedBy("inolashiteblock", has(BlockList.blockInolashite.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockIolite.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemIolite.get())
                .unlockedBy("ioliteblock", has(BlockList.blockIolite.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockIridium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotIridium.get())
                .unlockedBy("iridiumblock", has(BlockList.blockIridium.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockJade.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemJade.get())
                .unlockedBy("jadeblock", has(BlockList.blockJade.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockJasper.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemJasper.get())
                .unlockedBy("jasperblock", has(BlockList.blockJasper.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockKalendrite.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotKalendrite.get())
                .unlockedBy("kalendriteblock", has(BlockList.blockKalendrite.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockKyanite.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemKyanite.get())
                .unlockedBy("kyaniteblock", has(BlockList.blockKyanite.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockLead.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotLead.get())
                .unlockedBy("leadblock", has(BlockList.blockLead.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockLemurite.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotLemurite.get())
                .unlockedBy("lemuriteblock", has(BlockList.blockLemurite.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockMalachite.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemMalachite.get())
                .unlockedBy("malachiteblock", has(BlockList.blockMalachite.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockManganese.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotManganese.get())
                .unlockedBy("manganeseblock", has(BlockList.blockManganese.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockMeutoite.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotMeutoite.get())
                .unlockedBy("meutoiteblock", has(BlockList.blockMeutoite.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockMidasium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotMidasium.get())
                .unlockedBy("midasiumblock", has(BlockList.blockMidasium.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockMithril.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotMithril.get())
                .unlockedBy("mithrilblock", has(BlockList.blockMithril.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockMolybdenum.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotMolybdenum.get())
                .unlockedBy("molybdenumblock", has(BlockList.blockMolybdenum.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockNeodymium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotNeodymium.get())
                .unlockedBy("neodymiumblock", has(BlockList.blockNeodymium.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockNeptunium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotNeptunium.get())
                .unlockedBy("neptuniumblock", has(BlockList.blockNeptunium.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockNickel.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotNickel.get())
                .unlockedBy("nickelblock", has(BlockList.blockNickel.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockNiobium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotNiobium.get())
                .unlockedBy("niobiumblock", has(BlockList.blockNiobium.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockOnyx.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemOnyx.get())
                .unlockedBy("onyxblock", has(BlockList.blockOnyx.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockOpal.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemOpal.get())
                .unlockedBy("opalblock", has(BlockList.blockOpal.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockOrichalcum.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotOrichalcum.get())
                .unlockedBy("orichalcumblock", has(BlockList.blockOrichalcum.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockOsmium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotOsmium.get())
                .unlockedBy("osmiumblock", has(BlockList.blockOsmium.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockOureclase.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotOureclase.get())
                .unlockedBy("oureclaseblock", has(BlockList.blockOureclase.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockPalladium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotPalladium.get())
                .unlockedBy("palladiumblock", has(BlockList.blockPalladium.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockPeridot.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemPeridot.get())
                .unlockedBy("peridotblock", has(BlockList.blockPeridot.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockPhoenixite.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemPhoenixite.get())
                .unlockedBy("phoenixiteblock", has(BlockList.blockPhoenixite.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockPlatinum.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotPlatinum.get())
                .unlockedBy("platinumblock", has(BlockList.blockPlatinum.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockPlutonium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotPlutonium.get())
                .unlockedBy("plutoniumblock", has(BlockList.blockPlutonium.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockPolonium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotPolonium.get())
                .unlockedBy("poloniumblock", has(BlockList.blockPolonium.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockPromethium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotPromethium.get())
                .unlockedBy("promethiumblock", has(BlockList.blockPromethium.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockQuartz.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemQuartz.get())
                .unlockedBy("quartzblock", has(BlockList.blockQuartz.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockRhenium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotRhenium.get())
                .unlockedBy("rheniumblock", has(BlockList.blockRhenium.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockRhodium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotRhodium.get())
                .unlockedBy("rhodiumblock", has(BlockList.blockRhodium.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockRubracium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotRubracium.get())
                .unlockedBy("rubraciumblock", has(BlockList.blockRubracium.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockRuby.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemRuby.get())
                .unlockedBy("rubyblock", has(BlockList.blockRuby.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockRuthenium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotRuthenium.get())
                .unlockedBy("rutheniumblock", has(BlockList.blockRuthenium.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockSanguinite.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotSanguinite.get())
                .unlockedBy("sanguiniteblock", has(BlockList.blockSanguinite.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockSapphire.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemSapphire.get())
                .unlockedBy("sapphireblock", has(BlockList.blockSapphire.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockShadowIron.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotShadowIron.get())
                .unlockedBy("shadowironblock", has(BlockList.blockShadowIron.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockSilver.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotSilver.get())
                .unlockedBy("silverblock", has(BlockList.blockSilver.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockSpinel.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemSpinel.get())
                .unlockedBy("spinelblock", has(BlockList.blockSpinel.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockSugilite.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemSugilite.get())
                .unlockedBy("sugiliteore", has(BlockList.blockSugilite.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockTantalum.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotTantalum.get())
                .unlockedBy("tantalumblock", has(BlockList.blockTantalum.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockTanzanite.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemTanzanite.get())
                .unlockedBy("tanzaniteblock", has(BlockList.blockTanzanite.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockTartarite.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotTartarite.get())
                .unlockedBy("tartariteblock", has(BlockList.blockTartarite.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockTechnetium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotTechnetium.get())
                .unlockedBy("technetiumblock", has(BlockList.blockTechnetium.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockThallium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotThallium.get())
                .unlockedBy("thalliumblock", has(BlockList.blockThallium.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockTin.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotTin.get())
                .unlockedBy("tinblock", has(BlockList.blockTin.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockTitanium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotTitanium.get())
                .unlockedBy("titaniumblock", has(BlockList.blockTitanium.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockTopaz.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemTopaz.get())
                .unlockedBy("topazblock", has(BlockList.blockTopaz.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockTourmaline.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemTourmaline.get())
                .unlockedBy("tourmalineblock", has(BlockList.blockTourmaline.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockTritium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotTritium.get())
                .unlockedBy("tritiumblock", has(BlockList.blockTritium.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockTungsten.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotTungsten.get())
                .unlockedBy("tungstenblock", has(BlockList.blockTungsten.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockTurquoise.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemTurquoise.get())
                .unlockedBy("turquoiseblock", has(BlockList.blockTurquoise.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockUnobtainium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotUnobtainium.get())
                .unlockedBy("unobtainiumblock", has(BlockList.blockUnobtainium.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockUranium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotUranium.get())
                .unlockedBy("uraniumblock", has(BlockList.blockUranium.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockVanadium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotVanadium.get())
                .unlockedBy("vanadiumblock", has(BlockList.blockVanadium.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockVibranium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotVibranium.get())
                .unlockedBy("vibraniumblock", has(BlockList.blockVibranium.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockVulcanite.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotVulcanite.get())
                .unlockedBy("vulcaniteblock", has(BlockList.blockVulcanite.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockVyroxeres.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotVyroxeres.get())
                .unlockedBy("vyroxeresblock", has(BlockList.blockVyroxeres.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockYellorite.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotYellorite.get())
                .unlockedBy("yelloriteblock", has(BlockList.blockYellorite.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockZinc.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotZinc.get())
                .unlockedBy("zincblock", has(BlockList.blockZinc.get()))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, BlockList.blockZirconium.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotZirconium.get())
                .unlockedBy("zirconiumblock", has(BlockList.blockZirconium.get()))
                .save(output);
    }
    
    protected void buildShapelessRecipes()
    {
        shapeless(RecipeCategory.MISC, ItemList.itemIngotAdamantine.get(), 9)
                .requires(Ingredient.of(BlockList.blockAdamantine.get().asItem()))
                .unlockedBy("adamantineingot", has(ItemList.itemIngotAdamantine.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemGemAgate.get(), 9)
                .requires(Ingredient.of(BlockList.blockAgate.get().asItem()))
                .unlockedBy("agate", has(ItemList.itemGemAgate.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotAldourite.get(), 9)
                .requires(Ingredient.of(BlockList.blockAldourite.get().asItem()))
                .unlockedBy("aldouriteingot", has(ItemList.itemIngotAldourite.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotAluminum.get(), 9)
                .requires(Ingredient.of(BlockList.blockAluminum.get().asItem()))
                .unlockedBy("aluminumingot", has(ItemList.itemIngotAluminum.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotAmericium.get(), 9)
                .requires(Ingredient.of(BlockList.blockAmericium.get().asItem()))
                .unlockedBy("americiumingot", has(ItemList.itemIngotAmericium.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemGemAmethyst.get(), 9)
                .requires(Ingredient.of(BlockList.blockAmethyst.get().asItem()))
                .unlockedBy("amethyst", has(ItemList.itemGemAmethyst.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemGemAmetrine.get(), 9)
                .requires(Ingredient.of(BlockList.blockAmetrine.get()))
                .unlockedBy("ametrine", has(ItemList.itemGemAmetrine.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotAmordrine.get(), 9)
                .requires(Ingredient.of(BlockList.blockAmordrine.get().asItem()))
                .unlockedBy("amordrineingot", has(ItemList.itemIngotAmordrine.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotAngmallen.get(), 9)
                .requires(Ingredient.of(BlockList.blockAngmallen.get().asItem()))
                .unlockedBy("angmalleningot", has(ItemList.itemIngotAngmallen.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemGemAquamarine.get(), 9)
                .requires(Ingredient.of(BlockList.blockAquamarine.get().asItem()))
                .unlockedBy("aquamarine", has(ItemList.itemGemAquamarine.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotAstralSilver.get(), 9)
                .requires(Ingredient.of(BlockList.blockAstralSilver.get().asItem()))
                .unlockedBy("astralsilveringot", has(ItemList.itemIngotAstralSilver.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotAtlarus.get(), 9)
                .requires(Ingredient.of(BlockList.blockAtlarus.get().asItem()))
                .unlockedBy("atlarusingot", has(ItemList.itemIngotAtlarus.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotAzureSilver.get(), 9)
                .requires(Ingredient.of(BlockList.blockAzureSilver.get().asItem()))
                .unlockedBy("azuresilveringot", has(ItemList.itemIngotAzureSilver.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotBismuth.get(), 9)
                .requires(Ingredient.of(BlockList.blockBismuth.get().asItem()))
                .unlockedBy("bismuthingot", has(ItemList.itemIngotBismuth.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotBlackSteel.get(), 9)
                .requires(Ingredient.of(BlockList.blockBlackSteel.get().asItem()))
                .unlockedBy("blacksteelingot", has(ItemList.itemIngotBlackSteel.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotCadmium.get(), 9)
                .requires(Ingredient.of(BlockList.blockCadmium.get().asItem()))
                .unlockedBy("cadmiumingot", has(ItemList.itemIngotCadmium.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotCarmot.get(), 9)
                .requires(Ingredient.of(BlockList.blockCarmot.get().asItem()))
                .unlockedBy("carmotingot", has(ItemList.itemIngotCarmot.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotCelenegil.get(), 9)
                .requires(Ingredient.of(BlockList.blockCelenegil.get().asItem()))
                .unlockedBy("celenegilingot", has(ItemList.itemIngotCelenegil.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotCeruclase.get(), 9)
                .requires(Ingredient.of(BlockList.blockCeruclase.get().asItem()))
                .unlockedBy("ceruclaseingot", has(ItemList.itemIngotCeruclase.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotChromium.get(), 9)
                .requires(Ingredient.of(BlockList.blockChromium.get().asItem()))
                .unlockedBy("chromiumingot", has(ItemList.itemIngotChromium.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemGemChrysocolla.get(), 9)
                .requires(Ingredient.of(BlockList.blockChrysocolla.get().asItem()))
                .unlockedBy("chrysocolla", has(ItemList.itemGemChrysocolla.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemGemCitrine.get(), 9)
                .requires(Ingredient.of(BlockList.blockCitrine.get().asItem()))
                .unlockedBy("citrine", has(ItemList.itemGemCitrine.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotCobalt.get(), 9)
                .requires(Ingredient.of(BlockList.blockCobalt.get().asItem()))
                .unlockedBy("cobaltingot", has(ItemList.itemIngotCobalt.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotCopper.get(), 9)
                .requires(Ingredient.of(BlockList.blockCopper.get().asItem()))
                .unlockedBy("copperingot", has(ItemList.itemIngotCopper.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotCrimsonSteel.get(), 9)
                .requires(Ingredient.of(BlockList.blockCrimsonSteel.get().asItem()))
                .unlockedBy("crimsonsteelingot", has(ItemList.itemIngotCrimsonSteel.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotDeepIron.get(), 9)
                .requires(Ingredient.of(BlockList.blockDeepIron.get().asItem()))
                .unlockedBy("deepironingot", has(ItemList.itemIngotDeepIron.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotDesichalkos.get(), 9)
                .requires(Ingredient.of(BlockList.blockDesichalkos.get().asItem()))
                .unlockedBy("desichalkosingot", has(ItemList.itemIngotDesichalkos.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotEximite.get(), 9)
                .requires(Ingredient.of(BlockList.blockEximite.get().asItem()))
                .unlockedBy("eximiteingot", has(ItemList.itemIngotEximite.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotGallium.get(), 9)
                .requires(Ingredient.of(BlockList.blockGallium.get().asItem()))
                .unlockedBy("galliumingot", has(ItemList.itemIngotGallium.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemGemGarnet.get(), 9)
                .requires(Ingredient.of(BlockList.blockGarnet.get().asItem()))
                .unlockedBy("garnet", has(ItemList.itemGemGarnet.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotHaderoth.get(), 9)
                .requires(Ingredient.of(BlockList.blockHaderoth.get().asItem()))
                .unlockedBy("haderothingot", has(ItemList.itemIngotHaderoth.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotHepatizon.get(), 9)
                .requires(Ingredient.of(BlockList.blockHepatizon.get().asItem()))
                .unlockedBy("hepatizoningot", has(ItemList.itemIngotHepatizon.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotIgnatius.get(), 9)
                .requires(Ingredient.of(BlockList.blockIgnatius.get().asItem()))
                .unlockedBy("ignatiusingot", has(ItemList.itemIngotIgnatius.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotIndium.get(), 9)
                .requires(Ingredient.of(BlockList.blockIndium.get().asItem()))
                .unlockedBy("indiumingot", has(ItemList.itemIngotIndium.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotInfuscolium.get(), 9)
                .requires(Ingredient.of(BlockList.blockInfuscolium.get().asItem()))
                .unlockedBy("infuscoliumingot", has(ItemList.itemIngotInfuscolium.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotInolashite.get(), 9)
                .requires(Ingredient.of(BlockList.blockInolashite.get().asItem()))
                .unlockedBy("inolashiteingot", has(ItemList.itemIngotInolashite.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemGemIolite.get(), 9)
                .requires(Ingredient.of(BlockList.blockIolite.get().asItem()))
                .unlockedBy("iolite", has(ItemList.itemGemIolite.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotIridium.get(), 9)
                .requires(Ingredient.of(BlockList.blockIridium.get().asItem()))
                .unlockedBy("iridiumingot", has(ItemList.itemIngotIridium.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemGemJade.get(), 9)
                .requires(Ingredient.of(BlockList.blockJade.get().asItem()))
                .unlockedBy("jade", has(ItemList.itemGemJade.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemGemJasper.get(), 9)
                .requires(Ingredient.of(BlockList.blockJasper.get().asItem()))
                .unlockedBy("jasper", has(ItemList.itemGemJasper.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotKalendrite.get(), 9)
                .requires(Ingredient.of(BlockList.blockKalendrite.get().asItem()))
                .unlockedBy("kalendriteingot", has(ItemList.itemIngotKalendrite.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemGemKyanite.get(), 9)
                .requires(Ingredient.of(BlockList.blockKyanite.get().asItem()))
                .unlockedBy("kyanite", has(ItemList.itemGemKyanite.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotLead.get(), 9)
                .requires(Ingredient.of(BlockList.blockLead.get().asItem()))
                .unlockedBy("leadingot", has(ItemList.itemIngotLead.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotLemurite.get(), 9)
                .requires(Ingredient.of(BlockList.blockLemurite.get().asItem()))
                .unlockedBy("lemuriteingot", has(ItemList.itemIngotLemurite.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemGemMalachite.get(), 9)
                .requires(Ingredient.of(BlockList.blockMalachite.get()))
                .unlockedBy("malachite", has(ItemList.itemGemMalachite.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotManganese.get(), 9)
                .requires(Ingredient.of(BlockList.blockManganese.get().asItem()))
                .unlockedBy("manganeseingot", has(ItemList.itemIngotManganese.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotMeutoite.get(), 9)
                .requires(Ingredient.of(BlockList.blockMeutoite.get().asItem()))
                .unlockedBy("meutoiteingot", has(ItemList.itemIngotMeutoite.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotMidasium.get(), 9)
                .requires(Ingredient.of(BlockList.blockMidasium.get().asItem()))
                .unlockedBy("midasiumingot", has(ItemList.itemIngotMidasium.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotMithril.get(), 9)
                .requires(Ingredient.of(BlockList.blockMithril.get().asItem()))
                .unlockedBy("mithrilingot", has(ItemList.itemIngotMithril.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotMolybdenum.get(), 9)
                .requires(Ingredient.of(BlockList.blockMolybdenum.get().asItem()))
                .unlockedBy("molybdenumingot", has(ItemList.itemIngotMolybdenum.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotNeodymium.get(), 9)
                .requires(Ingredient.of(BlockList.blockNeodymium.get().asItem()))
                .unlockedBy("neodymiumingot", has(ItemList.itemIngotNeodymium.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotNeptunium.get(), 9)
                .requires(Ingredient.of(BlockList.blockNeptunium.get().asItem()))
                .unlockedBy("neptuniumingot", has(ItemList.itemIngotNeptunium.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotNickel.get(), 9)
                .requires(Ingredient.of(BlockList.blockNickel.get().asItem()))
                .unlockedBy("nickelingot", has(ItemList.itemIngotNickel.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotNiobium.get(), 9)
                .requires(Ingredient.of(BlockList.blockNiobium.get().asItem()))
                .unlockedBy("niobiumingot", has(ItemList.itemIngotNiobium.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemGemOnyx.get(), 9)
                .requires(Ingredient.of(BlockList.blockOnyx.get().asItem()))
                .unlockedBy("onyx", has(ItemList.itemGemOnyx.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemGemOpal.get(), 9)
                .requires(Ingredient.of(BlockList.blockOpal.get().asItem()))
                .unlockedBy("opal", has(ItemList.itemGemOpal.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotOrichalcum.get(), 9)
                .requires(Ingredient.of(BlockList.blockOrichalcum.get().asItem()))
                .unlockedBy("orichalcumingot", has(ItemList.itemIngotOrichalcum.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotOsmium.get(), 9)
                .requires(Ingredient.of(BlockList.blockOsmium.get().asItem()))
                .unlockedBy("osmiumingot", has(ItemList.itemIngotOsmium.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotOureclase.get(), 9)
                .requires(Ingredient.of(BlockList.blockOureclase.get().asItem()))
                .unlockedBy("oureclaseingot", has(ItemList.itemIngotOureclase.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotPalladium.get(), 9)
                .requires(Ingredient.of(BlockList.blockPalladium.get().asItem()))
                .unlockedBy("palladiumingot", has(ItemList.itemIngotPalladium.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemGemPeridot.get(), 9)
                .requires(Ingredient.of(BlockList.blockPeridot.get().asItem()))
                .unlockedBy("peridot", has(ItemList.itemGemPeridot.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemGemPhoenixite.get(), 9)
                .requires(Ingredient.of(BlockList.blockPhoenixite.get().asItem()))
                .unlockedBy("phoenixite", has(ItemList.itemGemPhoenixite.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotPlatinum.get(), 9)
                .requires(Ingredient.of(BlockList.blockPlatinum.get().asItem()))
                .unlockedBy("platinumingot", has(ItemList.itemIngotPlatinum.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotPlutonium.get(), 9)
                .requires(Ingredient.of(BlockList.blockPlutonium.get().asItem()))
                .unlockedBy("plutoniumingot", has(ItemList.itemIngotPlutonium.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotPolonium.get(), 9)
                .requires(Ingredient.of(BlockList.blockPolonium.get().asItem()))
                .unlockedBy("poloniumingot", has(ItemList.itemIngotPolonium.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotPromethium.get(), 9)
                .requires(Ingredient.of(BlockList.blockPromethium.get().asItem()))
                .unlockedBy("promethiumingot", has(ItemList.itemIngotPromethium.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemGemQuartz.get(), 9)
                .requires(Ingredient.of(BlockList.blockQuartz.get().asItem()))
                .unlockedBy("quartz", has(ItemList.itemGemQuartz.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotRhenium.get(), 9)
                .requires(Ingredient.of(BlockList.blockRhenium.get().asItem()))
                .unlockedBy("rheniumingot", has(ItemList.itemIngotRhenium.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotRhodium.get(), 9)
                .requires(Ingredient.of(BlockList.blockRhodium.get().asItem()))
                .unlockedBy("rhodiumingot", has(ItemList.itemIngotRhodium.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotRubracium.get(), 9)
                .requires(Ingredient.of(BlockList.blockRubracium.get().asItem()))
                .unlockedBy("rubraciumingot", has(ItemList.itemIngotRubracium.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemGemRuby.get(), 9)
                .requires(Ingredient.of(BlockList.blockRuby.get().asItem()))
                .unlockedBy("ruby", has(ItemList.itemGemRuby.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotRuthenium.get(), 9)
                .requires(Ingredient.of(BlockList.blockRuthenium.get().asItem()))
                .unlockedBy("rutheniumingot", has(ItemList.itemIngotRuthenium.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotSanguinite.get(), 9)
                .requires(Ingredient.of(BlockList.blockSanguinite.get().asItem()))
                .unlockedBy("sanguiniteingot", has(ItemList.itemIngotSanguinite.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemGemSapphire.get(), 9)
                .requires(Ingredient.of(BlockList.blockSapphire.get().asItem()))
                .unlockedBy("sapphire", has(ItemList.itemGemSapphire.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotShadowIron.get(), 9)
                .requires(Ingredient.of(BlockList.blockShadowIron.get().asItem()))
                .unlockedBy("shadowironingot", has(ItemList.itemIngotShadowIron.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotSilver.get(), 9)
                .requires(Ingredient.of(BlockList.blockSilver.get().asItem()))
                .unlockedBy("silveringot", has(ItemList.itemIngotSilver.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemGemSpinel.get(), 9)
                .requires(Ingredient.of(BlockList.blockSpinel.get().asItem()))
                .unlockedBy("spinel", has(ItemList.itemGemSpinel.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemGemSugilite.get(), 9)
                .requires(Ingredient.of(BlockList.blockSugilite.get().asItem()))
                .unlockedBy("sugilite", has(ItemList.itemGemSugilite.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotTantalum.get(), 9)
                .requires(Ingredient.of(BlockList.blockTantalum.get().asItem()))
                .unlockedBy("tantalumingot", has(ItemList.itemIngotTantalum.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemGemTanzanite.get(), 9)
                .requires(Ingredient.of(BlockList.blockTanzanite.get().asItem()))
                .unlockedBy("tanzanite", has(ItemList.itemGemTanzanite.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotTartarite.get(), 9)
                .requires(Ingredient.of(BlockList.blockTartarite.get().asItem()))
                .unlockedBy("tartariteingot", has(ItemList.itemIngotTartarite.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotTechnetium.get(), 9)
                .requires(Ingredient.of(BlockList.blockTechnetium.get().asItem()))
                .unlockedBy("technetiumingot", has(ItemList.itemIngotTechnetium.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotThallium.get(), 9)
                .requires(Ingredient.of(BlockList.blockThallium.get().asItem()))
                .unlockedBy("thalliumingot", has(ItemList.itemIngotThallium.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotTin.get(), 9)
                .requires(Ingredient.of(BlockList.blockTin.get().asItem()))
                .unlockedBy("tiningot", has(ItemList.itemIngotTin.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotTitanium.get(), 9)
                .requires(Ingredient.of(BlockList.blockTitanium.get().asItem()))
                .unlockedBy("titaniumingot", has(ItemList.itemIngotTitanium.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemGemTopaz.get(), 9)
                .requires(Ingredient.of(BlockList.blockTopaz.get().asItem()))
                .unlockedBy("topaz", has(ItemList.itemGemTopaz.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemGemTourmaline.get(), 9)
                .requires(Ingredient.of(BlockList.blockTourmaline.get().asItem()))
                .unlockedBy("tourmaline", has(ItemList.itemGemTourmaline.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotTritium.get(), 9)
                .requires(Ingredient.of(BlockList.blockTritium.get().asItem()))
                .unlockedBy("tritiumingot", has(ItemList.itemIngotTritium.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotTungsten.get(), 9)
                .requires(Ingredient.of(BlockList.blockTungsten.get().asItem()))
                .unlockedBy("tungsteningot", has(ItemList.itemIngotTungsten.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemGemTurquoise.get(), 9)
                .requires(Ingredient.of(BlockList.blockTurquoise.get().asItem()))
                .unlockedBy("turquoise", has(ItemList.itemGemTurquoise.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotUnobtainium.get(), 9)
                .requires(Ingredient.of(BlockList.blockUnobtainium.get().asItem()))
                .unlockedBy("unobtainiumingot", has(ItemList.itemIngotUnobtainium.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotUranium.get(), 9)
                .requires(Ingredient.of(BlockList.blockUranium.get().asItem()))
                .unlockedBy("uraniumingot", has(ItemList.itemIngotUranium.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotVanadium.get(), 9)
                .requires(Ingredient.of(BlockList.blockVanadium.get().asItem()))
                .unlockedBy("vanadiumingot", has(ItemList.itemIngotVanadium.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotVibranium.get(), 9)
                .requires(Ingredient.of(BlockList.blockVibranium.get().asItem()))
                .unlockedBy("vibraniumingot", has(ItemList.itemIngotVibranium.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotVulcanite.get(), 9)
                .requires(Ingredient.of(BlockList.blockVulcanite.get().asItem()))
                .unlockedBy("vulcaniteingot", has(ItemList.itemIngotVulcanite.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotVyroxeres.get(), 9)
                .requires(Ingredient.of(BlockList.blockVyroxeres.get().asItem()))
                .unlockedBy("vyroxeresingot", has(ItemList.itemIngotVyroxeres.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotYellorite.get(), 9)
                .requires(Ingredient.of(BlockList.blockYellorite.get().asItem()))
                .unlockedBy("yelloriteingot", has(ItemList.itemIngotYellorite.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotZinc.get(), 9)
                .requires(Ingredient.of(BlockList.blockZinc.get().asItem()))
                .unlockedBy("zincingot", has(ItemList.itemIngotZinc.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ItemList.itemIngotZirconium.get(), 9)
                .requires(Ingredient.of(BlockList.blockZirconium.get().asItem()))
                .unlockedBy("zirconiumingot", has(ItemList.itemIngotZirconium.get()))
                .save(output);
    }
    
    protected void buildSmeltingRecipes()
    {
        oreSmelting(RecipeSmeltablesList.smeltingAdamantine,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotAdamantine,0.25F,200,"adamantine");
        oreSmelting(RecipeSmeltablesList.smeltingAldourite,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotAldourite,0.25F,200,"aldourite");
        oreSmelting(RecipeSmeltablesList.smeltingAluminum,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotAluminum,0.25F,200,"aluminum");
        oreSmelting(RecipeSmeltablesList.smeltingAmericium,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotAmericium,0.25F,200,"americium");
        oreSmelting(RecipeSmeltablesList.smeltingAmordrine,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotAmordrine,0.25F,200,"amordrine");
        oreSmelting(RecipeSmeltablesList.smeltingAngmallen,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotAngmallen,0.25F,200,"angmallen");
        oreSmelting(RecipeSmeltablesList.smeltingAstralSilver,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotAstralSilver,0.25F,200,"astralsilver");
        oreSmelting(RecipeSmeltablesList.smeltingAtlarus,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotAtlarus,0.25F,200,"atlarus");
        oreSmelting(RecipeSmeltablesList.smeltingAzureSilver,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotAzureSilver,0.25F,200,"azuresilver");
        oreSmelting(RecipeSmeltablesList.smeltingBismuth,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotBismuth,0.25F,200,"bismuth");
        oreSmelting(RecipeSmeltablesList.smeltingBlackSteel,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotBlackSteel,0.25F,200,"blacksteel");
        oreSmelting(RecipeSmeltablesList.smeltingCadmium,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotCadmium,0.25F,200,"cadmium");
        oreSmelting(RecipeSmeltablesList.smeltingCarmot,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotCarmot,0.25F,200,"carmot");
        oreSmelting(RecipeSmeltablesList.smeltingCelenegil,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotCelenegil,0.25F,200,"celenegil");
        oreSmelting(RecipeSmeltablesList.smeltingCeruclase,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotCeruclase,0.25F,200,"ceruclase");
        oreSmelting(RecipeSmeltablesList.smeltingChromium,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotChromium,0.25F,200,"chromium");
        oreSmelting(RecipeSmeltablesList.smeltingCobalt,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotCobalt,0.25F,200,"cobalt");
        oreSmelting(RecipeSmeltablesList.smeltingCopper,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotCopper,0.25F,200,"copper");
        oreSmelting(RecipeSmeltablesList.smeltingCrimsonSteel,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotCrimsonSteel,0.25F,200,"crimsonsteel");
        oreSmelting(RecipeSmeltablesList.smeltingDeepIron,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotDeepIron,0.25F,200,"deepiron");
        oreSmelting(RecipeSmeltablesList.smeltingDesichalkos,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotDesichalkos,0.25F,200,"desichalkos");
        oreSmelting(RecipeSmeltablesList.smeltingEximite,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotEximite,0.25F,200,"eximite");
        oreSmelting(RecipeSmeltablesList.smeltingGallium,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotGallium,0.25F,200,"gallium");
        oreSmelting(RecipeSmeltablesList.smeltingHaderoth,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotHaderoth,0.25F,200,"haderoth");
        oreSmelting(RecipeSmeltablesList.smeltingHepatizon,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotHepatizon,0.25F,200,"hepatizon");
        oreSmelting(RecipeSmeltablesList.smeltingIgnatius,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotIgnatius,0.25F,200,"ignatius");
        oreSmelting(RecipeSmeltablesList.smeltingIndium,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotIndium,0.25F,200,"indium");
        oreSmelting(RecipeSmeltablesList.smeltingInfuscolium,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotInfuscolium,0.25F,200,"infuscolium");
        oreSmelting(RecipeSmeltablesList.smeltingInolashite,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotInolashite,0.25F,200,"inolashite");
        oreSmelting(RecipeSmeltablesList.smeltingIridium,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotIridium,0.25F,200,"iridium");
        oreSmelting(RecipeSmeltablesList.smeltingKalendrite,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotKalendrite,0.25F,200,"kalendrite");
    }
    protected void buildBlastingRecipes()
    {
        oreBlasting(RecipeSmeltablesList.smeltingAdamantine,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotAdamantine,0.25F,100,"adamantine");
        oreBlasting(RecipeSmeltablesList.smeltingAldourite,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotAldourite,0.25F,100,"aldourite");
        oreBlasting(RecipeSmeltablesList.smeltingAluminum,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotAluminum,0.25F,100,"aluminum");
        oreBlasting(RecipeSmeltablesList.smeltingAmericium,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotAmericium,0.25F,100,"americium");
        oreBlasting(RecipeSmeltablesList.smeltingAmordrine,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotAmordrine,0.25F,100,"amordrine");
        oreBlasting(RecipeSmeltablesList.smeltingAngmallen,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotAngmallen,0.25F,100,"angmallen");
        oreBlasting(RecipeSmeltablesList.smeltingAstralSilver,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotAstralSilver,0.25F,100,"astralsilver");
        oreBlasting(RecipeSmeltablesList.smeltingAtlarus,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotAtlarus,0.25F,100,"atlarus");
        oreBlasting(RecipeSmeltablesList.smeltingAzureSilver,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotAzureSilver,0.25F,100,"azuresilver");
        oreBlasting(RecipeSmeltablesList.smeltingBismuth,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotBismuth,0.25F,100,"bismuth");
        oreBlasting(RecipeSmeltablesList.smeltingBlackSteel,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotBlackSteel,0.25F,100,"blacksteel");
        oreBlasting(RecipeSmeltablesList.smeltingCadmium,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotCadmium,0.25F,100,"cadmium");
        oreBlasting(RecipeSmeltablesList.smeltingCarmot,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotCarmot,0.25F,100,"carmot");
        oreBlasting(RecipeSmeltablesList.smeltingCelenegil,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotCelenegil,0.25F,100,"celenegil");
        oreBlasting(RecipeSmeltablesList.smeltingCeruclase,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotCeruclase,0.25F,100,"ceruclase");
        oreBlasting(RecipeSmeltablesList.smeltingChromium,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotChromium,0.25F,100,"chromium");
        oreBlasting(RecipeSmeltablesList.smeltingCobalt,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotCobalt,0.25F,100,"cobalt");
        oreBlasting(RecipeSmeltablesList.smeltingCopper,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotCopper,0.25F,100,"copper");
        oreBlasting(RecipeSmeltablesList.smeltingCrimsonSteel,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotCrimsonSteel,0.25F,100,"crimsonsteel");
        oreBlasting(RecipeSmeltablesList.smeltingDeepIron,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotDeepIron,0.25F,100,"deepiron");
        oreBlasting(RecipeSmeltablesList.smeltingDesichalkos,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotDesichalkos,0.25F,100,"desichalkos");
        oreBlasting(RecipeSmeltablesList.smeltingEximite,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotEximite,0.25F,100,"eximite");
        oreBlasting(RecipeSmeltablesList.smeltingGallium,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotGallium,0.25F,100,"gallium");
        oreBlasting(RecipeSmeltablesList.smeltingHaderoth,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotHaderoth,0.25F,100,"haderoth");
        oreBlasting(RecipeSmeltablesList.smeltingHepatizon,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotHepatizon,0.25F,100,"hepatizon");
        oreBlasting(RecipeSmeltablesList.smeltingIgnatius,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotIgnatius,0.25F,100,"ignatius");
        oreBlasting(RecipeSmeltablesList.smeltingIndium,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotIndium,0.25F,100,"indium");
        oreBlasting(RecipeSmeltablesList.smeltingInfuscolium,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotInfuscolium,0.25F,100,"infuscolium");
        oreBlasting(RecipeSmeltablesList.smeltingInolashite,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotInolashite,0.25F,100,"inolashite");
        oreBlasting(RecipeSmeltablesList.smeltingIridium,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotIridium,0.25F,100,"iridium");
        oreBlasting(RecipeSmeltablesList.smeltingKalendrite,RecipeCategory.MISC,CookingBookCategory.MISC,ItemList.itemIngotKalendrite,0.25F,100,"kalendrite");
    }
    /*
    protected void buildMekanismInjecting(RecipeOutput consumer)
    {
        //Ore
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreBismuth), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardBismuth.get(), 4),true)
                .unlockedBy("injectbismuthore", has(BlockList.blockOreBismuth.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectbismuthore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreAldourite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardAldourite.get(), 4),true)
                .unlockedBy("injectaldouriteore", has(BlockList.blockOreAldourite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectaldouriteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreAluminum), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardAluminum.get(), 4),true)
                .unlockedBy("injectaluminumore", has(BlockList.blockOreAluminum.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectaluminumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreAmericium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardAmericium.get(), 4),true)
                .unlockedBy("injectamericiumore", has(BlockList.blockOreAmericium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectamericiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreAmordrine), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardAmordrine.get(), 4),true)
                .unlockedBy("injectamordrineore", has(BlockList.blockOreAmordrine.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectamordrineore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreAngmallen), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardAngmallen.get(), 4),true)
                .unlockedBy("injectangmallenore", has(BlockList.blockOreAngmallen.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectangmallenore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreAstralSilver), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardAstralSilver.get(), 4),true)
                .unlockedBy("injectastralsilverore", has(BlockList.blockOreAstralSilver.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectastralsilverore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreAtlarus), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardAtlarus.get(), 4),true)
                .unlockedBy("injectatlarusore", has(BlockList.blockOreAtlarus.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectatlarusore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreAzureSilver),ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1),new ItemStack(ItemList.itemShardAzureSilver.get(),4),true)
                .unlockedBy("injectazuresilverore",has(BlockList.blockOreAzureSilver.get()))
                .build(consumer,ResourceLocation.parse("extraores:injectazuresilverore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreBismuth), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardBismuth.get(), 4),true)
                .unlockedBy("injectbismuthore", has(BlockList.blockOreBismuth.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectbismuthore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreBlackSteel), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardBlackSteel.get(), 4),true)
                .unlockedBy("injectblacksteelore", has(BlockList.blockOreBlackSteel.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectblacksteelore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreCadmium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardCadmium.get(), 4),true)
                .unlockedBy("injectcadmiumore", has(BlockList.blockOreCadmium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectcadmiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreCarmot), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardCarmot.get(), 4),true)
                .unlockedBy("injectcarmotore", has(BlockList.blockOreCarmot.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectcarmotore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreCelenegil), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardCelenegil.get(), 4),true)
                .unlockedBy("injectcelenegilore", has(BlockList.blockOreCelenegil.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectcelenegilore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreCeruclase), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardCeruclase.get(), 4),true)
                .unlockedBy("injectceruclaseore", has(BlockList.blockOreCeruclase.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectceruclaseore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreChromium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardChromium.get(), 4),true)
                .unlockedBy("injectchromiumore", has(BlockList.blockOreChromium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectchromiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreCobalt), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardCobalt.get(), 4),true)
                .unlockedBy("injectcobaltore", has(BlockList.blockOreCobalt.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectcobaltore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreCopper), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardCopper.get(), 4),true)
                .unlockedBy("injectcopperore", has(BlockList.blockOreCopper.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectcopperore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreCrimsonSteel), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardCrimsonSteel.get(), 4),true)
                .unlockedBy("injectcrimsonsteelore", has(BlockList.blockOreCrimsonSteel.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectcrimsonsteelore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreDeepIron), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardDeepIron.get(), 4),true)
                .unlockedBy("injectdeepironore", has(BlockList.blockOreDeepIron.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectdeepironore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreDesichalkos), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardDesichalkos.get(), 4),true)
                .unlockedBy("injectdesichalkosore", has(BlockList.blockOreDesichalkos.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectdesichalkosore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreEximite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardEximite.get(), 4),true)
                .unlockedBy("injecteximiteore", has(BlockList.blockOreEximite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injecteximiteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreGallium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardGallium.get(), 4),true)
                .unlockedBy("injectgalliumore", has(BlockList.blockOreGallium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectgalliumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreHaderoth), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardHaderoth.get(), 4),true)
                .unlockedBy("injecthaderothore", has(BlockList.blockOreHaderoth.get()))
                .build(consumer, ResourceLocation.parse("extraores:injecthaderothore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreHepatizon), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardHepatizon.get(), 4),true)
                .unlockedBy("injecthepatizonore", has(BlockList.blockOreHepatizon.get()))
                .build(consumer, ResourceLocation.parse("extraores:injecthepatizonore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreIgnatius), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardIgnatius.get(), 4),true)
                .unlockedBy("injectignatiusore", has(BlockList.blockOreIgnatius.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectignatiusore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreIndium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardIndium.get(), 4),true)
                .unlockedBy("injectindiumore", has(BlockList.blockOreIndium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectindiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreInfuscolium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardInfuscolium.get(), 4),true)
                .unlockedBy("injectinfuscoliumore", has(BlockList.blockOreInfuscolium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectinfuscoliumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreInolashite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardInolashite.get(), 4),true)
                .unlockedBy("injectinolashiteore", has(BlockList.blockOreInolashite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectinolashiteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreIridium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardIridium.get(), 4),true)
                .unlockedBy("injectiridiumore", has(BlockList.blockOreIridium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectiridiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreKalendrite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardKalendrite.get(), 4),true)
                .unlockedBy("injectkalendriteore", has(BlockList.blockOreKalendrite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectkalendriteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreLead), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardLead.get(), 4),true)
                .unlockedBy("injectleadore", has(BlockList.blockOreLead.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectleadore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreLemurite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardLemurite.get(), 4),true)
                .unlockedBy("injectlemuriteore", has(BlockList.blockOreLemurite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectlemuriteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreManganese), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardManganese.get(), 4),true)
                .unlockedBy("injectmanganeseore", has(BlockList.blockOreManganese.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectmanganeseore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreMeutoite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardMeutoite.get(), 4),true)
                .unlockedBy("injectmeutoiteore", has(BlockList.blockOreMeutoite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectmeutoiteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreMidasium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardMidasium.get(), 4),true)
                .unlockedBy("injectmidasiumore", has(BlockList.blockOreMidasium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectmidasiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreMithril), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardMithril.get(), 4),true)
                .unlockedBy("injectmithrilore", has(BlockList.blockOreMithril.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectmithrilore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreMolybdenum), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardMolybdenum.get(), 4),true)
                .unlockedBy("injectmolybdenumore", has(BlockList.blockOreMolybdenum.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectmolybdenumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreNeodymium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardNeodymium.get(), 4),true)
                .unlockedBy("injectneodymiumore", has(BlockList.blockOreNeodymium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectneodymiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreNeptunium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardNeptunium.get(), 4),true)
                .unlockedBy("injectneptuniumore", has(BlockList.blockOreNeptunium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectneptuniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreNickel), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardNickel.get(), 4),true)
                .unlockedBy("injectnickelore", has(BlockList.blockOreNickel.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectnickelore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreNiobium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardNiobium.get(), 4),true)
                .unlockedBy("injectniobiumore", has(BlockList.blockOreNiobium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectniobiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreOrichalcum), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardOrichalcum.get(), 4),true)
                .unlockedBy("injectorichalcumore", has(BlockList.blockOreOrichalcum.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectorichalcumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreOsmium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardOsmium.get(), 4),true)
                .unlockedBy("injectosmiumore", has(BlockList.blockOreOsmium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectosmiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreOureclase), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardOureclase.get(), 4),true)
                .unlockedBy("injectoureclaseore", has(BlockList.blockOreOureclase.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectoureclaseore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.orePalladium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardPalladium.get(), 4),true)
                .unlockedBy("injectpalladiumore", has(BlockList.blockOrePalladium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectpalladiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.orePlatinum), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardPlatinum.get(), 4),true)
                .unlockedBy("injectplatinumore", has(BlockList.blockOrePlatinum.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectplatinumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.orePlutonium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardPlutonium.get(), 4),true)
                .unlockedBy("injectplutoniumore", has(BlockList.blockOrePlutonium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectplutoniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.orePolonium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardPolonium.get(), 4),true)
                .unlockedBy("injectpoloniumore", has(BlockList.blockOrePolonium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectpoloniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.orePromethium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardPromethium.get(), 4),true)
                .unlockedBy("injectpromethiumore", has(BlockList.blockOrePromethium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectpromethiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreRhenium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardRhenium.get(), 4),true)
                .unlockedBy("injectrheniumore", has(BlockList.blockOreRhenium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrheniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreRhodium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardRhodium.get(), 4),true)
                .unlockedBy("injectrhodiumore", has(BlockList.blockOreRhodium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrhodiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreRubracium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardRubracium.get(), 4),true)
                .unlockedBy("injectrubraciumore", has(BlockList.blockOreRubracium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrubraciumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreRuthenium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardRuthenium.get(), 4),true)
                .unlockedBy("injectrutheniumore", has(BlockList.blockOreRuthenium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrutheniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreSanguinite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardSanguinite.get(), 4),true)
                .unlockedBy("injectsanguiniteore", has(BlockList.blockOreSanguinite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectsanguiniteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreShadowIron), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardShadowIron.get(), 4),true)
                .unlockedBy("injectshadowironore", has(BlockList.blockOreShadowIron.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectshadowironore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreSilver), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardSilver.get(), 4),true)
                .unlockedBy("injectsilverore", has(BlockList.blockOreSilver.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectsilverore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreTantalum), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardTantalum.get(), 4),true)
                .unlockedBy("injecttantalumore", has(BlockList.blockOreTantalum.get()))
                .build(consumer, ResourceLocation.parse("extraores:injecttantalumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreTartarite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardTartarite.get(), 4),true)
                .unlockedBy("injecttartariteore", has(BlockList.blockOreTartarite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injecttartariteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreTechnetium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardTechnetium.get(), 4),true)
                .unlockedBy("injecttechnetiumore", has(BlockList.blockOreTechnetium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injecttechnetiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreThallium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardThallium.get(), 4),true)
                .unlockedBy("injectthalliumore", has(BlockList.blockOreThallium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectthalliumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreTin), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardTin.get(), 4),true)
                .unlockedBy("injecttinore", has(BlockList.blockOreTin.get()))
                .build(consumer, ResourceLocation.parse("extraores:injecttinore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreTritium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardTritium.get(), 4),true)
                .unlockedBy("injecttritiumore", has(BlockList.blockOreTritium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injecttritiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreTungsten), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardTungsten.get(), 4),true)
                .unlockedBy("injecttungstenore", has(BlockList.blockOreTungsten.get()))
                .build(consumer, ResourceLocation.parse("extraores:injecttungstenore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreUnobtainium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardUnobtainium.get(), 4),true)
                .unlockedBy("injectunobtainiumore", has(BlockList.blockOreUnobtainium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectunobtainiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreUranium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardUranium.get(), 4),true)
                .unlockedBy("injecturaniumore", has(BlockList.blockOreUranium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injecturaniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreVanadium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardVanadium.get(), 4),true)
                .unlockedBy("injectvanadiumore", has(BlockList.blockOreVanadium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectvanadiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreVibranium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardVibranium.get(), 4),true)
                .unlockedBy("injectvibraniumore", has(BlockList.blockOreVibranium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectvibraniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreVulcanite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardVulcanite.get(), 4),true)
                .unlockedBy("injectvulcaniteore", has(BlockList.blockOreVulcanite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectvulcaniteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreVyroxeres), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardVyroxeres.get(), 4),true)
                .unlockedBy("injectvyroxeresore", has(BlockList.blockOreVyroxeres.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectvyroxeresore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreYellorite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardYellorite.get(), 4),true)
                .unlockedBy("injectyelloriteore", has(BlockList.blockOreYellorite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectyelloriteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreZinc), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardZinc.get(), 4),true)
                .unlockedBy("injectzincore", has(BlockList.blockOreZinc.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectzincore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreZirconium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardZirconium.get(), 4),true)
                .unlockedBy("injectzirconiumore", has(BlockList.blockOreZirconium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectzirconiumore"));
        //Raw
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawBismuth), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardBismuth.get(), 4),true)
                .unlockedBy("injectrawbismuth", has(ItemList.itemRawBismuth.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawbismuth"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawAldourite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardAldourite.get(), 4),true)
                .unlockedBy("injectrawaldourite", has(ItemList.itemRawAldourite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawaldourite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawAluminum), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardAluminum.get(), 4),true)
                .unlockedBy("injectrawaluminum", has(ItemList.itemRawAluminum.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawaluminum"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawAmericium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardAmericium.get(), 4),true)
                .unlockedBy("injectrawamericium", has(ItemList.itemRawAmericium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawamericium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawAmordrine), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardAmordrine.get(), 4),true)
                .unlockedBy("injectrawamordrine", has(ItemList.itemRawAmordrine.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawamordrine"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawAngmallen), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardAngmallen.get(), 4),true)
                .unlockedBy("injectrawangmallen", has(ItemList.itemRawAngmallen.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawangmallen"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawAstralSilver), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardAstralSilver.get(), 4),true)
                .unlockedBy("injectrawastralsilver", has(ItemList.itemRawAstralSilver.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawastralsilver"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawAtlarus), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardAtlarus.get(), 4),true)
                .unlockedBy("injectrawatlarus", has(ItemList.itemRawAtlarus.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawatlarus"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawAzureSilver),ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1),new ItemStack(ItemList.itemShardAzureSilver.get(),4),true)
                .unlockedBy("injectrawazuresilver",has(ItemList.itemRawAzureSilver.get()))
                .build(consumer,ResourceLocation.parse("extraores:injectrawazuresilver"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawBismuth), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardBismuth.get(), 4),true)
                .unlockedBy("injectrawbismuth", has(ItemList.itemRawBismuth.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawbismuth"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawBlackSteel), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardBlackSteel.get(), 4),true)
                .unlockedBy("injectrawblacksteel", has(ItemList.itemRawBlackSteel.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawblacksteel"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawCadmium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardCadmium.get(), 4),true)
                .unlockedBy("injectrawcadmium", has(ItemList.itemRawCadmium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawcadmium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawCarmot), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardCarmot.get(), 4),true)
                .unlockedBy("injectrawcarmot", has(ItemList.itemRawCarmot.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawcarmot"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawCelenegil), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardCelenegil.get(), 4),true)
                .unlockedBy("injectrawcelenegil", has(ItemList.itemRawCelenegil.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawcelenegil"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawCeruclase), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardCeruclase.get(), 4),true)
                .unlockedBy("injectrawceruclase", has(ItemList.itemRawCeruclase.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawceruclase"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawChromium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardChromium.get(), 4),true)
                .unlockedBy("injectrawchromium", has(ItemList.itemRawChromium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawchromium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawCobalt), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardCobalt.get(), 4),true)
                .unlockedBy("injectrawcobalt", has(ItemList.itemRawCobalt.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawcobalt"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawCopper), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardCopper.get(), 4),true)
                .unlockedBy("injectrawcopper", has(ItemList.itemRawCopper.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawcopper"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawCrimsonSteel), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardCrimsonSteel.get(), 4),true)
                .unlockedBy("injectrawcrimsonsteel", has(ItemList.itemRawCrimsonSteel.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawcrimsonsteel"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawDeepIron), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardDeepIron.get(), 4),true)
                .unlockedBy("injectrawdeepiron", has(ItemList.itemRawDeepIron.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawdeepiron"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawDesichalkos), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardDesichalkos.get(), 4),true)
                .unlockedBy("injectrawdesichalkos", has(ItemList.itemRawDesichalkos.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawdesichalkos"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawEximite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardEximite.get(), 4),true)
                .unlockedBy("injectraweximite", has(ItemList.itemRawEximite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectraweximite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawGallium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardGallium.get(), 4),true)
                .unlockedBy("injectrawgallium", has(ItemList.itemRawGallium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawgallium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawHaderoth), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardHaderoth.get(), 4),true)
                .unlockedBy("injectrawhaderoth", has(ItemList.itemRawHaderoth.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawhaderoth"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawHepatizon), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardHepatizon.get(), 4),true)
                .unlockedBy("injectrawhepatizon", has(ItemList.itemRawHepatizon.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawhepatizon"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawIgnatius), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardIgnatius.get(), 4),true)
                .unlockedBy("injectrawignatius", has(ItemList.itemRawIgnatius.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawignatius"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawIndium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardIndium.get(), 4),true)
                .unlockedBy("injectrawindium", has(ItemList.itemRawIndium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawindium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawInfuscolium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardInfuscolium.get(), 4),true)
                .unlockedBy("injectrawinfuscolium", has(ItemList.itemRawInfuscolium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawinfuscolium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawInolashite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardInolashite.get(), 4),true)
                .unlockedBy("injectrawinolashite", has(ItemList.itemRawInolashite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawinolashite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawIridium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardIridium.get(), 4),true)
                .unlockedBy("injectrawiridium", has(ItemList.itemRawIridium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawiridium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawKalendrite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardKalendrite.get(), 4),true)
                .unlockedBy("injectrawkalendrite", has(ItemList.itemRawKalendrite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawkalendrite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawLead), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardLead.get(), 4),true)
                .unlockedBy("injectrawlead", has(ItemList.itemRawLead.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawlead"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawLemurite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardLemurite.get(), 4),true)
                .unlockedBy("injectrawlemurite", has(ItemList.itemRawLemurite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawlemurite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawManganese), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardManganese.get(), 4),true)
                .unlockedBy("injectrawmanganese", has(ItemList.itemRawManganese.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawmanganese"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawMeutoite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardMeutoite.get(), 4),true)
                .unlockedBy("injectrawmeutoite", has(ItemList.itemRawMeutoite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawmeutoite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawMidasium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardMidasium.get(), 4),true)
                .unlockedBy("injectrawmidasium", has(ItemList.itemRawMidasium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawmidasium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawMithril), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardMithril.get(), 4),true)
                .unlockedBy("injectrawmithril", has(ItemList.itemRawMithril.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawmithril"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawMolybdenum), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardMolybdenum.get(), 4),true)
                .unlockedBy("injectrawmolybdenum", has(ItemList.itemRawMolybdenum.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawmolybdenum"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawNeodymium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardNeodymium.get(), 4),true)
                .unlockedBy("injectrawneodymium", has(ItemList.itemRawNeodymium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawneodymium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawNeptunium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardNeptunium.get(), 4),true)
                .unlockedBy("injectrawneptunium", has(ItemList.itemRawNeptunium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawneptunium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawNickel), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardNickel.get(), 4),true)
                .unlockedBy("injectrawnickel", has(ItemList.itemRawNickel.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawnickel"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawNiobium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardNiobium.get(), 4),true)
                .unlockedBy("injectrawniobium", has(ItemList.itemRawNiobium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawniobium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawOrichalcum), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardOrichalcum.get(), 4),true)
                .unlockedBy("injectraworichalcum", has(ItemList.itemRawOrichalcum.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectraworichalcum"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawOsmium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardOsmium.get(), 4),true)
                .unlockedBy("injectrawosmium", has(ItemList.itemRawOsmium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawosmium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawOureclase), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardOureclase.get(), 4),true)
                .unlockedBy("injectrawoureclase", has(ItemList.itemRawOureclase.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawoureclase"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawPalladium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardPalladium.get(), 4),true)
                .unlockedBy("injectrawpalladium", has(ItemList.itemRawPalladium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawpalladium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawPlatinum), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardPlatinum.get(), 4),true)
                .unlockedBy("injectrawplatinum", has(ItemList.itemRawPlatinum.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawplatinum"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawPlutonium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardPlutonium.get(), 4),true)
                .unlockedBy("injectrawplutonium", has(ItemList.itemRawPlutonium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawplutonium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawPolonium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardPolonium.get(), 4),true)
                .unlockedBy("injectrawpolonium", has(ItemList.itemRawPolonium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawpolonium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawPromethium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardPromethium.get(), 4),true)
                .unlockedBy("injectrawpromethium", has(ItemList.itemRawPromethium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawpromethium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawRhenium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardRhenium.get(), 4),true)
                .unlockedBy("injectrawrhenium", has(ItemList.itemRawRhenium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawrhenium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawRhodium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardRhodium.get(), 4),true)
                .unlockedBy("injectrawrhodium", has(ItemList.itemRawRhodium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawrhodium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawRubracium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardRubracium.get(), 4),true)
                .unlockedBy("injectrawrubracium", has(ItemList.itemRawRubracium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawrubracium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawRuthenium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardRuthenium.get(), 4),true)
                .unlockedBy("injectrawruthenium", has(ItemList.itemRawRuthenium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawruthenium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawSanguinite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardSanguinite.get(), 4),true)
                .unlockedBy("injectrawsanguinite", has(ItemList.itemRawSanguinite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawsanguinite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawShadowIron), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardShadowIron.get(), 4),true)
                .unlockedBy("injectrawshadowiron", has(ItemList.itemRawShadowIron.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawshadowiron"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawSilver), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardSilver.get(), 4),true)
                .unlockedBy("injectrawsilver", has(ItemList.itemRawSilver.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawsilver"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawTantalum), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardTantalum.get(), 4),true)
                .unlockedBy("injectrawtantalum", has(ItemList.itemRawTantalum.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawtantalum"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawTartarite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardTartarite.get(), 4),true)
                .unlockedBy("injectrawtartarite", has(ItemList.itemRawTartarite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawtartarite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawTechnetium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardTechnetium.get(), 4),true)
                .unlockedBy("injectrawtechnetium", has(ItemList.itemRawTechnetium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawtechnetium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawThallium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardThallium.get(), 4),true)
                .unlockedBy("injectrawthallium", has(ItemList.itemRawThallium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawthallium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawTin), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardTin.get(), 4),true)
                .unlockedBy("injectrawtin", has(ItemList.itemRawTin.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawtin"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawTitanium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardTitanium.get(), 4),true)
                .unlockedBy("injectrawtitanium", has(ItemList.itemRawTitanium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawtitanium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawTritium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardTritium.get(), 4),true)
                .unlockedBy("injectrawtritium", has(ItemList.itemRawTritium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawtritium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawTungsten), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardTungsten.get(), 4),true)
                .unlockedBy("injectrawtungsten", has(ItemList.itemRawTungsten.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawtungsten"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawUnobtainium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardUnobtainium.get(), 4),true)
                .unlockedBy("injectrawunobtainium", has(ItemList.itemRawUnobtainium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawunobtainium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawUranium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardUranium.get(), 4),true)
                .unlockedBy("injectrawuranium", has(ItemList.itemRawUranium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawuranium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawVanadium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardVanadium.get(), 4),true)
                .unlockedBy("injectrawvanadium", has(ItemList.itemRawVanadium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawvanadium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawVibranium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardVibranium.get(), 4),true)
                .unlockedBy("injectrawvibranium", has(ItemList.itemRawVibranium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawvibranium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawVulcanite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardVulcanite.get(), 4),true)
                .unlockedBy("injectrawvulcanite", has(ItemList.itemRawVulcanite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawvulcanite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawVyroxeres), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardVyroxeres.get(), 4),true)
                .unlockedBy("injectrawvyroxeres", has(ItemList.itemRawVyroxeres.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawvyroxeres"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawYellorite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardYellorite.get(), 4),true)
                .unlockedBy("injectrawyellorite", has(ItemList.itemRawYellorite.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawyellorite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawZinc), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardZinc.get(), 4),true)
                .unlockedBy("injectrawzinc", has(ItemList.itemRawZinc.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawzinc"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawZirconium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:hydrogen_chloride"))),1), new ItemStack(ItemList.itemShardZirconium.get(), 4),true)
                .unlockedBy("injectrawzirconium", has(ItemList.itemRawZirconium.get()))
                .build(consumer, ResourceLocation.parse("extraores:injectrawzirconium"));
    }

    protected void buildMekanismPurifying(RecipeOutput consumer)
    {
        //Ore
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreBismuth), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpBismuth.get(), 3),true)
                .unlockedBy("purifybismuthore", has(BlockList.blockOreBismuth.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifybismuthore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreAldourite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAldourite.get(), 3),true)
                .unlockedBy("purifyaldouriteore", has(BlockList.blockOreAldourite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyaldouriteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreAluminum), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAluminum.get(), 3),true)
                .unlockedBy("purifyaluminumore", has(BlockList.blockOreAluminum.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyaluminumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreAmericium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAmericium.get(), 3),true)
                .unlockedBy("purifyamericiumore", has(BlockList.blockOreAmericium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyamericiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreAmordrine), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAmordrine.get(), 3),true)
                .unlockedBy("purifyamordrineore", has(BlockList.blockOreAmordrine.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyamordrineore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreAngmallen), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAngmallen.get(), 3),true)
                .unlockedBy("purifyangmallenore", has(BlockList.blockOreAngmallen.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyangmallenore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreAstralSilver), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAstralSilver.get(), 3),true)
                .unlockedBy("purifyastralsilverore", has(BlockList.blockOreAstralSilver.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyastralsilverore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreAtlarus), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAtlarus.get(), 3),true)
                .unlockedBy("purifyatlarusore", has(BlockList.blockOreAtlarus.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyatlarusore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreAzureSilver),ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1),new ItemStack(ItemList.itemClumpAzureSilver.get(),3),true)
                .unlockedBy("purifyazuresilverore",has(BlockList.blockOreAzureSilver.get()))
                .build(consumer,ResourceLocation.parse("extraores:purifyazuresilverore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreBismuth), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpBismuth.get(), 3),true)
                .unlockedBy("purifybismuthore", has(BlockList.blockOreBismuth.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifybismuthore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreBlackSteel), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpBlackSteel.get(), 3),true)
                .unlockedBy("purifyblacksteelore", has(BlockList.blockOreBlackSteel.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyblacksteelore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreCadmium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCadmium.get(), 3),true)
                .unlockedBy("purifycadmiumore", has(BlockList.blockOreCadmium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifycadmiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreCarmot), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCarmot.get(), 3),true)
                .unlockedBy("purifycarmotore", has(BlockList.blockOreCarmot.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifycarmotore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreCelenegil), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCelenegil.get(), 3),true)
                .unlockedBy("purifycelenegilore", has(BlockList.blockOreCelenegil.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifycelenegilore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreCeruclase), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCeruclase.get(), 3),true)
                .unlockedBy("purifyceruclaseore", has(BlockList.blockOreCeruclase.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyceruclaseore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreChromium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpChromium.get(), 3),true)
                .unlockedBy("purifychromiumore", has(BlockList.blockOreChromium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifychromiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreCobalt), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCobalt.get(), 3),true)
                .unlockedBy("purifycobaltore", has(BlockList.blockOreCobalt.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifycobaltore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreCopper), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCopper.get(), 3),true)
                .unlockedBy("purifycopperore", has(BlockList.blockOreCopper.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifycopperore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreCrimsonSteel), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCrimsonSteel.get(), 3),true)
                .unlockedBy("purifycrimsonsteelore", has(BlockList.blockOreCrimsonSteel.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifycrimsonsteelore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreDeepIron), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpDeepIron.get(), 3),true)
                .unlockedBy("purifydeepironore", has(BlockList.blockOreDeepIron.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifydeepironore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreDesichalkos), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpDesichalkos.get(), 3),true)
                .unlockedBy("purifydesichalkosore", has(BlockList.blockOreDesichalkos.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifydesichalkosore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreEximite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpEximite.get(), 3),true)
                .unlockedBy("purifyeximiteore", has(BlockList.blockOreEximite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyeximiteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreGallium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpGallium.get(), 3),true)
                .unlockedBy("purifygalliumore", has(BlockList.blockOreGallium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifygalliumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreHaderoth), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpHaderoth.get(), 3),true)
                .unlockedBy("purifyhaderothore", has(BlockList.blockOreHaderoth.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyhaderothore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreHepatizon), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpHepatizon.get(), 3),true)
                .unlockedBy("purifyhepatizonore", has(BlockList.blockOreHepatizon.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyhepatizonore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreIgnatius), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpIgnatius.get(), 3),true)
                .unlockedBy("purifyignatiusore", has(BlockList.blockOreIgnatius.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyignatiusore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreIndium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpIndium.get(), 3),true)
                .unlockedBy("purifyindiumore", has(BlockList.blockOreIndium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyindiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreInfuscolium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpInfuscolium.get(), 3),true)
                .unlockedBy("purifyinfuscoliumore", has(BlockList.blockOreInfuscolium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyinfuscoliumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreInolashite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpInolashite.get(), 3),true)
                .unlockedBy("purifyinolashiteore", has(BlockList.blockOreInolashite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyinolashiteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreIridium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpIridium.get(), 3),true)
                .unlockedBy("purifyiridiumore", has(BlockList.blockOreIridium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyiridiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreKalendrite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpKalendrite.get(), 3),true)
                .unlockedBy("purifykalendriteore", has(BlockList.blockOreKalendrite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifykalendriteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreLead), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpLead.get(), 3),true)
                .unlockedBy("purifyleadore", has(BlockList.blockOreLead.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyleadore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreLemurite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpLemurite.get(), 3),true)
                .unlockedBy("purifylemuriteore", has(BlockList.blockOreLemurite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifylemuriteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreManganese), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpManganese.get(), 3),true)
                .unlockedBy("purifymanganeseore", has(BlockList.blockOreManganese.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifymanganeseore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreMeutoite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpMeutoite.get(), 3),true)
                .unlockedBy("purifymeutoiteore", has(BlockList.blockOreMeutoite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifymeutoiteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreMidasium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpMidasium.get(), 3),true)
                .unlockedBy("purifymidasiumore", has(BlockList.blockOreMidasium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifymidasiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreMithril), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpMithril.get(), 3),true)
                .unlockedBy("purifymithrilore", has(BlockList.blockOreMithril.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifymithrilore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreMolybdenum), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpMolybdenum.get(), 3),true)
                .unlockedBy("purifymolybdenumore", has(BlockList.blockOreMolybdenum.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifymolybdenumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreNeodymium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpNeodymium.get(), 3),true)
                .unlockedBy("purifyneodymiumore", has(BlockList.blockOreNeodymium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyneodymiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreNeptunium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpNeptunium.get(), 3),true)
                .unlockedBy("purifyneptuniumore", has(BlockList.blockOreNeptunium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyneptuniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreNickel), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpNickel.get(), 3),true)
                .unlockedBy("purifynickelore", has(BlockList.blockOreNickel.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifynickelore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreNiobium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpNiobium.get(), 3),true)
                .unlockedBy("purifyniobiumore", has(BlockList.blockOreNiobium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyniobiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreOrichalcum), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpOrichalcum.get(), 3),true)
                .unlockedBy("purifyorichalcumore", has(BlockList.blockOreOrichalcum.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyorichalcumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreOsmium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpOsmium.get(), 3),true)
                .unlockedBy("purifyosmiumore", has(BlockList.blockOreOsmium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyosmiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreOureclase), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpOureclase.get(), 3),true)
                .unlockedBy("purifyoureclaseore", has(BlockList.blockOreOureclase.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyoureclaseore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.orePalladium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpPalladium.get(), 3),true)
                .unlockedBy("purifypalladiumore", has(BlockList.blockOrePalladium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifypalladiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.orePlatinum), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpPlatinum.get(), 3),true)
                .unlockedBy("purifyplatinumore", has(BlockList.blockOrePlatinum.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyplatinumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.orePlutonium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpPlutonium.get(), 3),true)
                .unlockedBy("purifyplutoniumore", has(BlockList.blockOrePlutonium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyplutoniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.orePolonium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpPolonium.get(), 3),true)
                .unlockedBy("purifypoloniumore", has(BlockList.blockOrePolonium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifypoloniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.orePromethium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpPromethium.get(), 3),true)
                .unlockedBy("purifypromethiumore", has(BlockList.blockOrePromethium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifypromethiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreRhenium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpRhenium.get(), 3),true)
                .unlockedBy("purifyrheniumore", has(BlockList.blockOreRhenium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrheniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreRhodium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpRhodium.get(), 3),true)
                .unlockedBy("purifyrhodiumore", has(BlockList.blockOreRhodium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrhodiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreRubracium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpRubracium.get(), 3),true)
                .unlockedBy("purifyrubraciumore", has(BlockList.blockOreRubracium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrubraciumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreRuthenium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpRuthenium.get(), 3),true)
                .unlockedBy("purifyrutheniumore", has(BlockList.blockOreRuthenium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrutheniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreSanguinite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpSanguinite.get(), 3),true)
                .unlockedBy("purifysanguiniteore", has(BlockList.blockOreSanguinite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifysanguiniteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreShadowIron), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpShadowIron.get(), 3),true)
                .unlockedBy("purifyshadowironore", has(BlockList.blockOreShadowIron.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyshadowironore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreSilver), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpSilver.get(), 3),true)
                .unlockedBy("purifysilverore", has(BlockList.blockOreSilver.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifysilverore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreTantalum), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTantalum.get(), 3),true)
                .unlockedBy("purifytantalumore", has(BlockList.blockOreTantalum.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifytantalumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreTartarite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTartarite.get(), 3),true)
                .unlockedBy("purifytartariteore", has(BlockList.blockOreTartarite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifytartariteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreTechnetium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTechnetium.get(), 3),true)
                .unlockedBy("purifytechnetiumore", has(BlockList.blockOreTechnetium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifytechnetiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreThallium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpThallium.get(), 3),true)
                .unlockedBy("purifythalliumore", has(BlockList.blockOreThallium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifythalliumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreTin), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTin.get(), 3),true)
                .unlockedBy("purifytinore", has(BlockList.blockOreTin.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifytinore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreTitanium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTitanium.get(), 3),true)
                .unlockedBy("purifytitaniumore", has(BlockList.blockOreTitanium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifytitaniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreTritium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTritium.get(), 3),true)
                .unlockedBy("purifytritiumore", has(BlockList.blockOreTritium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifytritiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreTungsten), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTungsten.get(), 3),true)
                .unlockedBy("purifytungstenore", has(BlockList.blockOreTungsten.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifytungstenore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreUnobtainium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpUnobtainium.get(), 3),true)
                .unlockedBy("purifyunobtainiumore", has(BlockList.blockOreUnobtainium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyunobtainiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreUranium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpUranium.get(), 3),true)
                .unlockedBy("purifyuraniumore", has(BlockList.blockOreUranium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyuraniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreVanadium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpVanadium.get(), 3),true)
                .unlockedBy("purifyvanadiumore", has(BlockList.blockOreVanadium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyvanadiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreVibranium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpVibranium.get(), 3),true)
                .unlockedBy("purifyvibraniumore", has(BlockList.blockOreVibranium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyvibraniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreVulcanite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpVulcanite.get(), 3),true)
                .unlockedBy("purifyvulcaniteore", has(BlockList.blockOreVulcanite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyvulcaniteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreVyroxeres), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpVyroxeres.get(), 3),true)
                .unlockedBy("purifyvyroxeresore", has(BlockList.blockOreVyroxeres.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyvyroxeresore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreYellorite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpYellorite.get(), 3),true)
                .unlockedBy("purifyyelloriteore", has(BlockList.blockOreYellorite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyyelloriteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreZinc), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpZinc.get(), 3),true)
                .unlockedBy("purifyzincore", has(BlockList.blockOreZinc.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyzincore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreZirconium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpZirconium.get(), 3),true)
                .unlockedBy("purifyzirconiumore", has(BlockList.blockOreZirconium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyzirconiumore"));
        //Raw
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawBismuth), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpBismuth.get(), 3),true)
                .unlockedBy("purifyrawbismuth", has(ItemList.itemRawBismuth.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawbismuth"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawAldourite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAldourite.get(), 3),true)
                .unlockedBy("purifyrawaldourite", has(ItemList.itemRawAldourite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawaldourite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawAluminum), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAluminum.get(), 3),true)
                .unlockedBy("purifyrawaluminum", has(ItemList.itemRawAluminum.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawaluminum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawAmericium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAmericium.get(), 3),true)
                .unlockedBy("purifyrawamericium", has(ItemList.itemRawAmericium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawamericium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawAmordrine), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAmordrine.get(), 3),true)
                .unlockedBy("purifyrawamordrine", has(ItemList.itemRawAmordrine.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawamordrine"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawAngmallen), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAngmallen.get(), 3),true)
                .unlockedBy("purifyrawangmallen", has(ItemList.itemRawAngmallen.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawangmallen"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawAstralSilver), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAstralSilver.get(), 3),true)
                .unlockedBy("purifyrawastralsilver", has(ItemList.itemRawAstralSilver.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawastralsilver"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawAzureSilver),ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1),new ItemStack(ItemList.itemClumpAzureSilver.get(),3),true)
                .unlockedBy("purifyrawazuresilver",has(ItemList.itemRawAzureSilver.get()))
                .build(consumer,ResourceLocation.parse("extraores:purifyrawazuresilver"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawAtlarus), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAtlarus.get(), 3),true)
                .unlockedBy("purifyrawatlarus", has(ItemList.itemRawAtlarus.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawatlarus"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawBismuth), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpBismuth.get(), 3),true)
                .unlockedBy("purifyrawbismuth", has(ItemList.itemRawBismuth.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawbismuth"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawBlackSteel), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpBlackSteel.get(), 3),true)
                .unlockedBy("purifyrawblacksteel", has(ItemList.itemRawBlackSteel.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawblacksteel"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawCadmium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCadmium.get(), 3),true)
                .unlockedBy("purifyrawcadmium", has(ItemList.itemRawCadmium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawcadmium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawCarmot), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCarmot.get(), 3),true)
                .unlockedBy("purifyrawcarmot", has(ItemList.itemRawCarmot.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawcarmot"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawCelenegil), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCelenegil.get(), 3),true)
                .unlockedBy("purifyrawcelenegil", has(ItemList.itemRawCelenegil.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawcelenegil"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawCeruclase), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCeruclase.get(), 3),true)
                .unlockedBy("purifyrawceruclase", has(ItemList.itemRawCeruclase.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawceruclase"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawChromium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpChromium.get(), 3),true)
                .unlockedBy("purifyrawchromium", has(ItemList.itemRawChromium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawchromium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawCobalt), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCobalt.get(), 3),true)
                .unlockedBy("purifyrawcobalt", has(ItemList.itemRawCobalt.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawcobalt"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawCopper), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCopper.get(), 3),true)
                .unlockedBy("purifyrawcopper", has(ItemList.itemRawCopper.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawcopper"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawCrimsonSteel), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCrimsonSteel.get(), 3),true)
                .unlockedBy("purifyrawcrimsonsteel", has(ItemList.itemRawCrimsonSteel.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawcrimsonsteel"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawDeepIron), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpDeepIron.get(), 3),true)
                .unlockedBy("purifyrawdeepiron", has(ItemList.itemRawDeepIron.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawdeepiron"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawDesichalkos), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpDesichalkos.get(), 3),true)
                .unlockedBy("purifyrawdesichalkos", has(ItemList.itemRawDesichalkos.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawdesichalkos"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawEximite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpEximite.get(), 3),true)
                .unlockedBy("purifyraweximite", has(ItemList.itemRawEximite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyraweximite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawGallium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpGallium.get(), 3),true)
                .unlockedBy("purifyrawgallium", has(ItemList.itemRawGallium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawgallium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawHaderoth), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpHaderoth.get(), 3),true)
                .unlockedBy("purifyrawhaderoth", has(ItemList.itemRawHaderoth.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawhaderoth"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawHepatizon), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpHepatizon.get(), 3),true)
                .unlockedBy("purifyrawhepatizon", has(ItemList.itemRawHepatizon.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawhepatizon"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawIgnatius), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpIgnatius.get(), 3),true)
                .unlockedBy("purifyrawignatius", has(ItemList.itemRawIgnatius.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawignatius"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawIndium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpIndium.get(), 3),true)
                .unlockedBy("purifyrawindium", has(ItemList.itemRawIndium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawindium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawInfuscolium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpInfuscolium.get(), 3),true)
                .unlockedBy("purifyrawinfuscolium", has(ItemList.itemRawInfuscolium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawinfuscolium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawInolashite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpInolashite.get(), 3),true)
                .unlockedBy("purifyrawinolashite", has(ItemList.itemRawInolashite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawinolashite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawIridium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpIridium.get(), 3),true)
                .unlockedBy("purifyrawiridium", has(ItemList.itemRawIridium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawiridium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawKalendrite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpKalendrite.get(), 3),true)
                .unlockedBy("purifyrawkalendrite", has(ItemList.itemRawKalendrite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawkalendrite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawLead), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpLead.get(), 3),true)
                .unlockedBy("purifyrawlead", has(ItemList.itemRawLead.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawlead"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawLemurite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpLemurite.get(), 3),true)
                .unlockedBy("purifyrawlemurite", has(ItemList.itemRawLemurite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawlemurite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawManganese), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpManganese.get(), 3),true)
                .unlockedBy("purifyrawmanganese", has(ItemList.itemRawManganese.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawmanganese"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawMeutoite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpMeutoite.get(), 3),true)
                .unlockedBy("purifyrawmeutoite", has(ItemList.itemRawMeutoite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawmeutoite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawMidasium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpMidasium.get(), 3),true)
                .unlockedBy("purifyrawmidasium", has(ItemList.itemRawMidasium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawmidasium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawMithril), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpMithril.get(), 3),true)
                .unlockedBy("purifyrawmithril", has(ItemList.itemRawMithril.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawmithril"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawMolybdenum), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpMolybdenum.get(), 3),true)
                .unlockedBy("purifyrawmolybdenum", has(ItemList.itemRawMolybdenum.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawmolybdenum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawNeodymium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpNeodymium.get(), 3),true)
                .unlockedBy("purifyrawneodymium", has(ItemList.itemRawNeodymium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawneodymium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawNeptunium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpNeptunium.get(), 3),true)
                .unlockedBy("purifyrawneptunium", has(ItemList.itemRawNeptunium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawneptunium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawNickel), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpNickel.get(), 3),true)
                .unlockedBy("purifyrawnickel", has(ItemList.itemRawNickel.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawnickel"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawNiobium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpNiobium.get(), 3),true)
                .unlockedBy("purifyrawniobium", has(ItemList.itemRawNiobium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawniobium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawOrichalcum), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpOrichalcum.get(), 3),true)
                .unlockedBy("purifyraworichalcum", has(ItemList.itemRawOrichalcum.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyraworichalcum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawOsmium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpOsmium.get(), 3),true)
                .unlockedBy("purifyrawosmium", has(ItemList.itemRawOsmium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawosmium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawOureclase), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpOureclase.get(), 3),true)
                .unlockedBy("purifyrawoureclase", has(ItemList.itemRawOureclase.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawoureclase"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawPalladium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpPalladium.get(), 3),true)
                .unlockedBy("purifyrawpalladium", has(ItemList.itemRawPalladium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawpalladium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawPlatinum), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpPlatinum.get(), 3),true)
                .unlockedBy("purifyrawplatinum", has(ItemList.itemRawPlatinum.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawplatinum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawPlutonium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpPlutonium.get(), 3),true)
                .unlockedBy("purifyrawplutonium", has(ItemList.itemRawPlutonium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawplutonium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawPolonium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpPolonium.get(), 3),true)
                .unlockedBy("purifyrawpolonium", has(ItemList.itemRawPolonium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawpolonium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawPromethium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpPromethium.get(), 3),true)
                .unlockedBy("purifyrawpromethium", has(ItemList.itemRawPromethium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawpromethium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawRhenium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpRhenium.get(), 3),true)
                .unlockedBy("purifyrawrhenium", has(ItemList.itemRawRhenium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawrhenium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawRhodium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpRhodium.get(), 3),true)
                .unlockedBy("purifyrawrhodium", has(ItemList.itemRawRhodium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawrhodium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawRubracium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpRubracium.get(), 3),true)
                .unlockedBy("purifyrawrubracium", has(ItemList.itemRawRubracium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawrubracium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawRuthenium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpRuthenium.get(), 3),true)
                .unlockedBy("purifyrawruthenium", has(ItemList.itemRawRuthenium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawruthenium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawSanguinite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpSanguinite.get(), 3),true)
                .unlockedBy("purifyrawsanguinite", has(ItemList.itemRawSanguinite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawsanguinite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawShadowIron), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpShadowIron.get(), 3),true)
                .unlockedBy("purifyrawshadowiron", has(ItemList.itemRawShadowIron.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawshadowiron"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawSilver), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpSilver.get(), 3),true)
                .unlockedBy("purifyrawsilver", has(ItemList.itemRawSilver.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawsilver"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawTantalum), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTantalum.get(), 3),true)
                .unlockedBy("purifyrawtantalum", has(ItemList.itemRawTantalum.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawtantalum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawTartarite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTartarite.get(), 3),true)
                .unlockedBy("purifyrawtartarite", has(ItemList.itemRawTartarite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawtartarite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawTechnetium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTechnetium.get(), 3),true)
                .unlockedBy("purifyrawtechnetium", has(ItemList.itemRawTechnetium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawtechnetium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawThallium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpThallium.get(), 3),true)
                .unlockedBy("purifyrawthallium", has(ItemList.itemRawThallium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawthallium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawTin), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTin.get(), 3),true)
                .unlockedBy("purifyrawtin", has(ItemList.itemRawTin.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawtin"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawTitanium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTitanium.get(), 3),true)
                .unlockedBy("purifyrawtitanium", has(ItemList.itemRawTitanium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawtitanium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawTritium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTritium.get(), 3),true)
                .unlockedBy("purifyrawtritium", has(ItemList.itemRawTritium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawtritium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawTungsten), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTungsten.get(), 3),true)
                .unlockedBy("purifyrawtungsten", has(ItemList.itemRawTungsten.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawtungsten"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawUnobtainium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpUnobtainium.get(), 3),true)
                .unlockedBy("purifyrawunobtainium", has(ItemList.itemRawUnobtainium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawunobtainium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawUranium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpUranium.get(), 3),true)
                .unlockedBy("purifyrawuranium", has(ItemList.itemRawUranium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawuranium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawVanadium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpVanadium.get(), 3),true)
                .unlockedBy("purifyrawvanadium", has(ItemList.itemRawVanadium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawvanadium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawVibranium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpVibranium.get(), 3),true)
                .unlockedBy("purifyrawvibranium", has(ItemList.itemRawVibranium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawvibranium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawVulcanite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpVulcanite.get(), 3),true)
                .unlockedBy("purifyrawvulcanite", has(ItemList.itemRawVulcanite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawvulcanite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawVyroxeres), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpVyroxeres.get(), 3),true)
                .unlockedBy("purifyrawvyroxeres", has(ItemList.itemRawVyroxeres.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawvyroxeres"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawYellorite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpYellorite.get(), 3),true)
                .unlockedBy("purifyrawyellorite", has(ItemList.itemRawYellorite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawyellorite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawZinc), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpZinc.get(), 3),true)
                .unlockedBy("purifyrawzinc", has(ItemList.itemRawZinc.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawzinc"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawZirconium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpZirconium.get(), 3),true)
                .unlockedBy("purifyrawzirconium", has(ItemList.itemRawZirconium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrawzirconium"));
        //Shard
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardBismuth), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpBismuth.get()),true)
                .unlockedBy("purifybismuth", has(ItemList.itemShardBismuth.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifybismuth"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardAldourite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAldourite.get()),true)
                .unlockedBy("purifyaldourite", has(ItemList.itemShardAldourite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyaldourite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardAluminum), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAluminum.get()),true)
                .unlockedBy("purifyaluminum", has(ItemList.itemShardAluminum.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyaluminum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardAmericium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAmericium.get()),true)
                .unlockedBy("purifyamericium", has(ItemList.itemShardAmericium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyamericium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardAmordrine), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAmordrine.get()),true)
                .unlockedBy("purifyamordrine", has(ItemList.itemShardAmordrine.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyamordrine"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardAngmallen), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAngmallen.get()),true)
                .unlockedBy("purifyangmallen", has(ItemList.itemShardAngmallen.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyangmallen"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardAstralSilver), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAstralSilver.get()),true)
                .unlockedBy("purifyastralsilver", has(ItemList.itemShardAstralSilver.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyastralsilver"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardAtlarus), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpAtlarus.get()),true)
                .unlockedBy("purifyatlarus", has(ItemList.itemShardAtlarus.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyatlarus"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardAzureSilver),ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1),new ItemStack(ItemList.itemClumpAzureSilver.get()),true)
                .unlockedBy("purifyazuresilver",has(ItemList.itemShardAzureSilver.get()))
                .build(consumer,ResourceLocation.parse("extraores:purifyazuresilver"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardBismuth), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpBismuth.get()),true)
                .unlockedBy("purifybismuth", has(ItemList.itemShardBismuth.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifybismuth"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardBlackSteel), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpBlackSteel.get()),true)
                .unlockedBy("purifyblacksteel", has(ItemList.itemShardBlackSteel.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyblacksteel"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardCadmium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCadmium.get()),true)
                .unlockedBy("purifycadmium", has(ItemList.itemShardCadmium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifycadmium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardCarmot), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCarmot.get()),true)
                .unlockedBy("purifycarmot", has(ItemList.itemShardCarmot.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifycarmot"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardCelenegil), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCelenegil.get()),true)
                .unlockedBy("purifycelenegil", has(ItemList.itemShardCelenegil.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifycelenegil"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardCeruclase), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCeruclase.get()),true)
                .unlockedBy("purifyceruclase", has(ItemList.itemShardCeruclase.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyceruclase"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardChromium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpChromium.get()),true)
                .unlockedBy("purifychromium", has(ItemList.itemShardChromium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifychromium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardCobalt), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCobalt.get()),true)
                .unlockedBy("purifycobalt", has(ItemList.itemShardCobalt.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifycobalt"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardCopper), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCopper.get()),true)
                .unlockedBy("purifycopper", has(ItemList.itemShardCopper.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifycopper"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardCrimsonSteel), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpCrimsonSteel.get()),true)
                .unlockedBy("purifycrimsonsteel", has(ItemList.itemShardCrimsonSteel.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifycrimsonsteel"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardDeepIron), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpDeepIron.get()),true)
                .unlockedBy("purifydeepiron", has(ItemList.itemShardDeepIron.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifydeepiron"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardDesichalkos), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpDesichalkos.get()),true)
                .unlockedBy("purifydesichalkos", has(ItemList.itemShardDesichalkos.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifydesichalkos"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardEximite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpEximite.get()),true)
                .unlockedBy("purifyeximite", has(ItemList.itemShardEximite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyeximite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardGallium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpGallium.get()),true)
                .unlockedBy("purifygallium", has(ItemList.itemShardGallium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifygallium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardHaderoth), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpHaderoth.get()),true)
                .unlockedBy("purifyhaderoth", has(ItemList.itemShardHaderoth.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyhaderoth"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardHepatizon), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpHepatizon.get()),true)
                .unlockedBy("purifyhepatizon", has(ItemList.itemShardHepatizon.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyhepatizon"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardIgnatius), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpIgnatius.get()),true)
                .unlockedBy("purifyignatius", has(ItemList.itemShardIgnatius.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyignatius"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardIndium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpIndium.get()),true)
                .unlockedBy("purifyindium", has(ItemList.itemShardIndium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyindium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardInfuscolium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpInfuscolium.get()),true)
                .unlockedBy("purifyinfuscolium", has(ItemList.itemShardInfuscolium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyinfuscolium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardInolashite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpInolashite.get()),true)
                .unlockedBy("purifyinolashite", has(ItemList.itemShardInolashite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyinolashite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardIridium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpIridium.get()),true)
                .unlockedBy("purifyiridium", has(ItemList.itemShardIridium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyiridium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardKalendrite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpKalendrite.get()),true)
                .unlockedBy("purifykalendrite", has(ItemList.itemShardKalendrite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifykalendrite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardLead), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpLead.get()),true)
                .unlockedBy("purifylead", has(ItemList.itemShardLead.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifylead"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardLemurite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpLemurite.get()),true)
                .unlockedBy("purifylemurite", has(ItemList.itemShardLemurite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifylemurite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardManganese), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpManganese.get()),true)
                .unlockedBy("purifymanganese", has(ItemList.itemShardManganese.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifymanganese"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardMeutoite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpMeutoite.get()),true)
                .unlockedBy("purifymeutoite", has(ItemList.itemShardMeutoite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifymeutoite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardMidasium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpMidasium.get()),true)
                .unlockedBy("purifymidasium", has(ItemList.itemShardMidasium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifymidasium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardMithril), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpMithril.get()),true)
                .unlockedBy("purifymithril", has(ItemList.itemShardMithril.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifymithril"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardMolybdenum), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpMolybdenum.get()),true)
                .unlockedBy("purifymolybdenum", has(ItemList.itemShardMolybdenum.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifymolybdenum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardNeodymium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpNeodymium.get()),true)
                .unlockedBy("purifyneodymium", has(ItemList.itemShardNeodymium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyneodymium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardNeptunium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpNeptunium.get()),true)
                .unlockedBy("purifyneptunium", has(ItemList.itemShardNeptunium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyneptunium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardNickel), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpNickel.get()),true)
                .unlockedBy("purifynickel", has(ItemList.itemShardNickel.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifynickel"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardNiobium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpNiobium.get()),true)
                .unlockedBy("purifyniobium", has(ItemList.itemShardNiobium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyniobium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardOrichalcum), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpOrichalcum.get()),true)
                .unlockedBy("purifyorichalcum", has(ItemList.itemShardOrichalcum.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyorichalcum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardOsmium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpOsmium.get()),true)
                .unlockedBy("purifyosmium", has(ItemList.itemShardOsmium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyosmium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardOureclase), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpOureclase.get()),true)
                .unlockedBy("purifyoureclase", has(ItemList.itemShardOureclase.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyoureclase"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardPalladium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpPalladium.get()),true)
                .unlockedBy("purifypalladium", has(ItemList.itemShardPalladium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifypalladium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardPlatinum), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpPlatinum.get()),true)
                .unlockedBy("purifyplatinum", has(ItemList.itemShardPlatinum.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyplatinum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardPlutonium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpPlutonium.get()),true)
                .unlockedBy("purifyplutonium", has(ItemList.itemShardPlutonium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyplutonium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardPolonium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpPolonium.get()),true)
                .unlockedBy("purifypolonium", has(ItemList.itemShardPolonium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifypolonium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardPromethium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpPromethium.get()),true)
                .unlockedBy("purifypromethium", has(ItemList.itemShardPromethium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifypromethium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardRhenium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpRhenium.get()),true)
                .unlockedBy("purifyrhenium", has(ItemList.itemShardRhenium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrhenium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardRhodium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpRhodium.get()),true)
                .unlockedBy("purifyrhodium", has(ItemList.itemShardRhodium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrhodium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardRubracium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpRubracium.get()),true)
                .unlockedBy("purifyrubracium", has(ItemList.itemShardRubracium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyrubracium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardRuthenium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpRuthenium.get()),true)
                .unlockedBy("purifyruthenium", has(ItemList.itemShardRuthenium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyruthenium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardSanguinite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpSanguinite.get()),true)
                .unlockedBy("purifysanguinite", has(ItemList.itemShardSanguinite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifysanguinite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardShadowIron), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpShadowIron.get()),true)
                .unlockedBy("purifyshadowiron", has(ItemList.itemShardShadowIron.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyshadowiron"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardSilver), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpSilver.get()),true)
                .unlockedBy("purifysilver", has(ItemList.itemShardSilver.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifysilver"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardTantalum), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTantalum.get()),true)
                .unlockedBy("purifytantalum", has(ItemList.itemShardTantalum.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifytantalum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardTartarite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTartarite.get()),true)
                .unlockedBy("purifytartarite", has(ItemList.itemShardTartarite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifytartarite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardTechnetium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTechnetium.get()),true)
                .unlockedBy("purifytechnetium", has(ItemList.itemShardTechnetium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifytechnetium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardThallium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpThallium.get()),true)
                .unlockedBy("purifythallium", has(ItemList.itemShardThallium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifythallium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardTin), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTin.get()),true)
                .unlockedBy("purifytin", has(ItemList.itemShardTin.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifytin"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardTitanium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTitanium.get()),true)
                .unlockedBy("purifytitanium", has(ItemList.itemShardTitanium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifytitanium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardTritium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTritium.get()),true)
                .unlockedBy("purifytritium", has(ItemList.itemShardTritium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifytritium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardTungsten), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpTungsten.get()),true)
                .unlockedBy("purifytungsten", has(ItemList.itemShardTungsten.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifytungsten"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardUnobtainium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpUnobtainium.get()),true)
                .unlockedBy("purifyunobtainium", has(ItemList.itemShardUnobtainium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyunobtainium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardUranium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpUranium.get()),true)
                .unlockedBy("purifyuranium", has(ItemList.itemShardUranium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyuranium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardVanadium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpVanadium.get()),true)
                .unlockedBy("purifyvanadium", has(ItemList.itemShardVanadium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyvanadium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardVibranium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpVibranium.get()),true)
                .unlockedBy("purifyvibranium", has(ItemList.itemShardVibranium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyvibranium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardVulcanite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpVulcanite.get()),true)
                .unlockedBy("purifyvulcanite", has(ItemList.itemShardVulcanite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyvulcanite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardVyroxeres), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpVyroxeres.get()),true)
                .unlockedBy("purifyvyroxeres", has(ItemList.itemShardVyroxeres.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyvyroxeres"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardYellorite), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpYellorite.get()),true)
                .unlockedBy("purifyyellorite", has(ItemList.itemShardYellorite.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyyellorite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardZinc), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpZinc.get()),true)
                .unlockedBy("purifyzinc", has(ItemList.itemShardZinc.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyzinc"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardZirconium), ChemicalStackIngredient.of(IngredientCreatorAccess.chemical().of(MekanismAPI.CHEMICAL_REGISTRY.get(ResourceLocation.parse("mekanism:oxygen"))),1), new ItemStack(ItemList.itemClumpZirconium.get()),true)
                .unlockedBy("purifyzirconium", has(ItemList.itemShardZirconium.get()))
                .build(consumer, ResourceLocation.parse("extraores:purifyzirconium"));
    }

    protected void buildMekanismCrushing(RecipeOutput consumer)
    {
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpBismuth), new ItemStack(ItemList.itemDirtyDustBismuth.get()))
                .unlockedBy("crushbismuth", has(ItemList.itemClumpBismuth.get()))
                .build(consumer, ResourceLocation.parse("extraores:crushbismuth"));
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
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreBismuth), new ItemStack(ItemList.itemDustBismuth.get(), 2))
                .unlockedBy("enrichbismuthore", has(BlockList.blockOreBismuth.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichbismuthore"));
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
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawBismuth), new ItemStack(ItemList.itemDustBismuth.get(), 2))
                .unlockedBy("enrichrawbismuth", has(ItemList.itemRawBismuth.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichrawbismuth"));
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
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustBismuth), new ItemStack(ItemList.itemDustBismuth.get()))
                .unlockedBy("enrichbismuthdirtydust", has(BlockList.blockOreBismuth.get()))
                .build(consumer, ResourceLocation.parse("extraores:enrichbismuthdirtydust"));
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
    }*/
}
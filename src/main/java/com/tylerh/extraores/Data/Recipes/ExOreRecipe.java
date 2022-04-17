package com.tylerh.extraores.Data.Recipes;

import com.tylerh.extraores.Data.Tags.ItemTagList;
import com.tylerh.extraores.Init.BlockList;
import com.tylerh.extraores.Init.ItemList;
import mekanism.api.MekanismAPI;
import mekanism.api.chemical.gas.GasStack;
import mekanism.api.datagen.recipe.builder.ItemStackChemicalToItemStackRecipeBuilder;
import mekanism.api.datagen.recipe.builder.ItemStackToItemStackRecipeBuilder;
import mekanism.api.recipes.ingredients.creator.IngredientCreatorAccess;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.data.*;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Consumer;

public class ExOreRecipe extends RecipeProvider
{
    public ExOreRecipe(DataGenerator gen)
    {
        super(gen);
    }
    @Override
    @ParametersAreNonnullByDefault
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer)
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
    protected void buildShapedRecipes(Consumer<FinishedRecipe> consumer)
    {
        ShapedRecipeBuilder.shaped(BlockList.blockAdamantine)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotAdamantine)
                .unlockedBy("adamantineblock",has(BlockList.blockAdamantine))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockAgate)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i',ItemList.itemGemAgate)
                .unlockedBy("agateblock",has(BlockList.blockAgate))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockAldourite)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i',ItemList.itemIngotAldourite)
                .unlockedBy("aldouriteblock",has(BlockList.blockAldourite))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockAluminum)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotAluminum)
                .unlockedBy("aluminumblock",has(BlockList.blockAluminum))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockAmericium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i',ItemList.itemIngotAmericium)
                .unlockedBy("americiumblock",has(BlockList.blockAmericium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockAmethyst)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i',ItemList.itemGemAmethyst)
                .unlockedBy("amethystblock",has(BlockList.blockAmethyst))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockAmetrine)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i',ItemList.itemGemAmetrine)
                .unlockedBy("ametrineblock",has(BlockList.blockAmetrine))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockAmordrine)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotAmordrine)
                .unlockedBy("amordrineblock",has(BlockList.blockAmordrine))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockAngmallen)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotAngmallen)
                .unlockedBy("angmallenblock",has(BlockList.blockAngmallen))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockAquamarine)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i',ItemList.itemGemAquamarine)
                .unlockedBy("aquamarineblock",has(BlockList.blockAquamarine))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockAstralSilver)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotAstralSilver)
                .unlockedBy("astralsilverblock",has(BlockList.blockAstralSilver))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockAtlarus)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotAtlarus)
                .unlockedBy("atlarusblock",has(BlockList.blockAtlarus))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockBismuth)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotBismuth)
                .unlockedBy("bismuthblock",has(BlockList.blockBismuth))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockBlackSteel)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotBlackSteel)
                .unlockedBy("blacksteelblock",has(BlockList.blockBlackSteel))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockCadmium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotCadmium)
                .unlockedBy("cadmiumblock",has(BlockList.blockCadmium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockCarmot)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotCarmot)
                .unlockedBy("carmotblock",has(BlockList.blockCarmot))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockCelenegil)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotCelenegil)
                .unlockedBy("celenegilblock",has(BlockList.blockCelenegil))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockCeruclase)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotCeruclase)
                .unlockedBy("ceruclaseblock",has(BlockList.blockCeruclase))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockChromium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotChromium)
                .unlockedBy("chromiumblock",has(BlockList.blockChromium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockChrysocolla)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i',ItemList.itemGemChrysocolla)
                .unlockedBy("chrysocollablock",has(BlockList.blockChrysocolla))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockCitrine)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i',ItemList.itemGemCitrine)
                .unlockedBy("citrineblock",has(BlockList.blockCitrine))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockCobalt)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotCobalt)
                .unlockedBy("cobaltblock",has(BlockList.blockCobalt))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockCopper)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotCopper)
                .unlockedBy("copperblock",has(BlockList.blockCopper))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockDeepIron)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotDeepIron)
                .unlockedBy("deepironblock",has(BlockList.blockDeepIron))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockDesichalkos)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotDesichalkos)
                .unlockedBy("desichalkosblock",has(BlockList.blockDesichalkos))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockEximite)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotEximite)
                .unlockedBy("eximiteblock",has(BlockList.blockEximite))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockGallium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotGallium)
                .unlockedBy("galliumblock",has(BlockList.blockGallium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockGarnet)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i',ItemList.itemGemGarnet)
                .unlockedBy("garnetblock",has(BlockList.blockGarnet))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockHaderoth)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotHaderoth)
                .unlockedBy("haderothblock",has(BlockList.blockHaderoth))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockHepatizon)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotHepatizon)
                .unlockedBy("hepatizonblock",has(BlockList.blockHepatizon))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockIgnatius)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotIgnatius)
                .unlockedBy("ignatiusblock",has(BlockList.blockIgnatius))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockIndium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotIndium)
                .unlockedBy("indiumblock",has(BlockList.blockIndium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockInfuscolium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotInfuscolium)
                .unlockedBy("infuscoliumblock",has(BlockList.blockInfuscolium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockInolashite)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotInolashite)
                .unlockedBy("inolashiteblock",has(BlockList.blockInolashite))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockIolite)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i',ItemList.itemGemIolite)
                .unlockedBy("ioliteblock",has(BlockList.blockIolite))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockIridium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i',ItemList.itemIngotIridium)
                .unlockedBy("iridiumblock",has(BlockList.blockIridium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockJade)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i',ItemList.itemGemJade)
                .unlockedBy("jadeblock",has(BlockList.blockJade))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockJasper)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i',ItemList.itemGemJasper)
                .unlockedBy("jasperblock",has(BlockList.blockJasper))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockKalendrite)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotKalendrite)
                .unlockedBy("kalendriteblock",has(BlockList.blockKalendrite))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockKyanite)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i',ItemList.itemGemKyanite)
                .unlockedBy("kyaniteblock",has(BlockList.blockKyanite))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockLead)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotLead)
                .unlockedBy("leadblock",has(BlockList.blockLead))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockLemurite)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotLemurite)
                .unlockedBy("lemuriteblock",has(BlockList.blockLemurite))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockMalachite)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i',ItemList.itemGemMalachite)
                .unlockedBy("malachiteblock",has(BlockList.blockMalachite))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockManganese)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotManganese)
                .unlockedBy("manganeseblock",has(BlockList.blockManganese))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockMeutoite)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotMeutoite)
                .unlockedBy("meutoiteblock",has(BlockList.blockMeutoite))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockMidasium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotMidasium)
                .unlockedBy("midasiumblock",has(BlockList.blockMidasium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockMithril)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotMithril)
                .unlockedBy("mithrilblock",has(BlockList.blockMithril))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockMolybdenum)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotMolybdenum)
                .unlockedBy("molybdenumblock",has(BlockList.blockMolybdenum))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockNeodymium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotNeodymium)
                .unlockedBy("neodymiumblock",has(BlockList.blockNeodymium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockNeptunium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i',ItemList.itemIngotNeptunium)
                .unlockedBy("neptuniumblock",has(BlockList.blockNeptunium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockNickel)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotNickel)
                .unlockedBy("nickelblock",has(BlockList.blockNickel))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockNiobium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotNiobium)
                .unlockedBy("niobiumblock",has(BlockList.blockNiobium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockOnyx)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i',ItemList.itemGemOnyx)
                .unlockedBy("onyxblock",has(BlockList.blockOnyx))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockOpal)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i',ItemList.itemGemOpal)
                .unlockedBy("opalblock",has(BlockList.blockOpal))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockOrichalcum)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotOrichalcum)
                .unlockedBy("orichalcumblock",has(BlockList.blockOrichalcum))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockOsmium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i',ItemList.itemIngotOsmium)
                .unlockedBy("osmiumblock",has(BlockList.blockOsmium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockOureclase)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotOureclase)
                .unlockedBy("oureclaseblock",has(BlockList.blockOureclase))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockPalladium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotPalladium)
                .unlockedBy("palladiumblock",has(BlockList.blockPalladium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockPeridot)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i',ItemList.itemGemPeridot)
                .unlockedBy("peridotblock",has(BlockList.blockPeridot))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockPhoenixite)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i',ItemList.itemGemPhoenixite)
                .unlockedBy("phoenixiteblock",has(BlockList.blockPhoenixite))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockPlatinum)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotPlatinum)
                .unlockedBy("platinumblock",has(BlockList.blockPlatinum))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockPlutonium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i',ItemList.itemIngotPlutonium)
                .unlockedBy("plutoniumblock",has(BlockList.blockPlutonium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockPolonium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i',ItemList.itemIngotPolonium)
                .unlockedBy("poloniumblock",has(BlockList.blockPolonium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockPromethium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotPromethium)
                .unlockedBy("promethiumblock",has(BlockList.blockPromethium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockQuartz)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i',ItemList.itemGemQuartz)
                .unlockedBy("quartzblock",has(BlockList.blockQuartz))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockRhenium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i',ItemList.itemIngotRhenium)
                .unlockedBy("rheniumblock",has(BlockList.blockRhenium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockRhodium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotRhodium)
                .unlockedBy("rhodiumblock",has(BlockList.blockRhodium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockRubracium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotRubracium)
                .unlockedBy("rubraciumblock",has(BlockList.blockRubracium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockRuby)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i',ItemList.itemGemRuby)
                .unlockedBy("rubyblock",has(BlockList.blockRuby))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockRuthenium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotRuthenium)
                .unlockedBy("rutheniumblock",has(BlockList.blockRuthenium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockSanguinite)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotSanguinite)
                .unlockedBy("sanguiniteblock",has(BlockList.blockSanguinite))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockSapphire)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i',ItemList.itemGemSapphire)
                .unlockedBy("sapphireblock",has(BlockList.blockSapphire))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockShadowIron)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotShadowIron)
                .unlockedBy("shadowironblock",has(BlockList.blockShadowIron))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockSilver)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotSilver)
                .unlockedBy("silverblock",has(BlockList.blockSilver))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockSpinel)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i',ItemList.itemGemSpinel)
                .unlockedBy("spinelblock",has(BlockList.blockSpinel))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockSugilite)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i',ItemList.itemGemSugilite)
                .unlockedBy("sugiliteore",has(BlockList.blockSugilite))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockTantalum)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i',ItemList.itemIngotTantalum)
                .unlockedBy("tantalumblock",has(BlockList.blockTantalum))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockTanzanite)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i',ItemList.itemGemTanzanite)
                .unlockedBy("tanzaniteblock",has(BlockList.blockTanzanite))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockTartarite)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotTartarite)
                .unlockedBy("tartariteblock",has(BlockList.blockTartarite))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockTechnetium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotTechnetium)
                .unlockedBy("technetiumblock",has(BlockList.blockTechnetium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockThallium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotThallium)
                .unlockedBy("thalliumblock",has(BlockList.blockThallium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockTin)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotTin)
                .unlockedBy("tinblock",has(BlockList.blockTin))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockTitanium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotTitanium)
                .unlockedBy("titaniumblock",has(BlockList.blockTitanium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockTopaz)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i',ItemList.itemGemTopaz)
                .unlockedBy("topazblock",has(BlockList.blockTopaz))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockTourmaline)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i',ItemList.itemGemTourmaline)
                .unlockedBy("tourmalineblock",has(BlockList.blockTourmaline))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockTungsten)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotTungsten)
                .unlockedBy("tungstenblock",has(BlockList.blockTungsten))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockTurquoise)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i',ItemList.itemGemTurquoise)
                .unlockedBy("turquoiseblock",has(BlockList.blockTurquoise))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockUnobtainium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotUnobtainium)
                .unlockedBy("unobtainiumblock",has(BlockList.blockUnobtainium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockUranium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i',ItemList.itemIngotUranium)
                .unlockedBy("uraniumblock",has(BlockList.blockUranium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockVanadium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotVanadium)
                .unlockedBy("vanadiumblock",has(BlockList.blockVanadium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockVulcanite)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotVulcanite)
                .unlockedBy("vulcaniteblock",has(BlockList.blockVulcanite))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockVyroxeres)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotVyroxeres)
                .unlockedBy("vyroxeresblock",has(BlockList.blockVyroxeres))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockYellorite)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i',ItemList.itemIngotYellorite)
                .unlockedBy("yelloriteblock",has(BlockList.blockYellorite))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockZinc)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotZinc)
                .unlockedBy("zincblock",has(BlockList.blockZinc))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockZirconium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotZirconium)
                .unlockedBy("zirconiumblock",has(BlockList.blockZirconium))
                .save(consumer);
    }
    protected void buildShapelessRecipes(Consumer<FinishedRecipe> consumer)
    {
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotAdamantine,9)
                .requires(Ingredient.of(BlockList.blockAdamantine.asItem()))
                .unlockedBy("adamantineingot",has(ItemList.itemIngotAdamantine))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemAgate,9)
                .requires(Ingredient.of(BlockList.blockAgate.asItem()))
                .unlockedBy("agate",has(ItemList.itemGemAgate))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotAldourite,9)
                .requires(Ingredient.of(BlockList.blockAldourite.asItem()))
                .unlockedBy("aldouriteingot",has(ItemList.itemIngotAldourite))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotAluminum,9)
                .requires(Ingredient.of(BlockList.blockAluminum.asItem()))
                .unlockedBy("aluminumingot",has(ItemList.itemIngotAluminum))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotAmericium,9)
                .requires(Ingredient.of(BlockList.blockAmericium.asItem()))
                .unlockedBy("americiumingot",has(ItemList.itemIngotAmericium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemAmethyst,9)
                .requires(Ingredient.of(BlockList.blockAmethyst.asItem()))
                .unlockedBy("amethyst",has(ItemList.itemGemAmethyst))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemAmetrine,9)
                .requires(Ingredient.of(BlockList.blockAmetrine))
                .unlockedBy("ametrine",has(ItemList.itemGemAmetrine))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotAmordrine,9)
                .requires(Ingredient.of(BlockList.blockAmordrine.asItem()))
                .unlockedBy("amordrineingot",has(ItemList.itemIngotAmordrine))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotAngmallen,9)
                .requires(Ingredient.of(BlockList.blockAngmallen.asItem()))
                .unlockedBy("angmalleningot",has(ItemList.itemIngotAngmallen))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemAquamarine,9)
                .requires(Ingredient.of(BlockList.blockAquamarine.asItem()))
                .unlockedBy("aquamarine",has(ItemList.itemGemAquamarine))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotAstralSilver,9)
                .requires(Ingredient.of(BlockList.blockAstralSilver.asItem()))
                .unlockedBy("astralsilveringot",has(ItemList.itemIngotAstralSilver))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotAtlarus,9)
                .requires(Ingredient.of(BlockList.blockAtlarus.asItem()))
                .unlockedBy("atlarusingot",has(ItemList.itemIngotAtlarus))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotBismuth,9)
                .requires(Ingredient.of(BlockList.blockBismuth.asItem()))
                .unlockedBy("bismuthingot",has(ItemList.itemIngotBismuth))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotBlackSteel,9)
                .requires(Ingredient.of(BlockList.blockBlackSteel.asItem()))
                .unlockedBy("blacksteelingot",has(ItemList.itemIngotBlackSteel))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotCadmium,9)
                .requires(Ingredient.of(BlockList.blockCadmium.asItem()))
                .unlockedBy("cadmiumingot",has(ItemList.itemIngotCadmium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotCarmot,9)
                .requires(Ingredient.of(BlockList.blockCarmot.asItem()))
                .unlockedBy("carmotingot",has(ItemList.itemIngotCarmot))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotCelenegil,9)
                .requires(Ingredient.of(BlockList.blockCelenegil.asItem()))
                .unlockedBy("celenegilingot",has(ItemList.itemIngotCelenegil))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotCeruclase,9)
                .requires(Ingredient.of(BlockList.blockCeruclase.asItem()))
                .unlockedBy("ceruclaseingot",has(ItemList.itemIngotCeruclase))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotChromium,9)
                .requires(Ingredient.of(BlockList.blockChromium.asItem()))
                .unlockedBy("chromiumingot",has(ItemList.itemIngotChromium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemChrysocolla,9)
                .requires(Ingredient.of(BlockList.blockChrysocolla.asItem()))
                .unlockedBy("chrysocolla",has(ItemList.itemGemChrysocolla))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemCitrine,9)
                .requires(Ingredient.of(BlockList.blockCitrine.asItem()))
                .unlockedBy("citrine",has(ItemList.itemGemCitrine))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotCobalt,9)
                .requires(Ingredient.of(BlockList.blockCobalt.asItem()))
                .unlockedBy("cobaltingot",has(ItemList.itemIngotCobalt))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotCopper,9)
                .requires(Ingredient.of(BlockList.blockCopper.asItem()))
                .unlockedBy("copperingot",has(ItemList.itemIngotCopper))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotDeepIron,9)
                .requires(Ingredient.of(BlockList.blockDeepIron.asItem()))
                .unlockedBy("deepironingot",has(ItemList.itemIngotDeepIron))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotDesichalkos,9)
                .requires(Ingredient.of(BlockList.blockDesichalkos.asItem()))
                .unlockedBy("desichalkosingot",has(ItemList.itemIngotDesichalkos))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotEximite,9)
                .requires(Ingredient.of(BlockList.blockEximite.asItem()))
                .unlockedBy("eximiteingot",has(ItemList.itemIngotEximite))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotGallium,9)
                .requires(Ingredient.of(BlockList.blockGallium.asItem()))
                .unlockedBy("galliumingot",has(ItemList.itemIngotGallium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemGarnet,9)
                .requires(Ingredient.of(BlockList.blockGarnet.asItem()))
                .unlockedBy("garnet",has(ItemList.itemGemGarnet))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotHaderoth,9)
                .requires(Ingredient.of(BlockList.blockHaderoth.asItem()))
                .unlockedBy("haderothingot",has(ItemList.itemIngotHaderoth))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotHepatizon,9)
                .requires(Ingredient.of(BlockList.blockHepatizon.asItem()))
                .unlockedBy("hepatizoningot",has(ItemList.itemIngotHepatizon))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotIgnatius,9)
                .requires(Ingredient.of(BlockList.blockIgnatius.asItem()))
                .unlockedBy("ignatiusingot",has(ItemList.itemIngotIgnatius))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotIndium,9)
                .requires(Ingredient.of(BlockList.blockIndium.asItem()))
                .unlockedBy("indiumingot",has(ItemList.itemIngotIndium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotInfuscolium,9)
                .requires(Ingredient.of(BlockList.blockInfuscolium.asItem()))
                .unlockedBy("infuscoliumingot",has(ItemList.itemIngotInfuscolium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotInolashite,9)
                .requires(Ingredient.of(BlockList.blockInolashite.asItem()))
                .unlockedBy("inolashiteingot",has(ItemList.itemIngotInolashite))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemIolite,9)
                .requires(Ingredient.of(BlockList.blockIolite.asItem()))
                .unlockedBy("iolite",has(ItemList.itemGemIolite))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotIridium,9)
                .requires(Ingredient.of(BlockList.blockIridium.asItem()))
                .unlockedBy("iridiumingot",has(ItemList.itemIngotIridium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemJade,9)
                .requires(Ingredient.of(BlockList.blockJade.asItem()))
                .unlockedBy("jade",has(ItemList.itemGemJade))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemJasper,9)
                .requires(Ingredient.of(BlockList.blockJasper.asItem()))
                .unlockedBy("jasper",has(ItemList.itemGemJasper))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotKalendrite,9)
                .requires(Ingredient.of(BlockList.blockKalendrite.asItem()))
                .unlockedBy("kalendriteingot",has(ItemList.itemIngotKalendrite))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemKyanite,9)
                .requires(Ingredient.of(BlockList.blockKyanite.asItem()))
                .unlockedBy("kyanite",has(ItemList.itemGemKyanite))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotLead,9)
                .requires(Ingredient.of(BlockList.blockLead.asItem()))
                .unlockedBy("leadingot",has(ItemList.itemIngotLead))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotLemurite,9)
                .requires(Ingredient.of(BlockList.blockLemurite.asItem()))
                .unlockedBy("lemuriteingot",has(ItemList.itemIngotLemurite))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemMalachite,9)
                .requires(Ingredient.of(BlockList.blockMalachite))
                .unlockedBy("malachite",has(ItemList.itemGemMalachite))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotManganese,9)
                .requires(Ingredient.of(BlockList.blockManganese.asItem()))
                .unlockedBy("manganeseingot",has(ItemList.itemIngotManganese))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotMeutoite,9)
                .requires(Ingredient.of(BlockList.blockMeutoite.asItem()))
                .unlockedBy("meutoiteingot",has(ItemList.itemIngotMeutoite))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotMidasium,9)
                .requires(Ingredient.of(BlockList.blockMidasium.asItem()))
                .unlockedBy("midasiumingot",has(ItemList.itemIngotMidasium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotMithril,9)
                .requires(Ingredient.of(BlockList.blockMithril.asItem()))
                .unlockedBy("mithrilingot",has(ItemList.itemIngotMithril))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotMolybdenum,9)
                .requires(Ingredient.of(BlockList.blockMolybdenum.asItem()))
                .unlockedBy("molybdenumingot",has(ItemList.itemIngotMolybdenum))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotNeodymium,9)
                .requires(Ingredient.of(BlockList.blockNeodymium.asItem()))
                .unlockedBy("neodymiumingot",has(ItemList.itemIngotNeodymium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotNeptunium,9)
                .requires(Ingredient.of(BlockList.blockNeptunium.asItem()))
                .unlockedBy("neptuniumingot",has(ItemList.itemIngotNeptunium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotNickel,9)
                .requires(Ingredient.of(BlockList.blockNickel.asItem()))
                .unlockedBy("nickelingot",has(ItemList.itemIngotNickel))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotNiobium,9)
                .requires(Ingredient.of(BlockList.blockNiobium.asItem()))
                .unlockedBy("niobiumingot",has(ItemList.itemIngotNiobium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemOnyx,9)
                .requires(Ingredient.of(BlockList.blockOnyx.asItem()))
                .unlockedBy("onyx",has(ItemList.itemGemOnyx))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemOpal,9)
                .requires(Ingredient.of(BlockList.blockOpal.asItem()))
                .unlockedBy("opal",has(ItemList.itemGemOpal))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotOrichalcum,9)
                .requires(Ingredient.of(BlockList.blockOrichalcum.asItem()))
                .unlockedBy("orichalcumingot",has(ItemList.itemIngotOrichalcum))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotOsmium,9)
                .requires(Ingredient.of(BlockList.blockOsmium.asItem()))
                .unlockedBy("osmiumingot",has(ItemList.itemIngotOsmium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotOureclase,9)
                .requires(Ingredient.of(BlockList.blockOureclase.asItem()))
                .unlockedBy("oureclaseingot",has(ItemList.itemIngotOureclase))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotPalladium,9)
                .requires(Ingredient.of(BlockList.blockPalladium.asItem()))
                .unlockedBy("palladiumingot",has(ItemList.itemIngotPalladium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemPeridot,9)
                .requires(Ingredient.of(BlockList.blockPeridot.asItem()))
                .unlockedBy("peridot",has(ItemList.itemGemPeridot))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemPhoenixite,9)
                .requires(Ingredient.of(BlockList.blockPhoenixite.asItem()))
                .unlockedBy("phoenixite",has(ItemList.itemGemPhoenixite))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotPlatinum,9)
                .requires(Ingredient.of(BlockList.blockPlatinum.asItem()))
                .unlockedBy("platinumingot",has(ItemList.itemIngotPlatinum))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotPlutonium,9)
                .requires(Ingredient.of(BlockList.blockPlutonium.asItem()))
                .unlockedBy("plutoniumingot",has(ItemList.itemIngotPlutonium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotPolonium,9)
                .requires(Ingredient.of(BlockList.blockPolonium.asItem()))
                .unlockedBy("poloniumingot",has(ItemList.itemIngotPolonium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotPromethium,9)
                .requires(Ingredient.of(BlockList.blockPromethium.asItem()))
                .unlockedBy("promethiumingot",has(ItemList.itemIngotPromethium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemQuartz,9)
                .requires(Ingredient.of(BlockList.blockQuartz.asItem()))
                .unlockedBy("quartz",has(ItemList.itemGemQuartz))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotRhenium,9)
                .requires(Ingredient.of(BlockList.blockRhenium.asItem()))
                .unlockedBy("rheniumingot",has(ItemList.itemIngotRhenium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotRhodium,9)
                .requires(Ingredient.of(BlockList.blockRhodium.asItem()))
                .unlockedBy("rhodiumingot",has(ItemList.itemIngotRhodium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotRubracium,9)
                .requires(Ingredient.of(BlockList.blockRubracium.asItem()))
                .unlockedBy("rubraciumingot",has(ItemList.itemIngotRubracium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemRuby,9)
                .requires(Ingredient.of(BlockList.blockRuby.asItem()))
                .unlockedBy("ruby",has(ItemList.itemGemRuby))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotRuthenium,9)
                .requires(Ingredient.of(BlockList.blockRuthenium.asItem()))
                .unlockedBy("rutheniumingot",has(ItemList.itemIngotRuthenium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotSanguinite,9)
                .requires(Ingredient.of(BlockList.blockSanguinite.asItem()))
                .unlockedBy("sanguiniteingot",has(ItemList.itemIngotSanguinite))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemSapphire,9)
                .requires(Ingredient.of(BlockList.blockSapphire.asItem()))
                .unlockedBy("sapphire",has(ItemList.itemGemSapphire))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotShadowIron,9)
                .requires(Ingredient.of(BlockList.blockShadowIron.asItem()))
                .unlockedBy("shadowironingot",has(ItemList.itemIngotShadowIron))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotSilver,9)
                .requires(Ingredient.of(BlockList.blockSilver.asItem()))
                .unlockedBy("silveringot",has(ItemList.itemIngotSilver))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemSpinel,9)
                .requires(Ingredient.of(BlockList.blockSpinel.asItem()))
                .unlockedBy("spinel",has(ItemList.itemGemSpinel))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemSugilite,9)
                .requires(Ingredient.of(BlockList.blockSugilite.asItem()))
                .unlockedBy("sugilite",has(ItemList.itemGemSugilite))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotTantalum,9)
                .requires(Ingredient.of(BlockList.blockTantalum.asItem()))
                .unlockedBy("tantalumingot",has(ItemList.itemIngotTantalum))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemTanzanite,9)
                .requires(Ingredient.of(BlockList.blockTanzanite.asItem()))
                .unlockedBy("tanzanite",has(ItemList.itemGemTanzanite))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotTartarite,9)
                .requires(Ingredient.of(BlockList.blockTartarite.asItem()))
                .unlockedBy("tartariteingot",has(ItemList.itemIngotTartarite))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotTechnetium,9)
                .requires(Ingredient.of(BlockList.blockTechnetium.asItem()))
                .unlockedBy("technetiumingot",has(ItemList.itemIngotTechnetium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotThallium,9)
                .requires(Ingredient.of(BlockList.blockThallium.asItem()))
                .unlockedBy("thalliumingot",has(ItemList.itemIngotThallium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotTin,9)
                .requires(Ingredient.of(BlockList.blockTin.asItem()))
                .unlockedBy("tiningot",has(ItemList.itemIngotTin))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotTitanium,9)
                .requires(Ingredient.of(BlockList.blockTitanium.asItem()))
                .unlockedBy("titaniumingot",has(ItemList.itemIngotTitanium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemTopaz,9)
                .requires(Ingredient.of(BlockList.blockTopaz.asItem()))
                .unlockedBy("topaz",has(ItemList.itemGemTopaz))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemTourmaline,9)
                .requires(Ingredient.of(BlockList.blockTourmaline.asItem()))
                .unlockedBy("tourmaline",has(ItemList.itemGemTourmaline))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotTungsten,9)
                .requires(Ingredient.of(BlockList.blockTungsten.asItem()))
                .unlockedBy("tungsteningot",has(ItemList.itemIngotTungsten))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemTurquoise,9)
                .requires(Ingredient.of(BlockList.blockTurquoise.asItem()))
                .unlockedBy("turquoise",has(ItemList.itemGemTurquoise))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotUnobtainium,9)
                .requires(Ingredient.of(BlockList.blockUnobtainium.asItem()))
                .unlockedBy("unobtainiumingot",has(ItemList.itemIngotUnobtainium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotUranium,9)
                .requires(Ingredient.of(BlockList.blockUranium.asItem()))
                .unlockedBy("uraniumingot",has(ItemList.itemIngotUranium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotVanadium,9)
                .requires(Ingredient.of(BlockList.blockVanadium.asItem()))
                .unlockedBy("vanadiumingot",has(ItemList.itemIngotVanadium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotVulcanite,9)
                .requires(Ingredient.of(BlockList.blockVulcanite.asItem()))
                .unlockedBy("vulcaniteingot",has(ItemList.itemIngotVulcanite))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotVyroxeres,9)
                .requires(Ingredient.of(BlockList.blockVyroxeres.asItem()))
                .unlockedBy("vyroxeresingot",has(ItemList.itemIngotVyroxeres))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotYellorite,9)
                .requires(Ingredient.of(BlockList.blockYellorite.asItem()))
                .unlockedBy("yelloriteingot",has(ItemList.itemIngotYellorite))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotZinc,9)
                .requires(Ingredient.of(BlockList.blockZinc.asItem()))
                .unlockedBy("zincingot",has(ItemList.itemIngotZinc))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotZirconium,9)
                .requires(Ingredient.of(BlockList.blockZirconium.asItem()))
                .unlockedBy("zirconiumingot",has(ItemList.itemIngotZirconium))
                .save(consumer);
    }
    protected void buildSmeltingRecipes(Consumer<FinishedRecipe> consumer)
    {
        //Smelting Ore
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreAdamantine),ItemList.itemIngotAdamantine,0.75F,40)
                .unlockedBy("smeltadamantineore",has(ItemList.itemIngotAdamantine))
                .save(consumer,new ResourceLocation("extraores:smeltadamantineore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreAldourite),ItemList.itemIngotAldourite,0.75F,40)
                .unlockedBy("smeltaldouriteore",has(ItemList.itemIngotAldourite))
                .save(consumer,new ResourceLocation("extraores:smeltaldouriteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreAluminum),ItemList.itemIngotAluminum,0.75F,40)
                .unlockedBy("smeltaluminumore",has(ItemList.itemIngotAluminum))
                .save(consumer,new ResourceLocation("extraores:smeltaluminumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreAmericium),ItemList.itemIngotAmericium,0.75F,40)
                .unlockedBy("smeltamericiumore",has(ItemList.itemIngotAmericium))
                .save(consumer,new ResourceLocation("extraores:smeltamericiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreAmordrine),ItemList.itemIngotAmordrine,0.75F,40)
                .unlockedBy("smeltamordrineore",has(ItemList.itemIngotAmordrine))
                .save(consumer,new ResourceLocation("extraores:smeltamordrineore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreAngmallen),ItemList.itemIngotAngmallen,0.75F,40)
                .unlockedBy("smeltangmallenore",has(ItemList.itemIngotAngmallen))
                .save(consumer,new ResourceLocation("extraores:smeltangmallenore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreAstralSilver),ItemList.itemIngotAstralSilver,0.75F,40)
                .unlockedBy("smeltastralsilverore",has(ItemList.itemIngotAstralSilver))
                .save(consumer,new ResourceLocation("extraores:smeltastralsilverore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreAtlarus),ItemList.itemIngotAtlarus,0.75F,40)
                .unlockedBy("smeltatlarusore",has(ItemList.itemIngotAtlarus))
                .save(consumer,new ResourceLocation("extraores:smeltatlarusore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreBismuth),ItemList.itemIngotBismuth,0.75F,40)
                .unlockedBy("smeltbismuthore",has(ItemList.itemIngotBismuth))
                .save(consumer,new ResourceLocation("extraores:smeltbismuthore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreBlackSteel),ItemList.itemIngotBlackSteel,0.75F,40)
                .unlockedBy("smeltblacksteelore",has(ItemList.itemIngotBlackSteel))
                .save(consumer,new ResourceLocation("extraores:smeltblacksteelore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreCadmium),ItemList.itemIngotCadmium,0.75F,40)
                .unlockedBy("smeltcadmiumore",has(ItemList.itemIngotCadmium))
                .save(consumer,new ResourceLocation("extraores:smeltcadmiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreCarmot),ItemList.itemIngotCarmot,0.75F,40)
                .unlockedBy("smeltcarmotore",has(ItemList.itemIngotCarmot))
                .save(consumer,new ResourceLocation("extraores:smeltcarmotore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreCelenegil),ItemList.itemIngotCelenegil,0.75F,40)
                .unlockedBy("smeltcelenegilore",has(ItemList.itemIngotCelenegil))
                .save(consumer,new ResourceLocation("extraores:smeltcelenegilore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreCeruclase),ItemList.itemIngotCeruclase,0.75F,40)
                .unlockedBy("smeltceruclaseore",has(ItemList.itemIngotCeruclase))
                .save(consumer,new ResourceLocation("extraores:smeltceruclaseore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreChromium),ItemList.itemIngotChromium,0.75F,40)
                .unlockedBy("smeltchromiumore",has(ItemList.itemIngotChromium))
                .save(consumer,new ResourceLocation("extraores:smeltchromiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreCobalt),ItemList.itemIngotCobalt,0.75F,40)
                .unlockedBy("smeltcobaltore",has(ItemList.itemIngotCobalt))
                .save(consumer,new ResourceLocation("extraores:smeltcobaltore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreCopper),ItemList.itemIngotCopper,0.75F,40)
                .unlockedBy("smeltcopperore",has(ItemList.itemIngotCopper))
                .save(consumer,new ResourceLocation("extraores:smeltcopperore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreDeepIron),ItemList.itemIngotDeepIron,0.75F,40)
                .unlockedBy("smeltdeepironore",has(ItemList.itemIngotDeepIron))
                .save(consumer,new ResourceLocation("extraores:smeltdeepironore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreDesichalkos),ItemList.itemIngotDesichalkos,0.75F,40)
                .unlockedBy("smeltdesichalkosore",has(ItemList.itemIngotDesichalkos))
                .save(consumer,new ResourceLocation("extraores:smeltdesichalkosore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreEximite),ItemList.itemIngotEximite,0.75F,40)
                .unlockedBy("smelteximiteore",has(ItemList.itemIngotEximite))
                .save(consumer,new ResourceLocation("extraores:smelteximiteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreGallium),ItemList.itemIngotGallium,0.75F,40)
                .unlockedBy("smeltgalliumore",has(ItemList.itemIngotGallium))
                .save(consumer,new ResourceLocation("extraores:smeltgalliumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreHaderoth),ItemList.itemIngotHaderoth,0.75F,40)
                .unlockedBy("smelthaderothore",has(ItemList.itemIngotHaderoth))
                .save(consumer,new ResourceLocation("extraores:smelthaderothore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreHepatizon),ItemList.itemIngotHepatizon,0.75F,40)
                .unlockedBy("smelthepatizonore",has(ItemList.itemIngotHepatizon))
                .save(consumer,new ResourceLocation("extraores:smelthepatizonore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreIgnatius),ItemList.itemIngotIgnatius,0.75F,40)
                .unlockedBy("smeltignatiusore",has(ItemList.itemIngotIgnatius))
                .save(consumer,new ResourceLocation("extraores:smeltignatiusore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreIndium),ItemList.itemIngotIndium,0.75F,40)
                .unlockedBy("smeltindiumore",has(ItemList.itemIngotIndium))
                .save(consumer,new ResourceLocation("extraores:smeltindiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreInfuscolium),ItemList.itemIngotInfuscolium,0.75F,40)
                .unlockedBy("smeltinfuscoliumore",has(ItemList.itemIngotInfuscolium))
                .save(consumer,new ResourceLocation("extraores:smeltinfuscoliumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreInolashite),ItemList.itemIngotInolashite,0.75F,40)
                .unlockedBy("smeltinolashiteore",has(ItemList.itemIngotInolashite))
                .save(consumer,new ResourceLocation("extraores:smeltinolashiteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreIridium),ItemList.itemIngotIridium,0.75F,40)
                .unlockedBy("smeltiridiumore",has(ItemList.itemIngotIridium))
                .save(consumer,new ResourceLocation("extraores:smeltiridiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreKalendrite),ItemList.itemIngotKalendrite,0.75F,40)
                .unlockedBy("smeltkalendriteore",has(ItemList.itemIngotKalendrite))
                .save(consumer,new ResourceLocation("extraores:smeltkalendriteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreLead),ItemList.itemIngotLead,0.75F,40)
                .unlockedBy("smeltleadore",has(ItemList.itemIngotLead))
                .save(consumer,new ResourceLocation("extraores:smeltleadore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreLemurite),ItemList.itemIngotLemurite,0.75F,40)
                .unlockedBy("smeltlemuriteore",has(ItemList.itemIngotLemurite))
                .save(consumer,new ResourceLocation("extraores:smeltlemuriteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreManganese),ItemList.itemIngotManganese,0.75F,40)
                .unlockedBy("smeltmanganeseore",has(ItemList.itemIngotManganese))
                .save(consumer,new ResourceLocation("extraores:smeltmanganeseore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreMeutoite),ItemList.itemIngotMeutoite,0.75F,40)
                .unlockedBy("smeltmeutoiteore",has(ItemList.itemIngotMeutoite))
                .save(consumer,new ResourceLocation("extraores:smeltmeutoiteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreMidasium),ItemList.itemIngotMidasium,0.75F,40)
                .unlockedBy("smeltmidasiumore",has(ItemList.itemIngotMidasium))
                .save(consumer,new ResourceLocation("extraores:smeltmidasiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreMithril),ItemList.itemIngotMithril,0.75F,40)
                .unlockedBy("smeltmithrilore",has(ItemList.itemIngotMithril))
                .save(consumer,new ResourceLocation("extraores:smeltmithrilore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreMolybdenum),ItemList.itemIngotMolybdenum,0.75F,40)
                .unlockedBy("smeltmolybdenumore",has(ItemList.itemIngotMolybdenum))
                .save(consumer,new ResourceLocation("extraores:smeltmolybdenumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreNeodymium),ItemList.itemIngotNeodymium,0.75F,40)
                .unlockedBy("smeltneodymiumore",has(ItemList.itemIngotNeodymium))
                .save(consumer,new ResourceLocation("extraores:smeltneodymiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreNeptunium),ItemList.itemIngotNeptunium,0.75F,40)
                .unlockedBy("smeltneptuniumore",has(ItemList.itemIngotNeptunium))
                .save(consumer,new ResourceLocation("extraores:smeltneptuniumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreNickel),ItemList.itemIngotNickel,0.75F,40)
                .unlockedBy("smeltnickelore",has(ItemList.itemIngotNickel))
                .save(consumer,new ResourceLocation("extraores:smeltnickelore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreNiobium),ItemList.itemIngotNiobium,0.75F,40)
                .unlockedBy("smeltniobiumore",has(ItemList.itemIngotNiobium))
                .save(consumer,new ResourceLocation("extraores:smeltniobiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreOrichalcum),ItemList.itemIngotOrichalcum,0.75F,40)
                .unlockedBy("smeltorichalcumore",has(ItemList.itemIngotOrichalcum))
                .save(consumer,new ResourceLocation("extraores:smeltorichalcumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreOureclase),ItemList.itemIngotOureclase,0.75F,40)
                .unlockedBy("smeltoureclaseore",has(ItemList.itemIngotOureclase))
                .save(consumer,new ResourceLocation("extraores:smeltoureclaseore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.orePalladium),ItemList.itemIngotPalladium,0.75F,40)
                .unlockedBy("smeltpalladiumore",has(ItemList.itemIngotPalladium))
                .save(consumer,new ResourceLocation("extraores:smeltpalladiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.orePlatinum),ItemList.itemIngotPlatinum,0.75F,40)
                .unlockedBy("smeltplatinumore",has(ItemList.itemIngotPlatinum))
                .save(consumer,new ResourceLocation("extraores:smeltplatinumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.orePlutonium),ItemList.itemIngotPlutonium,0.75F,40)
                .unlockedBy("smeltplutoniumore",has(ItemList.itemIngotPlutonium))
                .save(consumer,new ResourceLocation("extraores:smeltplutoniumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.orePolonium),ItemList.itemIngotPolonium,0.75F,40)
                .unlockedBy("smeltpoloniumore",has(ItemList.itemIngotPolonium))
                .save(consumer,new ResourceLocation("extraores:smeltpoloniumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.orePromethium),ItemList.itemIngotPromethium,0.75F,40)
                .unlockedBy("smeltpromethiumore",has(ItemList.itemIngotPromethium))
                .save(consumer,new ResourceLocation("extraores:smeltpromethiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreRhenium),ItemList.itemIngotRhenium,0.75F,40)
                .unlockedBy("smeltrheniumore",has(ItemList.itemIngotRhenium))
                .save(consumer,new ResourceLocation("extraores:smeltrheniumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreRhodium),ItemList.itemIngotRhodium,0.75F,40)
                .unlockedBy("smeltrhodiumore",has(ItemList.itemIngotRhodium))
                .save(consumer,new ResourceLocation("extraores:smeltrhodiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreRubracium),ItemList.itemIngotRubracium,0.75F,40)
                .unlockedBy("smeltrubraciumore",has(ItemList.itemIngotRubracium))
                .save(consumer,new ResourceLocation("extraores:smeltrubraciumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreRuthenium),ItemList.itemIngotRuthenium,0.75F,40)
                .unlockedBy("smeltrutheniumore",has(ItemList.itemIngotRuthenium))
                .save(consumer,new ResourceLocation("extraores:smeltrutheniumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreSanguinite),ItemList.itemIngotSanguinite,0.75F,40)
                .unlockedBy("smeltsanguiniteore",has(ItemList.itemIngotSanguinite))
                .save(consumer,new ResourceLocation("extraores:smeltsanguiniteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreShadowIron),ItemList.itemIngotShadowIron,0.75F,40)
                .unlockedBy("smeltshadowironore",has(ItemList.itemIngotShadowIron))
                .save(consumer,new ResourceLocation("extraores:smeltshadowironore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreSilver),ItemList.itemIngotSilver,0.75F,40)
                .unlockedBy("smeltsilverore",has(ItemList.itemIngotSilver))
                .save(consumer,new ResourceLocation("extraores:smeltsilverore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreTantalum),ItemList.itemIngotTantalum,0.75F,40)
                .unlockedBy("smelttantalumore",has(ItemList.itemIngotTantalum))
                .save(consumer,new ResourceLocation("extraores:smelttantalumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreTartarite),ItemList.itemIngotTartarite,0.75F,40)
                .unlockedBy("smelttartariteore",has(ItemList.itemIngotTartarite))
                .save(consumer,new ResourceLocation("extraores:smelttartariteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreTechnetium),ItemList.itemIngotTechnetium,0.75F,40)
                .unlockedBy("smelttechnetiumore",has(ItemList.itemIngotTechnetium))
                .save(consumer,new ResourceLocation("extraores:smelttechnetiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreThallium),ItemList.itemIngotThallium,0.75F,40)
                .unlockedBy("smeltthalliumore",has(ItemList.itemIngotThallium))
                .save(consumer,new ResourceLocation("extraores:smeltthalliumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreTin),ItemList.itemIngotTin,0.75F,40)
                .unlockedBy("smelttinore",has(ItemList.itemIngotTin))
                .save(consumer,new ResourceLocation("extraores:smelttinore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreTitanium),ItemList.itemIngotTitanium,0.75F,40)
                .unlockedBy("smelttitaniumore",has(ItemList.itemIngotTitanium))
                .save(consumer,new ResourceLocation("extraores:smelttitaniumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreTungsten),ItemList.itemIngotTungsten,0.75F,40)
                .unlockedBy("smelttungstenore",has(ItemList.itemIngotTungsten))
                .save(consumer,new ResourceLocation("extraores:smelttungstenore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreUnobtainium),ItemList.itemIngotUnobtainium,0.75F,40)
                .unlockedBy("smeltunobtainiumore",has(ItemList.itemIngotUnobtainium))
                .save(consumer,new ResourceLocation("extraores:smeltunobtainiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreUranium),ItemList.itemIngotUranium,0.75f,40)
                .unlockedBy("smelturaniumore",has(ItemList.itemIngotUranium))
                .save(consumer,new ResourceLocation("extraores:smelturaniumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreVanadium),ItemList.itemIngotVanadium,0.75F,40)
                .unlockedBy("smeltvanadiumore",has(ItemList.itemIngotVanadium))
                .save(consumer,new ResourceLocation("extraores:smeltvanadiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreVulcanite),ItemList.itemIngotVulcanite,0.75F,40)
                .unlockedBy("smeltvulcaniteore",has(ItemList.itemIngotVulcanite))
                .save(consumer,new ResourceLocation("extraores:smeltvulcaniteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreVyroxeres),ItemList.itemIngotVyroxeres,0.75F,40)
                .unlockedBy("smeltvyroxeresore",has(ItemList.itemIngotVyroxeres))
                .save(consumer,new ResourceLocation("extraores:smeltvyroxeresore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreYellorite),ItemList.itemIngotYellorite,0.75F,40)
                .unlockedBy("smeltyelloriteore",has(ItemList.itemIngotYellorite))
                .save(consumer,new ResourceLocation("extraores:smeltyelloriteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreZinc),ItemList.itemIngotZinc,0.75F,40)
                .unlockedBy("smeltzincore",has(ItemList.itemIngotZinc))
                .save(consumer,new ResourceLocation("extraores:smeltzincore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreZirconium),ItemList.itemIngotZirconium,0.75F,40)
                .unlockedBy("smeltzirconiumore",has(ItemList.itemIngotZirconium))
                .save(consumer,new ResourceLocation("extraores:smeltzirconiumore"));
        //Smelting Raw
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawAdamantine),ItemList.itemIngotAdamantine,0.75F,40)
                .unlockedBy("smeltrawadamantine",has(ItemList.itemIngotAdamantine))
                .save(consumer,new ResourceLocation("extraores:smeltrawadamantine"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawAldourite),ItemList.itemIngotAldourite,0.75F,40)
                .unlockedBy("smeltrawaldourite",has(ItemList.itemIngotAldourite))
                .save(consumer,new ResourceLocation("extraores:smeltrawaldourite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawAluminum),ItemList.itemIngotAluminum,0.75F,40)
                .unlockedBy("smeltrawaluminum",has(ItemList.itemIngotAluminum))
                .save(consumer,new ResourceLocation("extraores:smeltrawaluminum"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawAmericium),ItemList.itemIngotAmericium,0.75F,40)
                .unlockedBy("smeltrawamericium",has(ItemList.itemIngotAmericium))
                .save(consumer,new ResourceLocation("extraores:smeltrawamericium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawAmordrine),ItemList.itemIngotAmordrine,0.75F,40)
                .unlockedBy("smeltrawamordrine",has(ItemList.itemIngotAmordrine))
                .save(consumer,new ResourceLocation("extraores:smeltrawamordrine"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawAngmallen),ItemList.itemIngotAngmallen,0.75F,40)
                .unlockedBy("smeltrawangmallen",has(ItemList.itemIngotAngmallen))
                .save(consumer,new ResourceLocation("extraores:smeltrawangmallen"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawAstralSilver),ItemList.itemIngotAstralSilver,0.75F,40)
                .unlockedBy("smeltrawastralsilver",has(ItemList.itemIngotAstralSilver))
                .save(consumer,new ResourceLocation("extraores:smeltrawastralsilver"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawAtlarus),ItemList.itemIngotAtlarus,0.75F,40)
                .unlockedBy("smeltrawatlarus",has(ItemList.itemIngotAtlarus))
                .save(consumer,new ResourceLocation("extraores:smeltrawatlarus"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawBismuth),ItemList.itemIngotBismuth,0.75F,40)
                .unlockedBy("smeltrawbismuth",has(ItemList.itemIngotBismuth))
                .save(consumer,new ResourceLocation("extraores:smeltrawbismuth"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawBlackSteel),ItemList.itemIngotBlackSteel,0.75F,40)
                .unlockedBy("smeltrawblacksteel",has(ItemList.itemIngotBlackSteel))
                .save(consumer,new ResourceLocation("extraores:smeltrawblacksteel"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawCadmium),ItemList.itemIngotCadmium,0.75F,40)
                .unlockedBy("smeltrawcadmium",has(ItemList.itemIngotCadmium))
                .save(consumer,new ResourceLocation("extraores:smeltrawcadmium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawCarmot),ItemList.itemIngotCarmot,0.75F,40)
                .unlockedBy("smeltrawcarmot",has(ItemList.itemIngotCarmot))
                .save(consumer,new ResourceLocation("extraores:smeltrawcarmot"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawCelenegil),ItemList.itemIngotCelenegil,0.75F,40)
                .unlockedBy("smeltrawcelenegil",has(ItemList.itemIngotCelenegil))
                .save(consumer,new ResourceLocation("extraores:smeltrawcelenegil"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawCeruclase),ItemList.itemIngotCeruclase,0.75F,40)
                .unlockedBy("smeltrawceruclase",has(ItemList.itemIngotCeruclase))
                .save(consumer,new ResourceLocation("extraores:smeltrawceruclase"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawChromium),ItemList.itemIngotChromium,0.75F,40)
                .unlockedBy("smeltrawchromium",has(ItemList.itemIngotChromium))
                .save(consumer,new ResourceLocation("extraores:smeltrawchromium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawCobalt),ItemList.itemIngotCobalt,0.75F,40)
                .unlockedBy("smeltrawcobalt",has(ItemList.itemIngotCobalt))
                .save(consumer,new ResourceLocation("extraores:smeltrawcobalt"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawCopper),ItemList.itemIngotCopper,0.75F,40)
                .unlockedBy("smeltrawcopper",has(ItemList.itemIngotCopper))
                .save(consumer,new ResourceLocation("extraores:smeltrawcopper"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawDeepIron),ItemList.itemIngotDeepIron,0.75F,40)
                .unlockedBy("smeltrawdeepiron",has(ItemList.itemIngotDeepIron))
                .save(consumer,new ResourceLocation("extraores:smeltrawdeepiron"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawDesichalkos),ItemList.itemIngotDesichalkos,0.75F,40)
                .unlockedBy("smeltrawdesichalkos",has(ItemList.itemIngotDesichalkos))
                .save(consumer,new ResourceLocation("extraores:smeltrawdesichalkos"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawEximite),ItemList.itemIngotEximite,0.75F,40)
                .unlockedBy("smeltraweximite",has(ItemList.itemIngotEximite))
                .save(consumer,new ResourceLocation("extraores:smeltraweximite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawGallium),ItemList.itemIngotGallium,0.75F,40)
                .unlockedBy("smeltrawgallium",has(ItemList.itemIngotGallium))
                .save(consumer,new ResourceLocation("extraores:smeltrawgallium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawHaderoth),ItemList.itemIngotHaderoth,0.75F,40)
                .unlockedBy("smeltrawhaderoth",has(ItemList.itemIngotHaderoth))
                .save(consumer,new ResourceLocation("extraores:smeltrawhaderoth"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawHepatizon),ItemList.itemIngotHepatizon,0.75F,40)
                .unlockedBy("smeltrawhepatizon",has(ItemList.itemIngotHepatizon))
                .save(consumer,new ResourceLocation("extraores:smeltrawhepatizon"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawIgnatius),ItemList.itemIngotIgnatius,0.75F,40)
                .unlockedBy("smeltrawignatius",has(ItemList.itemIngotIgnatius))
                .save(consumer,new ResourceLocation("extraores:smeltrawignatius"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawIndium),ItemList.itemIngotIndium,0.75F,40)
                .unlockedBy("smeltrawindium",has(ItemList.itemIngotIndium))
                .save(consumer,new ResourceLocation("extraores:smeltrawindium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawInfuscolium),ItemList.itemIngotInfuscolium,0.75F,40)
                .unlockedBy("smeltrawinfuscolium",has(ItemList.itemIngotInfuscolium))
                .save(consumer,new ResourceLocation("extraores:smeltrawinfuscolium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawInolashite),ItemList.itemIngotInolashite,0.75F,40)
                .unlockedBy("smeltrawinolashite",has(ItemList.itemIngotInolashite))
                .save(consumer,new ResourceLocation("extraores:smeltrawinolashite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawIridium),ItemList.itemIngotIridium,0.75F,40)
                .unlockedBy("smeltrawiridium",has(ItemList.itemIngotIridium))
                .save(consumer,new ResourceLocation("extraores:smeltrawiridium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawKalendrite),ItemList.itemIngotKalendrite,0.75F,40)
                .unlockedBy("smeltrawkalendrite",has(ItemList.itemIngotKalendrite))
                .save(consumer,new ResourceLocation("extraores:smeltrawkalendrite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawLead),ItemList.itemIngotLead,0.75F,40)
                .unlockedBy("smeltrawlead",has(ItemList.itemIngotLead))
                .save(consumer,new ResourceLocation("extraores:smeltrawlead"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawLemurite),ItemList.itemIngotLemurite,0.75F,40)
                .unlockedBy("smeltrawlemurite",has(ItemList.itemIngotLemurite))
                .save(consumer,new ResourceLocation("extraores:smeltrawlemurite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawManganese),ItemList.itemIngotManganese,0.75F,40)
                .unlockedBy("smeltrawmanganese",has(ItemList.itemIngotManganese))
                .save(consumer,new ResourceLocation("extraores:smeltrawmanganese"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawMeutoite),ItemList.itemIngotMeutoite,0.75F,40)
                .unlockedBy("smeltrawmeutoite",has(ItemList.itemIngotMeutoite))
                .save(consumer,new ResourceLocation("extraores:smeltrawmeutoite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawMidasium),ItemList.itemIngotMidasium,0.75F,40)
                .unlockedBy("smeltrawmidasium",has(ItemList.itemIngotMidasium))
                .save(consumer,new ResourceLocation("extraores:smeltrawmidasium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawMithril),ItemList.itemIngotMithril,0.75F,40)
                .unlockedBy("smeltrawmithril",has(ItemList.itemIngotMithril))
                .save(consumer,new ResourceLocation("extraores:smeltrawmithril"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawMolybdenum),ItemList.itemIngotMolybdenum,0.75F,40)
                .unlockedBy("smeltrawmolybdenum",has(ItemList.itemIngotMolybdenum))
                .save(consumer,new ResourceLocation("extraores:smeltrawmolybdenum"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawNeodymium),ItemList.itemIngotNeodymium,0.75F,40)
                .unlockedBy("smeltrawneodymium",has(ItemList.itemIngotNeodymium))
                .save(consumer,new ResourceLocation("extraores:smeltrawneodymium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawNeptunium),ItemList.itemIngotNeptunium,0.75F,40)
                .unlockedBy("smeltrawneptunium",has(ItemList.itemIngotNeptunium))
                .save(consumer,new ResourceLocation("extraores:smeltrawneptunium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawNickel),ItemList.itemIngotNickel,0.75F,40)
                .unlockedBy("smeltrawnickel",has(ItemList.itemIngotNickel))
                .save(consumer,new ResourceLocation("extraores:smeltrawnickel"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawNiobium),ItemList.itemIngotNiobium,0.75F,40)
                .unlockedBy("smeltrawniobium",has(ItemList.itemIngotNiobium))
                .save(consumer,new ResourceLocation("extraores:smeltrawniobium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawOrichalcum),ItemList.itemIngotOrichalcum,0.75F,40)
                .unlockedBy("smeltraworichalcum",has(ItemList.itemIngotOrichalcum))
                .save(consumer,new ResourceLocation("extraores:smeltraworichalcum"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawOureclase),ItemList.itemIngotOureclase,0.75F,40)
                .unlockedBy("smeltrawoureclase",has(ItemList.itemIngotOureclase))
                .save(consumer,new ResourceLocation("extraores:smeltrawoureclase"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawPalladium),ItemList.itemIngotPalladium,0.75F,40)
                .unlockedBy("smeltrawpalladium",has(ItemList.itemIngotPalladium))
                .save(consumer,new ResourceLocation("extraores:smeltrawpalladium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawPlatinum),ItemList.itemIngotPlatinum,0.75F,40)
                .unlockedBy("smeltrawplatinum",has(ItemList.itemIngotPlatinum))
                .save(consumer,new ResourceLocation("extraores:smeltrawplatinum"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawPlutonium),ItemList.itemIngotPlutonium,0.75F,40)
                .unlockedBy("smeltrawplutonium",has(ItemList.itemIngotPlutonium))
                .save(consumer,new ResourceLocation("extraores:smeltrawplutonium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawPolonium),ItemList.itemIngotPolonium,0.75F,40)
                .unlockedBy("smeltrawpolonium",has(ItemList.itemIngotPolonium))
                .save(consumer,new ResourceLocation("extraores:smeltrawpolonium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawPromethium),ItemList.itemIngotPromethium,0.75F,40)
                .unlockedBy("smeltrawpromethium",has(ItemList.itemIngotPromethium))
                .save(consumer,new ResourceLocation("extraores:smeltrawpromethium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawRhenium),ItemList.itemIngotRhenium,0.75F,40)
                .unlockedBy("smeltrawrhenium",has(ItemList.itemIngotRhenium))
                .save(consumer,new ResourceLocation("extraores:smeltrawrhenium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawRhodium),ItemList.itemIngotRhodium,0.75F,40)
                .unlockedBy("smeltrawrhodium",has(ItemList.itemIngotRhodium))
                .save(consumer,new ResourceLocation("extraores:smeltrawrhodium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawRubracium),ItemList.itemIngotRubracium,0.75F,40)
                .unlockedBy("smeltrawrubracium",has(ItemList.itemIngotRubracium))
                .save(consumer,new ResourceLocation("extraores:smeltrawrubracium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawRuthenium),ItemList.itemIngotRuthenium,0.75F,40)
                .unlockedBy("smeltrawruthenium",has(ItemList.itemIngotRuthenium))
                .save(consumer,new ResourceLocation("extraores:smeltrawruthenium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawSanguinite),ItemList.itemIngotSanguinite,0.75F,40)
                .unlockedBy("smeltrawsanguinite",has(ItemList.itemIngotSanguinite))
                .save(consumer,new ResourceLocation("extraores:smeltrawsanguinite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawShadowIron),ItemList.itemIngotShadowIron,0.75F,40)
                .unlockedBy("smeltrawshadowiron",has(ItemList.itemIngotShadowIron))
                .save(consumer,new ResourceLocation("extraores:smeltrawshadowiron"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawSilver),ItemList.itemIngotSilver,0.75F,40)
                .unlockedBy("smeltrawsilver",has(ItemList.itemIngotSilver))
                .save(consumer,new ResourceLocation("extraores:smeltrawsilver"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawTantalum),ItemList.itemIngotTantalum,0.75F,40)
                .unlockedBy("smeltrawtantalum",has(ItemList.itemIngotTantalum))
                .save(consumer,new ResourceLocation("extraores:smeltrawtantalum"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawTartarite),ItemList.itemIngotTartarite,0.75F,40)
                .unlockedBy("smeltrawtartarite",has(ItemList.itemIngotTartarite))
                .save(consumer,new ResourceLocation("extraores:smeltrawtartarite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawTechnetium),ItemList.itemIngotTechnetium,0.75F,40)
                .unlockedBy("smeltrawtechnetium",has(ItemList.itemIngotTechnetium))
                .save(consumer,new ResourceLocation("extraores:smeltrawtechnetium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawThallium),ItemList.itemIngotThallium,0.75F,40)
                .unlockedBy("smeltrawthallium",has(ItemList.itemIngotThallium))
                .save(consumer,new ResourceLocation("extraores:smeltrawthallium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawTin),ItemList.itemIngotTin,0.75F,40)
                .unlockedBy("smeltrawtin",has(ItemList.itemIngotTin))
                .save(consumer,new ResourceLocation("extraores:smeltrawtin"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawTitanium),ItemList.itemIngotTitanium,0.75F,40)
                .unlockedBy("smeltrawtitanium",has(ItemList.itemIngotTitanium))
                .save(consumer,new ResourceLocation("extraores:smeltrawtitanium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawTungsten),ItemList.itemIngotTungsten,0.75F,40)
                .unlockedBy("smeltrawtungsten",has(ItemList.itemIngotTungsten))
                .save(consumer,new ResourceLocation("extraores:smeltrawtungsten"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawUnobtainium),ItemList.itemIngotUnobtainium,0.75F,40)
                .unlockedBy("smeltrawunobtainium",has(ItemList.itemIngotUnobtainium))
                .save(consumer,new ResourceLocation("extraores:smeltrawunobtainium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawUranium),ItemList.itemIngotUranium,0.75f,40)
                .unlockedBy("smeltrawuranium",has(ItemList.itemIngotUranium))
                .save(consumer,new ResourceLocation("extraores:smeltrawuranium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawVanadium),ItemList.itemIngotVanadium,0.75F,40)
                .unlockedBy("smeltrawvanadium",has(ItemList.itemIngotVanadium))
                .save(consumer,new ResourceLocation("extraores:smeltrawvanadium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawVulcanite),ItemList.itemIngotVulcanite,0.75F,40)
                .unlockedBy("smeltrawvulcanite",has(ItemList.itemIngotVulcanite))
                .save(consumer,new ResourceLocation("extraores:smeltrawvulcanite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawVyroxeres),ItemList.itemIngotVyroxeres,0.75F,40)
                .unlockedBy("smeltrawvyroxeres",has(ItemList.itemIngotVyroxeres))
                .save(consumer,new ResourceLocation("extraores:smeltrawvyroxeres"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawYellorite),ItemList.itemIngotYellorite,0.75F,40)
                .unlockedBy("smeltrawyellorite",has(ItemList.itemIngotYellorite))
                .save(consumer,new ResourceLocation("extraores:smeltrawyellorite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawZinc),ItemList.itemIngotZinc,0.75F,40)
                .unlockedBy("smeltrawzinc",has(ItemList.itemIngotZinc))
                .save(consumer,new ResourceLocation("extraores:smeltrawzinc"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawZirconium),ItemList.itemIngotZirconium,0.75F,40)
                .unlockedBy("smeltrawzirconium",has(ItemList.itemIngotZirconium))
                .save(consumer,new ResourceLocation("extraores:smeltrawzirconium"));
        //Smelting Dust
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustAdamantine),ItemList.itemIngotAdamantine,0.75F,20)
                .unlockedBy("smeltadamantinedust",has(ItemList.itemIngotAdamantine))
                .save(consumer,new ResourceLocation("extraores:smeltadamantinedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustAldourite),ItemList.itemIngotAldourite,0.75F,20)
                .unlockedBy("smeltaldouritedust",has(ItemList.itemIngotAldourite))
                .save(consumer,new ResourceLocation("extraores:smeltaldouritedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustAluminum),ItemList.itemIngotAluminum,0.75F,20)
                .unlockedBy("smeltaluminumdust",has(ItemList.itemIngotAluminum))
                .save(consumer,new ResourceLocation("extraores:smeltaluminumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustAmericium),ItemList.itemIngotAmericium,0.75F,20)
                .unlockedBy("smeltamericiumdust",has(ItemList.itemIngotAmericium))
                .save(consumer,new ResourceLocation("extraores:smeltamericiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustAmordrine),ItemList.itemIngotAmordrine,0.75F,20)
                .unlockedBy("smeltamordrinedust",has(ItemList.itemIngotAmordrine))
                .save(consumer,new ResourceLocation("extraores:smeltamordrinedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustAngmallen),ItemList.itemIngotAngmallen,0.75F,20)
                .unlockedBy("smeltangmallendust",has(ItemList.itemIngotAngmallen))
                .save(consumer,new ResourceLocation("extraores:smeltangmallendust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustAstralSilver),ItemList.itemIngotAstralSilver,0.75F,20)
                .unlockedBy("smeltastralsilverdust",has(ItemList.itemIngotAstralSilver))
                .save(consumer,new ResourceLocation("extraores:smeltastralsilverdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustAtlarus),ItemList.itemIngotAtlarus,0.75F,20)
                .unlockedBy("smeltatlarusdust",has(ItemList.itemIngotAtlarus))
                .save(consumer,new ResourceLocation("extraores:smeltatlarusdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustBismuth),ItemList.itemIngotBismuth,0.75F,20)
                .unlockedBy("smeltbismuthdust",has(ItemList.itemIngotBismuth))
                .save(consumer,new ResourceLocation("extraores:smeltbismuthdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustBlackSteel),ItemList.itemIngotBlackSteel,0.75F,20)
                .unlockedBy("smeltblacksteeldust",has(ItemList.itemIngotBlackSteel))
                .save(consumer,new ResourceLocation("extraores:smeltblacksteeldust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustCadmium),ItemList.itemIngotCadmium,0.75F,20)
                .unlockedBy("smeltcadmiumdust",has(ItemList.itemIngotCadmium))
                .save(consumer,new ResourceLocation("extraores:smeltcadmiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustCarmot),ItemList.itemIngotCarmot,0.75F,20)
                .unlockedBy("smeltcarmotdust",has(ItemList.itemIngotCarmot))
                .save(consumer,new ResourceLocation("extraores:smeltcarmotdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustCelenegil),ItemList.itemIngotCelenegil,0.75F,20)
                .unlockedBy("smeltcelenegildust",has(ItemList.itemIngotCelenegil))
                .save(consumer,new ResourceLocation("extraores:smeltcelenegildust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustCeruclase),ItemList.itemIngotCeruclase,0.75F,20)
                .unlockedBy("smeltceruclasedust",has(ItemList.itemIngotCeruclase))
                .save(consumer,new ResourceLocation("extraores:smeltceruclasedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustChromium),ItemList.itemIngotChromium,0.75F,20)
                .unlockedBy("smeltchromiumdust",has(ItemList.itemIngotChromium))
                .save(consumer,new ResourceLocation("extraores:smeltchromiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustCobalt),ItemList.itemIngotCobalt,0.75F,20)
                .unlockedBy("smeltcobaltdust",has(ItemList.itemIngotCobalt))
                .save(consumer,new ResourceLocation("extraores:smeltcobaltdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustCopper),ItemList.itemIngotCopper,0.75F,20)
                .unlockedBy("smeltcopperdust",has(ItemList.itemIngotCopper))
                .save(consumer,new ResourceLocation("extraores:smeltcopperdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustDeepIron),ItemList.itemIngotDeepIron,0.75F,20)
                .unlockedBy("smeltdeepirondust",has(ItemList.itemIngotDeepIron))
                .save(consumer,new ResourceLocation("extraores:smeltdeepirondust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustDesichalkos),ItemList.itemIngotDesichalkos,0.75F,20)
                .unlockedBy("smeltdesichalkosdust",has(ItemList.itemIngotDesichalkos))
                .save(consumer,new ResourceLocation("extraores:smeltdesichalkosdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustEximite),ItemList.itemIngotEximite,0.75F,20)
                .unlockedBy("smelteximitedust",has(ItemList.itemIngotEximite))
                .save(consumer,new ResourceLocation("extraores:smelteximitedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustGallium),ItemList.itemIngotGallium,0.75F,20)
                .unlockedBy("smeltgalliumdust",has(ItemList.itemIngotGallium))
                .save(consumer,new ResourceLocation("extraores:smeltgalliumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustHaderoth),ItemList.itemIngotHaderoth,0.75F,20)
                .unlockedBy("smelthaderothdust",has(ItemList.itemIngotHaderoth))
                .save(consumer,new ResourceLocation("extraores:smelthaderothdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustHepatizon),ItemList.itemIngotHepatizon,0.75F,20)
                .unlockedBy("smelthepatizondust",has(ItemList.itemIngotHepatizon))
                .save(consumer,new ResourceLocation("extraores:smelthepatizondust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustIgnatius),ItemList.itemIngotIgnatius,0.75F,20)
                .unlockedBy("smeltignatiusdust",has(ItemList.itemIngotIgnatius))
                .save(consumer,new ResourceLocation("extraores:smeltignatiusdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustIndium),ItemList.itemIngotIndium,0.75F,20)
                .unlockedBy("smeltindiumdust",has(ItemList.itemIngotIndium))
                .save(consumer,new ResourceLocation("extraores:smeltindiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustInfuscolium),ItemList.itemIngotInfuscolium,0.75F,20)
                .unlockedBy("smeltinfuscoliumdust",has(ItemList.itemIngotInfuscolium))
                .save(consumer,new ResourceLocation("extraores:smeltinfuscoliumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustInolashite),ItemList.itemIngotInolashite,0.75F,20)
                .unlockedBy("smeltinolashitedust",has(ItemList.itemIngotInolashite))
                .save(consumer,new ResourceLocation("extraores:smeltinolashitedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustIridium),ItemList.itemIngotIridium,0.75F,20)
                .unlockedBy("smeltiridiumdust",has(ItemList.itemIngotIridium))
                .save(consumer,new ResourceLocation("extraores:smeltiridiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustKalendrite),ItemList.itemIngotKalendrite,0.75F,20)
                .unlockedBy("smeltkalendritedust",has(ItemList.itemIngotKalendrite))
                .save(consumer,new ResourceLocation("extraores:smeltkalendritedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustLead),ItemList.itemIngotLead,0.75F,20)
                .unlockedBy("smeltleaddust",has(ItemList.itemIngotLead))
                .save(consumer,new ResourceLocation("extraores:smeltleaddust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustLemurite),ItemList.itemIngotLemurite,0.75F,20)
                .unlockedBy("smeltlemuritedust",has(ItemList.itemIngotLemurite))
                .save(consumer,new ResourceLocation("extraores:smeltlemuritedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustManganese),ItemList.itemIngotManganese,0.75F,20)
                .unlockedBy("smeltmanganesedust",has(ItemList.itemIngotManganese))
                .save(consumer,new ResourceLocation("extraores:smeltmanganesedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustMeutoite),ItemList.itemIngotMeutoite,0.75F,20)
                .unlockedBy("smeltmeutoitedust",has(ItemList.itemIngotMeutoite))
                .save(consumer,new ResourceLocation("extraores:smeltmeutoitedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustMidasium),ItemList.itemIngotMidasium,0.75F,20)
                .unlockedBy("smeltmidasiumdust",has(ItemList.itemIngotMidasium))
                .save(consumer,new ResourceLocation("extraores:smeltmidasiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustMithril),ItemList.itemIngotMithril,0.75F,20)
                .unlockedBy("smeltmithrildust",has(ItemList.itemIngotMithril))
                .save(consumer,new ResourceLocation("extraores:smeltmithrildust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustMolybdenum),ItemList.itemIngotMolybdenum,0.75F,20)
                .unlockedBy("smeltmolybdenumdust",has(ItemList.itemIngotMolybdenum))
                .save(consumer,new ResourceLocation("extraores:smeltmolybdenumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustNeodymium),ItemList.itemIngotNeodymium,0.75F,20)
                .unlockedBy("smeltneodymiumdust",has(ItemList.itemIngotNeodymium))
                .save(consumer,new ResourceLocation("extraores:smeltneodymiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustNeptunium),ItemList.itemIngotNeptunium,0.75F,20)
                .unlockedBy("smeltneptuniumdust",has(ItemList.itemIngotNeptunium))
                .save(consumer,new ResourceLocation("extraores:smeltneptuniumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustNickel),ItemList.itemIngotNickel,0.75F,20)
                .unlockedBy("smeltnickeldust",has(ItemList.itemIngotNickel))
                .save(consumer,new ResourceLocation("extraores:smeltnickeldust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustNiobium),ItemList.itemIngotNiobium,0.75F,20)
                .unlockedBy("smeltniobiumdust",has(ItemList.itemIngotNiobium))
                .save(consumer,new ResourceLocation("extraores:smeltniobiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustOrichalcum),ItemList.itemIngotOrichalcum,0.75F,20)
                .unlockedBy("smeltorichalcumdust",has(ItemList.itemIngotOrichalcum))
                .save(consumer,new ResourceLocation("extraores:smeltorichalcumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustOureclase),ItemList.itemIngotOureclase,0.75F,20)
                .unlockedBy("smeltoureclasedust",has(ItemList.itemIngotOureclase))
                .save(consumer,new ResourceLocation("extraores:smeltoureclasedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustPalladium),ItemList.itemIngotPalladium,0.75F,20)
                .unlockedBy("smeltpalladiumdust",has(ItemList.itemIngotPalladium))
                .save(consumer,new ResourceLocation("extraores:smeltpalladiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustPlatinum),ItemList.itemIngotPlatinum,0.75F,20)
                .unlockedBy("smeltplatinumdust",has(ItemList.itemIngotPlatinum))
                .save(consumer,new ResourceLocation("extraores:smeltplatinumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustPlutonium),ItemList.itemIngotPlutonium,0.75F,20)
                .unlockedBy("smeltplutoniumdust",has(ItemList.itemIngotPlutonium))
                .save(consumer,new ResourceLocation("extraores:smeltplutoniumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustPolonium),ItemList.itemIngotPolonium,0.75F,20)
                .unlockedBy("smeltpoloniumdust",has(ItemList.itemIngotPolonium))
                .save(consumer,new ResourceLocation("extraores:smeltpoloniumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustPromethium),ItemList.itemIngotPromethium,0.75F,20)
                .unlockedBy("smeltpromethiumdust",has(ItemList.itemIngotPromethium))
                .save(consumer,new ResourceLocation("extraores:smeltpromethiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustRhenium),ItemList.itemIngotRhenium,0.75F,20)
                .unlockedBy("smeltrheniumdust",has(ItemList.itemIngotRhenium))
                .save(consumer,new ResourceLocation("extraores:smeltrheniumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustRhodium),ItemList.itemIngotRhodium,0.75F,20)
                .unlockedBy("smeltrhodiumdust",has(ItemList.itemIngotRhodium))
                .save(consumer,new ResourceLocation("extraores:smeltrhodiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustRubracium),ItemList.itemIngotRubracium,0.75F,20)
                .unlockedBy("smeltrubraciumdust",has(ItemList.itemIngotRubracium))
                .save(consumer,new ResourceLocation("extraores:smeltrubraciumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustRuthenium),ItemList.itemIngotRuthenium,0.75F,20)
                .unlockedBy("smeltrutheniumdust",has(ItemList.itemIngotRuthenium))
                .save(consumer,new ResourceLocation("extraores:smeltrutheniumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustSanguinite),ItemList.itemIngotSanguinite,0.75F,20)
                .unlockedBy("smeltsanguinitedust",has(ItemList.itemIngotSanguinite))
                .save(consumer,new ResourceLocation("extraores:smeltsanguinitedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustShadowIron),ItemList.itemIngotShadowIron,0.75F,20)
                .unlockedBy("smeltshadowirondust",has(ItemList.itemIngotShadowIron))
                .save(consumer,new ResourceLocation("extraores:smeltshadowirondust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustSilver),ItemList.itemIngotSilver,0.75F,20)
                .unlockedBy("smeltsilverdust",has(ItemList.itemIngotSilver))
                .save(consumer,new ResourceLocation("extraores:smeltsilverdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustTantalum),ItemList.itemIngotTantalum,0.75F,20)
                .unlockedBy("smelttantalumdust",has(ItemList.itemIngotTantalum))
                .save(consumer,new ResourceLocation("extraores:smelttantalumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustTartarite),ItemList.itemIngotTartarite,0.75F,20)
                .unlockedBy("smelttartaritedust",has(ItemList.itemIngotTartarite))
                .save(consumer,new ResourceLocation("extraores:smelttartaritedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustTechnetium),ItemList.itemIngotTechnetium,0.75F,20)
                .unlockedBy("smelttechnetiumdust",has(ItemList.itemIngotTechnetium))
                .save(consumer,new ResourceLocation("extraores:smelttechnetiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustThallium),ItemList.itemIngotThallium,0.75F,20)
                .unlockedBy("smeltthalliumdust",has(ItemList.itemIngotThallium))
                .save(consumer,new ResourceLocation("extraores:smeltthalliumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustTin),ItemList.itemIngotTin,0.75F,20)
                .unlockedBy("smelttindust",has(ItemList.itemIngotTin))
                .save(consumer,new ResourceLocation("extraores:smelttindust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustTitanium),ItemList.itemIngotTitanium,0.75F,20)
                .unlockedBy("smelttitaniumdust",has(ItemList.itemIngotTitanium))
                .save(consumer,new ResourceLocation("extraores:smelttitaniumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustTungsten),ItemList.itemIngotTungsten,0.75F,20)
                .unlockedBy("smelttungstendust",has(ItemList.itemIngotTungsten))
                .save(consumer,new ResourceLocation("extraores:smelttungstendust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustUnobtainium),ItemList.itemIngotUnobtainium,0.75F,20)
                .unlockedBy("smeltunobtainiumdust",has(ItemList.itemIngotUnobtainium))
                .save(consumer,new ResourceLocation("extraores:smeltunobtainiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustUranium),ItemList.itemIngotUranium,0.75f,20)
                .unlockedBy("smelturaniumdust",has(ItemList.itemIngotUranium))
                .save(consumer,new ResourceLocation("extraores:smelturaniumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustVanadium),ItemList.itemIngotVanadium,0.75F,20)
                .unlockedBy("smeltvanadiumdust",has(ItemList.itemIngotVanadium))
                .save(consumer,new ResourceLocation("extraores:smeltvanadiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustVulcanite),ItemList.itemIngotVulcanite,0.75F,20)
                .unlockedBy("smeltvulcanitedust",has(ItemList.itemIngotVulcanite))
                .save(consumer,new ResourceLocation("extraores:smeltvulcanitedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustVyroxeres),ItemList.itemIngotVyroxeres,0.75F,20)
                .unlockedBy("smeltvyroxeresdust",has(ItemList.itemIngotVyroxeres))
                .save(consumer,new ResourceLocation("extraores:smeltvyroxeresdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustYellorite),ItemList.itemIngotYellorite,0.75F,20)
                .unlockedBy("smeltyelloritedust",has(ItemList.itemIngotYellorite))
                .save(consumer,new ResourceLocation("extraores:smeltyelloritedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustZinc),ItemList.itemIngotZinc,0.75F,20)
                .unlockedBy("smeltzincdust",has(ItemList.itemIngotZinc))
                .save(consumer,new ResourceLocation("extraores:smeltzincdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustZirconium),ItemList.itemIngotZirconium,0.75F,20)
                .unlockedBy("smeltzirconiumdust",has(ItemList.itemIngotZirconium))
                .save(consumer,new ResourceLocation("extraores:smeltzirconiumdust"));
    }
    protected void buildBlastingRecipes(Consumer<FinishedRecipe> consumer)
    {
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreAdamantine.asItem()),ItemList.itemIngotAdamantine,0.75F,20)
                .unlockedBy("blastadamantineore",has(ItemList.itemIngotAdamantine))
                .save(consumer,new ResourceLocation("extraores:blastadamantineore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreAldourite.asItem()),ItemList.itemIngotAldourite,0.75F,20)
                .unlockedBy("blastaldouriteore",has(ItemList.itemIngotAldourite))
                .save(consumer,new ResourceLocation("extraores:blastaldouriteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreAluminum.asItem()),ItemList.itemIngotAluminum,0.75F,20)
                .unlockedBy("blastaluminumore",has(ItemList.itemIngotAluminum))
                .save(consumer,new ResourceLocation("extraores:blastaluminumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreAmericium.asItem()),ItemList.itemIngotAmericium,0.75F,20)
                .unlockedBy("blastamericiumore",has(ItemList.itemIngotAmericium))
                .save(consumer,new ResourceLocation("extraores:blastamericiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreAmordrine.asItem()),ItemList.itemIngotAmordrine,0.75F,20)
                .unlockedBy("blastamordrineore",has(ItemList.itemIngotAmordrine))
                .save(consumer,new ResourceLocation("extraores:blastamordrineore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreAngmallen.asItem()),ItemList.itemIngotAngmallen,0.75F,20)
                .unlockedBy("blastangmallenore",has(ItemList.itemIngotAngmallen))
                .save(consumer,new ResourceLocation("extraores:blastangmallenore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreAstralSilver.asItem()),ItemList.itemIngotAstralSilver,0.75F,20)
                .unlockedBy("blastastralsilverore",has(ItemList.itemIngotAstralSilver))
                .save(consumer,new ResourceLocation("extraores:blastastralsilverore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreAtlarus.asItem()),ItemList.itemIngotAtlarus,0.75F,20)
                .unlockedBy("blastatlarusore",has(ItemList.itemIngotAtlarus))
                .save(consumer,new ResourceLocation("extraores:blastatlarusore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreBismuth.asItem()),ItemList.itemIngotBismuth,0.75F,20)
                .unlockedBy("blastbismuthore",has(ItemList.itemIngotBismuth))
                .save(consumer,new ResourceLocation("extraores:blastbismuthore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreBlackSteel.asItem()),ItemList.itemIngotBlackSteel,0.75F,20)
                .unlockedBy("blastblacksteelore",has(ItemList.itemIngotBlackSteel))
                .save(consumer,new ResourceLocation("extraores:blastblacksteelore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreCadmium.asItem()),ItemList.itemIngotCadmium,0.75F,20)
                .unlockedBy("blastcadmiumore",has(ItemList.itemIngotCadmium))
                .save(consumer,new ResourceLocation("extraores:blastcadmiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreCarmot.asItem()),ItemList.itemIngotCarmot,0.75F,20)
                .unlockedBy("blastcarmotore",has(ItemList.itemIngotCarmot))
                .save(consumer,new ResourceLocation("extraores:blastcarmotore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreCelenegil.asItem()),ItemList.itemIngotCelenegil,0.75F,20)
                .unlockedBy("blastcelenegilore",has(ItemList.itemIngotCelenegil))
                .save(consumer,new ResourceLocation("extraores:blastcelenegilore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreCeruclase.asItem()),ItemList.itemIngotCeruclase,0.75F,20)
                .unlockedBy("blastceruclaseore",has(ItemList.itemIngotCeruclase))
                .save(consumer,new ResourceLocation("extraores:blastceruclaseore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreChromium.asItem()),ItemList.itemIngotChromium,0.75F,20)
                .unlockedBy("blastchromiumore",has(ItemList.itemIngotChromium))
                .save(consumer,new ResourceLocation("extraores:blastchromiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreCobalt.asItem()),ItemList.itemIngotCobalt,0.75F,20)
                .unlockedBy("blastcobaltore",has(ItemList.itemIngotCobalt))
                .save(consumer,new ResourceLocation("extraores:blastcobaltore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreCopper.asItem()),ItemList.itemIngotCopper,0.75F,20)
                .unlockedBy("blastcopperore",has(ItemList.itemIngotCopper))
                .save(consumer,new ResourceLocation("extraores:blastcopperore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreDeepIron.asItem()),ItemList.itemIngotDeepIron,0.75F,20)
                .unlockedBy("blastdeepironore",has(ItemList.itemIngotDeepIron))
                .save(consumer,new ResourceLocation("extraores:blastdeepironore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreDesichalkos.asItem()),ItemList.itemIngotDesichalkos,0.75F,20)
                .unlockedBy("blastdesichalkosore",has(ItemList.itemIngotDesichalkos))
                .save(consumer,new ResourceLocation("extraores:blastdesichalkosore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreEximite.asItem()),ItemList.itemIngotEximite,0.75F,20)
                .unlockedBy("blasteximiteore",has(ItemList.itemIngotEximite))
                .save(consumer,new ResourceLocation("extraores:blasteximiteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreGallium.asItem()),ItemList.itemIngotGallium,0.75F,20)
                .unlockedBy("blastgalliumore",has(ItemList.itemIngotGallium))
                .save(consumer,new ResourceLocation("extraores:blastgalliumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreHaderoth.asItem()),ItemList.itemIngotHaderoth,0.75F,20)
                .unlockedBy("blasthaderothore",has(ItemList.itemIngotHaderoth))
                .save(consumer,new ResourceLocation("extraores:blasthaderothore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreHepatizon.asItem()),ItemList.itemIngotHepatizon,0.75F,20)
                .unlockedBy("blasthepatizonore",has(ItemList.itemIngotHepatizon))
                .save(consumer,new ResourceLocation("extraores:blasthepatizonore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreIgnatius.asItem()),ItemList.itemIngotIgnatius,0.75F,20)
                .unlockedBy("blastignatiusore",has(ItemList.itemIngotIgnatius))
                .save(consumer,new ResourceLocation("extraores:blastignatiusore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreIndium.asItem()),ItemList.itemIngotIndium,0.75F,20)
                .unlockedBy("blastindiumore",has(ItemList.itemIngotIndium))
                .save(consumer,new ResourceLocation("extraores:blastindiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreInfuscolium.asItem()),ItemList.itemIngotInfuscolium,0.75F,20)
                .unlockedBy("blastinfuscoliumore",has(ItemList.itemIngotInfuscolium))
                .save(consumer,new ResourceLocation("extraores:blastinfuscoliumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreInolashite.asItem()),ItemList.itemIngotInolashite,0.75F,20)
                .unlockedBy("blastinolashiteore",has(ItemList.itemIngotInolashite))
                .save(consumer,new ResourceLocation("extraores:blastinolashiteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreIridium.asItem()),ItemList.itemIngotIridium,0.75F,20)
                .unlockedBy("blastiridiumore",has(ItemList.itemIngotIridium))
                .save(consumer,new ResourceLocation("extraores:blastiridiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreKalendrite.asItem()),ItemList.itemIngotKalendrite,0.75F,20)
                .unlockedBy("blastkalendriteore",has(ItemList.itemIngotKalendrite))
                .save(consumer,new ResourceLocation("extraores:blastkalendriteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreLead.asItem()),ItemList.itemIngotLead,0.75F,20)
                .unlockedBy("blastleadore",has(ItemList.itemIngotLead))
                .save(consumer,new ResourceLocation("extraores:blastleadore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreLemurite.asItem()),ItemList.itemIngotLemurite,0.75F,20)
                .unlockedBy("blastlemuriteore",has(ItemList.itemIngotLemurite))
                .save(consumer,new ResourceLocation("extraores:blastlemuriteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreManganese.asItem()),ItemList.itemIngotManganese,0.75F,20)
                .unlockedBy("blastmanganeseore",has(ItemList.itemIngotManganese))
                .save(consumer,new ResourceLocation("extraores:blastmanganeseore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreMeutoite.asItem()),ItemList.itemIngotMeutoite,0.75F,20)
                .unlockedBy("blastmeutoiteore",has(ItemList.itemIngotMeutoite))
                .save(consumer,new ResourceLocation("extraores:blastmeutoiteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreMidasium.asItem()),ItemList.itemIngotMidasium,0.75F,20)
                .unlockedBy("blastmidasiumore",has(ItemList.itemIngotMidasium))
                .save(consumer,new ResourceLocation("extraores:blastmidasiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreMithril.asItem()),ItemList.itemIngotMithril,0.75F,20)
                .unlockedBy("blastmithrilore",has(ItemList.itemIngotMithril))
                .save(consumer,new ResourceLocation("extraores:blastmithrilore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreMolybdenum.asItem()),ItemList.itemIngotMolybdenum,0.75F,20)
                .unlockedBy("blastmolybdenumore",has(ItemList.itemIngotMolybdenum))
                .save(consumer,new ResourceLocation("extraores:blastmolybdenumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreNeodymium.asItem()),ItemList.itemIngotNeodymium,0.75F,20)
                .unlockedBy("blastneodymiumore",has(ItemList.itemIngotNeodymium))
                .save(consumer,new ResourceLocation("extraores:blastneodymiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreNeptunium.asItem()),ItemList.itemIngotNeptunium,0.75F,20)
                .unlockedBy("blastneptuniumore",has(ItemList.itemIngotNeptunium))
                .save(consumer,new ResourceLocation("extraores:blastneptuniumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreNickel.asItem()),ItemList.itemIngotNickel,0.75F,20)
                .unlockedBy("blastnickelore",has(ItemList.itemIngotNickel))
                .save(consumer,new ResourceLocation("extraores:blastnickelore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreNiobium.asItem()),ItemList.itemIngotNiobium,0.75F,20)
                .unlockedBy("blastniobiumore",has(ItemList.itemIngotNiobium))
                .save(consumer,new ResourceLocation("extraores:blastniobiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreOrichalcum.asItem()),ItemList.itemIngotOrichalcum,0.75F,20)
                .unlockedBy("blastorichalcumore",has(ItemList.itemIngotOrichalcum))
                .save(consumer,new ResourceLocation("extraores:blastorichalcumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreOureclase.asItem()),ItemList.itemIngotOureclase,0.75F,20)
                .unlockedBy("blastoureclaseore",has(ItemList.itemIngotOureclase))
                .save(consumer,new ResourceLocation("extraores:blastoureclaseore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOrePalladium.asItem()),ItemList.itemIngotPalladium,0.75F,20)
                .unlockedBy("blastpalladiumore",has(ItemList.itemIngotPalladium))
                .save(consumer,new ResourceLocation("extraores:blastpalladiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOrePlatinum.asItem()),ItemList.itemIngotPlatinum,0.75F,20)
                .unlockedBy("blastplatinumore",has(ItemList.itemIngotPlatinum))
                .save(consumer,new ResourceLocation("extraores:blastplatinumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOrePlutonium.asItem()),ItemList.itemIngotPlutonium,0.75F,20)
                .unlockedBy("blastplutoniumore",has(ItemList.itemIngotPlutonium))
                .save(consumer,new ResourceLocation("extraores:blastplutoniumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOrePolonium.asItem()),ItemList.itemIngotPolonium,0.75F,20)
                .unlockedBy("blastpoloniumore",has(ItemList.itemIngotPolonium))
                .save(consumer,new ResourceLocation("extraores:blastpoloniumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOrePromethium.asItem()),ItemList.itemIngotPromethium,0.75F,20)
                .unlockedBy("blastpromethiumore",has(ItemList.itemIngotPromethium))
                .save(consumer,new ResourceLocation("extraores:blastpromethiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreRhenium.asItem()),ItemList.itemIngotRhenium,0.75F,20)
                .unlockedBy("blastrheniumore",has(ItemList.itemIngotRhenium))
                .save(consumer,new ResourceLocation("extraores:blastrheniumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreRhodium.asItem()),ItemList.itemIngotRhodium,0.75F,20)
                .unlockedBy("blastrhodiumore",has(ItemList.itemIngotRhodium))
                .save(consumer,new ResourceLocation("extraores:blastrhodiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreRubracium.asItem()),ItemList.itemIngotRubracium,0.75F,20)
                .unlockedBy("blastrubraciumore",has(ItemList.itemIngotRubracium))
                .save(consumer,new ResourceLocation("extraores:blastrubraciumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreRuthenium.asItem()),ItemList.itemIngotRuthenium,0.75F,20)
                .unlockedBy("blastrutheniumore",has(ItemList.itemIngotRuthenium))
                .save(consumer,new ResourceLocation("extraores:blastrutheniumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreSanguinite.asItem()),ItemList.itemIngotSanguinite,0.75F,20)
                .unlockedBy("blastsanguiniteore",has(ItemList.itemIngotSanguinite))
                .save(consumer,new ResourceLocation("extraores:blastsanguiniteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreShadowIron.asItem()),ItemList.itemIngotShadowIron,0.75F,20)
                .unlockedBy("blastshadowironore",has(ItemList.itemIngotShadowIron))
                .save(consumer,new ResourceLocation("extraores:blastshadowironore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreSilver.asItem()),ItemList.itemIngotSilver,0.75F,20)
                .unlockedBy("blastsilverore",has(ItemList.itemIngotSilver))
                .save(consumer,new ResourceLocation("extraores:blastsilverore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreTantalum.asItem()),ItemList.itemIngotTantalum,0.75F,20)
                .unlockedBy("blasttantalumore",has(ItemList.itemIngotTantalum))
                .save(consumer,new ResourceLocation("extraores:blasttantalumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreTartarite.asItem()),ItemList.itemIngotTartarite,0.75F,20)
                .unlockedBy("blasttartariteore",has(ItemList.itemIngotTartarite))
                .save(consumer,new ResourceLocation("extraores:blasttartariteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreTechnetium.asItem()),ItemList.itemIngotTechnetium,0.75F,20)
                .unlockedBy("blasttechnetiumore",has(ItemList.itemIngotTechnetium))
                .save(consumer,new ResourceLocation("extraores:blasttechnetiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreThallium.asItem()),ItemList.itemIngotThallium,0.75F,20)
                .unlockedBy("blastthalliumore",has(ItemList.itemIngotThallium))
                .save(consumer,new ResourceLocation("extraores:blastthalliumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreTin.asItem()),ItemList.itemIngotTin,0.75F,20)
                .unlockedBy("blasttinore",has(ItemList.itemIngotTin))
                .save(consumer,new ResourceLocation("extraores:blasttinore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreTitanium.asItem()),ItemList.itemIngotTitanium,0.75F,20)
                .unlockedBy("blasttitaniumore",has(ItemList.itemIngotTitanium))
                .save(consumer,new ResourceLocation("extraores:blasttitaniumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreTungsten.asItem()),ItemList.itemIngotTungsten,0.75F,20)
                .unlockedBy("blasttungstenore",has(ItemList.itemIngotTungsten))
                .save(consumer,new ResourceLocation("extraores:blasttungstenore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreUnobtainium.asItem()),ItemList.itemIngotUnobtainium,0.75F,20)
                .unlockedBy("blastunobtainiumore",has(ItemList.itemIngotUnobtainium))
                .save(consumer,new ResourceLocation("extraores:blastunobtainiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreUranium.asItem()),ItemList.itemIngotUranium,0.75f,20)
                .unlockedBy("blasturaniumore",has(ItemList.itemIngotUranium))
                .save(consumer,new ResourceLocation("extraores:blasturaniumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreVanadium.asItem()),ItemList.itemIngotVanadium,0.75F,20)
                .unlockedBy("blastvanadiumore",has(ItemList.itemIngotVanadium))
                .save(consumer,new ResourceLocation("extraores:blastvanadiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreVulcanite.asItem()),ItemList.itemIngotVulcanite,0.75F,20)
                .unlockedBy("blastvulcaniteore",has(ItemList.itemIngotVulcanite))
                .save(consumer,new ResourceLocation("extraores:blastvulcaniteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreVyroxeres.asItem()),ItemList.itemIngotVyroxeres,0.75F,20)
                .unlockedBy("blastvyroxeresore",has(ItemList.itemIngotVyroxeres))
                .save(consumer,new ResourceLocation("extraores:blastvyroxeresore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreYellorite.asItem()),ItemList.itemIngotYellorite,0.75F,20)
                .unlockedBy("blastyelloriteore",has(ItemList.itemIngotYellorite))
                .save(consumer,new ResourceLocation("extraores:blastyelloriteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreZinc.asItem()),ItemList.itemIngotZinc,0.75F,20)
                .unlockedBy("blastzincore",has(ItemList.itemIngotZinc))
                .save(consumer,new ResourceLocation("extraores:blastzincore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockList.blockOreZirconium.asItem()),ItemList.itemIngotZirconium,0.75F,20)
                .unlockedBy("blastzirconiumore",has(ItemList.itemIngotZirconium))
                .save(consumer,new ResourceLocation("extraores:blastzirconiumore"));
        //Blasting Dust
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustAdamantine),ItemList.itemIngotAdamantine,0.75F,10)
                .unlockedBy("blastadamantinedust",has(ItemList.itemIngotAdamantine))
                .save(consumer,new ResourceLocation("extraores:blastadamantinedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustAldourite),ItemList.itemIngotAldourite,0.75F,10)
                .unlockedBy("blastaldouritedust",has(ItemList.itemIngotAldourite))
                .save(consumer,new ResourceLocation("extraores:blastaldouritedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustAluminum),ItemList.itemIngotAluminum,0.75F,10)
                .unlockedBy("blastaluminumdust",has(ItemList.itemIngotAluminum))
                .save(consumer,new ResourceLocation("extraores:blastaluminumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustAmericium),ItemList.itemIngotAmericium,0.75F,10)
                .unlockedBy("blastamericiumdust",has(ItemList.itemIngotAmericium))
                .save(consumer,new ResourceLocation("extraores:blastamericiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustAmordrine),ItemList.itemIngotAmordrine,0.75F,10)
                .unlockedBy("blastamordrinedust",has(ItemList.itemIngotAmordrine))
                .save(consumer,new ResourceLocation("extraores:blastamordrinedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustAngmallen),ItemList.itemIngotAngmallen,0.75F,10)
                .unlockedBy("blastangmallendust",has(ItemList.itemIngotAngmallen))
                .save(consumer,new ResourceLocation("extraores:blastangmallendust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustAstralSilver),ItemList.itemIngotAstralSilver,0.75F,10)
                .unlockedBy("blastastralsilverdust",has(ItemList.itemIngotAstralSilver))
                .save(consumer,new ResourceLocation("extraores:blastastralsilverdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustAtlarus),ItemList.itemIngotAtlarus,0.75F,10)
                .unlockedBy("blastatlarusdust",has(ItemList.itemIngotAtlarus))
                .save(consumer,new ResourceLocation("extraores:blastatlarusdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustBismuth),ItemList.itemIngotBismuth,0.75F,10)
                .unlockedBy("blastbismuthdust",has(ItemList.itemIngotBismuth))
                .save(consumer,new ResourceLocation("extraores:blastbismuthdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustBlackSteel),ItemList.itemIngotBlackSteel,0.75F,10)
                .unlockedBy("blastblacksteeldust",has(ItemList.itemIngotBlackSteel))
                .save(consumer,new ResourceLocation("extraores:blastblacksteeldust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustCadmium),ItemList.itemIngotCadmium,0.75F,10)
                .unlockedBy("blastcadmiumdust",has(ItemList.itemIngotCadmium))
                .save(consumer,new ResourceLocation("extraores:blastcadmiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustCarmot),ItemList.itemIngotCarmot,0.75F,10)
                .unlockedBy("blastcarmotdust",has(ItemList.itemIngotCarmot))
                .save(consumer,new ResourceLocation("extraores:blastcarmotdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustCelenegil),ItemList.itemIngotCelenegil,0.75F,10)
                .unlockedBy("blastcelenegildust",has(ItemList.itemIngotCelenegil))
                .save(consumer,new ResourceLocation("extraores:blastcelenegildust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustCeruclase),ItemList.itemIngotCeruclase,0.75F,10)
                .unlockedBy("blastceruclasedust",has(ItemList.itemIngotCeruclase))
                .save(consumer,new ResourceLocation("extraores:blastceruclasedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustChromium),ItemList.itemIngotChromium,0.75F,10)
                .unlockedBy("blastchromiumdust",has(ItemList.itemIngotChromium))
                .save(consumer,new ResourceLocation("extraores:blastchromiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustCobalt),ItemList.itemIngotCobalt,0.75F,10)
                .unlockedBy("blastcobaltdust",has(ItemList.itemIngotCobalt))
                .save(consumer,new ResourceLocation("extraores:blastcobaltdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustCopper),ItemList.itemIngotCopper,0.75F,10)
                .unlockedBy("blastcopperdust",has(ItemList.itemIngotCopper))
                .save(consumer,new ResourceLocation("extraores:blastcopperdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustDeepIron),ItemList.itemIngotDeepIron,0.75F,10)
                .unlockedBy("blastdeepirondust",has(ItemList.itemIngotDeepIron))
                .save(consumer,new ResourceLocation("extraores:blastdeepirondust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustDesichalkos),ItemList.itemIngotDesichalkos,0.75F,10)
                .unlockedBy("blastdesichalkosdust",has(ItemList.itemIngotDesichalkos))
                .save(consumer,new ResourceLocation("extraores:blastdesichalkosdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustEximite),ItemList.itemIngotEximite,0.75F,10)
                .unlockedBy("blasteximitedust",has(ItemList.itemIngotEximite))
                .save(consumer,new ResourceLocation("extraores:blasteximitedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustGallium),ItemList.itemIngotGallium,0.75F,10)
                .unlockedBy("blastgalliumdust",has(ItemList.itemIngotGallium))
                .save(consumer,new ResourceLocation("extraores:blastgalliumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustHaderoth),ItemList.itemIngotHaderoth,0.75F,10)
                .unlockedBy("blasthaderothdust",has(ItemList.itemIngotHaderoth))
                .save(consumer,new ResourceLocation("extraores:blasthaderothdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustHepatizon),ItemList.itemIngotHepatizon,0.75F,10)
                .unlockedBy("blasthepatizondust",has(ItemList.itemIngotHepatizon))
                .save(consumer,new ResourceLocation("extraores:blasthepatizondust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustIgnatius),ItemList.itemIngotIgnatius,0.75F,10)
                .unlockedBy("blastignatiusdust",has(ItemList.itemIngotIgnatius))
                .save(consumer,new ResourceLocation("extraores:blastignatiusdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustIndium),ItemList.itemIngotIndium,0.75F,10)
                .unlockedBy("blastindiumdust",has(ItemList.itemIngotIndium))
                .save(consumer,new ResourceLocation("extraores:blastindiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustInfuscolium),ItemList.itemIngotInfuscolium,0.75F,10)
                .unlockedBy("blastinfuscoliumdust",has(ItemList.itemIngotInfuscolium))
                .save(consumer,new ResourceLocation("extraores:blastinfuscoliumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustInolashite),ItemList.itemIngotInolashite,0.75F,10)
                .unlockedBy("blastinolashitedust",has(ItemList.itemIngotInolashite))
                .save(consumer,new ResourceLocation("extraores:blastinolashitedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustIridium),ItemList.itemIngotIridium,0.75F,10)
                .unlockedBy("blastiridiumdust",has(ItemList.itemIngotIridium))
                .save(consumer,new ResourceLocation("extraores:blastiridiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustKalendrite),ItemList.itemIngotKalendrite,0.75F,10)
                .unlockedBy("blastkalendritedust",has(ItemList.itemIngotKalendrite))
                .save(consumer,new ResourceLocation("extraores:blastkalendritedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustLead),ItemList.itemIngotLead,0.75F,10)
                .unlockedBy("blastleaddust",has(ItemList.itemIngotLead))
                .save(consumer,new ResourceLocation("extraores:blastleaddust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustLemurite),ItemList.itemIngotLemurite,0.75F,10)
                .unlockedBy("blastlemuritedust",has(ItemList.itemIngotLemurite))
                .save(consumer,new ResourceLocation("extraores:blastlemuritedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustManganese),ItemList.itemIngotManganese,0.75F,10)
                .unlockedBy("blastmanganesedust",has(ItemList.itemIngotManganese))
                .save(consumer,new ResourceLocation("extraores:blastmanganesedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustMeutoite),ItemList.itemIngotMeutoite,0.75F,10)
                .unlockedBy("blastmeutoitedust",has(ItemList.itemIngotMeutoite))
                .save(consumer,new ResourceLocation("extraores:blastmeutoitedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustMidasium),ItemList.itemIngotMidasium,0.75F,10)
                .unlockedBy("blastmidasiumdust",has(ItemList.itemIngotMidasium))
                .save(consumer,new ResourceLocation("extraores:blastmidasiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustMithril),ItemList.itemIngotMithril,0.75F,10)
                .unlockedBy("blastmithrildust",has(ItemList.itemIngotMithril))
                .save(consumer,new ResourceLocation("extraores:blastmithrildust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustMolybdenum),ItemList.itemIngotMolybdenum,0.75F,10)
                .unlockedBy("blastmolybdenumdust",has(ItemList.itemIngotMolybdenum))
                .save(consumer,new ResourceLocation("extraores:blastmolybdenumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustNeodymium),ItemList.itemIngotNeodymium,0.75F,10)
                .unlockedBy("blastneodymiumdust",has(ItemList.itemIngotNeodymium))
                .save(consumer,new ResourceLocation("extraores:blastneodymiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustNeptunium),ItemList.itemIngotNeptunium,0.75F,10)
                .unlockedBy("blastneptuniumdust",has(ItemList.itemIngotNeptunium))
                .save(consumer,new ResourceLocation("extraores:blastneptuniumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustNickel),ItemList.itemIngotNickel,0.75F,10)
                .unlockedBy("blastnickeldust",has(ItemList.itemIngotNickel))
                .save(consumer,new ResourceLocation("extraores:blastnickeldust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustNiobium),ItemList.itemIngotNiobium,0.75F,10)
                .unlockedBy("blastniobiumdust",has(ItemList.itemIngotNiobium))
                .save(consumer,new ResourceLocation("extraores:blastniobiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustOrichalcum),ItemList.itemIngotOrichalcum,0.75F,10)
                .unlockedBy("blastorichalcumdust",has(ItemList.itemIngotOrichalcum))
                .save(consumer,new ResourceLocation("extraores:blastorichalcumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustOureclase),ItemList.itemIngotOureclase,0.75F,10)
                .unlockedBy("blastoureclasedust",has(ItemList.itemIngotOureclase))
                .save(consumer,new ResourceLocation("extraores:blastoureclasedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustPalladium),ItemList.itemIngotPalladium,0.75F,10)
                .unlockedBy("blastpalladiumdust",has(ItemList.itemIngotPalladium))
                .save(consumer,new ResourceLocation("extraores:blastpalladiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustPlatinum),ItemList.itemIngotPlatinum,0.75F,10)
                .unlockedBy("blastplatinumdust",has(ItemList.itemIngotPlatinum))
                .save(consumer,new ResourceLocation("extraores:blastplatinumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustPlutonium),ItemList.itemIngotPlutonium,0.75F,10)
                .unlockedBy("blastplutoniumdust",has(ItemList.itemIngotPlutonium))
                .save(consumer,new ResourceLocation("extraores:blastplutoniumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustPolonium),ItemList.itemIngotPolonium,0.75F,10)
                .unlockedBy("blastpoloniumdust",has(ItemList.itemIngotPolonium))
                .save(consumer,new ResourceLocation("extraores:blastpoloniumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustPromethium),ItemList.itemIngotPromethium,0.75F,10)
                .unlockedBy("blastpromethiumdust",has(ItemList.itemIngotPromethium))
                .save(consumer,new ResourceLocation("extraores:blastpromethiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustRhenium),ItemList.itemIngotRhenium,0.75F,10)
                .unlockedBy("blastrheniumdust",has(ItemList.itemIngotRhenium))
                .save(consumer,new ResourceLocation("extraores:blastrheniumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustRhodium),ItemList.itemIngotRhodium,0.75F,10)
                .unlockedBy("blastrhodiumdust",has(ItemList.itemIngotRhodium))
                .save(consumer,new ResourceLocation("extraores:blastrhodiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustRubracium),ItemList.itemIngotRubracium,0.75F,10)
                .unlockedBy("blastrubraciumdust",has(ItemList.itemIngotRubracium))
                .save(consumer,new ResourceLocation("extraores:blastrubraciumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustRuthenium),ItemList.itemIngotRuthenium,0.75F,10)
                .unlockedBy("blastrutheniumdust",has(ItemList.itemIngotRuthenium))
                .save(consumer,new ResourceLocation("extraores:blastrutheniumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustSanguinite),ItemList.itemIngotSanguinite,0.75F,10)
                .unlockedBy("blastsanguinitedust",has(ItemList.itemIngotSanguinite))
                .save(consumer,new ResourceLocation("extraores:blastsanguinitedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustShadowIron),ItemList.itemIngotShadowIron,0.75F,10)
                .unlockedBy("blastshadowirondust",has(ItemList.itemIngotShadowIron))
                .save(consumer,new ResourceLocation("extraores:blastshadowirondust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustSilver),ItemList.itemIngotSilver,0.75F,10)
                .unlockedBy("blastsilverdust",has(ItemList.itemIngotSilver))
                .save(consumer,new ResourceLocation("extraores:blastsilverdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustTantalum),ItemList.itemIngotTantalum,0.75F,10)
                .unlockedBy("blasttantalumdust",has(ItemList.itemIngotTantalum))
                .save(consumer,new ResourceLocation("extraores:blasttantalumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustTartarite),ItemList.itemIngotTartarite,0.75F,10)
                .unlockedBy("blasttartaritedust",has(ItemList.itemIngotTartarite))
                .save(consumer,new ResourceLocation("extraores:blasttartaritedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustTechnetium),ItemList.itemIngotTechnetium,0.75F,10)
                .unlockedBy("blasttechnetiumdust",has(ItemList.itemIngotTechnetium))
                .save(consumer,new ResourceLocation("extraores:blasttechnetiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustThallium),ItemList.itemIngotThallium,0.75F,10)
                .unlockedBy("blastthalliumdust",has(ItemList.itemIngotThallium))
                .save(consumer,new ResourceLocation("extraores:blastthalliumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustTin),ItemList.itemIngotTin,0.75F,10)
                .unlockedBy("blasttindust",has(ItemList.itemIngotTin))
                .save(consumer,new ResourceLocation("extraores:blasttindust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustTitanium),ItemList.itemIngotTitanium,0.75F,10)
                .unlockedBy("blasttitaniumdust",has(ItemList.itemIngotTitanium))
                .save(consumer,new ResourceLocation("extraores:blasttitaniumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustTungsten),ItemList.itemIngotTungsten,0.75F,10)
                .unlockedBy("blasttungstendust",has(ItemList.itemIngotTungsten))
                .save(consumer,new ResourceLocation("extraores:blasttungstendust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustUnobtainium),ItemList.itemIngotUnobtainium,0.75F,10)
                .unlockedBy("blastunobtainiumdust",has(ItemList.itemIngotUnobtainium))
                .save(consumer,new ResourceLocation("extraores:blastunobtainiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustUranium),ItemList.itemIngotUranium,0.75f,10)
                .unlockedBy("blasturaniumdust",has(ItemList.itemIngotUranium))
                .save(consumer,new ResourceLocation("extraores:blasturaniumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustVanadium),ItemList.itemIngotVanadium,0.75F,10)
                .unlockedBy("blastvanadiumdust",has(ItemList.itemIngotVanadium))
                .save(consumer,new ResourceLocation("extraores:blastvanadiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustVulcanite),ItemList.itemIngotVulcanite,0.75F,10)
                .unlockedBy("blastvulcanitedust",has(ItemList.itemIngotVulcanite))
                .save(consumer,new ResourceLocation("extraores:blastvulcanitedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustVyroxeres),ItemList.itemIngotVyroxeres,0.75F,10)
                .unlockedBy("blastvyroxeresdust",has(ItemList.itemIngotVyroxeres))
                .save(consumer,new ResourceLocation("extraores:blastvyroxeresdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustYellorite),ItemList.itemIngotYellorite,0.75F,10)
                .unlockedBy("blastyelloritedust",has(ItemList.itemIngotYellorite))
                .save(consumer,new ResourceLocation("extraores:blastyelloritedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustZinc),ItemList.itemIngotZinc,0.75F,10)
                .unlockedBy("blastzincdust",has(ItemList.itemIngotZinc))
                .save(consumer,new ResourceLocation("extraores:blastzincdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemList.itemDustZirconium),ItemList.itemIngotZirconium,0.75F,10)
                .unlockedBy("blastzirconiumdust",has(ItemList.itemIngotZirconium))
                .save(consumer,new ResourceLocation("extraores:blastzirconiumdust"));
    }
    protected void buildMekanismInjecting(Consumer<FinishedRecipe> consumer)
    {
        //Ore
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreAdamantine), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardAdamantine,4))
                .addCriterion("injectadamantineore",has(BlockList.blockOreAdamantine))
                .build(consumer,new ResourceLocation("extraores:injectadamantineore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreAldourite),IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardAldourite,4))
                .addCriterion("injectaldouriteore",has(BlockList.blockOreAldourite))
                .build(consumer,new ResourceLocation("extraores:injectaldouriteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreAluminum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardAluminum,4))
                .addCriterion("injectaluminumore",has(BlockList.blockOreAluminum))
                .build(consumer,new ResourceLocation("extraores:injectaluminumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreAmericium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardAmericium,4))
                .addCriterion("injectamericiumore",has(BlockList.blockOreAmericium))
                .build(consumer,new ResourceLocation("extraores:injectamericiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreAmordrine), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardAmordrine,4))
                .addCriterion("injectamordrineore",has(BlockList.blockOreAmordrine))
                .build(consumer,new ResourceLocation("extraores:injectamordrineore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreAngmallen), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardAngmallen,4))
                .addCriterion("injectangmallenore",has(BlockList.blockOreAngmallen))
                .build(consumer,new ResourceLocation("extraores:injectangmallenore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreAstralSilver), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardAstralSilver,4))
                .addCriterion("injectastralsilverore",has(BlockList.blockOreAstralSilver))
                .build(consumer,new ResourceLocation("extraores:injectastralsilverore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreAtlarus), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardAtlarus,4))
                .addCriterion("injectatlarusore",has(BlockList.blockOreAtlarus))
                .build(consumer,new ResourceLocation("extraores:injectatlarusore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreBismuth), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardBismuth,4))
                .addCriterion("injectbismuthore",has(BlockList.blockOreBismuth))
                .build(consumer,new ResourceLocation("extraores:injectbismuthore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreBlackSteel), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardBlackSteel,4))
                .addCriterion("injectblacksteelore",has(BlockList.blockOreBlackSteel))
                .build(consumer,new ResourceLocation("extraores:injectblacksteelore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreCadmium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardCadmium,4))
                .addCriterion("injectcadmiumore",has(BlockList.blockOreCadmium))
                .build(consumer,new ResourceLocation("extraores:injectcadmiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreCarmot), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardCarmot,4))
                .addCriterion("injectcarmotore",has(BlockList.blockOreCarmot))
                .build(consumer,new ResourceLocation("extraores:injectcarmotore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreCelenegil), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardCelenegil,4))
                .addCriterion("injectcelenegilore",has(BlockList.blockOreCelenegil))
                .build(consumer,new ResourceLocation("extraores:injectcelenegilore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreCeruclase), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardCeruclase,4))
                .addCriterion("injectceruclaseore",has(BlockList.blockOreCeruclase))
                .build(consumer,new ResourceLocation("extraores:injectceruclaseore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreChromium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardChromium,4))
                .addCriterion("injectchromiumore",has(BlockList.blockOreChromium))
                .build(consumer,new ResourceLocation("extraores:injectchromiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreCobalt), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardCobalt,4))
                .addCriterion("injectcobaltore",has(BlockList.blockOreCobalt))
                .build(consumer,new ResourceLocation("extraores:injectcobaltore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreCopper), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardCopper,4))
                .addCriterion("injectcopperore",has(BlockList.blockOreCopper))
                .build(consumer,new ResourceLocation("extraores:injectcopperore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreDeepIron), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardDeepIron,4))
                .addCriterion("injectdeepironore",has(BlockList.blockOreDeepIron))
                .build(consumer,new ResourceLocation("extraores:injectdeepironore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreDesichalkos), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardDesichalkos,4))
                .addCriterion("injectdesichalkosore",has(BlockList.blockOreDesichalkos))
                .build(consumer,new ResourceLocation("extraores:injectdesichalkosore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreEximite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardEximite,4))
                .addCriterion("injecteximiteore",has(BlockList.blockOreEximite))
                .build(consumer,new ResourceLocation("extraores:injecteximiteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreGallium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardGallium,4))
                .addCriterion("injectgalliumore",has(BlockList.blockOreGallium))
                .build(consumer,new ResourceLocation("extraores:injectgalliumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreHaderoth), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardHaderoth,4))
                .addCriterion("injecthaderothore",has(BlockList.blockOreHaderoth))
                .build(consumer,new ResourceLocation("extraores:injecthaderothore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreHepatizon), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardHepatizon,4))
                .addCriterion("injecthepatizonore",has(BlockList.blockOreHepatizon))
                .build(consumer,new ResourceLocation("extraores:injecthepatizonore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreIgnatius), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardIgnatius,4))
                .addCriterion("injectignatiusore",has(BlockList.blockOreIgnatius))
                .build(consumer,new ResourceLocation("extraores:injectignatiusore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreIndium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardIndium,4))
                .addCriterion("injectindiumore",has(BlockList.blockOreIndium))
                .build(consumer,new ResourceLocation("extraores:injectindiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreInfuscolium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardInfuscolium,4))
                .addCriterion("injectinfuscoliumore",has(BlockList.blockOreInfuscolium))
                .build(consumer,new ResourceLocation("extraores:injectinfuscoliumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreInolashite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardInolashite,4))
                .addCriterion("injectinolashiteore",has(BlockList.blockOreInolashite))
                .build(consumer,new ResourceLocation("extraores:injectinolashiteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreIridium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardIridium,4))
                .addCriterion("injectiridiumore",has(BlockList.blockOreIridium))
                .build(consumer,new ResourceLocation("extraores:injectiridiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreKalendrite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardKalendrite,4))
                .addCriterion("injectkalendriteore",has(BlockList.blockOreKalendrite))
                .build(consumer,new ResourceLocation("extraores:injectkalendriteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreLead), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardLead,4))
                .addCriterion("injectleadore",has(BlockList.blockOreLead))
                .build(consumer,new ResourceLocation("extraores:injectleadore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreLemurite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardLemurite,4))
                .addCriterion("injectlemuriteore",has(BlockList.blockOreLemurite))
                .build(consumer,new ResourceLocation("extraores:injectlemuriteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreManganese), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardManganese,4))
                .addCriterion("injectmanganeseore",has(BlockList.blockOreManganese))
                .build(consumer,new ResourceLocation("extraores:injectmanganeseore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreMeutoite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardMeutoite,4))
                .addCriterion("injectmeutoiteore",has(BlockList.blockOreMeutoite))
                .build(consumer,new ResourceLocation("extraores:injectmeutoiteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreMidasium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardMidasium,4))
                .addCriterion("injectmidasiumore",has(BlockList.blockOreMidasium))
                .build(consumer,new ResourceLocation("extraores:injectmidasiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreMithril), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardMithril,4))
                .addCriterion("injectmithrilore",has(BlockList.blockOreMithril))
                .build(consumer,new ResourceLocation("extraores:injectmithrilore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreMolybdenum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardMolybdenum,4))
                .addCriterion("injectmolybdenumore",has(BlockList.blockOreMolybdenum))
                .build(consumer,new ResourceLocation("extraores:injectmolybdenumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreNeodymium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardNeodymium,4))
                .addCriterion("injectneodymiumore",has(BlockList.blockOreNeodymium))
                .build(consumer,new ResourceLocation("extraores:injectneodymiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreNeptunium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardNeptunium,4))
                .addCriterion("injectneptuniumore",has(BlockList.blockOreNeptunium))
                .build(consumer,new ResourceLocation("extraores:injectneptuniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreNickel), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardNickel,4))
                .addCriterion("injectnickelore",has(BlockList.blockOreNickel))
                .build(consumer,new ResourceLocation("extraores:injectnickelore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreNiobium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardNiobium,4))
                .addCriterion("injectniobiumore",has(BlockList.blockOreNiobium))
                .build(consumer,new ResourceLocation("extraores:injectniobiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreOrichalcum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardOrichalcum,4))
                .addCriterion("injectorichalcumore",has(BlockList.blockOreOrichalcum))
                .build(consumer,new ResourceLocation("extraores:injectorichalcumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreOsmium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardOsmium,4))
                .addCriterion("injectosmiumore",has(BlockList.blockOreOsmium))
                .build(consumer,new ResourceLocation("extraores:injectosmiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreOureclase), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardOureclase,4))
                .addCriterion("injectoureclaseore",has(BlockList.blockOreOureclase))
                .build(consumer,new ResourceLocation("extraores:injectoureclaseore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.orePalladium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardPalladium,4))
                .addCriterion("injectpalladiumore",has(BlockList.blockOrePalladium))
                .build(consumer,new ResourceLocation("extraores:injectpalladiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.orePlatinum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardPlatinum,4))
                .addCriterion("injectplatinumore",has(BlockList.blockOrePlatinum))
                .build(consumer,new ResourceLocation("extraores:injectplatinumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.orePlutonium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardPlutonium,4))
                .addCriterion("injectplutoniumore",has(BlockList.blockOrePlutonium))
                .build(consumer,new ResourceLocation("extraores:injectplutoniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.orePolonium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardPolonium,4))
                .addCriterion("injectpoloniumore",has(BlockList.blockOrePolonium))
                .build(consumer,new ResourceLocation("extraores:injectpoloniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.orePromethium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardPromethium,4))
                .addCriterion("injectpromethiumore",has(BlockList.blockOrePromethium))
                .build(consumer,new ResourceLocation("extraores:injectpromethiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreRhenium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardRhenium,4))
                .addCriterion("injectrheniumore",has(BlockList.blockOreRhenium))
                .build(consumer,new ResourceLocation("extraores:injectrheniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreRhodium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardRhodium,4))
                .addCriterion("injectrhodiumore",has(BlockList.blockOreRhodium))
                .build(consumer,new ResourceLocation("extraores:injectrhodiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreRubracium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardRubracium,4))
                .addCriterion("injectrubraciumore",has(BlockList.blockOreRubracium))
                .build(consumer,new ResourceLocation("extraores:injectrubraciumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreRuthenium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardRuthenium,4))
                .addCriterion("injectrutheniumore",has(BlockList.blockOreRuthenium))
                .build(consumer,new ResourceLocation("extraores:injectrutheniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreSanguinite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardSanguinite,4))
                .addCriterion("injectsanguiniteore",has(BlockList.blockOreSanguinite))
                .build(consumer,new ResourceLocation("extraores:injectsanguiniteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreShadowIron), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardShadowIron,4))
                .addCriterion("injectshadowironore",has(BlockList.blockOreShadowIron))
                .build(consumer,new ResourceLocation("extraores:injectshadowironore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreSilver), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardSilver,4))
                .addCriterion("injectsilverore",has(BlockList.blockOreSilver))
                .build(consumer,new ResourceLocation("extraores:injectsilverore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreTantalum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardTantalum,4))
                .addCriterion("injecttantalumore",has(BlockList.blockOreTantalum))
                .build(consumer,new ResourceLocation("extraores:injecttantalumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreTartarite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardTartarite,4))
                .addCriterion("injecttartariteore",has(BlockList.blockOreTartarite))
                .build(consumer,new ResourceLocation("extraores:injecttartariteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreTechnetium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardTechnetium,4))
                .addCriterion("injecttechnetiumore",has(BlockList.blockOreTechnetium))
                .build(consumer,new ResourceLocation("extraores:injecttechnetiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreThallium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardThallium,4))
                .addCriterion("injectthalliumore",has(BlockList.blockOreThallium))
                .build(consumer,new ResourceLocation("extraores:injectthalliumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreTin), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardTin,4))
                .addCriterion("injecttinore",has(BlockList.blockOreTin))
                .build(consumer,new ResourceLocation("extraores:injecttinore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreTitanium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardTitanium,4))
                .addCriterion("injecttitaniumore",has(BlockList.blockOreTitanium))
                .build(consumer,new ResourceLocation("extraores:injecttitaniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreTungsten), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardTungsten,4))
                .addCriterion("injecttungstenore",has(BlockList.blockOreTungsten))
                .build(consumer,new ResourceLocation("extraores:injecttungstenore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreUnobtainium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardUnobtainium,4))
                .addCriterion("injectunobtainiumore",has(BlockList.blockOreUnobtainium))
                .build(consumer,new ResourceLocation("extraores:injectunobtainiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreUranium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardUranium,4))
                .addCriterion("injecturaniumore",has(BlockList.blockOreUranium))
                .build(consumer,new ResourceLocation("extraores:injecturaniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreVanadium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardVanadium,4))
                .addCriterion("injectvanadiumore",has(BlockList.blockOreVanadium))
                .build(consumer,new ResourceLocation("extraores:injectvanadiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreVulcanite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardVulcanite,4))
                .addCriterion("injectvulcaniteore",has(BlockList.blockOreVulcanite))
                .build(consumer,new ResourceLocation("extraores:injectvulcaniteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreVyroxeres), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardVyroxeres,4))
                .addCriterion("injectvyroxeresore",has(BlockList.blockOreVyroxeres))
                .build(consumer,new ResourceLocation("extraores:injectvyroxeresore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreYellorite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardYellorite,4))
                .addCriterion("injectyelloriteore",has(BlockList.blockOreYellorite))
                .build(consumer,new ResourceLocation("extraores:injectyelloriteore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreZinc), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardZinc,4))
                .addCriterion("injectzincore",has(BlockList.blockOreZinc))
                .build(consumer,new ResourceLocation("extraores:injectzincore"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.oreZirconium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardZirconium,4))
                .addCriterion("injectzirconiumore",has(BlockList.blockOreZirconium))
                .build(consumer,new ResourceLocation("extraores:injectzirconiumore"));
        //Raw
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawAdamantine), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardAdamantine,4))
                .addCriterion("injectrawadamantine",has(BlockList.blockOreAdamantine))
                .build(consumer,new ResourceLocation("extraores:injectrawadamantine"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawAldourite),IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardAldourite,4))
                .addCriterion("injectrawaldourite",has(BlockList.blockOreAldourite))
                .build(consumer,new ResourceLocation("extraores:injectrawaldourite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawAluminum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardAluminum,4))
                .addCriterion("injectrawaluminum",has(BlockList.blockOreAluminum))
                .build(consumer,new ResourceLocation("extraores:injectrawaluminum"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawAmericium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardAmericium,4))
                .addCriterion("injectrawamericium",has(BlockList.blockOreAmericium))
                .build(consumer,new ResourceLocation("extraores:injectrawamericium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawAmordrine), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardAmordrine,4))
                .addCriterion("injectrawamordrine",has(BlockList.blockOreAmordrine))
                .build(consumer,new ResourceLocation("extraores:injectrawamordrine"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawAngmallen), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardAngmallen,4))
                .addCriterion("injectrawangmallen",has(BlockList.blockOreAngmallen))
                .build(consumer,new ResourceLocation("extraores:injectrawangmallen"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawAstralSilver), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardAstralSilver,4))
                .addCriterion("injectrawastralsilver",has(BlockList.blockOreAstralSilver))
                .build(consumer,new ResourceLocation("extraores:injectrawastralsilver"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawAtlarus), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardAtlarus,4))
                .addCriterion("injectrawatlarus",has(BlockList.blockOreAtlarus))
                .build(consumer,new ResourceLocation("extraores:injectrawatlarus"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawBismuth), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardBismuth,4))
                .addCriterion("injectrawbismuth",has(BlockList.blockOreBismuth))
                .build(consumer,new ResourceLocation("extraores:injectrawbismuth"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawBlackSteel), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardBlackSteel,4))
                .addCriterion("injectrawblacksteel",has(BlockList.blockOreBlackSteel))
                .build(consumer,new ResourceLocation("extraores:injectrawblacksteel"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawCadmium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardCadmium,4))
                .addCriterion("injectrawcadmium",has(BlockList.blockOreCadmium))
                .build(consumer,new ResourceLocation("extraores:injectrawcadmium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawCarmot), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardCarmot,4))
                .addCriterion("injectrawcarmot",has(BlockList.blockOreCarmot))
                .build(consumer,new ResourceLocation("extraores:injectrawcarmot"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawCelenegil), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardCelenegil,4))
                .addCriterion("injectrawcelenegil",has(BlockList.blockOreCelenegil))
                .build(consumer,new ResourceLocation("extraores:injectrawcelenegil"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawCeruclase), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardCeruclase,4))
                .addCriterion("injectrawceruclase",has(BlockList.blockOreCeruclase))
                .build(consumer,new ResourceLocation("extraores:injectrawceruclase"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawChromium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardChromium,4))
                .addCriterion("injectrawchromium",has(BlockList.blockOreChromium))
                .build(consumer,new ResourceLocation("extraores:injectrawchromium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawCobalt), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardCobalt,4))
                .addCriterion("injectrawcobalt",has(BlockList.blockOreCobalt))
                .build(consumer,new ResourceLocation("extraores:injectrawcobalt"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawCopper), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardCopper,4))
                .addCriterion("injectrawcopper",has(BlockList.blockOreCopper))
                .build(consumer,new ResourceLocation("extraores:injectrawcopper"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawDeepIron), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardDeepIron,4))
                .addCriterion("injectrawdeepiron",has(BlockList.blockOreDeepIron))
                .build(consumer,new ResourceLocation("extraores:injectrawdeepiron"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawDesichalkos), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardDesichalkos,4))
                .addCriterion("injectrawdesichalkos",has(BlockList.blockOreDesichalkos))
                .build(consumer,new ResourceLocation("extraores:injectrawdesichalkos"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawEximite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardEximite,4))
                .addCriterion("injectraweximite",has(BlockList.blockOreEximite))
                .build(consumer,new ResourceLocation("extraores:injectraweximite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawGallium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardGallium,4))
                .addCriterion("injectrawgallium",has(BlockList.blockOreGallium))
                .build(consumer,new ResourceLocation("extraores:injectrawgallium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawHaderoth), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardHaderoth,4))
                .addCriterion("injectrawhaderoth",has(BlockList.blockOreHaderoth))
                .build(consumer,new ResourceLocation("extraores:injectrawhaderoth"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawHepatizon), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardHepatizon,4))
                .addCriterion("injectrawhepatizon",has(BlockList.blockOreHepatizon))
                .build(consumer,new ResourceLocation("extraores:injectrawhepatizon"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawIgnatius), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardIgnatius,4))
                .addCriterion("injectrawignatius",has(BlockList.blockOreIgnatius))
                .build(consumer,new ResourceLocation("extraores:injectrawignatius"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawIndium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardIndium,4))
                .addCriterion("injectrawindium",has(BlockList.blockOreIndium))
                .build(consumer,new ResourceLocation("extraores:injectrawindium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawInfuscolium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardInfuscolium,4))
                .addCriterion("injectrawinfuscolium",has(BlockList.blockOreInfuscolium))
                .build(consumer,new ResourceLocation("extraores:injectrawinfuscolium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawInolashite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardInolashite,4))
                .addCriterion("injectrawinolashite",has(BlockList.blockOreInolashite))
                .build(consumer,new ResourceLocation("extraores:injectrawinolashite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawIridium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardIridium,4))
                .addCriterion("injectrawiridium",has(BlockList.blockOreIridium))
                .build(consumer,new ResourceLocation("extraores:injectrawiridium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawKalendrite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardKalendrite,4))
                .addCriterion("injectrawkalendrite",has(BlockList.blockOreKalendrite))
                .build(consumer,new ResourceLocation("extraores:injectrawkalendrite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawLead), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardLead,4))
                .addCriterion("injectrawlead",has(BlockList.blockOreLead))
                .build(consumer,new ResourceLocation("extraores:injectrawlead"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawLemurite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardLemurite,4))
                .addCriterion("injectrawlemurite",has(BlockList.blockOreLemurite))
                .build(consumer,new ResourceLocation("extraores:injectrawlemurite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawManganese), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardManganese,4))
                .addCriterion("injectrawmanganese",has(BlockList.blockOreManganese))
                .build(consumer,new ResourceLocation("extraores:injectrawmanganese"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawMeutoite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardMeutoite,4))
                .addCriterion("injectrawmeutoite",has(BlockList.blockOreMeutoite))
                .build(consumer,new ResourceLocation("extraores:injectrawmeutoite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawMidasium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardMidasium,4))
                .addCriterion("injectrawmidasium",has(BlockList.blockOreMidasium))
                .build(consumer,new ResourceLocation("extraores:injectrawmidasium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawMithril), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardMithril,4))
                .addCriterion("injectrawmithril",has(BlockList.blockOreMithril))
                .build(consumer,new ResourceLocation("extraores:injectrawmithril"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawMolybdenum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardMolybdenum,4))
                .addCriterion("injectrawmolybdenum",has(BlockList.blockOreMolybdenum))
                .build(consumer,new ResourceLocation("extraores:injectrawmolybdenum"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawNeodymium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardNeodymium,4))
                .addCriterion("injectrawneodymium",has(BlockList.blockOreNeodymium))
                .build(consumer,new ResourceLocation("extraores:injectrawneodymium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawNeptunium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardNeptunium,4))
                .addCriterion("injectrawneptunium",has(BlockList.blockOreNeptunium))
                .build(consumer,new ResourceLocation("extraores:injectrawneptunium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawNickel), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardNickel,4))
                .addCriterion("injectrawnickel",has(BlockList.blockOreNickel))
                .build(consumer,new ResourceLocation("extraores:injectrawnickel"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawNiobium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardNiobium,4))
                .addCriterion("injectrawniobium",has(BlockList.blockOreNiobium))
                .build(consumer,new ResourceLocation("extraores:injectrawniobium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawOrichalcum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardOrichalcum,4))
                .addCriterion("injectraworichalcum",has(BlockList.blockOreOrichalcum))
                .build(consumer,new ResourceLocation("extraores:injectraworichalcum"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawOsmium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardOsmium,4))
                .addCriterion("injectrawosmium",has(BlockList.blockOreOsmium))
                .build(consumer,new ResourceLocation("extraores:injectrawosmium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawOureclase), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardOureclase,4))
                .addCriterion("injectrawoureclase",has(BlockList.blockOreOureclase))
                .build(consumer,new ResourceLocation("extraores:injectrawoureclase"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawPalladium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardPalladium,4))
                .addCriterion("injectrawpalladium",has(BlockList.blockOrePalladium))
                .build(consumer,new ResourceLocation("extraores:injectrawpalladium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawPlatinum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardPlatinum,4))
                .addCriterion("injectrawplatinum",has(BlockList.blockOrePlatinum))
                .build(consumer,new ResourceLocation("extraores:injectrawplatinum"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawPlutonium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardPlutonium,4))
                .addCriterion("injectrawplutonium",has(BlockList.blockOrePlutonium))
                .build(consumer,new ResourceLocation("extraores:injectrawplutonium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawPolonium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardPolonium,4))
                .addCriterion("injectrawpolonium",has(BlockList.blockOrePolonium))
                .build(consumer,new ResourceLocation("extraores:injectrawpolonium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawPromethium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardPromethium,4))
                .addCriterion("injectrawpromethium",has(BlockList.blockOrePromethium))
                .build(consumer,new ResourceLocation("extraores:injectrawpromethium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawRhenium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardRhenium,4))
                .addCriterion("injectrawrhenium",has(BlockList.blockOreRhenium))
                .build(consumer,new ResourceLocation("extraores:injectrawrhenium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawRhodium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardRhodium,4))
                .addCriterion("injectrawrhodium",has(BlockList.blockOreRhodium))
                .build(consumer,new ResourceLocation("extraores:injectrawrhodium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawRubracium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardRubracium,4))
                .addCriterion("injectrawrubracium",has(BlockList.blockOreRubracium))
                .build(consumer,new ResourceLocation("extraores:injectrawrubracium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawRuthenium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardRuthenium,4))
                .addCriterion("injectrawruthenium",has(BlockList.blockOreRuthenium))
                .build(consumer,new ResourceLocation("extraores:injectrawruthenium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawSanguinite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardSanguinite,4))
                .addCriterion("injectrawsanguinite",has(BlockList.blockOreSanguinite))
                .build(consumer,new ResourceLocation("extraores:injectrawsanguinite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawShadowIron), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardShadowIron,4))
                .addCriterion("injectrawshadowiron",has(BlockList.blockOreShadowIron))
                .build(consumer,new ResourceLocation("extraores:injectrawshadowiron"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawSilver), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardSilver,4))
                .addCriterion("injectrawsilver",has(BlockList.blockOreSilver))
                .build(consumer,new ResourceLocation("extraores:injectrawsilver"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawTantalum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardTantalum,4))
                .addCriterion("injectrawtantalum",has(BlockList.blockOreTantalum))
                .build(consumer,new ResourceLocation("extraores:injectrawtantalum"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawTartarite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardTartarite,4))
                .addCriterion("injectrawtartarite",has(BlockList.blockOreTartarite))
                .build(consumer,new ResourceLocation("extraores:injectrawtartarite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawTechnetium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardTechnetium,4))
                .addCriterion("injectrawtechnetium",has(BlockList.blockOreTechnetium))
                .build(consumer,new ResourceLocation("extraores:injectrawtechnetium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawThallium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardThallium,4))
                .addCriterion("injectrawthallium",has(BlockList.blockOreThallium))
                .build(consumer,new ResourceLocation("extraores:injectrawthallium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawTin), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardTin,4))
                .addCriterion("injectrawtin",has(BlockList.blockOreTin))
                .build(consumer,new ResourceLocation("extraores:injectrawtin"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawTitanium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardTitanium,4))
                .addCriterion("injectrawtitanium",has(BlockList.blockOreTitanium))
                .build(consumer,new ResourceLocation("extraores:injectrawtitanium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawTungsten), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardTungsten,4))
                .addCriterion("injectrawtungsten",has(BlockList.blockOreTungsten))
                .build(consumer,new ResourceLocation("extraores:injectrawtungsten"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawUnobtainium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardUnobtainium,4))
                .addCriterion("injectrawunobtainium",has(BlockList.blockOreUnobtainium))
                .build(consumer,new ResourceLocation("extraores:injectrawunobtainium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawUranium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardUranium,4))
                .addCriterion("injectrawuranium",has(BlockList.blockOreUranium))
                .build(consumer,new ResourceLocation("extraores:injectrawuranium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawVanadium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardVanadium,4))
                .addCriterion("injectrawvanadium",has(BlockList.blockOreVanadium))
                .build(consumer,new ResourceLocation("extraores:injectrawvanadium"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawVulcanite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardVulcanite,4))
                .addCriterion("injectrawvulcanite",has(BlockList.blockOreVulcanite))
                .build(consumer,new ResourceLocation("extraores:injectrawvulcanite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawVyroxeres), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardVyroxeres,4))
                .addCriterion("injectrawvyroxeres",has(BlockList.blockOreVyroxeres))
                .build(consumer,new ResourceLocation("extraores:injectrawvyroxeres"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawYellorite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardYellorite,4))
                .addCriterion("injectrawyellorite",has(BlockList.blockOreYellorite))
                .build(consumer,new ResourceLocation("extraores:injectrawyellorite"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawZinc), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardZinc,4))
                .addCriterion("injectrawzinc",has(BlockList.blockOreZinc))
                .build(consumer,new ResourceLocation("extraores:injectrawzinc"));
        ItemStackChemicalToItemStackRecipeBuilder.injecting(IngredientCreatorAccess.item().from(ItemTagList.rawZirconium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),new ItemStack(ItemList.itemShardZirconium,4))
                .addCriterion("injectrawzirconium",has(BlockList.blockOreZirconium))
                .build(consumer,new ResourceLocation("extraores:injectrawzirconium"));
    }
    protected void buildMekanismPurifying(Consumer<FinishedRecipe> consumer)
    {
        //Ore
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreAdamantine), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAdamantine,3))
                .addCriterion("purifyadamantineore",has(BlockList.blockOreAdamantine))
                .build(consumer,new ResourceLocation("extraores:purifyadamantineore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreAldourite),IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAldourite,3))
                .addCriterion("purifyaldouriteore",has(BlockList.blockOreAldourite))
                .build(consumer,new ResourceLocation("extraores:purifyaldouriteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreAluminum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAluminum,3))
                .addCriterion("purifyaluminumore",has(BlockList.blockOreAluminum))
                .build(consumer,new ResourceLocation("extraores:purifyaluminumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreAmericium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAmericium,3))
                .addCriterion("purifyamericiumore",has(BlockList.blockOreAmericium))
                .build(consumer,new ResourceLocation("extraores:purifyamericiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreAmordrine), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAmordrine,3))
                .addCriterion("purifyamordrineore",has(BlockList.blockOreAmordrine))
                .build(consumer,new ResourceLocation("extraores:purifyamordrineore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreAngmallen), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAngmallen,3))
                .addCriterion("purifyangmallenore",has(BlockList.blockOreAngmallen))
                .build(consumer,new ResourceLocation("extraores:purifyangmallenore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreAstralSilver), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAstralSilver,3))
                .addCriterion("purifyastralsilverore",has(BlockList.blockOreAstralSilver))
                .build(consumer,new ResourceLocation("extraores:purifyastralsilverore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreAtlarus), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAtlarus,3))
                .addCriterion("purifyatlarusore",has(BlockList.blockOreAtlarus))
                .build(consumer,new ResourceLocation("extraores:purifyatlarusore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreBismuth), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpBismuth,3))
                .addCriterion("purifybismuthore",has(BlockList.blockOreBismuth))
                .build(consumer,new ResourceLocation("extraores:purifybismuthore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreBlackSteel), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpBlackSteel,3))
                .addCriterion("purifyblacksteelore",has(BlockList.blockOreBlackSteel))
                .build(consumer,new ResourceLocation("extraores:purifyblacksteelore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreCadmium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCadmium,3))
                .addCriterion("purifycadmiumore",has(BlockList.blockOreCadmium))
                .build(consumer,new ResourceLocation("extraores:purifycadmiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreCarmot), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCarmot,3))
                .addCriterion("purifycarmotore",has(BlockList.blockOreCarmot))
                .build(consumer,new ResourceLocation("extraores:purifycarmotore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreCelenegil), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCelenegil,3))
                .addCriterion("purifycelenegilore",has(BlockList.blockOreCelenegil))
                .build(consumer,new ResourceLocation("extraores:purifycelenegilore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreCeruclase), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCeruclase,3))
                .addCriterion("purifyceruclaseore",has(BlockList.blockOreCeruclase))
                .build(consumer,new ResourceLocation("extraores:purifyceruclaseore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreChromium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpChromium,3))
                .addCriterion("purifychromiumore",has(BlockList.blockOreChromium))
                .build(consumer,new ResourceLocation("extraores:purifychromiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreCobalt), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCobalt,3))
                .addCriterion("purifycobaltore",has(BlockList.blockOreCobalt))
                .build(consumer,new ResourceLocation("extraores:purifycobaltore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreCopper), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCopper,3))
                .addCriterion("purifycopperore",has(BlockList.blockOreCopper))
                .build(consumer,new ResourceLocation("extraores:purifycopperore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreDeepIron), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpDeepIron,3))
                .addCriterion("purifydeepironore",has(BlockList.blockOreDeepIron))
                .build(consumer,new ResourceLocation("extraores:purifydeepironore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreDesichalkos), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpDesichalkos,3))
                .addCriterion("purifydesichalkosore",has(BlockList.blockOreDesichalkos))
                .build(consumer,new ResourceLocation("extraores:purifydesichalkosore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreEximite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpEximite,3))
                .addCriterion("purifyeximiteore",has(BlockList.blockOreEximite))
                .build(consumer,new ResourceLocation("extraores:purifyeximiteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreGallium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpGallium,3))
                .addCriterion("purifygalliumore",has(BlockList.blockOreGallium))
                .build(consumer,new ResourceLocation("extraores:purifygalliumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreHaderoth), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpHaderoth,3))
                .addCriterion("purifyhaderothore",has(BlockList.blockOreHaderoth))
                .build(consumer,new ResourceLocation("extraores:purifyhaderothore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreHepatizon), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpHepatizon,3))
                .addCriterion("purifyhepatizonore",has(BlockList.blockOreHepatizon))
                .build(consumer,new ResourceLocation("extraores:purifyhepatizonore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreIgnatius), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpIgnatius,3))
                .addCriterion("purifyignatiusore",has(BlockList.blockOreIgnatius))
                .build(consumer,new ResourceLocation("extraores:purifyignatiusore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreIndium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpIndium,3))
                .addCriterion("purifyindiumore",has(BlockList.blockOreIndium))
                .build(consumer,new ResourceLocation("extraores:purifyindiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreInfuscolium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpInfuscolium,3))
                .addCriterion("purifyinfuscoliumore",has(BlockList.blockOreInfuscolium))
                .build(consumer,new ResourceLocation("extraores:purifyinfuscoliumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreInolashite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpInolashite,3))
                .addCriterion("purifyinolashiteore",has(BlockList.blockOreInolashite))
                .build(consumer,new ResourceLocation("extraores:purifyinolashiteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreIridium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpIridium,3))
                .addCriterion("purifyiridiumore",has(BlockList.blockOreIridium))
                .build(consumer,new ResourceLocation("extraores:purifyiridiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreKalendrite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpKalendrite,3))
                .addCriterion("purifykalendriteore",has(BlockList.blockOreKalendrite))
                .build(consumer,new ResourceLocation("extraores:purifykalendriteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreLead), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpLead,3))
                .addCriterion("purifyleadore",has(BlockList.blockOreLead))
                .build(consumer,new ResourceLocation("extraores:purifyleadore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreLemurite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpLemurite,3))
                .addCriterion("purifylemuriteore",has(BlockList.blockOreLemurite))
                .build(consumer,new ResourceLocation("extraores:purifylemuriteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreManganese), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpManganese,3))
                .addCriterion("purifymanganeseore",has(BlockList.blockOreManganese))
                .build(consumer,new ResourceLocation("extraores:purifymanganeseore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreMeutoite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpMeutoite,3))
                .addCriterion("purifymeutoiteore",has(BlockList.blockOreMeutoite))
                .build(consumer,new ResourceLocation("extraores:purifymeutoiteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreMidasium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpMidasium,3))
                .addCriterion("purifymidasiumore",has(BlockList.blockOreMidasium))
                .build(consumer,new ResourceLocation("extraores:purifymidasiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreMithril), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpMithril,3))
                .addCriterion("purifymithrilore",has(BlockList.blockOreMithril))
                .build(consumer,new ResourceLocation("extraores:purifymithrilore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreMolybdenum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpMolybdenum,3))
                .addCriterion("purifymolybdenumore",has(BlockList.blockOreMolybdenum))
                .build(consumer,new ResourceLocation("extraores:purifymolybdenumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreNeodymium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpNeodymium,3))
                .addCriterion("purifyneodymiumore",has(BlockList.blockOreNeodymium))
                .build(consumer,new ResourceLocation("extraores:purifyneodymiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreNeptunium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpNeptunium,3))
                .addCriterion("purifyneptuniumore",has(BlockList.blockOreNeptunium))
                .build(consumer,new ResourceLocation("extraores:purifyneptuniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreNickel), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpNickel,3))
                .addCriterion("purifynickelore",has(BlockList.blockOreNickel))
                .build(consumer,new ResourceLocation("extraores:purifynickelore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreNiobium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpNiobium,3))
                .addCriterion("purifyniobiumore",has(BlockList.blockOreNiobium))
                .build(consumer,new ResourceLocation("extraores:purifyniobiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreOrichalcum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpOrichalcum,3))
                .addCriterion("purifyorichalcumore",has(BlockList.blockOreOrichalcum))
                .build(consumer,new ResourceLocation("extraores:purifyorichalcumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreOsmium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpOsmium,3))
                .addCriterion("purifyosmiumore",has(BlockList.blockOreOsmium))
                .build(consumer,new ResourceLocation("extraores:purifyosmiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreOureclase), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpOureclase,3))
                .addCriterion("purifyoureclaseore",has(BlockList.blockOreOureclase))
                .build(consumer,new ResourceLocation("extraores:purifyoureclaseore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.orePalladium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpPalladium,3))
                .addCriterion("purifypalladiumore",has(BlockList.blockOrePalladium))
                .build(consumer,new ResourceLocation("extraores:purifypalladiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.orePlatinum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpPlatinum,3))
                .addCriterion("purifyplatinumore",has(BlockList.blockOrePlatinum))
                .build(consumer,new ResourceLocation("extraores:purifyplatinumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.orePlutonium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpPlutonium,3))
                .addCriterion("purifyplutoniumore",has(BlockList.blockOrePlutonium))
                .build(consumer,new ResourceLocation("extraores:purifyplutoniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.orePolonium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpPolonium,3))
                .addCriterion("purifypoloniumore",has(BlockList.blockOrePolonium))
                .build(consumer,new ResourceLocation("extraores:purifypoloniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.orePromethium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpPromethium,3))
                .addCriterion("purifypromethiumore",has(BlockList.blockOrePromethium))
                .build(consumer,new ResourceLocation("extraores:purifypromethiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreRhenium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpRhenium,3))
                .addCriterion("purifyrheniumore",has(BlockList.blockOreRhenium))
                .build(consumer,new ResourceLocation("extraores:purifyrheniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreRhodium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpRhodium,3))
                .addCriterion("purifyrhodiumore",has(BlockList.blockOreRhodium))
                .build(consumer,new ResourceLocation("extraores:purifyrhodiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreRubracium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpRubracium,3))
                .addCriterion("purifyrubraciumore",has(BlockList.blockOreRubracium))
                .build(consumer,new ResourceLocation("extraores:purifyrubraciumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreRuthenium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpRuthenium,3))
                .addCriterion("purifyrutheniumore",has(BlockList.blockOreRuthenium))
                .build(consumer,new ResourceLocation("extraores:purifyrutheniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreSanguinite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpSanguinite,3))
                .addCriterion("purifysanguiniteore",has(BlockList.blockOreSanguinite))
                .build(consumer,new ResourceLocation("extraores:purifysanguiniteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreShadowIron), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpShadowIron,3))
                .addCriterion("purifyshadowironore",has(BlockList.blockOreShadowIron))
                .build(consumer,new ResourceLocation("extraores:purifyshadowironore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreSilver), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpSilver,3))
                .addCriterion("purifysilverore",has(BlockList.blockOreSilver))
                .build(consumer,new ResourceLocation("extraores:purifysilverore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreTantalum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTantalum,3))
                .addCriterion("purifytantalumore",has(BlockList.blockOreTantalum))
                .build(consumer,new ResourceLocation("extraores:purifytantalumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreTartarite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTartarite,3))
                .addCriterion("purifytartariteore",has(BlockList.blockOreTartarite))
                .build(consumer,new ResourceLocation("extraores:purifytartariteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreTechnetium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTechnetium,3))
                .addCriterion("purifytechnetiumore",has(BlockList.blockOreTechnetium))
                .build(consumer,new ResourceLocation("extraores:purifytechnetiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreThallium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpThallium,3))
                .addCriterion("purifythalliumore",has(BlockList.blockOreThallium))
                .build(consumer,new ResourceLocation("extraores:purifythalliumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreTin), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTin,3))
                .addCriterion("purifytinore",has(BlockList.blockOreTin))
                .build(consumer,new ResourceLocation("extraores:purifytinore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreTitanium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTitanium,3))
                .addCriterion("purifytitaniumore",has(BlockList.blockOreTitanium))
                .build(consumer,new ResourceLocation("extraores:purifytitaniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreTungsten), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTungsten,3))
                .addCriterion("purifytungstenore",has(BlockList.blockOreTungsten))
                .build(consumer,new ResourceLocation("extraores:purifytungstenore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreUnobtainium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpUnobtainium,3))
                .addCriterion("purifyunobtainiumore",has(BlockList.blockOreUnobtainium))
                .build(consumer,new ResourceLocation("extraores:purifyunobtainiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreUranium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpUranium,3))
                .addCriterion("purifyuraniumore",has(BlockList.blockOreUranium))
                .build(consumer,new ResourceLocation("extraores:purifyuraniumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreVanadium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpVanadium,3))
                .addCriterion("purifyvanadiumore",has(BlockList.blockOreVanadium))
                .build(consumer,new ResourceLocation("extraores:purifyvanadiumore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreVulcanite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpVulcanite,3))
                .addCriterion("purifyvulcaniteore",has(BlockList.blockOreVulcanite))
                .build(consumer,new ResourceLocation("extraores:purifyvulcaniteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreVyroxeres), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpVyroxeres,3))
                .addCriterion("purifyvyroxeresore",has(BlockList.blockOreVyroxeres))
                .build(consumer,new ResourceLocation("extraores:purifyvyroxeresore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreYellorite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpYellorite,3))
                .addCriterion("purifyyelloriteore",has(BlockList.blockOreYellorite))
                .build(consumer,new ResourceLocation("extraores:purifyyelloriteore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreZinc), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpZinc,3))
                .addCriterion("purifyzincore",has(BlockList.blockOreZinc))
                .build(consumer,new ResourceLocation("extraores:purifyzincore"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.oreZirconium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpZirconium,3))
                .addCriterion("purifyzirconiumore",has(BlockList.blockOreZirconium))
                .build(consumer,new ResourceLocation("extraores:purifyzirconiumore"));
        //Raw
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawAdamantine), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAdamantine,3))
                .addCriterion("purifyrawadamantine",has(ItemList.itemRawAdamantine))
                .build(consumer,new ResourceLocation("extraores:purifyrawadamantine"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawAldourite),IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAldourite,3))
                .addCriterion("purifyrawaldourite",has(ItemList.itemRawAldourite))
                .build(consumer,new ResourceLocation("extraores:purifyrawaldourite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawAluminum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAluminum,3))
                .addCriterion("purifyrawaluminum",has(ItemList.itemRawAluminum))
                .build(consumer,new ResourceLocation("extraores:purifyrawaluminum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawAmericium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAmericium,3))
                .addCriterion("purifyrawamericium",has(ItemList.itemRawAmericium))
                .build(consumer,new ResourceLocation("extraores:purifyrawamericium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawAmordrine), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAmordrine,3))
                .addCriterion("purifyrawamordrine",has(ItemList.itemRawAmordrine))
                .build(consumer,new ResourceLocation("extraores:purifyrawamordrine"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawAngmallen), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAngmallen,3))
                .addCriterion("purifyrawangmallen",has(ItemList.itemRawAngmallen))
                .build(consumer,new ResourceLocation("extraores:purifyrawangmallen"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawAstralSilver), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAstralSilver,3))
                .addCriterion("purifyrawastralsilver",has(ItemList.itemRawAstralSilver))
                .build(consumer,new ResourceLocation("extraores:purifyrawastralsilver"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawAtlarus), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAtlarus,3))
                .addCriterion("purifyrawatlarus",has(ItemList.itemRawAtlarus))
                .build(consumer,new ResourceLocation("extraores:purifyrawatlarus"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawBismuth), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpBismuth,3))
                .addCriterion("purifyrawbismuth",has(ItemList.itemRawBismuth))
                .build(consumer,new ResourceLocation("extraores:purifyrawbismuth"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawBlackSteel), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpBlackSteel,3))
                .addCriterion("purifyrawblacksteel",has(ItemList.itemRawBlackSteel))
                .build(consumer,new ResourceLocation("extraores:purifyrawblacksteel"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawCadmium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCadmium,3))
                .addCriterion("purifyrawcadmium",has(ItemList.itemRawCadmium))
                .build(consumer,new ResourceLocation("extraores:purifyrawcadmium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawCarmot), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCarmot,3))
                .addCriterion("purifyrawcarmot",has(ItemList.itemRawCarmot))
                .build(consumer,new ResourceLocation("extraores:purifyrawcarmot"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawCelenegil), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCelenegil,3))
                .addCriterion("purifyrawcelenegil",has(ItemList.itemRawCelenegil))
                .build(consumer,new ResourceLocation("extraores:purifyrawcelenegil"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawCeruclase), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCeruclase,3))
                .addCriterion("purifyrawceruclase",has(ItemList.itemRawCeruclase))
                .build(consumer,new ResourceLocation("extraores:purifyrawceruclase"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawChromium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpChromium,3))
                .addCriterion("purifyrawchromium",has(ItemList.itemRawChromium))
                .build(consumer,new ResourceLocation("extraores:purifyrawchromium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawCobalt), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCobalt,3))
                .addCriterion("purifyrawcobalt",has(ItemList.itemRawCobalt))
                .build(consumer,new ResourceLocation("extraores:purifyrawcobalt"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawCopper), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCopper,3))
                .addCriterion("purifyrawcopper",has(ItemList.itemRawCopper))
                .build(consumer,new ResourceLocation("extraores:purifyrawcopper"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawDeepIron), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpDeepIron,3))
                .addCriterion("purifyrawdeepiron",has(ItemList.itemRawDeepIron))
                .build(consumer,new ResourceLocation("extraores:purifyrawdeepiron"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawDesichalkos), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpDesichalkos,3))
                .addCriterion("purifyrawdesichalkos",has(ItemList.itemRawDesichalkos))
                .build(consumer,new ResourceLocation("extraores:purifyrawdesichalkos"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawEximite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpEximite,3))
                .addCriterion("purifyraweximite",has(ItemList.itemRawEximite))
                .build(consumer,new ResourceLocation("extraores:purifyraweximite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawGallium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpGallium,3))
                .addCriterion("purifyrawgallium",has(ItemList.itemRawGallium))
                .build(consumer,new ResourceLocation("extraores:purifyrawgallium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawHaderoth), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpHaderoth,3))
                .addCriterion("purifyrawhaderoth",has(ItemList.itemRawHaderoth))
                .build(consumer,new ResourceLocation("extraores:purifyrawhaderoth"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawHepatizon), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpHepatizon,3))
                .addCriterion("purifyrawhepatizon",has(ItemList.itemRawHepatizon))
                .build(consumer,new ResourceLocation("extraores:purifyrawhepatizon"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawIgnatius), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpIgnatius,3))
                .addCriterion("purifyrawignatius",has(ItemList.itemRawIgnatius))
                .build(consumer,new ResourceLocation("extraores:purifyrawignatius"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawIndium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpIndium,3))
                .addCriterion("purifyrawindium",has(ItemList.itemRawIndium))
                .build(consumer,new ResourceLocation("extraores:purifyrawindium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawInfuscolium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpInfuscolium,3))
                .addCriterion("purifyrawinfuscolium",has(ItemList.itemRawInfuscolium))
                .build(consumer,new ResourceLocation("extraores:purifyrawinfuscolium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawInolashite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpInolashite,3))
                .addCriterion("purifyrawinolashite",has(ItemList.itemRawInolashite))
                .build(consumer,new ResourceLocation("extraores:purifyrawinolashite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawIridium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpIridium,3))
                .addCriterion("purifyrawiridium",has(ItemList.itemRawIridium))
                .build(consumer,new ResourceLocation("extraores:purifyrawiridium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawKalendrite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpKalendrite,3))
                .addCriterion("purifyrawkalendrite",has(ItemList.itemRawKalendrite))
                .build(consumer,new ResourceLocation("extraores:purifyrawkalendrite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawLead), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpLead,3))
                .addCriterion("purifyrawlead",has(ItemList.itemRawLead))
                .build(consumer,new ResourceLocation("extraores:purifyrawlead"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawLemurite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpLemurite,3))
                .addCriterion("purifyrawlemurite",has(ItemList.itemRawLemurite))
                .build(consumer,new ResourceLocation("extraores:purifyrawlemurite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawManganese), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpManganese,3))
                .addCriterion("purifyrawmanganese",has(ItemList.itemRawManganese))
                .build(consumer,new ResourceLocation("extraores:purifyrawmanganese"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawMeutoite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpMeutoite,3))
                .addCriterion("purifyrawmeutoite",has(ItemList.itemRawMeutoite))
                .build(consumer,new ResourceLocation("extraores:purifyrawmeutoite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawMidasium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpMidasium,3))
                .addCriterion("purifyrawmidasium",has(ItemList.itemRawMidasium))
                .build(consumer,new ResourceLocation("extraores:purifyrawmidasium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawMithril), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpMithril,3))
                .addCriterion("purifyrawmithril",has(ItemList.itemRawMithril))
                .build(consumer,new ResourceLocation("extraores:purifyrawmithril"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawMolybdenum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpMolybdenum,3))
                .addCriterion("purifyrawmolybdenum",has(ItemList.itemRawMolybdenum))
                .build(consumer,new ResourceLocation("extraores:purifyrawmolybdenum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawNeodymium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpNeodymium,3))
                .addCriterion("purifyrawneodymium",has(ItemList.itemRawNeodymium))
                .build(consumer,new ResourceLocation("extraores:purifyrawneodymium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawNeptunium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpNeptunium,3))
                .addCriterion("purifyrawneptunium",has(ItemList.itemRawNeptunium))
                .build(consumer,new ResourceLocation("extraores:purifyrawneptunium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawNickel), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpNickel,3))
                .addCriterion("purifyrawnickel",has(ItemList.itemRawNickel))
                .build(consumer,new ResourceLocation("extraores:purifyrawnickel"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawNiobium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpNiobium,3))
                .addCriterion("purifyrawniobium",has(ItemList.itemRawNiobium))
                .build(consumer,new ResourceLocation("extraores:purifyrawniobium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawOrichalcum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpOrichalcum,3))
                .addCriterion("purifyraworichalcum",has(ItemList.itemRawOrichalcum))
                .build(consumer,new ResourceLocation("extraores:purifyraworichalcum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawOsmium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpOsmium,3))
                .addCriterion("purifyrawosmium",has(ItemList.itemRawOsmium))
                .build(consumer,new ResourceLocation("extraores:purifyrawosmium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawOureclase), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpOureclase,3))
                .addCriterion("purifyrawoureclase",has(ItemList.itemRawOureclase))
                .build(consumer,new ResourceLocation("extraores:purifyrawoureclase"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawPalladium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpPalladium,3))
                .addCriterion("purifyrawpalladium",has(ItemList.itemRawPalladium))
                .build(consumer,new ResourceLocation("extraores:purifyrawpalladium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawPlatinum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpPlatinum,3))
                .addCriterion("purifyrawplatinum",has(ItemList.itemRawPlatinum))
                .build(consumer,new ResourceLocation("extraores:purifyrawplatinum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawPlutonium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpPlutonium,3))
                .addCriterion("purifyrawplutonium",has(ItemList.itemRawPlutonium))
                .build(consumer,new ResourceLocation("extraores:purifyrawplutonium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawPolonium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpPolonium,3))
                .addCriterion("purifyrawpolonium",has(ItemList.itemRawPolonium))
                .build(consumer,new ResourceLocation("extraores:purifyrawpolonium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawPromethium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpPromethium,3))
                .addCriterion("purifyrawpromethium",has(ItemList.itemRawPromethium))
                .build(consumer,new ResourceLocation("extraores:purifyrawpromethium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawRhenium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpRhenium,3))
                .addCriterion("purifyrawrhenium",has(ItemList.itemRawRhenium))
                .build(consumer,new ResourceLocation("extraores:purifyrawrhenium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawRhodium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpRhodium,3))
                .addCriterion("purifyrawrhodium",has(ItemList.itemRawRhodium))
                .build(consumer,new ResourceLocation("extraores:purifyrawrhodium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawRubracium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpRubracium,3))
                .addCriterion("purifyrawrubracium",has(ItemList.itemRawRubracium))
                .build(consumer,new ResourceLocation("extraores:purifyrawrubracium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawRuthenium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpRuthenium,3))
                .addCriterion("purifyrawruthenium",has(ItemList.itemRawRuthenium))
                .build(consumer,new ResourceLocation("extraores:purifyrawruthenium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawSanguinite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpSanguinite,3))
                .addCriterion("purifyrawsanguinite",has(ItemList.itemRawSanguinite))
                .build(consumer,new ResourceLocation("extraores:purifyrawsanguinite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawShadowIron), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpShadowIron,3))
                .addCriterion("purifyrawshadowiron",has(ItemList.itemRawShadowIron))
                .build(consumer,new ResourceLocation("extraores:purifyrawshadowiron"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawSilver), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpSilver,3))
                .addCriterion("purifyrawsilver",has(ItemList.itemRawSilver))
                .build(consumer,new ResourceLocation("extraores:purifyrawsilver"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawTantalum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTantalum,3))
                .addCriterion("purifyrawtantalum",has(ItemList.itemRawTantalum))
                .build(consumer,new ResourceLocation("extraores:purifyrawtantalum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawTartarite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTartarite,3))
                .addCriterion("purifyrawtartarite",has(ItemList.itemRawTartarite))
                .build(consumer,new ResourceLocation("extraores:purifyrawtartarite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawTechnetium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTechnetium,3))
                .addCriterion("purifyrawtechnetium",has(ItemList.itemRawTechnetium))
                .build(consumer,new ResourceLocation("extraores:purifyrawtechnetium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawThallium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpThallium,3))
                .addCriterion("purifyrawthallium",has(ItemList.itemRawThallium))
                .build(consumer,new ResourceLocation("extraores:purifyrawthallium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawTin), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTin,3))
                .addCriterion("purifyrawtin",has(ItemList.itemRawTin))
                .build(consumer,new ResourceLocation("extraores:purifyrawtin"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawTitanium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTitanium,3))
                .addCriterion("purifyrawtitanium",has(ItemList.itemRawTitanium))
                .build(consumer,new ResourceLocation("extraores:purifyrawtitanium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawTungsten), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTungsten,3))
                .addCriterion("purifyrawtungsten",has(ItemList.itemRawTungsten))
                .build(consumer,new ResourceLocation("extraores:purifyrawtungsten"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawUnobtainium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpUnobtainium,3))
                .addCriterion("purifyrawunobtainium",has(ItemList.itemRawUnobtainium))
                .build(consumer,new ResourceLocation("extraores:purifyrawunobtainium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawUranium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpUranium,3))
                .addCriterion("purifyrawuranium",has(ItemList.itemRawUranium))
                .build(consumer,new ResourceLocation("extraores:purifyrawuranium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawVanadium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpVanadium,3))
                .addCriterion("purifyrawvanadium",has(ItemList.itemRawVanadium))
                .build(consumer,new ResourceLocation("extraores:purifyrawvanadium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawVulcanite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpVulcanite,3))
                .addCriterion("purifyrawvulcanite",has(ItemList.itemRawVulcanite))
                .build(consumer,new ResourceLocation("extraores:purifyrawvulcanite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawVyroxeres), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpVyroxeres,3))
                .addCriterion("purifyrawvyroxeres",has(ItemList.itemRawVyroxeres))
                .build(consumer,new ResourceLocation("extraores:purifyrawvyroxeres"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawYellorite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpYellorite,3))
                .addCriterion("purifyrawyellorite",has(ItemList.itemRawYellorite))
                .build(consumer,new ResourceLocation("extraores:purifyrawyellorite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawZinc), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpZinc,3))
                .addCriterion("purifyrawzinc",has(ItemList.itemRawZinc))
                .build(consumer,new ResourceLocation("extraores:purifyrawzinc"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.rawZirconium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpZirconium,3))
                .addCriterion("purifyrawzirconium",has(ItemList.itemRawZirconium))
                .build(consumer,new ResourceLocation("extraores:purifyrawzirconium"));
        //Shard
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardAdamantine), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAdamantine))
                .addCriterion("purifyadamantine",has(ItemList.itemShardAdamantine))
                .build(consumer,new ResourceLocation("extraores:purifyadamantine"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardAldourite),IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAldourite))
                .addCriterion("purifyaldourite",has(ItemList.itemShardAldourite))
                .build(consumer,new ResourceLocation("extraores:purifyaldourite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardAluminum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAluminum))
                .addCriterion("purifyaluminum",has(ItemList.itemShardAluminum))
                .build(consumer,new ResourceLocation("extraores:purifyaluminum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardAmericium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAmericium))
                .addCriterion("purifyamericium",has(ItemList.itemShardAmericium))
                .build(consumer,new ResourceLocation("extraores:purifyamericium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardAmordrine), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAmordrine))
                .addCriterion("purifyamordrine",has(ItemList.itemShardAmordrine))
                .build(consumer,new ResourceLocation("extraores:purifyamordrine"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardAngmallen), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAngmallen))
                .addCriterion("purifyangmallen",has(ItemList.itemShardAngmallen))
                .build(consumer,new ResourceLocation("extraores:purifyangmallen"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardAstralSilver), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAstralSilver))
                .addCriterion("purifyastralsilver",has(ItemList.itemShardAstralSilver))
                .build(consumer,new ResourceLocation("extraores:purifyastralsilver"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardAtlarus), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpAtlarus))
                .addCriterion("purifyatlarus",has(ItemList.itemShardAtlarus))
                .build(consumer,new ResourceLocation("extraores:purifyatlarus"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardBismuth), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpBismuth))
                .addCriterion("purifybismuth",has(ItemList.itemShardBismuth))
                .build(consumer,new ResourceLocation("extraores:purifybismuth"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardBlackSteel), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpBlackSteel))
                .addCriterion("purifyblacksteel",has(ItemList.itemShardBlackSteel))
                .build(consumer,new ResourceLocation("extraores:purifyblacksteel"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardCadmium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCadmium))
                .addCriterion("purifycadmium",has(ItemList.itemShardCadmium))
                .build(consumer,new ResourceLocation("extraores:purifycadmium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardCarmot), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCarmot))
                .addCriterion("purifycarmot",has(ItemList.itemShardCarmot))
                .build(consumer,new ResourceLocation("extraores:purifycarmot"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardCelenegil), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCelenegil))
                .addCriterion("purifycelenegil",has(ItemList.itemShardCelenegil))
                .build(consumer,new ResourceLocation("extraores:purifycelenegil"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardCeruclase), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCeruclase))
                .addCriterion("purifyceruclase",has(ItemList.itemShardCeruclase))
                .build(consumer,new ResourceLocation("extraores:purifyceruclase"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardChromium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpChromium))
                .addCriterion("purifychromium",has(ItemList.itemShardChromium))
                .build(consumer,new ResourceLocation("extraores:purifychromium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardCobalt), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCobalt))
                .addCriterion("purifycobalt",has(ItemList.itemShardCobalt))
                .build(consumer,new ResourceLocation("extraores:purifycobalt"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardCopper), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpCopper))
                .addCriterion("purifycopper",has(ItemList.itemShardCopper))
                .build(consumer,new ResourceLocation("extraores:purifycopper"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardDeepIron), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpDeepIron))
                .addCriterion("purifydeepiron",has(ItemList.itemShardDeepIron))
                .build(consumer,new ResourceLocation("extraores:purifydeepiron"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardDesichalkos), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpDesichalkos))
                .addCriterion("purifydesichalkos",has(ItemList.itemShardDesichalkos))
                .build(consumer,new ResourceLocation("extraores:purifydesichalkos"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardEximite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpEximite))
                .addCriterion("purifyeximite",has(ItemList.itemShardEximite))
                .build(consumer,new ResourceLocation("extraores:purifyeximite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardGallium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpGallium))
                .addCriterion("purifygallium",has(ItemList.itemShardGallium))
                .build(consumer,new ResourceLocation("extraores:purifygallium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardHaderoth), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpHaderoth))
                .addCriterion("purifyhaderoth",has(ItemList.itemShardHaderoth))
                .build(consumer,new ResourceLocation("extraores:purifyhaderoth"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardHepatizon), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpHepatizon))
                .addCriterion("purifyhepatizon",has(ItemList.itemShardHepatizon))
                .build(consumer,new ResourceLocation("extraores:purifyhepatizon"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardIgnatius), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpIgnatius))
                .addCriterion("purifyignatius",has(ItemList.itemShardIgnatius))
                .build(consumer,new ResourceLocation("extraores:purifyignatius"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardIndium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpIndium))
                .addCriterion("purifyindium",has(ItemList.itemShardIndium))
                .build(consumer,new ResourceLocation("extraores:purifyindium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardInfuscolium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpInfuscolium))
                .addCriterion("purifyinfuscolium",has(ItemList.itemShardInfuscolium))
                .build(consumer,new ResourceLocation("extraores:purifyinfuscolium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardInolashite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpInolashite))
                .addCriterion("purifyinolashite",has(ItemList.itemShardInolashite))
                .build(consumer,new ResourceLocation("extraores:purifyinolashite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardIridium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpIridium))
                .addCriterion("purifyiridium",has(ItemList.itemShardIridium))
                .build(consumer,new ResourceLocation("extraores:purifyiridium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardKalendrite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpKalendrite))
                .addCriterion("purifykalendrite",has(ItemList.itemShardKalendrite))
                .build(consumer,new ResourceLocation("extraores:purifykalendrite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardLead), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpLead))
                .addCriterion("purifylead",has(ItemList.itemShardLead))
                .build(consumer,new ResourceLocation("extraores:purifylead"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardLemurite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpLemurite))
                .addCriterion("purifylemurite",has(ItemList.itemShardLemurite))
                .build(consumer,new ResourceLocation("extraores:purifylemurite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardManganese), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpManganese))
                .addCriterion("purifymanganese",has(ItemList.itemShardManganese))
                .build(consumer,new ResourceLocation("extraores:purifymanganese"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardMeutoite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpMeutoite))
                .addCriterion("purifymeutoite",has(ItemList.itemShardMeutoite))
                .build(consumer,new ResourceLocation("extraores:purifymeutoite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardMidasium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpMidasium))
                .addCriterion("purifymidasium",has(ItemList.itemShardMidasium))
                .build(consumer,new ResourceLocation("extraores:purifymidasium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardMithril), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpMithril))
                .addCriterion("purifymithril",has(ItemList.itemShardMithril))
                .build(consumer,new ResourceLocation("extraores:purifymithril"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardMolybdenum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpMolybdenum))
                .addCriterion("purifymolybdenum",has(ItemList.itemShardMolybdenum))
                .build(consumer,new ResourceLocation("extraores:purifymolybdenum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardNeodymium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpNeodymium))
                .addCriterion("purifyneodymium",has(ItemList.itemShardNeodymium))
                .build(consumer,new ResourceLocation("extraores:purifyneodymium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardNeptunium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpNeptunium))
                .addCriterion("purifyneptunium",has(ItemList.itemShardNeptunium))
                .build(consumer,new ResourceLocation("extraores:purifyneptunium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardNickel), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpNickel))
                .addCriterion("purifynickel",has(ItemList.itemShardNickel))
                .build(consumer,new ResourceLocation("extraores:purifynickel"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardNiobium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpNiobium))
                .addCriterion("purifyniobium",has(ItemList.itemShardNiobium))
                .build(consumer,new ResourceLocation("extraores:purifyniobium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardOrichalcum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpOrichalcum))
                .addCriterion("purifyorichalcum",has(ItemList.itemShardOrichalcum))
                .build(consumer,new ResourceLocation("extraores:purifyorichalcum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardOsmium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpOsmium))
                .addCriterion("purifyosmium",has(ItemList.itemShardOsmium))
                .build(consumer,new ResourceLocation("extraores:purifyosmium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardOureclase), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpOureclase))
                .addCriterion("purifyoureclase",has(ItemList.itemShardOureclase))
                .build(consumer,new ResourceLocation("extraores:purifyoureclase"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardPalladium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpPalladium))
                .addCriterion("purifypalladium",has(ItemList.itemShardPalladium))
                .build(consumer,new ResourceLocation("extraores:purifypalladium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardPlatinum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpPlatinum))
                .addCriterion("purifyplatinum",has(ItemList.itemShardPlatinum))
                .build(consumer,new ResourceLocation("extraores:purifyplatinum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardPlutonium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpPlutonium))
                .addCriterion("purifyplutonium",has(ItemList.itemShardPlutonium))
                .build(consumer,new ResourceLocation("extraores:purifyplutonium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardPolonium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpPolonium))
                .addCriterion("purifypolonium",has(ItemList.itemShardPolonium))
                .build(consumer,new ResourceLocation("extraores:purifypolonium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardPromethium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpPromethium))
                .addCriterion("purifypromethium",has(ItemList.itemShardPromethium))
                .build(consumer,new ResourceLocation("extraores:purifypromethium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardRhenium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpRhenium))
                .addCriterion("purifyrhenium",has(ItemList.itemShardRhenium))
                .build(consumer,new ResourceLocation("extraores:purifyrhenium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardRhodium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpRhodium))
                .addCriterion("purifyrhodium",has(ItemList.itemShardRhodium))
                .build(consumer,new ResourceLocation("extraores:purifyrhodium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardRubracium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpRubracium))
                .addCriterion("purifyrubracium",has(ItemList.itemShardRubracium))
                .build(consumer,new ResourceLocation("extraores:purifyrubracium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardRuthenium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpRuthenium))
                .addCriterion("purifyruthenium",has(ItemList.itemShardRuthenium))
                .build(consumer,new ResourceLocation("extraores:purifyruthenium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardSanguinite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpSanguinite))
                .addCriterion("purifysanguinite",has(ItemList.itemShardSanguinite))
                .build(consumer,new ResourceLocation("extraores:purifysanguinite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardShadowIron), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpShadowIron))
                .addCriterion("purifyshadowiron",has(ItemList.itemShardShadowIron))
                .build(consumer,new ResourceLocation("extraores:purifyshadowiron"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardSilver), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpSilver))
                .addCriterion("purifysilver",has(ItemList.itemShardSilver))
                .build(consumer,new ResourceLocation("extraores:purifysilver"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardTantalum), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTantalum))
                .addCriterion("purifytantalum",has(ItemList.itemShardTantalum))
                .build(consumer,new ResourceLocation("extraores:purifytantalum"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardTartarite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTartarite))
                .addCriterion("purifytartarite",has(ItemList.itemShardTartarite))
                .build(consumer,new ResourceLocation("extraores:purifytartarite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardTechnetium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTechnetium))
                .addCriterion("purifytechnetium",has(ItemList.itemShardTechnetium))
                .build(consumer,new ResourceLocation("extraores:purifytechnetium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardThallium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpThallium))
                .addCriterion("purifythallium",has(ItemList.itemShardThallium))
                .build(consumer,new ResourceLocation("extraores:purifythallium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardTin), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTin))
                .addCriterion("purifytin",has(ItemList.itemShardTin))
                .build(consumer,new ResourceLocation("extraores:purifytin"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardTitanium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTitanium))
                .addCriterion("purifytitanium",has(ItemList.itemShardTitanium))
                .build(consumer,new ResourceLocation("extraores:purifytitanium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardTungsten), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpTungsten))
                .addCriterion("purifytungsten",has(ItemList.itemShardTungsten))
                .build(consumer,new ResourceLocation("extraores:purifytungsten"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardUnobtainium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpUnobtainium))
                .addCriterion("purifyunobtainium",has(ItemList.itemShardUnobtainium))
                .build(consumer,new ResourceLocation("extraores:purifyunobtainium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardUranium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpUranium))
                .addCriterion("purifyuranium",has(ItemList.itemShardUranium))
                .build(consumer,new ResourceLocation("extraores:purifyuranium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardVanadium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpVanadium))
                .addCriterion("purifyvanadium",has(ItemList.itemShardVanadium))
                .build(consumer,new ResourceLocation("extraores:purifyvanadium"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardVulcanite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpVulcanite))
                .addCriterion("purifyvulcanite",has(ItemList.itemShardVulcanite))
                .build(consumer,new ResourceLocation("extraores:purifyvulcanite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardVyroxeres), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpVyroxeres))
                .addCriterion("purifyvyroxeres",has(ItemList.itemShardVyroxeres))
                .build(consumer,new ResourceLocation("extraores:purifyvyroxeres"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardYellorite), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpYellorite))
                .addCriterion("purifyyellorite",has(ItemList.itemShardYellorite))
                .build(consumer,new ResourceLocation("extraores:purifyyellorite"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardZinc), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpZinc))
                .addCriterion("purifyzinc",has(ItemList.itemShardZinc))
                .build(consumer,new ResourceLocation("extraores:purifyzinc"));
        ItemStackChemicalToItemStackRecipeBuilder.purifying(IngredientCreatorAccess.item().from(ItemTagList.shardZirconium), IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),new ItemStack(ItemList.itemClumpZirconium))
                .addCriterion("purifyzirconium",has(ItemList.itemShardZirconium))
                .build(consumer,new ResourceLocation("extraores:purifyzirconium"));
    }
    protected void buildMekanismCrushing(Consumer<FinishedRecipe> consumer)
    {
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpAdamantine),new ItemStack(ItemList.itemDirtyDustAdamantine))
                .addCriterion("crushadamantine",has(ItemList.itemClumpAdamantine))
                .build(consumer,new ResourceLocation("extraores:crushadamantine"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpAldourite),new ItemStack(ItemList.itemDirtyDustAldourite))
                .addCriterion("crushaldourite",has(ItemList.itemClumpAldourite))
                .build(consumer,new ResourceLocation("extraores:crushaldourite"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpAluminum),new ItemStack(ItemList.itemDirtyDustAluminum))
                .addCriterion("crushaluminum",has(ItemList.itemClumpAluminum))
                .build(consumer,new ResourceLocation("extraores:crushaluminum"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpAmericium),new ItemStack(ItemList.itemDirtyDustAmericium))
                .addCriterion("crushamericium",has(ItemList.itemClumpAmericium))
                .build(consumer,new ResourceLocation("extraores:crushamericium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpAmordrine),new ItemStack(ItemList.itemDirtyDustAmordrine))
                .addCriterion("crushamordrine",has(ItemList.itemClumpAmordrine))
                .build(consumer,new ResourceLocation("extraores:crushamordrine"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpAngmallen),new ItemStack(ItemList.itemDirtyDustAngmallen))
                .addCriterion("crushangmallen",has(ItemList.itemClumpAngmallen))
                .build(consumer,new ResourceLocation("extraores:crushangmallen"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpAstralSilver),new ItemStack(ItemList.itemDirtyDustAstralSilver))
                .addCriterion("crushastralsilver",has(ItemList.itemClumpAstralSilver))
                .build(consumer,new ResourceLocation("extraores:crushastralsilver"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpAtlarus),new ItemStack(ItemList.itemDirtyDustAtlarus))
                .addCriterion("crushatlarus",has(ItemList.itemClumpAtlarus))
                .build(consumer,new ResourceLocation("extraores:crushatlarus"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpBismuth),new ItemStack(ItemList.itemDirtyDustBismuth))
                .addCriterion("crushbismuth",has(ItemList.itemClumpBismuth))
                .build(consumer,new ResourceLocation("extraores:crushbismuth"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpBlackSteel),new ItemStack(ItemList.itemDirtyDustBlackSteel))
                .addCriterion("crushblacksteel",has(ItemList.itemClumpBlackSteel))
                .build(consumer,new ResourceLocation("extraores:crushblacksteel"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpCadmium),new ItemStack(ItemList.itemDirtyDustCadmium))
                .addCriterion("crushcadmium",has(ItemList.itemClumpCadmium))
                .build(consumer,new ResourceLocation("extraores:crushcadmium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpCarmot),new ItemStack(ItemList.itemDirtyDustCarmot))
                .addCriterion("crushcarmot",has(ItemList.itemClumpCarmot))
                .build(consumer,new ResourceLocation("extraores:crushcarmot"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpCelenegil),new ItemStack(ItemList.itemDirtyDustCelenegil))
                .addCriterion("crushcelenegil",has(ItemList.itemClumpCelenegil))
                .build(consumer,new ResourceLocation("extraores:crushcelenegil"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpCeruclase),new ItemStack(ItemList.itemDirtyDustCeruclase))
                .addCriterion("crushceruclase",has(ItemList.itemClumpCeruclase))
                .build(consumer,new ResourceLocation("extraores:crushceruclase"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpChromium),new ItemStack(ItemList.itemDirtyDustChromium))
                .addCriterion("crushchromium",has(ItemList.itemClumpChromium))
                .build(consumer,new ResourceLocation("extraores:crushchromium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpCobalt),new ItemStack(ItemList.itemDirtyDustCobalt))
                .addCriterion("crushcobalt",has(ItemList.itemClumpCobalt))
                .build(consumer,new ResourceLocation("extraores:crushcobalt"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpCopper),new ItemStack(ItemList.itemDirtyDustCopper))
                .addCriterion("crushcopper",has(ItemList.itemClumpCopper))
                .build(consumer,new ResourceLocation("extraores:crushcopper"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpDeepIron),new ItemStack(ItemList.itemDirtyDustDeepIron))
                .addCriterion("crushdeepiron",has(ItemList.itemClumpDeepIron))
                .build(consumer,new ResourceLocation("extraores:crushdeepiron"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpDesichalkos),new ItemStack(ItemList.itemDirtyDustDesichalkos))
                .addCriterion("crushdesichalkos",has(ItemList.itemClumpDesichalkos))
                .build(consumer,new ResourceLocation("extraores:crushdesichalkos"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpEximite),new ItemStack(ItemList.itemDirtyDustEximite))
                .addCriterion("crusheximite",has(ItemList.itemClumpEximite))
                .build(consumer,new ResourceLocation("extraores:crusheximite"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpGallium),new ItemStack(ItemList.itemDirtyDustGallium))
                .addCriterion("crushgallium",has(ItemList.itemClumpGallium))
                .build(consumer,new ResourceLocation("extraores:crushgallium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpHaderoth),new ItemStack(ItemList.itemDirtyDustHaderoth))
                .addCriterion("crushhaderoth",has(ItemList.itemClumpHaderoth))
                .build(consumer,new ResourceLocation("extraores:crushhaderoth"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpHepatizon),new ItemStack(ItemList.itemDirtyDustHepatizon))
                .addCriterion("crushhepatizon",has(ItemList.itemClumpHepatizon))
                .build(consumer,new ResourceLocation("extraores:crushhepatizon"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpIgnatius),new ItemStack(ItemList.itemDirtyDustIgnatius))
                .addCriterion("crushignatius",has(ItemList.itemClumpIgnatius))
                .build(consumer,new ResourceLocation("extraores:crushignatius"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpIndium),new ItemStack(ItemList.itemDirtyDustIndium))
                .addCriterion("crushindium",has(ItemList.itemClumpIndium))
                .build(consumer,new ResourceLocation("extraores:crushindium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpInfuscolium),new ItemStack(ItemList.itemDirtyDustInfuscolium))
                .addCriterion("crushinfuscolium",has(ItemList.itemClumpInfuscolium))
                .build(consumer,new ResourceLocation("extraores:crushinfuscolium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpInolashite),new ItemStack(ItemList.itemDirtyDustInolashite))
                .addCriterion("crushinolashite",has(ItemList.itemClumpInolashite))
                .build(consumer,new ResourceLocation("extraores:crushinolashite"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpIridium),new ItemStack(ItemList.itemDirtyDustIridium))
                .addCriterion("crushiridium",has(ItemList.itemClumpIridium))
                .build(consumer,new ResourceLocation("extraores:crushiridium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpKalendrite),new ItemStack(ItemList.itemDirtyDustKalendrite))
                .addCriterion("crushkalendrite",has(ItemList.itemClumpKalendrite))
                .build(consumer,new ResourceLocation("extraores:crushkalendrite"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpLead),new ItemStack(ItemList.itemDirtyDustLead))
                .addCriterion("crushlead",has(ItemList.itemClumpLead))
                .build(consumer,new ResourceLocation("extraores:crushlead"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpLemurite),new ItemStack(ItemList.itemDirtyDustLemurite))
                .addCriterion("crushlemurite",has(ItemList.itemClumpLemurite))
                .build(consumer,new ResourceLocation("extraores:crushlemurite"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpManganese),new ItemStack(ItemList.itemDirtyDustManganese))
                .addCriterion("crushmanganese",has(ItemList.itemClumpManganese))
                .build(consumer,new ResourceLocation("extraores:crushmanganese"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpMeutoite),new ItemStack(ItemList.itemDirtyDustMeutoite))
                .addCriterion("crushmeutoite",has(ItemList.itemClumpMeutoite))
                .build(consumer,new ResourceLocation("extraores:crushmeutoite"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpMidasium),new ItemStack(ItemList.itemDirtyDustMidasium))
                .addCriterion("crushmidasium",has(ItemList.itemClumpMidasium))
                .build(consumer,new ResourceLocation("extraores:crushmidasium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpMithril),new ItemStack(ItemList.itemDirtyDustMithril))
                .addCriterion("crushmithril",has(ItemList.itemClumpMithril))
                .build(consumer,new ResourceLocation("extraores:crushmithril"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpMolybdenum),new ItemStack(ItemList.itemDirtyDustMolybdenum))
                .addCriterion("crushmolybdenum",has(ItemList.itemClumpMolybdenum))
                .build(consumer,new ResourceLocation("extraores:crushmolybdenum"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpNeodymium),new ItemStack(ItemList.itemDirtyDustNeodymium))
                .addCriterion("crushneodymium",has(ItemList.itemClumpNeodymium))
                .build(consumer,new ResourceLocation("extraores:crushneodymium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpNeptunium),new ItemStack(ItemList.itemDirtyDustNeptunium))
                .addCriterion("crushneptunium",has(ItemList.itemClumpNeptunium))
                .build(consumer,new ResourceLocation("extraores:crushneptunium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpNickel),new ItemStack(ItemList.itemDirtyDustNickel))
                .addCriterion("crushnickel",has(ItemList.itemClumpNickel))
                .build(consumer,new ResourceLocation("extraores:crushnickel"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpNiobium),new ItemStack(ItemList.itemDirtyDustNiobium))
                .addCriterion("crushniobium",has(ItemList.itemClumpNiobium))
                .build(consumer,new ResourceLocation("extraores:crushniobium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpOrichalcum),new ItemStack(ItemList.itemDirtyDustOrichalcum))
                .addCriterion("crushorichalcum",has(ItemList.itemClumpOrichalcum))
                .build(consumer,new ResourceLocation("extraores:crushorichalcum"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpOsmium),new ItemStack(ItemList.itemDirtyDustOsmium))
                .addCriterion("crushosmium",has(ItemList.itemClumpOsmium))
                .build(consumer,new ResourceLocation("extraores:crushosmium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpOureclase),new ItemStack(ItemList.itemDirtyDustOureclase))
                .addCriterion("crushoureclase",has(ItemList.itemClumpOureclase))
                .build(consumer,new ResourceLocation("extraores:crushoureclase"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpPalladium),new ItemStack(ItemList.itemDirtyDustPalladium))
                .addCriterion("crushpalladium",has(ItemList.itemClumpPalladium))
                .build(consumer,new ResourceLocation("extraores:crushpalladium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpPlatinum),new ItemStack(ItemList.itemDirtyDustPlatinum))
                .addCriterion("crushplatinum",has(ItemList.itemClumpPlatinum))
                .build(consumer,new ResourceLocation("extraores:crushplatinum"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpPlutonium),new ItemStack(ItemList.itemDirtyDustPlutonium))
                .addCriterion("crushplutonium",has(ItemList.itemClumpPlutonium))
                .build(consumer,new ResourceLocation("extraores:crushplutonium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpPolonium),new ItemStack(ItemList.itemDirtyDustPolonium))
                .addCriterion("crushpolonium",has(ItemList.itemClumpPolonium))
                .build(consumer,new ResourceLocation("extraores:crushpolonium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpPromethium),new ItemStack(ItemList.itemDirtyDustPromethium))
                .addCriterion("crushpromethium",has(ItemList.itemClumpPromethium))
                .build(consumer,new ResourceLocation("extraores:crushpromethium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpRhenium),new ItemStack(ItemList.itemDirtyDustRhenium))
                .addCriterion("crushrhenium",has(ItemList.itemClumpRhenium))
                .build(consumer,new ResourceLocation("extraores:crushrhenium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpRhodium),new ItemStack(ItemList.itemDirtyDustRhodium))
                .addCriterion("crushrhodium",has(ItemList.itemClumpRhodium))
                .build(consumer,new ResourceLocation("extraores:crushrhodium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpRubracium),new ItemStack(ItemList.itemDirtyDustRubracium))
                .addCriterion("crushrubracium",has(ItemList.itemClumpRubracium))
                .build(consumer,new ResourceLocation("extraores:crushrubracium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpRuthenium),new ItemStack(ItemList.itemDirtyDustRuthenium))
                .addCriterion("crushruthenium",has(ItemList.itemClumpRuthenium))
                .build(consumer,new ResourceLocation("extraores:crushruthenium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpSanguinite),new ItemStack(ItemList.itemDirtyDustSanguinite))
                .addCriterion("crushsanguinite",has(ItemList.itemClumpSanguinite))
                .build(consumer,new ResourceLocation("extraores:crushsanguinite"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpShadowIron),new ItemStack(ItemList.itemDirtyDustShadowIron))
                .addCriterion("crushshadowiron",has(ItemList.itemClumpShadowIron))
                .build(consumer,new ResourceLocation("extraores:crushshadowiron"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpSilver),new ItemStack(ItemList.itemDirtyDustSilver))
                .addCriterion("crushsilver",has(ItemList.itemClumpSilver))
                .build(consumer,new ResourceLocation("extraores:crushsilver"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpTantalum),new ItemStack(ItemList.itemDirtyDustTantalum))
                .addCriterion("crushtantalum",has(ItemList.itemClumpTantalum))
                .build(consumer,new ResourceLocation("extraores:crushtantalum"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpTartarite),new ItemStack(ItemList.itemDirtyDustTartarite))
                .addCriterion("crushtartarite",has(ItemList.itemClumpTartarite))
                .build(consumer,new ResourceLocation("extraores:crushtartarite"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpTechnetium),new ItemStack(ItemList.itemDirtyDustTechnetium))
                .addCriterion("crushtechnetium",has(ItemList.itemClumpTechnetium))
                .build(consumer,new ResourceLocation("extraores:crushtechnetium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpThallium),new ItemStack(ItemList.itemDirtyDustThallium))
                .addCriterion("crushthallium",has(ItemList.itemClumpThallium))
                .build(consumer,new ResourceLocation("extraores:crushthallium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpTin),new ItemStack(ItemList.itemDirtyDustTin))
                .addCriterion("crushtin",has(ItemList.itemClumpTin))
                .build(consumer,new ResourceLocation("extraores:crushtin"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpTitanium),new ItemStack(ItemList.itemDirtyDustTitanium))
                .addCriterion("crushtitanium",has(ItemList.itemClumpTitanium))
                .build(consumer,new ResourceLocation("extraores:crushtitanium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpTungsten),new ItemStack(ItemList.itemDirtyDustTungsten))
                .addCriterion("crushtungsten",has(ItemList.itemClumpTungsten))
                .build(consumer,new ResourceLocation("extraores:crushtungsten"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpUnobtainium),new ItemStack(ItemList.itemDirtyDustUnobtainium))
                .addCriterion("crushunobtainium",has(ItemList.itemClumpUnobtainium))
                .build(consumer,new ResourceLocation("extraores:crushunobtainium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpUranium),new ItemStack(ItemList.itemDirtyDustUranium))
                .addCriterion("crushuranium",has(ItemList.itemClumpUranium))
                .build(consumer,new ResourceLocation("extraores:crushuranium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpVanadium),new ItemStack(ItemList.itemDirtyDustVanadium))
                .addCriterion("crushvanadium",has(ItemList.itemClumpVanadium))
                .build(consumer,new ResourceLocation("extraores:crushvanadium"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpVulcanite),new ItemStack(ItemList.itemDirtyDustVulcanite))
                .addCriterion("crushvulcanite",has(ItemList.itemClumpVulcanite))
                .build(consumer,new ResourceLocation("extraores:crushvulcanite"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpVyroxeres),new ItemStack(ItemList.itemDirtyDustVyroxeres))
                .addCriterion("crushvyroxeres",has(ItemList.itemClumpVyroxeres))
                .build(consumer,new ResourceLocation("extraores:crushvyroxeres"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpYellorite),new ItemStack(ItemList.itemDirtyDustYellorite))
                .addCriterion("crushyellorite",has(ItemList.itemClumpYellorite))
                .build(consumer,new ResourceLocation("extraores:crushyellorite"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpZinc),new ItemStack(ItemList.itemDirtyDustZinc))
                .addCriterion("crushzinc",has(ItemList.itemClumpZinc))
                .build(consumer,new ResourceLocation("extraores:crushzinc"));
        ItemStackToItemStackRecipeBuilder.crushing(IngredientCreatorAccess.item().from(ItemTagList.clumpZirconium),new ItemStack(ItemList.itemDirtyDustZirconium))
                .addCriterion("crushzirconium",has(ItemList.itemClumpZirconium))
                .build(consumer,new ResourceLocation("extraores:crushzirconium"));
    }
    protected void buildMekanismEnriching(Consumer<FinishedRecipe> consumer)
    {
        //Ore
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreAdamantine),new ItemStack(ItemList.itemDustAdamantine,2))
                .addCriterion("enrichadamantineore",has(BlockList.blockOreAdamantine))
                .build(consumer,new ResourceLocation("extraores:enrichadamantineore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreAldourite),new ItemStack(ItemList.itemDustAldourite,2))
                .addCriterion("enrichaldouriteore",has(BlockList.blockOreAldourite))
                .build(consumer,new ResourceLocation("extraores:enrichaldouriteore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreAluminum),new ItemStack(ItemList.itemDustAluminum,2))
                .addCriterion("enrichaluminumore",has(BlockList.blockOreAluminum))
                .build(consumer,new ResourceLocation("extraores:enrichaluminumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreAmericium),new ItemStack(ItemList.itemDustAmericium,2))
                .addCriterion("enrichamericiumore",has(BlockList.blockOreAmericium))
                .build(consumer,new ResourceLocation("extraores:enrichamericiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreAmordrine),new ItemStack(ItemList.itemDustAmordrine,2))
                .addCriterion("enrichamordrineore",has(BlockList.blockOreAmordrine))
                .build(consumer,new ResourceLocation("extraores:enrichamordrineore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreAngmallen),new ItemStack(ItemList.itemDustAngmallen,2))
                .addCriterion("enrichangmallenore",has(BlockList.blockOreAngmallen))
                .build(consumer,new ResourceLocation("extraores:enrichangmallenore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreAstralSilver),new ItemStack(ItemList.itemDustAstralSilver,2))
                .addCriterion("enrichastralsilverore",has(BlockList.blockOreAstralSilver))
                .build(consumer,new ResourceLocation("extraores:enrichastralsilverore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreAtlarus),new ItemStack(ItemList.itemDustAtlarus,2))
                .addCriterion("enrichatlarusore",has(BlockList.blockOreAtlarus))
                .build(consumer,new ResourceLocation("extraores:enrichatlarusore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreBismuth),new ItemStack(ItemList.itemDustBismuth,2))
                .addCriterion("enrichbismuthore",has(BlockList.blockOreBismuth))
                .build(consumer,new ResourceLocation("extraores:enrichbismuthore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreBlackSteel),new ItemStack(ItemList.itemDustBlackSteel,2))
                .addCriterion("enrichblacksteelore",has(BlockList.blockOreBlackSteel))
                .build(consumer,new ResourceLocation("extraores:enrichblacksteelore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreCadmium),new ItemStack(ItemList.itemDustCadmium,2))
                .addCriterion("enrichcadmiumore",has(BlockList.blockOreCadmium))
                .build(consumer,new ResourceLocation("extraores:enrichcadmiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreCarmot),new ItemStack(ItemList.itemDustCarmot,2))
                .addCriterion("enrichcarmotore",has(BlockList.blockOreCarmot))
                .build(consumer,new ResourceLocation("extraores:enrichcarmotore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreCelenegil),new ItemStack(ItemList.itemDustCelenegil,2))
                .addCriterion("enrichcelenegilore",has(BlockList.blockOreCelenegil))
                .build(consumer,new ResourceLocation("extraores:enrichcelenegilore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreCeruclase),new ItemStack(ItemList.itemDustCeruclase,2))
                .addCriterion("enrichceruclaseore",has(BlockList.blockOreCeruclase))
                .build(consumer,new ResourceLocation("extraores:enrichceruclaseore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreChromium),new ItemStack(ItemList.itemDustChromium,2))
                .addCriterion("enrichchromiumore",has(BlockList.blockOreChromium))
                .build(consumer,new ResourceLocation("extraores:enrichchromiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreCobalt),new ItemStack(ItemList.itemDustCobalt,2))
                .addCriterion("enrichcobaltore",has(BlockList.blockOreCobalt))
                .build(consumer,new ResourceLocation("extraores:enrichcobaltore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreCopper),new ItemStack(ItemList.itemDustCopper,2))
                .addCriterion("enrichcopperore",has(BlockList.blockOreCopper))
                .build(consumer,new ResourceLocation("extraores:enrichcopperore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreDeepIron),new ItemStack(ItemList.itemDustDeepIron,2))
                .addCriterion("enrichdeepironore",has(BlockList.blockOreDeepIron))
                .build(consumer,new ResourceLocation("extraores:enrichdeepironore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreDesichalkos),new ItemStack(ItemList.itemDustDesichalkos,2))
                .addCriterion("enrichdesichalkosore",has(BlockList.blockOreDesichalkos))
                .build(consumer,new ResourceLocation("extraores:enrichdesichalkosore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreEximite),new ItemStack(ItemList.itemDustEximite,2))
                .addCriterion("enricheximiteore",has(BlockList.blockOreEximite))
                .build(consumer,new ResourceLocation("extraores:enricheximiteore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreGallium),new ItemStack(ItemList.itemDustGallium,2))
                .addCriterion("enrichgalliumore",has(BlockList.blockOreGallium))
                .build(consumer,new ResourceLocation("extraores:enrichgalliumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreHaderoth),new ItemStack(ItemList.itemDustHaderoth,2))
                .addCriterion("enrichhaderothore",has(BlockList.blockOreHaderoth))
                .build(consumer,new ResourceLocation("extraores:enrichhaderothore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreHepatizon),new ItemStack(ItemList.itemDustHepatizon,2))
                .addCriterion("enrichhepatizonore",has(BlockList.blockOreHepatizon))
                .build(consumer,new ResourceLocation("extraores:enrichhepatizonore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreIgnatius),new ItemStack(ItemList.itemDustIgnatius,2))
                .addCriterion("enrichignatiusore",has(BlockList.blockOreIgnatius))
                .build(consumer,new ResourceLocation("extraores:enrichignatiusore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreIndium),new ItemStack(ItemList.itemDustIndium,2))
                .addCriterion("enrichindiumore",has(BlockList.blockOreIndium))
                .build(consumer,new ResourceLocation("extraores:enrichindiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreInfuscolium),new ItemStack(ItemList.itemDustInfuscolium,2))
                .addCriterion("enrichinfuscoliumore",has(BlockList.blockOreInfuscolium))
                .build(consumer,new ResourceLocation("extraores:enrichinfuscoliumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreInolashite),new ItemStack(ItemList.itemDustInolashite,2))
                .addCriterion("enrichinolashiteore",has(BlockList.blockOreInolashite))
                .build(consumer,new ResourceLocation("extraores:enrichinolashiteore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreIridium),new ItemStack(ItemList.itemDustIridium,2))
                .addCriterion("enrichiridiumore",has(BlockList.blockOreIridium))
                .build(consumer,new ResourceLocation("extraores:enrichiridiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreKalendrite),new ItemStack(ItemList.itemDustKalendrite,2))
                .addCriterion("enrichkalendriteore",has(BlockList.blockOreKalendrite))
                .build(consumer,new ResourceLocation("extraores:enrichkalendriteore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreLead),new ItemStack(ItemList.itemDustLead,2))
                .addCriterion("enrichleadore",has(BlockList.blockOreLead))
                .build(consumer,new ResourceLocation("extraores:enrichleadore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreLemurite),new ItemStack(ItemList.itemDustLemurite,2))
                .addCriterion("enrichlemuriteore",has(BlockList.blockOreLemurite))
                .build(consumer,new ResourceLocation("extraores:enrichlemuriteore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreManganese),new ItemStack(ItemList.itemDustManganese,2))
                .addCriterion("enrichmanganeseore",has(BlockList.blockOreManganese))
                .build(consumer,new ResourceLocation("extraores:enrichmanganeseore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreMeutoite),new ItemStack(ItemList.itemDustMeutoite,2))
                .addCriterion("enrichmeutoiteore",has(BlockList.blockOreMeutoite))
                .build(consumer,new ResourceLocation("extraores:enrichmeutoiteore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreMidasium),new ItemStack(ItemList.itemDustMidasium,2))
                .addCriterion("enrichmidasiumore",has(BlockList.blockOreMidasium))
                .build(consumer,new ResourceLocation("extraores:enrichmidasiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreMithril),new ItemStack(ItemList.itemDustMithril,2))
                .addCriterion("enrichmithrilore",has(BlockList.blockOreMithril))
                .build(consumer,new ResourceLocation("extraores:enrichmithrilore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreMolybdenum),new ItemStack(ItemList.itemDustMolybdenum,2))
                .addCriterion("enrichmolybdenumore",has(BlockList.blockOreMolybdenum))
                .build(consumer,new ResourceLocation("extraores:enrichmolybdenumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreNeodymium),new ItemStack(ItemList.itemDustNeodymium,2))
                .addCriterion("enrichneodymiumore",has(BlockList.blockOreNeodymium))
                .build(consumer,new ResourceLocation("extraores:enrichneodymiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreNeptunium),new ItemStack(ItemList.itemDustNeptunium,2))
                .addCriterion("enrichneptuniumore",has(BlockList.blockOreNeptunium))
                .build(consumer,new ResourceLocation("extraores:enrichneptuniumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreNickel),new ItemStack(ItemList.itemDustNickel,2))
                .addCriterion("enrichnickelore",has(BlockList.blockOreNickel))
                .build(consumer,new ResourceLocation("extraores:enrichnickelore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreNiobium),new ItemStack(ItemList.itemDustNiobium,2))
                .addCriterion("enrichniobiumore",has(BlockList.blockOreNiobium))
                .build(consumer,new ResourceLocation("extraores:enrichniobiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreOrichalcum),new ItemStack(ItemList.itemDustOrichalcum,2))
                .addCriterion("enrichorichalcumore",has(BlockList.blockOreOrichalcum))
                .build(consumer,new ResourceLocation("extraores:enrichorichalcumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreOsmium),new ItemStack(ItemList.itemDustOsmium,2))
                .addCriterion("enrichosmiumore",has(BlockList.blockOreOsmium))
                .build(consumer,new ResourceLocation("extraores:enrichosmiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreOureclase),new ItemStack(ItemList.itemDustOureclase,2))
                .addCriterion("enrichoureclaseore",has(BlockList.blockOreOureclase))
                .build(consumer,new ResourceLocation("extraores:enrichoureclaseore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.orePalladium),new ItemStack(ItemList.itemDustPalladium,2))
                .addCriterion("enrichpalladiumore",has(BlockList.blockOrePalladium))
                .build(consumer,new ResourceLocation("extraores:enrichpalladiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.orePlatinum),new ItemStack(ItemList.itemDustPlatinum,2))
                .addCriterion("enrichplatinumore",has(BlockList.blockOrePlatinum))
                .build(consumer,new ResourceLocation("extraores:enrichplatinumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.orePlutonium),new ItemStack(ItemList.itemDustPlutonium,2))
                .addCriterion("enrichplutoniumore",has(BlockList.blockOrePlutonium))
                .build(consumer,new ResourceLocation("extraores:enrichplutoniumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.orePolonium),new ItemStack(ItemList.itemDustPolonium,2))
                .addCriterion("enrichpoloniumore",has(BlockList.blockOrePolonium))
                .build(consumer,new ResourceLocation("extraores:enrichpoloniumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.orePromethium),new ItemStack(ItemList.itemDustPromethium,2))
                .addCriterion("enrichpromethiumore",has(BlockList.blockOrePromethium))
                .build(consumer,new ResourceLocation("extraores:enrichpromethiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreRhenium),new ItemStack(ItemList.itemDustRhenium,2))
                .addCriterion("enrichrheniumore",has(BlockList.blockOreRhenium))
                .build(consumer,new ResourceLocation("extraores:enrichrheniumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreRhodium),new ItemStack(ItemList.itemDustRhodium,2))
                .addCriterion("enrichrhodiumore",has(BlockList.blockOreRhodium))
                .build(consumer,new ResourceLocation("extraores:enrichrhodiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreRubracium),new ItemStack(ItemList.itemDustRubracium,2))
                .addCriterion("enrichrubraciumore",has(BlockList.blockOreRubracium))
                .build(consumer,new ResourceLocation("extraores:enrichrubraciumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreRuthenium),new ItemStack(ItemList.itemDustRuthenium,2))
                .addCriterion("enrichrutheniumore",has(BlockList.blockOreRuthenium))
                .build(consumer,new ResourceLocation("extraores:enrichrutheniumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreSanguinite),new ItemStack(ItemList.itemDustSanguinite,2))
                .addCriterion("enrichsanguiniteore",has(BlockList.blockOreSanguinite))
                .build(consumer,new ResourceLocation("extraores:enrichsanguiniteore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreShadowIron),new ItemStack(ItemList.itemDustShadowIron,2))
                .addCriterion("enrichshadowironore",has(BlockList.blockOreShadowIron))
                .build(consumer,new ResourceLocation("extraores:enrichshadowironore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreSilver),new ItemStack(ItemList.itemDustSilver,2))
                .addCriterion("enrichsilverore",has(BlockList.blockOreSilver))
                .build(consumer,new ResourceLocation("extraores:enrichsilverore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreTantalum),new ItemStack(ItemList.itemDustTantalum,2))
                .addCriterion("enrichtantalumore",has(BlockList.blockOreTantalum))
                .build(consumer,new ResourceLocation("extraores:enrichtantalumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreTartarite),new ItemStack(ItemList.itemDustTartarite,2))
                .addCriterion("enrichtartariteore",has(BlockList.blockOreTartarite))
                .build(consumer,new ResourceLocation("extraores:enrichtartariteore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreTechnetium),new ItemStack(ItemList.itemDustTechnetium,2))
                .addCriterion("enrichtechnetiumore",has(BlockList.blockOreTechnetium))
                .build(consumer,new ResourceLocation("extraores:enrichtechnetiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreThallium),new ItemStack(ItemList.itemDustThallium,2))
                .addCriterion("enrichthalliumore",has(BlockList.blockOreThallium))
                .build(consumer,new ResourceLocation("extraores:enrichthalliumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreTin),new ItemStack(ItemList.itemDustTin,2))
                .addCriterion("enrichtinore",has(BlockList.blockOreTin))
                .build(consumer,new ResourceLocation("extraores:enrichtinore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreTitanium),new ItemStack(ItemList.itemDustTitanium,2))
                .addCriterion("enrichtitaniumore",has(BlockList.blockOreTitanium))
                .build(consumer,new ResourceLocation("extraores:enrichtitaniumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreTungsten),new ItemStack(ItemList.itemDustTungsten,2))
                .addCriterion("enrichtungstenore",has(BlockList.blockOreTungsten))
                .build(consumer,new ResourceLocation("extraores:enrichtungstenore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreUnobtainium),new ItemStack(ItemList.itemDustUnobtainium,2))
                .addCriterion("enrichunobtainiumore",has(BlockList.blockOreUnobtainium))
                .build(consumer,new ResourceLocation("extraores:enrichunobtainiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreUranium),new ItemStack(ItemList.itemDustUranium,2))
                .addCriterion("enrichuraniumore",has(BlockList.blockOreUranium))
                .build(consumer,new ResourceLocation("extraores:enrichuraniumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreVanadium),new ItemStack(ItemList.itemDustVanadium,2))
                .addCriterion("enrichvanadiumore",has(BlockList.blockOreVanadium))
                .build(consumer,new ResourceLocation("extraores:enrichvanadiumore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreVulcanite),new ItemStack(ItemList.itemDustVulcanite,2))
                .addCriterion("enrichvulcaniteore",has(BlockList.blockOreVulcanite))
                .build(consumer,new ResourceLocation("extraores:enrichvulcaniteore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreVyroxeres),new ItemStack(ItemList.itemDustVyroxeres,2))
                .addCriterion("enrichvyroxeresore",has(BlockList.blockOreVyroxeres))
                .build(consumer,new ResourceLocation("extraores:enrichvyroxeresore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreYellorite),new ItemStack(ItemList.itemDustYellorite,2))
                .addCriterion("enrichyelloriteore",has(BlockList.blockOreYellorite))
                .build(consumer,new ResourceLocation("extraores:enrichyelloriteore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreZinc),new ItemStack(ItemList.itemDustZinc,2))
                .addCriterion("enrichzincore",has(BlockList.blockOreZinc))
                .build(consumer,new ResourceLocation("extraores:enrichzincore"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.oreZirconium),new ItemStack(ItemList.itemDustZirconium,2))
                .addCriterion("enrichzirconiumore",has(BlockList.blockOreZirconium))
                .build(consumer,new ResourceLocation("extraores:enrichzirconiumore"));
        //Raw
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawAdamantine),new ItemStack(ItemList.itemDustAdamantine,2))
                .addCriterion("enrichrawadamantine",has(ItemList.itemRawAdamantine))
                .build(consumer,new ResourceLocation("extraores:enrichrawadamantine"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawAldourite),new ItemStack(ItemList.itemDustAldourite,2))
                .addCriterion("enrichrawaldourite",has(ItemList.itemRawAldourite))
                .build(consumer,new ResourceLocation("extraores:enrichrawaldourite"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawAluminum),new ItemStack(ItemList.itemDustAluminum,2))
                .addCriterion("enrichrawaluminum",has(ItemList.itemRawAluminum))
                .build(consumer,new ResourceLocation("extraores:enrichrawaluminum"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawAmericium),new ItemStack(ItemList.itemDustAmericium,2))
                .addCriterion("enrichrawamericium",has(ItemList.itemRawAmericium))
                .build(consumer,new ResourceLocation("extraores:enrichrawamericium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawAmordrine),new ItemStack(ItemList.itemDustAmordrine,2))
                .addCriterion("enrichrawamordrine",has(ItemList.itemRawAmordrine))
                .build(consumer,new ResourceLocation("extraores:enrichrawamordrine"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawAngmallen),new ItemStack(ItemList.itemDustAngmallen,2))
                .addCriterion("enrichrawangmallen",has(ItemList.itemRawAngmallen))
                .build(consumer,new ResourceLocation("extraores:enrichrawangmallen"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawAstralSilver),new ItemStack(ItemList.itemDustAstralSilver,2))
                .addCriterion("enrichrawastralsilver",has(ItemList.itemRawAstralSilver))
                .build(consumer,new ResourceLocation("extraores:enrichrawastralsilver"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawAtlarus),new ItemStack(ItemList.itemDustAtlarus,2))
                .addCriterion("enrichrawatlarus",has(ItemList.itemRawAtlarus))
                .build(consumer,new ResourceLocation("extraores:enrichrawatlarus"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawBismuth),new ItemStack(ItemList.itemDustBismuth,2))
                .addCriterion("enrichrawbismuth",has(ItemList.itemRawBismuth))
                .build(consumer,new ResourceLocation("extraores:enrichrawbismuth"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawBlackSteel),new ItemStack(ItemList.itemDustBlackSteel,2))
                .addCriterion("enrichrawblacksteel",has(ItemList.itemRawBlackSteel))
                .build(consumer,new ResourceLocation("extraores:enrichrawblacksteel"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawCadmium),new ItemStack(ItemList.itemDustCadmium,2))
                .addCriterion("enrichrawcadmium",has(ItemList.itemRawCadmium))
                .build(consumer,new ResourceLocation("extraores:enrichrawcadmium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawCarmot),new ItemStack(ItemList.itemDustCarmot,2))
                .addCriterion("enrichrawcarmot",has(ItemList.itemRawCarmot))
                .build(consumer,new ResourceLocation("extraores:enrichrawcarmot"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawCelenegil),new ItemStack(ItemList.itemDustCelenegil,2))
                .addCriterion("enrichrawcelenegil",has(ItemList.itemRawCelenegil))
                .build(consumer,new ResourceLocation("extraores:enrichrawcelenegil"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawCeruclase),new ItemStack(ItemList.itemDustCeruclase,2))
                .addCriterion("enrichrawceruclase",has(ItemList.itemRawCeruclase))
                .build(consumer,new ResourceLocation("extraores:enrichrawceruclase"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawChromium),new ItemStack(ItemList.itemDustChromium,2))
                .addCriterion("enrichrawchromium",has(ItemList.itemRawChromium))
                .build(consumer,new ResourceLocation("extraores:enrichrawchromium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawCobalt),new ItemStack(ItemList.itemDustCobalt,2))
                .addCriterion("enrichrawcobalt",has(ItemList.itemRawCobalt))
                .build(consumer,new ResourceLocation("extraores:enrichrawcobalt"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawCopper),new ItemStack(ItemList.itemDustCopper,2))
                .addCriterion("enrichrawcopper",has(ItemList.itemRawCopper))
                .build(consumer,new ResourceLocation("extraores:enrichrawcopper"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawDeepIron),new ItemStack(ItemList.itemDustDeepIron,2))
                .addCriterion("enrichrawdeepiron",has(ItemList.itemRawDeepIron))
                .build(consumer,new ResourceLocation("extraores:enrichrawdeepiron"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawDesichalkos),new ItemStack(ItemList.itemDustDesichalkos,2))
                .addCriterion("enrichrawdesichalkos",has(ItemList.itemRawDesichalkos))
                .build(consumer,new ResourceLocation("extraores:enrichrawdesichalkos"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawEximite),new ItemStack(ItemList.itemDustEximite,2))
                .addCriterion("enrichraweximite",has(ItemList.itemRawEximite))
                .build(consumer,new ResourceLocation("extraores:enrichraweximite"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawGallium),new ItemStack(ItemList.itemDustGallium,2))
                .addCriterion("enrichrawgallium",has(ItemList.itemRawGallium))
                .build(consumer,new ResourceLocation("extraores:enrichrawgallium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawHaderoth),new ItemStack(ItemList.itemDustHaderoth,2))
                .addCriterion("enrichrawhaderoth",has(ItemList.itemRawHaderoth))
                .build(consumer,new ResourceLocation("extraores:enrichrawhaderoth"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawHepatizon),new ItemStack(ItemList.itemDustHepatizon,2))
                .addCriterion("enrichrawhepatizon",has(ItemList.itemRawHepatizon))
                .build(consumer,new ResourceLocation("extraores:enrichrawhepatizon"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawIgnatius),new ItemStack(ItemList.itemDustIgnatius,2))
                .addCriterion("enrichrawignatius",has(ItemList.itemRawIgnatius))
                .build(consumer,new ResourceLocation("extraores:enrichrawignatius"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawIndium),new ItemStack(ItemList.itemDustIndium,2))
                .addCriterion("enrichrawindium",has(ItemList.itemRawIndium))
                .build(consumer,new ResourceLocation("extraores:enrichrawindium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawInfuscolium),new ItemStack(ItemList.itemDustInfuscolium,2))
                .addCriterion("enrichrawinfuscolium",has(ItemList.itemRawInfuscolium))
                .build(consumer,new ResourceLocation("extraores:enrichrawinfuscolium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawInolashite),new ItemStack(ItemList.itemDustInolashite,2))
                .addCriterion("enrichrawinolashite",has(ItemList.itemRawInolashite))
                .build(consumer,new ResourceLocation("extraores:enrichrawinolashite"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawIridium),new ItemStack(ItemList.itemDustIridium,2))
                .addCriterion("enrichrawiridium",has(ItemList.itemRawIridium))
                .build(consumer,new ResourceLocation("extraores:enrichrawiridium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawKalendrite),new ItemStack(ItemList.itemDustKalendrite,2))
                .addCriterion("enrichrawkalendrite",has(ItemList.itemRawKalendrite))
                .build(consumer,new ResourceLocation("extraores:enrichrawkalendrite"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawLead),new ItemStack(ItemList.itemDustLead,2))
                .addCriterion("enrichrawlead",has(ItemList.itemRawLead))
                .build(consumer,new ResourceLocation("extraores:enrichrawlead"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawLemurite),new ItemStack(ItemList.itemDustLemurite,2))
                .addCriterion("enrichrawlemurite",has(ItemList.itemRawLemurite))
                .build(consumer,new ResourceLocation("extraores:enrichrawlemurite"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawManganese),new ItemStack(ItemList.itemDustManganese,2))
                .addCriterion("enrichrawmanganese",has(ItemList.itemRawManganese))
                .build(consumer,new ResourceLocation("extraores:enrichrawmanganese"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawMeutoite),new ItemStack(ItemList.itemDustMeutoite,2))
                .addCriterion("enrichrawmeutoite",has(ItemList.itemRawMeutoite))
                .build(consumer,new ResourceLocation("extraores:enrichrawmeutoite"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawMidasium),new ItemStack(ItemList.itemDustMidasium,2))
                .addCriterion("enrichrawmidasium",has(ItemList.itemRawMidasium))
                .build(consumer,new ResourceLocation("extraores:enrichrawmidasium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawMithril),new ItemStack(ItemList.itemDustMithril,2))
                .addCriterion("enrichrawmithril",has(ItemList.itemRawMithril))
                .build(consumer,new ResourceLocation("extraores:enrichrawmithril"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawMolybdenum),new ItemStack(ItemList.itemDustMolybdenum,2))
                .addCriterion("enrichrawmolybdenum",has(ItemList.itemRawMolybdenum))
                .build(consumer,new ResourceLocation("extraores:enrichrawmolybdenum"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawNeodymium),new ItemStack(ItemList.itemDustNeodymium,2))
                .addCriterion("enrichrawneodymium",has(ItemList.itemRawNeodymium))
                .build(consumer,new ResourceLocation("extraores:enrichrawneodymium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawNeptunium),new ItemStack(ItemList.itemDustNeptunium,2))
                .addCriterion("enrichrawneptunium",has(ItemList.itemRawNeptunium))
                .build(consumer,new ResourceLocation("extraores:enrichrawneptunium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawNickel),new ItemStack(ItemList.itemDustNickel,2))
                .addCriterion("enrichrawnickel",has(ItemList.itemRawNickel))
                .build(consumer,new ResourceLocation("extraores:enrichrawnickel"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawNiobium),new ItemStack(ItemList.itemDustNiobium,2))
                .addCriterion("enrichrawniobium",has(ItemList.itemRawNiobium))
                .build(consumer,new ResourceLocation("extraores:enrichrawniobium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawOrichalcum),new ItemStack(ItemList.itemDustOrichalcum,2))
                .addCriterion("enrichraworichalcum",has(ItemList.itemRawOrichalcum))
                .build(consumer,new ResourceLocation("extraores:enrichraworichalcum"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawOsmium),new ItemStack(ItemList.itemDustOsmium,2))
                .addCriterion("enrichrawosmium",has(ItemList.itemRawOsmium))
                .build(consumer,new ResourceLocation("extraores:enrichrawosmium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawOureclase),new ItemStack(ItemList.itemDustOureclase,2))
                .addCriterion("enrichrawoureclase",has(ItemList.itemRawOureclase))
                .build(consumer,new ResourceLocation("extraores:enrichrawoureclase"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawPalladium),new ItemStack(ItemList.itemDustPalladium,2))
                .addCriterion("enrichrawpalladium",has(ItemList.itemRawPalladium))
                .build(consumer,new ResourceLocation("extraores:enrichrawpalladium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawPlatinum),new ItemStack(ItemList.itemDustPlatinum,2))
                .addCriterion("enrichrawplatinum",has(ItemList.itemRawPlatinum))
                .build(consumer,new ResourceLocation("extraores:enrichrawplatinum"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawPlutonium),new ItemStack(ItemList.itemDustPlutonium,2))
                .addCriterion("enrichrawplutonium",has(ItemList.itemRawPlutonium))
                .build(consumer,new ResourceLocation("extraores:enrichrawplutonium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawPolonium),new ItemStack(ItemList.itemDustPolonium,2))
                .addCriterion("enrichrawpolonium",has(ItemList.itemRawPolonium))
                .build(consumer,new ResourceLocation("extraores:enrichrawpolonium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawPromethium),new ItemStack(ItemList.itemDustPromethium,2))
                .addCriterion("enrichrawpromethium",has(ItemList.itemRawPromethium))
                .build(consumer,new ResourceLocation("extraores:enrichrawpromethium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawRhenium),new ItemStack(ItemList.itemDustRhenium,2))
                .addCriterion("enrichrawrhenium",has(ItemList.itemRawRhenium))
                .build(consumer,new ResourceLocation("extraores:enrichrawrhenium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawRhodium),new ItemStack(ItemList.itemDustRhodium,2))
                .addCriterion("enrichrawrhodium",has(ItemList.itemRawRhodium))
                .build(consumer,new ResourceLocation("extraores:enrichrawrhodium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawRubracium),new ItemStack(ItemList.itemDustRubracium,2))
                .addCriterion("enrichrawrubracium",has(ItemList.itemRawRubracium))
                .build(consumer,new ResourceLocation("extraores:enrichrawrubracium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawRuthenium),new ItemStack(ItemList.itemDustRuthenium,2))
                .addCriterion("enrichrawruthenium",has(ItemList.itemRawRuthenium))
                .build(consumer,new ResourceLocation("extraores:enrichrawruthenium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawSanguinite),new ItemStack(ItemList.itemDustSanguinite,2))
                .addCriterion("enrichrawsanguinite",has(ItemList.itemRawSanguinite))
                .build(consumer,new ResourceLocation("extraores:enrichrawsanguinite"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawShadowIron),new ItemStack(ItemList.itemDustShadowIron,2))
                .addCriterion("enrichrawshadowiron",has(ItemList.itemRawShadowIron))
                .build(consumer,new ResourceLocation("extraores:enrichrawshadowiron"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawSilver),new ItemStack(ItemList.itemDustSilver,2))
                .addCriterion("enrichrawsilver",has(ItemList.itemRawSilver))
                .build(consumer,new ResourceLocation("extraores:enrichrawsilver"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawTantalum),new ItemStack(ItemList.itemDustTantalum,2))
                .addCriterion("enrichrawtantalum",has(ItemList.itemRawTantalum))
                .build(consumer,new ResourceLocation("extraores:enrichrawtantalum"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawTartarite),new ItemStack(ItemList.itemDustTartarite,2))
                .addCriterion("enrichrawtartarite",has(ItemList.itemRawTartarite))
                .build(consumer,new ResourceLocation("extraores:enrichrawtartarite"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawTechnetium),new ItemStack(ItemList.itemDustTechnetium,2))
                .addCriterion("enrichrawtechnetium",has(ItemList.itemRawTechnetium))
                .build(consumer,new ResourceLocation("extraores:enrichrawtechnetium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawThallium),new ItemStack(ItemList.itemDustThallium,2))
                .addCriterion("enrichrawthallium",has(ItemList.itemRawThallium))
                .build(consumer,new ResourceLocation("extraores:enrichrawthallium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawTin),new ItemStack(ItemList.itemDustTin,2))
                .addCriterion("enrichrawtin",has(ItemList.itemRawTin))
                .build(consumer,new ResourceLocation("extraores:enrichrawtin"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawTitanium),new ItemStack(ItemList.itemDustTitanium,2))
                .addCriterion("enrichrawtitanium",has(ItemList.itemRawTitanium))
                .build(consumer,new ResourceLocation("extraores:enrichrawtitanium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawTungsten),new ItemStack(ItemList.itemDustTungsten,2))
                .addCriterion("enrichrawtungsten",has(ItemList.itemRawTungsten))
                .build(consumer,new ResourceLocation("extraores:enrichrawtungsten"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawUnobtainium),new ItemStack(ItemList.itemDustUnobtainium,2))
                .addCriterion("enrichrawunobtainium",has(ItemList.itemRawUnobtainium))
                .build(consumer,new ResourceLocation("extraores:enrichrawunobtainium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawUranium),new ItemStack(ItemList.itemDustUranium,2))
                .addCriterion("enrichrawuranium",has(ItemList.itemRawUranium))
                .build(consumer,new ResourceLocation("extraores:enrichrawuranium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawVanadium),new ItemStack(ItemList.itemDustVanadium,2))
                .addCriterion("enrichrawvanadium",has(ItemList.itemRawVanadium))
                .build(consumer,new ResourceLocation("extraores:enrichrawvanadium"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawVulcanite),new ItemStack(ItemList.itemDustVulcanite,2))
                .addCriterion("enrichrawvulcanite",has(ItemList.itemRawVulcanite))
                .build(consumer,new ResourceLocation("extraores:enrichrawvulcanite"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawVyroxeres),new ItemStack(ItemList.itemDustVyroxeres,2))
                .addCriterion("enrichrawvyroxeres",has(ItemList.itemRawVyroxeres))
                .build(consumer,new ResourceLocation("extraores:enrichrawvyroxeres"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawYellorite),new ItemStack(ItemList.itemDustYellorite,2))
                .addCriterion("enrichrawyellorite",has(ItemList.itemRawYellorite))
                .build(consumer,new ResourceLocation("extraores:enrichrawyellorite"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawZinc),new ItemStack(ItemList.itemDustZinc,2))
                .addCriterion("enrichrawzinc",has(ItemList.itemRawZinc))
                .build(consumer,new ResourceLocation("extraores:enrichrawzinc"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.rawZirconium),new ItemStack(ItemList.itemDustZirconium,2))
                .addCriterion("enrichrawzirconium",has(ItemList.itemRawZirconium))
                .build(consumer,new ResourceLocation("extraores:enrichrawzirconium"));
        //Dirty Dust
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustAdamantine),new ItemStack(ItemList.itemDustAdamantine))
                .addCriterion("enrichadamantinedirtydust",has(BlockList.blockOreAdamantine))
                .build(consumer,new ResourceLocation("extraores:enrichadamantinedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustAldourite),new ItemStack(ItemList.itemDustAldourite))
                .addCriterion("enrichaldouritedirtydust",has(BlockList.blockOreAldourite))
                .build(consumer,new ResourceLocation("extraores:enrichaldouritedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustAluminum),new ItemStack(ItemList.itemDustAluminum))
                .addCriterion("enrichaluminumdirtydust",has(BlockList.blockOreAluminum))
                .build(consumer,new ResourceLocation("extraores:enrichaluminumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustAmericium),new ItemStack(ItemList.itemDustAmericium))
                .addCriterion("enrichamericiumdirtydust",has(BlockList.blockOreAmericium))
                .build(consumer,new ResourceLocation("extraores:enrichamericiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustAmordrine),new ItemStack(ItemList.itemDustAmordrine))
                .addCriterion("enrichamordrinedirtydust",has(BlockList.blockOreAmordrine))
                .build(consumer,new ResourceLocation("extraores:enrichamordrinedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustAngmallen),new ItemStack(ItemList.itemDustAngmallen))
                .addCriterion("enrichangmallendirtydust",has(BlockList.blockOreAngmallen))
                .build(consumer,new ResourceLocation("extraores:enrichangmallendirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustAstralSilver),new ItemStack(ItemList.itemDustAstralSilver))
                .addCriterion("enrichastralsilverdirtydust",has(BlockList.blockOreAstralSilver))
                .build(consumer,new ResourceLocation("extraores:enrichastralsilverdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustAtlarus),new ItemStack(ItemList.itemDustAtlarus))
                .addCriterion("enrichatlarusdirtydust",has(BlockList.blockOreAtlarus))
                .build(consumer,new ResourceLocation("extraores:enrichatlarusdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustBismuth),new ItemStack(ItemList.itemDustBismuth))
                .addCriterion("enrichbismuthdirtydust",has(BlockList.blockOreBismuth))
                .build(consumer,new ResourceLocation("extraores:enrichbismuthdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustBlackSteel),new ItemStack(ItemList.itemDustBlackSteel))
                .addCriterion("enrichblacksteeldirtydust",has(BlockList.blockOreBlackSteel))
                .build(consumer,new ResourceLocation("extraores:enrichblacksteeldirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustCadmium),new ItemStack(ItemList.itemDustCadmium))
                .addCriterion("enrichcadmiumdirtydust",has(BlockList.blockOreCadmium))
                .build(consumer,new ResourceLocation("extraores:enrichcadmiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustCarmot),new ItemStack(ItemList.itemDustCarmot))
                .addCriterion("enrichcarmotdirtydust",has(BlockList.blockOreCarmot))
                .build(consumer,new ResourceLocation("extraores:enrichcarmotdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustCelenegil),new ItemStack(ItemList.itemDustCelenegil))
                .addCriterion("enrichcelenegildirtydust",has(BlockList.blockOreCelenegil))
                .build(consumer,new ResourceLocation("extraores:enrichcelenegildirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustCeruclase),new ItemStack(ItemList.itemDustCeruclase))
                .addCriterion("enrichceruclasedirtydust",has(BlockList.blockOreCeruclase))
                .build(consumer,new ResourceLocation("extraores:enrichceruclasedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustChromium),new ItemStack(ItemList.itemDustChromium))
                .addCriterion("enrichchromiumdirtydust",has(BlockList.blockOreChromium))
                .build(consumer,new ResourceLocation("extraores:enrichchromiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustCobalt),new ItemStack(ItemList.itemDustCobalt))
                .addCriterion("enrichcobaltdirtydust",has(BlockList.blockOreCobalt))
                .build(consumer,new ResourceLocation("extraores:enrichcobaltdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustCopper),new ItemStack(ItemList.itemDustCopper))
                .addCriterion("enrichcopperdirtydust",has(BlockList.blockOreCopper))
                .build(consumer,new ResourceLocation("extraores:enrichcopperdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustDeepIron),new ItemStack(ItemList.itemDustDeepIron))
                .addCriterion("enrichdeepirondirtydust",has(BlockList.blockOreDeepIron))
                .build(consumer,new ResourceLocation("extraores:enrichdeepirondirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustDesichalkos),new ItemStack(ItemList.itemDustDesichalkos))
                .addCriterion("enrichdesichalkosdirtydust",has(BlockList.blockOreDesichalkos))
                .build(consumer,new ResourceLocation("extraores:enrichdesichalkosdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustEximite),new ItemStack(ItemList.itemDustEximite))
                .addCriterion("enricheximitedirtydust",has(BlockList.blockOreEximite))
                .build(consumer,new ResourceLocation("extraores:enricheximitedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustGallium),new ItemStack(ItemList.itemDustGallium))
                .addCriterion("enrichgalliumdirtydust",has(BlockList.blockOreGallium))
                .build(consumer,new ResourceLocation("extraores:enrichgalliumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustHaderoth),new ItemStack(ItemList.itemDustHaderoth))
                .addCriterion("enrichhaderothdirtydust",has(BlockList.blockOreHaderoth))
                .build(consumer,new ResourceLocation("extraores:enrichhaderothdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustHepatizon),new ItemStack(ItemList.itemDustHepatizon))
                .addCriterion("enrichhepatizondirtydust",has(BlockList.blockOreHepatizon))
                .build(consumer,new ResourceLocation("extraores:enrichhepatizondirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustIgnatius),new ItemStack(ItemList.itemDustIgnatius))
                .addCriterion("enrichignatiusdirtydust",has(BlockList.blockOreIgnatius))
                .build(consumer,new ResourceLocation("extraores:enrichignatiusdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustIndium),new ItemStack(ItemList.itemDustIndium))
                .addCriterion("enrichindiumdirtydust",has(BlockList.blockOreIndium))
                .build(consumer,new ResourceLocation("extraores:enrichindiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustInfuscolium),new ItemStack(ItemList.itemDustInfuscolium))
                .addCriterion("enrichinfuscoliumdirtydust",has(BlockList.blockOreInfuscolium))
                .build(consumer,new ResourceLocation("extraores:enrichinfuscoliumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustInolashite),new ItemStack(ItemList.itemDustInolashite))
                .addCriterion("enrichinolashitedirtydust",has(BlockList.blockOreInolashite))
                .build(consumer,new ResourceLocation("extraores:enrichinolashitedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustIridium),new ItemStack(ItemList.itemDustIridium))
                .addCriterion("enrichiridiumdirtydust",has(BlockList.blockOreIridium))
                .build(consumer,new ResourceLocation("extraores:enrichiridiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustKalendrite),new ItemStack(ItemList.itemDustKalendrite))
                .addCriterion("enrichkalendritedirtydust",has(BlockList.blockOreKalendrite))
                .build(consumer,new ResourceLocation("extraores:enrichkalendritedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustLead),new ItemStack(ItemList.itemDustLead))
                .addCriterion("enrichleaddirtydust",has(BlockList.blockOreLead))
                .build(consumer,new ResourceLocation("extraores:enrichleaddirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustLemurite),new ItemStack(ItemList.itemDustLemurite))
                .addCriterion("enrichlemuritedirtydust",has(BlockList.blockOreLemurite))
                .build(consumer,new ResourceLocation("extraores:enrichlemuritedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustManganese),new ItemStack(ItemList.itemDustManganese))
                .addCriterion("enrichmanganesedirtydust",has(BlockList.blockOreManganese))
                .build(consumer,new ResourceLocation("extraores:enrichmanganesedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustMeutoite),new ItemStack(ItemList.itemDustMeutoite))
                .addCriterion("enrichmeutoitedirtydust",has(BlockList.blockOreMeutoite))
                .build(consumer,new ResourceLocation("extraores:enrichmeutoitedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustMidasium),new ItemStack(ItemList.itemDustMidasium))
                .addCriterion("enrichmidasiumdirtydust",has(BlockList.blockOreMidasium))
                .build(consumer,new ResourceLocation("extraores:enrichmidasiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustMithril),new ItemStack(ItemList.itemDustMithril))
                .addCriterion("enrichmithrildirtydust",has(BlockList.blockOreMithril))
                .build(consumer,new ResourceLocation("extraores:enrichmithrildirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustMolybdenum),new ItemStack(ItemList.itemDustMolybdenum))
                .addCriterion("enrichmolybdenumdirtydust",has(BlockList.blockOreMolybdenum))
                .build(consumer,new ResourceLocation("extraores:enrichmolybdenumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustNeodymium),new ItemStack(ItemList.itemDustNeodymium))
                .addCriterion("enrichneodymiumdirtydust",has(BlockList.blockOreNeodymium))
                .build(consumer,new ResourceLocation("extraores:enrichneodymiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustNeptunium),new ItemStack(ItemList.itemDustNeptunium))
                .addCriterion("enrichneptuniumdirtydust",has(BlockList.blockOreNeptunium))
                .build(consumer,new ResourceLocation("extraores:enrichneptuniumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustNickel),new ItemStack(ItemList.itemDustNickel))
                .addCriterion("enrichnickeldirtydust",has(BlockList.blockOreNickel))
                .build(consumer,new ResourceLocation("extraores:enrichnickeldirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustNiobium),new ItemStack(ItemList.itemDustNiobium))
                .addCriterion("enrichniobiumdirtydust",has(BlockList.blockOreNiobium))
                .build(consumer,new ResourceLocation("extraores:enrichniobiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustOrichalcum),new ItemStack(ItemList.itemDustOrichalcum))
                .addCriterion("enrichorichalcumdirtydust",has(BlockList.blockOreOrichalcum))
                .build(consumer,new ResourceLocation("extraores:enrichorichalcumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustOsmium),new ItemStack(ItemList.itemDustOsmium))
                .addCriterion("enrichosmiumdirtydust",has(BlockList.blockOreOsmium))
                .build(consumer,new ResourceLocation("extraores:enrichosmiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustOureclase),new ItemStack(ItemList.itemDustOureclase))
                .addCriterion("enrichoureclasedirtydust",has(BlockList.blockOreOureclase))
                .build(consumer,new ResourceLocation("extraores:enrichoureclasedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustPalladium),new ItemStack(ItemList.itemDustPalladium))
                .addCriterion("enrichpalladiumdirtydust",has(BlockList.blockOrePalladium))
                .build(consumer,new ResourceLocation("extraores:enrichpalladiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustPlatinum),new ItemStack(ItemList.itemDustPlatinum))
                .addCriterion("enrichplatinumdirtydust",has(BlockList.blockOrePlatinum))
                .build(consumer,new ResourceLocation("extraores:enrichplatinumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustPlutonium),new ItemStack(ItemList.itemDustPlutonium))
                .addCriterion("enrichplutoniumdirtydust",has(BlockList.blockOrePlutonium))
                .build(consumer,new ResourceLocation("extraores:enrichplutoniumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustPolonium),new ItemStack(ItemList.itemDustPolonium))
                .addCriterion("enrichpoloniumdirtydust",has(BlockList.blockOrePolonium))
                .build(consumer,new ResourceLocation("extraores:enrichpoloniumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustPromethium),new ItemStack(ItemList.itemDustPromethium))
                .addCriterion("enrichpromethiumdirtydust",has(BlockList.blockOrePromethium))
                .build(consumer,new ResourceLocation("extraores:enrichpromethiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustRhenium),new ItemStack(ItemList.itemDustRhenium))
                .addCriterion("enrichrheniumdirtydust",has(BlockList.blockOreRhenium))
                .build(consumer,new ResourceLocation("extraores:enrichrheniumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustRhodium),new ItemStack(ItemList.itemDustRhodium))
                .addCriterion("enrichrhodiumdirtydust",has(BlockList.blockOreRhodium))
                .build(consumer,new ResourceLocation("extraores:enrichrhodiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustRubracium),new ItemStack(ItemList.itemDustRubracium))
                .addCriterion("enrichrubraciumdirtydust",has(BlockList.blockOreRubracium))
                .build(consumer,new ResourceLocation("extraores:enrichrubraciumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustRuthenium),new ItemStack(ItemList.itemDustRuthenium))
                .addCriterion("enrichrutheniumdirtydust",has(BlockList.blockOreRuthenium))
                .build(consumer,new ResourceLocation("extraores:enrichrutheniumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustSanguinite),new ItemStack(ItemList.itemDustSanguinite))
                .addCriterion("enrichsanguinitedirtydust",has(BlockList.blockOreSanguinite))
                .build(consumer,new ResourceLocation("extraores:enrichsanguinitedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustShadowIron),new ItemStack(ItemList.itemDustShadowIron))
                .addCriterion("enrichshadowirondirtydust",has(BlockList.blockOreShadowIron))
                .build(consumer,new ResourceLocation("extraores:enrichshadowirondirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustSilver),new ItemStack(ItemList.itemDustSilver))
                .addCriterion("enrichsilverdirtydust",has(BlockList.blockOreSilver))
                .build(consumer,new ResourceLocation("extraores:enrichsilverdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustTantalum),new ItemStack(ItemList.itemDustTantalum))
                .addCriterion("enrichtantalumdirtydust",has(BlockList.blockOreTantalum))
                .build(consumer,new ResourceLocation("extraores:enrichtantalumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustTartarite),new ItemStack(ItemList.itemDustTartarite))
                .addCriterion("enrichtartaritedirtydust",has(BlockList.blockOreTartarite))
                .build(consumer,new ResourceLocation("extraores:enrichtartaritedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustTechnetium),new ItemStack(ItemList.itemDustTechnetium))
                .addCriterion("enrichtechnetiumdirtydust",has(BlockList.blockOreTechnetium))
                .build(consumer,new ResourceLocation("extraores:enrichtechnetiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustThallium),new ItemStack(ItemList.itemDustThallium))
                .addCriterion("enrichthalliumdirtydust",has(BlockList.blockOreThallium))
                .build(consumer,new ResourceLocation("extraores:enrichthalliumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustTin),new ItemStack(ItemList.itemDustTin))
                .addCriterion("enrichtindirtydust",has(BlockList.blockOreTin))
                .build(consumer,new ResourceLocation("extraores:enrichtindirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustTitanium),new ItemStack(ItemList.itemDustTitanium))
                .addCriterion("enrichtitaniumdirtydust",has(BlockList.blockOreTitanium))
                .build(consumer,new ResourceLocation("extraores:enrichtitaniumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustTungsten),new ItemStack(ItemList.itemDustTungsten))
                .addCriterion("enrichtungstendirtydust",has(BlockList.blockOreTungsten))
                .build(consumer,new ResourceLocation("extraores:enrichtungstendirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustUnobtainium),new ItemStack(ItemList.itemDustUnobtainium))
                .addCriterion("enrichunobtainiumdirtydust",has(BlockList.blockOreUnobtainium))
                .build(consumer,new ResourceLocation("extraores:enrichunobtainiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustUranium),new ItemStack(ItemList.itemDustUranium))
                .addCriterion("enrichuraniumdirtydust",has(BlockList.blockOreUranium))
                .build(consumer,new ResourceLocation("extraores:enrichuraniumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustVanadium),new ItemStack(ItemList.itemDustVanadium))
                .addCriterion("enrichvanadiumdirtydust",has(BlockList.blockOreVanadium))
                .build(consumer,new ResourceLocation("extraores:enrichvanadiumdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustVulcanite),new ItemStack(ItemList.itemDustVulcanite))
                .addCriterion("enrichvulcanitedirtydust",has(BlockList.blockOreVulcanite))
                .build(consumer,new ResourceLocation("extraores:enrichvulcanitedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustVyroxeres),new ItemStack(ItemList.itemDustVyroxeres))
                .addCriterion("enrichvyroxeresdirtydust",has(BlockList.blockOreVyroxeres))
                .build(consumer,new ResourceLocation("extraores:enrichvyroxeresdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustYellorite),new ItemStack(ItemList.itemDustYellorite))
                .addCriterion("enrichyelloritedirtydust",has(BlockList.blockOreYellorite))
                .build(consumer,new ResourceLocation("extraores:enrichyelloritedirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustZinc),new ItemStack(ItemList.itemDustZinc))
                .addCriterion("enrichzincdirtydust",has(BlockList.blockOreZinc))
                .build(consumer,new ResourceLocation("extraores:enrichzincdirtydust"));
        ItemStackToItemStackRecipeBuilder.enriching(IngredientCreatorAccess.item().from(ItemTagList.dirtyDustZirconium),new ItemStack(ItemList.itemDustZirconium))
                .addCriterion("enrichzirconiumdirtydust",has(BlockList.blockOreZirconium))
                .build(consumer,new ResourceLocation("extraores:enrichzirconiumdirtydust"));
    }
    @Override
    @MethodsReturnNonnullByDefault
    public String getName()
    {
        return "Extra Ores Recipes";
    }
}

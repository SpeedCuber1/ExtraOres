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
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.resources.ResourceLocation;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Consumer;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;

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
        //Ingot To Block
        ShapedRecipeBuilder.shaped(BlockList.blockAdamantine)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotAdamantine)
                .unlockedBy("adamantineblock", has(BlockList.blockAdamantine))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockAgate)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemAgate)
                .unlockedBy("agateblock", has(BlockList.blockAgate))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockAldourite)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotAldourite)
                .unlockedBy("aldouriteblock", has(BlockList.blockAldourite))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockAluminum)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotAluminum)
                .unlockedBy("aluminumblock", has(BlockList.blockAluminum))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockAmericium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotAmericium)
                .unlockedBy("americiumblock", has(BlockList.blockAmericium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockAmethyst)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemAmethyst)
                .unlockedBy("amethystblock", has(BlockList.blockAmethyst))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockAmetrine)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemAmetrine)
                .unlockedBy("ametrineblock", has(BlockList.blockAmetrine))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockAmordrine)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotAmordrine)
                .unlockedBy("amordrineblock", has(BlockList.blockAmordrine))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockAngmallen)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotAngmallen)
                .unlockedBy("angmallenblock", has(BlockList.blockAngmallen))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockAquamarine)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemAquamarine)
                .unlockedBy("aquamarineblock", has(BlockList.blockAquamarine))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockAstralSilver)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotAstralSilver)
                .unlockedBy("astralsilverblock", has(BlockList.blockAstralSilver))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockAtlarus)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotAtlarus)
                .unlockedBy("atlarusblock", has(BlockList.blockAtlarus))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockBismuth)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotBismuth)
                .unlockedBy("bismuthblock", has(BlockList.blockBismuth))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockBlackSteel)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotBlackSteel)
                .unlockedBy("blacksteelblock", has(BlockList.blockBlackSteel))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockCadmium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotCadmium)
                .unlockedBy("cadmiumblock", has(BlockList.blockCadmium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockCarmot)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotCarmot)
                .unlockedBy("carmotblock", has(BlockList.blockCarmot))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockCelenegil)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotCelenegil)
                .unlockedBy("celenegilblock", has(BlockList.blockCelenegil))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockCeruclase)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotCeruclase)
                .unlockedBy("ceruclaseblock", has(BlockList.blockCeruclase))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockChromium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotChromium)
                .unlockedBy("chromiumblock", has(BlockList.blockChromium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockChrysocolla)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemChrysocolla)
                .unlockedBy("chrysocollablock", has(BlockList.blockChrysocolla))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockCitrine)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemCitrine)
                .unlockedBy("citrineblock", has(BlockList.blockCitrine))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockCobalt)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotCobalt)
                .unlockedBy("cobaltblock", has(BlockList.blockCobalt))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockCopper)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotCopper)
                .unlockedBy("copperblock", has(BlockList.blockCopper))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockDeepIron)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotDeepIron)
                .unlockedBy("deepironblock", has(BlockList.blockDeepIron))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockDesichalkos)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotDesichalkos)
                .unlockedBy("desichalkosblock", has(BlockList.blockDesichalkos))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockEximite)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotEximite)
                .unlockedBy("eximiteblock", has(BlockList.blockEximite))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockGallium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotGallium)
                .unlockedBy("galliumblock", has(BlockList.blockGallium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockGarnet)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemGarnet)
                .unlockedBy("garnetblock", has(BlockList.blockGarnet))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockHaderoth)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotHaderoth)
                .unlockedBy("haderothblock", has(BlockList.blockHaderoth))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockHepatizon)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotHepatizon)
                .unlockedBy("hepatizonblock", has(BlockList.blockHepatizon))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockIgnatius)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotIgnatius)
                .unlockedBy("ignatiusblock", has(BlockList.blockIgnatius))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockIndium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotIndium)
                .unlockedBy("indiumblock", has(BlockList.blockIndium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockInfuscolium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotInfuscolium)
                .unlockedBy("infuscoliumblock", has(BlockList.blockInfuscolium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockInolashite)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotInolashite)
                .unlockedBy("inolashiteblock", has(BlockList.blockInolashite))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockIolite)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemIolite)
                .unlockedBy("ioliteblock", has(BlockList.blockIolite))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockIridium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotIridium)
                .unlockedBy("iridiumblock", has(BlockList.blockIridium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockJade)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemJade)
                .unlockedBy("jadeblock", has(BlockList.blockJade))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockJasper)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemJasper)
                .unlockedBy("jasperblock", has(BlockList.blockJasper))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockKalendrite)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotKalendrite)
                .unlockedBy("kalendriteblock", has(BlockList.blockKalendrite))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockKyanite)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemKyanite)
                .unlockedBy("kyaniteblock", has(BlockList.blockKyanite))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockLead)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotLead)
                .unlockedBy("leadblock", has(BlockList.blockLead))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockLemurite)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotLemurite)
                .unlockedBy("lemuriteblock", has(BlockList.blockLemurite))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockMalachite)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemMalachite)
                .unlockedBy("malachiteblock", has(BlockList.blockMalachite))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockManganese)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotManganese)
                .unlockedBy("manganeseblock", has(BlockList.blockManganese))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockMeutoite)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotMeutoite)
                .unlockedBy("meutoiteblock", has(BlockList.blockMeutoite))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockMidasium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotMidasium)
                .unlockedBy("midasiumblock", has(BlockList.blockMidasium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockMithril)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotMithril)
                .unlockedBy("mithrilblock", has(BlockList.blockMithril))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockMolybdenum)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotMolybdenum)
                .unlockedBy("molybdenumblock", has(BlockList.blockMolybdenum))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockNeodymium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotNeodymium)
                .unlockedBy("neodymiumblock", has(BlockList.blockNeodymium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockNeptunium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotNeptunium)
                .unlockedBy("neptuniumblock", has(BlockList.blockNeptunium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockNickel)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotNickel)
                .unlockedBy("nickelblock", has(BlockList.blockNickel))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockNiobium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotNiobium)
                .unlockedBy("niobiumblock", has(BlockList.blockNiobium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockOnyx)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemOnyx)
                .unlockedBy("onyxblock", has(BlockList.blockOnyx))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockOpal)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemOpal)
                .unlockedBy("opalblock", has(BlockList.blockOpal))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockOrichalcum)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotOrichalcum)
                .unlockedBy("orichalcumblock", has(BlockList.blockOrichalcum))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockOsmium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotOsmium)
                .unlockedBy("osmiumblock", has(BlockList.blockOsmium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockOureclase)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotOureclase)
                .unlockedBy("oureclaseblock", has(BlockList.blockOureclase))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockPalladium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotPalladium)
                .unlockedBy("palladiumblock", has(BlockList.blockPalladium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockPeridot)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemPeridot)
                .unlockedBy("peridotblock", has(BlockList.blockPeridot))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockPhoenixite)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemPhoenixite)
                .unlockedBy("phoenixiteblock", has(BlockList.blockPhoenixite))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockPlatinum)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotPlatinum)
                .unlockedBy("platinumblock", has(BlockList.blockPlatinum))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockPlutonium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotPlutonium)
                .unlockedBy("plutoniumblock", has(BlockList.blockPlutonium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockPolonium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotPolonium)
                .unlockedBy("poloniumblock", has(BlockList.blockPolonium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockPromethium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotPromethium)
                .unlockedBy("promethiumblock", has(BlockList.blockPromethium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockQuartz)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemQuartz)
                .unlockedBy("quartzblock", has(BlockList.blockQuartz))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockRhenium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotRhenium)
                .unlockedBy("rheniumblock", has(BlockList.blockRhenium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockRhodium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotRhodium)
                .unlockedBy("rhodiumblock", has(BlockList.blockRhodium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockRubracium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotRubracium)
                .unlockedBy("rubraciumblock", has(BlockList.blockRubracium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockRuby)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemRuby)
                .unlockedBy("rubyblock", has(BlockList.blockRuby))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockRuthenium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotRuthenium)
                .unlockedBy("rutheniumblock", has(BlockList.blockRuthenium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockSanguinite)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotSanguinite)
                .unlockedBy("sanguiniteblock", has(BlockList.blockSanguinite))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockSapphire)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemSapphire)
                .unlockedBy("sapphireblock", has(BlockList.blockSapphire))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockShadowIron)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotShadowIron)
                .unlockedBy("shadowironblock", has(BlockList.blockShadowIron))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockSilver)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotSilver)
                .unlockedBy("silverblock", has(BlockList.blockSilver))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockSpinel)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemSpinel)
                .unlockedBy("spinelblock", has(BlockList.blockSpinel))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockSugilite)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemSugilite)
                .unlockedBy("sugiliteore", has(BlockList.blockSugilite))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockTantalum)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotTantalum)
                .unlockedBy("tantalumblock", has(BlockList.blockTantalum))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockTanzanite)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemTanzanite)
                .unlockedBy("tanzaniteblock", has(BlockList.blockTanzanite))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockTartarite)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotTartarite)
                .unlockedBy("tartariteblock", has(BlockList.blockTartarite))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockTechnetium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotTechnetium)
                .unlockedBy("technetiumblock", has(BlockList.blockTechnetium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockThallium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotThallium)
                .unlockedBy("thalliumblock", has(BlockList.blockThallium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockTin)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotTin)
                .unlockedBy("tinblock", has(BlockList.blockTin))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockTitanium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotTitanium)
                .unlockedBy("titaniumblock", has(BlockList.blockTitanium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockTopaz)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemTopaz)
                .unlockedBy("topazblock", has(BlockList.blockTopaz))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockTourmaline)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemTourmaline)
                .unlockedBy("tourmalineblock", has(BlockList.blockTourmaline))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockTungsten)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotTungsten)
                .unlockedBy("tungstenblock", has(BlockList.blockTungsten))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockTurquoise)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemGemTurquoise)
                .unlockedBy("turquoiseblock", has(BlockList.blockTurquoise))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockUnobtainium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotUnobtainium)
                .unlockedBy("unobtainiumblock", has(BlockList.blockUnobtainium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockUranium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotUranium)
                .unlockedBy("uraniumblock", has(BlockList.blockUranium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockVanadium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotVanadium)
                .unlockedBy("vanadiumblock", has(BlockList.blockVanadium))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockVulcanite)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotVulcanite)
                .unlockedBy("vulcaniteblock", has(BlockList.blockVulcanite))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockVyroxeres)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotVyroxeres)
                .unlockedBy("vyroxeresblock", has(BlockList.blockVyroxeres))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockYellorite)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotYellorite)
                .unlockedBy("yelloriteblock", has(BlockList.blockYellorite))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockZinc)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotZinc)
                .unlockedBy("zincblock", has(BlockList.blockZinc))
                .save(consumer);
        ShapedRecipeBuilder.shaped(BlockList.blockZirconium)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemList.itemIngotZirconium)
                .unlockedBy("zirconiumblock", has(BlockList.blockZirconium))
                .save(consumer);
        //Block to Ingot
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotAdamantine, 9)
                .requires(Ingredient.of(BlockList.blockAdamantine.asItem()))
                .unlockedBy("adamantineingot", has(ItemList.itemIngotAdamantine))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemAgate, 9)
                .requires(Ingredient.of(BlockList.blockAgate.asItem()))
                .unlockedBy("agate", has(ItemList.itemGemAgate))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotAldourite, 9)
                .requires(Ingredient.of(BlockList.blockAldourite.asItem()))
                .unlockedBy("aldouriteingot", has(ItemList.itemIngotAldourite))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotAluminum, 9)
                .requires(Ingredient.of(BlockList.blockAluminum.asItem()))
                .unlockedBy("aluminumingot", has(ItemList.itemIngotAluminum))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotAmericium, 9)
                .requires(Ingredient.of(BlockList.blockAmericium.asItem()))
                .unlockedBy("americiumingot", has(ItemList.itemIngotAmericium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemAmethyst, 9)
                .requires(Ingredient.of(BlockList.blockAmethyst.asItem()))
                .unlockedBy("amethyst", has(ItemList.itemGemAmethyst))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemAmetrine, 9)
                .requires(Ingredient.of(BlockList.blockAmetrine))
                .unlockedBy("ametrine", has(ItemList.itemGemAmetrine))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotAmordrine, 9)
                .requires(Ingredient.of(BlockList.blockAmordrine.asItem()))
                .unlockedBy("amordrineingot", has(ItemList.itemIngotAmordrine))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotAngmallen, 9)
                .requires(Ingredient.of(BlockList.blockAngmallen.asItem()))
                .unlockedBy("angmalleningot", has(ItemList.itemIngotAngmallen))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemAquamarine, 9)
                .requires(Ingredient.of(BlockList.blockAquamarine.asItem()))
                .unlockedBy("aquamarine", has(ItemList.itemGemAquamarine))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotAstralSilver, 9)
                .requires(Ingredient.of(BlockList.blockAstralSilver.asItem()))
                .unlockedBy("astralsilveringot", has(ItemList.itemIngotAstralSilver))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotAtlarus, 9)
                .requires(Ingredient.of(BlockList.blockAtlarus.asItem()))
                .unlockedBy("atlarusingot", has(ItemList.itemIngotAtlarus))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotBismuth, 9)
                .requires(Ingredient.of(BlockList.blockBismuth.asItem()))
                .unlockedBy("bismuthingot", has(ItemList.itemIngotBismuth))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotBlackSteel, 9)
                .requires(Ingredient.of(BlockList.blockBlackSteel.asItem()))
                .unlockedBy("blacksteelingot", has(ItemList.itemIngotBlackSteel))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotCadmium, 9)
                .requires(Ingredient.of(BlockList.blockCadmium.asItem()))
                .unlockedBy("cadmiumingot", has(ItemList.itemIngotCadmium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotCarmot, 9)
                .requires(Ingredient.of(BlockList.blockCarmot.asItem()))
                .unlockedBy("carmotingot", has(ItemList.itemIngotCarmot))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotCelenegil, 9)
                .requires(Ingredient.of(BlockList.blockCelenegil.asItem()))
                .unlockedBy("celenegilingot", has(ItemList.itemIngotCelenegil))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotCeruclase, 9)
                .requires(Ingredient.of(BlockList.blockCeruclase.asItem()))
                .unlockedBy("ceruclaseingot", has(ItemList.itemIngotCeruclase))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotChromium, 9)
                .requires(Ingredient.of(BlockList.blockChromium.asItem()))
                .unlockedBy("chromiumingot", has(ItemList.itemIngotChromium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemChrysocolla, 9)
                .requires(Ingredient.of(BlockList.blockChrysocolla.asItem()))
                .unlockedBy("chrysocolla", has(ItemList.itemGemChrysocolla))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemCitrine, 9)
                .requires(Ingredient.of(BlockList.blockCitrine.asItem()))
                .unlockedBy("citrine", has(ItemList.itemGemCitrine))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotCobalt, 9)
                .requires(Ingredient.of(BlockList.blockCobalt.asItem()))
                .unlockedBy("cobaltingot", has(ItemList.itemIngotCobalt))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotCopper, 9)
                .requires(Ingredient.of(BlockList.blockCopper.asItem()))
                .unlockedBy("copperingot", has(ItemList.itemIngotCopper))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotDeepIron, 9)
                .requires(Ingredient.of(BlockList.blockDeepIron.asItem()))
                .unlockedBy("deepironingot", has(ItemList.itemIngotDeepIron))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotDesichalkos, 9)
                .requires(Ingredient.of(BlockList.blockDesichalkos.asItem()))
                .unlockedBy("desichalkosingot", has(ItemList.itemIngotDesichalkos))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotEximite, 9)
                .requires(Ingredient.of(BlockList.blockEximite.asItem()))
                .unlockedBy("eximiteingot", has(ItemList.itemIngotEximite))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotGallium, 9)
                .requires(Ingredient.of(BlockList.blockGallium.asItem()))
                .unlockedBy("galliumingot", has(ItemList.itemIngotGallium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemGarnet, 9)
                .requires(Ingredient.of(BlockList.blockGarnet.asItem()))
                .unlockedBy("garnet", has(ItemList.itemGemGarnet))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotHaderoth, 9)
                .requires(Ingredient.of(BlockList.blockHaderoth.asItem()))
                .unlockedBy("haderothingot", has(ItemList.itemIngotHaderoth))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotHepatizon, 9)
                .requires(Ingredient.of(BlockList.blockHepatizon.asItem()))
                .unlockedBy("hepatizoningot", has(ItemList.itemIngotHepatizon))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotIgnatius, 9)
                .requires(Ingredient.of(BlockList.blockIgnatius.asItem()))
                .unlockedBy("ignatiusingot", has(ItemList.itemIngotIgnatius))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotIndium, 9)
                .requires(Ingredient.of(BlockList.blockIndium.asItem()))
                .unlockedBy("indiumingot", has(ItemList.itemIngotIndium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotInfuscolium, 9)
                .requires(Ingredient.of(BlockList.blockInfuscolium.asItem()))
                .unlockedBy("infuscoliumingot", has(ItemList.itemIngotInfuscolium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotInolashite, 9)
                .requires(Ingredient.of(BlockList.blockInolashite.asItem()))
                .unlockedBy("inolashiteingot", has(ItemList.itemIngotInolashite))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemIolite, 9)
                .requires(Ingredient.of(BlockList.blockIolite.asItem()))
                .unlockedBy("iolite", has(ItemList.itemGemIolite))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotIridium, 9)
                .requires(Ingredient.of(BlockList.blockIridium.asItem()))
                .unlockedBy("iridiumingot", has(ItemList.itemIngotIridium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemJade, 9)
                .requires(Ingredient.of(BlockList.blockJade.asItem()))
                .unlockedBy("jade", has(ItemList.itemGemJade))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemJasper, 9)
                .requires(Ingredient.of(BlockList.blockJasper.asItem()))
                .unlockedBy("jasper", has(ItemList.itemGemJasper))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotKalendrite, 9)
                .requires(Ingredient.of(BlockList.blockKalendrite.asItem()))
                .unlockedBy("kalendriteingot", has(ItemList.itemIngotKalendrite))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemKyanite, 9)
                .requires(Ingredient.of(BlockList.blockKyanite.asItem()))
                .unlockedBy("kyanite", has(ItemList.itemGemKyanite))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotLead, 9)
                .requires(Ingredient.of(BlockList.blockLead.asItem()))
                .unlockedBy("leadingot", has(ItemList.itemIngotLead))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotLemurite, 9)
                .requires(Ingredient.of(BlockList.blockLemurite.asItem()))
                .unlockedBy("lemuriteingot", has(ItemList.itemIngotLemurite))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemMalachite, 9)
                .requires(Ingredient.of(BlockList.blockMalachite))
                .unlockedBy("malachite", has(ItemList.itemGemMalachite))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotManganese, 9)
                .requires(Ingredient.of(BlockList.blockManganese.asItem()))
                .unlockedBy("manganeseingot", has(ItemList.itemIngotManganese))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotMeutoite, 9)
                .requires(Ingredient.of(BlockList.blockMeutoite.asItem()))
                .unlockedBy("meutoiteingot", has(ItemList.itemIngotMeutoite))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotMidasium, 9)
                .requires(Ingredient.of(BlockList.blockMidasium.asItem()))
                .unlockedBy("midasiumingot", has(ItemList.itemIngotMidasium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotMithril, 9)
                .requires(Ingredient.of(BlockList.blockMithril.asItem()))
                .unlockedBy("mithrilingot", has(ItemList.itemIngotMithril))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotMolybdenum, 9)
                .requires(Ingredient.of(BlockList.blockMolybdenum.asItem()))
                .unlockedBy("molybdenumingot", has(ItemList.itemIngotMolybdenum))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotNeodymium, 9)
                .requires(Ingredient.of(BlockList.blockNeodymium.asItem()))
                .unlockedBy("neodymiumingot", has(ItemList.itemIngotNeodymium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotNeptunium, 9)
                .unlockedBy("neptuniumingot", has(ItemList.itemIngotNeptunium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotNickel, 9)
                .requires(Ingredient.of(BlockList.blockNickel.asItem()))
                .unlockedBy("nickelingot", has(ItemList.itemIngotNickel))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotNiobium, 9)
                .requires(Ingredient.of(BlockList.blockNiobium.asItem()))
                .unlockedBy("niobiumingot", has(ItemList.itemIngotNiobium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemOnyx, 9)
                .requires(Ingredient.of(BlockList.blockOnyx.asItem()))
                .unlockedBy("onyx", has(ItemList.itemGemOnyx))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemOpal, 9)
                .requires(Ingredient.of(BlockList.blockOpal.asItem()))
                .unlockedBy("opal", has(ItemList.itemGemOpal))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotOrichalcum, 9)
                .requires(Ingredient.of(BlockList.blockOrichalcum.asItem()))
                .unlockedBy("orichalcumingot", has(ItemList.itemIngotOrichalcum))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotOsmium, 9)
                .requires(Ingredient.of(BlockList.blockOsmium.asItem()))
                .unlockedBy("osmiumingot", has(ItemList.itemIngotOsmium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotOureclase, 9)
                .requires(Ingredient.of(BlockList.blockOureclase.asItem()))
                .unlockedBy("oureclaseingot", has(ItemList.itemIngotOureclase))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotPalladium, 9)
                .requires(Ingredient.of(BlockList.blockPalladium.asItem()))
                .unlockedBy("palladiumingot", has(ItemList.itemIngotPalladium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemPeridot, 9)
                .requires(Ingredient.of(BlockList.blockPeridot.asItem()))
                .unlockedBy("peridot", has(ItemList.itemGemPeridot))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemPhoenixite, 9)
                .requires(Ingredient.of(BlockList.blockPhoenixite.asItem()))
                .unlockedBy("phoenixite", has(ItemList.itemGemPhoenixite))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotPlatinum, 9)
                .requires(Ingredient.of(BlockList.blockPlatinum.asItem()))
                .unlockedBy("platinumingot", has(ItemList.itemIngotPlatinum))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotPlutonium, 9)
                .requires(Ingredient.of(BlockList.blockPlutonium.asItem()))
                .unlockedBy("plutoniumingot", has(ItemList.itemIngotPlutonium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotPolonium, 9)
                .requires(Ingredient.of(BlockList.blockPolonium.asItem()))
                .unlockedBy("poloniumingot", has(ItemList.itemIngotPolonium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotPromethium, 9)
                .requires(Ingredient.of(BlockList.blockPromethium.asItem()))
                .unlockedBy("promethiumingot", has(ItemList.itemIngotPromethium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemQuartz, 9)
                .requires(Ingredient.of(BlockList.blockQuartz.asItem()))
                .unlockedBy("quartz", has(ItemList.itemGemQuartz))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotRhenium, 9)
                .requires(Ingredient.of(BlockList.blockRhenium.asItem()))
                .unlockedBy("rheniumingot", has(ItemList.itemIngotRhenium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotRhodium, 9)
                .requires(Ingredient.of(BlockList.blockRhodium.asItem()))
                .unlockedBy("rhodiumingot", has(ItemList.itemIngotRhodium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotRubracium, 9)
                .requires(Ingredient.of(BlockList.blockRubracium.asItem()))
                .unlockedBy("rubraciumingot", has(ItemList.itemIngotRubracium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemRuby, 9)
                .requires(Ingredient.of(BlockList.blockRuby.asItem()))
                .unlockedBy("ruby", has(ItemList.itemGemRuby))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotRuthenium, 9)
                .requires(Ingredient.of(BlockList.blockRuthenium.asItem()))
                .unlockedBy("rutheniumingot", has(ItemList.itemIngotRuthenium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotSanguinite, 9)
                .requires(Ingredient.of(BlockList.blockSanguinite.asItem()))
                .unlockedBy("sanguiniteingot", has(ItemList.itemIngotSanguinite))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemSapphire, 9)
                .requires(Ingredient.of(BlockList.blockSapphire.asItem()))
                .unlockedBy("sapphire", has(ItemList.itemGemSapphire))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotShadowIron, 9)
                .requires(Ingredient.of(BlockList.blockShadowIron.asItem()))
                .unlockedBy("shadowironingot", has(ItemList.itemIngotShadowIron))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotSilver, 9)
                .requires(Ingredient.of(BlockList.blockSilver.asItem()))
                .unlockedBy("silveringot", has(ItemList.itemIngotSilver))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemSpinel, 9)
                .requires(Ingredient.of(BlockList.blockSpinel.asItem()))
                .unlockedBy("spinel", has(ItemList.itemGemSpinel))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemSugilite, 9)
                .requires(Ingredient.of(BlockList.blockSugilite.asItem()))
                .unlockedBy("sugilite", has(ItemList.itemGemSugilite))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotTantalum, 9)
                .requires(Ingredient.of(BlockList.blockTantalum.asItem()))
                .unlockedBy("tantalumingot", has(ItemList.itemIngotTantalum))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemTanzanite, 9)
                .requires(Ingredient.of(BlockList.blockTanzanite.asItem()))
                .unlockedBy("tanzanite", has(ItemList.itemGemTanzanite))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotTartarite, 9)
                .requires(Ingredient.of(BlockList.blockTartarite.asItem()))
                .unlockedBy("tartariteingot", has(ItemList.itemIngotTartarite))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotTechnetium, 9)
                .requires(Ingredient.of(BlockList.blockTechnetium.asItem()))
                .unlockedBy("technetiumingot", has(ItemList.itemIngotTechnetium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotThallium, 9)
                .requires(Ingredient.of(BlockList.blockThallium.asItem()))
                .unlockedBy("thalliumingot", has(ItemList.itemIngotThallium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotTin, 9)
                .requires(Ingredient.of(BlockList.blockTin.asItem()))
                .unlockedBy("tiningot", has(ItemList.itemIngotTin))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotTitanium, 9)
                .requires(Ingredient.of(BlockList.blockTitanium.asItem()))
                .unlockedBy("titaniumingot", has(ItemList.itemIngotTitanium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemTopaz, 9)
                .requires(Ingredient.of(BlockList.blockTopaz.asItem()))
                .unlockedBy("topaz", has(ItemList.itemGemTopaz))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemTourmaline, 9)
                .requires(Ingredient.of(BlockList.blockTourmaline.asItem()))
                .unlockedBy("tourmaline", has(ItemList.itemGemTourmaline))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotTungsten, 9)
                .requires(Ingredient.of(BlockList.blockTungsten.asItem()))
                .unlockedBy("tungsteningot", has(ItemList.itemIngotTungsten))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemGemTurquoise, 9)
                .requires(Ingredient.of(BlockList.blockTurquoise.asItem()))
                .unlockedBy("turquoise", has(ItemList.itemGemTurquoise))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotUnobtainium, 9)
                .requires(Ingredient.of(BlockList.blockUnobtainium.asItem()))
                .unlockedBy("unobtainiumingot", has(ItemList.itemIngotUnobtainium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotUranium, 9)
                .requires(Ingredient.of(BlockList.blockUranium.asItem()))
                .unlockedBy("uraniumingot", has(ItemList.itemIngotUranium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotVanadium, 9)
                .requires(Ingredient.of(BlockList.blockVanadium.asItem()))
                .unlockedBy("vanadiumingot", has(ItemList.itemIngotVanadium))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotVulcanite, 9)
                .requires(Ingredient.of(BlockList.blockVulcanite.asItem()))
                .unlockedBy("vulcaniteingot", has(ItemList.itemIngotVulcanite))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotVyroxeres, 9)
                .requires(Ingredient.of(BlockList.blockVyroxeres.asItem()))
                .unlockedBy("vyroxeresingot", has(ItemList.itemIngotVyroxeres))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotYellorite, 9)
                .requires(Ingredient.of(BlockList.blockYellorite.asItem()))
                .unlockedBy("yelloriteingot", has(ItemList.itemIngotYellorite))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotZinc, 9)
                .requires(Ingredient.of(BlockList.blockZinc.asItem()))
                .unlockedBy("zincingot", has(ItemList.itemIngotZinc))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemList.itemIngotZirconium, 9)
                .requires(Ingredient.of(BlockList.blockZirconium.asItem()))
                .unlockedBy("zirconiumingot", has(ItemList.itemIngotZirconium))
                .save(consumer);
        //Smelting Ore
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreAdamantine), ItemList.itemIngotAdamantine, 0.75F, 40)
                .unlockedBy("smeltadamantineore", has(ItemList.itemIngotAdamantine))
                .save(consumer, new ResourceLocation("extraores:smeltadamantineore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreAldourite), ItemList.itemIngotAldourite, 0.75F, 40)
                .unlockedBy("smeltaldouriteore", has(ItemList.itemIngotAldourite))
                .save(consumer, new ResourceLocation("extraores:smeltaldouriteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreAluminum), ItemList.itemIngotAluminum, 0.75F, 40)
                .unlockedBy("smeltaluminumore", has(ItemList.itemIngotAluminum))
                .save(consumer, new ResourceLocation("extraores:smeltaluminumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreAmericium), ItemList.itemIngotAmericium, 0.75F, 40)
                .unlockedBy("smeltamericiumore", has(ItemList.itemIngotAmericium))
                .save(consumer, new ResourceLocation("extraores:smeltamericiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreAmordrine), ItemList.itemIngotAmordrine, 0.75F, 40)
                .unlockedBy("smeltamordrineore", has(ItemList.itemIngotAmordrine))
                .save(consumer, new ResourceLocation("extraores:smeltamordrineore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreAngmallen), ItemList.itemIngotAngmallen, 0.75F, 40)
                .unlockedBy("smeltangmallenore", has(ItemList.itemIngotAngmallen))
                .save(consumer, new ResourceLocation("extraores:smeltangmallenore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreAstralSilver), ItemList.itemIngotAstralSilver, 0.75F, 40)
                .unlockedBy("smeltastralsilverore", has(ItemList.itemIngotAstralSilver))
                .save(consumer, new ResourceLocation("extraores:smeltastralsilverore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreAtlarus), ItemList.itemIngotAtlarus, 0.75F, 40)
                .unlockedBy("smeltatlarusore", has(ItemList.itemIngotAtlarus))
                .save(consumer, new ResourceLocation("extraores:smeltatlarusore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreBismuth), ItemList.itemIngotBismuth, 0.75F, 40)
                .unlockedBy("smeltbismuthore", has(ItemList.itemIngotBismuth))
                .save(consumer, new ResourceLocation("extraores:smeltbismuthore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreBlackSteel), ItemList.itemIngotBlackSteel, 0.75F, 40)
                .unlockedBy("smeltblacksteelore", has(ItemList.itemIngotBlackSteel))
                .save(consumer, new ResourceLocation("extraores:smeltblacksteelore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreCadmium), ItemList.itemIngotCadmium, 0.75F, 40)
                .unlockedBy("smeltcadmiumore", has(ItemList.itemIngotCadmium))
                .save(consumer, new ResourceLocation("extraores:smeltcadmiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreCarmot), ItemList.itemIngotCarmot, 0.75F, 40)
                .unlockedBy("smeltcarmotore", has(ItemList.itemIngotCarmot))
                .save(consumer, new ResourceLocation("extraores:smeltcarmotore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreCelenegil), ItemList.itemIngotCelenegil, 0.75F, 40)
                .unlockedBy("smeltcelenegilore", has(ItemList.itemIngotCelenegil))
                .save(consumer, new ResourceLocation("extraores:smeltcelenegilore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreCeruclase), ItemList.itemIngotCeruclase, 0.75F, 40)
                .unlockedBy("smeltceruclaseore", has(ItemList.itemIngotCeruclase))
                .save(consumer, new ResourceLocation("extraores:smeltceruclaseore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreChromium), ItemList.itemIngotChromium, 0.75F, 40)
                .unlockedBy("smeltchromiumore", has(ItemList.itemIngotChromium))
                .save(consumer, new ResourceLocation("extraores:smeltchromiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreCobalt), ItemList.itemIngotCobalt, 0.75F, 40)
                .unlockedBy("smeltcobaltore", has(ItemList.itemIngotCobalt))
                .save(consumer, new ResourceLocation("extraores:smeltcobaltore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreCopper), ItemList.itemIngotCopper, 0.75F, 40)
                .unlockedBy("smeltcopperore", has(ItemList.itemIngotCopper))
                .save(consumer, new ResourceLocation("extraores:smeltcopperore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreDeepIron), ItemList.itemIngotDeepIron, 0.75F, 40)
                .unlockedBy("smeltdeepironore", has(ItemList.itemIngotDeepIron))
                .save(consumer, new ResourceLocation("extraores:smeltdeepironore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreDesichalkos), ItemList.itemIngotDesichalkos, 0.75F, 40)
                .unlockedBy("smeltdesichalkosore", has(ItemList.itemIngotDesichalkos))
                .save(consumer, new ResourceLocation("extraores:smeltdesichalkosore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreEximite), ItemList.itemIngotEximite, 0.75F, 40)
                .unlockedBy("smelteximiteore", has(ItemList.itemIngotEximite))
                .save(consumer, new ResourceLocation("extraores:smelteximiteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreGallium), ItemList.itemIngotGallium, 0.75F, 40)
                .unlockedBy("smeltgalliumore", has(ItemList.itemIngotGallium))
                .save(consumer, new ResourceLocation("extraores:smeltgalliumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreHaderoth), ItemList.itemIngotHaderoth, 0.75F, 40)
                .unlockedBy("smelthaderothore", has(ItemList.itemIngotHaderoth))
                .save(consumer, new ResourceLocation("extraores:smelthaderothore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreHepatizon), ItemList.itemIngotHepatizon, 0.75F, 40)
                .unlockedBy("smelthepatizonore", has(ItemList.itemIngotHepatizon))
                .save(consumer, new ResourceLocation("extraores:smelthepatizonore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreIgnatius), ItemList.itemIngotIgnatius, 0.75F, 40)
                .unlockedBy("smeltignatiusore", has(ItemList.itemIngotIgnatius))
                .save(consumer, new ResourceLocation("extraores:smeltignatiusore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreIndium), ItemList.itemIngotIndium, 0.75F, 40)
                .unlockedBy("smeltindiumore", has(ItemList.itemIngotIndium))
                .save(consumer, new ResourceLocation("extraores:smeltindiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreInfuscolium), ItemList.itemIngotInfuscolium, 0.75F, 40)
                .unlockedBy("smeltinfuscoliumore", has(ItemList.itemIngotInfuscolium))
                .save(consumer, new ResourceLocation("extraores:smeltinfuscoliumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreInolashite), ItemList.itemIngotInolashite, 0.75F, 40)
                .unlockedBy("smeltinolashiteore", has(ItemList.itemIngotInolashite))
                .save(consumer, new ResourceLocation("extraores:smeltinolashiteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreIridium), ItemList.itemIngotIridium, 0.75F, 40)
                .unlockedBy("smeltiridiumore", has(ItemList.itemIngotIridium))
                .save(consumer, new ResourceLocation("extraores:smeltiridiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreKalendrite), ItemList.itemIngotKalendrite, 0.75F, 40)
                .unlockedBy("smeltkalendriteore", has(ItemList.itemIngotKalendrite))
                .save(consumer, new ResourceLocation("extraores:smeltkalendriteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreLead), ItemList.itemIngotLead, 0.75F, 40)
                .unlockedBy("smeltleadore", has(ItemList.itemIngotLead))
                .save(consumer, new ResourceLocation("extraores:smeltleadore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreLemurite), ItemList.itemIngotLemurite, 0.75F, 40)
                .unlockedBy("smeltlemuriteore", has(ItemList.itemIngotLemurite))
                .save(consumer, new ResourceLocation("extraores:smeltlemuriteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreManganese), ItemList.itemIngotManganese, 0.75F, 40)
                .unlockedBy("smeltmanganeseore", has(ItemList.itemIngotManganese))
                .save(consumer, new ResourceLocation("extraores:smeltmanganeseore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreMeutoite), ItemList.itemIngotMeutoite, 0.75F, 40)
                .unlockedBy("smeltmeutoiteore", has(ItemList.itemIngotMeutoite))
                .save(consumer, new ResourceLocation("extraores:smeltmeutoiteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreMidasium), ItemList.itemIngotMidasium, 0.75F, 40)
                .unlockedBy("smeltmidasiumore", has(ItemList.itemIngotMidasium))
                .save(consumer, new ResourceLocation("extraores:smeltmidasiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreMithril), ItemList.itemIngotMithril, 0.75F, 40)
                .unlockedBy("smeltmithrilore", has(ItemList.itemIngotMithril))
                .save(consumer, new ResourceLocation("extraores:smeltmithrilore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreMolybdenum), ItemList.itemIngotMolybdenum, 0.75F, 40)
                .unlockedBy("smeltmolybdenumore", has(ItemList.itemIngotMolybdenum))
                .save(consumer, new ResourceLocation("extraores:smeltmolybdenumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreNeodymium), ItemList.itemIngotNeodymium, 0.75F, 40)
                .unlockedBy("smeltneodymiumore", has(ItemList.itemIngotNeodymium))
                .save(consumer, new ResourceLocation("extraores:smeltneodymiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreNeptunium), ItemList.itemIngotNeptunium, 0.75F, 40)
                .unlockedBy("smeltneptuniumore", has(ItemList.itemIngotNeptunium))
                .save(consumer, new ResourceLocation("extraores:smeltneptuniumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreNickel), ItemList.itemIngotNickel, 0.75F, 40)
                .unlockedBy("smeltnickelore", has(ItemList.itemIngotNickel))
                .save(consumer, new ResourceLocation("extraores:smeltnickelore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreNiobium), ItemList.itemIngotNiobium, 0.75F, 40)
                .unlockedBy("smeltniobiumore", has(ItemList.itemIngotNiobium))
                .save(consumer, new ResourceLocation("extraores:smeltniobiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreOrichalcum), ItemList.itemIngotOrichalcum, 0.75F, 40)
                .unlockedBy("smeltorichalcumore", has(ItemList.itemIngotOrichalcum))
                .save(consumer, new ResourceLocation("extraores:smeltorichalcumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreOsmium), ItemList.itemIngotOsmium, 0.75F, 40)
                .unlockedBy("smeltosmiumore", has(ItemList.itemIngotOsmium))
                .save(consumer, new ResourceLocation("extraores:smeltosmiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreOureclase), ItemList.itemIngotOureclase, 0.75F, 40)
                .unlockedBy("smeltoureclaseore", has(ItemList.itemIngotOureclase))
                .save(consumer, new ResourceLocation("extraores:smeltoureclaseore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.orePalladium), ItemList.itemIngotPalladium, 0.75F, 40)
                .unlockedBy("smeltpalladiumore", has(ItemList.itemIngotPalladium))
                .save(consumer, new ResourceLocation("extraores:smeltpalladiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.orePlatinum), ItemList.itemIngotPlatinum, 0.75F, 40)
                .unlockedBy("smeltplatinumore", has(ItemList.itemIngotPlatinum))
                .save(consumer, new ResourceLocation("extraores:smeltplatinumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.orePlutonium), ItemList.itemIngotPlutonium, 0.75F, 40)
                .unlockedBy("smeltplutoniumore", has(ItemList.itemIngotPlutonium))
                .save(consumer, new ResourceLocation("extraores:smeltplutoniumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.orePolonium), ItemList.itemIngotPolonium, 0.75F, 40)
                .unlockedBy("smeltpoloniumore", has(ItemList.itemIngotPolonium))
                .save(consumer, new ResourceLocation("extraores:smeltpoloniumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.orePromethium), ItemList.itemIngotPromethium, 0.75F, 40)
                .unlockedBy("smeltpromethiumore", has(ItemList.itemIngotPromethium))
                .save(consumer, new ResourceLocation("extraores:smeltpromethiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreRhenium), ItemList.itemIngotRhenium, 0.75F, 40)
                .unlockedBy("smeltrheniumore", has(ItemList.itemIngotRhenium))
                .save(consumer, new ResourceLocation("extraores:smeltrheniumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreRhodium), ItemList.itemIngotRhodium, 0.75F, 40)
                .unlockedBy("smeltrhodiumore", has(ItemList.itemIngotRhodium))
                .save(consumer, new ResourceLocation("extraores:smeltrhodiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreRubracium), ItemList.itemIngotRubracium, 0.75F, 40)
                .unlockedBy("smeltrubraciumore", has(ItemList.itemIngotRubracium))
                .save(consumer, new ResourceLocation("extraores:smeltrubraciumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreRuthenium), ItemList.itemIngotRuthenium, 0.75F, 40)
                .unlockedBy("smeltrutheniumore", has(ItemList.itemIngotRuthenium))
                .save(consumer, new ResourceLocation("extraores:smeltrutheniumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreSanguinite), ItemList.itemIngotSanguinite, 0.75F, 40)
                .unlockedBy("smeltsanguiniteore", has(ItemList.itemIngotSanguinite))
                .save(consumer, new ResourceLocation("extraores:smeltsanguiniteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreShadowIron), ItemList.itemIngotShadowIron, 0.75F, 40)
                .unlockedBy("smeltshadowironore", has(ItemList.itemIngotShadowIron))
                .save(consumer, new ResourceLocation("extraores:smeltshadowironore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreSilver), ItemList.itemIngotSilver, 0.75F, 40)
                .unlockedBy("smeltsilverore", has(ItemList.itemIngotSilver))
                .save(consumer, new ResourceLocation("extraores:smeltsilverore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreTantalum), ItemList.itemIngotTantalum, 0.75F, 40)
                .unlockedBy("smelttantalumore", has(ItemList.itemIngotTantalum))
                .save(consumer, new ResourceLocation("extraores:smelttantalumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreTartarite), ItemList.itemIngotTartarite, 0.75F, 40)
                .unlockedBy("smelttartariteore", has(ItemList.itemIngotTartarite))
                .save(consumer, new ResourceLocation("extraores:smelttartariteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreTechnetium), ItemList.itemIngotTechnetium, 0.75F, 40)
                .unlockedBy("smelttechnetiumore", has(ItemList.itemIngotTechnetium))
                .save(consumer, new ResourceLocation("extraores:smelttechnetiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreThallium), ItemList.itemIngotThallium, 0.75F, 40)
                .unlockedBy("smeltthalliumore", has(ItemList.itemIngotThallium))
                .save(consumer, new ResourceLocation("extraores:smeltthalliumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreTin), ItemList.itemIngotTin, 0.75F, 40)
                .unlockedBy("smelttinore", has(ItemList.itemIngotTin))
                .save(consumer, new ResourceLocation("extraores:smelttinore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreTitanium), ItemList.itemIngotTitanium, 0.75F, 40)
                .unlockedBy("smelttitaniumore", has(ItemList.itemIngotTitanium))
                .save(consumer, new ResourceLocation("extraores:smelttitaniumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreTungsten), ItemList.itemIngotTungsten, 0.75F, 40)
                .unlockedBy("smelttungstenore", has(ItemList.itemIngotTungsten))
                .save(consumer, new ResourceLocation("extraores:smelttungstenore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreUnobtainium), ItemList.itemIngotUnobtainium, 0.75F, 40)
                .unlockedBy("smeltunobtainiumore", has(ItemList.itemIngotUnobtainium))
                .save(consumer, new ResourceLocation("extraores:smeltunobtainiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreUranium), ItemList.itemIngotUranium, 0.75f, 40)
                .unlockedBy("smelturaniumore", has(ItemList.itemIngotUranium))
                .save(consumer, new ResourceLocation("extraores:smelturaniumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreVanadium), ItemList.itemIngotVanadium, 0.75F, 40)
                .unlockedBy("smeltvanadiumore", has(ItemList.itemIngotVanadium))
                .save(consumer, new ResourceLocation("extraores:smeltvanadiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreVulcanite), ItemList.itemIngotVulcanite, 0.75F, 40)
                .unlockedBy("smeltvulcaniteore", has(ItemList.itemIngotVulcanite))
                .save(consumer, new ResourceLocation("extraores:smeltvulcaniteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreVyroxeres), ItemList.itemIngotVyroxeres, 0.75F, 40)
                .unlockedBy("smeltvyroxeresore", has(ItemList.itemIngotVyroxeres))
                .save(consumer, new ResourceLocation("extraores:smeltvyroxeresore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreYellorite), ItemList.itemIngotYellorite, 0.75F, 40)
                .unlockedBy("smeltyelloriteore", has(ItemList.itemIngotYellorite))
                .save(consumer, new ResourceLocation("extraores:smeltyelloriteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreZinc), ItemList.itemIngotZinc, 0.75F, 40)
                .unlockedBy("smeltzincore", has(ItemList.itemIngotZinc))
                .save(consumer, new ResourceLocation("extraores:smeltzincore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.oreZirconium), ItemList.itemIngotZirconium, 0.75F, 40)
                .unlockedBy("smeltzirconiumore", has(ItemList.itemIngotZirconium))
                .save(consumer, new ResourceLocation("extraores:smeltzirconiumore"));
        //Smelting Dust
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustAdamantine), ItemList.itemIngotAdamantine, 0.75F, 20)
                .unlockedBy("smeltadamantinedust", has(ItemList.itemIngotAdamantine))
                .save(consumer, new ResourceLocation("extraores:smeltadamantinedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustAldourite), ItemList.itemIngotAldourite, 0.75F, 20)
                .unlockedBy("smeltaldouritedust", has(ItemList.itemIngotAldourite))
                .save(consumer, new ResourceLocation("extraores:smeltaldouritedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustAluminum), ItemList.itemIngotAluminum, 0.75F, 20)
                .unlockedBy("smeltaluminumdust", has(ItemList.itemIngotAluminum))
                .save(consumer, new ResourceLocation("extraores:smeltaluminumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustAmericium), ItemList.itemIngotAmericium, 0.75F, 20)
                .unlockedBy("smeltamericiumdust", has(ItemList.itemIngotAmericium))
                .save(consumer, new ResourceLocation("extraores:smeltamericiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustAmordrine), ItemList.itemIngotAmordrine, 0.75F, 20)
                .unlockedBy("smeltamordrinedust", has(ItemList.itemIngotAmordrine))
                .save(consumer, new ResourceLocation("extraores:smeltamordrinedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustAngmallen), ItemList.itemIngotAngmallen, 0.75F, 20)
                .unlockedBy("smeltangmallendust", has(ItemList.itemIngotAngmallen))
                .save(consumer, new ResourceLocation("extraores:smeltangmallendust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustAstralSilver), ItemList.itemIngotAstralSilver, 0.75F, 20)
                .unlockedBy("smeltastralsilverdust", has(ItemList.itemIngotAstralSilver))
                .save(consumer, new ResourceLocation("extraores:smeltastralsilverdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustAtlarus), ItemList.itemIngotAtlarus, 0.75F, 20)
                .unlockedBy("smeltatlarusdust", has(ItemList.itemIngotAtlarus))
                .save(consumer, new ResourceLocation("extraores:smeltatlarusdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustBismuth), ItemList.itemIngotBismuth, 0.75F, 20)
                .unlockedBy("smeltbismuthdust", has(ItemList.itemIngotBismuth))
                .save(consumer, new ResourceLocation("extraores:smeltbismuthdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustBlackSteel), ItemList.itemIngotBlackSteel, 0.75F, 20)
                .unlockedBy("smeltblacksteeldust", has(ItemList.itemIngotBlackSteel))
                .save(consumer, new ResourceLocation("extraores:smeltblacksteeldust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustCadmium), ItemList.itemIngotCadmium, 0.75F, 20)
                .unlockedBy("smeltcadmiumdust", has(ItemList.itemIngotCadmium))
                .save(consumer, new ResourceLocation("extraores:smeltcadmiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustCarmot), ItemList.itemIngotCarmot, 0.75F, 20)
                .unlockedBy("smeltcarmotdust", has(ItemList.itemIngotCarmot))
                .save(consumer, new ResourceLocation("extraores:smeltcarmotdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustCelenegil), ItemList.itemIngotCelenegil, 0.75F, 20)
                .unlockedBy("smeltcelenegildust", has(ItemList.itemIngotCelenegil))
                .save(consumer, new ResourceLocation("extraores:smeltcelenegildust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustCeruclase), ItemList.itemIngotCeruclase, 0.75F, 20)
                .unlockedBy("smeltceruclasedust", has(ItemList.itemIngotCeruclase))
                .save(consumer, new ResourceLocation("extraores:smeltceruclasedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustChromium), ItemList.itemIngotChromium, 0.75F, 20)
                .unlockedBy("smeltchromiumdust", has(ItemList.itemIngotChromium))
                .save(consumer, new ResourceLocation("extraores:smeltchromiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustCobalt), ItemList.itemIngotCobalt, 0.75F, 20)
                .unlockedBy("smeltcobaltdust", has(ItemList.itemIngotCobalt))
                .save(consumer, new ResourceLocation("extraores:smeltcobaltdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustCopper), ItemList.itemIngotCopper, 0.75F, 20)
                .unlockedBy("smeltcopperdust", has(ItemList.itemIngotCopper))
                .save(consumer, new ResourceLocation("extraores:smeltcopperdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustDeepIron), ItemList.itemIngotDeepIron, 0.75F, 20)
                .unlockedBy("smeltdeepirondust", has(ItemList.itemIngotDeepIron))
                .save(consumer, new ResourceLocation("extraores:smeltdeepirondust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustDesichalkos), ItemList.itemIngotDesichalkos, 0.75F, 20)
                .unlockedBy("smeltdesichalkosdust", has(ItemList.itemIngotDesichalkos))
                .save(consumer, new ResourceLocation("extraores:smeltdesichalkosdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustEximite), ItemList.itemIngotEximite, 0.75F, 20)
                .unlockedBy("smelteximitedust", has(ItemList.itemIngotEximite))
                .save(consumer, new ResourceLocation("extraores:smelteximitedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustGallium), ItemList.itemIngotGallium, 0.75F, 20)
                .unlockedBy("smeltgalliumdust", has(ItemList.itemIngotGallium))
                .save(consumer, new ResourceLocation("extraores:smeltgalliumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustHaderoth), ItemList.itemIngotHaderoth, 0.75F, 20)
                .unlockedBy("smelthaderothdust", has(ItemList.itemIngotHaderoth))
                .save(consumer, new ResourceLocation("extraores:smelthaderothdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustHepatizon), ItemList.itemIngotHepatizon, 0.75F, 20)
                .unlockedBy("smelthepatizondust", has(ItemList.itemIngotHepatizon))
                .save(consumer, new ResourceLocation("extraores:smelthepatizondust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustIgnatius), ItemList.itemIngotIgnatius, 0.75F, 20)
                .unlockedBy("smeltignatiusdust", has(ItemList.itemIngotIgnatius))
                .save(consumer, new ResourceLocation("extraores:smeltignatiusdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustIndium), ItemList.itemIngotIndium, 0.75F, 20)
                .unlockedBy("smeltindiumdust", has(ItemList.itemIngotIndium))
                .save(consumer, new ResourceLocation("extraores:smeltindiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustInfuscolium), ItemList.itemIngotInfuscolium, 0.75F, 20)
                .unlockedBy("smeltinfuscoliumdust", has(ItemList.itemIngotInfuscolium))
                .save(consumer, new ResourceLocation("extraores:smeltinfuscoliumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustInolashite), ItemList.itemIngotInolashite, 0.75F, 20)
                .unlockedBy("smeltinolashitedust", has(ItemList.itemIngotInolashite))
                .save(consumer, new ResourceLocation("extraores:smeltinolashitedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustIridium), ItemList.itemIngotIridium, 0.75F, 20)
                .unlockedBy("smeltiridiumdust", has(ItemList.itemIngotIridium))
                .save(consumer, new ResourceLocation("extraores:smeltiridiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustKalendrite), ItemList.itemIngotKalendrite, 0.75F, 20)
                .unlockedBy("smeltkalendritedust", has(ItemList.itemIngotKalendrite))
                .save(consumer, new ResourceLocation("extraores:smeltkalendritedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustLead), ItemList.itemIngotLead, 0.75F, 20)
                .unlockedBy("smeltleaddust", has(ItemList.itemIngotLead))
                .save(consumer, new ResourceLocation("extraores:smeltleaddust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustLemurite), ItemList.itemIngotLemurite, 0.75F, 20)
                .unlockedBy("smeltlemuritedust", has(ItemList.itemIngotLemurite))
                .save(consumer, new ResourceLocation("extraores:smeltlemuritedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustManganese), ItemList.itemIngotManganese, 0.75F, 20)
                .unlockedBy("smeltmanganesedust", has(ItemList.itemIngotManganese))
                .save(consumer, new ResourceLocation("extraores:smeltmanganesedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustMeutoite), ItemList.itemIngotMeutoite, 0.75F, 20)
                .unlockedBy("smeltmeutoitedust", has(ItemList.itemIngotMeutoite))
                .save(consumer, new ResourceLocation("extraores:smeltmeutoitedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustMidasium), ItemList.itemIngotMidasium, 0.75F, 20)
                .unlockedBy("smeltmidasiumdust", has(ItemList.itemIngotMidasium))
                .save(consumer, new ResourceLocation("extraores:smeltmidasiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustMithril), ItemList.itemIngotMithril, 0.75F, 20)
                .unlockedBy("smeltmithrildust", has(ItemList.itemIngotMithril))
                .save(consumer, new ResourceLocation("extraores:smeltmithrildust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustMolybdenum), ItemList.itemIngotMolybdenum, 0.75F, 20)
                .unlockedBy("smeltmolybdenumdust", has(ItemList.itemIngotMolybdenum))
                .save(consumer, new ResourceLocation("extraores:smeltmolybdenumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustNeodymium), ItemList.itemIngotNeodymium, 0.75F, 20)
                .unlockedBy("smeltneodymiumdust", has(ItemList.itemIngotNeodymium))
                .save(consumer, new ResourceLocation("extraores:smeltneodymiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustNeptunium), ItemList.itemIngotNeptunium, 0.75F, 20)
                .unlockedBy("smeltneptuniumdust", has(ItemList.itemIngotNeptunium))
                .save(consumer, new ResourceLocation("extraores:smeltneptuniumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustNickel), ItemList.itemIngotNickel, 0.75F, 20)
                .unlockedBy("smeltnickeldust", has(ItemList.itemIngotNickel))
                .save(consumer, new ResourceLocation("extraores:smeltnickeldust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustNiobium), ItemList.itemIngotNiobium, 0.75F, 20)
                .unlockedBy("smeltniobiumdust", has(ItemList.itemIngotNiobium))
                .save(consumer, new ResourceLocation("extraores:smeltniobiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustOrichalcum), ItemList.itemIngotOrichalcum, 0.75F, 20)
                .unlockedBy("smeltorichalcumdust", has(ItemList.itemIngotOrichalcum))
                .save(consumer, new ResourceLocation("extraores:smeltorichalcumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustOsmium), ItemList.itemIngotOsmium, 0.75F, 20)
                .unlockedBy("smeltosmiumdust", has(ItemList.itemIngotOsmium))
                .save(consumer, new ResourceLocation("extraores:smeltosmiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustOureclase), ItemList.itemIngotOureclase, 0.75F, 20)
                .unlockedBy("smeltoureclasedust", has(ItemList.itemIngotOureclase))
                .save(consumer, new ResourceLocation("extraores:smeltoureclasedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustPalladium), ItemList.itemIngotPalladium, 0.75F, 20)
                .unlockedBy("smeltpalladiumdust", has(ItemList.itemIngotPalladium))
                .save(consumer, new ResourceLocation("extraores:smeltpalladiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustPlatinum), ItemList.itemIngotPlatinum, 0.75F, 20)
                .unlockedBy("smeltplatinumdust", has(ItemList.itemIngotPlatinum))
                .save(consumer, new ResourceLocation("extraores:smeltplatinumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustPlutonium), ItemList.itemIngotPlutonium, 0.75F, 20)
                .unlockedBy("smeltplutoniumdust", has(ItemList.itemIngotPlutonium))
                .save(consumer, new ResourceLocation("extraores:smeltplutoniumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustPolonium), ItemList.itemIngotPolonium, 0.75F, 20)
                .unlockedBy("smeltpoloniumdust", has(ItemList.itemIngotPolonium))
                .save(consumer, new ResourceLocation("extraores:smeltpoloniumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustPromethium), ItemList.itemIngotPromethium, 0.75F, 20)
                .unlockedBy("smeltpromethiumdust", has(ItemList.itemIngotPromethium))
                .save(consumer, new ResourceLocation("extraores:smeltpromethiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustRhenium), ItemList.itemIngotRhenium, 0.75F, 20)
                .unlockedBy("smeltrheniumdust", has(ItemList.itemIngotRhenium))
                .save(consumer, new ResourceLocation("extraores:smeltrheniumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustRhodium), ItemList.itemIngotRhodium, 0.75F, 20)
                .unlockedBy("smeltrhodiumdust", has(ItemList.itemIngotRhodium))
                .save(consumer, new ResourceLocation("extraores:smeltrhodiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustRubracium), ItemList.itemIngotRubracium, 0.75F, 20)
                .unlockedBy("smeltrubraciumdust", has(ItemList.itemIngotRubracium))
                .save(consumer, new ResourceLocation("extraores:smeltrubraciumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustRuthenium), ItemList.itemIngotRuthenium, 0.75F, 20)
                .unlockedBy("smeltrutheniumdust", has(ItemList.itemIngotRuthenium))
                .save(consumer, new ResourceLocation("extraores:smeltrutheniumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustSanguinite), ItemList.itemIngotSanguinite, 0.75F, 20)
                .unlockedBy("smeltsanguinitedust", has(ItemList.itemIngotSanguinite))
                .save(consumer, new ResourceLocation("extraores:smeltsanguinitedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustShadowIron), ItemList.itemIngotShadowIron, 0.75F, 20)
                .unlockedBy("smeltshadowirondust", has(ItemList.itemIngotShadowIron))
                .save(consumer, new ResourceLocation("extraores:smeltshadowirondust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustSilver), ItemList.itemIngotSilver, 0.75F, 20)
                .unlockedBy("smeltsilverdust", has(ItemList.itemIngotSilver))
                .save(consumer, new ResourceLocation("extraores:smeltsilverdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustTantalum), ItemList.itemIngotTantalum, 0.75F, 20)
                .unlockedBy("smelttantalumdust", has(ItemList.itemIngotTantalum))
                .save(consumer, new ResourceLocation("extraores:smelttantalumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustTartarite), ItemList.itemIngotTartarite, 0.75F, 20)
                .unlockedBy("smelttartaritedust", has(ItemList.itemIngotTartarite))
                .save(consumer, new ResourceLocation("extraores:smelttartaritedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustTechnetium), ItemList.itemIngotTechnetium, 0.75F, 20)
                .unlockedBy("smelttechnetiumdust", has(ItemList.itemIngotTechnetium))
                .save(consumer, new ResourceLocation("extraores:smelttechnetiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustThallium), ItemList.itemIngotThallium, 0.75F, 20)
                .unlockedBy("smeltthalliumdust", has(ItemList.itemIngotThallium))
                .save(consumer, new ResourceLocation("extraores:smeltthalliumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustTin), ItemList.itemIngotTin, 0.75F, 20)
                .unlockedBy("smelttindust", has(ItemList.itemIngotTin))
                .save(consumer, new ResourceLocation("extraores:smelttindust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustTitanium), ItemList.itemIngotTitanium, 0.75F, 20)
                .unlockedBy("smelttitaniumdust", has(ItemList.itemIngotTitanium))
                .save(consumer, new ResourceLocation("extraores:smelttitaniumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustTungsten), ItemList.itemIngotTungsten, 0.75F, 20)
                .unlockedBy("smelttungstendust", has(ItemList.itemIngotTungsten))
                .save(consumer, new ResourceLocation("extraores:smelttungstendust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustUnobtainium), ItemList.itemIngotUnobtainium, 0.75F, 20)
                .unlockedBy("smeltunobtainiumdust", has(ItemList.itemIngotUnobtainium))
                .save(consumer, new ResourceLocation("extraores:smeltunobtainiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustUranium), ItemList.itemIngotUranium, 0.75f, 20)
                .unlockedBy("smelturaniumdust", has(ItemList.itemIngotUranium))
                .save(consumer, new ResourceLocation("extraores:smelturaniumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustVanadium), ItemList.itemIngotVanadium, 0.75F, 20)
                .unlockedBy("smeltvanadiumdust", has(ItemList.itemIngotVanadium))
                .save(consumer, new ResourceLocation("extraores:smeltvanadiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustVulcanite), ItemList.itemIngotVulcanite, 0.75F, 20)
                .unlockedBy("smeltvulcanitedust", has(ItemList.itemIngotVulcanite))
                .save(consumer, new ResourceLocation("extraores:smeltvulcanitedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustVyroxeres), ItemList.itemIngotVyroxeres, 0.75F, 20)
                .unlockedBy("smeltvyroxeresdust", has(ItemList.itemIngotVyroxeres))
                .save(consumer, new ResourceLocation("extraores:smeltvyroxeresdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustYellorite), ItemList.itemIngotYellorite, 0.75F, 20)
                .unlockedBy("smeltyelloritedust", has(ItemList.itemIngotYellorite))
                .save(consumer, new ResourceLocation("extraores:smeltyelloritedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustZinc), ItemList.itemIngotZinc, 0.75F, 20)
                .unlockedBy("smeltzincdust", has(ItemList.itemIngotZinc))
                .save(consumer, new ResourceLocation("extraores:smeltzincdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.dustZirconium), ItemList.itemIngotZirconium, 0.75F, 20)
                .unlockedBy("smeltzirconiumdust", has(ItemList.itemIngotZirconium))
                .save(consumer, new ResourceLocation("extraores:smeltzirconiumdust"));
        //Smelting Raw Ore
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawAdamantine), ItemList.itemIngotAdamantine, 0.75F, 20)
                .unlockedBy("smeltrawadamantine", has(ItemList.itemIngotAdamantine))
                .save(consumer, new ResourceLocation("extraores:smeltrawadamantine"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawAldourite), ItemList.itemIngotAldourite, 0.75F, 20)
                .unlockedBy("smeltrawaldourite", has(ItemList.itemIngotAldourite))
                .save(consumer, new ResourceLocation("extraores:smeltrawaldourite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawAluminum), ItemList.itemIngotAluminum, 0.75F, 20)
                .unlockedBy("smeltrawaluminum", has(ItemList.itemIngotAluminum))
                .save(consumer, new ResourceLocation("extraores:smeltrawaluminum"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawAmericium), ItemList.itemIngotAmericium, 0.75F, 20)
                .unlockedBy("smeltrawamericium", has(ItemList.itemIngotAmericium))
                .save(consumer, new ResourceLocation("extraores:smeltrawamericium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawAmordrine), ItemList.itemIngotAmordrine, 0.75F, 20)
                .unlockedBy("smeltrawamordrine", has(ItemList.itemIngotAmordrine))
                .save(consumer, new ResourceLocation("extraores:smeltrawamordrine"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawAngmallen), ItemList.itemIngotAngmallen, 0.75F, 20)
                .unlockedBy("smeltrawangmallen", has(ItemList.itemIngotAngmallen))
                .save(consumer, new ResourceLocation("extraores:smeltrawangmallen"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawAstralSilver), ItemList.itemIngotAstralSilver, 0.75F, 20)
                .unlockedBy("smeltrawastralsilver", has(ItemList.itemIngotAstralSilver))
                .save(consumer, new ResourceLocation("extraores:smeltrawastralsilver"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawAtlarus), ItemList.itemIngotAtlarus, 0.75F, 20)
                .unlockedBy("smeltrawatlarus", has(ItemList.itemIngotAtlarus))
                .save(consumer, new ResourceLocation("extraores:smeltrawatlarus"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawBismuth), ItemList.itemIngotBismuth, 0.75F, 20)
                .unlockedBy("smeltrawbismuth", has(ItemList.itemIngotBismuth))
                .save(consumer, new ResourceLocation("extraores:smeltrawbismuth"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawBlackSteel), ItemList.itemIngotBlackSteel, 0.75F, 20)
                .unlockedBy("smeltrawblacksteel", has(ItemList.itemIngotBlackSteel))
                .save(consumer, new ResourceLocation("extraores:smeltrawblacksteel"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawCadmium), ItemList.itemIngotCadmium, 0.75F, 20)
                .unlockedBy("smeltrawcadmium", has(ItemList.itemIngotCadmium))
                .save(consumer, new ResourceLocation("extraores:smeltrawcadmium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawCarmot), ItemList.itemIngotCarmot, 0.75F, 20)
                .unlockedBy("smeltrawcarmot", has(ItemList.itemIngotCarmot))
                .save(consumer, new ResourceLocation("extraores:smeltrawcarmot"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawCelenegil), ItemList.itemIngotCelenegil, 0.75F, 20)
                .unlockedBy("smeltrawcelenegil", has(ItemList.itemIngotCelenegil))
                .save(consumer, new ResourceLocation("extraores:smeltrawcelenegil"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawCeruclase), ItemList.itemIngotCeruclase, 0.75F, 20)
                .unlockedBy("smeltrawceruclase", has(ItemList.itemIngotCeruclase))
                .save(consumer, new ResourceLocation("extraores:smeltrawceruclase"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawChromium), ItemList.itemIngotChromium, 0.75F, 20)
                .unlockedBy("smeltrawchromium", has(ItemList.itemIngotChromium))
                .save(consumer, new ResourceLocation("extraores:smeltrawchromium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawCobalt), ItemList.itemIngotCobalt, 0.75F, 20)
                .unlockedBy("smeltrawcobalt", has(ItemList.itemIngotCobalt))
                .save(consumer, new ResourceLocation("extraores:smeltrawcobalt"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawCopper), ItemList.itemIngotCopper, 0.75F, 20)
                .unlockedBy("smeltrawcopper", has(ItemList.itemIngotCopper))
                .save(consumer, new ResourceLocation("extraores:smeltrawcopper"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawDeepIron), ItemList.itemIngotDeepIron, 0.75F, 20)
                .unlockedBy("smeltrawdeepiron", has(ItemList.itemIngotDeepIron))
                .save(consumer, new ResourceLocation("extraores:smeltrawdeepiron"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawDesichalkos), ItemList.itemIngotDesichalkos, 0.75F, 20)
                .unlockedBy("smeltrawdesichalkos", has(ItemList.itemIngotDesichalkos))
                .save(consumer, new ResourceLocation("extraores:smeltrawdesichalkos"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawEximite), ItemList.itemIngotEximite, 0.75F, 20)
                .unlockedBy("smeltraweximite", has(ItemList.itemIngotEximite))
                .save(consumer, new ResourceLocation("extraores:smeltraweximite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawGallium), ItemList.itemIngotGallium, 0.75F, 20)
                .unlockedBy("smeltrawgallium", has(ItemList.itemIngotGallium))
                .save(consumer, new ResourceLocation("extraores:smeltrawgallium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawHaderoth), ItemList.itemIngotHaderoth, 0.75F, 20)
                .unlockedBy("smeltrawhaderoth", has(ItemList.itemIngotHaderoth))
                .save(consumer, new ResourceLocation("extraores:smeltrawhaderoth"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawHepatizon), ItemList.itemIngotHepatizon, 0.75F, 20)
                .unlockedBy("smeltrawhepatizon", has(ItemList.itemIngotHepatizon))
                .save(consumer, new ResourceLocation("extraores:smeltrawhepatizon"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawIgnatius), ItemList.itemIngotIgnatius, 0.75F, 20)
                .unlockedBy("smeltrawignatius", has(ItemList.itemIngotIgnatius))
                .save(consumer, new ResourceLocation("extraores:smeltrawignatius"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawIndium), ItemList.itemIngotIndium, 0.75F, 20)
                .unlockedBy("smeltrawindium", has(ItemList.itemIngotIndium))
                .save(consumer, new ResourceLocation("extraores:smeltrawindium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawInfuscolium), ItemList.itemIngotInfuscolium, 0.75F, 20)
                .unlockedBy("smeltrawinfuscolium", has(ItemList.itemIngotInfuscolium))
                .save(consumer, new ResourceLocation("extraores:smeltrawinfuscolium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawInolashite), ItemList.itemIngotInolashite, 0.75F, 20)
                .unlockedBy("smeltrawinolashite", has(ItemList.itemIngotInolashite))
                .save(consumer, new ResourceLocation("extraores:smeltrawinolashite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawIridium), ItemList.itemIngotIridium, 0.75F, 20)
                .unlockedBy("smeltrawiridium", has(ItemList.itemIngotIridium))
                .save(consumer, new ResourceLocation("extraores:smeltrawiridium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawKalendrite), ItemList.itemIngotKalendrite, 0.75F, 20)
                .unlockedBy("smeltrawkalendrite", has(ItemList.itemIngotKalendrite))
                .save(consumer, new ResourceLocation("extraores:smeltrawkalendrite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawLead), ItemList.itemIngotLead, 0.75F, 20)
                .unlockedBy("smeltrawlead", has(ItemList.itemIngotLead))
                .save(consumer, new ResourceLocation("extraores:smeltrawlead"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawLemurite), ItemList.itemIngotLemurite, 0.75F, 20)
                .unlockedBy("smeltrawlemurite", has(ItemList.itemIngotLemurite))
                .save(consumer, new ResourceLocation("extraores:smeltrawlemurite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawManganese), ItemList.itemIngotManganese, 0.75F, 20)
                .unlockedBy("smeltrawmanganese", has(ItemList.itemIngotManganese))
                .save(consumer, new ResourceLocation("extraores:smeltrawmanganese"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawMeutoite), ItemList.itemIngotMeutoite, 0.75F, 20)
                .unlockedBy("smeltrawmeutoite", has(ItemList.itemIngotMeutoite))
                .save(consumer, new ResourceLocation("extraores:smeltrawmeutoite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawMidasium), ItemList.itemIngotMidasium, 0.75F, 20)
                .unlockedBy("smeltrawmidasium", has(ItemList.itemIngotMidasium))
                .save(consumer, new ResourceLocation("extraores:smeltrawmidasium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawMithril), ItemList.itemIngotMithril, 0.75F, 20)
                .unlockedBy("smeltrawmithril", has(ItemList.itemIngotMithril))
                .save(consumer, new ResourceLocation("extraores:smeltrawmithril"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawMolybdenum), ItemList.itemIngotMolybdenum, 0.75F, 20)
                .unlockedBy("smeltrawmolybdenum", has(ItemList.itemIngotMolybdenum))
                .save(consumer, new ResourceLocation("extraores:smeltrawmolybdenum"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawNeodymium), ItemList.itemIngotNeodymium, 0.75F, 20)
                .unlockedBy("smeltrawneodymium", has(ItemList.itemIngotNeodymium))
                .save(consumer, new ResourceLocation("extraores:smeltrawneodymium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawNeptunium), ItemList.itemIngotNeptunium, 0.75F, 20)
                .unlockedBy("smeltrawneptunium", has(ItemList.itemIngotNeptunium))
                .save(consumer, new ResourceLocation("extraores:smeltrawneptunium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawNickel), ItemList.itemIngotNickel, 0.75F, 20)
                .unlockedBy("smeltrawnickel", has(ItemList.itemIngotNickel))
                .save(consumer, new ResourceLocation("extraores:smeltrawnickel"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawNiobium), ItemList.itemIngotNiobium, 0.75F, 20)
                .unlockedBy("smeltrawniobium", has(ItemList.itemIngotNiobium))
                .save(consumer, new ResourceLocation("extraores:smeltrawniobium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawOrichalcum), ItemList.itemIngotOrichalcum, 0.75F, 20)
                .unlockedBy("smeltraworichalcum", has(ItemList.itemIngotOrichalcum))
                .save(consumer, new ResourceLocation("extraores:smeltraworichalcum"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawOsmium), ItemList.itemIngotOsmium, 0.75F, 20)
                .unlockedBy("smeltrawosmium", has(ItemList.itemIngotOsmium))
                .save(consumer, new ResourceLocation("extraores:smeltrawosmium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawOureclase), ItemList.itemIngotOureclase, 0.75F, 20)
                .unlockedBy("smeltrawoureclase", has(ItemList.itemIngotOureclase))
                .save(consumer, new ResourceLocation("extraores:smeltrawoureclase"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawPalladium), ItemList.itemIngotPalladium, 0.75F, 20)
                .unlockedBy("smeltrawpalladium", has(ItemList.itemIngotPalladium))
                .save(consumer, new ResourceLocation("extraores:smeltrawpalladium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawPlatinum), ItemList.itemIngotPlatinum, 0.75F, 20)
                .unlockedBy("smeltrawplatinum", has(ItemList.itemIngotPlatinum))
                .save(consumer, new ResourceLocation("extraores:smeltrawplatinum"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawPlutonium), ItemList.itemIngotPlutonium, 0.75F, 20)
                .unlockedBy("smeltrawplutonium", has(ItemList.itemIngotPlutonium))
                .save(consumer, new ResourceLocation("extraores:smeltrawplutonium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawPolonium), ItemList.itemIngotPolonium, 0.75F, 20)
                .unlockedBy("smeltrawpolonium", has(ItemList.itemIngotPolonium))
                .save(consumer, new ResourceLocation("extraores:smeltrawpolonium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawPromethium), ItemList.itemIngotPromethium, 0.75F, 20)
                .unlockedBy("smeltrawpromethium", has(ItemList.itemIngotPromethium))
                .save(consumer, new ResourceLocation("extraores:smeltrawpromethium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawRhenium), ItemList.itemIngotRhenium, 0.75F, 20)
                .unlockedBy("smeltrawrhenium", has(ItemList.itemIngotRhenium))
                .save(consumer, new ResourceLocation("extraores:smeltrawrhenium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawRhodium), ItemList.itemIngotRhodium, 0.75F, 20)
                .unlockedBy("smeltrawrhodium", has(ItemList.itemIngotRhodium))
                .save(consumer, new ResourceLocation("extraores:smeltrawrhodium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawRubracium), ItemList.itemIngotRubracium, 0.75F, 20)
                .unlockedBy("smeltrawrubracium", has(ItemList.itemIngotRubracium))
                .save(consumer, new ResourceLocation("extraores:smeltrawrubracium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawRuthenium), ItemList.itemIngotRuthenium, 0.75F, 20)
                .unlockedBy("smeltrawruthenium", has(ItemList.itemIngotRuthenium))
                .save(consumer, new ResourceLocation("extraores:smeltrawruthenium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawSanguinite), ItemList.itemIngotSanguinite, 0.75F, 20)
                .unlockedBy("smeltrawsanguinite", has(ItemList.itemIngotSanguinite))
                .save(consumer, new ResourceLocation("extraores:smeltrawsanguinite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawShadowIron), ItemList.itemIngotShadowIron, 0.75F, 20)
                .unlockedBy("smeltrawshadowiron", has(ItemList.itemIngotShadowIron))
                .save(consumer, new ResourceLocation("extraores:smeltrawshadowiron"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawSilver), ItemList.itemIngotSilver, 0.75F, 20)
                .unlockedBy("smeltrawsilver", has(ItemList.itemIngotSilver))
                .save(consumer, new ResourceLocation("extraores:smeltrawsilver"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawTantalum), ItemList.itemIngotTantalum, 0.75F, 20)
                .unlockedBy("smeltrawtantalum", has(ItemList.itemIngotTantalum))
                .save(consumer, new ResourceLocation("extraores:smeltrawtantalum"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawTartarite), ItemList.itemIngotTartarite, 0.75F, 20)
                .unlockedBy("smeltrawtartarite", has(ItemList.itemIngotTartarite))
                .save(consumer, new ResourceLocation("extraores:smeltrawtartarite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawTechnetium), ItemList.itemIngotTechnetium, 0.75F, 20)
                .unlockedBy("smeltrawtechnetium", has(ItemList.itemIngotTechnetium))
                .save(consumer, new ResourceLocation("extraores:smeltrawtechnetium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawThallium), ItemList.itemIngotThallium, 0.75F, 20)
                .unlockedBy("smeltrawthallium", has(ItemList.itemIngotThallium))
                .save(consumer, new ResourceLocation("extraores:smeltrawthallium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawTin), ItemList.itemIngotTin, 0.75F, 20)
                .unlockedBy("smeltrawtin", has(ItemList.itemIngotTin))
                .save(consumer, new ResourceLocation("extraores:smeltrawtin"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawTitanium), ItemList.itemIngotTitanium, 0.75F, 20)
                .unlockedBy("smeltrawtitanium", has(ItemList.itemIngotTitanium))
                .save(consumer, new ResourceLocation("extraores:smeltrawtitanium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawTungsten), ItemList.itemIngotTungsten, 0.75F, 20)
                .unlockedBy("smeltrawtungsten", has(ItemList.itemIngotTungsten))
                .save(consumer, new ResourceLocation("extraores:smeltrawtungsten"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawUnobtainium), ItemList.itemIngotUnobtainium, 0.75F, 20)
                .unlockedBy("smeltrawunobtainium", has(ItemList.itemIngotUnobtainium))
                .save(consumer, new ResourceLocation("extraores:smeltrawunobtainium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawUranium), ItemList.itemIngotUranium, 0.75f, 20)
                .unlockedBy("smeltrawuranium", has(ItemList.itemIngotUranium))
                .save(consumer, new ResourceLocation("extraores:smeltrawuranium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawVanadium), ItemList.itemIngotVanadium, 0.75F, 20)
                .unlockedBy("smeltrawvanadium", has(ItemList.itemIngotVanadium))
                .save(consumer, new ResourceLocation("extraores:smeltrawvanadium"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawVulcanite), ItemList.itemIngotVulcanite, 0.75F, 20)
                .unlockedBy("smeltrawvulcanite", has(ItemList.itemIngotVulcanite))
                .save(consumer, new ResourceLocation("extraores:smeltrawvulcanite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawVyroxeres), ItemList.itemIngotVyroxeres, 0.75F, 20)
                .unlockedBy("smeltrawvyroxeres", has(ItemList.itemIngotVyroxeres))
                .save(consumer, new ResourceLocation("extraores:smeltrawvyroxeres"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawYellorite), ItemList.itemIngotYellorite, 0.75F, 20)
                .unlockedBy("smeltrawyellorite", has(ItemList.itemIngotYellorite))
                .save(consumer, new ResourceLocation("extraores:smeltrawyellorite"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawZinc), ItemList.itemIngotZinc, 0.75F, 20)
                .unlockedBy("smeltrawzinc", has(ItemList.itemIngotZinc))
                .save(consumer, new ResourceLocation("extraores:smeltrawzinc"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemTagList.rawZirconium), ItemList.itemIngotZirconium, 0.75F, 20)
                .unlockedBy("smeltrawzirconium", has(ItemList.itemIngotZirconium))
                .save(consumer, new ResourceLocation("extraores:smeltrawzirconium"));
        //Blasting Ore
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreAdamantine), ItemList.itemIngotAdamantine, 0.75F, 20)
                .unlockedBy("blastadamantineore", has(ItemList.itemIngotAdamantine))
                .save(consumer, new ResourceLocation("extraores:blastadamantineore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreAldourite), ItemList.itemIngotAldourite, 0.75F, 20)
                .unlockedBy("blastaldouriteore", has(ItemList.itemIngotAldourite))
                .save(consumer, new ResourceLocation("extraores:blastaldouriteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreAluminum), ItemList.itemIngotAluminum, 0.75F, 20)
                .unlockedBy("blastaluminumore", has(ItemList.itemIngotAluminum))
                .save(consumer, new ResourceLocation("extraores:blastaluminumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreAmericium), ItemList.itemIngotAmericium, 0.75F, 20)
                .unlockedBy("blastamericiumore", has(ItemList.itemIngotAmericium))
                .save(consumer, new ResourceLocation("extraores:blastamericiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreAmordrine), ItemList.itemIngotAmordrine, 0.75F, 20)
                .unlockedBy("blastamordrineore", has(ItemList.itemIngotAmordrine))
                .save(consumer, new ResourceLocation("extraores:blastamordrineore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreAngmallen), ItemList.itemIngotAngmallen, 0.75F, 20)
                .unlockedBy("blastangmallenore", has(ItemList.itemIngotAngmallen))
                .save(consumer, new ResourceLocation("extraores:blastangmallenore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreAstralSilver), ItemList.itemIngotAstralSilver, 0.75F, 20)
                .unlockedBy("blastastralsilverore", has(ItemList.itemIngotAstralSilver))
                .save(consumer, new ResourceLocation("extraores:blastastralsilverore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreAtlarus), ItemList.itemIngotAtlarus, 0.75F, 20)
                .unlockedBy("blastatlarusore", has(ItemList.itemIngotAtlarus))
                .save(consumer, new ResourceLocation("extraores:blastatlarusore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreBismuth), ItemList.itemIngotBismuth, 0.75F, 20)
                .unlockedBy("blastbismuthore", has(ItemList.itemIngotBismuth))
                .save(consumer, new ResourceLocation("extraores:blastbismuthore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreBlackSteel), ItemList.itemIngotBlackSteel, 0.75F, 20)
                .unlockedBy("blastblacksteelore", has(ItemList.itemIngotBlackSteel))
                .save(consumer, new ResourceLocation("extraores:blastblacksteelore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreCadmium), ItemList.itemIngotCadmium, 0.75F, 20)
                .unlockedBy("blastcadmiumore", has(ItemList.itemIngotCadmium))
                .save(consumer, new ResourceLocation("extraores:blastcadmiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreCarmot), ItemList.itemIngotCarmot, 0.75F, 20)
                .unlockedBy("blastcarmotore", has(ItemList.itemIngotCarmot))
                .save(consumer, new ResourceLocation("extraores:blastcarmotore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreCelenegil), ItemList.itemIngotCelenegil, 0.75F, 20)
                .unlockedBy("blastcelenegilore", has(ItemList.itemIngotCelenegil))
                .save(consumer, new ResourceLocation("extraores:blastcelenegilore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreCeruclase), ItemList.itemIngotCeruclase, 0.75F, 20)
                .unlockedBy("blastceruclaseore", has(ItemList.itemIngotCeruclase))
                .save(consumer, new ResourceLocation("extraores:blastceruclaseore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreChromium), ItemList.itemIngotChromium, 0.75F, 20)
                .unlockedBy("blastchromiumore", has(ItemList.itemIngotChromium))
                .save(consumer, new ResourceLocation("extraores:blastchromiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreCobalt), ItemList.itemIngotCobalt, 0.75F, 20)
                .unlockedBy("blastcobaltore", has(ItemList.itemIngotCobalt))
                .save(consumer, new ResourceLocation("extraores:blastcobaltore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreCopper), ItemList.itemIngotCopper, 0.75F, 20)
                .unlockedBy("blastcopperore", has(ItemList.itemIngotCopper))
                .save(consumer, new ResourceLocation("extraores:blastcopperore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreDeepIron), ItemList.itemIngotDeepIron, 0.75F, 20)
                .unlockedBy("blastdeepironore", has(ItemList.itemIngotDeepIron))
                .save(consumer, new ResourceLocation("extraores:blastdeepironore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreDesichalkos), ItemList.itemIngotDesichalkos, 0.75F, 20)
                .unlockedBy("blastdesichalkosore", has(ItemList.itemIngotDesichalkos))
                .save(consumer, new ResourceLocation("extraores:blastdesichalkosore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreEximite), ItemList.itemIngotEximite, 0.75F, 20)
                .unlockedBy("blasteximiteore", has(ItemList.itemIngotEximite))
                .save(consumer, new ResourceLocation("extraores:blasteximiteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreGallium), ItemList.itemIngotGallium, 0.75F, 20)
                .unlockedBy("blastgalliumore", has(ItemList.itemIngotGallium))
                .save(consumer, new ResourceLocation("extraores:blastgalliumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreHaderoth), ItemList.itemIngotHaderoth, 0.75F, 20)
                .unlockedBy("blasthaderothore", has(ItemList.itemIngotHaderoth))
                .save(consumer, new ResourceLocation("extraores:blasthaderothore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreHepatizon), ItemList.itemIngotHepatizon, 0.75F, 20)
                .unlockedBy("blasthepatizonore", has(ItemList.itemIngotHepatizon))
                .save(consumer, new ResourceLocation("extraores:blasthepatizonore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreIgnatius), ItemList.itemIngotIgnatius, 0.75F, 20)
                .unlockedBy("blastignatiusore", has(ItemList.itemIngotIgnatius))
                .save(consumer, new ResourceLocation("extraores:blastignatiusore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreIndium), ItemList.itemIngotIndium, 0.75F, 20)
                .unlockedBy("blastindiumore", has(ItemList.itemIngotIndium))
                .save(consumer, new ResourceLocation("extraores:blastindiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreInfuscolium), ItemList.itemIngotInfuscolium, 0.75F, 20)
                .unlockedBy("blastinfuscoliumore", has(ItemList.itemIngotInfuscolium))
                .save(consumer, new ResourceLocation("extraores:blastinfuscoliumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreInolashite), ItemList.itemIngotInolashite, 0.75F, 20)
                .unlockedBy("blastinolashiteore", has(ItemList.itemIngotInolashite))
                .save(consumer, new ResourceLocation("extraores:blastinolashiteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreIridium), ItemList.itemIngotIridium, 0.75F, 20)
                .unlockedBy("blastiridiumore", has(ItemList.itemIngotIridium))
                .save(consumer, new ResourceLocation("extraores:blastiridiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreKalendrite), ItemList.itemIngotKalendrite, 0.75F, 20)
                .unlockedBy("blastkalendriteore", has(ItemList.itemIngotKalendrite))
                .save(consumer, new ResourceLocation("extraores:blastkalendriteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreLead), ItemList.itemIngotLead, 0.75F, 20)
                .unlockedBy("blastleadore", has(ItemList.itemIngotLead))
                .save(consumer, new ResourceLocation("extraores:blastleadore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreLemurite), ItemList.itemIngotLemurite, 0.75F, 20)
                .unlockedBy("blastlemuriteore", has(ItemList.itemIngotLemurite))
                .save(consumer, new ResourceLocation("extraores:blastlemuriteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreManganese), ItemList.itemIngotManganese, 0.75F, 20)
                .unlockedBy("blastmanganeseore", has(ItemList.itemIngotManganese))
                .save(consumer, new ResourceLocation("extraores:blastmanganeseore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreMeutoite), ItemList.itemIngotMeutoite, 0.75F, 20)
                .unlockedBy("blastmeutoiteore", has(ItemList.itemIngotMeutoite))
                .save(consumer, new ResourceLocation("extraores:blastmeutoiteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreMidasium), ItemList.itemIngotMidasium, 0.75F, 20)
                .unlockedBy("blastmidasiumore", has(ItemList.itemIngotMidasium))
                .save(consumer, new ResourceLocation("extraores:blastmidasiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreMithril), ItemList.itemIngotMithril, 0.75F, 20)
                .unlockedBy("blastmithrilore", has(ItemList.itemIngotMithril))
                .save(consumer, new ResourceLocation("extraores:blastmithrilore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreMolybdenum), ItemList.itemIngotMolybdenum, 0.75F, 20)
                .unlockedBy("blastmolybdenumore", has(ItemList.itemIngotMolybdenum))
                .save(consumer, new ResourceLocation("extraores:blastmolybdenumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreNeodymium), ItemList.itemIngotNeodymium, 0.75F, 20)
                .unlockedBy("blastneodymiumore", has(ItemList.itemIngotNeodymium))
                .save(consumer, new ResourceLocation("extraores:blastneodymiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreNeptunium), ItemList.itemIngotNeptunium, 0.75F, 20)
                .unlockedBy("blastneptuniumore", has(ItemList.itemIngotNeptunium))
                .save(consumer, new ResourceLocation("extraores:blastneptuniumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreNickel), ItemList.itemIngotNickel, 0.75F, 20)
                .unlockedBy("blastnickelore", has(ItemList.itemIngotNickel))
                .save(consumer, new ResourceLocation("extraores:blastnickelore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreNiobium), ItemList.itemIngotNiobium, 0.75F, 20)
                .unlockedBy("blastniobiumore", has(ItemList.itemIngotNiobium))
                .save(consumer, new ResourceLocation("extraores:blastniobiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreOrichalcum), ItemList.itemIngotOrichalcum, 0.75F, 20)
                .unlockedBy("blastorichalcumore", has(ItemList.itemIngotOrichalcum))
                .save(consumer, new ResourceLocation("extraores:blastorichalcumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreOureclase), ItemList.itemIngotOureclase, 0.75F, 20)
                .unlockedBy("blastoureclaseore", has(ItemList.itemIngotOureclase))
                .save(consumer, new ResourceLocation("extraores:blastoureclaseore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.orePalladium), ItemList.itemIngotPalladium, 0.75F, 20)
                .unlockedBy("blastpalladiumore", has(ItemList.itemIngotPalladium))
                .save(consumer, new ResourceLocation("extraores:blastpalladiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.orePlatinum), ItemList.itemIngotPlatinum, 0.75F, 20)
                .unlockedBy("blastplatinumore", has(ItemList.itemIngotPlatinum))
                .save(consumer, new ResourceLocation("extraores:blastplatinumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.orePlutonium), ItemList.itemIngotPlutonium, 0.75F, 20)
                .unlockedBy("blastplutoniumore", has(ItemList.itemIngotPlutonium))
                .save(consumer, new ResourceLocation("extraores:blastplutoniumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.orePolonium), ItemList.itemIngotPolonium, 0.75F, 20)
                .unlockedBy("blastpoloniumore", has(ItemList.itemIngotPolonium))
                .save(consumer, new ResourceLocation("extraores:blastpoloniumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.orePromethium), ItemList.itemIngotPromethium, 0.75F, 20)
                .unlockedBy("blastpromethiumore", has(ItemList.itemIngotPromethium))
                .save(consumer, new ResourceLocation("extraores:blastpromethiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreRhenium), ItemList.itemIngotRhenium, 0.75F, 20)
                .unlockedBy("blastrheniumore", has(ItemList.itemIngotRhenium))
                .save(consumer, new ResourceLocation("extraores:blastrheniumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreRhodium), ItemList.itemIngotRhodium, 0.75F, 20)
                .unlockedBy("blastrhodiumore", has(ItemList.itemIngotRhodium))
                .save(consumer, new ResourceLocation("extraores:blastrhodiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreRubracium), ItemList.itemIngotRubracium, 0.75F, 20)
                .unlockedBy("blastrubraciumore", has(ItemList.itemIngotRubracium))
                .save(consumer, new ResourceLocation("extraores:blastrubraciumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreRuthenium), ItemList.itemIngotRuthenium, 0.75F, 20)
                .unlockedBy("blastrutheniumore", has(ItemList.itemIngotRuthenium))
                .save(consumer, new ResourceLocation("extraores:blastrutheniumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreSanguinite), ItemList.itemIngotSanguinite, 0.75F, 20)
                .unlockedBy("blastsanguiniteore", has(ItemList.itemIngotSanguinite))
                .save(consumer, new ResourceLocation("extraores:blastsanguiniteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreShadowIron), ItemList.itemIngotShadowIron, 0.75F, 20)
                .unlockedBy("blastshadowironore", has(ItemList.itemIngotShadowIron))
                .save(consumer, new ResourceLocation("extraores:blastshadowironore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreSilver), ItemList.itemIngotSilver, 0.75F, 20)
                .unlockedBy("blastsilverore", has(ItemList.itemIngotSilver))
                .save(consumer, new ResourceLocation("extraores:blastsilverore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreTantalum), ItemList.itemIngotTantalum, 0.75F, 20)
                .unlockedBy("blasttantalumore", has(ItemList.itemIngotTantalum))
                .save(consumer, new ResourceLocation("extraores:blasttantalumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreTartarite), ItemList.itemIngotTartarite, 0.75F, 20)
                .unlockedBy("blasttartariteore", has(ItemList.itemIngotTartarite))
                .save(consumer, new ResourceLocation("extraores:blasttartariteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreTechnetium), ItemList.itemIngotTechnetium, 0.75F, 20)
                .unlockedBy("blasttechnetiumore", has(ItemList.itemIngotTechnetium))
                .save(consumer, new ResourceLocation("extraores:blasttechnetiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreThallium), ItemList.itemIngotThallium, 0.75F, 20)
                .unlockedBy("blastthalliumore", has(ItemList.itemIngotThallium))
                .save(consumer, new ResourceLocation("extraores:blastthalliumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreTin), ItemList.itemIngotTin, 0.75F, 20)
                .unlockedBy("blasttinore", has(ItemList.itemIngotTin))
                .save(consumer, new ResourceLocation("extraores:blasttinore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreTitanium), ItemList.itemIngotTitanium, 0.75F, 20)
                .unlockedBy("blasttitaniumore", has(ItemList.itemIngotTitanium))
                .save(consumer, new ResourceLocation("extraores:blasttitaniumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreTungsten), ItemList.itemIngotTungsten, 0.75F, 20)
                .unlockedBy("blasttungstenore", has(ItemList.itemIngotTungsten))
                .save(consumer, new ResourceLocation("extraores:blasttungstenore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreUnobtainium), ItemList.itemIngotUnobtainium, 0.75F, 20)
                .unlockedBy("blastunobtainiumore", has(ItemList.itemIngotUnobtainium))
                .save(consumer, new ResourceLocation("extraores:blastunobtainiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreUranium), ItemList.itemIngotUranium, 0.75f, 20)
                .unlockedBy("blasturaniumore", has(ItemList.itemIngotUranium))
                .save(consumer, new ResourceLocation("extraores:blasturaniumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreVanadium), ItemList.itemIngotVanadium, 0.75F, 20)
                .unlockedBy("blastvanadiumore", has(ItemList.itemIngotVanadium))
                .save(consumer, new ResourceLocation("extraores:blastvanadiumore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreVulcanite), ItemList.itemIngotVulcanite, 0.75F, 20)
                .unlockedBy("blastvulcaniteore", has(ItemList.itemIngotVulcanite))
                .save(consumer, new ResourceLocation("extraores:blastvulcaniteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreVyroxeres), ItemList.itemIngotVyroxeres, 0.75F, 20)
                .unlockedBy("blastvyroxeresore", has(ItemList.itemIngotVyroxeres))
                .save(consumer, new ResourceLocation("extraores:blastvyroxeresore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreYellorite), ItemList.itemIngotYellorite, 0.75F, 20)
                .unlockedBy("blastyelloriteore", has(ItemList.itemIngotYellorite))
                .save(consumer, new ResourceLocation("extraores:blastyelloriteore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreZinc), ItemList.itemIngotZinc, 0.75F, 20)
                .unlockedBy("blastzincore", has(ItemList.itemIngotZinc))
                .save(consumer, new ResourceLocation("extraores:blastzincore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.oreZirconium), ItemList.itemIngotZirconium, 0.75F, 20)
                .unlockedBy("blastzirconiumore", has(ItemList.itemIngotZirconium))
                .save(consumer, new ResourceLocation("extraores:blastzirconiumore"));
        //Blasting Dust
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustAdamantine), ItemList.itemIngotAdamantine, 0.75F, 10)
                .unlockedBy("blastadamantinedust", has(ItemList.itemIngotAdamantine))
                .save(consumer, new ResourceLocation("extraores:blastadamantinedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustAldourite), ItemList.itemIngotAldourite, 0.75F, 10)
                .unlockedBy("blastaldouritedust", has(ItemList.itemIngotAldourite))
                .save(consumer, new ResourceLocation("extraores:blastaldouritedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustAluminum), ItemList.itemIngotAluminum, 0.75F, 10)
                .unlockedBy("blastaluminumdust", has(ItemList.itemIngotAluminum))
                .save(consumer, new ResourceLocation("extraores:blastaluminumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustAmericium), ItemList.itemIngotAmericium, 0.75F, 10)
                .unlockedBy("blastamericiumdust", has(ItemList.itemIngotAmericium))
                .save(consumer, new ResourceLocation("extraores:blastamericiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustAmordrine), ItemList.itemIngotAmordrine, 0.75F, 10)
                .unlockedBy("blastamordrinedust", has(ItemList.itemIngotAmordrine))
                .save(consumer, new ResourceLocation("extraores:blastamordrinedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustAngmallen), ItemList.itemIngotAngmallen, 0.75F, 10)
                .unlockedBy("blastangmallendust", has(ItemList.itemIngotAngmallen))
                .save(consumer, new ResourceLocation("extraores:blastangmallendust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustAstralSilver), ItemList.itemIngotAstralSilver, 0.75F, 10)
                .unlockedBy("blastastralsilverdust", has(ItemList.itemIngotAstralSilver))
                .save(consumer, new ResourceLocation("extraores:blastastralsilverdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustAtlarus), ItemList.itemIngotAtlarus, 0.75F, 10)
                .unlockedBy("blastatlarusdust", has(ItemList.itemIngotAtlarus))
                .save(consumer, new ResourceLocation("extraores:blastatlarusdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustBismuth), ItemList.itemIngotBismuth, 0.75F, 10)
                .unlockedBy("blastbismuthdust", has(ItemList.itemIngotBismuth))
                .save(consumer, new ResourceLocation("extraores:blastbismuthdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustBlackSteel), ItemList.itemIngotBlackSteel, 0.75F, 10)
                .unlockedBy("blastblacksteeldust", has(ItemList.itemIngotBlackSteel))
                .save(consumer, new ResourceLocation("extraores:blastblacksteeldust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustCadmium), ItemList.itemIngotCadmium, 0.75F, 10)
                .unlockedBy("blastcadmiumdust", has(ItemList.itemIngotCadmium))
                .save(consumer, new ResourceLocation("extraores:blastcadmiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustCarmot), ItemList.itemIngotCarmot, 0.75F, 10)
                .unlockedBy("blastcarmotdust", has(ItemList.itemIngotCarmot))
                .save(consumer, new ResourceLocation("extraores:blastcarmotdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustCelenegil), ItemList.itemIngotCelenegil, 0.75F, 10)
                .unlockedBy("blastcelenegildust", has(ItemList.itemIngotCelenegil))
                .save(consumer, new ResourceLocation("extraores:blastcelenegildust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustCeruclase), ItemList.itemIngotCeruclase, 0.75F, 10)
                .unlockedBy("blastceruclasedust", has(ItemList.itemIngotCeruclase))
                .save(consumer, new ResourceLocation("extraores:blastceruclasedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustChromium), ItemList.itemIngotChromium, 0.75F, 10)
                .unlockedBy("blastchromiumdust", has(ItemList.itemIngotChromium))
                .save(consumer, new ResourceLocation("extraores:blastchromiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustCobalt), ItemList.itemIngotCobalt, 0.75F, 10)
                .unlockedBy("blastcobaltdust", has(ItemList.itemIngotCobalt))
                .save(consumer, new ResourceLocation("extraores:blastcobaltdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustCopper), ItemList.itemIngotCopper, 0.75F, 10)
                .unlockedBy("blastcopperdust", has(ItemList.itemIngotCopper))
                .save(consumer, new ResourceLocation("extraores:blastcopperdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustDeepIron), ItemList.itemIngotDeepIron, 0.75F, 10)
                .unlockedBy("blastdeepirondust", has(ItemList.itemIngotDeepIron))
                .save(consumer, new ResourceLocation("extraores:blastdeepirondust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustDesichalkos), ItemList.itemIngotDesichalkos, 0.75F, 10)
                .unlockedBy("blastdesichalkosdust", has(ItemList.itemIngotDesichalkos))
                .save(consumer, new ResourceLocation("extraores:blastdesichalkosdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustEximite), ItemList.itemIngotEximite, 0.75F, 10)
                .unlockedBy("blasteximitedust", has(ItemList.itemIngotEximite))
                .save(consumer, new ResourceLocation("extraores:blasteximitedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustGallium), ItemList.itemIngotGallium, 0.75F, 10)
                .unlockedBy("blastgalliumdust", has(ItemList.itemIngotGallium))
                .save(consumer, new ResourceLocation("extraores:blastgalliumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustHaderoth), ItemList.itemIngotHaderoth, 0.75F, 10)
                .unlockedBy("blasthaderothdust", has(ItemList.itemIngotHaderoth))
                .save(consumer, new ResourceLocation("extraores:blasthaderothdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustHepatizon), ItemList.itemIngotHepatizon, 0.75F, 10)
                .unlockedBy("blasthepatizondust", has(ItemList.itemIngotHepatizon))
                .save(consumer, new ResourceLocation("extraores:blasthepatizondust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustIgnatius), ItemList.itemIngotIgnatius, 0.75F, 10)
                .unlockedBy("blastignatiusdust", has(ItemList.itemIngotIgnatius))
                .save(consumer, new ResourceLocation("extraores:blastignatiusdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustIndium), ItemList.itemIngotIndium, 0.75F, 10)
                .unlockedBy("blastindiumdust", has(ItemList.itemIngotIndium))
                .save(consumer, new ResourceLocation("extraores:blastindiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustInfuscolium), ItemList.itemIngotInfuscolium, 0.75F, 10)
                .unlockedBy("blastinfuscoliumdust", has(ItemList.itemIngotInfuscolium))
                .save(consumer, new ResourceLocation("extraores:blastinfuscoliumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustInolashite), ItemList.itemIngotInolashite, 0.75F, 10)
                .unlockedBy("blastinolashitedust", has(ItemList.itemIngotInolashite))
                .save(consumer, new ResourceLocation("extraores:blastinolashitedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustIridium), ItemList.itemIngotIridium, 0.75F, 10)
                .unlockedBy("blastiridiumdust", has(ItemList.itemIngotIridium))
                .save(consumer, new ResourceLocation("extraores:blastiridiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustKalendrite), ItemList.itemIngotKalendrite, 0.75F, 10)
                .unlockedBy("blastkalendritedust", has(ItemList.itemIngotKalendrite))
                .save(consumer, new ResourceLocation("extraores:blastkalendritedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustLead), ItemList.itemIngotLead, 0.75F, 10)
                .unlockedBy("blastleaddust", has(ItemList.itemIngotLead))
                .save(consumer, new ResourceLocation("extraores:blastleaddust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustLemurite), ItemList.itemIngotLemurite, 0.75F, 10)
                .unlockedBy("blastlemuritedust", has(ItemList.itemIngotLemurite))
                .save(consumer, new ResourceLocation("extraores:blastlemuritedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustManganese), ItemList.itemIngotManganese, 0.75F, 10)
                .unlockedBy("blastmanganesedust", has(ItemList.itemIngotManganese))
                .save(consumer, new ResourceLocation("extraores:blastmanganesedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustMeutoite), ItemList.itemIngotMeutoite, 0.75F, 10)
                .unlockedBy("blastmeutoitedust", has(ItemList.itemIngotMeutoite))
                .save(consumer, new ResourceLocation("extraores:blastmeutoitedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustMidasium), ItemList.itemIngotMidasium, 0.75F, 10)
                .unlockedBy("blastmidasiumdust", has(ItemList.itemIngotMidasium))
                .save(consumer, new ResourceLocation("extraores:blastmidasiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustMithril), ItemList.itemIngotMithril, 0.75F, 10)
                .unlockedBy("blastmithrildust", has(ItemList.itemIngotMithril))
                .save(consumer, new ResourceLocation("extraores:blastmithrildust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustMolybdenum), ItemList.itemIngotMolybdenum, 0.75F, 10)
                .unlockedBy("blastmolybdenumdust", has(ItemList.itemIngotMolybdenum))
                .save(consumer, new ResourceLocation("extraores:blastmolybdenumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustNeodymium), ItemList.itemIngotNeodymium, 0.75F, 10)
                .unlockedBy("blastneodymiumdust", has(ItemList.itemIngotNeodymium))
                .save(consumer, new ResourceLocation("extraores:blastneodymiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustNeptunium), ItemList.itemIngotNeptunium, 0.75F, 10)
                .unlockedBy("blastneptuniumdust", has(ItemList.itemIngotNeptunium))
                .save(consumer, new ResourceLocation("extraores:blastneptuniumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustNickel), ItemList.itemIngotNickel, 0.75F, 10)
                .unlockedBy("blastnickeldust", has(ItemList.itemIngotNickel))
                .save(consumer, new ResourceLocation("extraores:blastnickeldust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustNiobium), ItemList.itemIngotNiobium, 0.75F, 10)
                .unlockedBy("blastniobiumdust", has(ItemList.itemIngotNiobium))
                .save(consumer, new ResourceLocation("extraores:blastniobiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustOrichalcum), ItemList.itemIngotOrichalcum, 0.75F, 10)
                .unlockedBy("blastorichalcumdust", has(ItemList.itemIngotOrichalcum))
                .save(consumer, new ResourceLocation("extraores:blastorichalcumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustOureclase), ItemList.itemIngotOureclase, 0.75F, 10)
                .unlockedBy("blastoureclasedust", has(ItemList.itemIngotOureclase))
                .save(consumer, new ResourceLocation("extraores:blastoureclasedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustPalladium), ItemList.itemIngotPalladium, 0.75F, 10)
                .unlockedBy("blastpalladiumdust", has(ItemList.itemIngotPalladium))
                .save(consumer, new ResourceLocation("extraores:blastpalladiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustPlatinum), ItemList.itemIngotPlatinum, 0.75F, 10)
                .unlockedBy("blastplatinumdust", has(ItemList.itemIngotPlatinum))
                .save(consumer, new ResourceLocation("extraores:blastplatinumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustPlutonium), ItemList.itemIngotPlutonium, 0.75F, 10)
                .unlockedBy("blastplutoniumdust", has(ItemList.itemIngotPlutonium))
                .save(consumer, new ResourceLocation("extraores:blastplutoniumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustPolonium), ItemList.itemIngotPolonium, 0.75F, 10)
                .unlockedBy("blastpoloniumdust", has(ItemList.itemIngotPolonium))
                .save(consumer, new ResourceLocation("extraores:blastpoloniumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustPromethium), ItemList.itemIngotPromethium, 0.75F, 10)
                .unlockedBy("blastpromethiumdust", has(ItemList.itemIngotPromethium))
                .save(consumer, new ResourceLocation("extraores:blastpromethiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustRhenium), ItemList.itemIngotRhenium, 0.75F, 10)
                .unlockedBy("blastrheniumdust", has(ItemList.itemIngotRhenium))
                .save(consumer, new ResourceLocation("extraores:blastrheniumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustRhodium), ItemList.itemIngotRhodium, 0.75F, 10)
                .unlockedBy("blastrhodiumdust", has(ItemList.itemIngotRhodium))
                .save(consumer, new ResourceLocation("extraores:blastrhodiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustRubracium), ItemList.itemIngotRubracium, 0.75F, 10)
                .unlockedBy("blastrubraciumdust", has(ItemList.itemIngotRubracium))
                .save(consumer, new ResourceLocation("extraores:blastrubraciumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustRuthenium), ItemList.itemIngotRuthenium, 0.75F, 10)
                .unlockedBy("blastrutheniumdust", has(ItemList.itemIngotRuthenium))
                .save(consumer, new ResourceLocation("extraores:blastrutheniumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustSanguinite), ItemList.itemIngotSanguinite, 0.75F, 10)
                .unlockedBy("blastsanguinitedust", has(ItemList.itemIngotSanguinite))
                .save(consumer, new ResourceLocation("extraores:blastsanguinitedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustShadowIron), ItemList.itemIngotShadowIron, 0.75F, 10)
                .unlockedBy("blastshadowirondust", has(ItemList.itemIngotShadowIron))
                .save(consumer, new ResourceLocation("extraores:blastshadowirondust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustSilver), ItemList.itemIngotSilver, 0.75F, 10)
                .unlockedBy("blastsilverdust", has(ItemList.itemIngotSilver))
                .save(consumer, new ResourceLocation("extraores:blastsilverdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustTantalum), ItemList.itemIngotTantalum, 0.75F, 10)
                .unlockedBy("blasttantalumdust", has(ItemList.itemIngotTantalum))
                .save(consumer, new ResourceLocation("extraores:blasttantalumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustTartarite), ItemList.itemIngotTartarite, 0.75F, 10)
                .unlockedBy("blasttartaritedust", has(ItemList.itemIngotTartarite))
                .save(consumer, new ResourceLocation("extraores:blasttartaritedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustTechnetium), ItemList.itemIngotTechnetium, 0.75F, 10)
                .unlockedBy("blasttechnetiumdust", has(ItemList.itemIngotTechnetium))
                .save(consumer, new ResourceLocation("extraores:blasttechnetiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustThallium), ItemList.itemIngotThallium, 0.75F, 10)
                .unlockedBy("blastthalliumdust", has(ItemList.itemIngotThallium))
                .save(consumer, new ResourceLocation("extraores:blastthalliumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustTin), ItemList.itemIngotTin, 0.75F, 10)
                .unlockedBy("blasttindust", has(ItemList.itemIngotTin))
                .save(consumer, new ResourceLocation("extraores:blasttindust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustTitanium), ItemList.itemIngotTitanium, 0.75F, 10)
                .unlockedBy("blasttitaniumdust", has(ItemList.itemIngotTitanium))
                .save(consumer, new ResourceLocation("extraores:blasttitaniumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustTungsten), ItemList.itemIngotTungsten, 0.75F, 10)
                .unlockedBy("blasttungstendust", has(ItemList.itemIngotTungsten))
                .save(consumer, new ResourceLocation("extraores:blasttungstendust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustUnobtainium), ItemList.itemIngotUnobtainium, 0.75F, 10)
                .unlockedBy("blastunobtainiumdust", has(ItemList.itemIngotUnobtainium))
                .save(consumer, new ResourceLocation("extraores:blastunobtainiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustUranium), ItemList.itemIngotUranium, 0.75f, 10)
                .unlockedBy("blasturaniumdust", has(ItemList.itemIngotUranium))
                .save(consumer, new ResourceLocation("extraores:blasturaniumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustVanadium), ItemList.itemIngotVanadium, 0.75F, 10)
                .unlockedBy("blastvanadiumdust", has(ItemList.itemIngotVanadium))
                .save(consumer, new ResourceLocation("extraores:blastvanadiumdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustVulcanite), ItemList.itemIngotVulcanite, 0.75F, 10)
                .unlockedBy("blastvulcanitedust", has(ItemList.itemIngotVulcanite))
                .save(consumer, new ResourceLocation("extraores:blastvulcanitedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustVyroxeres), ItemList.itemIngotVyroxeres, 0.75F, 10)
                .unlockedBy("blastvyroxeresdust", has(ItemList.itemIngotVyroxeres))
                .save(consumer, new ResourceLocation("extraores:blastvyroxeresdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustYellorite), ItemList.itemIngotYellorite, 0.75F, 10)
                .unlockedBy("blastyelloritedust", has(ItemList.itemIngotYellorite))
                .save(consumer, new ResourceLocation("extraores:blastyelloritedust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustZinc), ItemList.itemIngotZinc, 0.75F, 10)
                .unlockedBy("blastzincdust", has(ItemList.itemIngotZinc))
                .save(consumer, new ResourceLocation("extraores:blastzincdust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.dustZirconium), ItemList.itemIngotZirconium, 0.75F, 10)
                .unlockedBy("blastzirconiumdust", has(ItemList.itemIngotZirconium))
                .save(consumer, new ResourceLocation("extraores:blastzirconiumdust"));
        //Blasting Raw Ore
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawAdamantine), ItemList.itemIngotAdamantine, 0.75F, 20)
                .unlockedBy("blastrawadamantine", has(ItemList.itemIngotAdamantine))
                .save(consumer, new ResourceLocation("extraores:blastrawadamantine"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawAldourite), ItemList.itemIngotAldourite, 0.75F, 20)
                .unlockedBy("blastrawaldourite", has(ItemList.itemIngotAldourite))
                .save(consumer, new ResourceLocation("extraores:blastrawaldourite"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawAluminum), ItemList.itemIngotAluminum, 0.75F, 20)
                .unlockedBy("blastrawaluminum", has(ItemList.itemIngotAluminum))
                .save(consumer, new ResourceLocation("extraores:blastrawaluminum"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawAmericium), ItemList.itemIngotAmericium, 0.75F, 20)
                .unlockedBy("blastrawamericium", has(ItemList.itemIngotAmericium))
                .save(consumer, new ResourceLocation("extraores:blastrawamericium"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawAmordrine), ItemList.itemIngotAmordrine, 0.75F, 20)
                .unlockedBy("blastrawamordrine", has(ItemList.itemIngotAmordrine))
                .save(consumer, new ResourceLocation("extraores:blastrawamordrine"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawAngmallen), ItemList.itemIngotAngmallen, 0.75F, 20)
                .unlockedBy("blastrawangmallen", has(ItemList.itemIngotAngmallen))
                .save(consumer, new ResourceLocation("extraores:blastrawangmallen"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawAstralSilver), ItemList.itemIngotAstralSilver, 0.75F, 20)
                .unlockedBy("blastrawastralsilver", has(ItemList.itemIngotAstralSilver))
                .save(consumer, new ResourceLocation("extraores:blastrawastralsilver"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawAtlarus), ItemList.itemIngotAtlarus, 0.75F, 20)
                .unlockedBy("blastrawatlarus", has(ItemList.itemIngotAtlarus))
                .save(consumer, new ResourceLocation("extraores:blastrawatlarus"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawBismuth), ItemList.itemIngotBismuth, 0.75F, 20)
                .unlockedBy("blastrawbismuth", has(ItemList.itemIngotBismuth))
                .save(consumer, new ResourceLocation("extraores:blastrawbismuth"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawBlackSteel), ItemList.itemIngotBlackSteel, 0.75F, 20)
                .unlockedBy("blastrawblacksteel", has(ItemList.itemIngotBlackSteel))
                .save(consumer, new ResourceLocation("extraores:blastrawblacksteel"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawCadmium), ItemList.itemIngotCadmium, 0.75F, 20)
                .unlockedBy("blastrawcadmium", has(ItemList.itemIngotCadmium))
                .save(consumer, new ResourceLocation("extraores:blastrawcadmium"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawCarmot), ItemList.itemIngotCarmot, 0.75F, 20)
                .unlockedBy("blastrawcarmot", has(ItemList.itemIngotCarmot))
                .save(consumer, new ResourceLocation("extraores:blastrawcarmot"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawCelenegil), ItemList.itemIngotCelenegil, 0.75F, 20)
                .unlockedBy("blastrawcelenegil", has(ItemList.itemIngotCelenegil))
                .save(consumer, new ResourceLocation("extraores:blastrawcelenegil"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawCeruclase), ItemList.itemIngotCeruclase, 0.75F, 20)
                .unlockedBy("blastrawceruclase", has(ItemList.itemIngotCeruclase))
                .save(consumer, new ResourceLocation("extraores:blastrawceruclase"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawChromium), ItemList.itemIngotChromium, 0.75F, 20)
                .unlockedBy("blastrawchromium", has(ItemList.itemIngotChromium))
                .save(consumer, new ResourceLocation("extraores:blastrawchromium"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawCobalt), ItemList.itemIngotCobalt, 0.75F, 20)
                .unlockedBy("blastrawcobalt", has(ItemList.itemIngotCobalt))
                .save(consumer, new ResourceLocation("extraores:blastrawcobalt"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawCopper), ItemList.itemIngotCopper, 0.75F, 20)
                .unlockedBy("blastrawcopper", has(ItemList.itemIngotCopper))
                .save(consumer, new ResourceLocation("extraores:blastrawcopper"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawDeepIron), ItemList.itemIngotDeepIron, 0.75F, 20)
                .unlockedBy("blastrawdeepiron", has(ItemList.itemIngotDeepIron))
                .save(consumer, new ResourceLocation("extraores:blastrawdeepiron"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawDesichalkos), ItemList.itemIngotDesichalkos, 0.75F, 20)
                .unlockedBy("blastrawdesichalkos", has(ItemList.itemIngotDesichalkos))
                .save(consumer, new ResourceLocation("extraores:blastrawdesichalkos"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawEximite), ItemList.itemIngotEximite, 0.75F, 20)
                .unlockedBy("blastraweximite", has(ItemList.itemIngotEximite))
                .save(consumer, new ResourceLocation("extraores:blastraweximite"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawGallium), ItemList.itemIngotGallium, 0.75F, 20)
                .unlockedBy("blastrawgallium", has(ItemList.itemIngotGallium))
                .save(consumer, new ResourceLocation("extraores:blastrawgallium"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawHaderoth), ItemList.itemIngotHaderoth, 0.75F, 20)
                .unlockedBy("blastrawhaderoth", has(ItemList.itemIngotHaderoth))
                .save(consumer, new ResourceLocation("extraores:blastrawhaderoth"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawHepatizon), ItemList.itemIngotHepatizon, 0.75F, 20)
                .unlockedBy("blastrawhepatizon", has(ItemList.itemIngotHepatizon))
                .save(consumer, new ResourceLocation("extraores:blastrawhepatizon"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawIgnatius), ItemList.itemIngotIgnatius, 0.75F, 20)
                .unlockedBy("blastrawignatius", has(ItemList.itemIngotIgnatius))
                .save(consumer, new ResourceLocation("extraores:blastrawignatius"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawIndium), ItemList.itemIngotIndium, 0.75F, 20)
                .unlockedBy("blastrawindium", has(ItemList.itemIngotIndium))
                .save(consumer, new ResourceLocation("extraores:blastrawindium"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawInfuscolium), ItemList.itemIngotInfuscolium, 0.75F, 20)
                .unlockedBy("blastrawinfuscolium", has(ItemList.itemIngotInfuscolium))
                .save(consumer, new ResourceLocation("extraores:blastrawinfuscolium"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawInolashite), ItemList.itemIngotInolashite, 0.75F, 20)
                .unlockedBy("blastrawinolashite", has(ItemList.itemIngotInolashite))
                .save(consumer, new ResourceLocation("extraores:blastrawinolashite"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawIridium), ItemList.itemIngotIridium, 0.75F, 20)
                .unlockedBy("blastrawiridium", has(ItemList.itemIngotIridium))
                .save(consumer, new ResourceLocation("extraores:blastrawiridium"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawKalendrite), ItemList.itemIngotKalendrite, 0.75F, 20)
                .unlockedBy("blastrawkalendrite", has(ItemList.itemIngotKalendrite))
                .save(consumer, new ResourceLocation("extraores:blastrawkalendrite"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawLead), ItemList.itemIngotLead, 0.75F, 20)
                .unlockedBy("blastrawlead", has(ItemList.itemIngotLead))
                .save(consumer, new ResourceLocation("extraores:blastrawlead"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawLemurite), ItemList.itemIngotLemurite, 0.75F, 20)
                .unlockedBy("blastrawlemurite", has(ItemList.itemIngotLemurite))
                .save(consumer, new ResourceLocation("extraores:blastrawlemurite"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawManganese), ItemList.itemIngotManganese, 0.75F, 20)
                .unlockedBy("blastrawmanganese", has(ItemList.itemIngotManganese))
                .save(consumer, new ResourceLocation("extraores:blastrawmanganese"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawMeutoite), ItemList.itemIngotMeutoite, 0.75F, 20)
                .unlockedBy("blastrawmeutoite", has(ItemList.itemIngotMeutoite))
                .save(consumer, new ResourceLocation("extraores:blastrawmeutoite"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawMidasium), ItemList.itemIngotMidasium, 0.75F, 20)
                .unlockedBy("blastrawmidasium", has(ItemList.itemIngotMidasium))
                .save(consumer, new ResourceLocation("extraores:blastrawmidasium"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawMithril), ItemList.itemIngotMithril, 0.75F, 20)
                .unlockedBy("blastrawmithril", has(ItemList.itemIngotMithril))
                .save(consumer, new ResourceLocation("extraores:blastrawmithril"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawMolybdenum), ItemList.itemIngotMolybdenum, 0.75F, 20)
                .unlockedBy("blastrawmolybdenum", has(ItemList.itemIngotMolybdenum))
                .save(consumer, new ResourceLocation("extraores:blastrawmolybdenum"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawNeodymium), ItemList.itemIngotNeodymium, 0.75F, 20)
                .unlockedBy("blastrawneodymium", has(ItemList.itemIngotNeodymium))
                .save(consumer, new ResourceLocation("extraores:blastrawneodymium"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawNeptunium), ItemList.itemIngotNeptunium, 0.75F, 20)
                .unlockedBy("blastrawneptunium", has(ItemList.itemIngotNeptunium))
                .save(consumer, new ResourceLocation("extraores:blastrawneptunium"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawNickel), ItemList.itemIngotNickel, 0.75F, 20)
                .unlockedBy("blastrawnickel", has(ItemList.itemIngotNickel))
                .save(consumer, new ResourceLocation("extraores:blastrawnickel"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawNiobium), ItemList.itemIngotNiobium, 0.75F, 20)
                .unlockedBy("blastrawniobium", has(ItemList.itemIngotNiobium))
                .save(consumer, new ResourceLocation("extraores:blastrawniobium"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawOrichalcum), ItemList.itemIngotOrichalcum, 0.75F, 20)
                .unlockedBy("blastraworichalcum", has(ItemList.itemIngotOrichalcum))
                .save(consumer, new ResourceLocation("extraores:blastraworichalcum"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawOureclase), ItemList.itemIngotOureclase, 0.75F, 20)
                .unlockedBy("blastrawoureclase", has(ItemList.itemIngotOureclase))
                .save(consumer, new ResourceLocation("extraores:blastrawoureclase"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawPalladium), ItemList.itemIngotPalladium, 0.75F, 20)
                .unlockedBy("blastrawpalladium", has(ItemList.itemIngotPalladium))
                .save(consumer, new ResourceLocation("extraores:blastrawpalladium"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawPlatinum), ItemList.itemIngotPlatinum, 0.75F, 20)
                .unlockedBy("blastrawplatinum", has(ItemList.itemIngotPlatinum))
                .save(consumer, new ResourceLocation("extraores:blastrawplatinum"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawPlutonium), ItemList.itemIngotPlutonium, 0.75F, 20)
                .unlockedBy("blastrawplutonium", has(ItemList.itemIngotPlutonium))
                .save(consumer, new ResourceLocation("extraores:blastrawplutonium"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawPolonium), ItemList.itemIngotPolonium, 0.75F, 20)
                .unlockedBy("blastrawpolonium", has(ItemList.itemIngotPolonium))
                .save(consumer, new ResourceLocation("extraores:blastrawpolonium"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawPromethium), ItemList.itemIngotPromethium, 0.75F, 20)
                .unlockedBy("blastrawpromethium", has(ItemList.itemIngotPromethium))
                .save(consumer, new ResourceLocation("extraores:blastrawpromethium"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawRhenium), ItemList.itemIngotRhenium, 0.75F, 20)
                .unlockedBy("blastrawrhenium", has(ItemList.itemIngotRhenium))
                .save(consumer, new ResourceLocation("extraores:blastrawrhenium"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawRhodium), ItemList.itemIngotRhodium, 0.75F, 20)
                .unlockedBy("blastrawrhodium", has(ItemList.itemIngotRhodium))
                .save(consumer, new ResourceLocation("extraores:blastrawrhodium"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawRubracium), ItemList.itemIngotRubracium, 0.75F, 20)
                .unlockedBy("blastrawrubracium", has(ItemList.itemIngotRubracium))
                .save(consumer, new ResourceLocation("extraores:blastrawrubracium"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawRuthenium), ItemList.itemIngotRuthenium, 0.75F, 20)
                .unlockedBy("blastrawruthenium", has(ItemList.itemIngotRuthenium))
                .save(consumer, new ResourceLocation("extraores:blastrawruthenium"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawSanguinite), ItemList.itemIngotSanguinite, 0.75F, 20)
                .unlockedBy("blastrawsanguinite", has(ItemList.itemIngotSanguinite))
                .save(consumer, new ResourceLocation("extraores:blastrawsanguinite"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawShadowIron), ItemList.itemIngotShadowIron, 0.75F, 20)
                .unlockedBy("blastrawshadowiron", has(ItemList.itemIngotShadowIron))
                .save(consumer, new ResourceLocation("extraores:blastrawshadowiron"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawSilver), ItemList.itemIngotSilver, 0.75F, 20)
                .unlockedBy("blastrawsilver", has(ItemList.itemIngotSilver))
                .save(consumer, new ResourceLocation("extraores:blastrawsilver"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawTantalum), ItemList.itemIngotTantalum, 0.75F, 20)
                .unlockedBy("blastrawtantalum", has(ItemList.itemIngotTantalum))
                .save(consumer, new ResourceLocation("extraores:blastrawtantalum"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawTartarite), ItemList.itemIngotTartarite, 0.75F, 20)
                .unlockedBy("blastrawtartarite", has(ItemList.itemIngotTartarite))
                .save(consumer, new ResourceLocation("extraores:blastrawtartarite"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawTechnetium), ItemList.itemIngotTechnetium, 0.75F, 20)
                .unlockedBy("blastrawtechnetium", has(ItemList.itemIngotTechnetium))
                .save(consumer, new ResourceLocation("extraores:blastrawtechnetium"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawThallium), ItemList.itemIngotThallium, 0.75F, 20)
                .unlockedBy("blastrawthallium", has(ItemList.itemIngotThallium))
                .save(consumer, new ResourceLocation("extraores:blastrawthallium"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawTin), ItemList.itemIngotTin, 0.75F, 20)
                .unlockedBy("blastrawtin", has(ItemList.itemIngotTin))
                .save(consumer, new ResourceLocation("extraores:blastrawtin"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawTitanium), ItemList.itemIngotTitanium, 0.75F, 20)
                .unlockedBy("blastrawtitanium", has(ItemList.itemIngotTitanium))
                .save(consumer, new ResourceLocation("extraores:blastrawtitanium"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawTungsten), ItemList.itemIngotTungsten, 0.75F, 20)
                .unlockedBy("blastrawtungsten", has(ItemList.itemIngotTungsten))
                .save(consumer, new ResourceLocation("extraores:blastrawtungsten"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawUnobtainium), ItemList.itemIngotUnobtainium, 0.75F, 20)
                .unlockedBy("blastrawunobtainium", has(ItemList.itemIngotUnobtainium))
                .save(consumer, new ResourceLocation("extraores:blastrawunobtainium"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawUranium), ItemList.itemIngotUranium, 0.75f, 20)
                .unlockedBy("blastrawuranium", has(ItemList.itemIngotUranium))
                .save(consumer, new ResourceLocation("extraores:blastrawuranium"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawVanadium), ItemList.itemIngotVanadium, 0.75F, 20)
                .unlockedBy("blastrawvanadium", has(ItemList.itemIngotVanadium))
                .save(consumer, new ResourceLocation("extraores:blastrawvanadium"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawVulcanite), ItemList.itemIngotVulcanite, 0.75F, 20)
                .unlockedBy("blastrawvulcanite", has(ItemList.itemIngotVulcanite))
                .save(consumer, new ResourceLocation("extraores:blastrawvulcanite"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawVyroxeres), ItemList.itemIngotVyroxeres, 0.75F, 20)
                .unlockedBy("blastrawvyroxeres", has(ItemList.itemIngotVyroxeres))
                .save(consumer, new ResourceLocation("extraores:blastrawvyroxeres"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawYellorite), ItemList.itemIngotYellorite, 0.75F, 20)
                .unlockedBy("blastrawyellorite", has(ItemList.itemIngotYellorite))
                .save(consumer, new ResourceLocation("extraores:blastrawyellorite"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawZinc), ItemList.itemIngotZinc, 0.75F, 20)
                .unlockedBy("blastrawzinc", has(ItemList.itemIngotZinc))
                .save(consumer, new ResourceLocation("extraores:blastrawzinc"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTagList.rawZirconium), ItemList.itemIngotZirconium, 0.75F, 20)
                .unlockedBy("blastrawzirconium", has(ItemList.itemIngotZirconium))
                .save(consumer, new ResourceLocation("extraores:blastrawzirconium"));
        buildMekanismInjecting(consumer);
        buildMekanismPurifying(consumer);
        buildMekanismCrushing(consumer);
        buildMekanismEnriching(consumer);
    }
    protected void buildMekanismInjecting(Consumer<FinishedRecipe> consumer)
    {
        //Ore
        ItemStackChemicalToItemStackRecipeBuilder.injecting(
                IngredientCreatorAccess.item().from(ItemTagList.oreAdamantine),
                IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),
                new ItemStack(ItemList.itemShardAdamantine,4))
                .addCriterion("injectadamantineore",has(BlockList.blockOreAdamantine))
                .build(consumer,new ResourceLocation("extraores:injectadamantineore"));
        //Raw
        ItemStackChemicalToItemStackRecipeBuilder.injecting(
                IngredientCreatorAccess.item().from(ItemTagList.rawAdamantine),
                IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:hydrogen_chloride")),1)),
                new ItemStack(ItemList.itemShardAdamantine,4))
                .addCriterion("injectrawadamantine",has(ItemList.itemRawAdamantine))
                .build(consumer,new ResourceLocation("extraores:injectrawadamantine"));
    }
    protected void buildMekanismPurifying(Consumer<FinishedRecipe> consumer)
    {
        //Ore
        ItemStackChemicalToItemStackRecipeBuilder.purifying(
                IngredientCreatorAccess.item().from(ItemTagList.oreAdamantine),
                IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),
                new ItemStack(ItemList.itemClumpAdamantine,3))
                .addCriterion("purifyadamantineore",has(BlockList.blockOreAdamantine))
                .build(consumer,new ResourceLocation("extraores:purifyadamantineore"));
        //Raw
        ItemStackChemicalToItemStackRecipeBuilder.purifying(
                IngredientCreatorAccess.item().from(ItemTagList.rawAdamantine),
                IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),
                new ItemStack(ItemList.itemClumpAdamantine,3))
                .addCriterion("purifyrawadamantine",has(ItemList.itemRawAdamantine))
                .build(consumer,new ResourceLocation("extraores:purifyrawadamantine"));
        //Shard
        ItemStackChemicalToItemStackRecipeBuilder.purifying(
                IngredientCreatorAccess.item().from(ItemTagList.shardAdamantine),
                IngredientCreatorAccess.gas().from(new GasStack(MekanismAPI.gasRegistry().getValue(new ResourceLocation("mekanism:oxygen")),1)),
                new ItemStack(ItemList.itemClumpAdamantine))
                .addCriterion("purifyadamantine",has(ItemList.itemShardAdamantine))
                .build(consumer,new ResourceLocation("extraores:purifyadamantine"));
    }
    protected void buildMekanismCrushing(Consumer<FinishedRecipe> consumer)
    {
        ItemStackToItemStackRecipeBuilder.crushing(
                IngredientCreatorAccess.item().from(ItemTagList.clumpAdamantine),new ItemStack(ItemList.itemDirtyDustAdamantine))
                .addCriterion("crushadamantine",has(ItemList.itemClumpAdamantine))
                .build(consumer,new ResourceLocation("extraores:crushadamantine"));
    }
    protected void buildMekanismEnriching(Consumer<FinishedRecipe> consumer)
    {
        //Ore
        ItemStackToItemStackRecipeBuilder.enriching(
                IngredientCreatorAccess.item().from(ItemTagList.oreAdamantine),
                new ItemStack(ItemList.itemDustAdamantine,2))
                .addCriterion("enrichadamantineore",has(BlockList.blockOreAdamantine))
                .build(consumer,new ResourceLocation("extraores:enrichadamantineore"));
        //Raw
        ItemStackToItemStackRecipeBuilder.enriching(
                IngredientCreatorAccess.item().from(ItemTagList.rawAdamantine),
                new ItemStack(ItemList.itemDustAdamantine,2))
                .addCriterion("enrichrawadamantine",has(ItemList.itemRawAdamantine))
                .build(consumer,new ResourceLocation("extraores:enrichrawadamantine"));
        //Dirty Dust
        ItemStackToItemStackRecipeBuilder.enriching(
                IngredientCreatorAccess.item().from(ItemTagList.dirtyDustAdamantine),
                new ItemStack(ItemList.itemDustAdamantine))
                .addCriterion("enrichdirtyadamantinedust",has(ItemList.itemDirtyDustAdamantine))
                .build(consumer,new ResourceLocation("extraores:enrichdirtyadmantinedust"));
    }
    @Override
    @MethodsReturnNonnullByDefault
    public String getName()
    {
        return "Extra Ores Recipes";
    }
}

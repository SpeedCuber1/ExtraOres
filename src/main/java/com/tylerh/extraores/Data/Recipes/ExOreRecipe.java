package com.tylerh.extraores.Data.Recipes;

import com.tylerh.extraores.Init.BlockList;
import com.tylerh.extraores.Init.ItemList;
import net.minecraft.data.*;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Consumer;


public class ExOreRecipe extends RecipeProvider
{
    public ExOreRecipe(DataGenerator gen)
    {
        super(gen);
    }
    @Override
    public void buildCraftingRecipes(Consumer<FinishedRecipe> consumer)
    {
        //Ingot To Block
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
        //Block to Ingot
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
        //Smelting Ore
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreAdamantine.asItem()),ItemList.itemIngotAdamantine,0.75F,40)
                .unlockedBy("smeltadamantineore",has(ItemList.itemIngotAdamantine))
                .save(consumer,new ResourceLocation("extraores:smeltadamantineore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreAldourite.asItem()),ItemList.itemIngotAldourite,0.75F,40)
                .unlockedBy("smeltaldouriteore",has(ItemList.itemIngotAldourite))
                .save(consumer,new ResourceLocation("extraores:smeltaldouriteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreAluminum.asItem()),ItemList.itemIngotAluminum,0.75F,40)
                .unlockedBy("smeltaluminumore",has(ItemList.itemIngotAluminum))
                .save(consumer,new ResourceLocation("extraores:smeltaluminumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreAmericium.asItem()),ItemList.itemIngotAmericium,0.75F,40)
                .unlockedBy("smeltamericiumore",has(ItemList.itemIngotAmericium))
                .save(consumer,new ResourceLocation("extraores:smeltamericiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreAmordrine.asItem()),ItemList.itemIngotAmordrine,0.75F,40)
                .unlockedBy("smeltamordrineore",has(ItemList.itemIngotAmordrine))
                .save(consumer,new ResourceLocation("extraores:smeltamordrineore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreAngmallen.asItem()),ItemList.itemIngotAngmallen,0.75F,40)
                .unlockedBy("smeltangmallenore",has(ItemList.itemIngotAngmallen))
                .save(consumer,new ResourceLocation("extraores:smeltangmallenore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreAstralSilver.asItem()),ItemList.itemIngotAstralSilver,0.75F,40)
                .unlockedBy("smeltastralsilverore",has(ItemList.itemIngotAstralSilver))
                .save(consumer,new ResourceLocation("extraores:smeltastralsilverore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreAtlarus.asItem()),ItemList.itemIngotAtlarus,0.75F,40)
                .unlockedBy("smeltatlarusore",has(ItemList.itemIngotAtlarus))
                .save(consumer,new ResourceLocation("extraores:smeltatlarusore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreBismuth.asItem()),ItemList.itemIngotBismuth,0.75F,40)
                .unlockedBy("smeltbismuthore",has(ItemList.itemIngotBismuth))
                .save(consumer,new ResourceLocation("extraores:smeltbismuthore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreBlackSteel.asItem()),ItemList.itemIngotBlackSteel,0.75F,40)
                .unlockedBy("smeltblacksteelore",has(ItemList.itemIngotBlackSteel))
                .save(consumer,new ResourceLocation("extraores:smeltblacksteelore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreCadmium.asItem()),ItemList.itemIngotCadmium,0.75F,40)
                .unlockedBy("smeltcadmiumore",has(ItemList.itemIngotCadmium))
                .save(consumer,new ResourceLocation("extraores:smeltcadmiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreCarmot.asItem()),ItemList.itemIngotCarmot,0.75F,40)
                .unlockedBy("smeltcarmotore",has(ItemList.itemIngotCarmot))
                .save(consumer,new ResourceLocation("extraores:smeltcarmotore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreCelenegil.asItem()),ItemList.itemIngotCelenegil,0.75F,40)
                .unlockedBy("smeltcelenegilore",has(ItemList.itemIngotCelenegil))
                .save(consumer,new ResourceLocation("extraores:smeltcelenegilore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreCeruclase.asItem()),ItemList.itemIngotCeruclase,0.75F,40)
                .unlockedBy("smeltceruclaseore",has(ItemList.itemIngotCeruclase))
                .save(consumer,new ResourceLocation("extraores:smeltceruclaseore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreChromium.asItem()),ItemList.itemIngotChromium,0.75F,40)
                .unlockedBy("smeltchromiumore",has(ItemList.itemIngotChromium))
                .save(consumer,new ResourceLocation("extraores:smeltchromiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreCobalt.asItem()),ItemList.itemIngotCobalt,0.75F,40)
                .unlockedBy("smeltcobaltore",has(ItemList.itemIngotCobalt))
                .save(consumer,new ResourceLocation("extraores:smeltcobaltore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreCopper.asItem()),ItemList.itemIngotCopper,0.75F,40)
                .unlockedBy("smeltcopperore",has(ItemList.itemIngotCopper))
                .save(consumer,new ResourceLocation("extraores:smeltcopperore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreDeepIron.asItem()),ItemList.itemIngotDeepIron,0.75F,40)
                .unlockedBy("smeltdeepironore",has(ItemList.itemIngotDeepIron))
                .save(consumer,new ResourceLocation("extraores:smeltdeepironore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreDesichalkos.asItem()),ItemList.itemIngotDesichalkos,0.75F,40)
                .unlockedBy("smeltdesichalkosore",has(ItemList.itemIngotDesichalkos))
                .save(consumer,new ResourceLocation("extraores:smeltdesichalkosore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreEximite.asItem()),ItemList.itemIngotEximite,0.75F,40)
                .unlockedBy("smelteximiteore",has(ItemList.itemIngotEximite))
                .save(consumer,new ResourceLocation("extraores:smelteximiteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreGallium.asItem()),ItemList.itemIngotGallium,0.75F,40)
                .unlockedBy("smeltgalliumore",has(ItemList.itemIngotGallium))
                .save(consumer,new ResourceLocation("extraores:smeltgalliumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreHaderoth.asItem()),ItemList.itemIngotHaderoth,0.75F,40)
                .unlockedBy("smelthaderothore",has(ItemList.itemIngotHaderoth))
                .save(consumer,new ResourceLocation("extraores:smelthaderothore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreHepatizon.asItem()),ItemList.itemIngotHepatizon,0.75F,40)
                .unlockedBy("smelthepatizonore",has(ItemList.itemIngotHepatizon))
                .save(consumer,new ResourceLocation("extraores:smelthepatizonore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreIgnatius.asItem()),ItemList.itemIngotIgnatius,0.75F,40)
                .unlockedBy("smeltignatiusore",has(ItemList.itemIngotIgnatius))
                .save(consumer,new ResourceLocation("extraores:smeltignatiusore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreIndium.asItem()),ItemList.itemIngotIndium,0.75F,40)
                .unlockedBy("smeltindiumore",has(ItemList.itemIngotIndium))
                .save(consumer,new ResourceLocation("extraores:smeltindiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreInfuscolium.asItem()),ItemList.itemIngotInfuscolium,0.75F,40)
                .unlockedBy("smeltinfuscoliumore",has(ItemList.itemIngotInfuscolium))
                .save(consumer,new ResourceLocation("extraores:smeltinfuscoliumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreInolashite.asItem()),ItemList.itemIngotInolashite,0.75F,40)
                .unlockedBy("smeltinolashiteore",has(ItemList.itemIngotInolashite))
                .save(consumer,new ResourceLocation("extraores:smeltinolashiteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreIridium.asItem()),ItemList.itemIngotIridium,0.75F,40)
                .unlockedBy("smeltiridiumore",has(ItemList.itemIngotIridium))
                .save(consumer,new ResourceLocation("extraores:smeltiridiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreKalendrite.asItem()),ItemList.itemIngotKalendrite,0.75F,40)
                .unlockedBy("smeltkalendriteore",has(ItemList.itemIngotKalendrite))
                .save(consumer,new ResourceLocation("extraores:smeltkalendriteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreLead.asItem()),ItemList.itemIngotLead,0.75F,40)
                .unlockedBy("smeltleadore",has(ItemList.itemIngotLead))
                .save(consumer,new ResourceLocation("extraores:smeltleadore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreLemurite.asItem()),ItemList.itemIngotLemurite,0.75F,40)
                .unlockedBy("smeltlemuriteore",has(ItemList.itemIngotLemurite))
                .save(consumer,new ResourceLocation("extraores:smeltlemuriteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreManganese.asItem()),ItemList.itemIngotManganese,0.75F,40)
                .unlockedBy("smeltmanganeseore",has(ItemList.itemIngotManganese))
                .save(consumer,new ResourceLocation("extraores:smeltmanganeseore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreMeutoite.asItem()),ItemList.itemIngotMeutoite,0.75F,40)
                .unlockedBy("smeltmeutoiteore",has(ItemList.itemIngotMeutoite))
                .save(consumer,new ResourceLocation("extraores:smeltmeutoiteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreMidasium.asItem()),ItemList.itemIngotMidasium,0.75F,40)
                .unlockedBy("smeltmidasiumore",has(ItemList.itemIngotMidasium))
                .save(consumer,new ResourceLocation("extraores:smeltmidasiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreMithril.asItem()),ItemList.itemIngotMithril,0.75F,40)
                .unlockedBy("smeltmithrilore",has(ItemList.itemIngotMithril))
                .save(consumer,new ResourceLocation("extraores:smeltmithrilore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreMolybdenum.asItem()),ItemList.itemIngotMolybdenum,0.75F,40)
                .unlockedBy("smeltmolybdenumore",has(ItemList.itemIngotMolybdenum))
                .save(consumer,new ResourceLocation("extraores:smeltmolybdenumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreNeodymium.asItem()),ItemList.itemIngotNeodymium,0.75F,40)
                .unlockedBy("smeltneodymiumore",has(ItemList.itemIngotNeodymium))
                .save(consumer,new ResourceLocation("extraores:smeltneodymiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreNeptunium.asItem()),ItemList.itemIngotNeptunium,0.75F,40)
                .unlockedBy("smeltneptuniumore",has(ItemList.itemIngotNeptunium))
                .save(consumer,new ResourceLocation("extraores:smeltneptuniumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreNickel.asItem()),ItemList.itemIngotNickel,0.75F,40)
                .unlockedBy("smeltnickelore",has(ItemList.itemIngotNickel))
                .save(consumer,new ResourceLocation("extraores:smeltnickelore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreNiobium.asItem()),ItemList.itemIngotNiobium,0.75F,40)
                .unlockedBy("smeltniobiumore",has(ItemList.itemIngotNiobium))
                .save(consumer,new ResourceLocation("extraores:smeltniobiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreOrichalcum.asItem()),ItemList.itemIngotOrichalcum,0.75F,40)
                .unlockedBy("smeltorichalcumore",has(ItemList.itemIngotOrichalcum))
                .save(consumer,new ResourceLocation("extraores:smeltorichalcumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreOureclase.asItem()),ItemList.itemIngotOureclase,0.75F,40)
                .unlockedBy("smeltoureclaseore",has(ItemList.itemIngotOureclase))
                .save(consumer,new ResourceLocation("extraores:smeltoureclaseore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOrePalladium.asItem()),ItemList.itemIngotPalladium,0.75F,40)
                .unlockedBy("smeltpalladiumore",has(ItemList.itemIngotPalladium))
                .save(consumer,new ResourceLocation("extraores:smeltpalladiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOrePlatinum.asItem()),ItemList.itemIngotPlatinum,0.75F,40)
                .unlockedBy("smeltplatinumore",has(ItemList.itemIngotPlatinum))
                .save(consumer,new ResourceLocation("extraores:smeltplatinumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOrePlutonium.asItem()),ItemList.itemIngotPlutonium,0.75F,40)
                .unlockedBy("smeltplutoniumore",has(ItemList.itemIngotPlutonium))
                .save(consumer,new ResourceLocation("extraores:smeltplutoniumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOrePolonium.asItem()),ItemList.itemIngotPolonium,0.75F,40)
                .unlockedBy("smeltpoloniumore",has(ItemList.itemIngotPolonium))
                .save(consumer,new ResourceLocation("extraores:smeltpoloniumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOrePromethium.asItem()),ItemList.itemIngotPromethium,0.75F,40)
                .unlockedBy("smeltpromethiumore",has(ItemList.itemIngotPromethium))
                .save(consumer,new ResourceLocation("extraores:smeltpromethiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreRhenium.asItem()),ItemList.itemIngotRhenium,0.75F,40)
                .unlockedBy("smeltrheniumore",has(ItemList.itemIngotRhenium))
                .save(consumer,new ResourceLocation("extraores:smeltrheniumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreRhodium.asItem()),ItemList.itemIngotRhodium,0.75F,40)
                .unlockedBy("smeltrhodiumore",has(ItemList.itemIngotRhodium))
                .save(consumer,new ResourceLocation("extraores:smeltrhodiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreRubracium.asItem()),ItemList.itemIngotRubracium,0.75F,40)
                .unlockedBy("smeltrubraciumore",has(ItemList.itemIngotRubracium))
                .save(consumer,new ResourceLocation("extraores:smeltrubraciumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreRuthenium.asItem()),ItemList.itemIngotRuthenium,0.75F,40)
                .unlockedBy("smeltrutheniumore",has(ItemList.itemIngotRuthenium))
                .save(consumer,new ResourceLocation("extraores:smeltrutheniumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreSanguinite.asItem()),ItemList.itemIngotSanguinite,0.75F,40)
                .unlockedBy("smeltsanguiniteore",has(ItemList.itemIngotSanguinite))
                .save(consumer,new ResourceLocation("extraores:smeltsanguiniteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreShadowIron.asItem()),ItemList.itemIngotShadowIron,0.75F,40)
                .unlockedBy("smeltshadowironore",has(ItemList.itemIngotShadowIron))
                .save(consumer,new ResourceLocation("extraores:smeltshadowironore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreSilver.asItem()),ItemList.itemIngotSilver,0.75F,40)
                .unlockedBy("smeltsilverore",has(ItemList.itemIngotSilver))
                .save(consumer,new ResourceLocation("extraores:smeltsilverore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreTantalum.asItem()),ItemList.itemIngotTantalum,0.75F,40)
                .unlockedBy("smelttantalumore",has(ItemList.itemIngotTantalum))
                .save(consumer,new ResourceLocation("extraores:smelttantalumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreTartarite.asItem()),ItemList.itemIngotTartarite,0.75F,40)
                .unlockedBy("smelttartariteore",has(ItemList.itemIngotTartarite))
                .save(consumer,new ResourceLocation("extraores:smelttartariteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreTechnetium.asItem()),ItemList.itemIngotTechnetium,0.75F,40)
                .unlockedBy("smelttechnetiumore",has(ItemList.itemIngotTechnetium))
                .save(consumer,new ResourceLocation("extraores:smelttechnetiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreThallium.asItem()),ItemList.itemIngotThallium,0.75F,40)
                .unlockedBy("smeltthalliumore",has(ItemList.itemIngotThallium))
                .save(consumer,new ResourceLocation("extraores:smeltthalliumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreTin.asItem()),ItemList.itemIngotTin,0.75F,40)
                .unlockedBy("smelttinore",has(ItemList.itemIngotTin))
                .save(consumer,new ResourceLocation("extraores:smelttinore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreTitanium.asItem()),ItemList.itemIngotTitanium,0.75F,40)
                .unlockedBy("smelttitaniumore",has(ItemList.itemIngotTitanium))
                .save(consumer,new ResourceLocation("extraores:smelttitaniumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreTungsten.asItem()),ItemList.itemIngotTungsten,0.75F,40)
                .unlockedBy("smelttungstenore",has(ItemList.itemIngotTungsten))
                .save(consumer,new ResourceLocation("extraores:smelttungstenore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreUnobtainium.asItem()),ItemList.itemIngotUnobtainium,0.75F,40)
                .unlockedBy("smeltunobtainiumore",has(ItemList.itemIngotUnobtainium))
                .save(consumer,new ResourceLocation("extraores:smeltunobtainiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreUranium.asItem()),ItemList.itemIngotUranium,0.75f,40)
                .unlockedBy("smelturaniumore",has(ItemList.itemIngotUranium))
                .save(consumer,new ResourceLocation("extraores:smelturaniumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreVanadium.asItem()),ItemList.itemIngotVanadium,0.75F,40)
                .unlockedBy("smeltvanadiumore",has(ItemList.itemIngotVanadium))
                .save(consumer,new ResourceLocation("extraores:smeltvanadiumore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreVulcanite.asItem()),ItemList.itemIngotVulcanite,0.75F,40)
                .unlockedBy("smeltvulcaniteore",has(ItemList.itemIngotVulcanite))
                .save(consumer,new ResourceLocation("extraores:smeltvulcaniteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreVyroxeres.asItem()),ItemList.itemIngotVyroxeres,0.75F,40)
                .unlockedBy("smeltvyroxeresore",has(ItemList.itemIngotVyroxeres))
                .save(consumer,new ResourceLocation("extraores:smeltvyroxeresore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreYellorite.asItem()),ItemList.itemIngotYellorite,0.75F,40)
                .unlockedBy("smeltyelloriteore",has(ItemList.itemIngotYellorite))
                .save(consumer,new ResourceLocation("extraores:smeltyelloriteore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreZinc.asItem()),ItemList.itemIngotZinc,0.75F,40)
                .unlockedBy("smeltzincore",has(ItemList.itemIngotZinc))
                .save(consumer,new ResourceLocation("extraores:smeltzincore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockList.blockOreZirconium.asItem()),ItemList.itemIngotZirconium,0.75F,40)
                .unlockedBy("smeltzirconiumore",has(ItemList.itemIngotZirconium))
                .save(consumer,new ResourceLocation("extraores:smeltzirconiumore"));
        //Smelting Dust
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustAdamantine),ItemList.itemIngotAdamantine,0.75F,20)
                .unlockedBy("smeltadamantinedust",has(ItemList.itemIngotAdamantine))
                .save(consumer,new ResourceLocation("extraores:smeltadamantinedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustAldourite),ItemList.itemIngotAldourite,0.75F,20)
                .unlockedBy("smeltaldouritedust",has(ItemList.itemIngotAldourite))
                .save(consumer,new ResourceLocation("extraores:smeltaldouritedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustAluminum),ItemList.itemIngotAluminum,0.75F,20)
                .unlockedBy("smeltaluminumdust",has(ItemList.itemIngotAluminum))
                .save(consumer,new ResourceLocation("extraores:smeltaluminumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustAmericium),ItemList.itemIngotAmericium,0.75F,20)
                .unlockedBy("smeltamericiumdust",has(ItemList.itemIngotAmericium))
                .save(consumer,new ResourceLocation("extraores:smeltamericiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustAmordrine),ItemList.itemIngotAmordrine,0.75F,20)
                .unlockedBy("smeltamordrinedust",has(ItemList.itemIngotAmordrine))
                .save(consumer,new ResourceLocation("extraores:smeltamordrinedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustAngmallen),ItemList.itemIngotAngmallen,0.75F,20)
                .unlockedBy("smeltangmallendust",has(ItemList.itemIngotAngmallen))
                .save(consumer,new ResourceLocation("extraores:smeltangmallendust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustAstralSilver),ItemList.itemIngotAstralSilver,0.75F,20)
                .unlockedBy("smeltastralsilverdust",has(ItemList.itemIngotAstralSilver))
                .save(consumer,new ResourceLocation("extraores:smeltastralsilverdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustAtlarus),ItemList.itemIngotAtlarus,0.75F,20)
                .unlockedBy("smeltatlarusdust",has(ItemList.itemIngotAtlarus))
                .save(consumer,new ResourceLocation("extraores:smeltatlarusdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustBismuth),ItemList.itemIngotBismuth,0.75F,20)
                .unlockedBy("smeltbismuthdust",has(ItemList.itemIngotBismuth))
                .save(consumer,new ResourceLocation("extraores:smeltbismuthdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustBlackSteel),ItemList.itemIngotBlackSteel,0.75F,20)
                .unlockedBy("smeltblacksteeldust",has(ItemList.itemIngotBlackSteel))
                .save(consumer,new ResourceLocation("extraores:smeltblacksteeldust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustCadmium),ItemList.itemIngotCadmium,0.75F,20)
                .unlockedBy("smeltcadmiumdust",has(ItemList.itemIngotCadmium))
                .save(consumer,new ResourceLocation("extraores:smeltcadmiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustCarmot),ItemList.itemIngotCarmot,0.75F,20)
                .unlockedBy("smeltcarmotdust",has(ItemList.itemIngotCarmot))
                .save(consumer,new ResourceLocation("extraores:smeltcarmotdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustCelenegil),ItemList.itemIngotCelenegil,0.75F,20)
                .unlockedBy("smeltcelenegildust",has(ItemList.itemIngotCelenegil))
                .save(consumer,new ResourceLocation("extraores:smeltcelenegildust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustCeruclase),ItemList.itemIngotCeruclase,0.75F,20)
                .unlockedBy("smeltceruclasedust",has(ItemList.itemIngotCeruclase))
                .save(consumer,new ResourceLocation("extraores:smeltceruclasedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustChromium),ItemList.itemIngotChromium,0.75F,20)
                .unlockedBy("smeltchromiumdust",has(ItemList.itemIngotChromium))
                .save(consumer,new ResourceLocation("extraores:smeltchromiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustCobalt),ItemList.itemIngotCobalt,0.75F,20)
                .unlockedBy("smeltcobaltdust",has(ItemList.itemIngotCobalt))
                .save(consumer,new ResourceLocation("extraores:smeltcobaltdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustCopper),ItemList.itemIngotCopper,0.75F,20)
                .unlockedBy("smeltcopperdust",has(ItemList.itemIngotCopper))
                .save(consumer,new ResourceLocation("extraores:smeltcopperdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustDeepIron),ItemList.itemIngotDeepIron,0.75F,20)
                .unlockedBy("smeltdeepirondust",has(ItemList.itemIngotDeepIron))
                .save(consumer,new ResourceLocation("extraores:smeltdeepirondust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustDesichalkos),ItemList.itemIngotDesichalkos,0.75F,20)
                .unlockedBy("smeltdesichalkosdust",has(ItemList.itemIngotDesichalkos))
                .save(consumer,new ResourceLocation("extraores:smeltdesichalkosdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustEximite),ItemList.itemIngotEximite,0.75F,20)
                .unlockedBy("smelteximitedust",has(ItemList.itemIngotEximite))
                .save(consumer,new ResourceLocation("extraores:smelteximitedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustGallium),ItemList.itemIngotGallium,0.75F,20)
                .unlockedBy("smeltgalliumdust",has(ItemList.itemIngotGallium))
                .save(consumer,new ResourceLocation("extraores:smeltgalliumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustHaderoth),ItemList.itemIngotHaderoth,0.75F,20)
                .unlockedBy("smelthaderothdust",has(ItemList.itemIngotHaderoth))
                .save(consumer,new ResourceLocation("extraores:smelthaderothdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustHepatizon),ItemList.itemIngotHepatizon,0.75F,20)
                .unlockedBy("smelthepatizondust",has(ItemList.itemIngotHepatizon))
                .save(consumer,new ResourceLocation("extraores:smelthepatizondust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustIgnatius),ItemList.itemIngotIgnatius,0.75F,20)
                .unlockedBy("smeltignatiusdust",has(ItemList.itemIngotIgnatius))
                .save(consumer,new ResourceLocation("extraores:smeltignatiusdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustIndium),ItemList.itemIngotIndium,0.75F,20)
                .unlockedBy("smeltindiumdust",has(ItemList.itemIngotIndium))
                .save(consumer,new ResourceLocation("extraores:smeltindiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustInfuscolium),ItemList.itemIngotInfuscolium,0.75F,20)
                .unlockedBy("smeltinfuscoliumdust",has(ItemList.itemIngotInfuscolium))
                .save(consumer,new ResourceLocation("extraores:smeltinfuscoliumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustInolashite),ItemList.itemIngotInolashite,0.75F,20)
                .unlockedBy("smeltinolashitedust",has(ItemList.itemIngotInolashite))
                .save(consumer,new ResourceLocation("extraores:smeltinolashitedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustIridium),ItemList.itemIngotIridium,0.75F,20)
                .unlockedBy("smeltiridiumdust",has(ItemList.itemIngotIridium))
                .save(consumer,new ResourceLocation("extraores:smeltiridiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustKalendrite),ItemList.itemIngotKalendrite,0.75F,20)
                .unlockedBy("smeltkalendritedust",has(ItemList.itemIngotKalendrite))
                .save(consumer,new ResourceLocation("extraores:smeltkalendritedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustLead),ItemList.itemIngotLead,0.75F,20)
                .unlockedBy("smeltleaddust",has(ItemList.itemIngotLead))
                .save(consumer,new ResourceLocation("extraores:smeltleaddust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustLemurite),ItemList.itemIngotLemurite,0.75F,20)
                .unlockedBy("smeltlemuritedust",has(ItemList.itemIngotLemurite))
                .save(consumer,new ResourceLocation("extraores:smeltlemuritedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustManganese),ItemList.itemIngotManganese,0.75F,20)
                .unlockedBy("smeltmanganesedust",has(ItemList.itemIngotManganese))
                .save(consumer,new ResourceLocation("extraores:smeltmanganesedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustMeutoite),ItemList.itemIngotMeutoite,0.75F,20)
                .unlockedBy("smeltmeutoitedust",has(ItemList.itemIngotMeutoite))
                .save(consumer,new ResourceLocation("extraores:smeltmeutoitedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustMidasium),ItemList.itemIngotMidasium,0.75F,20)
                .unlockedBy("smeltmidasiumdust",has(ItemList.itemIngotMidasium))
                .save(consumer,new ResourceLocation("extraores:smeltmidasiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustMithril),ItemList.itemIngotMithril,0.75F,20)
                .unlockedBy("smeltmithrildust",has(ItemList.itemIngotMithril))
                .save(consumer,new ResourceLocation("extraores:smeltmithrildust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustMolybdenum),ItemList.itemIngotMolybdenum,0.75F,20)
                .unlockedBy("smeltmolybdenumdust",has(ItemList.itemIngotMolybdenum))
                .save(consumer,new ResourceLocation("extraores:smeltmolybdenumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustNeodymium),ItemList.itemIngotNeodymium,0.75F,20)
                .unlockedBy("smeltneodymiumdust",has(ItemList.itemIngotNeodymium))
                .save(consumer,new ResourceLocation("extraores:smeltneodymiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustNeptunium),ItemList.itemIngotNeptunium,0.75F,20)
                .unlockedBy("smeltneptuniumdust",has(ItemList.itemIngotNeptunium))
                .save(consumer,new ResourceLocation("extraores:smeltneptuniumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustNickel),ItemList.itemIngotNickel,0.75F,20)
                .unlockedBy("smeltnickeldust",has(ItemList.itemIngotNickel))
                .save(consumer,new ResourceLocation("extraores:smeltnickeldust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustNiobium),ItemList.itemIngotNiobium,0.75F,20)
                .unlockedBy("smeltniobiumdust",has(ItemList.itemIngotNiobium))
                .save(consumer,new ResourceLocation("extraores:smeltniobiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustOrichalcum),ItemList.itemIngotOrichalcum,0.75F,20)
                .unlockedBy("smeltorichalcumdust",has(ItemList.itemIngotOrichalcum))
                .save(consumer,new ResourceLocation("extraores:smeltorichalcumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustOureclase),ItemList.itemIngotOureclase,0.75F,20)
                .unlockedBy("smeltoureclasedust",has(ItemList.itemIngotOureclase))
                .save(consumer,new ResourceLocation("extraores:smeltoureclasedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustPalladium),ItemList.itemIngotPalladium,0.75F,20)
                .unlockedBy("smeltpalladiumdust",has(ItemList.itemIngotPalladium))
                .save(consumer,new ResourceLocation("extraores:smeltpalladiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustPlatinum),ItemList.itemIngotPlatinum,0.75F,20)
                .unlockedBy("smeltplatinumdust",has(ItemList.itemIngotPlatinum))
                .save(consumer,new ResourceLocation("extraores:smeltplatinumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustPlutonium),ItemList.itemIngotPlutonium,0.75F,20)
                .unlockedBy("smeltplutoniumdust",has(ItemList.itemIngotPlutonium))
                .save(consumer,new ResourceLocation("extraores:smeltplutoniumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustPolonium),ItemList.itemIngotPolonium,0.75F,20)
                .unlockedBy("smeltpoloniumdust",has(ItemList.itemIngotPolonium))
                .save(consumer,new ResourceLocation("extraores:smeltpoloniumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustPromethium),ItemList.itemIngotPromethium,0.75F,20)
                .unlockedBy("smeltpromethiumdust",has(ItemList.itemIngotPromethium))
                .save(consumer,new ResourceLocation("extraores:smeltpromethiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustRhenium),ItemList.itemIngotRhenium,0.75F,20)
                .unlockedBy("smeltrheniumdust",has(ItemList.itemIngotRhenium))
                .save(consumer,new ResourceLocation("extraores:smeltrheniumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustRhodium),ItemList.itemIngotRhodium,0.75F,20)
                .unlockedBy("smeltrhodiumdust",has(ItemList.itemIngotRhodium))
                .save(consumer,new ResourceLocation("extraores:smeltrhodiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustRubracium),ItemList.itemIngotRubracium,0.75F,20)
                .unlockedBy("smeltrubraciumdust",has(ItemList.itemIngotRubracium))
                .save(consumer,new ResourceLocation("extraores:smeltrubraciumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustRuthenium),ItemList.itemIngotRuthenium,0.75F,20)
                .unlockedBy("smeltrutheniumdust",has(ItemList.itemIngotRuthenium))
                .save(consumer,new ResourceLocation("extraores:smeltrutheniumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustSanguinite),ItemList.itemIngotSanguinite,0.75F,20)
                .unlockedBy("smeltsanguinitedust",has(ItemList.itemIngotSanguinite))
                .save(consumer,new ResourceLocation("extraores:smeltsanguinitedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustShadowIron),ItemList.itemIngotShadowIron,0.75F,20)
                .unlockedBy("smeltshadowirondust",has(ItemList.itemIngotShadowIron))
                .save(consumer,new ResourceLocation("extraores:smeltshadowirondust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustSilver),ItemList.itemIngotSilver,0.75F,20)
                .unlockedBy("smeltsilverdust",has(ItemList.itemIngotSilver))
                .save(consumer,new ResourceLocation("extraores:smeltsilverdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustTantalum),ItemList.itemIngotTantalum,0.75F,20)
                .unlockedBy("smelttantalumdust",has(ItemList.itemIngotTantalum))
                .save(consumer,new ResourceLocation("extraores:smelttantalumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustTartarite),ItemList.itemIngotTartarite,0.75F,20)
                .unlockedBy("smelttartaritedust",has(ItemList.itemIngotTartarite))
                .save(consumer,new ResourceLocation("extraores:smelttartaritedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustTechnetium),ItemList.itemIngotTechnetium,0.75F,20)
                .unlockedBy("smelttechnetiumdust",has(ItemList.itemIngotTechnetium))
                .save(consumer,new ResourceLocation("extraores:smelttechnetiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustThallium),ItemList.itemIngotThallium,0.75F,20)
                .unlockedBy("smeltthalliumdust",has(ItemList.itemIngotThallium))
                .save(consumer,new ResourceLocation("extraores:smeltthalliumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustTin),ItemList.itemIngotTin,0.75F,20)
                .unlockedBy("smelttindust",has(ItemList.itemIngotTin))
                .save(consumer,new ResourceLocation("extraores:smelttindust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustTitanium),ItemList.itemIngotTitanium,0.75F,20)
                .unlockedBy("smelttitaniumdust",has(ItemList.itemIngotTitanium))
                .save(consumer,new ResourceLocation("extraores:smelttitaniumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustTungsten),ItemList.itemIngotTungsten,0.75F,20)
                .unlockedBy("smelttungstendust",has(ItemList.itemIngotTungsten))
                .save(consumer,new ResourceLocation("extraores:smelttungstendust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustUnobtainium),ItemList.itemIngotUnobtainium,0.75F,20)
                .unlockedBy("smeltunobtainiumdust",has(ItemList.itemIngotUnobtainium))
                .save(consumer,new ResourceLocation("extraores:smeltunobtainiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustUranium),ItemList.itemIngotUranium,0.75f,20)
                .unlockedBy("smelturaniumdust",has(ItemList.itemIngotUranium))
                .save(consumer,new ResourceLocation("extraores:smelturaniumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustVanadium),ItemList.itemIngotVanadium,0.75F,20)
                .unlockedBy("smeltvanadiumdust",has(ItemList.itemIngotVanadium))
                .save(consumer,new ResourceLocation("extraores:smeltvanadiumdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustVulcanite),ItemList.itemIngotVulcanite,0.75F,20)
                .unlockedBy("smeltvulcanitedust",has(ItemList.itemIngotVulcanite))
                .save(consumer,new ResourceLocation("extraores:smeltvulcanitedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustVyroxeres),ItemList.itemIngotVyroxeres,0.75F,20)
                .unlockedBy("smeltvyroxeresdust",has(ItemList.itemIngotVyroxeres))
                .save(consumer,new ResourceLocation("extraores:smeltvyroxeresdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustYellorite),ItemList.itemIngotYellorite,0.75F,20)
                .unlockedBy("smeltyelloritedust",has(ItemList.itemIngotYellorite))
                .save(consumer,new ResourceLocation("extraores:smeltyelloritedust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustZinc),ItemList.itemIngotZinc,0.75F,20)
                .unlockedBy("smeltzincdust",has(ItemList.itemIngotZinc))
                .save(consumer,new ResourceLocation("extraores:smeltzincdust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemList.itemDustZirconium),ItemList.itemIngotZirconium,0.75F,20)
                .unlockedBy("smeltzirconiumdust",has(ItemList.itemIngotZirconium))
                .save(consumer,new ResourceLocation("extraores:smeltzirconiumdust"));
        //Blasting Ore
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
        //Stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreAdamantine.asItem()),ItemList.itemDustAdamantine,2)
                .unlockedBy("cutadamantineore",has(ItemList.itemDustAdamantine))
                .save(consumer,new ResourceLocation("extraores:cutadamantineore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreAldourite.asItem()),ItemList.itemDustAldourite,2)
                .unlockedBy("cutaldouriteore",has(ItemList.itemDustAldourite))
                .save(consumer,new ResourceLocation("extraores:cutaldouriteore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreAluminum.asItem()),ItemList.itemDustAluminum,2)
                .unlockedBy("cutaluminumore",has(ItemList.itemDustAluminum))
                .save(consumer,new ResourceLocation("extraores:cutaluminumore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreAmericium.asItem()),ItemList.itemDustAmericium,2)
                .unlockedBy("cutamericiumore",has(ItemList.itemDustAmericium))
                .save(consumer,new ResourceLocation("extraores:cutamericiumore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreAmordrine.asItem()),ItemList.itemDustAmordrine,2)
                .unlockedBy("cutamordrineore",has(ItemList.itemDustAmordrine))
                .save(consumer,new ResourceLocation("extraores:cutamordrineore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreAngmallen.asItem()),ItemList.itemDustAngmallen,2)
                .unlockedBy("cutangmallenore",has(ItemList.itemDustAngmallen))
                .save(consumer,new ResourceLocation("extraores:cutangmallenore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreAstralSilver.asItem()),ItemList.itemDustAstralSilver,2)
                .unlockedBy("cutastralsilverore",has(ItemList.itemDustAstralSilver))
                .save(consumer,new ResourceLocation("extraores:cutastralsilverore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreAtlarus.asItem()),ItemList.itemDustAtlarus,2)
                .unlockedBy("cutatlarusore",has(ItemList.itemDustAtlarus))
                .save(consumer,new ResourceLocation("extraores:cutatlarusore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreBismuth.asItem()),ItemList.itemDustBismuth,2)
                .unlockedBy("cutbismuthore",has(ItemList.itemDustBismuth))
                .save(consumer,new ResourceLocation("extraores:cutbismuthore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreBlackSteel.asItem()),ItemList.itemDustBlackSteel,2)
                .unlockedBy("cutblacksteelore",has(ItemList.itemDustBlackSteel))
                .save(consumer,new ResourceLocation("extraores:cutblacksteelore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreCadmium.asItem()),ItemList.itemDustCadmium,2)
                .unlockedBy("cutcadmiumore",has(ItemList.itemDustCadmium))
                .save(consumer,new ResourceLocation("extraores:cutcadmiumore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreCarmot.asItem()),ItemList.itemDustCarmot,2)
                .unlockedBy("cutcarmotore",has(ItemList.itemDustCarmot))
                .save(consumer,new ResourceLocation("extraores:cutcarmotore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreCelenegil.asItem()),ItemList.itemDustCelenegil,2)
                .unlockedBy("cutcelenegilore",has(ItemList.itemDustCelenegil))
                .save(consumer,new ResourceLocation("extraores:cutcelenegilore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreCeruclase.asItem()),ItemList.itemDustCeruclase,2)
                .unlockedBy("cutceruclaseore",has(ItemList.itemDustCeruclase))
                .save(consumer,new ResourceLocation("extraores:cutceruclaseore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreChromium.asItem()),ItemList.itemDustChromium,2)
                .unlockedBy("cutchromiumore",has(ItemList.itemDustChromium))
                .save(consumer,new ResourceLocation("extraores:cutchromiumore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreCobalt.asItem()),ItemList.itemDustCobalt,2)
                .unlockedBy("cutcobaltore",has(ItemList.itemDustCobalt))
                .save(consumer,new ResourceLocation("extraores:cutcobaltore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreCopper.asItem()),ItemList.itemDustCopper,2)
                .unlockedBy("cutcopperore",has(ItemList.itemDustCopper))
                .save(consumer,new ResourceLocation("extraores:cutcopperore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreDeepIron.asItem()),ItemList.itemDustDeepIron,2)
                .unlockedBy("cutdeepironore",has(ItemList.itemDustDeepIron))
                .save(consumer,new ResourceLocation("extraores:cutdeepironore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreDesichalkos.asItem()),ItemList.itemDustDesichalkos,2)
                .unlockedBy("cutdesichalkosore",has(ItemList.itemDustDesichalkos))
                .save(consumer,new ResourceLocation("extraores:cutdesichalkosore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreEximite.asItem()),ItemList.itemDustEximite,2)
                .unlockedBy("cuteximiteore",has(ItemList.itemDustEximite))
                .save(consumer,new ResourceLocation("extraores:cuteximiteore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreGallium.asItem()),ItemList.itemDustGallium,2)
                .unlockedBy("cutgalliumore",has(ItemList.itemDustGallium))
                .save(consumer,new ResourceLocation("extraores:cutgalliumore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreHaderoth.asItem()),ItemList.itemDustHaderoth,2)
                .unlockedBy("cuthaderothore",has(ItemList.itemDustHaderoth))
                .save(consumer,new ResourceLocation("extraores:cuthaderothore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreHepatizon.asItem()),ItemList.itemDustHepatizon,2)
                .unlockedBy("cuthepatizonore",has(ItemList.itemDustHepatizon))
                .save(consumer,new ResourceLocation("extraores:cuthepatizonore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreIgnatius.asItem()),ItemList.itemDustIgnatius,2)
                .unlockedBy("cutignatiusore",has(ItemList.itemDustIgnatius))
                .save(consumer,new ResourceLocation("extraores:cutignatiusore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreIndium.asItem()),ItemList.itemDustIndium,2)
                .unlockedBy("cutindiumore",has(ItemList.itemDustIndium))
                .save(consumer,new ResourceLocation("extraores:cutindiumore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreInfuscolium.asItem()),ItemList.itemDustInfuscolium,2)
                .unlockedBy("cutinfuscoliumore",has(ItemList.itemDustInfuscolium))
                .save(consumer,new ResourceLocation("extraores:cutinfuscoliumore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreInolashite.asItem()),ItemList.itemDustInolashite,2)
                .unlockedBy("cutinolashiteore",has(ItemList.itemDustInolashite))
                .save(consumer,new ResourceLocation("extraores:cutinolashiteore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreIridium.asItem()),ItemList.itemDustIridium,2)
                .unlockedBy("cutiridiumore",has(ItemList.itemDustIridium))
                .save(consumer,new ResourceLocation("extraores:cutiridiumore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreKalendrite.asItem()),ItemList.itemDustKalendrite,2)
                .unlockedBy("cutkalendriteore",has(ItemList.itemDustKalendrite))
                .save(consumer,new ResourceLocation("extraores:cutkalendriteore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreLead.asItem()),ItemList.itemDustLead,2)
                .unlockedBy("cutleadore",has(ItemList.itemDustLead))
                .save(consumer,new ResourceLocation("extraores:cutleadore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreLemurite.asItem()),ItemList.itemDustLemurite,2)
                .unlockedBy("cutlemuriteore",has(ItemList.itemDustLemurite))
                .save(consumer,new ResourceLocation("extraores:cutlemuriteore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreManganese.asItem()),ItemList.itemDustManganese,2)
                .unlockedBy("cutmanganeseore",has(ItemList.itemDustManganese))
                .save(consumer,new ResourceLocation("extraores:cutmanganeseore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreMeutoite.asItem()),ItemList.itemDustMeutoite,2)
                .unlockedBy("cutmeutoiteore",has(ItemList.itemDustMeutoite))
                .save(consumer,new ResourceLocation("extraores:cutmeutoiteore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreMidasium.asItem()),ItemList.itemDustMidasium,2)
                .unlockedBy("cutmidasiumore",has(ItemList.itemDustMidasium))
                .save(consumer,new ResourceLocation("extraores:cutmidasiumore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreMithril.asItem()),ItemList.itemDustMithril,2)
                .unlockedBy("cutmithrilore",has(ItemList.itemDustMithril))
                .save(consumer,new ResourceLocation("extraores:cutmithrilore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreMolybdenum.asItem()),ItemList.itemDustMolybdenum,2)
                .unlockedBy("cutmolybdenumore",has(ItemList.itemDustMolybdenum))
                .save(consumer,new ResourceLocation("extraores:cutmolybdenumore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreNeodymium.asItem()),ItemList.itemDustNeodymium,2)
                .unlockedBy("cutneodymiumore",has(ItemList.itemDustNeodymium))
                .save(consumer,new ResourceLocation("extraores:cutneodymiumore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreNeptunium.asItem()),ItemList.itemDustNeptunium,2)
                .unlockedBy("cutneptuniumore",has(ItemList.itemDustNeptunium))
                .save(consumer,new ResourceLocation("extraores:cutneptuniumore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreNickel.asItem()),ItemList.itemDustNickel,2)
                .unlockedBy("cutnickelore",has(ItemList.itemDustNickel))
                .save(consumer,new ResourceLocation("extraores:cutnickelore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreNiobium.asItem()),ItemList.itemDustNiobium,2)
                .unlockedBy("cutniobiumore",has(ItemList.itemDustNiobium))
                .save(consumer,new ResourceLocation("extraores:cutniobiumore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreOrichalcum.asItem()),ItemList.itemDustOrichalcum,2)
                .unlockedBy("cutorichalcumore",has(ItemList.itemDustOrichalcum))
                .save(consumer,new ResourceLocation("extraores:cutorichalcumore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreOsmium.asItem()),ItemList.itemDustOsmium,2)
                .unlockedBy("cutosmiumore",has(ItemList.itemDustOsmium))
                .save(consumer,new ResourceLocation("extraores:cutosmiumore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreOureclase.asItem()),ItemList.itemDustOureclase,2)
                .unlockedBy("cutoureclaseore",has(ItemList.itemDustOureclase))
                .save(consumer,new ResourceLocation("extraores:cutoureclaseore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOrePalladium.asItem()),ItemList.itemDustPalladium,2)
                .unlockedBy("cutpalladiumore",has(ItemList.itemDustPalladium))
                .save(consumer,new ResourceLocation("extraores:cutpalladiumore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOrePlatinum.asItem()),ItemList.itemDustPlatinum,2)
                .unlockedBy("cutplatinumore",has(ItemList.itemDustPlatinum))
                .save(consumer,new ResourceLocation("extraores:cutplatinumore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOrePlutonium.asItem()),ItemList.itemDustPlutonium,2)
                .unlockedBy("cutplutoniumore",has(ItemList.itemDustPlutonium))
                .save(consumer,new ResourceLocation("extraores:cutplutoniumore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOrePolonium.asItem()),ItemList.itemDustPolonium,2)
                .unlockedBy("cutpoloniumore",has(ItemList.itemDustPolonium))
                .save(consumer,new ResourceLocation("extraores:cutpoloniumore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOrePromethium.asItem()),ItemList.itemDustPromethium,2)
                .unlockedBy("cutpromethiumore",has(ItemList.itemDustPromethium))
                .save(consumer,new ResourceLocation("extraores:cutpromethiumore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreRhenium.asItem()),ItemList.itemDustRhenium,2)
                .unlockedBy("cutrheniumore",has(ItemList.itemDustRhenium))
                .save(consumer,new ResourceLocation("extraores:cutrheniumore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreRhodium.asItem()),ItemList.itemDustRhodium,2)
                .unlockedBy("cutrhodiumore",has(ItemList.itemDustRhodium))
                .save(consumer,new ResourceLocation("extraores:cutrhodiumore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreRubracium.asItem()),ItemList.itemDustRubracium,2)
                .unlockedBy("cutrubraciumore",has(ItemList.itemDustRubracium))
                .save(consumer,new ResourceLocation("extraores:cutrubraciumore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreRuthenium.asItem()),ItemList.itemDustRuthenium,2)
                .unlockedBy("cutrutheniumore",has(ItemList.itemDustRuthenium))
                .save(consumer,new ResourceLocation("extraores:cutrutheniumore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreSanguinite.asItem()),ItemList.itemDustSanguinite,2)
                .unlockedBy("cutsanguiniteore",has(ItemList.itemDustSanguinite))
                .save(consumer,new ResourceLocation("extraores:cutsanguiniteore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreShadowIron.asItem()),ItemList.itemDustShadowIron,2)
                .unlockedBy("cutshadowironore",has(ItemList.itemDustShadowIron))
                .save(consumer,new ResourceLocation("extraores:cutshadowironore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreSilver.asItem()),ItemList.itemDustSilver,2)
                .unlockedBy("cutsilverore",has(ItemList.itemDustSilver))
                .save(consumer,new ResourceLocation("extraores:cutsilverore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreTantalum.asItem()),ItemList.itemDustTantalum,2)
                .unlockedBy("cuttantalumore",has(ItemList.itemDustTantalum))
                .save(consumer,new ResourceLocation("extraores:cuttantalumore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreTartarite.asItem()),ItemList.itemDustTartarite,2)
                .unlockedBy("cuttartariteore",has(ItemList.itemDustTartarite))
                .save(consumer,new ResourceLocation("extraores:cuttartariteore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreTechnetium.asItem()),ItemList.itemDustTechnetium,2)
                .unlockedBy("cuttechnetiumore",has(ItemList.itemDustTechnetium))
                .save(consumer,new ResourceLocation("extraores:cuttechnetiumore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreThallium.asItem()),ItemList.itemDustThallium,2)
                .unlockedBy("cutthalliumore",has(ItemList.itemDustThallium))
                .save(consumer,new ResourceLocation("extraores:cutthalliumore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreTin.asItem()),ItemList.itemDustTin,2)
                .unlockedBy("cuttinore",has(ItemList.itemDustTin))
                .save(consumer,new ResourceLocation("extraores:cuttinore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreTitanium.asItem()),ItemList.itemDustTitanium,2)
                .unlockedBy("cuttitaniumore",has(ItemList.itemDustTitanium))
                .save(consumer,new ResourceLocation("extraores:cuttitaniumore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreTungsten.asItem()),ItemList.itemDustTungsten,2)
                .unlockedBy("cuttungstenore",has(ItemList.itemDustTungsten))
                .save(consumer,new ResourceLocation("extraores:cuttungstenore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreUnobtainium.asItem()),ItemList.itemDustUnobtainium,2)
                .unlockedBy("cutunobtainiumore",has(ItemList.itemDustUnobtainium))
                .save(consumer,new ResourceLocation("extraores:cutunobtainiumore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreUranium.asItem()),ItemList.itemDustUranium,2)
                .unlockedBy("cuturaniumore",has(ItemList.itemDustUranium))
                .save(consumer,new ResourceLocation("extraores:cuturaniumore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreVanadium.asItem()),ItemList.itemDustVanadium,2)
                .unlockedBy("cutvanadiumore",has(ItemList.itemDustVanadium))
                .save(consumer,new ResourceLocation("extraores:cutvanadiumore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreVulcanite.asItem()),ItemList.itemDustVulcanite,2)
                .unlockedBy("cutvulcaniteore",has(ItemList.itemDustVulcanite))
                .save(consumer,new ResourceLocation("extraores:cutvulcaniteore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreVyroxeres.asItem()),ItemList.itemDustVyroxeres,2)
                .unlockedBy("cutvyroxeresore",has(ItemList.itemDustVyroxeres))
                .save(consumer,new ResourceLocation("extraores:cutvyroxeresore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreYellorite.asItem()),ItemList.itemDustYellorite,2)
                .unlockedBy("cutyelloriteore",has(ItemList.itemDustYellorite))
                .save(consumer,new ResourceLocation("extraores:cutyelloriteore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreZinc.asItem()),ItemList.itemDustZinc,2)
                .unlockedBy("cutzincore",has(ItemList.itemDustZinc))
                .save(consumer,new ResourceLocation("extraores:cutzincore"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockList.blockOreZirconium.asItem()),ItemList.itemDustZirconium,2)
                .unlockedBy("cutzirconiumore",has(ItemList.itemDustZirconium))
                .save(consumer,new ResourceLocation("extraores:cutzirconiumore"));
    }
    @Override
    public String getName()
    {
        return "Extra Ores Recipes";
    }
}
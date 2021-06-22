package com.tylerh.extraores.Data.Recipes;

import com.tylerh.extraores.Init.BlockList;
import com.tylerh.extraores.Init.ItemList;
import net.minecraft.data.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.crafting.ShapedRecipe;
import net.minecraft.util.ResourceLocation;

import java.util.function.Consumer;

public class ExOreRecipe extends RecipeProvider
{
    public ExOreRecipe(DataGenerator gen)
    {
        super(gen);
    }
    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer)
    {
        //Ingot To Block
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockAdamantine)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotAdamantine)
                .addCriterion("adamantineblock",hasItem(BlockList.blockAdamantine))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockAgate)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i',ItemList.itemGemAgate)
                .addCriterion("agateblock",hasItem(BlockList.blockAgate))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockAldourite)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i',ItemList.itemIngotAldourite)
                .addCriterion("aldouriteblock",hasItem(BlockList.blockAldourite))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockAluminum)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotAluminum)
                .addCriterion("aluminumblock",hasItem(BlockList.blockAluminum))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockAmericium)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i',ItemList.itemIngotAmericium)
                .addCriterion("americiumblock",hasItem(BlockList.blockAmericium))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockAmethyst)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i',ItemList.itemGemAmethyst)
                .addCriterion("amethystblock",hasItem(BlockList.blockAmethyst))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockAmetrine)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i',ItemList.itemGemAmetrine)
                .addCriterion("ametrineblock",hasItem(BlockList.blockAmetrine))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockAmordrine)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotAmordrine)
                .addCriterion("amordrineblock",hasItem(BlockList.blockAmordrine))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockAngmallen)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotAngmallen)
                .addCriterion("angmallenblock",hasItem(BlockList.blockAngmallen))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockAquamarine)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i',ItemList.itemGemAquamarine)
                .addCriterion("aquamarineblock",hasItem(BlockList.blockAquamarine))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockAstralSilver)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotAstralSilver)
                .addCriterion("astralsilverblock",hasItem(BlockList.blockAstralSilver))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockAtlarus)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotAtlarus)
                .addCriterion("atlarusblock",hasItem(BlockList.blockAtlarus))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockBismuth)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotBismuth)
                .addCriterion("bismuthblock",hasItem(BlockList.blockBismuth))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockBlackSteel)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotBlackSteel)
                .addCriterion("blacksteelblock",hasItem(BlockList.blockBlackSteel))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockCadmium)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotCadmium)
                .addCriterion("cadmiumblock",hasItem(BlockList.blockCadmium))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockCarmot)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotCarmot)
                .addCriterion("carmotblock",hasItem(BlockList.blockCarmot))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockCelenegil)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotCelenegil)
                .addCriterion("celenegilblock",hasItem(BlockList.blockCelenegil))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockCeruclase)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotCeruclase)
                .addCriterion("ceruclaseblock",hasItem(BlockList.blockCeruclase))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockChromium)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotChromium)
                .addCriterion("chromiumblock",hasItem(BlockList.blockChromium))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockChrysocolla)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i',ItemList.itemGemChrysocolla)
                .addCriterion("chrysocollablock",hasItem(BlockList.blockChrysocolla))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockCitrine)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i',ItemList.itemGemCitrine)
                .addCriterion("citrineblock",hasItem(BlockList.blockCitrine))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockCobalt)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotCobalt)
                .addCriterion("cobaltblock",hasItem(BlockList.blockCobalt))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockCopper)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotCopper)
                .addCriterion("copperblock",hasItem(BlockList.blockCopper))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockDeepIron)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotDeepIron)
                .addCriterion("deepironblock",hasItem(BlockList.blockDeepIron))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockDesichalkos)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotDesichalkos)
                .addCriterion("desichalkosblock",hasItem(BlockList.blockDesichalkos))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockEximite)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotEximite)
                .addCriterion("eximiteblock",hasItem(BlockList.blockEximite))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockGallium)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotGallium)
                .addCriterion("galliumblock",hasItem(BlockList.blockGallium))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockGarnet)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i',ItemList.itemGemGarnet)
                .addCriterion("garnetblock",hasItem(BlockList.blockGarnet))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockHaderoth)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotHaderoth)
                .addCriterion("haderothblock",hasItem(BlockList.blockHaderoth))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockHepatizon)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotHepatizon)
                .addCriterion("hepatizonblock",hasItem(BlockList.blockHepatizon))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockIgnatius)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotIgnatius)
                .addCriterion("ignatiusblock",hasItem(BlockList.blockIgnatius))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockIndium)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotIndium)
                .addCriterion("indiumblock",hasItem(BlockList.blockIndium))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockInfuscolium)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotInfuscolium)
                .addCriterion("infuscoliumblock",hasItem(BlockList.blockInfuscolium))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockInolashite)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotInolashite)
                .addCriterion("inolashiteblock",hasItem(BlockList.blockInolashite))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockIolite)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i',ItemList.itemGemIolite)
                .addCriterion("ioliteblock",hasItem(BlockList.blockIolite))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockIridium)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i',ItemList.itemIngotIridium)
                .addCriterion("iridiumblock",hasItem(BlockList.blockIridium))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockJade)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i',ItemList.itemGemJade)
                .addCriterion("jadeblock",hasItem(BlockList.blockJade))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockJasper)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i',ItemList.itemGemJasper)
                .addCriterion("jasperblock",hasItem(BlockList.blockJasper))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockKalendrite)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotKalendrite)
                .addCriterion("kalendriteblock",hasItem(BlockList.blockKalendrite))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockKyanite)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i',ItemList.itemGemKyanite)
                .addCriterion("kyaniteblock",hasItem(BlockList.blockKyanite))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockLead)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotLead)
                .addCriterion("leadblock",hasItem(BlockList.blockLead))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockLemurite)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotLemurite)
                .addCriterion("lemuriteblock",hasItem(BlockList.blockLemurite))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockMalachite)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i',ItemList.itemGemMalachite)
                .addCriterion("malachiteblock",hasItem(BlockList.blockMalachite))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockManganese)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotManganese)
                .addCriterion("manganeseblock",hasItem(BlockList.blockManganese))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockMeutoite)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotMeutoite)
                .addCriterion("meutoiteblock",hasItem(BlockList.blockMeutoite))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockMidasium)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotMidasium)
                .addCriterion("midasiumblock",hasItem(BlockList.blockMidasium))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockMithril)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotMithril)
                .addCriterion("mithrilblock",hasItem(BlockList.blockMithril))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockMolybdenum)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotMolybdenum)
                .addCriterion("molybdenumblock",hasItem(BlockList.blockMolybdenum))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockNeodymium)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotNeodymium)
                .addCriterion("neodymiumblock",hasItem(BlockList.blockNeodymium))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockNeptunium)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i',ItemList.itemIngotNeptunium)
                .addCriterion("neptuniumblock",hasItem(BlockList.blockNeptunium))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockNickel)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotNickel)
                .addCriterion("nickelblock",hasItem(BlockList.blockNickel))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockNiobium)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotNiobium)
                .addCriterion("niobiumblock",hasItem(BlockList.blockNiobium))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockOnyx)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i',ItemList.itemGemOnyx)
                .addCriterion("onyxblock",hasItem(BlockList.blockOnyx))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockOpal)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i',ItemList.itemGemOpal)
                .addCriterion("opalblock",hasItem(BlockList.blockOpal))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockOrichalcum)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotOrichalcum)
                .addCriterion("orichalcumblock",hasItem(BlockList.blockOrichalcum))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockOsmium)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i',ItemList.itemIngotOsmium)
                .addCriterion("osmiumblock",hasItem(BlockList.blockOsmium))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockOureclase)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotOureclase)
                .addCriterion("oureclaseblock",hasItem(BlockList.blockOureclase))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockPalladium)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotPalladium)
                .addCriterion("palladiumblock",hasItem(BlockList.blockPalladium))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockPeridot)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i',ItemList.itemGemPeridot)
                .addCriterion("peridotblock",hasItem(BlockList.blockPeridot))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockPhoenixite)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i',ItemList.itemGemPhoenixite)
                .addCriterion("phoenixiteblock",hasItem(BlockList.blockPhoenixite))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockPlatinum)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotPlatinum)
                .addCriterion("platinumblock",hasItem(BlockList.blockPlatinum))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockPlutonium)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i',ItemList.itemIngotPlutonium)
                .addCriterion("plutoniumblock",hasItem(BlockList.blockPlutonium))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockPolonium)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i',ItemList.itemIngotPolonium)
                .addCriterion("poloniumblock",hasItem(BlockList.blockPolonium))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockPromethium)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotPromethium)
                .addCriterion("promethiumblock",hasItem(BlockList.blockPromethium))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockRhenium)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i',ItemList.itemIngotRhenium)
                .addCriterion("rheniumblock",hasItem(BlockList.blockRhenium))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockRhodium)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotRhodium)
                .addCriterion("rhodiumblock",hasItem(BlockList.blockRhodium))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockRubracium)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotRubracium)
                .addCriterion("rubraciumblock",hasItem(BlockList.blockRubracium))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockRuby)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i',ItemList.itemGemRuby)
                .addCriterion("rubyblock",hasItem(BlockList.blockRuby))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockRuthenium)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotRuthenium)
                .addCriterion("rutheniumblock",hasItem(BlockList.blockRuthenium))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockSanguinite)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotSanguinite)
                .addCriterion("sanguiniteblock",hasItem(BlockList.blockSanguinite))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockSapphire)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i',ItemList.itemGemSapphire)
                .addCriterion("sapphireblock",hasItem(BlockList.blockSapphire))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockShadowIron)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotShadowIron)
                .addCriterion("shadowironblock",hasItem(BlockList.blockShadowIron))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockSilver)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotSilver)
                .addCriterion("silverblock",hasItem(BlockList.blockSilver))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockSpinel)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i',ItemList.itemGemSpinel)
                .addCriterion("spinelblock",hasItem(BlockList.blockSpinel))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockSugilite)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i',ItemList.itemGemSugilite)
                .addCriterion("sugiliteore",hasItem(BlockList.blockSugilite))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockTantalum)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i',ItemList.itemIngotTantalum)
                .addCriterion("tantalumblock",hasItem(BlockList.blockTantalum))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockTanzanite)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i',ItemList.itemGemTanzanite)
                .addCriterion("tanzaniteblock",hasItem(BlockList.blockTanzanite))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockTartarite)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotTartarite)
                .addCriterion("tartariteblock",hasItem(BlockList.blockTartarite))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockTechnetium)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotTechnetium)
                .addCriterion("technetiumblock",hasItem(BlockList.blockTechnetium))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockThallium)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotThallium)
                .addCriterion("thalliumblock",hasItem(BlockList.blockThallium))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockTin)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotTin)
                .addCriterion("tinblock",hasItem(BlockList.blockTin))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockTitanium)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotTitanium)
                .addCriterion("titaniumblock",hasItem(BlockList.blockTitanium))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockTopaz)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i',ItemList.itemGemTopaz)
                .addCriterion("topazblock",hasItem(BlockList.blockTopaz))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockTourmaline)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i',ItemList.itemGemTourmaline)
                .addCriterion("tourmalineblock",hasItem(BlockList.blockTourmaline))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockTungsten)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotTungsten)
                .addCriterion("tungstenblock",hasItem(BlockList.blockTungsten))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockTurquoise)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i',ItemList.itemGemTurquoise)
                .addCriterion("turquoiseblock",hasItem(BlockList.blockTurquoise))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockUnobtainium)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotUnobtainium)
                .addCriterion("unobtainiumblock",hasItem(BlockList.blockUnobtainium))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockUranium)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i',ItemList.itemIngotUranium)
                .addCriterion("uraniumblock",hasItem(BlockList.blockUranium))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockVanadium)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotVanadium)
                .addCriterion("vanadiumblock",hasItem(BlockList.blockVanadium))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockVulcanite)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotVulcanite)
                .addCriterion("vulcaniteblock",hasItem(BlockList.blockVulcanite))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockVyroxeres)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotVyroxeres)
                .addCriterion("vyroxeresblock",hasItem(BlockList.blockVyroxeres))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockYellorite)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i',ItemList.itemIngotYellorite)
                .addCriterion("yelloriteblock",hasItem(BlockList.blockYellorite))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockZinc)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotZinc)
                .addCriterion("zincblock",hasItem(BlockList.blockZinc))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BlockList.blockZirconium)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', ItemList.itemIngotZirconium)
                .addCriterion("zirconiumblock",hasItem(BlockList.blockZirconium))
                .build(consumer);
        //Block to Ingot
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotAdamantine,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockAdamantine.asItem()))
                .addCriterion("adamantineingot",hasItem(ItemList.itemIngotAdamantine))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemGemAgate,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockAgate.asItem()))
                .addCriterion("agate",hasItem(ItemList.itemGemAgate))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotAldourite,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockAldourite.asItem()))
                .addCriterion("aldouriteingot",hasItem(ItemList.itemIngotAldourite))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotAluminum,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockAluminum.asItem()))
                .addCriterion("aluminumingot",hasItem(ItemList.itemIngotAluminum))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotAmericium,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockAmericium.asItem()))
                .addCriterion("americiumingot",hasItem(ItemList.itemIngotAmericium))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemGemAmethyst,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockAmethyst.asItem()))
                .addCriterion("amethyst",hasItem(ItemList.itemGemAmethyst))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemGemAmetrine,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockAmetrine))
                .addCriterion("ametrine",hasItem(ItemList.itemGemAmetrine))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotAmordrine,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockAmordrine.asItem()))
                .addCriterion("amordrineingot",hasItem(ItemList.itemIngotAmordrine))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotAngmallen,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockAngmallen.asItem()))
                .addCriterion("angmalleningot",hasItem(ItemList.itemIngotAngmallen))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemGemAquamarine,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockAquamarine.asItem()))
                .addCriterion("aquamarine",hasItem(ItemList.itemGemAquamarine))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotAstralSilver,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockAstralSilver.asItem()))
                .addCriterion("astralsilveringot",hasItem(ItemList.itemIngotAstralSilver))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotAtlarus,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockAtlarus.asItem()))
                .addCriterion("atlarusingot",hasItem(ItemList.itemIngotAtlarus))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotBismuth,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockBismuth.asItem()))
                .addCriterion("bismuthingot",hasItem(ItemList.itemIngotBismuth))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotBlackSteel,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockBlackSteel.asItem()))
                .addCriterion("blacksteelingot",hasItem(ItemList.itemIngotBlackSteel))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotCadmium,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockCadmium.asItem()))
                .addCriterion("cadmiumingot",hasItem(ItemList.itemIngotCadmium))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotCarmot,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockCarmot.asItem()))
                .addCriterion("carmotingot",hasItem(ItemList.itemIngotCarmot))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotCelenegil,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockCelenegil.asItem()))
                .addCriterion("celenegilingot",hasItem(ItemList.itemIngotCelenegil))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotCeruclase,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockCeruclase.asItem()))
                .addCriterion("ceruclaseingot",hasItem(ItemList.itemIngotCeruclase))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotChromium,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockChromium.asItem()))
                .addCriterion("chromiumingot",hasItem(ItemList.itemIngotChromium))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemGemChrysocolla,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockChrysocolla.asItem()))
                .addCriterion("chrysocolla",hasItem(ItemList.itemGemChrysocolla))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemGemCitrine,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockCitrine.asItem()))
                .addCriterion("citrine",hasItem(ItemList.itemGemCitrine))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotCobalt,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockCobalt.asItem()))
                .addCriterion("cobaltingot",hasItem(ItemList.itemIngotCobalt))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotCopper,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockCopper.asItem()))
                .addCriterion("copperingot",hasItem(ItemList.itemIngotCopper))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotDeepIron,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockDeepIron.asItem()))
                .addCriterion("deepironingot",hasItem(ItemList.itemIngotDeepIron))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotDesichalkos,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockDesichalkos.asItem()))
                .addCriterion("desichalkosingot",hasItem(ItemList.itemIngotDesichalkos))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotEximite,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockEximite.asItem()))
                .addCriterion("eximiteingot",hasItem(ItemList.itemIngotEximite))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotGallium,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockGallium.asItem()))
                .addCriterion("galliumingot",hasItem(ItemList.itemIngotGallium))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemGemGarnet,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockGarnet.asItem()))
                .addCriterion("garnet",hasItem(ItemList.itemGemGarnet))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotHaderoth,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockHaderoth.asItem()))
                .addCriterion("haderothingot",hasItem(ItemList.itemIngotHaderoth))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotHepatizon,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockHepatizon.asItem()))
                .addCriterion("hepatizoningot",hasItem(ItemList.itemIngotHepatizon))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotIgnatius,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockIgnatius.asItem()))
                .addCriterion("ignatiusingot",hasItem(ItemList.itemIngotIgnatius))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotIndium,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockIndium.asItem()))
                .addCriterion("indiumingot",hasItem(ItemList.itemIngotIndium))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotInfuscolium,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockInfuscolium.asItem()))
                .addCriterion("infuscoliumingot",hasItem(ItemList.itemIngotInfuscolium))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotInolashite,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockInolashite.asItem()))
                .addCriterion("inolashiteingot",hasItem(ItemList.itemIngotInolashite))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemGemIolite,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockIolite.asItem()))
                .addCriterion("iolite",hasItem(ItemList.itemGemIolite))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotIridium,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockIridium.asItem()))
                .addCriterion("iridiumingot",hasItem(ItemList.itemIngotIridium))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemGemJade,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockJade.asItem()))
                .addCriterion("jade",hasItem(ItemList.itemGemJade))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemGemJasper,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockJasper.asItem()))
                .addCriterion("jasper",hasItem(ItemList.itemGemJasper))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotKalendrite,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockKalendrite.asItem()))
                .addCriterion("kalendriteingot",hasItem(ItemList.itemIngotKalendrite))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemGemKyanite,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockKyanite.asItem()))
                .addCriterion("kyanite",hasItem(ItemList.itemGemKyanite))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotLead,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockLead.asItem()))
                .addCriterion("leadingot",hasItem(ItemList.itemIngotLead))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotLemurite,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockLemurite.asItem()))
                .addCriterion("lemuriteingot",hasItem(ItemList.itemIngotLemurite))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemGemMalachite,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockMalachite))
                .addCriterion("malachite",hasItem(ItemList.itemGemMalachite))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotManganese,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockManganese.asItem()))
                .addCriterion("manganeseingot",hasItem(ItemList.itemIngotManganese))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotMeutoite,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockMeutoite.asItem()))
                .addCriterion("meutoiteingot",hasItem(ItemList.itemIngotMeutoite))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotMidasium,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockMidasium.asItem()))
                .addCriterion("midasiumingot",hasItem(ItemList.itemIngotMidasium))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotMithril,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockMithril.asItem()))
                .addCriterion("mithrilingot",hasItem(ItemList.itemIngotMithril))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotMolybdenum,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockMolybdenum.asItem()))
                .addCriterion("molybdenumingot",hasItem(ItemList.itemIngotMolybdenum))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotNeodymium,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockNeodymium.asItem()))
                .addCriterion("neodymiumingot",hasItem(ItemList.itemIngotNeodymium))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotNeptunium,9)
                .addCriterion("neptuniumingot",hasItem(ItemList.itemIngotNeptunium))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotNickel,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockNickel.asItem()))
                .addCriterion("nickelingot",hasItem(ItemList.itemIngotNickel))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotNiobium,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockNiobium.asItem()))
                .addCriterion("niobiumingot",hasItem(ItemList.itemIngotNiobium))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemGemOnyx,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockOnyx.asItem()))
                .addCriterion("onyx",hasItem(ItemList.itemGemOnyx))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemGemOpal,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockOpal.asItem()))
                .addCriterion("opal",hasItem(ItemList.itemGemOpal))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotOrichalcum,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockOrichalcum.asItem()))
                .addCriterion("orichalcumingot",hasItem(ItemList.itemIngotOrichalcum))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotOsmium,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockOsmium.asItem()))
                .addCriterion("osmiumingot",hasItem(ItemList.itemIngotOsmium))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotOureclase,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockOureclase.asItem()))
                .addCriterion("oureclaseingot",hasItem(ItemList.itemIngotOureclase))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotPalladium,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockPalladium.asItem()))
                .addCriterion("palladiumingot",hasItem(ItemList.itemIngotPalladium))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemGemPeridot,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockPeridot.asItem()))
                .addCriterion("peridot",hasItem(ItemList.itemGemPeridot))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemGemPhoenixite,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockPhoenixite.asItem()))
                .addCriterion("phoenixite",hasItem(ItemList.itemGemPhoenixite))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotPlatinum,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockPlatinum.asItem()))
                .addCriterion("platinumingot",hasItem(ItemList.itemIngotPlatinum))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotPlutonium,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockPlutonium.asItem()))
                .addCriterion("plutoniumingot",hasItem(ItemList.itemIngotPlutonium))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotPolonium,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockPolonium.asItem()))
                .addCriterion("poloniumingot",hasItem(ItemList.itemIngotPolonium))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotPromethium,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockPromethium.asItem()))
                .addCriterion("promethiumingot",hasItem(ItemList.itemIngotPromethium))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotRhenium,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockRhenium.asItem()))
                .addCriterion("rheniumingot",hasItem(ItemList.itemIngotRhenium))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotRhodium,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockRhodium.asItem()))
                .addCriterion("rhodiumingot",hasItem(ItemList.itemIngotRhodium))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotRubracium,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockRubracium.asItem()))
                .addCriterion("rubraciumingot",hasItem(ItemList.itemIngotRubracium))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemGemRuby,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockRuby.asItem()))
                .addCriterion("ruby",hasItem(ItemList.itemGemRuby))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotRuthenium,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockRuthenium.asItem()))
                .addCriterion("rutheniumingot",hasItem(ItemList.itemIngotRuthenium))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotSanguinite,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockSanguinite.asItem()))
                .addCriterion("sanguiniteingot",hasItem(ItemList.itemIngotSanguinite))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemGemSapphire,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockSapphire.asItem()))
                .addCriterion("sapphire",hasItem(ItemList.itemGemSapphire))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotShadowIron,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockShadowIron.asItem()))
                .addCriterion("shadowironingot",hasItem(ItemList.itemIngotShadowIron))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotSilver,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockSilver.asItem()))
                .addCriterion("silveringot",hasItem(ItemList.itemIngotSilver))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemGemSpinel,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockSpinel.asItem()))
                .addCriterion("spinel",hasItem(ItemList.itemGemSpinel))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemGemSugilite,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockSugilite.asItem()))
                .addCriterion("sugilite",hasItem(ItemList.itemGemSugilite))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotTantalum,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockTantalum.asItem()))
                .addCriterion("tantalumingot",hasItem(ItemList.itemIngotTantalum))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemGemTanzanite,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockTanzanite.asItem()))
                .addCriterion("tanzanite",hasItem(ItemList.itemGemTanzanite))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotTartarite,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockTartarite.asItem()))
                .addCriterion("tartariteingot",hasItem(ItemList.itemIngotTartarite))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotTechnetium,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockTechnetium.asItem()))
                .addCriterion("technetiumingot",hasItem(ItemList.itemIngotTechnetium))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotThallium,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockThallium.asItem()))
                .addCriterion("thalliumingot",hasItem(ItemList.itemIngotThallium))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotTin,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockTin.asItem()))
                .addCriterion("tiningot",hasItem(ItemList.itemIngotTin))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotTitanium,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockTitanium.asItem()))
                .addCriterion("titaniumingot",hasItem(ItemList.itemIngotTitanium))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemGemTopaz,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockTopaz.asItem()))
                .addCriterion("topaz",hasItem(ItemList.itemGemTopaz))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemGemTourmaline,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockTourmaline.asItem()))
                .addCriterion("tourmaline",hasItem(ItemList.itemGemTourmaline))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotTungsten,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockTungsten.asItem()))
                .addCriterion("tungsteningot",hasItem(ItemList.itemIngotTungsten))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemGemTurquoise,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockTurquoise.asItem()))
                .addCriterion("turquoise",hasItem(ItemList.itemGemTurquoise))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotUnobtainium,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockUnobtainium.asItem()))
                .addCriterion("unobtainiumingot",hasItem(ItemList.itemIngotUnobtainium))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotUranium,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockUranium.asItem()))
                .addCriterion("uraniumingot",hasItem(ItemList.itemIngotUranium))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotVanadium,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockVanadium.asItem()))
                .addCriterion("vanadiumingot",hasItem(ItemList.itemIngotVanadium))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotVulcanite,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockVulcanite.asItem()))
                .addCriterion("vulcaniteingot",hasItem(ItemList.itemIngotVulcanite))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotVyroxeres,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockVyroxeres.asItem()))
                .addCriterion("vyroxeresingot",hasItem(ItemList.itemIngotVyroxeres))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotYellorite,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockYellorite.asItem()))
                .addCriterion("yelloriteingot",hasItem(ItemList.itemIngotYellorite))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotZinc,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockZinc.asItem()))
                .addCriterion("zincingot",hasItem(ItemList.itemIngotZinc))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.itemIngotZirconium,9)
                .addIngredient(Ingredient.fromItems(BlockList.blockZirconium.asItem()))
                .addCriterion("zirconiumingot",hasItem(ItemList.itemIngotZirconium))
                .build(consumer);
        //Smelting Ore
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreAdamantine.asItem()),ItemList.itemIngotAdamantine,0.75F,40)
                .addCriterion("smeltadamantineore",hasItem(ItemList.itemIngotAdamantine))
                .build(consumer,new ResourceLocation("extraores:smeltadamantineore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreAldourite.asItem()),ItemList.itemIngotAldourite,0.75F,40)
                .addCriterion("smeltaldouriteore",hasItem(ItemList.itemIngotAldourite))
                .build(consumer,new ResourceLocation("extraores:smeltaldouriteore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreAluminum.asItem()),ItemList.itemIngotAluminum,0.75F,40)
                .addCriterion("smeltaluminumore",hasItem(ItemList.itemIngotAluminum))
                .build(consumer,new ResourceLocation("extraores:smeltaluminumore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreAmericium.asItem()),ItemList.itemIngotAmericium,0.75F,40)
                .addCriterion("smeltamericiumore",hasItem(ItemList.itemIngotAmericium))
                .build(consumer,new ResourceLocation("extraores:smeltamericiumore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreAmordrine.asItem()),ItemList.itemIngotAmordrine,0.75F,40)
                .addCriterion("smeltamordrineore",hasItem(ItemList.itemIngotAmordrine))
                .build(consumer,new ResourceLocation("extraores:smeltamordrineore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreAngmallen.asItem()),ItemList.itemIngotAngmallen,0.75F,40)
                .addCriterion("smeltangmallenore",hasItem(ItemList.itemIngotAngmallen))
                .build(consumer,new ResourceLocation("extraores:smeltangmallenore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreAstralSilver.asItem()),ItemList.itemIngotAstralSilver,0.75F,40)
                .addCriterion("smeltastralsilverore",hasItem(ItemList.itemIngotAstralSilver))
                .build(consumer,new ResourceLocation("extraores:smeltastralsilverore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreAtlarus.asItem()),ItemList.itemIngotAtlarus,0.75F,40)
                .addCriterion("smeltatlarusore",hasItem(ItemList.itemIngotAtlarus))
                .build(consumer,new ResourceLocation("extraores:smeltatlarusore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreBismuth.asItem()),ItemList.itemIngotBismuth,0.75F,40)
                .addCriterion("smeltbismuthore",hasItem(ItemList.itemIngotBismuth))
                .build(consumer,new ResourceLocation("extraores:smeltbismuthore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreBlackSteel.asItem()),ItemList.itemIngotBlackSteel,0.75F,40)
                .addCriterion("smeltblacksteelore",hasItem(ItemList.itemIngotBlackSteel))
                .build(consumer,new ResourceLocation("extraores:smeltblacksteelore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreCadmium.asItem()),ItemList.itemIngotCadmium,0.75F,40)
                .addCriterion("smeltcadmiumore",hasItem(ItemList.itemIngotCadmium))
                .build(consumer,new ResourceLocation("extraores:smeltcadmiumore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreCarmot.asItem()),ItemList.itemIngotCarmot,0.75F,40)
                .addCriterion("smeltcarmotore",hasItem(ItemList.itemIngotCarmot))
                .build(consumer,new ResourceLocation("extraores:smeltcarmotore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreCelenegil.asItem()),ItemList.itemIngotCelenegil,0.75F,40)
                .addCriterion("smeltcelenegilore",hasItem(ItemList.itemIngotCelenegil))
                .build(consumer,new ResourceLocation("extraores:smeltcelenegilore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreCeruclase.asItem()),ItemList.itemIngotCeruclase,0.75F,40)
                .addCriterion("smeltceruclaseore",hasItem(ItemList.itemIngotCeruclase))
                .build(consumer,new ResourceLocation("extraores:smeltceruclaseore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreChromium.asItem()),ItemList.itemIngotChromium,0.75F,40)
                .addCriterion("smeltchromiumore",hasItem(ItemList.itemIngotChromium))
                .build(consumer,new ResourceLocation("extraores:smeltchromiumore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreCobalt.asItem()),ItemList.itemIngotCobalt,0.75F,40)
                .addCriterion("smeltcobaltore",hasItem(ItemList.itemIngotCobalt))
                .build(consumer,new ResourceLocation("extraores:smeltcobaltore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreCopper.asItem()),ItemList.itemIngotCopper,0.75F,40)
                .addCriterion("smeltcopperore",hasItem(ItemList.itemIngotCopper))
                .build(consumer,new ResourceLocation("extraores:smeltcopperore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreDeepIron.asItem()),ItemList.itemIngotDeepIron,0.75F,40)
                .addCriterion("smeltdeepironore",hasItem(ItemList.itemIngotDeepIron))
                .build(consumer,new ResourceLocation("extraores:smeltdeepironore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreDesichalkos.asItem()),ItemList.itemIngotDesichalkos,0.75F,40)
                .addCriterion("smeltdesichalkosore",hasItem(ItemList.itemIngotDesichalkos))
                .build(consumer,new ResourceLocation("extraores:smeltdesichalkosore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreEximite.asItem()),ItemList.itemIngotEximite,0.75F,40)
                .addCriterion("smelteximiteore",hasItem(ItemList.itemIngotEximite))
                .build(consumer,new ResourceLocation("extraores:smelteximiteore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreGallium.asItem()),ItemList.itemIngotGallium,0.75F,40)
                .addCriterion("smeltgalliumore",hasItem(ItemList.itemIngotGallium))
                .build(consumer,new ResourceLocation("extraores:smeltgalliumore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreHaderoth.asItem()),ItemList.itemIngotHaderoth,0.75F,40)
                .addCriterion("smelthaderothore",hasItem(ItemList.itemIngotHaderoth))
                .build(consumer,new ResourceLocation("extraores:smelthaderothore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreHepatizon.asItem()),ItemList.itemIngotHepatizon,0.75F,40)
                .addCriterion("smelthepatizonore",hasItem(ItemList.itemIngotHepatizon))
                .build(consumer,new ResourceLocation("extraores:smelthepatizonore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreIgnatius.asItem()),ItemList.itemIngotIgnatius,0.75F,40)
                .addCriterion("smeltignatiusore",hasItem(ItemList.itemIngotIgnatius))
                .build(consumer,new ResourceLocation("extraores:smeltignatiusore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreIndium.asItem()),ItemList.itemIngotIndium,0.75F,40)
                .addCriterion("smeltindiumore",hasItem(ItemList.itemIngotIndium))
                .build(consumer,new ResourceLocation("extraores:smeltindiumore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreInfuscolium.asItem()),ItemList.itemIngotInfuscolium,0.75F,40)
                .addCriterion("smeltinfuscoliumore",hasItem(ItemList.itemIngotInfuscolium))
                .build(consumer,new ResourceLocation("extraores:smeltinfuscoliumore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreInolashite.asItem()),ItemList.itemIngotInolashite,0.75F,40)
                .addCriterion("smeltinolashiteore",hasItem(ItemList.itemIngotInolashite))
                .build(consumer,new ResourceLocation("extraores:smeltinolashiteore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreIridium.asItem()),ItemList.itemIngotIridium,0.75F,40)
                .addCriterion("smeltiridiumore",hasItem(ItemList.itemIngotIridium))
                .build(consumer,new ResourceLocation("extraores:smeltiridiumore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreKalendrite.asItem()),ItemList.itemIngotKalendrite,0.75F,40)
                .addCriterion("smeltkalendriteore",hasItem(ItemList.itemIngotKalendrite))
                .build(consumer,new ResourceLocation("extraores:smeltkalendriteore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreLead.asItem()),ItemList.itemIngotLead,0.75F,40)
                .addCriterion("smeltleadore",hasItem(ItemList.itemIngotLead))
                .build(consumer,new ResourceLocation("extraores:smeltleadore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreLemurite.asItem()),ItemList.itemIngotLemurite,0.75F,40)
                .addCriterion("smeltlemuriteore",hasItem(ItemList.itemIngotLemurite))
                .build(consumer,new ResourceLocation("extraores:smeltlemuriteore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreManganese.asItem()),ItemList.itemIngotManganese,0.75F,40)
                .addCriterion("smeltmanganeseore",hasItem(ItemList.itemIngotManganese))
                .build(consumer,new ResourceLocation("extraores:smeltmanganeseore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreMeutoite.asItem()),ItemList.itemIngotMeutoite,0.75F,40)
                .addCriterion("smeltmeutoiteore",hasItem(ItemList.itemIngotMeutoite))
                .build(consumer,new ResourceLocation("extraores:smeltmeutoiteore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreMidasium.asItem()),ItemList.itemIngotMidasium,0.75F,40)
                .addCriterion("smeltmidasiumore",hasItem(ItemList.itemIngotMidasium))
                .build(consumer,new ResourceLocation("extraores:smeltmidasiumore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreMithril.asItem()),ItemList.itemIngotMithril,0.75F,40)
                .addCriterion("smeltmithrilore",hasItem(ItemList.itemIngotMithril))
                .build(consumer,new ResourceLocation("extraores:smeltmithrilore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreMolybdenum.asItem()),ItemList.itemIngotMolybdenum,0.75F,40)
                .addCriterion("smeltmolybdenumore",hasItem(ItemList.itemIngotMolybdenum))
                .build(consumer,new ResourceLocation("extraores:smeltmolybdenumore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreNeodymium.asItem()),ItemList.itemIngotNeodymium,0.75F,40)
                .addCriterion("smeltneodymiumore",hasItem(ItemList.itemIngotNeodymium))
                .build(consumer,new ResourceLocation("extraores:smeltneodymiumore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreNeptunium.asItem()),ItemList.itemIngotNeptunium,0.75F,40)
                .addCriterion("smeltneptuniumore",hasItem(ItemList.itemIngotNeptunium))
                .build(consumer,new ResourceLocation("extraores:smeltneptuniumore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreNickel.asItem()),ItemList.itemIngotNickel,0.75F,40)
                .addCriterion("smeltnickelore",hasItem(ItemList.itemIngotNickel))
                .build(consumer,new ResourceLocation("extraores:smeltnickelore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreNiobium.asItem()),ItemList.itemIngotNiobium,0.75F,40)
                .addCriterion("smeltniobiumore",hasItem(ItemList.itemIngotNiobium))
                .build(consumer,new ResourceLocation("extraores:smeltniobiumore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreOrichalcum.asItem()),ItemList.itemIngotOrichalcum,0.75F,40)
                .addCriterion("smeltorichalcumore",hasItem(ItemList.itemIngotOrichalcum))
                .build(consumer,new ResourceLocation("extraores:smeltorichalcumore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreOureclase.asItem()),ItemList.itemIngotOureclase,0.75F,40)
                .addCriterion("smeltoureclaseore",hasItem(ItemList.itemIngotOureclase))
                .build(consumer,new ResourceLocation("extraores:smeltoureclaseore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOrePalladium.asItem()),ItemList.itemIngotPalladium,0.75F,40)
                .addCriterion("smeltpalladiumore",hasItem(ItemList.itemIngotPalladium))
                .build(consumer,new ResourceLocation("extraores:smeltpalladiumore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOrePlatinum.asItem()),ItemList.itemIngotPlatinum,0.75F,40)
                .addCriterion("smeltplatinumore",hasItem(ItemList.itemIngotPlatinum))
                .build(consumer,new ResourceLocation("extraores:smeltplatinumore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOrePlutonium.asItem()),ItemList.itemIngotPlutonium,0.75F,40)
                .addCriterion("smeltplutoniumore",hasItem(ItemList.itemIngotPlutonium))
                .build(consumer,new ResourceLocation("extraores:smeltplutoniumore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOrePolonium.asItem()),ItemList.itemIngotPolonium,0.75F,40)
                .addCriterion("smeltpoloniumore",hasItem(ItemList.itemIngotPolonium))
                .build(consumer,new ResourceLocation("extraores:smeltpoloniumore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOrePromethium.asItem()),ItemList.itemIngotPromethium,0.75F,40)
                .addCriterion("smeltpromethiumore",hasItem(ItemList.itemIngotPromethium))
                .build(consumer,new ResourceLocation("extraores:smeltpromethiumore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreRhenium.asItem()),ItemList.itemIngotRhenium,0.75F,40)
                .addCriterion("smeltrheniumore",hasItem(ItemList.itemIngotRhenium))
                .build(consumer,new ResourceLocation("extraores:smeltrheniumore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreRhodium.asItem()),ItemList.itemIngotRhodium,0.75F,40)
                .addCriterion("smeltrhodiumore",hasItem(ItemList.itemIngotRhodium))
                .build(consumer,new ResourceLocation("extraores:smeltrhodiumore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreRubracium.asItem()),ItemList.itemIngotRubracium,0.75F,40)
                .addCriterion("smeltrubraciumore",hasItem(ItemList.itemIngotRubracium))
                .build(consumer,new ResourceLocation("extraores:smeltrubraciumore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreRuthenium.asItem()),ItemList.itemIngotRuthenium,0.75F,40)
                .addCriterion("smeltrutheniumore",hasItem(ItemList.itemIngotRuthenium))
                .build(consumer,new ResourceLocation("extraores:smeltrutheniumore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreSanguinite.asItem()),ItemList.itemIngotSanguinite,0.75F,40)
                .addCriterion("smeltsanguiniteore",hasItem(ItemList.itemIngotSanguinite))
                .build(consumer,new ResourceLocation("extraores:smeltsanguiniteore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreShadowIron.asItem()),ItemList.itemIngotShadowIron,0.75F,40)
                .addCriterion("smeltshadowironore",hasItem(ItemList.itemIngotShadowIron))
                .build(consumer,new ResourceLocation("extraores:smeltshadowironore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreSilver.asItem()),ItemList.itemIngotSilver,0.75F,40)
                .addCriterion("smeltsilverore",hasItem(ItemList.itemIngotSilver))
                .build(consumer,new ResourceLocation("extraores:smeltsilverore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreTantalum.asItem()),ItemList.itemIngotTantalum,0.75F,40)
                .addCriterion("smelttantalumore",hasItem(ItemList.itemIngotTantalum))
                .build(consumer,new ResourceLocation("extraores:smelttantalumore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreTartarite.asItem()),ItemList.itemIngotTartarite,0.75F,40)
                .addCriterion("smelttartariteore",hasItem(ItemList.itemIngotTartarite))
                .build(consumer,new ResourceLocation("extraores:smelttartariteore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreTechnetium.asItem()),ItemList.itemIngotTechnetium,0.75F,40)
                .addCriterion("smelttechnetiumore",hasItem(ItemList.itemIngotTechnetium))
                .build(consumer,new ResourceLocation("extraores:smelttechnetiumore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreThallium.asItem()),ItemList.itemIngotThallium,0.75F,40)
                .addCriterion("smeltthalliumore",hasItem(ItemList.itemIngotThallium))
                .build(consumer,new ResourceLocation("extraores:smeltthalliumore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreTin.asItem()),ItemList.itemIngotTin,0.75F,40)
                .addCriterion("smelttinore",hasItem(ItemList.itemIngotTin))
                .build(consumer,new ResourceLocation("extraores:smelttinore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreTitanium.asItem()),ItemList.itemIngotTitanium,0.75F,40)
                .addCriterion("smelttitaniumore",hasItem(ItemList.itemIngotTitanium))
                .build(consumer,new ResourceLocation("extraores:smelttitaniumore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreTungsten.asItem()),ItemList.itemIngotTungsten,0.75F,40)
                .addCriterion("smelttungstenore",hasItem(ItemList.itemIngotTungsten))
                .build(consumer,new ResourceLocation("extraores:smelttungstenore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreUnobtainium.asItem()),ItemList.itemIngotUnobtainium,0.75F,40)
                .addCriterion("smeltunobtainiumore",hasItem(ItemList.itemIngotUnobtainium))
                .build(consumer,new ResourceLocation("extraores:smeltunobtainiumore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreUranium.asItem()),ItemList.itemIngotUranium,0.75f,40)
                .addCriterion("smelturaniumore",hasItem(ItemList.itemIngotUranium))
                .build(consumer,new ResourceLocation("extraores:smelturaniumore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreVanadium.asItem()),ItemList.itemIngotVanadium,0.75F,40)
                .addCriterion("smeltvanadiumore",hasItem(ItemList.itemIngotVanadium))
                .build(consumer,new ResourceLocation("extraores:smeltvanadiumore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreVulcanite.asItem()),ItemList.itemIngotVulcanite,0.75F,40)
                .addCriterion("smeltvulcaniteore",hasItem(ItemList.itemIngotVulcanite))
                .build(consumer,new ResourceLocation("extraores:smeltvulcaniteore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreVyroxeres.asItem()),ItemList.itemIngotVyroxeres,0.75F,40)
                .addCriterion("smeltvyroxeresore",hasItem(ItemList.itemIngotVyroxeres))
                .build(consumer,new ResourceLocation("extraores:smeltvyroxeresore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreYellorite.asItem()),ItemList.itemIngotYellorite,0.75F,40)
                .addCriterion("smeltyelloriteore",hasItem(ItemList.itemIngotYellorite))
                .build(consumer,new ResourceLocation("extraores:smeltyelloriteore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreZinc.asItem()),ItemList.itemIngotZinc,0.75F,40)
                .addCriterion("smeltzincore",hasItem(ItemList.itemIngotZinc))
                .build(consumer,new ResourceLocation("extraores:smeltzincore"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockList.blockOreZirconium.asItem()),ItemList.itemIngotZirconium,0.75F,40)
                .addCriterion("smeltzirconiumore",hasItem(ItemList.itemIngotZirconium))
                .build(consumer,new ResourceLocation("extraores:smeltzirconiumore"));
        //Smelting Dust
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustAdamantine),ItemList.itemIngotAdamantine,0.75F,20)
                .addCriterion("smeltadamantinedust",hasItem(ItemList.itemIngotAdamantine))
                .build(consumer,new ResourceLocation("extraores:smeltadamantinedust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustAldourite),ItemList.itemIngotAldourite,0.75F,20)
                .addCriterion("smeltaldouritedust",hasItem(ItemList.itemIngotAldourite))
                .build(consumer,new ResourceLocation("extraores:smeltaldouritedust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustAluminum),ItemList.itemIngotAluminum,0.75F,20)
                .addCriterion("smeltaluminumdust",hasItem(ItemList.itemIngotAluminum))
                .build(consumer,new ResourceLocation("extraores:smeltaluminumdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustAmericium),ItemList.itemIngotAmericium,0.75F,20)
                .addCriterion("smeltamericiumdust",hasItem(ItemList.itemIngotAmericium))
                .build(consumer,new ResourceLocation("extraores:smeltamericiumdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustAmordrine),ItemList.itemIngotAmordrine,0.75F,20)
                .addCriterion("smeltamordrinedust",hasItem(ItemList.itemIngotAmordrine))
                .build(consumer,new ResourceLocation("extraores:smeltamordrinedust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustAngmallen),ItemList.itemIngotAngmallen,0.75F,20)
                .addCriterion("smeltangmallendust",hasItem(ItemList.itemIngotAngmallen))
                .build(consumer,new ResourceLocation("extraores:smeltangmallendust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustAstralSilver),ItemList.itemIngotAstralSilver,0.75F,20)
                .addCriterion("smeltastralsilverdust",hasItem(ItemList.itemIngotAstralSilver))
                .build(consumer,new ResourceLocation("extraores:smeltastralsilverdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustAtlarus),ItemList.itemIngotAtlarus,0.75F,20)
                .addCriterion("smeltatlarusdust",hasItem(ItemList.itemIngotAtlarus))
                .build(consumer,new ResourceLocation("extraores:smeltatlarusdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustBismuth),ItemList.itemIngotBismuth,0.75F,20)
                .addCriterion("smeltbismuthdust",hasItem(ItemList.itemIngotBismuth))
                .build(consumer,new ResourceLocation("extraores:smeltbismuthdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustBlackSteel),ItemList.itemIngotBlackSteel,0.75F,20)
                .addCriterion("smeltblacksteeldust",hasItem(ItemList.itemIngotBlackSteel))
                .build(consumer,new ResourceLocation("extraores:smeltblacksteeldust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustCadmium),ItemList.itemIngotCadmium,0.75F,20)
                .addCriterion("smeltcadmiumdust",hasItem(ItemList.itemIngotCadmium))
                .build(consumer,new ResourceLocation("extraores:smeltcadmiumdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustCarmot),ItemList.itemIngotCarmot,0.75F,20)
                .addCriterion("smeltcarmotdust",hasItem(ItemList.itemIngotCarmot))
                .build(consumer,new ResourceLocation("extraores:smeltcarmotdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustCelenegil),ItemList.itemIngotCelenegil,0.75F,20)
                .addCriterion("smeltcelenegildust",hasItem(ItemList.itemIngotCelenegil))
                .build(consumer,new ResourceLocation("extraores:smeltcelenegildust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustCeruclase),ItemList.itemIngotCeruclase,0.75F,20)
                .addCriterion("smeltceruclasedust",hasItem(ItemList.itemIngotCeruclase))
                .build(consumer,new ResourceLocation("extraores:smeltceruclasedust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustChromium),ItemList.itemIngotChromium,0.75F,20)
                .addCriterion("smeltchromiumdust",hasItem(ItemList.itemIngotChromium))
                .build(consumer,new ResourceLocation("extraores:smeltchromiumdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustCobalt),ItemList.itemIngotCobalt,0.75F,20)
                .addCriterion("smeltcobaltdust",hasItem(ItemList.itemIngotCobalt))
                .build(consumer,new ResourceLocation("extraores:smeltcobaltdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustCopper),ItemList.itemIngotCopper,0.75F,20)
                .addCriterion("smeltcopperdust",hasItem(ItemList.itemIngotCopper))
                .build(consumer,new ResourceLocation("extraores:smeltcopperdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustDeepIron),ItemList.itemIngotDeepIron,0.75F,20)
                .addCriterion("smeltdeepirondust",hasItem(ItemList.itemIngotDeepIron))
                .build(consumer,new ResourceLocation("extraores:smeltdeepirondust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustDesichalkos),ItemList.itemIngotDesichalkos,0.75F,20)
                .addCriterion("smeltdesichalkosdust",hasItem(ItemList.itemIngotDesichalkos))
                .build(consumer,new ResourceLocation("extraores:smeltdesichalkosdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustEximite),ItemList.itemIngotEximite,0.75F,20)
                .addCriterion("smelteximitedust",hasItem(ItemList.itemIngotEximite))
                .build(consumer,new ResourceLocation("extraores:smelteximitedust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustGallium),ItemList.itemIngotGallium,0.75F,20)
                .addCriterion("smeltgalliumdust",hasItem(ItemList.itemIngotGallium))
                .build(consumer,new ResourceLocation("extraores:smeltgalliumdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustHaderoth),ItemList.itemIngotHaderoth,0.75F,20)
                .addCriterion("smelthaderothdust",hasItem(ItemList.itemIngotHaderoth))
                .build(consumer,new ResourceLocation("extraores:smelthaderothdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustHepatizon),ItemList.itemIngotHepatizon,0.75F,20)
                .addCriterion("smelthepatizondust",hasItem(ItemList.itemIngotHepatizon))
                .build(consumer,new ResourceLocation("extraores:smelthepatizondust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustIgnatius),ItemList.itemIngotIgnatius,0.75F,20)
                .addCriterion("smeltignatiusdust",hasItem(ItemList.itemIngotIgnatius))
                .build(consumer,new ResourceLocation("extraores:smeltignatiusdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustIndium),ItemList.itemIngotIndium,0.75F,20)
                .addCriterion("smeltindiumdust",hasItem(ItemList.itemIngotIndium))
                .build(consumer,new ResourceLocation("extraores:smeltindiumdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustInfuscolium),ItemList.itemIngotInfuscolium,0.75F,20)
                .addCriterion("smeltinfuscoliumdust",hasItem(ItemList.itemIngotInfuscolium))
                .build(consumer,new ResourceLocation("extraores:smeltinfuscoliumdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustInolashite),ItemList.itemIngotInolashite,0.75F,20)
                .addCriterion("smeltinolashitedust",hasItem(ItemList.itemIngotInolashite))
                .build(consumer,new ResourceLocation("extraores:smeltinolashitedust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustIridium),ItemList.itemIngotIridium,0.75F,20)
                .addCriterion("smeltiridiumdust",hasItem(ItemList.itemIngotIridium))
                .build(consumer,new ResourceLocation("extraores:smeltiridiumdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustKalendrite),ItemList.itemIngotKalendrite,0.75F,20)
                .addCriterion("smeltkalendritedust",hasItem(ItemList.itemIngotKalendrite))
                .build(consumer,new ResourceLocation("extraores:smeltkalendritedust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustLead),ItemList.itemIngotLead,0.75F,20)
                .addCriterion("smeltleaddust",hasItem(ItemList.itemIngotLead))
                .build(consumer,new ResourceLocation("extraores:smeltleaddust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustLemurite),ItemList.itemIngotLemurite,0.75F,20)
                .addCriterion("smeltlemuritedust",hasItem(ItemList.itemIngotLemurite))
                .build(consumer,new ResourceLocation("extraores:smeltlemuritedust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustManganese),ItemList.itemIngotManganese,0.75F,20)
                .addCriterion("smeltmanganesedust",hasItem(ItemList.itemIngotManganese))
                .build(consumer,new ResourceLocation("extraores:smeltmanganesedust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustMeutoite),ItemList.itemIngotMeutoite,0.75F,20)
                .addCriterion("smeltmeutoitedust",hasItem(ItemList.itemIngotMeutoite))
                .build(consumer,new ResourceLocation("extraores:smeltmeutoitedust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustMidasium),ItemList.itemIngotMidasium,0.75F,20)
                .addCriterion("smeltmidasiumdust",hasItem(ItemList.itemIngotMidasium))
                .build(consumer,new ResourceLocation("extraores:smeltmidasiumdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustMithril),ItemList.itemIngotMithril,0.75F,20)
                .addCriterion("smeltmithrildust",hasItem(ItemList.itemIngotMithril))
                .build(consumer,new ResourceLocation("extraores:smeltmithrildust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustMolybdenum),ItemList.itemIngotMolybdenum,0.75F,20)
                .addCriterion("smeltmolybdenumdust",hasItem(ItemList.itemIngotMolybdenum))
                .build(consumer,new ResourceLocation("extraores:smeltmolybdenumdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustNeodymium),ItemList.itemIngotNeodymium,0.75F,20)
                .addCriterion("smeltneodymiumdust",hasItem(ItemList.itemIngotNeodymium))
                .build(consumer,new ResourceLocation("extraores:smeltneodymiumdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustNeptunium),ItemList.itemIngotNeptunium,0.75F,20)
                .addCriterion("smeltneptuniumdust",hasItem(ItemList.itemIngotNeptunium))
                .build(consumer,new ResourceLocation("extraores:smeltneptuniumdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustNickel),ItemList.itemIngotNickel,0.75F,20)
                .addCriterion("smeltnickeldust",hasItem(ItemList.itemIngotNickel))
                .build(consumer,new ResourceLocation("extraores:smeltnickeldust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustNiobium),ItemList.itemIngotNiobium,0.75F,20)
                .addCriterion("smeltniobiumdust",hasItem(ItemList.itemIngotNiobium))
                .build(consumer,new ResourceLocation("extraores:smeltniobiumdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustOrichalcum),ItemList.itemIngotOrichalcum,0.75F,20)
                .addCriterion("smeltorichalcumdust",hasItem(ItemList.itemIngotOrichalcum))
                .build(consumer,new ResourceLocation("extraores:smeltorichalcumdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustOureclase),ItemList.itemIngotOureclase,0.75F,20)
                .addCriterion("smeltoureclasedust",hasItem(ItemList.itemIngotOureclase))
                .build(consumer,new ResourceLocation("extraores:smeltoureclasedust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustPalladium),ItemList.itemIngotPalladium,0.75F,20)
                .addCriterion("smeltpalladiumdust",hasItem(ItemList.itemIngotPalladium))
                .build(consumer,new ResourceLocation("extraores:smeltpalladiumdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustPlatinum),ItemList.itemIngotPlatinum,0.75F,20)
                .addCriterion("smeltplatinumdust",hasItem(ItemList.itemIngotPlatinum))
                .build(consumer,new ResourceLocation("extraores:smeltplatinumdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustPlutonium),ItemList.itemIngotPlutonium,0.75F,20)
                .addCriterion("smeltplutoniumdust",hasItem(ItemList.itemIngotPlutonium))
                .build(consumer,new ResourceLocation("extraores:smeltplutoniumdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustPolonium),ItemList.itemIngotPolonium,0.75F,20)
                .addCriterion("smeltpoloniumdust",hasItem(ItemList.itemIngotPolonium))
                .build(consumer,new ResourceLocation("extraores:smeltpoloniumdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustPromethium),ItemList.itemIngotPromethium,0.75F,20)
                .addCriterion("smeltpromethiumdust",hasItem(ItemList.itemIngotPromethium))
                .build(consumer,new ResourceLocation("extraores:smeltpromethiumdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustRhenium),ItemList.itemIngotRhenium,0.75F,20)
                .addCriterion("smeltrheniumdust",hasItem(ItemList.itemIngotRhenium))
                .build(consumer,new ResourceLocation("extraores:smeltrheniumdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustRhodium),ItemList.itemIngotRhodium,0.75F,20)
                .addCriterion("smeltrhodiumdust",hasItem(ItemList.itemIngotRhodium))
                .build(consumer,new ResourceLocation("extraores:smeltrhodiumdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustRubracium),ItemList.itemIngotRubracium,0.75F,20)
                .addCriterion("smeltrubraciumdust",hasItem(ItemList.itemIngotRubracium))
                .build(consumer,new ResourceLocation("extraores:smeltrubraciumdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustRuthenium),ItemList.itemIngotRuthenium,0.75F,20)
                .addCriterion("smeltrutheniumdust",hasItem(ItemList.itemIngotRuthenium))
                .build(consumer,new ResourceLocation("extraores:smeltrutheniumdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustSanguinite),ItemList.itemIngotSanguinite,0.75F,20)
                .addCriterion("smeltsanguinitedust",hasItem(ItemList.itemIngotSanguinite))
                .build(consumer,new ResourceLocation("extraores:smeltsanguinitedust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustShadowIron),ItemList.itemIngotShadowIron,0.75F,20)
                .addCriterion("smeltshadowirondust",hasItem(ItemList.itemIngotShadowIron))
                .build(consumer,new ResourceLocation("extraores:smeltshadowirondust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustSilver),ItemList.itemIngotSilver,0.75F,20)
                .addCriterion("smeltsilverdust",hasItem(ItemList.itemIngotSilver))
                .build(consumer,new ResourceLocation("extraores:smeltsilverdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustTantalum),ItemList.itemIngotTantalum,0.75F,20)
                .addCriterion("smelttantalumdust",hasItem(ItemList.itemIngotTantalum))
                .build(consumer,new ResourceLocation("extraores:smelttantalumdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustTartarite),ItemList.itemIngotTartarite,0.75F,20)
                .addCriterion("smelttartaritedust",hasItem(ItemList.itemIngotTartarite))
                .build(consumer,new ResourceLocation("extraores:smelttartaritedust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustTechnetium),ItemList.itemIngotTechnetium,0.75F,20)
                .addCriterion("smelttechnetiumdust",hasItem(ItemList.itemIngotTechnetium))
                .build(consumer,new ResourceLocation("extraores:smelttechnetiumdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustThallium),ItemList.itemIngotThallium,0.75F,20)
                .addCriterion("smeltthalliumdust",hasItem(ItemList.itemIngotThallium))
                .build(consumer,new ResourceLocation("extraores:smeltthalliumdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustTin),ItemList.itemIngotTin,0.75F,20)
                .addCriterion("smelttindust",hasItem(ItemList.itemIngotTin))
                .build(consumer,new ResourceLocation("extraores:smelttindust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustTitanium),ItemList.itemIngotTitanium,0.75F,20)
                .addCriterion("smelttitaniumdust",hasItem(ItemList.itemIngotTitanium))
                .build(consumer,new ResourceLocation("extraores:smelttitaniumdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustTungsten),ItemList.itemIngotTungsten,0.75F,20)
                .addCriterion("smelttungstendust",hasItem(ItemList.itemIngotTungsten))
                .build(consumer,new ResourceLocation("extraores:smelttungstendust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustUnobtainium),ItemList.itemIngotUnobtainium,0.75F,20)
                .addCriterion("smeltunobtainiumdust",hasItem(ItemList.itemIngotUnobtainium))
                .build(consumer,new ResourceLocation("extraores:smeltunobtainiumdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustUranium),ItemList.itemIngotUranium,0.75f,20)
                .addCriterion("smelturaniumdust",hasItem(ItemList.itemIngotUranium))
                .build(consumer,new ResourceLocation("extraores:smelturaniumdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustVanadium),ItemList.itemIngotVanadium,0.75F,20)
                .addCriterion("smeltvanadiumdust",hasItem(ItemList.itemIngotVanadium))
                .build(consumer,new ResourceLocation("extraores:smeltvanadiumdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustVulcanite),ItemList.itemIngotVulcanite,0.75F,20)
                .addCriterion("smeltvulcanitedust",hasItem(ItemList.itemIngotVulcanite))
                .build(consumer,new ResourceLocation("extraores:smeltvulcanitedust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustVyroxeres),ItemList.itemIngotVyroxeres,0.75F,20)
                .addCriterion("smeltvyroxeresdust",hasItem(ItemList.itemIngotVyroxeres))
                .build(consumer,new ResourceLocation("extraores:smeltvyroxeresdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustYellorite),ItemList.itemIngotYellorite,0.75F,20)
                .addCriterion("smeltyelloritedust",hasItem(ItemList.itemIngotYellorite))
                .build(consumer,new ResourceLocation("extraores:smeltyelloritedust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustZinc),ItemList.itemIngotZinc,0.75F,20)
                .addCriterion("smeltzincdust",hasItem(ItemList.itemIngotZinc))
                .build(consumer,new ResourceLocation("extraores:smeltzincdust"));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemList.itemDustZirconium),ItemList.itemIngotZirconium,0.75F,20)
                .addCriterion("smeltzirconiumdust",hasItem(ItemList.itemIngotZirconium))
                .build(consumer,new ResourceLocation("extraores:smeltzirconiumdust"));
        //Blasting Ore
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreAdamantine.asItem()),ItemList.itemIngotAdamantine,0.75F,20)
                .addCriterion("blastadamantineore",hasItem(ItemList.itemIngotAdamantine))
                .build(consumer,new ResourceLocation("extraores:blastadamantineore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreAldourite.asItem()),ItemList.itemIngotAldourite,0.75F,20)
                .addCriterion("blastaldouriteore",hasItem(ItemList.itemIngotAldourite))
                .build(consumer,new ResourceLocation("extraores:blastaldouriteore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreAluminum.asItem()),ItemList.itemIngotAluminum,0.75F,20)
                .addCriterion("blastaluminumore",hasItem(ItemList.itemIngotAluminum))
                .build(consumer,new ResourceLocation("extraores:blastaluminumore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreAmericium.asItem()),ItemList.itemIngotAmericium,0.75F,20)
                .addCriterion("blastamericiumore",hasItem(ItemList.itemIngotAmericium))
                .build(consumer,new ResourceLocation("extraores:blastamericiumore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreAmordrine.asItem()),ItemList.itemIngotAmordrine,0.75F,20)
                .addCriterion("blastamordrineore",hasItem(ItemList.itemIngotAmordrine))
                .build(consumer,new ResourceLocation("extraores:blastamordrineore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreAngmallen.asItem()),ItemList.itemIngotAngmallen,0.75F,20)
                .addCriterion("blastangmallenore",hasItem(ItemList.itemIngotAngmallen))
                .build(consumer,new ResourceLocation("extraores:blastangmallenore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreAstralSilver.asItem()),ItemList.itemIngotAstralSilver,0.75F,20)
                .addCriterion("blastastralsilverore",hasItem(ItemList.itemIngotAstralSilver))
                .build(consumer,new ResourceLocation("extraores:blastastralsilverore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreAtlarus.asItem()),ItemList.itemIngotAtlarus,0.75F,20)
                .addCriterion("blastatlarusore",hasItem(ItemList.itemIngotAtlarus))
                .build(consumer,new ResourceLocation("extraores:blastatlarusore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreBismuth.asItem()),ItemList.itemIngotBismuth,0.75F,20)
                .addCriterion("blastbismuthore",hasItem(ItemList.itemIngotBismuth))
                .build(consumer,new ResourceLocation("extraores:blastbismuthore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreBlackSteel.asItem()),ItemList.itemIngotBlackSteel,0.75F,20)
                .addCriterion("blastblacksteelore",hasItem(ItemList.itemIngotBlackSteel))
                .build(consumer,new ResourceLocation("extraores:blastblacksteelore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreCadmium.asItem()),ItemList.itemIngotCadmium,0.75F,20)
                .addCriterion("blastcadmiumore",hasItem(ItemList.itemIngotCadmium))
                .build(consumer,new ResourceLocation("extraores:blastcadmiumore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreCarmot.asItem()),ItemList.itemIngotCarmot,0.75F,20)
                .addCriterion("blastcarmotore",hasItem(ItemList.itemIngotCarmot))
                .build(consumer,new ResourceLocation("extraores:blastcarmotore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreCelenegil.asItem()),ItemList.itemIngotCelenegil,0.75F,20)
                .addCriterion("blastcelenegilore",hasItem(ItemList.itemIngotCelenegil))
                .build(consumer,new ResourceLocation("extraores:blastcelenegilore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreCeruclase.asItem()),ItemList.itemIngotCeruclase,0.75F,20)
                .addCriterion("blastceruclaseore",hasItem(ItemList.itemIngotCeruclase))
                .build(consumer,new ResourceLocation("extraores:blastceruclaseore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreChromium.asItem()),ItemList.itemIngotChromium,0.75F,20)
                .addCriterion("blastchromiumore",hasItem(ItemList.itemIngotChromium))
                .build(consumer,new ResourceLocation("extraores:blastchromiumore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreCobalt.asItem()),ItemList.itemIngotCobalt,0.75F,20)
                .addCriterion("blastcobaltore",hasItem(ItemList.itemIngotCobalt))
                .build(consumer,new ResourceLocation("extraores:blastcobaltore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreCopper.asItem()),ItemList.itemIngotCopper,0.75F,20)
                .addCriterion("blastcopperore",hasItem(ItemList.itemIngotCopper))
                .build(consumer,new ResourceLocation("extraores:blastcopperore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreDeepIron.asItem()),ItemList.itemIngotDeepIron,0.75F,20)
                .addCriterion("blastdeepironore",hasItem(ItemList.itemIngotDeepIron))
                .build(consumer,new ResourceLocation("extraores:blastdeepironore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreDesichalkos.asItem()),ItemList.itemIngotDesichalkos,0.75F,20)
                .addCriterion("blastdesichalkosore",hasItem(ItemList.itemIngotDesichalkos))
                .build(consumer,new ResourceLocation("extraores:blastdesichalkosore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreEximite.asItem()),ItemList.itemIngotEximite,0.75F,20)
                .addCriterion("blasteximiteore",hasItem(ItemList.itemIngotEximite))
                .build(consumer,new ResourceLocation("extraores:blasteximiteore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreGallium.asItem()),ItemList.itemIngotGallium,0.75F,20)
                .addCriterion("blastgalliumore",hasItem(ItemList.itemIngotGallium))
                .build(consumer,new ResourceLocation("extraores:blastgalliumore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreHaderoth.asItem()),ItemList.itemIngotHaderoth,0.75F,20)
                .addCriterion("blasthaderothore",hasItem(ItemList.itemIngotHaderoth))
                .build(consumer,new ResourceLocation("extraores:blasthaderothore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreHepatizon.asItem()),ItemList.itemIngotHepatizon,0.75F,20)
                .addCriterion("blasthepatizonore",hasItem(ItemList.itemIngotHepatizon))
                .build(consumer,new ResourceLocation("extraores:blasthepatizonore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreIgnatius.asItem()),ItemList.itemIngotIgnatius,0.75F,20)
                .addCriterion("blastignatiusore",hasItem(ItemList.itemIngotIgnatius))
                .build(consumer,new ResourceLocation("extraores:blastignatiusore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreIndium.asItem()),ItemList.itemIngotIndium,0.75F,20)
                .addCriterion("blastindiumore",hasItem(ItemList.itemIngotIndium))
                .build(consumer,new ResourceLocation("extraores:blastindiumore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreInfuscolium.asItem()),ItemList.itemIngotInfuscolium,0.75F,20)
                .addCriterion("blastinfuscoliumore",hasItem(ItemList.itemIngotInfuscolium))
                .build(consumer,new ResourceLocation("extraores:blastinfuscoliumore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreInolashite.asItem()),ItemList.itemIngotInolashite,0.75F,20)
                .addCriterion("blastinolashiteore",hasItem(ItemList.itemIngotInolashite))
                .build(consumer,new ResourceLocation("extraores:blastinolashiteore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreIridium.asItem()),ItemList.itemIngotIridium,0.75F,20)
                .addCriterion("blastiridiumore",hasItem(ItemList.itemIngotIridium))
                .build(consumer,new ResourceLocation("extraores:blastiridiumore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreKalendrite.asItem()),ItemList.itemIngotKalendrite,0.75F,20)
                .addCriterion("blastkalendriteore",hasItem(ItemList.itemIngotKalendrite))
                .build(consumer,new ResourceLocation("extraores:blastkalendriteore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreLead.asItem()),ItemList.itemIngotLead,0.75F,20)
                .addCriterion("blastleadore",hasItem(ItemList.itemIngotLead))
                .build(consumer,new ResourceLocation("extraores:blastleadore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreLemurite.asItem()),ItemList.itemIngotLemurite,0.75F,20)
                .addCriterion("blastlemuriteore",hasItem(ItemList.itemIngotLemurite))
                .build(consumer,new ResourceLocation("extraores:blastlemuriteore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreManganese.asItem()),ItemList.itemIngotManganese,0.75F,20)
                .addCriterion("blastmanganeseore",hasItem(ItemList.itemIngotManganese))
                .build(consumer,new ResourceLocation("extraores:blastmanganeseore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreMeutoite.asItem()),ItemList.itemIngotMeutoite,0.75F,20)
                .addCriterion("blastmeutoiteore",hasItem(ItemList.itemIngotMeutoite))
                .build(consumer,new ResourceLocation("extraores:blastmeutoiteore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreMidasium.asItem()),ItemList.itemIngotMidasium,0.75F,20)
                .addCriterion("blastmidasiumore",hasItem(ItemList.itemIngotMidasium))
                .build(consumer,new ResourceLocation("extraores:blastmidasiumore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreMithril.asItem()),ItemList.itemIngotMithril,0.75F,20)
                .addCriterion("blastmithrilore",hasItem(ItemList.itemIngotMithril))
                .build(consumer,new ResourceLocation("extraores:blastmithrilore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreMolybdenum.asItem()),ItemList.itemIngotMolybdenum,0.75F,20)
                .addCriterion("blastmolybdenumore",hasItem(ItemList.itemIngotMolybdenum))
                .build(consumer,new ResourceLocation("extraores:blastmolybdenumore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreNeodymium.asItem()),ItemList.itemIngotNeodymium,0.75F,20)
                .addCriterion("blastneodymiumore",hasItem(ItemList.itemIngotNeodymium))
                .build(consumer,new ResourceLocation("extraores:blastneodymiumore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreNeptunium.asItem()),ItemList.itemIngotNeptunium,0.75F,20)
                .addCriterion("blastneptuniumore",hasItem(ItemList.itemIngotNeptunium))
                .build(consumer,new ResourceLocation("extraores:blastneptuniumore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreNickel.asItem()),ItemList.itemIngotNickel,0.75F,20)
                .addCriterion("blastnickelore",hasItem(ItemList.itemIngotNickel))
                .build(consumer,new ResourceLocation("extraores:blastnickelore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreNiobium.asItem()),ItemList.itemIngotNiobium,0.75F,20)
                .addCriterion("blastniobiumore",hasItem(ItemList.itemIngotNiobium))
                .build(consumer,new ResourceLocation("extraores:blastniobiumore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreOrichalcum.asItem()),ItemList.itemIngotOrichalcum,0.75F,20)
                .addCriterion("blastorichalcumore",hasItem(ItemList.itemIngotOrichalcum))
                .build(consumer,new ResourceLocation("extraores:blastorichalcumore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreOureclase.asItem()),ItemList.itemIngotOureclase,0.75F,20)
                .addCriterion("blastoureclaseore",hasItem(ItemList.itemIngotOureclase))
                .build(consumer,new ResourceLocation("extraores:blastoureclaseore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOrePalladium.asItem()),ItemList.itemIngotPalladium,0.75F,20)
                .addCriterion("blastpalladiumore",hasItem(ItemList.itemIngotPalladium))
                .build(consumer,new ResourceLocation("extraores:blastpalladiumore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOrePlatinum.asItem()),ItemList.itemIngotPlatinum,0.75F,20)
                .addCriterion("blastplatinumore",hasItem(ItemList.itemIngotPlatinum))
                .build(consumer,new ResourceLocation("extraores:blastplatinumore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOrePlutonium.asItem()),ItemList.itemIngotPlutonium,0.75F,20)
                .addCriterion("blastplutoniumore",hasItem(ItemList.itemIngotPlutonium))
                .build(consumer,new ResourceLocation("extraores:blastplutoniumore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOrePolonium.asItem()),ItemList.itemIngotPolonium,0.75F,20)
                .addCriterion("blastpoloniumore",hasItem(ItemList.itemIngotPolonium))
                .build(consumer,new ResourceLocation("extraores:blastpoloniumore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOrePromethium.asItem()),ItemList.itemIngotPromethium,0.75F,20)
                .addCriterion("blastpromethiumore",hasItem(ItemList.itemIngotPromethium))
                .build(consumer,new ResourceLocation("extraores:blastpromethiumore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreRhenium.asItem()),ItemList.itemIngotRhenium,0.75F,20)
                .addCriterion("blastrheniumore",hasItem(ItemList.itemIngotRhenium))
                .build(consumer,new ResourceLocation("extraores:blastrheniumore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreRhodium.asItem()),ItemList.itemIngotRhodium,0.75F,20)
                .addCriterion("blastrhodiumore",hasItem(ItemList.itemIngotRhodium))
                .build(consumer,new ResourceLocation("extraores:blastrhodiumore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreRubracium.asItem()),ItemList.itemIngotRubracium,0.75F,20)
                .addCriterion("blastrubraciumore",hasItem(ItemList.itemIngotRubracium))
                .build(consumer,new ResourceLocation("extraores:blastrubraciumore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreRuthenium.asItem()),ItemList.itemIngotRuthenium,0.75F,20)
                .addCriterion("blastrutheniumore",hasItem(ItemList.itemIngotRuthenium))
                .build(consumer,new ResourceLocation("extraores:blastrutheniumore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreSanguinite.asItem()),ItemList.itemIngotSanguinite,0.75F,20)
                .addCriterion("blastsanguiniteore",hasItem(ItemList.itemIngotSanguinite))
                .build(consumer,new ResourceLocation("extraores:blastsanguiniteore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreShadowIron.asItem()),ItemList.itemIngotShadowIron,0.75F,20)
                .addCriterion("blastshadowironore",hasItem(ItemList.itemIngotShadowIron))
                .build(consumer,new ResourceLocation("extraores:blastshadowironore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreSilver.asItem()),ItemList.itemIngotSilver,0.75F,20)
                .addCriterion("blastsilverore",hasItem(ItemList.itemIngotSilver))
                .build(consumer,new ResourceLocation("extraores:blastsilverore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreTantalum.asItem()),ItemList.itemIngotTantalum,0.75F,20)
                .addCriterion("blasttantalumore",hasItem(ItemList.itemIngotTantalum))
                .build(consumer,new ResourceLocation("extraores:blasttantalumore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreTartarite.asItem()),ItemList.itemIngotTartarite,0.75F,20)
                .addCriterion("blasttartariteore",hasItem(ItemList.itemIngotTartarite))
                .build(consumer,new ResourceLocation("extraores:blasttartariteore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreTechnetium.asItem()),ItemList.itemIngotTechnetium,0.75F,20)
                .addCriterion("blasttechnetiumore",hasItem(ItemList.itemIngotTechnetium))
                .build(consumer,new ResourceLocation("extraores:blasttechnetiumore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreThallium.asItem()),ItemList.itemIngotThallium,0.75F,20)
                .addCriterion("blastthalliumore",hasItem(ItemList.itemIngotThallium))
                .build(consumer,new ResourceLocation("extraores:blastthalliumore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreTin.asItem()),ItemList.itemIngotTin,0.75F,20)
                .addCriterion("blasttinore",hasItem(ItemList.itemIngotTin))
                .build(consumer,new ResourceLocation("extraores:blasttinore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreTitanium.asItem()),ItemList.itemIngotTitanium,0.75F,20)
                .addCriterion("blasttitaniumore",hasItem(ItemList.itemIngotTitanium))
                .build(consumer,new ResourceLocation("extraores:blasttitaniumore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreTungsten.asItem()),ItemList.itemIngotTungsten,0.75F,20)
                .addCriterion("blasttungstenore",hasItem(ItemList.itemIngotTungsten))
                .build(consumer,new ResourceLocation("extraores:blasttungstenore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreUnobtainium.asItem()),ItemList.itemIngotUnobtainium,0.75F,20)
                .addCriterion("blastunobtainiumore",hasItem(ItemList.itemIngotUnobtainium))
                .build(consumer,new ResourceLocation("extraores:blastunobtainiumore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreUranium.asItem()),ItemList.itemIngotUranium,0.75f,20)
                .addCriterion("blasturaniumore",hasItem(ItemList.itemIngotUranium))
                .build(consumer,new ResourceLocation("extraores:blasturaniumore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreVanadium.asItem()),ItemList.itemIngotVanadium,0.75F,20)
                .addCriterion("blastvanadiumore",hasItem(ItemList.itemIngotVanadium))
                .build(consumer,new ResourceLocation("extraores:blastvanadiumore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreVulcanite.asItem()),ItemList.itemIngotVulcanite,0.75F,20)
                .addCriterion("blastvulcaniteore",hasItem(ItemList.itemIngotVulcanite))
                .build(consumer,new ResourceLocation("extraores:blastvulcaniteore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreVyroxeres.asItem()),ItemList.itemIngotVyroxeres,0.75F,20)
                .addCriterion("blastvyroxeresore",hasItem(ItemList.itemIngotVyroxeres))
                .build(consumer,new ResourceLocation("extraores:blastvyroxeresore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreYellorite.asItem()),ItemList.itemIngotYellorite,0.75F,20)
                .addCriterion("blastyelloriteore",hasItem(ItemList.itemIngotYellorite))
                .build(consumer,new ResourceLocation("extraores:blastyelloriteore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreZinc.asItem()),ItemList.itemIngotZinc,0.75F,20)
                .addCriterion("blastzincore",hasItem(ItemList.itemIngotZinc))
                .build(consumer,new ResourceLocation("extraores:blastzincore"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockList.blockOreZirconium.asItem()),ItemList.itemIngotZirconium,0.75F,20)
                .addCriterion("blastzirconiumore",hasItem(ItemList.itemIngotZirconium))
                .build(consumer,new ResourceLocation("extraores:blastzirconiumore"));
        //Blasting Dust
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustAdamantine),ItemList.itemIngotAdamantine,0.75F,10)
                .addCriterion("blastadamantinedust",hasItem(ItemList.itemIngotAdamantine))
                .build(consumer,new ResourceLocation("extraores:blastadamantinedust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustAldourite),ItemList.itemIngotAldourite,0.75F,10)
                .addCriterion("blastaldouritedust",hasItem(ItemList.itemIngotAldourite))
                .build(consumer,new ResourceLocation("extraores:blastaldouritedust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustAluminum),ItemList.itemIngotAluminum,0.75F,10)
                .addCriterion("blastaluminumdust",hasItem(ItemList.itemIngotAluminum))
                .build(consumer,new ResourceLocation("extraores:blastaluminumdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustAmericium),ItemList.itemIngotAmericium,0.75F,10)
                .addCriterion("blastamericiumdust",hasItem(ItemList.itemIngotAmericium))
                .build(consumer,new ResourceLocation("extraores:blastamericiumdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustAmordrine),ItemList.itemIngotAmordrine,0.75F,10)
                .addCriterion("blastamordrinedust",hasItem(ItemList.itemIngotAmordrine))
                .build(consumer,new ResourceLocation("extraores:blastamordrinedust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustAngmallen),ItemList.itemIngotAngmallen,0.75F,10)
                .addCriterion("blastangmallendust",hasItem(ItemList.itemIngotAngmallen))
                .build(consumer,new ResourceLocation("extraores:blastangmallendust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustAstralSilver),ItemList.itemIngotAstralSilver,0.75F,10)
                .addCriterion("blastastralsilverdust",hasItem(ItemList.itemIngotAstralSilver))
                .build(consumer,new ResourceLocation("extraores:blastastralsilverdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustAtlarus),ItemList.itemIngotAtlarus,0.75F,10)
                .addCriterion("blastatlarusdust",hasItem(ItemList.itemIngotAtlarus))
                .build(consumer,new ResourceLocation("extraores:blastatlarusdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustBismuth),ItemList.itemIngotBismuth,0.75F,10)
                .addCriterion("blastbismuthdust",hasItem(ItemList.itemIngotBismuth))
                .build(consumer,new ResourceLocation("extraores:blastbismuthdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustBlackSteel),ItemList.itemIngotBlackSteel,0.75F,10)
                .addCriterion("blastblacksteeldust",hasItem(ItemList.itemIngotBlackSteel))
                .build(consumer,new ResourceLocation("extraores:blastblacksteeldust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustCadmium),ItemList.itemIngotCadmium,0.75F,10)
                .addCriterion("blastcadmiumdust",hasItem(ItemList.itemIngotCadmium))
                .build(consumer,new ResourceLocation("extraores:blastcadmiumdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustCarmot),ItemList.itemIngotCarmot,0.75F,10)
                .addCriterion("blastcarmotdust",hasItem(ItemList.itemIngotCarmot))
                .build(consumer,new ResourceLocation("extraores:blastcarmotdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustCelenegil),ItemList.itemIngotCelenegil,0.75F,10)
                .addCriterion("blastcelenegildust",hasItem(ItemList.itemIngotCelenegil))
                .build(consumer,new ResourceLocation("extraores:blastcelenegildust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustCeruclase),ItemList.itemIngotCeruclase,0.75F,10)
                .addCriterion("blastceruclasedust",hasItem(ItemList.itemIngotCeruclase))
                .build(consumer,new ResourceLocation("extraores:blastceruclasedust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustChromium),ItemList.itemIngotChromium,0.75F,10)
                .addCriterion("blastchromiumdust",hasItem(ItemList.itemIngotChromium))
                .build(consumer,new ResourceLocation("extraores:blastchromiumdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustCobalt),ItemList.itemIngotCobalt,0.75F,10)
                .addCriterion("blastcobaltdust",hasItem(ItemList.itemIngotCobalt))
                .build(consumer,new ResourceLocation("extraores:blastcobaltdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustCopper),ItemList.itemIngotCopper,0.75F,10)
                .addCriterion("blastcopperdust",hasItem(ItemList.itemIngotCopper))
                .build(consumer,new ResourceLocation("extraores:blastcopperdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustDeepIron),ItemList.itemIngotDeepIron,0.75F,10)
                .addCriterion("blastdeepirondust",hasItem(ItemList.itemIngotDeepIron))
                .build(consumer,new ResourceLocation("extraores:blastdeepirondust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustDesichalkos),ItemList.itemIngotDesichalkos,0.75F,10)
                .addCriterion("blastdesichalkosdust",hasItem(ItemList.itemIngotDesichalkos))
                .build(consumer,new ResourceLocation("extraores:blastdesichalkosdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustEximite),ItemList.itemIngotEximite,0.75F,10)
                .addCriterion("blasteximitedust",hasItem(ItemList.itemIngotEximite))
                .build(consumer,new ResourceLocation("extraores:blasteximitedust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustGallium),ItemList.itemIngotGallium,0.75F,10)
                .addCriterion("blastgalliumdust",hasItem(ItemList.itemIngotGallium))
                .build(consumer,new ResourceLocation("extraores:blastgalliumdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustHaderoth),ItemList.itemIngotHaderoth,0.75F,10)
                .addCriterion("blasthaderothdust",hasItem(ItemList.itemIngotHaderoth))
                .build(consumer,new ResourceLocation("extraores:blasthaderothdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustHepatizon),ItemList.itemIngotHepatizon,0.75F,10)
                .addCriterion("blasthepatizondust",hasItem(ItemList.itemIngotHepatizon))
                .build(consumer,new ResourceLocation("extraores:blasthepatizondust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustIgnatius),ItemList.itemIngotIgnatius,0.75F,10)
                .addCriterion("blastignatiusdust",hasItem(ItemList.itemIngotIgnatius))
                .build(consumer,new ResourceLocation("extraores:blastignatiusdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustIndium),ItemList.itemIngotIndium,0.75F,10)
                .addCriterion("blastindiumdust",hasItem(ItemList.itemIngotIndium))
                .build(consumer,new ResourceLocation("extraores:blastindiumdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustInfuscolium),ItemList.itemIngotInfuscolium,0.75F,10)
                .addCriterion("blastinfuscoliumdust",hasItem(ItemList.itemIngotInfuscolium))
                .build(consumer,new ResourceLocation("extraores:blastinfuscoliumdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustInolashite),ItemList.itemIngotInolashite,0.75F,10)
                .addCriterion("blastinolashitedust",hasItem(ItemList.itemIngotInolashite))
                .build(consumer,new ResourceLocation("extraores:blastinolashitedust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustIridium),ItemList.itemIngotIridium,0.75F,10)
                .addCriterion("blastiridiumdust",hasItem(ItemList.itemIngotIridium))
                .build(consumer,new ResourceLocation("extraores:blastiridiumdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustKalendrite),ItemList.itemIngotKalendrite,0.75F,10)
                .addCriterion("blastkalendritedust",hasItem(ItemList.itemIngotKalendrite))
                .build(consumer,new ResourceLocation("extraores:blastkalendritedust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustLead),ItemList.itemIngotLead,0.75F,10)
                .addCriterion("blastleaddust",hasItem(ItemList.itemIngotLead))
                .build(consumer,new ResourceLocation("extraores:blastleaddust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustLemurite),ItemList.itemIngotLemurite,0.75F,10)
                .addCriterion("blastlemuritedust",hasItem(ItemList.itemIngotLemurite))
                .build(consumer,new ResourceLocation("extraores:blastlemuritedust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustManganese),ItemList.itemIngotManganese,0.75F,10)
                .addCriterion("blastmanganesedust",hasItem(ItemList.itemIngotManganese))
                .build(consumer,new ResourceLocation("extraores:blastmanganesedust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustMeutoite),ItemList.itemIngotMeutoite,0.75F,10)
                .addCriterion("blastmeutoitedust",hasItem(ItemList.itemIngotMeutoite))
                .build(consumer,new ResourceLocation("extraores:blastmeutoitedust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustMidasium),ItemList.itemIngotMidasium,0.75F,10)
                .addCriterion("blastmidasiumdust",hasItem(ItemList.itemIngotMidasium))
                .build(consumer,new ResourceLocation("extraores:blastmidasiumdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustMithril),ItemList.itemIngotMithril,0.75F,10)
                .addCriterion("blastmithrildust",hasItem(ItemList.itemIngotMithril))
                .build(consumer,new ResourceLocation("extraores:blastmithrildust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustMolybdenum),ItemList.itemIngotMolybdenum,0.75F,10)
                .addCriterion("blastmolybdenumdust",hasItem(ItemList.itemIngotMolybdenum))
                .build(consumer,new ResourceLocation("extraores:blastmolybdenumdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustNeodymium),ItemList.itemIngotNeodymium,0.75F,10)
                .addCriterion("blastneodymiumdust",hasItem(ItemList.itemIngotNeodymium))
                .build(consumer,new ResourceLocation("extraores:blastneodymiumdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustNeptunium),ItemList.itemIngotNeptunium,0.75F,10)
                .addCriterion("blastneptuniumdust",hasItem(ItemList.itemIngotNeptunium))
                .build(consumer,new ResourceLocation("extraores:blastneptuniumdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustNickel),ItemList.itemIngotNickel,0.75F,10)
                .addCriterion("blastnickeldust",hasItem(ItemList.itemIngotNickel))
                .build(consumer,new ResourceLocation("extraores:blastnickeldust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustNiobium),ItemList.itemIngotNiobium,0.75F,10)
                .addCriterion("blastniobiumdust",hasItem(ItemList.itemIngotNiobium))
                .build(consumer,new ResourceLocation("extraores:blastniobiumdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustOrichalcum),ItemList.itemIngotOrichalcum,0.75F,10)
                .addCriterion("blastorichalcumdust",hasItem(ItemList.itemIngotOrichalcum))
                .build(consumer,new ResourceLocation("extraores:blastorichalcumdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustOureclase),ItemList.itemIngotOureclase,0.75F,10)
                .addCriterion("blastoureclasedust",hasItem(ItemList.itemIngotOureclase))
                .build(consumer,new ResourceLocation("extraores:blastoureclasedust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustPalladium),ItemList.itemIngotPalladium,0.75F,10)
                .addCriterion("blastpalladiumdust",hasItem(ItemList.itemIngotPalladium))
                .build(consumer,new ResourceLocation("extraores:blastpalladiumdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustPlatinum),ItemList.itemIngotPlatinum,0.75F,10)
                .addCriterion("blastplatinumdust",hasItem(ItemList.itemIngotPlatinum))
                .build(consumer,new ResourceLocation("extraores:blastplatinumdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustPlutonium),ItemList.itemIngotPlutonium,0.75F,10)
                .addCriterion("blastplutoniumdust",hasItem(ItemList.itemIngotPlutonium))
                .build(consumer,new ResourceLocation("extraores:blastplutoniumdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustPolonium),ItemList.itemIngotPolonium,0.75F,10)
                .addCriterion("blastpoloniumdust",hasItem(ItemList.itemIngotPolonium))
                .build(consumer,new ResourceLocation("extraores:blastpoloniumdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustPromethium),ItemList.itemIngotPromethium,0.75F,10)
                .addCriterion("blastpromethiumdust",hasItem(ItemList.itemIngotPromethium))
                .build(consumer,new ResourceLocation("extraores:blastpromethiumdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustRhenium),ItemList.itemIngotRhenium,0.75F,10)
                .addCriterion("blastrheniumdust",hasItem(ItemList.itemIngotRhenium))
                .build(consumer,new ResourceLocation("extraores:blastrheniumdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustRhodium),ItemList.itemIngotRhodium,0.75F,10)
                .addCriterion("blastrhodiumdust",hasItem(ItemList.itemIngotRhodium))
                .build(consumer,new ResourceLocation("extraores:blastrhodiumdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustRubracium),ItemList.itemIngotRubracium,0.75F,10)
                .addCriterion("blastrubraciumdust",hasItem(ItemList.itemIngotRubracium))
                .build(consumer,new ResourceLocation("extraores:blastrubraciumdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustRuthenium),ItemList.itemIngotRuthenium,0.75F,10)
                .addCriterion("blastrutheniumdust",hasItem(ItemList.itemIngotRuthenium))
                .build(consumer,new ResourceLocation("extraores:blastrutheniumdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustSanguinite),ItemList.itemIngotSanguinite,0.75F,10)
                .addCriterion("blastsanguinitedust",hasItem(ItemList.itemIngotSanguinite))
                .build(consumer,new ResourceLocation("extraores:blastsanguinitedust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustShadowIron),ItemList.itemIngotShadowIron,0.75F,10)
                .addCriterion("blastshadowirondust",hasItem(ItemList.itemIngotShadowIron))
                .build(consumer,new ResourceLocation("extraores:blastshadowirondust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustSilver),ItemList.itemIngotSilver,0.75F,10)
                .addCriterion("blastsilverdust",hasItem(ItemList.itemIngotSilver))
                .build(consumer,new ResourceLocation("extraores:blastsilverdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustTantalum),ItemList.itemIngotTantalum,0.75F,10)
                .addCriterion("blasttantalumdust",hasItem(ItemList.itemIngotTantalum))
                .build(consumer,new ResourceLocation("extraores:blasttantalumdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustTartarite),ItemList.itemIngotTartarite,0.75F,10)
                .addCriterion("blasttartaritedust",hasItem(ItemList.itemIngotTartarite))
                .build(consumer,new ResourceLocation("extraores:blasttartaritedust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustTechnetium),ItemList.itemIngotTechnetium,0.75F,10)
                .addCriterion("blasttechnetiumdust",hasItem(ItemList.itemIngotTechnetium))
                .build(consumer,new ResourceLocation("extraores:blasttechnetiumdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustThallium),ItemList.itemIngotThallium,0.75F,10)
                .addCriterion("blastthalliumdust",hasItem(ItemList.itemIngotThallium))
                .build(consumer,new ResourceLocation("extraores:blastthalliumdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustTin),ItemList.itemIngotTin,0.75F,10)
                .addCriterion("blasttindust",hasItem(ItemList.itemIngotTin))
                .build(consumer,new ResourceLocation("extraores:blasttindust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustTitanium),ItemList.itemIngotTitanium,0.75F,10)
                .addCriterion("blasttitaniumdust",hasItem(ItemList.itemIngotTitanium))
                .build(consumer,new ResourceLocation("extraores:blasttitaniumdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustTungsten),ItemList.itemIngotTungsten,0.75F,10)
                .addCriterion("blasttungstendust",hasItem(ItemList.itemIngotTungsten))
                .build(consumer,new ResourceLocation("extraores:blasttungstendust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustUnobtainium),ItemList.itemIngotUnobtainium,0.75F,10)
                .addCriterion("blastunobtainiumdust",hasItem(ItemList.itemIngotUnobtainium))
                .build(consumer,new ResourceLocation("extraores:blastunobtainiumdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustUranium),ItemList.itemIngotUranium,0.75f,10)
                .addCriterion("blasturaniumdust",hasItem(ItemList.itemIngotUranium))
                .build(consumer,new ResourceLocation("extraores:blasturaniumdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustVanadium),ItemList.itemIngotVanadium,0.75F,10)
                .addCriterion("blastvanadiumdust",hasItem(ItemList.itemIngotVanadium))
                .build(consumer,new ResourceLocation("extraores:blastvanadiumdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustVulcanite),ItemList.itemIngotVulcanite,0.75F,10)
                .addCriterion("blastvulcanitedust",hasItem(ItemList.itemIngotVulcanite))
                .build(consumer,new ResourceLocation("extraores:blastvulcanitedust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustVyroxeres),ItemList.itemIngotVyroxeres,0.75F,10)
                .addCriterion("blastvyroxeresdust",hasItem(ItemList.itemIngotVyroxeres))
                .build(consumer,new ResourceLocation("extraores:blastvyroxeresdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustYellorite),ItemList.itemIngotYellorite,0.75F,10)
                .addCriterion("blastyelloritedust",hasItem(ItemList.itemIngotYellorite))
                .build(consumer,new ResourceLocation("extraores:blastyelloritedust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustZinc),ItemList.itemIngotZinc,0.75F,10)
                .addCriterion("blastzincdust",hasItem(ItemList.itemIngotZinc))
                .build(consumer,new ResourceLocation("extraores:blastzincdust"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemList.itemDustZirconium),ItemList.itemIngotZirconium,0.75F,10)
                .addCriterion("blastzirconiumdust",hasItem(ItemList.itemIngotZirconium))
                .build(consumer,new ResourceLocation("extraores:blastzirconiumdust"));
        //Stonecutting
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreAdamantine.asItem()),ItemList.itemDustAdamantine,2)
                .addCriterion("cutadamantineore",hasItem(ItemList.itemDustAdamantine))
                .build(consumer,new ResourceLocation("extraores:cutadamantineore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreAldourite.asItem()),ItemList.itemDustAldourite,2)
                .addCriterion("cutaldouriteore",hasItem(ItemList.itemDustAldourite))
                .build(consumer,new ResourceLocation("extraores:cutaldouriteore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreAluminum.asItem()),ItemList.itemDustAluminum,2)
                .addCriterion("cutaluminumore",hasItem(ItemList.itemDustAluminum))
                .build(consumer,new ResourceLocation("extraores:cutaluminumore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreAmericium.asItem()),ItemList.itemDustAmericium,2)
                .addCriterion("cutamericiumore",hasItem(ItemList.itemDustAmericium))
                .build(consumer,new ResourceLocation("extraores:cutamericiumore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreAmordrine.asItem()),ItemList.itemDustAmordrine,2)
                .addCriterion("cutamordrineore",hasItem(ItemList.itemDustAmordrine))
                .build(consumer,new ResourceLocation("extraores:cutamordrineore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreAngmallen.asItem()),ItemList.itemDustAngmallen,2)
                .addCriterion("cutangmallenore",hasItem(ItemList.itemDustAngmallen))
                .build(consumer,new ResourceLocation("extraores:cutangmallenore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreAstralSilver.asItem()),ItemList.itemDustAstralSilver,2)
                .addCriterion("cutastralsilverore",hasItem(ItemList.itemDustAstralSilver))
                .build(consumer,new ResourceLocation("extraores:cutastralsilverore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreAtlarus.asItem()),ItemList.itemDustAtlarus,2)
                .addCriterion("cutatlarusore",hasItem(ItemList.itemDustAtlarus))
                .build(consumer,new ResourceLocation("extraores:cutatlarusore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreBismuth.asItem()),ItemList.itemDustBismuth,2)
                .addCriterion("cutbismuthore",hasItem(ItemList.itemDustBismuth))
                .build(consumer,new ResourceLocation("extraores:cutbismuthore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreBlackSteel.asItem()),ItemList.itemDustBlackSteel,2)
                .addCriterion("cutblacksteelore",hasItem(ItemList.itemDustBlackSteel))
                .build(consumer,new ResourceLocation("extraores:cutblacksteelore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreCadmium.asItem()),ItemList.itemDustCadmium,2)
                .addCriterion("cutcadmiumore",hasItem(ItemList.itemDustCadmium))
                .build(consumer,new ResourceLocation("extraores:cutcadmiumore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreCarmot.asItem()),ItemList.itemDustCarmot,2)
                .addCriterion("cutcarmotore",hasItem(ItemList.itemDustCarmot))
                .build(consumer,new ResourceLocation("extraores:cutcarmotore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreCelenegil.asItem()),ItemList.itemDustCelenegil,2)
                .addCriterion("cutcelenegilore",hasItem(ItemList.itemDustCelenegil))
                .build(consumer,new ResourceLocation("extraores:cutcelenegilore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreCeruclase.asItem()),ItemList.itemDustCeruclase,2)
                .addCriterion("cutceruclaseore",hasItem(ItemList.itemDustCeruclase))
                .build(consumer,new ResourceLocation("extraores:cutceruclaseore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreChromium.asItem()),ItemList.itemDustChromium,2)
                .addCriterion("cutchromiumore",hasItem(ItemList.itemDustChromium))
                .build(consumer,new ResourceLocation("extraores:cutchromiumore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreCobalt.asItem()),ItemList.itemDustCobalt,2)
                .addCriterion("cutcobaltore",hasItem(ItemList.itemDustCobalt))
                .build(consumer,new ResourceLocation("extraores:cutcobaltore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreCopper.asItem()),ItemList.itemDustCopper,2)
                .addCriterion("cutcopperore",hasItem(ItemList.itemDustCopper))
                .build(consumer,new ResourceLocation("extraores:cutcopperore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreDeepIron.asItem()),ItemList.itemDustDeepIron,2)
                .addCriterion("cutdeepironore",hasItem(ItemList.itemDustDeepIron))
                .build(consumer,new ResourceLocation("extraores:cutdeepironore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreDesichalkos.asItem()),ItemList.itemDustDesichalkos,2)
                .addCriterion("cutdesichalkosore",hasItem(ItemList.itemDustDesichalkos))
                .build(consumer,new ResourceLocation("extraores:cutdesichalkosore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreEximite.asItem()),ItemList.itemDustEximite,2)
                .addCriterion("cuteximiteore",hasItem(ItemList.itemDustEximite))
                .build(consumer,new ResourceLocation("extraores:cuteximiteore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreGallium.asItem()),ItemList.itemDustGallium,2)
                .addCriterion("cutgalliumore",hasItem(ItemList.itemDustGallium))
                .build(consumer,new ResourceLocation("extraores:cutgalliumore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreHaderoth.asItem()),ItemList.itemDustHaderoth,2)
                .addCriterion("cuthaderothore",hasItem(ItemList.itemDustHaderoth))
                .build(consumer,new ResourceLocation("extraores:cuthaderothore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreHepatizon.asItem()),ItemList.itemDustHepatizon,2)
                .addCriterion("cuthepatizonore",hasItem(ItemList.itemDustHepatizon))
                .build(consumer,new ResourceLocation("extraores:cuthepatizonore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreIgnatius.asItem()),ItemList.itemDustIgnatius,2)
                .addCriterion("cutignatiusore",hasItem(ItemList.itemDustIgnatius))
                .build(consumer,new ResourceLocation("extraores:cutignatiusore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreIndium.asItem()),ItemList.itemDustIndium,2)
                .addCriterion("cutindiumore",hasItem(ItemList.itemDustIndium))
                .build(consumer,new ResourceLocation("extraores:cutindiumore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreInfuscolium.asItem()),ItemList.itemDustInfuscolium,2)
                .addCriterion("cutinfuscoliumore",hasItem(ItemList.itemDustInfuscolium))
                .build(consumer,new ResourceLocation("extraores:cutinfuscoliumore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreInolashite.asItem()),ItemList.itemDustInolashite,2)
                .addCriterion("cutinolashiteore",hasItem(ItemList.itemDustInolashite))
                .build(consumer,new ResourceLocation("extraores:cutinolashiteore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreIridium.asItem()),ItemList.itemDustIridium,2)
                .addCriterion("cutiridiumore",hasItem(ItemList.itemDustIridium))
                .build(consumer,new ResourceLocation("extraores:cutiridiumore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreKalendrite.asItem()),ItemList.itemDustKalendrite,2)
                .addCriterion("cutkalendriteore",hasItem(ItemList.itemDustKalendrite))
                .build(consumer,new ResourceLocation("extraores:cutkalendriteore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreLead.asItem()),ItemList.itemDustLead,2)
                .addCriterion("cutleadore",hasItem(ItemList.itemDustLead))
                .build(consumer,new ResourceLocation("extraores:cutleadore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreLemurite.asItem()),ItemList.itemDustLemurite,2)
                .addCriterion("cutlemuriteore",hasItem(ItemList.itemDustLemurite))
                .build(consumer,new ResourceLocation("extraores:cutlemuriteore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreManganese.asItem()),ItemList.itemDustManganese,2)
                .addCriterion("cutmanganeseore",hasItem(ItemList.itemDustManganese))
                .build(consumer,new ResourceLocation("extraores:cutmanganeseore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreMeutoite.asItem()),ItemList.itemDustMeutoite,2)
                .addCriterion("cutmeutoiteore",hasItem(ItemList.itemDustMeutoite))
                .build(consumer,new ResourceLocation("extraores:cutmeutoiteore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreMidasium.asItem()),ItemList.itemDustMidasium,2)
                .addCriterion("cutmidasiumore",hasItem(ItemList.itemDustMidasium))
                .build(consumer,new ResourceLocation("extraores:cutmidasiumore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreMithril.asItem()),ItemList.itemDustMithril,2)
                .addCriterion("cutmithrilore",hasItem(ItemList.itemDustMithril))
                .build(consumer,new ResourceLocation("extraores:cutmithrilore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreMolybdenum.asItem()),ItemList.itemDustMolybdenum,2)
                .addCriterion("cutmolybdenumore",hasItem(ItemList.itemDustMolybdenum))
                .build(consumer,new ResourceLocation("extraores:cutmolybdenumore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreNeodymium.asItem()),ItemList.itemDustNeodymium,2)
                .addCriterion("cutneodymiumore",hasItem(ItemList.itemDustNeodymium))
                .build(consumer,new ResourceLocation("extraores:cutneodymiumore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreNeptunium.asItem()),ItemList.itemDustNeptunium,2)
                .addCriterion("cutneptuniumore",hasItem(ItemList.itemDustNeptunium))
                .build(consumer,new ResourceLocation("extraores:cutneptuniumore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreNickel.asItem()),ItemList.itemDustNickel,2)
                .addCriterion("cutnickelore",hasItem(ItemList.itemDustNickel))
                .build(consumer,new ResourceLocation("extraores:cutnickelore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreNiobium.asItem()),ItemList.itemDustNiobium,2)
                .addCriterion("cutniobiumore",hasItem(ItemList.itemDustNiobium))
                .build(consumer,new ResourceLocation("extraores:cutniobiumore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreOrichalcum.asItem()),ItemList.itemDustOrichalcum,2)
                .addCriterion("cutorichalcumore",hasItem(ItemList.itemDustOrichalcum))
                .build(consumer,new ResourceLocation("extraores:cutorichalcumore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreOsmium.asItem()),ItemList.itemDustOsmium,2)
                .addCriterion("cutosmiumore",hasItem(ItemList.itemDustOsmium))
                .build(consumer,new ResourceLocation("extraores:cutosmiumore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreOureclase.asItem()),ItemList.itemDustOureclase,2)
                .addCriterion("cutoureclaseore",hasItem(ItemList.itemDustOureclase))
                .build(consumer,new ResourceLocation("extraores:cutoureclaseore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOrePalladium.asItem()),ItemList.itemDustPalladium,2)
                .addCriterion("cutpalladiumore",hasItem(ItemList.itemDustPalladium))
                .build(consumer,new ResourceLocation("extraores:cutpalladiumore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOrePlatinum.asItem()),ItemList.itemDustPlatinum,2)
                .addCriterion("cutplatinumore",hasItem(ItemList.itemDustPlatinum))
                .build(consumer,new ResourceLocation("extraores:cutplatinumore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOrePlutonium.asItem()),ItemList.itemDustPlutonium,2)
                .addCriterion("cutplutoniumore",hasItem(ItemList.itemDustPlutonium))
                .build(consumer,new ResourceLocation("extraores:cutplutoniumore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOrePolonium.asItem()),ItemList.itemDustPolonium,2)
                .addCriterion("cutpoloniumore",hasItem(ItemList.itemDustPolonium))
                .build(consumer,new ResourceLocation("extraores:cutpoloniumore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOrePromethium.asItem()),ItemList.itemDustPromethium,2)
                .addCriterion("cutpromethiumore",hasItem(ItemList.itemDustPromethium))
                .build(consumer,new ResourceLocation("extraores:cutpromethiumore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreRhenium.asItem()),ItemList.itemDustRhenium,2)
                .addCriterion("cutrheniumore",hasItem(ItemList.itemDustRhenium))
                .build(consumer,new ResourceLocation("extraores:cutrheniumore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreRhodium.asItem()),ItemList.itemDustRhodium,2)
                .addCriterion("cutrhodiumore",hasItem(ItemList.itemDustRhodium))
                .build(consumer,new ResourceLocation("extraores:cutrhodiumore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreRubracium.asItem()),ItemList.itemDustRubracium,2)
                .addCriterion("cutrubraciumore",hasItem(ItemList.itemDustRubracium))
                .build(consumer,new ResourceLocation("extraores:cutrubraciumore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreRuthenium.asItem()),ItemList.itemDustRuthenium,2)
                .addCriterion("cutrutheniumore",hasItem(ItemList.itemDustRuthenium))
                .build(consumer,new ResourceLocation("extraores:cutrutheniumore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreSanguinite.asItem()),ItemList.itemDustSanguinite,2)
                .addCriterion("cutsanguiniteore",hasItem(ItemList.itemDustSanguinite))
                .build(consumer,new ResourceLocation("extraores:cutsanguiniteore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreShadowIron.asItem()),ItemList.itemDustShadowIron,2)
                .addCriterion("cutshadowironore",hasItem(ItemList.itemDustShadowIron))
                .build(consumer,new ResourceLocation("extraores:cutshadowironore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreSilver.asItem()),ItemList.itemDustSilver,2)
                .addCriterion("cutsilverore",hasItem(ItemList.itemDustSilver))
                .build(consumer,new ResourceLocation("extraores:cutsilverore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreTantalum.asItem()),ItemList.itemDustTantalum,2)
                .addCriterion("cuttantalumore",hasItem(ItemList.itemDustTantalum))
                .build(consumer,new ResourceLocation("extraores:cuttantalumore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreTartarite.asItem()),ItemList.itemDustTartarite,2)
                .addCriterion("cuttartariteore",hasItem(ItemList.itemDustTartarite))
                .build(consumer,new ResourceLocation("extraores:cuttartariteore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreTechnetium.asItem()),ItemList.itemDustTechnetium,2)
                .addCriterion("cuttechnetiumore",hasItem(ItemList.itemDustTechnetium))
                .build(consumer,new ResourceLocation("extraores:cuttechnetiumore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreThallium.asItem()),ItemList.itemDustThallium,2)
                .addCriterion("cutthalliumore",hasItem(ItemList.itemDustThallium))
                .build(consumer,new ResourceLocation("extraores:cutthalliumore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreTin.asItem()),ItemList.itemDustTin,2)
                .addCriterion("cuttinore",hasItem(ItemList.itemDustTin))
                .build(consumer,new ResourceLocation("extraores:cuttinore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreTitanium.asItem()),ItemList.itemDustTitanium,2)
                .addCriterion("cuttitaniumore",hasItem(ItemList.itemDustTitanium))
                .build(consumer,new ResourceLocation("extraores:cuttitaniumore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreTungsten.asItem()),ItemList.itemDustTungsten,2)
                .addCriterion("cuttungstenore",hasItem(ItemList.itemDustTungsten))
                .build(consumer,new ResourceLocation("extraores:cuttungstenore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreUnobtainium.asItem()),ItemList.itemDustUnobtainium,2)
                .addCriterion("cutunobtainiumore",hasItem(ItemList.itemDustUnobtainium))
                .build(consumer,new ResourceLocation("extraores:cutunobtainiumore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreUranium.asItem()),ItemList.itemDustUranium,2)
                .addCriterion("cuturaniumore",hasItem(ItemList.itemDustUranium))
                .build(consumer,new ResourceLocation("extraores:cuturaniumore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreVanadium.asItem()),ItemList.itemDustVanadium,2)
                .addCriterion("cutvanadiumore",hasItem(ItemList.itemDustVanadium))
                .build(consumer,new ResourceLocation("extraores:cutvanadiumore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreVulcanite.asItem()),ItemList.itemDustVulcanite,2)
                .addCriterion("cutvulcaniteore",hasItem(ItemList.itemDustVulcanite))
                .build(consumer,new ResourceLocation("extraores:cutvulcaniteore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreVyroxeres.asItem()),ItemList.itemDustVyroxeres,2)
                .addCriterion("cutvyroxeresore",hasItem(ItemList.itemDustVyroxeres))
                .build(consumer,new ResourceLocation("extraores:cutvyroxeresore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreYellorite.asItem()),ItemList.itemDustYellorite,2)
                .addCriterion("cutyelloriteore",hasItem(ItemList.itemDustYellorite))
                .build(consumer,new ResourceLocation("extraores:cutyelloriteore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreZinc.asItem()),ItemList.itemDustZinc,2)
                .addCriterion("cutzincore",hasItem(ItemList.itemDustZinc))
                .build(consumer,new ResourceLocation("extraores:cutzincore"));
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(BlockList.blockOreZirconium.asItem()),ItemList.itemDustZirconium,2)
                .addCriterion("cutzirconiumore",hasItem(ItemList.itemDustZirconium))
                .build(consumer,new ResourceLocation("extraores:cutzirconiumore"));
    }
    @Override
    public String getName()
    {
        return "Extra Ores Recipes";
    }
}

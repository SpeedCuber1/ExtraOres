package com.tylerh.extraores.Data;

import com.tylerh.extraores.Init.BlockList;
import com.tylerh.extraores.Util.ModInfo;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.IRequirementsStrategy;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.block.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.function.Consumer;

public class ExOreAdvancement implements Consumer<Consumer<Advancement>>
{

    @Override
    public void accept(Consumer<Advancement> advancementConsumer)
    {
        Advancement root = Advancement.Builder.builder().withDisplay(Blocks.IRON_ORE,new TranslationTextComponent("Extra Ores"),new TranslationTextComponent("Start Mining Resources"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,false,false,false).withCriterion("iron",InventoryChangeTrigger.Instance.forItems(Blocks.IRON_ORE)).register(advancementConsumer,"extraores:root");
        Advancement adamantine = Advancement.Builder.builder().withDisplay(BlockList.blockOreAdamantine,new TranslationTextComponent("It Really DOES Exist"),new TranslationTextComponent("Mine Adamantine Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND), FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("adamantine", InventoryChangeTrigger.Instance.forItems(BlockList.blockOreAdamantine)).withParent(root).register(advancementConsumer,"extraores:adamantine");
        Advancement aldourite = Advancement.Builder.builder().withDisplay(BlockList.blockOreAldourite,new TranslationTextComponent("They're HERE Too!?"),new TranslationTextComponent("Mine Aldourite Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("aldourite",InventoryChangeTrigger.Instance.forItems(BlockList.blockOreAldourite)).withParent(root).register(advancementConsumer,"extraores:aldourite");
        Advancement aluminum = Advancement.Builder.builder().withDisplay(BlockList.blockOreAluminum,new TranslationTextComponent("Soda Anyone?"),new TranslationTextComponent("Mine Aluminum Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("aluminum",InventoryChangeTrigger.Instance.forItems(BlockList.blockOreAluminum)).withParent(root).register(advancementConsumer,"extraores:aluminum");
        Advancement amordrine = Advancement.Builder.builder().withDisplay(BlockList.blockOreAmordrine,new TranslationTextComponent("That's Amordrine"),new TranslationTextComponent("Mine Amordrine Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("amordrine",InventoryChangeTrigger.Instance.forItems(BlockList.blockOreAmordrine)).withParent(adamantine).register(advancementConsumer,"extraores:amordrine");
        Advancement angmallen = Advancement.Builder.builder().withDisplay(BlockList.blockOreAngmallen,new TranslationTextComponent("It's Angelic"),new TranslationTextComponent("Mine Angmallen Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("angmallen",InventoryChangeTrigger.Instance.forItems(BlockList.blockOreAngmallen)).withParent(amordrine).register(advancementConsumer,"extraores:angmallen");
        Advancement astralsilver = Advancement.Builder.builder().withDisplay(BlockList.blockOreAstralSilver,new TranslationTextComponent("By the Power of the Stars"),new TranslationTextComponent("Mine Astral Silver Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("astralsilver",InventoryChangeTrigger.Instance.forItems(BlockList.blockOreAstralSilver)).withParent(angmallen).register(advancementConsumer,"extraores:astralsilver");
        Advancement atlarus = Advancement.Builder.builder().withDisplay(BlockList.blockOreAtlarus,new TranslationTextComponent("Let Me Map the World"),new TranslationTextComponent("Mine Atlarus Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("atlarus",InventoryChangeTrigger.Instance.forItems(BlockList.blockOreAtlarus)).withParent(astralsilver).register(advancementConsumer,"extraores:atlarus");
        Advancement bismuth = Advancement.Builder.builder().withDisplay(BlockList.blockOreBismuth,new TranslationTextComponent("Taking Care of Bismuth"),new TranslationTextComponent("Mine Bismuth Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("bismuth",InventoryChangeTrigger.Instance.forItems(BlockList.blockOreBismuth)).withParent(aluminum).register(advancementConsumer,"extraores:bismuth");
        Advancement blacksteel = Advancement.Builder.builder().withDisplay(BlockList.blockOreBlackSteel,new TranslationTextComponent("It's Like Steel but Black"),new TranslationTextComponent("Mine Black Steel"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("blacksteel",InventoryChangeTrigger.Instance.forItems(BlockList.blockOreBlackSteel)).withParent(atlarus).register(advancementConsumer,"extraores:blacksteel");
        Advancement cadmium = Advancement.Builder.builder().withDisplay(BlockList.blockOreCadmium,new TranslationTextComponent("The Cadmium Can"),new TranslationTextComponent("Mine Cadmium Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("cadmium",InventoryChangeTrigger.Instance.forItems(BlockList.blockOreCadmium)).withParent(bismuth).register(advancementConsumer,"extraores:cadmium");
        Advancement carmot = Advancement.Builder.builder().withDisplay(BlockList.blockOreCarmot,new TranslationTextComponent("It's Carm-OH not Carm-OT"),new TranslationTextComponent("Mine Carmot Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("carmot",InventoryChangeTrigger.Instance.forItems(BlockList.blockOreCarmot)).withParent(blacksteel).register(advancementConsumer,"extraores:carmot");
        Advancement celenegil = Advancement.Builder.builder().withDisplay(BlockList.blockOreCelenegil,new TranslationTextComponent("What EVEN is This!?"),new TranslationTextComponent("Mine Celenegil Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("celenegil",InventoryChangeTrigger.Instance.forItems(BlockList.blockOreCelenegil)).withParent(carmot).register(advancementConsumer,"extraores:celenegil");
        Advancement ceruclase = Advancement.Builder.builder().withDisplay(BlockList.blockOreCeruclase,new TranslationTextComponent("Ceruclase City"),new TranslationTextComponent("Mine Ceruclase Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("ceruclase",InventoryChangeTrigger.Instance.forItems(BlockList.blockOreCeruclase)).withParent(aldourite).register(advancementConsumer,"extraores:ceruclasae");
        Advancement chromium = Advancement.Builder.builder().withDisplay(BlockList.blockOreChromium,new TranslationTextComponent("Ooooh Shiny"),new TranslationTextComponent("Mine Chromium"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("chromium",InventoryChangeTrigger.Instance.forItems(BlockList.blockOreChromium)).withParent(cadmium).register(advancementConsumer,"extraores:chromium");
        Advancement cobalt = Advancement.Builder.builder().withDisplay(BlockList.blockOreCobalt,new TranslationTextComponent("Tough as Nails"),new TranslationTextComponent("Mine Cobalt Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("cobalt",InventoryChangeTrigger.Instance.forItems(BlockList.blockOreCobalt)).withParent(chromium).register(advancementConsumer,"extraores:cobalt");
        Advancement copper = Advancement.Builder.builder().withDisplay(BlockList.blockOreCopper,new TranslationTextComponent("You'll Never Take Me Alive"),new TranslationTextComponent("Mine Copper Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("copper",InventoryChangeTrigger.Instance.forItems(BlockList.blockOreCopper)).withParent(cobalt).register(advancementConsumer,"extraores:copper");
        Advancement deepiron = Advancement.Builder.builder().withDisplay(BlockList.blockOreDeepIron,new TranslationTextComponent("We Need to go EVEN Deeper"),new TranslationTextComponent("Mine Deep Iron Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("deepiron",InventoryChangeTrigger.Instance.forItems(BlockList.blockOreDeepIron)).withParent(celenegil).register(advancementConsumer,"extraores:deepiron");
        Advancement gallium = Advancement.Builder.builder().withDisplay(BlockList.blockOreGallium,new TranslationTextComponent("Not A Kitchen"),new TranslationTextComponent("Mine Gallium Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("gallium",InventoryChangeTrigger.Instance.forItems(BlockList.blockOreGallium)).withParent(copper).register(advancementConsumer,"extraores:gallium");
        Advancement haderoth = Advancement.Builder.builder().withDisplay(BlockList.blockOreHaderoth,new TranslationTextComponent("Who Named This!!!??"),new TranslationTextComponent("Mine Haderoth Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("haderoth",InventoryChangeTrigger.Instance.forItems(BlockList.blockOreHaderoth)).withParent(deepiron).register(advancementConsumer,"extraores:haderoth");
        Advancement hepatizon = Advancement.Builder.builder().withDisplay(BlockList.blockOreHepatizon,new TranslationTextComponent("Sounds Hypnotic Doesn't It"),new TranslationTextComponent("Mine Hepatizon Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("hepatizon",InventoryChangeTrigger.Instance.forItems(BlockList.blockOreHepatizon)).withParent(haderoth).register(advancementConsumer,"extraores:hepatizon");
        Advancement ignatius = Advancement.Builder.builder().withDisplay(BlockList.blockOreIgnatius,new TranslationTextComponent("Now Even More Ignitable"),new TranslationTextComponent("Mine Ignatius Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("ignatius",InventoryChangeTrigger.Instance.forItems(BlockList.blockOreIgnatius)).withParent(ceruclase).register(advancementConsumer,"extraores:ignatius");
        Advancement indium = Advancement.Builder.builder().withDisplay(BlockList.blockOreIndium,new TranslationTextComponent("It Looks Like Indium Ink"),new TranslationTextComponent("Mine Indium Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("indium",InventoryChangeTrigger.Instance.forItems(BlockList.blockOreIndium)).withParent(gallium).register(advancementConsumer,"extraores:indium");
        Advancement infuscolium = Advancement.Builder.builder().withDisplay(BlockList.blockOreInfuscolium,new TranslationTextComponent("Infuse All the Things"),new TranslationTextComponent("Mine Infuscolium Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("infuscolium",InventoryChangeTrigger.Instance.forItems(BlockList.blockOreInfuscolium)).withParent(hepatizon).register(advancementConsumer,"extraores:infuscolium");
        Advancement inolashite = Advancement.Builder.builder().withDisplay(BlockList.blockOreInolashite,new TranslationTextComponent("In All That's...Well You Know"),new TranslationTextComponent("Mine Inolashite Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("inolashite",InventoryChangeTrigger.Instance.forItems(BlockList.blockOreInolashite)).withParent(infuscolium).register(advancementConsumer,"extraores:inolashite");
        Advancement kalendrite = Advancement.Builder.builder().withDisplay(BlockList.blockOreKalendrite,new TranslationTextComponent("A Kaleidoscope of Wonders"),new TranslationTextComponent("Mine Kalendrite Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("kalendrite",InventoryChangeTrigger.Instance.forItems(BlockList.blockOreKalendrite)).withParent(ignatius).register(advancementConsumer,"extraores:kalendrite");
        Advancement lead = Advancement.Builder.builder().withDisplay(BlockList.blockOreLead,new TranslationTextComponent("Everything's Lead-Lined"),new TranslationTextComponent("Mine Lead Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("lead",InventoryChangeTrigger.Instance.forItems(BlockList.blockOreLead)).withParent(indium).register(advancementConsumer,"extraores:lead");
        Advancement lemurite = Advancement.Builder.builder().withDisplay(BlockList.blockOreLemurite,new TranslationTextComponent("Now With Rings"),new TranslationTextComponent("Mine Lemurite Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("lemurite",InventoryChangeTrigger.Instance.forItems(BlockList.blockOreLemurite)).withParent(kalendrite).register(advancementConsumer,"extraores:lemurite");
        Advancement manganese = Advancement.Builder.builder().withDisplay(BlockList.blockOreManganese,new TranslationTextComponent("Coming to a Comic Near You"),new TranslationTextComponent("Mine Manganese Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("manganese",InventoryChangeTrigger.Instance.forItems(BlockList.blockOreManganese)).withParent(lead).register(advancementConsumer,"extraores:manganese");
        Advancement midasium = Advancement.Builder.builder().withDisplay(BlockList.blockOreMidasium,new TranslationTextComponent("Everything Turns to Gold"),new TranslationTextComponent("Mine Midasium Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("midasium",InventoryChangeTrigger.Instance.forItems(BlockList.blockOreMidasium)).withParent(lemurite).register(advancementConsumer,"extraores:midasium");
        Advancement mithril = Advancement.Builder.builder().withDisplay(BlockList.blockOreMithril,new TranslationTextComponent("Are We Playing Minecraft or Runescape?"),new TranslationTextComponent("Mine Mithril Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("mithril",InventoryChangeTrigger.Instance.forItems(BlockList.blockOreMithril)).withParent(inolashite).register(advancementConsumer,"extraores:mithril");
        Advancement molybdenum = Advancement.Builder.builder().withDisplay(BlockList.blockOreMolybdenum,new TranslationTextComponent("Paging Moly B. Denum"),new TranslationTextComponent("Mine Molybdenum Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("molybdenum",InventoryChangeTrigger.Instance.forItems(BlockList.blockOreMolybdenum)).withParent(manganese).register(advancementConsumer,"extraores:molybdenum");
        Advancement neodymium = Advancement.Builder.builder().withDisplay(BlockList.blockOreNeodymium,new TranslationTextComponent("A Magnetic Personality"),new TranslationTextComponent("Mine Neodymium Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("neodymium",InventoryChangeTrigger.Instance.forItems(BlockList.blockOreNeodymium)).withParent(molybdenum).register(advancementConsumer,"extraores:neodymium");
        Advancement nickel = Advancement.Builder.builder().withDisplay(BlockList.blockOreNickel,new TranslationTextComponent("If I Had a Nickel"),new TranslationTextComponent("Mine Nickel Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("nickel",InventoryChangeTrigger.Instance.forItems(BlockList.blockOreNickel)).withParent(neodymium).register(advancementConsumer,"extraores:nickel");
        Advancement niobium = Advancement.Builder.builder().withDisplay(BlockList.blockOreNiobium,new TranslationTextComponent("Not Just in Africa"),new TranslationTextComponent("Mine Niobium Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("niobium", InventoryChangeTrigger.Instance.forItems(BlockList.blockOreNiobium)).withParent(nickel).register(advancementConsumer,"extraores:niobium");
        Advancement orichalcum = Advancement.Builder.builder().withDisplay(BlockList.blockOreOrichalcum,new TranslationTextComponent("Nothing Original Here"),new TranslationTextComponent("Mine Orichalcum Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("orichalcum", InventoryChangeTrigger.Instance.forItems(BlockList.blockOreOrichalcum)).withParent(mithril).register(advancementConsumer,"extraores:orichalcum");
        Advancement oureclase = Advancement.Builder.builder().withDisplay(BlockList.blockOreOureclase,new TranslationTextComponent("Will You Take Our Case"),new TranslationTextComponent("Mine Oureclase Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("oureclase", InventoryChangeTrigger.Instance.forItems(BlockList.blockOreOureclase)).withParent(orichalcum).register(advancementConsumer,"extraores:oureclase");
        Advancement palladium = Advancement.Builder.builder().withDisplay(BlockList.blockOrePalladium,new TranslationTextComponent("Now Showing at the Palladium"),new TranslationTextComponent("Mine Palladium Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("palladium", InventoryChangeTrigger.Instance.forItems(BlockList.blockOrePalladium)).withParent(niobium).register(advancementConsumer,"extraores:palladium");
        Advancement platinum = Advancement.Builder.builder().withDisplay(BlockList.blockOrePlatinum,new TranslationTextComponent("101 Greatest Platinum Hits"),new TranslationTextComponent("Mine Platinum Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("platinum", InventoryChangeTrigger.Instance.forItems(BlockList.blockOrePlatinum)).withParent(palladium).register(advancementConsumer,"extraores:platinum");
        Advancement prometheum = Advancement.Builder.builder().withDisplay(BlockList.blockOrePrometheum,new TranslationTextComponent("Prometheus Would Be Pleased"),new TranslationTextComponent("Mine Prometheum Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("prometheum", InventoryChangeTrigger.Instance.forItems(BlockList.blockOrePrometheum)).withParent(oureclase).register(advancementConsumer,"extraores:prometheum");
        Advancement rhodium = Advancement.Builder.builder().withDisplay(BlockList.blockOreRhodium,new TranslationTextComponent("On the Rhodium"),new TranslationTextComponent("Mine Rhodium Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("rhodium", InventoryChangeTrigger.Instance.forItems(BlockList.blockOreRhodium)).withParent(platinum).register(advancementConsumer,"extraores:rhodium");
        Advancement rubracium = Advancement.Builder.builder().withDisplay(BlockList.blockOreRubracium,new TranslationTextComponent("There's the Rub"),new TranslationTextComponent("Mine Rubracium Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("rubracium", InventoryChangeTrigger.Instance.forItems(BlockList.blockOreRubracium)).withParent(prometheum).register(advancementConsumer,"extraores:rubracium");
        Advancement ruthenium = Advancement.Builder.builder().withDisplay(BlockList.blockOreRuthenium,new TranslationTextComponent("Completely Ruthless"),new TranslationTextComponent("Mine Ruthenium Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("ruthenium", InventoryChangeTrigger.Instance.forItems(BlockList.blockOreRuthenium)).withParent(rhodium).register(advancementConsumer,"extraores:ruthenium");
        Advancement sanguinite = Advancement.Builder.builder().withDisplay(BlockList.blockOreSanguinite,new TranslationTextComponent("Sanguine Love"),new TranslationTextComponent("Mine Sanguinite Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("sanguinite", InventoryChangeTrigger.Instance.forItems(BlockList.blockOreSanguinite)).withParent(midasium).register(advancementConsumer,"extraores:sanguinite");
        Advancement shadowiron = Advancement.Builder.builder().withDisplay(BlockList.blockOreShadowIron,new TranslationTextComponent("You Are the Shadow in the Night"),new TranslationTextComponent("Mine Shadow Iron Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("shadowiron", InventoryChangeTrigger.Instance.forItems(BlockList.blockOreShadowIron)).withParent(sanguinite).register(advancementConsumer,"extraores:shadowiron");
        Advancement silver = Advancement.Builder.builder().withDisplay(BlockList.blockOreSilver,new TranslationTextComponent("Take a Moment and Reflect on Your Life"),new TranslationTextComponent("Mine Silver Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("silver", InventoryChangeTrigger.Instance.forItems(BlockList.blockOreSilver)).withParent(ruthenium).register(advancementConsumer,"extraores:silver");
        Advancement technetium = Advancement.Builder.builder().withDisplay(BlockList.blockOreTechnetium,new TranslationTextComponent("Technologic"),new TranslationTextComponent("Mine Technetium Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("technetium", InventoryChangeTrigger.Instance.forItems(BlockList.blockOreTechnetium)).withParent(silver).register(advancementConsumer,"extraores:technetium");
        Advancement thallium = Advancement.Builder.builder().withDisplay(BlockList.blockOreThallium,new TranslationTextComponent("Bring Me the Prussian Blue STAT"),new TranslationTextComponent("Mine Thallium Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("thallium", InventoryChangeTrigger.Instance.forItems(BlockList.blockOreThallium)).withParent(technetium).register(advancementConsumer,"extraores:thallium");
        Advancement tin = Advancement.Builder.builder().withDisplay(BlockList.blockOreTin,new TranslationTextComponent("Where's the Lion and the Scarecrow"),new TranslationTextComponent("Mine Tin Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("tin", InventoryChangeTrigger.Instance.forItems(BlockList.blockOreTin)).withParent(thallium).register(advancementConsumer,"extraores:tin");
        Advancement titanium = Advancement.Builder.builder().withDisplay(BlockList.blockOreTitanium,new TranslationTextComponent("Stronger Than Steel"),new TranslationTextComponent("Mine Titanium Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("titanium", InventoryChangeTrigger.Instance.forItems(BlockList.blockOreTitanium)).withParent(tin).register(advancementConsumer,"extraores:titanium");
        Advancement tungsten = Advancement.Builder.builder().withDisplay(BlockList.blockOreTungsten,new TranslationTextComponent("Illuminating"),new TranslationTextComponent("Mine Tungsten Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("tungsten", InventoryChangeTrigger.Instance.forItems(BlockList.blockOreTungsten)).withParent(titanium).register(advancementConsumer,"extraores:tungsten");
        Advancement unobtainium = Advancement.Builder.builder().withDisplay(BlockList.blockOreUnobtainium,new TranslationTextComponent("Now Even More Obtainable"),new TranslationTextComponent("Mine Unobtainium Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("unobtainium", InventoryChangeTrigger.Instance.forItems(BlockList.blockOreUnobtainium)).withParent(rubracium).register(advancementConsumer,"extraores:unobtainium");
        Advancement vanadium = Advancement.Builder.builder().withDisplay(BlockList.blockOreVanadium,new TranslationTextComponent("Hand Me That Impact Gun"),new TranslationTextComponent("Mine Vanadium Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("vanadium", InventoryChangeTrigger.Instance.forItems(BlockList.blockOreVanadium)).withParent(tungsten).register(advancementConsumer,"extraores:vanadium");
        Advancement vyroxeres = Advancement.Builder.builder().withDisplay(BlockList.blockOreVyroxeres,new TranslationTextComponent("Sounds Toxic"),new TranslationTextComponent("Mine Vyroxeres Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("vyroxeres", InventoryChangeTrigger.Instance.forItems(BlockList.blockOreVyroxeres)).withParent(shadowiron).register(advancementConsumer,"extraores:vyroxeres");
        Advancement zinc = Advancement.Builder.builder().withDisplay(BlockList.blockOreZinc,new TranslationTextComponent("Great Nutritional Value"),new TranslationTextComponent("Mine Zinc Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("zinc", InventoryChangeTrigger.Instance.forItems(BlockList.blockOreZinc)).withParent(vanadium).register(advancementConsumer,"extraores:zinc");
        Advancement zirconium = Advancement.Builder.builder().withDisplay(BlockList.blockOreZirconium,new TranslationTextComponent("Shining Bright Like a...Oh Wait"),new TranslationTextComponent("Mine Zirconium Ore"),new ResourceLocation(ModInfo.ADVANCEMENT_BACKGROUND),FrameType.TASK,true,true,false).withRequirementsStrategy(IRequirementsStrategy.OR).withCriterion("zirconium", InventoryChangeTrigger.Instance.forItems(BlockList.blockOreZirconium)).withParent(zinc).register(advancementConsumer,"extraores:zirconium");
    }
}

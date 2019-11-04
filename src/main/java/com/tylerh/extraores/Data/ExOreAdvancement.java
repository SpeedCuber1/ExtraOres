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
    }
}
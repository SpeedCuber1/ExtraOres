package com.tylerh.extraores.Data.Tags;

import net.minecraft.item.Item;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

public class ItemTagList
{
    public static final Tags.IOptionalNamedTag<Item> INGOTS = tag("ingots");
    public static final Tags.IOptionalNamedTag<Item> Adamantine = tag("ingots/adamantine");
    public static final Tags.IOptionalNamedTag<Item> Aldourite = tag("ingots/aldourite");
    public static final Tags.IOptionalNamedTag<Item> Aluminum = tag("ingots/aluminum");
    public static final Tags.IOptionalNamedTag<Item> Amordrine = tag("ingots/amordrine");
    public static final Tags.IOptionalNamedTag<Item> Angmallen = tag("ingots/angmallen");
    public static final Tags.IOptionalNamedTag<Item> AstralSilver = tag("ingots/astralsilver");
    public static final Tags.IOptionalNamedTag<Item> Atlarus = tag("ingots/atlarus");
    public static final Tags.IOptionalNamedTag<Item> Bismuth = tag("ingots/bismuth");
    public static final Tags.IOptionalNamedTag<Item> BlackSteel = tag("ingots/blacksteel");
    public static final Tags.IOptionalNamedTag<Item> Cadmium = tag("ingots/cadmium");
    public static final Tags.IOptionalNamedTag<Item> Carmot = tag("ingots/carmot");
    public static final Tags.IOptionalNamedTag<Item> Celenegil = tag("ingots/celenegil");
    public static final Tags.IOptionalNamedTag<Item> Ceruclase = tag("ingots/ceruclase");
    public static final Tags.IOptionalNamedTag<Item> Chromium = tag("ingots/chromium");
    public static final Tags.IOptionalNamedTag<Item> Cobalt = tag("ingots/cobalt");
    public static final Tags.IOptionalNamedTag<Item> Copper = tag("ingots/copper");
    public static final Tags.IOptionalNamedTag<Item> DeepIron = tag("ingots/deepiron");
    public static final Tags.IOptionalNamedTag<Item> Desichalkos = tag("ingots/desichalkos");
    public static final Tags.IOptionalNamedTag<Item> Eximite = tag("ingots/eximite");
    public static final Tags.IOptionalNamedTag<Item> Gallium = tag("ingots/gallium");
    public static final Tags.IOptionalNamedTag<Item> Haderoth = tag("ingots/haderoth");
    public static final Tags.IOptionalNamedTag<Item> Hepatizon = tag("ingots/hepatizon");
    public static final Tags.IOptionalNamedTag<Item> Ignatius = tag("ingots/ignatius");
    public static final Tags.IOptionalNamedTag<Item> Indium = tag("ingots/indium");
    public static final Tags.IOptionalNamedTag<Item> Infuscolium = tag("ingots/infuscolium");
    public static final Tags.IOptionalNamedTag<Item> Inolashite = tag("ingots/inolashite");
    public static final Tags.IOptionalNamedTag<Item> Kalendrite = tag("ingots/kalendrite");
    public static final Tags.IOptionalNamedTag<Item> Lead = tag("ingots/lead");
    public static final Tags.IOptionalNamedTag<Item> Lemurite = tag("ingots/lemurite");
    public static final Tags.IOptionalNamedTag<Item> Manganese = tag("ingots/manganese");
    public static final Tags.IOptionalNamedTag<Item> Meutoite = tag("ingots/meutoite");
    public static final Tags.IOptionalNamedTag<Item> Midasium = tag("ingots/midasium");
    public static final Tags.IOptionalNamedTag<Item> Mithril = tag("ingots/mithril");
    public static final Tags.IOptionalNamedTag<Item> Molybdenum = tag("ingots/molybdenum");
    public static final Tags.IOptionalNamedTag<Item> Neodymium = tag("ingots/neodymium");
    public static final Tags.IOptionalNamedTag<Item> Nickel = tag("ingots/nickel");
    public static final Tags.IOptionalNamedTag<Item> Niobium = tag("ingots/niobium");
    public static final Tags.IOptionalNamedTag<Item> Orichalcum = tag("ingots/orichalcum");
    public static final Tags.IOptionalNamedTag<Item> Oureclase = tag("ingots/oureclase");
    public static final Tags.IOptionalNamedTag<Item> Palladium = tag("ingots/palladium");
    public static final Tags.IOptionalNamedTag<Item> Platinum = tag("ingots/platinum");
    public static final Tags.IOptionalNamedTag<Item> Plutonium = tag("ingots/plutonium");
    public static final Tags.IOptionalNamedTag<Item> Prometheum = tag("ingots/prometheum");
    public static final Tags.IOptionalNamedTag<Item> Rhodium = tag("ingots/rhodium");
    public static final Tags.IOptionalNamedTag<Item> Rubracium = tag("ingots/rubracium");
    public static final Tags.IOptionalNamedTag<Item> Ruthenium = tag("ingots/ruthenium");
    public static final Tags.IOptionalNamedTag<Item> Sanguinite = tag("ingots/sanguinite");
    public static final Tags.IOptionalNamedTag<Item> ShadowIron = tag("ingots/shadowiron");
    public static final Tags.IOptionalNamedTag<Item> Silver = tag("ingots/silver");
    public static final Tags.IOptionalNamedTag<Item> Tartarite = tag("ingots/tartarite");
    public static final Tags.IOptionalNamedTag<Item> Technetium = tag("ingots/technetium");
    public static final Tags.IOptionalNamedTag<Item> Thallium = tag("ingots/thallium");
    public static final Tags.IOptionalNamedTag<Item> Tin = tag("ingots/tin");
    public static final Tags.IOptionalNamedTag<Item> Titanium = tag("ingots/titanium");
    public static final Tags.IOptionalNamedTag<Item> Tungsten = tag("ingots/tungsten");
    public static final Tags.IOptionalNamedTag<Item> Unobtainium = tag("ingots/unobtainium");
    public static final Tags.IOptionalNamedTag<Item> Uranium = tag("ingots/uranium");
    public static final Tags.IOptionalNamedTag<Item> Vanadium = tag("ingots/vanadium");
    public static final Tags.IOptionalNamedTag<Item> Vulcanite = tag("ingots/vulcanite");
    public static final Tags.IOptionalNamedTag<Item> Vyroxeres = tag("ingots/vyroxeres");
    public static final Tags.IOptionalNamedTag<Item> Zinc = tag("ingots/zinc");
    public static final Tags.IOptionalNamedTag<Item> Zirconium = tag("ingots/zirconium");
    
    private static Tags.IOptionalNamedTag<Item> tag(String name)
    {
        return ItemTags.createOptional(new ResourceLocation("forge", name));
    }
}

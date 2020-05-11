package com.tylerh.extraores.Data.Tags;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.Tag;
import net.minecraft.tags.TagCollection;
import net.minecraft.util.ResourceLocation;

import java.util.Collection;
import java.util.Optional;

public class ItemTagList
{
    private static TagCollection<Item> collection = new TagCollection<>(location ->
            Optional.empty(),"",false,"");
    private static int generation;
    public static final Tag<Item> INGOTS = makeWrapperTag("ingots");
    public static void setCollection(TagCollection<Item> collectionIn)
    {
        collection = collectionIn;
        ++generation;
    }
    public static TagCollection<Item> getCollection()
    {
        return collection;
    }
    public static int getGeneration()
    {
        return generation;
    }
    private static Tag<Item> makeWrapperTag(String id)
    {
        return new Wrapper(new ResourceLocation(id));
    }
    public static class Wrapper extends Tag<Item>
    {
        private int lastKnownGeneration = -1;
        private Tag<Item> cachedTag;
        public Wrapper(ResourceLocation location)
        {
            super(location);
        }
        public boolean contains(Item itemIn)
        {
            if (this.lastKnownGeneration != generation)
            {
                this.cachedTag = collection.getOrCreate(this.getId());
                this.lastKnownGeneration = generation;
            }
            return this.cachedTag.contains(itemIn);
        }
        public Collection<Item> getAllElements()
        {
            if (this.lastKnownGeneration != generation)
            {
                this.cachedTag = collection.getOrCreate(this.getId());
                this.lastKnownGeneration = generation;
            }

            return this.cachedTag.getAllElements();
        }
        public Collection<Tag.ITagEntry<Item>> getEntries()
        {
            if (this.lastKnownGeneration != generation)
            {
                this.cachedTag = collection.getOrCreate(this.getId());
                this.lastKnownGeneration = generation;
            }

            return this.cachedTag.getEntries();
        }
    }
}

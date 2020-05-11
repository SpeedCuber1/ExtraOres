package com.tylerh.extraores.Data.Tags;

import net.minecraft.block.Block;
import net.minecraft.tags.Tag;
import net.minecraft.tags.TagCollection;
import net.minecraft.util.ResourceLocation;

import java.util.Collection;
import java.util.Optional;

public class BlockTagList
{
    private static TagCollection<Block> collection = new TagCollection<>(location ->
            Optional.empty(),"",false,"");
    private static int generation;
    public static final Tag<Block> ORES = makeWrapperTag("ores");
    public static final Tag<Block> BLOCKS = makeWrapperTag("storage_blocks");

    public static void setCollection(TagCollection<Block> collectionIn)
    {
        collection = collectionIn;
        ++generation;
    }

    public static TagCollection<Block> getCollection()
    {
        return collection;
    }

    public static int getGeneration()
    {
        return generation;
    }

    private static Tag<Block> makeWrapperTag(String id)
    {
        return new Wrapper(new ResourceLocation(id));
    }

    public static class Wrapper extends Tag<Block>
    {
        private int lastKnownGeneration = -1;
        private Tag<Block> cachedTag;

        public Wrapper(ResourceLocation location)
        {
            super(location);
        }

        public boolean contains(Block itemIn)
        {
            if (this.lastKnownGeneration != generation)
            {
                this.cachedTag = collection.getOrCreate(this.getId());
                this.lastKnownGeneration = generation;
            }
            return this.cachedTag.contains(itemIn);
        }

        public Collection<Block> getAllElements()
        {
            if (this.lastKnownGeneration != generation)
            {
                this.cachedTag = collection.getOrCreate(this.getId());
                this.lastKnownGeneration = generation;
            }

            return this.cachedTag.getAllElements();
        }

        public Collection<Tag.ITagEntry<Block>> getEntries()
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

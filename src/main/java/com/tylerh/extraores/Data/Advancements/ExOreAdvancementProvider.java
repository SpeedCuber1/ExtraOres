package com.tylerh.extraores.Data.Advancements;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.AdvancementProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ExOreAdvancementProvider extends AdvancementProvider
{
    public ExOreAdvancementProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, ExistingFileHelper existingFileHelper)
    {
        super(output,provider,existingFileHelper, List.of(new ExOreAdvancementGenerator()));
    }
}

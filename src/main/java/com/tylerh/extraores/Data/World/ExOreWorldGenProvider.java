package com.tylerh.extraores.Data.World;

import com.tylerh.extraores.Util.ModInfo;
import com.tylerh.extraores.World.ExOreConfiguredFeature;
import com.tylerh.extraores.World.ExOrePlacedFeature;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ExOreWorldGenProvider extends DatapackBuiltinEntriesProvider
{
    public ExOreWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries,BUILDER,Set.of(ModInfo.MOD_ID));
    }
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, ExOreConfiguredFeature::bootstrap)
            .add(Registries.PLACED_FEATURE, ExOrePlacedFeature::bootstrap);
}

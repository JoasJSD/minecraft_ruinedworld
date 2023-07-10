package net.joasjsd.ruinedworld.datagen;

import net.joasjsd.ruinedworld.RuinedWorld;
import net.joasjsd.ruinedworld.worldgen.RWConfiguredFeatures;
import net.joasjsd.ruinedworld.worldgen.RWPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class RWWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, RWConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, RWPlacedFeatures::bootstrap);

    public RWWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(RuinedWorld.MODID));
    }
}
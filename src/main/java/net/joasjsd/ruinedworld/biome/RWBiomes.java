package net.joasjsd.ruinedworld.biome;

import net.joasjsd.ruinedworld.RuinedWorld;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;

public class RWBiomes
{
    public static final ResourceKey<Biome> LOST_WORLD = register("lost_world");

    private static ResourceKey<Biome> register(String name)
    {
        return ResourceKey.create(Registries.BIOME, new ResourceLocation(RuinedWorld.MODID, name));
    }
}

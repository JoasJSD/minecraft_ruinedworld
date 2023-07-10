package net.joasjsd.ruinedworld.biome;

import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Climate;
import terrablender.api.Region;
import terrablender.api.RegionType;
import terrablender.api.VanillaParameterOverlayBuilder;

import java.util.function.Consumer;

import static terrablender.api.ParameterUtils.*;

public class RWLostWorld extends Region {

    public RWLostWorld(ResourceLocation name, RegionType type, int weight) {
        super(name, type, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper)
    {
        VanillaParameterOverlayBuilder builder = new VanillaParameterOverlayBuilder();
        new ParameterPointListBuilder()
                .temperature(Temperature.span(Temperature.HOT, Temperature.WARM))
                .humidity(Humidity.span(Humidity.HUMID, Humidity.WET))
                .continentalness(Continentalness.FULL_RANGE)
                .erosion(Erosion.EROSION_5, Erosion.EROSION_1)
                .depth(Depth.SURFACE, Depth.SURFACE)
                .weirdness(Weirdness.VALLEY)
                .build().forEach(point -> builder.add(point, RWBiomes.LOST_WORLD));

        // Add our points to the mapper
        builder.build().forEach(mapper::accept);
    }
}

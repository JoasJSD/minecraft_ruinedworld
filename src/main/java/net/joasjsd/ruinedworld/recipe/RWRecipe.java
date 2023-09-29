package net.joasjsd.ruinedworld.recipe;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeType;

public interface RWRecipe extends RecipeType {
    RecipeType<RecyclerRecipe> RECYCLING = register("recycling");

    static <T extends Recipe<?>> RecipeType<T> register(final String p_44120_) {
        return Registry.register(BuiltInRegistries.RECIPE_TYPE, new ResourceLocation(p_44120_), new RecipeType<T>() {
            public String toString() {
                return p_44120_;
            }
        });
    }
}
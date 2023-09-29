package net.joasjsd.ruinedworld.recipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;

public class RecyclerRecipe extends RWAbstractCookingRecipe {
    public RecyclerRecipe(ResourceLocation p_249728_, String p_251053_, CookingBookCategory p_249936_, Ingredient p_251550_, ItemStack p_251027_, float p_250843_, int p_249841_) {
        super(RWRecipe.RECYCLING, p_249728_, p_251053_, p_249936_, p_251550_, p_251027_, p_250843_, p_249841_);
    }

    public RecipeSerializer<?> getSerializer() {
        return (RecipeSerializer<?>) RWRecipeSerializer.RECYCLING_RECIPE;
    }
}
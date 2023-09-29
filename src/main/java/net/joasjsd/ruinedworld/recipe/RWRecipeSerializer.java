package net.joasjsd.ruinedworld.recipe;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.item.crafting.*;

public interface RWRecipeSerializer<T extends RWAbstractCookingRecipe> extends RWRecipe {
    RWRecipeSerializer<RecyclerRecipe> RECYCLING_RECIPE = register("recycling", new RWSimpleCookingSerializer<>(RecyclerRecipe::new, 100));

    static <T extends RWAbstractCookingRecipe> RWRecipeSerializer<RecyclerRecipe> register(String recycling, RWSimpleCookingSerializer<T> trwSimpleCookingSerializer) {
        return null;
    }

    void toNetwork(FriendlyByteBuf p_44101_, Recipe p_44102_);
}

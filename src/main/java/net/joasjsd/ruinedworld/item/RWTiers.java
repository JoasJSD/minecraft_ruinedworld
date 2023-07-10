package net.joasjsd.ruinedworld.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class RWTiers {
    public static final ForgeTier ROBIUM = new ForgeTier(6, 2500, 15f,
            2f, 30, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(RWItems.ROBIUM_INGOT.get()));
}

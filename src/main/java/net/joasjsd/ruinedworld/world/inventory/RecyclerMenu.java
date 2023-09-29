package net.joasjsd.ruinedworld.world.inventory;

import net.joasjsd.ruinedworld.recipe.RWRecipe;
import net.joasjsd.ruinedworld.recipe.RWRecipeBook;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractFurnaceMenu;
import net.minecraft.world.inventory.ContainerData;

public class RecyclerMenu extends AbstractFurnaceMenu {
    public RecyclerMenu(int p_39079_, Inventory p_39080_) {
        super(RWMenuType.RECYCLER, RWRecipe.RECYCLING, RWRecipeBook.RECYCLING, p_39079_, p_39080_);
    }

    public RecyclerMenu(int p_39082_, Inventory p_39083_, Container p_39084_, ContainerData p_39085_) {
        super(RWMenuType.RECYCLER, RWRecipe.RECYCLING, RWRecipeBook.RECYCLING, p_39082_, p_39083_, p_39084_, p_39085_);
    }
}
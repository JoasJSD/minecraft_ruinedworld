package net.joasjsd.ruinedworld.block.entity;

import net.joasjsd.ruinedworld.recipe.RWRecipe;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.BlastFurnaceMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;


public class RecyclerEntity extends AbstractFurnaceBlockEntity {
    public RecyclerEntity(BlockPos p_155225_, BlockState p_155226_) {
        super(RWBlockEntities.RECYCLER, p_155225_, p_155226_, RWRecipe.RECYCLING);
    }

    protected Component getDefaultName() {
        return Component.translatable("container.ruinedworld.recycler");
    }

    protected int getBurnDuration(ItemStack p_58852_) {
        return super.getBurnDuration(p_58852_) / 2;
    }

    protected AbstractContainerMenu createMenu(int p_58849_, Inventory p_58850_) {
        return new BlastFurnaceMenu(p_58849_, p_58850_, this, this.dataAccess);
    }
}
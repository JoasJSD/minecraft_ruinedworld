package net.joasjsd.ruinedworld.client.gui.screen;

import net.joasjsd.ruinedworld.world.inventory.RecyclerMenu;
import net.minecraft.client.gui.screens.inventory.AbstractFurnaceScreen;
import net.minecraft.client.gui.screens.recipebook.BlastingRecipeBookComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.BlastFurnaceMenu;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class RecyclerScreen extends AbstractFurnaceScreen<RecyclerMenu> {
    private static final ResourceLocation TEXTURE = new ResourceLocation("textures/gui/recycler_gui.png");

    public RecyclerScreen(RecyclerMenu p_98045_, Inventory p_98046_, Component p_98047_) {
        super(p_98045_, new BlastingRecipeBookComponent(), p_98046_, p_98047_, TEXTURE);
    }
}

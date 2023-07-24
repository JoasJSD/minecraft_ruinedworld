package net.joasjsd.ruinedworld.gui;

import com.github.alexthe666.citadel.client.gui.GuiBasicBook;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.joasjsd.ruinedworld.item.RWItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class GUIDictionary extends GuiBasicBook {

    private static final ResourceLocation ROOT = new ResourceLocation("ruinedworld:book/dictionary/root.json");

    public GUIDictionary(ItemStack bookStack) {
        super(bookStack, Component.translatable("item.ruinedworld.dictionary.title"));
    }

    public GUIDictionary(ItemStack bookStack, String page) {
        super(bookStack, Component.translatable("item.ruinedworld.dictionary.title"));
        this.currentPageJSON = new ResourceLocation(this.getTextFileDirectory() + page + ".json");
    }

    public void render(PoseStack matrixStack, int x, int y, float partialTicks) {
        if (this.currentPageJSON.equals(getRootPage()) && currentPageCounter == 0) {
            int k = (this.width - this.xSize) / 2;
            int l = (this.height - this.ySize + 128) / 2;
            RenderSystem.applyModelViewMatrix();
            PoseStack stack = RenderSystem.getModelViewStack();
            stack.pushPose();
            stack.translate((double) k, (double) l, 0.0D);
            stack.scale(2.75F, 2.75F, 2.75F);
            this.itemRenderer.renderGuiItem(matrixStack, new ItemStack(RWItems.DICTIONARY.get()), 25, 14);
            stack.popPose();
            RenderSystem.applyModelViewMatrix();
        }
    }

    protected int getBindingColor() {
        return 0X606B26;
    }

    public ResourceLocation getRootPage() {
        return ROOT;
    }

    public String getTextFileDirectory() {
        return "ruinedworld:book/dictionary/";
    }
}
package net.joasjsd.ruinedworld.client.gui;

import com.github.alexthe666.citadel.client.gui.GuiBasicBook;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class GUIGuideBook extends GuiBasicBook {

    private static final ResourceLocation ROOT = new ResourceLocation("ruinedworld:book/guide_book/root.json");

    public GUIGuideBook(ItemStack bookStack) {
        super(bookStack, Component.translatable("book.ruinedworld.guide_book.root.title"));
    }

    public GUIGuideBook(ItemStack bookStack, String page) {
        super(bookStack, Component.translatable("book.ruinedworld.guide_book.root.title"));
        this.currentPageJSON = new ResourceLocation(this.getTextFileDirectory() + page + ".json");
    }

    protected int getBindingColor() {
        return 0X606B26;
    }

    public ResourceLocation getRootPage() {
        return ROOT;
    }

    public String getTextFileDirectory() {
        return "ruinedworld:book/guide_book/";
    }
}
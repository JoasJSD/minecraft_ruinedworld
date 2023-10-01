package net.joasjsd.ruinedworld;

import net.joasjsd.ruinedworld.client.gui.GUIGuideBook;
import net.joasjsd.ruinedworld.client.gui.GUIUpdateBook;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.common.Mod;

@OnlyIn(Dist.CLIENT)
@Mod.EventBusSubscriber(modid = RuinedWorld.MODID, value = Dist.CLIENT)
public class ClientProxy extends CommonProxy {
    public void openGuideBookGUI(ItemStack itemStackIn) {
        Minecraft.getInstance().setScreen(new GUIGuideBook(itemStackIn));
    }
    public void openUpdateBookGUI(ItemStack itemStackIn) {
        Minecraft.getInstance().setScreen(new GUIUpdateBook(itemStackIn));
    }
}

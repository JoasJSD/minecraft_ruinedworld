package net.joasjsd.ruinedworld;

import net.joasjsd.ruinedworld.client.gui.GUIDictionary;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.common.Mod;

import java.awt.*;

@OnlyIn(Dist.CLIENT)
@Mod.EventBusSubscriber(modid = RuinedWorld.MODID, value = Dist.CLIENT)
public class ClientProxy extends CommonProxy {
    public void openBookGUI(ItemStack itemStackIn) {
        Minecraft.getInstance().setScreen(new GUIDictionary(itemStackIn));
    }
}

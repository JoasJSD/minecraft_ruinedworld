package net.joasjsd.ruinedworld;

import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;

import static net.joasjsd.ruinedworld.RuinedWorld.MODID;

@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonProxy {

    public void openBookGUI(ItemStack itemStackIn) {
    }
}

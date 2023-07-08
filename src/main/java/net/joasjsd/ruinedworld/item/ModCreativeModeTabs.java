package net.joasjsd.ruinedworld.item;

import net.joasjsd.ruinedworld.RuinedWorld;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RuinedWorld.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab RUINEDWOLRD_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        RUINEDWOLRD_TAB = event.registerCreativeModeTab(new ResourceLocation(RuinedWorld.MODID, "ruinedworld_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.ROBIUM_INGOT.get())).title(Component.translatable("tab.ruinedworld_tab")));
    }
}

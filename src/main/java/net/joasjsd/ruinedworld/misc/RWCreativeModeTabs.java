package net.joasjsd.ruinedworld.misc;

import net.joasjsd.ruinedworld.RuinedWorld;
import net.joasjsd.ruinedworld.block.RWBlocks;
import net.joasjsd.ruinedworld.entity.RWEntities;
import net.joasjsd.ruinedworld.item.RWItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import software.bernie.geckolib.GeckoLib;

@Mod.EventBusSubscriber(modid = RuinedWorld.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RWCreativeModeTabs {
    public static CreativeModeTab RUINEDWORLD_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        RUINEDWORLD_TAB = event.registerCreativeModeTab(new ResourceLocation(RuinedWorld.MODID, "ruinedworld_tab"),
                builder -> builder.icon(() -> new ItemStack(RWItems.ROBIUM_INGOT.get())).title(Component.translatable("tab.ruinedworld_tab")));
    }
}

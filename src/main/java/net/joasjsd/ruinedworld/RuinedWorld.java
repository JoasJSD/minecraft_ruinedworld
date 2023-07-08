package net.joasjsd.ruinedworld;

import com.mojang.logging.LogUtils;
import net.joasjsd.ruinedworld.block.ModBlocks;
import net.joasjsd.ruinedworld.item.ModCreativeModeTabs;
import net.joasjsd.ruinedworld.item.ModItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
@Mod(RuinedWorld.MODID)
public class RuinedWorld
{
    public static final String MODID = "ruinedworld";
    private static final Logger LOGGER = LogUtils.getLogger();

    public RuinedWorld()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);


        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if(event.getTab() == ModCreativeModeTabs.RUINEDWOLRD_TAB) {
            event.accept(ModBlocks.ROBIUM_ORE);
            event.accept(ModItems.ROBIUM_INGOT);
            event.accept(ModBlocks.DEEPSLATE_ROBIUM_ORE);
        }
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}

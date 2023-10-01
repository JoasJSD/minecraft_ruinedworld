package net.joasjsd.ruinedworld;

import net.joasjsd.ruinedworld.biome.RWSurfaceRules;
import net.joasjsd.ruinedworld.block.RWBlocks;
import net.joasjsd.ruinedworld.entity.RWEntities;
import net.joasjsd.ruinedworld.entity.client.ShadowmelderRenderer;
import net.joasjsd.ruinedworld.misc.RWCreativeModeTab;
import net.joasjsd.ruinedworld.item.RWItems;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.geckolib.GeckoLib;
import terrablender.api.SurfaceRuleManager;

@Mod(RuinedWorld.MODID)

public class RuinedWorld
{
    public static final String MODID = "ruinedworld";
    public static final Logger LOGGER = LogManager.getLogger("ruinedworld");
    public static final CommonProxy PROXY = DistExecutor.runForDist(() -> ClientProxy::new, () -> CommonProxy::new);

    public RuinedWorld() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        RWItems.register(modEventBus);
        RWBlocks.register(modEventBus);
        RWEntities.register(modEventBus);

        GeckoLib.initialize();

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::addCreative);
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if(event.getTab() == RWCreativeModeTab.RUINEDWORLD_TAB) {
            // Items
            event.accept(RWItems.ROBIUM_INGOT);
            event.accept(RWItems.SCRAP);
            event.accept(RWItems.METAL_PIPE);
            event.accept(RWItems.ROAD_SIGN);
            event.accept(RWItems.SCRAP_METAL);
            event.accept(RWItems.BUNCH_OF_SCRAP);
            // Blocks
            event.accept(RWBlocks.GAS_BARREL);
            event.accept(RWBlocks.ROBIUM_ORE);
            event.accept(RWBlocks.DEEPSLATE_ROBIUM_ORE);
            event.accept(RWBlocks.OIL_BARREL);
            event.accept(RWBlocks.OVERGROWN_GRASS_BLOCK);
            event.accept(RWBlocks.PORTAL_BLOCK);
            event.accept(RWItems.OBSIDIAN_STICK);
            event.accept(RWItems.ROBIUM_PICKAXE);
            event.accept(RWItems.ROBIUM_AXE);
            event.accept(RWItems.ROBIUM_HOE);
            event.accept(RWItems.ROBIUM_SHOVEL);
            event.accept(RWItems.ROBIUM_SWORD);
            event.accept(RWBlocks.ROXIUS_BLOCK);
            event.accept(RWBlocks.ROBIUM_BLOCK);
            event.accept(RWItems.SHADOWMELDER_SPAWN_EGG);
            event.accept(RWItems.ROBIUM_HELMET);
            event.accept(RWItems.ROBIUM_CHESTPLATE);
            event.accept(RWItems.ROBIUM_LEGGINGS);
            event.accept(RWItems.ROBIUM_BOOTS);
            event.accept(RWItems.ROBIUM_APPLE);
            event.accept(RWBlocks.ROBIUM_INFECTED_STONE);
            event.accept(RWBlocks.LARGE_ROBIUM_CRYSTAL_PEAK);
            event.accept(RWBlocks.MEDIUM_ROBIUM_CRYSTAL_PEAK);
            event.accept(RWBlocks.SMALL_ROBIUM_CRYSTAL_PEAK);
            event.accept(RWBlocks.ROBIUM_CRYSTAL_CLUSTER);
            event.accept(RWBlocks.ROBIUM_INFECTED_CRACKED_STONE_BRICKS);
            event.accept(RWBlocks.ROBIUM_INFECTED_STONE_BRICKS);
            event.accept(RWItems.SHADOWMELDER_EYE);
            event.accept(RWItems.INFECTED_ROBIUM_HELMET);
            event.accept(RWItems.INFECTED_ROBIUM_CHESTPLATE);
            event.accept(RWItems.INFECTED_ROBIUM_LEGGINGS);
            event.accept(RWItems.INFECTED_ROBIUM_BOOTS);
        }
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(RWEntities.SHADOWMELDER.get(), ShadowmelderRenderer::new);
            event.enqueueWork(() ->
            {
                // Weights are kept intentionally low as we add minimal biomes

                // Register our surface rules
                SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MODID, RWSurfaceRules.makeRules());
            });
        }
    }
}

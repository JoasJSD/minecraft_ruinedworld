package net.joasjsd.ruinedworld.block;

import net.joasjsd.ruinedworld.RuinedWorld;
import net.joasjsd.ruinedworld.item.RWItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.AMETHYST_CLUSTER;

public class RWBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, RuinedWorld.MODID);

    // Portal Shit
    public static final RegistryObject<Block> PORTAL_BLOCK = registerBlock("portal_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(-1, 3600000).sound(SoundType.METAL)));
    public static final RegistryObject<Block> ROXIUS_BLOCK = registerBlock("roxius_block",
            () -> new BlockRoxius(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(50f).requiresCorrectToolForDrops()));

    // Machines
    public static final RegistryObject<Block> RECYCLER = registerBlock("recycler",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(3.5F)));

    // Blocks
    public static final RegistryObject<Block> ROBIUM_BLOCK = registerBlock("robium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(20f).requiresCorrectToolForDrops()));

    // Robium Infected Blocks
    public static final RegistryObject<Block> ROBIUM_INFECTED_STONE = registerBlock("robium_infected_stone",
            () -> new BlockRobiumInfected(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(40f)));
    public static final RegistryObject<Block> ROBIUM_INFECTED_STONE_BRICKS = registerBlock("robium_infected_stone_bricks",
            () -> new BlockRobiumInfected(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(40f)));
    public static final RegistryObject<Block> ROBIUM_INFECTED_CRACKED_STONE_BRICKS = registerBlock("robium_infected_cracked_stone_bricks",
            () -> new BlockRobiumInfected(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(40f)));

    // Robium Crystals
        public static final RegistryObject<Block> SMALL_ROBIUM_CRYSTAL_PEAK = registerBlock("small_robium_crystal_peak",
            () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(AMETHYST_CLUSTER).sound(SoundType.SMALL_AMETHYST_BUD)
                    .lightLevel((p_187409_) -> {
                        return 1;
                    })));
    public static final RegistryObject<Block> MEDIUM_ROBIUM_CRYSTAL_PEAK = registerBlock("medium_robium_crystal_peak",
            () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(AMETHYST_CLUSTER).sound(SoundType.SMALL_AMETHYST_BUD)
                    .lightLevel((p_187409_) -> {
                        return 2;
                    })));
    public static final RegistryObject<Block> LARGE_ROBIUM_CRYSTAL_PEAK = registerBlock("large_robium_crystal_peak",
            () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(AMETHYST_CLUSTER).sound(SoundType.SMALL_AMETHYST_BUD)
                    .lightLevel((p_187409_) -> {
                        return 4;
                    })));
    public static final RegistryObject<Block> ROBIUM_CRYSTAL_CLUSTER = registerBlock("robium_crystal_cluster",
            () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(AMETHYST_CLUSTER).sound(SoundType.SMALL_AMETHYST_BUD)
                    .lightLevel((p_187409_) -> {
                        return 5;
                    })));

    // Nature
    public static final RegistryObject<Block> OVERGROWN_GRASS_BLOCK = registerBlock("overgrown_grass_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.GRASS)
                    .strength(2f).sound(SoundType.GRASS)));

    // Ores
    public static final RegistryObject<Block> ROBIUM_ORE = registerBlock("robium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_ROBIUM_ORE = registerBlock("deepslate_robium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()));
    // Decoration
    public static final RegistryObject<Block> OIL_BARREL = registerBlock("oil_barrel",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GAS_BARREL = registerBlock("gas_barrel",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f).sound(SoundType.METAL).requiresCorrectToolForDrops()));




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends  Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return RWItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}

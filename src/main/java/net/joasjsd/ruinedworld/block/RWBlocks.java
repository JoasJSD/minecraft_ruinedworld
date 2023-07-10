package net.joasjsd.ruinedworld.block;

import net.joasjsd.ruinedworld.RuinedWorld;
import net.joasjsd.ruinedworld.item.RWItems;
import net.joasjsd.ruinedworld.block.custom.RoxiusBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class RWBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, RuinedWorld.MODID);

    // Portal Shit
    public static final RegistryObject<Block> PORTAL_BLOCK = registerBlock("portal_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(-1, 3600000).sound(SoundType.STONE)));
        public static final RegistryObject<Block> ROXIUS_BLOCK = registerBlock("roxius_block",
            () -> new RoxiusBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(50f).requiresCorrectToolForDrops()));

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

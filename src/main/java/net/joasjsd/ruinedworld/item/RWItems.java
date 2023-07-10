package net.joasjsd.ruinedworld.item;

import net.joasjsd.ruinedworld.RuinedWorld;
import net.joasjsd.ruinedworld.entity.RWEntities;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RWItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RuinedWorld.MODID);

    public static final RegistryObject<Item> ROBIUM_INGOT = ITEMS.register("robium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_STICK = ITEMS.register("obsidian_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROBIUM_PICKAXE = ITEMS.register("robium_pickaxe",
            () -> new PickaxeItem(RWTiers.ROBIUM, 5, 1.5f,
                    new Item.Properties()));

    public static final RegistryObject<Item> ROBIUM_MINER_SPAWN_EGG = ITEMS.register("robium_miner_spawn_egg",
            () -> new ForgeSpawnEggItem(RWEntities.ROBIUM_MINER,  0x4d2e00, 0xff9900, new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

package net.joasjsd.ruinedworld.item;

import net.joasjsd.ruinedworld.RuinedWorld;
import net.joasjsd.ruinedworld.entity.RWEntities;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Objects;

public class RWItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RuinedWorld.MODID);

    public static final RegistryObject<Item> ROBIUM_INGOT = ITEMS.register("robium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_STICK = ITEMS.register("obsidian_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHADOWMELDER_HIDE = ITEMS.register("shadowmelder_hide",
            () -> new Item(new Item.Properties()));

    // Robium Tools
    public static final RegistryObject<Item> ROBIUM_PICKAXE = ITEMS.register("robium_pickaxe",
            () -> new PickaxeItem(RWTiers.ROBIUM, 5, 1.5f,
                    new Item.Properties()));
    public static final RegistryObject<Item> ROBIUM_AXE = ITEMS.register("robium_axe",
            () -> new AxeItem(RWTiers.ROBIUM, 5, 1.5f,
                    new Item.Properties()));
    public static final RegistryObject<Item> ROBIUM_SHOVEL = ITEMS.register("robium_shovel",
            () -> new ShovelItem(RWTiers.ROBIUM, 5, 1.5f,
                    new Item.Properties()));
    public static final RegistryObject<Item> ROBIUM_SWORD = ITEMS.register("robium_sword",
            () -> new SwordItem(RWTiers.ROBIUM, 10, 1.5f,
                    new Item.Properties()));
    public static final RegistryObject<Item> ROBIUM_HOE = ITEMS.register("robium_hoe",
            () -> new HoeItem(RWTiers.ROBIUM, 5, 1.5f,
                    new Item.Properties()));

    // Spawn Eggs
    public static final RegistryObject<Item> SHADOWMELDER_SPAWN_EGG = ITEMS.register("shadowmelder_spawn_egg",
            () -> new ForgeSpawnEggItem(RWEntities.SHADOWMELDER,  330000, 0xff9900, new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

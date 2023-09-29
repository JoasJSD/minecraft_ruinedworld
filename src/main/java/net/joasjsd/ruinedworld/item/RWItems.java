package net.joasjsd.ruinedworld.item;

import net.joasjsd.ruinedworld.RuinedWorld;
import net.joasjsd.ruinedworld.entity.RWEntities;
import net.minecraft.world.item.*;
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
    public static final RegistryObject<Item> SCRAP = ITEMS.register("scrap",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METAL_PIPE = ITEMS.register("metal_pipe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROAD_SIGN = ITEMS.register("road_sign",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SCRAP_METAL = ITEMS.register("scrap_metal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHADOWMELDER_EYE = ITEMS.register("shadowmelder_eye",
            () -> new ItemShadowmelderEye(new Item.Properties()));

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

    // Robium Armor
    public static final RegistryObject<Item> ROBIUM_HELMET = ITEMS.register("robium_helmet",
            () -> new RWArmorItem(RWArmorMaterials.ROBIUM, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final RegistryObject<Item> ROBIUM_CHESTPLATE = ITEMS.register("robium_chestplate",
            () -> new ArmorItem(RWArmorMaterials.ROBIUM, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final RegistryObject<Item> ROBIUM_LEGGINGS = ITEMS.register("robium_leggings",
            () -> new ArmorItem(RWArmorMaterials.ROBIUM, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final RegistryObject<Item> ROBIUM_BOOTS = ITEMS.register("robium_boots",
            () -> new ArmorItem(RWArmorMaterials.ROBIUM, ArmorItem.Type.BOOTS,
                    new Item.Properties()));


    public static final RegistryObject<Item> INFECTED_ROBIUM_HELMET = ITEMS.register("infected_robium_helmet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INFECTED_ROBIUM_CHESTPLATE = ITEMS.register("infected_robium_chestplate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INFECTED_ROBIUM_LEGGINGS = ITEMS.register("infected_robium_leggings",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INFECTED_ROBIUM_BOOTS = ITEMS.register("infected_robium_boots",
            () -> new Item(new Item.Properties()));
    // Food
    public static final RegistryObject<Item> ROBIUM_APPLE = ITEMS.register("robium_apple",
            () -> new Item(new Item.Properties().food(RWEdibleItems.ROBIUM_APPLE)));

    // Dictionary
    public static final RegistryObject<Item> DICTIONARY = ITEMS.register("dictionary",
            () -> new ItemBook(new Item.Properties().stacksTo(1)));

    // Spawn Eggs
    public static final RegistryObject<Item> SHADOWMELDER_SPAWN_EGG = ITEMS.register("shadowmelder_spawn_egg",
            () -> new ForgeSpawnEggItem(RWEntities.SHADOWMELDER,  330000, 0xff9900, new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

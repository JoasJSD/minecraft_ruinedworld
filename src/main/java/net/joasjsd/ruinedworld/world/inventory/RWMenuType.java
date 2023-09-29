package net.joasjsd.ruinedworld.world.inventory;

import net.joasjsd.ruinedworld.RuinedWorld;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.flag.FeatureFlag;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.BlastFurnaceMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RWMenuType extends MenuType {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.MENU_TYPES, RuinedWorld.MODID);

    public static final MenuType<RecyclerMenu> RECYCLER = register("recycler", RecyclerMenu::new);

    public RWMenuType(MenuSupplier p_267054_, FeatureFlagSet p_266909_) {
        super(p_267054_, p_266909_);
    }

    private static <T extends AbstractContainerMenu> RegistryObject<MenuType<T>> registerMenuType(IContainerFactory<T> factory,
                                                                                                  String name) {
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

    private static <T extends AbstractContainerMenu> MenuType<T> register(String p_267295_, MenuType.MenuSupplier<T> p_266945_, FeatureFlag... p_267055_) {
        return Registry.register(BuiltInRegistries.MENU, p_267295_, new MenuType<>(p_266945_, FeatureFlags.REGISTRY.subset(p_267055_)));
    }

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}
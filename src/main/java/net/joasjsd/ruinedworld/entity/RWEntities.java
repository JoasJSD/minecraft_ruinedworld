package net.joasjsd.ruinedworld.entity;

import net.joasjsd.ruinedworld.RuinedWorld;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RWEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, RuinedWorld.MODID);

    public static final RegistryObject<EntityType<EntityShadowmelder>> SHADOWMELDER =
            ENTITY_TYPES.register("shadowmelder",
                    () -> EntityType.Builder.of(EntityShadowmelder::new, MobCategory.MONSTER)
                            .sized(1f, 1.25f)
                            .build(new ResourceLocation(RuinedWorld.MODID, "shadowmelder").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}

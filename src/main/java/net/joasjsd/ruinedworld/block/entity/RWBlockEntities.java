package net.joasjsd.ruinedworld.block.entity;

import net.joasjsd.ruinedworld.RuinedWorld;
import net.joasjsd.ruinedworld.block.RWBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RWBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, RuinedWorld.MODID);

    public static final RegistryObject<BlockEntityType<RecyclerEntity>> RECYCLER =
            BLOCK_ENTITIES.register("recycler", () ->
                    BlockEntityType.Builder.of(RecyclerEntity::new,
                            RWBlocks.RECYCLER.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
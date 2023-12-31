package net.joasjsd.ruinedworld.util.event;

import net.joasjsd.ruinedworld.RuinedWorld;
import net.joasjsd.ruinedworld.entity.RWEntities;
import net.joasjsd.ruinedworld.entity.EntityShadowmelder;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RuinedWorld.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RWEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(RWEntities.SHADOWMELDER.get(), EntityShadowmelder.setAttributes());
    }
}

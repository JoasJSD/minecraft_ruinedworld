package net.joasjsd.ruinedworld.entity.client;

import net.joasjsd.ruinedworld.RuinedWorld;
import net.joasjsd.ruinedworld.entity.EntityShadowmelder;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class ShadowmelderRenderer extends GeoEntityRenderer<EntityShadowmelder> {
    public ShadowmelderRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new ShadowmelderModel());
    }

    @Override
    public ResourceLocation getTextureLocation(EntityShadowmelder animatable) {
        return new ResourceLocation(RuinedWorld.MODID, "textures/entity/shadowmelder.png");
    }
}
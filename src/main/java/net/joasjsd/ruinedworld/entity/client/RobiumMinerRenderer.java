package net.joasjsd.ruinedworld.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.joasjsd.ruinedworld.RuinedWorld;
import net.joasjsd.ruinedworld.entity.custom.RobiumMinerEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class RobiumMinerRenderer extends GeoEntityRenderer<RobiumMinerEntity> {
    public RobiumMinerRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new RobiumMinerModel());
    }

    @Override
    public ResourceLocation getTextureLocation(RobiumMinerEntity animatable) {
        return new ResourceLocation(RuinedWorld.MODID, "textures/entity/robium_miner_texture.png");
    }
}

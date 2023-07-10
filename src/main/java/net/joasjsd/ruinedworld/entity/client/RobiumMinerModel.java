package net.joasjsd.ruinedworld.entity.client;

import net.joasjsd.ruinedworld.RuinedWorld;
import net.joasjsd.ruinedworld.entity.custom.RobiumMinerEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class RobiumMinerModel extends GeoModel<RobiumMinerEntity> {
    @Override
    public ResourceLocation getModelResource(RobiumMinerEntity animatable) {
        return new ResourceLocation(RuinedWorld.MODID, "geo/robium_miner.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(RobiumMinerEntity animatable) {
        return new ResourceLocation(RuinedWorld.MODID, "textures/entity/robium_miner_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(RobiumMinerEntity animatable) {
        return new ResourceLocation(RuinedWorld.MODID, "animations/robium_miner.animation.json");
    }

    @Override
    public void setCustomAnimations(RobiumMinerEntity animatable, long instanceId, AnimationState<RobiumMinerEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}

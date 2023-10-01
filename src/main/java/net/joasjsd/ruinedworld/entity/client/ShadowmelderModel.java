package net.joasjsd.ruinedworld.entity.client;

import net.joasjsd.ruinedworld.RuinedWorld;
import net.joasjsd.ruinedworld.entity.EntityShadowmelder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class ShadowmelderModel extends GeoModel<EntityShadowmelder> {
    @Override
    public ResourceLocation getModelResource(EntityShadowmelder animatable) {
        return new ResourceLocation(RuinedWorld.MODID, "geo/shadowmelder.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EntityShadowmelder animatable) {
        return new ResourceLocation(RuinedWorld.MODID, "textures/entity/shadowmelder.png");
    }

    @Override
    public ResourceLocation getAnimationResource(EntityShadowmelder animatable) {
        return new ResourceLocation(RuinedWorld.MODID, "animations/shadowmelder.animation.json");
    }

    @Override
    public void setCustomAnimations(EntityShadowmelder animatable, long instanceId, AnimationState<EntityShadowmelder> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}
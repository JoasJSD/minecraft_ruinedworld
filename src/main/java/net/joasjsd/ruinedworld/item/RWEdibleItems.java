package net.joasjsd.ruinedworld.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class RWEdibleItems {
    public static final FoodProperties ROBIUM_APPLE =
            (new FoodProperties.Builder()).nutrition(4).saturationMod(1.2F)
                    .effect(new MobEffectInstance(MobEffects.REGENERATION, 400, 1), 1.0F)
                    .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 400, 1), 1.0F)
                    .effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 400, 1), 1.0F)
                    .effect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 2), 1.0F).alwaysEat().build();
}

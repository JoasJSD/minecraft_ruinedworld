package net.joasjsd.ruinedworld.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Block;

public class BlockRobiumInfected extends Block {
    public BlockRobiumInfected(Properties properties) {
        super(properties);
    }
    public void stepOn(Level p_153777_, BlockPos p_153778_, BlockState p_153779_, Entity p_153780_) {
        if (!p_153780_.isSteppingCarefully() && p_153780_ instanceof LivingEntity) {
            p_153780_.hurt(p_153777_.damageSources().hotFloor(), 1.0F);
        }

        super.stepOn(p_153777_, p_153778_, p_153779_, p_153780_);
    }
}

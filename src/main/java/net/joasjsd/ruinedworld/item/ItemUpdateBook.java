package net.joasjsd.ruinedworld.item;

import net.joasjsd.ruinedworld.RuinedWorld;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ItemUpdateBook extends Item {
    public ItemUpdateBook(Properties properties) {
        super(properties);
    }

    public InteractionResultHolder<ItemStack> use(Level worldIn, Player playerIn, InteractionHand handIn) {
        ItemStack itemStackIn = playerIn.getItemInHand(handIn);
        if (worldIn.isClientSide) {
            RuinedWorld.PROXY.openUpdateBookGUI(itemStackIn);
        }
        return new InteractionResultHolder(InteractionResult.PASS, itemStackIn);
    }
}

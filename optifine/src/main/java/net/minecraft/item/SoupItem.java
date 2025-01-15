package net.minecraft.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class SoupItem extends Item
{
    public SoupItem(Item.Properties p_i1390_1_)
    {
        super(p_i1390_1_);
    }

    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving)
    {
        ItemStack itemstack = super.onItemUseFinish(stack, worldIn, entityLiving);
        return entityLiving instanceof PlayerEntity && ((PlayerEntity)entityLiving).abilities.isCreativeMode ? itemstack : new ItemStack(Items.BOWL);
    }
}

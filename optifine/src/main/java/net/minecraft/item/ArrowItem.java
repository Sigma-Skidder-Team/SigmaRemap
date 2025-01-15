package net.minecraft.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.world.World;

public class ArrowItem extends Item
{
    public ArrowItem(Item.Properties p_i3817_1_)
    {
        super(p_i3817_1_);
    }

    public AbstractArrowEntity createArrow(World worldIn, ItemStack stack, LivingEntity shooter)
    {
        ArrowEntity arrowentity = new ArrowEntity(worldIn, shooter);
        arrowentity.setPotionEffect(stack);
        return arrowentity;
    }
}

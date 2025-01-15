package net.minecraft.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.projectile.SpectralArrowEntity;
import net.minecraft.world.World;

public class SpectralArrowItem extends ArrowItem
{
    public SpectralArrowItem(Item.Properties p_i3198_1_)
    {
        super(p_i3198_1_);
    }

    public AbstractArrowEntity createArrow(World worldIn, ItemStack stack, LivingEntity shooter)
    {
        return new SpectralArrowEntity(worldIn, shooter);
    }
}

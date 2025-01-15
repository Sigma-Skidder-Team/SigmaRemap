package net.minecraft.entity.item;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ProjectileItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.potion.PotionUtils;
import net.minecraft.potion.Potions;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class ExperienceBottleEntity extends ProjectileItemEntity
{
    public ExperienceBottleEntity(EntityType <? extends ExperienceBottleEntity > p_i2977_1_, World p_i2977_2_)
    {
        super(p_i2977_1_, p_i2977_2_);
    }

    public ExperienceBottleEntity(World p_i2978_1_, LivingEntity p_i2978_2_)
    {
        super(EntityType.EXPERIENCE_BOTTLE, p_i2978_2_, p_i2978_1_);
    }

    public ExperienceBottleEntity(World p_i2979_1_, double p_i2979_2_, double p_i2979_4_, double p_i2979_6_)
    {
        super(EntityType.EXPERIENCE_BOTTLE, p_i2979_2_, p_i2979_4_, p_i2979_6_, p_i2979_1_);
    }

    protected Item getDefaultItem()
    {
        return Items.EXPERIENCE_BOTTLE;
    }

    protected float getGravityVelocity()
    {
        return 0.07F;
    }

    protected void onImpact(RayTraceResult result)
    {
        if (!this.world.isRemote)
        {
            this.world.playEvent(2002, new BlockPos(this), PotionUtils.getPotionColor(Potions.WATER));
            int i = 3 + this.world.rand.nextInt(5) + this.world.rand.nextInt(5);

            while (i > 0)
            {
                int j = ExperienceOrbEntity.getXPSplit(i);
                i -= j;
                this.world.addEntity(new ExperienceOrbEntity(this.world, this.getPosX(), this.getPosY(), this.getPosZ(), j));
            }

            this.remove();
        }
    }
}

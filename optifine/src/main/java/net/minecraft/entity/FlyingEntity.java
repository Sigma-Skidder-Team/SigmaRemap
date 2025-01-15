package net.minecraft.entity;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public abstract class FlyingEntity extends MobEntity
{
    protected FlyingEntity(EntityType <? extends FlyingEntity > p_i845_1_, World p_i845_2_)
    {
        super(p_i845_1_, p_i845_2_);
    }

    public boolean onLivingFall(float distance, float damageMultiplier)
    {
        return false;
    }

    protected void updateFallState(double y, boolean onGroundIn, BlockState state, BlockPos pos)
    {
    }

    public void travel(Vec3d p_213352_1_)
    {
        if (this.isInWater())
        {
            this.moveRelative(0.02F, p_213352_1_);
            this.move(MoverType.SELF, this.getMotion());
            this.setMotion(this.getMotion().scale((double)0.8F));
        }
        else if (this.isInLava())
        {
            this.moveRelative(0.02F, p_213352_1_);
            this.move(MoverType.SELF, this.getMotion());
            this.setMotion(this.getMotion().scale(0.5D));
        }
        else
        {
            float f = 0.91F;

            if (this.onGround)
            {
                f = this.world.getBlockState(new BlockPos(this.getPosX(), this.getPosY() - 1.0D, this.getPosZ())).getBlock().getSlipperiness() * 0.91F;
            }

            float f1 = 0.16277137F / (f * f * f);
            f = 0.91F;

            if (this.onGround)
            {
                f = this.world.getBlockState(new BlockPos(this.getPosX(), this.getPosY() - 1.0D, this.getPosZ())).getBlock().getSlipperiness() * 0.91F;
            }

            this.moveRelative(this.onGround ? 0.1F * f1 : 0.02F, p_213352_1_);
            this.move(MoverType.SELF, this.getMotion());
            this.setMotion(this.getMotion().scale((double)f));
        }

        this.prevLimbSwingAmount = this.limbSwingAmount;
        double d1 = this.getPosX() - this.prevPosX;
        double d0 = this.getPosZ() - this.prevPosZ;
        float f2 = MathHelper.sqrt(d1 * d1 + d0 * d0) * 4.0F;

        if (f2 > 1.0F)
        {
            f2 = 1.0F;
        }

        this.limbSwingAmount += (f2 - this.limbSwingAmount) * 0.4F;
        this.limbSwing += this.limbSwingAmount;
    }

    public boolean isOnLadder()
    {
        return false;
    }
}

package net.minecraft.client.particle;

import net.minecraft.particles.BasicParticleType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SquidInkParticle extends SimpleAnimatedParticle
{
    private SquidInkParticle(World p_i2685_1_, double p_i2685_2_, double p_i2685_4_, double p_i2685_6_, double p_i2685_8_, double p_i2685_10_, double p_i2685_12_, IAnimatedSprite p_i2685_14_)
    {
        super(p_i2685_1_, p_i2685_2_, p_i2685_4_, p_i2685_6_, p_i2685_14_, 0.0F);
        this.particleScale = 0.5F;
        this.setAlphaF(1.0F);
        this.setColor(0.0F, 0.0F, 0.0F);
        this.maxAge = (int)((double)(this.particleScale * 12.0F) / (Math.random() * (double)0.8F + (double)0.2F));
        this.selectSpriteWithAge(p_i2685_14_);
        this.canCollide = false;
        this.motionX = p_i2685_8_;
        this.motionY = p_i2685_10_;
        this.motionZ = p_i2685_12_;
        this.setBaseAirFriction(0.0F);
    }

    public void tick()
    {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;

        if (this.age++ >= this.maxAge)
        {
            this.setExpired();
        }
        else
        {
            this.selectSpriteWithAge(this.field_217584_C);

            if (this.age > this.maxAge / 2)
            {
                this.setAlphaF(1.0F - ((float)this.age - (float)(this.maxAge / 2)) / (float)this.maxAge);
            }

            this.move(this.motionX, this.motionY, this.motionZ);

            if (this.world.getBlockState(new BlockPos(this.posX, this.posY, this.posZ)).isAir())
            {
                this.motionY -= (double)0.008F;
            }

            this.motionX *= (double)0.92F;
            this.motionY *= (double)0.92F;
            this.motionZ *= (double)0.92F;

            if (this.onGround)
            {
                this.motionX *= (double)0.7F;
                this.motionZ *= (double)0.7F;
            }
        }
    }

    public static class Factory implements IParticleFactory<BasicParticleType>
    {
        private final IAnimatedSprite spriteSet;

        public Factory(IAnimatedSprite p_i3418_1_)
        {
            this.spriteSet = p_i3418_1_;
        }

        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            return new SquidInkParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
        }
    }
}

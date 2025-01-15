package net.minecraft.client.particle;

import net.minecraft.particles.BasicParticleType;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class SmokeParticle extends SpriteTexturedParticle
{
    private final IAnimatedSprite field_217585_C;

    protected SmokeParticle(World p_i2011_1_, double p_i2011_2_, double p_i2011_4_, double p_i2011_6_, double p_i2011_8_, double p_i2011_10_, double p_i2011_12_, float p_i2011_14_, IAnimatedSprite p_i2011_15_)
    {
        super(p_i2011_1_, p_i2011_2_, p_i2011_4_, p_i2011_6_, 0.0D, 0.0D, 0.0D);
        this.field_217585_C = p_i2011_15_;
        this.motionX *= (double)0.1F;
        this.motionY *= (double)0.1F;
        this.motionZ *= (double)0.1F;
        this.motionX += p_i2011_8_;
        this.motionY += p_i2011_10_;
        this.motionZ += p_i2011_12_;
        float f = (float)(Math.random() * (double)0.3F);
        this.particleRed = f;
        this.particleGreen = f;
        this.particleBlue = f;
        this.particleScale *= 0.75F * p_i2011_14_;
        this.maxAge = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
        this.maxAge = (int)((float)this.maxAge * p_i2011_14_);
        this.maxAge = Math.max(this.maxAge, 1);
        this.selectSpriteWithAge(p_i2011_15_);
    }

    public IParticleRenderType getRenderType()
    {
        return IParticleRenderType.PARTICLE_SHEET_OPAQUE;
    }

    public float getScale(float p_217561_1_)
    {
        return this.particleScale * MathHelper.clamp(((float)this.age + p_217561_1_) / (float)this.maxAge * 32.0F, 0.0F, 1.0F);
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
            this.selectSpriteWithAge(this.field_217585_C);
            this.motionY += 0.004D;
            this.move(this.motionX, this.motionY, this.motionZ);

            if (this.posY == this.prevPosY)
            {
                this.motionX *= 1.1D;
                this.motionZ *= 1.1D;
            }

            this.motionX *= (double)0.96F;
            this.motionY *= (double)0.96F;
            this.motionZ *= (double)0.96F;

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

        public Factory(IAnimatedSprite p_i1280_1_)
        {
            this.spriteSet = p_i1280_1_;
        }

        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            return new SmokeParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, 1.0F, this.spriteSet);
        }
    }
}

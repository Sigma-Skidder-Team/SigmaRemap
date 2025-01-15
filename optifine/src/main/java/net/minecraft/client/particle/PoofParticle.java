package net.minecraft.client.particle;

import net.minecraft.particles.BasicParticleType;
import net.minecraft.world.World;

public class PoofParticle extends SpriteTexturedParticle
{
    private final IAnimatedSprite field_217581_C;

    protected PoofParticle(World p_i2868_1_, double p_i2868_2_, double p_i2868_4_, double p_i2868_6_, double p_i2868_8_, double p_i2868_10_, double p_i2868_12_, IAnimatedSprite p_i2868_14_)
    {
        super(p_i2868_1_, p_i2868_2_, p_i2868_4_, p_i2868_6_);
        this.field_217581_C = p_i2868_14_;
        this.motionX = p_i2868_8_ + (Math.random() * 2.0D - 1.0D) * (double)0.05F;
        this.motionY = p_i2868_10_ + (Math.random() * 2.0D - 1.0D) * (double)0.05F;
        this.motionZ = p_i2868_12_ + (Math.random() * 2.0D - 1.0D) * (double)0.05F;
        float f = this.rand.nextFloat() * 0.3F + 0.7F;
        this.particleRed = f;
        this.particleGreen = f;
        this.particleBlue = f;
        this.particleScale = 0.1F * (this.rand.nextFloat() * this.rand.nextFloat() * 6.0F + 1.0F);
        this.maxAge = (int)(16.0D / ((double)this.rand.nextFloat() * 0.8D + 0.2D)) + 2;
        this.selectSpriteWithAge(p_i2868_14_);
    }

    public IParticleRenderType getRenderType()
    {
        return IParticleRenderType.PARTICLE_SHEET_OPAQUE;
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
            this.selectSpriteWithAge(this.field_217581_C);
            this.motionY += 0.004D;
            this.move(this.motionX, this.motionY, this.motionZ);
            this.motionX *= (double)0.9F;
            this.motionY *= (double)0.9F;
            this.motionZ *= (double)0.9F;

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

        public Factory(IAnimatedSprite p_i1081_1_)
        {
            this.spriteSet = p_i1081_1_;
        }

        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            return new PoofParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
        }
    }
}

package net.minecraft.client.particle;

import net.minecraft.particles.BasicParticleType;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class CritParticle extends SpriteTexturedParticle
{
    private CritParticle(World p_i2692_1_, double p_i2692_2_, double p_i2692_4_, double p_i2692_6_, double p_i2692_8_, double p_i2692_10_, double p_i2692_12_)
    {
        super(p_i2692_1_, p_i2692_2_, p_i2692_4_, p_i2692_6_, 0.0D, 0.0D, 0.0D);
        this.motionX *= (double)0.1F;
        this.motionY *= (double)0.1F;
        this.motionZ *= (double)0.1F;
        this.motionX += p_i2692_8_ * 0.4D;
        this.motionY += p_i2692_10_ * 0.4D;
        this.motionZ += p_i2692_12_ * 0.4D;
        float f = (float)(Math.random() * (double)0.3F + (double)0.6F);
        this.particleRed = f;
        this.particleGreen = f;
        this.particleBlue = f;
        this.particleScale *= 0.75F;
        this.maxAge = Math.max((int)(6.0D / (Math.random() * 0.8D + 0.6D)), 1);
        this.canCollide = false;
        this.tick();
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
            this.move(this.motionX, this.motionY, this.motionZ);
            this.particleGreen = (float)((double)this.particleGreen * 0.96D);
            this.particleBlue = (float)((double)this.particleBlue * 0.9D);
            this.motionX *= (double)0.7F;
            this.motionY *= (double)0.7F;
            this.motionZ *= (double)0.7F;
            this.motionY -= (double)0.02F;

            if (this.onGround)
            {
                this.motionX *= (double)0.7F;
                this.motionZ *= (double)0.7F;
            }
        }
    }

    public IParticleRenderType getRenderType()
    {
        return IParticleRenderType.PARTICLE_SHEET_OPAQUE;
    }

    public static class DamageIndicatorFactory implements IParticleFactory<BasicParticleType>
    {
        private final IAnimatedSprite spriteSet;

        public DamageIndicatorFactory(IAnimatedSprite p_i1615_1_)
        {
            this.spriteSet = p_i1615_1_;
        }

        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            CritParticle critparticle = new CritParticle(worldIn, x, y, z, xSpeed, ySpeed + 1.0D, zSpeed);
            critparticle.setMaxAge(20);
            critparticle.selectSpriteRandomly(this.spriteSet);
            return critparticle;
        }
    }

    public static class Factory implements IParticleFactory<BasicParticleType>
    {
        private final IAnimatedSprite spriteSet;

        public Factory(IAnimatedSprite p_i3295_1_)
        {
            this.spriteSet = p_i3295_1_;
        }

        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            CritParticle critparticle = new CritParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed);
            critparticle.selectSpriteRandomly(this.spriteSet);
            return critparticle;
        }
    }

    public static class MagicFactory implements IParticleFactory<BasicParticleType>
    {
        private final IAnimatedSprite spriteSet;

        public MagicFactory(IAnimatedSprite p_i4052_1_)
        {
            this.spriteSet = p_i4052_1_;
        }

        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            CritParticle critparticle = new CritParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed);
            critparticle.particleRed *= 0.3F;
            critparticle.particleGreen *= 0.8F;
            critparticle.selectSpriteRandomly(this.spriteSet);
            return critparticle;
        }
    }
}

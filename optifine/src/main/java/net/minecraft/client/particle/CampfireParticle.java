package net.minecraft.client.particle;

import net.minecraft.particles.BasicParticleType;
import net.minecraft.world.World;

public class CampfireParticle extends SpriteTexturedParticle
{
    private CampfireParticle(World p_i1810_1_, double p_i1810_2_, double p_i1810_4_, double p_i1810_6_, double p_i1810_8_, double p_i1810_10_, double p_i1810_12_, boolean p_i1810_14_)
    {
        super(p_i1810_1_, p_i1810_2_, p_i1810_4_, p_i1810_6_);
        this.multipleParticleScaleBy(3.0F);
        this.setSize(0.25F, 0.25F);

        if (p_i1810_14_)
        {
            this.maxAge = this.rand.nextInt(50) + 280;
        }
        else
        {
            this.maxAge = this.rand.nextInt(50) + 80;
        }

        this.particleGravity = 3.0E-6F;
        this.motionX = p_i1810_8_;
        this.motionY = p_i1810_10_ + (double)(this.rand.nextFloat() / 500.0F);
        this.motionZ = p_i1810_12_;
    }

    public void tick()
    {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;

        if (this.age++ < this.maxAge && !(this.particleAlpha <= 0.0F))
        {
            this.motionX += (double)(this.rand.nextFloat() / 5000.0F * (float)(this.rand.nextBoolean() ? 1 : -1));
            this.motionZ += (double)(this.rand.nextFloat() / 5000.0F * (float)(this.rand.nextBoolean() ? 1 : -1));
            this.motionY -= (double)this.particleGravity;
            this.move(this.motionX, this.motionY, this.motionZ);

            if (this.age >= this.maxAge - 60 && this.particleAlpha > 0.01F)
            {
                this.particleAlpha -= 0.015F;
            }
        }
        else
        {
            this.setExpired();
        }
    }

    public IParticleRenderType getRenderType()
    {
        return IParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
    }

    public static class CozySmokeFactory implements IParticleFactory<BasicParticleType>
    {
        private final IAnimatedSprite spriteSet;

        public CozySmokeFactory(IAnimatedSprite p_i2072_1_)
        {
            this.spriteSet = p_i2072_1_;
        }

        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            CampfireParticle campfireparticle = new CampfireParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, false);
            campfireparticle.setAlphaF(0.9F);
            campfireparticle.selectSpriteRandomly(this.spriteSet);
            return campfireparticle;
        }
    }

    public static class SignalSmokeFactory implements IParticleFactory<BasicParticleType>
    {
        private final IAnimatedSprite spriteSet;

        public SignalSmokeFactory(IAnimatedSprite p_i4093_1_)
        {
            this.spriteSet = p_i4093_1_;
        }

        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            CampfireParticle campfireparticle = new CampfireParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, true);
            campfireparticle.setAlphaF(0.95F);
            campfireparticle.selectSpriteRandomly(this.spriteSet);
            return campfireparticle;
        }
    }
}

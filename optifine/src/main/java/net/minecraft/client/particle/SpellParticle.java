package net.minecraft.client.particle;

import java.util.Random;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.world.World;

public class SpellParticle extends SpriteTexturedParticle
{
    private static final Random RANDOM = new Random();
    private final IAnimatedSprite field_217586_F;

    private SpellParticle(World p_i820_1_, double p_i820_2_, double p_i820_4_, double p_i820_6_, double p_i820_8_, double p_i820_10_, double p_i820_12_, IAnimatedSprite p_i820_14_)
    {
        super(p_i820_1_, p_i820_2_, p_i820_4_, p_i820_6_, 0.5D - RANDOM.nextDouble(), p_i820_10_, 0.5D - RANDOM.nextDouble());
        this.field_217586_F = p_i820_14_;
        this.motionY *= (double)0.2F;

        if (p_i820_8_ == 0.0D && p_i820_12_ == 0.0D)
        {
            this.motionX *= (double)0.1F;
            this.motionZ *= (double)0.1F;
        }

        this.particleScale *= 0.75F;
        this.maxAge = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
        this.canCollide = false;
        this.selectSpriteWithAge(p_i820_14_);
    }

    public IParticleRenderType getRenderType()
    {
        return IParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
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
            this.selectSpriteWithAge(this.field_217586_F);
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

    public static class AmbientMobFactory implements IParticleFactory<BasicParticleType>
    {
        private final IAnimatedSprite spriteSet;

        public AmbientMobFactory(IAnimatedSprite p_i860_1_)
        {
            this.spriteSet = p_i860_1_;
        }

        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            Particle particle = new SpellParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
            particle.setAlphaF(0.15F);
            particle.setColor((float)xSpeed, (float)ySpeed, (float)zSpeed);
            return particle;
        }
    }

    public static class Factory implements IParticleFactory<BasicParticleType>
    {
        private final IAnimatedSprite spriteSet;

        public Factory(IAnimatedSprite p_i940_1_)
        {
            this.spriteSet = p_i940_1_;
        }

        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            return new SpellParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
        }
    }

    public static class InstantFactory implements IParticleFactory<BasicParticleType>
    {
        private final IAnimatedSprite spriteSet;

        public InstantFactory(IAnimatedSprite p_i2296_1_)
        {
            this.spriteSet = p_i2296_1_;
        }

        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            return new SpellParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
        }
    }

    public static class MobFactory implements IParticleFactory<BasicParticleType>
    {
        private final IAnimatedSprite spriteSet;

        public MobFactory(IAnimatedSprite p_i2025_1_)
        {
            this.spriteSet = p_i2025_1_;
        }

        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            Particle particle = new SpellParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
            particle.setColor((float)xSpeed, (float)ySpeed, (float)zSpeed);
            return particle;
        }
    }

    public static class WitchFactory implements IParticleFactory<BasicParticleType>
    {
        private final IAnimatedSprite spriteSet;

        public WitchFactory(IAnimatedSprite p_i1752_1_)
        {
            this.spriteSet = p_i1752_1_;
        }

        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            SpellParticle spellparticle = new SpellParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
            float f = worldIn.rand.nextFloat() * 0.5F + 0.35F;
            spellparticle.setColor(1.0F * f, 0.0F * f, 1.0F * f);
            return spellparticle;
        }
    }
}

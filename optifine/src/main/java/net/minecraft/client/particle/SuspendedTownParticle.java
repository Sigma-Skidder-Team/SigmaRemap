package net.minecraft.client.particle;

import net.minecraft.particles.BasicParticleType;
import net.minecraft.world.World;

public class SuspendedTownParticle extends SpriteTexturedParticle
{
    private SuspendedTownParticle(World p_i1949_1_, double p_i1949_2_, double p_i1949_4_, double p_i1949_6_, double p_i1949_8_, double p_i1949_10_, double p_i1949_12_)
    {
        super(p_i1949_1_, p_i1949_2_, p_i1949_4_, p_i1949_6_, p_i1949_8_, p_i1949_10_, p_i1949_12_);
        float f = this.rand.nextFloat() * 0.1F + 0.2F;
        this.particleRed = f;
        this.particleGreen = f;
        this.particleBlue = f;
        this.setSize(0.02F, 0.02F);
        this.particleScale *= this.rand.nextFloat() * 0.6F + 0.5F;
        this.motionX *= (double)0.02F;
        this.motionY *= (double)0.02F;
        this.motionZ *= (double)0.02F;
        this.maxAge = (int)(20.0D / (Math.random() * 0.8D + 0.2D));
    }

    public IParticleRenderType getRenderType()
    {
        return IParticleRenderType.PARTICLE_SHEET_OPAQUE;
    }

    public void move(double x, double y, double z)
    {
        this.setBoundingBox(this.getBoundingBox().offset(x, y, z));
        this.resetPositionToBB();
    }

    public void tick()
    {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;

        if (this.maxAge-- <= 0)
        {
            this.setExpired();
        }
        else
        {
            this.move(this.motionX, this.motionY, this.motionZ);
            this.motionX *= 0.99D;
            this.motionY *= 0.99D;
            this.motionZ *= 0.99D;
        }
    }

    public static class ComposterFactory implements IParticleFactory<BasicParticleType>
    {
        private final IAnimatedSprite spriteSet;

        public ComposterFactory(IAnimatedSprite p_i3468_1_)
        {
            this.spriteSet = p_i3468_1_;
        }

        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            SuspendedTownParticle suspendedtownparticle = new SuspendedTownParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed);
            suspendedtownparticle.selectSpriteRandomly(this.spriteSet);
            suspendedtownparticle.setColor(1.0F, 1.0F, 1.0F);
            suspendedtownparticle.setMaxAge(3 + worldIn.getRandom().nextInt(5));
            return suspendedtownparticle;
        }
    }

    public static class DolphinSpeedFactory implements IParticleFactory<BasicParticleType>
    {
        private final IAnimatedSprite spriteSet;

        public DolphinSpeedFactory(IAnimatedSprite p_i1417_1_)
        {
            this.spriteSet = p_i1417_1_;
        }

        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            SuspendedTownParticle suspendedtownparticle = new SuspendedTownParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed);
            suspendedtownparticle.setColor(0.3F, 0.5F, 1.0F);
            suspendedtownparticle.selectSpriteRandomly(this.spriteSet);
            suspendedtownparticle.setAlphaF(1.0F - worldIn.rand.nextFloat() * 0.7F);
            suspendedtownparticle.setMaxAge(suspendedtownparticle.getMaxAge() / 2);
            return suspendedtownparticle;
        }
    }

    public static class Factory implements IParticleFactory<BasicParticleType>
    {
        private final IAnimatedSprite spriteSet;

        public Factory(IAnimatedSprite p_i485_1_)
        {
            this.spriteSet = p_i485_1_;
        }

        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            SuspendedTownParticle suspendedtownparticle = new SuspendedTownParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed);
            suspendedtownparticle.selectSpriteRandomly(this.spriteSet);
            return suspendedtownparticle;
        }
    }

    public static class HappyVillagerFactory implements IParticleFactory<BasicParticleType>
    {
        private final IAnimatedSprite spriteSet;

        public HappyVillagerFactory(IAnimatedSprite p_i2751_1_)
        {
            this.spriteSet = p_i2751_1_;
        }

        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            SuspendedTownParticle suspendedtownparticle = new SuspendedTownParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed);
            suspendedtownparticle.selectSpriteRandomly(this.spriteSet);
            suspendedtownparticle.setColor(1.0F, 1.0F, 1.0F);
            return suspendedtownparticle;
        }
    }
}

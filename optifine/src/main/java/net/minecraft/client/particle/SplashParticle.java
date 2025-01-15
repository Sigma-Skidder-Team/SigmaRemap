package net.minecraft.client.particle;

import net.minecraft.particles.BasicParticleType;
import net.minecraft.world.World;

public class SplashParticle extends RainParticle
{
    private SplashParticle(World p_i3783_1_, double p_i3783_2_, double p_i3783_4_, double p_i3783_6_, double p_i3783_8_, double p_i3783_10_, double p_i3783_12_)
    {
        super(p_i3783_1_, p_i3783_2_, p_i3783_4_, p_i3783_6_);
        this.particleGravity = 0.04F;

        if (p_i3783_10_ == 0.0D && (p_i3783_8_ != 0.0D || p_i3783_12_ != 0.0D))
        {
            this.motionX = p_i3783_8_;
            this.motionY = 0.1D;
            this.motionZ = p_i3783_12_;
        }
    }

    public static class Factory implements IParticleFactory<BasicParticleType>
    {
        private final IAnimatedSprite spriteSet;

        public Factory(IAnimatedSprite p_i3322_1_)
        {
            this.spriteSet = p_i3322_1_;
        }

        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            SplashParticle splashparticle = new SplashParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed);
            splashparticle.selectSpriteRandomly(this.spriteSet);
            return splashparticle;
        }
    }
}

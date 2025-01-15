package net.minecraft.client.particle;

import net.minecraft.particles.BasicParticleType;
import net.minecraft.world.World;

public class LargeSmokeParticle extends SmokeParticle
{
    protected LargeSmokeParticle(World p_i2443_1_, double p_i2443_2_, double p_i2443_4_, double p_i2443_6_, double p_i2443_8_, double p_i2443_10_, double p_i2443_12_, IAnimatedSprite p_i2443_14_)
    {
        super(p_i2443_1_, p_i2443_2_, p_i2443_4_, p_i2443_6_, p_i2443_8_, p_i2443_10_, p_i2443_12_, 2.5F, p_i2443_14_);
    }

    public static class Factory implements IParticleFactory<BasicParticleType>
    {
        private final IAnimatedSprite spriteSet;

        public Factory(IAnimatedSprite screen)
        {
            this.spriteSet = screen;
        }

        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            return new LargeSmokeParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
        }
    }
}

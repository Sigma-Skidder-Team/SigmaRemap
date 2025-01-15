package net.minecraft.client.particle;

import net.minecraft.particles.BasicParticleType;
import net.minecraft.world.World;

public class TotemOfUndyingParticle extends SimpleAnimatedParticle
{
    private TotemOfUndyingParticle(World p_i847_1_, double p_i847_2_, double p_i847_4_, double p_i847_6_, double p_i847_8_, double p_i847_10_, double p_i847_12_, IAnimatedSprite p_i847_14_)
    {
        super(p_i847_1_, p_i847_2_, p_i847_4_, p_i847_6_, p_i847_14_, -0.05F);
        this.motionX = p_i847_8_;
        this.motionY = p_i847_10_;
        this.motionZ = p_i847_12_;
        this.particleScale *= 0.75F;
        this.maxAge = 60 + this.rand.nextInt(12);
        this.selectSpriteWithAge(p_i847_14_);

        if (this.rand.nextInt(4) == 0)
        {
            this.setColor(0.6F + this.rand.nextFloat() * 0.2F, 0.6F + this.rand.nextFloat() * 0.3F, this.rand.nextFloat() * 0.2F);
        }
        else
        {
            this.setColor(0.1F + this.rand.nextFloat() * 0.2F, 0.4F + this.rand.nextFloat() * 0.3F, this.rand.nextFloat() * 0.2F);
        }

        this.setBaseAirFriction(0.6F);
    }

    public static class Factory implements IParticleFactory<BasicParticleType>
    {
        private final IAnimatedSprite spriteSet;

        public Factory(IAnimatedSprite p_i3241_1_)
        {
            this.spriteSet = p_i3241_1_;
        }

        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            return new TotemOfUndyingParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
        }
    }
}

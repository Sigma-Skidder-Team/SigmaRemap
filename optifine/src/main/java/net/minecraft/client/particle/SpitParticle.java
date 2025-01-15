package net.minecraft.client.particle;

import net.minecraft.particles.BasicParticleType;
import net.minecraft.world.World;

public class SpitParticle extends PoofParticle
{
    private SpitParticle(World p_i1007_1_, double p_i1007_2_, double p_i1007_4_, double p_i1007_6_, double p_i1007_8_, double p_i1007_10_, double p_i1007_12_, IAnimatedSprite p_i1007_14_)
    {
        super(p_i1007_1_, p_i1007_2_, p_i1007_4_, p_i1007_6_, p_i1007_8_, p_i1007_10_, p_i1007_12_, p_i1007_14_);
        this.particleGravity = 0.5F;
    }

    public void tick()
    {
        super.tick();
        this.motionY -= 0.004D + 0.04D * (double)this.particleGravity;
    }

    public static class Factory implements IParticleFactory<BasicParticleType>
    {
        private final IAnimatedSprite spriteSet;

        public Factory(IAnimatedSprite p_i289_1_)
        {
            this.spriteSet = p_i289_1_;
        }

        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            return new SpitParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
        }
    }
}

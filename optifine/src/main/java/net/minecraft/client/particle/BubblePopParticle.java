package net.minecraft.client.particle;

import net.minecraft.particles.BasicParticleType;
import net.minecraft.world.World;

public class BubblePopParticle extends SpriteTexturedParticle
{
    private final IAnimatedSprite field_217573_C;

    private BubblePopParticle(World p_i3791_1_, double p_i3791_2_, double p_i3791_4_, double p_i3791_6_, double p_i3791_8_, double p_i3791_10_, double p_i3791_12_, IAnimatedSprite p_i3791_14_)
    {
        super(p_i3791_1_, p_i3791_2_, p_i3791_4_, p_i3791_6_);
        this.field_217573_C = p_i3791_14_;
        this.maxAge = 4;
        this.particleGravity = 0.008F;
        this.motionX = p_i3791_8_;
        this.motionY = p_i3791_10_;
        this.motionZ = p_i3791_12_;
        this.selectSpriteWithAge(p_i3791_14_);
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
            this.motionY -= (double)this.particleGravity;
            this.move(this.motionX, this.motionY, this.motionZ);
            this.selectSpriteWithAge(this.field_217573_C);
        }
    }

    public IParticleRenderType getRenderType()
    {
        return IParticleRenderType.PARTICLE_SHEET_OPAQUE;
    }

    public static class Factory implements IParticleFactory<BasicParticleType>
    {
        private final IAnimatedSprite spriteSet;

        public Factory(IAnimatedSprite p_i2315_1_)
        {
            this.spriteSet = p_i2315_1_;
        }

        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            return new BubblePopParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
        }
    }
}

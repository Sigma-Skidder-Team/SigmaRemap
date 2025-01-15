package net.minecraft.client.particle;

import net.minecraft.particles.BasicParticleType;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class UnderwaterParticle extends SpriteTexturedParticle
{
    private UnderwaterParticle(World p_i4122_1_, double p_i4122_2_, double p_i4122_4_, double p_i4122_6_)
    {
        super(p_i4122_1_, p_i4122_2_, p_i4122_4_ - 0.125D, p_i4122_6_);
        this.particleRed = 0.4F;
        this.particleGreen = 0.4F;
        this.particleBlue = 0.7F;
        this.setSize(0.01F, 0.01F);
        this.particleScale *= this.rand.nextFloat() * 0.6F + 0.2F;
        this.maxAge = (int)(16.0D / (Math.random() * 0.8D + 0.2D));
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

        if (this.maxAge-- <= 0)
        {
            this.setExpired();
        }
        else
        {
            this.move(this.motionX, this.motionY, this.motionZ);

            if (!this.world.getFluidState(new BlockPos(this.posX, this.posY, this.posZ)).isTagged(FluidTags.WATER))
            {
                this.setExpired();
            }
        }
    }

    public static class Factory implements IParticleFactory<BasicParticleType>
    {
        private final IAnimatedSprite spriteSet;

        public Factory(IAnimatedSprite p_i1222_1_)
        {
            this.spriteSet = p_i1222_1_;
        }

        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            UnderwaterParticle underwaterparticle = new UnderwaterParticle(worldIn, x, y, z);
            underwaterparticle.selectSpriteRandomly(this.spriteSet);
            return underwaterparticle;
        }
    }
}

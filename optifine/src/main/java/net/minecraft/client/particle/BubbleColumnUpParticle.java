package net.minecraft.client.particle;

import net.minecraft.particles.BasicParticleType;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BubbleColumnUpParticle extends SpriteTexturedParticle
{
    private BubbleColumnUpParticle(World p_i344_1_, double p_i344_2_, double p_i344_4_, double p_i344_6_, double p_i344_8_, double p_i344_10_, double p_i344_12_)
    {
        super(p_i344_1_, p_i344_2_, p_i344_4_, p_i344_6_);
        this.setSize(0.02F, 0.02F);
        this.particleScale *= this.rand.nextFloat() * 0.6F + 0.2F;
        this.motionX = p_i344_8_ * (double)0.2F + (Math.random() * 2.0D - 1.0D) * (double)0.02F;
        this.motionY = p_i344_10_ * (double)0.2F + (Math.random() * 2.0D - 1.0D) * (double)0.02F;
        this.motionZ = p_i344_12_ * (double)0.2F + (Math.random() * 2.0D - 1.0D) * (double)0.02F;
        this.maxAge = (int)(40.0D / (Math.random() * 0.8D + 0.2D));
    }

    public void tick()
    {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        this.motionY += 0.005D;

        if (this.maxAge-- <= 0)
        {
            this.setExpired();
        }
        else
        {
            this.move(this.motionX, this.motionY, this.motionZ);
            this.motionX *= (double)0.85F;
            this.motionY *= (double)0.85F;
            this.motionZ *= (double)0.85F;

            if (!this.world.getFluidState(new BlockPos(this.posX, this.posY, this.posZ)).isTagged(FluidTags.WATER))
            {
                this.setExpired();
            }
        }
    }

    public IParticleRenderType getRenderType()
    {
        return IParticleRenderType.PARTICLE_SHEET_OPAQUE;
    }

    public static class Factory implements IParticleFactory<BasicParticleType>
    {
        private final IAnimatedSprite spriteSet;

        public Factory(IAnimatedSprite p_i1988_1_)
        {
            this.spriteSet = p_i1988_1_;
        }

        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            BubbleColumnUpParticle bubblecolumnupparticle = new BubbleColumnUpParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed);
            bubblecolumnupparticle.selectSpriteRandomly(this.spriteSet);
            return bubblecolumnupparticle;
        }
    }
}

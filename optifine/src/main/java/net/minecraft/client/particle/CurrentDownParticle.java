package net.minecraft.client.particle;

import net.minecraft.particles.BasicParticleType;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class CurrentDownParticle extends SpriteTexturedParticle
{
    private float field_203083_a;

    private CurrentDownParticle(World p_i2330_1_, double p_i2330_2_, double p_i2330_4_, double p_i2330_6_)
    {
        super(p_i2330_1_, p_i2330_2_, p_i2330_4_, p_i2330_6_);
        this.maxAge = (int)(Math.random() * 60.0D) + 30;
        this.canCollide = false;
        this.motionX = 0.0D;
        this.motionY = -0.05D;
        this.motionZ = 0.0D;
        this.setSize(0.02F, 0.02F);
        this.particleScale *= this.rand.nextFloat() * 0.6F + 0.2F;
        this.particleGravity = 0.002F;
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

        if (this.age++ >= this.maxAge)
        {
            this.setExpired();
        }
        else
        {
            float f = 0.6F;
            this.motionX += (double)(0.6F * MathHelper.cos(this.field_203083_a));
            this.motionZ += (double)(0.6F * MathHelper.sin(this.field_203083_a));
            this.motionX *= 0.07D;
            this.motionZ *= 0.07D;
            this.move(this.motionX, this.motionY, this.motionZ);

            if (!this.world.getFluidState(new BlockPos(this.posX, this.posY, this.posZ)).isTagged(FluidTags.WATER) || this.onGround)
            {
                this.setExpired();
            }

            this.field_203083_a = (float)((double)this.field_203083_a + 0.08D);
        }
    }

    public static class Factory implements IParticleFactory<BasicParticleType>
    {
        private final IAnimatedSprite spriteSet;

        public Factory(IAnimatedSprite p_i3529_1_)
        {
            this.spriteSet = p_i3529_1_;
        }

        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            CurrentDownParticle currentdownparticle = new CurrentDownParticle(worldIn, x, y, z);
            currentdownparticle.selectSpriteRandomly(this.spriteSet);
            return currentdownparticle;
        }
    }
}

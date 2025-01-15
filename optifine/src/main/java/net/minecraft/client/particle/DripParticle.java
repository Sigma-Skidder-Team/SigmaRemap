package net.minecraft.client.particle;

import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class DripParticle extends SpriteTexturedParticle
{
    private final Fluid fluid;

    private DripParticle(World p_i2105_1_, double p_i2105_2_, double p_i2105_4_, double p_i2105_6_, Fluid p_i2105_8_)
    {
        super(p_i2105_1_, p_i2105_2_, p_i2105_4_, p_i2105_6_);
        this.setSize(0.01F, 0.01F);
        this.particleGravity = 0.06F;
        this.fluid = p_i2105_8_;
    }

    public IParticleRenderType getRenderType()
    {
        return IParticleRenderType.PARTICLE_SHEET_OPAQUE;
    }

    public int getBrightnessForRender(float partialTick)
    {
        return this.fluid.isIn(FluidTags.LAVA) ? 240 : super.getBrightnessForRender(partialTick);
    }

    public void tick()
    {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        this.func_217576_g();

        if (!this.isExpired)
        {
            this.motionY -= (double)this.particleGravity;
            this.move(this.motionX, this.motionY, this.motionZ);
            this.func_217577_h();

            if (!this.isExpired)
            {
                this.motionX *= (double)0.98F;
                this.motionY *= (double)0.98F;
                this.motionZ *= (double)0.98F;
                BlockPos blockpos = new BlockPos(this.posX, this.posY, this.posZ);
                IFluidState ifluidstate = this.world.getFluidState(blockpos);

                if (ifluidstate.getFluid() == this.fluid && this.posY < (double)((float)blockpos.getY() + ifluidstate.getActualHeight(this.world, blockpos)))
                {
                    this.setExpired();
                }
            }
        }
    }

    protected void func_217576_g()
    {
        if (this.maxAge-- <= 0)
        {
            this.setExpired();
        }
    }

    protected void func_217577_h()
    {
    }

    static class Dripping extends DripParticle
    {
        private final IParticleData field_217579_C;

        private Dripping(World p_i317_1_, double p_i317_2_, double p_i317_4_, double p_i317_6_, Fluid p_i317_8_, IParticleData p_i317_9_)
        {
            super(p_i317_1_, p_i317_2_, p_i317_4_, p_i317_6_, p_i317_8_);
            this.field_217579_C = p_i317_9_;
            this.particleGravity *= 0.02F;
            this.maxAge = 40;
        }

        protected void func_217576_g()
        {
            if (this.maxAge-- <= 0)
            {
                this.setExpired();
                this.world.addParticle(this.field_217579_C, this.posX, this.posY, this.posZ, this.motionX, this.motionY, this.motionZ);
            }
        }

        protected void func_217577_h()
        {
            this.motionX *= 0.02D;
            this.motionY *= 0.02D;
            this.motionZ *= 0.02D;
        }
    }

    public static class DrippingHoneyFactory implements IParticleFactory<BasicParticleType>
    {
        protected final IAnimatedSprite field_228337_a_;

        public DrippingHoneyFactory(IAnimatedSprite p_i465_1_)
        {
            this.field_228337_a_ = p_i465_1_;
        }

        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            DripParticle.Dripping dripparticle$dripping = new DripParticle.Dripping(worldIn, x, y, z, Fluids.EMPTY, ParticleTypes.FALLING_HONEY);
            dripparticle$dripping.particleGravity *= 0.01F;
            dripparticle$dripping.maxAge = 100;
            dripparticle$dripping.setColor(0.622F, 0.508F, 0.082F);
            dripparticle$dripping.selectSpriteRandomly(this.field_228337_a_);
            return dripparticle$dripping;
        }
    }

    static class DrippingLava extends DripParticle.Dripping
    {
        private DrippingLava(World p_i2023_1_, double p_i2023_2_, double p_i2023_4_, double p_i2023_6_, Fluid p_i2023_8_, IParticleData p_i2023_9_)
        {
            super(p_i2023_1_, p_i2023_2_, p_i2023_4_, p_i2023_6_, p_i2023_8_, p_i2023_9_);
        }

        protected void func_217576_g()
        {
            this.particleRed = 1.0F;
            this.particleGreen = 16.0F / (float)(40 - this.maxAge + 16);
            this.particleBlue = 4.0F / (float)(40 - this.maxAge + 8);
            super.func_217576_g();
        }
    }

    public static class DrippingLavaFactory implements IParticleFactory<BasicParticleType>
    {
        protected final IAnimatedSprite spriteSet;

        public DrippingLavaFactory(IAnimatedSprite p_i2295_1_)
        {
            this.spriteSet = p_i2295_1_;
        }

        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            DripParticle.DrippingLava dripparticle$drippinglava = new DripParticle.DrippingLava(worldIn, x, y, z, Fluids.LAVA, ParticleTypes.FALLING_LAVA);
            dripparticle$drippinglava.selectSpriteRandomly(this.spriteSet);
            return dripparticle$drippinglava;
        }
    }

    public static class DrippingWaterFactory implements IParticleFactory<BasicParticleType>
    {
        protected final IAnimatedSprite spriteSet;

        public DrippingWaterFactory(IAnimatedSprite p_i1213_1_)
        {
            this.spriteSet = p_i1213_1_;
        }

        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            DripParticle dripparticle = new DripParticle.Dripping(worldIn, x, y, z, Fluids.WATER, ParticleTypes.FALLING_WATER);
            dripparticle.setColor(0.2F, 0.3F, 1.0F);
            dripparticle.selectSpriteRandomly(this.spriteSet);
            return dripparticle;
        }
    }

    public static class FallingHoneyFactory implements IParticleFactory<BasicParticleType>
    {
        protected final IAnimatedSprite field_228336_a_;

        public FallingHoneyFactory(IAnimatedSprite p_i1703_1_)
        {
            this.field_228336_a_ = p_i1703_1_;
        }

        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            DripParticle dripparticle = new DripParticle.FallingHoneyParticle(worldIn, x, y, z, Fluids.EMPTY, ParticleTypes.LANDING_HONEY);
            dripparticle.particleGravity = 0.01F;
            dripparticle.setColor(0.582F, 0.448F, 0.082F);
            dripparticle.selectSpriteRandomly(this.field_228336_a_);
            return dripparticle;
        }
    }

    static class FallingHoneyParticle extends DripParticle.FallingLiquidParticle
    {
        private FallingHoneyParticle(World p_i1680_1_, double p_i1680_2_, double p_i1680_4_, double p_i1680_6_, Fluid p_i1680_8_, IParticleData p_i1680_9_)
        {
            super(p_i1680_1_, p_i1680_2_, p_i1680_4_, p_i1680_6_, p_i1680_8_, p_i1680_9_);
        }

        protected void func_217577_h()
        {
            if (this.onGround)
            {
                this.setExpired();
                this.world.addParticle(this.field_228335_a_, this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
                this.world.playSound(this.posX + 0.5D, this.posY, this.posZ + 0.5D, SoundEvents.field_226130_ae_, SoundCategory.BLOCKS, 0.3F + this.world.rand.nextFloat() * 2.0F / 3.0F, 1.0F, false);
            }
        }
    }

    public static class FallingLavaFactory implements IParticleFactory<BasicParticleType>
    {
        protected final IAnimatedSprite spriteSet;

        public FallingLavaFactory(IAnimatedSprite p_i1272_1_)
        {
            this.spriteSet = p_i1272_1_;
        }

        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            DripParticle dripparticle = new DripParticle.FallingLiquidParticle(worldIn, x, y, z, Fluids.LAVA, ParticleTypes.LANDING_LAVA);
            dripparticle.setColor(1.0F, 0.2857143F, 0.083333336F);
            dripparticle.selectSpriteRandomly(this.spriteSet);
            return dripparticle;
        }
    }

    static class FallingLiquidParticle extends DripParticle.FallingNectarParticle
    {
        protected final IParticleData field_228335_a_;

        private FallingLiquidParticle(World p_i1929_1_, double p_i1929_2_, double p_i1929_4_, double p_i1929_6_, Fluid p_i1929_8_, IParticleData p_i1929_9_)
        {
            super(p_i1929_1_, p_i1929_2_, p_i1929_4_, p_i1929_6_, p_i1929_8_);
            this.field_228335_a_ = p_i1929_9_;
        }

        protected void func_217577_h()
        {
            if (this.onGround)
            {
                this.setExpired();
                this.world.addParticle(this.field_228335_a_, this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
            }
        }
    }

    public static class FallingNectarFactory implements IParticleFactory<BasicParticleType>
    {
        protected final IAnimatedSprite field_228339_a_;

        public FallingNectarFactory(IAnimatedSprite p_i2448_1_)
        {
            this.field_228339_a_ = p_i2448_1_;
        }

        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            DripParticle dripparticle = new DripParticle.FallingNectarParticle(worldIn, x, y, z, Fluids.EMPTY);
            dripparticle.maxAge = (int)(16.0D / (Math.random() * 0.8D + 0.2D));
            dripparticle.particleGravity = 0.007F;
            dripparticle.setColor(0.92F, 0.782F, 0.72F);
            dripparticle.selectSpriteRandomly(this.field_228339_a_);
            return dripparticle;
        }
    }

    static class FallingNectarParticle extends DripParticle
    {
        private FallingNectarParticle(World p_i3563_1_, double p_i3563_2_, double p_i3563_4_, double p_i3563_6_, Fluid p_i3563_8_)
        {
            super(p_i3563_1_, p_i3563_2_, p_i3563_4_, p_i3563_6_, p_i3563_8_);
            this.maxAge = (int)(64.0D / (Math.random() * 0.8D + 0.2D));
        }

        protected void func_217577_h()
        {
            if (this.onGround)
            {
                this.setExpired();
            }
        }
    }

    public static class FallingWaterFactory implements IParticleFactory<BasicParticleType>
    {
        protected final IAnimatedSprite spriteSet;

        public FallingWaterFactory(IAnimatedSprite p_i787_1_)
        {
            this.spriteSet = p_i787_1_;
        }

        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            DripParticle dripparticle = new DripParticle.FallingLiquidParticle(worldIn, x, y, z, Fluids.WATER, ParticleTypes.SPLASH);
            dripparticle.setColor(0.2F, 0.3F, 1.0F);
            dripparticle.selectSpriteRandomly(this.spriteSet);
            return dripparticle;
        }
    }

    static class Landing extends DripParticle
    {
        private Landing(World p_i3426_1_, double p_i3426_2_, double p_i3426_4_, double p_i3426_6_, Fluid p_i3426_8_)
        {
            super(p_i3426_1_, p_i3426_2_, p_i3426_4_, p_i3426_6_, p_i3426_8_);
            this.maxAge = (int)(16.0D / (Math.random() * 0.8D + 0.2D));
        }
    }

    public static class LandingHoneyFactory implements IParticleFactory<BasicParticleType>
    {
        protected final IAnimatedSprite field_228338_a_;

        public LandingHoneyFactory(IAnimatedSprite p_i1408_1_)
        {
            this.field_228338_a_ = p_i1408_1_;
        }

        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            DripParticle dripparticle = new DripParticle.Landing(worldIn, x, y, z, Fluids.EMPTY);
            dripparticle.maxAge = (int)(128.0D / (Math.random() * 0.8D + 0.2D));
            dripparticle.setColor(0.522F, 0.408F, 0.082F);
            dripparticle.selectSpriteRandomly(this.field_228338_a_);
            return dripparticle;
        }
    }

    public static class LandingLavaFactory implements IParticleFactory<BasicParticleType>
    {
        protected final IAnimatedSprite spriteSet;

        public LandingLavaFactory(IAnimatedSprite p_i369_1_)
        {
            this.spriteSet = p_i369_1_;
        }

        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            DripParticle dripparticle = new DripParticle.Landing(worldIn, x, y, z, Fluids.LAVA);
            dripparticle.setColor(1.0F, 0.2857143F, 0.083333336F);
            dripparticle.selectSpriteRandomly(this.spriteSet);
            return dripparticle;
        }
    }
}

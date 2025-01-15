package net.minecraft.client.particle;

import javax.annotation.Nullable;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.FallingBlock;
import net.minecraft.client.Minecraft;
import net.minecraft.particles.BlockParticleData;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class FallingDustParticle extends SpriteTexturedParticle
{
    private final float rotSpeed;
    private final IAnimatedSprite field_217580_F;

    private FallingDustParticle(World theCreatureIn, double movementSpeedIn, double p_i1623_4_, double p_i1623_6_, float p_i1623_8_, float p_i1623_9_, float p_i1623_10_, IAnimatedSprite p_i1623_11_)
    {
        super(theCreatureIn, movementSpeedIn, p_i1623_4_, p_i1623_6_);
        this.field_217580_F = p_i1623_11_;
        this.particleRed = p_i1623_8_;
        this.particleGreen = p_i1623_9_;
        this.particleBlue = p_i1623_10_;
        float f = 0.9F;
        this.particleScale *= 0.67499995F;
        int i = (int)(32.0D / (Math.random() * 0.8D + 0.2D));
        this.maxAge = (int)Math.max((float)i * 0.9F, 1.0F);
        this.selectSpriteWithAge(p_i1623_11_);
        this.rotSpeed = ((float)Math.random() - 0.5F) * 0.1F;
        this.particleAngle = (float)Math.random() * ((float)Math.PI * 2F);
    }

    public IParticleRenderType getRenderType()
    {
        return IParticleRenderType.PARTICLE_SHEET_OPAQUE;
    }

    public float getScale(float p_217561_1_)
    {
        return this.particleScale * MathHelper.clamp(((float)this.age + p_217561_1_) / (float)this.maxAge * 32.0F, 0.0F, 1.0F);
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
            this.selectSpriteWithAge(this.field_217580_F);
            this.prevParticleAngle = this.particleAngle;
            this.particleAngle += (float)Math.PI * this.rotSpeed * 2.0F;

            if (this.onGround)
            {
                this.prevParticleAngle = this.particleAngle = 0.0F;
            }

            this.move(this.motionX, this.motionY, this.motionZ);
            this.motionY -= (double)0.003F;
            this.motionY = Math.max(this.motionY, (double) - 0.14F);
        }
    }

    public static class Factory implements IParticleFactory<BlockParticleData>
    {
        private final IAnimatedSprite spriteSet;

        public Factory(IAnimatedSprite p_i957_1_)
        {
            this.spriteSet = p_i957_1_;
        }

        @Nullable
        public Particle makeParticle(BlockParticleData typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            BlockState blockstate = typeIn.getBlockState();

            if (!blockstate.isAir() && blockstate.getRenderType() == BlockRenderType.INVISIBLE)
            {
                return null;
            }
            else
            {
                int i = Minecraft.getInstance().getBlockColors().getColorOrMaterialColor(blockstate, worldIn, new BlockPos(x, y, z));

                if (blockstate.getBlock() instanceof FallingBlock)
                {
                    i = ((FallingBlock)blockstate.getBlock()).getDustColor(blockstate);
                }

                float f = (float)(i >> 16 & 255) / 255.0F;
                float f1 = (float)(i >> 8 & 255) / 255.0F;
                float f2 = (float)(i & 255) / 255.0F;
                return new FallingDustParticle(worldIn, x, y, z, f, f1, f2, this.spriteSet);
            }
        }
    }
}

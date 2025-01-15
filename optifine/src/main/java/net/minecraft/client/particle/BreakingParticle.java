package net.minecraft.client.particle;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.ItemParticleData;
import net.minecraft.world.World;

public class BreakingParticle extends SpriteTexturedParticle
{
    private final float field_217571_C;
    private final float field_217572_F;

    private BreakingParticle(World p_i371_1_, double p_i371_2_, double p_i371_4_, double p_i371_6_, double p_i371_8_, double p_i371_10_, double p_i371_12_, ItemStack p_i371_14_)
    {
        this(p_i371_1_, p_i371_2_, p_i371_4_, p_i371_6_, p_i371_14_);
        this.motionX *= (double)0.1F;
        this.motionY *= (double)0.1F;
        this.motionZ *= (double)0.1F;
        this.motionX += p_i371_8_;
        this.motionY += p_i371_10_;
        this.motionZ += p_i371_12_;
    }

    public IParticleRenderType getRenderType()
    {
        return IParticleRenderType.TERRAIN_SHEET;
    }

    protected BreakingParticle(World p_i372_1_, double p_i372_2_, double p_i372_4_, double p_i372_6_, ItemStack p_i372_8_)
    {
        super(p_i372_1_, p_i372_2_, p_i372_4_, p_i372_6_, 0.0D, 0.0D, 0.0D);
        this.setSprite(Minecraft.getInstance().getItemRenderer().getItemModelWithOverrides(p_i372_8_, p_i372_1_, (LivingEntity)null).getParticleTexture());
        this.particleGravity = 1.0F;
        this.particleScale /= 2.0F;
        this.field_217571_C = this.rand.nextFloat() * 3.0F;
        this.field_217572_F = this.rand.nextFloat() * 3.0F;
    }

    protected float getMinU()
    {
        return this.sprite.getInterpolatedU((double)((this.field_217571_C + 1.0F) / 4.0F * 16.0F));
    }

    protected float getMaxU()
    {
        return this.sprite.getInterpolatedU((double)(this.field_217571_C / 4.0F * 16.0F));
    }

    protected float getMinV()
    {
        return this.sprite.getInterpolatedV((double)(this.field_217572_F / 4.0F * 16.0F));
    }

    protected float getMaxV()
    {
        return this.sprite.getInterpolatedV((double)((this.field_217572_F + 1.0F) / 4.0F * 16.0F));
    }

    public static class Factory implements IParticleFactory<ItemParticleData>
    {
        public Particle makeParticle(ItemParticleData typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            return new BreakingParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, typeIn.getItemStack());
        }
    }

    public static class SlimeFactory implements IParticleFactory<BasicParticleType>
    {
        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            return new BreakingParticle(worldIn, x, y, z, new ItemStack(Items.SLIME_BALL));
        }
    }

    public static class SnowballFactory implements IParticleFactory<BasicParticleType>
    {
        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            return new BreakingParticle(worldIn, x, y, z, new ItemStack(Items.SNOWBALL));
        }
    }
}

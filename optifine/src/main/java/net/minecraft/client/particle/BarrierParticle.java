package net.minecraft.client.particle;

import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.util.IItemProvider;
import net.minecraft.world.World;

public class BarrierParticle extends SpriteTexturedParticle
{
    private BarrierParticle(World p_i2143_1_, double p_i2143_2_, double p_i2143_4_, double p_i2143_6_, IItemProvider p_i2143_8_)
    {
        super(p_i2143_1_, p_i2143_2_, p_i2143_4_, p_i2143_6_);
        this.setSprite(Minecraft.getInstance().getItemRenderer().getItemModelMesher().getParticleIcon(p_i2143_8_));
        this.particleGravity = 0.0F;
        this.maxAge = 80;
        this.canCollide = false;
    }

    public IParticleRenderType getRenderType()
    {
        return IParticleRenderType.TERRAIN_SHEET;
    }

    public float getScale(float p_217561_1_)
    {
        return 0.5F;
    }

    public static class Factory implements IParticleFactory<BasicParticleType>
    {
        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            return new BarrierParticle(worldIn, x, y, z, Blocks.BARRIER.asItem());
        }
    }
}

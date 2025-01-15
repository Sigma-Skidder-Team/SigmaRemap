package net.minecraft.client.particle;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.world.World;

public class MetaParticle extends Particle
{
    protected MetaParticle(World p_i1398_1_, double p_i1398_2_, double p_i1398_4_, double p_i1398_6_)
    {
        super(p_i1398_1_, p_i1398_2_, p_i1398_4_, p_i1398_6_);
    }

    protected MetaParticle(World p_i1399_1_, double p_i1399_2_, double p_i1399_4_, double p_i1399_6_, double p_i1399_8_, double p_i1399_10_, double p_i1399_12_)
    {
        super(p_i1399_1_, p_i1399_2_, p_i1399_4_, p_i1399_6_, p_i1399_8_, p_i1399_10_, p_i1399_12_);
    }

    public final void renderParticle(IVertexBuilder buffer, ActiveRenderInfo renderInfo, float partialTicks)
    {
    }

    public IParticleRenderType getRenderType()
    {
        return IParticleRenderType.NO_RENDER;
    }
}

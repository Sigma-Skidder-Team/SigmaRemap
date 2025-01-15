package net.minecraft.client.renderer.entity;

import net.minecraft.entity.projectile.SpectralArrowEntity;
import net.minecraft.util.ResourceLocation;

public class SpectralArrowRenderer extends ArrowRenderer<SpectralArrowEntity>
{
    public static final ResourceLocation RES_SPECTRAL_ARROW = new ResourceLocation("textures/entity/projectiles/spectral_arrow.png");

    public SpectralArrowRenderer(EntityRendererManager p_i684_1_)
    {
        super(p_i684_1_);
    }

    public ResourceLocation getEntityTexture(SpectralArrowEntity entity)
    {
        return RES_SPECTRAL_ARROW;
    }
}

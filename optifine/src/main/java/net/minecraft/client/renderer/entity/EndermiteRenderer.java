package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.model.EndermiteModel;
import net.minecraft.entity.monster.EndermiteEntity;
import net.minecraft.util.ResourceLocation;

public class EndermiteRenderer extends MobRenderer<EndermiteEntity, EndermiteModel<EndermiteEntity>>
{
    private static final ResourceLocation ENDERMITE_TEXTURES = new ResourceLocation("textures/entity/endermite.png");

    public EndermiteRenderer(EntityRendererManager p_i2887_1_)
    {
        super(p_i2887_1_, new EndermiteModel<>(), 0.3F);
    }

    protected float getDeathMaxRotation(EndermiteEntity entityLivingBaseIn)
    {
        return 180.0F;
    }

    public ResourceLocation getEntityTexture(EndermiteEntity entity)
    {
        return ENDERMITE_TEXTURES;
    }
}

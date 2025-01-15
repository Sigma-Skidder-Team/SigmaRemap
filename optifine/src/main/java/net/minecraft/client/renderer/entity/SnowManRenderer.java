package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.layers.SnowmanHeadLayer;
import net.minecraft.client.renderer.entity.model.SnowManModel;
import net.minecraft.entity.passive.SnowGolemEntity;
import net.minecraft.util.ResourceLocation;

public class SnowManRenderer extends MobRenderer<SnowGolemEntity, SnowManModel<SnowGolemEntity>>
{
    private static final ResourceLocation SNOW_MAN_TEXTURES = new ResourceLocation("textures/entity/snow_golem.png");

    public SnowManRenderer(EntityRendererManager p_i2504_1_)
    {
        super(p_i2504_1_, new SnowManModel<>(), 0.5F);
        this.addLayer(new SnowmanHeadLayer(this));
    }

    public ResourceLocation getEntityTexture(SnowGolemEntity entity)
    {
        return SNOW_MAN_TEXTURES;
    }
}

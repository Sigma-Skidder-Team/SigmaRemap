package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.layers.SpiderEyesLayer;
import net.minecraft.client.renderer.entity.model.SpiderModel;
import net.minecraft.entity.monster.SpiderEntity;
import net.minecraft.util.ResourceLocation;

public class SpiderRenderer<T extends SpiderEntity> extends MobRenderer<T, SpiderModel<T>>
{
    private static final ResourceLocation SPIDER_TEXTURES = new ResourceLocation("textures/entity/spider/spider.png");

    public SpiderRenderer(EntityRendererManager p_i2935_1_)
    {
        super(p_i2935_1_, new SpiderModel<>(), 0.8F);
        this.addLayer(new SpiderEyesLayer<>(this));
    }

    protected float getDeathMaxRotation(T entityLivingBaseIn)
    {
        return 180.0F;
    }

    public ResourceLocation getEntityTexture(T entity)
    {
        return SPIDER_TEXTURES;
    }
}

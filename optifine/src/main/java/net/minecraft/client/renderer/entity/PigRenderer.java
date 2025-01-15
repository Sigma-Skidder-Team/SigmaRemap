package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.layers.SaddleLayer;
import net.minecraft.client.renderer.entity.model.PigModel;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.util.ResourceLocation;

public class PigRenderer extends MobRenderer<PigEntity, PigModel<PigEntity>>
{
    private static final ResourceLocation PIG_TEXTURES = new ResourceLocation("textures/entity/pig/pig.png");

    public PigRenderer(EntityRendererManager p_i1816_1_)
    {
        super(p_i1816_1_, new PigModel<>(), 0.7F);
        this.addLayer(new SaddleLayer(this));
    }

    public ResourceLocation getEntityTexture(PigEntity entity)
    {
        return PIG_TEXTURES;
    }
}

package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.layers.SheepWoolLayer;
import net.minecraft.client.renderer.entity.model.SheepModel;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.util.ResourceLocation;

public class SheepRenderer extends MobRenderer<SheepEntity, SheepModel<SheepEntity>>
{
    private static final ResourceLocation SHEARED_SHEEP_TEXTURES = new ResourceLocation("textures/entity/sheep/sheep.png");

    public SheepRenderer(EntityRendererManager p_i4117_1_)
    {
        super(p_i4117_1_, new SheepModel<>(), 0.7F);
        this.addLayer(new SheepWoolLayer(this));
    }

    public ResourceLocation getEntityTexture(SheepEntity entity)
    {
        return SHEARED_SHEEP_TEXTURES;
    }
}

package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.layers.DolphinCarriedItemLayer;
import net.minecraft.client.renderer.entity.model.DolphinModel;
import net.minecraft.entity.passive.DolphinEntity;
import net.minecraft.util.ResourceLocation;

public class DolphinRenderer extends MobRenderer<DolphinEntity, DolphinModel<DolphinEntity>>
{
    private static final ResourceLocation DOLPHIN_LOCATION = new ResourceLocation("textures/entity/dolphin.png");

    public DolphinRenderer(EntityRendererManager p_i1077_1_)
    {
        super(p_i1077_1_, new DolphinModel<>(), 0.7F);
        this.addLayer(new DolphinCarriedItemLayer(this));
    }

    public ResourceLocation getEntityTexture(DolphinEntity entity)
    {
        return DOLPHIN_LOCATION;
    }
}

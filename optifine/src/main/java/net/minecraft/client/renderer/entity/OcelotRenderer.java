package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.model.OcelotModel;
import net.minecraft.entity.passive.OcelotEntity;
import net.minecraft.util.ResourceLocation;

public class OcelotRenderer extends MobRenderer<OcelotEntity, OcelotModel<OcelotEntity>>
{
    private static final ResourceLocation OCELOT_TEXTURES = new ResourceLocation("textures/entity/cat/ocelot.png");

    public OcelotRenderer(EntityRendererManager p_i3675_1_)
    {
        super(p_i3675_1_, new OcelotModel<>(0.0F), 0.4F);
    }

    public ResourceLocation getEntityTexture(OcelotEntity entity)
    {
        return OCELOT_TEXTURES;
    }
}

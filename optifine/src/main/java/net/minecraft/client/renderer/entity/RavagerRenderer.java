package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.model.RavagerModel;
import net.minecraft.entity.monster.RavagerEntity;
import net.minecraft.util.ResourceLocation;

public class RavagerRenderer extends MobRenderer<RavagerEntity, RavagerModel>
{
    private static final ResourceLocation field_217778_a = new ResourceLocation("textures/entity/illager/ravager.png");

    public RavagerRenderer(EntityRendererManager p_i3795_1_)
    {
        super(p_i3795_1_, new RavagerModel(), 1.1F);
    }

    public ResourceLocation getEntityTexture(RavagerEntity entity)
    {
        return field_217778_a;
    }
}

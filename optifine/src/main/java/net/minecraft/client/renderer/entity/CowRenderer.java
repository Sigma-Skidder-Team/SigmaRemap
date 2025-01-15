package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.model.CowModel;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.util.ResourceLocation;

public class CowRenderer extends MobRenderer<CowEntity, CowModel<CowEntity>>
{
    private static final ResourceLocation COW_TEXTURES = new ResourceLocation("textures/entity/cow/cow.png");

    public CowRenderer(EntityRendererManager p_i2221_1_)
    {
        super(p_i2221_1_, new CowModel<>(), 0.7F);
    }

    public ResourceLocation getEntityTexture(CowEntity entity)
    {
        return COW_TEXTURES;
    }
}

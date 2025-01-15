package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.model.BlazeModel;
import net.minecraft.entity.monster.BlazeEntity;
import net.minecraft.util.ResourceLocation;

public class BlazeRenderer extends MobRenderer<BlazeEntity, BlazeModel<BlazeEntity>>
{
    private static final ResourceLocation BLAZE_TEXTURES = new ResourceLocation("textures/entity/blaze.png");

    public BlazeRenderer(EntityRendererManager p_i3236_1_)
    {
        super(p_i3236_1_, new BlazeModel<>(), 0.5F);
    }

    protected int getBlockLight(BlazeEntity entityIn, float partialTicks)
    {
        return 15;
    }

    public ResourceLocation getEntityTexture(BlazeEntity entity)
    {
        return BLAZE_TEXTURES;
    }
}

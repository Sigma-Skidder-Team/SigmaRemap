package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.model.ChickenModel;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class ChickenRenderer extends MobRenderer<ChickenEntity, ChickenModel<ChickenEntity>>
{
    private static final ResourceLocation CHICKEN_TEXTURES = new ResourceLocation("textures/entity/chicken.png");

    public ChickenRenderer(EntityRendererManager p_i770_1_)
    {
        super(p_i770_1_, new ChickenModel<>(), 0.3F);
    }

    public ResourceLocation getEntityTexture(ChickenEntity entity)
    {
        return CHICKEN_TEXTURES;
    }

    protected float handleRotationFloat(ChickenEntity livingBase, float partialTicks)
    {
        float f = MathHelper.lerp(partialTicks, livingBase.oFlap, livingBase.wingRotation);
        float f1 = MathHelper.lerp(partialTicks, livingBase.oFlapSpeed, livingBase.destPos);
        return (MathHelper.sin(f) + 1.0F) * f1;
    }
}

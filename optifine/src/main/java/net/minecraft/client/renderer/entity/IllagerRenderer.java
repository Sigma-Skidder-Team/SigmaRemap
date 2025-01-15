package net.minecraft.client.renderer.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.layers.HeadLayer;
import net.minecraft.client.renderer.entity.model.IllagerModel;
import net.minecraft.entity.monster.AbstractIllagerEntity;

public abstract class IllagerRenderer<T extends AbstractIllagerEntity> extends MobRenderer<T, IllagerModel<T>>
{
    protected IllagerRenderer(EntityRendererManager p_i3560_1_, IllagerModel<T> p_i3560_2_, float p_i3560_3_)
    {
        super(p_i3560_1_, p_i3560_2_, p_i3560_3_);
        this.addLayer(new HeadLayer<>(this));
    }

    protected void preRenderCallback(T entitylivingbaseIn, MatrixStack matrixStackIn, float partialTickTime)
    {
        float f = 0.9375F;
        matrixStackIn.scale(0.9375F, 0.9375F, 0.9375F);
    }
}

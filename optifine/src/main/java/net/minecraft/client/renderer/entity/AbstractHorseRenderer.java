package net.minecraft.client.renderer.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.model.HorseModel;
import net.minecraft.entity.passive.horse.AbstractHorseEntity;

public abstract class AbstractHorseRenderer<T extends AbstractHorseEntity, M extends HorseModel<T>> extends MobRenderer<T, M>
{
    private final float scale;

    public AbstractHorseRenderer(EntityRendererManager p_i1434_1_, M p_i1434_2_, float p_i1434_3_)
    {
        super(p_i1434_1_, p_i1434_2_, 0.75F);
        this.scale = p_i1434_3_;
    }

    protected void preRenderCallback(T entitylivingbaseIn, MatrixStack matrixStackIn, float partialTickTime)
    {
        matrixStackIn.scale(this.scale, this.scale, this.scale);
        super.preRenderCallback(entitylivingbaseIn, matrixStackIn, partialTickTime);
    }
}

package net.minecraft.client.renderer.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.entity.Entity;

public abstract class TintedAgeableModel<E extends Entity> extends AgeableModel<E>
{
    private float field_228250_a_ = 1.0F;
    private float field_228251_b_ = 1.0F;
    private float field_228252_f_ = 1.0F;

    public void func_228253_a_(float p_228253_1_, float p_228253_2_, float p_228253_3_)
    {
        this.field_228250_a_ = p_228253_1_;
        this.field_228251_b_ = p_228253_2_;
        this.field_228252_f_ = p_228253_3_;
    }

    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha)
    {
        super.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, this.field_228250_a_ * red, this.field_228251_b_ * green, this.field_228252_f_ * blue, alpha);
    }
}

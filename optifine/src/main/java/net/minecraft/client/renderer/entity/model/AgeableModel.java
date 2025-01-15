package net.minecraft.client.renderer.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import java.util.function.Function;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public abstract class AgeableModel<E extends Entity> extends EntityModel<E>
{
    private final boolean field_228221_a_;
    private final float field_228222_b_;
    private final float field_228223_f_;
    private final float field_228224_g_;
    private final float field_228225_h_;
    private final float field_228226_i_;

    protected AgeableModel(boolean p_i4256_1_, float p_i4256_2_, float p_i4256_3_)
    {
        this(p_i4256_1_, p_i4256_2_, p_i4256_3_, 2.0F, 2.0F, 24.0F);
    }

    protected AgeableModel(boolean p_i4257_1_, float p_i4257_2_, float p_i4257_3_, float p_i4257_4_, float p_i4257_5_, float p_i4257_6_)
    {
        this(RenderType::getEntityCutoutNoCull, p_i4257_1_, p_i4257_2_, p_i4257_3_, p_i4257_4_, p_i4257_5_, p_i4257_6_);
    }

    protected AgeableModel(Function<ResourceLocation, RenderType> p_i4258_1_, boolean p_i4258_2_, float p_i4258_3_, float p_i4258_4_, float p_i4258_5_, float p_i4258_6_, float p_i4258_7_)
    {
        super(p_i4258_1_);
        this.field_228221_a_ = p_i4258_2_;
        this.field_228222_b_ = p_i4258_3_;
        this.field_228223_f_ = p_i4258_4_;
        this.field_228224_g_ = p_i4258_5_;
        this.field_228225_h_ = p_i4258_6_;
        this.field_228226_i_ = p_i4258_7_;
    }

    protected AgeableModel()
    {
        this(false, 5.0F, 2.0F);
    }

    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha)
    {
        if (this.isChild)
        {
            matrixStackIn.push();

            if (this.field_228221_a_)
            {
                float f = 1.5F / this.field_228224_g_;
                matrixStackIn.scale(f, f, f);
            }

            matrixStackIn.translate(0.0D, (double)(this.field_228222_b_ / 16.0F), (double)(this.field_228223_f_ / 16.0F));
            this.getHeadParts().forEach((p_228230_8_) ->
            {
                p_228230_8_.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
            });
            matrixStackIn.pop();
            matrixStackIn.push();
            float f1 = 1.0F / this.field_228225_h_;
            matrixStackIn.scale(f1, f1, f1);
            matrixStackIn.translate(0.0D, (double)(this.field_228226_i_ / 16.0F), 0.0D);
            this.getBodyParts().forEach((p_228229_8_) ->
            {
                p_228229_8_.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
            });
            matrixStackIn.pop();
        }
        else
        {
            this.getHeadParts().forEach((p_228228_8_) ->
            {
                p_228228_8_.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
            });
            this.getBodyParts().forEach((p_228227_8_) ->
            {
                p_228227_8_.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
            });
        }
    }

    protected abstract Iterable<ModelRenderer> getHeadParts();

    protected abstract Iterable<ModelRenderer> getBodyParts();
}

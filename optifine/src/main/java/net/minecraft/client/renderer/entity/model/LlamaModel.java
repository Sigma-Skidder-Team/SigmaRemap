package net.minecraft.client.renderer.entity.model;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.passive.horse.AbstractChestedHorseEntity;
import net.minecraft.util.math.MathHelper;

public class LlamaModel<T extends AbstractChestedHorseEntity> extends EntityModel<T>
{
    private final ModelRenderer field_228273_a_;
    private final ModelRenderer field_228274_b_;
    private final ModelRenderer field_228275_f_;
    private final ModelRenderer field_228276_g_;
    private final ModelRenderer field_228277_h_;
    private final ModelRenderer field_228278_i_;
    private final ModelRenderer chest1;
    private final ModelRenderer chest2;

    public LlamaModel(float p_i2418_1_)
    {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.field_228273_a_ = new ModelRenderer(this, 0, 0);
        this.field_228273_a_.addBox(-2.0F, -14.0F, -10.0F, 4.0F, 4.0F, 9.0F, p_i2418_1_);
        this.field_228273_a_.setRotationPoint(0.0F, 7.0F, -6.0F);
        this.field_228273_a_.setTextureOffset(0, 14).addBox(-4.0F, -16.0F, -6.0F, 8.0F, 18.0F, 6.0F, p_i2418_1_);
        this.field_228273_a_.setTextureOffset(17, 0).addBox(-4.0F, -19.0F, -4.0F, 3.0F, 3.0F, 2.0F, p_i2418_1_);
        this.field_228273_a_.setTextureOffset(17, 0).addBox(1.0F, -19.0F, -4.0F, 3.0F, 3.0F, 2.0F, p_i2418_1_);
        this.field_228274_b_ = new ModelRenderer(this, 29, 0);
        this.field_228274_b_.addBox(-6.0F, -10.0F, -7.0F, 12.0F, 18.0F, 10.0F, p_i2418_1_);
        this.field_228274_b_.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.chest1 = new ModelRenderer(this, 45, 28);
        this.chest1.addBox(-3.0F, 0.0F, 0.0F, 8.0F, 8.0F, 3.0F, p_i2418_1_);
        this.chest1.setRotationPoint(-8.5F, 3.0F, 3.0F);
        this.chest1.rotateAngleY = ((float)Math.PI / 2F);
        this.chest2 = new ModelRenderer(this, 45, 41);
        this.chest2.addBox(-3.0F, 0.0F, 0.0F, 8.0F, 8.0F, 3.0F, p_i2418_1_);
        this.chest2.setRotationPoint(5.5F, 3.0F, 3.0F);
        this.chest2.rotateAngleY = ((float)Math.PI / 2F);
        int i = 4;
        int j = 14;
        this.field_228275_f_ = new ModelRenderer(this, 29, 29);
        this.field_228275_f_.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, p_i2418_1_);
        this.field_228275_f_.setRotationPoint(-2.5F, 10.0F, 6.0F);
        this.field_228276_g_ = new ModelRenderer(this, 29, 29);
        this.field_228276_g_.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, p_i2418_1_);
        this.field_228276_g_.setRotationPoint(2.5F, 10.0F, 6.0F);
        this.field_228277_h_ = new ModelRenderer(this, 29, 29);
        this.field_228277_h_.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, p_i2418_1_);
        this.field_228277_h_.setRotationPoint(-2.5F, 10.0F, -4.0F);
        this.field_228278_i_ = new ModelRenderer(this, 29, 29);
        this.field_228278_i_.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, p_i2418_1_);
        this.field_228278_i_.setRotationPoint(2.5F, 10.0F, -4.0F);
        --this.field_228275_f_.rotationPointX;
        ++this.field_228276_g_.rotationPointX;
        this.field_228275_f_.rotationPointZ += 0.0F;
        this.field_228276_g_.rotationPointZ += 0.0F;
        --this.field_228277_h_.rotationPointX;
        ++this.field_228278_i_.rotationPointX;
        --this.field_228277_h_.rotationPointZ;
        --this.field_228278_i_.rotationPointZ;
    }

    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch)
    {
        this.field_228273_a_.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.field_228273_a_.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.field_228274_b_.rotateAngleX = ((float)Math.PI / 2F);
        this.field_228275_f_.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.field_228276_g_.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.field_228277_h_.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.field_228278_i_.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        boolean flag = !entityIn.isChild() && entityIn.hasChest();
        this.chest1.showModel = flag;
        this.chest2.showModel = flag;
    }

    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha)
    {
        if (this.isChild)
        {
            float f = 2.0F;
            matrixStackIn.push();
            float f1 = 0.7F;
            matrixStackIn.scale(0.71428573F, 0.64935064F, 0.7936508F);
            matrixStackIn.translate(0.0D, 1.3125D, (double)0.22F);
            this.field_228273_a_.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
            matrixStackIn.pop();
            matrixStackIn.push();
            float f2 = 1.1F;
            matrixStackIn.scale(0.625F, 0.45454544F, 0.45454544F);
            matrixStackIn.translate(0.0D, 2.0625D, 0.0D);
            this.field_228274_b_.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
            matrixStackIn.pop();
            matrixStackIn.push();
            matrixStackIn.scale(0.45454544F, 0.41322312F, 0.45454544F);
            matrixStackIn.translate(0.0D, 2.0625D, 0.0D);
            ImmutableList.of(this.field_228275_f_, this.field_228276_g_, this.field_228277_h_, this.field_228278_i_, this.chest1, this.chest2).forEach((p_228280_8_) ->
            {
                p_228280_8_.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
            });
            matrixStackIn.pop();
        }
        else
        {
            ImmutableList.of(this.field_228273_a_, this.field_228274_b_, this.field_228275_f_, this.field_228276_g_, this.field_228277_h_, this.field_228278_i_, this.chest1, this.chest2).forEach((p_228279_8_) ->
            {
                p_228279_8_.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
            });
        }
    }
}

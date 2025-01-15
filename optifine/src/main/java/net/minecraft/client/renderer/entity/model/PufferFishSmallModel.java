package net.minecraft.client.renderer.entity.model;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class PufferFishSmallModel<T extends Entity> extends SegmentedModel<T>
{
    private final ModelRenderer field_203754_a;
    private final ModelRenderer field_203755_b;
    private final ModelRenderer field_203756_c;
    private final ModelRenderer field_203757_d;
    private final ModelRenderer field_203758_e;
    private final ModelRenderer field_203759_f;

    public PufferFishSmallModel()
    {
        this.textureWidth = 32;
        this.textureHeight = 32;
        int i = 23;
        this.field_203754_a = new ModelRenderer(this, 0, 27);
        this.field_203754_a.addBox(-1.5F, -2.0F, -1.5F, 3.0F, 2.0F, 3.0F);
        this.field_203754_a.setRotationPoint(0.0F, 23.0F, 0.0F);
        this.field_203755_b = new ModelRenderer(this, 24, 6);
        this.field_203755_b.addBox(-1.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F);
        this.field_203755_b.setRotationPoint(0.0F, 20.0F, 0.0F);
        this.field_203756_c = new ModelRenderer(this, 28, 6);
        this.field_203756_c.addBox(0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F);
        this.field_203756_c.setRotationPoint(0.0F, 20.0F, 0.0F);
        this.field_203759_f = new ModelRenderer(this, -3, 0);
        this.field_203759_f.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 3.0F);
        this.field_203759_f.setRotationPoint(0.0F, 22.0F, 1.5F);
        this.field_203757_d = new ModelRenderer(this, 25, 0);
        this.field_203757_d.addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F);
        this.field_203757_d.setRotationPoint(-1.5F, 22.0F, -1.5F);
        this.field_203758_e = new ModelRenderer(this, 25, 0);
        this.field_203758_e.addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F);
        this.field_203758_e.setRotationPoint(1.5F, 22.0F, -1.5F);
    }

    public Iterable<ModelRenderer> getParts()
    {
        return ImmutableList.of(this.field_203754_a, this.field_203755_b, this.field_203756_c, this.field_203759_f, this.field_203757_d, this.field_203758_e);
    }

    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch)
    {
        this.field_203757_d.rotateAngleZ = -0.2F + 0.4F * MathHelper.sin(ageInTicks * 0.2F);
        this.field_203758_e.rotateAngleZ = 0.2F - 0.4F * MathHelper.sin(ageInTicks * 0.2F);
    }
}

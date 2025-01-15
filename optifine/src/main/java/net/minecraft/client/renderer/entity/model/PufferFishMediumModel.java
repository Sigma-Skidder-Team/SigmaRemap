package net.minecraft.client.renderer.entity.model;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class PufferFishMediumModel<T extends Entity> extends SegmentedModel<T>
{
    private final ModelRenderer field_203730_a;
    private final ModelRenderer field_203731_b;
    private final ModelRenderer field_203732_c;
    private final ModelRenderer field_203733_d;
    private final ModelRenderer field_203734_e;
    private final ModelRenderer field_203735_f;
    private final ModelRenderer field_203736_g;
    private final ModelRenderer field_203737_h;
    private final ModelRenderer field_203738_i;
    private final ModelRenderer field_203739_j;
    private final ModelRenderer field_203740_k;

    public PufferFishMediumModel()
    {
        this.textureWidth = 32;
        this.textureHeight = 32;
        int i = 22;
        this.field_203730_a = new ModelRenderer(this, 12, 22);
        this.field_203730_a.addBox(-2.5F, -5.0F, -2.5F, 5.0F, 5.0F, 5.0F);
        this.field_203730_a.setRotationPoint(0.0F, 22.0F, 0.0F);
        this.field_203731_b = new ModelRenderer(this, 24, 0);
        this.field_203731_b.addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F);
        this.field_203731_b.setRotationPoint(-2.5F, 17.0F, -1.5F);
        this.field_203732_c = new ModelRenderer(this, 24, 3);
        this.field_203732_c.addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F);
        this.field_203732_c.setRotationPoint(2.5F, 17.0F, -1.5F);
        this.field_203733_d = new ModelRenderer(this, 15, 16);
        this.field_203733_d.addBox(-2.5F, -1.0F, 0.0F, 5.0F, 1.0F, 1.0F);
        this.field_203733_d.setRotationPoint(0.0F, 17.0F, -2.5F);
        this.field_203733_d.rotateAngleX = ((float)Math.PI / 4F);
        this.field_203734_e = new ModelRenderer(this, 10, 16);
        this.field_203734_e.addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 1.0F);
        this.field_203734_e.setRotationPoint(0.0F, 17.0F, 2.5F);
        this.field_203734_e.rotateAngleX = (-(float)Math.PI / 4F);
        this.field_203735_f = new ModelRenderer(this, 8, 16);
        this.field_203735_f.addBox(-1.0F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F);
        this.field_203735_f.setRotationPoint(-2.5F, 22.0F, -2.5F);
        this.field_203735_f.rotateAngleY = (-(float)Math.PI / 4F);
        this.field_203736_g = new ModelRenderer(this, 8, 16);
        this.field_203736_g.addBox(-1.0F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F);
        this.field_203736_g.setRotationPoint(-2.5F, 22.0F, 2.5F);
        this.field_203736_g.rotateAngleY = ((float)Math.PI / 4F);
        this.field_203737_h = new ModelRenderer(this, 4, 16);
        this.field_203737_h.addBox(0.0F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F);
        this.field_203737_h.setRotationPoint(2.5F, 22.0F, 2.5F);
        this.field_203737_h.rotateAngleY = (-(float)Math.PI / 4F);
        this.field_203738_i = new ModelRenderer(this, 0, 16);
        this.field_203738_i.addBox(0.0F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F);
        this.field_203738_i.setRotationPoint(2.5F, 22.0F, -2.5F);
        this.field_203738_i.rotateAngleY = ((float)Math.PI / 4F);
        this.field_203739_j = new ModelRenderer(this, 8, 22);
        this.field_203739_j.addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        this.field_203739_j.setRotationPoint(0.5F, 22.0F, 2.5F);
        this.field_203739_j.rotateAngleX = ((float)Math.PI / 4F);
        this.field_203740_k = new ModelRenderer(this, 17, 21);
        this.field_203740_k.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 1.0F, 1.0F);
        this.field_203740_k.setRotationPoint(0.0F, 22.0F, -2.5F);
        this.field_203740_k.rotateAngleX = (-(float)Math.PI / 4F);
    }

    public Iterable<ModelRenderer> getParts()
    {
        return ImmutableList.of(this.field_203730_a, this.field_203731_b, this.field_203732_c, this.field_203733_d, this.field_203734_e, this.field_203735_f, this.field_203736_g, this.field_203737_h, this.field_203738_i, this.field_203739_j, this.field_203740_k);
    }

    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch)
    {
        this.field_203731_b.rotateAngleZ = -0.2F + 0.4F * MathHelper.sin(ageInTicks * 0.2F);
        this.field_203732_c.rotateAngleZ = 0.2F - 0.4F * MathHelper.sin(ageInTicks * 0.2F);
    }
}

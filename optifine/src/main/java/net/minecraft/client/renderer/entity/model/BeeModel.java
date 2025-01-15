package net.minecraft.client.renderer.entity.model;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.passive.BeeEntity;
import net.minecraft.util.math.MathHelper;

public class BeeModel<T extends BeeEntity> extends AgeableModel<T>
{
    private final ModelRenderer field_228231_a_;
    private final ModelRenderer field_228232_b_;
    private final ModelRenderer field_228233_f_;
    private final ModelRenderer field_228234_g_;
    private final ModelRenderer field_228235_h_;
    private final ModelRenderer field_228236_i_;
    private final ModelRenderer field_228237_j_;
    private final ModelRenderer field_228238_k_;
    private final ModelRenderer field_228239_l_;
    private final ModelRenderer field_228240_m_;
    private float field_228241_n_;

    public BeeModel()
    {
        super(false, 24.0F, 0.0F);
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.field_228231_a_ = new ModelRenderer(this);
        this.field_228231_a_.setRotationPoint(0.0F, 19.0F, 0.0F);
        this.field_228232_b_ = new ModelRenderer(this, 0, 0);
        this.field_228232_b_.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_228231_a_.addChild(this.field_228232_b_);
        this.field_228232_b_.addBox(-3.5F, -4.0F, -5.0F, 7.0F, 7.0F, 10.0F, 0.0F);
        this.field_228238_k_ = new ModelRenderer(this, 26, 7);
        this.field_228238_k_.addBox(0.0F, -1.0F, 5.0F, 0.0F, 1.0F, 2.0F, 0.0F);
        this.field_228232_b_.addChild(this.field_228238_k_);
        this.field_228239_l_ = new ModelRenderer(this, 2, 0);
        this.field_228239_l_.setRotationPoint(0.0F, -2.0F, -5.0F);
        this.field_228239_l_.addBox(1.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F);
        this.field_228240_m_ = new ModelRenderer(this, 2, 3);
        this.field_228240_m_.setRotationPoint(0.0F, -2.0F, -5.0F);
        this.field_228240_m_.addBox(-2.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F);
        this.field_228232_b_.addChild(this.field_228239_l_);
        this.field_228232_b_.addChild(this.field_228240_m_);
        this.field_228233_f_ = new ModelRenderer(this, 0, 18);
        this.field_228233_f_.setRotationPoint(-1.5F, -4.0F, -3.0F);
        this.field_228233_f_.rotateAngleX = 0.0F;
        this.field_228233_f_.rotateAngleY = -0.2618F;
        this.field_228233_f_.rotateAngleZ = 0.0F;
        this.field_228231_a_.addChild(this.field_228233_f_);
        this.field_228233_f_.addBox(-9.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, 0.001F);
        this.field_228234_g_ = new ModelRenderer(this, 0, 18);
        this.field_228234_g_.setRotationPoint(1.5F, -4.0F, -3.0F);
        this.field_228234_g_.rotateAngleX = 0.0F;
        this.field_228234_g_.rotateAngleY = 0.2618F;
        this.field_228234_g_.rotateAngleZ = 0.0F;
        this.field_228234_g_.mirror = true;
        this.field_228231_a_.addChild(this.field_228234_g_);
        this.field_228234_g_.addBox(0.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, 0.001F);
        this.field_228235_h_ = new ModelRenderer(this);
        this.field_228235_h_.setRotationPoint(1.5F, 3.0F, -2.0F);
        this.field_228231_a_.addChild(this.field_228235_h_);
        this.field_228235_h_.addBox("frontLegBox", -5.0F, 0.0F, 0.0F, 7, 2, 0, 0.0F, 26, 1);
        this.field_228236_i_ = new ModelRenderer(this);
        this.field_228236_i_.setRotationPoint(1.5F, 3.0F, 0.0F);
        this.field_228231_a_.addChild(this.field_228236_i_);
        this.field_228236_i_.addBox("midLegBox", -5.0F, 0.0F, 0.0F, 7, 2, 0, 0.0F, 26, 3);
        this.field_228237_j_ = new ModelRenderer(this);
        this.field_228237_j_.setRotationPoint(1.5F, 3.0F, 2.0F);
        this.field_228231_a_.addChild(this.field_228237_j_);
        this.field_228237_j_.addBox("backLegBox", -5.0F, 0.0F, 0.0F, 7, 2, 0, 0.0F, 26, 5);
    }

    public void setLivingAnimations(T entityIn, float limbSwing, float limbSwingAmount, float partialTick)
    {
        super.setLivingAnimations(entityIn, limbSwing, limbSwingAmount, partialTick);
        this.field_228241_n_ = entityIn.func_226455_v_(partialTick);
        this.field_228238_k_.showModel = !entityIn.func_226412_eE_();
    }

    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch)
    {
        this.field_228233_f_.rotateAngleX = 0.0F;
        this.field_228239_l_.rotateAngleX = 0.0F;
        this.field_228240_m_.rotateAngleX = 0.0F;
        this.field_228231_a_.rotateAngleX = 0.0F;
        this.field_228231_a_.rotationPointY = 19.0F;
        boolean flag = entityIn.onGround && entityIn.getMotion().lengthSquared() < 1.0E-7D;

        if (flag)
        {
            this.field_228233_f_.rotateAngleY = -0.2618F;
            this.field_228233_f_.rotateAngleZ = 0.0F;
            this.field_228234_g_.rotateAngleX = 0.0F;
            this.field_228234_g_.rotateAngleY = 0.2618F;
            this.field_228234_g_.rotateAngleZ = 0.0F;
            this.field_228235_h_.rotateAngleX = 0.0F;
            this.field_228236_i_.rotateAngleX = 0.0F;
            this.field_228237_j_.rotateAngleX = 0.0F;
        }
        else
        {
            float f = ageInTicks * 2.1F;
            this.field_228233_f_.rotateAngleY = 0.0F;
            this.field_228233_f_.rotateAngleZ = MathHelper.cos(f) * (float)Math.PI * 0.15F;
            this.field_228234_g_.rotateAngleX = this.field_228233_f_.rotateAngleX;
            this.field_228234_g_.rotateAngleY = this.field_228233_f_.rotateAngleY;
            this.field_228234_g_.rotateAngleZ = -this.field_228233_f_.rotateAngleZ;
            this.field_228235_h_.rotateAngleX = ((float)Math.PI / 4F);
            this.field_228236_i_.rotateAngleX = ((float)Math.PI / 4F);
            this.field_228237_j_.rotateAngleX = ((float)Math.PI / 4F);
            this.field_228231_a_.rotateAngleX = 0.0F;
            this.field_228231_a_.rotateAngleY = 0.0F;
            this.field_228231_a_.rotateAngleZ = 0.0F;
        }

        if (!entityIn.func_226427_ez_())
        {
            this.field_228231_a_.rotateAngleX = 0.0F;
            this.field_228231_a_.rotateAngleY = 0.0F;
            this.field_228231_a_.rotateAngleZ = 0.0F;

            if (!flag)
            {
                float f1 = MathHelper.cos(ageInTicks * 0.18F);
                this.field_228231_a_.rotateAngleX = 0.1F + f1 * (float)Math.PI * 0.025F;
                this.field_228239_l_.rotateAngleX = f1 * (float)Math.PI * 0.03F;
                this.field_228240_m_.rotateAngleX = f1 * (float)Math.PI * 0.03F;
                this.field_228235_h_.rotateAngleX = -f1 * (float)Math.PI * 0.1F + ((float)Math.PI / 8F);
                this.field_228237_j_.rotateAngleX = -f1 * (float)Math.PI * 0.05F + ((float)Math.PI / 4F);
                this.field_228231_a_.rotationPointY = 19.0F - MathHelper.cos(ageInTicks * 0.18F) * 0.9F;
            }
        }

        if (this.field_228241_n_ > 0.0F)
        {
            this.field_228231_a_.rotateAngleX = ModelUtils.func_228283_a_(this.field_228231_a_.rotateAngleX, 3.0915928F, this.field_228241_n_);
        }
    }

    protected Iterable<ModelRenderer> getHeadParts()
    {
        return ImmutableList.of();
    }

    protected Iterable<ModelRenderer> getBodyParts()
    {
        return ImmutableList.of(this.field_228231_a_);
    }
}

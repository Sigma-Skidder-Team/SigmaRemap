package net.minecraft.client.renderer.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.MobEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.HandSide;
import net.minecraft.util.math.MathHelper;

public class SkeletonModel<T extends MobEntity & IRangedAttackMob> extends BipedModel<T>
{
    public SkeletonModel()
    {
        this(0.0F, false);
    }

    public SkeletonModel(float p_i2971_1_, boolean p_i2971_2_)
    {
        super(p_i2971_1_);

        if (!p_i2971_2_)
        {
            this.bipedRightArm = new ModelRenderer(this, 40, 16);
            this.bipedRightArm.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, p_i2971_1_);
            this.bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
            this.bipedLeftArm = new ModelRenderer(this, 40, 16);
            this.bipedLeftArm.mirror = true;
            this.bipedLeftArm.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, p_i2971_1_);
            this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
            this.bipedRightLeg = new ModelRenderer(this, 0, 16);
            this.bipedRightLeg.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, p_i2971_1_);
            this.bipedRightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
            this.bipedLeftLeg = new ModelRenderer(this, 0, 16);
            this.bipedLeftLeg.mirror = true;
            this.bipedLeftLeg.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, p_i2971_1_);
            this.bipedLeftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
        }
    }

    public void setLivingAnimations(T entityIn, float limbSwing, float limbSwingAmount, float partialTick)
    {
        this.rightArmPose = BipedModel.ArmPose.EMPTY;
        this.leftArmPose = BipedModel.ArmPose.EMPTY;
        ItemStack itemstack = entityIn.getHeldItem(Hand.MAIN_HAND);

        if (itemstack.getItem() == Items.BOW && entityIn.isAggressive())
        {
            if (entityIn.getPrimaryHand() == HandSide.RIGHT)
            {
                this.rightArmPose = BipedModel.ArmPose.BOW_AND_ARROW;
            }
            else
            {
                this.leftArmPose = BipedModel.ArmPose.BOW_AND_ARROW;
            }
        }

        super.setLivingAnimations(entityIn, limbSwing, limbSwingAmount, partialTick);
    }

    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch)
    {
        super.setRotationAngles(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        ItemStack itemstack = entityIn.getHeldItemMainhand();

        if (entityIn.isAggressive() && (itemstack.isEmpty() || itemstack.getItem() != Items.BOW))
        {
            float f = MathHelper.sin(this.swingProgress * (float)Math.PI);
            float f1 = MathHelper.sin((1.0F - (1.0F - this.swingProgress) * (1.0F - this.swingProgress)) * (float)Math.PI);
            this.bipedRightArm.rotateAngleZ = 0.0F;
            this.bipedLeftArm.rotateAngleZ = 0.0F;
            this.bipedRightArm.rotateAngleY = -(0.1F - f * 0.6F);
            this.bipedLeftArm.rotateAngleY = 0.1F - f * 0.6F;
            this.bipedRightArm.rotateAngleX = (-(float)Math.PI / 2F);
            this.bipedLeftArm.rotateAngleX = (-(float)Math.PI / 2F);
            this.bipedRightArm.rotateAngleX -= f * 1.2F - f1 * 0.4F;
            this.bipedLeftArm.rotateAngleX -= f * 1.2F - f1 * 0.4F;
            this.bipedRightArm.rotateAngleZ += MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
            this.bipedLeftArm.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
            this.bipedRightArm.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
            this.bipedLeftArm.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        }
    }

    public void translateHand(HandSide sideIn, MatrixStack matrixStackIn)
    {
        float f = sideIn == HandSide.RIGHT ? 1.0F : -1.0F;
        ModelRenderer modelrenderer = this.getArmForSide(sideIn);
        modelrenderer.rotationPointX += f;
        modelrenderer.translateRotate(matrixStackIn);
        modelrenderer.rotationPointX -= f;
    }
}

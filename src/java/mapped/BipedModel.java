package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.HandSide;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

import java.util.function.Function;

public class BipedModel<T extends LivingEntity> extends AgeableModel<T> implements IHasArm, IHasHead {
   public ModelRenderer bipedHead;
   public ModelRenderer bipedHeadwear;
   public ModelRenderer bipedBody;
   public ModelRenderer bipedRightArm;
   public ModelRenderer bipedLeftArm;
   public ModelRenderer bipedRightLeg;
   public ModelRenderer bipedLeftLeg;
   public ArmPose leftArmPose = ArmPose.EMPTY;
   public ArmPose rightArmPose = ArmPose.EMPTY;
   public boolean isSneak;
   public float swimAnimation;

   public BipedModel(float var1) {
      this(RenderType::getEntityCutoutNoCull, var1, 0.0F, 64, 32);
   }

   public BipedModel(float var1, float var2, int var3, int var4) {
      this(RenderType::getEntityCutoutNoCull, var1, var2, var3, var4);
   }

   public BipedModel(Function<ResourceLocation, RenderType> var1, float var2, float var3, int var4, int var5) {
      super(var1, true, 16.0F, 0.0F, 2.0F, 2.0F, 24.0F);
      this.textureWidth = var4;
      this.textureHeight = var5;
      this.bipedHead = new ModelRenderer(this, 0, 0);
      this.bipedHead.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, var2);
      this.bipedHead.setRotationPoint(0.0F, 0.0F + var3, 0.0F);
      this.bipedHeadwear = new ModelRenderer(this, 32, 0);
      this.bipedHeadwear.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, var2 + 0.5F);
      this.bipedHeadwear.setRotationPoint(0.0F, 0.0F + var3, 0.0F);
      this.bipedBody = new ModelRenderer(this, 16, 16);
      this.bipedBody.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, var2);
      this.bipedBody.setRotationPoint(0.0F, 0.0F + var3, 0.0F);
      this.bipedRightArm = new ModelRenderer(this, 40, 16);
      this.bipedRightArm.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var2);
      this.bipedRightArm.setRotationPoint(-5.0F, 2.0F + var3, 0.0F);
      this.bipedLeftArm = new ModelRenderer(this, 40, 16);
      this.bipedLeftArm.mirror = true;
      this.bipedLeftArm.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var2);
      this.bipedLeftArm.setRotationPoint(5.0F, 2.0F + var3, 0.0F);
      this.bipedRightLeg = new ModelRenderer(this, 0, 16);
      this.bipedRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var2);
      this.bipedRightLeg.setRotationPoint(-1.9F, 12.0F + var3, 0.0F);
      this.bipedLeftLeg = new ModelRenderer(this, 0, 16);
      this.bipedLeftLeg.mirror = true;
      this.bipedLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var2);
      this.bipedLeftLeg.setRotationPoint(1.9F, 12.0F + var3, 0.0F);
   }

   @Override
   public Iterable<ModelRenderer> getHeadParts() {
      return ImmutableList.of(this.bipedHead);
   }

   @Override
   public Iterable<ModelRenderer> getBodyParts() {
      return ImmutableList.of(this.bipedBody, this.bipedRightArm, this.bipedLeftArm, this.bipedRightLeg, this.bipedLeftLeg, this.bipedHeadwear);
   }

   public void setLivingAnimations(T var1, float var2, float var3, float var4) {
      this.swimAnimation = var1.getSwimAnimation(var4);
      super.setLivingAnimations(var1, var2, var3, var4);
   }

   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
      boolean var9 = var1.getTicksElytraFlying() > 4;
      boolean var10 = var1.isActualySwimming();
      this.bipedHead.rotateAngleY = var5 * (float) (Math.PI / 180.0);
      if (!var9) {
         if (!(this.swimAnimation > 0.0F)) {
            this.bipedHead.rotateAngleX = var6 * (float) (Math.PI / 180.0);
         } else if (!var10) {
            this.bipedHead.rotateAngleX = this.rotLerpRad(this.swimAnimation, this.bipedHead.rotateAngleX, var6 * (float) (Math.PI / 180.0));
         } else {
            this.bipedHead.rotateAngleX = this.rotLerpRad(this.swimAnimation, this.bipedHead.rotateAngleX, (float) (-Math.PI / 4));
         }
      } else {
         this.bipedHead.rotateAngleX = (float) (-Math.PI / 4);
      }

      this.bipedBody.rotateAngleY = 0.0F;
      this.bipedRightArm.rotationPointZ = 0.0F;
      this.bipedRightArm.rotationPointX = -5.0F;
      this.bipedLeftArm.rotationPointZ = 0.0F;
      this.bipedLeftArm.rotationPointX = 5.0F;
      float var11 = 1.0F;
      if (var9) {
         var11 = (float)var1.getMotion().lengthSquared();
         var11 /= 0.2F;
         var11 = var11 * var11 * var11;
      }

      if (var11 < 1.0F) {
         var11 = 1.0F;
      }

      this.bipedRightArm.rotateAngleX = MathHelper.cos(var2 * 0.6662F + (float) Math.PI) * 2.0F * var3 * 0.5F / var11;
      this.bipedLeftArm.rotateAngleX = MathHelper.cos(var2 * 0.6662F) * 2.0F * var3 * 0.5F / var11;
      this.bipedRightArm.rotateAngleZ = 0.0F;
      this.bipedLeftArm.rotateAngleZ = 0.0F;
      this.bipedRightLeg.rotateAngleX = MathHelper.cos(var2 * 0.6662F) * 1.4F * var3 / var11;
      this.bipedLeftLeg.rotateAngleX = MathHelper.cos(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3 / var11;
      this.bipedRightLeg.rotateAngleY = 0.0F;
      this.bipedLeftLeg.rotateAngleY = 0.0F;
      this.bipedRightLeg.rotateAngleZ = 0.0F;
      this.bipedLeftLeg.rotateAngleZ = 0.0F;
      if (this.isSitting) {
         this.bipedRightArm.rotateAngleX += (float) (-Math.PI / 5);
         this.bipedLeftArm.rotateAngleX += (float) (-Math.PI / 5);
         this.bipedRightLeg.rotateAngleX = -1.4137167F;
         this.bipedRightLeg.rotateAngleY = (float) (Math.PI / 10);
         this.bipedRightLeg.rotateAngleZ = 0.07853982F;
         this.bipedLeftLeg.rotateAngleX = -1.4137167F;
         this.bipedLeftLeg.rotateAngleY = (float) (-Math.PI / 10);
         this.bipedLeftLeg.rotateAngleZ = -0.07853982F;
      }

      this.bipedRightArm.rotateAngleY = 0.0F;
      this.bipedLeftArm.rotateAngleY = 0.0F;
      boolean var12 = var1.getPrimaryHand() == HandSide.RIGHT;
      boolean var13 = !var12 ? this.rightArmPose.func_241657_a_() : this.leftArmPose.func_241657_a_();
      if (var12 == var13) {
         this.func_241654_b_((T)var1);
         this.func_241655_c_((T)var1);
      } else {
         this.func_241655_c_((T)var1);
         this.func_241654_b_((T)var1);
      }

      this.func_230486_a_((T)var1, var4);
      if (!this.isSneak) {
         this.bipedBody.rotateAngleX = 0.0F;
         this.bipedRightLeg.rotationPointZ = 0.1F;
         this.bipedLeftLeg.rotationPointZ = 0.1F;
         this.bipedRightLeg.rotationPointY = 12.0F;
         this.bipedLeftLeg.rotationPointY = 12.0F;
         this.bipedHead.rotationPointY = 0.0F;
         this.bipedBody.rotationPointY = 0.0F;
         this.bipedLeftArm.rotationPointY = 2.0F;
         this.bipedRightArm.rotationPointY = 2.0F;
      } else {
         this.bipedBody.rotateAngleX = 0.5F;
         this.bipedRightArm.rotateAngleX += 0.4F;
         this.bipedLeftArm.rotateAngleX += 0.4F;
         this.bipedRightLeg.rotationPointZ = 4.0F;
         this.bipedLeftLeg.rotationPointZ = 4.0F;
         this.bipedRightLeg.rotationPointY = 12.2F;
         this.bipedLeftLeg.rotationPointY = 12.2F;
         this.bipedHead.rotationPointY = 4.2F;
         this.bipedBody.rotationPointY = 3.2F;
         this.bipedLeftArm.rotationPointY = 5.2F;
         this.bipedRightArm.rotationPointY = 5.2F;
      }

      ModelHelper.func_239101_a_(this.bipedRightArm, this.bipedLeftArm, var4);
      if (this.swimAnimation > 0.0F) {
         float var14 = var2 % 26.0F;
         HandSide var15 = this.getMainHand((T)var1);
         float var16 = var15 == HandSide.RIGHT && this.swingProgress > 0.0F ? 0.0F : this.swimAnimation;
         float var17 = var15 == HandSide.LEFT && this.swingProgress > 0.0F ? 0.0F : this.swimAnimation;
         if (!(var14 < 14.0F)) {
            if (var14 >= 14.0F && var14 < 22.0F) {
               float var22 = (var14 - 14.0F) / 8.0F;
               this.bipedLeftArm.rotateAngleX = this.rotLerpRad(var17, this.bipedLeftArm.rotateAngleX, (float) (Math.PI / 2) * var22);
               this.bipedRightArm.rotateAngleX = MathHelper.lerp(var16, this.bipedRightArm.rotateAngleX, (float) (Math.PI / 2) * var22);
               this.bipedLeftArm.rotateAngleY = this.rotLerpRad(var17, this.bipedLeftArm.rotateAngleY, (float) Math.PI);
               this.bipedRightArm.rotateAngleY = MathHelper.lerp(var16, this.bipedRightArm.rotateAngleY, (float) Math.PI);
               this.bipedLeftArm.rotateAngleZ = this.rotLerpRad(var17, this.bipedLeftArm.rotateAngleZ, 5.012389F - 1.8707964F * var22);
               this.bipedRightArm.rotateAngleZ = MathHelper.lerp(var16, this.bipedRightArm.rotateAngleZ, 1.2707963F + 1.8707964F * var22);
            } else if (var14 >= 22.0F && var14 < 26.0F) {
               float var18 = (var14 - 22.0F) / 4.0F;
               this.bipedLeftArm.rotateAngleX = this.rotLerpRad(var17, this.bipedLeftArm.rotateAngleX, (float) (Math.PI / 2) - (float) (Math.PI / 2) * var18);
               this.bipedRightArm.rotateAngleX = MathHelper.lerp(var16, this.bipedRightArm.rotateAngleX, (float) (Math.PI / 2) - (float) (Math.PI / 2) * var18);
               this.bipedLeftArm.rotateAngleY = this.rotLerpRad(var17, this.bipedLeftArm.rotateAngleY, (float) Math.PI);
               this.bipedRightArm.rotateAngleY = MathHelper.lerp(var16, this.bipedRightArm.rotateAngleY, (float) Math.PI);
               this.bipedLeftArm.rotateAngleZ = this.rotLerpRad(var17, this.bipedLeftArm.rotateAngleZ, (float) Math.PI);
               this.bipedRightArm.rotateAngleZ = MathHelper.lerp(var16, this.bipedRightArm.rotateAngleZ, (float) Math.PI);
            }
         } else {
            this.bipedLeftArm.rotateAngleX = this.rotLerpRad(var17, this.bipedLeftArm.rotateAngleX, 0.0F);
            this.bipedRightArm.rotateAngleX = MathHelper.lerp(var16, this.bipedRightArm.rotateAngleX, 0.0F);
            this.bipedLeftArm.rotateAngleY = this.rotLerpRad(var17, this.bipedLeftArm.rotateAngleY, (float) Math.PI);
            this.bipedRightArm.rotateAngleY = MathHelper.lerp(var16, this.bipedRightArm.rotateAngleY, (float) Math.PI);
            this.bipedLeftArm.rotateAngleZ = this.rotLerpRad(
               var17, this.bipedLeftArm.rotateAngleZ, (float) Math.PI + 1.8707964F * this.getArmAngleSq(var14) / this.getArmAngleSq(14.0F)
            );
            this.bipedRightArm.rotateAngleZ = MathHelper.lerp(
               var16, this.bipedRightArm.rotateAngleZ, (float) Math.PI - 1.8707964F * this.getArmAngleSq(var14) / this.getArmAngleSq(14.0F)
            );
         }

         float var23 = 0.3F;
         float var19 = 0.33333334F;
         this.bipedLeftLeg.rotateAngleX = MathHelper.lerp(
            this.swimAnimation, this.bipedLeftLeg.rotateAngleX, 0.3F * MathHelper.cos(var2 * 0.33333334F + (float) Math.PI)
         );
         this.bipedRightLeg.rotateAngleX = MathHelper.lerp(this.swimAnimation, this.bipedRightLeg.rotateAngleX, 0.3F * MathHelper.cos(var2 * 0.33333334F));
      }

      /* FUCK YOU VIAVERSION !!!! */

      /*if (var1 instanceof Entity) {
         this.bipedRightArm.rotateAngleX = this.bipedRightArm.rotateAngleX * 0.5F - (float) (Math.PI * 3.0 / 10.0);
         this.bipedRightArm.rotateAngleY = (float) (-Math.PI / 6);
      }*/

      this.bipedHeadwear.copyModelAngles(this.bipedHead);
   }

   private void func_241654_b_(T p_241654_1_)
   {
      switch (this.rightArmPose)
      {
         case EMPTY:
            this.bipedRightArm.rotateAngleY = 0.0F;
            break;

         case BLOCK:
            this.bipedRightArm.rotateAngleX = this.bipedRightArm.rotateAngleX * 0.5F - 0.9424779F;
            this.bipedRightArm.rotateAngleY = (-(float)Math.PI / 6F);
            break;

         case ITEM:
            this.bipedRightArm.rotateAngleX = this.bipedRightArm.rotateAngleX * 0.5F - ((float)Math.PI / 10F);
            this.bipedRightArm.rotateAngleY = 0.0F;
            break;

         case THROW_SPEAR:
            this.bipedRightArm.rotateAngleX = this.bipedRightArm.rotateAngleX * 0.5F - (float)Math.PI;
            this.bipedRightArm.rotateAngleY = 0.0F;
            break;

         case BOW_AND_ARROW:
            this.bipedRightArm.rotateAngleY = -0.1F + this.bipedHead.rotateAngleY;
            this.bipedLeftArm.rotateAngleY = 0.1F + this.bipedHead.rotateAngleY + 0.4F;
            this.bipedRightArm.rotateAngleX = (-(float)Math.PI / 2F) + this.bipedHead.rotateAngleX;
            this.bipedLeftArm.rotateAngleX = (-(float)Math.PI / 2F) + this.bipedHead.rotateAngleX;
            break;

         case CROSSBOW_CHARGE:
            ModelHelper.func_239102_a_(this.bipedRightArm, this.bipedLeftArm, p_241654_1_, true);
            break;

         case CROSSBOW_HOLD:
            ModelHelper.func_239104_a_(this.bipedRightArm, this.bipedLeftArm, this.bipedHead, true);
      }
   }

   private void func_241655_c_(T p_241655_1_)
   {
      switch (this.leftArmPose)
      {
         case EMPTY:
            this.bipedLeftArm.rotateAngleY = 0.0F;
            break;

         case BLOCK:
            this.bipedLeftArm.rotateAngleX = this.bipedLeftArm.rotateAngleX * 0.5F - 0.9424779F;
            this.bipedLeftArm.rotateAngleY = ((float)Math.PI / 6F);
            break;

         case ITEM:
            this.bipedLeftArm.rotateAngleX = this.bipedLeftArm.rotateAngleX * 0.5F - ((float)Math.PI / 10F);
            this.bipedLeftArm.rotateAngleY = 0.0F;
            break;

         case THROW_SPEAR:
            this.bipedLeftArm.rotateAngleX = this.bipedLeftArm.rotateAngleX * 0.5F - (float)Math.PI;
            this.bipedLeftArm.rotateAngleY = 0.0F;
            break;

         case BOW_AND_ARROW:
            this.bipedRightArm.rotateAngleY = -0.1F + this.bipedHead.rotateAngleY - 0.4F;
            this.bipedLeftArm.rotateAngleY = 0.1F + this.bipedHead.rotateAngleY;
            this.bipedRightArm.rotateAngleX = (-(float)Math.PI / 2F) + this.bipedHead.rotateAngleX;
            this.bipedLeftArm.rotateAngleX = (-(float)Math.PI / 2F) + this.bipedHead.rotateAngleX;
            break;

         case CROSSBOW_CHARGE:
            ModelHelper.func_239102_a_(this.bipedRightArm, this.bipedLeftArm, p_241655_1_, false);
            break;

         case CROSSBOW_HOLD:
            ModelHelper.func_239104_a_(this.bipedRightArm, this.bipedLeftArm, this.bipedHead, false);
      }
   }

   public void func_230486_a_(T var1, float var2) {
      if (!(this.swingProgress <= 0.0F)) {
         HandSide var5 = this.getMainHand((T)var1);
         ModelRenderer var6 = this.getArmForSide(var5);
         float var7 = this.swingProgress;
         this.bipedBody.rotateAngleY = MathHelper.sin(MathHelper.method37765(var7) * (float) (Math.PI * 2)) * 0.2F;
         if (var5 == HandSide.LEFT) {
            this.bipedBody.rotateAngleY *= -1.0F;
         }

         this.bipedRightArm.rotationPointZ = MathHelper.sin(this.bipedBody.rotateAngleY) * 5.0F;
         this.bipedRightArm.rotationPointX = -MathHelper.cos(this.bipedBody.rotateAngleY) * 5.0F;
         this.bipedLeftArm.rotationPointZ = -MathHelper.sin(this.bipedBody.rotateAngleY) * 5.0F;
         this.bipedLeftArm.rotationPointX = MathHelper.cos(this.bipedBody.rotateAngleY) * 5.0F;
         this.bipedRightArm.rotateAngleY = this.bipedRightArm.rotateAngleY + this.bipedBody.rotateAngleY;
         this.bipedLeftArm.rotateAngleY = this.bipedLeftArm.rotateAngleY + this.bipedBody.rotateAngleY;
         this.bipedLeftArm.rotateAngleX = this.bipedLeftArm.rotateAngleX + this.bipedBody.rotateAngleY;
         var7 = 1.0F - this.swingProgress;
         var7 *= var7;
         var7 *= var7;
         var7 = 1.0F - var7;
         float var8 = MathHelper.sin(var7 * (float) Math.PI);
         float var9 = MathHelper.sin(this.swingProgress * (float) Math.PI) * -(this.bipedHead.rotateAngleX - 0.7F) * 0.75F;
         var6.rotateAngleX = (float)((double)var6.rotateAngleX - ((double)var8 * 1.2 + (double)var9));
         var6.rotateAngleY = var6.rotateAngleY + this.bipedBody.rotateAngleY * 2.0F;
         var6.rotateAngleZ = var6.rotateAngleZ + MathHelper.sin(this.swingProgress * (float) Math.PI) * -0.4F;
      }
   }

   public float rotLerpRad(float var1, float var2, float var3) {
      float var6 = (var3 - var2) % (float) (Math.PI * 2);
      if (var6 < (float) -Math.PI) {
         var6 += (float) (Math.PI * 2);
      }

      if (var6 >= (float) Math.PI) {
         var6 -= (float) (Math.PI * 2);
      }

      return var2 + var1 * var6;
   }

   private float getArmAngleSq(float var1) {
      return -65.0F * var1 + var1 * var1;
   }

   public void setModelAttributes(BipedModel<T> var1) {
      super.copyModelAttributesTo(var1);
      var1.leftArmPose = this.leftArmPose;
      var1.rightArmPose = this.rightArmPose;
      var1.isSneak = this.isSneak;
      var1.bipedHead.copyModelAngles(this.bipedHead);
      var1.bipedHeadwear.copyModelAngles(this.bipedHeadwear);
      var1.bipedBody.copyModelAngles(this.bipedBody);
      var1.bipedRightArm.copyModelAngles(this.bipedRightArm);
      var1.bipedLeftArm.copyModelAngles(this.bipedLeftArm);
      var1.bipedRightLeg.copyModelAngles(this.bipedRightLeg);
      var1.bipedLeftLeg.copyModelAngles(this.bipedLeftLeg);
   }

   public void setVisible(boolean var1) {
      this.bipedHead.showModel = var1;
      this.bipedHeadwear.showModel = var1;
      this.bipedBody.showModel = var1;
      this.bipedRightArm.showModel = var1;
      this.bipedLeftArm.showModel = var1;
      this.bipedRightLeg.showModel = var1;
      this.bipedLeftLeg.showModel = var1;
   }

   @Override
   public void translateHand(HandSide var1, MatrixStack var2) {
      this.getArmForSide(var1).translateRotate(var2);
   }

   public ModelRenderer getArmForSide(HandSide var1) {
      return var1 != HandSide.LEFT ? this.bipedRightArm : this.bipedLeftArm;
   }

   @Override
   public ModelRenderer getModelHead() {
      return this.bipedHead;
   }

   public HandSide getMainHand(T var1) {
      HandSide var4 = var1.getPrimaryHand();
      return var1.swingingHand != Hand.MAIN_HAND ? var4.method8920() : var4;
   }

   public static enum ArmPose
   {
      EMPTY(false),
      ITEM(false),
      BLOCK(false),
      BOW_AND_ARROW(true),
      THROW_SPEAR(false),
      CROSSBOW_CHARGE(true),
      CROSSBOW_HOLD(true);

      private final boolean field_241656_h_;

      private ArmPose(boolean p_i241257_3_)
      {
         this.field_241656_h_ = p_i241257_3_;
      }

      public boolean func_241657_a_()
      {
         return this.field_241656_h_;
      }
   }
}

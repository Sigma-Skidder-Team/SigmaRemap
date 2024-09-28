package mapped;

import net.minecraft.entity.LivingEntity;

public class Class2799<T extends LivingEntity> extends BipedModel<T> {
   private static String[] field17431;
   public boolean field17443;
   public boolean field17444;

   public Class2799(float var1) {
      super(0.0F, -14.0F, 64, 32);
      float var4 = -14.0F;
      this.bipedHeadwear = new ModelRenderer(this, 0, 16);
      this.bipedHeadwear.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, var1 - 0.5F);
      this.bipedHeadwear.setRotationPoint(0.0F, -14.0F, 0.0F);
      this.bipedBody = new ModelRenderer(this, 32, 16);
      this.bipedBody.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, var1);
      this.bipedBody.setRotationPoint(0.0F, -14.0F, 0.0F);
      this.bipedRightArm = new ModelRenderer(this, 56, 0);
      this.bipedRightArm.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 30.0F, 2.0F, var1);
      this.bipedRightArm.setRotationPoint(-3.0F, -12.0F, 0.0F);
      this.bipedLeftArm = new ModelRenderer(this, 56, 0);
      this.bipedLeftArm.mirror = true;
      this.bipedLeftArm.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 30.0F, 2.0F, var1);
      this.bipedLeftArm.setRotationPoint(5.0F, -12.0F, 0.0F);
      this.bipedRightLeg = new ModelRenderer(this, 56, 0);
      this.bipedRightLeg.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 30.0F, 2.0F, var1);
      this.bipedRightLeg.setRotationPoint(-2.0F, -2.0F, 0.0F);
      this.bipedLeftLeg = new ModelRenderer(this, 56, 0);
      this.bipedLeftLeg.mirror = true;
      this.bipedLeftLeg.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 30.0F, 2.0F, var1);
      this.bipedLeftLeg.setRotationPoint(2.0F, -2.0F, 0.0F);
   }

   @Override
   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.setRotationAngles((T)var1, var2, var3, var4, var5, var6);
      this.bipedHead.showModel = true;
      float var9 = -14.0F;
      this.bipedBody.rotateAngleX = 0.0F;
      this.bipedBody.rotationPointY = -14.0F;
      this.bipedBody.rotationPointZ = -0.0F;
      this.bipedRightLeg.rotateAngleX -= 0.0F;
      this.bipedLeftLeg.rotateAngleX -= 0.0F;
      this.bipedRightArm.rotateAngleX = (float)((double)this.bipedRightArm.rotateAngleX * 0.5);
      this.bipedLeftArm.rotateAngleX = (float)((double)this.bipedLeftArm.rotateAngleX * 0.5);
      this.bipedRightLeg.rotateAngleX = (float)((double)this.bipedRightLeg.rotateAngleX * 0.5);
      this.bipedLeftLeg.rotateAngleX = (float)((double)this.bipedLeftLeg.rotateAngleX * 0.5);
      float var10 = 0.4F;
      if (this.bipedRightArm.rotateAngleX > 0.4F) {
         this.bipedRightArm.rotateAngleX = 0.4F;
      }

      if (this.bipedLeftArm.rotateAngleX > 0.4F) {
         this.bipedLeftArm.rotateAngleX = 0.4F;
      }

      if (this.bipedRightArm.rotateAngleX < -0.4F) {
         this.bipedRightArm.rotateAngleX = -0.4F;
      }

      if (this.bipedLeftArm.rotateAngleX < -0.4F) {
         this.bipedLeftArm.rotateAngleX = -0.4F;
      }

      if (this.bipedRightLeg.rotateAngleX > 0.4F) {
         this.bipedRightLeg.rotateAngleX = 0.4F;
      }

      if (this.bipedLeftLeg.rotateAngleX > 0.4F) {
         this.bipedLeftLeg.rotateAngleX = 0.4F;
      }

      if (this.bipedRightLeg.rotateAngleX < -0.4F) {
         this.bipedRightLeg.rotateAngleX = -0.4F;
      }

      if (this.bipedLeftLeg.rotateAngleX < -0.4F) {
         this.bipedLeftLeg.rotateAngleX = -0.4F;
      }

      if (this.field17443) {
         this.bipedRightArm.rotateAngleX = -0.5F;
         this.bipedLeftArm.rotateAngleX = -0.5F;
         this.bipedRightArm.rotateAngleZ = 0.05F;
         this.bipedLeftArm.rotateAngleZ = -0.05F;
      }

      this.bipedRightArm.rotationPointZ = 0.0F;
      this.bipedLeftArm.rotationPointZ = 0.0F;
      this.bipedRightLeg.rotationPointZ = 0.0F;
      this.bipedLeftLeg.rotationPointZ = 0.0F;
      this.bipedRightLeg.rotationPointY = -5.0F;
      this.bipedLeftLeg.rotationPointY = -5.0F;
      this.bipedHead.rotationPointZ = -0.0F;
      this.bipedHead.rotationPointY = -13.0F;
      this.bipedHeadwear.rotationPointX = this.bipedHead.rotationPointX;
      this.bipedHeadwear.rotationPointY = this.bipedHead.rotationPointY;
      this.bipedHeadwear.rotationPointZ = this.bipedHead.rotationPointZ;
      this.bipedHeadwear.rotateAngleX = this.bipedHead.rotateAngleX;
      this.bipedHeadwear.rotateAngleY = this.bipedHead.rotateAngleY;
      this.bipedHeadwear.rotateAngleZ = this.bipedHead.rotateAngleZ;
      if (this.field17444) {
         float var11 = 1.0F;
         this.bipedHead.rotationPointY -= 5.0F;
      }

      float var12 = -14.0F;
      this.bipedRightArm.setRotationPoint(-5.0F, -12.0F, 0.0F);
      this.bipedLeftArm.setRotationPoint(5.0F, -12.0F, 0.0F);
   }
}

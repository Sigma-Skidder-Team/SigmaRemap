package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.util.math.MathHelper;

public class Class2895<T extends MobEntity> extends PlayerModel<T> {
   private static String[] field17927;
   public final ModelRenderer field17928;
   public final ModelRenderer field17929;
   private final ModelRenderer field17930;
   private final ModelRenderer field17931;
   private final ModelRenderer field17932;
   private final ModelRenderer field17933;

   public Class2895(float var1, int var2, int var3) {
      super(var1, false);
      this.textureWidth = var2;
      this.textureHeight = var3;
      this.bipedBody = new ModelRenderer(this, 16, 16);
      this.bipedBody.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, var1);
      this.bipedHead = new ModelRenderer(this);
      this.bipedHead.method22671(0, 0).addBox(-5.0F, -8.0F, -4.0F, 10.0F, 8.0F, 8.0F, var1);
      this.bipedHead.method22671(31, 1).addBox(-2.0F, -4.0F, -5.0F, 4.0F, 4.0F, 1.0F, var1);
      this.bipedHead.method22671(2, 4).addBox(2.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, var1);
      this.bipedHead.method22671(2, 0).addBox(-3.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, var1);
      this.field17928 = new ModelRenderer(this);
      this.field17928.setRotationPoint(4.5F, -6.0F, 0.0F);
      this.field17928.method22671(51, 6).addBox(0.0F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, var1);
      this.bipedHead.method22670(this.field17928);
      this.field17929 = new ModelRenderer(this);
      this.field17929.setRotationPoint(-4.5F, -6.0F, 0.0F);
      this.field17929.method22671(39, 6).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, var1);
      this.bipedHead.method22670(this.field17929);
      this.bipedHeadwear = new ModelRenderer(this);
      this.field17930 = this.bipedBody.method22668();
      this.field17931 = this.bipedHead.method22668();
      this.field17932 = this.bipedLeftArm.method22668();
      this.field17933 = this.bipedLeftArm.method22668();
   }

   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.bipedBody.copyModelAngles(this.field17930);
      this.bipedHead.copyModelAngles(this.field17931);
      this.bipedLeftArm.copyModelAngles(this.field17932);
      this.bipedRightArm.copyModelAngles(this.field17933);
      super.setRotationAngles((T)var1, var2, var3, var4, var5, var6);
      float var9 = (float) (Math.PI / 6);
      float var10 = var4 * 0.1F + var2 * 0.5F;
      float var11 = 0.08F + var3 * 0.4F;
      this.field17928.rotateAngleZ = (float) (-Math.PI / 6) - MathHelper.cos(var10 * 1.2F) * var11;
      this.field17929.rotateAngleZ = (float) (Math.PI / 6) + MathHelper.cos(var10) * var11;
      if (!(var1 instanceof Class1035)) {
         if (var1.getType() == EntityType.ZOMBIFIED_PIGLIN) {
            ModelHelper.method27109(this.bipedLeftArm, this.bipedRightArm, var1.method4307(), this.swingProgress, var4);
         }
      } else {
         Class1035 var12 = (Class1035)var1;
         Class2172 var13 = var12.method4622();
         if (var13 != Class2172.field14263) {
            if (var13 == Class2172.field14259 && this.swingProgress == 0.0F) {
               this.method11211((T)var1);
            } else if (var13 != Class2172.field14260) {
               if (var13 != Class2172.field14261) {
                  if (var13 == Class2172.field14262) {
                     this.bipedHead.rotateAngleX = 0.5F;
                     this.bipedHead.rotateAngleY = 0.0F;
                     if (!var1.method4306()) {
                        this.bipedLeftArm.rotateAngleY = 0.5F;
                        this.bipedLeftArm.rotateAngleX = -0.9F;
                     } else {
                        this.bipedRightArm.rotateAngleY = -0.5F;
                        this.bipedRightArm.rotateAngleX = -0.9F;
                     }
                  }
               } else {
                  ModelHelper.func_239102_a_(this.bipedRightArm, this.bipedLeftArm, var1, !var1.method4306());
               }
            } else {
               ModelHelper.func_239104_a_(this.bipedRightArm, this.bipedLeftArm, this.bipedHead, !var1.method4306());
            }
         } else {
            float var14 = var4 / 60.0F;
            this.field17929.rotateAngleZ = (float) (Math.PI / 6) + (float) (Math.PI / 180.0) * MathHelper.sin(var14 * 30.0F) * 10.0F;
            this.field17928.rotateAngleZ = (float) (-Math.PI / 6) - (float) (Math.PI / 180.0) * MathHelper.cos(var14 * 30.0F) * 10.0F;
            this.bipedHead.rotationPointX = MathHelper.sin(var14 * 10.0F);
            this.bipedHead.rotationPointY = MathHelper.sin(var14 * 40.0F) + 0.4F;
            this.bipedRightArm.rotateAngleZ = (float) (Math.PI / 180.0) * (70.0F + MathHelper.cos(var14 * 40.0F) * 10.0F);
            this.bipedLeftArm.rotateAngleZ = this.bipedRightArm.rotateAngleZ * -1.0F;
            this.bipedRightArm.rotationPointY = MathHelper.sin(var14 * 40.0F) * 0.5F + 1.5F;
            this.bipedLeftArm.rotationPointY = MathHelper.sin(var14 * 40.0F) * 0.5F + 1.5F;
            this.bipedBody.rotationPointY = MathHelper.sin(var14 * 40.0F) * 0.35F;
         }
      }

      this.bipedLeftLegwear.copyModelAngles(this.bipedLeftLeg);
      this.bipedRightLegwear.copyModelAngles(this.bipedRightLeg);
      this.bipedLeftArmwear.copyModelAngles(this.bipedLeftArm);
      this.bipedRightArmwear.copyModelAngles(this.bipedRightArm);
      this.bipedBodyWear.copyModelAngles(this.bipedBody);
      this.bipedHeadwear.copyModelAngles(this.bipedHead);
   }

   public void func_230486_a_(T var1, float var2) {
      if (this.swingProgress > 0.0F && var1 instanceof Class1034 && ((Class1034)var1).method4622() == Class2172.field14259) {
         ModelHelper.method27107(this.bipedRightArm, this.bipedLeftArm, var1, this.swingProgress, var2);
      } else {
         super.func_230486_a_((T)var1, var2);
      }
   }

   private void method11211(T var1) {
      if (!var1.method4306()) {
         this.bipedRightArm.rotateAngleX = -1.8F;
      } else {
         this.bipedLeftArm.rotateAngleX = -1.8F;
      }
   }
}

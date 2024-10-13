package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.HandSide;
import net.minecraft.util.math.MathHelper;

public class Class2893 extends Class2892 {
   private static String[] field17913;
   private final ModelRenderer field17914;
   private final ModelRenderer field17915;
   private final ModelRenderer field17916;
   private final ModelRenderer field17917;

   public Class2893() {
      this(0.0F);
   }

   public Class2893(float var1) {
      super(var1, 64, 64);
      this.bipedHead = new ModelRenderer(this, 0, 0);
      this.bipedHead.addBox(-1.0F, -7.0F, -1.0F, 2.0F, 7.0F, 2.0F, var1);
      this.bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
      this.bipedBody = new ModelRenderer(this, 0, 26);
      this.bipedBody.addBox(-6.0F, 0.0F, -1.5F, 12.0F, 3.0F, 3.0F, var1);
      this.bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
      this.bipedRightArm = new ModelRenderer(this, 24, 0);
      this.bipedRightArm.addBox(-2.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, var1);
      this.bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
      this.bipedLeftArm = new ModelRenderer(this, 32, 16);
      this.bipedLeftArm.mirror = true;
      this.bipedLeftArm.addBox(0.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, var1);
      this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
      this.bipedRightLeg = new ModelRenderer(this, 8, 0);
      this.bipedRightLeg.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, var1);
      this.bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
      this.bipedLeftLeg = new ModelRenderer(this, 40, 16);
      this.bipedLeftLeg.mirror = true;
      this.bipedLeftLeg.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, var1);
      this.bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
      this.field17914 = new ModelRenderer(this, 16, 0);
      this.field17914.addBox(-3.0F, 3.0F, -1.0F, 2.0F, 7.0F, 2.0F, var1);
      this.field17914.setRotationPoint(0.0F, 0.0F, 0.0F);
      this.field17914.showModel = true;
      this.field17915 = new ModelRenderer(this, 48, 16);
      this.field17915.addBox(1.0F, 3.0F, -1.0F, 2.0F, 7.0F, 2.0F, var1);
      this.field17915.setRotationPoint(0.0F, 0.0F, 0.0F);
      this.field17916 = new ModelRenderer(this, 0, 48);
      this.field17916.addBox(-4.0F, 10.0F, -1.0F, 8.0F, 2.0F, 2.0F, var1);
      this.field17916.setRotationPoint(0.0F, 0.0F, 0.0F);
      this.field17917 = new ModelRenderer(this, 0, 32);
      this.field17917.addBox(-6.0F, 11.0F, -6.0F, 12.0F, 1.0F, 12.0F, var1);
      this.field17917.setRotationPoint(0.0F, 12.0F, 0.0F);
      this.bipedHeadwear.showModel = false;
   }

   public void setLivingAnimations(ArmorStandEntity var1, float var2, float var3, float var4) {
      this.field17917.rotateAngleX = 0.0F;
      this.field17917.rotateAngleY = (float) (Math.PI / 180.0) * -MathHelper.method37827(var4, var1.prevRotationYaw, var1.rotationYaw);
      this.field17917.rotateAngleZ = 0.0F;
   }

   @Override
   public void setRotationAngles(ArmorStandEntity var1, float var2, float var3, float var4, float var5, float var6) {
      super.setRotationAngles(var1, var2, var3, var4, var5, var6);
      this.bipedLeftArm.showModel = var1.method4199();
      this.bipedRightArm.showModel = var1.method4199();
      this.field17917.showModel = !var1.method4201();
      this.bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
      this.bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
      this.field17914.rotateAngleX = (float) (Math.PI / 180.0) * var1.method4212().method22013();
      this.field17914.rotateAngleY = (float) (Math.PI / 180.0) * var1.method4212().method22014();
      this.field17914.rotateAngleZ = (float) (Math.PI / 180.0) * var1.method4212().method22015();
      this.field17915.rotateAngleX = (float) (Math.PI / 180.0) * var1.method4212().method22013();
      this.field17915.rotateAngleY = (float) (Math.PI / 180.0) * var1.method4212().method22014();
      this.field17915.rotateAngleZ = (float) (Math.PI / 180.0) * var1.method4212().method22015();
      this.field17916.rotateAngleX = (float) (Math.PI / 180.0) * var1.method4212().method22013();
      this.field17916.rotateAngleY = (float) (Math.PI / 180.0) * var1.method4212().method22014();
      this.field17916.rotateAngleZ = (float) (Math.PI / 180.0) * var1.method4212().method22015();
   }

   @Override
   public Iterable<ModelRenderer> getBodyParts() {
      return Iterables.concat(super.getBodyParts(), ImmutableList.of(this.field17914, this.field17915, this.field17916, this.field17917));
   }

   @Override
   public void translateHand(HandSide var1, MatrixStack var2) {
      ModelRenderer var5 = this.getArmForSide(var1);
      boolean var6 = var5.showModel;
      var5.showModel = true;
      super.translateHand(var1, var2);
      var5.showModel = var6;
   }
}

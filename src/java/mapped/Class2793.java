package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.HandSide;
import net.minecraft.util.math.MathHelper;

public class Class2793<T extends ZombieEntity> extends Class2794<T> {
   private static String[] field17428;

   public Class2793(float var1, float var2, int var3, int var4) {
      super(var1, var2, var3, var4);
      this.bipedRightArm = new ModelRenderer(this, 32, 48);
      this.bipedRightArm.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      this.bipedRightArm.setRotationPoint(-5.0F, 2.0F + var2, 0.0F);
      this.bipedRightLeg = new ModelRenderer(this, 16, 48);
      this.bipedRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      this.bipedRightLeg.setRotationPoint(-1.9F, 12.0F + var2, 0.0F);
   }

   public Class2793(float var1, boolean var2) {
      super(var1, 0.0F, 64, !var2 ? 64 : 32);
   }

   public void setLivingAnimations(T var1, float var2, float var3, float var4) {
      this.rightArmPose = ArmPose.EMPTY;
      this.leftArmPose = ArmPose.EMPTY;
      ItemStack var7 = var1.getHeldItem(Hand.MAIN_HAND);
      if (var7.getItem() == Items.field38144 && var1.method4307()) {
         if (var1.getPrimaryHand() != HandSide.RIGHT) {
            this.leftArmPose = ArmPose.THROW_SPEAR;
         } else {
            this.rightArmPose = ArmPose.THROW_SPEAR;
         }
      }

      super.setLivingAnimations((T)var1, var2, var3, var4);
   }

   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.setRotationAngles((T)var1, var2, var3, var4, var5, var6);
      if (this.leftArmPose == ArmPose.THROW_SPEAR) {
         this.bipedLeftArm.rotateAngleX = this.bipedLeftArm.rotateAngleX * 0.5F - (float) Math.PI;
         this.bipedLeftArm.rotateAngleY = 0.0F;
      }

      if (this.rightArmPose == ArmPose.THROW_SPEAR) {
         this.bipedRightArm.rotateAngleX = this.bipedRightArm.rotateAngleX * 0.5F - (float) Math.PI;
         this.bipedRightArm.rotateAngleY = 0.0F;
      }

      if (this.swimAnimation > 0.0F) {
         this.bipedRightArm.rotateAngleX = this.rotLerpRad(this.swimAnimation, this.bipedRightArm.rotateAngleX, (float) (-Math.PI * 4.0 / 5.0))
            + this.swimAnimation * 0.35F * MathHelper.sin(0.1F * var4);
         this.bipedLeftArm.rotateAngleX = this.rotLerpRad(this.swimAnimation, this.bipedLeftArm.rotateAngleX, (float) (-Math.PI * 4.0 / 5.0))
            - this.swimAnimation * 0.35F * MathHelper.sin(0.1F * var4);
         this.bipedRightArm.rotateAngleZ = this.rotLerpRad(this.swimAnimation, this.bipedRightArm.rotateAngleZ, -0.15F);
         this.bipedLeftArm.rotateAngleZ = this.rotLerpRad(this.swimAnimation, this.bipedLeftArm.rotateAngleZ, 0.15F);
         this.bipedLeftLeg.rotateAngleX = this.bipedLeftLeg.rotateAngleX - this.swimAnimation * 0.55F * MathHelper.sin(0.1F * var4);
         this.bipedRightLeg.rotateAngleX = this.bipedRightLeg.rotateAngleX + this.swimAnimation * 0.55F * MathHelper.sin(0.1F * var4);
         this.bipedHead.rotateAngleX = 0.0F;
      }
   }
}

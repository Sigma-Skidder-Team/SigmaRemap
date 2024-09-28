package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.HandSide;
import net.minecraft.util.math.MathHelper;

public class Class2798<T extends MobEntity & Class1022> extends BipedModel<T> {
   private static String[] field17431;

   public Class2798() {
      this(0.0F, false);
   }

   public Class2798(float var1, boolean var2) {
      super(var1);
      if (!var2) {
         this.bipedRightArm = new ModelRenderer(this, 40, 16);
         this.bipedRightArm.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, var1);
         this.bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
         this.bipedLeftArm = new ModelRenderer(this, 40, 16);
         this.bipedLeftArm.mirror = true;
         this.bipedLeftArm.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, var1);
         this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
         this.bipedRightLeg = new ModelRenderer(this, 0, 16);
         this.bipedRightLeg.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, var1);
         this.bipedRightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
         this.bipedLeftLeg = new ModelRenderer(this, 0, 16);
         this.bipedLeftLeg.mirror = true;
         this.bipedLeftLeg.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, var1);
         this.bipedLeftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
      }
   }

   public void setLivingAnimations(T var1, float var2, float var3, float var4) {
      this.rightArmPose = ArmPose.EMPTY;
      this.leftArmPose = ArmPose.EMPTY;
      ItemStack var7 = var1.getHeldItem(Hand.MAIN_HAND);
      if (var7.getItem() == Items.BOW && var1.method4307()) {
         if (var1.getPrimaryHand() != HandSide.RIGHT) {
            this.leftArmPose = ArmPose.BOW_AND_ARROW;
         } else {
            this.rightArmPose = ArmPose.BOW_AND_ARROW;
         }
      }

      super.setLivingAnimations((T)var1, var2, var3, var4);
   }

   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.setRotationAngles((T)var1, var2, var3, var4, var5, var6);
      ItemStack var9 = var1.getHeldItemMainhand();
      if (var1.method4307() && (var9.isEmpty() || var9.getItem() != Items.BOW)) {
         float var10 = MathHelper.sin(this.swingProgress * (float) Math.PI);
         float var11 = MathHelper.sin((1.0F - (1.0F - this.swingProgress) * (1.0F - this.swingProgress)) * (float) Math.PI);
         this.bipedRightArm.rotateAngleZ = 0.0F;
         this.bipedLeftArm.rotateAngleZ = 0.0F;
         this.bipedRightArm.rotateAngleY = -(0.1F - var10 * 0.6F);
         this.bipedLeftArm.rotateAngleY = 0.1F - var10 * 0.6F;
         this.bipedRightArm.rotateAngleX = (float) (-Math.PI / 2);
         this.bipedLeftArm.rotateAngleX = (float) (-Math.PI / 2);
         this.bipedRightArm.rotateAngleX -= var10 * 1.2F - var11 * 0.4F;
         this.bipedLeftArm.rotateAngleX -= var10 * 1.2F - var11 * 0.4F;
         ModelHelper.func_239101_a_(this.bipedRightArm, this.bipedLeftArm, var4);
      }
   }

   @Override
   public void translateHand(HandSide var1, MatrixStack var2) {
      float var5 = var1 != HandSide.RIGHT ? -1.0F : 1.0F;
      ModelRenderer var6 = this.getArmForSide(var1);
      var6.rotationPointX += var5;
      var6.translateRotate(var2);
      var6.rotationPointX -= var5;
   }
}

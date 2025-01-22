package net.minecraft.client.renderer.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import mapped.*;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.UseAction;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.Hand;
import net.minecraft.util.HandSide;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class PlayerRenderer extends LivingRenderer<AbstractClientPlayerEntity, PlayerModel<AbstractClientPlayerEntity>> {
   public PlayerRenderer(EntityRendererManager var1) {
      this(var1, false);
   }

   public PlayerRenderer(EntityRendererManager var1, boolean useSmallArms) {
      super(var1, new PlayerModel<>(0.0F, useSmallArms), 0.5F);
      this.addLayer(new BipedArmorLayer(this, new BipedModel(0.5F), new BipedModel(1.0F)));
      this.addLayer(new Class242<>(this));
      this.addLayer(new Class232<>(this));
      this.addLayer(new Class252(this));
      this.addLayer(new Class234(this));
      this.addLayer(new Class235<>(this));
      this.addLayer(new Class220<>(this));
      this.addLayer(new Class250<>(this));
      this.addLayer(new Class261<>(this));
      this.addLayer(new Class233<>(this));
   }

   public void render(AbstractClientPlayerEntity entityIn, float var2, float partialTicks, MatrixStack matrixStackIn, Class7733 var5, int var6) {
      this.setModelVisibilities(entityIn);
      super.render(entityIn, var2, partialTicks, matrixStackIn, var5, var6);
   }

   public Vector3d getRenderOffset(AbstractClientPlayerEntity var1, float var2) {
      return !var1.isCrouching() ? super.getRenderOffset(var1, var2) : new Vector3d(0.0, -0.125, 0.0);
   }

   private void setModelVisibilities(AbstractClientPlayerEntity var1) {
      PlayerModel<AbstractClientPlayerEntity> var4 = this.getEntityModel();

      if (!var1.isSpectator()) {
         var4.setVisible(true);
         var4.bipedHeadwear.showModel = var1.method2962(Class2318.field15885);
         var4.bipedBodyWear.showModel = var1.method2962(Class2318.field15880);
         var4.bipedLeftLegwear.showModel = var1.method2962(Class2318.field15883);
         var4.bipedRightLegwear.showModel = var1.method2962(Class2318.field15884);
         var4.bipedLeftArmwear.showModel = var1.method2962(Class2318.field15881);
         var4.bipedRightArmwear.showModel = var1.method2962(Class2318.field15882);
         var4.isSneak = var1.isCrouching();
         BipedModel.ArmPose var5 = getPlayerArmPose(var1, Hand.MAIN_HAND);
         BipedModel.ArmPose var6 = getPlayerArmPose(var1, Hand.OFF_HAND);
         if (var5.func_241657_a_()) {
            var6 = var1.getHeldItemOffhand().isEmpty() ? BipedModel.ArmPose.EMPTY : BipedModel.ArmPose.ITEM;
         }

         if (var1.getPrimaryHand() != HandSide.RIGHT) {
            var4.rightArmPose = var6;
            var4.leftArmPose = var5;
         } else {
            var4.rightArmPose = var5;
            var4.leftArmPose = var6;
         }
      } else {
         var4.setVisible(false);
         var4.bipedHead.showModel = true;
         var4.bipedHeadwear.showModel = true;
      }
   }

   /* Originally "func_241741_a_" but that sounds like shit */
   private static BipedModel.ArmPose getPlayerArmPose(AbstractClientPlayerEntity p_241741_0_, Hand p_241741_1_)
   {
      ItemStack itemstack = p_241741_0_.getHeldItem(p_241741_1_);

      if (itemstack.isEmpty())
      {
         return BipedModel.ArmPose.EMPTY;
      }
      else
      {
         if (p_241741_0_.getActiveHand() == p_241741_1_ && p_241741_0_.getItemInUseCount() > 0)
         {
            UseAction useaction = itemstack.getUseAction();

            if (useaction == UseAction.BLOCK)
            {
               return BipedModel.ArmPose.BLOCK;
            }

            if (useaction == UseAction.BOW)
            {
               return BipedModel.ArmPose.BOW_AND_ARROW;
            }

            if (useaction == UseAction.SPEAR)
            {
               return BipedModel.ArmPose.THROW_SPEAR;
            }

            if (useaction == UseAction.CROSSBOW && p_241741_1_ == p_241741_0_.getActiveHand())
            {
               return BipedModel.ArmPose.CROSSBOW_CHARGE;
            }
         }
         else if (!p_241741_0_.isSwingInProgress && itemstack.getItem() == Items.CROSSBOW && CrossbowItem.isCharged(itemstack))
         {
            return BipedModel.ArmPose.CROSSBOW_HOLD;
         }

         return BipedModel.ArmPose.ITEM;
      }
   }

   public ResourceLocation method17843(AbstractClientPlayerEntity var1) {
      return var1.method5371();
   }

   public void method17857(AbstractClientPlayerEntity var1, MatrixStack var2, float var3) {
      float var6 = 0.9375F;
      var2.scale(0.9375F, 0.9375F, 0.9375F);
   }

   public void method17893(AbstractClientPlayerEntity var1, ITextComponent var2, MatrixStack var3, Class7733 var4, int var5) {
      double var8 = this.field25097.method32228(var1);
      var3.push();
      if (var8 < 100.0) {
         Scoreboard var10 = var1.method2953();
         ScoreObjective var11 = var10.getObjectiveInDisplaySlot(2);
         if (var11 != null) {
            Score var12 = var10.method20980(var1.getScoreboardName(), var11);
            super.method17893(
               var1, new StringTextComponent(Integer.toString(var12.getScorePoints())).appendString(" ").append(var11.method29338()), var3, var4, var5
            );
            var3.translate(0.0, 0.25875F, 0.0);
         }
      }

      super.method17893(var1, var2, var3, var4, var5);
      var3.pop();
   }

   public void method17890(MatrixStack var1, Class7733 var2, int var3, AbstractClientPlayerEntity var4) {
      this.method17892(var1, var2, var3, var4, this.entityModel.bipedRightArm, this.entityModel.bipedRightArmwear);
   }

   public void method17891(MatrixStack var1, Class7733 var2, int var3, AbstractClientPlayerEntity var4) {
      this.method17892(var1, var2, var3, var4, this.entityModel.bipedLeftArm, this.entityModel.bipedLeftArmwear);
   }

   private void method17892(MatrixStack var1, Class7733 var2, int var3, AbstractClientPlayerEntity var4, ModelRenderer var5, ModelRenderer var6) {
      PlayerModel var9 = this.getEntityModel();
      this.setModelVisibilities(var4);
      var9.swingProgress = 0.0F;
      var9.isSneak = false;
      var9.swimAnimation = 0.0F;
      var9.setRotationAngles(var4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      var5.rotateAngleX = 0.0F;
      var5.render(var1, var2.method25597(RenderType.getEntitySolid(var4.method5371())), var3, OverlayTexture.NO_OVERLAY);
      var6.rotateAngleX = 0.0F;
      var6.render(var1, var2.method25597(RenderType.getEntityTranslucent(var4.method5371())), var3, OverlayTexture.NO_OVERLAY);
   }

   public void method17842(AbstractClientPlayerEntity var1, MatrixStack var2, float var3, float var4, float var5) {
      float var8 = var1.getSwimAnimation(var5);
      if (!var1.isElytraFlying()) {
         if (!(var8 > 0.0F)) {
            super.method17842(var1, var2, var3, var4, var5);
         } else {
            super.method17842(var1, var2, var3, var4, var5);
            float var9 = !var1.isInWater() ? -90.0F : -90.0F - var1.rotationPitch;
            float var10 = MathHelper.lerp(var8, 0.0F, var9);
            var2.rotate(Vector3f.XP.rotationDegrees(var10));
            if (var1.isActualySwimming()) {
               var2.translate(0.0, -1.0, 0.3F);
            }
         }
      } else {
         super.method17842(var1, var2, var3, var4, var5);
         float var21 = (float)var1.getTicksElytraFlying() + var5;
         float var22 = MathHelper.clamp(var21 * var21 / 100.0F, 0.0F, 1.0F);
         if (!var1.isSpinAttacking()) {
            var2.rotate(Vector3f.XP.rotationDegrees(var22 * (-90.0F - var1.rotationPitch)));
         }

         Vector3d var11 = var1.getLook(var5);
         Vector3d var12 = var1.getMotion();
         double var13 = Entity.horizontalMag(var12);
         double var15 = Entity.horizontalMag(var11);
         if (var13 > 0.0 && var15 > 0.0) {
            double var17 = (var12.x * var11.x + var12.z * var11.z) / Math.sqrt(var13 * var15);
            double var19 = var12.x * var11.z - var12.z * var11.x;
            var2.rotate(Vector3f.YP.method25285((float)(Math.signum(var19) * Math.acos(var17))));
         }
      }
   }
}

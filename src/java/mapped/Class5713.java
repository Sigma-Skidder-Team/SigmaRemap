package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.Hand;
import net.minecraft.util.HandSide;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class Class5713 extends Class5712<AbstractClientPlayerEntity, Class2894<AbstractClientPlayerEntity>> {
   public Class5713(EntityRendererManager var1) {
      this(var1, false);
   }

   public Class5713(EntityRendererManager var1, boolean var2) {
      super(var1, new Class2894<AbstractClientPlayerEntity>(0.0F, var2), 0.5F);
      this.method17880(new Class255(this, new Class2797(0.5F), new Class2797(1.0F)));
      this.method17880(new Class242<AbstractClientPlayerEntity, Class2894<AbstractClientPlayerEntity>>(this));
      this.method17880(new Class232<AbstractClientPlayerEntity, Class2894<AbstractClientPlayerEntity>>(this));
      this.method17880(new Class252(this));
      this.method17880(new Class234(this));
      this.method17880(new Class235<AbstractClientPlayerEntity, Class2894<AbstractClientPlayerEntity>>(this));
      this.method17880(new Class220<AbstractClientPlayerEntity, Class2894<AbstractClientPlayerEntity>>(this));
      this.method17880(new Class250<AbstractClientPlayerEntity>(this));
      this.method17880(new Class261<AbstractClientPlayerEntity>(this));
      this.method17880(new Class233<AbstractClientPlayerEntity, Class2894<AbstractClientPlayerEntity>>(this));
   }

   public void method17853(AbstractClientPlayerEntity var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      this.method17887(var1);
      super.method17853(var1, var2, var3, var4, var5, var6);
   }

   public Vector3d method17867(AbstractClientPlayerEntity var1, float var2) {
      return !var1.method3336() ? super.method17867(var1, var2) : new Vector3d(0.0, -0.125, 0.0);
   }

   private void method17887(AbstractClientPlayerEntity var1) {
      Class2894 var4 = this.method17881();
      if (!var1.isSpectator()) {
         var4.method11009(true);
         var4.field17433.field31039 = var1.method2962(Class2318.field15885);
         var4.field17923.field31039 = var1.method2962(Class2318.field15880);
         var4.field17921.field31039 = var1.method2962(Class2318.field15883);
         var4.field17922.field31039 = var1.method2962(Class2318.field15884);
         var4.field17919.field31039 = var1.method2962(Class2318.field15881);
         var4.field17920.field31039 = var1.method2962(Class2318.field15882);
         var4.field17441 = var1.method3336();
         Class2278 var5 = method17888(var1, Hand.MAIN_HAND);
         Class2278 var6 = method17888(var1, Hand.field183);
         if (var5.method9003()) {
            var6 = !var1.method3091().isEmpty() ? Class2278.field14837 : Class2278.field14836;
         }

         if (var1.getPrimaryHand() != HandSide.field14418) {
            var4.field17440 = var6;
            var4.field17439 = var5;
         } else {
            var4.field17440 = var5;
            var4.field17439 = var6;
         }
      } else {
         var4.method11009(false);
         var4.field17432.field31039 = true;
         var4.field17433.field31039 = true;
      }
   }

   private static Class2278 method17888(AbstractClientPlayerEntity var0, Hand var1) {
      ItemStack var4 = var0.getHeldItem(var1);
      if (var4.isEmpty()) {
         return Class2278.field14836;
      } else {
         if (var0.getActiveHand() == var1 && var0.getItemInUseCount() > 0) {
            Class2103 var5 = var4.method32138();
            if (var5 == Class2103.field13709) {
               return Class2278.field14838;
            }

            if (var5 == Class2103.field13710) {
               return Class2278.field14839;
            }

            if (var5 == Class2103.field13711) {
               return Class2278.field14840;
            }

            if (var5 == Class2103.field13712 && var1 == var0.getActiveHand()) {
               return Class2278.field14841;
            }
         } else if (!var0.isSwingInProgress && var4.getItem() == Items.field38148 && Class3261.method11755(var4)) {
            return Class2278.field14842;
         }

         return Class2278.field14837;
      }
   }

   public ResourceLocation method17843(AbstractClientPlayerEntity var1) {
      return var1.method5371();
   }

   public void method17857(AbstractClientPlayerEntity var1, MatrixStack var2, float var3) {
      float var6 = 0.9375F;
      var2.method35292(0.9375F, 0.9375F, 0.9375F);
   }

   public void method17893(AbstractClientPlayerEntity var1, ITextComponent var2, MatrixStack var3, Class7733 var4, int var5) {
      double var8 = this.field25097.method32228(var1);
      var3.push();
      if (var8 < 100.0) {
         Scoreboard var10 = var1.method2953();
         Class8375 var11 = var10.method20989(2);
         if (var11 != null) {
            Class9411 var12 = var10.method20980(var1.method2956(), var11);
            super.method17893(
               var1, new StringTextComponent(Integer.toString(var12.method36050())).appendString(" ").append(var11.method29338()), var3, var4, var5
            );
            var3.translate(0.0, 0.25875F, 0.0);
         }
      }

      super.method17893(var1, var2, var3, var4, var5);
      var3.pop();
   }

   public void method17890(MatrixStack var1, Class7733 var2, int var3, AbstractClientPlayerEntity var4) {
      this.method17892(var1, var2, var3, var4, this.field25086.field17435, this.field25086.field17920);
   }

   public void method17891(MatrixStack var1, Class7733 var2, int var3, AbstractClientPlayerEntity var4) {
      this.method17892(var1, var2, var3, var4, this.field25086.field17436, this.field25086.field17919);
   }

   private void method17892(MatrixStack var1, Class7733 var2, int var3, AbstractClientPlayerEntity var4, Class7219 var5, Class7219 var6) {
      Class2894 var9 = this.method17881();
      this.method17887(var4);
      var9.field17600 = 0.0F;
      var9.field17441 = false;
      var9.field17442 = 0.0F;
      var9.method10998(var4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      var5.field31035 = 0.0F;
      var5.method22680(var1, var2.method25597(RenderType.getEntitySolid(var4.method5371())), var3, Class213.field798);
      var6.field31035 = 0.0F;
      var6.method22680(var1, var2.method25597(RenderType.method14318(var4.method5371())), var3, Class213.field798);
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
            var2.rotate(Vector3f.field32898.rotationDegrees(var10));
            if (var1.isActualySwimming()) {
               var2.translate(0.0, -1.0, 0.3F);
            }
         }
      } else {
         super.method17842(var1, var2, var3, var4, var5);
         float var21 = (float)var1.getTicksElytraFlying() + var5;
         float var22 = MathHelper.clamp(var21 * var21 / 100.0F, 0.0F, 1.0F);
         if (!var1.isSpinAttacking()) {
            var2.rotate(Vector3f.field32898.rotationDegrees(var22 * (-90.0F - var1.rotationPitch)));
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

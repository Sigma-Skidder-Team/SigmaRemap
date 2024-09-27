package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.util.Hand;
import net.minecraft.util.HandSide;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

import java.util.function.Function;

public class Class2797<T extends LivingEntity> extends Class2855<T> implements Class2825, Class2824 {
   private static String[] field17431;
   public Class7219 field17432;
   public Class7219 field17433;
   public Class7219 field17434;
   public Class7219 field17435;
   public Class7219 field17436;
   public Class7219 field17437;
   public Class7219 field17438;
   public Class2278 field17439 = Class2278.field14836;
   public Class2278 field17440 = Class2278.field14836;
   public boolean field17441;
   public float field17442;

   public Class2797(float var1) {
      this(RenderType::getEntityCutoutNoCull, var1, 0.0F, 64, 32);
   }

   public Class2797(float var1, float var2, int var3, int var4) {
      this(RenderType::getEntityCutoutNoCull, var1, var2, var3, var4);
   }

   public Class2797(Function<ResourceLocation, RenderType> var1, float var2, float var3, int var4, int var5) {
      super(var1, true, 16.0F, 0.0F, 2.0F, 2.0F, 24.0F);
      this.field17604 = var4;
      this.field17605 = var5;
      this.field17432 = new Class7219(this, 0, 0);
      this.field17432.method22675(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, var2);
      this.field17432.method22679(0.0F, 0.0F + var3, 0.0F);
      this.field17433 = new Class7219(this, 32, 0);
      this.field17433.method22675(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, var2 + 0.5F);
      this.field17433.method22679(0.0F, 0.0F + var3, 0.0F);
      this.field17434 = new Class7219(this, 16, 16);
      this.field17434.method22675(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, var2);
      this.field17434.method22679(0.0F, 0.0F + var3, 0.0F);
      this.field17435 = new Class7219(this, 40, 16);
      this.field17435.method22675(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var2);
      this.field17435.method22679(-5.0F, 2.0F + var3, 0.0F);
      this.field17436 = new Class7219(this, 40, 16);
      this.field17436.field31038 = true;
      this.field17436.method22675(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var2);
      this.field17436.method22679(5.0F, 2.0F + var3, 0.0F);
      this.field17437 = new Class7219(this, 0, 16);
      this.field17437.method22675(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var2);
      this.field17437.method22679(-1.9F, 12.0F + var3, 0.0F);
      this.field17438 = new Class7219(this, 0, 16);
      this.field17438.field31038 = true;
      this.field17438.method22675(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var2);
      this.field17438.method22679(1.9F, 12.0F + var3, 0.0F);
   }

   @Override
   public Iterable<Class7219> method11001() {
      return ImmutableList.of(this.field17432);
   }

   @Override
   public Iterable<Class7219> method11002() {
      return ImmutableList.of(this.field17434, this.field17435, this.field17436, this.field17437, this.field17438, this.field17433);
   }

   public void method10997(T var1, float var2, float var3, float var4) {
      this.field17442 = var1.getSwimAnimation(var4);
      super.method10997(var1, var2, var3, var4);
   }

   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      boolean var9 = var1.getTicksElytraFlying() > 4;
      boolean var10 = var1.isActualySwimming();
      this.field17432.field31036 = var5 * (float) (Math.PI / 180.0);
      if (!var9) {
         if (!(this.field17442 > 0.0F)) {
            this.field17432.field31035 = var6 * (float) (Math.PI / 180.0);
         } else if (!var10) {
            this.field17432.field31035 = this.method11006(this.field17442, this.field17432.field31035, var6 * (float) (Math.PI / 180.0));
         } else {
            this.field17432.field31035 = this.method11006(this.field17442, this.field17432.field31035, (float) (-Math.PI / 4));
         }
      } else {
         this.field17432.field31035 = (float) (-Math.PI / 4);
      }

      this.field17434.field31036 = 0.0F;
      this.field17435.field31034 = 0.0F;
      this.field17435.field31032 = -5.0F;
      this.field17436.field31034 = 0.0F;
      this.field17436.field31032 = 5.0F;
      float var11 = 1.0F;
      if (var9) {
         var11 = (float)var1.getMotion().lengthSquared();
         var11 /= 0.2F;
         var11 = var11 * var11 * var11;
      }

      if (var11 < 1.0F) {
         var11 = 1.0F;
      }

      this.field17435.field31035 = MathHelper.cos(var2 * 0.6662F + (float) Math.PI) * 2.0F * var3 * 0.5F / var11;
      this.field17436.field31035 = MathHelper.cos(var2 * 0.6662F) * 2.0F * var3 * 0.5F / var11;
      this.field17435.field31037 = 0.0F;
      this.field17436.field31037 = 0.0F;
      this.field17437.field31035 = MathHelper.cos(var2 * 0.6662F) * 1.4F * var3 / var11;
      this.field17438.field31035 = MathHelper.cos(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3 / var11;
      this.field17437.field31036 = 0.0F;
      this.field17438.field31036 = 0.0F;
      this.field17437.field31037 = 0.0F;
      this.field17438.field31037 = 0.0F;
      if (this.field17601) {
         this.field17435.field31035 += (float) (-Math.PI / 5);
         this.field17436.field31035 += (float) (-Math.PI / 5);
         this.field17437.field31035 = -1.4137167F;
         this.field17437.field31036 = (float) (Math.PI / 10);
         this.field17437.field31037 = 0.07853982F;
         this.field17438.field31035 = -1.4137167F;
         this.field17438.field31036 = (float) (-Math.PI / 10);
         this.field17438.field31037 = -0.07853982F;
      }

      this.field17435.field31036 = 0.0F;
      this.field17436.field31036 = 0.0F;
      boolean var12 = var1.getPrimaryHand() == HandSide.field14418;
      boolean var13 = !var12 ? this.field17440.method9003() : this.field17439.method9003();
      if (var12 == var13) {
         this.method11003((T)var1);
         this.method11004((T)var1);
      } else {
         this.method11004((T)var1);
         this.method11003((T)var1);
      }

      this.method11005((T)var1, var4);
      if (!this.field17441) {
         this.field17434.field31035 = 0.0F;
         this.field17437.field31034 = 0.1F;
         this.field17438.field31034 = 0.1F;
         this.field17437.field31033 = 12.0F;
         this.field17438.field31033 = 12.0F;
         this.field17432.field31033 = 0.0F;
         this.field17434.field31033 = 0.0F;
         this.field17436.field31033 = 2.0F;
         this.field17435.field31033 = 2.0F;
      } else {
         this.field17434.field31035 = 0.5F;
         this.field17435.field31035 += 0.4F;
         this.field17436.field31035 += 0.4F;
         this.field17437.field31034 = 4.0F;
         this.field17438.field31034 = 4.0F;
         this.field17437.field31033 = 12.2F;
         this.field17438.field31033 = 12.2F;
         this.field17432.field31033 = 4.2F;
         this.field17434.field31033 = 3.2F;
         this.field17436.field31033 = 5.2F;
         this.field17435.field31033 = 5.2F;
      }

      Class7972.method27108(this.field17435, this.field17436, var4);
      if (this.field17442 > 0.0F) {
         float var14 = var2 % 26.0F;
         HandSide var15 = this.method11013((T)var1);
         float var16 = var15 == HandSide.field14418 && this.field17600 > 0.0F ? 0.0F : this.field17442;
         float var17 = var15 == HandSide.field14417 && this.field17600 > 0.0F ? 0.0F : this.field17442;
         if (!(var14 < 14.0F)) {
            if (var14 >= 14.0F && var14 < 22.0F) {
               float var22 = (var14 - 14.0F) / 8.0F;
               this.field17436.field31035 = this.method11006(var17, this.field17436.field31035, (float) (Math.PI / 2) * var22);
               this.field17435.field31035 = MathHelper.lerp(var16, this.field17435.field31035, (float) (Math.PI / 2) * var22);
               this.field17436.field31036 = this.method11006(var17, this.field17436.field31036, (float) Math.PI);
               this.field17435.field31036 = MathHelper.lerp(var16, this.field17435.field31036, (float) Math.PI);
               this.field17436.field31037 = this.method11006(var17, this.field17436.field31037, 5.012389F - 1.8707964F * var22);
               this.field17435.field31037 = MathHelper.lerp(var16, this.field17435.field31037, 1.2707963F + 1.8707964F * var22);
            } else if (var14 >= 22.0F && var14 < 26.0F) {
               float var18 = (var14 - 22.0F) / 4.0F;
               this.field17436.field31035 = this.method11006(var17, this.field17436.field31035, (float) (Math.PI / 2) - (float) (Math.PI / 2) * var18);
               this.field17435.field31035 = MathHelper.lerp(var16, this.field17435.field31035, (float) (Math.PI / 2) - (float) (Math.PI / 2) * var18);
               this.field17436.field31036 = this.method11006(var17, this.field17436.field31036, (float) Math.PI);
               this.field17435.field31036 = MathHelper.lerp(var16, this.field17435.field31036, (float) Math.PI);
               this.field17436.field31037 = this.method11006(var17, this.field17436.field31037, (float) Math.PI);
               this.field17435.field31037 = MathHelper.lerp(var16, this.field17435.field31037, (float) Math.PI);
            }
         } else {
            this.field17436.field31035 = this.method11006(var17, this.field17436.field31035, 0.0F);
            this.field17435.field31035 = MathHelper.lerp(var16, this.field17435.field31035, 0.0F);
            this.field17436.field31036 = this.method11006(var17, this.field17436.field31036, (float) Math.PI);
            this.field17435.field31036 = MathHelper.lerp(var16, this.field17435.field31036, (float) Math.PI);
            this.field17436.field31037 = this.method11006(
               var17, this.field17436.field31037, (float) Math.PI + 1.8707964F * this.method11007(var14) / this.method11007(14.0F)
            );
            this.field17435.field31037 = MathHelper.lerp(
               var16, this.field17435.field31037, (float) Math.PI - 1.8707964F * this.method11007(var14) / this.method11007(14.0F)
            );
         }

         float var23 = 0.3F;
         float var19 = 0.33333334F;
         this.field17438.field31035 = MathHelper.lerp(
            this.field17442, this.field17438.field31035, 0.3F * MathHelper.cos(var2 * 0.33333334F + (float) Math.PI)
         );
         this.field17437.field31035 = MathHelper.lerp(this.field17442, this.field17437.field31035, 0.3F * MathHelper.cos(var2 * 0.33333334F));
      }

      if (var1 instanceof Entity) {
         this.field17435.field31035 = this.field17435.field31035 * 0.5F - (float) (Math.PI * 3.0 / 10.0);
         this.field17435.field31036 = (float) (-Math.PI / 6);
      }

      this.field17433.method22669(this.field17432);
   }

   private void method11003(T var1) {
      switch (Class7772.field33347[this.field17440.ordinal()]) {
         case 1:
            this.field17435.field31036 = 0.0F;
            break;
         case 2:
            this.field17435.field31035 = this.field17435.field31035 * 0.5F - 0.9424779F;
            this.field17435.field31036 = (float) (-Math.PI / 6);
            break;
         case 3:
            this.field17435.field31035 = this.field17435.field31035 * 0.5F - (float) (Math.PI / 10);
            this.field17435.field31036 = 0.0F;
            break;
         case 4:
            this.field17435.field31035 = this.field17435.field31035 * 0.5F - (float) Math.PI;
            this.field17435.field31036 = 0.0F;
            break;
         case 5:
            this.field17435.field31036 = -0.1F + this.field17432.field31036;
            this.field17436.field31036 = 0.1F + this.field17432.field31036 + 0.4F;
            this.field17435.field31035 = (float) (-Math.PI / 2) + this.field17432.field31035;
            this.field17436.field31035 = (float) (-Math.PI / 2) + this.field17432.field31035;
            break;
         case 6:
            Class7972.method27106(this.field17435, this.field17436, var1, true);
            break;
         case 7:
            Class7972.method27105(this.field17435, this.field17436, this.field17432, true);
      }
   }

   private void method11004(T var1) {
      switch (Class7772.field33347[this.field17439.ordinal()]) {
         case 1:
            this.field17436.field31036 = 0.0F;
            break;
         case 2:
            this.field17436.field31035 = this.field17436.field31035 * 0.5F - 0.9424779F;
            this.field17436.field31036 = (float) (Math.PI / 6);
            break;
         case 3:
            this.field17436.field31035 = this.field17436.field31035 * 0.5F - (float) (Math.PI / 10);
            this.field17436.field31036 = 0.0F;
            break;
         case 4:
            this.field17436.field31035 = this.field17436.field31035 * 0.5F - (float) Math.PI;
            this.field17436.field31036 = 0.0F;
            break;
         case 5:
            this.field17435.field31036 = -0.1F + this.field17432.field31036 - 0.4F;
            this.field17436.field31036 = 0.1F + this.field17432.field31036;
            this.field17435.field31035 = (float) (-Math.PI / 2) + this.field17432.field31035;
            this.field17436.field31035 = (float) (-Math.PI / 2) + this.field17432.field31035;
            break;
         case 6:
            Class7972.method27106(this.field17435, this.field17436, var1, false);
            break;
         case 7:
            Class7972.method27105(this.field17435, this.field17436, this.field17432, false);
      }
   }

   public void method11005(T var1, float var2) {
      if (!(this.field17600 <= 0.0F)) {
         HandSide var5 = this.method11013((T)var1);
         Class7219 var6 = this.method11011(var5);
         float var7 = this.field17600;
         this.field17434.field31036 = MathHelper.sin(MathHelper.method37765(var7) * (float) (Math.PI * 2)) * 0.2F;
         if (var5 == HandSide.field14417) {
            this.field17434.field31036 *= -1.0F;
         }

         this.field17435.field31034 = MathHelper.sin(this.field17434.field31036) * 5.0F;
         this.field17435.field31032 = -MathHelper.cos(this.field17434.field31036) * 5.0F;
         this.field17436.field31034 = -MathHelper.sin(this.field17434.field31036) * 5.0F;
         this.field17436.field31032 = MathHelper.cos(this.field17434.field31036) * 5.0F;
         this.field17435.field31036 = this.field17435.field31036 + this.field17434.field31036;
         this.field17436.field31036 = this.field17436.field31036 + this.field17434.field31036;
         this.field17436.field31035 = this.field17436.field31035 + this.field17434.field31036;
         var7 = 1.0F - this.field17600;
         var7 *= var7;
         var7 *= var7;
         var7 = 1.0F - var7;
         float var8 = MathHelper.sin(var7 * (float) Math.PI);
         float var9 = MathHelper.sin(this.field17600 * (float) Math.PI) * -(this.field17432.field31035 - 0.7F) * 0.75F;
         var6.field31035 = (float)((double)var6.field31035 - ((double)var8 * 1.2 + (double)var9));
         var6.field31036 = var6.field31036 + this.field17434.field31036 * 2.0F;
         var6.field31037 = var6.field31037 + MathHelper.sin(this.field17600 * (float) Math.PI) * -0.4F;
      }
   }

   public float method11006(float var1, float var2, float var3) {
      float var6 = (var3 - var2) % (float) (Math.PI * 2);
      if (var6 < (float) -Math.PI) {
         var6 += (float) (Math.PI * 2);
      }

      if (var6 >= (float) Math.PI) {
         var6 -= (float) (Math.PI * 2);
      }

      return var2 + var1 * var6;
   }

   private float method11007(float var1) {
      return -65.0F * var1 + var1 * var1;
   }

   public void method11008(Class2797<T> var1) {
      super.method11027(var1);
      var1.field17439 = this.field17439;
      var1.field17440 = this.field17440;
      var1.field17441 = this.field17441;
      var1.field17432.method22669(this.field17432);
      var1.field17433.method22669(this.field17433);
      var1.field17434.method22669(this.field17434);
      var1.field17435.method22669(this.field17435);
      var1.field17436.method22669(this.field17436);
      var1.field17437.method22669(this.field17437);
      var1.field17438.method22669(this.field17438);
   }

   public void method11009(boolean var1) {
      this.field17432.field31039 = var1;
      this.field17433.field31039 = var1;
      this.field17434.field31039 = var1;
      this.field17435.field31039 = var1;
      this.field17436.field31039 = var1;
      this.field17437.field31039 = var1;
      this.field17438.field31039 = var1;
   }

   @Override
   public void method11010(HandSide var1, MatrixStack var2) {
      this.method11011(var1).method22682(var2);
   }

   public Class7219 method11011(HandSide var1) {
      return var1 != HandSide.field14417 ? this.field17435 : this.field17436;
   }

   @Override
   public Class7219 method11012() {
      return this.field17432;
   }

   public HandSide method11013(T var1) {
      HandSide var4 = var1.getPrimaryHand();
      return var1.swingingHand != Hand.MAIN_HAND ? var4.method8920() : var4;
   }
}

package remapped;

import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_3394 extends class_1871 {
   private static final Logger field_16720 = LogManager.getLogger();
   private int field_16721;
   private class_3998 field_16719;
   private class_1343 field_16718;
   private LivingEntity field_16723;
   private boolean field_16724;

   public class_3394(class_2770 var1) {
      super(var1);
   }

   @Override
   public void method_23473() {
      if (this.field_16723 != null) {
         if (this.field_16719 != null && this.field_16719.method_18436()) {
            double var3 = this.field_16723.getPosX();
            double var5 = this.field_16723.getPosZ();
            double var7 = var3 - this.field_9479.getPosX();
            double var9 = var5 - this.field_9479.getPosZ();
            double var11 = (double) MathHelper.sqrt(var7 * var7 + var9 * var9);
            double var13 = Math.min(0.4F + var11 / 80.0 - 1.0, 10.0);
            this.field_16718 = new class_1343(var3, this.field_16723.method_37309() + var13, var5);
         }

         double var33 = this.field_16718 != null
            ? this.field_16718.method_6203(this.field_9479.getPosX(), this.field_9479.method_37309(), this.field_9479.getPosZ())
            : 0.0;
         if (var33 < 100.0 || var33 > 22500.0) {
            this.method_15685();
         }

         double var34 = 64.0;
         if (!(this.field_16723.method_37275(this.field_9479) < 4096.0)) {
            if (this.field_16721 > 0) {
               this.field_16721--;
            }
         } else if (!this.field_9479.method_26420(this.field_16723)) {
            if (this.field_16721 > 0) {
               this.field_16721--;
            }
         } else {
            this.field_16721++;
            class_1343 var15 = new class_1343(
                  this.field_16723.getPosX() - this.field_9479.getPosX(), 0.0, this.field_16723.getPosZ() - this.field_9479.getPosZ()
               )
               .method_6213();
            class_1343 var16 = new class_1343(
                  (double) MathHelper.sin(this.field_9479.rotationYaw * (float) (Math.PI / 180.0)),
                  0.0,
                  (double)(-MathHelper.cos(this.field_9479.rotationYaw * (float) (Math.PI / 180.0)))
               )
               .method_6213();
            float var17 = (float)var16.method_6206(var15);
            float var18 = (float)(Math.acos((double)var17) * 180.0F / (float)Math.PI);
            var18 += 0.5F;
            if (this.field_16721 >= 5 && var18 >= 0.0F && var18 < 10.0F) {
               double var35 = 1.0;
               class_1343 var19 = this.field_9479.method_37307(1.0F);
               double var20 = this.field_9479.field_13542.getPosX() - var19.field_7336 * 1.0;
               double var22 = this.field_9479.field_13542.method_37080(0.5) + 0.5;
               double var24 = this.field_9479.field_13542.getPosZ() - var19.field_7334 * 1.0;
               double var26 = this.field_16723.getPosX() - var20;
               double var28 = this.field_16723.method_37080(0.5) - var22;
               double var30 = this.field_16723.getPosZ() - var24;
               if (!this.field_9479.method_37378()) {
                  this.field_9479.world.method_43365((PlayerEntity)null, 1017, this.field_9479.method_37075(), 0);
               }

               class_2844 var32 = new class_2844(this.field_9479.world, this.field_9479, var26, var28, var30);
               var32.method_37144(var20, var22, var24, 0.0F, 0.0F);
               this.field_9479.world.method_7509(var32);
               this.field_16721 = 0;
               if (this.field_16719 != null) {
                  while (!this.field_16719.method_18436()) {
                     this.field_16719.method_18434();
                  }
               }

               this.field_9479.method_12611().method_29422(class_8978.field_46006);
            }
         }
      } else {
         field_16720.warn("Skipping player strafe phase because no player was found");
         this.field_9479.method_12611().method_29422(class_8978.field_46006);
      }
   }

   private void method_15685() {
      if (this.field_16719 == null || this.field_16719.method_18436()) {
         int var3 = this.field_9479.method_12606();
         int var4 = var3;
         if (this.field_9479.method_26594().nextInt(8) == 0) {
            this.field_16724 = !this.field_16724;
            var4 = var3 + 6;
         }

         if (!this.field_16724) {
            var4--;
         } else {
            var4++;
         }

         if (this.field_9479.method_12622() != null && this.field_9479.method_12622().method_12784() > 0) {
            var4 %= 12;
            if (var4 < 0) {
               var4 += 12;
            }
         } else {
            var4 -= 12;
            var4 &= 7;
            var4 += 12;
         }

         this.field_16719 = this.field_9479.method_12612(var3, var4, (class_5851)null);
         if (this.field_16719 != null) {
            this.field_16719.method_18434();
         }
      }

      this.method_15683();
   }

   private void method_15683() {
      if (this.field_16719 != null && !this.field_16719.method_18436()) {
         BlockPos var3 = this.field_16719.method_18449();
         this.field_16719.method_18434();
         double var4 = (double)var3.getX();
         double var6 = (double)var3.getZ();

         double var8;
         do {
            var8 = (double)((float)var3.getY() + this.field_9479.method_26594().nextFloat() * 20.0F);
         } while (var8 < (double)var3.getY());

         this.field_16718 = new class_1343(var4, var8, var6);
      }
   }

   @Override
   public void method_23469() {
      this.field_16721 = 0;
      this.field_16718 = null;
      this.field_16719 = null;
      this.field_16723 = null;
   }

   public void method_15684(LivingEntity var1) {
      this.field_16723 = var1;
      int var4 = this.field_9479.method_12606();
      int var5 = this.field_9479.method_12614(this.field_16723.getPosX(), this.field_16723.method_37309(), this.field_16723.getPosZ());
      int var6 = MathHelper.floor(this.field_16723.getPosX());
      int var7 = MathHelper.floor(this.field_16723.getPosZ());
      double var8 = (double)var6 - this.field_9479.getPosX();
      double var10 = (double)var7 - this.field_9479.getPosZ();
      double var12 = (double) MathHelper.sqrt(var8 * var8 + var10 * var10);
      double var14 = Math.min(0.4F + var12 / 80.0 - 1.0, 10.0);
      int var16 = MathHelper.floor(this.field_16723.method_37309() + var14);
      class_5851 var17 = new class_5851(var6, var16, var7);
      this.field_16719 = this.field_9479.method_12612(var4, var5, var17);
      if (this.field_16719 != null) {
         this.field_16719.method_18434();
         this.method_15683();
      }
   }

   @Nullable
   @Override
   public class_1343 method_23463() {
      return this.field_16718;
   }

   @Override
   public class_8978<class_3394> method_23464() {
      return class_8978.field_46007;
   }
}

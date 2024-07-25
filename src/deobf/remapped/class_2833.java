package remapped;

public class class_2833 {
   private static String[] field_13883;
   public final MobEntity field_13879;
   public double field_13884;
   public double field_13886;
   public double field_13880;
   public double field_13885;
   public float field_13881;
   public float field_13882;
   public class_1737 field_13878 = class_1737.field_8945;

   public class_2833(MobEntity var1) {
      this.field_13879 = var1;
   }

   public boolean method_12877() {
      return this.field_13878 == class_1737.field_8946;
   }

   public double method_12880() {
      return this.field_13885;
   }

   public void method_12879(double var1, double var3, double var5, double var7) {
      this.field_13884 = var1;
      this.field_13886 = var3;
      this.field_13880 = var5;
      this.field_13885 = var7;
      if (this.field_13878 != class_1737.field_8949) {
         this.field_13878 = class_1737.field_8946;
      }
   }

   public void method_12884(float var1, float var2) {
      this.field_13878 = class_1737.field_8948;
      this.field_13881 = var1;
      this.field_13882 = var2;
      this.field_13885 = 0.25;
   }

   public void method_12883() {
      if (this.field_13878 != class_1737.field_8948) {
         if (this.field_13878 != class_1737.field_8946) {
            if (this.field_13878 != class_1737.field_8949) {
               this.field_13879.method_26904(0.0F);
            } else {
               this.field_13879.method_26461((float)(this.field_13885 * this.field_13879.method_26575(Attributes.MOVEMENT_SPEED)));
               if (this.field_13879.method_37360()) {
                  this.field_13878 = class_1737.field_8945;
               }
            }
         } else {
            this.field_13878 = class_1737.field_8945;
            double var12 = this.field_13884 - this.field_13879.getPosX();
            double var14 = this.field_13880 - this.field_13879.getPosZ();
            double var16 = this.field_13886 - this.field_13879.method_37309();
            double var18 = var12 * var12 + var16 * var16 + var14 * var14;
            if (var18 < 2.5000003E-7F) {
               this.field_13879.method_26904(0.0F);
               return;
            }

            float var11 = (float)(MathHelper.method_42821(var14, var12) * 180.0F / (float)Math.PI) - 90.0F;
            this.field_13879.rotationYaw = this.method_12882(this.field_13879.rotationYaw, var11, 90.0F);
            this.field_13879.method_26461((float)(this.field_13885 * this.field_13879.method_26575(Attributes.MOVEMENT_SPEED)));
            BlockPos var20 = this.field_13879.method_37075();
            class_2522 var21 = this.field_13879.world.method_28262(var20);
            class_6414 var22 = var21.method_8360();
            class_4190 var23 = var21.method_8324(this.field_13879.world, var20);
            if (var16 > (double)this.field_13879.field_41733 && var12 * var12 + var14 * var14 < (double)Math.max(1.0F, this.field_13879.method_37086())
               || !var23.method_19485()
                  && this.field_13879.method_37309() < var23.method_19495(class_9249.field_47216) + (double)var20.method_12165()
                  && !var22.method_29299(class_2351.field_11780)
                  && !var22.method_29299(class_2351.field_11728)) {
               this.field_13879.method_26886().method_18772();
               this.field_13878 = class_1737.field_8949;
            }
         }
      } else {
         float var3 = (float)this.field_13879.method_26575(Attributes.MOVEMENT_SPEED);
         float var4 = (float)this.field_13885 * var3;
         float var5 = this.field_13881;
         float var6 = this.field_13882;
         float var7 = MathHelper.sqrt(var5 * var5 + var6 * var6);
         if (var7 < 1.0F) {
            var7 = 1.0F;
         }

         var7 = var4 / var7;
         var5 *= var7;
         var6 *= var7;
         float var8 = MathHelper.sin(this.field_13879.rotationYaw * (float) (Math.PI / 180.0));
         float var9 = MathHelper.cos(this.field_13879.rotationYaw * (float) (Math.PI / 180.0));
         float var10 = var5 * var9 - var6 * var8;
         float var27 = var6 * var9 + var5 * var8;
         if (!this.method_12878(var10, var27)) {
            this.field_13881 = 1.0F;
            this.field_13882 = 0.0F;
         }

         this.field_13879.method_26461(var4);
         this.field_13879.method_26904(this.field_13881);
         this.field_13879.method_26907(this.field_13882);
         this.field_13878 = class_1737.field_8945;
      }
   }

   private boolean method_12878(float var1, float var2) {
      PathNavigator var5 = this.field_13879.method_26927();
      if (var5 != null) {
         class_1546 var6 = var5.method_5627();
         if (var6 != null
            && var6.method_7010(
                  this.field_13879.world,
                  MathHelper.floor(this.field_13879.getPosX() + (double)var1),
                  MathHelper.floor(this.field_13879.method_37309()),
                  MathHelper.floor(this.field_13879.getPosZ() + (double)var2)
               )
               != class_1108.field_6343) {
            return false;
         }
      }

      return true;
   }

   public float method_12882(float var1, float var2, float var3) {
      float var6 = MathHelper.wrapDegrees(var2 - var1);
      if (var6 > var3) {
         var6 = var3;
      }

      if (var6 < -var3) {
         var6 = -var3;
      }

      float var7 = var1 + var6;
      if (!(var7 < 0.0F)) {
         if (var7 > 360.0F) {
            var7 -= 360.0F;
         }
      } else {
         var7 += 360.0F;
      }

      return var7;
   }

   public double method_12887() {
      return this.field_13884;
   }

   public double method_12881() {
      return this.field_13886;
   }

   public double method_12886() {
      return this.field_13880;
   }
}

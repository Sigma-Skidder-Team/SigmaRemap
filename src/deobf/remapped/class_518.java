package remapped;

import java.util.EnumSet;
import javax.annotation.Nullable;

public class class_518 extends class_3599 {
   private static String[] field_3167;
   public final class_4612 field_3169;
   public final double field_3171;
   public double field_3166;
   public double field_3172;
   public double field_3170;
   public boolean field_3168;

   public class_518(class_4612 var1, double var2) {
      this.field_3169 = var1;
      this.field_3171 = var2;
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9564));
   }

   @Override
   public boolean method_16795() {
      if (this.field_3169.method_26531() == null && !this.field_3169.method_37264()) {
         return false;
      } else {
         if (this.field_3169.method_37264()) {
            class_1331 var3 = this.method_2534(this.field_3169.field_41768, this.field_3169, 5, 4);
            if (var3 != null) {
               this.field_3166 = (double)var3.method_12173();
               this.field_3172 = (double)var3.method_12165();
               this.field_3170 = (double)var3.method_12185();
               return true;
            }
         }

         return this.method_2535();
      }
   }

   public boolean method_2535() {
      class_1343 var3 = class_3425.method_15845(this.field_3169, 5, 4);
      if (var3 != null) {
         this.field_3166 = var3.field_7336;
         this.field_3172 = var3.field_7333;
         this.field_3170 = var3.field_7334;
         return true;
      } else {
         return false;
      }
   }

   public boolean method_2536() {
      return this.field_3168;
   }

   @Override
   public void method_16796() {
      this.field_3169.method_26927().method_5595(this.field_3166, this.field_3172, this.field_3170, this.field_3171);
      this.field_3168 = true;
   }

   @Override
   public void method_16793() {
      this.field_3168 = false;
   }

   @Override
   public boolean method_16799() {
      return !this.field_3169.method_26927().method_5591();
   }

   @Nullable
   public class_1331 method_2534(class_6163 var1, class_8145 var2, int var3, int var4) {
      class_1331 var7 = var2.method_37075();
      int var8 = var7.method_12173();
      int var9 = var7.method_12165();
      int var10 = var7.method_12185();
      float var11 = (float)(var3 * var3 * var4 * 2);
      class_1331 var12 = null;
      class_2921 var13 = new class_2921();

      for (int var14 = var8 - var3; var14 <= var8 + var3; var14++) {
         for (int var15 = var9 - var4; var15 <= var9 + var4; var15++) {
            for (int var16 = var10 - var3; var16 <= var10 + var3; var16++) {
               var13.method_13362(var14, var15, var16);
               if (var1.method_28258(var13).method_22007(class_6503.field_33094)) {
                  float var17 = (float)((var14 - var8) * (var14 - var8) + (var15 - var9) * (var15 - var9) + (var16 - var10) * (var16 - var10));
                  if (var17 < var11) {
                     var11 = var17;
                     var12 = new class_1331(var13);
                  }
               }
            }
         }
      }

      return var12;
   }
}

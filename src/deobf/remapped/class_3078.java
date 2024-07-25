package remapped;

import java.util.EnumSet;
import java.util.List;

public class class_3078 extends class_3599 {
   private static String[] field_15138;
   public final class_9310 field_15140;
   private double field_15139;
   private int field_15141;

   public class_3078(class_9310 var1, double var2) {
      this.field_15140 = var1;
      this.field_15139 = var2;
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9564));
   }

   @Override
   public boolean method_16795() {
      if (!this.field_15140.method_26920() && !this.field_15140.method_42974()) {
         List var3 = this.field_15140.world.method_25867(this.field_15140, this.field_15140.method_37241().method_18899(9.0, 4.0, 9.0), var0 -> {
            class_6629 var3x = var0.method_37387();
            return var3x == class_6629.field_34327 || var3x == class_6629.field_34230;
         });
         class_9310 var4 = null;
         double var5 = Double.MAX_VALUE;

         for (Entity var8 : var3) {
            class_9310 var9 = (class_9310)var8;
            if (var9.method_42974() && !var9.method_42971()) {
               double var10 = this.field_15140.method_37275(var9);
               if (!(var10 > var5)) {
                  var5 = var10;
                  var4 = var9;
               }
            }
         }

         if (var4 == null) {
            for (Entity var13 : var3) {
               class_9310 var14 = (class_9310)var13;
               if (var14.method_26920() && !var14.method_42971()) {
                  double var15 = this.field_15140.method_37275(var14);
                  if (!(var15 > var5)) {
                     var5 = var15;
                     var4 = var14;
                  }
               }
            }
         }

         if (var4 == null) {
            return false;
         } else if (var5 < 4.0) {
            return false;
         } else if (!var4.method_26920() && !this.method_14107(var4, 1)) {
            return false;
         } else {
            this.field_15140.method_42982(var4);
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method_16799() {
      if (this.field_15140.method_42974() && this.field_15140.method_42970().method_37330() && this.method_14107(this.field_15140, 0)) {
         double var3 = this.field_15140.method_37275(this.field_15140.method_42970());
         if (var3 > 676.0) {
            if (this.field_15139 <= 3.0) {
               this.field_15139 *= 1.2;
               this.field_15141 = 40;
               return true;
            }

            if (this.field_15141 == 0) {
               return false;
            }
         }

         if (this.field_15141 > 0) {
            this.field_15141--;
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method_16793() {
      this.field_15140.method_42976();
      this.field_15139 = 2.1;
   }

   @Override
   public void method_16794() {
      if (this.field_15140.method_42974() && !(this.field_15140.method_26922() instanceof class_8008)) {
         class_9310 var3 = this.field_15140.method_42970();
         double var4 = (double)this.field_15140.method_37175(var3);
         float var6 = 2.0F;
         class_1343 var7 = new class_1343(
               var3.getPosX() - this.field_15140.getPosX(),
               var3.method_37309() - this.field_15140.method_37309(),
               var3.getPosZ() - this.field_15140.getPosZ()
            )
            .method_6213()
            .method_6209(Math.max(var4 - 2.0, 0.0));
         this.field_15140
            .method_26927()
            .method_5595(
               this.field_15140.getPosX() + var7.field_7336,
               this.field_15140.method_37309() + var7.field_7333,
               this.field_15140.getPosZ() + var7.field_7334,
               this.field_15139
            );
      }
   }

   private boolean method_14107(class_9310 var1, int var2) {
      if (var2 <= 8) {
         if (!var1.method_42974()) {
            return false;
         } else if (!var1.method_42970().method_26920()) {
            class_9310 var5 = var1.method_42970();
            return this.method_14107(var5, ++var2);
         } else {
            return true;
         }
      } else {
         return false;
      }
   }
}

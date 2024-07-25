package remapped;

import java.util.ArrayList;
import java.util.List;

public class class_5181 {
   private double field_26667;
   public static final double field_26668 = 0.1F;

   public class_5181(double var1) {
      if (!(var1 <= 0.0) && !(var1 >= 1.0)) {
         this.field_26667 = var1;
      } else {
         throw new AssertionError("Smoothness must be between 0 and 1 (both non-inclusive)");
      }
   }

   public class_5181() {
      this(0.1F);
   }

   public class_9671 method_23763(class_9671 var1, class_9671 var2, class_9671 var3, double var4) {
      double var8 = (1.0 - var4) * (1.0 - var4) * var1.method_44726() + 2.0 * var4 * (1.0 - var4) * var2.method_44726() + var4 * var4 * var3.method_44726();
      double var10 = (1.0 - var4) * (1.0 - var4) * var1.method_44727() + 2.0 * var4 * (1.0 - var4) * var2.method_44727() + var4 * var4 * var3.method_44727();
      return new class_9671(var8, var10);
   }

   public class_9671 method_23767(class_9671 var1, class_9671 var2, class_9671 var3, class_9671 var4, double var5) {
      double var9 = 1.0 - var5;
      double var11 = var9 * var9;
      double var13 = var11 * var9;
      double var15 = var1.method_44726() * var13
         + var2.method_44726() * 3.0 * var5 * var11
         + var3.method_44726() * 3.0 * var5 * var5 * var9
         + var4.method_44726() * var5 * var5 * var5;
      double var17 = var1.method_44727() * var13
         + var2.method_44727() * 3.0 * var5 * var11
         + var3.method_44727() * 3.0 * var5 * var5 * var9
         + var4.method_44727() * var5 * var5 * var5;
      return new class_9671(var15, var17);
   }

   public double method_23765(List<class_9671> var1, float var2) {
      if (var2 == 0.0F) {
         return 0.0;
      } else {
         List var5 = this.method_23764(var1);
         double var6 = 1.0;

         for (int var8 = 0; var8 < var5.size(); var8++) {
            class_9671 var9 = (class_9671)var5.get(var8);
            if (!(var9.method_44726() <= (double)var2)) {
               break;
            }

            var6 = var9.method_44727();
            class_9671 var10 = new class_9671(1.0, 1.0);
            if (var8 + 1 < var5.size()) {
               var10 = (class_9671)var5.get(var8 + 1);
            }

            double var11 = var10.method_44726() - var9.method_44726();
            double var13 = var10.method_44727() - var9.method_44727();
            double var15 = (double)var2 - var9.method_44726();
            double var17 = var15 / var11;
            var6 += var13 * var17;
         }

         return var6;
      }
   }

   public List<class_9671> method_23764(List<class_9671> var1) {
      if (var1 != null) {
         if (var1.size() >= 3) {
            class_9671 var4 = (class_9671)var1.get(0);
            class_9671 var5 = (class_9671)var1.get(1);
            class_9671 var6 = (class_9671)var1.get(2);
            class_9671 var7 = var1.size() != 4 ? null : (class_9671)var1.get(3);
            ArrayList var11 = new ArrayList();
            class_9671 var8 = var4;
            double var9 = 0.0;

            while (var9 < 1.0) {
               var11.add(var8);
               var8 = var7 != null ? this.method_23767(var4, var5, var6, var7, var9) : this.method_23763(var4, var5, var6, var9);
               var9 += this.field_26667;
            }

            return var11;
         } else {
            return null;
         }
      } else {
         throw new AssertionError("Provided list had no reference");
      }
   }

   public static float method_23766(float var0, double... var1) {
      ArrayList var4 = new ArrayList();
      var4.add(new class_9671(0.0, 0.0));
      var4.add(new class_9671(var1[0], var1[1]));
      var4.add(new class_9671(var1[2], var1[3]));
      var4.add(new class_9671(1.0, 1.0));
      class_5181 var5 = new class_5181(0.0055555557F);
      return (float)var5.method_23765(var4, var0);
   }
}

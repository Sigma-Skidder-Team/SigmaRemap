package remapped;

import it.unimi.dsi.fastutil.doubles.DoubleList;
import it.unimi.dsi.fastutil.doubles.DoubleListIterator;

public class class_7853 {
   private static String[] field_39798;
   private final double field_39799;
   private final class_2439 field_39796;
   private final class_2439 field_39797;

   public static class_7853 method_35530(class_8679 var0, int var1, DoubleList var2) {
      return new class_7853(var0, var1, var2);
   }

   private class_7853(class_8679 var1, int var2, DoubleList var3) {
      this.field_39796 = class_2439.method_11117(var1, var2, var3);
      this.field_39797 = class_2439.method_11117(var1, var2, var3);
      int var6 = Integer.MAX_VALUE;
      int var7 = Integer.MIN_VALUE;
      DoubleListIterator var8 = var3.iterator();

      while (var8.hasNext()) {
         int var9 = var8.nextIndex();
         double var10 = var8.nextDouble();
         if (var10 != 0.0) {
            var6 = Math.min(var6, var9);
            var7 = Math.max(var7, var9);
         }
      }

      this.field_39799 = 0.16666666666666666 / method_35529(var7 - var6);
   }

   private static double method_35529(int var0) {
      return 0.1 * (1.0 + 1.0 / (double)(var0 + 1));
   }

   public double method_35528(double var1, double var3, double var5) {
      double var9 = var1 * 1.0181268882175227;
      double var11 = var3 * 1.0181268882175227;
      double var13 = var5 * 1.0181268882175227;
      return (this.field_39796.method_11112(var1, var3, var5) + this.field_39797.method_11112(var9, var11, var13)) * this.field_39799;
   }
}

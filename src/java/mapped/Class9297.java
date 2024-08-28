package mapped;

import it.unimi.dsi.fastutil.doubles.DoubleList;
import it.unimi.dsi.fastutil.doubles.DoubleListIterator;

public class Class9297 {
   private static String[] field42742;
   private final double field42743;
   private final Class7689 field42744;
   private final Class7689 field42745;

   public static Class9297 method35044(Class2420 var0, int var1, DoubleList var2) {
      return new Class9297(var0, var1, var2);
   }

   private Class9297(Class2420 var1, int var2, DoubleList var3) {
      this.field42744 = Class7689.method25308(var1, var2, var3);
      this.field42745 = Class7689.method25308(var1, var2, var3);
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

      this.field42743 = 0.16666666666666666 / method35045(var7 - var6);
   }

   private static double method35045(int var0) {
      return 0.1 * (1.0 + 1.0 / (double)(var0 + 1));
   }

   public double method35046(double var1, double var3, double var5) {
      double var9 = var1 * 1.0181268882175227;
      double var11 = var3 * 1.0181268882175227;
      double var13 = var5 * 1.0181268882175227;
      return (this.field42744.method25310(var1, var3, var5) + this.field42745.method25310(var9, var11, var13)) * this.field42743;
   }
}

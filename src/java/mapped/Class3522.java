package mapped;

import java.util.Random;

public class Class3522 implements Class3499<Class7435> {
   private static String[] field19417;
   private final Class8975 field19418;

   public Class3522(Class8975 var1) {
      this.field19418 = var1;
   }

   public Class4587 method12199(Class7435 var1, ClientWorld var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      Random var17 = var2.field9016;
      double var18 = var17.nextGaussian() * 1.0E-6F;
      double var20 = var17.nextGaussian() * 1.0E-4F;
      double var22 = var17.nextGaussian() * 1.0E-6F;
      Class4607 var24 = new Class4607(var2, var3, var5, var7, var18, var20, var22);
      var24.method14507(this.field19418);
      var24.method14514(0.9F, 0.4F, 0.5F);
      return var24;
   }
}

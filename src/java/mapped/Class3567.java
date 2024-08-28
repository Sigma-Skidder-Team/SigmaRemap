package mapped;

import java.util.Random;

public class Class3567 implements Class3499<Class7435> {
   private static String[] field19503;
   private final Class8975 field19504;

   public Class3567(Class8975 var1) {
      this.field19504 = var1;
   }

   public Class4587 method12199(Class7435 var1, Class1656 var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      Random var17 = var2.field9016;
      double var18 = (double)var17.nextFloat() * -1.9 * (double)var17.nextFloat() * 0.1;
      double var20 = (double)var17.nextFloat() * -0.5 * (double)var17.nextFloat() * 0.1 * 5.0;
      double var22 = (double)var17.nextFloat() * -1.9 * (double)var17.nextFloat() * 0.1;
      return new Class4614(var2, var3, var5, var7, var18, var20, var22, 1.0F, this.field19504);
   }
}

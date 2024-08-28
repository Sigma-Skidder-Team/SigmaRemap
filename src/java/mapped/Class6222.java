package mapped;

import java.util.Random;

public final class Class6222 extends Class6218 {
   private static String[] field27718;

   @Override
   public Class8848 method19192(Class2956 var1, Class8848 var2) {
      Direction var5 = var1.method11324().<Direction>method23463(Class3357.field18899);
      Class2955 var6 = Class3357.method11934(var1);
      double var7 = var6.method11320() + (double)((float)var5.method539() * 0.3F);
      double var9 = var6.method11321() + (double)((float)var5.method540() * 0.3F);
      double var11 = var6.method11322() + (double)((float)var5.method541() * 0.3F);
      Class1657 var13 = var1.method11326();
      Random var14 = var13.field9016;
      double var15 = var14.nextGaussian() * 0.05 + (double)var5.method539();
      double var17 = var14.nextGaussian() * 0.05 + (double)var5.method540();
      double var19 = var14.nextGaussian() * 0.05 + (double)var5.method541();
      var13.method6916(Util.method38508(new Class900(var13, var7, var9, var11, var15, var17, var19), var1x -> var1x.method3526(var2)));
      var2.method32182(1);
      return var2;
   }

   @Override
   public void method19193(Class2956 var1) {
      var1.method11326().method6999(1018, var1.method11323(), 0);
   }
}

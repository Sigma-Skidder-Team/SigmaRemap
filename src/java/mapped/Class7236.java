package mapped;

import java.util.Random;

public class Class7236 {
   private static String[] field31088;
   private static final Random field31089 = new Random();

   public static void method22721(Class1655 var0, BlockPos var1, Class920 var2) {
      method22723(var0, (double)var1.method8304(), (double)var1.getY(), (double)var1.method8306(), var2);
   }

   public static void method22722(Class1655 var0, Entity var1, Class920 var2) {
      method22723(var0, var1.getPosX(), var1.getPosY(), var1.getPosZ(), var2);
   }

   private static void method22723(Class1655 var0, double var1, double var3, double var5, Class920 var7) {
      for (int var10 = 0; var10 < var7.method3629(); var10++) {
         method22725(var0, var1, var3, var5, var7.method3618(var10));
      }
   }

   public static void method22724(Class1655 var0, BlockPos var1, Class25<Class8848> var2) {
      var2.forEach(var2x -> method22725(var0, (double)var1.method8304(), (double)var1.getY(), (double)var1.method8306(), var2x));
   }

   public static void method22725(Class1655 var0, double var1, double var3, double var5, Class8848 var7) {
      double var10 = (double)Class8992.field41042.method33213();
      double var12 = 1.0 - var10;
      double var14 = var10 / 2.0;
      double var16 = Math.floor(var1) + field31089.nextDouble() * var12 + var14;
      double var18 = Math.floor(var3) + field31089.nextDouble() * var12;
      double var20 = Math.floor(var5) + field31089.nextDouble() * var12 + var14;

      while (!var7.method32105()) {
         Class1000 var22 = new Class1000(var0, var16, var18, var20, var7.method32106(field31089.nextInt(21) + 10));
         float var23 = 0.05F;
         var22.method3435(field31089.nextGaussian() * 0.05F, field31089.nextGaussian() * 0.05F + 0.2F, field31089.nextGaussian() * 0.05F);
         var0.method6916(var22);
      }
   }
}

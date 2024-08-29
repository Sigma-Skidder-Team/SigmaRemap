package mapped;

public class Class6218 implements Class6226 {
   private static String[] field27718;

   @Override
   public final ItemStack method19196(Class2956 var1, ItemStack var2) {
      ItemStack var5 = this.method19192(var1, var2);
      this.method19193(var1);
      this.method19198(var1, var1.method11324().<Direction>method23463(Class3357.field18899));
      return var5;
   }

   public ItemStack method19192(Class2956 var1, ItemStack var2) {
      Direction var5 = var1.method11324().<Direction>method23463(Class3357.field18899);
      Class2955 var6 = Class3357.method11934(var1);
      ItemStack var7 = var2.method32106(1);
      method19197(var1.method11326(), var7, 6, var5, var6);
      return var2;
   }

   public static void method19197(World var0, ItemStack var1, int var2, Direction var3, Class2955 var4) {
      double var7 = var4.method11320();
      double var9 = var4.method11321();
      double var11 = var4.method11322();
      if (var3.method544() != Class113.field414) {
         var9 -= 0.15625;
      } else {
         var9 -= 0.125;
      }

      ItemEntity var13 = new ItemEntity(var0, var7, var9, var11, var1);
      double var14 = var0.rand.nextDouble() * 0.1 + 0.2;
      var13.method3435(
         var0.rand.nextGaussian() * 0.0075F * (double)var2 + (double)var3.method539() * var14,
         var0.rand.nextGaussian() * 0.0075F * (double)var2 + 0.2F,
         var0.rand.nextGaussian() * 0.0075F * (double)var2 + (double)var3.method541() * var14
      );
      var0.method6916(var13);
   }

   public void method19193(Class2956 var1) {
      var1.method11326().playEvent(1000, var1.method11323(), 0);
   }

   public void method19198(Class2956 var1, Direction var2) {
      var1.method11326().playEvent(2000, var1.method11323(), var2.method533());
   }
}

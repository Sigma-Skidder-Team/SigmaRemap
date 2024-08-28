package mapped;

import java.util.List;

public abstract class Class6065 {
   public final int field26307;
   public final int field26308;
   public final int field26309;
   public final int field26310;

   public Class6065(int var1, int var2, int var3, int var4) {
      this.field26307 = var1;
      this.field26308 = var2;
      this.field26309 = var3;
      this.field26310 = var4;
   }

   public void method18801(Class9332 var1, int var2, int var3, int var4, int var5) {
      int var8 = var2 + this.field26309;
      int var9 = var3 + this.field26310;
      boolean var10 = false;
      if (var4 >= var8 && var4 <= var8 + this.field26307 && var5 >= var9 && var5 <= var9 + this.field26308) {
         var10 = true;
      }

      this.method18799(var1, var8, var9, var10);
   }

   public abstract void method18799(Class9332 var1, int var2, int var3, boolean var4);

   public int method18802() {
      return this.field26309 + this.field26307;
   }

   public int method18803() {
      return this.field26310 + this.field26308;
   }

   public abstract void method18800(int var1);

   public static void method18804(Class9332 var0, List<Class6065> var1, Class1286<?> var2, int var3, int var4, int var5, int var6) {
      for (Class6065 var10 : var1) {
         if (var2.method6022() > var10.method18802()) {
            var10.method18801(var0, var3, var4, var5, var6);
         }
      }
   }

   public static void method18805(Class1286<?> var0, Class1155<?> var1, List<Class6065> var2, int var3, double var4, double var6) {
      if (var3 == 0) {
         int var10 = var0.method2468().indexOf(var1);
         if (var10 > -1) {
            var0.method6109(var10);
            int var11 = var0.method6053();
            int var12 = var0.method6055(var10);
            int var13 = (int)(var4 - (double)var11);
            int var14 = (int)(var6 - (double)var12);

            for (Class6065 var16 : var2) {
               if (var13 >= var16.field26309 && var13 <= var16.method18802() && var14 >= var16.field26310 && var14 <= var16.method18803()) {
                  var16.method18800(var10);
               }
            }
         }
      }
   }
}

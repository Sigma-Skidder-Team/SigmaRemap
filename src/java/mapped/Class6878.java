package mapped;

import javax.annotation.Nullable;

public class Class6878 {
   private static String[] field29818;

   @Nullable
   public static BlockPos method20940(Class1657 var0, int var1, int var2, boolean var3) {
      Mutable var6 = new Mutable(var1, 0, var2);
      Class8907 var7 = var0.method7003(var6);
      boolean var8 = var0.method6812().method36876();
      Class7380 var9 = var7.method32507().method24283().method28934();
      if (var3 && !var9.method23383().method11540(Class7645.field32780)) {
         return null;
      } else {
         Class1674 var10 = var0.method6824(var1 >> 4, var2 >> 4);
         int var11 = !var8 ? var10.method7071(Class101.field299, var1 & 15, var2 & 15) : var0.method6883().method7370().method17823();
         if (var11 < 0) {
            return null;
         } else {
            int var12 = var10.method7071(Class101.field296, var1 & 15, var2 & 15);
            if (var12 <= var11 && var12 > var10.method7071(Class101.field298, var1 & 15, var2 & 15)) {
               return null;
            } else {
               for (int var13 = var11 + 1; var13 >= 0; var13--) {
                  var6.method8372(var1, var13, var2);
                  Class7380 var14 = var0.method6738(var6);
                  if (!var14.method23449().method23474()) {
                     break;
                  }

                  if (var14.equals(var9)) {
                     return var6.method8311().method8353();
                  }
               }

               return null;
            }
         }
      }
   }

   @Nullable
   public static BlockPos method20941(Class1657 var0, Class7481 var1, boolean var2) {
      for (int var5 = var1.method24356(); var5 <= var1.method24358(); var5++) {
         for (int var6 = var1.method24357(); var6 <= var1.method24359(); var6++) {
            BlockPos var7 = method20940(var0, var5, var6, var2);
            if (var7 != null) {
               return var7;
            }
         }
      }

      return null;
   }
}

package mapped;

import net.minecraft.client.util.Util;

import java.util.List;
import java.util.Random;

public class Class8879 {
   private static String[] field40191;

   public static int method32311(List<? extends Class6691> var0) {
      int var3 = 0;
      int var4 = 0;

      for (int var5 = var0.size(); var4 < var5; var4++) {
         Class6691 var6 = (Class6691)var0.get(var4);
         var3 += var6.field29309;
      }

      return var3;
   }

   public static <T extends Class6691> T method32312(Random var0, List<T> var1, int var2) {
      if (var2 > 0) {
         int var5 = var0.nextInt(var2);
         return method32313(var1, var5);
      } else {
         throw (IllegalArgumentException) Util.method38516(new IllegalArgumentException());
      }
   }

   public static <T extends Class6691> T method32313(List<T> var0, int var1) {
      int var4 = 0;

      for (int var5 = var0.size(); var4 < var5; var4++) {
         Class6691 var6 = (Class6691)var0.get(var4);
         var1 -= var6.field29309;
         if (var1 < 0) {
            return (T)var6;
         }
      }

      return null;
   }

   public static <T extends Class6691> T method32314(Random var0, List<T> var1) {
      return method32312(var0, var1, method32311(var1));
   }
}

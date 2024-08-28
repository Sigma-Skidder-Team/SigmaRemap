package mapped;

import com.mojang.serialization.Codec;

import java.util.Random;

public class Class2937 extends Class2898<Class4712> {
   public Class2937(Codec<Class4712> var1) {
      super(var1);
   }

   public boolean method11213(Class1658 var1, Class5646 var2, Random var3, BlockPos var4, Class4712 var5) {
      return method11277(var1, var3, var4, 8, 4, 8);
   }

   public static boolean method11277(Class1660 var0, Random var1, BlockPos var2, int var3, int var4, int var5) {
      if (!method11281(var0, var2)) {
         method11278(var0, var1, var2, var3, var4, var5);
         return true;
      } else {
         return false;
      }
   }

   private static void method11278(Class1660 var0, Random var1, BlockPos var2, int var3, int var4, int var5) {
      Mutable var8 = new Mutable();

      for (int var9 = 0; var9 < var3 * var3; var9++) {
         var8.method8374(var2)
            .method8381(Class9679.method37782(var1, -var3, var3), Class9679.method37782(var1, -var4, var4), Class9679.method37782(var1, -var3, var3));
         if (method11279(var0, var8) && !method11281(var0, var8)) {
            int var10 = Class9679.method37782(var1, 1, var5);
            if (var1.nextInt(6) == 0) {
               var10 *= 2;
            }

            if (var1.nextInt(5) == 0) {
               var10 = 1;
            }

            method11280(var0, var1, var8, var10, 17, 25);
         }
      }
   }

   private static boolean method11279(Class1660 var0, Mutable var1) {
      while (true) {
         var1.method8381(0, -1, 0);
         if (!Class1655.method6720(var1)) {
            if (var0.method6738(var1).method23393()) {
               continue;
            }

            var1.method8381(0, 1, 0);
            return true;
         }

         return false;
      }
   }

   public static void method11280(Class1660 var0, Random var1, Mutable var2, int var3, int var4, int var5) {
      for (int var8 = 1; var8 <= var3; var8++) {
         if (var0.method7007(var2)) {
            if (var8 == var3 || !var0.method7007(var2.method8311())) {
               var0.method6725(
                  var2, Blocks.field37088.method11579().method23465(Class3452.field19267, Integer.valueOf(Class9679.method37782(var1, var4, var5))), 2
               );
               break;
            }

            var0.method6725(var2, Blocks.field37089.method11579(), 2);
         }

         var2.method8379(Direction.field673);
      }
   }

   private static boolean method11281(Class1660 var0, BlockPos var1) {
      if (!var0.method7007(var1)) {
         return true;
      } else {
         Class7380 var4 = var0.method6738(var1.method8313());
         return !var4.method23448(Blocks.NETHERRACK) && !var4.method23448(Blocks.field37074) && !var4.method23448(Blocks.field37076);
      }
   }
}

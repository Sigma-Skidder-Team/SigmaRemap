package remapped;

import java.util.Random;

public class class_5317 {
   private static String[] field_27122;

   public static boolean method_24256(class_2522 var0) {
      return var0.method_8345();
   }

   public static int method_24257(Random var0) {
      double var3 = 1.0;

      int var5;
      for (var5 = 0; var0.nextDouble() < var3; var5++) {
         var3 *= 0.826;
      }

      return var5;
   }
}

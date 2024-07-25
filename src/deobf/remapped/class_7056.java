package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_7056 extends class_4285<class_8342> {
   public class_7056(Codec<class_8342> var1) {
      super(var1);
   }

   public boolean method_32446(class_700 var1, class_6541 var2, Random var3, class_1331 var4, class_8342 var5) {
      return method_32447(var1, var3, var4, var5, 8, 4);
   }

   public static boolean method_32447(class_9379 var0, Random var1, class_1331 var2, class_8342 var3, int var4, int var5) {
      class_6414 var8 = var0.method_28262(var2.method_6100()).method_8360();
      if (var8.method_29299(class_2351.field_11769)) {
         int var9 = var2.method_12165();
         if (var9 >= 1 && var9 + 1 < 256) {
            int var10 = 0;

            for (int var11 = 0; var11 < var4 * var4; var11++) {
               class_1331 var12 = var2.method_6104(
                  var1.nextInt(var4) - var1.nextInt(var4), var1.nextInt(var5) - var1.nextInt(var5), var1.nextInt(var4) - var1.nextInt(var4)
               );
               class_2522 var13 = var3.field_42743.method_35002(var1, var12);
               if (var0.method_22548(var12) && var12.method_12165() > 0 && var13.method_8309(var0, var12)) {
                  var0.method_7513(var12, var13, 2);
                  var10++;
               }
            }

            return var10 > 0;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }
}

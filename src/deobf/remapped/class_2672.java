package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_2672 extends class_4285<class_1941> {
   public class_2672(Codec<class_1941> var1) {
      super(var1);
   }

   public boolean method_12037(class_700 var1, class_6541 var2, Random var3, class_1331 var4, class_1941 var5) {
      return method_12040(var1, var3, var4, 8, 4, 8);
   }

   public static boolean method_12040(class_9379 var0, Random var1, class_1331 var2, int var3, int var4, int var5) {
      if (!method_12039(var0, var2)) {
         method_12036(var0, var1, var2, var3, var4, var5);
         return true;
      } else {
         return false;
      }
   }

   private static void method_12036(class_9379 var0, Random var1, class_1331 var2, int var3, int var4, int var5) {
      class_2921 var8 = new class_2921();

      for (int var9 = 0; var9 < var3 * var3; var9++) {
         var8.method_13364(var2)
            .method_13367(class_9299.method_42824(var1, -var3, var3), class_9299.method_42824(var1, -var4, var4), class_9299.method_42824(var1, -var3, var3));
         if (method_12038(var0, var8) && !method_12039(var0, var8)) {
            int var10 = class_9299.method_42824(var1, 1, var5);
            if (var1.nextInt(6) == 0) {
               var10 *= 2;
            }

            if (var1.nextInt(5) == 0) {
               var10 = 1;
            }

            byte var11 = 17;
            byte var12 = 25;
            method_12041(var0, var1, var8, var10, 17, 25);
         }
      }
   }

   private static boolean method_12038(class_9379 var0, class_2921 var1) {
      while (true) {
         var1.method_13367(0, -1, 0);
         if (!World.method_29556(var1)) {
            if (var0.method_28262(var1).method_8345()) {
               continue;
            }

            var1.method_13367(0, 1, 0);
            return true;
         }

         return false;
      }
   }

   public static void method_12041(class_9379 var0, Random var1, class_2921 var2, int var3, int var4, int var5) {
      for (int var8 = 1; var8 <= var3; var8++) {
         if (var0.method_22548(var2)) {
            if (var8 == var3 || !var0.method_22548(var2.method_6081())) {
               var0.method_7513(
                  var2,
                  class_4783.field_23175.method_29260().method_10308(class_6408.field_32703, Integer.valueOf(class_9299.method_42824(var1, var4, var5))),
                  2
               );
               break;
            }

            var0.method_7513(var2, class_4783.field_23671.method_29260(), 2);
         }

         var2.method_13368(Direction.field_817);
      }
   }

   private static boolean method_12039(class_9379 var0, class_1331 var1) {
      if (!var0.method_22548(var1)) {
         return true;
      } else {
         class_2522 var4 = var0.method_28262(var1.method_6100());
         return !var4.method_8350(class_4783.field_23700) && !var4.method_8350(class_4783.field_23209) && !var4.method_8350(class_4783.field_23490);
      }
   }
}

package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_5836 extends class_4285<class_1941> {
   private static final Direction[] field_29681 = Direction.values();

   public class_5836(Codec<class_1941> var1) {
      super(var1);
   }

   public boolean method_26622(class_700 var1, class_6541 var2, Random var3, class_1331 var4, class_1941 var5) {
      if (var1.method_22548(var4)) {
         class_2522 var8 = var1.method_28262(var4.method_6081());
         if (!var8.method_8350(class_4783.field_23700) && !var8.method_8350(class_4783.field_23273)) {
            return false;
         } else {
            this.method_26624(var1, var3, var4);
            this.method_26623(var1, var3, var4);
            return true;
         }
      } else {
         return false;
      }
   }

   private void method_26624(class_9379 var1, Random var2, class_1331 var3) {
      var1.method_7513(var3, class_4783.field_23273.method_29260(), 2);
      class_2921 var6 = new class_2921();
      class_2921 var7 = new class_2921();

      for (int var8 = 0; var8 < 200; var8++) {
         var6.method_13360(var3, var2.nextInt(6) - var2.nextInt(6), var2.nextInt(2) - var2.nextInt(5), var2.nextInt(6) - var2.nextInt(6));
         if (var1.method_22548(var6)) {
            int var9 = 0;

            for (Direction var13 : field_29681) {
               class_2522 var14 = var1.method_28262(var7.method_13371(var6, var13));
               if (var14.method_8350(class_4783.field_23700) || var14.method_8350(class_4783.field_23273)) {
                  var9++;
               }

               if (var9 > 1) {
                  break;
               }
            }

            if (var9 == 1) {
               var1.method_7513(var6, class_4783.field_23273.method_29260(), 2);
            }
         }
      }
   }

   private void method_26623(class_9379 var1, Random var2, class_1331 var3) {
      class_2921 var6 = new class_2921();

      for (int var7 = 0; var7 < 100; var7++) {
         var6.method_13360(var3, var2.nextInt(8) - var2.nextInt(8), var2.nextInt(2) - var2.nextInt(7), var2.nextInt(8) - var2.nextInt(8));
         if (var1.method_22548(var6)) {
            class_2522 var8 = var1.method_28262(var6.method_6081());
            if (var8.method_8350(class_4783.field_23700) || var8.method_8350(class_4783.field_23273)) {
               int var9 = class_9299.method_42824(var2, 1, 8);
               if (var2.nextInt(6) == 0) {
                  var9 *= 2;
               }

               if (var2.nextInt(5) == 0) {
                  var9 = 1;
               }

               byte var10 = 17;
               byte var11 = 25;
               method_26625(var1, var2, var6, var9, 17, 25);
            }
         }
      }
   }

   public static void method_26625(class_9379 var0, Random var1, class_2921 var2, int var3, int var4, int var5) {
      for (int var8 = 0; var8 <= var3; var8++) {
         if (var0.method_22548(var2)) {
            if (var8 == var3 || !var0.method_22548(var2.method_6100())) {
               var0.method_7513(
                  var2,
                  class_4783.field_23405.method_29260().method_10308(class_6408.field_32703, Integer.valueOf(class_9299.method_42824(var1, var4, var5))),
                  2
               );
               break;
            }

            var0.method_7513(var2, class_4783.field_23288.method_29260(), 2);
         }

         var2.method_13368(Direction.field_802);
      }
   }
}

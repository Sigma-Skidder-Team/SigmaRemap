package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_2579 extends class_4285<class_1941> {
   private static final class_2263 field_12773 = class_2263.method_10400(class_4783.field_23216);
   private final class_2522 field_12775 = class_4783.field_23575.method_29260();
   private final class_2522 field_12774 = class_4783.field_23459.method_29260();
   private final class_2522 field_12772 = class_4783.field_23900.method_29260();

   public class_2579(Codec<class_1941> var1) {
      super(var1);
   }

   public boolean method_11743(class_700 var1, class_6541 var2, Random var3, BlockPos var4, class_1941 var5) {
      var4 = var4.method_6081();

      while (var1.method_22548(var4) && var4.getY() > 2) {
         var4 = var4.method_6100();
      }

      if (!field_12773.test(var1.method_28262(var4))) {
         return false;
      } else {
         for (int var8 = -2; var8 <= 2; var8++) {
            for (int var9 = -2; var9 <= 2; var9++) {
               if (var1.method_22548(var4.method_6104(var8, -1, var9)) && var1.method_22548(var4.method_6104(var8, -2, var9))) {
                  return false;
               }
            }
         }

         for (int var12 = -1; var12 <= 0; var12++) {
            for (int var17 = -2; var17 <= 2; var17++) {
               for (int var10 = -2; var10 <= 2; var10++) {
                  var1.method_7513(var4.method_6104(var17, var12, var10), this.field_12774, 2);
               }
            }
         }

         var1.method_7513(var4, this.field_12772, 2);

         for (Direction var18 : class_9594.field_48893) {
            var1.method_7513(var4.method_6098(var18), this.field_12772, 2);
         }

         for (int var14 = -2; var14 <= 2; var14++) {
            for (int var19 = -2; var19 <= 2; var19++) {
               if (var14 == -2 || var14 == 2 || var19 == -2 || var19 == 2) {
                  var1.method_7513(var4.method_6104(var14, 1, var19), this.field_12774, 2);
               }
            }
         }

         var1.method_7513(var4.method_6104(2, 1, 0), this.field_12775, 2);
         var1.method_7513(var4.method_6104(-2, 1, 0), this.field_12775, 2);
         var1.method_7513(var4.method_6104(0, 1, 2), this.field_12775, 2);
         var1.method_7513(var4.method_6104(0, 1, -2), this.field_12775, 2);

         for (int var15 = -1; var15 <= 1; var15++) {
            for (int var20 = -1; var20 <= 1; var20++) {
               if (var15 == 0 && var20 == 0) {
                  var1.method_7513(var4.method_6104(var15, 4, var20), this.field_12774, 2);
               } else {
                  var1.method_7513(var4.method_6104(var15, 4, var20), this.field_12775, 2);
               }
            }
         }

         for (int var16 = 1; var16 <= 3; var16++) {
            var1.method_7513(var4.method_6104(-1, var16, -1), this.field_12774, 2);
            var1.method_7513(var4.method_6104(-1, var16, 1), this.field_12774, 2);
            var1.method_7513(var4.method_6104(1, var16, -1), this.field_12774, 2);
            var1.method_7513(var4.method_6104(1, var16, 1), this.field_12774, 2);
         }

         return true;
      }
   }
}

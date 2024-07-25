package remapped;

import java.util.List;
import java.util.Random;

public final class class_9321 implements class_7123 {
   public boolean field_47599;

   @Override
   public void method_32728() {
      this.field_47599 = false;
   }

   @Override
   public boolean method_32727(class_5799 var1, int var2, class_9185 var3, class_1331 var4, List<class_7060> var5, Random var6) {
      class_6631 var9 = var3.field_41650.method_39056();
      int var10 = var6.nextInt(4) + 1;
      class_9185 var11 = class_8582.method_39464(var5, class_8582.method_39476(var1, var3, new class_1331(0, 0, -4), "bridge_piece", var9, true));
      var11.field_36441 = -1;
      byte var12 = 0;

      for (int var13 = 0; var13 < var10; var13++) {
         if (!var6.nextBoolean()) {
            if (!var6.nextBoolean()) {
               var11 = class_8582.method_39464(var5, class_8582.method_39476(var1, var11, new class_1331(0, var12, -8), "bridge_gentle_stairs", var9, true));
            } else {
               var11 = class_8582.method_39464(var5, class_8582.method_39476(var1, var11, new class_1331(0, var12, -4), "bridge_steep_stairs", var9, true));
            }

            var12 = 4;
         } else {
            var11 = class_8582.method_39464(var5, class_8582.method_39476(var1, var11, new class_1331(0, var12, -4), "bridge_piece", var9, true));
            var12 = 0;
         }
      }

      if (!this.field_47599 && var6.nextInt(10 - var2) == 0) {
         class_8582.method_39464(
            var5, class_8582.method_39476(var1, var11, new class_1331(-8 + var6.nextInt(8), var12, -70 + var6.nextInt(10)), "ship", var9, true)
         );
         this.field_47599 = true;
      } else if (!class_8582.method_39471(var1, class_8582.method_39469(), var2 + 1, var11, new class_1331(-3, var12 + 1, -11), var5, var6)) {
         return false;
      }

      var11 = class_8582.method_39464(
         var5, class_8582.method_39476(var1, var11, new class_1331(4, var12, 0), "bridge_end", var9.method_30486(class_6631.field_34338), true)
      );
      var11.field_36441 = -1;
      return true;
   }
}

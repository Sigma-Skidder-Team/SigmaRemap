package remapped;

import java.util.List;
import java.util.Random;

public final class class_4846 implements class_7123 {
   @Override
   public void method_32728() {
   }

   @Override
   public boolean method_32727(class_5799 var1, int var2, class_9185 var3, BlockPos var4, List<class_7060> var5, Random var6) {
      class_6631 var9 = var3.field_41650.method_39056();
      class_9185 var10 = class_8582.method_39464(
         var5, class_8582.method_39476(var1, var3, new BlockPos(3 + var6.nextInt(2), -3, 3 + var6.nextInt(2)), "tower_base", var9, true)
      );
      var10 = class_8582.method_39464(var5, class_8582.method_39476(var1, var10, new BlockPos(0, 7, 0), "tower_piece", var9, true));
      class_9185 var11 = var6.nextInt(3) != 0 ? null : var10;
      int var12 = 1 + var6.nextInt(3);

      for (int var13 = 0; var13 < var12; var13++) {
         var10 = class_8582.method_39464(var5, class_8582.method_39476(var1, var10, new BlockPos(0, 4, 0), "tower_piece", var9, true));
         if (var13 < var12 - 1 && var6.nextBoolean()) {
            var11 = var10;
         }
      }

      if (var11 == null) {
         if (var2 != 7) {
            return class_8582.method_39471(var1, class_8582.method_39463(), var2 + 1, var10, (BlockPos)null, var5, var6);
         }

         class_8582.method_39464(var5, class_8582.method_39476(var1, var10, new BlockPos(-1, 4, -1), "tower_top", var9, true));
      } else {
         for (class_947 var14 : class_8582.method_39477()) {
            if (var6.nextBoolean()) {
               class_9185 var15 = class_8582.method_39464(
                  var5,
                  class_8582.method_39476(var1, var11, (BlockPos)var14.method_4142(), "bridge_end", var9.method_30486((class_6631)var14.method_4141()), true)
               );
               class_8582.method_39471(var1, class_8582.method_39468(), var2 + 1, var15, (BlockPos)null, var5, var6);
            }
         }

         class_8582.method_39464(var5, class_8582.method_39476(var1, var10, new BlockPos(-1, 4, -1), "tower_top", var9, true));
      }

      return true;
   }
}

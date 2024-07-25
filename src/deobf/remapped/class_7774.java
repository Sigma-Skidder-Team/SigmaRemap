package remapped;

import java.util.List;
import java.util.Random;

public final class class_7774 implements class_7123 {
   @Override
   public void method_32728() {
   }

   @Override
   public boolean method_32727(class_5799 var1, int var2, class_9185 var3, BlockPos var4, List<class_7060> var5, Random var6) {
      if (var2 <= 8) {
         class_6631 var9 = var3.field_41650.method_39056();
         class_9185 var10 = class_8582.method_39464(var5, class_8582.method_39476(var1, var3, var4, "base_floor", var9, true));
         int var11 = var6.nextInt(3);
         if (var11 != 0) {
            if (var11 != 1) {
               if (var11 == 2) {
                  var10 = class_8582.method_39464(var5, class_8582.method_39476(var1, var10, new BlockPos(-1, 0, -1), "second_floor_2", var9, false));
                  var10 = class_8582.method_39464(var5, class_8582.method_39476(var1, var10, new BlockPos(-1, 4, -1), "third_floor_2", var9, false));
                  var10 = class_8582.method_39464(var5, class_8582.method_39476(var1, var10, new BlockPos(-1, 8, -1), "third_roof", var9, true));
                  class_8582.method_39471(var1, class_8582.method_39470(), var2 + 1, var10, (BlockPos)null, var5, var6);
               }
            } else {
               var10 = class_8582.method_39464(var5, class_8582.method_39476(var1, var10, new BlockPos(-1, 0, -1), "second_floor_2", var9, false));
               var10 = class_8582.method_39464(var5, class_8582.method_39476(var1, var10, new BlockPos(-1, 8, -1), "second_roof", var9, false));
               class_8582.method_39471(var1, class_8582.method_39470(), var2 + 1, var10, (BlockPos)null, var5, var6);
            }
         } else {
            class_8582.method_39464(var5, class_8582.method_39476(var1, var10, new BlockPos(-1, 4, -1), "base_roof", var9, true));
         }

         return true;
      } else {
         return false;
      }
   }
}

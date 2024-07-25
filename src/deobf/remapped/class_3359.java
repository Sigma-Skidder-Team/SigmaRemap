package remapped;

import java.util.List;
import java.util.Random;

public final class class_3359 implements class_7123 {
   @Override
   public void method_32728() {
   }

   @Override
   public boolean method_32727(class_5799 var1, int var2, class_9185 var3, class_1331 var4, List<class_7060> var5, Random var6) {
      class_6631 var9 = var3.field_41650.method_39056();
      class_9185 var10 = class_8582.method_39464(var5, class_8582.method_39476(var1, var3, new class_1331(-3, 4, -3), "fat_tower_base", var9, true));
      var10 = class_8582.method_39464(var5, class_8582.method_39476(var1, var10, new class_1331(0, 4, 0), "fat_tower_middle", var9, true));

      for (int var11 = 0; var11 < 2 && var6.nextInt(3) != 0; var11++) {
         var10 = class_8582.method_39464(var5, class_8582.method_39476(var1, var10, new class_1331(0, 8, 0), "fat_tower_middle", var9, true));

         for (class_947 var13 : class_8582.method_39474()) {
            if (var6.nextBoolean()) {
               class_9185 var14 = class_8582.method_39464(
                  var5,
                  class_8582.method_39476(var1, var10, (class_1331)var13.method_4142(), "bridge_end", var9.method_30486((class_6631)var13.method_4141()), true)
               );
               class_8582.method_39471(var1, class_8582.method_39468(), var2 + 1, var14, (class_1331)null, var5, var6);
            }
         }
      }

      class_8582.method_39464(var5, class_8582.method_39476(var1, var10, new class_1331(-2, 8, -2), "fat_tower_top", var9, true));
      return true;
   }
}

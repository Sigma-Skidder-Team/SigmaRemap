package mapped;

import java.util.List;
import java.util.Random;

public final class Class8014 implements Class8015 {
   @Override
   public void method27400() {
   }

   @Override
   public boolean method27401(Class8761 var1, int var2, Class4186 var3, BlockPos var4, List<Class4178> var5, Random var6) {
      Class80 var9 = var3.field20454.method36437();
      Class4186 var10 = Class9489.method36644(var5, Class9489.method36643(var1, var3, new BlockPos(-3, 4, -3), "fat_tower_base", var9, true));
      var10 = Class9489.method36644(var5, Class9489.method36643(var1, var10, new BlockPos(0, 4, 0), "fat_tower_middle", var9, true));

      for (int var11 = 0; var11 < 2 && var6.nextInt(3) != 0; var11++) {
         var10 = Class9489.method36644(var5, Class9489.method36643(var1, var10, new BlockPos(0, 8, 0), "fat_tower_middle", var9, true));

         for (Class6793 var13 : Class9489.method36651()) {
            if (var6.nextBoolean()) {
               Class4186 var14 = Class9489.method36644(
                  var5, Class9489.method36643(var1, var10, (BlockPos)var13.method20693(), "bridge_end", var9.method250((Class80)var13.method20692()), true)
               );
               Class9489.method36646(var1, Class9489.method36648(), var2 + 1, var14, (BlockPos)null, var5, var6);
            }
         }
      }

      Class9489.method36644(var5, Class9489.method36643(var1, var10, new BlockPos(-2, 8, -2), "fat_tower_top", var9, true));
      return true;
   }
}

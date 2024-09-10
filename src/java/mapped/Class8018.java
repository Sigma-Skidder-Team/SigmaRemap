package mapped;

import net.minecraft.util.math.BlockPos;

import java.util.List;
import java.util.Random;

public final class Class8018 implements Class8015 {
   @Override
   public void method27400() {
   }

   @Override
   public boolean method27401(TemplateManager var1, int var2, Class4186 var3, BlockPos var4, List<Class4178> var5, Random var6) {
      if (var2 <= 8) {
         Class80 var9 = var3.field20454.method36437();
         Class4186 var10 = Class9489.method36644(var5, Class9489.method36643(var1, var3, var4, "base_floor", var9, true));
         int var11 = var6.nextInt(3);
         if (var11 != 0) {
            if (var11 != 1) {
               if (var11 == 2) {
                  var10 = Class9489.method36644(var5, Class9489.method36643(var1, var10, new BlockPos(-1, 0, -1), "second_floor_2", var9, false));
                  var10 = Class9489.method36644(var5, Class9489.method36643(var1, var10, new BlockPos(-1, 4, -1), "third_floor_2", var9, false));
                  var10 = Class9489.method36644(var5, Class9489.method36643(var1, var10, new BlockPos(-1, 8, -1), "third_roof", var9, true));
                  Class9489.method36646(var1, Class9489.method36645(), var2 + 1, var10, (BlockPos)null, var5, var6);
               }
            } else {
               var10 = Class9489.method36644(var5, Class9489.method36643(var1, var10, new BlockPos(-1, 0, -1), "second_floor_2", var9, false));
               var10 = Class9489.method36644(var5, Class9489.method36643(var1, var10, new BlockPos(-1, 8, -1), "second_roof", var9, false));
               Class9489.method36646(var1, Class9489.method36645(), var2 + 1, var10, (BlockPos)null, var5, var6);
            }
         } else {
            Class9489.method36644(var5, Class9489.method36643(var1, var10, new BlockPos(-1, 4, -1), "base_roof", var9, true));
         }

         return true;
      } else {
         return false;
      }
   }
}

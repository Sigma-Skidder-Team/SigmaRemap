package mapped;

import net.minecraft.util.math.BlockPos;

import java.util.List;
import java.util.Random;

public final class Class8017 implements Class8015 {
   @Override
   public void method27400() {
   }

   @Override
   public boolean method27401(TemplateManager var1, int var2, Class4186 var3, BlockPos var4, List<Class4178> var5, Random var6) {
      Class80 var9 = var3.field20454.method36437();
      Class4186 var10 = Class9489.method36644(
         var5, Class9489.method36643(var1, var3, new BlockPos(3 + var6.nextInt(2), -3, 3 + var6.nextInt(2)), "tower_base", var9, true)
      );
      var10 = Class9489.method36644(var5, Class9489.method36643(var1, var10, new BlockPos(0, 7, 0), "tower_piece", var9, true));
      Class4186 var11 = var6.nextInt(3) != 0 ? null : var10;
      int var12 = 1 + var6.nextInt(3);

      for (int var13 = 0; var13 < var12; var13++) {
         var10 = Class9489.method36644(var5, Class9489.method36643(var1, var10, new BlockPos(0, 4, 0), "tower_piece", var9, true));
         if (var13 < var12 - 1 && var6.nextBoolean()) {
            var11 = var10;
         }
      }

      if (var11 == null) {
         if (var2 != 7) {
            return Class9489.method36646(var1, Class9489.method36649(), var2 + 1, var10, (BlockPos)null, var5, var6);
         }

         Class9489.method36644(var5, Class9489.method36643(var1, var10, new BlockPos(-1, 4, -1), "tower_top", var9, true));
      } else {
         for (Class6793 var14 : Class9489.method36647()) {
            if (var6.nextBoolean()) {
               Class4186 var15 = Class9489.method36644(
                  var5, Class9489.method36643(var1, var11, (BlockPos)var14.method20693(), "bridge_end", var9.method250((Class80)var14.method20692()), true)
               );
               Class9489.method36646(var1, Class9489.method36648(), var2 + 1, var15, (BlockPos)null, var5, var6);
            }
         }

         Class9489.method36644(var5, Class9489.method36643(var1, var10, new BlockPos(-1, 4, -1), "tower_top", var9, true));
      }

      return true;
   }
}

package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

public final class Class6232 extends Class6230 {
   private static String[] field27727;

   @Override
   public ItemStack method19192(Class2956 var1, ItemStack var2) {
      Direction var5 = var1.method11324().<Direction>method23463(Class3357.field18899);
      BlockPos var6 = var1.method11323().method8349(var5);
      ServerWorld var7 = var1.method11326();
      BlockState var8 = var7.getBlockState(var6);
      this.method19204(true);
      if (!var8.isIn(Blocks.field37124)) {
         return super.method19192(var1, var2);
      } else {
         if (var8.<Integer>method23463(Class3389.field19000) == 4) {
            this.method19204(false);
         } else {
            Class3389.method11989(var7, var6, var8);
            var2.method32182(1);
         }

         return var2;
      }
   }
}

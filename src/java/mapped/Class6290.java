package mapped;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

public class Class6290 extends Class6272<Class4715> {
   public Class6290(Codec<Class4715> var1) {
      super(var1);
   }

   public Stream<BlockPos> method19240(Class9010 var1, Random var2, Class4715 var3, BlockPos var4) {
      ArrayList var7 = Lists.newArrayList();
      int var8 = 0;

      boolean var9;
      do {
         var9 = false;

         for (int var10 = 0; var10 < var3.method14807().method27633(var2); var10++) {
            int var11 = var2.nextInt(16) + var4.getX();
            int var12 = var2.nextInt(16) + var4.getZ();
            int var13 = var1.method33296(Class101.field299, var11, var12);
            int var14 = method19253(var1, var11, var13, var12, var8);
            if (var14 != Integer.MAX_VALUE) {
               var7.add(new BlockPos(var11, var14, var12));
               var9 = true;
            }
         }

         var8++;
      } while (var9);

      return var7.stream();
   }

   private static int method19253(Class9010 var0, int var1, int var2, int var3, int var4) {
      Mutable var7 = new Mutable(var1, var2, var3);
      int var8 = 0;
      BlockState var9 = var0.method33300(var7);

      for (int var10 = var2; var10 >= 1; var10--) {
         var7.method8308(var10 - 1);
         BlockState var11 = var0.method33300(var7);
         if (!method19254(var11) && method19254(var9) && !var11.method23448(Blocks.BEDROCK)) {
            if (var8 == var4) {
               return var7.getY() + 1;
            }

            var8++;
         }

         var9 = var11;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean method19254(BlockState var0) {
      return var0.isAir() || var0.method23448(Blocks.WATER) || var0.method23448(Blocks.LAVA);
   }
}

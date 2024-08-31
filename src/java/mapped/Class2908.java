package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class Class2908 extends Class2898<Class4738> {
   private static final ImmutableList<Block> field17991 = ImmutableList.of(
      Blocks.BEDROCK, Blocks.NETHER_BRICKS, Blocks.NETHER_BRICK_FENCE, Blocks.NETHER_BRICK_STAIRS, Blocks.NETHER_WART, Blocks.CHEST, Blocks.field36532
   );
   private static final Direction[] field17992 = Direction.values();

   public Class2908(Codec<Class4738> var1) {
      super(var1);
   }

   public boolean method11213(Class1658 var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4738 var5) {
      boolean var8 = false;
      boolean var9 = var3.nextDouble() < 0.9;
      int var10 = !var9 ? 0 : var5.method14877().method27633(var3);
      int var11 = !var9 ? 0 : var5.method14877().method27633(var3);
      boolean var12 = var9 && var10 != 0 && var11 != 0;
      int var13 = var5.method14876().method27633(var3);
      int var14 = var5.method14876().method27633(var3);
      int var15 = Math.max(var13, var14);

      for (BlockPos var17 : BlockPos.method8356(var4, var13, 0, var14)) {
         if (var17.method8321(var4) > var15) {
            break;
         }

         if (method11247(var1, var17, var5)) {
            if (var12) {
               var8 = true;
               this.method11217(var1, var17, var5.method14875());
            }

            BlockPos var18 = var17.method8336(var10, 0, var11);
            if (method11247(var1, var18, var5)) {
               var8 = true;
               this.method11217(var1, var18, var5.method14874());
            }
         }
      }

      return var8;
   }

   private static boolean method11247(Class1660 var0, BlockPos var1, Class4738 var2) {
      BlockState var5 = var0.getBlockState(var1);
      if (var5.method23448(var2.method14874().getBlock())) {
         return false;
      } else if (field17991.contains(var5.getBlock())) {
         return false;
      } else {
         for (Direction var9 : field17992) {
            boolean var10 = var0.getBlockState(var1.method8349(var9)).isAir();
            if (var10 && var9 != Direction.field673 || !var10 && var9 == Direction.field673) {
               return false;
            }
         }

         return true;
      }
   }
}

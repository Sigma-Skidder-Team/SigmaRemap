package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

import javax.annotation.Nullable;

public class Class6878 {
   private static String[] field29818;

   @Nullable
   public static BlockPos method20940(ServerWorld var0, int var1, int var2, boolean var3) {
      Mutable var6 = new Mutable(var1, 0, var2);
      Biome var7 = var0.getBiome(var6);
      boolean var8 = var0.method6812().getHasCeiling();
      BlockState var9 = var7.method32507().method24283().method28934();
      if (var3 && !var9.getBlock().method11540(BlockTags.field32780)) {
         return null;
      } else {
         Chunk var10 = var0.getChunk(var1 >> 4, var2 >> 4);
         int var11 = !var8 ? var10.method7071(Class101.field299, var1 & 15, var2 & 15) : var0.getChunkProvider().method7370().method17823();
         if (var11 < 0) {
            return null;
         } else {
            int var12 = var10.method7071(Class101.field296, var1 & 15, var2 & 15);
            if (var12 <= var11 && var12 > var10.method7071(Class101.field298, var1 & 15, var2 & 15)) {
               return null;
            } else {
               for (int var13 = var11 + 1; var13 >= 0; var13--) {
                  var6.method8372(var1, var13, var2);
                  BlockState var14 = var0.getBlockState(var6);
                  if (!var14.method23449().method23474()) {
                     break;
                  }

                  if (var14.equals(var9)) {
                     return var6.up().method8353();
                  }
               }

               return null;
            }
         }
      }
   }

   @Nullable
   public static BlockPos method20941(ServerWorld var0, Class7481 var1, boolean var2) {
      for (int var5 = var1.method24356(); var5 <= var1.method24358(); var5++) {
         for (int var6 = var1.method24357(); var6 <= var1.method24359(); var6++) {
            BlockPos var7 = method20940(var0, var5, var6, var2);
            if (var7 != null) {
               return var7;
            }
         }
      }

      return null;
   }
}

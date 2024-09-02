package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;

import java.util.Random;

public class Class2899 extends Class2898<Class4699> {
   private static String[] field17989;

   public Class2899(Codec<Class4699> var1) {
      super(var1);
   }

   public boolean method11213(ISeedReader var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4699 var5) {
      boolean var8 = false;
      int var9 = var5.field22293.method27633(var3);

      for (int var10 = var4.getX() - var9; var10 <= var4.getX() + var9; var10++) {
         for (int var11 = var4.getZ() - var9; var11 <= var4.getZ() + var9; var11++) {
            int var12 = var10 - var4.getX();
            int var13 = var11 - var4.getZ();
            if (var12 * var12 + var13 * var13 <= var9 * var9) {
               for (int var14 = var4.getY() - var5.field22294; var14 <= var4.getY() + var5.field22294; var14++) {
                  BlockPos var15 = new BlockPos(var10, var14, var11);
                  Block var16 = var1.getBlockState(var15).getBlock();

                  for (BlockState var18 : var5.field22295) {
                     if (var18.method23448(var16)) {
                        var1.setBlockState(var15, var5.field22292, 2);
                        var8 = true;
                        break;
                     }
                  }
               }
            }
         }
      }

      return var8;
   }
}

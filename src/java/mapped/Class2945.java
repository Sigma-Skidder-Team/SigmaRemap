package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;

import java.util.Random;

public class Class2945 extends Class2898<Class4728> {
   public Class2945(Codec<Class4728> var1) {
      super(var1);
   }

   public boolean method11213(ISeedReader var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4728 var5) {
      boolean var8 = false;
      int var9 = var3.nextInt(8) - var3.nextInt(8);
      int var10 = var3.nextInt(8) - var3.nextInt(8);
      int var11 = var1.method6736(Heightmap.Type.field298, var4.getX() + var9, var4.getZ() + var10);
      BlockPos var12 = new BlockPos(var4.getX() + var9, var11, var4.getZ() + var10);
      if (var1.getBlockState(var12).isIn(Blocks.WATER)) {
         boolean var13 = var3.nextDouble() < (double)var5.field22399;
         BlockState var14 = !var13 ? Blocks.SEAGRASS.method11579() : Blocks.TALL_SEAGRASS.method11579();
         if (var14.method23443(var1, var12)) {
            if (!var13) {
               var1.setBlockState(var12, var14, 2);
            } else {
               BlockState var15 = var14.with(Class3455.field19274, DoubleBlockHalf.field209);
               BlockPos var16 = var12.up();
               if (var1.getBlockState(var16).isIn(Blocks.WATER)) {
                  var1.setBlockState(var12, var14, 2);
                  var1.setBlockState(var16, var15, 2);
               }
            }

            var8 = true;
         }
      }

      return var8;
   }
}

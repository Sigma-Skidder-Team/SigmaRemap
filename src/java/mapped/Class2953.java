package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;

import java.util.Random;

public class Class2953 extends Class2898<Class4712> {
   public Class2953(Codec<Class4712> var1) {
      super(var1);
   }

   public boolean method11213(ISeedReader var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4712 var5) {
      if (!var1.method7007(var4)) {
         return false;
      } else {
         BlockState var8 = var1.getBlockState(var4.up());
         if (!var8.isIn(Blocks.NETHERRACK) && !var8.isIn(Blocks.BASALT) && !var8.isIn(Blocks.field37130)) {
            return false;
         } else {
            var1.setBlockState(var4, Blocks.GLOWSTONE.getDefaultState(), 2);

            for (int var9 = 0; var9 < 1500; var9++) {
               BlockPos var10 = var4.add(var3.nextInt(8) - var3.nextInt(8), -var3.nextInt(12), var3.nextInt(8) - var3.nextInt(8));
               if (var1.getBlockState(var10).isAir()) {
                  int var11 = 0;

                  for (Direction var15 : Direction.values()) {
                     if (var1.getBlockState(var10.offset(var15)).isIn(Blocks.GLOWSTONE)) {
                        var11++;
                     }

                     if (var11 > 1) {
                        break;
                     }
                  }

                  if (var11 == 1) {
                     var1.setBlockState(var10, Blocks.GLOWSTONE.getDefaultState(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}

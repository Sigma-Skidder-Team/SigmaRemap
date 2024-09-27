package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;

import java.util.Random;

public class Class2923 extends Class2898<Class4710> {
   public Class2923(Codec<Class4710> var1) {
      super(var1);
   }

   public boolean method11213(ISeedReader var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4710 var5) {
      if (var4.getY() >= 5) {
         int var8 = 2 + var3.nextInt(2);
         int var9 = 2 + var3.nextInt(2);

         for (BlockPos var11 : BlockPos.method8359(var4.method8336(-var8, 0, -var9), var4.method8336(var8, 1, var9))) {
            int var12 = var4.getX() - var11.getX();
            int var13 = var4.getZ() - var11.getZ();
            if (!((float)(var12 * var12 + var13 * var13) <= var3.nextFloat() * 10.0F - var3.nextFloat() * 6.0F)) {
               if ((double)var3.nextFloat() < 0.031) {
                  this.method11256(var1, var11, var3, var5);
               }
            } else {
               this.method11256(var1, var11, var3, var5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean method11255(Class1660 var1, BlockPos var2, Random var3) {
      BlockPos var6 = var2.down();
      BlockState var7 = var1.getBlockState(var6);
      return !var7.isIn(Blocks.field36885) ? var7.method23454(var1, var6, Direction.field673) : var3.nextBoolean();
   }

   private void method11256(Class1660 var1, BlockPos var2, Random var3, Class4710 var4) {
      if (var1.method7007(var2) && this.method11255(var1, var2, var3)) {
         var1.setBlockState(var2, var4.field22343.method20424(var3, var2), 4);
      }
   }
}

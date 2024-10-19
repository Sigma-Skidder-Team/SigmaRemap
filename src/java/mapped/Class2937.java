package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.gen.ChunkGenerator;

import java.util.Random;

public class Class2937 extends Class2898<Class4712> {
   public Class2937(Codec<Class4712> var1) {
      super(var1);
   }

   public boolean method11213(ISeedReader var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4712 var5) {
      return method11277(var1, var3, var4, 8, 4, 8);
   }

   public static boolean method11277(IWorld var0, Random var1, BlockPos var2, int var3, int var4, int var5) {
      if (!method11281(var0, var2)) {
         method11278(var0, var1, var2, var3, var4, var5);
         return true;
      } else {
         return false;
      }
   }

   private static void method11278(IWorld var0, Random var1, BlockPos var2, int var3, int var4, int var5) {
      BlockPos.Mutable var8 = new BlockPos.Mutable();

      for (int var9 = 0; var9 < var3 * var3; var9++) {
         var8.method8374(var2)
            .method8381(MathHelper.method37782(var1, -var3, var3), MathHelper.method37782(var1, -var4, var4), MathHelper.method37782(var1, -var3, var3));
         if (method11279(var0, var8) && !method11281(var0, var8)) {
            int var10 = MathHelper.method37782(var1, 1, var5);
            if (var1.nextInt(6) == 0) {
               var10 *= 2;
            }

            if (var1.nextInt(5) == 0) {
               var10 = 1;
            }

            method11280(var0, var1, var8, var10, 17, 25);
         }
      }
   }

   private static boolean method11279(IWorld var0, BlockPos.Mutable var1) {
      while (true) {
         var1.method8381(0, -1, 0);
         if (!World.isOutsideBuildHeight(var1)) {
            if (var0.getBlockState(var1).isAir()) {
               continue;
            }

            var1.method8381(0, 1, 0);
            return true;
         }

         return false;
      }
   }

   public static void method11280(IWorld var0, Random var1, BlockPos.Mutable var2, int var3, int var4, int var5) {
      for (int var8 = 1; var8 <= var3; var8++) {
         if (var0.method7007(var2)) {
            if (var8 == var3 || !var0.method7007(var2.up())) {
               var0.setBlockState(
                  var2, Blocks.field37088.getDefaultState().with(Class3452.field19267, Integer.valueOf(MathHelper.method37782(var1, var4, var5))), 2
               );
               break;
            }

            var0.setBlockState(var2, Blocks.field37089.getDefaultState(), 2);
         }

         var2.method8379(Direction.UP);
      }
   }

   private static boolean method11281(IWorld var0, BlockPos var1) {
      if (!var0.method7007(var1)) {
         return true;
      } else {
         BlockState var4 = var0.getBlockState(var1.down());
         return !var4.isIn(Blocks.NETHERRACK) && !var4.isIn(Blocks.field37074) && !var4.isIn(Blocks.field37076);
      }
   }
}

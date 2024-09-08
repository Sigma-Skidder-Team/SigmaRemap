package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;

import java.util.Random;

public class Class2949 extends Class2898<Class4712> {
   private static final Direction[] field18026 = Direction.values();

   public Class2949(Codec<Class4712> var1) {
      super(var1);
   }

   public boolean method11213(ISeedReader var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4712 var5) {
      if (var1.method7007(var4)) {
         BlockState var8 = var1.getBlockState(var4.up());
         if (!var8.method23448(Blocks.NETHERRACK) && !var8.method23448(Blocks.field36891)) {
            return false;
         } else {
            this.method11289(var1, var3, var4);
            this.method11290(var1, var3, var4);
            return true;
         }
      } else {
         return false;
      }
   }

   private void method11289(Class1660 var1, Random var2, BlockPos var3) {
      var1.setBlockState(var3, Blocks.field36891.method11579(), 2);
      BlockPos.Mutable var6 = new BlockPos.Mutable();
      BlockPos.Mutable var7 = new BlockPos.Mutable();

      for (int var8 = 0; var8 < 200; var8++) {
         var6.method8378(var3, var2.nextInt(6) - var2.nextInt(6), var2.nextInt(2) - var2.nextInt(5), var2.nextInt(6) - var2.nextInt(6));
         if (var1.method7007(var6)) {
            int var9 = 0;

            for (Direction var13 : field18026) {
               BlockState var14 = var1.getBlockState(var7.method8377(var6, var13));
               if (var14.method23448(Blocks.NETHERRACK) || var14.method23448(Blocks.field36891)) {
                  var9++;
               }

               if (var9 > 1) {
                  break;
               }
            }

            if (var9 == 1) {
               var1.setBlockState(var6, Blocks.field36891.method11579(), 2);
            }
         }
      }
   }

   private void method11290(Class1660 var1, Random var2, BlockPos var3) {
      BlockPos.Mutable var6 = new BlockPos.Mutable();

      for (int var7 = 0; var7 < 100; var7++) {
         var6.method8378(var3, var2.nextInt(8) - var2.nextInt(8), var2.nextInt(2) - var2.nextInt(7), var2.nextInt(8) - var2.nextInt(8));
         if (var1.method7007(var6)) {
            BlockState var8 = var1.getBlockState(var6.up());
            if (var8.method23448(Blocks.NETHERRACK) || var8.method23448(Blocks.field36891)) {
               int var9 = MathHelper.method37782(var2, 1, 8);
               if (var2.nextInt(6) == 0) {
                  var9 *= 2;
               }

               if (var2.nextInt(5) == 0) {
                  var9 = 1;
               }


               method11291(var1, var2, var6, var9, 17, 25);
            }
         }
      }
   }

   public static void method11291(Class1660 var0, Random var1, BlockPos.Mutable var2, int var3, int var4, int var5) {
      for (int var8 = 0; var8 <= var3; var8++) {
         if (var0.method7007(var2)) {
            if (var8 == var3 || !var0.method7007(var2.down())) {
               var0.setBlockState(
                  var2, Blocks.field37086.method11579().method23465(Class3452.field19267, Integer.valueOf(MathHelper.method37782(var1, var4, var5))), 2
               );
               break;
            }

            var0.setBlockState(var2, Blocks.field37087.method11579(), 2);
         }

         var2.method8379(Direction.DOWN);
      }
   }
}

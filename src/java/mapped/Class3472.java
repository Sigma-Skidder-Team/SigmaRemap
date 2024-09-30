package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.lighting.LightEngine;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public abstract class Class3472 extends Class3471 {
   public Class3472(Properties var1) {
      super(var1);
   }

   private static boolean method12160(BlockState var0, IWorldReader var1, BlockPos var2) {
      BlockPos var5 = var2.up();
      BlockState var6 = var1.getBlockState(var5);
      if (var6.isIn(Blocks.SNOW) && var6.<Integer>get(Class3410.field19092) == 1) {
         return true;
      } else if (var6.method23449().method23477() != 8) {
         int var7 = LightEngine.func_215613_a(var1, var0, var2, var6, var5, Direction.UP, var6.getOpacity(var1, var5));
         return var7 < var1.getMaxLightLevel();
      } else {
         return false;
      }
   }

   private static boolean method12161(BlockState var0, IWorldReader var1, BlockPos var2) {
      BlockPos var5 = var2.up();
      return method12160(var0, var1, var2) && !var1.getFluidState(var5).method23486(FluidTags.field40469);
   }

   @Override
   public void randomTick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (method12160(var1, var2, var3)) {
         if (var2.method7015(var3.up()) >= 9) {
            BlockState var7 = this.getDefaultState();

            for (int var8 = 0; var8 < 4; var8++) {
               BlockPos var9 = var3.method8336(var4.nextInt(3) - 1, var4.nextInt(5) - 3, var4.nextInt(3) - 1);
               if (var2.getBlockState(var9).isIn(Blocks.DIRT) && method12161(var7, var2, var9)) {
                  var2.setBlockState(var9, var7.with(field19323, Boolean.valueOf(var2.getBlockState(var9.up()).isIn(Blocks.SNOW))));
               }
            }
         }
      } else {
         var2.setBlockState(var3, Blocks.DIRT.getDefaultState());
      }
   }
}

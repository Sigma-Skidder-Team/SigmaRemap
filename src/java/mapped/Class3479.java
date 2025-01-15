package mapped;

import net.minecraft.block.*;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class Class3479 extends BushBlock implements IGrowable {
   private static String[] field18470;
   public static final VoxelShape field19332 = Block.makeCuboidShape(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);

   public Class3479(Properties var1) {
      super(var1);
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field19332;
   }

   @Override
   public void randomTick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (var4.nextInt(25) == 0) {
         int var7 = 5;
         byte var8 = 4;

         for (BlockPos var10 : BlockPos.method8359(var3.add(-4, -1, -4), var3.add(4, 1, 4))) {
            if (var2.getBlockState(var10).isIn(this)) {
               if (--var7 <= 0) {
                  return;
               }
            }
         }

         BlockPos var11 = var3.add(var4.nextInt(3) - 1, var4.nextInt(2) - var4.nextInt(2), var4.nextInt(3) - 1);

         for (int var12 = 0; var12 < 4; var12++) {
            if (var2.method7007(var11) && var1.isValidPosition(var2, var11)) {
               var3 = var11;
            }

            var11 = var3.add(var4.nextInt(3) - 1, var4.nextInt(2) - var4.nextInt(2), var4.nextInt(3) - 1);
         }

         if (var2.method7007(var11) && var1.isValidPosition(var2, var11)) {
            var2.setBlockState(var11, var1, 2);
         }
      }
   }

   @Override
   public boolean isValidGround(BlockState state, IBlockReader var2, BlockPos var3) {
      return state.method23409(var2, var3);
   }

   @Override
   public boolean isValidPosition(BlockState var1, IWorldReader var2, BlockPos var3) {
      BlockPos var6 = var3.down();
      BlockState var7 = var2.getBlockState(var6);
      return var7.isIn(BlockTags.field32814) ? true : var2.method7021(var3, 0) < 13 && this.isValidGround(var7, var2, var6);
   }

   public boolean method12174(ServerWorld var1, BlockPos var2, BlockState var3, Random var4) {
      var1.removeBlock(var2, false);
      ConfiguredFeature var7;
      if (this != Blocks.BROWN_MUSHROOM) {
         if (this != Blocks.RED_MUSHROOM) {
            var1.setBlockState(var2, var3, 3);
            return false;
         }

         var7 = Features.field41769;
      } else {
         var7 = Features.field41768;
      }

      if (!var7.func_242765_a(var1, var1.getChunkProvider().getChunkGenerator(), var4, var2)) {
         var1.setBlockState(var2, var3, 3);
         return false;
      } else {
         return true;
      }
   }

   @Override
   public boolean method11486(IBlockReader var1, BlockPos var2, BlockState var3, boolean var4) {
      return true;
   }

   @Override
   public boolean method11487(World var1, Random var2, BlockPos var3, BlockState var4) {
      return (double)var2.nextFloat() < 0.4;
   }

   @Override
   public void method11488(ServerWorld var1, Random var2, BlockPos var3, BlockState var4) {
      this.method12174(var1, var3, var4, var2);
   }
}

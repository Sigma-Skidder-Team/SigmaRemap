package net.minecraft.block;

import mapped.FluidTags;
import net.minecraft.fluid.FluidState;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class Class3408 extends Block {
   private static String[] field19086;
   public static final IntegerProperty field19087 = BlockStateProperties.AGE6;
   public static final VoxelShape field19088 = Block.makeCuboidShape(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   public Class3408(Properties var1) {
      super(var1);
      this.setDefaultState(this.stateContainer.getBaseState().with(field19087, Integer.valueOf(0)));
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field19088;
   }

   @Override
   public void tick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (!var1.isValidPosition(var2, var3)) {
         var2.method7179(var3, true);
      }
   }

   @Override
   public void randomTick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (var2.method7007(var3.up())) {
         int var7 = 1;

         while (var2.getBlockState(var3.method8340(var7)).isIn(this)) {
            var7++;
         }

         if (var7 < 3) {
            int var8 = var1.<Integer>get(field19087);
            if (var8 != 15) {
               var2.setBlockState(var3, var1.with(field19087, Integer.valueOf(var8 + 1)), 4);
            } else {
               var2.setBlockState(var3.up(), this.getDefaultState());
               var2.setBlockState(var3, var1.with(field19087, Integer.valueOf(0)), 4);
            }
         }
      }
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      if (!var1.isValidPosition(var4, var5)) {
         var4.getBlockTickScheduler().scheduleTick(var5, this, 1);
      }

      return super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean isValidPosition(BlockState var1, IWorldReader var2, BlockPos var3) {
      BlockState var6 = var2.getBlockState(var3.down());
      if (var6.getBlock() == this) {
         return true;
      } else {
         if (var6.isIn(Blocks.GRASS_BLOCK)
            || var6.isIn(Blocks.DIRT)
            || var6.isIn(Blocks.COARSE_DIRT)
            || var6.isIn(Blocks.PODZOL)
            || var6.isIn(Blocks.SAND)
            || var6.isIn(Blocks.RED_SAND)) {
            BlockPos var7 = var3.down();

            for (Direction var9 : Direction.Plane.HORIZONTAL) {
               BlockState var10 = var2.getBlockState(var7.offset(var9));
               FluidState var11 = var2.getFluidState(var7.offset(var9));
               if (var11.method23486(FluidTags.WATER) || var10.isIn(Blocks.FROSTED_ICE)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field19087);
   }
}

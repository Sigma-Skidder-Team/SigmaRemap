package mapped;

import net.minecraft.block.*;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.Random;

public class Class3195 extends BushBlock implements IGrowable, IWaterLoggable {
   private static String[] field18471;
   public static final IntegerProperty field18472 = BlockStateProperties.PICKLES;
   public static final BooleanProperty field18473 = BlockStateProperties.WATERLOGGED;
   public static final VoxelShape field18474 = Block.makeCuboidShape(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   public static final VoxelShape field18475 = Block.makeCuboidShape(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   public static final VoxelShape field18476 = Block.makeCuboidShape(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   public static final VoxelShape field18477 = Block.makeCuboidShape(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   public Class3195(Properties var1) {
      super(var1);
      this.setDefaultState(this.stateContainer.getBaseState().with(field18472, Integer.valueOf(1)).with(field18473, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      BlockState var4 = var1.getWorld().getBlockState(var1.getPos());
      if (!var4.isIn(this)) {
         FluidState var5 = var1.getWorld().getFluidState(var1.getPos());
         boolean var6 = var5.getFluid() == Fluids.WATER;
         return super.getStateForPlacement(var1).with(field18473, Boolean.valueOf(var6));
      } else {
         return var4.with(field18472, Integer.valueOf(Math.min(4, var4.<Integer>get(field18472) + 1)));
      }
   }

   public static boolean method11496(BlockState var0) {
      return !var0.<Boolean>get(field18473);
   }

   @Override
   public boolean isValidGround(BlockState state, IBlockReader var2, BlockPos var3) {
      return !state.method23414(var2, var3).method19526(Direction.UP).isEmpty() || state.method23454(var2, var3, Direction.UP);
   }

   @Override
   public boolean isValidPosition(BlockState var1, IWorldReader var2, BlockPos var3) {
      BlockPos var6 = var3.down();
      return this.isValidGround(var2.getBlockState(var6), var2, var6);
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      if (var1.isValidPosition(var4, var5)) {
         if (var1.<Boolean>get(field18473)) {
            var4.getPendingFluidTicks().scheduleTick(var5, Fluids.WATER, Fluids.WATER.getTickRate(var4));
         }

         return super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
      } else {
         return Blocks.AIR.getDefaultState();
      }
   }

   @Override
   public boolean method11497(BlockState var1, BlockItemUseContext var2) {
      return var2.method18357().getItem() == this.asItem() && var1.<Integer>get(field18472) < 4 ? true : super.method11497(var1, var2);
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      switch (var1.<Integer>get(field18472)) {
         case 1:
         default:
            return field18474;
         case 2:
            return field18475;
         case 3:
            return field18476;
         case 4:
            return field18477;
      }
   }

   @Override
   public FluidState getFluidState(BlockState var1) {
      return !var1.<Boolean>get(field18473) ? super.getFluidState(var1) : Fluids.WATER.getStillFluidState(false);
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field18472, field18473);
   }

   @Override
   public boolean method11486(IBlockReader var1, BlockPos var2, BlockState var3, boolean var4) {
      return true;
   }

   @Override
   public boolean method11487(World var1, Random var2, BlockPos var3, BlockState var4) {
      return true;
   }

   @Override
   public void method11488(ServerWorld var1, Random var2, BlockPos var3, BlockState var4) {
      if (!method11496(var4) && var1.getBlockState(var3.down()).isIn(BlockTags.field32783)) {
         byte var7 = 5;
         byte var8 = 1;
         byte var9 = 2;
         int var10 = 0;
         int var11 = var3.getX() - 2;
         int var12 = 0;

         for (int var13 = 0; var13 < 5; var13++) {
            for (int var14 = 0; var14 < var8; var14++) {
               int var15 = 2 + var3.getY() - 1;

               for (int var16 = var15 - 2; var16 < var15; var16++) {
                  BlockPos var17 = new BlockPos(var11 + var13, var16, var3.getZ() - var12 + var14);
                  if (var17 != var3 && var2.nextInt(6) == 0 && var1.getBlockState(var17).isIn(Blocks.WATER)) {
                     BlockState var18 = var1.getBlockState(var17.down());
                     if (var18.isIn(BlockTags.field32783)) {
                        var1.setBlockState(var17, Blocks.SEA_PICKLE.getDefaultState().with(field18472, Integer.valueOf(var2.nextInt(4) + 1)), 3);
                     }
                  }
               }
            }

            if (var10 >= 2) {
               var8 -= 2;
               var12--;
            } else {
               var8 += 2;
               var12++;
            }

            var10++;
         }

         var1.setBlockState(var3, var4.with(field18472, Integer.valueOf(4)), 2);
      }
   }

   @Override
   public boolean allowsMovement(BlockState var1, IBlockReader var2, BlockPos var3, PathType var4) {
      return false;
   }
}

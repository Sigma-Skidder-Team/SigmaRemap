package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.block.material.PushReaction;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;

import javax.annotation.Nullable;

public class Class3466 extends Block implements IWaterLoggable {
   private static String[] field19307;
   public static final BooleanProperty field19308 = BlockStateProperties.field39691;
   public static final BooleanProperty field19309 = BlockStateProperties.WATERLOGGED;
   public static final VoxelShape field19310 = VoxelShapes.or(
      Block.makeCuboidShape(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), Block.makeCuboidShape(6.0, 7.0, 6.0, 10.0, 9.0, 10.0)
   );
   public static final VoxelShape field19311 = VoxelShapes.or(
      Block.makeCuboidShape(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), Block.makeCuboidShape(6.0, 8.0, 6.0, 10.0, 10.0, 10.0)
   );

   public Class3466(Properties var1) {
      super(var1);
      this.setDefaultState(this.stateContainer.getBaseState().with(field19308, Boolean.valueOf(false)).with(field19309, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      FluidState var4 = var1.getWorld().getFluidState(var1.getPos());

      for (Direction var8 : var1.method18349()) {
         if (var8.getAxis() == Direction.Axis.Y) {
            BlockState var9 = this.getDefaultState().with(field19308, Boolean.valueOf(var8 == Direction.UP));
            if (var9.method23443(var1.getWorld(), var1.getPos())) {
               return var9.with(field19309, Boolean.valueOf(var4.getFluid() == Fluids.WATER));
            }
         }
      }

      return null;
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return !var1.<Boolean>get(field19308) ? field19310 : field19311;
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field19308, field19309);
   }

   @Override
   public boolean method11492(BlockState var1, IWorldReader var2, BlockPos var3) {
      Direction var6 = method12151(var1).getOpposite();
      return Block.method11548(var2, var3.offset(var6), var6.getOpposite());
   }

   public static Direction method12151(BlockState var0) {
      return !var0.<Boolean>get(field19308) ? Direction.UP : Direction.DOWN;
   }

   @Override
   public PushReaction method11689(BlockState var1) {
      return PushReaction.field15863;
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      if (var1.<Boolean>get(field19309)) {
         var4.getPendingFluidTicks().scheduleTick(var5, Fluids.WATER, Fluids.WATER.getTickRate(var4));
      }

      return method12151(var1).getOpposite() == var2 && !var1.method23443(var4, var5)
         ? Blocks.AIR.getDefaultState()
         : super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public FluidState getFluidState(BlockState var1) {
      return !var1.<Boolean>get(field19309) ? super.getFluidState(var1) : Fluids.WATER.getStillFluidState(false);
   }

   @Override
   public boolean allowsMovement(BlockState var1, IBlockReader var2, BlockPos var3, PathType var4) {
      return false;
   }
}

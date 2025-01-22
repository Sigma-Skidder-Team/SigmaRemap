package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.IWaterLoggable;
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
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;

import javax.annotation.Nullable;

public class Class3387 extends WoodBlock implements IWaterLoggable {
   private static String[] field18993;
   public static final BooleanProperty field18995 = BlockStateProperties.WATERLOGGED;
   public static final VoxelShape field18996 = Block.makeCuboidShape(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final VoxelShape field18997 = Block.makeCuboidShape(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   public static final VoxelShape field18998 = Block.makeCuboidShape(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   public Class3387(Properties var1) {
      super(var1);
      this.setDefaultState(this.stateContainer.getBaseState().with(field18995, Boolean.valueOf(false)).with(field18994, Direction.Axis.Y));
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      switch (Class9607.field44929[var1.<Direction.Axis>get(field18994).ordinal()]) {
         case 1:
         default:
            return field18998;
         case 2:
            return field18997;
         case 3:
            return field18996;
      }
   }

   @Nullable
   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      FluidState var4 = var1.getWorld().getFluidState(var1.getPos());
      boolean var5 = var4.getFluid() == Fluids.WATER;
      return super.getStateForPlacement(var1).with(field18995, Boolean.valueOf(var5));
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      if (var1.<Boolean>get(field18995)) {
         var4.getPendingFluidTicks().scheduleTick(var5, Fluids.WATER, Fluids.WATER.getTickRate(var4));
      }

      return super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field18995).add(field18994);
   }

   @Override
   public FluidState getFluidState(BlockState var1) {
      return !var1.<Boolean>get(field18995) ? super.getFluidState(var1) : Fluids.WATER.getStillFluidState(false);
   }

   @Override
   public boolean allowsMovement(BlockState var1, IBlockReader var2, BlockPos var3, PathType var4) {
      return false;
   }
}

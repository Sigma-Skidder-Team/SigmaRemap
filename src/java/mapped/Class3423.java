package mapped;

import net.minecraft.block.*;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Mirror;
import net.minecraft.util.Direction;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Class3423 extends Block implements IWaterLoggable {
   private static String[] field19153;
   public static final DirectionProperty field19154 = HorizontalBlock.HORIZONTAL_FACING;
   public static final BooleanProperty field19155 = BlockStateProperties.WATERLOGGED;
   public static final VoxelShape field19156 = Block.makeCuboidShape(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   public static final VoxelShape field19157 = Block.makeCuboidShape(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   public static final VoxelShape field19158 = Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   public static final VoxelShape field19159 = Block.makeCuboidShape(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   public Class3423(Properties var1) {
      super(var1);
      this.setDefaultState(this.stateContainer.getBaseState().with(field19154, Direction.NORTH).with(field19155, Boolean.valueOf(false)));
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      switch (Class9442.field43870[var1.<Direction>get(field19154).ordinal()]) {
         case 1:
            return field19159;
         case 2:
            return field19158;
         case 3:
            return field19157;
         case 4:
         default:
            return field19156;
      }
   }

   private boolean method12078(IBlockReader var1, BlockPos var2, Direction var3) {
      BlockState var6 = var1.getBlockState(var2);
      return var6.method23454(var1, var2, var3);
   }

   @Override
   public boolean isValidPosition(BlockState var1, IWorldReader var2, BlockPos var3) {
      Direction var6 = var1.<Direction>get(field19154);
      return this.method12078(var2, var3.offset(var6.getOpposite()), var6);
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      if (var2.getOpposite() == var1.<Direction>get(field19154) && !var1.isValidPosition(var4, var5)) {
         return Blocks.AIR.getDefaultState();
      } else {
         if (var1.<Boolean>get(field19155)) {
            var4.getPendingFluidTicks().scheduleTick(var5, Fluids.WATER, Fluids.WATER.getTickRate(var4));
         }

         return super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
      }
   }

   @Nullable
   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      if (!var1.method18347()) {
         BlockState var4 = var1.getWorld().getBlockState(var1.getPos().offset(var1.getFace().getOpposite()));
         if (var4.isIn(this) && var4.<Direction>get(field19154) == var1.getFace()) {
            return null;
         }
      }

      BlockState var12 = this.getDefaultState();
      World var5 = var1.getWorld();
      BlockPos var6 = var1.getPos();
      FluidState var7 = var1.getWorld().getFluidState(var1.getPos());

      for (Direction var11 : var1.method18349()) {
         if (var11.getAxis().isHorizontal()) {
            var12 = var12.with(field19154, var11.getOpposite());
            if (var12.isValidPosition(var5, var6)) {
               return var12.with(field19155, Boolean.valueOf(var7.getFluid() == Fluids.WATER));
            }
         }
      }

      return null;
   }

   @Override
   public BlockState rotate(BlockState var1, Rotation var2) {
      return var1.with(field19154, var2.rotate(var1.<Direction>get(field19154)));
   }

   @Override
   public BlockState mirror(BlockState var1, Mirror var2) {
      return var1.rotate(var2.toRotation(var1.<Direction>get(field19154)));
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field19154, field19155);
   }

   @Override
   public FluidState getFluidState(BlockState var1) {
      return !var1.<Boolean>get(field19155) ? super.getFluidState(var1) : Fluids.WATER.getStillFluidState(false);
   }
}

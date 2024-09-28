package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
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

public class Class3224 extends Block implements IWaterLoggable {
   private static String[] field18662;
   public static final BooleanProperty field18663 = BlockStateProperties.WATERLOGGED;
   private static final VoxelShape field18664 = Block.makeCuboidShape(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   public Class3224(Properties var1) {
      super(var1);
      this.setDefaultState(this.stateContainer.getBaseState().with(field18663, Boolean.valueOf(true)));
   }

   public void method11632(BlockState var1, IWorld var2, BlockPos var3) {
      if (!method11633(var1, var2, var3)) {
         var2.method6860().scheduleTick(var3, this, 60 + var2.method6814().nextInt(40));
      }
   }

   public static boolean method11633(BlockState var0, IBlockReader var1, BlockPos var2) {
      if (var0.<Boolean>get(field18663)) {
         return true;
      } else {
         for (Direction var8 : Direction.values()) {
            if (var1.getFluidState(var2.offset(var8)).method23486(FluidTags.field40469)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      FluidState var4 = var1.getWorld().getFluidState(var1.getPos());
      return this.getDefaultState().with(field18663, Boolean.valueOf(var4.method23486(FluidTags.field40469) && var4.method23477() == 8));
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field18664;
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      if (var1.<Boolean>get(field18663)) {
         var4.getPendingFluidTicks().scheduleTick(var5, Fluids.WATER, Fluids.WATER.getTickRate(var4));
      }

      return var2 == Direction.DOWN && !this.method11492(var1, var4, var5)
         ? Blocks.AIR.getDefaultState()
         : super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method11492(BlockState var1, IWorldReader var2, BlockPos var3) {
      BlockPos var6 = var3.down();
      return var2.getBlockState(var6).method23454(var2, var6, Direction.UP);
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field18663);
   }

   @Override
   public FluidState getFluidState(BlockState var1) {
      return !var1.<Boolean>get(field18663) ? super.getFluidState(var1) : Fluids.WATER.getStillFluidState(false);
   }
}

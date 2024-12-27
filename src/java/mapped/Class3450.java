package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.BushBlock;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;
import javax.annotation.Nullable;

public class Class3450 extends BushBlock implements IGrowable, Class3449 {
   private static String[] field18470;
   public static final VoxelShape field19264 = Block.makeCuboidShape(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   public Class3450(Properties var1) {
      super(var1);
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field19264;
   }

   @Override
   public boolean isValidGround(BlockState state, IBlockReader var2, BlockPos var3) {
      return state.method23454(var2, var3, Direction.UP) && !state.isIn(Blocks.MAGMA_BLOCK);
   }

   @Nullable
   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      FluidState var4 = var1.getWorld().getFluidState(var1.getPos());
      return var4.method23486(FluidTags.field40469) && var4.method23477() == 8 ? super.getStateForPlacement(var1) : null;
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      BlockState var9 = super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
      if (!var9.isAir()) {
         var4.getPendingFluidTicks().scheduleTick(var5, Fluids.WATER, Fluids.WATER.getTickRate(var4));
      }

      return var9;
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
   public FluidState getFluidState(BlockState var1) {
      return Fluids.WATER.getStillFluidState(false);
   }

   @Override
   public void method11488(ServerWorld var1, Random var2, BlockPos var3, BlockState var4) {
      BlockState var7 = Blocks.TALL_SEAGRASS.getDefaultState();
      BlockState var8 = var7.with(Class3455.field19274, DoubleBlockHalf.field209);
      BlockPos var9 = var3.up();
      if (var1.getBlockState(var9).isIn(Blocks.WATER)) {
         var1.setBlockState(var3, var7, 2);
         var1.setBlockState(var9, var8, 2);
      }
   }

   @Override
   public boolean method11531(IBlockReader var1, BlockPos var2, BlockState var3, Fluid var4) {
      return false;
   }

   @Override
   public boolean method11532(IWorld var1, BlockPos var2, BlockState var3, FluidState var4) {
      return false;
   }
}

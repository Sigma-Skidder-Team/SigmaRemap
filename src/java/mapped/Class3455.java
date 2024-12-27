package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;

import javax.annotation.Nullable;

public class Class3455 extends Class3456 implements Class3449 {
   private static String[] field19273;
   public static final EnumProperty<DoubleBlockHalf> field19274 = Class3456.field19276;
   public static final VoxelShape field19275 = Block.makeCuboidShape(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   public Class3455(Properties var1) {
      super(var1);
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field19275;
   }

   @Override
   public boolean isValidGround(BlockState state, IBlockReader var2, BlockPos var3) {
      return state.method23454(var2, var3, Direction.UP) && !state.isIn(Blocks.MAGMA_BLOCK);
   }

   @Override
   public ItemStack getItem(IBlockReader var1, BlockPos var2, BlockState var3) {
      return new ItemStack(Blocks.SEAGRASS);
   }

   @Nullable
   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      BlockState var4 = super.getStateForPlacement(var1);
      if (var4 != null) {
         FluidState var5 = var1.getWorld().getFluidState(var1.getPos().up());
         if (var5.method23486(FluidTags.field40469) && var5.method23477() == 8) {
            return var4;
         }
      }

      return null;
   }

   @Override
   public boolean isValidPosition(BlockState var1, IWorldReader var2, BlockPos var3) {
      if (var1.<DoubleBlockHalf>get(field19274) != DoubleBlockHalf.field209) {
         FluidState var7 = var2.getFluidState(var3);
         return super.isValidPosition(var1, var2, var3) && var7.method23486(FluidTags.field40469) && var7.method23477() == 8;
      } else {
         BlockState var6 = var2.getBlockState(var3.down());
         return var6.isIn(this) && var6.<DoubleBlockHalf>get(field19274) == DoubleBlockHalf.field210;
      }
   }

   @Override
   public FluidState getFluidState(BlockState var1) {
      return Fluids.WATER.getStillFluidState(false);
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

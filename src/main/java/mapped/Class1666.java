package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;

public enum Class1666 implements IBlockReader {
   field9078;

   private static final Class1666[] field9079 = new Class1666[]{field9078};

   @Nullable
   @Override
   public TileEntity getTileEntity(BlockPos var1) {
      return null;
   }

   @Override
   public BlockState getBlockState(BlockPos var1) {
      return Blocks.AIR.getDefaultState();
   }

   @Override
   public FluidState getFluidState(BlockPos var1) {
      return Fluids.EMPTY.method25049();
   }
}

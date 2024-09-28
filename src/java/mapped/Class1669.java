package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.FluidState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;

public final class Class1669 implements IBlockReader {
   private static String[] field9086;
   private final BlockState[] field9087;

   public Class1669(BlockState[] var1) {
      this.field9087 = var1;
   }

   @Nullable
   @Override
   public TileEntity getTileEntity(BlockPos var1) {
      return null;
   }

   @Override
   public BlockState getBlockState(BlockPos var1) {
      int var4 = var1.getY();
      return var4 >= 0 && var4 < this.field9087.length ? this.field9087[var4] : Blocks.AIR.getDefaultState();
   }

   @Override
   public FluidState getFluidState(BlockPos var1) {
      return this.getBlockState(var1).method23449();
   }
}

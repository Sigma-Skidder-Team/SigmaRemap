package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

import javax.annotation.Nullable;

public final class Class1669 implements Class1665 {
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
      return var4 >= 0 && var4 < this.field9087.length ? this.field9087[var4] : Blocks.AIR.method11579();
   }

   @Override
   public FluidState getFluidState(BlockPos var1) {
      return this.getBlockState(var1).method23449();
   }
}

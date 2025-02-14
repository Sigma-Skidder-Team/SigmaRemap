package net.minecraft.block;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class GravelBlock extends FallingBlock {
   private static String[] field18622;

   public GravelBlock(Properties var1) {
      super(var1);
   }

   @Override
   public int getColor(BlockState var1, IBlockReader var2, BlockPos var3) {
      return -8356741;
   }
}

package net.minecraft.block;

import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class RedstoneBlock extends Block {
   private static String[] field19033;

   public RedstoneBlock(Properties var1) {
      super(var1);
   }

   @Override
   public boolean method11516(BlockState var1) {
      return true;
   }

   @Override
   public int method11514(BlockState var1, IBlockReader var2, BlockPos var3, Direction var4) {
      return 15;
   }
}

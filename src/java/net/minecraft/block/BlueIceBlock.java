package net.minecraft.block;

import net.minecraft.util.Direction;

public class BlueIceBlock extends Block {
   private static String[] field18672;

   public BlueIceBlock(Properties var1) {
      super(var1);
   }

   @Override
   public boolean method11634(BlockState var1, BlockState var2, Direction var3) {
      return !var2.isIn(this) ? super.method11634(var1, var2, var3) : true;
   }
}

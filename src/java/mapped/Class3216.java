package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class Class3216 extends Class3213 {
   private static String[] field18622;
   private final int field18625;

   public Class3216(int var1, Properties var2) {
      super(var2);
      this.field18625 = var1;
   }

   @Override
   public int method11601(BlockState var1, IBlockReader var2, BlockPos var3) {
      return this.field18625;
   }
}

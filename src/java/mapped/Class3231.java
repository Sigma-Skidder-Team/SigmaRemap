package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;

public class Class3231 extends Block {
   private static String[] field18672;

   public Class3231(Properties var1) {
      super(var1);
   }

   @Override
   public boolean method11634(BlockState var1, BlockState var2, Direction var3) {
      return !var2.isIn(this) ? super.method11634(var1, var2, var3) : true;
   }
}

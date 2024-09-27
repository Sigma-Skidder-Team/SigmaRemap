package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;

public class Class3297 extends Class3292 {
   private static String[] field18805;

   public Class3297(Block var1, Properties var2) {
      super(var1, var2);
   }

   @Override
   public boolean method11843(Class5909 var1, BlockState var2) {
      return var1.method18360().setBlockState(var1.method18345(), var2, 26);
   }
}

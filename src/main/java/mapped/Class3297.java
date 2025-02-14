package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BlockItemUseContext;

public class Class3297 extends BlockItem {
   private static String[] field18805;

   public Class3297(Block var1, Properties var2) {
      super(var1, var2);
   }

   @Override
   public boolean method11843(BlockItemUseContext var1, BlockState var2) {
      return var1.getWorld().setBlockState(var1.getPos(), var2, 26);
   }
}

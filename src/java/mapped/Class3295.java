package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BlockItemUseContext;

public class Class3295 extends BlockItem {
   private static String[] field18803;

   public Class3295(Block var1, Properties var2) {
      super(var1, var2);
   }

   @Override
   public boolean method11843(BlockItemUseContext var1, BlockState var2) {
      var1.getWorld().setBlockState(var1.getPos().up(), Blocks.AIR.getDefaultState(), 27);
      return super.method11843(var1, var2);
   }
}

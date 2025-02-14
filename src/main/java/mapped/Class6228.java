package mapped;

import net.minecraft.dispenser.IBlockSource;
import net.minecraft.dispenser.IDispenseItemBehavior;
import net.minecraft.item.ItemStack;

public final class Class6228 implements IDispenseItemBehavior {
   private static String[] field27724;

   @Override
   public ItemStack method19196(IBlockSource var1, ItemStack var2) {
      return new Class6251(this).method19196(var1, var2);
   }
}

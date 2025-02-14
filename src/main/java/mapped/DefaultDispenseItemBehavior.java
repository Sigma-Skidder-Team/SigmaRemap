package mapped;

import net.minecraft.dispenser.IBlockSource;
import net.minecraft.item.ItemStack;

public final class DefaultDispenseItemBehavior extends Class6218 {
   private static String[] field27719;

   @Override
   public ItemStack dispenseStack(IBlockSource var1, ItemStack var2) {
      return !ArmorItem.func_226626_a_(var1, var2) ? super.dispenseStack(var1, var2) : var2;
   }
}

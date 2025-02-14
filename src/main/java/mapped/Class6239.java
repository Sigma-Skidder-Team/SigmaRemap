package mapped;

import net.minecraft.dispenser.IBlockSource;
import net.minecraft.item.ItemStack;

public final class Class6239 extends Class6230 {
   private static String[] field27718;

   @Override
   public ItemStack dispenseStack(IBlockSource var1, ItemStack var2) {
      this.method19204(ArmorItem.func_226626_a_(var1, var2));
      return var2;
   }
}

package mapped;

import net.minecraft.item.ItemStack;

public class Class5861 extends Slot {
   private static String[] field25626;

   public Class5861(IInventory var1, int var2, int var3, int var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public boolean isItemValid(ItemStack var1) {
      return !(Block.method11537(var1.getItem()) instanceof Class3368);
   }
}

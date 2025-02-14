package mapped;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public class Class5855 extends Slot {
   private static String[] field25611;

   public Class5855(IInventory var1, int var2, int var3, int var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public boolean isItemValid(ItemStack var1) {
      return Class7105.method22132(var1);
   }

   @Override
   public int getSlotStackLimit() {
      return 64;
   }
}

package mapped;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public class Class5845 extends Slot {
   private static String[] field25592;
   public final Class5821 field25593;

   public Class5845(Class5821 var1, IInventory var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.field25593 = var1;
   }

   @Override
   public boolean isItemValid(ItemStack var1) {
      return var1.getItem().method11743(Class5985.field26121);
   }

   @Override
   public int getSlotStackLimit() {
      return 1;
   }
}

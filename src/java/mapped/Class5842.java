package mapped;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public class Class5842 extends Slot {
   private static String[] field25585;
   public final Class5822 field25586;

   public Class5842(Class5822 var1, IInventory var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.field25586 = var1;
   }

   @Override
   public boolean isItemValid(ItemStack var1) {
      return true;
   }

   @Override
   public int getSlotStackLimit() {
      return 1;
   }
}

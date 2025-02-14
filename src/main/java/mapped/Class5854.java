package mapped;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class Class5854 extends Slot {
   private static String[] field25609;
   public final Class5836 field25610;

   public Class5854(Class5836 var1, IInventory var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.field25610 = var1;
   }

   @Override
   public boolean isItemValid(ItemStack var1) {
      return var1.getItem() == Items.field37955;
   }
}

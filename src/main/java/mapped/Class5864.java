package mapped;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class Class5864 extends Slot {
   private static String[] field25632;

   public Class5864(IInventory var1, int var2, int var3, int var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public boolean isItemValid(ItemStack var1) {
      return method18282(var1);
   }

   public static boolean method18282(ItemStack var0) {
      return var0.getItem() == Items.field37975;
   }

   @Override
   public int getSlotStackLimit() {
      return 64;
   }
}

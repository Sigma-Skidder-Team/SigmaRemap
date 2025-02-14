package mapped;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class Class5858 extends Slot {
   private static String[] field25618;
   private final Class5831 field25619;

   public Class5858(Class5831 var1, IInventory var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.field25619 = var1;
   }

   @Override
   public boolean isItemValid(ItemStack var1) {
      return this.field25619.method18235(var1) || method18278(var1);
   }

   @Override
   public int getItemStackLimit(ItemStack var1) {
      return !method18278(var1) ? super.getItemStackLimit(var1) : 1;
   }

   public static boolean method18278(ItemStack var0) {
      return var0.getItem() == Items.BUCKET;
   }
}

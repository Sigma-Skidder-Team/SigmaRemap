package mapped;

import net.minecraft.item.ItemStack;

public class Class984 extends Class927 {
   private static String[] field5464;
   public final Class5821 field5465;

   public Class984(Class5821 var1, int var2) {
      super(var2);
      this.field5465 = var1;
   }

   @Override
   public boolean isItemValidForSlot(int var1, ItemStack var2) {
      return var2.getItem().method11743(ItemTags.field26121);
   }

   @Override
   public int getInventoryStackLimit() {
      return 1;
   }
}

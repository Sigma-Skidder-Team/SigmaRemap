package mapped;

import net.minecraft.item.ItemStack;

public class Class5849 extends Slot {
   private static String[] field25597;
   public final Class5837 field25598;

   public Class5849(Class5837 var1, IInventory var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.field25598 = var1;
   }

   @Override
   public boolean isItemValid(ItemStack var1) {
      return var1.getItem() instanceof Class3286;
   }
}

package mapped;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public class Class5851 extends Slot {
   private static String[] field25602;
   public final Class5837 field25603;

   public Class5851(Class5837 var1, IInventory var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.field25603 = var1;
   }

   @Override
   public boolean isItemValid(ItemStack var1) {
      return var1.getItem() instanceof Class3321;
   }
}

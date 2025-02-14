package mapped;

import net.minecraft.inventory.IInventory;

public class Class5862 extends Slot {
   private static String[] field25627;
   public final Class5818 field25628;

   public Class5862(Class5818 var1, IInventory var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.field25628 = var1;
   }

   @Override
   public void onSlotChanged() {
      super.onSlotChanged();
      this.field25628.onCraftMatrixChanged(this.field25578);
   }
}

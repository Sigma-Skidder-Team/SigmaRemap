package mapped;

import net.minecraft.entity.passive.horse.AbstractHorseEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public class Class5860 extends Slot {
   private static String[] field25623;
   public final AbstractHorseEntity field25624;
   public final Class5827 field25625;

   public Class5860(Class5827 var1, IInventory var2, int var3, int var4, int var5, AbstractHorseEntity var6) {
      super(var2, var3, var4, var5);
      this.field25625 = var1;
      this.field25624 = var6;
   }

   @Override
   public boolean isItemValid(ItemStack var1) {
      return this.field25624.method4900(var1);
   }

   @Override
   public boolean isEnabled() {
      return this.field25624.method4898();
   }

   @Override
   public int getSlotStackLimit() {
      return 1;
   }
}

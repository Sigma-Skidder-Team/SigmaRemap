package mapped;

import net.minecraft.entity.passive.horse.AbstractHorseEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class Class5859 extends Slot {
   private static String[] field25620;
   public final AbstractHorseEntity field25621;
   public final Class5827 field25622;

   public Class5859(Class5827 var1, IInventory var2, int var3, int var4, int var5, AbstractHorseEntity var6) {
      super(var2, var3, var4, var5);
      this.field25622 = var1;
      this.field25621 = var6;
   }

   @Override
   public boolean isItemValid(ItemStack var1) {
      return var1.getItem() == Items.field37886 && !this.getHasStack() && this.field25621.method4901();
   }

   @Override
   public boolean isEnabled() {
      return this.field25621.method4901();
   }
}

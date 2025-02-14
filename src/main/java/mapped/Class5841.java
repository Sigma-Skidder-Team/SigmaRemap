package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public class Class5841 extends Slot {
   private static String[] field25583;
   public final Class5823 field25584;

   public Class5841(Class5823 var1, IInventory var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.field25584 = var1;
   }

   @Override
   public boolean isItemValid(ItemStack var1) {
      return false;
   }

   @Override
   public boolean canTakeStack(PlayerEntity var1) {
      return this.field25584.method18189(var1, this.getHasStack());
   }

   @Override
   public ItemStack onTake(PlayerEntity var1, ItemStack var2) {
      return this.field25584.method18190(var1, var2);
   }
}

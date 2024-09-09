package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

public class Class5853 extends Slot {
   private static String[] field25606;
   private final PlayerEntity field25607;
   private int field25608;

   public Class5853(PlayerEntity var1, IInventory var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.field25607 = var1;
   }

   @Override
   public boolean isItemValid(ItemStack var1) {
      return false;
   }

   @Override
   public ItemStack decrStackSize(int var1) {
      if (this.getHasStack()) {
         this.field25608 = this.field25608 + Math.min(var1, this.getStack().getCount());
      }

      return super.decrStackSize(var1);
   }

   @Override
   public ItemStack onTake(PlayerEntity var1, ItemStack var2) {
      this.onCrafting(var2);
      super.onTake(var1, var2);
      return var2;
   }

   @Override
   public void onCrafting(ItemStack var1, int var2) {
      this.field25608 += var2;
      this.onCrafting(var1);
   }

   @Override
   public void onCrafting(ItemStack var1) {
      var1.method32136(this.field25607.world, this.field25607, this.field25608);
      if (!this.field25607.world.isRemote && this.field25578 instanceof Class924) {
         ((Class924)this.field25578).method3656(this.field25607);
      }

      this.field25608 = 0;
   }
}

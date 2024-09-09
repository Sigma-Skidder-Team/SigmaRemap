package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

public class Class5856 extends Slot {
   private static String[] field25612;
   private final Class926 field25613;
   private final PlayerEntity field25614;
   private int field25615;

   public Class5856(PlayerEntity var1, Class926 var2, IInventory var3, int var4, int var5, int var6) {
      super(var3, var4, var5, var6);
      this.field25614 = var1;
      this.field25613 = var2;
   }

   @Override
   public boolean isItemValid(ItemStack var1) {
      return false;
   }

   @Override
   public ItemStack decrStackSize(int var1) {
      if (this.getHasStack()) {
         this.field25615 = this.field25615 + Math.min(var1, this.getStack().getCount());
      }

      return super.decrStackSize(var1);
   }

   @Override
   public void onCrafting(ItemStack var1, int var2) {
      this.field25615 += var2;
      this.onCrafting(var1);
   }

   @Override
   public void onSwapCraft(int var1) {
      this.field25615 += var1;
   }

   @Override
   public void onCrafting(ItemStack var1) {
      if (this.field25615 > 0) {
         var1.method32136(this.field25614.world, this.field25614, this.field25615);
      }

      if (this.field25578 instanceof Class923) {
         ((Class923)this.field25578).method3638(this.field25614);
      }

      this.field25615 = 0;
   }

   @Override
   public ItemStack onTake(PlayerEntity var1, ItemStack var2) {
      this.onCrafting(var2);
      NonNullList var5 = var1.world.method6816().method1034(Class7207.field30935, this.field25613, var1.world);

      for (int var6 = 0; var6 < var5.size(); var6++) {
         ItemStack var7 = this.field25613.getStackInSlot(var6);
         ItemStack var8 = (ItemStack)var5.get(var6);
         if (!var7.isEmpty()) {
            this.field25613.decrStackSize(var6, 1);
            var7 = this.field25613.getStackInSlot(var6);
         }

         if (!var8.isEmpty()) {
            if (!var7.isEmpty()) {
               if (ItemStack.method32130(var7, var8) && ItemStack.method32127(var7, var8)) {
                  var8.method32181(var7.getCount());
                  this.field25613.setInventorySlotContents(var6, var8);
               } else if (!this.field25614.inventory.method4045(var8)) {
                  this.field25614.method2882(var8, false);
               }
            } else {
               this.field25613.setInventorySlotContents(var6, var8);
            }
         }
      }

      return var2;
   }
}

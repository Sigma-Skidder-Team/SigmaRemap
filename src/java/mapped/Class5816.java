package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.ItemStack;

public class Class5816 extends Container {
   private static String[] field25486;
   private final IInventory field25487;

   public Class5816(int var1, PlayerInventory var2) {
      this(var1, var2, new Class927(5));
   }

   public Class5816(int var1, PlayerInventory var2, IInventory var3) {
      super(ContainerType.HOPPER, var1);
      this.field25487 = var3;
      assertInventorySize(var3, 5);
      var3.openInventory(var2.field5444);
      byte var6 = 51;

      for (int var7 = 0; var7 < 5; var7++) {
         this.addSlot(new Slot(var3, var7, 44 + var7 * 18, 20));
      }

      for (int var9 = 0; var9 < 3; var9++) {
         for (int var8 = 0; var8 < 9; var8++) {
            this.addSlot(new Slot(var2, var8 + var9 * 9 + 9, 8 + var8 * 18, var9 * 18 + 51));
         }
      }

      for (int var10 = 0; var10 < 9; var10++) {
         this.addSlot(new Slot(var2, var10, 8 + var10 * 18, 109));
      }
   }

   @Override
   public boolean canInteractWith(PlayerEntity var1) {
      return this.field25487.isUsableByPlayer(var1);
   }

   @Override
   public ItemStack transferStackInSlot(PlayerEntity var1, int var2) {
      ItemStack var5 = ItemStack.EMPTY;
      Slot var6 = this.inventorySlots.get(var2);
      if (var6 != null && var6.getHasStack()) {
         ItemStack var7 = var6.getStack();
         var5 = var7.copy();
         if (var2 >= this.field25487.getSizeInventory()) {
            if (!this.mergeItemStack(var7, 0, this.field25487.getSizeInventory(), false)) {
               return ItemStack.EMPTY;
            }
         } else if (!this.mergeItemStack(var7, this.field25487.getSizeInventory(), this.inventorySlots.size(), true)) {
            return ItemStack.EMPTY;
         }

         if (!var7.isEmpty()) {
            var6.onSlotChanged();
         } else {
            var6.putStack(ItemStack.EMPTY);
         }
      }

      return var5;
   }

   @Override
   public void onContainerClosed(PlayerEntity var1) {
      super.onContainerClosed(var1);
      this.field25487.closeInventory(var1);
   }
}

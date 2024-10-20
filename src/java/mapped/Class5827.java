package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.ItemStack;

public class Class5827 extends Container {
   private static String[] field25531;
   private final IInventory field25532;
   private final AbstractHorseEntity field25533;

   public Class5827(int var1, PlayerInventory var2, IInventory var3, AbstractHorseEntity var4) {
      super((ContainerType<?>)null, var1);
      this.field25532 = var3;
      this.field25533 = var4;
      var3.openInventory(var2.field5444);
      this.addSlot(new Class5859(this, var3, 0, 8, 18, var4));
      this.addSlot(new Class5860(this, var3, 1, 8, 36, var4));
      if (var4 instanceof Class1066 && ((Class1066)var4).method4927()) {
         for (int var9 = 0; var9 < 3; var9++) {
            for (int var10 = 0; var10 < ((Class1066)var4).method4897(); var10++) {
               this.addSlot(new Slot(var3, 2 + var10 + var9 * ((Class1066)var4).method4897(), 80 + var10 * 18, 18 + var9 * 18));
            }
         }
      }

      for (int var11 = 0; var11 < 3; var11++) {
         for (int var13 = 0; var13 < 9; var13++) {
            this.addSlot(new Slot(var2, var13 + var11 * 9 + 9, 8 + var13 * 18, 102 + var11 * 18 + -18));
         }
      }

      for (int var12 = 0; var12 < 9; var12++) {
         this.addSlot(new Slot(var2, var12, 8 + var12 * 18, 142));
      }
   }

   @Override
   public boolean canInteractWith(PlayerEntity var1) {
      return this.field25532.isUsableByPlayer(var1) && this.field25533.isAlive() && this.field25533.getDistance(var1) < 8.0F;
   }

   @Override
   public ItemStack transferStackInSlot(PlayerEntity var1, int var2) {
      ItemStack var5 = ItemStack.EMPTY;
      Slot var6 = this.inventorySlots.get(var2);
      if (var6 != null && var6.getHasStack()) {
         ItemStack var7 = var6.getStack();
         var5 = var7.copy();
         int var8 = this.field25532.getSizeInventory();
         if (var2 >= var8) {
            if (this.getSlot(1).isItemValid(var7) && !this.getSlot(1).getHasStack()) {
               if (!this.mergeItemStack(var7, 1, 2, false)) {
                  return ItemStack.EMPTY;
               }
            } else if (!this.getSlot(0).isItemValid(var7)) {
               if (var8 <= 2 || !this.mergeItemStack(var7, 2, var8, false)) {
                  int var9 = var8 + 27;
                  int var10 = var9 + 9;
                  if (var2 >= var9 && var2 < var10) {
                     if (!this.mergeItemStack(var7, var8, var9, false)) {
                        return ItemStack.EMPTY;
                     }
                  } else if (var2 >= var8 && var2 < var9) {
                     if (!this.mergeItemStack(var7, var9, var10, false)) {
                        return ItemStack.EMPTY;
                     }
                  } else if (!this.mergeItemStack(var7, var9, var9, false)) {
                     return ItemStack.EMPTY;
                  }

                  return ItemStack.EMPTY;
               }
            } else if (!this.mergeItemStack(var7, 0, 1, false)) {
               return ItemStack.EMPTY;
            }
         } else if (!this.mergeItemStack(var7, var8, this.inventorySlots.size(), true)) {
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
      this.field25532.closeInventory(var1);
   }
}

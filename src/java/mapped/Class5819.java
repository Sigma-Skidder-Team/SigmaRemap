package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

public class Class5819 extends Container {
   private static String[] field25493;
   private final IInventory field25494;
   private final Class8202 field25495;
   private final Slot field25496;

   public Class5819(int var1, PlayerInventory var2) {
      this(var1, var2, new Class927(5), new Class8206(2));
   }

   public Class5819(int var1, PlayerInventory var2, IInventory var3, Class8202 var4) {
      super(ContainerType.field35658, var1);
      assertInventorySize(var3, 5);
      assertIntArraySize(var4, 2);
      this.field25494 = var3;
      this.field25495 = var4;
      this.addSlot(new Class5840(var3, 0, 56, 51));
      this.addSlot(new Class5840(var3, 1, 79, 58));
      this.addSlot(new Class5840(var3, 2, 102, 51));
      this.field25496 = this.addSlot(new Class5855(var3, 3, 79, 17));
      this.addSlot(new Class5864(var3, 4, 17, 17));
      this.trackIntArray(var4);

      for (int var7 = 0; var7 < 3; var7++) {
         for (int var8 = 0; var8 < 9; var8++) {
            this.addSlot(new Slot(var2, var8 + var7 * 9 + 9, 8 + var8 * 18, 84 + var7 * 18));
         }
      }

      for (int var9 = 0; var9 < 9; var9++) {
         this.addSlot(new Slot(var2, var9, 8 + var9 * 18, 142));
      }
   }

   @Override
   public boolean canInteractWith(PlayerEntity var1) {
      return this.field25494.isUsableByPlayer(var1);
   }

   @Override
   public ItemStack transferStackInSlot(PlayerEntity var1, int var2) {
      ItemStack var5 = ItemStack.EMPTY;
      Slot var6 = this.field25468.get(var2);
      if (var6 != null && var6.getHasStack()) {
         ItemStack var7 = var6.getStack();
         var5 = var7.copy();
         if ((var2 < 0 || var2 > 2) && var2 != 3 && var2 != 4) {
            if (!Class5864.method18282(var5)) {
               if (!this.field25496.isItemValid(var7)) {
                  if (Class5840.method18275(var5) && var5.getCount() == 1) {
                     if (!this.mergeItemStack(var7, 0, 3, false)) {
                        return ItemStack.EMPTY;
                     }
                  } else if (var2 >= 5 && var2 < 32) {
                     if (!this.mergeItemStack(var7, 32, 41, false)) {
                        return ItemStack.EMPTY;
                     }
                  } else if (var2 >= 32 && var2 < 41) {
                     if (!this.mergeItemStack(var7, 5, 32, false)) {
                        return ItemStack.EMPTY;
                     }
                  } else if (!this.mergeItemStack(var7, 5, 41, false)) {
                     return ItemStack.EMPTY;
                  }
               } else if (!this.mergeItemStack(var7, 3, 4, false)) {
                  return ItemStack.EMPTY;
               }
            } else if (this.mergeItemStack(var7, 4, 5, false) || this.field25496.isItemValid(var7) && !this.mergeItemStack(var7, 3, 4, false)) {
               return ItemStack.EMPTY;
            }
         } else {
            if (!this.mergeItemStack(var7, 5, 41, true)) {
               return ItemStack.EMPTY;
            }

            var6.onSlotChange(var7, var5);
         }

         if (!var7.isEmpty()) {
            var6.onSlotChanged();
         } else {
            var6.putStack(ItemStack.EMPTY);
         }

         if (var7.getCount() == var5.getCount()) {
            return ItemStack.EMPTY;
         }

         var6.onTake(var1, var7);
      }

      return var5;
   }

   public int method18174() {
      return this.field25495.method28505(1);
   }

   public int method18175() {
      return this.field25495.method28505(0);
   }
}

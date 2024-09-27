package mapped;

import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;

public class Class5821 extends Container {
   private static String[] field25499;
   private final IInventory field25500 = new Class984(this, 1);
   private final Class5845 field25501;
   private final IWorldPosCallable field25502;
   private final Class8202 field25503;

   public Class5821(int var1, IInventory var2) {
      this(var1, var2, new Class8206(3), IWorldPosCallable.field39521);
   }

   public Class5821(int var1, IInventory var2, Class8202 var3, IWorldPosCallable var4) {
      super(ContainerType.field35656, var1);
      assertIntArraySize(var3, 3);
      this.field25503 = var3;
      this.field25502 = var4;
      this.field25501 = new Class5845(this, this.field25500, 0, 136, 110);
      this.addSlot(this.field25501);
      this.trackIntArray(var3);
      byte var7 = 36;
      short var8 = 137;

      for (int var9 = 0; var9 < 3; var9++) {
         for (int var10 = 0; var10 < 9; var10++) {
            this.addSlot(new Slot(var2, var10 + var9 * 9 + 9, 36 + var10 * 18, 137 + var9 * 18));
         }
      }

      for (int var11 = 0; var11 < 9; var11++) {
         this.addSlot(new Slot(var2, var11, 36 + var11 * 18, 195));
      }
   }

   @Override
   public void onContainerClosed(PlayerEntity var1) {
      super.onContainerClosed(var1);
      if (!var1.world.isRemote) {
         ItemStack var4 = this.field25501.decrStackSize(this.field25501.getSlotStackLimit());
         if (!var4.isEmpty()) {
            var1.dropItem(var4, false);
         }
      }
   }

   @Override
   public boolean canInteractWith(PlayerEntity var1) {
      return isWithinUsableDistance(this.field25502, var1, Blocks.BEACON);
   }

   @Override
   public void updateProgressBar(int var1, int var2) {
      super.updateProgressBar(var1, var2);
      this.detectAndSendChanges();
   }

   @Override
   public ItemStack transferStackInSlot(PlayerEntity var1, int var2) {
      ItemStack var5 = ItemStack.EMPTY;
      Slot var6 = this.inventorySlots.get(var2);
      if (var6 != null && var6.getHasStack()) {
         ItemStack var7 = var6.getStack();
         var5 = var7.copy();
         if (var2 != 0) {
            if (!this.field25501.getHasStack() && this.field25501.isItemValid(var7) && var7.getCount() == 1) {
               if (!this.mergeItemStack(var7, 0, 1, false)) {
                  return ItemStack.EMPTY;
               }
            } else if (var2 >= 1 && var2 < 28) {
               if (!this.mergeItemStack(var7, 28, 37, false)) {
                  return ItemStack.EMPTY;
               }
            } else if (var2 >= 28 && var2 < 37) {
               if (!this.mergeItemStack(var7, 1, 28, false)) {
                  return ItemStack.EMPTY;
               }
            } else if (!this.mergeItemStack(var7, 1, 37, false)) {
               return ItemStack.EMPTY;
            }
         } else {
            if (!this.mergeItemStack(var7, 1, 37, true)) {
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

   public int method18178() {
      return this.field25503.method28505(0);
   }

   @Nullable
   public Effect method18179() {
      return Effect.get(this.field25503.method28505(1));
   }

   @Nullable
   public Effect method18180() {
      return Effect.get(this.field25503.method28505(2));
   }

   public void method18181(int var1, int var2) {
      if (this.field25501.getHasStack()) {
         this.field25503.method28506(1, var1);
         this.field25503.method28506(2, var2);
         this.field25501.decrStackSize(1);
      }
   }

   public boolean method18182() {
      return !this.field25500.getStackInSlot(0).isEmpty();
   }
}

package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;

public class Class5817 extends Container {
   private static String[] field25488;
   private final IInventory field25489;

   public Class5817(int var1, PlayerInventory var2) {
      this(var1, var2, new Class927(9));
   }

   public Class5817(int var1, PlayerInventory var2, IInventory var3) {
      super(ContainerType.field35654, var1);
      assertInventorySize(var3, 9);
      this.field25489 = var3;
      var3.openInventory(var2.field5444);

      for (int var6 = 0; var6 < 3; var6++) {
         for (int var7 = 0; var7 < 3; var7++) {
            this.addSlot(new Slot(var3, var7 + var6 * 3, 62 + var7 * 18, 17 + var6 * 18));
         }
      }

      for (int var8 = 0; var8 < 3; var8++) {
         for (int var10 = 0; var10 < 9; var10++) {
            this.addSlot(new Slot(var2, var10 + var8 * 9 + 9, 8 + var10 * 18, 84 + var8 * 18));
         }
      }

      for (int var9 = 0; var9 < 9; var9++) {
         this.addSlot(new Slot(var2, var9, 8 + var9 * 18, 142));
      }
   }

   @Override
   public boolean canInteractWith(PlayerEntity var1) {
      return this.field25489.isUsableByPlayer(var1);
   }

   @Override
   public ItemStack transferStackInSlot(PlayerEntity var1, int var2) {
      ItemStack var5 = ItemStack.EMPTY;
      Slot var6 = this.field25468.get(var2);
      if (var6 != null && var6.getHasStack()) {
         ItemStack var7 = var6.getStack();
         var5 = var7.copy();
         if (var2 >= 9) {
            if (!this.mergeItemStack(var7, 0, 9, false)) {
               return ItemStack.EMPTY;
            }
         } else if (!this.mergeItemStack(var7, 9, 45, true)) {
            return ItemStack.EMPTY;
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

   @Override
   public void onContainerClosed(PlayerEntity var1) {
      super.onContainerClosed(var1);
      this.field25489.closeInventory(var1);
   }
}

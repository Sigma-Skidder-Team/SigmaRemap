package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

public class Class5814 extends Container {
   private static String[] field25481;
   private final IInventory field25482;

   public Class5814(int var1, PlayerInventory var2) {
      this(var1, var2, new Class927(27));
   }

   public Class5814(int var1, PlayerInventory var2, IInventory var3) {
      super(ContainerType.field35667, var1);
      assertInventorySize(var3, 27);
      this.field25482 = var3;
      var3.openInventory(var2.field5444);
      byte var6 = 3;
      byte var7 = 9;

      for (int var8 = 0; var8 < 3; var8++) {
         for (int var9 = 0; var9 < 9; var9++) {
            this.addSlot(new Class5861(var3, var9 + var8 * 9, 8 + var9 * 18, 18 + var8 * 18));
         }
      }

      for (int var10 = 0; var10 < 3; var10++) {
         for (int var12 = 0; var12 < 9; var12++) {
            this.addSlot(new Slot(var2, var12 + var10 * 9 + 9, 8 + var12 * 18, 84 + var10 * 18));
         }
      }

      for (int var11 = 0; var11 < 9; var11++) {
         this.addSlot(new Slot(var2, var11, 8 + var11 * 18, 142));
      }
   }

   @Override
   public boolean canInteractWith(PlayerEntity var1) {
      return this.field25482.isUsableByPlayer(var1);
   }

   @Override
   public ItemStack transferStackInSlot(PlayerEntity var1, int var2) {
      ItemStack var5 = ItemStack.EMPTY;
      Slot var6 = this.field25468.get(var2);
      if (var6 != null && var6.getHasStack()) {
         ItemStack var7 = var6.getStack();
         var5 = var7.copy();
         if (var2 >= this.field25482.getSizeInventory()) {
            if (!this.mergeItemStack(var7, 0, this.field25482.getSizeInventory(), false)) {
               return ItemStack.EMPTY;
            }
         } else if (!this.mergeItemStack(var7, this.field25482.getSizeInventory(), this.field25468.size(), true)) {
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
      this.field25482.closeInventory(var1);
   }
}

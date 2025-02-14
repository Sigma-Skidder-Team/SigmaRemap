package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.ItemStack;

public abstract class Class5823 extends Container {
   public final Class921 field25512 = new Class921();
   public final IInventory field25513 = new Class928(this, 2);
   public final IWorldPosCallable field25514;
   public final PlayerEntity field25515;

   public abstract boolean method18189(PlayerEntity var1, boolean var2);

   public abstract ItemStack method18190(PlayerEntity var1, ItemStack var2);

   public abstract boolean method18191(BlockState var1);

   public Class5823(ContainerType<?> var1, int var2, PlayerInventory var3, IWorldPosCallable var4) {
      super(var1, var2);
      this.field25514 = var4;
      this.field25515 = var3.field5444;
      this.addSlot(new Slot(this.field25513, 0, 27, 47));
      this.addSlot(new Slot(this.field25513, 1, 76, 47));
      this.addSlot(new Class5841(this, this.field25512, 2, 134, 47));

      for (int var7 = 0; var7 < 3; var7++) {
         for (int var8 = 0; var8 < 9; var8++) {
            this.addSlot(new Slot(var3, var8 + var7 * 9 + 9, 8 + var8 * 18, 84 + var7 * 18));
         }
      }

      for (int var9 = 0; var9 < 9; var9++) {
         this.addSlot(new Slot(var3, var9, 8 + var9 * 18, 142));
      }
   }

   public abstract void method18192();

   @Override
   public void onCraftMatrixChanged(IInventory var1) {
      super.onCraftMatrixChanged(var1);
      if (var1 == this.field25513) {
         this.method18192();
      }
   }

   @Override
   public void onContainerClosed(PlayerEntity var1) {
      super.onContainerClosed(var1);
      this.field25514.method31716((var2, var3) -> this.clearContainer(var1, var2, this.field25513));
   }

   @Override
   public boolean canInteractWith(PlayerEntity var1) {
      return this.field25514
         .<Boolean>applyOrElse(
            (var2, var3) -> this.method18191(var2.getBlockState(var3))
                  ? var1.getDistanceSq((double)var3.getX() + 0.5, (double)var3.getY() + 0.5, (double)var3.getZ() + 0.5) <= 64.0
                  : false,
            true
         );
   }

   public boolean method18193(ItemStack var1) {
      return false;
   }

   @Override
   public ItemStack transferStackInSlot(PlayerEntity var1, int var2) {
      ItemStack var5 = ItemStack.EMPTY;
      Slot var6 = this.inventorySlots.get(var2);
      if (var6 != null && var6.getHasStack()) {
         ItemStack var7 = var6.getStack();
         var5 = var7.copy();
         if (var2 != 2) {
            if (var2 != 0 && var2 != 1) {
               if (var2 >= 3 && var2 < 39) {
                  int var8 = !this.method18193(var5) ? 0 : 1;
                  if (!this.mergeItemStack(var7, var8, 2, false)) {
                     return ItemStack.EMPTY;
                  }
               }
            } else if (!this.mergeItemStack(var7, 3, 39, false)) {
               return ItemStack.EMPTY;
            }
         } else {
            if (!this.mergeItemStack(var7, 3, 39, true)) {
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
}

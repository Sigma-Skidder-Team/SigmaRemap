package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public class Class990 implements IInventory {
   private static String[] field5474;
   private final IInventory field5475;
   private final IInventory field5476;

   public Class990(IInventory var1, IInventory var2) {
      if (var1 == null) {
         var1 = var2;
      }

      if (var2 == null) {
         var2 = var1;
      }

      this.field5475 = var1;
      this.field5476 = var2;
   }

   @Override
   public int getSizeInventory() {
      return this.field5475.getSizeInventory() + this.field5476.getSizeInventory();
   }

   @Override
   public boolean isEmpty() {
      return this.field5475.isEmpty() && this.field5476.isEmpty();
   }

   public boolean isPartOfLargeChest(IInventory var1) {
      return this.field5475 == var1 || this.field5476 == var1;
   }

   @Override
   public ItemStack getStackInSlot(int var1) {
      return var1 < this.field5475.getSizeInventory() ? this.field5475.getStackInSlot(var1) : this.field5476.getStackInSlot(var1 - this.field5475.getSizeInventory());
   }

   @Override
   public ItemStack decrStackSize(int var1, int var2) {
      return var1 < this.field5475.getSizeInventory() ? this.field5475.decrStackSize(var1, var2) : this.field5476.decrStackSize(var1 - this.field5475.getSizeInventory(), var2);
   }

   @Override
   public ItemStack removeStackFromSlot(int var1) {
      return var1 < this.field5475.getSizeInventory() ? this.field5475.removeStackFromSlot(var1) : this.field5476.removeStackFromSlot(var1 - this.field5475.getSizeInventory());
   }

   @Override
   public void setInventorySlotContents(int var1, ItemStack var2) {
      if (var1 < this.field5475.getSizeInventory()) {
         this.field5475.setInventorySlotContents(var1, var2);
      } else {
         this.field5476.setInventorySlotContents(var1 - this.field5475.getSizeInventory(), var2);
      }
   }

   @Override
   public int getInventoryStackLimit() {
      return this.field5475.getInventoryStackLimit();
   }

   @Override
   public void markDirty() {
      this.field5475.markDirty();
      this.field5476.markDirty();
   }

   @Override
   public boolean isUsableByPlayer(PlayerEntity var1) {
      return this.field5475.isUsableByPlayer(var1) && this.field5476.isUsableByPlayer(var1);
   }

   @Override
   public void openInventory(PlayerEntity var1) {
      this.field5475.openInventory(var1);
      this.field5476.openInventory(var1);
   }

   @Override
   public void closeInventory(PlayerEntity var1) {
      this.field5475.closeInventory(var1);
      this.field5476.closeInventory(var1);
   }

   @Override
   public boolean isItemValidForSlot(int var1, ItemStack var2) {
      return var1 < this.field5475.getSizeInventory() ? this.field5475.isItemValidForSlot(var1, var2) : this.field5476.isItemValidForSlot(var1 - this.field5475.getSizeInventory(), var2);
   }

   @Override
   public void method3625() {
      this.field5475.method3625();
      this.field5476.method3625();
   }
}

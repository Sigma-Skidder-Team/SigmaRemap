package net.minecraft.inventory;

import mapped.IClearable;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Set;

public interface IInventory extends IClearable {
   int getSizeInventory();

   boolean isEmpty();

   ItemStack getStackInSlot(int var1);

   ItemStack decrStackSize(int var1, int var2);

   ItemStack removeStackFromSlot(int var1);

   void setInventorySlotContents(int var1, ItemStack var2);

   default int getInventoryStackLimit() {
      return 64;
   }

   void markDirty();

   boolean isUsableByPlayer(PlayerEntity var1);

   default void openInventory(PlayerEntity var1) {
   }

   default void closeInventory(PlayerEntity var1) {
   }

   default boolean isItemValidForSlot(int var1, ItemStack var2) {
      return true;
   }

   default int count(Item var1) {
      int var4 = 0;

      for (int var5 = 0; var5 < this.getSizeInventory(); var5++) {
         ItemStack var6 = this.getStackInSlot(var5);
         if (var6.getItem().equals(var1)) {
            var4 += var6.getCount();
         }
      }

      return var4;
   }

   default boolean hasAny(Set<Item> var1) {
      for (int var4 = 0; var4 < this.getSizeInventory(); var4++) {
         ItemStack var5 = this.getStackInSlot(var4);
         if (var1.contains(var5.getItem()) && var5.getCount() > 0) {
            return true;
         }
      }

      return false;
   }
}

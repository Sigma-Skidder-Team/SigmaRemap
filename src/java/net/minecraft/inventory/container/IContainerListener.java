package net.minecraft.inventory.container;

import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public interface IContainerListener {
   void sendAllContents(Container var1, NonNullList<ItemStack> var2);

   void sendSlotContents(Container var1, int var2, ItemStack var3);

   void sendWindowProperty(Container var1, int var2, int var3);
}

package net.minecraft.inventory.container;

import mapped.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;

public class ChestContainer extends Container {
   private static String[] field25478;
   private final IInventory field25479;
   private final int field25480;

   private ChestContainer(ContainerType<?> var1, int var2, PlayerInventory var3, int var4) {
      this(var1, var2, var3, new Class927(9 * var4), var4);
   }

   public static ChestContainer method18156(int var0, PlayerInventory var1) {
      return new ChestContainer(ContainerType.field35648, var0, var1, 1);
   }

   public static ChestContainer method18157(int var0, PlayerInventory var1) {
      return new ChestContainer(ContainerType.field35649, var0, var1, 2);
   }

   public static ChestContainer method18158(int var0, PlayerInventory var1) {
      return new ChestContainer(ContainerType.field35650, var0, var1, 3);
   }

   public static ChestContainer method18159(int var0, PlayerInventory var1) {
      return new ChestContainer(ContainerType.field35651, var0, var1, 4);
   }

   public static ChestContainer method18160(int var0, PlayerInventory var1) {
      return new ChestContainer(ContainerType.field35652, var0, var1, 5);
   }

   public static ChestContainer method18161(int var0, PlayerInventory var1) {
      return new ChestContainer(ContainerType.field35653, var0, var1, 6);
   }

   public static ChestContainer method18162(int var0, PlayerInventory var1, IInventory var2) {
      return new ChestContainer(ContainerType.field35650, var0, var1, var2, 3);
   }

   public static ChestContainer method18163(int var0, PlayerInventory var1, IInventory var2) {
      return new ChestContainer(ContainerType.field35653, var0, var1, var2, 6);
   }

   public ChestContainer(ContainerType<?> var1, int var2, PlayerInventory var3, IInventory var4, int var5) {
      super(var1, var2);
      assertInventorySize(var4, var5 * 9);
      this.field25479 = var4;
      this.field25480 = var5;
      var4.openInventory(var3.field5444);
      int var8 = (this.field25480 - 4) * 18;

      for (int var9 = 0; var9 < this.field25480; var9++) {
         for (int var10 = 0; var10 < 9; var10++) {
            this.addSlot(new Slot(var4, var10 + var9 * 9, 8 + var10 * 18, 18 + var9 * 18));
         }
      }

      for (int var11 = 0; var11 < 3; var11++) {
         for (int var13 = 0; var13 < 9; var13++) {
            this.addSlot(new Slot(var3, var13 + var11 * 9 + 9, 8 + var13 * 18, 103 + var11 * 18 + var8));
         }
      }

      for (int var12 = 0; var12 < 9; var12++) {
         this.addSlot(new Slot(var3, var12, 8 + var12 * 18, 161 + var8));
      }
   }

   @Override
   public boolean canInteractWith(PlayerEntity var1) {
      return this.field25479.isUsableByPlayer(var1);
   }

   @Override
   public ItemStack transferStackInSlot(PlayerEntity var1, int var2) {
      ItemStack var5 = ItemStack.EMPTY;
      Slot var6 = this.inventorySlots.get(var2);
      if (var6 != null && var6.getHasStack()) {
         ItemStack var7 = var6.getStack();
         var5 = var7.copy();
         if (var2 >= this.field25480 * 9) {
            if (!this.mergeItemStack(var7, 0, this.field25480 * 9, false)) {
               return ItemStack.EMPTY;
            }
         } else if (!this.mergeItemStack(var7, this.field25480 * 9, this.inventorySlots.size(), true)) {
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
      this.field25479.closeInventory(var1);
   }

   public IInventory getLowerChestInventory() {
      return this.field25479;
   }

   public int method18165() {
      return this.field25480;
   }
}

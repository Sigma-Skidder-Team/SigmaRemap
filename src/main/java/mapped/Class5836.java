package mapped;

import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.storage.MapData;

public class Class5836 extends Container {
   private final IWorldPosCallable field25560;
   private long field25561;
   public final IInventory field25562 = new Class981(this, 2);
   private final Class921 field25563 = new Class922(this);

   public Class5836(int var1, PlayerInventory var2) {
      this(var1, var2, IWorldPosCallable.field39521);
   }

   public Class5836(int var1, PlayerInventory var2, IWorldPosCallable var3) {
      super(ContainerType.CARTOGRAPHY_TABLE, var1);
      this.field25560 = var3;
      this.addSlot(new Class5854(this, this.field25562, 0, 15, 15));
      this.addSlot(new Class5857(this, this.field25562, 1, 15, 52));
      this.addSlot(new Class5867(this, this.field25563, 2, 145, 39, var3));

      for (int var6 = 0; var6 < 3; var6++) {
         for (int var7 = 0; var7 < 9; var7++) {
            this.addSlot(new Slot(var2, var7 + var6 * 9 + 9, 8 + var7 * 18, 84 + var6 * 18));
         }
      }

      for (int var8 = 0; var8 < 9; var8++) {
         this.addSlot(new Slot(var2, var8, 8 + var8 * 18, 142));
      }
   }

   @Override
   public boolean canInteractWith(PlayerEntity var1) {
      return isWithinUsableDistance(this.field25560, var1, Blocks.CARTOGRAPHY_TABLE);
   }

   @Override
   public void onCraftMatrixChanged(IInventory var1) {
      ItemStack var4 = this.field25562.getStackInSlot(0);
      ItemStack var5 = this.field25562.getStackInSlot(1);
      ItemStack var6 = this.field25563.getStackInSlot(2);
      if (var6.isEmpty() || !var4.isEmpty() && !var5.isEmpty()) {
         if (!var4.isEmpty() && !var5.isEmpty()) {
            this.method18239(var4, var5, var6);
         }
      } else {
         this.field25563.removeStackFromSlot(2);
      }
   }

   private void method18239(ItemStack var1, ItemStack var2, ItemStack var3) {
      this.field25560.method31716((var4, var5) -> {
         Item var8 = var2.getItem();
         MapData var9 = Class3316.method11860(var1, var4);
         if (var9 != null) {
            ItemStack var10;
            if (var8 == Items.field37899 && !var9.locked && var9.scale < 4) {
               var10 = var1.copy();
               var10.setCount(1);
               var10.getOrCreateTag().putInt("map_scale_direction", 1);
               this.detectAndSendChanges();
            } else if (var8 == Items.field37471 && !var9.locked) {
               var10 = var1.copy();
               var10.setCount(1);
               var10.getOrCreateTag().putBoolean("map_to_lock", true);
               this.detectAndSendChanges();
            } else {
               if (var8 != Items.field38056) {
                  this.field25563.removeStackFromSlot(2);
                  this.detectAndSendChanges();
                  return;
               }

               var10 = var1.copy();
               var10.setCount(2);
               this.detectAndSendChanges();
            }

            if (!ItemStack.areItemStacksEqual(var10, var3)) {
               this.field25563.setInventorySlotContents(2, var10);
               this.detectAndSendChanges();
            }
         }
      });
   }

   @Override
   public boolean canMergeSlot(ItemStack var1, Slot var2) {
      return var2.field25578 != this.field25563 && super.canMergeSlot(var1, var2);
   }

   @Override
   public ItemStack transferStackInSlot(PlayerEntity var1, int var2) {
      ItemStack var5 = ItemStack.EMPTY;
      Slot var6 = this.inventorySlots.get(var2);
      if (var6 != null && var6.getHasStack()) {
         ItemStack var7 = var6.getStack();
         Item var8 = var7.getItem();
         var5 = var7.copy();
         if (var2 != 2) {
            if (var2 != 1 && var2 != 0) {
               if (var8 != Items.field37955) {
                  if (var8 != Items.field37899 && var8 != Items.field38056 && var8 != Items.field37471) {
                     if (var2 >= 3 && var2 < 30) {
                        if (!this.mergeItemStack(var7, 30, 39, false)) {
                           return ItemStack.EMPTY;
                        }
                     } else if (var2 >= 30 && var2 < 39 && !this.mergeItemStack(var7, 3, 30, false)) {
                        return ItemStack.EMPTY;
                     }
                  } else if (!this.mergeItemStack(var7, 1, 2, false)) {
                     return ItemStack.EMPTY;
                  }
               } else if (!this.mergeItemStack(var7, 0, 1, false)) {
                  return ItemStack.EMPTY;
               }
            } else if (!this.mergeItemStack(var7, 3, 39, false)) {
               return ItemStack.EMPTY;
            }
         } else {
            var8.method11725(var7, var1.world, var1);
            if (!this.mergeItemStack(var7, 3, 39, true)) {
               return ItemStack.EMPTY;
            }

            var6.onSlotChange(var7, var5);
         }

         if (var7.isEmpty()) {
            var6.putStack(ItemStack.EMPTY);
         }

         var6.onSlotChanged();
         if (var7.getCount() == var5.getCount()) {
            return ItemStack.EMPTY;
         }

         var6.onTake(var1, var7);
         this.detectAndSendChanges();
      }

      return var5;
   }

   @Override
   public void onContainerClosed(PlayerEntity var1) {
      super.onContainerClosed(var1);
      this.field25563.removeStackFromSlot(2);
      this.field25560.method31716((var2, var3) -> this.clearContainer(var1, var1.world, this.field25562));
   }

   // $VF: synthetic method
   public static long method18242(Class5836 var0) {
      return var0.field25561;
   }

   // $VF: synthetic method
   public static long method18243(Class5836 var0, long var1) {
      return var0.field25561 = var1;
   }
}

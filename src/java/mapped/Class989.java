package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

public class Class989 implements IInventory {
   private static String[] field5472;
   public final Class948 field5473;

   public Class989(Class948 var1) {
      this.field5473 = var1;
   }

   @Override
   public int getSizeInventory() {
      return 1;
   }

   @Override
   public boolean isEmpty() {
      return Class948.method3815(this.field5473).isEmpty();
   }

   @Override
   public ItemStack getStackInSlot(int var1) {
      return var1 != 0 ? ItemStack.EMPTY : Class948.method3815(this.field5473);
   }

   @Override
   public ItemStack decrStackSize(int var1, int var2) {
      if (var1 != 0) {
         return ItemStack.EMPTY;
      } else {
         ItemStack var5 = Class948.method3815(this.field5473).split(var2);
         if (Class948.method3815(this.field5473).isEmpty()) {
            Class948.method3816(this.field5473);
         }

         return var5;
      }
   }

   @Override
   public ItemStack removeStackFromSlot(int var1) {
      if (var1 != 0) {
         return ItemStack.EMPTY;
      } else {
         ItemStack var4 = Class948.method3815(this.field5473);
         Class948.method3817(this.field5473, ItemStack.EMPTY);
         Class948.method3816(this.field5473);
         return var4;
      }
   }

   @Override
   public void setInventorySlotContents(int var1, ItemStack var2) {
   }

   @Override
   public int getInventoryStackLimit() {
      return 1;
   }

   @Override
   public void markDirty() {
      this.field5473.markDirty();
   }

   @Override
   public boolean isUsableByPlayer(PlayerEntity var1) {
      if (this.field5473.world.getTileEntity(this.field5473.pos) == this.field5473) {
         return !(
               var1.getDistanceNearest(
                     (double)this.field5473.pos.getX() + 0.5,
                     (double)this.field5473.pos.getY() + 0.5,
                     (double)this.field5473.pos.getZ() + 0.5
                  )
                  > 64.0
            )
            ? this.field5473.method3806()
            : false;
      } else {
         return false;
      }
   }

   @Override
   public boolean isItemValidForSlot(int var1, ItemStack var2) {
      return false;
   }

   @Override
   public void method3625() {
   }
}

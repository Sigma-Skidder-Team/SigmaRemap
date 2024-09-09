package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;

public class Class988 implements IInventory {
   private static String[] field5466;
   private final Class1060 field5467;
   private final NonNullList<ItemStack> field5468 = NonNullList.<ItemStack>method68(3, ItemStack.EMPTY);
   private Class9346 field5469;
   private int field5470;
   private int field5471;

   public Class988(Class1060 var1) {
      this.field5467 = var1;
   }

   @Override
   public int getSizeInventory() {
      return this.field5468.size();
   }

   @Override
   public boolean isEmpty() {
      for (ItemStack var4 : this.field5468) {
         if (!var4.isEmpty()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ItemStack getStackInSlot(int var1) {
      return this.field5468.get(var1);
   }

   @Override
   public ItemStack decrStackSize(int var1, int var2) {
      ItemStack var5 = this.field5468.get(var1);
      if (var1 == 2 && !var5.isEmpty()) {
         return Class7920.method26563(this.field5468, var1, var5.getCount());
      } else {
         ItemStack var6 = Class7920.method26563(this.field5468, var1, var2);
         if (!var6.isEmpty() && this.method4065(var1)) {
            this.method4066();
         }

         return var6;
      }
   }

   private boolean method4065(int var1) {
      return var1 == 0 || var1 == 1;
   }

   @Override
   public ItemStack removeStackFromSlot(int var1) {
      return Class7920.method26564(this.field5468, var1);
   }

   @Override
   public void setInventorySlotContents(int var1, ItemStack var2) {
      this.field5468.set(var1, var2);
      if (!var2.isEmpty() && var2.getCount() > this.getInventoryStackLimit()) {
         var2.method32180(this.getInventoryStackLimit());
      }

      if (this.method4065(var1)) {
         this.method4066();
      }
   }

   @Override
   public boolean isUsableByPlayer(PlayerEntity var1) {
      return this.field5467.method4740() == var1;
   }

   @Override
   public void markDirty() {
      this.method4066();
   }

   public void method4066() {
      this.field5469 = null;
      ItemStack var3;
      ItemStack var4;
      if (!this.field5468.get(0).isEmpty()) {
         var3 = this.field5468.get(0);
         var4 = this.field5468.get(1);
      } else {
         var3 = this.field5468.get(1);
         var4 = ItemStack.EMPTY;
      }

      if (!var3.isEmpty()) {
         Class46 var5 = this.field5467.method4742();
         if (!var5.isEmpty()) {
            Class9346 var6 = var5.method163(var3, var4, this.field5470);
            if (var6 == null || var6.method35382()) {
               this.field5469 = var6;
               var6 = var5.method163(var4, var3, this.field5470);
            }

            if (var6 != null && !var6.method35382()) {
               this.field5469 = var6;
               this.setInventorySlotContents(2, var6.method35370());
               this.field5471 = var6.method35381();
            } else {
               this.setInventorySlotContents(2, ItemStack.EMPTY);
               this.field5471 = 0;
            }
         }

         this.field5467.method4747(this.getStackInSlot(2));
      } else {
         this.setInventorySlotContents(2, ItemStack.EMPTY);
         this.field5471 = 0;
      }
   }

   @Nullable
   public Class9346 method4067() {
      return this.field5469;
   }

   public void method4068(int var1) {
      this.field5470 = var1;
      this.method4066();
   }

   @Override
   public void method3625() {
      this.field5468.clear();
   }

   public int method4069() {
      return this.field5471;
   }
}

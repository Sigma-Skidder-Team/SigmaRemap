package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.ItemStack;

public class Class5826 extends Container {
   private static String[] field25525;
   private final Class1060 field25526;
   private final Class988 field25527;
   private int field25528;
   private boolean field25529;
   private boolean field25530;

   public Class5826(int var1, PlayerInventory var2) {
      this(var1, var2, new Class1061(var2.field5444));
   }

   public Class5826(int var1, PlayerInventory var2, Class1060 var3) {
      super(ContainerType.MERCHANT, var1);
      this.field25526 = var3;
      this.field25527 = new Class988(var3);
      this.addSlot(new Slot(this.field25527, 0, 136, 37));
      this.addSlot(new Slot(this.field25527, 1, 162, 37));
      this.addSlot(new Class5868(var2.field5444, var3, this.field25527, 2, 220, 37));

      for (int var6 = 0; var6 < 3; var6++) {
         for (int var7 = 0; var7 < 9; var7++) {
            this.addSlot(new Slot(var2, var7 + var6 * 9 + 9, 108 + var7 * 18, 84 + var6 * 18));
         }
      }

      for (int var8 = 0; var8 < 9; var8++) {
         this.addSlot(new Slot(var2, var8, 108 + var8 * 18, 142));
      }
   }

   public void method18203(boolean var1) {
      this.field25529 = var1;
   }

   @Override
   public void onCraftMatrixChanged(IInventory var1) {
      this.field25527.method4066();
      super.onCraftMatrixChanged(var1);
   }

   public void method18204(int var1) {
      this.field25527.method4068(var1);
   }

   @Override
   public boolean canInteractWith(PlayerEntity var1) {
      return this.field25526.method4740() == var1;
   }

   public int method18205() {
      return this.field25526.method4721();
   }

   public int method18206() {
      return this.field25527.method4069();
   }

   public void method18207(int var1) {
      this.field25526.method4744(var1);
   }

   public int method18208() {
      return this.field25528;
   }

   public void method18209(int var1) {
      this.field25528 = var1;
   }

   public void method18210(boolean var1) {
      this.field25530 = var1;
   }

   public boolean method18211() {
      return this.field25530;
   }

   @Override
   public boolean canMergeSlot(ItemStack var1, Slot var2) {
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
               if (var2 >= 3 && var2 < 30) {
                  if (!this.mergeItemStack(var7, 30, 39, false)) {
                     return ItemStack.EMPTY;
                  }
               } else if (var2 >= 30 && var2 < 39 && !this.mergeItemStack(var7, 3, 30, false)) {
                  return ItemStack.EMPTY;
               }
            } else if (!this.mergeItemStack(var7, 3, 39, false)) {
               return ItemStack.EMPTY;
            }
         } else {
            if (!this.mergeItemStack(var7, 3, 39, true)) {
               return ItemStack.EMPTY;
            }

            var6.onSlotChange(var7, var5);
            this.method18212();
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

   private void method18212() {
      if (!this.field25526.method4753().isRemote) {
         Entity var3 = (Entity)this.field25526;
         this.field25526
            .method4753()
            .playSound(var3.getPosX(), var3.getPosY(), var3.getPosZ(), this.field25526.method4748(), SoundCategory.field14734, 1.0F, 1.0F, false);
      }
   }

   @Override
   public void onContainerClosed(PlayerEntity var1) {
      super.onContainerClosed(var1);
      this.field25526.method4683((PlayerEntity)null);
      if (!this.field25526.method4753().isRemote) {
         if (!var1.isAlive() || var1 instanceof ServerPlayerEntity && ((ServerPlayerEntity)var1).method2783()) {
            ItemStack var4 = this.field25527.removeStackFromSlot(0);
            if (!var4.isEmpty()) {
               var1.dropItem(var4, false);
            }

            var4 = this.field25527.removeStackFromSlot(1);
            if (!var4.isEmpty()) {
               var1.dropItem(var4, false);
            }
         } else {
            var1.inventory.method4047(var1.world, this.field25527.removeStackFromSlot(0));
            var1.inventory.method4047(var1.world, this.field25527.removeStackFromSlot(1));
         }
      }
   }

   public void method18213(int var1) {
      if (this.method18217().size() > var1) {
         ItemStack var4 = this.field25527.getStackInSlot(0);
         if (!var4.isEmpty()) {
            if (!this.mergeItemStack(var4, 3, 39, true)) {
               return;
            }

            this.field25527.setInventorySlotContents(0, var4);
         }

         ItemStack var5 = this.field25527.getStackInSlot(1);
         if (!var5.isEmpty()) {
            if (!this.mergeItemStack(var5, 3, 39, true)) {
               return;
            }

            this.field25527.setInventorySlotContents(1, var5);
         }

         if (this.field25527.getStackInSlot(0).isEmpty() && this.field25527.getStackInSlot(1).isEmpty()) {
            ItemStack var6 = this.method18217().get(var1).method35366();
            this.method18214(0, var6);
            ItemStack var7 = this.method18217().get(var1).method35367();
            this.method18214(1, var7);
         }
      }
   }

   private void method18214(int var1, ItemStack var2) {
      if (!var2.isEmpty()) {
         for (int var5 = 3; var5 < 39; var5++) {
            ItemStack var6 = this.inventorySlots.get(var5).getStack();
            if (!var6.isEmpty() && this.method18215(var2, var6)) {
               ItemStack var7 = this.field25527.getStackInSlot(var1);
               int var8 = !var7.isEmpty() ? var7.getCount() : 0;
               int var9 = Math.min(var2.getMaxStackSize() - var8, var6.getCount());
               ItemStack var10 = var6.copy();
               int var11 = var8 + var9;
               var6.shrink(var9);
               var10.setCount(var11);
               this.field25527.setInventorySlotContents(var1, var10);
               if (var11 >= var2.getMaxStackSize()) {
                  break;
               }
            }
         }
      }
   }

   private boolean method18215(ItemStack var1, ItemStack var2) {
      return var1.getItem() == var2.getItem() && ItemStack.method32127(var1, var2);
   }

   public void method18216(Class46 var1) {
      this.field25526.method4743(var1);
   }

   public Class46 method18217() {
      return this.field25526.method4742();
   }

   public boolean method18218() {
      return this.field25529;
   }
}

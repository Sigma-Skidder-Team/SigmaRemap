package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class Class926 implements IInventory, Class925 {
   private static String[] field5255;
   private final NonNullList<ItemStack> field5256;
   private final int field5257;
   private final int field5258;
   private final Container field5259;

   public Class926(Container var1, int var2, int var3) {
      this.field5256 = NonNullList.<ItemStack>withSize(var2 * var3, ItemStack.EMPTY);
      this.field5259 = var1;
      this.field5257 = var2;
      this.field5258 = var3;
   }

   @Override
   public int getSizeInventory() {
      return this.field5256.size();
   }

   @Override
   public boolean isEmpty() {
      for (ItemStack var4 : this.field5256) {
         if (!var4.isEmpty()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ItemStack getStackInSlot(int var1) {
      return var1 < this.getSizeInventory() ? this.field5256.get(var1) : ItemStack.EMPTY;
   }

   @Override
   public ItemStack removeStackFromSlot(int var1) {
      return ItemStackHelper.method26564(this.field5256, var1);
   }

   @Override
   public ItemStack decrStackSize(int var1, int var2) {
      ItemStack var5 = ItemStackHelper.method26563(this.field5256, var1, var2);
      if (!var5.isEmpty()) {
         this.field5259.onCraftMatrixChanged(this);
      }

      return var5;
   }

   @Override
   public void setInventorySlotContents(int var1, ItemStack var2) {
      this.field5256.set(var1, var2);
      this.field5259.onCraftMatrixChanged(this);
   }

   @Override
   public void markDirty() {
   }

   @Override
   public boolean isUsableByPlayer(PlayerEntity var1) {
      return true;
   }

   @Override
   public void method3625() {
      this.field5256.clear();
   }

   public int method3670() {
      return this.field5258;
   }

   public int method3671() {
      return this.field5257;
   }

   @Override
   public void method3659(Class6207 var1) {
      for (ItemStack var5 : this.field5256) {
         var1.method19116(var5);
      }
   }
}

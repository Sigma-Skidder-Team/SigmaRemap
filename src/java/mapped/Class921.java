package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;

import javax.annotation.Nullable;

public class Class921 implements IInventory, Class923 {
   private static String[] field5240;
   private final NonNullList<ItemStack> field5241 = NonNullList.<ItemStack>method68(1, ItemStack.EMPTY);
   private IRecipe<?> field5242;

   @Override
   public int getSizeInventory() {
      return 1;
   }

   @Override
   public boolean isEmpty() {
      for (ItemStack var4 : this.field5241) {
         if (!var4.isEmpty()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ItemStack getStackInSlot(int var1) {
      return this.field5241.get(0);
   }

   @Override
   public ItemStack decrStackSize(int var1, int var2) {
      return Class7920.method26564(this.field5241, 0);
   }

   @Override
   public ItemStack removeStackFromSlot(int var1) {
      return Class7920.method26564(this.field5241, 0);
   }

   @Override
   public void setInventorySlotContents(int var1, ItemStack var2) {
      this.field5241.set(0, var2);
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
      this.field5241.clear();
   }

   @Override
   public void method3636(IRecipe<?> var1) {
      this.field5242 = var1;
   }

   @Nullable
   @Override
   public IRecipe<?> method3637() {
      return this.field5242;
   }
}

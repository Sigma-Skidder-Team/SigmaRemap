package mapped;

import com.google.common.collect.Lists;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.util.NonNullList;

import java.util.List;
import java.util.stream.Collectors;

public class Class927 implements IInventory, Class925 {
   private static String[] field5260;
   private final int field5261;
   private final NonNullList<ItemStack> field5262;
   private List<Class1073> field5263;

   public Class927(int var1) {
      this.field5261 = var1;
      this.field5262 = NonNullList.<ItemStack>method68(var1, ItemStack.EMPTY);
   }

   public Class927(ItemStack... var1) {
      this.field5261 = var1.length;
      this.field5262 = NonNullList.<ItemStack>method69(ItemStack.EMPTY, var1);
   }

   public void method3672(Class1073 var1) {
      if (this.field5263 == null) {
         this.field5263 = Lists.newArrayList();
      }

      this.field5263.add(var1);
   }

   public void method3673(Class1073 var1) {
      this.field5263.remove(var1);
   }

   @Override
   public ItemStack getStackInSlot(int var1) {
      return var1 >= 0 && var1 < this.field5262.size() ? this.field5262.get(var1) : ItemStack.EMPTY;
   }

   public List<ItemStack> method3674() {
      List var3 = this.field5262.stream().filter(var0 -> !var0.isEmpty()).collect(Collectors.toList());
      this.method3625();
      return var3;
   }

   @Override
   public ItemStack decrStackSize(int var1, int var2) {
      ItemStack var5 = ItemStackHelper.method26563(this.field5262, var1, var2);
      if (!var5.isEmpty()) {
         this.markDirty();
      }

      return var5;
   }

   public ItemStack method3675(Item var1, int var2) {
      ItemStack var5 = new ItemStack(var1, 0);

      for (int var6 = this.field5261 - 1; var6 >= 0; var6--) {
         ItemStack var7 = this.getStackInSlot(var6);
         if (var7.getItem().equals(var1)) {
            int var8 = var2 - var5.getCount();
            ItemStack var9 = var7.split(var8);
            var5.grow(var9.getCount());
            if (var5.getCount() == var2) {
               break;
            }
         }
      }

      if (!var5.isEmpty()) {
         this.markDirty();
      }

      return var5;
   }

   public ItemStack method3676(ItemStack var1) {
      ItemStack var4 = var1.copy();
      this.method3679(var4);
      if (!var4.isEmpty()) {
         this.method3678(var4);
         return !var4.isEmpty() ? var4 : ItemStack.EMPTY;
      } else {
         return ItemStack.EMPTY;
      }
   }

   public boolean method3677(ItemStack var1) {
      boolean var4 = false;

      for (ItemStack var6 : this.field5262) {
         if (var6.isEmpty() || this.method3680(var6, var1) && var6.getCount() < var6.getMaxStackSize()) {
            var4 = true;
            break;
         }
      }

      return var4;
   }

   @Override
   public ItemStack removeStackFromSlot(int var1) {
      ItemStack var4 = this.field5262.get(var1);
      if (!var4.isEmpty()) {
         this.field5262.set(var1, ItemStack.EMPTY);
         return var4;
      } else {
         return ItemStack.EMPTY;
      }
   }

   @Override
   public void setInventorySlotContents(int var1, ItemStack var2) {
      this.field5262.set(var1, var2);
      if (!var2.isEmpty() && var2.getCount() > this.getInventoryStackLimit()) {
         var2.setCount(this.getInventoryStackLimit());
      }

      this.markDirty();
   }

   @Override
   public int getSizeInventory() {
      return this.field5261;
   }

   @Override
   public boolean isEmpty() {
      for (ItemStack var4 : this.field5262) {
         if (!var4.isEmpty()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void markDirty() {
      if (this.field5263 != null) {
         for (Class1073 var4 : this.field5263) {
            var4.method4902(this);
         }
      }
   }

   @Override
   public boolean isUsableByPlayer(PlayerEntity var1) {
      return true;
   }

   @Override
   public void method3625() {
      this.field5262.clear();
      this.markDirty();
   }

   @Override
   public void method3659(Class6207 var1) {
      for (ItemStack var5 : this.field5262) {
         var1.method19117(var5);
      }
   }

   @Override
   public String toString() {
      return this.field5262.stream().filter(var0 -> !var0.isEmpty()).collect(Collectors.toList()).toString();
   }

   private void method3678(ItemStack var1) {
      for (int var4 = 0; var4 < this.field5261; var4++) {
         ItemStack var5 = this.getStackInSlot(var4);
         if (var5.isEmpty()) {
            this.setInventorySlotContents(var4, var1.copy());
            var1.setCount(0);
            return;
         }
      }
   }

   private void method3679(ItemStack var1) {
      for (int var4 = 0; var4 < this.field5261; var4++) {
         ItemStack var5 = this.getStackInSlot(var4);
         if (this.method3680(var5, var1)) {
            this.method3681(var1, var5);
            if (var1.isEmpty()) {
               return;
            }
         }
      }
   }

   private boolean method3680(ItemStack var1, ItemStack var2) {
      return var1.getItem() == var2.getItem() && ItemStack.method32127(var1, var2);
   }

   private void method3681(ItemStack var1, ItemStack var2) {
      int var5 = Math.min(this.getInventoryStackLimit(), var2.getMaxStackSize());
      int var6 = Math.min(var1.getCount(), var5 - var2.getCount());
      if (var6 > 0) {
         var2.grow(var6);
         var1.shrink(var6);
         this.markDirty();
      }
   }

   public void method3682(ListNBT var1) {
      for (int var4 = 0; var4 < var1.size(); var4++) {
         ItemStack var5 = ItemStack.read(var1.getCompound(var4));
         if (!var5.isEmpty()) {
            this.method3676(var5);
         }
      }
   }

   public ListNBT method3683() {
      ListNBT var3 = new ListNBT();

      for (int var4 = 0; var4 < this.getSizeInventory(); var4++) {
         ItemStack var5 = this.getStackInSlot(var4);
         if (!var5.isEmpty()) {
            var3.add(var5.method32112(new CompoundNBT()));
         }
      }

      return var3;
   }
}

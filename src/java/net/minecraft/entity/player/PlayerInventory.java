package net.minecraft.entity.player;

import com.google.common.collect.ImmutableList;
import mapped.*;
import net.minecraft.block.BlockState;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.crash.ReportedException;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.network.play.server.SSetSlotPacket;
import net.minecraft.util.DamageSource;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import java.util.List;
import java.util.function.Predicate;

public class PlayerInventory implements IInventory, INameable {
   public final NonNullList<ItemStack> field5439 = NonNullList.<ItemStack>method68(36, ItemStack.EMPTY);
   public final NonNullList<ItemStack> field5440 = NonNullList.<ItemStack>method68(4, ItemStack.EMPTY);
   public final NonNullList<ItemStack> field5441 = NonNullList.<ItemStack>method68(1, ItemStack.EMPTY);
   private final List<NonNullList<ItemStack>> field5442 = ImmutableList.of(this.field5439, this.field5440, this.field5441);
   public int currentItem;
   public final PlayerEntity field5444;
   private ItemStack field5445 = ItemStack.EMPTY;
   private int field5446;

   public PlayerInventory(PlayerEntity var1) {
      this.field5444 = var1;
   }

   public ItemStack method4028() {
      return ! isHotbar(this.currentItem) ? ItemStack.EMPTY : this.field5439.get(this.currentItem);
   }

   public static int method4029() {
      return 9;
   }

   private boolean method4030(ItemStack var1, ItemStack var2) {
      return !var1.isEmpty()
         && this.method4031(var1, var2)
         && var1.method32114()
         && var1.getCount() < var1.getMaxStackSize()
         && var1.getCount() < this.getInventoryStackLimit();
   }

   private boolean method4031(ItemStack var1, ItemStack var2) {
      return var1.getItem() == var2.getItem() && ItemStack.method32127(var1, var2);
   }

   public int method4032() {
      for (int var3 = 0; var3 < this.field5439.size(); var3++) {
         if (this.field5439.get(var3).isEmpty()) {
            return var3;
         }
      }

      return -1;
   }

   public void setPickedItemStack(ItemStack var1) {
      int var4 = this.getSlotFor(var1);
      if (! isHotbar(var4)) {
         if (var4 != -1) {
            this.method4034(var4);
         } else {
            this.currentItem = this.method4038();
            if (!this.field5439.get(this.currentItem).isEmpty()) {
               int var5 = this.method4032();
               if (var5 != -1) {
                  this.field5439.set(var5, this.field5439.get(this.currentItem));
               }
            }

            this.field5439.set(this.currentItem, var1);
         }
      } else {
         this.currentItem = var4;
      }
   }

   public void method4034(int var1) {
      this.currentItem = this.method4038();
      ItemStack var4 = this.field5439.get(this.currentItem);
      this.field5439.set(this.currentItem, this.field5439.get(var1));
      this.field5439.set(var1, var4);
   }

   public static boolean isHotbar(int var0) {
      return var0 >= 0 && var0 < 9;
   }

   public int getSlotFor(ItemStack var1) {
      for (int var4 = 0; var4 < this.field5439.size(); var4++) {
         if (!this.field5439.get(var4).isEmpty() && this.method4031(var1, this.field5439.get(var4))) {
            return var4;
         }
      }

      return -1;
   }

   public int method4037(ItemStack var1) {
      for (int var4 = 0; var4 < this.field5439.size(); var4++) {
         ItemStack var5 = this.field5439.get(var4);
         if (!this.field5439.get(var4).isEmpty()
            && this.method4031(var1, this.field5439.get(var4))
            && !this.field5439.get(var4).method32116()
            && !var5.method32163()
            && !var5.method32152()) {
            return var4;
         }
      }

      return -1;
   }

   public int method4038() {
      for (int var3 = 0; var3 < 9; var3++) {
         int var4 = (this.currentItem + var3) % 9;
         if (this.field5439.get(var4).isEmpty()) {
            return var4;
         }
      }

      for (int var5 = 0; var5 < 9; var5++) {
         int var6 = (this.currentItem + var5) % 9;
         if (!this.field5439.get(var6).method32163()) {
            return var6;
         }
      }

      return this.currentItem;
   }

   public void method4039(double var1) {
      if (var1 > 0.0) {
         var1 = 1.0;
      }

      if (var1 < 0.0) {
         var1 = -1.0;
      }

      this.currentItem = (int)((double)this.currentItem - var1);

      while (this.currentItem < 0) {
         this.currentItem += 9;
      }

      while (this.currentItem >= 9) {
         this.currentItem -= 9;
      }
   }

   public int method4040(Predicate<ItemStack> var1, int var2, IInventory var3) {
      int var6 = 0;
      boolean var7 = var2 == 0;
      var6 += ItemStackHelper.method26568(this, var1, var2 - var6, var7);
      var6 += ItemStackHelper.method26568(var3, var1, var2 - var6, var7);
      var6 += ItemStackHelper.method26569(this.field5445, var1, var2 - var6, var7);
      if (this.field5445.isEmpty()) {
         this.field5445 = ItemStack.EMPTY;
      }

      return var6;
   }

   private int method4041(ItemStack var1) {
      int var4 = this.method4043(var1);
      if (var4 == -1) {
         var4 = this.method4032();
      }

      return var4 != -1 ? this.method4042(var4, var1) : var1.getCount();
   }

   private int method4042(int var1, ItemStack var2) {
      Item var5 = var2.getItem();
      int var6 = var2.getCount();
      ItemStack var7 = this.getStackInSlot(var1);
      if (var7.isEmpty()) {
         var7 = new ItemStack(var5, 0);
         if (var2.method32141()) {
            var7.setTag(var2.getTag().copy());
         }

         this.setInventorySlotContents(var1, var7);
      }

      int var8 = var6;
      if (var6 > var7.getMaxStackSize() - var7.getCount()) {
         var8 = var7.getMaxStackSize() - var7.getCount();
      }

      if (var8 > this.getInventoryStackLimit() - var7.getCount()) {
         var8 = this.getInventoryStackLimit() - var7.getCount();
      }

      if (var8 != 0) {
         var6 -= var8;
         var7.grow(var8);
         var7.method32178(5);
         return var6;
      } else {
         return var6;
      }
   }

   public int method4043(ItemStack var1) {
      if (this.method4030(this.getStackInSlot(this.currentItem), var1)) {
         return this.currentItem;
      } else if (this.method4030(this.getStackInSlot(40), var1)) {
         return 40;
      } else {
         for (int var4 = 0; var4 < this.field5439.size(); var4++) {
            if (this.method4030(this.field5439.get(var4), var1)) {
               return var4;
            }
         }

         return -1;
      }
   }

   public void method4044() {
      for (NonNullList var4 : this.field5442) {
         for (int var5 = 0; var5 < var4.size(); var5++) {
            if (!((ItemStack)var4.get(var5)).isEmpty()) {
               ((ItemStack)var4.get(var5)).method32135(this.field5444.world, this.field5444, var5, this.currentItem == var5);
            }
         }
      }
   }

   public boolean method4045(ItemStack var1) {
      return this.method4046(-1, var1);
   }

   public boolean method4046(int var1, ItemStack var2) {
      if (var2.isEmpty()) {
         return false;
      } else {
         try {
            if (var2.method32116()) {
               if (var1 == -1) {
                  var1 = this.method4032();
               }

               if (var1 >= 0) {
                  this.field5439.set(var1, var2.copy());
                  this.field5439.get(var1).method32178(5);
                  var2.setCount(0);
                  return true;
               } else if (this.field5444.abilities.isCreativeMode) {
                  var2.setCount(0);
                  return true;
               } else {
                  return false;
               }
            } else {
               int var5;
               do {
                  var5 = var2.getCount();
                  if (var1 == -1) {
                     var2.setCount(this.method4041(var2));
                  } else {
                     var2.setCount(this.method4042(var1, var2));
                  }
               } while (!var2.isEmpty() && var2.getCount() < var5);

               if (var2.getCount() == var5 && this.field5444.abilities.isCreativeMode) {
                  var2.setCount(0);
                  return true;
               } else {
                  return var2.getCount() < var5;
               }
            }
         } catch (Throwable var8) {
            CrashReport var6 = CrashReport.makeCrashReport(var8, "Adding item to inventory");
            CrashReportCategory var7 = var6.makeCategory("Item being added");
            var7.addDetail("Item ID", Item.getIdFromItem(var2.getItem()));
            var7.addDetail("Item data", var2.method32117());
            var7.addDetail("Item name", () -> var2.method32149().getString());
            throw new ReportedException(var6);
         }
      }
   }

   public void method4047(World var1, ItemStack var2) {
      if (!var1.isRemote) {
         while (!var2.isEmpty()) {
            int var5 = this.method4043(var2);
            if (var5 == -1) {
               var5 = this.method4032();
            }

            if (var5 == -1) {
               this.field5444.dropItem(var2, false);
               break;
            }

            int var6 = var2.getMaxStackSize() - this.getStackInSlot(var5).getCount();
            if (this.method4046(var5, var2.split(var6))) {
               ((ServerPlayerEntity)this.field5444).connection.sendPacket(new SSetSlotPacket(-2, var5, this.getStackInSlot(var5)));
            }
         }
      }
   }

   @Override
   public ItemStack decrStackSize(int var1, int var2) {
      NonNullList var5 = null;

      for (NonNullList var7 : this.field5442) {
         if (var1 < var7.size()) {
            var5 = var7;
            break;
         }

         var1 -= var7.size();
      }

      return var5 != null && !((ItemStack)var5.get(var1)).isEmpty() ? ItemStackHelper.method26563(var5, var1, var2) : ItemStack.EMPTY;
   }

   public void method4048(ItemStack var1) {
      for (NonNullList var5 : this.field5442) {
         for (int var6 = 0; var6 < var5.size(); var6++) {
            if (var5.get(var6) == var1) {
               var5.set(var6, ItemStack.EMPTY);
               break;
            }
         }
      }
   }

   @Override
   public ItemStack removeStackFromSlot(int var1) {
      NonNullList var4 = null;

      for (NonNullList var6 : this.field5442) {
         if (var1 < var6.size()) {
            var4 = var6;
            break;
         }

         var1 -= var6.size();
      }

      if (var4 != null && !((ItemStack)var4.get(var1)).isEmpty()) {
         ItemStack var7 = (ItemStack)var4.get(var1);
         var4.set(var1, ItemStack.EMPTY);
         return var7;
      } else {
         return ItemStack.EMPTY;
      }
   }

   @Override
   public void setInventorySlotContents(int var1, ItemStack var2) {
      NonNullList var5 = null;

      for (NonNullList var7 : this.field5442) {
         if (var1 < var7.size()) {
            var5 = var7;
            break;
         }

         var1 -= var7.size();
      }

      if (var5 != null) {
         var5.set(var1, var2);
      }
   }

   public float method4049(BlockState var1) {
      return this.field5439.get(this.currentItem).method32109(var1);
   }

   public ListNBT method4050(ListNBT var1) {
      for (int var4 = 0; var4 < this.field5439.size(); var4++) {
         if (!this.field5439.get(var4).isEmpty()) {
            CompoundNBT var5 = new CompoundNBT();
            var5.putByte("Slot", (byte)var4);
            this.field5439.get(var4).method32112(var5);
            var1.add(var5);
         }
      }

      for (int var6 = 0; var6 < this.field5440.size(); var6++) {
         if (!this.field5440.get(var6).isEmpty()) {
            CompoundNBT var8 = new CompoundNBT();
            var8.putByte("Slot", (byte)(var6 + 100));
            this.field5440.get(var6).method32112(var8);
            var1.add(var8);
         }
      }

      for (int var7 = 0; var7 < this.field5441.size(); var7++) {
         if (!this.field5441.get(var7).isEmpty()) {
            CompoundNBT var9 = new CompoundNBT();
            var9.putByte("Slot", (byte)(var7 + 150));
            this.field5441.get(var7).method32112(var9);
            var1.add(var9);
         }
      }

      return var1;
   }

   public void method4051(ListNBT var1) {
      this.field5439.clear();
      this.field5440.clear();
      this.field5441.clear();

      for (int var4 = 0; var4 < var1.size(); var4++) {
         CompoundNBT var5 = var1.getCompound(var4);
         int var6 = var5.getByte("Slot") & 255;
         ItemStack var7 = ItemStack.read(var5);
         if (!var7.isEmpty()) {
            if (var6 >= 0 && var6 < this.field5439.size()) {
               this.field5439.set(var6, var7);
            } else if (var6 >= 100 && var6 < this.field5440.size() + 100) {
               this.field5440.set(var6 - 100, var7);
            } else if (var6 >= 150 && var6 < this.field5441.size() + 150) {
               this.field5441.set(var6 - 150, var7);
            }
         }
      }
   }

   @Override
   public int getSizeInventory() {
      return this.field5439.size() + this.field5440.size() + this.field5441.size();
   }

   @Override
   public boolean isEmpty() {
      for (ItemStack var4 : this.field5439) {
         if (!var4.isEmpty()) {
            return false;
         }
      }

      for (ItemStack var7 : this.field5440) {
         if (!var7.isEmpty()) {
            return false;
         }
      }

      for (ItemStack var8 : this.field5441) {
         if (!var8.isEmpty()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ItemStack getStackInSlot(int var1) {
      NonNullList var4 = null;

      for (NonNullList var6 : this.field5442) {
         if (var1 < var6.size()) {
            var4 = var6;
            break;
         }

         var1 -= var6.size();
      }

      return var4 != null ? (ItemStack)var4.get(var1) : ItemStack.EMPTY;
   }

   @Override
   public ITextComponent getName() {
      return new TranslationTextComponent("container.inventory");
   }

   public ItemStack method4052(int var1) {
      return this.field5440.get(var1);
   }

   public void method4053(DamageSource var1, float var2) {
      if (!(var2 <= 0.0F)) {
         var2 /= 4.0F;
         if (var2 < 1.0F) {
            var2 = 1.0F;
         }

         for (int var5 = 0; var5 < this.field5440.size(); var5++) {
            ItemStack var6 = this.field5440.get(var5);
            if ((!var1.method31141() || !var6.getItem().method11748()) && var6.getItem() instanceof ArmorItem) {
               int var7 = var5;
               var6.damageItem((int)var2, this.field5444, var1x -> var1x.sendBreakAnimation(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, var7)));
            }
         }
      }
   }

   public void method4054() {
      for (List var4 : this.field5442) {
         for (int var5 = 0; var5 < var4.size(); var5++) {
            ItemStack var6 = (ItemStack)var4.get(var5);
            if (!var6.isEmpty()) {
               this.field5444.method2836(var6, true, false);
               var4.set(var5, ItemStack.EMPTY);
            }
         }
      }
   }

   @Override
   public void markDirty() {
      this.field5446++;
   }

   public int method4055() {
      return this.field5446;
   }

   public void setItemStack(ItemStack var1) {
      this.field5445 = var1;
   }

   public ItemStack getItemStack() {
      return this.field5445;
   }

   @Override
   public boolean isUsableByPlayer(PlayerEntity var1) {
      return !this.field5444.removed ? !(var1.getDistanceSq(this.field5444) > 64.0) : false;
   }

   public boolean method4058(ItemStack var1) {
      for (NonNullList<ItemStack> var5 : this.field5442) {
         for (ItemStack var7 : var5) {
            if (!var7.isEmpty() && var7.method32132(var1)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean method4059(ITag<Item> var1) {
      for (NonNullList<ItemStack> var5 : this.field5442) {
         for (ItemStack var7 : var5) {
            if (!var7.isEmpty() && var1.method24917(var7.getItem())) {
               return true;
            }
         }
      }

      return false;
   }

   public void method4060(PlayerInventory var1) {
      for (int var4 = 0; var4 < this.getSizeInventory(); var4++) {
         this.setInventorySlotContents(var4, var1.getStackInSlot(var4));
      }

      this.currentItem = var1.currentItem;
   }

   @Override
   public void method3625() {
      for (List var4 : this.field5442) {
         var4.clear();
      }
   }

   public void method4061(Class6207 var1) {
      for (ItemStack var5 : this.field5439) {
         var1.method19116(var5);
      }
   }
}

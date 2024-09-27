package mapped;

import com.mojang.datafixers.util.Pair;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class Slot {
   private static String[] field25576;
   private final int field25577;
   public final IInventory field25578;
   public int slotNumber;
   public final int field25580;
   public final int field25581;

   public Slot(IInventory var1, int var2, int var3, int var4) {
      this.field25578 = var1;
      this.field25577 = var2;
      this.field25580 = var3;
      this.field25581 = var4;
   }

   public void onSlotChange(ItemStack var1, ItemStack var2) {
      int var5 = var2.getCount() - var1.getCount();
      if (var5 > 0) {
         this.onCrafting(var2, var5);
      }
   }

   public void onCrafting(ItemStack var1, int var2) {
   }

   public void onSwapCraft(int var1) {
   }

   public void onCrafting(ItemStack var1) {
   }

   public ItemStack onTake(PlayerEntity var1, ItemStack var2) {
      this.onSlotChanged();
      return var2;
   }

   public boolean isItemValid(ItemStack var1) {
      return true;
   }

   public ItemStack getStack() {
      return this.field25578.getStackInSlot(this.field25577);
   }

   public boolean getHasStack() {
      return !this.getStack().isEmpty();
   }

   public void putStack(ItemStack var1) {
      this.field25578.setInventorySlotContents(this.field25577, var1);
      this.onSlotChanged();
   }

   public void onSlotChanged() {
      this.field25578.markDirty();
   }

   public int getSlotStackLimit() {
      return this.field25578.getInventoryStackLimit();
   }

   public int getItemStackLimit(ItemStack var1) {
      return this.getSlotStackLimit();
   }

   @Nullable
   public Pair<ResourceLocation, ResourceLocation> method18271() {
      return null;
   }

   public ItemStack decrStackSize(int var1) {
      return this.field25578.decrStackSize(this.field25577, var1);
   }

   public boolean canTakeStack(PlayerEntity var1) {
      return true;
   }

   public boolean isEnabled() {
      return true;
   }
}

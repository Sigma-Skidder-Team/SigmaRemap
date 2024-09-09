package mapped;

import com.mojang.datafixers.util.Pair;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class Class5848 extends Slot {
   private static String[] field25576;
   private final Slot field25596;

   public Class5848(Slot var1, int var2, int var3, int var4) {
      super(var1.field25578, var2, var3, var4);
      this.field25596 = var1;
   }

   @Override
   public ItemStack onTake(PlayerEntity var1, ItemStack var2) {
      return this.field25596.onTake(var1, var2);
   }

   @Override
   public boolean isItemValid(ItemStack var1) {
      return this.field25596.isItemValid(var1);
   }

   @Override
   public ItemStack getStack() {
      return this.field25596.getStack();
   }

   @Override
   public boolean getHasStack() {
      return this.field25596.getHasStack();
   }

   @Override
   public void putStack(ItemStack var1) {
      this.field25596.putStack(var1);
   }

   @Override
   public void onSlotChanged() {
      this.field25596.onSlotChanged();
   }

   @Override
   public int getSlotStackLimit() {
      return this.field25596.getSlotStackLimit();
   }

   @Override
   public int getItemStackLimit(ItemStack var1) {
      return this.field25596.getItemStackLimit(var1);
   }

   @Nullable
   @Override
   public Pair<ResourceLocation, ResourceLocation> method18271() {
      return this.field25596.method18271();
   }

   @Override
   public ItemStack decrStackSize(int var1) {
      return this.field25596.decrStackSize(var1);
   }

   @Override
   public boolean isEnabled() {
      return this.field25596.isEnabled();
   }

   @Override
   public boolean canTakeStack(PlayerEntity var1) {
      return this.field25596.canTakeStack(var1);
   }

   // $VF: synthetic method
   public static Slot method18276(Class5848 var0) {
      return var0.field25596;
   }
}

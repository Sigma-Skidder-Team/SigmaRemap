package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;

public class Class980 extends Class927 {
   private Class943 field5457;

   public Class980() {
      super(27);
   }

   public void method4064(Class943 var1) {
      this.field5457 = var1;
   }

   @Override
   public void method3682(ListNBT var1) {
      for (int var4 = 0; var4 < this.getSizeInventory(); var4++) {
         this.setInventorySlotContents(var4, ItemStack.EMPTY);
      }

      for (int var7 = 0; var7 < var1.size(); var7++) {
         CompoundNBT var5 = var1.getCompound(var7);
         int var6 = var5.getByte("Slot") & 255;
         if (var6 >= 0 && var6 < this.getSizeInventory()) {
            this.setInventorySlotContents(var6, ItemStack.method32104(var5));
         }
      }
   }

   @Override
   public ListNBT method3683() {
      ListNBT var3 = new ListNBT();

      for (int var4 = 0; var4 < this.getSizeInventory(); var4++) {
         ItemStack var5 = this.getStackInSlot(var4);
         if (!var5.isEmpty()) {
            CompoundNBT var6 = new CompoundNBT();
            var6.putByte("Slot", (byte)var4);
            var5.method32112(var6);
            var3.add(var6);
         }
      }

      return var3;
   }

   @Override
   public boolean isUsableByPlayer(PlayerEntity var1) {
      return this.field5457 != null && !this.field5457.method3768(var1) ? false : super.isUsableByPlayer(var1);
   }

   @Override
   public void openInventory(PlayerEntity var1) {
      if (this.field5457 != null) {
         this.field5457.method3766();
      }

      super.openInventory(var1);
   }

   @Override
   public void closeInventory(PlayerEntity var1) {
      if (this.field5457 != null) {
         this.field5457.method3767();
      }

      super.closeInventory(var1);
      this.field5457 = null;
   }
}

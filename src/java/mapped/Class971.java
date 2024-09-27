package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.Random;

public class Class971 extends Class939 {
   private static final Random field5435 = new Random();
   private NonNullList<ItemStack> field5436 = NonNullList.<ItemStack>method68(9, ItemStack.EMPTY);

   public Class971(TileEntityType<?> var1) {
      super(var1);
   }

   public Class971() {
      this(TileEntityType.field21426);
   }

   @Override
   public int getSizeInventory() {
      return 9;
   }

   public int method4022() {
      this.method3743((PlayerEntity)null);
      int var3 = -1;
      int var4 = 1;

      for (int var5 = 0; var5 < this.field5436.size(); var5++) {
         if (!this.field5436.get(var5).isEmpty() && field5435.nextInt(var4++) == 0) {
            var3 = var5;
         }
      }

      return var3;
   }

   public int method4023(ItemStack var1) {
      for (int var4 = 0; var4 < this.field5436.size(); var4++) {
         if (this.field5436.get(var4).isEmpty()) {
            this.setInventorySlotContents(var4, var1);
            return var4;
         }
      }

      return -1;
   }

   @Override
   public ITextComponent method3686() {
      return new TranslationTextComponent("container.dispenser");
   }

   @Override
   public void method3645(BlockState var1, CompoundNBT var2) {
      super.method3645(var1, var2);
      this.field5436 = NonNullList.<ItemStack>method68(this.getSizeInventory(), ItemStack.EMPTY);
      if (!this.method3741(var2)) {
         Class7920.method26567(var2, this.field5436);
      }
   }

   @Override
   public CompoundNBT write(CompoundNBT var1) {
      super.write(var1);
      if (!this.method3742(var1)) {
         Class7920.method26565(var1, this.field5436);
      }

      return var1;
   }

   @Override
   public NonNullList<ItemStack> method3724() {
      return this.field5436;
   }

   @Override
   public void method3725(NonNullList<ItemStack> var1) {
      this.field5436 = var1;
   }

   @Override
   public Container method3690(int var1, PlayerInventory var2) {
      return new Class5817(var1, var2, this);
   }

   @Override
   public ITextComponent method2954() {
      return new TranslationTextComponent("container.dispenser");
   }
}

package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.ChestContainer;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.vector.Vector3i;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class973 extends Class939 {
   private NonNullList<ItemStack> field5437 = NonNullList.<ItemStack>method68(27, ItemStack.EMPTY);
   private int field5438;

   private Class973(TileEntityType<?> var1) {
      super(var1);
   }

   public Class973() {
      this(TileEntityType.field21446);
   }

   @Override
   public CompoundNBT write(CompoundNBT var1) {
      super.write(var1);
      if (!this.method3742(var1)) {
         Class7920.method26565(var1, this.field5437);
      }

      return var1;
   }

   @Override
   public void method3645(BlockState var1, CompoundNBT var2) {
      super.method3645(var1, var2);
      this.field5437 = NonNullList.<ItemStack>method68(this.getSizeInventory(), ItemStack.EMPTY);
      if (!this.method3741(var2)) {
         Class7920.method26567(var2, this.field5437);
      }
   }

   @Override
   public int getSizeInventory() {
      return 27;
   }

   @Override
   public NonNullList<ItemStack> method3724() {
      return this.field5437;
   }

   @Override
   public void method3725(NonNullList<ItemStack> var1) {
      this.field5437 = var1;
   }

   @Override
   public ITextComponent method3686() {
      return new TranslationTextComponent("container.barrel");
   }

   @Override
   public Container method3690(int var1, PlayerInventory var2) {
      return ChestContainer.method18162(var1, var2, this);
   }

   @Override
   public void openInventory(PlayerEntity var1) {
      if (!var1.isSpectator()) {
         if (this.field5438 < 0) {
            this.field5438 = 0;
         }

         this.field5438++;
         BlockState var4 = this.method3775();
         boolean var5 = var4.<Boolean>get(Class3242.field18694);
         if (!var5) {
            this.method4027(var4, SoundEvents.field26374);
            this.method4026(var4, true);
         }

         this.method4024();
      }
   }

   private void method4024() {
      this.field5324.method6860().method20726(this.getPos(), this.method3775().getBlock(), 5);
   }

   public void method4025() {
      int var3 = this.field5325.getX();
      int var4 = this.field5325.getY();
      int var5 = this.field5325.getZ();
      this.field5438 = Class941.method3759(this.field5324, this, var3, var4, var5);
      if (this.field5438 <= 0) {
         BlockState var6 = this.method3775();
         if (!var6.isIn(Blocks.BARREL)) {
            this.method3765();
            return;
         }

         boolean var7 = var6.<Boolean>get(Class3242.field18694);
         if (var7) {
            this.method4027(var6, SoundEvents.field26373);
            this.method4026(var6, false);
         }
      } else {
         this.method4024();
      }
   }

   @Override
   public void closeInventory(PlayerEntity var1) {
      if (!var1.isSpectator()) {
         this.field5438--;
      }
   }

   private void method4026(BlockState var1, boolean var2) {
      this.field5324.setBlockState(this.getPos(), var1.with(Class3242.field18694, Boolean.valueOf(var2)), 3);
   }

   private void method4027(BlockState var1, SoundEvent var2) {
      Vector3i var5 = var1.<Direction>get(Class3242.field18693).getDirectionVec();
      double var6 = (double)this.field5325.getX() + 0.5 + (double)var5.getX() / 2.0;
      double var8 = (double)this.field5325.getY() + 0.5 + (double)var5.getY() / 2.0;
      double var10 = (double)this.field5325.getZ() + 0.5 + (double)var5.getZ() / 2.0;
      this.field5324.method6743((PlayerEntity)null, var6, var8, var10, var2, Class2266.field14732, 0.5F, this.field5324.rand.nextFloat() * 0.1F + 0.9F);
   }

   @Override
   public ITextComponent method2954() {
      return new TranslationTextComponent("container.barrel");
   }
}

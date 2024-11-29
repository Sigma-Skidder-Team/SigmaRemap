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
      if (!this.checkLootAndWrite(var1)) {
         ItemStackHelper.saveAllItems(var1, this.field5437);
      }

      return var1;
   }

   @Override
   public void read(BlockState var1, CompoundNBT var2) {
      super.read(var1, var2);
      this.field5437 = NonNullList.<ItemStack>method68(this.getSizeInventory(), ItemStack.EMPTY);
      if (!this.checkLootAndRead(var2)) {
         ItemStackHelper.loadAllItems(var2, this.field5437);
      }
   }

   @Override
   public int getSizeInventory() {
      return 27;
   }

   @Override
   public NonNullList<ItemStack> getItems() {
      return this.field5437;
   }

   @Override
   public void setItems(NonNullList<ItemStack> var1) {
      this.field5437 = var1;
   }

   @Override
   public ITextComponent getDefaultName() {
      return new TranslationTextComponent("container.barrel");
   }

   @Override
   public Container createMenu(int var1, PlayerInventory var2) {
      return ChestContainer.method18162(var1, var2, this);
   }

   @Override
   public void openInventory(PlayerEntity var1) {
      if (!var1.isSpectator()) {
         if (this.field5438 < 0) {
            this.field5438 = 0;
         }

         this.field5438++;
         BlockState var4 = this.getBlockState();
         boolean var5 = var4.<Boolean>get(Class3242.field18694);
         if (!var5) {
            this.method4027(var4, SoundEvents.field26374);
            this.method4026(var4, true);
         }

         this.method4024();
      }
   }

   private void method4024() {
      this.world.method6860().scheduleTick(this.getPos(), this.getBlockState().getBlock(), 5);
   }

   public void method4025() {
      int var3 = this.pos.getX();
      int var4 = this.pos.getY();
      int var5 = this.pos.getZ();
      this.field5438 = ChestTileEntity.calculatePlayersUsing(this.world, this, var3, var4, var5);
      if (this.field5438 <= 0) {
         BlockState var6 = this.getBlockState();
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
      this.world.setBlockState(this.getPos(), var1.with(Class3242.field18694, Boolean.valueOf(var2)), 3);
   }

   private void method4027(BlockState var1, SoundEvent var2) {
      Vector3i var5 = var1.<Direction>get(Class3242.field18693).getDirectionVec();
      double var6 = (double)this.pos.getX() + 0.5 + (double)var5.getX() / 2.0;
      double var8 = (double)this.pos.getY() + 0.5 + (double)var5.getY() / 2.0;
      double var10 = (double)this.pos.getZ() + 0.5 + (double)var5.getZ() / 2.0;
      this.world.playSound((PlayerEntity)null, var6, var8, var10, var2, Class2266.field14732, 0.5F, this.world.rand.nextFloat() * 0.1F + 0.9F);
   }

   @Override
   public ITextComponent getDefaultName2() {
      return new TranslationTextComponent("container.barrel");
   }
}

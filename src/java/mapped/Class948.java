package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class948 extends TileEntity implements Class946, Class949 {
   private final Class920 field5333 = new Class989(this);
   private final Class8202 field5334 = new Class8205(this);
   private ItemStack field5335 = ItemStack.EMPTY;
   private int field5336;
   private int field5337;

   public Class948() {
      super(Class4387.field21449);
   }

   public ItemStack method3805() {
      return this.field5335;
   }

   public boolean method3806() {
      Item var3 = this.field5335.getItem();
      return var3 == Items.field38047 || var3 == Items.field38048;
   }

   public void method3807(ItemStack var1) {
      this.method3809(var1, (PlayerEntity)null);
   }

   private void method3808() {
      this.field5336 = 0;
      this.field5337 = 0;
      Class3354.method11921(this.method3734(), this.getPos(), this.method3775(), false);
   }

   public void method3809(ItemStack var1, PlayerEntity var2) {
      this.field5335 = this.method3813(var1, var2);
      this.field5336 = 0;
      this.field5337 = Class3285.method11819(this.field5335);
      this.method3622();
   }

   private void method3810(int var1) {
      int var4 = MathHelper.method37775(var1, 0, this.field5337 - 1);
      if (var4 != this.field5336) {
         this.field5336 = var4;
         this.method3622();
         Class3354.method11922(this.method3734(), this.getPos(), this.method3775());
      }
   }

   public int method3811() {
      return this.field5336;
   }

   public int method3812() {
      float var3 = this.field5337 <= 1 ? 1.0F : (float)this.method3811() / ((float)this.field5337 - 1.0F);
      return MathHelper.method37767(var3 * 14.0F) + (!this.method3806() ? 0 : 1);
   }

   private ItemStack method3813(ItemStack var1, PlayerEntity var2) {
      if (this.field5324 instanceof ServerWorld && var1.getItem() == Items.field38048) {
         Class3285.method11820(var1, this.method3814(var2), var2);
      }

      return var1;
   }

   private Class6619 method3814(PlayerEntity var1) {
      String var4;
      Object var5;
      if (var1 != null) {
         var4 = var1.getName().getString();
         var5 = var1.getDisplayName();
      } else {
         var4 = "Lectern";
         var5 = new StringTextComponent("Lectern");
      }

      Vector3d var6 = Vector3d.method11328(this.field5325);
      return new Class6619(
         ICommandSource.field5189, var6, Class8513.field37212, (ServerWorld)this.field5324, 2, var4, (ITextComponent)var5, this.field5324.getServer(), var1
      );
   }

   @Override
   public boolean method3783() {
      return true;
   }

   @Override
   public void method3645(BlockState var1, CompoundNBT var2) {
      super.method3645(var1, var2);
      if (!var2.method119("Book", 10)) {
         this.field5335 = ItemStack.EMPTY;
      } else {
         this.field5335 = this.method3813(ItemStack.method32104(var2.getCompound("Book")), (PlayerEntity)null);
      }

      this.field5337 = Class3285.method11819(this.field5335);
      this.field5336 = MathHelper.method37775(var2.method122("Page"), 0, this.field5337 - 1);
   }

   @Override
   public CompoundNBT write(CompoundNBT var1) {
      super.write(var1);
      if (!this.method3805().isEmpty()) {
         var1.put("Book", this.method3805().method32112(new CompoundNBT()));
         var1.method102("Page", this.field5336);
      }

      return var1;
   }

   @Override
   public void method3625() {
      this.method3807(ItemStack.EMPTY);
   }

   @Override
   public Class5812 method3627(int var1, PlayerInventory var2, PlayerEntity var3) {
      return new Class5818(var1, this.field5333, this.field5334);
   }

   @Override
   public ITextComponent method2954() {
      return new TranslationTextComponent("container.lectern");
   }

   // $VF: synthetic method
   public static ItemStack method3815(Class948 var0) {
      return var0.field5335;
   }

   // $VF: synthetic method
   public static void method3816(Class948 var0) {
      var0.method3808();
   }

   // $VF: synthetic method
   public static ItemStack method3817(Class948 var0, ItemStack var1) {
      return var0.field5335 = var1;
   }

   // $VF: synthetic method
   public static int method3818(Class948 var0) {
      return var0.field5336;
   }

   // $VF: synthetic method
   public static void method3819(Class948 var0, int var1) {
      var0.method3810(var1);
   }
}

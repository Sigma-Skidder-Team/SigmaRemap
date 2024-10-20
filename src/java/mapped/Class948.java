package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.command.CommandSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.server.ServerWorld;

public class Class948 extends TileEntity implements IClearable, Class949 {
   private final IInventory field5333 = new Class989(this);
   private final Class8202 field5334 = new Class8205(this);
   private ItemStack field5335 = ItemStack.EMPTY;
   private int field5336;
   private int field5337;

   public Class948() {
      super(TileEntityType.field21449);
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
      Class3354.method11921(this.method3734(), this.getPos(), this.getBlockState(), false);
   }

   public void method3809(ItemStack var1, PlayerEntity var2) {
      this.field5335 = this.method3813(var1, var2);
      this.field5336 = 0;
      this.field5337 = Class3285.method11819(this.field5335);
      this.markDirty();
   }

   private void method3810(int var1) {
      int var4 = MathHelper.clamp(var1, 0, this.field5337 - 1);
      if (var4 != this.field5336) {
         this.field5336 = var4;
         this.markDirty();
         Class3354.method11922(this.method3734(), this.getPos(), this.getBlockState());
      }
   }

   public int method3811() {
      return this.field5336;
   }

   public int method3812() {
      float var3 = this.field5337 <= 1 ? 1.0F : (float)this.method3811() / ((float)this.field5337 - 1.0F);
      return MathHelper.floor(var3 * 14.0F) + (!this.method3806() ? 0 : 1);
   }

   private ItemStack method3813(ItemStack var1, PlayerEntity var2) {
      if (this.world instanceof ServerWorld && var1.getItem() == Items.field38048) {
         Class3285.method11820(var1, this.method3814(var2), var2);
      }

      return var1;
   }

   private CommandSource method3814(PlayerEntity var1) {
      String var4;
      Object var5;
      if (var1 != null) {
         var4 = var1.getName().getString();
         var5 = var1.getDisplayName();
      } else {
         var4 = "Lectern";
         var5 = new StringTextComponent("Lectern");
      }

      Vector3d var6 = Vector3d.method11328(this.pos);
      return new CommandSource(
         ICommandSource.field5189, var6, Vector2f.ZERO, (ServerWorld)this.world, 2, var4, (ITextComponent)var5, this.world.getServer(), var1
      );
   }

   @Override
   public boolean method3783() {
      return true;
   }

   @Override
   public void read(BlockState var1, CompoundNBT var2) {
      super.read(var1, var2);
      if (!var2.contains("Book", 10)) {
         this.field5335 = ItemStack.EMPTY;
      } else {
         this.field5335 = this.method3813(ItemStack.read(var2.getCompound("Book")), (PlayerEntity)null);
      }

      this.field5337 = Class3285.method11819(this.field5335);
      this.field5336 = MathHelper.clamp(var2.getInt("Page"), 0, this.field5337 - 1);
   }

   @Override
   public CompoundNBT write(CompoundNBT var1) {
      super.write(var1);
      if (!this.method3805().isEmpty()) {
         var1.put("Book", this.method3805().method32112(new CompoundNBT()));
         var1.putInt("Page", this.field5336);
      }

      return var1;
   }

   @Override
   public void method3625() {
      this.method3807(ItemStack.EMPTY);
   }

   @Override
   public Container method3627(int var1, PlayerInventory var2, PlayerEntity var3) {
      return new Class5818(var1, this.field5333, this.field5334);
   }

   @Override
   public ITextComponent getDefaultName2() {
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

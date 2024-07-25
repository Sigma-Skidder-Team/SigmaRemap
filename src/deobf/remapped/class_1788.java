package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_1788 extends class_3757 implements class_5507, class_4259 {
   private final class_6867 field_9133 = new class_2951(this);
   private final class_6844 field_9132 = new class_7413(this);
   private ItemStack field_9134 = ItemStack.EMPTY;
   private int field_9135;
   private int field_9136;

   public class_1788() {
      super(class_133.field_360);
   }

   public ItemStack method_7958() {
      return this.field_9134;
   }

   public boolean method_7960() {
      class_2451 var3 = this.field_9134.method_27960();
      return var3 == class_4897.field_24805 || var3 == class_4897.field_24698;
   }

   public void method_7956(ItemStack var1) {
      this.method_7957(var1, (PlayerEntity)null);
   }

   private void method_7951() {
      this.field_9135 = 0;
      this.field_9136 = 0;
      class_2013.method_9339(this.method_17402(), this.method_17399(), this.method_17403(), false);
   }

   public void method_7957(ItemStack var1, PlayerEntity var2) {
      this.field_9134 = this.method_7953(var1, var2);
      this.field_9135 = 0;
      this.field_9136 = class_1138.method_4991(this.field_9134);
      this.method_17407();
   }

   private void method_7952(int var1) {
      int var4 = MathHelper.clamp(var1, 0, this.field_9136 - 1);
      if (var4 != this.field_9135) {
         this.field_9135 = var4;
         this.method_17407();
         class_2013.method_9335(this.method_17402(), this.method_17399(), this.method_17403());
      }
   }

   public int method_7955() {
      return this.field_9135;
   }

   public int method_7963() {
      float var3 = this.field_9136 <= 1 ? 1.0F : (float)this.method_7955() / ((float)this.field_9136 - 1.0F);
      return MathHelper.floor(var3 * 14.0F) + (!this.method_7960() ? 0 : 1);
   }

   private ItemStack method_7953(ItemStack var1, PlayerEntity var2) {
      if (this.field_18364 instanceof class_6331 && var1.method_27960() == class_4897.field_24698) {
         class_1138.method_4993(var1, this.method_7959(var2), var2);
      }

      return var1;
   }

   private class_9155 method_7959(PlayerEntity var1) {
      String var4;
      Object var5;
      if (var1 != null) {
         var4 = var1.method_45509().getString();
         var5 = var1.method_19839();
      } else {
         var4 = "Lectern";
         var5 = new StringTextComponent("Lectern");
      }

      class_1343 var6 = class_1343.method_6216(this.field_18358);
      return new class_9155(
         class_5801.field_29295,
         var6,
         class_4895.field_24322,
         (class_6331)this.field_18364,
         2,
         var4,
         (ITextComponent)var5,
         this.field_18364.method_29522(),
         var1
      );
   }

   @Override
   public boolean method_17397() {
      return true;
   }

   @Override
   public void method_17394(class_2522 var1, CompoundNBT var2) {
      super.method_17394(var1, var2);
      if (!var2.contains("Book", 10)) {
         this.field_9134 = ItemStack.EMPTY;
      } else {
         this.field_9134 = this.method_7953(ItemStack.method_28015(var2.getCompound("Book")), (PlayerEntity)null);
      }

      this.field_9136 = class_1138.method_4991(this.field_9134);
      this.field_9135 = MathHelper.clamp(var2.method_25947("Page"), 0, this.field_9136 - 1);
   }

   @Override
   public CompoundNBT method_17396(CompoundNBT var1) {
      super.method_17396(var1);
      if (!this.method_7958().method_28022()) {
         var1.put("Book", this.method_7958().method_27998(new CompoundNBT()));
         var1.putInt("Page", this.field_9135);
      }

      return var1;
   }

   @Override
   public void method_24975() {
      this.method_7956(ItemStack.EMPTY);
   }

   @Override
   public class_4088 method_11419(int var1, class_7051 var2, PlayerEntity var3) {
      return new class_6360(var1, this.field_9133, this.field_9132);
   }

   @Override
   public ITextComponent method_19839() {
      return new TranslationTextComponent("container.lectern");
   }
}

package remapped;

import java.util.Random;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_7434 extends class_2358 {
   private static final Random field_37916 = new Random();
   private class_2831<ItemStack> field_37914 = class_2831.<ItemStack>method_12872(9, ItemStack.EMPTY);

   public class_7434(class_133<?> var1) {
      super(var1);
   }

   public class_7434() {
      this(class_133.field_370);
   }

   @Override
   public int method_31505() {
      return 9;
   }

   public int method_33831() {
      this.method_10812((PlayerEntity)null);
      int var3 = -1;
      int var4 = 1;

      for (int var5 = 0; var5 < this.field_37914.size(); var5++) {
         if (!this.field_37914.get(var5).method_28022() && field_37916.nextInt(var4++) == 0) {
            var3 = var5;
         }
      }

      return var3;
   }

   public int method_33832(ItemStack var1) {
      for (int var4 = 0; var4 < this.field_37914.size(); var4++) {
         if (this.field_37914.get(var4).method_28022()) {
            this.method_31503(var4, var1);
            return var4;
         }
      }

      return -1;
   }

   @Override
   public ITextComponent method_38433() {
      return new TranslationTextComponent("container.dispenser");
   }

   @Override
   public void method_17394(class_2522 var1, CompoundNBT var2) {
      super.method_17394(var1, var2);
      this.field_37914 = class_2831.<ItemStack>method_12872(this.method_31505(), ItemStack.EMPTY);
      if (!this.method_10811(var2)) {
         class_3037.method_13882(var2, this.field_37914);
      }
   }

   @Override
   public CompoundNBT method_17396(CompoundNBT var1) {
      super.method_17396(var1);
      if (!this.method_10815(var1)) {
         class_3037.method_13878(var1, this.field_37914);
      }

      return var1;
   }

   @Override
   public class_2831<ItemStack> method_10814() {
      return this.field_37914;
   }

   @Override
   public void method_10813(class_2831<ItemStack> var1) {
      this.field_37914 = var1;
   }

   @Override
   public class_4088 method_38431(int var1, class_7051 var2) {
      return new class_7249(var1, var2, this);
   }
}

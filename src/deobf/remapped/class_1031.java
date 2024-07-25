package remapped;

public class class_1031 extends class_4657 {
   private class_9180 field_5711;

   public class_1031() {
      super(27);
   }

   public void method_4560(class_9180 var1) {
      this.field_5711 = var1;
   }

   @Override
   public void method_21549(class_3416 var1) {
      for (int var4 = 0; var4 < this.method_31505(); var4++) {
         this.method_31503(var4, ItemStack.EMPTY);
      }

      for (int var7 = 0; var7 < var1.size(); var7++) {
         CompoundNBT var5 = var1.method_15764(var7);
         int var6 = var5.method_25950("Slot") & 255;
         if (var6 >= 0 && var6 < this.method_31505()) {
            this.method_31503(var6, ItemStack.method_28015(var5));
         }
      }
   }

   @Override
   public class_3416 method_21552() {
      class_3416 var3 = new class_3416();

      for (int var4 = 0; var4 < this.method_31505(); var4++) {
         ItemStack var5 = this.method_31498(var4);
         if (!var5.method_28022()) {
            CompoundNBT var6 = new CompoundNBT();
            var6.method_25921("Slot", (byte)var4);
            var5.method_27998(var6);
            var3.add(var6);
         }
      }

      return var3;
   }

   @Override
   public boolean method_31502(class_704 var1) {
      return this.field_5711 != null && !this.field_5711.method_42317(var1) ? false : super.method_31502(var1);
   }

   @Override
   public void method_31501(class_704 var1) {
      if (this.field_5711 != null) {
         this.field_5711.method_42315();
      }

      super.method_31501(var1);
   }

   @Override
   public void method_31499(class_704 var1) {
      if (this.field_5711 != null) {
         this.field_5711.method_42316();
      }

      super.method_31499(var1);
      this.field_5711 = null;
   }
}

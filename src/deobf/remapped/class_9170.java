package remapped;

public class class_9170 extends class_5837 {
   private final Identifier field_46929;
   private final long field_46927;

   private class_9170(class_7279[] var1, Identifier var2, long var3) {
      super(var1);
      this.field_46929 = var2;
      this.field_46927 = var3;
   }

   @Override
   public class_1404 method_13321() {
      return class_5116.field_26399;
   }

   @Override
   public ItemStack method_26627(ItemStack var1, class_2792 var2) {
      if (!var1.method_28022()) {
         CompoundNBT var5 = new CompoundNBT();
         var5.method_25941("LootTable", this.field_46929.toString());
         if (this.field_46927 != 0L) {
            var5.method_25949("LootTableSeed", this.field_46927);
         }

         var1.method_27994().put("BlockEntityTag", var5);
         return var1;
      } else {
         return var1;
      }
   }

   @Override
   public void method_12680(class_4737 var1) {
      if (!var1.method_21890(this.field_46929)) {
         super.method_12680(var1);
         class_1758 var4 = var1.method_21886(this.field_46929);
         if (var4 != null) {
            var4.method_7867(var1.method_21894("->{" + this.field_46929 + "}", this.field_46929));
         } else {
            var1.method_21892("Unknown loot table called " + this.field_46929);
         }
      } else {
         var1.method_21892("Table " + this.field_46929 + " is recursively called");
      }
   }
}

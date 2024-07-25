package remapped;

public class class_6838 extends class_3757 implements class_5507 {
   private ItemStack field_35262 = ItemStack.EMPTY;

   public class_6838() {
      super(class_133.field_352);
   }

   @Override
   public void method_17394(class_2522 var1, CompoundNBT var2) {
      super.method_17394(var1, var2);
      if (var2.contains("RecordItem", 10)) {
         this.method_31352(ItemStack.method_28015(var2.getCompound("RecordItem")));
      }
   }

   @Override
   public CompoundNBT method_17396(CompoundNBT var1) {
      super.method_17396(var1);
      if (!this.method_31351().method_28022()) {
         var1.put("RecordItem", this.method_31351().method_27998(new CompoundNBT()));
      }

      return var1;
   }

   public ItemStack method_31351() {
      return this.field_35262;
   }

   public void method_31352(ItemStack var1) {
      this.field_35262 = var1;
      this.method_17407();
   }

   @Override
   public void method_24975() {
      this.method_31352(ItemStack.EMPTY);
   }
}

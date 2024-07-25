package remapped;

public class class_892 extends class_3757 {
   private int field_4589;

   public class_892() {
      super(class_133.field_367);
   }

   @Override
   public class_5734 method_17396(class_5734 var1) {
      super.method_17396(var1);
      var1.method_25931("OutputSignal", this.field_4589);
      return var1;
   }

   @Override
   public void method_17394(class_2522 var1, class_5734 var2) {
      super.method_17394(var1, var2);
      this.field_4589 = var2.method_25947("OutputSignal");
   }

   public int method_3847() {
      return this.field_4589;
   }

   public void method_3846(int var1) {
      this.field_4589 = var1;
   }
}

package remapped;

public class class_2248 extends class_3521 {
   private static String[] field_11184;

   public class_2248(class_1896 var1) {
      this.field_11183 = var1;
   }

   @Override
   public void method_16254(int var1) {
      this.field_11183.field_18364.method_29521(this.field_11183.field_18358, class_4783.field_23617, var1, 0);
   }

   @Override
   public World method_16252() {
      return this.field_11183.field_18364;
   }

   @Override
   public class_1331 method_16261() {
      return this.field_11183.field_18358;
   }

   @Override
   public void method_16266(class_4877 var1) {
      super.method_16266(var1);
      if (this.method_16252() != null) {
         class_2522 var4 = this.method_16252().method_28262(this.method_16261());
         this.method_16252().method_29572(this.field_11183.field_18358, var4, var4, 4);
      }
   }
}

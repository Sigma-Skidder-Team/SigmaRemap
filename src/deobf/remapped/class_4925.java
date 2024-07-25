package remapped;

public class class_4925 extends class_3149 {
   private static String[] field_25482;

   public class_4925(class_5542 var1, int var2, int var3) {
      super(var1, var3);
      this.field_25483 = var1;
   }

   @Override
   public void method_16796() {
      class_5542.method_25206(this.field_25483);
      super.method_16796();
   }

   @Override
   public boolean method_16795() {
      return super.method_16795() && this.method_22574();
   }

   @Override
   public boolean method_16799() {
      return super.method_16799() && this.method_22574();
   }

   private boolean method_22574() {
      return !this.field_25483.method_26507()
         && !this.field_25483.method_25205()
         && !class_5542.method_25214(this.field_25483)
         && this.field_25483.method_17809() == null;
   }
}

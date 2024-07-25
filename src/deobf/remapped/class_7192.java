package remapped;

public class class_7192 extends class_2829 {
   private static String[] field_36978;
   private int field_36979;

   public class_7192(class_5542 var1, double var2) {
      super(var1, var2);
      this.field_36980 = var1;
      this.field_36979 = 100;
   }

   @Override
   public boolean method_16795() {
      if (this.field_36980.method_26507() || this.field_13867.method_17809() != null) {
         return false;
      } else if (this.field_36980.field_41768.method_29570()) {
         return true;
      } else if (this.field_36979 > 0) {
         this.field_36979--;
         return false;
      } else {
         this.field_36979 = 100;
         class_1331 var3 = this.field_13867.method_37075();
         return this.field_36980.field_41768.method_29602()
            && this.field_36980.field_41768.method_25263(var3)
            && !((class_6331)this.field_36980.field_41768).method_28994(var3)
            && this.method_12869();
      }
   }

   @Override
   public void method_16796() {
      class_5542.method_25206(this.field_36980);
      super.method_16796();
   }
}

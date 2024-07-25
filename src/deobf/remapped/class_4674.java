package remapped;

public class class_4674 implements class_4388 {
   public class_4674(class_6586 var1, class_6586 var2, Runnable var3) {
      this.field_22790 = var1;
      this.field_22789 = var2;
      this.field_22791 = var3;
   }

   @Override
   public void method_20453(Object var1) {
      if (!(var1 instanceof byte[])) {
         if (!(var1 instanceof String)) {
            class_6586.method_30085().warning("Unexpected data: " + var1);
         } else {
            this.field_22789.method_30091((String)var1, this.field_22791);
         }
      } else {
         this.field_22789.method_30092((byte[])var1, this.field_22791);
      }
   }
}

package remapped;

import java.io.IOException;

public class class_6074 implements class_6310<class_1243> {
   private static String[] field_31088;
   private class_4639 field_31089;

   public class_6074() {
   }

   public class_6074(class_8932<?> var1) {
      this.field_31089 = var1.method_41050();
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_31089 = var1.method_37768();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37780(this.field_31089);
   }

   public void method_27818(class_1243 var1) {
      var1.method_5547(this);
   }

   public class_4639 method_27817() {
      return this.field_31089;
   }
}

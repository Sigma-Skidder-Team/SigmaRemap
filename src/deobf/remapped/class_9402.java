package remapped;

import java.io.IOException;

public class class_9402 implements class_6310<class_392> {
   private static String[] field_48070;
   private class_1331 field_48069;

   public class_9402() {
   }

   public class_9402(class_1331 var1) {
      this.field_48069 = var1;
   }

   public void method_43548(class_392 var1) {
      var1.method_1979(this);
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_48069 = var1.method_37748();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37770(this.field_48069);
   }

   public class_1331 method_43546() {
      return this.field_48069;
   }
}

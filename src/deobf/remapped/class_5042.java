package remapped;

import java.io.IOException;

public class class_5042 implements Packet<class_392> {
   private static String[] field_26068;
   private class_6437 field_26069;

   public class_5042() {
   }

   public class_5042(class_6437 var1) {
      this.field_26069 = var1;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_26069 = class_6437.method_29390(var1);
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      this.field_26069.method_29394(var1);
   }

   public void method_23217(class_392 var1) {
      var1.method_1973(this);
   }

   public class_6437 method_23216() {
      return this.field_26069;
   }
}

package remapped;

import java.io.IOException;

public class class_5982 implements class_6310<class_1243> {
   private static String[] field_30485;
   private class_6538 field_30486;

   public class_5982() {
   }

   public class_5982(class_6538 var1) {
      this.field_30486 = var1;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_30486 = var1.<class_6538>method_37787(class_6538.class);
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37750(this.field_30486);
   }

   public void method_27291(class_1243 var1) {
      var1.method_5569(this);
   }
}

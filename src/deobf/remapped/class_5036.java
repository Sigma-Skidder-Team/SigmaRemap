package remapped;

import java.io.IOException;

public class class_5036 implements class_6310<class_392> {
   private static String[] field_26059;
   private class_2584 field_26060;

   public class_5036() {
   }

   public class_5036(class_2584 var1) {
      this.field_26060 = var1;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_26060 = var1.<class_2584>method_37787(class_2584.class);
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37750(this.field_26060);
   }

   public void method_23208(class_392 var1) {
      var1.method_1930(this);
   }

   public class_2584 method_23207() {
      return this.field_26060;
   }
}

package remapped;

import java.io.IOException;

public class class_3195 implements Packet<class_1243> {
   private static String[] field_15963;
   private class_2584 field_15962;

   public class_3195() {
   }

   public class_3195(class_2584 var1) {
      this.field_15962 = var1;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_15962 = var1.<class_2584>method_37787(class_2584.class);
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37750(this.field_15962);
   }

   public void method_14707(class_1243 var1) {
      var1.method_5552(this);
   }

   public class_2584 method_14706() {
      return this.field_15962;
   }
}

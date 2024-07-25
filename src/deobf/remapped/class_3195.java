package remapped;

import java.io.IOException;

public class class_3195 implements Packet<class_1243> {
   private static String[] field_15963;
   private Hand field_15962;

   public class_3195() {
   }

   public class_3195(Hand var1) {
      this.field_15962 = var1;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_15962 = var1.<Hand>method_37787(Hand.class);
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37750(this.field_15962);
   }

   public void method_14707(class_1243 var1) {
      var1.method_5552(this);
   }

   public Hand method_14706() {
      return this.field_15962;
   }
}

package remapped;

import java.io.IOException;

public class class_1022 implements Packet<class_1243> {
   private static String[] field_5339;
   private Hand field_5340;

   public class_1022() {
   }

   public class_1022(Hand var1) {
      this.field_5340 = var1;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_5340 = var1.<Hand>method_37787(Hand.class);
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37750(this.field_5340);
   }

   public void method_4517(class_1243 var1) {
      var1.method_5559(this);
   }

   public Hand method_4516() {
      return this.field_5340;
   }
}

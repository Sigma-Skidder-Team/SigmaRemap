package remapped;

import java.io.IOException;

public class class_5036 implements Packet<class_392> {
   private static String[] field_26059;
   private Hand field_26060;

   public class_5036() {
   }

   public class_5036(Hand var1) {
      this.field_26060 = var1;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_26060 = var1.<Hand>method_37787(Hand.class);
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37750(this.field_26060);
   }

   public void method_23208(class_392 var1) {
      var1.method_1930(this);
   }

   public Hand method_23207() {
      return this.field_26060;
   }
}

package remapped;

import java.io.IOException;

public class class_8585 implements Packet<class_1243> {
   private static String[] field_43997;
   private class_9529 field_43996;
   private Hand field_43998;

   public class_8585() {
   }

   public class_8585(Hand var1, class_9529 var2) {
      this.field_43998 = var1;
      this.field_43996 = var2;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_43998 = var1.<Hand>method_37787(Hand.class);
      this.field_43996 = var1.method_37782();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37750(this.field_43998);
      var1.method_37747(this.field_43996);
   }

   public void method_39485(class_1243 var1) {
      var1.method_5557(this);
   }

   public Hand method_39483() {
      return this.field_43998;
   }

   public class_9529 method_39484() {
      return this.field_43996;
   }
}

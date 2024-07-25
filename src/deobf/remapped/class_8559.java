package remapped;

import java.io.IOException;

public class class_8559 implements Packet<class_1243> {
   private static String[] field_43785;
   private class_2105 field_43784;

   public class_8559() {
   }

   public class_8559(class_2105 var1) {
      this.field_43784 = var1;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_43784 = var1.<class_2105>method_37787(class_2105.class);
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37750(this.field_43784);
   }

   public void method_39392(class_1243 var1) {
      var1.method_5577(this);
   }

   public class_2105 method_39391() {
      return this.field_43784;
   }
}

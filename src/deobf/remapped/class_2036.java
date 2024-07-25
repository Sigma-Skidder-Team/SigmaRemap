package remapped;

import java.io.IOException;

public class class_2036 implements class_6310<class_392> {
   private static String[] field_10336;
   private class_2451 field_10337;
   private int field_10338;

   public class_2036() {
   }

   public class_2036(class_2451 var1, int var2) {
      this.field_10337 = var1;
      this.field_10338 = var2;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_10337 = class_2451.method_11220(var1.method_37778());
      this.field_10338 = var1.method_37778();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(class_2451.method_11244(this.field_10337));
      var1.method_37743(this.field_10338);
   }

   public void method_9554(class_392 var1) {
      var1.method_1925(this);
   }

   public class_2451 method_9552() {
      return this.field_10337;
   }

   public int method_9553() {
      return this.field_10338;
   }
}

package remapped;

import java.io.IOException;

public class class_4006 implements Packet<class_1243> {
   private static String[] field_19458;
   private int field_19459;

   public class_4006() {
   }

   public class_4006(int var1) {
      this.field_19459 = var1;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_19459 = var1.method_37778();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_19459);
   }

   public void method_18489(class_1243 var1) {
      var1.method_5573(this);
   }

   public int method_18488() {
      return this.field_19459;
   }
}

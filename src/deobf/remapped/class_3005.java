package remapped;

import java.io.IOException;

public class class_3005 implements Packet<class_1243> {
   private static String[] field_14758;
   private class_423 field_14757;

   public class_3005() {
   }

   public class_3005(class_423 var1) {
      this.field_14757 = var1;
   }

   public void method_13732(class_1243 var1) {
      var1.method_5545(this);
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_14757 = class_423.method_2100(var1.readUnsignedByte());
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeByte(this.field_14757.method_2097());
   }

   public class_423 method_13730() {
      return this.field_14757;
   }
}

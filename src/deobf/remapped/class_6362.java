package remapped;

import java.io.IOException;

public class class_6362 implements Packet<class_1243> {
   private static String[] field_32526;
   private int field_32527;
   private class_6098 field_32528 = class_6098.field_31203;

   public class_6362() {
   }

   public class_6362(int var1, class_6098 var2) {
      this.field_32527 = var1;
      this.field_32528 = var2.method_27973();
   }

   public void method_29140(class_1243 var1) {
      var1.method_5558(this);
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_32527 = var1.readShort();
      this.field_32528 = var1.method_37755();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeShort(this.field_32527);
      var1.method_37764(this.field_32528);
   }

   public int method_29139() {
      return this.field_32527;
   }

   public class_6098 method_29138() {
      return this.field_32528;
   }
}

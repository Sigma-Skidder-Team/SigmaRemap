package remapped;

import java.io.IOException;

public class class_7371 implements Packet<class_1243> {
   private static String[] field_37667;
   private int field_37666;

   public class_7371() {
   }

   public class_7371(int var1) {
      this.field_37666 = var1;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_37666 = var1.readShort();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeShort(this.field_37666);
   }

   public void method_33577(class_1243 var1) {
      var1.method_5560(this);
   }

   public int method_33575() {
      return this.field_37666;
   }
}

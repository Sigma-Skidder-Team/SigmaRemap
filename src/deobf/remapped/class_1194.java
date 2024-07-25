package remapped;

import java.io.IOException;

public class class_1194 implements class_6310<class_1243> {
   private static String[] field_6688;
   private int field_6689;

   public class_1194() {
   }

   public class_1194(int var1) {
      this.field_6689 = var1;
   }

   public void method_5287(class_1243 var1) {
      var1.method_5580(this);
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_6689 = var1.readByte();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeByte(this.field_6689);
   }
}

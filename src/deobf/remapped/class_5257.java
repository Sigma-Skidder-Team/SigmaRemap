package remapped;

import java.io.IOException;

public class class_5257 implements class_6310<class_392> {
   private static String[] field_26906;
   private int field_26905;

   public class_5257() {
   }

   public class_5257(int var1) {
      this.field_26905 = var1;
   }

   public void method_24023(class_392 var1) {
      var1.method_1952(this);
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_26905 = var1.readUnsignedByte();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeByte(this.field_26905);
   }
}

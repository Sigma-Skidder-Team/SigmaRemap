package remapped;

import java.io.IOException;

public class class_8763 extends class_2159 {
   private int field_44865;

   public class_8763() {
      super("EVCR Specific Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      this.method_10051(var1);
      this.field_44865 = var1.method_27531();
   }

   public int method_40249() {
      return this.field_44865;
   }
}

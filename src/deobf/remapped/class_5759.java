package remapped;

import java.io.IOException;

public class class_5759 extends class_2159 {
   private int field_29127;

   public class_5759() {
      super("SMV Specific Structure");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      this.method_10051(var1);
      this.field_29127 = var1.method_27531();
   }

   public int method_26047() {
      return this.field_29127;
   }
}

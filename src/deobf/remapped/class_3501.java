package remapped;

import java.io.IOException;

public class class_3501 extends class_2159 {
   private int field_17167;

   public class_3501() {
      super("QCELP Specific Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      this.method_10051(var1);
      this.field_17167 = var1.method_27531();
   }

   public int method_16095() {
      return this.field_17167;
   }
}

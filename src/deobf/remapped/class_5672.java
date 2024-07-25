package remapped;

import java.io.IOException;

public class class_5672 extends class_6926 {
   private byte[] field_28749;

   public class_5672() {
      super("Binary XML Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_28749 = new byte[(int)this.method_18113(var1)];
      var1.method_27525(this.field_28749);
   }

   public byte[] method_25656() {
      return this.field_28749;
   }
}

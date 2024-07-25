package remapped;

import java.io.IOException;

public class class_3217 extends class_6926 {
   private String field_16043;

   public class_3217() {
      super("OMA DRM Transaction Tracking Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_16043 = var1.method_27533(16);
   }

   public String method_14757() {
      return this.field_16043;
   }
}

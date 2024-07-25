package remapped;

import java.io.IOException;

public class class_7341 extends class_6926 {
   private String field_37550;

   public class_7341() {
      super("OMA DRM Content ID Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      int var4 = (int)var1.method_27524(2);
      this.field_37550 = var1.method_27533(var4);
   }

   public String method_33471() {
      return this.field_37550;
   }
}

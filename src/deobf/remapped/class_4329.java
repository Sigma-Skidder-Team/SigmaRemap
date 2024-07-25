package remapped;

import java.io.IOException;

public class class_4329 extends class_6926 {
   private String field_21056;

   public class_4329() {
      super("OMA DRM Discrete Media Headers Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      int var4 = var1.method_27531();
      this.field_21056 = var1.method_27533(var4);
      this.method_18110(var1);
   }

   public String method_20152() {
      return this.field_21056;
   }
}

package remapped;

import java.io.IOException;

public class class_8414 extends class_6926 {
   private String field_43030;

   public class_8414(String var1) {
      super(var1);
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      byte[] var4 = new byte[(int)this.method_18113(var1)];
      var1.method_27525(var4);
      this.field_43030 = new String(var4, "UTF-8");
   }

   public String method_38726() {
      return this.field_43030;
   }
}

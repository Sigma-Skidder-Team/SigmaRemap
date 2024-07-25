package remapped;

import java.io.IOException;

public class class_1389 extends class_6926 {
   private String field_7584;

   public class_1389() {
      super("Requirement Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_7584 = var1.method_27533((int)this.method_18113(var1));
   }

   public String method_6432() {
      return this.field_7584;
   }
}

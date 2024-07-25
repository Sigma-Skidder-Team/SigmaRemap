package remapped;

import java.io.IOException;

public class class_2357 extends class_3552 {
   private String field_11834;

   public class_2357() {
      super("Text Metadata Sample Entry");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_11834 = var1.method_27539((int)this.method_18113(var1), "UTF-8");
   }

   public String method_10810() {
      return this.field_11834;
   }
}

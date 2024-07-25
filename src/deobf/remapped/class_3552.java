package remapped;

import java.io.IOException;

public abstract class class_3552 extends class_2955 {
   private String field_17375;

   public class_3552(String var1) {
      super(var1);
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_17375 = var1.method_27539((int)this.method_18113(var1), "UTF-8");
   }

   public String method_16530() {
      return this.field_17375;
   }
}

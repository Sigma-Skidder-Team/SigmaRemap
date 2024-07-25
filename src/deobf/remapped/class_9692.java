package remapped;

import java.io.IOException;

public class class_9692 extends class_3552 {
   private String field_49311;
   private String field_49309;

   public class_9692() {
      super("XML Metadata Sample Entry");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_49311 = var1.method_27539((int)this.method_18113(var1), "UTF-8");
      this.field_49309 = var1.method_27539((int)this.method_18113(var1), "UTF-8");
   }

   public String method_44797() {
      return this.field_49311;
   }

   public String method_44796() {
      return this.field_49309;
   }
}

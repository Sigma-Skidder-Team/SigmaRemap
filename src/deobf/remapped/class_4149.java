package remapped;

import java.io.IOException;

public class class_4149 extends class_6926 {
   private String field_20188;

   public class_4149() {
      super("iTunes Metadata Name Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_20188 = var1.method_27533((int)this.method_18113(var1));
   }

   public String method_19264() {
      return this.field_20188;
   }
}

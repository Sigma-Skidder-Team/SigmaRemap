package remapped;

import java.io.IOException;

public class class_6795 extends class_6926 {
   private String field_35029;

   public class_6795() {
      super("XML Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_35029 = var1.method_27538((int)this.method_18113(var1));
   }

   public String method_31140() {
      return this.field_35029;
   }
}

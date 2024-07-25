package remapped;

import java.io.IOException;

public class class_255 extends class_6926 {
   private int field_901;

   public class_255() {
      super("3GPP Recording Year Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_901 = (int)var1.method_27524(2);
   }

   public int method_1124() {
      return this.field_901;
   }
}

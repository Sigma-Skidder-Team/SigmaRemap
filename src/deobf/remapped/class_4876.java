package remapped;

import java.io.IOException;

public class class_4876 extends class_6926 {
   private double field_24265;

   public class_4876() {
      super("Sound Media Header Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_24265 = var1.method_27530(8, 8);
      var1.method_27527(2L);
   }

   public double method_22389() {
      return this.field_24265;
   }
}

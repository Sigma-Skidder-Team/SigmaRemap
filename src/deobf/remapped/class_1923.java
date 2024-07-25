package remapped;

import java.io.IOException;

public class class_1923 extends class_6926 {
   private int field_9846;

   public class_1923() {
      super("Primary Item Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_9846 = (int)var1.method_27524(2);
   }

   public int method_8937() {
      return this.field_9846;
   }
}

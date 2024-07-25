package remapped;

import java.io.IOException;

public abstract class class_2955 extends class_3912 {
   private long field_14432;

   public class_2955(String var1) {
      super(var1);
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      var1.method_27527(6L);
      this.field_14432 = var1.method_27524(2);
   }

   public long method_13516() {
      return this.field_14432;
   }
}

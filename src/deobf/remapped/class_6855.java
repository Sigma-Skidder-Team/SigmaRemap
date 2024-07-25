package remapped;

import java.io.IOException;

public class class_6855 extends class_3912 {
   private byte[] field_35337;

   public class_6855() {
      super("iTunes FairPlay Data Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_35337 = new byte[(int)this.method_18113(var1)];
      var1.method_27525(this.field_35337);
   }

   public byte[] method_31443() {
      return this.field_35337;
   }
}

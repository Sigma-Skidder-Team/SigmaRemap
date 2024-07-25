package remapped;

import java.io.IOException;

public class class_1126 extends class_5535 {
   private long field_6433;
   private int field_6431;

   public class_1126() {
      super("3GPP Classification Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      this.method_25141(var1);
      this.field_6433 = var1.method_27524(4);
      this.field_6431 = (int)var1.method_27524(2);
   }

   public long method_4955() {
      return this.field_6433;
   }

   public int method_4954() {
      return this.field_6431;
   }
}

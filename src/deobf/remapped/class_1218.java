package remapped;

import java.io.IOException;

public class class_1218 extends class_2955 {
   private int field_6764;
   private int field_6762;
   private long field_6763;

   public class_1218() {
      super("RTP Hint Sample Entry");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_6764 = (int)var1.method_27524(2);
      this.field_6762 = (int)var1.method_27524(2);
      this.field_6763 = var1.method_27524(4);
   }

   public long method_5400() {
      return this.field_6763;
   }
}

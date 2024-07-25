package remapped;

import java.io.IOException;

public class class_280 extends class_3912 {
   private long field_996;
   private long field_997;

   public class_280() {
      super("Pixel Aspect Ratio Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      this.field_996 = var1.method_27524(4);
      this.field_997 = var1.method_27524(4);
   }

   public long method_1256() {
      return this.field_996;
   }

   public long method_1255() {
      return this.field_997;
   }
}

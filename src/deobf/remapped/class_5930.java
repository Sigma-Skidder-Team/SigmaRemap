package remapped;

import java.io.IOException;

public class class_5930 implements Packet<class_1243> {
   public static final Identifier field_30076 = new Identifier("brand");
   private Identifier field_30078;
   private class_8248 field_30077;

   public class_5930() {
   }

   public class_5930(Identifier var1, class_8248 var2) {
      this.field_30078 = var1;
      this.field_30077 = var2;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_30078 = var1.method_37768();
      int var4 = var1.readableBytes();
      if (var4 >= 0 && var4 <= 32767) {
         this.field_30077 = new class_8248(var1.readBytes(var4));
      } else {
         throw new IOException("Payload may not be larger than 32767 bytes");
      }
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37780(this.field_30078);
      var1.writeBytes(this.field_30077);
   }

   public void method_27114(class_1243 var1) {
      var1.method_5578(this);
      if (this.field_30077 != null) {
         this.field_30077.release();
      }
   }
}

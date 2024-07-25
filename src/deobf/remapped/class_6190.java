package remapped;

import java.io.IOException;

public class class_6190 implements class_6310<class_8886> {
   private int field_31620;
   private Identifier field_31618;
   private class_8248 field_31617;

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_31620 = var1.method_37778();
      this.field_31618 = var1.method_37768();
      int var4 = var1.readableBytes();
      if (var4 >= 0 && var4 <= 1048576) {
         this.field_31617 = new class_8248(var1.readBytes(var4));
      } else {
         throw new IOException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_31620);
      var1.method_37780(this.field_31618);
      var1.writeBytes(this.field_31617.copy());
   }

   public void method_28319(class_8886 var1) {
      var1.method_40902(this);
   }

   public int method_28320() {
      return this.field_31620;
   }
}

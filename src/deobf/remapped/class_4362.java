package remapped;

import java.io.IOException;

public class class_4362 implements class_6310<class_7515> {
   private int field_21394;
   private class_8248 field_21393;

   public class_4362() {
   }

   public class_4362(int var1, class_8248 var2) {
      this.field_21394 = var1;
      this.field_21393 = var2;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_21394 = var1.method_37778();
      if (!var1.readBoolean()) {
         this.field_21393 = null;
      } else {
         int var4 = var1.readableBytes();
         if (var4 < 0 || var4 > 1048576) {
            throw new IOException("Payload may not be larger than 1048576 bytes");
         }

         this.field_21393 = new class_8248(var1.readBytes(var4));
      }
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_21394);
      if (this.field_21393 == null) {
         var1.writeBoolean(false);
      } else {
         var1.writeBoolean(true);
         var1.writeBytes(this.field_21393.copy());
      }
   }

   public void method_20235(class_7515 var1) {
      var1.method_34254(this);
   }
}

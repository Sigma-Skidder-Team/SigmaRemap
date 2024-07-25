package remapped;

import java.io.IOException;

public class class_4020 implements class_6310<class_392> {
   private static String[] field_19508;
   private int field_19509;

   public class_4020() {
   }

   public class_4020(int var1) {
      this.field_19509 = var1;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_19509 = var1.readByte();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeByte(this.field_19509);
   }

   public void method_18516(class_392 var1) {
      var1.method_1965(this);
   }

   public int method_18514() {
      return this.field_19509;
   }
}

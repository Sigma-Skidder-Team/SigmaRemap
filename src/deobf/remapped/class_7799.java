package remapped;

import java.io.IOException;

public class class_7799 implements class_6310<class_392> {
   private static String[] field_39505;
   private int field_39506;
   private class_4639 field_39504;

   public class_7799() {
   }

   public class_7799(int var1, class_8932<?> var2) {
      this.field_39506 = var1;
      this.field_39504 = var2.method_41050();
   }

   public class_4639 method_35373() {
      return this.field_39504;
   }

   public int method_35375() {
      return this.field_39506;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_39506 = var1.readByte();
      this.field_39504 = var1.method_37768();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeByte(this.field_39506);
      var1.method_37780(this.field_39504);
   }

   public void method_35376(class_392 var1) {
      var1.method_1927(this);
   }
}

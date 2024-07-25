package remapped;

import java.io.IOException;

public class class_4729 implements class_6310<class_392> {
   private static String[] field_22920;
   private int field_22923;
   private class_1331 field_22921;
   private int field_22922;

   public class_4729() {
   }

   public class_4729(int var1, class_1331 var2, int var3) {
      this.field_22923 = var1;
      this.field_22921 = var2;
      this.field_22922 = var3;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_22923 = var1.method_37778();
      this.field_22921 = var1.method_37748();
      this.field_22922 = var1.readUnsignedByte();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_22923);
      var1.method_37770(this.field_22921);
      var1.writeByte(this.field_22922);
   }

   public void method_21846(class_392 var1) {
      var1.method_1908(this);
   }

   public int method_21845() {
      return this.field_22923;
   }

   public class_1331 method_21847() {
      return this.field_22921;
   }

   public int method_21844() {
      return this.field_22922;
   }
}

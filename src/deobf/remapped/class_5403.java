package remapped;

import java.io.IOException;

public class class_5403 implements class_6310<class_392> {
   private static String[] field_27572;
   private int field_27573;
   private int field_27571;
   private int field_27570;

   public class_5403() {
   }

   public class_5403(int var1, int var2, int var3) {
      this.field_27573 = var1;
      this.field_27571 = var2;
      this.field_27570 = var3;
   }

   public void method_24597(class_392 var1) {
      var1.method_1977(this);
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_27573 = var1.readUnsignedByte();
      this.field_27571 = var1.readShort();
      this.field_27570 = var1.readShort();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeByte(this.field_27573);
      var1.writeShort(this.field_27571);
      var1.writeShort(this.field_27570);
   }

   public int method_24598() {
      return this.field_27573;
   }

   public int method_24595() {
      return this.field_27571;
   }

   public int method_24594() {
      return this.field_27570;
   }
}

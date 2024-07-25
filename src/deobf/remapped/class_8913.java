package remapped;

import java.io.IOException;

public class class_8913 implements Packet<class_392> {
   private static String[] field_45692;
   private int field_45690;
   private short field_45689;
   private boolean field_45691;

   public class_8913() {
   }

   public class_8913(int var1, short var2, boolean var3) {
      this.field_45690 = var1;
      this.field_45689 = var2;
      this.field_45691 = var3;
   }

   public void method_40998(class_392 var1) {
      var1.method_1970(this);
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_45690 = var1.readUnsignedByte();
      this.field_45689 = var1.readShort();
      this.field_45691 = var1.readBoolean();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeByte(this.field_45690);
      var1.writeShort(this.field_45689);
      var1.writeBoolean(this.field_45691);
   }

   public int method_40994() {
      return this.field_45690;
   }

   public short method_40996() {
      return this.field_45689;
   }

   public boolean method_40997() {
      return this.field_45691;
   }
}

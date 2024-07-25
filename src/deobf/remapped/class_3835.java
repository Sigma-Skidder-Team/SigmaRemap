package remapped;

import java.io.IOException;

public class class_3835 implements class_6310<class_1243> {
   private static String[] field_18725;
   private int field_18724;
   private short field_18727;
   private boolean field_18726;

   public class_3835() {
   }

   public class_3835(int var1, short var2, boolean var3) {
      this.field_18724 = var1;
      this.field_18727 = var2;
      this.field_18726 = var3;
   }

   public void method_17820(class_1243 var1) {
      var1.method_5572(this);
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_18724 = var1.readByte();
      this.field_18727 = var1.readShort();
      this.field_18726 = var1.readByte() != 0;
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeByte(this.field_18724);
      var1.writeShort(this.field_18727);
      var1.writeByte(!this.field_18726 ? 0 : 1);
   }

   public int method_17822() {
      return this.field_18724;
   }

   public short method_17819() {
      return this.field_18727;
   }
}

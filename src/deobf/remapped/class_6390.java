package remapped;

import java.io.IOException;

public class class_6390 implements class_6310<class_392> {
   private static String[] field_32639;
   private int field_32637;
   private int field_32638;
   private int field_32636;

   public class_6390() {
   }

   public class_6390(int var1, int var2, int var3) {
      this.field_32637 = var1;
      this.field_32638 = var2;
      this.field_32636 = var3;
   }

   public void method_29188(class_392 var1) {
      var1.method_1967(this);
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_32637 = var1.readUnsignedByte();
      this.field_32638 = var1.method_37778();
      this.field_32636 = var1.readInt();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeByte(this.field_32637);
      var1.method_37743(this.field_32638);
      var1.writeInt(this.field_32636);
   }

   public int method_29189() {
      return this.field_32637;
   }

   public int method_29186() {
      return this.field_32638;
   }

   public int method_29185() {
      return this.field_32636;
   }
}

package remapped;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class class_1456 extends class_5287 {
   private static String[] field_7853;
   private byte field_7854;

   public class_1456(String var1) {
      this(var1, (byte)0);
   }

   public class_1456(String var1, byte var2) {
      super(var1);
      this.field_7854 = var2;
   }

   public Byte method_6752() {
      return this.field_7854;
   }

   public void method_6751(byte var1) {
      this.field_7854 = var1;
   }

   @Override
   public void method_24130(DataInput var1) throws IOException {
      this.field_7854 = var1.readByte();
   }

   @Override
   public void method_24127(DataOutput var1) throws IOException {
      var1.writeByte(this.field_7854);
   }

   public class_1456 clone() {
      return new class_1456(this.method_24126(), this.method_6752());
   }
}

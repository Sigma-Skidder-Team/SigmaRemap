package remapped;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class class_1070 extends class_5287 {
   private static String[] field_5854;
   private byte[] field_5853;

   public class_1070(String var1) {
      this(var1, new byte[0]);
   }

   public class_1070(String var1, byte[] var2) {
      super(var1);
      this.field_5853 = var2;
   }

   public byte[] method_4696() {
      return (byte[])this.field_5853.clone();
   }

   public void method_4694(byte[] var1) {
      if (var1 != null) {
         this.field_5853 = (byte[])var1.clone();
      }
   }

   public byte method_4697(int var1) {
      return this.field_5853[var1];
   }

   public void method_4693(int var1, byte var2) {
      this.field_5853[var1] = var2;
   }

   public int method_4695() {
      return this.field_5853.length;
   }

   @Override
   public void method_24130(DataInput var1) throws IOException {
      this.field_5853 = new byte[var1.readInt()];
      var1.readFully(this.field_5853);
   }

   @Override
   public void method_24127(DataOutput var1) throws IOException {
      var1.writeInt(this.field_5853.length);
      var1.write(this.field_5853);
   }

   public class_1070 clone() {
      return new class_1070(this.method_24126(), this.method_4696());
   }
}

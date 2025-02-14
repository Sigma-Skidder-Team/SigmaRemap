package mapped;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Class63 extends Class61 {
   private static String[] field137;
   private byte[] field138;

   public Class63(String var1) {
      this(var1, new byte[0]);
   }

   public Class63(String var1, byte[] var2) {
      super(var1);
      this.field138 = var2;
   }

   public byte[] method205() {
      return (byte[])this.field138.clone();
   }

   public void method211(byte[] var1) {
      if (var1 != null) {
         this.field138 = (byte[])var1.clone();
      }
   }

   public byte method212(int var1) {
      return this.field138[var1];
   }

   public void method213(int var1, byte var2) {
      this.field138[var1] = var2;
   }

   public int method214() {
      return this.field138.length;
   }

   @Override
   public void method203(DataInput var1) throws IOException {
      this.field138 = new byte[var1.readInt()];
      var1.readFully(this.field138);
   }

   @Override
   public void method204(DataOutput var1) throws IOException {
      var1.writeInt(this.field138.length);
      var1.write(this.field138);
   }

   public Class63 clone() {
      return new Class63(this.method206(), this.method205());
   }
}

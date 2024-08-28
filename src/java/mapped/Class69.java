package mapped;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Class69 extends Class61 {
   private static String[] field149;
   private byte field150;

   public Class69(String var1) {
      this(var1, (byte)0);
   }

   public Class69(String var1, byte var2) {
      super(var1);
      this.field150 = var2;
   }

   public Byte method205() {
      return this.field150;
   }

   public void method229(byte var1) {
      this.field150 = var1;
   }

   @Override
   public void method203(DataInput var1) throws IOException {
      this.field150 = var1.readByte();
   }

   @Override
   public void method204(DataOutput var1) throws IOException {
      var1.writeByte(this.field150);
   }

   public Class69 clone() {
      return new Class69(this.method206(), this.method205());
   }
}

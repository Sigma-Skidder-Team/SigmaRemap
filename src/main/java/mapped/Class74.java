package mapped;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Class74 extends Class61 {
   private static String[] field157;
   private short[] field158;

   public Class74(String var1) {
      this(var1, new short[0]);
   }

   public Class74(String var1, short[] var2) {
      super(var1);
      this.field158 = var2;
   }

   public short[] method205() {
      return (short[])this.field158.clone();
   }

   public void method242(short[] var1) {
      if (var1 != null) {
         this.field158 = (short[])var1.clone();
      }
   }

   public short method243(int var1) {
      return this.field158[var1];
   }

   public void method244(int var1, short var2) {
      this.field158[var1] = var2;
   }

   public int method245() {
      return this.field158.length;
   }

   @Override
   public void method203(DataInput var1) throws IOException {
      this.field158 = new short[var1.readInt()];

      for (int var4 = 0; var4 < this.field158.length; var4++) {
         this.field158[var4] = var1.readShort();
      }
   }

   @Override
   public void method204(DataOutput var1) throws IOException {
      var1.writeInt(this.field158.length);

      for (int var4 = 0; var4 < this.field158.length; var4++) {
         var1.writeShort(this.field158[var4]);
      }
   }

   public Class74 clone() {
      return new Class74(this.method206(), this.method205());
   }
}

package mapped;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Class65 extends Class61 {
   private static String[] field141;
   private long[] field142;

   public Class65(String var1) {
      this(var1, new long[0]);
   }

   public Class65(String var1, long[] var2) {
      super(var1);
      this.field142 = var2;
   }

   public long[] method205() {
      return (long[])this.field142.clone();
   }

   public void method219(long[] var1) {
      if (var1 != null) {
         this.field142 = (long[])var1.clone();
      }
   }

   public long method220(int var1) {
      return this.field142[var1];
   }

   public void method221(int var1, long var2) {
      this.field142[var1] = var2;
   }

   public int method222() {
      return this.field142.length;
   }

   @Override
   public void method203(DataInput var1) throws IOException {
      this.field142 = new long[var1.readInt()];

      for (int var4 = 0; var4 < this.field142.length; var4++) {
         this.field142[var4] = var1.readLong();
      }
   }

   @Override
   public void method204(DataOutput var1) throws IOException {
      var1.writeInt(this.field142.length);

      for (int var4 = 0; var4 < this.field142.length; var4++) {
         var1.writeLong(this.field142[var4]);
      }
   }

   public Class65 clone() {
      return new Class65(this.method206(), this.method205());
   }
}

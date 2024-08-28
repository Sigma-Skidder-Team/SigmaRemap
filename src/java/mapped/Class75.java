package mapped;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Class75 extends Class61 {
   private static String[] field159;
   private long field160;

   public Class75(String var1) {
      this(var1, 0L);
   }

   public Class75(String var1, long var2) {
      super(var1);
      this.field160 = var2;
   }

   public Long method205() {
      return this.field160;
   }

   public void method246(long var1) {
      this.field160 = var1;
   }

   @Override
   public void method203(DataInput var1) throws IOException {
      this.field160 = var1.readLong();
   }

   @Override
   public void method204(DataOutput var1) throws IOException {
      var1.writeLong(this.field160);
   }

   public Class75 clone() {
      return new Class75(this.method206(), this.method205());
   }
}

package mapped;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Class66 extends Class61 {
   private static String[] field143;
   private int field144;

   public Class66(String var1) {
      this(var1, 0);
   }

   public Class66(String var1, int var2) {
      super(var1);
      this.field144 = var2;
   }

   public Integer method205() {
      return this.field144;
   }

   public void method223(int var1) {
      this.field144 = var1;
   }

   @Override
   public void method203(DataInput var1) throws IOException {
      this.field144 = var1.readInt();
   }

   @Override
   public void method204(DataOutput var1) throws IOException {
      var1.writeInt(this.field144);
   }

   public Class66 clone() {
      return new Class66(this.method206(), this.method205());
   }
}

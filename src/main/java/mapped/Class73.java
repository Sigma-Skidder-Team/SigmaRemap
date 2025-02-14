package mapped;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Class73 extends Class61 {
   private static String[] field155;
   private short field156;

   public Class73(String var1) {
      this(var1, (short)0);
   }

   public Class73(String var1, short var2) {
      super(var1);
      this.field156 = var2;
   }

   public Short method205() {
      return this.field156;
   }

   public void method241(short var1) {
      this.field156 = var1;
   }

   @Override
   public void method203(DataInput var1) throws IOException {
      this.field156 = var1.readShort();
   }

   @Override
   public void method204(DataOutput var1) throws IOException {
      var1.writeShort(this.field156);
   }

   public Class73 clone() {
      return new Class73(this.method206(), this.method205());
   }
}

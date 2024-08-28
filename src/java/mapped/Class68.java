package mapped;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Class68 extends Class61 {
   private static String[] field147;
   private double field148;

   public Class68(String var1) {
      this(var1, 0.0);
   }

   public Class68(String var1, double var2) {
      super(var1);
      this.field148 = var2;
   }

   public Double method205() {
      return this.field148;
   }

   public void method228(double var1) {
      this.field148 = var1;
   }

   @Override
   public void method203(DataInput var1) throws IOException {
      this.field148 = var1.readDouble();
   }

   @Override
   public void method204(DataOutput var1) throws IOException {
      var1.writeDouble(this.field148);
   }

   public Class68 clone() {
      return new Class68(this.method206(), this.method205());
   }
}

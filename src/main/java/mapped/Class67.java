package mapped;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Class67 extends Class61 {
   private static String[] field145;
   private double[] field146;

   public Class67(String var1) {
      this(var1, new double[0]);
   }

   public Class67(String var1, double[] var2) {
      super(var1);
      this.field146 = var2;
   }

   public double[] method205() {
      return (double[])this.field146.clone();
   }

   public void method224(double[] var1) {
      if (var1 != null) {
         this.field146 = (double[])var1.clone();
      }
   }

   public double method225(int var1) {
      return this.field146[var1];
   }

   public void method226(int var1, double var2) {
      this.field146[var1] = var2;
   }

   public int method227() {
      return this.field146.length;
   }

   @Override
   public void method203(DataInput var1) throws IOException {
      this.field146 = new double[var1.readInt()];

      for (int var4 = 0; var4 < this.field146.length; var4++) {
         this.field146[var4] = var1.readDouble();
      }
   }

   @Override
   public void method204(DataOutput var1) throws IOException {
      var1.writeInt(this.field146.length);

      for (int var4 = 0; var4 < this.field146.length; var4++) {
         var1.writeDouble(this.field146[var4]);
      }
   }

   public Class67 clone() {
      return new Class67(this.method206(), this.method205());
   }
}

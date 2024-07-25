package remapped;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class class_9042 extends class_5287 {
   private static String[] field_46268;
   private double[] field_46267;

   public class_9042(String var1) {
      this(var1, new double[0]);
   }

   public class_9042(String var1, double[] var2) {
      super(var1);
      this.field_46267 = var2;
   }

   public double[] method_41505() {
      return (double[])this.field_46267.clone();
   }

   public void method_41503(double[] var1) {
      if (var1 != null) {
         this.field_46267 = (double[])var1.clone();
      }
   }

   public double method_41506(int var1) {
      return this.field_46267[var1];
   }

   public void method_41502(int var1, double var2) {
      this.field_46267[var1] = var2;
   }

   public int method_41504() {
      return this.field_46267.length;
   }

   @Override
   public void method_24130(DataInput var1) throws IOException {
      this.field_46267 = new double[var1.readInt()];

      for (int var4 = 0; var4 < this.field_46267.length; var4++) {
         this.field_46267[var4] = var1.readDouble();
      }
   }

   @Override
   public void method_24127(DataOutput var1) throws IOException {
      var1.writeInt(this.field_46267.length);

      for (int var4 = 0; var4 < this.field_46267.length; var4++) {
         var1.writeDouble(this.field_46267[var4]);
      }
   }

   public class_9042 clone() {
      return new class_9042(this.method_24126(), this.method_41505());
   }
}

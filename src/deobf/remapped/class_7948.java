package remapped;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class class_7948 extends class_5287 {
   private static String[] field_40673;
   private double field_40674;

   public class_7948(String var1) {
      this(var1, 0.0);
   }

   public class_7948(String var1, double var2) {
      super(var1);
      this.field_40674 = var2;
   }

   public Double method_35980() {
      return this.field_40674;
   }

   public void method_35979(double var1) {
      this.field_40674 = var1;
   }

   @Override
   public void method_24130(DataInput var1) throws IOException {
      this.field_40674 = var1.readDouble();
   }

   @Override
   public void method_24127(DataOutput var1) throws IOException {
      var1.writeDouble(this.field_40674);
   }

   public class_7948 clone() {
      return new class_7948(this.method_24126(), this.method_35980());
   }
}

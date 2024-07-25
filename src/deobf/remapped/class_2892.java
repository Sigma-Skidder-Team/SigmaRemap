package remapped;

import java.io.Serializable;

public class class_2892 extends class_2693 implements Serializable {
   private static String[] field_14146;
   public static final long field_14145 = 8572646365302599857L;

   public class_2892(double var1, double var3) {
      super(var1, var3);
   }

   public class_2892(double[] var1) {
      super(var1);
   }

   public class_2892(class_2892 var1) {
      super(var1);
   }

   public class_2892(class_3686 var1) {
      super(var1);
   }

   public class_2892(class_2693 var1) {
      super(var1);
   }

   public class_2892(class_6064 var1) {
      super(var1);
   }

   public class_2892() {
   }

   public final double method_13251(class_2892 var1) {
      return this.field_13181 * var1.field_13181 + this.field_13180 * var1.field_13180;
   }

   public final double method_13250() {
      return Math.sqrt(this.field_13181 * this.field_13181 + this.field_13180 * this.field_13180);
   }

   public final double method_13246() {
      return this.field_13181 * this.field_13181 + this.field_13180 * this.field_13180;
   }

   public final void method_13249(class_2892 var1) {
      double var4 = 1.0 / Math.sqrt(var1.field_13181 * var1.field_13181 + var1.field_13180 * var1.field_13180);
      this.field_13181 = var1.field_13181 * var4;
      this.field_13180 = var1.field_13180 * var4;
   }

   public final void method_13248() {
      double var3 = 1.0 / Math.sqrt(this.field_13181 * this.field_13181 + this.field_13180 * this.field_13180);
      this.field_13181 *= var3;
      this.field_13180 *= var3;
   }

   public final double method_13247(class_2892 var1) {
      double var4 = this.method_13251(var1) / (this.method_13250() * var1.method_13250());
      if (var4 < -1.0) {
         var4 = -1.0;
      }

      if (var4 > 1.0) {
         var4 = 1.0;
      }

      return Math.acos(var4);
   }
}

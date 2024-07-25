package remapped;

import java.io.Serializable;

public class class_2120 extends class_2693 implements Serializable {
   private static String[] field_10631;
   public static final long field_10630 = 1133748791492571954L;

   public class_2120(double var1, double var3) {
      super(var1, var3);
   }

   public class_2120(double[] var1) {
      super(var1);
   }

   public class_2120(class_2120 var1) {
      super(var1);
   }

   public class_2120(class_9158 var1) {
      super(var1);
   }

   public class_2120(class_2693 var1) {
      super(var1);
   }

   public class_2120(class_6064 var1) {
      super(var1);
   }

   public class_2120() {
   }

   public final double method_9921(class_2120 var1) {
      double var4 = this.field_13181 - var1.field_13181;
      double var6 = this.field_13180 - var1.field_13180;
      return var4 * var4 + var6 * var6;
   }

   public final double method_9919(class_2120 var1) {
      double var4 = this.field_13181 - var1.field_13181;
      double var6 = this.field_13180 - var1.field_13180;
      return Math.sqrt(var4 * var4 + var6 * var6);
   }

   public final double method_9922(class_2120 var1) {
      return Math.abs(this.field_13181 - var1.field_13181) + Math.abs(this.field_13180 - var1.field_13180);
   }

   public final double method_9920(class_2120 var1) {
      return Math.max(Math.abs(this.field_13181 - var1.field_13181), Math.abs(this.field_13180 - var1.field_13180));
   }
}

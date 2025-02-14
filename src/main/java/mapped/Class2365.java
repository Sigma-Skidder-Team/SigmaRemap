package mapped;

import java.io.Serializable;

public class Class2365 extends Class2364 implements Serializable {
   private static String[] field16205;
   public static final long field16206 = 1133748791492571954L;

   public Class2365(double var1, double var3) {
      super(var1, var3);
   }

   public Class2365(double[] var1) {
      super(var1);
   }

   public Class2365(Class2365 var1) {
      super(var1);
   }

   public Class2365(Class2401 var1) {
      super(var1);
   }

   public Class2365(Class2364 var1) {
      super(var1);
   }

   public Class2365(Class2399 var1) {
      super(var1);
   }

   public Class2365() {
   }

   public final double method9480(Class2365 var1) {
      double var4 = this.field16203 - var1.field16203;
      double var6 = this.field16204 - var1.field16204;
      return var4 * var4 + var6 * var6;
   }

   public final double method9481(Class2365 var1) {
      double var4 = this.field16203 - var1.field16203;
      double var6 = this.field16204 - var1.field16204;
      return Math.sqrt(var4 * var4 + var6 * var6);
   }

   public final double method9482(Class2365 var1) {
      return Math.abs(this.field16203 - var1.field16203) + Math.abs(this.field16204 - var1.field16204);
   }

   public final double method9483(Class2365 var1) {
      return Math.max(Math.abs(this.field16203 - var1.field16203), Math.abs(this.field16204 - var1.field16204));
   }
}

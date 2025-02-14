package mapped;

import java.io.Serializable;

public class Class2369 extends Class2367 implements Serializable {
   private static String[] field16214;
   public static final long field16209 = 5718062286069042927L;

   public Class2369(double var1, double var3, double var5) {
      super(var1, var3, var5);
   }

   public Class2369(double[] var1) {
      super(var1);
   }

   public Class2369(Class2369 var1) {
      super(var1);
   }

   public Class2369(Class2418 var1) {
      super(var1);
   }

   public Class2369(Class5 var1) {
      super(var1);
   }

   public Class2369(Class2367 var1) {
      super(var1);
   }

   public Class2369() {
   }

   public final double method9539(Class2369 var1) {
      double var4 = this.field16210 - var1.field16210;
      double var6 = this.field16211 - var1.field16211;
      double var8 = this.field16212 - var1.field16212;
      return var4 * var4 + var6 * var6 + var8 * var8;
   }

   public final double method9540(Class2369 var1) {
      double var4 = this.field16210 - var1.field16210;
      double var6 = this.field16211 - var1.field16211;
      double var8 = this.field16212 - var1.field16212;
      return Math.sqrt(var4 * var4 + var6 * var6 + var8 * var8);
   }

   public final double method9541(Class2369 var1) {
      return Math.abs(this.field16210 - var1.field16210) + Math.abs(this.field16211 - var1.field16211) + Math.abs(this.field16212 - var1.field16212);
   }

   public final double method9542(Class2369 var1) {
      double var4 = Math.max(Math.abs(this.field16210 - var1.field16210), Math.abs(this.field16211 - var1.field16211));
      return Math.max(var4, Math.abs(this.field16212 - var1.field16212));
   }

   public final void method9543(Class2388 var1) {
      double var4 = 1.0 / var1.field16277;
      this.field16210 = var1.field16274 * var4;
      this.field16211 = var1.field16275 * var4;
      this.field16212 = var1.field16276 * var4;
   }
}

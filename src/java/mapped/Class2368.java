package mapped;

import java.io.Serializable;

public class Class2368 extends Class2367 implements Serializable {
   private static String[] field16213;
   public static final long field16209 = 3761969948420550442L;

   public Class2368(double var1, double var3, double var5) {
      super(var1, var3, var5);
   }

   public Class2368(double[] var1) {
      super(var1);
   }

   public Class2368(Class2368 var1) {
      super(var1);
   }

   public Class2368(Class6 var1) {
      super(var1);
   }

   public Class2368(Class5 var1) {
      super(var1);
   }

   public Class2368(Class2367 var1) {
      super(var1);
   }

   public Class2368() {
   }

   public final void method9532(Class2368 var1, Class2368 var2) {
      double var5 = var1.field16211 * var2.field16212 - var1.field16212 * var2.field16211;
      double var7 = var2.field16210 * var1.field16212 - var2.field16212 * var1.field16210;
      this.field16212 = var1.field16210 * var2.field16211 - var1.field16211 * var2.field16210;
      this.field16210 = var5;
      this.field16211 = var7;
   }

   public final void method9533(Class2368 var1) {
      double var4 = 1.0 / Math.sqrt(var1.field16210 * var1.field16210 + var1.field16211 * var1.field16211 + var1.field16212 * var1.field16212);
      this.field16210 = var1.field16210 * var4;
      this.field16211 = var1.field16211 * var4;
      this.field16212 = var1.field16212 * var4;
   }

   public final void method9534() {
      double var3 = 1.0 / Math.sqrt(this.field16210 * this.field16210 + this.field16211 * this.field16211 + this.field16212 * this.field16212);
      this.field16210 *= var3;
      this.field16211 *= var3;
      this.field16212 *= var3;
   }

   public final double method9535(Class2368 var1) {
      return this.field16210 * var1.field16210 + this.field16211 * var1.field16211 + this.field16212 * var1.field16212;
   }

   public final double method9536() {
      return this.field16210 * this.field16210 + this.field16211 * this.field16211 + this.field16212 * this.field16212;
   }

   public final double method9537() {
      return Math.sqrt(this.field16210 * this.field16210 + this.field16211 * this.field16211 + this.field16212 * this.field16212);
   }

   public final double method9538(Class2368 var1) {
      double var4 = this.method9535(var1) / (this.method9537() * var1.method9537());
      if (var4 < -1.0) {
         var4 = -1.0;
      }

      if (var4 > 1.0) {
         var4 = 1.0;
      }

      return Math.acos(var4);
   }
}

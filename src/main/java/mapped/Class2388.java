package mapped;

import java.io.Serializable;

public class Class2388 extends Class2387 implements Serializable {
   private static String[] field16278;
   public static final long field16273 = 1733471895962736949L;

   public Class2388(double var1, double var3, double var5, double var7) {
      super(var1, var3, var5, var7);
   }

   public Class2388(double[] var1) {
      super(var1);
   }

   public Class2388(Class2388 var1) {
      super(var1);
   }

   public Class2388(Class2412 var1) {
      super(var1);
   }

   public Class2388(Class2411 var1) {
      super(var1);
   }

   public Class2388(Class2387 var1) {
      super(var1);
   }

   public Class2388(Class2367 var1) {
      super(var1.field16210, var1.field16211, var1.field16212, 1.0);
   }

   public Class2388() {
   }

   public final void method9770(Class2367 var1) {
      this.field16274 = var1.field16210;
      this.field16275 = var1.field16211;
      this.field16276 = var1.field16212;
      this.field16277 = 1.0;
   }

   public final double method9771(Class2388 var1) {
      double var4 = this.field16274 - var1.field16274;
      double var6 = this.field16275 - var1.field16275;
      double var8 = this.field16276 - var1.field16276;
      double var10 = this.field16277 - var1.field16277;
      return var4 * var4 + var6 * var6 + var8 * var8 + var10 * var10;
   }

   public final double method9772(Class2388 var1) {
      double var4 = this.field16274 - var1.field16274;
      double var6 = this.field16275 - var1.field16275;
      double var8 = this.field16276 - var1.field16276;
      double var10 = this.field16277 - var1.field16277;
      return Math.sqrt(var4 * var4 + var6 * var6 + var8 * var8 + var10 * var10);
   }

   public final double method9773(Class2388 var1) {
      return Math.abs(this.field16274 - var1.field16274)
         + Math.abs(this.field16275 - var1.field16275)
         + Math.abs(this.field16276 - var1.field16276)
         + Math.abs(this.field16277 - var1.field16277);
   }

   public final double method9774(Class2388 var1) {
      double var4 = Math.max(Math.abs(this.field16274 - var1.field16274), Math.abs(this.field16275 - var1.field16275));
      double var6 = Math.max(Math.abs(this.field16276 - var1.field16276), Math.abs(this.field16277 - var1.field16277));
      return Math.max(var4, var6);
   }

   public final void method9775(Class2388 var1) {
      double var4 = 1.0 / var1.field16277;
      this.field16274 = var1.field16274 * var4;
      this.field16275 = var1.field16275 * var4;
      this.field16276 = var1.field16276 * var4;
      this.field16277 = 1.0;
   }
}

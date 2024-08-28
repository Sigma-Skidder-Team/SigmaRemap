package mapped;

import java.io.Serializable;

public class Class6 extends Class5 implements Serializable {
   private static String[] field11;
   public static final long field7 = -7031930069184524614L;

   public Class6(float var1, float var2, float var3) {
      super(var1, var2, var3);
   }

   public Class6(float[] var1) {
      super(var1);
   }

   public Class6(Class6 var1) {
      super(var1);
   }

   public Class6(Class2368 var1) {
      super(var1);
   }

   public Class6(Class5 var1) {
      super(var1);
   }

   public Class6(Class2367 var1) {
      super(var1);
   }

   public Class6() {
   }

   public final float method37() {
      return this.field8 * this.field8 + this.field9 * this.field9 + this.field10 * this.field10;
   }

   public final float method38() {
      return (float)Math.sqrt((double)(this.field8 * this.field8 + this.field9 * this.field9 + this.field10 * this.field10));
   }

   public final void method39(Class6 var1, Class6 var2) {
      float var5 = var1.field9 * var2.field10 - var1.field10 * var2.field9;
      float var6 = var2.field8 * var1.field10 - var2.field10 * var1.field8;
      this.field10 = var1.field8 * var2.field9 - var1.field9 * var2.field8;
      this.field8 = var5;
      this.field9 = var6;
   }

   public final float method40(Class6 var1) {
      return this.field8 * var1.field8 + this.field9 * var1.field9 + this.field10 * var1.field10;
   }

   public final void method41(Class6 var1) {
      float var4 = (float)(1.0 / Math.sqrt((double)(var1.field8 * var1.field8 + var1.field9 * var1.field9 + var1.field10 * var1.field10)));
      this.field8 = var1.field8 * var4;
      this.field9 = var1.field9 * var4;
      this.field10 = var1.field10 * var4;
   }

   public final void method42() {
      float var3 = (float)(1.0 / Math.sqrt((double)(this.field8 * this.field8 + this.field9 * this.field9 + this.field10 * this.field10)));
      this.field8 *= var3;
      this.field9 *= var3;
      this.field10 *= var3;
   }

   public final float method43(Class6 var1) {
      double var4 = (double)(this.method40(var1) / (this.method38() * var1.method38()));
      if (var4 < -1.0) {
         var4 = -1.0;
      }

      if (var4 > 1.0) {
         var4 = 1.0;
      }

      return (float)Math.acos(var4);
   }
}

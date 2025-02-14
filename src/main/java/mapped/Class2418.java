package mapped;

import java.io.Serializable;

public class Class2418 extends Class5 implements Serializable {
   private static String[] field16419;
   public static final long field16420 = -8689337816398030143L;

   public Class2418(float var1, float var2, float var3) {
      super(var1, var2, var3);
   }

   public Class2418(float[] var1) {
      super(var1);
   }

   public Class2418(Class2418 var1) {
      super(var1);
   }

   public Class2418(Class2369 var1) {
      super(var1);
   }

   public Class2418(Class5 var1) {
      super(var1);
   }

   public Class2418(Class2367 var1) {
      super(var1);
   }

   public Class2418() {
   }

   public final float method10364(Class2418 var1) {
      float var4 = this.field8 - var1.field8;
      float var5 = this.field9 - var1.field9;
      float var6 = this.field10 - var1.field10;
      return var4 * var4 + var5 * var5 + var6 * var6;
   }

   public final float method10365(Class2418 var1) {
      float var4 = this.field8 - var1.field8;
      float var5 = this.field9 - var1.field9;
      float var6 = this.field10 - var1.field10;
      return (float)Math.sqrt((double)(var4 * var4 + var5 * var5 + var6 * var6));
   }

   public final float method10366(Class2418 var1) {
      return Math.abs(this.field8 - var1.field8) + Math.abs(this.field9 - var1.field9) + Math.abs(this.field10 - var1.field10);
   }

   public final float method10367(Class2418 var1) {
      float var4 = Math.max(Math.abs(this.field8 - var1.field8), Math.abs(this.field9 - var1.field9));
      return Math.max(var4, Math.abs(this.field10 - var1.field10));
   }

   public final void method10368(Class2412 var1) {
      float var4 = 1.0F / var1.field16392;
      this.field8 = var1.field16389 * var4;
      this.field9 = var1.field16390 * var4;
      this.field10 = var1.field16391 * var4;
   }
}

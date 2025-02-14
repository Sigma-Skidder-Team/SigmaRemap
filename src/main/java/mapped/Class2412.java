package mapped;

import java.io.Serializable;

public class Class2412 extends Class2411 implements Serializable {
   private static String[] field16393;
   public static final long field16388 = 4643134103185764459L;

   public Class2412(float var1, float var2, float var3, float var4) {
      super(var1, var2, var3, var4);
   }

   public Class2412(float[] var1) {
      super(var1);
   }

   public Class2412(Class2412 var1) {
      super(var1);
   }

   public Class2412(Class2388 var1) {
      super(var1);
   }

   public Class2412(Class2411 var1) {
      super(var1);
   }

   public Class2412(Class2387 var1) {
      super(var1);
   }

   public Class2412(Class5 var1) {
      super(var1.field8, var1.field9, var1.field10, 1.0F);
   }

   public Class2412() {
   }

   public final void method10208(Class5 var1) {
      this.field16389 = var1.field8;
      this.field16390 = var1.field9;
      this.field16391 = var1.field10;
      this.field16392 = 1.0F;
   }

   public final float method10209(Class2412 var1) {
      float var4 = this.field16389 - var1.field16389;
      float var5 = this.field16390 - var1.field16390;
      float var6 = this.field16391 - var1.field16391;
      float var7 = this.field16392 - var1.field16392;
      return var4 * var4 + var5 * var5 + var6 * var6 + var7 * var7;
   }

   public final float method10210(Class2412 var1) {
      float var4 = this.field16389 - var1.field16389;
      float var5 = this.field16390 - var1.field16390;
      float var6 = this.field16391 - var1.field16391;
      float var7 = this.field16392 - var1.field16392;
      return (float)Math.sqrt((double)(var4 * var4 + var5 * var5 + var6 * var6 + var7 * var7));
   }

   public final float method10211(Class2412 var1) {
      return Math.abs(this.field16389 - var1.field16389)
         + Math.abs(this.field16390 - var1.field16390)
         + Math.abs(this.field16391 - var1.field16391)
         + Math.abs(this.field16392 - var1.field16392);
   }

   public final float method10212(Class2412 var1) {
      float var4 = Math.max(Math.abs(this.field16389 - var1.field16389), Math.abs(this.field16390 - var1.field16390));
      float var5 = Math.max(Math.abs(this.field16391 - var1.field16391), Math.abs(this.field16392 - var1.field16392));
      return Math.max(var4, var5);
   }

   public final void method10213(Class2412 var1) {
      float var4 = 1.0F / var1.field16392;
      this.field16389 = var1.field16389 * var4;
      this.field16390 = var1.field16390 * var4;
      this.field16391 = var1.field16391 * var4;
      this.field16392 = 1.0F;
   }
}

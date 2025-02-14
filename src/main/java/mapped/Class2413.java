package mapped;

import java.io.Serializable;

public class Class2413 extends Class2411 implements Serializable {
   private static String[] field16394;
   public static final long field16388 = 8749319902347760659L;

   public Class2413(float var1, float var2, float var3, float var4) {
      super(var1, var2, var3, var4);
   }

   public Class2413(float[] var1) {
      super(var1);
   }

   public Class2413(Class2413 var1) {
      super(var1);
   }

   public Class2413(Class2390 var1) {
      super(var1);
   }

   public Class2413(Class2411 var1) {
      super(var1);
   }

   public Class2413(Class2387 var1) {
      super(var1);
   }

   public Class2413(Class5 var1) {
      super(var1.field8, var1.field9, var1.field10, 0.0F);
   }

   public Class2413() {
   }

   public final void method10208(Class5 var1) {
      this.field16389 = var1.field8;
      this.field16390 = var1.field9;
      this.field16391 = var1.field10;
      this.field16392 = 0.0F;
   }

   public final float method10214() {
      return (float)Math.sqrt(
         (double)(this.field16389 * this.field16389 + this.field16390 * this.field16390 + this.field16391 * this.field16391 + this.field16392 * this.field16392)
      );
   }

   public final float method10215() {
      return this.field16389 * this.field16389 + this.field16390 * this.field16390 + this.field16391 * this.field16391 + this.field16392 * this.field16392;
   }

   public final float method10216(Class2413 var1) {
      return this.field16389 * var1.field16389 + this.field16390 * var1.field16390 + this.field16391 * var1.field16391 + this.field16392 * var1.field16392;
   }

   public final void method10217(Class2413 var1) {
      float var4 = (float)(
         1.0
            / Math.sqrt(
               (double)(
                  var1.field16389 * var1.field16389 + var1.field16390 * var1.field16390 + var1.field16391 * var1.field16391 + var1.field16392 * var1.field16392
               )
            )
      );
      this.field16389 = var1.field16389 * var4;
      this.field16390 = var1.field16390 * var4;
      this.field16391 = var1.field16391 * var4;
      this.field16392 = var1.field16392 * var4;
   }

   public final void method10218() {
      float var3 = (float)(
         1.0
            / Math.sqrt(
               (double)(
                  this.field16389 * this.field16389 + this.field16390 * this.field16390 + this.field16391 * this.field16391 + this.field16392 * this.field16392
               )
            )
      );
      this.field16389 *= var3;
      this.field16390 *= var3;
      this.field16391 *= var3;
      this.field16392 *= var3;
   }

   public final float method10219(Class2413 var1) {
      double var4 = (double)(this.method10216(var1) / (this.method10214() * var1.method10214()));
      if (var4 < -1.0) {
         var4 = -1.0;
      }

      if (var4 > 1.0) {
         var4 = 1.0;
      }

      return (float)Math.acos(var4);
   }
}

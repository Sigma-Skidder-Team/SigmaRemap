package mapped;

import java.io.Serializable;

public class Class2401 extends Class2399 implements Serializable {
   private static String[] field16334;
   public static final long field16329 = -4801347926528714435L;

   public Class2401(float var1, float var2) {
      super(var1, var2);
   }

   public Class2401(float[] var1) {
      super(var1);
   }

   public Class2401(Class2401 var1) {
      super(var1);
   }

   public Class2401(Class2365 var1) {
      super(var1);
   }

   public Class2401(Class2364 var1) {
      super(var1);
   }

   public Class2401(Class2399 var1) {
      super(var1);
   }

   public Class2401() {
   }

   public final float method9946(Class2401 var1) {
      float var4 = this.field16330 - var1.field16330;
      float var5 = this.field16331 - var1.field16331;
      return var4 * var4 + var5 * var5;
   }

   public final float method9947(Class2401 var1) {
      float var4 = this.field16330 - var1.field16330;
      float var5 = this.field16331 - var1.field16331;
      return (float)Math.sqrt((double)(var4 * var4 + var5 * var5));
   }

   public final float method9948(Class2401 var1) {
      return Math.abs(this.field16330 - var1.field16330) + Math.abs(this.field16331 - var1.field16331);
   }

   public final float method9949(Class2401 var1) {
      return Math.max(Math.abs(this.field16330 - var1.field16330), Math.abs(this.field16331 - var1.field16331));
   }
}

package mapped;

import java.io.Serializable;

public abstract class Class2399 implements Serializable, Cloneable {
   public static final long field16329 = 9011180388985266884L;
   public float field16330;
   public float field16331;

   public Class2399(float var1, float var2) {
      this.field16330 = var1;
      this.field16331 = var2;
   }

   public Class2399(float[] var1) {
      this.field16330 = var1[0];
      this.field16331 = var1[1];
   }

   public Class2399(Class2399 var1) {
      this.field16330 = var1.field16330;
      this.field16331 = var1.field16331;
   }

   public Class2399(Class2364 var1) {
      this.field16330 = (float)var1.field16203;
      this.field16331 = (float)var1.field16204;
   }

   public Class2399() {
      this.field16330 = 0.0F;
      this.field16331 = 0.0F;
   }

   public final void method9910(float var1, float var2) {
      this.field16330 = var1;
      this.field16331 = var2;
   }

   public final void method9911(float[] var1) {
      this.field16330 = var1[0];
      this.field16331 = var1[1];
   }

   public final void method9912(Class2399 var1) {
      this.field16330 = var1.field16330;
      this.field16331 = var1.field16331;
   }

   public final void method9913(Class2364 var1) {
      this.field16330 = (float)var1.field16203;
      this.field16331 = (float)var1.field16204;
   }

   public final void method9914(float[] var1) {
      var1[0] = this.field16330;
      var1[1] = this.field16331;
   }

   public final void method9915(Class2399 var1, Class2399 var2) {
      this.field16330 = var1.field16330 + var2.field16330;
      this.field16331 = var1.field16331 + var2.field16331;
   }

   public final void method9916(Class2399 var1) {
      this.field16330 = this.field16330 + var1.field16330;
      this.field16331 = this.field16331 + var1.field16331;
   }

   public final void method9917(Class2399 var1, Class2399 var2) {
      this.field16330 = var1.field16330 - var2.field16330;
      this.field16331 = var1.field16331 - var2.field16331;
   }

   public final void method9918(Class2399 var1) {
      this.field16330 = this.field16330 - var1.field16330;
      this.field16331 = this.field16331 - var1.field16331;
   }

   public final void method9919(Class2399 var1) {
      this.field16330 = -var1.field16330;
      this.field16331 = -var1.field16331;
   }

   public final void method9920() {
      this.field16330 = -this.field16330;
      this.field16331 = -this.field16331;
   }

   public final void method9921(float var1, Class2399 var2) {
      this.field16330 = var1 * var2.field16330;
      this.field16331 = var1 * var2.field16331;
   }

   public final void method9922(float var1) {
      this.field16330 *= var1;
      this.field16331 *= var1;
   }

   public final void method9923(float var1, Class2399 var2, Class2399 var3) {
      this.field16330 = var1 * var2.field16330 + var3.field16330;
      this.field16331 = var1 * var2.field16331 + var3.field16331;
   }

   public final void method9924(float var1, Class2399 var2) {
      this.field16330 = var1 * this.field16330 + var2.field16330;
      this.field16331 = var1 * this.field16331 + var2.field16331;
   }

   @Override
   public int hashCode() {
      long var3 = 1L;
      var3 = 31L * var3 + (long)Class9832.method38796(this.field16330);
      var3 = 31L * var3 + (long)Class9832.method38796(this.field16331);
      return (int)(var3 ^ var3 >> 32);
   }

   public boolean equals(Class2399 var1) {
      try {
         return this.field16330 == var1.field16330 && this.field16331 == var1.field16331;
      } catch (NullPointerException var5) {
         return false;
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         Class2399 var4 = (Class2399)var1;
         return this.field16330 == var4.field16330 && this.field16331 == var4.field16331;
      } catch (NullPointerException var5) {
         return false;
      } catch (ClassCastException var6) {
         return false;
      }
   }

   public boolean method9925(Class2399 var1, float var2) {
      float var5 = this.field16330 - var1.field16330;
      if (!Float.isNaN(var5)) {
         if (!((!(var5 < 0.0F) ? var5 : -var5) > var2)) {
            var5 = this.field16331 - var1.field16331;
            return !Float.isNaN(var5) ? !((!(var5 < 0.0F) ? var5 : -var5) > var2) : false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "(" + this.field16330 + ", " + this.field16331 + ")";
   }

   public final void method9926(float var1, float var2, Class2399 var3) {
      if (!(var3.field16330 > var2)) {
         if (!(var3.field16330 < var1)) {
            this.field16330 = var3.field16330;
         } else {
            this.field16330 = var1;
         }
      } else {
         this.field16330 = var2;
      }

      if (!(var3.field16331 > var2)) {
         if (!(var3.field16331 < var1)) {
            this.field16331 = var3.field16331;
         } else {
            this.field16331 = var1;
         }
      } else {
         this.field16331 = var2;
      }
   }

   public final void method9927(float var1, Class2399 var2) {
      if (!(var2.field16330 < var1)) {
         this.field16330 = var2.field16330;
      } else {
         this.field16330 = var1;
      }

      if (!(var2.field16331 < var1)) {
         this.field16331 = var2.field16331;
      } else {
         this.field16331 = var1;
      }
   }

   public final void method9928(float var1, Class2399 var2) {
      if (!(var2.field16330 > var1)) {
         this.field16330 = var2.field16330;
      } else {
         this.field16330 = var1;
      }

      if (!(var2.field16331 > var1)) {
         this.field16331 = var2.field16331;
      } else {
         this.field16331 = var1;
      }
   }

   public final void method9929(Class2399 var1) {
      this.field16330 = Math.abs(var1.field16330);
      this.field16331 = Math.abs(var1.field16331);
   }

   public final void method9930(float var1, float var2) {
      if (!(this.field16330 > var2)) {
         if (this.field16330 < var1) {
            this.field16330 = var1;
         }
      } else {
         this.field16330 = var2;
      }

      if (!(this.field16331 > var2)) {
         if (this.field16331 < var1) {
            this.field16331 = var1;
         }
      } else {
         this.field16331 = var2;
      }
   }

   public final void method9931(float var1) {
      if (this.field16330 < var1) {
         this.field16330 = var1;
      }

      if (this.field16331 < var1) {
         this.field16331 = var1;
      }
   }

   public final void method9932(float var1) {
      if (this.field16330 > var1) {
         this.field16330 = var1;
      }

      if (this.field16331 > var1) {
         this.field16331 = var1;
      }
   }

   public final void method9933() {
      this.field16330 = Math.abs(this.field16330);
      this.field16331 = Math.abs(this.field16331);
   }

   public final void method9934(Class2399 var1, Class2399 var2, float var3) {
      this.field16330 = (1.0F - var3) * var1.field16330 + var3 * var2.field16330;
      this.field16331 = (1.0F - var3) * var1.field16331 + var3 * var2.field16331;
   }

   public final void method9935(Class2399 var1, float var2) {
      this.field16330 = (1.0F - var2) * this.field16330 + var2 * var1.field16330;
      this.field16331 = (1.0F - var2) * this.field16331 + var2 * var1.field16331;
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var4) {
         throw new InternalError();
      }
   }

   public final float method9936() {
      return this.field16330;
   }

   public final void method9937(float var1) {
      this.field16330 = var1;
   }

   public final float method9938() {
      return this.field16331;
   }

   public final void method9939(float var1) {
      this.field16331 = var1;
   }
}

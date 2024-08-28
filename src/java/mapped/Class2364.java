package mapped;

import java.io.Serializable;

public abstract class Class2364 implements Serializable, Cloneable {
   public static final long field16202 = 6205762482756093838L;
   public double field16203;
   public double field16204;

   public Class2364(double var1, double var3) {
      this.field16203 = var1;
      this.field16204 = var3;
   }

   public Class2364(double[] var1) {
      this.field16203 = var1[0];
      this.field16204 = var1[1];
   }

   public Class2364(Class2364 var1) {
      this.field16203 = var1.field16203;
      this.field16204 = var1.field16204;
   }

   public Class2364(Class2399 var1) {
      this.field16203 = (double)var1.field16330;
      this.field16204 = (double)var1.field16331;
   }

   public Class2364() {
      this.field16203 = 0.0;
      this.field16204 = 0.0;
   }

   public final void method9450(double var1, double var3) {
      this.field16203 = var1;
      this.field16204 = var3;
   }

   public final void method9451(double[] var1) {
      this.field16203 = var1[0];
      this.field16204 = var1[1];
   }

   public final void method9452(Class2364 var1) {
      this.field16203 = var1.field16203;
      this.field16204 = var1.field16204;
   }

   public final void method9453(Class2399 var1) {
      this.field16203 = (double)var1.field16330;
      this.field16204 = (double)var1.field16331;
   }

   public final void method9454(double[] var1) {
      var1[0] = this.field16203;
      var1[1] = this.field16204;
   }

   public final void method9455(Class2364 var1, Class2364 var2) {
      this.field16203 = var1.field16203 + var2.field16203;
      this.field16204 = var1.field16204 + var2.field16204;
   }

   public final void method9456(Class2364 var1) {
      this.field16203 = this.field16203 + var1.field16203;
      this.field16204 = this.field16204 + var1.field16204;
   }

   public final void method9457(Class2364 var1, Class2364 var2) {
      this.field16203 = var1.field16203 - var2.field16203;
      this.field16204 = var1.field16204 - var2.field16204;
   }

   public final void method9458(Class2364 var1) {
      this.field16203 = this.field16203 - var1.field16203;
      this.field16204 = this.field16204 - var1.field16204;
   }

   public final void method9459(Class2364 var1) {
      this.field16203 = -var1.field16203;
      this.field16204 = -var1.field16204;
   }

   public final void method9460() {
      this.field16203 = -this.field16203;
      this.field16204 = -this.field16204;
   }

   public final void method9461(double var1, Class2364 var3) {
      this.field16203 = var1 * var3.field16203;
      this.field16204 = var1 * var3.field16204;
   }

   public final void method9462(double var1) {
      this.field16203 *= var1;
      this.field16204 *= var1;
   }

   public final void method9463(double var1, Class2364 var3, Class2364 var4) {
      this.field16203 = var1 * var3.field16203 + var4.field16203;
      this.field16204 = var1 * var3.field16204 + var4.field16204;
   }

   public final void method9464(double var1, Class2364 var3) {
      this.field16203 = var1 * this.field16203 + var3.field16203;
      this.field16204 = var1 * this.field16204 + var3.field16204;
   }

   @Override
   public int hashCode() {
      long var3 = 1L;
      var3 = 31L * var3 + Class9832.method38797(this.field16203);
      var3 = 31L * var3 + Class9832.method38797(this.field16204);
      return (int)(var3 ^ var3 >> 32);
   }

   public boolean equals(Class2364 var1) {
      try {
         return this.field16203 == var1.field16203 && this.field16204 == var1.field16204;
      } catch (NullPointerException var5) {
         return false;
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         Class2364 var4 = (Class2364)var1;
         return this.field16203 == var4.field16203 && this.field16204 == var4.field16204;
      } catch (NullPointerException var5) {
         return false;
      } catch (ClassCastException var6) {
         return false;
      }
   }

   public boolean method9465(Class2364 var1, double var2) {
      double var6 = this.field16203 - var1.field16203;
      if (!Double.isNaN(var6)) {
         if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
            var6 = this.field16204 - var1.field16204;
            return !Double.isNaN(var6) ? !((!(var6 < 0.0) ? var6 : -var6) > var2) : false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "(" + this.field16203 + ", " + this.field16204 + ")";
   }

   public final void method9466(double var1, double var3, Class2364 var5) {
      if (!(var5.field16203 > var3)) {
         if (!(var5.field16203 < var1)) {
            this.field16203 = var5.field16203;
         } else {
            this.field16203 = var1;
         }
      } else {
         this.field16203 = var3;
      }

      if (!(var5.field16204 > var3)) {
         if (!(var5.field16204 < var1)) {
            this.field16204 = var5.field16204;
         } else {
            this.field16204 = var1;
         }
      } else {
         this.field16204 = var3;
      }
   }

   public final void method9467(double var1, Class2364 var3) {
      if (!(var3.field16203 < var1)) {
         this.field16203 = var3.field16203;
      } else {
         this.field16203 = var1;
      }

      if (!(var3.field16204 < var1)) {
         this.field16204 = var3.field16204;
      } else {
         this.field16204 = var1;
      }
   }

   public final void method9468(double var1, Class2364 var3) {
      if (!(var3.field16203 > var1)) {
         this.field16203 = var3.field16203;
      } else {
         this.field16203 = var1;
      }

      if (!(var3.field16204 > var1)) {
         this.field16204 = var3.field16204;
      } else {
         this.field16204 = var1;
      }
   }

   public final void method9469(Class2364 var1) {
      this.field16203 = Math.abs(var1.field16203);
      this.field16204 = Math.abs(var1.field16204);
   }

   public final void method9470(double var1, double var3) {
      if (!(this.field16203 > var3)) {
         if (this.field16203 < var1) {
            this.field16203 = var1;
         }
      } else {
         this.field16203 = var3;
      }

      if (!(this.field16204 > var3)) {
         if (this.field16204 < var1) {
            this.field16204 = var1;
         }
      } else {
         this.field16204 = var3;
      }
   }

   public final void method9471(double var1) {
      if (this.field16203 < var1) {
         this.field16203 = var1;
      }

      if (this.field16204 < var1) {
         this.field16204 = var1;
      }
   }

   public final void method9472(double var1) {
      if (this.field16203 > var1) {
         this.field16203 = var1;
      }

      if (this.field16204 > var1) {
         this.field16204 = var1;
      }
   }

   public final void method9473() {
      this.field16203 = Math.abs(this.field16203);
      this.field16204 = Math.abs(this.field16204);
   }

   public final void method9474(Class2364 var1, Class2364 var2, double var3) {
      this.field16203 = (1.0 - var3) * var1.field16203 + var3 * var2.field16203;
      this.field16204 = (1.0 - var3) * var1.field16204 + var3 * var2.field16204;
   }

   public final void method9475(Class2364 var1, double var2) {
      this.field16203 = (1.0 - var2) * this.field16203 + var2 * var1.field16203;
      this.field16204 = (1.0 - var2) * this.field16204 + var2 * var1.field16204;
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var4) {
         throw new InternalError();
      }
   }

   public final double method9476() {
      return this.field16203;
   }

   public final void method9477(double var1) {
      this.field16203 = var1;
   }

   public final double method9478() {
      return this.field16204;
   }

   public final void method9479(double var1) {
      this.field16204 = var1;
   }
}

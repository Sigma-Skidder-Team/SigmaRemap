package mapped;

import java.io.Serializable;

public abstract class Class2367 implements Serializable, Cloneable {
   public static final long field16209 = 5542096614926168415L;
   public double field16210;
   public double field16211;
   public double field16212;

   public Class2367(double var1, double var3, double var5) {
      this.field16210 = var1;
      this.field16211 = var3;
      this.field16212 = var5;
   }

   public Class2367(double[] var1) {
      this.field16210 = var1[0];
      this.field16211 = var1[1];
      this.field16212 = var1[2];
   }

   public Class2367(Class2367 var1) {
      this.field16210 = var1.field16210;
      this.field16211 = var1.field16211;
      this.field16212 = var1.field16212;
   }

   public Class2367(Class5 var1) {
      this.field16210 = (double)var1.field8;
      this.field16211 = (double)var1.field9;
      this.field16212 = (double)var1.field10;
   }

   public Class2367() {
      this.field16210 = 0.0;
      this.field16211 = 0.0;
      this.field16212 = 0.0;
   }

   public final void method9490(double var1, double var3, double var5) {
      this.field16210 = var1;
      this.field16211 = var3;
      this.field16212 = var5;
   }

   public final void method9491(double[] var1) {
      this.field16210 = var1[0];
      this.field16211 = var1[1];
      this.field16212 = var1[2];
   }

   public final void method9492(Class2367 var1) {
      this.field16210 = var1.field16210;
      this.field16211 = var1.field16211;
      this.field16212 = var1.field16212;
   }

   public final void method9493(Class5 var1) {
      this.field16210 = (double)var1.field8;
      this.field16211 = (double)var1.field9;
      this.field16212 = (double)var1.field10;
   }

   public final void method9494(double[] var1) {
      var1[0] = this.field16210;
      var1[1] = this.field16211;
      var1[2] = this.field16212;
   }

   public final void method9495(Class2367 var1) {
      var1.field16210 = this.field16210;
      var1.field16211 = this.field16211;
      var1.field16212 = this.field16212;
   }

   public final void method9496(Class2367 var1, Class2367 var2) {
      this.field16210 = var1.field16210 + var2.field16210;
      this.field16211 = var1.field16211 + var2.field16211;
      this.field16212 = var1.field16212 + var2.field16212;
   }

   public final void method9497(Class2367 var1) {
      this.field16210 = this.field16210 + var1.field16210;
      this.field16211 = this.field16211 + var1.field16211;
      this.field16212 = this.field16212 + var1.field16212;
   }

   public final void method9498(Class2367 var1, Class2367 var2) {
      this.field16210 = var1.field16210 - var2.field16210;
      this.field16211 = var1.field16211 - var2.field16211;
      this.field16212 = var1.field16212 - var2.field16212;
   }

   public final void method9499(Class2367 var1) {
      this.field16210 = this.field16210 - var1.field16210;
      this.field16211 = this.field16211 - var1.field16211;
      this.field16212 = this.field16212 - var1.field16212;
   }

   public final void method9500(Class2367 var1) {
      this.field16210 = -var1.field16210;
      this.field16211 = -var1.field16211;
      this.field16212 = -var1.field16212;
   }

   public final void method9501() {
      this.field16210 = -this.field16210;
      this.field16211 = -this.field16211;
      this.field16212 = -this.field16212;
   }

   public final void method9502(double var1, Class2367 var3) {
      this.field16210 = var1 * var3.field16210;
      this.field16211 = var1 * var3.field16211;
      this.field16212 = var1 * var3.field16212;
   }

   public final void method9503(double var1) {
      this.field16210 *= var1;
      this.field16211 *= var1;
      this.field16212 *= var1;
   }

   public final void method9504(double var1, Class2367 var3, Class2367 var4) {
      this.field16210 = var1 * var3.field16210 + var4.field16210;
      this.field16211 = var1 * var3.field16211 + var4.field16211;
      this.field16212 = var1 * var3.field16212 + var4.field16212;
   }

   /** @deprecated */
   public final void method9505(double var1, Class5 var3) {
      this.method9506(var1, new Class2369(var3));
   }

   public final void method9506(double var1, Class2367 var3) {
      this.field16210 = var1 * this.field16210 + var3.field16210;
      this.field16211 = var1 * this.field16211 + var3.field16211;
      this.field16212 = var1 * this.field16212 + var3.field16212;
   }

   @Override
   public String toString() {
      return "(" + this.field16210 + ", " + this.field16211 + ", " + this.field16212 + ")";
   }

   @Override
   public int hashCode() {
      long var3 = 1L;
      var3 = 31L * var3 + Class9832.method38797(this.field16210);
      var3 = 31L * var3 + Class9832.method38797(this.field16211);
      var3 = 31L * var3 + Class9832.method38797(this.field16212);
      return (int)(var3 ^ var3 >> 32);
   }

   public boolean equals(Class2367 var1) {
      try {
         return this.field16210 == var1.field16210 && this.field16211 == var1.field16211 && this.field16212 == var1.field16212;
      } catch (NullPointerException var5) {
         return false;
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         Class2367 var4 = (Class2367)var1;
         return this.field16210 == var4.field16210 && this.field16211 == var4.field16211 && this.field16212 == var4.field16212;
      } catch (ClassCastException var5) {
         return false;
      } catch (NullPointerException var6) {
         return false;
      }
   }

   public boolean method9507(Class2367 var1, double var2) {
      double var6 = this.field16210 - var1.field16210;
      if (!Double.isNaN(var6)) {
         if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
            var6 = this.field16211 - var1.field16211;
            if (!Double.isNaN(var6)) {
               if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                  var6 = this.field16212 - var1.field16212;
                  return !Double.isNaN(var6) ? !((!(var6 < 0.0) ? var6 : -var6) > var2) : false;
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   /** @deprecated */
   public final void method9508(float var1, float var2, Class2367 var3) {
      this.method9509((double)var1, (double)var2, var3);
   }

   public final void method9509(double var1, double var3, Class2367 var5) {
      if (!(var5.field16210 > var3)) {
         if (!(var5.field16210 < var1)) {
            this.field16210 = var5.field16210;
         } else {
            this.field16210 = var1;
         }
      } else {
         this.field16210 = var3;
      }

      if (!(var5.field16211 > var3)) {
         if (!(var5.field16211 < var1)) {
            this.field16211 = var5.field16211;
         } else {
            this.field16211 = var1;
         }
      } else {
         this.field16211 = var3;
      }

      if (!(var5.field16212 > var3)) {
         if (!(var5.field16212 < var1)) {
            this.field16212 = var5.field16212;
         } else {
            this.field16212 = var1;
         }
      } else {
         this.field16212 = var3;
      }
   }

   /** @deprecated */
   public final void method9510(float var1, Class2367 var2) {
      this.method9511((double)var1, var2);
   }

   public final void method9511(double var1, Class2367 var3) {
      if (!(var3.field16210 < var1)) {
         this.field16210 = var3.field16210;
      } else {
         this.field16210 = var1;
      }

      if (!(var3.field16211 < var1)) {
         this.field16211 = var3.field16211;
      } else {
         this.field16211 = var1;
      }

      if (!(var3.field16212 < var1)) {
         this.field16212 = var3.field16212;
      } else {
         this.field16212 = var1;
      }
   }

   /** @deprecated */
   public final void method9512(float var1, Class2367 var2) {
      this.method9513((double)var1, var2);
   }

   public final void method9513(double var1, Class2367 var3) {
      if (!(var3.field16210 > var1)) {
         this.field16210 = var3.field16210;
      } else {
         this.field16210 = var1;
      }

      if (!(var3.field16211 > var1)) {
         this.field16211 = var3.field16211;
      } else {
         this.field16211 = var1;
      }

      if (!(var3.field16212 > var1)) {
         this.field16212 = var3.field16212;
      } else {
         this.field16212 = var1;
      }
   }

   public final void method9514(Class2367 var1) {
      this.field16210 = Math.abs(var1.field16210);
      this.field16211 = Math.abs(var1.field16211);
      this.field16212 = Math.abs(var1.field16212);
   }

   /** @deprecated */
   public final void method9515(float var1, float var2) {
      this.method9516((double)var1, (double)var2);
   }

   public final void method9516(double var1, double var3) {
      if (!(this.field16210 > var3)) {
         if (this.field16210 < var1) {
            this.field16210 = var1;
         }
      } else {
         this.field16210 = var3;
      }

      if (!(this.field16211 > var3)) {
         if (this.field16211 < var1) {
            this.field16211 = var1;
         }
      } else {
         this.field16211 = var3;
      }

      if (!(this.field16212 > var3)) {
         if (this.field16212 < var1) {
            this.field16212 = var1;
         }
      } else {
         this.field16212 = var3;
      }
   }

   /** @deprecated */
   public final void method9517(float var1) {
      this.method9518((double)var1);
   }

   public final void method9518(double var1) {
      if (this.field16210 < var1) {
         this.field16210 = var1;
      }

      if (this.field16211 < var1) {
         this.field16211 = var1;
      }

      if (this.field16212 < var1) {
         this.field16212 = var1;
      }
   }

   /** @deprecated */
   public final void method9519(float var1) {
      this.method9520((double)var1);
   }

   public final void method9520(double var1) {
      if (this.field16210 > var1) {
         this.field16210 = var1;
      }

      if (this.field16211 > var1) {
         this.field16211 = var1;
      }

      if (this.field16212 > var1) {
         this.field16212 = var1;
      }
   }

   public final void method9521() {
      this.field16210 = Math.abs(this.field16210);
      this.field16211 = Math.abs(this.field16211);
      this.field16212 = Math.abs(this.field16212);
   }

   /** @deprecated */
   public final void method9522(Class2367 var1, Class2367 var2, float var3) {
      this.method9523(var1, var2, (double)var3);
   }

   public final void method9523(Class2367 var1, Class2367 var2, double var3) {
      this.field16210 = (1.0 - var3) * var1.field16210 + var3 * var2.field16210;
      this.field16211 = (1.0 - var3) * var1.field16211 + var3 * var2.field16211;
      this.field16212 = (1.0 - var3) * var1.field16212 + var3 * var2.field16212;
   }

   /** @deprecated */
   public final void method9524(Class2367 var1, float var2) {
      this.method9525(var1, (double)var2);
   }

   public final void method9525(Class2367 var1, double var2) {
      this.field16210 = (1.0 - var2) * this.field16210 + var2 * var1.field16210;
      this.field16211 = (1.0 - var2) * this.field16211 + var2 * var1.field16211;
      this.field16212 = (1.0 - var2) * this.field16212 + var2 * var1.field16212;
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var4) {
         throw new InternalError();
      }
   }

   public final double method9526() {
      return this.field16210;
   }

   public final void method9527(double var1) {
      this.field16210 = var1;
   }

   public final double method9528() {
      return this.field16211;
   }

   public final void method9529(double var1) {
      this.field16211 = var1;
   }

   public final double method9530() {
      return this.field16212;
   }

   public final void method9531(double var1) {
      this.field16212 = var1;
   }
}

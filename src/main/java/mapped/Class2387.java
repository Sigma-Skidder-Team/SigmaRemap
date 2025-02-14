package mapped;

import java.io.Serializable;

public abstract class Class2387 implements Serializable, Cloneable {
   public static final long field16273 = -4748953690425311052L;
   public double field16274;
   public double field16275;
   public double field16276;
   public double field16277;

   public Class2387(double var1, double var3, double var5, double var7) {
      this.field16274 = var1;
      this.field16275 = var3;
      this.field16276 = var5;
      this.field16277 = var7;
   }

   public Class2387(double[] var1) {
      this.field16274 = var1[0];
      this.field16275 = var1[1];
      this.field16276 = var1[2];
      this.field16277 = var1[3];
   }

   public Class2387(Class2387 var1) {
      this.field16274 = var1.field16274;
      this.field16275 = var1.field16275;
      this.field16276 = var1.field16276;
      this.field16277 = var1.field16277;
   }

   public Class2387(Class2411 var1) {
      this.field16274 = (double)var1.field16389;
      this.field16275 = (double)var1.field16390;
      this.field16276 = (double)var1.field16391;
      this.field16277 = (double)var1.field16392;
   }

   public Class2387() {
      this.field16274 = 0.0;
      this.field16275 = 0.0;
      this.field16276 = 0.0;
      this.field16277 = 0.0;
   }

   public final void method9726(double var1, double var3, double var5, double var7) {
      this.field16274 = var1;
      this.field16275 = var3;
      this.field16276 = var5;
      this.field16277 = var7;
   }

   public final void method9727(double[] var1) {
      this.field16274 = var1[0];
      this.field16275 = var1[1];
      this.field16276 = var1[2];
      this.field16277 = var1[3];
   }

   public final void method9728(Class2387 var1) {
      this.field16274 = var1.field16274;
      this.field16275 = var1.field16275;
      this.field16276 = var1.field16276;
      this.field16277 = var1.field16277;
   }

   public final void method9729(Class2411 var1) {
      this.field16274 = (double)var1.field16389;
      this.field16275 = (double)var1.field16390;
      this.field16276 = (double)var1.field16391;
      this.field16277 = (double)var1.field16392;
   }

   public final void method9730(double[] var1) {
      var1[0] = this.field16274;
      var1[1] = this.field16275;
      var1[2] = this.field16276;
      var1[3] = this.field16277;
   }

   public final void method9731(Class2387 var1) {
      var1.field16274 = this.field16274;
      var1.field16275 = this.field16275;
      var1.field16276 = this.field16276;
      var1.field16277 = this.field16277;
   }

   public final void method9732(Class2387 var1, Class2387 var2) {
      this.field16274 = var1.field16274 + var2.field16274;
      this.field16275 = var1.field16275 + var2.field16275;
      this.field16276 = var1.field16276 + var2.field16276;
      this.field16277 = var1.field16277 + var2.field16277;
   }

   public final void method9733(Class2387 var1) {
      this.field16274 = this.field16274 + var1.field16274;
      this.field16275 = this.field16275 + var1.field16275;
      this.field16276 = this.field16276 + var1.field16276;
      this.field16277 = this.field16277 + var1.field16277;
   }

   public final void method9734(Class2387 var1, Class2387 var2) {
      this.field16274 = var1.field16274 - var2.field16274;
      this.field16275 = var1.field16275 - var2.field16275;
      this.field16276 = var1.field16276 - var2.field16276;
      this.field16277 = var1.field16277 - var2.field16277;
   }

   public final void method9735(Class2387 var1) {
      this.field16274 = this.field16274 - var1.field16274;
      this.field16275 = this.field16275 - var1.field16275;
      this.field16276 = this.field16276 - var1.field16276;
      this.field16277 = this.field16277 - var1.field16277;
   }

   public final void method9736(Class2387 var1) {
      this.field16274 = -var1.field16274;
      this.field16275 = -var1.field16275;
      this.field16276 = -var1.field16276;
      this.field16277 = -var1.field16277;
   }

   public final void method9737() {
      this.field16274 = -this.field16274;
      this.field16275 = -this.field16275;
      this.field16276 = -this.field16276;
      this.field16277 = -this.field16277;
   }

   public final void method9738(double var1, Class2387 var3) {
      this.field16274 = var1 * var3.field16274;
      this.field16275 = var1 * var3.field16275;
      this.field16276 = var1 * var3.field16276;
      this.field16277 = var1 * var3.field16277;
   }

   public final void method9739(double var1) {
      this.field16274 *= var1;
      this.field16275 *= var1;
      this.field16276 *= var1;
      this.field16277 *= var1;
   }

   public final void method9740(double var1, Class2387 var3, Class2387 var4) {
      this.field16274 = var1 * var3.field16274 + var4.field16274;
      this.field16275 = var1 * var3.field16275 + var4.field16275;
      this.field16276 = var1 * var3.field16276 + var4.field16276;
      this.field16277 = var1 * var3.field16277 + var4.field16277;
   }

   /** @deprecated */
   public final void method9741(float var1, Class2387 var2) {
      this.method9742((double)var1, var2);
   }

   public final void method9742(double var1, Class2387 var3) {
      this.field16274 = var1 * this.field16274 + var3.field16274;
      this.field16275 = var1 * this.field16275 + var3.field16275;
      this.field16276 = var1 * this.field16276 + var3.field16276;
      this.field16277 = var1 * this.field16277 + var3.field16277;
   }

   @Override
   public String toString() {
      return "(" + this.field16274 + ", " + this.field16275 + ", " + this.field16276 + ", " + this.field16277 + ")";
   }

   public boolean equals(Class2387 var1) {
      try {
         return this.field16274 == var1.field16274
            && this.field16275 == var1.field16275
            && this.field16276 == var1.field16276
            && this.field16277 == var1.field16277;
      } catch (NullPointerException var5) {
         return false;
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         Class2387 var4 = (Class2387)var1;
         return this.field16274 == var4.field16274
            && this.field16275 == var4.field16275
            && this.field16276 == var4.field16276
            && this.field16277 == var4.field16277;
      } catch (NullPointerException var5) {
         return false;
      } catch (ClassCastException var6) {
         return false;
      }
   }

   public boolean method9743(Class2387 var1, double var2) {
      double var6 = this.field16274 - var1.field16274;
      if (!Double.isNaN(var6)) {
         if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
            var6 = this.field16275 - var1.field16275;
            if (!Double.isNaN(var6)) {
               if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                  var6 = this.field16276 - var1.field16276;
                  if (!Double.isNaN(var6)) {
                     if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                        var6 = this.field16277 - var1.field16277;
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
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      long var3 = 1L;
      var3 = 31L * var3 + Class9832.method38797(this.field16274);
      var3 = 31L * var3 + Class9832.method38797(this.field16275);
      var3 = 31L * var3 + Class9832.method38797(this.field16276);
      var3 = 31L * var3 + Class9832.method38797(this.field16277);
      return (int)(var3 ^ var3 >> 32);
   }

   /** @deprecated */
   public final void method9744(float var1, float var2, Class2387 var3) {
      this.method9745((double)var1, (double)var2, var3);
   }

   public final void method9745(double var1, double var3, Class2387 var5) {
      if (!(var5.field16274 > var3)) {
         if (!(var5.field16274 < var1)) {
            this.field16274 = var5.field16274;
         } else {
            this.field16274 = var1;
         }
      } else {
         this.field16274 = var3;
      }

      if (!(var5.field16275 > var3)) {
         if (!(var5.field16275 < var1)) {
            this.field16275 = var5.field16275;
         } else {
            this.field16275 = var1;
         }
      } else {
         this.field16275 = var3;
      }

      if (!(var5.field16276 > var3)) {
         if (!(var5.field16276 < var1)) {
            this.field16276 = var5.field16276;
         } else {
            this.field16276 = var1;
         }
      } else {
         this.field16276 = var3;
      }

      if (!(var5.field16277 > var3)) {
         if (!(var5.field16277 < var1)) {
            this.field16277 = var5.field16277;
         } else {
            this.field16277 = var1;
         }
      } else {
         this.field16277 = var3;
      }
   }

   /** @deprecated */
   public final void method9746(float var1, Class2387 var2) {
      this.method9747((double)var1, var2);
   }

   public final void method9747(double var1, Class2387 var3) {
      if (!(var3.field16274 < var1)) {
         this.field16274 = var3.field16274;
      } else {
         this.field16274 = var1;
      }

      if (!(var3.field16275 < var1)) {
         this.field16275 = var3.field16275;
      } else {
         this.field16275 = var1;
      }

      if (!(var3.field16276 < var1)) {
         this.field16276 = var3.field16276;
      } else {
         this.field16276 = var1;
      }

      if (!(var3.field16277 < var1)) {
         this.field16277 = var3.field16277;
      } else {
         this.field16277 = var1;
      }
   }

   /** @deprecated */
   public final void method9748(float var1, Class2387 var2) {
      this.method9749((double)var1, var2);
   }

   public final void method9749(double var1, Class2387 var3) {
      if (!(var3.field16274 > var1)) {
         this.field16274 = var3.field16274;
      } else {
         this.field16274 = var1;
      }

      if (!(var3.field16275 > var1)) {
         this.field16275 = var3.field16275;
      } else {
         this.field16275 = var1;
      }

      if (!(var3.field16276 > var1)) {
         this.field16276 = var3.field16276;
      } else {
         this.field16276 = var1;
      }

      if (!(var3.field16277 > var1)) {
         this.field16277 = var3.field16276;
      } else {
         this.field16277 = var1;
      }
   }

   public final void method9750(Class2387 var1) {
      this.field16274 = Math.abs(var1.field16274);
      this.field16275 = Math.abs(var1.field16275);
      this.field16276 = Math.abs(var1.field16276);
      this.field16277 = Math.abs(var1.field16277);
   }

   /** @deprecated */
   public final void method9751(float var1, float var2) {
      this.method9752((double)var1, (double)var2);
   }

   public final void method9752(double var1, double var3) {
      if (!(this.field16274 > var3)) {
         if (this.field16274 < var1) {
            this.field16274 = var1;
         }
      } else {
         this.field16274 = var3;
      }

      if (!(this.field16275 > var3)) {
         if (this.field16275 < var1) {
            this.field16275 = var1;
         }
      } else {
         this.field16275 = var3;
      }

      if (!(this.field16276 > var3)) {
         if (this.field16276 < var1) {
            this.field16276 = var1;
         }
      } else {
         this.field16276 = var3;
      }

      if (!(this.field16277 > var3)) {
         if (this.field16277 < var1) {
            this.field16277 = var1;
         }
      } else {
         this.field16277 = var3;
      }
   }

   /** @deprecated */
   public final void method9753(float var1) {
      this.method9754((double)var1);
   }

   public final void method9754(double var1) {
      if (this.field16274 < var1) {
         this.field16274 = var1;
      }

      if (this.field16275 < var1) {
         this.field16275 = var1;
      }

      if (this.field16276 < var1) {
         this.field16276 = var1;
      }

      if (this.field16277 < var1) {
         this.field16277 = var1;
      }
   }

   /** @deprecated */
   public final void method9755(float var1) {
      this.method9756((double)var1);
   }

   public final void method9756(double var1) {
      if (this.field16274 > var1) {
         this.field16274 = var1;
      }

      if (this.field16275 > var1) {
         this.field16275 = var1;
      }

      if (this.field16276 > var1) {
         this.field16276 = var1;
      }

      if (this.field16277 > var1) {
         this.field16277 = var1;
      }
   }

   public final void method9757() {
      this.field16274 = Math.abs(this.field16274);
      this.field16275 = Math.abs(this.field16275);
      this.field16276 = Math.abs(this.field16276);
      this.field16277 = Math.abs(this.field16277);
   }

   /** @deprecated */
   public void method9758(Class2387 var1, Class2387 var2, float var3) {
      this.method9759(var1, var2, (double)var3);
   }

   public void method9759(Class2387 var1, Class2387 var2, double var3) {
      this.field16274 = (1.0 - var3) * var1.field16274 + var3 * var2.field16274;
      this.field16275 = (1.0 - var3) * var1.field16275 + var3 * var2.field16275;
      this.field16276 = (1.0 - var3) * var1.field16276 + var3 * var2.field16276;
      this.field16277 = (1.0 - var3) * var1.field16277 + var3 * var2.field16277;
   }

   /** @deprecated */
   public void method9760(Class2387 var1, float var2) {
      this.method9761(var1, (double)var2);
   }

   public void method9761(Class2387 var1, double var2) {
      this.field16274 = (1.0 - var2) * this.field16274 + var2 * var1.field16274;
      this.field16275 = (1.0 - var2) * this.field16275 + var2 * var1.field16275;
      this.field16276 = (1.0 - var2) * this.field16276 + var2 * var1.field16276;
      this.field16277 = (1.0 - var2) * this.field16277 + var2 * var1.field16277;
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var4) {
         throw new InternalError();
      }
   }

   public final double method9762() {
      return this.field16274;
   }

   public final void method9763(double var1) {
      this.field16274 = var1;
   }

   public final double method9764() {
      return this.field16275;
   }

   public final void method9765(double var1) {
      this.field16275 = var1;
   }

   public final double method9766() {
      return this.field16276;
   }

   public final void method9767(double var1) {
      this.field16276 = var1;
   }

   public final double method9768() {
      return this.field16277;
   }

   public final void method9769(double var1) {
      this.field16277 = var1;
   }
}

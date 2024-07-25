package remapped;

import java.io.Serializable;

public abstract class class_3519 implements Serializable, Cloneable {
   public static final long field_17243 = 5542096614926168415L;
   public double field_17244;
   public double field_17242;
   public double field_17241;

   public class_3519(double var1, double var3, double var5) {
      this.field_17244 = var1;
      this.field_17242 = var3;
      this.field_17241 = var5;
   }

   public class_3519(double[] var1) {
      this.field_17244 = var1[0];
      this.field_17242 = var1[1];
      this.field_17241 = var1[2];
   }

   public class_3519(class_3519 var1) {
      this.field_17244 = var1.field_17244;
      this.field_17242 = var1.field_17242;
      this.field_17241 = var1.field_17241;
   }

   public class_3519(class_835 var1) {
      this.field_17244 = (double)var1.field_4390;
      this.field_17242 = (double)var1.field_4391;
      this.field_17241 = (double)var1.field_4393;
   }

   public class_3519() {
      this.field_17244 = 0.0;
      this.field_17242 = 0.0;
      this.field_17241 = 0.0;
   }

   public final void method_16230(double var1, double var3, double var5) {
      this.field_17244 = var1;
      this.field_17242 = var3;
      this.field_17241 = var5;
   }

   public final void method_16233(double[] var1) {
      this.field_17244 = var1[0];
      this.field_17242 = var1[1];
      this.field_17241 = var1[2];
   }

   public final void method_16232(class_3519 var1) {
      this.field_17244 = var1.field_17244;
      this.field_17242 = var1.field_17242;
      this.field_17241 = var1.field_17241;
   }

   public final void method_16231(class_835 var1) {
      this.field_17244 = (double)var1.field_4390;
      this.field_17242 = (double)var1.field_4391;
      this.field_17241 = (double)var1.field_4393;
   }

   public final void method_16236(double[] var1) {
      var1[0] = this.field_17244;
      var1[1] = this.field_17242;
      var1[2] = this.field_17241;
   }

   public final void method_16235(class_3519 var1) {
      var1.field_17244 = this.field_17244;
      var1.field_17242 = this.field_17242;
      var1.field_17241 = this.field_17241;
   }

   public final void method_16229(class_3519 var1, class_3519 var2) {
      this.field_17244 = var1.field_17244 + var2.field_17244;
      this.field_17242 = var1.field_17242 + var2.field_17242;
      this.field_17241 = var1.field_17241 + var2.field_17241;
   }

   public final void method_16228(class_3519 var1) {
      this.field_17244 = this.field_17244 + var1.field_17244;
      this.field_17242 = this.field_17242 + var1.field_17242;
      this.field_17241 = this.field_17241 + var1.field_17241;
   }

   public final void method_16240(class_3519 var1, class_3519 var2) {
      this.field_17244 = var1.field_17244 - var2.field_17244;
      this.field_17242 = var1.field_17242 - var2.field_17242;
      this.field_17241 = var1.field_17241 - var2.field_17241;
   }

   public final void method_16239(class_3519 var1) {
      this.field_17244 = this.field_17244 - var1.field_17244;
      this.field_17242 = this.field_17242 - var1.field_17242;
      this.field_17241 = this.field_17241 - var1.field_17241;
   }

   public final void method_16238(class_3519 var1) {
      this.field_17244 = -var1.field_17244;
      this.field_17242 = -var1.field_17242;
      this.field_17241 = -var1.field_17241;
   }

   public final void method_16237() {
      this.field_17244 = -this.field_17244;
      this.field_17242 = -this.field_17242;
      this.field_17241 = -this.field_17241;
   }

   public final void method_16212(double var1, class_3519 var3) {
      this.field_17244 = var1 * var3.field_17244;
      this.field_17242 = var1 * var3.field_17242;
      this.field_17241 = var1 * var3.field_17241;
   }

   public final void method_16211(double var1) {
      this.field_17244 *= var1;
      this.field_17242 *= var1;
      this.field_17241 *= var1;
   }

   public final void method_16227(double var1, class_3519 var3, class_3519 var4) {
      this.field_17244 = var1 * var3.field_17244 + var4.field_17244;
      this.field_17242 = var1 * var3.field_17242 + var4.field_17242;
      this.field_17241 = var1 * var3.field_17241 + var4.field_17241;
   }

   /** @deprecated */
   public final void method_16225(double var1, class_835 var3) {
      this.method_16226(var1, new class_529(var3));
   }

   public final void method_16226(double var1, class_3519 var3) {
      this.field_17244 = var1 * this.field_17244 + var3.field_17244;
      this.field_17242 = var1 * this.field_17242 + var3.field_17242;
      this.field_17241 = var1 * this.field_17241 + var3.field_17241;
   }

   @Override
   public String toString() {
      return "(" + this.field_17244 + ", " + this.field_17242 + ", " + this.field_17241 + ")";
   }

   @Override
   public int hashCode() {
      long var3 = 1L;
      var3 = 31L * var3 + class_9845.method_45350(this.field_17244);
      var3 = 31L * var3 + class_9845.method_45350(this.field_17242);
      var3 = 31L * var3 + class_9845.method_45350(this.field_17241);
      return (int)(var3 ^ var3 >> 32);
   }

   public boolean equals(class_3519 var1) {
      try {
         return this.field_17244 == var1.field_17244 && this.field_17242 == var1.field_17242 && this.field_17241 == var1.field_17241;
      } catch (NullPointerException var5) {
         return false;
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         class_3519 var4 = (class_3519)var1;
         return this.field_17244 == var4.field_17244 && this.field_17242 == var4.field_17242 && this.field_17241 == var4.field_17241;
      } catch (ClassCastException var5) {
         return false;
      } catch (NullPointerException var6) {
         return false;
      }
   }

   public boolean method_16243(class_3519 var1, double var2) {
      double var6 = this.field_17244 - var1.field_17244;
      if (!Double.isNaN(var6)) {
         if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
            var6 = this.field_17242 - var1.field_17242;
            if (!Double.isNaN(var6)) {
               if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                  var6 = this.field_17241 - var1.field_17241;
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
   public final void method_16216(float var1, float var2, class_3519 var3) {
      this.method_16214((double)var1, (double)var2, var3);
   }

   public final void method_16214(double var1, double var3, class_3519 var5) {
      if (!(var5.field_17244 > var3)) {
         if (!(var5.field_17244 < var1)) {
            this.field_17244 = var5.field_17244;
         } else {
            this.field_17244 = var1;
         }
      } else {
         this.field_17244 = var3;
      }

      if (!(var5.field_17242 > var3)) {
         if (!(var5.field_17242 < var1)) {
            this.field_17242 = var5.field_17242;
         } else {
            this.field_17242 = var1;
         }
      } else {
         this.field_17242 = var3;
      }

      if (!(var5.field_17241 > var3)) {
         if (!(var5.field_17241 < var1)) {
            this.field_17241 = var5.field_17241;
         } else {
            this.field_17241 = var1;
         }
      } else {
         this.field_17241 = var3;
      }
   }

   /** @deprecated */
   public final void method_16223(float var1, class_3519 var2) {
      this.method_16221((double)var1, var2);
   }

   public final void method_16221(double var1, class_3519 var3) {
      if (!(var3.field_17244 < var1)) {
         this.field_17244 = var3.field_17244;
      } else {
         this.field_17244 = var1;
      }

      if (!(var3.field_17242 < var1)) {
         this.field_17242 = var3.field_17242;
      } else {
         this.field_17242 = var1;
      }

      if (!(var3.field_17241 < var1)) {
         this.field_17241 = var3.field_17241;
      } else {
         this.field_17241 = var1;
      }
   }

   /** @deprecated */
   public final void method_16210(float var1, class_3519 var2) {
      this.method_16208((double)var1, var2);
   }

   public final void method_16208(double var1, class_3519 var3) {
      if (!(var3.field_17244 > var1)) {
         this.field_17244 = var3.field_17244;
      } else {
         this.field_17244 = var1;
      }

      if (!(var3.field_17242 > var1)) {
         this.field_17242 = var3.field_17242;
      } else {
         this.field_17242 = var1;
      }

      if (!(var3.field_17241 > var1)) {
         this.field_17241 = var3.field_17241;
      } else {
         this.field_17241 = var1;
      }
   }

   public final void method_16218(class_3519 var1) {
      this.field_17244 = Math.abs(var1.field_17244);
      this.field_17242 = Math.abs(var1.field_17242);
      this.field_17241 = Math.abs(var1.field_17241);
   }

   /** @deprecated */
   public final void method_16215(float var1, float var2) {
      this.method_16213((double)var1, (double)var2);
   }

   public final void method_16213(double var1, double var3) {
      if (!(this.field_17244 > var3)) {
         if (this.field_17244 < var1) {
            this.field_17244 = var1;
         }
      } else {
         this.field_17244 = var3;
      }

      if (!(this.field_17242 > var3)) {
         if (this.field_17242 < var1) {
            this.field_17242 = var1;
         }
      } else {
         this.field_17242 = var3;
      }

      if (!(this.field_17241 > var3)) {
         if (this.field_17241 < var1) {
            this.field_17241 = var1;
         }
      } else {
         this.field_17241 = var3;
      }
   }

   /** @deprecated */
   public final void method_16222(float var1) {
      this.method_16220((double)var1);
   }

   public final void method_16220(double var1) {
      if (this.field_17244 < var1) {
         this.field_17244 = var1;
      }

      if (this.field_17242 < var1) {
         this.field_17242 = var1;
      }

      if (this.field_17241 < var1) {
         this.field_17241 = var1;
      }
   }

   /** @deprecated */
   public final void method_16209(float var1) {
      this.method_16207((double)var1);
   }

   public final void method_16207(double var1) {
      if (this.field_17244 > var1) {
         this.field_17244 = var1;
      }

      if (this.field_17242 > var1) {
         this.field_17242 = var1;
      }

      if (this.field_17241 > var1) {
         this.field_17241 = var1;
      }
   }

   public final void method_16217() {
      this.field_17244 = Math.abs(this.field_17244);
      this.field_17242 = Math.abs(this.field_17242);
      this.field_17241 = Math.abs(this.field_17241);
   }

   /** @deprecated */
   public final void method_16205(class_3519 var1, class_3519 var2, float var3) {
      this.method_16204(var1, var2, (double)var3);
   }

   public final void method_16204(class_3519 var1, class_3519 var2, double var3) {
      this.field_17244 = (1.0 - var3) * var1.field_17244 + var3 * var2.field_17244;
      this.field_17242 = (1.0 - var3) * var1.field_17242 + var3 * var2.field_17242;
      this.field_17241 = (1.0 - var3) * var1.field_17241 + var3 * var2.field_17241;
   }

   /** @deprecated */
   public final void method_16203(class_3519 var1, float var2) {
      this.method_16202(var1, (double)var2);
   }

   public final void method_16202(class_3519 var1, double var2) {
      this.field_17244 = (1.0 - var2) * this.field_17244 + var2 * var1.field_17244;
      this.field_17242 = (1.0 - var2) * this.field_17242 + var2 * var1.field_17242;
      this.field_17241 = (1.0 - var2) * this.field_17241 + var2 * var1.field_17241;
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var4) {
         throw new InternalError();
      }
   }

   public final double method_16234() {
      return this.field_17244;
   }

   public final void method_16241(double var1) {
      this.field_17244 = var1;
   }

   public final double method_16224() {
      return this.field_17242;
   }

   public final void method_16206(double var1) {
      this.field_17242 = var1;
   }

   public final double method_16242() {
      return this.field_17241;
   }

   public final void method_16219(double var1) {
      this.field_17241 = var1;
   }
}

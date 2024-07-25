package remapped;

import java.io.Serializable;

public abstract class class_5230 implements Serializable, Cloneable {
   public static final long field_26826 = -4748953690425311052L;
   public double field_26829;
   public double field_26830;
   public double field_26828;
   public double field_26827;

   public class_5230(double var1, double var3, double var5, double var7) {
      this.field_26829 = var1;
      this.field_26830 = var3;
      this.field_26828 = var5;
      this.field_26827 = var7;
   }

   public class_5230(double[] var1) {
      this.field_26829 = var1[0];
      this.field_26830 = var1[1];
      this.field_26828 = var1[2];
      this.field_26827 = var1[3];
   }

   public class_5230(class_5230 var1) {
      this.field_26829 = var1.field_26829;
      this.field_26830 = var1.field_26830;
      this.field_26828 = var1.field_26828;
      this.field_26827 = var1.field_26827;
   }

   public class_5230(class_1752 var1) {
      this.field_26829 = (double)var1.field_9014;
      this.field_26830 = (double)var1.field_9016;
      this.field_26828 = (double)var1.field_9013;
      this.field_26827 = (double)var1.field_9012;
   }

   public class_5230() {
      this.field_26829 = 0.0;
      this.field_26830 = 0.0;
      this.field_26828 = 0.0;
      this.field_26827 = 0.0;
   }

   public final void method_23931(double var1, double var3, double var5, double var7) {
      this.field_26829 = var1;
      this.field_26830 = var3;
      this.field_26828 = var5;
      this.field_26827 = var7;
   }

   public final void method_23934(double[] var1) {
      this.field_26829 = var1[0];
      this.field_26830 = var1[1];
      this.field_26828 = var1[2];
      this.field_26827 = var1[3];
   }

   public final void method_23933(class_5230 var1) {
      this.field_26829 = var1.field_26829;
      this.field_26830 = var1.field_26830;
      this.field_26828 = var1.field_26828;
      this.field_26827 = var1.field_26827;
   }

   public final void method_23932(class_1752 var1) {
      this.field_26829 = (double)var1.field_9014;
      this.field_26830 = (double)var1.field_9016;
      this.field_26828 = (double)var1.field_9013;
      this.field_26827 = (double)var1.field_9012;
   }

   public final void method_23970(double[] var1) {
      var1[0] = this.field_26829;
      var1[1] = this.field_26830;
      var1[2] = this.field_26828;
      var1[3] = this.field_26827;
   }

   public final void method_23969(class_5230 var1) {
      var1.field_26829 = this.field_26829;
      var1.field_26830 = this.field_26830;
      var1.field_26828 = this.field_26828;
      var1.field_26827 = this.field_26827;
   }

   public final void method_23966(class_5230 var1, class_5230 var2) {
      this.field_26829 = var1.field_26829 + var2.field_26829;
      this.field_26830 = var1.field_26830 + var2.field_26830;
      this.field_26828 = var1.field_26828 + var2.field_26828;
      this.field_26827 = var1.field_26827 + var2.field_26827;
   }

   public final void method_23965(class_5230 var1) {
      this.field_26829 = this.field_26829 + var1.field_26829;
      this.field_26830 = this.field_26830 + var1.field_26830;
      this.field_26828 = this.field_26828 + var1.field_26828;
      this.field_26827 = this.field_26827 + var1.field_26827;
   }

   public final void method_23959(class_5230 var1, class_5230 var2) {
      this.field_26829 = var1.field_26829 - var2.field_26829;
      this.field_26830 = var1.field_26830 - var2.field_26830;
      this.field_26828 = var1.field_26828 - var2.field_26828;
      this.field_26827 = var1.field_26827 - var2.field_26827;
   }

   public final void method_23958(class_5230 var1) {
      this.field_26829 = this.field_26829 - var1.field_26829;
      this.field_26830 = this.field_26830 - var1.field_26830;
      this.field_26828 = this.field_26828 - var1.field_26828;
      this.field_26827 = this.field_26827 - var1.field_26827;
   }

   public final void method_23968(class_5230 var1) {
      this.field_26829 = -var1.field_26829;
      this.field_26830 = -var1.field_26830;
      this.field_26828 = -var1.field_26828;
      this.field_26827 = -var1.field_26827;
   }

   public final void method_23967() {
      this.field_26829 = -this.field_26829;
      this.field_26830 = -this.field_26830;
      this.field_26828 = -this.field_26828;
      this.field_26827 = -this.field_26827;
   }

   public final void method_23943(double var1, class_5230 var3) {
      this.field_26829 = var1 * var3.field_26829;
      this.field_26830 = var1 * var3.field_26830;
      this.field_26828 = var1 * var3.field_26828;
      this.field_26827 = var1 * var3.field_26827;
   }

   public final void method_23942(double var1) {
      this.field_26829 *= var1;
      this.field_26830 *= var1;
      this.field_26828 *= var1;
      this.field_26827 *= var1;
   }

   public final void method_23949(double var1, class_5230 var3, class_5230 var4) {
      this.field_26829 = var1 * var3.field_26829 + var4.field_26829;
      this.field_26830 = var1 * var3.field_26830 + var4.field_26830;
      this.field_26828 = var1 * var3.field_26828 + var4.field_26828;
      this.field_26827 = var1 * var3.field_26827 + var4.field_26827;
   }

   /** @deprecated */
   public final void method_23950(float var1, class_5230 var2) {
      this.method_23948((double)var1, var2);
   }

   public final void method_23948(double var1, class_5230 var3) {
      this.field_26829 = var1 * this.field_26829 + var3.field_26829;
      this.field_26830 = var1 * this.field_26830 + var3.field_26830;
      this.field_26828 = var1 * this.field_26828 + var3.field_26828;
      this.field_26827 = var1 * this.field_26827 + var3.field_26827;
   }

   @Override
   public String toString() {
      return "(" + this.field_26829 + ", " + this.field_26830 + ", " + this.field_26828 + ", " + this.field_26827 + ")";
   }

   public boolean equals(class_5230 var1) {
      try {
         return this.field_26829 == var1.field_26829
            && this.field_26830 == var1.field_26830
            && this.field_26828 == var1.field_26828
            && this.field_26827 == var1.field_26827;
      } catch (NullPointerException var5) {
         return false;
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         class_5230 var4 = (class_5230)var1;
         return this.field_26829 == var4.field_26829
            && this.field_26830 == var4.field_26830
            && this.field_26828 == var4.field_26828
            && this.field_26827 == var4.field_26827;
      } catch (NullPointerException var5) {
         return false;
      } catch (ClassCastException var6) {
         return false;
      }
   }

   public boolean method_23941(class_5230 var1, double var2) {
      double var6 = this.field_26829 - var1.field_26829;
      if (!Double.isNaN(var6)) {
         if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
            var6 = this.field_26830 - var1.field_26830;
            if (!Double.isNaN(var6)) {
               if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                  var6 = this.field_26828 - var1.field_26828;
                  if (!Double.isNaN(var6)) {
                     if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                        var6 = this.field_26827 - var1.field_26827;
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
      var3 = 31L * var3 + class_9845.method_45350(this.field_26829);
      var3 = 31L * var3 + class_9845.method_45350(this.field_26830);
      var3 = 31L * var3 + class_9845.method_45350(this.field_26828);
      var3 = 31L * var3 + class_9845.method_45350(this.field_26827);
      return (int)(var3 ^ var3 >> 32);
   }

   /** @deprecated */
   public final void method_23947(float var1, float var2, class_5230 var3) {
      this.method_23945((double)var1, (double)var2, var3);
   }

   public final void method_23945(double var1, double var3, class_5230 var5) {
      if (!(var5.field_26829 > var3)) {
         if (!(var5.field_26829 < var1)) {
            this.field_26829 = var5.field_26829;
         } else {
            this.field_26829 = var1;
         }
      } else {
         this.field_26829 = var3;
      }

      if (!(var5.field_26830 > var3)) {
         if (!(var5.field_26830 < var1)) {
            this.field_26830 = var5.field_26830;
         } else {
            this.field_26830 = var1;
         }
      } else {
         this.field_26830 = var3;
      }

      if (!(var5.field_26828 > var3)) {
         if (!(var5.field_26828 < var1)) {
            this.field_26828 = var5.field_26828;
         } else {
            this.field_26828 = var1;
         }
      } else {
         this.field_26828 = var3;
      }

      if (!(var5.field_26827 > var3)) {
         if (!(var5.field_26827 < var1)) {
            this.field_26827 = var5.field_26827;
         } else {
            this.field_26827 = var1;
         }
      } else {
         this.field_26827 = var3;
      }
   }

   /** @deprecated */
   public final void method_23955(float var1, class_5230 var2) {
      this.method_23953((double)var1, var2);
   }

   public final void method_23953(double var1, class_5230 var3) {
      if (!(var3.field_26829 < var1)) {
         this.field_26829 = var3.field_26829;
      } else {
         this.field_26829 = var1;
      }

      if (!(var3.field_26830 < var1)) {
         this.field_26830 = var3.field_26830;
      } else {
         this.field_26830 = var1;
      }

      if (!(var3.field_26828 < var1)) {
         this.field_26828 = var3.field_26828;
      } else {
         this.field_26828 = var1;
      }

      if (!(var3.field_26827 < var1)) {
         this.field_26827 = var3.field_26827;
      } else {
         this.field_26827 = var1;
      }
   }

   /** @deprecated */
   public final void method_23963(float var1, class_5230 var2) {
      this.method_23961((double)var1, var2);
   }

   public final void method_23961(double var1, class_5230 var3) {
      if (!(var3.field_26829 > var1)) {
         this.field_26829 = var3.field_26829;
      } else {
         this.field_26829 = var1;
      }

      if (!(var3.field_26830 > var1)) {
         this.field_26830 = var3.field_26830;
      } else {
         this.field_26830 = var1;
      }

      if (!(var3.field_26828 > var1)) {
         this.field_26828 = var3.field_26828;
      } else {
         this.field_26828 = var1;
      }

      if (!(var3.field_26827 > var1)) {
         this.field_26827 = var3.field_26828;
      } else {
         this.field_26827 = var1;
      }
   }

   public final void method_23930(class_5230 var1) {
      this.field_26829 = Math.abs(var1.field_26829);
      this.field_26830 = Math.abs(var1.field_26830);
      this.field_26828 = Math.abs(var1.field_26828);
      this.field_26827 = Math.abs(var1.field_26827);
   }

   /** @deprecated */
   public final void method_23946(float var1, float var2) {
      this.method_23944((double)var1, (double)var2);
   }

   public final void method_23944(double var1, double var3) {
      if (!(this.field_26829 > var3)) {
         if (this.field_26829 < var1) {
            this.field_26829 = var1;
         }
      } else {
         this.field_26829 = var3;
      }

      if (!(this.field_26830 > var3)) {
         if (this.field_26830 < var1) {
            this.field_26830 = var1;
         }
      } else {
         this.field_26830 = var3;
      }

      if (!(this.field_26828 > var3)) {
         if (this.field_26828 < var1) {
            this.field_26828 = var1;
         }
      } else {
         this.field_26828 = var3;
      }

      if (!(this.field_26827 > var3)) {
         if (this.field_26827 < var1) {
            this.field_26827 = var1;
         }
      } else {
         this.field_26827 = var3;
      }
   }

   /** @deprecated */
   public final void method_23954(float var1) {
      this.method_23952((double)var1);
   }

   public final void method_23952(double var1) {
      if (this.field_26829 < var1) {
         this.field_26829 = var1;
      }

      if (this.field_26830 < var1) {
         this.field_26830 = var1;
      }

      if (this.field_26828 < var1) {
         this.field_26828 = var1;
      }

      if (this.field_26827 < var1) {
         this.field_26827 = var1;
      }
   }

   /** @deprecated */
   public final void method_23962(float var1) {
      this.method_23960((double)var1);
   }

   public final void method_23960(double var1) {
      if (this.field_26829 > var1) {
         this.field_26829 = var1;
      }

      if (this.field_26830 > var1) {
         this.field_26830 = var1;
      }

      if (this.field_26828 > var1) {
         this.field_26828 = var1;
      }

      if (this.field_26827 > var1) {
         this.field_26827 = var1;
      }
   }

   public final void method_23929() {
      this.field_26829 = Math.abs(this.field_26829);
      this.field_26830 = Math.abs(this.field_26830);
      this.field_26828 = Math.abs(this.field_26828);
      this.field_26827 = Math.abs(this.field_26827);
   }

   /** @deprecated */
   public void method_23939(class_5230 var1, class_5230 var2, float var3) {
      this.method_23938(var1, var2, (double)var3);
   }

   public void method_23938(class_5230 var1, class_5230 var2, double var3) {
      this.field_26829 = (1.0 - var3) * var1.field_26829 + var3 * var2.field_26829;
      this.field_26830 = (1.0 - var3) * var1.field_26830 + var3 * var2.field_26830;
      this.field_26828 = (1.0 - var3) * var1.field_26828 + var3 * var2.field_26828;
      this.field_26827 = (1.0 - var3) * var1.field_26827 + var3 * var2.field_26827;
   }

   /** @deprecated */
   public void method_23937(class_5230 var1, float var2) {
      this.method_23936(var1, (double)var2);
   }

   public void method_23936(class_5230 var1, double var2) {
      this.field_26829 = (1.0 - var2) * this.field_26829 + var2 * var1.field_26829;
      this.field_26830 = (1.0 - var2) * this.field_26830 + var2 * var1.field_26830;
      this.field_26828 = (1.0 - var2) * this.field_26828 + var2 * var1.field_26828;
      this.field_26827 = (1.0 - var2) * this.field_26827 + var2 * var1.field_26827;
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var4) {
         throw new InternalError();
      }
   }

   public final double method_23926() {
      return this.field_26829;
   }

   public final void method_23935(double var1) {
      this.field_26829 = var1;
   }

   public final double method_23940() {
      return this.field_26830;
   }

   public final void method_23957(double var1) {
      this.field_26830 = var1;
   }

   public final double method_23964() {
      return this.field_26828;
   }

   public final void method_23928(double var1) {
      this.field_26828 = var1;
   }

   public final double method_23927() {
      return this.field_26827;
   }

   public final void method_23951(double var1) {
      this.field_26827 = var1;
   }
}

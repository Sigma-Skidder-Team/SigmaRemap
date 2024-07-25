package remapped;

import java.io.Serializable;

public abstract class class_1752 implements Serializable, Cloneable {
   public static final long field_9015 = 7068460319248845763L;
   public float field_9014;
   public float field_9016;
   public float field_9013;
   public float field_9012;

   public class_1752(float var1, float var2, float var3, float var4) {
      this.field_9014 = var1;
      this.field_9016 = var2;
      this.field_9013 = var3;
      this.field_9012 = var4;
   }

   public class_1752(float[] var1) {
      this.field_9014 = var1[0];
      this.field_9016 = var1[1];
      this.field_9013 = var1[2];
      this.field_9012 = var1[3];
   }

   public class_1752(class_1752 var1) {
      this.field_9014 = var1.field_9014;
      this.field_9016 = var1.field_9016;
      this.field_9013 = var1.field_9013;
      this.field_9012 = var1.field_9012;
   }

   public class_1752(class_5230 var1) {
      this.field_9014 = (float)var1.field_26829;
      this.field_9016 = (float)var1.field_26830;
      this.field_9013 = (float)var1.field_26828;
      this.field_9012 = (float)var1.field_26827;
   }

   public class_1752() {
      this.field_9014 = 0.0F;
      this.field_9016 = 0.0F;
      this.field_9013 = 0.0F;
      this.field_9012 = 0.0F;
   }

   public final void method_7821(float var1, float var2, float var3, float var4) {
      this.field_9014 = var1;
      this.field_9016 = var2;
      this.field_9013 = var3;
      this.field_9012 = var4;
   }

   public final void method_7824(float[] var1) {
      this.field_9014 = var1[0];
      this.field_9016 = var1[1];
      this.field_9013 = var1[2];
      this.field_9012 = var1[3];
   }

   public final void method_7822(class_1752 var1) {
      this.field_9014 = var1.field_9014;
      this.field_9016 = var1.field_9016;
      this.field_9013 = var1.field_9013;
      this.field_9012 = var1.field_9012;
   }

   public final void method_7823(class_5230 var1) {
      this.field_9014 = (float)var1.field_26829;
      this.field_9016 = (float)var1.field_26830;
      this.field_9013 = (float)var1.field_26828;
      this.field_9012 = (float)var1.field_26827;
   }

   public final void method_7843(float[] var1) {
      var1[0] = this.field_9014;
      var1[1] = this.field_9016;
      var1[2] = this.field_9013;
      var1[3] = this.field_9012;
   }

   public final void method_7842(class_1752 var1) {
      var1.field_9014 = this.field_9014;
      var1.field_9016 = this.field_9016;
      var1.field_9013 = this.field_9013;
      var1.field_9012 = this.field_9012;
   }

   public final void method_7833(class_1752 var1, class_1752 var2) {
      this.field_9014 = var1.field_9014 + var2.field_9014;
      this.field_9016 = var1.field_9016 + var2.field_9016;
      this.field_9013 = var1.field_9013 + var2.field_9013;
      this.field_9012 = var1.field_9012 + var2.field_9012;
   }

   public final void method_7832(class_1752 var1) {
      this.field_9014 = this.field_9014 + var1.field_9014;
      this.field_9016 = this.field_9016 + var1.field_9016;
      this.field_9013 = this.field_9013 + var1.field_9013;
      this.field_9012 = this.field_9012 + var1.field_9012;
   }

   public final void method_7841(class_1752 var1, class_1752 var2) {
      this.field_9014 = var1.field_9014 - var2.field_9014;
      this.field_9016 = var1.field_9016 - var2.field_9016;
      this.field_9013 = var1.field_9013 - var2.field_9013;
      this.field_9012 = var1.field_9012 - var2.field_9012;
   }

   public final void method_7840(class_1752 var1) {
      this.field_9014 = this.field_9014 - var1.field_9014;
      this.field_9016 = this.field_9016 - var1.field_9016;
      this.field_9013 = this.field_9013 - var1.field_9013;
      this.field_9012 = this.field_9012 - var1.field_9012;
   }

   public final void method_7818(class_1752 var1) {
      this.field_9014 = -var1.field_9014;
      this.field_9016 = -var1.field_9016;
      this.field_9013 = -var1.field_9013;
      this.field_9012 = -var1.field_9012;
   }

   public final void method_7817() {
      this.field_9014 = -this.field_9014;
      this.field_9016 = -this.field_9016;
      this.field_9013 = -this.field_9013;
      this.field_9012 = -this.field_9012;
   }

   public final void method_7836(float var1, class_1752 var2) {
      this.field_9014 = var1 * var2.field_9014;
      this.field_9016 = var1 * var2.field_9016;
      this.field_9013 = var1 * var2.field_9013;
      this.field_9012 = var1 * var2.field_9012;
   }

   public final void method_7835(float var1) {
      this.field_9014 *= var1;
      this.field_9016 *= var1;
      this.field_9013 *= var1;
      this.field_9012 *= var1;
   }

   public final void method_7812(float var1, class_1752 var2, class_1752 var3) {
      this.field_9014 = var1 * var2.field_9014 + var3.field_9014;
      this.field_9016 = var1 * var2.field_9016 + var3.field_9016;
      this.field_9013 = var1 * var2.field_9013 + var3.field_9013;
      this.field_9012 = var1 * var2.field_9012 + var3.field_9012;
   }

   public final void method_7811(float var1, class_1752 var2) {
      this.field_9014 = var1 * this.field_9014 + var2.field_9014;
      this.field_9016 = var1 * this.field_9016 + var2.field_9016;
      this.field_9013 = var1 * this.field_9013 + var2.field_9013;
      this.field_9012 = var1 * this.field_9012 + var2.field_9012;
   }

   @Override
   public String toString() {
      return "(" + this.field_9014 + ", " + this.field_9016 + ", " + this.field_9013 + ", " + this.field_9012 + ")";
   }

   public boolean equals(class_1752 var1) {
      try {
         return this.field_9014 == var1.field_9014
            && this.field_9016 == var1.field_9016
            && this.field_9013 == var1.field_9013
            && this.field_9012 == var1.field_9012;
      } catch (NullPointerException var5) {
         return false;
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         class_1752 var4 = (class_1752)var1;
         return this.field_9014 == var4.field_9014
            && this.field_9016 == var4.field_9016
            && this.field_9013 == var4.field_9013
            && this.field_9012 == var4.field_9012;
      } catch (NullPointerException var5) {
         return false;
      } catch (ClassCastException var6) {
         return false;
      }
   }

   public boolean method_7828(class_1752 var1, float var2) {
      float var5 = this.field_9014 - var1.field_9014;
      if (!Float.isNaN(var5)) {
         if (!((!(var5 < 0.0F) ? var5 : -var5) > var2)) {
            var5 = this.field_9016 - var1.field_9016;
            if (!Float.isNaN(var5)) {
               if (!((!(var5 < 0.0F) ? var5 : -var5) > var2)) {
                  var5 = this.field_9013 - var1.field_9013;
                  if (!Float.isNaN(var5)) {
                     if (!((!(var5 < 0.0F) ? var5 : -var5) > var2)) {
                        var5 = this.field_9012 - var1.field_9012;
                        return !Float.isNaN(var5) ? !((!(var5 < 0.0F) ? var5 : -var5) > var2) : false;
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
      var3 = 31L * var3 + (long)class_9845.method_45351(this.field_9014);
      var3 = 31L * var3 + (long)class_9845.method_45351(this.field_9016);
      var3 = 31L * var3 + (long)class_9845.method_45351(this.field_9013);
      var3 = 31L * var3 + (long)class_9845.method_45351(this.field_9012);
      return (int)(var3 ^ var3 >> 32);
   }

   public final void method_7815(float var1, float var2, class_1752 var3) {
      if (!(var3.field_9014 > var2)) {
         if (!(var3.field_9014 < var1)) {
            this.field_9014 = var3.field_9014;
         } else {
            this.field_9014 = var1;
         }
      } else {
         this.field_9014 = var2;
      }

      if (!(var3.field_9016 > var2)) {
         if (!(var3.field_9016 < var1)) {
            this.field_9016 = var3.field_9016;
         } else {
            this.field_9016 = var1;
         }
      } else {
         this.field_9016 = var2;
      }

      if (!(var3.field_9013 > var2)) {
         if (!(var3.field_9013 < var1)) {
            this.field_9013 = var3.field_9013;
         } else {
            this.field_9013 = var1;
         }
      } else {
         this.field_9013 = var2;
      }

      if (!(var3.field_9012 > var2)) {
         if (!(var3.field_9012 < var1)) {
            this.field_9012 = var3.field_9012;
         } else {
            this.field_9012 = var1;
         }
      } else {
         this.field_9012 = var2;
      }
   }

   public final void method_7827(float var1, class_1752 var2) {
      if (!(var2.field_9014 < var1)) {
         this.field_9014 = var2.field_9014;
      } else {
         this.field_9014 = var1;
      }

      if (!(var2.field_9016 < var1)) {
         this.field_9016 = var2.field_9016;
      } else {
         this.field_9016 = var1;
      }

      if (!(var2.field_9013 < var1)) {
         this.field_9013 = var2.field_9013;
      } else {
         this.field_9013 = var1;
      }

      if (!(var2.field_9012 < var1)) {
         this.field_9012 = var2.field_9012;
      } else {
         this.field_9012 = var1;
      }
   }

   public final void method_7845(float var1, class_1752 var2) {
      if (!(var2.field_9014 > var1)) {
         this.field_9014 = var2.field_9014;
      } else {
         this.field_9014 = var1;
      }

      if (!(var2.field_9016 > var1)) {
         this.field_9016 = var2.field_9016;
      } else {
         this.field_9016 = var1;
      }

      if (!(var2.field_9013 > var1)) {
         this.field_9013 = var2.field_9013;
      } else {
         this.field_9013 = var1;
      }

      if (!(var2.field_9012 > var1)) {
         this.field_9012 = var2.field_9013;
      } else {
         this.field_9012 = var1;
      }
   }

   public final void method_7831(class_1752 var1) {
      this.field_9014 = Math.abs(var1.field_9014);
      this.field_9016 = Math.abs(var1.field_9016);
      this.field_9013 = Math.abs(var1.field_9013);
      this.field_9012 = Math.abs(var1.field_9012);
   }

   public final void method_7814(float var1, float var2) {
      if (!(this.field_9014 > var2)) {
         if (this.field_9014 < var1) {
            this.field_9014 = var1;
         }
      } else {
         this.field_9014 = var2;
      }

      if (!(this.field_9016 > var2)) {
         if (this.field_9016 < var1) {
            this.field_9016 = var1;
         }
      } else {
         this.field_9016 = var2;
      }

      if (!(this.field_9013 > var2)) {
         if (this.field_9013 < var1) {
            this.field_9013 = var1;
         }
      } else {
         this.field_9013 = var2;
      }

      if (!(this.field_9012 > var2)) {
         if (this.field_9012 < var1) {
            this.field_9012 = var1;
         }
      } else {
         this.field_9012 = var2;
      }
   }

   public final void method_7826(float var1) {
      if (this.field_9014 < var1) {
         this.field_9014 = var1;
      }

      if (this.field_9016 < var1) {
         this.field_9016 = var1;
      }

      if (this.field_9013 < var1) {
         this.field_9013 = var1;
      }

      if (this.field_9012 < var1) {
         this.field_9012 = var1;
      }
   }

   public final void method_7844(float var1) {
      if (this.field_9014 > var1) {
         this.field_9014 = var1;
      }

      if (this.field_9016 > var1) {
         this.field_9016 = var1;
      }

      if (this.field_9013 > var1) {
         this.field_9013 = var1;
      }

      if (this.field_9012 > var1) {
         this.field_9012 = var1;
      }
   }

   public final void method_7830() {
      this.field_9014 = Math.abs(this.field_9014);
      this.field_9016 = Math.abs(this.field_9016);
      this.field_9013 = Math.abs(this.field_9013);
      this.field_9012 = Math.abs(this.field_9012);
   }

   public void method_7820(class_1752 var1, class_1752 var2, float var3) {
      this.field_9014 = (1.0F - var3) * var1.field_9014 + var3 * var2.field_9014;
      this.field_9016 = (1.0F - var3) * var1.field_9016 + var3 * var2.field_9016;
      this.field_9013 = (1.0F - var3) * var1.field_9013 + var3 * var2.field_9013;
      this.field_9012 = (1.0F - var3) * var1.field_9012 + var3 * var2.field_9012;
   }

   public void method_7819(class_1752 var1, float var2) {
      this.field_9014 = (1.0F - var2) * this.field_9014 + var2 * var1.field_9014;
      this.field_9016 = (1.0F - var2) * this.field_9016 + var2 * var1.field_9016;
      this.field_9013 = (1.0F - var2) * this.field_9013 + var2 * var1.field_9013;
      this.field_9012 = (1.0F - var2) * this.field_9012 + var2 * var1.field_9012;
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var4) {
         throw new InternalError();
      }
   }

   public final float method_7834() {
      return this.field_9014;
   }

   public final void method_7810(float var1) {
      this.field_9014 = var1;
   }

   public final float method_7838() {
      return this.field_9016;
   }

   public final void method_7837(float var1) {
      this.field_9016 = var1;
   }

   public final float method_7829() {
      return this.field_9013;
   }

   public final void method_7839(float var1) {
      this.field_9013 = var1;
   }

   public final float method_7813() {
      return this.field_9012;
   }

   public final void method_7825(float var1) {
      this.field_9012 = var1;
   }
}

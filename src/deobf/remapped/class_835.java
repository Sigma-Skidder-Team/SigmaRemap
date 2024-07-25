package remapped;

import java.io.Serializable;

public abstract class class_835 implements Serializable, Cloneable {
   public static final long field_4392 = 5019834619484343712L;
   public float field_4390;
   public float field_4391;
   public float field_4393;

   public class_835(float var1, float var2, float var3) {
      this.field_4390 = var1;
      this.field_4391 = var2;
      this.field_4393 = var3;
   }

   public class_835(float[] var1) {
      this.field_4390 = var1[0];
      this.field_4391 = var1[1];
      this.field_4393 = var1[2];
   }

   public class_835(class_835 var1) {
      this.field_4390 = var1.field_4390;
      this.field_4391 = var1.field_4391;
      this.field_4393 = var1.field_4393;
   }

   public class_835(class_3519 var1) {
      this.field_4390 = (float)var1.field_17244;
      this.field_4391 = (float)var1.field_17242;
      this.field_4393 = (float)var1.field_17241;
   }

   public class_835() {
      this.field_4390 = 0.0F;
      this.field_4391 = 0.0F;
      this.field_4393 = 0.0F;
   }

   @Override
   public String toString() {
      return "(" + this.field_4390 + ", " + this.field_4391 + ", " + this.field_4393 + ")";
   }

   public final void method_3637(float var1, float var2, float var3) {
      this.field_4390 = var1;
      this.field_4391 = var2;
      this.field_4393 = var3;
   }

   public final void method_3640(float[] var1) {
      this.field_4390 = var1[0];
      this.field_4391 = var1[1];
      this.field_4393 = var1[2];
   }

   public final void method_3638(class_835 var1) {
      this.field_4390 = var1.field_4390;
      this.field_4391 = var1.field_4391;
      this.field_4393 = var1.field_4393;
   }

   public final void method_3639(class_3519 var1) {
      this.field_4390 = (float)var1.field_17244;
      this.field_4391 = (float)var1.field_17242;
      this.field_4393 = (float)var1.field_17241;
   }

   public final void method_3656(float[] var1) {
      var1[0] = this.field_4390;
      var1[1] = this.field_4391;
      var1[2] = this.field_4393;
   }

   public final void method_3655(class_835 var1) {
      var1.field_4390 = this.field_4390;
      var1.field_4391 = this.field_4391;
      var1.field_4393 = this.field_4393;
   }

   public final void method_3669(class_835 var1, class_835 var2) {
      this.field_4390 = var1.field_4390 + var2.field_4390;
      this.field_4391 = var1.field_4391 + var2.field_4391;
      this.field_4393 = var1.field_4393 + var2.field_4393;
   }

   public final void method_3668(class_835 var1) {
      this.field_4390 = this.field_4390 + var1.field_4390;
      this.field_4391 = this.field_4391 + var1.field_4391;
      this.field_4393 = this.field_4393 + var1.field_4393;
   }

   public final void method_3645(class_835 var1, class_835 var2) {
      this.field_4390 = var1.field_4390 - var2.field_4390;
      this.field_4391 = var1.field_4391 - var2.field_4391;
      this.field_4393 = var1.field_4393 - var2.field_4393;
   }

   public final void method_3644(class_835 var1) {
      this.field_4390 = this.field_4390 - var1.field_4390;
      this.field_4391 = this.field_4391 - var1.field_4391;
      this.field_4393 = this.field_4393 - var1.field_4393;
   }

   public final void method_3648(class_835 var1) {
      this.field_4390 = -var1.field_4390;
      this.field_4391 = -var1.field_4391;
      this.field_4393 = -var1.field_4393;
   }

   public final void method_3647() {
      this.field_4390 = -this.field_4390;
      this.field_4391 = -this.field_4391;
      this.field_4393 = -this.field_4393;
   }

   public final void method_3667(float var1, class_835 var2) {
      this.field_4390 = var1 * var2.field_4390;
      this.field_4391 = var1 * var2.field_4391;
      this.field_4393 = var1 * var2.field_4393;
   }

   public final void method_3666(float var1) {
      this.field_4390 *= var1;
      this.field_4391 *= var1;
      this.field_4393 *= var1;
   }

   public final void method_3660(float var1, class_835 var2, class_835 var3) {
      this.field_4390 = var1 * var2.field_4390 + var3.field_4390;
      this.field_4391 = var1 * var2.field_4391 + var3.field_4391;
      this.field_4393 = var1 * var2.field_4393 + var3.field_4393;
   }

   public final void method_3659(float var1, class_835 var2) {
      this.field_4390 = var1 * this.field_4390 + var2.field_4390;
      this.field_4391 = var1 * this.field_4391 + var2.field_4391;
      this.field_4393 = var1 * this.field_4393 + var2.field_4393;
   }

   public boolean equals(class_835 var1) {
      try {
         return this.field_4390 == var1.field_4390 && this.field_4391 == var1.field_4391 && this.field_4393 == var1.field_4393;
      } catch (NullPointerException var5) {
         return false;
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         class_835 var4 = (class_835)var1;
         return this.field_4390 == var4.field_4390 && this.field_4391 == var4.field_4391 && this.field_4393 == var4.field_4393;
      } catch (NullPointerException var5) {
         return false;
      } catch (ClassCastException var6) {
         return false;
      }
   }

   public boolean method_3641(class_835 var1, float var2) {
      float var5 = this.field_4390 - var1.field_4390;
      if (!Float.isNaN(var5)) {
         if (!((!(var5 < 0.0F) ? var5 : -var5) > var2)) {
            var5 = this.field_4391 - var1.field_4391;
            if (!Float.isNaN(var5)) {
               if (!((!(var5 < 0.0F) ? var5 : -var5) > var2)) {
                  var5 = this.field_4393 - var1.field_4393;
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
   }

   @Override
   public int hashCode() {
      long var3 = 1L;
      var3 = 31L * var3 + (long)class_9845.method_45351(this.field_4390);
      var3 = 31L * var3 + (long)class_9845.method_45351(this.field_4391);
      var3 = 31L * var3 + (long)class_9845.method_45351(this.field_4393);
      return (int)(var3 ^ var3 >> 32);
   }

   public final void method_3658(float var1, float var2, class_835 var3) {
      if (!(var3.field_4390 > var2)) {
         if (!(var3.field_4390 < var1)) {
            this.field_4390 = var3.field_4390;
         } else {
            this.field_4390 = var1;
         }
      } else {
         this.field_4390 = var2;
      }

      if (!(var3.field_4391 > var2)) {
         if (!(var3.field_4391 < var1)) {
            this.field_4391 = var3.field_4391;
         } else {
            this.field_4391 = var1;
         }
      } else {
         this.field_4391 = var2;
      }

      if (!(var3.field_4393 > var2)) {
         if (!(var3.field_4393 < var1)) {
            this.field_4393 = var3.field_4393;
         } else {
            this.field_4393 = var1;
         }
      } else {
         this.field_4393 = var2;
      }
   }

   public final void method_3662(float var1, class_835 var2) {
      if (!(var2.field_4390 < var1)) {
         this.field_4390 = var2.field_4390;
      } else {
         this.field_4390 = var1;
      }

      if (!(var2.field_4391 < var1)) {
         this.field_4391 = var2.field_4391;
      } else {
         this.field_4391 = var1;
      }

      if (!(var2.field_4393 < var1)) {
         this.field_4393 = var2.field_4393;
      } else {
         this.field_4393 = var1;
      }
   }

   public final void method_3651(float var1, class_835 var2) {
      if (!(var2.field_4390 > var1)) {
         this.field_4390 = var2.field_4390;
      } else {
         this.field_4390 = var1;
      }

      if (!(var2.field_4391 > var1)) {
         this.field_4391 = var2.field_4391;
      } else {
         this.field_4391 = var1;
      }

      if (!(var2.field_4393 > var1)) {
         this.field_4393 = var2.field_4393;
      } else {
         this.field_4393 = var1;
      }
   }

   public final void method_3664(class_835 var1) {
      this.field_4390 = Math.abs(var1.field_4390);
      this.field_4391 = Math.abs(var1.field_4391);
      this.field_4393 = Math.abs(var1.field_4393);
   }

   public final void method_3657(float var1, float var2) {
      if (!(this.field_4390 > var2)) {
         if (this.field_4390 < var1) {
            this.field_4390 = var1;
         }
      } else {
         this.field_4390 = var2;
      }

      if (!(this.field_4391 > var2)) {
         if (this.field_4391 < var1) {
            this.field_4391 = var1;
         }
      } else {
         this.field_4391 = var2;
      }

      if (!(this.field_4393 > var2)) {
         if (this.field_4393 < var1) {
            this.field_4393 = var1;
         }
      } else {
         this.field_4393 = var2;
      }
   }

   public final void method_3661(float var1) {
      if (this.field_4390 < var1) {
         this.field_4390 = var1;
      }

      if (this.field_4391 < var1) {
         this.field_4391 = var1;
      }

      if (this.field_4393 < var1) {
         this.field_4393 = var1;
      }
   }

   public final void method_3650(float var1) {
      if (this.field_4390 > var1) {
         this.field_4390 = var1;
      }

      if (this.field_4391 > var1) {
         this.field_4391 = var1;
      }

      if (this.field_4393 > var1) {
         this.field_4393 = var1;
      }
   }

   public final void method_3663() {
      this.field_4390 = Math.abs(this.field_4390);
      this.field_4391 = Math.abs(this.field_4391);
      this.field_4393 = Math.abs(this.field_4393);
   }

   public final void method_3643(class_835 var1, class_835 var2, float var3) {
      this.field_4390 = (1.0F - var3) * var1.field_4390 + var3 * var2.field_4390;
      this.field_4391 = (1.0F - var3) * var1.field_4391 + var3 * var2.field_4391;
      this.field_4393 = (1.0F - var3) * var1.field_4393 + var3 * var2.field_4393;
   }

   public final void method_3642(class_835 var1, float var2) {
      this.field_4390 = (1.0F - var2) * this.field_4390 + var2 * var1.field_4390;
      this.field_4391 = (1.0F - var2) * this.field_4391 + var2 * var1.field_4391;
      this.field_4393 = (1.0F - var2) * this.field_4393 + var2 * var1.field_4393;
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var4) {
         throw new InternalError();
      }
   }

   public final float method_3646() {
      return this.field_4390;
   }

   public final void method_3649(float var1) {
      this.field_4390 = var1;
   }

   public final float method_3636() {
      return this.field_4391;
   }

   public final void method_3653(float var1) {
      this.field_4391 = var1;
   }

   public final float method_3652() {
      return this.field_4393;
   }

   public final void method_3654(float var1) {
      this.field_4393 = var1;
   }
}

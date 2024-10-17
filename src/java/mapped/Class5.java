package mapped;

import java.io.Serializable;

public abstract class Class5 implements Serializable, Cloneable {
   public static final long field7 = 5019834619484343712L;
   public float field8;
   public float field9;
   public float field10;

   public Class5(float var1, float var2, float var3) {
      this.field8 = var1;
      this.field9 = var2;
      this.field10 = var3;
   }

   public Class5(float[] var1) {
      this.field8 = var1[0];
      this.field9 = var1[1];
      this.field10 = var1[2];
   }

   public Class5(Class5 var1) {
      this.field8 = var1.field8;
      this.field9 = var1.field9;
      this.field10 = var1.field10;
   }

   public Class5(Class2367 var1) {
      this.field8 = (float)var1.field16210;
      this.field9 = (float)var1.field16211;
      this.field10 = (float)var1.field16212;
   }

   public Class5() {
      this.field8 = 0.0F;
      this.field9 = 0.0F;
      this.field10 = 0.0F;
   }

   @Override
   public String toString() {
      return "(" + this.field8 + ", " + this.field9 + ", " + this.field10 + ")";
   }

   public final void method4(float var1, float var2, float var3) {
      this.field8 = var1;
      this.field9 = var2;
      this.field10 = var3;
   }

   public final void method5(float[] var1) {
      this.field8 = var1[0];
      this.field9 = var1[1];
      this.field10 = var1[2];
   }

   public final void method6(Class5 var1) {
      this.field8 = var1.field8;
      this.field9 = var1.field9;
      this.field10 = var1.field10;
   }

   public final void method7(Class2367 var1) {
      this.field8 = (float)var1.field16210;
      this.field9 = (float)var1.field16211;
      this.field10 = (float)var1.field16212;
   }

   public final void method8(float[] var1) {
      var1[0] = this.field8;
      var1[1] = this.field9;
      var1[2] = this.field10;
   }

   public final void method9(Class5 var1) {
      var1.field8 = this.field8;
      var1.field9 = this.field9;
      var1.field10 = this.field10;
   }

   public final void method10(Class5 var1, Class5 var2) {
      this.field8 = var1.field8 + var2.field8;
      this.field9 = var1.field9 + var2.field9;
      this.field10 = var1.field10 + var2.field10;
   }

   public final void method11(Class5 var1) {
      this.field8 = this.field8 + var1.field8;
      this.field9 = this.field9 + var1.field9;
      this.field10 = this.field10 + var1.field10;
   }

   public final void method12(Class5 var1, Class5 var2) {
      this.field8 = var1.field8 - var2.field8;
      this.field9 = var1.field9 - var2.field9;
      this.field10 = var1.field10 - var2.field10;
   }

   public final void method13(Class5 var1) {
      this.field8 = this.field8 - var1.field8;
      this.field9 = this.field9 - var1.field9;
      this.field10 = this.field10 - var1.field10;
   }

   public final void method14(Class5 var1) {
      this.field8 = -var1.field8;
      this.field9 = -var1.field9;
      this.field10 = -var1.field10;
   }

   public final void method15() {
      this.field8 = -this.field8;
      this.field9 = -this.field9;
      this.field10 = -this.field10;
   }

   public final void method16(float var1, Class5 var2) {
      this.field8 = var1 * var2.field8;
      this.field9 = var1 * var2.field9;
      this.field10 = var1 * var2.field10;
   }

   public final void method17(float var1) {
      this.field8 *= var1;
      this.field9 *= var1;
      this.field10 *= var1;
   }

   public final void method18(float var1, Class5 var2, Class5 var3) {
      this.field8 = var1 * var2.field8 + var3.field8;
      this.field9 = var1 * var2.field9 + var3.field9;
      this.field10 = var1 * var2.field10 + var3.field10;
   }

   public final void method19(float var1, Class5 var2) {
      this.field8 = var1 * this.field8 + var2.field8;
      this.field9 = var1 * this.field9 + var2.field9;
      this.field10 = var1 * this.field10 + var2.field10;
   }

   public boolean equals(Class5 var1) {
      try {
         return this.field8 == var1.field8 && this.field9 == var1.field9 && this.field10 == var1.field10;
      } catch (NullPointerException var5) {
         return false;
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         Class5 var4 = (Class5)var1;
         return this.field8 == var4.field8 && this.field9 == var4.field9 && this.field10 == var4.field10;
      } catch (NullPointerException | ClassCastException var5) {
         return false;
      }
   }

   public boolean method20(Class5 var1, float var2) {
      float var5 = this.field8 - var1.field8;
      if (!Float.isNaN(var5)) {
         if (!((!(var5 < 0.0F) ? var5 : -var5) > var2)) {
            var5 = this.field9 - var1.field9;
            if (!Float.isNaN(var5)) {
               if (!((!(var5 < 0.0F) ? var5 : -var5) > var2)) {
                  var5 = this.field10 - var1.field10;
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
      var3 = 31L * var3 + (long)Class9832.method38796(this.field8);
      var3 = 31L * var3 + (long)Class9832.method38796(this.field9);
      var3 = 31L * var3 + (long)Class9832.method38796(this.field10);
      return (int)(var3 ^ var3 >> 32);
   }

   public final void method21(float var1, float var2, Class5 var3) {
      if (!(var3.field8 > var2)) {
         if (!(var3.field8 < var1)) {
            this.field8 = var3.field8;
         } else {
            this.field8 = var1;
         }
      } else {
         this.field8 = var2;
      }

      if (!(var3.field9 > var2)) {
         if (!(var3.field9 < var1)) {
            this.field9 = var3.field9;
         } else {
            this.field9 = var1;
         }
      } else {
         this.field9 = var2;
      }

      if (!(var3.field10 > var2)) {
         if (!(var3.field10 < var1)) {
            this.field10 = var3.field10;
         } else {
            this.field10 = var1;
         }
      } else {
         this.field10 = var2;
      }
   }

   public final void method22(float var1, Class5 var2) {
      if (!(var2.field8 < var1)) {
         this.field8 = var2.field8;
      } else {
         this.field8 = var1;
      }

      if (!(var2.field9 < var1)) {
         this.field9 = var2.field9;
      } else {
         this.field9 = var1;
      }

      if (!(var2.field10 < var1)) {
         this.field10 = var2.field10;
      } else {
         this.field10 = var1;
      }
   }

   public final void method23(float var1, Class5 var2) {
      if (!(var2.field8 > var1)) {
         this.field8 = var2.field8;
      } else {
         this.field8 = var1;
      }

      if (!(var2.field9 > var1)) {
         this.field9 = var2.field9;
      } else {
         this.field9 = var1;
      }

      if (!(var2.field10 > var1)) {
         this.field10 = var2.field10;
      } else {
         this.field10 = var1;
      }
   }

   public final void method24(Class5 var1) {
      this.field8 = Math.abs(var1.field8);
      this.field9 = Math.abs(var1.field9);
      this.field10 = Math.abs(var1.field10);
   }

   public final void method25(float var1, float var2) {
      if (!(this.field8 > var2)) {
         if (this.field8 < var1) {
            this.field8 = var1;
         }
      } else {
         this.field8 = var2;
      }

      if (!(this.field9 > var2)) {
         if (this.field9 < var1) {
            this.field9 = var1;
         }
      } else {
         this.field9 = var2;
      }

      if (!(this.field10 > var2)) {
         if (this.field10 < var1) {
            this.field10 = var1;
         }
      } else {
         this.field10 = var2;
      }
   }

   public final void method26(float var1) {
      if (this.field8 < var1) {
         this.field8 = var1;
      }

      if (this.field9 < var1) {
         this.field9 = var1;
      }

      if (this.field10 < var1) {
         this.field10 = var1;
      }
   }

   public final void method27(float var1) {
      if (this.field8 > var1) {
         this.field8 = var1;
      }

      if (this.field9 > var1) {
         this.field9 = var1;
      }

      if (this.field10 > var1) {
         this.field10 = var1;
      }
   }

   public final void method28() {
      this.field8 = Math.abs(this.field8);
      this.field9 = Math.abs(this.field9);
      this.field10 = Math.abs(this.field10);
   }

   public final void method29(Class5 var1, Class5 var2, float var3) {
      this.field8 = (1.0F - var3) * var1.field8 + var3 * var2.field8;
      this.field9 = (1.0F - var3) * var1.field9 + var3 * var2.field9;
      this.field10 = (1.0F - var3) * var1.field10 + var3 * var2.field10;
   }

   public final void method30(Class5 var1, float var2) {
      this.field8 = (1.0F - var2) * this.field8 + var2 * var1.field8;
      this.field9 = (1.0F - var2) * this.field9 + var2 * var1.field9;
      this.field10 = (1.0F - var2) * this.field10 + var2 * var1.field10;
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var4) {
         throw new InternalError();
      }
   }

   public final float method31() {
      return this.field8;
   }

   public final void method32(float var1) {
      this.field8 = var1;
   }

   public final float method33() {
      return this.field9;
   }

   public final void method34(float var1) {
      this.field9 = var1;
   }

   public final float method35() {
      return this.field10;
   }

   public final void method36(float var1) {
      this.field10 = var1;
   }
}

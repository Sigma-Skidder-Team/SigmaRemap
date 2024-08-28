package mapped;

import java.io.Serializable;

public abstract class Class2394 implements Serializable, Cloneable {
   public static final long field16313 = 8064614250942616720L;
   public int field16314;
   public int field16315;
   public int field16316;
   public int field16317;

   public Class2394(int var1, int var2, int var3, int var4) {
      this.field16314 = var1;
      this.field16315 = var2;
      this.field16316 = var3;
      this.field16317 = var4;
   }

   public Class2394(int[] var1) {
      this.field16314 = var1[0];
      this.field16315 = var1[1];
      this.field16316 = var1[2];
      this.field16317 = var1[3];
   }

   public Class2394(Class2394 var1) {
      this.field16314 = var1.field16314;
      this.field16315 = var1.field16315;
      this.field16316 = var1.field16316;
      this.field16317 = var1.field16317;
   }

   public Class2394() {
      this.field16314 = 0;
      this.field16315 = 0;
      this.field16316 = 0;
      this.field16317 = 0;
   }

   public final void method9831(int var1, int var2, int var3, int var4) {
      this.field16314 = var1;
      this.field16315 = var2;
      this.field16316 = var3;
      this.field16317 = var4;
   }

   public final void method9832(int[] var1) {
      this.field16314 = var1[0];
      this.field16315 = var1[1];
      this.field16316 = var1[2];
      this.field16317 = var1[3];
   }

   public final void method9833(Class2394 var1) {
      this.field16314 = var1.field16314;
      this.field16315 = var1.field16315;
      this.field16316 = var1.field16316;
      this.field16317 = var1.field16317;
   }

   public final void method9834(int[] var1) {
      var1[0] = this.field16314;
      var1[1] = this.field16315;
      var1[2] = this.field16316;
      var1[3] = this.field16317;
   }

   public final void method9835(Class2394 var1) {
      var1.field16314 = this.field16314;
      var1.field16315 = this.field16315;
      var1.field16316 = this.field16316;
      var1.field16317 = this.field16317;
   }

   public final void method9836(Class2394 var1, Class2394 var2) {
      this.field16314 = var1.field16314 + var2.field16314;
      this.field16315 = var1.field16315 + var2.field16315;
      this.field16316 = var1.field16316 + var2.field16316;
      this.field16317 = var1.field16317 + var2.field16317;
   }

   public final void method9837(Class2394 var1) {
      this.field16314 = this.field16314 + var1.field16314;
      this.field16315 = this.field16315 + var1.field16315;
      this.field16316 = this.field16316 + var1.field16316;
      this.field16317 = this.field16317 + var1.field16317;
   }

   public final void method9838(Class2394 var1, Class2394 var2) {
      this.field16314 = var1.field16314 - var2.field16314;
      this.field16315 = var1.field16315 - var2.field16315;
      this.field16316 = var1.field16316 - var2.field16316;
      this.field16317 = var1.field16317 - var2.field16317;
   }

   public final void method9839(Class2394 var1) {
      this.field16314 = this.field16314 - var1.field16314;
      this.field16315 = this.field16315 - var1.field16315;
      this.field16316 = this.field16316 - var1.field16316;
      this.field16317 = this.field16317 - var1.field16317;
   }

   public final void method9840(Class2394 var1) {
      this.field16314 = -var1.field16314;
      this.field16315 = -var1.field16315;
      this.field16316 = -var1.field16316;
      this.field16317 = -var1.field16317;
   }

   public final void method9841() {
      this.field16314 = -this.field16314;
      this.field16315 = -this.field16315;
      this.field16316 = -this.field16316;
      this.field16317 = -this.field16317;
   }

   public final void method9842(int var1, Class2394 var2) {
      this.field16314 = var1 * var2.field16314;
      this.field16315 = var1 * var2.field16315;
      this.field16316 = var1 * var2.field16316;
      this.field16317 = var1 * var2.field16317;
   }

   public final void method9843(int var1) {
      this.field16314 *= var1;
      this.field16315 *= var1;
      this.field16316 *= var1;
      this.field16317 *= var1;
   }

   public final void method9844(int var1, Class2394 var2, Class2394 var3) {
      this.field16314 = var1 * var2.field16314 + var3.field16314;
      this.field16315 = var1 * var2.field16315 + var3.field16315;
      this.field16316 = var1 * var2.field16316 + var3.field16316;
      this.field16317 = var1 * var2.field16317 + var3.field16317;
   }

   public final void method9845(int var1, Class2394 var2) {
      this.field16314 = var1 * this.field16314 + var2.field16314;
      this.field16315 = var1 * this.field16315 + var2.field16315;
      this.field16316 = var1 * this.field16316 + var2.field16316;
      this.field16317 = var1 * this.field16317 + var2.field16317;
   }

   @Override
   public String toString() {
      return "(" + this.field16314 + ", " + this.field16315 + ", " + this.field16316 + ", " + this.field16317 + ")";
   }

   @Override
   public boolean equals(Object var1) {
      try {
         Class2394 var4 = (Class2394)var1;
         return this.field16314 == var4.field16314
            && this.field16315 == var4.field16315
            && this.field16316 == var4.field16316
            && this.field16317 == var4.field16317;
      } catch (NullPointerException var5) {
         return false;
      } catch (ClassCastException var6) {
         return false;
      }
   }

   @Override
   public int hashCode() {
      long var3 = 1L;
      var3 = 31L * var3 + (long)this.field16314;
      var3 = 31L * var3 + (long)this.field16315;
      var3 = 31L * var3 + (long)this.field16316;
      var3 = 31L * var3 + (long)this.field16317;
      return (int)(var3 ^ var3 >> 32);
   }

   public final void method9846(int var1, int var2, Class2394 var3) {
      if (var3.field16314 <= var2) {
         if (var3.field16314 >= var1) {
            this.field16314 = var3.field16314;
         } else {
            this.field16314 = var1;
         }
      } else {
         this.field16314 = var2;
      }

      if (var3.field16315 <= var2) {
         if (var3.field16315 >= var1) {
            this.field16315 = var3.field16315;
         } else {
            this.field16315 = var1;
         }
      } else {
         this.field16315 = var2;
      }

      if (var3.field16316 <= var2) {
         if (var3.field16316 >= var1) {
            this.field16316 = var3.field16316;
         } else {
            this.field16316 = var1;
         }
      } else {
         this.field16316 = var2;
      }

      if (var3.field16317 <= var2) {
         if (var3.field16317 >= var1) {
            this.field16317 = var3.field16317;
         } else {
            this.field16317 = var1;
         }
      } else {
         this.field16317 = var2;
      }
   }

   public final void method9847(int var1, Class2394 var2) {
      if (var2.field16314 >= var1) {
         this.field16314 = var2.field16314;
      } else {
         this.field16314 = var1;
      }

      if (var2.field16315 >= var1) {
         this.field16315 = var2.field16315;
      } else {
         this.field16315 = var1;
      }

      if (var2.field16316 >= var1) {
         this.field16316 = var2.field16316;
      } else {
         this.field16316 = var1;
      }

      if (var2.field16317 >= var1) {
         this.field16317 = var2.field16317;
      } else {
         this.field16317 = var1;
      }
   }

   public final void method9848(int var1, Class2394 var2) {
      if (var2.field16314 <= var1) {
         this.field16314 = var2.field16314;
      } else {
         this.field16314 = var1;
      }

      if (var2.field16315 <= var1) {
         this.field16315 = var2.field16315;
      } else {
         this.field16315 = var1;
      }

      if (var2.field16316 <= var1) {
         this.field16316 = var2.field16316;
      } else {
         this.field16316 = var1;
      }

      if (var2.field16317 <= var1) {
         this.field16317 = var2.field16316;
      } else {
         this.field16317 = var1;
      }
   }

   public final void method9849(Class2394 var1) {
      this.field16314 = Math.abs(var1.field16314);
      this.field16315 = Math.abs(var1.field16315);
      this.field16316 = Math.abs(var1.field16316);
      this.field16317 = Math.abs(var1.field16317);
   }

   public final void method9850(int var1, int var2) {
      if (this.field16314 <= var2) {
         if (this.field16314 < var1) {
            this.field16314 = var1;
         }
      } else {
         this.field16314 = var2;
      }

      if (this.field16315 <= var2) {
         if (this.field16315 < var1) {
            this.field16315 = var1;
         }
      } else {
         this.field16315 = var2;
      }

      if (this.field16316 <= var2) {
         if (this.field16316 < var1) {
            this.field16316 = var1;
         }
      } else {
         this.field16316 = var2;
      }

      if (this.field16317 <= var2) {
         if (this.field16317 < var1) {
            this.field16317 = var1;
         }
      } else {
         this.field16317 = var2;
      }
   }

   public final void method9851(int var1) {
      if (this.field16314 < var1) {
         this.field16314 = var1;
      }

      if (this.field16315 < var1) {
         this.field16315 = var1;
      }

      if (this.field16316 < var1) {
         this.field16316 = var1;
      }

      if (this.field16317 < var1) {
         this.field16317 = var1;
      }
   }

   public final void method9852(int var1) {
      if (this.field16314 > var1) {
         this.field16314 = var1;
      }

      if (this.field16315 > var1) {
         this.field16315 = var1;
      }

      if (this.field16316 > var1) {
         this.field16316 = var1;
      }

      if (this.field16317 > var1) {
         this.field16317 = var1;
      }
   }

   public final void method9853() {
      this.field16314 = Math.abs(this.field16314);
      this.field16315 = Math.abs(this.field16315);
      this.field16316 = Math.abs(this.field16316);
      this.field16317 = Math.abs(this.field16317);
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var4) {
         throw new InternalError();
      }
   }

   public final int method9854() {
      return this.field16314;
   }

   public final void method9855(int var1) {
      this.field16314 = var1;
   }

   public final int method9856() {
      return this.field16315;
   }

   public final void method9857(int var1) {
      this.field16315 = var1;
   }

   public final int method9858() {
      return this.field16316;
   }

   public final void method9859(int var1) {
      this.field16316 = var1;
   }

   public final int method9860() {
      return this.field16317;
   }

   public final void method9861(int var1) {
      this.field16317 = var1;
   }
}

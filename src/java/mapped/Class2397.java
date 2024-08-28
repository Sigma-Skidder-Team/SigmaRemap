package mapped;

import java.io.Serializable;

public abstract class Class2397 implements Serializable, Cloneable {
   public static final long field16325 = -3555701650170169638L;
   public int field16326;
   public int field16327;

   public Class2397(int var1, int var2) {
      this.field16326 = var1;
      this.field16327 = var2;
   }

   public Class2397(int[] var1) {
      this.field16326 = var1[0];
      this.field16327 = var1[1];
   }

   public Class2397(Class2397 var1) {
      this.field16326 = var1.field16326;
      this.field16327 = var1.field16327;
   }

   public Class2397() {
      this.field16326 = 0;
      this.field16327 = 0;
   }

   public final void method9883(int var1, int var2) {
      this.field16326 = var1;
      this.field16327 = var2;
   }

   public final void method9884(int[] var1) {
      this.field16326 = var1[0];
      this.field16327 = var1[1];
   }

   public final void method9885(Class2397 var1) {
      this.field16326 = var1.field16326;
      this.field16327 = var1.field16327;
   }

   public final void method9886(int[] var1) {
      var1[0] = this.field16326;
      var1[1] = this.field16327;
   }

   public final void method9887(Class2397 var1) {
      var1.field16326 = this.field16326;
      var1.field16327 = this.field16327;
   }

   public final void method9888(Class2397 var1, Class2397 var2) {
      this.field16326 = var1.field16326 + var2.field16326;
      this.field16327 = var1.field16327 + var2.field16327;
   }

   public final void method9889(Class2397 var1) {
      this.field16326 = this.field16326 + var1.field16326;
      this.field16327 = this.field16327 + var1.field16327;
   }

   public final void method9890(Class2397 var1, Class2397 var2) {
      this.field16326 = var1.field16326 - var2.field16326;
      this.field16327 = var1.field16327 - var2.field16327;
   }

   public final void method9891(Class2397 var1) {
      this.field16326 = this.field16326 - var1.field16326;
      this.field16327 = this.field16327 - var1.field16327;
   }

   public final void method9892(Class2397 var1) {
      this.field16326 = -var1.field16326;
      this.field16327 = -var1.field16327;
   }

   public final void method9893() {
      this.field16326 = -this.field16326;
      this.field16327 = -this.field16327;
   }

   public final void method9894(int var1, Class2397 var2) {
      this.field16326 = var1 * var2.field16326;
      this.field16327 = var1 * var2.field16327;
   }

   public final void method9895(int var1) {
      this.field16326 *= var1;
      this.field16327 *= var1;
   }

   public final void method9896(int var1, Class2397 var2, Class2397 var3) {
      this.field16326 = var1 * var2.field16326 + var3.field16326;
      this.field16327 = var1 * var2.field16327 + var3.field16327;
   }

   public final void method9897(int var1, Class2397 var2) {
      this.field16326 = var1 * this.field16326 + var2.field16326;
      this.field16327 = var1 * this.field16327 + var2.field16327;
   }

   @Override
   public String toString() {
      return "(" + this.field16326 + ", " + this.field16327 + ")";
   }

   @Override
   public boolean equals(Object var1) {
      try {
         Class2397 var4 = (Class2397)var1;
         return this.field16326 == var4.field16326 && this.field16327 == var4.field16327;
      } catch (NullPointerException var5) {
         return false;
      } catch (ClassCastException var6) {
         return false;
      }
   }

   @Override
   public int hashCode() {
      long var3 = 1L;
      var3 = 31L * var3 + (long)this.field16326;
      var3 = 31L * var3 + (long)this.field16327;
      return (int)(var3 ^ var3 >> 32);
   }

   public final void method9898(int var1, int var2, Class2397 var3) {
      if (var3.field16326 <= var2) {
         if (var3.field16326 >= var1) {
            this.field16326 = var3.field16326;
         } else {
            this.field16326 = var1;
         }
      } else {
         this.field16326 = var2;
      }

      if (var3.field16327 <= var2) {
         if (var3.field16327 >= var1) {
            this.field16327 = var3.field16327;
         } else {
            this.field16327 = var1;
         }
      } else {
         this.field16327 = var2;
      }
   }

   public final void method9899(int var1, Class2397 var2) {
      if (var2.field16326 >= var1) {
         this.field16326 = var2.field16326;
      } else {
         this.field16326 = var1;
      }

      if (var2.field16327 >= var1) {
         this.field16327 = var2.field16327;
      } else {
         this.field16327 = var1;
      }
   }

   public final void method9900(int var1, Class2397 var2) {
      if (var2.field16326 <= var1) {
         this.field16326 = var2.field16326;
      } else {
         this.field16326 = var1;
      }

      if (var2.field16327 <= var1) {
         this.field16327 = var2.field16327;
      } else {
         this.field16327 = var1;
      }
   }

   public final void method9901(Class2397 var1) {
      this.field16326 = Math.abs(var1.field16326);
      this.field16327 = Math.abs(var1.field16327);
   }

   public final void method9902(int var1, int var2) {
      if (this.field16326 <= var2) {
         if (this.field16326 < var1) {
            this.field16326 = var1;
         }
      } else {
         this.field16326 = var2;
      }

      if (this.field16327 <= var2) {
         if (this.field16327 < var1) {
            this.field16327 = var1;
         }
      } else {
         this.field16327 = var2;
      }
   }

   public final void method9903(int var1) {
      if (this.field16326 < var1) {
         this.field16326 = var1;
      }

      if (this.field16327 < var1) {
         this.field16327 = var1;
      }
   }

   public final void method9904(int var1) {
      if (this.field16326 > var1) {
         this.field16326 = var1;
      }

      if (this.field16327 > var1) {
         this.field16327 = var1;
      }
   }

   public final void method9905() {
      this.field16326 = Math.abs(this.field16326);
      this.field16327 = Math.abs(this.field16327);
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var4) {
         throw new InternalError();
      }
   }

   public final int method9906() {
      return this.field16326;
   }

   public final void method9907(int var1) {
      this.field16326 = var1;
   }

   public final int method9908() {
      return this.field16327;
   }

   public final void method9909(int var1) {
      this.field16327 = var1;
   }
}

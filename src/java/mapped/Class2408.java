package mapped;

import java.io.Serializable;

public abstract class Class2408 implements Serializable, Cloneable {
   public static final long field16376 = -732740491767276200L;
   public int field16377;
   public int field16378;
   public int field16379;

   public Class2408(int var1, int var2, int var3) {
      this.field16377 = var1;
      this.field16378 = var2;
      this.field16379 = var3;
   }

   public Class2408(int[] var1) {
      this.field16377 = var1[0];
      this.field16378 = var1[1];
      this.field16379 = var1[2];
   }

   public Class2408(Class2408 var1) {
      this.field16377 = var1.field16377;
      this.field16378 = var1.field16378;
      this.field16379 = var1.field16379;
   }

   public Class2408() {
      this.field16377 = 0;
      this.field16378 = 0;
      this.field16379 = 0;
   }

   public final void method10123(int var1, int var2, int var3) {
      this.field16377 = var1;
      this.field16378 = var2;
      this.field16379 = var3;
   }

   public final void method10124(int[] var1) {
      this.field16377 = var1[0];
      this.field16378 = var1[1];
      this.field16379 = var1[2];
   }

   public final void method10125(Class2408 var1) {
      this.field16377 = var1.field16377;
      this.field16378 = var1.field16378;
      this.field16379 = var1.field16379;
   }

   public final void method10126(int[] var1) {
      var1[0] = this.field16377;
      var1[1] = this.field16378;
      var1[2] = this.field16379;
   }

   public final void method10127(Class2408 var1) {
      var1.field16377 = this.field16377;
      var1.field16378 = this.field16378;
      var1.field16379 = this.field16379;
   }

   public final void method10128(Class2408 var1, Class2408 var2) {
      this.field16377 = var1.field16377 + var2.field16377;
      this.field16378 = var1.field16378 + var2.field16378;
      this.field16379 = var1.field16379 + var2.field16379;
   }

   public final void method10129(Class2408 var1) {
      this.field16377 = this.field16377 + var1.field16377;
      this.field16378 = this.field16378 + var1.field16378;
      this.field16379 = this.field16379 + var1.field16379;
   }

   public final void method10130(Class2408 var1, Class2408 var2) {
      this.field16377 = var1.field16377 - var2.field16377;
      this.field16378 = var1.field16378 - var2.field16378;
      this.field16379 = var1.field16379 - var2.field16379;
   }

   public final void method10131(Class2408 var1) {
      this.field16377 = this.field16377 - var1.field16377;
      this.field16378 = this.field16378 - var1.field16378;
      this.field16379 = this.field16379 - var1.field16379;
   }

   public final void method10132(Class2408 var1) {
      this.field16377 = -var1.field16377;
      this.field16378 = -var1.field16378;
      this.field16379 = -var1.field16379;
   }

   public final void method10133() {
      this.field16377 = -this.field16377;
      this.field16378 = -this.field16378;
      this.field16379 = -this.field16379;
   }

   public final void method10134(int var1, Class2408 var2) {
      this.field16377 = var1 * var2.field16377;
      this.field16378 = var1 * var2.field16378;
      this.field16379 = var1 * var2.field16379;
   }

   public final void method10135(int var1) {
      this.field16377 *= var1;
      this.field16378 *= var1;
      this.field16379 *= var1;
   }

   public final void method10136(int var1, Class2408 var2, Class2408 var3) {
      this.field16377 = var1 * var2.field16377 + var3.field16377;
      this.field16378 = var1 * var2.field16378 + var3.field16378;
      this.field16379 = var1 * var2.field16379 + var3.field16379;
   }

   public final void method10137(int var1, Class2408 var2) {
      this.field16377 = var1 * this.field16377 + var2.field16377;
      this.field16378 = var1 * this.field16378 + var2.field16378;
      this.field16379 = var1 * this.field16379 + var2.field16379;
   }

   @Override
   public String toString() {
      return "(" + this.field16377 + ", " + this.field16378 + ", " + this.field16379 + ")";
   }

   @Override
   public boolean equals(Object var1) {
      try {
         Class2408 var4 = (Class2408)var1;
         return this.field16377 == var4.field16377 && this.field16378 == var4.field16378 && this.field16379 == var4.field16379;
      } catch (NullPointerException var5) {
         return false;
      } catch (ClassCastException var6) {
         return false;
      }
   }

   @Override
   public int hashCode() {
      long var3 = 1L;
      var3 = 31L * var3 + (long)this.field16377;
      var3 = 31L * var3 + (long)this.field16378;
      var3 = 31L * var3 + (long)this.field16379;
      return (int)(var3 ^ var3 >> 32);
   }

   public final void method10138(int var1, int var2, Class2408 var3) {
      if (var3.field16377 <= var2) {
         if (var3.field16377 >= var1) {
            this.field16377 = var3.field16377;
         } else {
            this.field16377 = var1;
         }
      } else {
         this.field16377 = var2;
      }

      if (var3.field16378 <= var2) {
         if (var3.field16378 >= var1) {
            this.field16378 = var3.field16378;
         } else {
            this.field16378 = var1;
         }
      } else {
         this.field16378 = var2;
      }

      if (var3.field16379 <= var2) {
         if (var3.field16379 >= var1) {
            this.field16379 = var3.field16379;
         } else {
            this.field16379 = var1;
         }
      } else {
         this.field16379 = var2;
      }
   }

   public final void method10139(int var1, Class2408 var2) {
      if (var2.field16377 >= var1) {
         this.field16377 = var2.field16377;
      } else {
         this.field16377 = var1;
      }

      if (var2.field16378 >= var1) {
         this.field16378 = var2.field16378;
      } else {
         this.field16378 = var1;
      }

      if (var2.field16379 >= var1) {
         this.field16379 = var2.field16379;
      } else {
         this.field16379 = var1;
      }
   }

   public final void method10140(int var1, Class2408 var2) {
      if (var2.field16377 <= var1) {
         this.field16377 = var2.field16377;
      } else {
         this.field16377 = var1;
      }

      if (var2.field16378 <= var1) {
         this.field16378 = var2.field16378;
      } else {
         this.field16378 = var1;
      }

      if (var2.field16379 <= var1) {
         this.field16379 = var2.field16379;
      } else {
         this.field16379 = var1;
      }
   }

   public final void method10141(Class2408 var1) {
      this.field16377 = Math.abs(var1.field16377);
      this.field16378 = Math.abs(var1.field16378);
      this.field16379 = Math.abs(var1.field16379);
   }

   public final void method10142(int var1, int var2) {
      if (this.field16377 <= var2) {
         if (this.field16377 < var1) {
            this.field16377 = var1;
         }
      } else {
         this.field16377 = var2;
      }

      if (this.field16378 <= var2) {
         if (this.field16378 < var1) {
            this.field16378 = var1;
         }
      } else {
         this.field16378 = var2;
      }

      if (this.field16379 <= var2) {
         if (this.field16379 < var1) {
            this.field16379 = var1;
         }
      } else {
         this.field16379 = var2;
      }
   }

   public final void method10143(int var1) {
      if (this.field16377 < var1) {
         this.field16377 = var1;
      }

      if (this.field16378 < var1) {
         this.field16378 = var1;
      }

      if (this.field16379 < var1) {
         this.field16379 = var1;
      }
   }

   public final void method10144(int var1) {
      if (this.field16377 > var1) {
         this.field16377 = var1;
      }

      if (this.field16378 > var1) {
         this.field16378 = var1;
      }

      if (this.field16379 > var1) {
         this.field16379 = var1;
      }
   }

   public final void method10145() {
      this.field16377 = Math.abs(this.field16377);
      this.field16378 = Math.abs(this.field16378);
      this.field16379 = Math.abs(this.field16379);
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var4) {
         throw new InternalError();
      }
   }

   public final int method10146() {
      return this.field16377;
   }

   public final void method10147(int var1) {
      this.field16377 = var1;
   }

   public final int method10148() {
      return this.field16378;
   }

   public final void method10149(int var1) {
      this.field16378 = var1;
   }

   public final int method10150() {
      return this.field16379;
   }

   public final void method10151(int var1) {
      this.field16379 = var1;
   }
}

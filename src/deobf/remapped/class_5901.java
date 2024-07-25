package remapped;

import java.io.Serializable;

public abstract class class_5901 implements Serializable, Cloneable {
   public static final long field_29955 = -732740491767276200L;
   public int field_29953;
   public int field_29956;
   public int field_29954;

   public class_5901(int var1, int var2, int var3) {
      this.field_29953 = var1;
      this.field_29956 = var2;
      this.field_29954 = var3;
   }

   public class_5901(int[] var1) {
      this.field_29953 = var1[0];
      this.field_29956 = var1[1];
      this.field_29954 = var1[2];
   }

   public class_5901(class_5901 var1) {
      this.field_29953 = var1.field_29953;
      this.field_29956 = var1.field_29956;
      this.field_29954 = var1.field_29954;
   }

   public class_5901() {
      this.field_29953 = 0;
      this.field_29956 = 0;
      this.field_29954 = 0;
   }

   public final void method_26978(int var1, int var2, int var3) {
      this.field_29953 = var1;
      this.field_29956 = var2;
      this.field_29954 = var3;
   }

   public final void method_26980(int[] var1) {
      this.field_29953 = var1[0];
      this.field_29956 = var1[1];
      this.field_29954 = var1[2];
   }

   public final void method_26979(class_5901 var1) {
      this.field_29953 = var1.field_29953;
      this.field_29956 = var1.field_29956;
      this.field_29954 = var1.field_29954;
   }

   public final void method_26998(int[] var1) {
      var1[0] = this.field_29953;
      var1[1] = this.field_29956;
      var1[2] = this.field_29954;
   }

   public final void method_26997(class_5901 var1) {
      var1.field_29953 = this.field_29953;
      var1.field_29956 = this.field_29956;
      var1.field_29954 = this.field_29954;
   }

   public final void method_26991(class_5901 var1, class_5901 var2) {
      this.field_29953 = var1.field_29953 + var2.field_29953;
      this.field_29956 = var1.field_29956 + var2.field_29956;
      this.field_29954 = var1.field_29954 + var2.field_29954;
   }

   public final void method_26990(class_5901 var1) {
      this.field_29953 = this.field_29953 + var1.field_29953;
      this.field_29956 = this.field_29956 + var1.field_29956;
      this.field_29954 = this.field_29954 + var1.field_29954;
   }

   public final void method_26994(class_5901 var1, class_5901 var2) {
      this.field_29953 = var1.field_29953 - var2.field_29953;
      this.field_29956 = var1.field_29956 - var2.field_29956;
      this.field_29954 = var1.field_29954 - var2.field_29954;
   }

   public final void method_26993(class_5901 var1) {
      this.field_29953 = this.field_29953 - var1.field_29953;
      this.field_29956 = this.field_29956 - var1.field_29956;
      this.field_29954 = this.field_29954 - var1.field_29954;
   }

   public final void method_26988(class_5901 var1) {
      this.field_29953 = -var1.field_29953;
      this.field_29956 = -var1.field_29956;
      this.field_29954 = -var1.field_29954;
   }

   public final void method_26987() {
      this.field_29953 = -this.field_29953;
      this.field_29956 = -this.field_29956;
      this.field_29954 = -this.field_29954;
   }

   public final void method_27000(int var1, class_5901 var2) {
      this.field_29953 = var1 * var2.field_29953;
      this.field_29956 = var1 * var2.field_29956;
      this.field_29954 = var1 * var2.field_29954;
   }

   public final void method_26999(int var1) {
      this.field_29953 *= var1;
      this.field_29956 *= var1;
      this.field_29954 *= var1;
   }

   public final void method_26983(int var1, class_5901 var2, class_5901 var3) {
      this.field_29953 = var1 * var2.field_29953 + var3.field_29953;
      this.field_29956 = var1 * var2.field_29956 + var3.field_29956;
      this.field_29954 = var1 * var2.field_29954 + var3.field_29954;
   }

   public final void method_26982(int var1, class_5901 var2) {
      this.field_29953 = var1 * this.field_29953 + var2.field_29953;
      this.field_29956 = var1 * this.field_29956 + var2.field_29956;
      this.field_29954 = var1 * this.field_29954 + var2.field_29954;
   }

   @Override
   public String toString() {
      return "(" + this.field_29953 + ", " + this.field_29956 + ", " + this.field_29954 + ")";
   }

   @Override
   public boolean equals(Object var1) {
      try {
         class_5901 var4 = (class_5901)var1;
         return this.field_29953 == var4.field_29953 && this.field_29956 == var4.field_29956 && this.field_29954 == var4.field_29954;
      } catch (NullPointerException var5) {
         return false;
      } catch (ClassCastException var6) {
         return false;
      }
   }

   @Override
   public int hashCode() {
      long var3 = 1L;
      var3 = 31L * var3 + (long)this.field_29953;
      var3 = 31L * var3 + (long)this.field_29956;
      var3 = 31L * var3 + (long)this.field_29954;
      return (int)(var3 ^ var3 >> 32);
   }

   public final void method_26973(int var1, int var2, class_5901 var3) {
      if (var3.field_29953 <= var2) {
         if (var3.field_29953 >= var1) {
            this.field_29953 = var3.field_29953;
         } else {
            this.field_29953 = var1;
         }
      } else {
         this.field_29953 = var2;
      }

      if (var3.field_29956 <= var2) {
         if (var3.field_29956 >= var1) {
            this.field_29956 = var3.field_29956;
         } else {
            this.field_29956 = var1;
         }
      } else {
         this.field_29956 = var2;
      }

      if (var3.field_29954 <= var2) {
         if (var3.field_29954 >= var1) {
            this.field_29954 = var3.field_29954;
         } else {
            this.field_29954 = var1;
         }
      } else {
         this.field_29954 = var2;
      }
   }

   public final void method_26975(int var1, class_5901 var2) {
      if (var2.field_29953 >= var1) {
         this.field_29953 = var2.field_29953;
      } else {
         this.field_29953 = var1;
      }

      if (var2.field_29956 >= var1) {
         this.field_29956 = var2.field_29956;
      } else {
         this.field_29956 = var1;
      }

      if (var2.field_29954 >= var1) {
         this.field_29954 = var2.field_29954;
      } else {
         this.field_29954 = var1;
      }
   }

   public final void method_26996(int var1, class_5901 var2) {
      if (var2.field_29953 <= var1) {
         this.field_29953 = var2.field_29953;
      } else {
         this.field_29953 = var1;
      }

      if (var2.field_29956 <= var1) {
         this.field_29956 = var2.field_29956;
      } else {
         this.field_29956 = var1;
      }

      if (var2.field_29954 <= var1) {
         this.field_29954 = var2.field_29954;
      } else {
         this.field_29954 = var1;
      }
   }

   public final void method_26985(class_5901 var1) {
      this.field_29953 = Math.abs(var1.field_29953);
      this.field_29956 = Math.abs(var1.field_29956);
      this.field_29954 = Math.abs(var1.field_29954);
   }

   public final void method_26972(int var1, int var2) {
      if (this.field_29953 <= var2) {
         if (this.field_29953 < var1) {
            this.field_29953 = var1;
         }
      } else {
         this.field_29953 = var2;
      }

      if (this.field_29956 <= var2) {
         if (this.field_29956 < var1) {
            this.field_29956 = var1;
         }
      } else {
         this.field_29956 = var2;
      }

      if (this.field_29954 <= var2) {
         if (this.field_29954 < var1) {
            this.field_29954 = var1;
         }
      } else {
         this.field_29954 = var2;
      }
   }

   public final void method_26974(int var1) {
      if (this.field_29953 < var1) {
         this.field_29953 = var1;
      }

      if (this.field_29956 < var1) {
         this.field_29956 = var1;
      }

      if (this.field_29954 < var1) {
         this.field_29954 = var1;
      }
   }

   public final void method_26995(int var1) {
      if (this.field_29953 > var1) {
         this.field_29953 = var1;
      }

      if (this.field_29956 > var1) {
         this.field_29956 = var1;
      }

      if (this.field_29954 > var1) {
         this.field_29954 = var1;
      }
   }

   public final void method_26984() {
      this.field_29953 = Math.abs(this.field_29953);
      this.field_29956 = Math.abs(this.field_29956);
      this.field_29954 = Math.abs(this.field_29954);
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var4) {
         throw new InternalError();
      }
   }

   public final int method_26981() {
      return this.field_29953;
   }

   public final void method_26977(int var1) {
      this.field_29953 = var1;
   }

   public final int method_26971() {
      return this.field_29956;
   }

   public final void method_26986(int var1) {
      this.field_29956 = var1;
   }

   public final int method_26992() {
      return this.field_29954;
   }

   public final void method_26976(int var1) {
      this.field_29954 = var1;
   }
}

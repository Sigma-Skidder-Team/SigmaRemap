package remapped;

import java.io.Serializable;

public abstract class class_4325 implements Serializable, Cloneable {
   public static final long field_21046 = 8064614250942616720L;
   public int field_21045;
   public int field_21044;
   public int field_21042;
   public int field_21043;

   public class_4325(int var1, int var2, int var3, int var4) {
      this.field_21045 = var1;
      this.field_21044 = var2;
      this.field_21042 = var3;
      this.field_21043 = var4;
   }

   public class_4325(int[] var1) {
      this.field_21045 = var1[0];
      this.field_21044 = var1[1];
      this.field_21042 = var1[2];
      this.field_21043 = var1[3];
   }

   public class_4325(class_4325 var1) {
      this.field_21045 = var1.field_21045;
      this.field_21044 = var1.field_21044;
      this.field_21042 = var1.field_21042;
      this.field_21043 = var1.field_21043;
   }

   public class_4325() {
      this.field_21045 = 0;
      this.field_21044 = 0;
      this.field_21042 = 0;
      this.field_21043 = 0;
   }

   public final void method_20125(int var1, int var2, int var3, int var4) {
      this.field_21045 = var1;
      this.field_21044 = var2;
      this.field_21042 = var3;
      this.field_21043 = var4;
   }

   public final void method_20127(int[] var1) {
      this.field_21045 = var1[0];
      this.field_21044 = var1[1];
      this.field_21042 = var1[2];
      this.field_21043 = var1[3];
   }

   public final void method_20126(class_4325 var1) {
      this.field_21045 = var1.field_21045;
      this.field_21044 = var1.field_21044;
      this.field_21042 = var1.field_21042;
      this.field_21043 = var1.field_21043;
   }

   public final void method_20123(int[] var1) {
      var1[0] = this.field_21045;
      var1[1] = this.field_21044;
      var1[2] = this.field_21042;
      var1[3] = this.field_21043;
   }

   public final void method_20122(class_4325 var1) {
      var1.field_21045 = this.field_21045;
      var1.field_21044 = this.field_21044;
      var1.field_21042 = this.field_21042;
      var1.field_21043 = this.field_21043;
   }

   public final void method_20147(class_4325 var1, class_4325 var2) {
      this.field_21045 = var1.field_21045 + var2.field_21045;
      this.field_21044 = var1.field_21044 + var2.field_21044;
      this.field_21042 = var1.field_21042 + var2.field_21042;
      this.field_21043 = var1.field_21043 + var2.field_21043;
   }

   public final void method_20146(class_4325 var1) {
      this.field_21045 = this.field_21045 + var1.field_21045;
      this.field_21044 = this.field_21044 + var1.field_21044;
      this.field_21042 = this.field_21042 + var1.field_21042;
      this.field_21043 = this.field_21043 + var1.field_21043;
   }

   public final void method_20142(class_4325 var1, class_4325 var2) {
      this.field_21045 = var1.field_21045 - var2.field_21045;
      this.field_21044 = var1.field_21044 - var2.field_21044;
      this.field_21042 = var1.field_21042 - var2.field_21042;
      this.field_21043 = var1.field_21043 - var2.field_21043;
   }

   public final void method_20141(class_4325 var1) {
      this.field_21045 = this.field_21045 - var1.field_21045;
      this.field_21044 = this.field_21044 - var1.field_21044;
      this.field_21042 = this.field_21042 - var1.field_21042;
      this.field_21043 = this.field_21043 - var1.field_21043;
   }

   public final void method_20135(class_4325 var1) {
      this.field_21045 = -var1.field_21045;
      this.field_21044 = -var1.field_21044;
      this.field_21042 = -var1.field_21042;
      this.field_21043 = -var1.field_21043;
   }

   public final void method_20134() {
      this.field_21045 = -this.field_21045;
      this.field_21044 = -this.field_21044;
      this.field_21042 = -this.field_21042;
      this.field_21043 = -this.field_21043;
   }

   public final void method_20145(int var1, class_4325 var2) {
      this.field_21045 = var1 * var2.field_21045;
      this.field_21044 = var1 * var2.field_21044;
      this.field_21042 = var1 * var2.field_21042;
      this.field_21043 = var1 * var2.field_21043;
   }

   public final void method_20144(int var1) {
      this.field_21045 *= var1;
      this.field_21044 *= var1;
      this.field_21042 *= var1;
      this.field_21043 *= var1;
   }

   public final void method_20130(int var1, class_4325 var2, class_4325 var3) {
      this.field_21045 = var1 * var2.field_21045 + var3.field_21045;
      this.field_21044 = var1 * var2.field_21044 + var3.field_21044;
      this.field_21042 = var1 * var2.field_21042 + var3.field_21042;
      this.field_21043 = var1 * var2.field_21043 + var3.field_21043;
   }

   public final void method_20129(int var1, class_4325 var2) {
      this.field_21045 = var1 * this.field_21045 + var2.field_21045;
      this.field_21044 = var1 * this.field_21044 + var2.field_21044;
      this.field_21042 = var1 * this.field_21042 + var2.field_21042;
      this.field_21043 = var1 * this.field_21043 + var2.field_21043;
   }

   @Override
   public String toString() {
      return "(" + this.field_21045 + ", " + this.field_21044 + ", " + this.field_21042 + ", " + this.field_21043 + ")";
   }

   @Override
   public boolean equals(Object var1) {
      try {
         class_4325 var4 = (class_4325)var1;
         return this.field_21045 == var4.field_21045
            && this.field_21044 == var4.field_21044
            && this.field_21042 == var4.field_21042
            && this.field_21043 == var4.field_21043;
      } catch (NullPointerException var5) {
         return false;
      } catch (ClassCastException var6) {
         return false;
      }
   }

   @Override
   public int hashCode() {
      long var3 = 1L;
      var3 = 31L * var3 + (long)this.field_21045;
      var3 = 31L * var3 + (long)this.field_21044;
      var3 = 31L * var3 + (long)this.field_21042;
      var3 = 31L * var3 + (long)this.field_21043;
      return (int)(var3 ^ var3 >> 32);
   }

   public final void method_20137(int var1, int var2, class_4325 var3) {
      if (var3.field_21045 <= var2) {
         if (var3.field_21045 >= var1) {
            this.field_21045 = var3.field_21045;
         } else {
            this.field_21045 = var1;
         }
      } else {
         this.field_21045 = var2;
      }

      if (var3.field_21044 <= var2) {
         if (var3.field_21044 >= var1) {
            this.field_21044 = var3.field_21044;
         } else {
            this.field_21044 = var1;
         }
      } else {
         this.field_21044 = var2;
      }

      if (var3.field_21042 <= var2) {
         if (var3.field_21042 >= var1) {
            this.field_21042 = var3.field_21042;
         } else {
            this.field_21042 = var1;
         }
      } else {
         this.field_21042 = var2;
      }

      if (var3.field_21043 <= var2) {
         if (var3.field_21043 >= var1) {
            this.field_21043 = var3.field_21043;
         } else {
            this.field_21043 = var1;
         }
      } else {
         this.field_21043 = var2;
      }
   }

   public final void method_20117(int var1, class_4325 var2) {
      if (var2.field_21045 >= var1) {
         this.field_21045 = var2.field_21045;
      } else {
         this.field_21045 = var1;
      }

      if (var2.field_21044 >= var1) {
         this.field_21044 = var2.field_21044;
      } else {
         this.field_21044 = var1;
      }

      if (var2.field_21042 >= var1) {
         this.field_21042 = var2.field_21042;
      } else {
         this.field_21042 = var1;
      }

      if (var2.field_21043 >= var1) {
         this.field_21043 = var2.field_21043;
      } else {
         this.field_21043 = var1;
      }
   }

   public final void method_20132(int var1, class_4325 var2) {
      if (var2.field_21045 <= var1) {
         this.field_21045 = var2.field_21045;
      } else {
         this.field_21045 = var1;
      }

      if (var2.field_21044 <= var1) {
         this.field_21044 = var2.field_21044;
      } else {
         this.field_21044 = var1;
      }

      if (var2.field_21042 <= var1) {
         this.field_21042 = var2.field_21042;
      } else {
         this.field_21042 = var1;
      }

      if (var2.field_21043 <= var1) {
         this.field_21043 = var2.field_21042;
      } else {
         this.field_21043 = var1;
      }
   }

   public final void method_20139(class_4325 var1) {
      this.field_21045 = Math.abs(var1.field_21045);
      this.field_21044 = Math.abs(var1.field_21044);
      this.field_21042 = Math.abs(var1.field_21042);
      this.field_21043 = Math.abs(var1.field_21043);
   }

   public final void method_20136(int var1, int var2) {
      if (this.field_21045 <= var2) {
         if (this.field_21045 < var1) {
            this.field_21045 = var1;
         }
      } else {
         this.field_21045 = var2;
      }

      if (this.field_21044 <= var2) {
         if (this.field_21044 < var1) {
            this.field_21044 = var1;
         }
      } else {
         this.field_21044 = var2;
      }

      if (this.field_21042 <= var2) {
         if (this.field_21042 < var1) {
            this.field_21042 = var1;
         }
      } else {
         this.field_21042 = var2;
      }

      if (this.field_21043 <= var2) {
         if (this.field_21043 < var1) {
            this.field_21043 = var1;
         }
      } else {
         this.field_21043 = var2;
      }
   }

   public final void method_20116(int var1) {
      if (this.field_21045 < var1) {
         this.field_21045 = var1;
      }

      if (this.field_21044 < var1) {
         this.field_21044 = var1;
      }

      if (this.field_21042 < var1) {
         this.field_21042 = var1;
      }

      if (this.field_21043 < var1) {
         this.field_21043 = var1;
      }
   }

   public final void method_20131(int var1) {
      if (this.field_21045 > var1) {
         this.field_21045 = var1;
      }

      if (this.field_21044 > var1) {
         this.field_21044 = var1;
      }

      if (this.field_21042 > var1) {
         this.field_21042 = var1;
      }

      if (this.field_21043 > var1) {
         this.field_21043 = var1;
      }
   }

   public final void method_20138() {
      this.field_21045 = Math.abs(this.field_21045);
      this.field_21044 = Math.abs(this.field_21044);
      this.field_21042 = Math.abs(this.field_21042);
      this.field_21043 = Math.abs(this.field_21043);
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var4) {
         throw new InternalError();
      }
   }

   public final int method_20133() {
      return this.field_21045;
   }

   public final void method_20121(int var1) {
      this.field_21045 = var1;
   }

   public final int method_20124() {
      return this.field_21044;
   }

   public final void method_20119(int var1) {
      this.field_21044 = var1;
   }

   public final int method_20118() {
      return this.field_21042;
   }

   public final void method_20143(int var1) {
      this.field_21042 = var1;
   }

   public final int method_20128() {
      return this.field_21043;
   }

   public final void method_20140(int var1) {
      this.field_21043 = var1;
   }
}

package remapped;

import java.io.Serializable;

public abstract class class_4848 implements Serializable, Cloneable {
   public static final long field_24179 = -3555701650170169638L;
   public int field_24180;
   public int field_24178;

   public class_4848(int var1, int var2) {
      this.field_24180 = var1;
      this.field_24178 = var2;
   }

   public class_4848(int[] var1) {
      this.field_24180 = var1[0];
      this.field_24178 = var1[1];
   }

   public class_4848(class_4848 var1) {
      this.field_24180 = var1.field_24180;
      this.field_24178 = var1.field_24178;
   }

   public class_4848() {
      this.field_24180 = 0;
      this.field_24178 = 0;
   }

   public final void method_22313(int var1, int var2) {
      this.field_24180 = var1;
      this.field_24178 = var2;
   }

   public final void method_22315(int[] var1) {
      this.field_24180 = var1[0];
      this.field_24178 = var1[1];
   }

   public final void method_22314(class_4848 var1) {
      this.field_24180 = var1.field_24180;
      this.field_24178 = var1.field_24178;
   }

   public final void method_22310(int[] var1) {
      var1[0] = this.field_24180;
      var1[1] = this.field_24178;
   }

   public final void method_22309(class_4848 var1) {
      var1.field_24180 = this.field_24180;
      var1.field_24178 = this.field_24178;
   }

   public final void method_22299(class_4848 var1, class_4848 var2) {
      this.field_24180 = var1.field_24180 + var2.field_24180;
      this.field_24178 = var1.field_24178 + var2.field_24178;
   }

   public final void method_22298(class_4848 var1) {
      this.field_24180 = this.field_24180 + var1.field_24180;
      this.field_24178 = this.field_24178 + var1.field_24178;
   }

   public final void method_22305(class_4848 var1, class_4848 var2) {
      this.field_24180 = var1.field_24180 - var2.field_24180;
      this.field_24178 = var1.field_24178 - var2.field_24178;
   }

   public final void method_22304(class_4848 var1) {
      this.field_24180 = this.field_24180 - var1.field_24180;
      this.field_24178 = this.field_24178 - var1.field_24178;
   }

   public final void method_22295(class_4848 var1) {
      this.field_24180 = -var1.field_24180;
      this.field_24178 = -var1.field_24178;
   }

   public final void method_22294() {
      this.field_24180 = -this.field_24180;
      this.field_24178 = -this.field_24178;
   }

   public final void method_22303(int var1, class_4848 var2) {
      this.field_24180 = var1 * var2.field_24180;
      this.field_24178 = var1 * var2.field_24178;
   }

   public final void method_22302(int var1) {
      this.field_24180 *= var1;
      this.field_24178 *= var1;
   }

   public final void method_22297(int var1, class_4848 var2, class_4848 var3) {
      this.field_24180 = var1 * var2.field_24180 + var3.field_24180;
      this.field_24178 = var1 * var2.field_24178 + var3.field_24178;
   }

   public final void method_22296(int var1, class_4848 var2) {
      this.field_24180 = var1 * this.field_24180 + var2.field_24180;
      this.field_24178 = var1 * this.field_24178 + var2.field_24178;
   }

   @Override
   public String toString() {
      return "(" + this.field_24180 + ", " + this.field_24178 + ")";
   }

   @Override
   public boolean equals(Object var1) {
      try {
         class_4848 var4 = (class_4848)var1;
         return this.field_24180 == var4.field_24180 && this.field_24178 == var4.field_24178;
      } catch (NullPointerException var5) {
         return false;
      } catch (ClassCastException var6) {
         return false;
      }
   }

   @Override
   public int hashCode() {
      long var3 = 1L;
      var3 = 31L * var3 + (long)this.field_24180;
      var3 = 31L * var3 + (long)this.field_24178;
      return (int)(var3 ^ var3 >> 32);
   }

   public final void method_22301(int var1, int var2, class_4848 var3) {
      if (var3.field_24180 <= var2) {
         if (var3.field_24180 >= var1) {
            this.field_24180 = var3.field_24180;
         } else {
            this.field_24180 = var1;
         }
      } else {
         this.field_24180 = var2;
      }

      if (var3.field_24178 <= var2) {
         if (var3.field_24178 >= var1) {
            this.field_24178 = var3.field_24178;
         } else {
            this.field_24178 = var1;
         }
      } else {
         this.field_24178 = var2;
      }
   }

   public final void method_22293(int var1, class_4848 var2) {
      if (var2.field_24180 >= var1) {
         this.field_24180 = var2.field_24180;
      } else {
         this.field_24180 = var1;
      }

      if (var2.field_24178 >= var1) {
         this.field_24178 = var2.field_24178;
      } else {
         this.field_24178 = var1;
      }
   }

   public final void method_22317(int var1, class_4848 var2) {
      if (var2.field_24180 <= var1) {
         this.field_24180 = var2.field_24180;
      } else {
         this.field_24180 = var1;
      }

      if (var2.field_24178 <= var1) {
         this.field_24178 = var2.field_24178;
      } else {
         this.field_24178 = var1;
      }
   }

   public final void method_22308(class_4848 var1) {
      this.field_24180 = Math.abs(var1.field_24180);
      this.field_24178 = Math.abs(var1.field_24178);
   }

   public final void method_22300(int var1, int var2) {
      if (this.field_24180 <= var2) {
         if (this.field_24180 < var1) {
            this.field_24180 = var1;
         }
      } else {
         this.field_24180 = var2;
      }

      if (this.field_24178 <= var2) {
         if (this.field_24178 < var1) {
            this.field_24178 = var1;
         }
      } else {
         this.field_24178 = var2;
      }
   }

   public final void method_22292(int var1) {
      if (this.field_24180 < var1) {
         this.field_24180 = var1;
      }

      if (this.field_24178 < var1) {
         this.field_24178 = var1;
      }
   }

   public final void method_22316(int var1) {
      if (this.field_24180 > var1) {
         this.field_24180 = var1;
      }

      if (this.field_24178 > var1) {
         this.field_24178 = var1;
      }
   }

   public final void method_22307() {
      this.field_24180 = Math.abs(this.field_24180);
      this.field_24178 = Math.abs(this.field_24178);
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var4) {
         throw new InternalError();
      }
   }

   public final int method_22311() {
      return this.field_24180;
   }

   public final void method_22306(int var1) {
      this.field_24180 = var1;
   }

   public final int method_22318() {
      return this.field_24178;
   }

   public final void method_22312(int var1) {
      this.field_24178 = var1;
   }
}

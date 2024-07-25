package remapped;

import java.io.Serializable;

public abstract class class_2693 implements Serializable, Cloneable {
   public static final long field_13179 = 6205762482756093838L;
   public double field_13181;
   public double field_13180;

   public class_2693(double var1, double var3) {
      this.field_13181 = var1;
      this.field_13180 = var3;
   }

   public class_2693(double[] var1) {
      this.field_13181 = var1[0];
      this.field_13180 = var1[1];
   }

   public class_2693(class_2693 var1) {
      this.field_13181 = var1.field_13181;
      this.field_13180 = var1.field_13180;
   }

   public class_2693(class_6064 var1) {
      this.field_13181 = (double)var1.field_31017;
      this.field_13180 = (double)var1.field_31019;
   }

   public class_2693() {
      this.field_13181 = 0.0;
      this.field_13180 = 0.0;
   }

   public final void method_12089(double var1, double var3) {
      this.field_13181 = var1;
      this.field_13180 = var3;
   }

   public final void method_12092(double[] var1) {
      this.field_13181 = var1[0];
      this.field_13180 = var1[1];
   }

   public final void method_12090(class_2693 var1) {
      this.field_13181 = var1.field_13181;
      this.field_13180 = var1.field_13180;
   }

   public final void method_12091(class_6064 var1) {
      this.field_13181 = (double)var1.field_31017;
      this.field_13180 = (double)var1.field_31019;
   }

   public final void method_12107(double[] var1) {
      var1[0] = this.field_13181;
      var1[1] = this.field_13180;
   }

   public final void method_12098(class_2693 var1, class_2693 var2) {
      this.field_13181 = var1.field_13181 + var2.field_13181;
      this.field_13180 = var1.field_13180 + var2.field_13180;
   }

   public final void method_12097(class_2693 var1) {
      this.field_13181 = this.field_13181 + var1.field_13181;
      this.field_13180 = this.field_13180 + var1.field_13180;
   }

   public final void method_12088(class_2693 var1, class_2693 var2) {
      this.field_13181 = var1.field_13181 - var2.field_13181;
      this.field_13180 = var1.field_13180 - var2.field_13180;
   }

   public final void method_12087(class_2693 var1) {
      this.field_13181 = this.field_13181 - var1.field_13181;
      this.field_13180 = this.field_13180 - var1.field_13180;
   }

   public final void method_12100(class_2693 var1) {
      this.field_13181 = -var1.field_13181;
      this.field_13180 = -var1.field_13180;
   }

   public final void method_12099() {
      this.field_13181 = -this.field_13181;
      this.field_13180 = -this.field_13180;
   }

   public final void method_12086(double var1, class_2693 var3) {
      this.field_13181 = var1 * var3.field_13181;
      this.field_13180 = var1 * var3.field_13180;
   }

   public final void method_12085(double var1) {
      this.field_13181 *= var1;
      this.field_13180 *= var1;
   }

   public final void method_12110(double var1, class_2693 var3, class_2693 var4) {
      this.field_13181 = var1 * var3.field_13181 + var4.field_13181;
      this.field_13180 = var1 * var3.field_13180 + var4.field_13180;
   }

   public final void method_12109(double var1, class_2693 var3) {
      this.field_13181 = var1 * this.field_13181 + var3.field_13181;
      this.field_13180 = var1 * this.field_13180 + var3.field_13180;
   }

   @Override
   public int hashCode() {
      long var3 = 1L;
      var3 = 31L * var3 + class_9845.method_45350(this.field_13181);
      var3 = 31L * var3 + class_9845.method_45350(this.field_13180);
      return (int)(var3 ^ var3 >> 32);
   }

   public boolean equals(class_2693 var1) {
      try {
         return this.field_13181 == var1.field_13181 && this.field_13180 == var1.field_13180;
      } catch (NullPointerException var5) {
         return false;
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         class_2693 var4 = (class_2693)var1;
         return this.field_13181 == var4.field_13181 && this.field_13180 == var4.field_13180;
      } catch (NullPointerException var5) {
         return false;
      } catch (ClassCastException var6) {
         return false;
      }
   }

   public boolean method_12096(class_2693 var1, double var2) {
      double var6 = this.field_13181 - var1.field_13181;
      if (!Double.isNaN(var6)) {
         if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
            var6 = this.field_13180 - var1.field_13180;
            return !Double.isNaN(var6) ? !((!(var6 < 0.0) ? var6 : -var6) > var2) : false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "(" + this.field_13181 + ", " + this.field_13180 + ")";
   }

   public final void method_12094(double var1, double var3, class_2693 var5) {
      if (!(var5.field_13181 > var3)) {
         if (!(var5.field_13181 < var1)) {
            this.field_13181 = var5.field_13181;
         } else {
            this.field_13181 = var1;
         }
      } else {
         this.field_13181 = var3;
      }

      if (!(var5.field_13180 > var3)) {
         if (!(var5.field_13180 < var1)) {
            this.field_13180 = var5.field_13180;
         } else {
            this.field_13180 = var1;
         }
      } else {
         this.field_13180 = var3;
      }
   }

   public final void method_12083(double var1, class_2693 var3) {
      if (!(var3.field_13181 < var1)) {
         this.field_13181 = var3.field_13181;
      } else {
         this.field_13181 = var1;
      }

      if (!(var3.field_13180 < var1)) {
         this.field_13180 = var3.field_13180;
      } else {
         this.field_13180 = var1;
      }
   }

   public final void method_12106(double var1, class_2693 var3) {
      if (!(var3.field_13181 > var1)) {
         this.field_13181 = var3.field_13181;
      } else {
         this.field_13181 = var1;
      }

      if (!(var3.field_13180 > var1)) {
         this.field_13180 = var3.field_13180;
      } else {
         this.field_13180 = var1;
      }
   }

   public final void method_12103(class_2693 var1) {
      this.field_13181 = Math.abs(var1.field_13181);
      this.field_13180 = Math.abs(var1.field_13180);
   }

   public final void method_12093(double var1, double var3) {
      if (!(this.field_13181 > var3)) {
         if (this.field_13181 < var1) {
            this.field_13181 = var1;
         }
      } else {
         this.field_13181 = var3;
      }

      if (!(this.field_13180 > var3)) {
         if (this.field_13180 < var1) {
            this.field_13180 = var1;
         }
      } else {
         this.field_13180 = var3;
      }
   }

   public final void method_12082(double var1) {
      if (this.field_13181 < var1) {
         this.field_13181 = var1;
      }

      if (this.field_13180 < var1) {
         this.field_13180 = var1;
      }
   }

   public final void method_12105(double var1) {
      if (this.field_13181 > var1) {
         this.field_13181 = var1;
      }

      if (this.field_13180 > var1) {
         this.field_13180 = var1;
      }
   }

   public final void method_12102() {
      this.field_13181 = Math.abs(this.field_13181);
      this.field_13180 = Math.abs(this.field_13180);
   }

   public final void method_12081(class_2693 var1, class_2693 var2, double var3) {
      this.field_13181 = (1.0 - var3) * var1.field_13181 + var3 * var2.field_13181;
      this.field_13180 = (1.0 - var3) * var1.field_13180 + var3 * var2.field_13180;
   }

   public final void method_12080(class_2693 var1, double var2) {
      this.field_13181 = (1.0 - var2) * this.field_13181 + var2 * var1.field_13181;
      this.field_13180 = (1.0 - var2) * this.field_13180 + var2 * var1.field_13180;
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var4) {
         throw new InternalError();
      }
   }

   public final double method_12108() {
      return this.field_13181;
   }

   public final void method_12095(double var1) {
      this.field_13181 = var1;
   }

   public final double method_12084() {
      return this.field_13180;
   }

   public final void method_12104(double var1) {
      this.field_13180 = var1;
   }
}

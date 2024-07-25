package remapped;

import java.io.Serializable;

public abstract class class_6064 implements Serializable, Cloneable {
   public static final long field_31018 = 9011180388985266884L;
   public float field_31017;
   public float field_31019;

   public class_6064(float var1, float var2) {
      this.field_31017 = var1;
      this.field_31019 = var2;
   }

   public class_6064(float[] var1) {
      this.field_31017 = var1[0];
      this.field_31019 = var1[1];
   }

   public class_6064(class_6064 var1) {
      this.field_31017 = var1.field_31017;
      this.field_31019 = var1.field_31019;
   }

   public class_6064(class_2693 var1) {
      this.field_31017 = (float)var1.field_13181;
      this.field_31019 = (float)var1.field_13180;
   }

   public class_6064() {
      this.field_31017 = 0.0F;
      this.field_31019 = 0.0F;
   }

   public final void method_27762(float var1, float var2) {
      this.field_31017 = var1;
      this.field_31019 = var2;
   }

   public final void method_27765(float[] var1) {
      this.field_31017 = var1[0];
      this.field_31019 = var1[1];
   }

   public final void method_27764(class_6064 var1) {
      this.field_31017 = var1.field_31017;
      this.field_31019 = var1.field_31019;
   }

   public final void method_27763(class_2693 var1) {
      this.field_31017 = (float)var1.field_13181;
      this.field_31019 = (float)var1.field_13180;
   }

   public final void method_27735(float[] var1) {
      var1[0] = this.field_31017;
      var1[1] = this.field_31019;
   }

   public final void method_27753(class_6064 var1, class_6064 var2) {
      this.field_31017 = var1.field_31017 + var2.field_31017;
      this.field_31019 = var1.field_31019 + var2.field_31019;
   }

   public final void method_27752(class_6064 var1) {
      this.field_31017 = this.field_31017 + var1.field_31017;
      this.field_31019 = this.field_31019 + var1.field_31019;
   }

   public final void method_27746(class_6064 var1, class_6064 var2) {
      this.field_31017 = var1.field_31017 - var2.field_31017;
      this.field_31019 = var1.field_31019 - var2.field_31019;
   }

   public final void method_27745(class_6064 var1) {
      this.field_31017 = this.field_31017 - var1.field_31017;
      this.field_31019 = this.field_31019 - var1.field_31019;
   }

   public final void method_27741(class_6064 var1) {
      this.field_31017 = -var1.field_31017;
      this.field_31019 = -var1.field_31019;
   }

   public final void method_27740() {
      this.field_31017 = -this.field_31017;
      this.field_31019 = -this.field_31019;
   }

   public final void method_27757(float var1, class_6064 var2) {
      this.field_31017 = var1 * var2.field_31017;
      this.field_31019 = var1 * var2.field_31019;
   }

   public final void method_27756(float var1) {
      this.field_31017 *= var1;
      this.field_31019 *= var1;
   }

   public final void method_27750(float var1, class_6064 var2, class_6064 var3) {
      this.field_31017 = var1 * var2.field_31017 + var3.field_31017;
      this.field_31019 = var1 * var2.field_31019 + var3.field_31019;
   }

   public final void method_27749(float var1, class_6064 var2) {
      this.field_31017 = var1 * this.field_31017 + var2.field_31017;
      this.field_31019 = var1 * this.field_31019 + var2.field_31019;
   }

   @Override
   public int hashCode() {
      long var3 = 1L;
      var3 = 31L * var3 + (long)class_9845.method_45351(this.field_31017);
      var3 = 31L * var3 + (long)class_9845.method_45351(this.field_31019);
      return (int)(var3 ^ var3 >> 32);
   }

   public boolean equals(class_6064 var1) {
      try {
         return this.field_31017 == var1.field_31017 && this.field_31019 == var1.field_31019;
      } catch (NullPointerException var5) {
         return false;
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         class_6064 var4 = (class_6064)var1;
         return this.field_31017 == var4.field_31017 && this.field_31019 == var4.field_31019;
      } catch (NullPointerException var5) {
         return false;
      } catch (ClassCastException var6) {
         return false;
      }
   }

   public boolean method_27736(class_6064 var1, float var2) {
      float var5 = this.field_31017 - var1.field_31017;
      if (!Float.isNaN(var5)) {
         if (!((!(var5 < 0.0F) ? var5 : -var5) > var2)) {
            var5 = this.field_31019 - var1.field_31019;
            return !Float.isNaN(var5) ? !((!(var5 < 0.0F) ? var5 : -var5) > var2) : false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "(" + this.field_31017 + ", " + this.field_31019 + ")";
   }

   public final void method_27759(float var1, float var2, class_6064 var3) {
      if (!(var3.field_31017 > var2)) {
         if (!(var3.field_31017 < var1)) {
            this.field_31017 = var3.field_31017;
         } else {
            this.field_31017 = var1;
         }
      } else {
         this.field_31017 = var2;
      }

      if (!(var3.field_31019 > var2)) {
         if (!(var3.field_31019 < var1)) {
            this.field_31019 = var3.field_31019;
         } else {
            this.field_31019 = var1;
         }
      } else {
         this.field_31019 = var2;
      }
   }

   public final void method_27761(float var1, class_6064 var2) {
      if (!(var2.field_31017 < var1)) {
         this.field_31017 = var2.field_31017;
      } else {
         this.field_31017 = var1;
      }

      if (!(var2.field_31019 < var1)) {
         this.field_31019 = var2.field_31019;
      } else {
         this.field_31019 = var1;
      }
   }

   public final void method_27755(float var1, class_6064 var2) {
      if (!(var2.field_31017 > var1)) {
         this.field_31017 = var2.field_31017;
      } else {
         this.field_31017 = var1;
      }

      if (!(var2.field_31019 > var1)) {
         this.field_31019 = var2.field_31019;
      } else {
         this.field_31019 = var1;
      }
   }

   public final void method_27748(class_6064 var1) {
      this.field_31017 = Math.abs(var1.field_31017);
      this.field_31019 = Math.abs(var1.field_31019);
   }

   public final void method_27758(float var1, float var2) {
      if (!(this.field_31017 > var2)) {
         if (this.field_31017 < var1) {
            this.field_31017 = var1;
         }
      } else {
         this.field_31017 = var2;
      }

      if (!(this.field_31019 > var2)) {
         if (this.field_31019 < var1) {
            this.field_31019 = var1;
         }
      } else {
         this.field_31019 = var2;
      }
   }

   public final void method_27760(float var1) {
      if (this.field_31017 < var1) {
         this.field_31017 = var1;
      }

      if (this.field_31019 < var1) {
         this.field_31019 = var1;
      }
   }

   public final void method_27754(float var1) {
      if (this.field_31017 > var1) {
         this.field_31017 = var1;
      }

      if (this.field_31019 > var1) {
         this.field_31019 = var1;
      }
   }

   public final void method_27747() {
      this.field_31017 = Math.abs(this.field_31017);
      this.field_31019 = Math.abs(this.field_31019);
   }

   public final void method_27744(class_6064 var1, class_6064 var2, float var3) {
      this.field_31017 = (1.0F - var3) * var1.field_31017 + var3 * var2.field_31017;
      this.field_31019 = (1.0F - var3) * var1.field_31019 + var3 * var2.field_31019;
   }

   public final void method_27743(class_6064 var1, float var2) {
      this.field_31017 = (1.0F - var2) * this.field_31017 + var2 * var1.field_31017;
      this.field_31019 = (1.0F - var2) * this.field_31019 + var2 * var1.field_31019;
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var4) {
         throw new InternalError();
      }
   }

   public final float method_27737() {
      return this.field_31017;
   }

   public final void method_27739(float var1) {
      this.field_31017 = var1;
   }

   public final float method_27751() {
      return this.field_31019;
   }

   public final void method_27742(float var1) {
      this.field_31019 = var1;
   }
}

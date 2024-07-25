package remapped;

import java.io.Serializable;

public class class_7441 implements Serializable, Cloneable {
   public static final long field_37926 = -163246355858070601L;
   public float field_37928;
   public float field_37931;
   public float field_37927;
   public float field_37925;
   public static final double field_37929 = 1.0E-6;

   public class_7441(float var1, float var2, float var3, float var4) {
      this.field_37928 = var1;
      this.field_37931 = var2;
      this.field_37927 = var3;
      this.field_37925 = var4;
   }

   public class_7441(float[] var1) {
      this.field_37928 = var1[0];
      this.field_37931 = var1[1];
      this.field_37927 = var1[2];
      this.field_37925 = var1[3];
   }

   public class_7441(class_7441 var1) {
      this.field_37928 = var1.field_37928;
      this.field_37931 = var1.field_37931;
      this.field_37927 = var1.field_37927;
      this.field_37925 = var1.field_37925;
   }

   public class_7441(class_9179 var1) {
      this.field_37928 = (float)var1.field_46964;
      this.field_37931 = (float)var1.field_46963;
      this.field_37927 = (float)var1.field_46965;
      this.field_37925 = (float)var1.field_46968;
   }

   public class_7441(class_6181 var1, float var2) {
      this.field_37928 = var1.field_4390;
      this.field_37931 = var1.field_4391;
      this.field_37927 = var1.field_4393;
      this.field_37925 = var2;
   }

   public class_7441() {
      this.field_37928 = 0.0F;
      this.field_37931 = 0.0F;
      this.field_37927 = 1.0F;
      this.field_37925 = 0.0F;
   }

   public final void method_33840(float var1, float var2, float var3, float var4) {
      this.field_37928 = var1;
      this.field_37931 = var2;
      this.field_37927 = var3;
      this.field_37925 = var4;
   }

   public final void method_33850(float[] var1) {
      this.field_37928 = var1[0];
      this.field_37931 = var1[1];
      this.field_37927 = var1[2];
      this.field_37925 = var1[3];
   }

   public final void method_33845(class_7441 var1) {
      this.field_37928 = var1.field_37928;
      this.field_37931 = var1.field_37931;
      this.field_37927 = var1.field_37927;
      this.field_37925 = var1.field_37925;
   }

   public final void method_33848(class_9179 var1) {
      this.field_37928 = (float)var1.field_46964;
      this.field_37931 = (float)var1.field_46963;
      this.field_37927 = (float)var1.field_46965;
      this.field_37925 = (float)var1.field_46968;
   }

   public final void method_33844(class_6181 var1, float var2) {
      this.field_37928 = var1.field_4390;
      this.field_37931 = var1.field_4391;
      this.field_37927 = var1.field_4393;
      this.field_37925 = var2;
   }

   public final void method_33859(float[] var1) {
      var1[0] = this.field_37928;
      var1[1] = this.field_37931;
      var1[2] = this.field_37927;
      var1[3] = this.field_37925;
   }

   public final void method_33846(class_8778 var1) {
      double var4 = (double)(var1.field_9014 * var1.field_9014 + var1.field_9016 * var1.field_9016 + var1.field_9013 * var1.field_9013);
      if (!(var4 > 1.0E-6)) {
         this.field_37928 = 0.0F;
         this.field_37931 = 1.0F;
         this.field_37927 = 0.0F;
         this.field_37925 = 0.0F;
      } else {
         var4 = Math.sqrt(var4);
         double var6 = 1.0 / var4;
         this.field_37928 = (float)((double)var1.field_9014 * var6);
         this.field_37931 = (float)((double)var1.field_9016 * var6);
         this.field_37927 = (float)((double)var1.field_9013 * var6);
         this.field_37925 = (float)(2.0 * Math.atan2(var4, (double)var1.field_9012));
      }
   }

   public final void method_33849(class_9400 var1) {
      double var4 = var1.field_26829 * var1.field_26829 + var1.field_26830 * var1.field_26830 + var1.field_26828 * var1.field_26828;
      if (!(var4 > 1.0E-6)) {
         this.field_37928 = 0.0F;
         this.field_37931 = 1.0F;
         this.field_37927 = 0.0F;
         this.field_37925 = 0.0F;
      } else {
         var4 = Math.sqrt(var4);
         double var6 = 1.0 / var4;
         this.field_37928 = (float)(var1.field_26829 * var6);
         this.field_37931 = (float)(var1.field_26830 * var6);
         this.field_37927 = (float)(var1.field_26828 * var6);
         this.field_37925 = (float)(2.0 * Math.atan2(var4, var1.field_26827));
      }
   }

   public final void method_33841(class_2856 var1) {
      class_3367 var4 = new class_3367();
      var1.method_13025(var4);
      this.field_37928 = var4.field_16605 - var4.field_16599;
      this.field_37931 = var4.field_16597 - var4.field_16604;
      this.field_37927 = var4.field_16606 - var4.field_16596;
      double var5 = (double)(this.field_37928 * this.field_37928 + this.field_37931 * this.field_37931 + this.field_37927 * this.field_37927);
      if (!(var5 > 1.0E-6)) {
         this.field_37928 = 0.0F;
         this.field_37931 = 1.0F;
         this.field_37927 = 0.0F;
         this.field_37925 = 0.0F;
      } else {
         var5 = Math.sqrt(var5);
         double var7 = 0.5 * var5;
         double var9 = 0.5 * ((double)(var4.field_16607 + var4.field_16602 + var4.field_16600) - 1.0);
         this.field_37925 = (float)Math.atan2(var7, var9);
         double var11 = 1.0 / var5;
         this.field_37928 = (float)((double)this.field_37928 * var11);
         this.field_37931 = (float)((double)this.field_37931 * var11);
         this.field_37927 = (float)((double)this.field_37927 * var11);
      }
   }

   public final void method_33847(class_9076 var1) {
      class_4173 var4 = new class_4173();
      var1.method_41714(var4);
      this.field_37928 = (float)(var4.field_20322 - var4.field_20319);
      this.field_37931 = (float)(var4.field_20311 - var4.field_20314);
      this.field_37927 = (float)(var4.field_20312 - var4.field_20313);
      double var5 = (double)(this.field_37928 * this.field_37928 + this.field_37931 * this.field_37931 + this.field_37927 * this.field_37927);
      if (!(var5 > 1.0E-6)) {
         this.field_37928 = 0.0F;
         this.field_37931 = 1.0F;
         this.field_37927 = 0.0F;
         this.field_37925 = 0.0F;
      } else {
         var5 = Math.sqrt(var5);
         double var7 = 0.5 * var5;
         double var9 = 0.5 * (var4.field_20304 + var4.field_20305 + var4.field_20307 - 1.0);
         this.field_37925 = (float)Math.atan2(var7, var9);
         double var11 = 1.0 / var5;
         this.field_37928 = (float)((double)this.field_37928 * var11);
         this.field_37931 = (float)((double)this.field_37931 * var11);
         this.field_37927 = (float)((double)this.field_37927 * var11);
      }
   }

   public final void method_33842(class_3367 var1) {
      this.field_37928 = var1.field_16605 - var1.field_16599;
      this.field_37931 = var1.field_16597 - var1.field_16604;
      this.field_37927 = var1.field_16606 - var1.field_16596;
      double var4 = (double)(this.field_37928 * this.field_37928 + this.field_37931 * this.field_37931 + this.field_37927 * this.field_37927);
      if (!(var4 > 1.0E-6)) {
         this.field_37928 = 0.0F;
         this.field_37931 = 1.0F;
         this.field_37927 = 0.0F;
         this.field_37925 = 0.0F;
      } else {
         var4 = Math.sqrt(var4);
         double var6 = 0.5 * var4;
         double var8 = 0.5 * ((double)(var1.field_16607 + var1.field_16602 + var1.field_16600) - 1.0);
         this.field_37925 = (float)Math.atan2(var6, var8);
         double var10 = 1.0 / var4;
         this.field_37928 = (float)((double)this.field_37928 * var10);
         this.field_37931 = (float)((double)this.field_37931 * var10);
         this.field_37927 = (float)((double)this.field_37927 * var10);
      }
   }

   public final void method_33843(class_4173 var1) {
      this.field_37928 = (float)(var1.field_20322 - var1.field_20319);
      this.field_37931 = (float)(var1.field_20311 - var1.field_20314);
      this.field_37927 = (float)(var1.field_20312 - var1.field_20313);
      double var4 = (double)(this.field_37928 * this.field_37928 + this.field_37931 * this.field_37931 + this.field_37927 * this.field_37927);
      if (!(var4 > 1.0E-6)) {
         this.field_37928 = 0.0F;
         this.field_37931 = 1.0F;
         this.field_37927 = 0.0F;
         this.field_37925 = 0.0F;
      } else {
         var4 = Math.sqrt(var4);
         double var6 = 0.5 * var4;
         double var8 = 0.5 * (var1.field_20304 + var1.field_20305 + var1.field_20307 - 1.0);
         this.field_37925 = (float)Math.atan2(var6, var8);
         double var10 = 1.0 / var4;
         this.field_37928 = (float)((double)this.field_37928 * var10);
         this.field_37931 = (float)((double)this.field_37931 * var10);
         this.field_37927 = (float)((double)this.field_37927 * var10);
      }
   }

   @Override
   public String toString() {
      return "(" + this.field_37928 + ", " + this.field_37931 + ", " + this.field_37927 + ", " + this.field_37925 + ")";
   }

   public boolean equals(class_7441 var1) {
      try {
         return this.field_37928 == var1.field_37928
            && this.field_37931 == var1.field_37931
            && this.field_37927 == var1.field_37927
            && this.field_37925 == var1.field_37925;
      } catch (NullPointerException var5) {
         return false;
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         class_7441 var4 = (class_7441)var1;
         return this.field_37928 == var4.field_37928
            && this.field_37931 == var4.field_37931
            && this.field_37927 == var4.field_37927
            && this.field_37925 == var4.field_37925;
      } catch (NullPointerException var5) {
         return false;
      } catch (ClassCastException var6) {
         return false;
      }
   }

   public boolean method_33853(class_7441 var1, float var2) {
      float var5 = this.field_37928 - var1.field_37928;
      if (!((!(var5 < 0.0F) ? var5 : -var5) > var2)) {
         var5 = this.field_37931 - var1.field_37931;
         if (!((!(var5 < 0.0F) ? var5 : -var5) > var2)) {
            var5 = this.field_37927 - var1.field_37927;
            if (!((!(var5 < 0.0F) ? var5 : -var5) > var2)) {
               var5 = this.field_37925 - var1.field_37925;
               return !((!(var5 < 0.0F) ? var5 : -var5) > var2);
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
      var3 = 31L * var3 + (long)class_9845.method_45351(this.field_37928);
      var3 = 31L * var3 + (long)class_9845.method_45351(this.field_37931);
      var3 = 31L * var3 + (long)class_9845.method_45351(this.field_37927);
      var3 = 31L * var3 + (long)class_9845.method_45351(this.field_37925);
      return (int)(var3 ^ var3 >> 32);
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var4) {
         throw new InternalError();
      }
   }

   public final float method_33852() {
      return this.field_37925;
   }

   public final void method_33851(float var1) {
      this.field_37925 = var1;
   }

   public final float method_33839() {
      return this.field_37928;
   }

   public final void method_33860(float var1) {
      this.field_37928 = var1;
   }

   public final float method_33856() {
      return this.field_37931;
   }

   public final void method_33857(float var1) {
      this.field_37931 = var1;
   }

   public final float method_33858() {
      return this.field_37927;
   }

   public final void method_33854(float var1) {
      this.field_37927 = var1;
   }
}

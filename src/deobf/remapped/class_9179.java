package remapped;

import java.io.Serializable;

public class class_9179 implements Serializable, Cloneable {
   public static final long field_46966 = 3644296204459140589L;
   public double field_46964;
   public double field_46963;
   public double field_46965;
   public double field_46968;
   public static final double field_46969 = 1.0E-6;

   public class_9179(double var1, double var3, double var5, double var7) {
      this.field_46964 = var1;
      this.field_46963 = var3;
      this.field_46965 = var5;
      this.field_46968 = var7;
   }

   public class_9179(double[] var1) {
      this.field_46964 = var1[0];
      this.field_46963 = var1[1];
      this.field_46965 = var1[2];
      this.field_46968 = var1[3];
   }

   public class_9179(class_9179 var1) {
      this.field_46964 = var1.field_46964;
      this.field_46963 = var1.field_46963;
      this.field_46965 = var1.field_46965;
      this.field_46968 = var1.field_46968;
   }

   public class_9179(class_7441 var1) {
      this.field_46964 = (double)var1.field_37928;
      this.field_46963 = (double)var1.field_37931;
      this.field_46965 = (double)var1.field_37927;
      this.field_46968 = (double)var1.field_37925;
   }

   public class_9179(class_2627 var1, double var2) {
      this.field_46964 = var1.field_17244;
      this.field_46963 = var1.field_17242;
      this.field_46965 = var1.field_17241;
      this.field_46968 = var2;
   }

   public class_9179() {
      this.field_46964 = 0.0;
      this.field_46963 = 0.0;
      this.field_46965 = 1.0;
      this.field_46968 = 0.0;
   }

   public final void method_42301(double var1, double var3, double var5, double var7) {
      this.field_46964 = var1;
      this.field_46963 = var3;
      this.field_46965 = var5;
      this.field_46968 = var7;
   }

   public final void method_42311(double[] var1) {
      this.field_46964 = var1[0];
      this.field_46963 = var1[1];
      this.field_46965 = var1[2];
      this.field_46968 = var1[3];
   }

   public final void method_42309(class_9179 var1) {
      this.field_46964 = var1.field_46964;
      this.field_46963 = var1.field_46963;
      this.field_46965 = var1.field_46965;
      this.field_46968 = var1.field_46968;
   }

   public final void method_42306(class_7441 var1) {
      this.field_46964 = (double)var1.field_37928;
      this.field_46963 = (double)var1.field_37931;
      this.field_46965 = (double)var1.field_37927;
      this.field_46968 = (double)var1.field_37925;
   }

   public final void method_42302(class_2627 var1, double var2) {
      this.field_46964 = var1.field_17244;
      this.field_46963 = var1.field_17242;
      this.field_46965 = var1.field_17241;
      this.field_46968 = var2;
   }

   public final void method_42314(double[] var1) {
      var1[0] = this.field_46964;
      var1[1] = this.field_46963;
      var1[2] = this.field_46965;
      var1[3] = this.field_46968;
   }

   public final void method_42303(class_2856 var1) {
      class_4173 var4 = new class_4173();
      var1.method_13027(var4);
      this.field_46964 = (double)((float)(var4.field_20322 - var4.field_20319));
      this.field_46963 = (double)((float)(var4.field_20311 - var4.field_20314));
      this.field_46965 = (double)((float)(var4.field_20312 - var4.field_20313));
      double var5 = this.field_46964 * this.field_46964 + this.field_46963 * this.field_46963 + this.field_46965 * this.field_46965;
      if (!(var5 > 1.0E-6)) {
         this.field_46964 = 0.0;
         this.field_46963 = 1.0;
         this.field_46965 = 0.0;
         this.field_46968 = 0.0;
      } else {
         var5 = Math.sqrt(var5);
         double var7 = 0.5 * var5;
         double var9 = 0.5 * (var4.field_20304 + var4.field_20305 + var4.field_20307 - 1.0);
         this.field_46968 = (double)((float)Math.atan2(var7, var9));
         double var11 = 1.0 / var5;
         this.field_46964 *= var11;
         this.field_46963 *= var11;
         this.field_46965 *= var11;
      }
   }

   public final void method_42308(class_9076 var1) {
      class_4173 var4 = new class_4173();
      var1.method_41714(var4);
      this.field_46964 = (double)((float)(var4.field_20322 - var4.field_20319));
      this.field_46963 = (double)((float)(var4.field_20311 - var4.field_20314));
      this.field_46965 = (double)((float)(var4.field_20312 - var4.field_20313));
      double var5 = this.field_46964 * this.field_46964 + this.field_46963 * this.field_46963 + this.field_46965 * this.field_46965;
      if (!(var5 > 1.0E-6)) {
         this.field_46964 = 0.0;
         this.field_46963 = 1.0;
         this.field_46965 = 0.0;
         this.field_46968 = 0.0;
      } else {
         var5 = Math.sqrt(var5);
         double var7 = 0.5 * var5;
         double var9 = 0.5 * (var4.field_20304 + var4.field_20305 + var4.field_20307 - 1.0);
         this.field_46968 = (double)((float)Math.atan2(var7, var9));
         double var11 = 1.0 / var5;
         this.field_46964 *= var11;
         this.field_46963 *= var11;
         this.field_46965 *= var11;
      }
   }

   public final void method_42304(class_3367 var1) {
      this.field_46964 = (double)(var1.field_16605 - var1.field_16599);
      this.field_46963 = (double)(var1.field_16597 - var1.field_16604);
      this.field_46965 = (double)(var1.field_16606 - var1.field_16596);
      double var4 = this.field_46964 * this.field_46964 + this.field_46963 * this.field_46963 + this.field_46965 * this.field_46965;
      if (!(var4 > 1.0E-6)) {
         this.field_46964 = 0.0;
         this.field_46963 = 1.0;
         this.field_46965 = 0.0;
         this.field_46968 = 0.0;
      } else {
         var4 = Math.sqrt(var4);
         double var6 = 0.5 * var4;
         double var8 = 0.5 * ((double)(var1.field_16607 + var1.field_16602 + var1.field_16600) - 1.0);
         this.field_46968 = (double)((float)Math.atan2(var6, var8));
         double var10 = 1.0 / var4;
         this.field_46964 *= var10;
         this.field_46963 *= var10;
         this.field_46965 *= var10;
      }
   }

   public final void method_42305(class_4173 var1) {
      this.field_46964 = (double)((float)(var1.field_20322 - var1.field_20319));
      this.field_46963 = (double)((float)(var1.field_20311 - var1.field_20314));
      this.field_46965 = (double)((float)(var1.field_20312 - var1.field_20313));
      double var4 = this.field_46964 * this.field_46964 + this.field_46963 * this.field_46963 + this.field_46965 * this.field_46965;
      if (!(var4 > 1.0E-6)) {
         this.field_46964 = 0.0;
         this.field_46963 = 1.0;
         this.field_46965 = 0.0;
         this.field_46968 = 0.0;
      } else {
         var4 = Math.sqrt(var4);
         double var6 = 0.5 * var4;
         double var8 = 0.5 * (var1.field_20304 + var1.field_20305 + var1.field_20307 - 1.0);
         this.field_46968 = (double)((float)Math.atan2(var6, var8));
         double var10 = 1.0 / var4;
         this.field_46964 *= var10;
         this.field_46963 *= var10;
         this.field_46965 *= var10;
      }
   }

   public final void method_42307(class_8778 var1) {
      double var4 = (double)(var1.field_9014 * var1.field_9014 + var1.field_9016 * var1.field_9016 + var1.field_9013 * var1.field_9013);
      if (!(var4 > 1.0E-6)) {
         this.field_46964 = 0.0;
         this.field_46963 = 1.0;
         this.field_46965 = 0.0;
         this.field_46968 = 0.0;
      } else {
         var4 = Math.sqrt(var4);
         double var6 = 1.0 / var4;
         this.field_46964 = (double)var1.field_9014 * var6;
         this.field_46963 = (double)var1.field_9016 * var6;
         this.field_46965 = (double)var1.field_9013 * var6;
         this.field_46968 = 2.0 * Math.atan2(var4, (double)var1.field_9012);
      }
   }

   public final void method_42310(class_9400 var1) {
      double var4 = var1.field_26829 * var1.field_26829 + var1.field_26830 * var1.field_26830 + var1.field_26828 * var1.field_26828;
      if (!(var4 > 1.0E-6)) {
         this.field_46964 = 0.0;
         this.field_46963 = 1.0;
         this.field_46965 = 0.0;
         this.field_46968 = 0.0;
      } else {
         var4 = Math.sqrt(var4);
         double var6 = 1.0 / var4;
         this.field_46964 = var1.field_26829 * var6;
         this.field_46963 = var1.field_26830 * var6;
         this.field_46965 = var1.field_26828 * var6;
         this.field_46968 = 2.0 * Math.atan2(var4, var1.field_26827);
      }
   }

   @Override
   public String toString() {
      return "(" + this.field_46964 + ", " + this.field_46963 + ", " + this.field_46965 + ", " + this.field_46968 + ")";
   }

   public boolean equals(class_9179 var1) {
      try {
         return this.field_46964 == var1.field_46964
            && this.field_46963 == var1.field_46963
            && this.field_46965 == var1.field_46965
            && this.field_46968 == var1.field_46968;
      } catch (NullPointerException var5) {
         return false;
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         class_9179 var4 = (class_9179)var1;
         return this.field_46964 == var4.field_46964
            && this.field_46963 == var4.field_46963
            && this.field_46965 == var4.field_46965
            && this.field_46968 == var4.field_46968;
      } catch (NullPointerException var5) {
         return false;
      } catch (ClassCastException var6) {
         return false;
      }
   }

   public boolean method_42298(class_9179 var1, double var2) {
      double var6 = this.field_46964 - var1.field_46964;
      if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
         var6 = this.field_46963 - var1.field_46963;
         if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
            var6 = this.field_46965 - var1.field_46965;
            if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
               var6 = this.field_46968 - var1.field_46968;
               return !((!(var6 < 0.0) ? var6 : -var6) > var2);
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
      var3 = 31L * var3 + class_9845.method_45350(this.field_46964);
      var3 = 31L * var3 + class_9845.method_45350(this.field_46963);
      var3 = 31L * var3 + class_9845.method_45350(this.field_46965);
      var3 = 31L * var3 + class_9845.method_45350(this.field_46968);
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

   public final double method_42295() {
      return this.field_46968;
   }

   public final void method_42296(double var1) {
      this.field_46968 = var1;
   }

   public double method_42299() {
      return this.field_46964;
   }

   public final void method_42312(double var1) {
      this.field_46964 = var1;
   }

   public final double method_42293() {
      return this.field_46963;
   }

   public final void method_42300(double var1) {
      this.field_46963 = var1;
   }

   public double method_42294() {
      return this.field_46965;
   }

   public final void method_42297(double var1) {
      this.field_46965 = var1;
   }
}

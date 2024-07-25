package remapped;

import java.io.Serializable;

public class class_9400 extends class_5230 implements Serializable {
   private static String[] field_48064;
   public static final long field_48062 = 7577479888820201099L;
   public static final double field_48063 = 1.0E-6;
   public static final double field_48065 = 1.0E-30;
   public static final double field_48066 = 1.57079632679;

   public class_9400(double var1, double var3, double var5, double var7) {
      double var11 = 1.0 / Math.sqrt(var1 * var1 + var3 * var3 + var5 * var5 + var7 * var7);
      this.field_26829 = var1 * var11;
      this.field_26830 = var3 * var11;
      this.field_26828 = var5 * var11;
      this.field_26827 = var7 * var11;
   }

   public class_9400(double[] var1) {
      double var4 = 1.0 / Math.sqrt(var1[0] * var1[0] + var1[1] * var1[1] + var1[2] * var1[2] + var1[3] * var1[3]);
      this.field_26829 = var1[0] * var4;
      this.field_26830 = var1[1] * var4;
      this.field_26828 = var1[2] * var4;
      this.field_26827 = var1[3] * var4;
   }

   public class_9400(class_9400 var1) {
      super(var1);
   }

   public class_9400(class_8778 var1) {
      super(var1);
   }

   public class_9400(class_1752 var1) {
      double var4 = 1.0
         / Math.sqrt(
            (double)(
               var1.field_9014 * var1.field_9014 + var1.field_9016 * var1.field_9016 + var1.field_9013 * var1.field_9013 + var1.field_9012 * var1.field_9012
            )
         );
      this.field_26829 = (double)var1.field_9014 * var4;
      this.field_26830 = (double)var1.field_9016 * var4;
      this.field_26828 = (double)var1.field_9013 * var4;
      this.field_26827 = (double)var1.field_9012 * var4;
   }

   public class_9400(class_5230 var1) {
      double var4 = 1.0
         / Math.sqrt(
            var1.field_26829 * var1.field_26829
               + var1.field_26830 * var1.field_26830
               + var1.field_26828 * var1.field_26828
               + var1.field_26827 * var1.field_26827
         );
      this.field_26829 = var1.field_26829 * var4;
      this.field_26830 = var1.field_26830 * var4;
      this.field_26828 = var1.field_26828 * var4;
      this.field_26827 = var1.field_26827 * var4;
   }

   public class_9400() {
   }

   public final void method_43527(class_9400 var1) {
      this.field_26829 = -var1.field_26829;
      this.field_26830 = -var1.field_26830;
      this.field_26828 = -var1.field_26828;
      this.field_26827 = var1.field_26827;
   }

   public final void method_43526() {
      this.field_26829 = -this.field_26829;
      this.field_26830 = -this.field_26830;
      this.field_26828 = -this.field_26828;
   }

   public final void method_43533(class_9400 var1, class_9400 var2) {
      if (this != var1 && this != var2) {
         this.field_26827 = var1.field_26827 * var2.field_26827
            - var1.field_26829 * var2.field_26829
            - var1.field_26830 * var2.field_26830
            - var1.field_26828 * var2.field_26828;
         this.field_26829 = var1.field_26827 * var2.field_26829
            + var2.field_26827 * var1.field_26829
            + var1.field_26830 * var2.field_26828
            - var1.field_26828 * var2.field_26830;
         this.field_26830 = var1.field_26827 * var2.field_26830
            + var2.field_26827 * var1.field_26830
            - var1.field_26829 * var2.field_26828
            + var1.field_26828 * var2.field_26829;
         this.field_26828 = var1.field_26827 * var2.field_26828
            + var2.field_26827 * var1.field_26828
            + var1.field_26829 * var2.field_26830
            - var1.field_26830 * var2.field_26829;
      } else {
         double var5 = var1.field_26827 * var2.field_26827
            - var1.field_26829 * var2.field_26829
            - var1.field_26830 * var2.field_26830
            - var1.field_26828 * var2.field_26828;
         double var7 = var1.field_26827 * var2.field_26829
            + var2.field_26827 * var1.field_26829
            + var1.field_26830 * var2.field_26828
            - var1.field_26828 * var2.field_26830;
         double var9 = var1.field_26827 * var2.field_26830
            + var2.field_26827 * var1.field_26830
            - var1.field_26829 * var2.field_26828
            + var1.field_26828 * var2.field_26829;
         this.field_26828 = var1.field_26827 * var2.field_26828
            + var2.field_26827 * var1.field_26828
            + var1.field_26829 * var2.field_26830
            - var1.field_26830 * var2.field_26829;
         this.field_26827 = var5;
         this.field_26829 = var7;
         this.field_26830 = var9;
      }
   }

   public final void method_43532(class_9400 var1) {
      double var4 = this.field_26827 * var1.field_26827
         - this.field_26829 * var1.field_26829
         - this.field_26830 * var1.field_26830
         - this.field_26828 * var1.field_26828;
      double var6 = this.field_26827 * var1.field_26829
         + var1.field_26827 * this.field_26829
         + this.field_26830 * var1.field_26828
         - this.field_26828 * var1.field_26830;
      double var8 = this.field_26827 * var1.field_26830
         + var1.field_26827 * this.field_26830
         - this.field_26829 * var1.field_26828
         + this.field_26828 * var1.field_26829;
      this.field_26828 = this.field_26827 * var1.field_26828
         + var1.field_26827 * this.field_26828
         + this.field_26829 * var1.field_26830
         - this.field_26830 * var1.field_26829;
      this.field_26827 = var4;
      this.field_26829 = var6;
      this.field_26830 = var8;
   }

   public final void method_43537(class_9400 var1, class_9400 var2) {
      class_9400 var5 = new class_9400(var2);
      var5.method_43530();
      this.method_43533(var1, var5);
   }

   public final void method_43536(class_9400 var1) {
      class_9400 var4 = new class_9400(var1);
      var4.method_43530();
      this.method_43532(var4);
   }

   public final void method_43531(class_9400 var1) {
      double var4 = 1.0
         / (
            var1.field_26827 * var1.field_26827
               + var1.field_26829 * var1.field_26829
               + var1.field_26830 * var1.field_26830
               + var1.field_26828 * var1.field_26828
         );
      this.field_26827 = var4 * var1.field_26827;
      this.field_26829 = -var4 * var1.field_26829;
      this.field_26830 = -var4 * var1.field_26830;
      this.field_26828 = -var4 * var1.field_26828;
   }

   public final void method_43530() {
      double var3 = 1.0
         / (
            this.field_26827 * this.field_26827
               + this.field_26829 * this.field_26829
               + this.field_26830 * this.field_26830
               + this.field_26828 * this.field_26828
         );
      this.field_26827 *= var3;
      this.field_26829 *= -var3;
      this.field_26830 *= -var3;
      this.field_26828 *= -var3;
   }

   public final void method_43535(class_9400 var1) {
      double var4 = var1.field_26829 * var1.field_26829
         + var1.field_26830 * var1.field_26830
         + var1.field_26828 * var1.field_26828
         + var1.field_26827 * var1.field_26827;
      if (!(var4 > 0.0)) {
         this.field_26829 = 0.0;
         this.field_26830 = 0.0;
         this.field_26828 = 0.0;
         this.field_26827 = 0.0;
      } else {
         var4 = 1.0 / Math.sqrt(var4);
         this.field_26829 = var4 * var1.field_26829;
         this.field_26830 = var4 * var1.field_26830;
         this.field_26828 = var4 * var1.field_26828;
         this.field_26827 = var4 * var1.field_26827;
      }
   }

   public final void method_43534() {
      double var3 = this.field_26829 * this.field_26829
         + this.field_26830 * this.field_26830
         + this.field_26828 * this.field_26828
         + this.field_26827 * this.field_26827;
      if (!(var3 > 0.0)) {
         this.field_26829 = 0.0;
         this.field_26830 = 0.0;
         this.field_26828 = 0.0;
         this.field_26827 = 0.0;
      } else {
         var3 = 1.0 / Math.sqrt(var3);
         this.field_26829 *= var3;
         this.field_26830 *= var3;
         this.field_26828 *= var3;
         this.field_26827 *= var3;
      }
   }

   public final void method_43520(class_2856 var1) {
      double var4 = 0.25 * (double)(var1.field_13977 + var1.field_13979 + var1.field_13978 + var1.field_13988);
      if (!(var4 >= 0.0)) {
         this.field_26827 = 0.0;
         this.field_26829 = 0.0;
         this.field_26830 = 0.0;
         this.field_26828 = 1.0;
      } else if (!(var4 >= 1.0E-30)) {
         this.field_26827 = 0.0;
         var4 = -0.5 * (double)(var1.field_13979 + var1.field_13978);
         if (!(var4 >= 0.0)) {
            this.field_26829 = 0.0;
            this.field_26830 = 0.0;
            this.field_26828 = 1.0;
         } else if (!(var4 >= 1.0E-30)) {
            this.field_26829 = 0.0;
            var4 = 0.5 * (1.0 - (double)var1.field_13978);
            if (!(var4 >= 1.0E-30)) {
               this.field_26830 = 0.0;
               this.field_26828 = 1.0;
            } else {
               this.field_26830 = Math.sqrt(var4);
               this.field_26828 = (double)var1.field_13992 / (2.0 * this.field_26830);
            }
         } else {
            this.field_26829 = Math.sqrt(var4);
            var4 = 1.0 / (2.0 * this.field_26829);
            this.field_26830 = (double)var1.field_13993 * var4;
            this.field_26828 = (double)var1.field_13983 * var4;
         }
      } else {
         this.field_26827 = Math.sqrt(var4);
         var4 = 0.25 / this.field_26827;
         this.field_26829 = (double)(var1.field_13992 - var1.field_13989) * var4;
         this.field_26830 = (double)(var1.field_13976 - var1.field_13983) * var4;
         this.field_26828 = (double)(var1.field_13993 - var1.field_13991) * var4;
      }
   }

   public final void method_43524(class_9076 var1) {
      double var4 = 0.25 * (var1.field_46473 + var1.field_46467 + var1.field_46468 + var1.field_46457);
      if (!(var4 >= 0.0)) {
         this.field_26827 = 0.0;
         this.field_26829 = 0.0;
         this.field_26830 = 0.0;
         this.field_26828 = 1.0;
      } else if (!(var4 >= 1.0E-30)) {
         this.field_26827 = 0.0;
         var4 = -0.5 * (var1.field_46467 + var1.field_46468);
         if (!(var4 >= 0.0)) {
            this.field_26829 = 0.0;
            this.field_26830 = 0.0;
            this.field_26828 = 1.0;
         } else if (!(var4 >= 1.0E-30)) {
            this.field_26829 = 0.0;
            var4 = 0.5 * (1.0 - var1.field_46468);
            if (!(var4 >= 1.0E-30)) {
               this.field_26830 = 0.0;
               this.field_26828 = 1.0;
            } else {
               this.field_26830 = Math.sqrt(var4);
               this.field_26828 = var1.field_46469 / (2.0 * this.field_26830);
            }
         } else {
            this.field_26829 = Math.sqrt(var4);
            var4 = 0.5 / this.field_26829;
            this.field_26830 = var1.field_46458 * var4;
            this.field_26828 = var1.field_46470 * var4;
         }
      } else {
         this.field_26827 = Math.sqrt(var4);
         var4 = 0.25 / this.field_26827;
         this.field_26829 = (var1.field_46469 - var1.field_46464) * var4;
         this.field_26830 = (var1.field_46474 - var1.field_46470) * var4;
         this.field_26828 = (var1.field_46458 - var1.field_46466) * var4;
      }
   }

   public final void method_43521(class_3367 var1) {
      double var4 = 0.25 * ((double)(var1.field_16607 + var1.field_16602 + var1.field_16600) + 1.0);
      if (!(var4 >= 0.0)) {
         this.field_26827 = 0.0;
         this.field_26829 = 0.0;
         this.field_26830 = 0.0;
         this.field_26828 = 1.0;
      } else if (!(var4 >= 1.0E-30)) {
         this.field_26827 = 0.0;
         var4 = -0.5 * (double)(var1.field_16602 + var1.field_16600);
         if (!(var4 >= 0.0)) {
            this.field_26829 = 0.0;
            this.field_26830 = 0.0;
            this.field_26828 = 1.0;
         } else if (!(var4 >= 1.0E-30)) {
            this.field_26829 = 0.0;
            var4 = 0.5 * (1.0 - (double)var1.field_16600);
            if (var4 >= 1.0E-30) {
               this.field_26830 = Math.sqrt(var4);
               this.field_26828 = (double)var1.field_16605 / (2.0 * this.field_26830);
            }

            this.field_26830 = 0.0;
            this.field_26828 = 1.0;
         } else {
            this.field_26829 = Math.sqrt(var4);
            var4 = 0.5 / this.field_26829;
            this.field_26830 = (double)var1.field_16606 * var4;
            this.field_26828 = (double)var1.field_16604 * var4;
         }
      } else {
         this.field_26827 = Math.sqrt(var4);
         var4 = 0.25 / this.field_26827;
         this.field_26829 = (double)(var1.field_16605 - var1.field_16599) * var4;
         this.field_26830 = (double)(var1.field_16597 - var1.field_16604) * var4;
         this.field_26828 = (double)(var1.field_16606 - var1.field_16596) * var4;
      }
   }

   public final void method_43522(class_4173 var1) {
      double var4 = 0.25 * (var1.field_20304 + var1.field_20305 + var1.field_20307 + 1.0);
      if (!(var4 >= 0.0)) {
         this.field_26827 = 0.0;
         this.field_26829 = 0.0;
         this.field_26830 = 0.0;
         this.field_26828 = 1.0;
      } else if (!(var4 >= 1.0E-30)) {
         this.field_26827 = 0.0;
         var4 = -0.5 * (var1.field_20305 + var1.field_20307);
         if (!(var4 >= 0.0)) {
            this.field_26829 = 0.0;
            this.field_26830 = 0.0;
            this.field_26828 = 1.0;
         } else if (!(var4 >= 1.0E-30)) {
            this.field_26829 = 0.0;
            var4 = 0.5 * (1.0 - var1.field_20307);
            if (!(var4 >= 1.0E-30)) {
               this.field_26830 = 0.0;
               this.field_26828 = 1.0;
            } else {
               this.field_26830 = Math.sqrt(var4);
               this.field_26828 = var1.field_20322 / (2.0 * this.field_26830);
            }
         } else {
            this.field_26829 = Math.sqrt(var4);
            var4 = 0.5 / this.field_26829;
            this.field_26830 = var1.field_20312 * var4;
            this.field_26828 = var1.field_20314 * var4;
         }
      } else {
         this.field_26827 = Math.sqrt(var4);
         var4 = 0.25 / this.field_26827;
         this.field_26829 = (var1.field_20322 - var1.field_20319) * var4;
         this.field_26830 = (var1.field_20311 - var1.field_20314) * var4;
         this.field_26828 = (var1.field_20312 - var1.field_20313) * var4;
      }
   }

   public final void method_43523(class_7441 var1) {
      double var4 = Math.sqrt((double)(var1.field_37928 * var1.field_37928 + var1.field_37931 * var1.field_37931 + var1.field_37927 * var1.field_37927));
      if (!(var4 < 1.0E-6)) {
         double var6 = Math.sin((double)var1.field_37925 / 2.0);
         var4 = 1.0 / var4;
         this.field_26827 = Math.cos((double)var1.field_37925 / 2.0);
         this.field_26829 = (double)var1.field_37928 * var4 * var6;
         this.field_26830 = (double)var1.field_37931 * var4 * var6;
         this.field_26828 = (double)var1.field_37927 * var4 * var6;
      } else {
         this.field_26827 = 0.0;
         this.field_26829 = 0.0;
         this.field_26830 = 0.0;
         this.field_26828 = 0.0;
      }
   }

   public final void method_43525(class_9179 var1) {
      double var4 = Math.sqrt(var1.field_46964 * var1.field_46964 + var1.field_46963 * var1.field_46963 + var1.field_46965 * var1.field_46965);
      if (!(var4 < 1.0E-6)) {
         var4 = 1.0 / var4;
         double var6 = Math.sin(var1.field_46968 / 2.0);
         this.field_26827 = Math.cos(var1.field_46968 / 2.0);
         this.field_26829 = var1.field_46964 * var4 * var6;
         this.field_26830 = var1.field_46963 * var4 * var6;
         this.field_26828 = var1.field_46965 * var4 * var6;
      } else {
         this.field_26827 = 0.0;
         this.field_26829 = 0.0;
         this.field_26830 = 0.0;
         this.field_26828 = 0.0;
      }
   }

   public final void method_43528(class_9400 var1, double var2) {
      double var6 = this.field_26829 * var1.field_26829
         + this.field_26830 * var1.field_26830
         + this.field_26828 * var1.field_26828
         + this.field_26827 * var1.field_26827;
      if (var6 < 0.0) {
         var1.field_26829 = -var1.field_26829;
         var1.field_26830 = -var1.field_26830;
         var1.field_26828 = -var1.field_26828;
         var1.field_26827 = -var1.field_26827;
         var6 = -var6;
      }

      double var8;
      double var10;
      if (!(1.0 - var6 > 1.0E-6)) {
         var8 = 1.0 - var2;
         var10 = var2;
      } else {
         double var12 = Math.acos(var6);
         double var14 = Math.sin(var12);
         var8 = Math.sin((1.0 - var2) * var12) / var14;
         var10 = Math.sin(var2 * var12) / var14;
      }

      this.field_26827 = var8 * this.field_26827 + var10 * var1.field_26827;
      this.field_26829 = var8 * this.field_26829 + var10 * var1.field_26829;
      this.field_26830 = var8 * this.field_26830 + var10 * var1.field_26830;
      this.field_26828 = var8 * this.field_26828 + var10 * var1.field_26828;
   }

   public final void method_43529(class_9400 var1, class_9400 var2, double var3) {
      double var7 = var2.field_26829 * var1.field_26829
         + var2.field_26830 * var1.field_26830
         + var2.field_26828 * var1.field_26828
         + var2.field_26827 * var1.field_26827;
      if (var7 < 0.0) {
         var1.field_26829 = -var1.field_26829;
         var1.field_26830 = -var1.field_26830;
         var1.field_26828 = -var1.field_26828;
         var1.field_26827 = -var1.field_26827;
         var7 = -var7;
      }

      double var9;
      double var11;
      if (!(1.0 - var7 > 1.0E-6)) {
         var9 = 1.0 - var3;
         var11 = var3;
      } else {
         double var13 = Math.acos(var7);
         double var15 = Math.sin(var13);
         var9 = Math.sin((1.0 - var3) * var13) / var15;
         var11 = Math.sin(var3 * var13) / var15;
      }

      this.field_26827 = var9 * var1.field_26827 + var11 * var2.field_26827;
      this.field_26829 = var9 * var1.field_26829 + var11 * var2.field_26829;
      this.field_26830 = var9 * var1.field_26830 + var11 * var2.field_26830;
      this.field_26828 = var9 * var1.field_26828 + var11 * var2.field_26828;
   }
}

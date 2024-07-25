package remapped;

import java.io.Serializable;

public class class_8778 extends class_1752 implements Serializable {
   private static String[] field_44925;
   public static final long field_44926 = 2675933778405442383L;
   public static final double field_44927 = 1.0E-6;
   public static final double field_44924 = 1.0E-30;
   public static final double field_44928 = 1.57079632679;

   public class_8778(float var1, float var2, float var3, float var4) {
      float var7 = (float)(1.0 / Math.sqrt((double)(var1 * var1 + var2 * var2 + var3 * var3 + var4 * var4)));
      this.field_9014 = var1 * var7;
      this.field_9016 = var2 * var7;
      this.field_9013 = var3 * var7;
      this.field_9012 = var4 * var7;
   }

   public class_8778(float[] var1) {
      float var4 = (float)(1.0 / Math.sqrt((double)(var1[0] * var1[0] + var1[1] * var1[1] + var1[2] * var1[2] + var1[3] * var1[3])));
      this.field_9014 = var1[0] * var4;
      this.field_9016 = var1[1] * var4;
      this.field_9013 = var1[2] * var4;
      this.field_9012 = var1[3] * var4;
   }

   public class_8778(class_8778 var1) {
      super(var1);
   }

   public class_8778(class_9400 var1) {
      super(var1);
   }

   public class_8778(class_1752 var1) {
      float var4 = (float)(
         1.0
            / Math.sqrt(
               (double)(
                  var1.field_9014 * var1.field_9014 + var1.field_9016 * var1.field_9016 + var1.field_9013 * var1.field_9013 + var1.field_9012 * var1.field_9012
               )
            )
      );
      this.field_9014 = var1.field_9014 * var4;
      this.field_9016 = var1.field_9016 * var4;
      this.field_9013 = var1.field_9013 * var4;
      this.field_9012 = var1.field_9012 * var4;
   }

   public class_8778(class_5230 var1) {
      double var4 = 1.0
         / Math.sqrt(
            var1.field_26829 * var1.field_26829
               + var1.field_26830 * var1.field_26830
               + var1.field_26828 * var1.field_26828
               + var1.field_26827 * var1.field_26827
         );
      this.field_9014 = (float)(var1.field_26829 * var4);
      this.field_9016 = (float)(var1.field_26830 * var4);
      this.field_9013 = (float)(var1.field_26828 * var4);
      this.field_9012 = (float)(var1.field_26827 * var4);
   }

   public class_8778() {
   }

   public final void method_40351(class_8778 var1) {
      this.field_9014 = -var1.field_9014;
      this.field_9016 = -var1.field_9016;
      this.field_9013 = -var1.field_9013;
      this.field_9012 = var1.field_9012;
   }

   public final void method_40350() {
      this.field_9014 = -this.field_9014;
      this.field_9016 = -this.field_9016;
      this.field_9013 = -this.field_9013;
   }

   public final void method_40353(class_8778 var1, class_8778 var2) {
      if (this != var1 && this != var2) {
         this.field_9012 = var1.field_9012 * var2.field_9012
            - var1.field_9014 * var2.field_9014
            - var1.field_9016 * var2.field_9016
            - var1.field_9013 * var2.field_9013;
         this.field_9014 = var1.field_9012 * var2.field_9014
            + var2.field_9012 * var1.field_9014
            + var1.field_9016 * var2.field_9013
            - var1.field_9013 * var2.field_9016;
         this.field_9016 = var1.field_9012 * var2.field_9016
            + var2.field_9012 * var1.field_9016
            - var1.field_9014 * var2.field_9013
            + var1.field_9013 * var2.field_9014;
         this.field_9013 = var1.field_9012 * var2.field_9013
            + var2.field_9012 * var1.field_9013
            + var1.field_9014 * var2.field_9016
            - var1.field_9016 * var2.field_9014;
      } else {
         float var5 = var1.field_9012 * var2.field_9012
            - var1.field_9014 * var2.field_9014
            - var1.field_9016 * var2.field_9016
            - var1.field_9013 * var2.field_9013;
         float var6 = var1.field_9012 * var2.field_9014
            + var2.field_9012 * var1.field_9014
            + var1.field_9016 * var2.field_9013
            - var1.field_9013 * var2.field_9016;
         float var7 = var1.field_9012 * var2.field_9016
            + var2.field_9012 * var1.field_9016
            - var1.field_9014 * var2.field_9013
            + var1.field_9013 * var2.field_9014;
         this.field_9013 = var1.field_9012 * var2.field_9013
            + var2.field_9012 * var1.field_9013
            + var1.field_9014 * var2.field_9016
            - var1.field_9016 * var2.field_9014;
         this.field_9012 = var5;
         this.field_9014 = var6;
         this.field_9016 = var7;
      }
   }

   public final void method_40352(class_8778 var1) {
      float var4 = this.field_9012 * var1.field_9012
         - this.field_9014 * var1.field_9014
         - this.field_9016 * var1.field_9016
         - this.field_9013 * var1.field_9013;
      float var5 = this.field_9012 * var1.field_9014
         + var1.field_9012 * this.field_9014
         + this.field_9016 * var1.field_9013
         - this.field_9013 * var1.field_9016;
      float var6 = this.field_9012 * var1.field_9016
         + var1.field_9012 * this.field_9016
         - this.field_9014 * var1.field_9013
         + this.field_9013 * var1.field_9014;
      this.field_9013 = this.field_9012 * var1.field_9013
         + var1.field_9012 * this.field_9013
         + this.field_9014 * var1.field_9016
         - this.field_9016 * var1.field_9014;
      this.field_9012 = var4;
      this.field_9014 = var5;
      this.field_9016 = var6;
   }

   public final void method_40355(class_8778 var1, class_8778 var2) {
      class_8778 var5 = new class_8778(var2);
      var5.method_40340();
      this.method_40353(var1, var5);
   }

   public final void method_40354(class_8778 var1) {
      class_8778 var4 = new class_8778(var1);
      var4.method_40340();
      this.method_40352(var4);
   }

   public final void method_40341(class_8778 var1) {
      float var4 = 1.0F
         / (var1.field_9012 * var1.field_9012 + var1.field_9014 * var1.field_9014 + var1.field_9016 * var1.field_9016 + var1.field_9013 * var1.field_9013);
      this.field_9012 = var4 * var1.field_9012;
      this.field_9014 = -var4 * var1.field_9014;
      this.field_9016 = -var4 * var1.field_9016;
      this.field_9013 = -var4 * var1.field_9013;
   }

   public final void method_40340() {
      float var3 = 1.0F
         / (this.field_9012 * this.field_9012 + this.field_9014 * this.field_9014 + this.field_9016 * this.field_9016 + this.field_9013 * this.field_9013);
      this.field_9012 *= var3;
      this.field_9014 *= -var3;
      this.field_9016 *= -var3;
      this.field_9013 *= -var3;
   }

   public final void method_40339(class_8778 var1) {
      float var4 = var1.field_9014 * var1.field_9014
         + var1.field_9016 * var1.field_9016
         + var1.field_9013 * var1.field_9013
         + var1.field_9012 * var1.field_9012;
      if (!(var4 > 0.0F)) {
         this.field_9014 = 0.0F;
         this.field_9016 = 0.0F;
         this.field_9013 = 0.0F;
         this.field_9012 = 0.0F;
      } else {
         var4 = 1.0F / (float)Math.sqrt((double)var4);
         this.field_9014 = var4 * var1.field_9014;
         this.field_9016 = var4 * var1.field_9016;
         this.field_9013 = var4 * var1.field_9013;
         this.field_9012 = var4 * var1.field_9012;
      }
   }

   public final void method_40338() {
      float var3 = this.field_9014 * this.field_9014
         + this.field_9016 * this.field_9016
         + this.field_9013 * this.field_9013
         + this.field_9012 * this.field_9012;
      if (!(var3 > 0.0F)) {
         this.field_9014 = 0.0F;
         this.field_9016 = 0.0F;
         this.field_9013 = 0.0F;
         this.field_9012 = 0.0F;
      } else {
         var3 = 1.0F / (float)Math.sqrt((double)var3);
         this.field_9014 *= var3;
         this.field_9016 *= var3;
         this.field_9013 *= var3;
         this.field_9012 *= var3;
      }
   }

   public final void method_40344(class_2856 var1) {
      float var4 = 0.25F * (var1.field_13977 + var1.field_13979 + var1.field_13978 + var1.field_13988);
      if (!(var4 >= 0.0F)) {
         this.field_9012 = 0.0F;
         this.field_9014 = 0.0F;
         this.field_9016 = 0.0F;
         this.field_9013 = 1.0F;
      } else if (!((double)var4 >= 1.0E-30)) {
         this.field_9012 = 0.0F;
         var4 = -0.5F * (var1.field_13979 + var1.field_13978);
         if (!(var4 >= 0.0F)) {
            this.field_9014 = 0.0F;
            this.field_9016 = 0.0F;
            this.field_9013 = 1.0F;
         } else if (!((double)var4 >= 1.0E-30)) {
            this.field_9014 = 0.0F;
            var4 = 0.5F * (1.0F - var1.field_13978);
            if (!((double)var4 >= 1.0E-30)) {
               this.field_9016 = 0.0F;
               this.field_9013 = 1.0F;
            } else {
               this.field_9016 = (float)Math.sqrt((double)var4);
               this.field_9013 = var1.field_13992 / (2.0F * this.field_9016);
            }
         } else {
            this.field_9014 = (float)Math.sqrt((double)var4);
            var4 = 1.0F / (2.0F * this.field_9014);
            this.field_9016 = var1.field_13993 * var4;
            this.field_9013 = var1.field_13983 * var4;
         }
      } else {
         this.field_9012 = (float)Math.sqrt((double)var4);
         var4 = 0.25F / this.field_9012;
         this.field_9014 = (var1.field_13992 - var1.field_13989) * var4;
         this.field_9016 = (var1.field_13976 - var1.field_13983) * var4;
         this.field_9013 = (var1.field_13993 - var1.field_13991) * var4;
      }
   }

   public final void method_40348(class_9076 var1) {
      double var4 = 0.25 * (var1.field_46473 + var1.field_46467 + var1.field_46468 + var1.field_46457);
      if (!(var4 >= 0.0)) {
         this.field_9012 = 0.0F;
         this.field_9014 = 0.0F;
         this.field_9016 = 0.0F;
         this.field_9013 = 1.0F;
      } else if (!(var4 >= 1.0E-30)) {
         this.field_9012 = 0.0F;
         var4 = -0.5 * (var1.field_46467 + var1.field_46468);
         if (!(var4 >= 0.0)) {
            this.field_9014 = 0.0F;
            this.field_9016 = 0.0F;
            this.field_9013 = 1.0F;
         } else if (!(var4 >= 1.0E-30)) {
            this.field_9014 = 0.0F;
            var4 = 0.5 * (1.0 - var1.field_46468);
            if (!(var4 >= 1.0E-30)) {
               this.field_9016 = 0.0F;
               this.field_9013 = 1.0F;
            } else {
               this.field_9016 = (float)Math.sqrt(var4);
               this.field_9013 = (float)(var1.field_46469 / (2.0 * (double)this.field_9016));
            }
         } else {
            this.field_9014 = (float)Math.sqrt(var4);
            var4 = 0.5 / (double)this.field_9014;
            this.field_9016 = (float)(var1.field_46458 * var4);
            this.field_9013 = (float)(var1.field_46470 * var4);
         }
      } else {
         this.field_9012 = (float)Math.sqrt(var4);
         var4 = 0.25 / (double)this.field_9012;
         this.field_9014 = (float)((var1.field_46469 - var1.field_46464) * var4);
         this.field_9016 = (float)((var1.field_46474 - var1.field_46470) * var4);
         this.field_9013 = (float)((var1.field_46458 - var1.field_46466) * var4);
      }
   }

   public final void method_40345(class_3367 var1) {
      float var4 = 0.25F * (var1.field_16607 + var1.field_16602 + var1.field_16600 + 1.0F);
      if (!(var4 >= 0.0F)) {
         this.field_9012 = 0.0F;
         this.field_9014 = 0.0F;
         this.field_9016 = 0.0F;
         this.field_9013 = 1.0F;
      } else if (!((double)var4 >= 1.0E-30)) {
         this.field_9012 = 0.0F;
         var4 = -0.5F * (var1.field_16602 + var1.field_16600);
         if (!(var4 >= 0.0F)) {
            this.field_9014 = 0.0F;
            this.field_9016 = 0.0F;
            this.field_9013 = 1.0F;
         } else if (!((double)var4 >= 1.0E-30)) {
            this.field_9014 = 0.0F;
            var4 = 0.5F * (1.0F - var1.field_16600);
            if (!((double)var4 >= 1.0E-30)) {
               this.field_9016 = 0.0F;
               this.field_9013 = 1.0F;
            } else {
               this.field_9016 = (float)Math.sqrt((double)var4);
               this.field_9013 = var1.field_16605 / (2.0F * this.field_9016);
            }
         } else {
            this.field_9014 = (float)Math.sqrt((double)var4);
            var4 = 0.5F / this.field_9014;
            this.field_9016 = var1.field_16606 * var4;
            this.field_9013 = var1.field_16604 * var4;
         }
      } else {
         this.field_9012 = (float)Math.sqrt((double)var4);
         var4 = 0.25F / this.field_9012;
         this.field_9014 = (var1.field_16605 - var1.field_16599) * var4;
         this.field_9016 = (var1.field_16597 - var1.field_16604) * var4;
         this.field_9013 = (var1.field_16606 - var1.field_16596) * var4;
      }
   }

   public final void method_40346(class_4173 var1) {
      double var4 = 0.25 * (var1.field_20304 + var1.field_20305 + var1.field_20307 + 1.0);
      if (!(var4 >= 0.0)) {
         this.field_9012 = 0.0F;
         this.field_9014 = 0.0F;
         this.field_9016 = 0.0F;
         this.field_9013 = 1.0F;
      } else if (!(var4 >= 1.0E-30)) {
         this.field_9012 = 0.0F;
         var4 = -0.5 * (var1.field_20305 + var1.field_20307);
         if (!(var4 >= 0.0)) {
            this.field_9014 = 0.0F;
            this.field_9016 = 0.0F;
            this.field_9013 = 1.0F;
         } else if (!(var4 >= 1.0E-30)) {
            this.field_9014 = 0.0F;
            var4 = 0.5 * (1.0 - var1.field_20307);
            if (!(var4 >= 1.0E-30)) {
               this.field_9016 = 0.0F;
               this.field_9013 = 1.0F;
            } else {
               this.field_9016 = (float)Math.sqrt(var4);
               this.field_9013 = (float)(var1.field_20322 / (2.0 * (double)this.field_9016));
            }
         } else {
            this.field_9014 = (float)Math.sqrt(var4);
            var4 = 0.5 / (double)this.field_9014;
            this.field_9016 = (float)(var1.field_20312 * var4);
            this.field_9013 = (float)(var1.field_20314 * var4);
         }
      } else {
         this.field_9012 = (float)Math.sqrt(var4);
         var4 = 0.25 / (double)this.field_9012;
         this.field_9014 = (float)((var1.field_20322 - var1.field_20319) * var4);
         this.field_9016 = (float)((var1.field_20311 - var1.field_20314) * var4);
         this.field_9013 = (float)((var1.field_20312 - var1.field_20313) * var4);
      }
   }

   public final void method_40347(class_7441 var1) {
      float var4 = (float)Math.sqrt((double)(var1.field_37928 * var1.field_37928 + var1.field_37931 * var1.field_37931 + var1.field_37927 * var1.field_37927));
      if (!((double)var4 < 1.0E-6)) {
         var4 = 1.0F / var4;
         float var5 = (float)Math.sin((double)var1.field_37925 / 2.0);
         this.field_9012 = (float)Math.cos((double)var1.field_37925 / 2.0);
         this.field_9014 = var1.field_37928 * var4 * var5;
         this.field_9016 = var1.field_37931 * var4 * var5;
         this.field_9013 = var1.field_37927 * var4 * var5;
      } else {
         this.field_9012 = 0.0F;
         this.field_9014 = 0.0F;
         this.field_9016 = 0.0F;
         this.field_9013 = 0.0F;
      }
   }

   public final void method_40349(class_9179 var1) {
      float var4 = (float)(1.0 / Math.sqrt(var1.field_46964 * var1.field_46964 + var1.field_46963 * var1.field_46963 + var1.field_46965 * var1.field_46965));
      if (!((double)var4 < 1.0E-6)) {
         var4 = 1.0F / var4;
         float var5 = (float)Math.sin(var1.field_46968 / 2.0);
         this.field_9012 = (float)Math.cos(var1.field_46968 / 2.0);
         this.field_9014 = (float)var1.field_46964 * var4 * var5;
         this.field_9016 = (float)var1.field_46963 * var4 * var5;
         this.field_9013 = (float)var1.field_46965 * var4 * var5;
      } else {
         this.field_9012 = 0.0F;
         this.field_9014 = 0.0F;
         this.field_9016 = 0.0F;
         this.field_9013 = 0.0F;
      }
   }

   public final void method_40342(class_8778 var1, float var2) {
      double var5 = (double)(
         this.field_9014 * var1.field_9014 + this.field_9016 * var1.field_9016 + this.field_9013 * var1.field_9013 + this.field_9012 * var1.field_9012
      );
      if (var5 < 0.0) {
         var1.field_9014 = -var1.field_9014;
         var1.field_9016 = -var1.field_9016;
         var1.field_9013 = -var1.field_9013;
         var1.field_9012 = -var1.field_9012;
         var5 = -var5;
      }

      double var7;
      double var9;
      if (!(1.0 - var5 > 1.0E-6)) {
         var7 = 1.0 - (double)var2;
         var9 = (double)var2;
      } else {
         double var11 = Math.acos(var5);
         double var13 = Math.sin(var11);
         var7 = Math.sin((1.0 - (double)var2) * var11) / var13;
         var9 = Math.sin((double)var2 * var11) / var13;
      }

      this.field_9012 = (float)(var7 * (double)this.field_9012 + var9 * (double)var1.field_9012);
      this.field_9014 = (float)(var7 * (double)this.field_9014 + var9 * (double)var1.field_9014);
      this.field_9016 = (float)(var7 * (double)this.field_9016 + var9 * (double)var1.field_9016);
      this.field_9013 = (float)(var7 * (double)this.field_9013 + var9 * (double)var1.field_9013);
   }

   public final void method_40343(class_8778 var1, class_8778 var2, float var3) {
      double var6 = (double)(
         var2.field_9014 * var1.field_9014 + var2.field_9016 * var1.field_9016 + var2.field_9013 * var1.field_9013 + var2.field_9012 * var1.field_9012
      );
      if (var6 < 0.0) {
         var1.field_9014 = -var1.field_9014;
         var1.field_9016 = -var1.field_9016;
         var1.field_9013 = -var1.field_9013;
         var1.field_9012 = -var1.field_9012;
         var6 = -var6;
      }

      double var8;
      double var10;
      if (!(1.0 - var6 > 1.0E-6)) {
         var8 = 1.0 - (double)var3;
         var10 = (double)var3;
      } else {
         double var12 = Math.acos(var6);
         double var14 = Math.sin(var12);
         var8 = Math.sin((1.0 - (double)var3) * var12) / var14;
         var10 = Math.sin((double)var3 * var12) / var14;
      }

      this.field_9012 = (float)(var8 * (double)var1.field_9012 + var10 * (double)var2.field_9012);
      this.field_9014 = (float)(var8 * (double)var1.field_9014 + var10 * (double)var2.field_9014);
      this.field_9016 = (float)(var8 * (double)var1.field_9016 + var10 * (double)var2.field_9016);
      this.field_9013 = (float)(var8 * (double)var1.field_9013 + var10 * (double)var2.field_9013);
   }
}

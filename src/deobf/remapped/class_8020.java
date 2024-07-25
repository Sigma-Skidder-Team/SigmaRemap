package remapped;

import java.io.Serializable;

public class class_8020 implements Serializable, Cloneable {
   private int field_41067;
   public double[] field_41065;
   public static final long field_41068 = 1398850036893875112L;

   public class_8020(int var1) {
      this.field_41067 = var1;
      this.field_41065 = new double[var1];

      for (int var4 = 0; var4 < var1; var4++) {
         this.field_41065[var4] = 0.0;
      }
   }

   public class_8020(double[] var1) {
      this.field_41067 = var1.length;
      this.field_41065 = new double[var1.length];

      for (int var4 = 0; var4 < this.field_41067; var4++) {
         this.field_41065[var4] = var1[var4];
      }
   }

   public class_8020(class_8020 var1) {
      this.field_41065 = new double[var1.field_41067];
      this.field_41067 = var1.field_41067;

      for (int var4 = 0; var4 < this.field_41067; var4++) {
         this.field_41065[var4] = var1.field_41065[var4];
      }
   }

   public class_8020(class_6064 var1) {
      this.field_41065 = new double[2];
      this.field_41065[0] = (double)var1.field_31017;
      this.field_41065[1] = (double)var1.field_31019;
      this.field_41067 = 2;
   }

   public class_8020(class_835 var1) {
      this.field_41065 = new double[3];
      this.field_41065[0] = (double)var1.field_4390;
      this.field_41065[1] = (double)var1.field_4391;
      this.field_41065[2] = (double)var1.field_4393;
      this.field_41067 = 3;
   }

   public class_8020(class_3519 var1) {
      this.field_41065 = new double[3];
      this.field_41065[0] = var1.field_17244;
      this.field_41065[1] = var1.field_17242;
      this.field_41065[2] = var1.field_17241;
      this.field_41067 = 3;
   }

   public class_8020(class_1752 var1) {
      this.field_41065 = new double[4];
      this.field_41065[0] = (double)var1.field_9014;
      this.field_41065[1] = (double)var1.field_9016;
      this.field_41065[2] = (double)var1.field_9013;
      this.field_41065[3] = (double)var1.field_9012;
      this.field_41067 = 4;
   }

   public class_8020(class_5230 var1) {
      this.field_41065 = new double[4];
      this.field_41065[0] = var1.field_26829;
      this.field_41065[1] = var1.field_26830;
      this.field_41065[2] = var1.field_26828;
      this.field_41065[3] = var1.field_26827;
      this.field_41067 = 4;
   }

   public class_8020(double[] var1, int var2) {
      this.field_41067 = var2;
      this.field_41065 = new double[var2];

      for (int var5 = 0; var5 < var2; var5++) {
         this.field_41065[var5] = var1[var5];
      }
   }

   public final double method_36408() {
      double var3 = 0.0;

      for (int var5 = 0; var5 < this.field_41067; var5++) {
         var3 += this.field_41065[var5] * this.field_41065[var5];
      }

      return Math.sqrt(var3);
   }

   public final double method_36410() {
      double var3 = 0.0;

      for (int var5 = 0; var5 < this.field_41067; var5++) {
         var3 += this.field_41065[var5] * this.field_41065[var5];
      }

      return var3;
   }

   public final void method_36407(class_8020 var1) {
      double var4 = 0.0;
      if (this.field_41067 != var1.field_41067) {
         throw new class_9056(class_3730.method_17283("GVector0"));
      } else {
         for (int var6 = 0; var6 < this.field_41067; var6++) {
            var4 += var1.field_41065[var6] * var1.field_41065[var6];
         }

         double var7 = 1.0 / Math.sqrt(var4);

         for (int var9 = 0; var9 < this.field_41067; var9++) {
            this.field_41065[var9] = var1.field_41065[var9] * var7;
         }
      }
   }

   public final void method_36406() {
      double var3 = 0.0;

      for (int var5 = 0; var5 < this.field_41067; var5++) {
         var3 += this.field_41065[var5] * this.field_41065[var5];
      }

      double var6 = 1.0 / Math.sqrt(var3);

      for (int var8 = 0; var8 < this.field_41067; var8++) {
         this.field_41065[var8] = this.field_41065[var8] * var6;
      }
   }

   public final void method_36422(double var1, class_8020 var3) {
      if (this.field_41067 != var3.field_41067) {
         throw new class_9056(class_3730.method_17283("GVector1"));
      } else {
         for (int var6 = 0; var6 < this.field_41067; var6++) {
            this.field_41065[var6] = var3.field_41065[var6] * var1;
         }
      }
   }

   public final void method_36421(double var1) {
      for (int var5 = 0; var5 < this.field_41067; var5++) {
         this.field_41065[var5] = this.field_41065[var5] * var1;
      }
   }

   public final void method_36416(double var1, class_8020 var3, class_8020 var4) {
      if (var4.field_41067 != var3.field_41067) {
         throw new class_9056(class_3730.method_17283("GVector2"));
      } else if (this.field_41067 != var3.field_41067) {
         throw new class_9056(class_3730.method_17283("GVector3"));
      } else {
         for (int var7 = 0; var7 < this.field_41067; var7++) {
            this.field_41065[var7] = var3.field_41065[var7] * var1 + var4.field_41065[var7];
         }
      }
   }

   public final void method_36402(class_8020 var1) {
      if (this.field_41067 != var1.field_41067) {
         throw new class_9056(class_3730.method_17283("GVector4"));
      } else {
         for (int var4 = 0; var4 < this.field_41067; var4++) {
            this.field_41065[var4] = this.field_41065[var4] + var1.field_41065[var4];
         }
      }
   }

   public final void method_36403(class_8020 var1, class_8020 var2) {
      if (var1.field_41067 != var2.field_41067) {
         throw new class_9056(class_3730.method_17283("GVector5"));
      } else if (this.field_41067 != var1.field_41067) {
         throw new class_9056(class_3730.method_17283("GVector6"));
      } else {
         for (int var5 = 0; var5 < this.field_41067; var5++) {
            this.field_41065[var5] = var1.field_41065[var5] + var2.field_41065[var5];
         }
      }
   }

   public final void method_36404(class_8020 var1) {
      if (this.field_41067 != var1.field_41067) {
         throw new class_9056(class_3730.method_17283("GVector7"));
      } else {
         for (int var4 = 0; var4 < this.field_41067; var4++) {
            this.field_41065[var4] = this.field_41065[var4] - var1.field_41065[var4];
         }
      }
   }

   public final void method_36405(class_8020 var1, class_8020 var2) {
      if (var1.field_41067 != var2.field_41067) {
         throw new class_9056(class_3730.method_17283("GVector8"));
      } else if (this.field_41067 != var1.field_41067) {
         throw new class_9056(class_3730.method_17283("GVector9"));
      } else {
         for (int var5 = 0; var5 < this.field_41067; var5++) {
            this.field_41065[var5] = var1.field_41065[var5] - var2.field_41065[var5];
         }
      }
   }

   public final void method_36400(class_7748 var1, class_8020 var2) {
      if (var1.method_35119() != var2.field_41067) {
         throw new class_9056(class_3730.method_17283("GVector10"));
      } else if (this.field_41067 != var1.method_35142()) {
         throw new class_9056(class_3730.method_17283("GVector11"));
      } else {
         double[] var5;
         if (var2 == this) {
            var5 = (double[])this.field_41065.clone();
         } else {
            var5 = var2.field_41065;
         }

         for (int var6 = this.field_41067 - 1; var6 >= 0; var6--) {
            this.field_41065[var6] = 0.0;

            for (int var7 = var2.field_41067 - 1; var7 >= 0; var7--) {
               this.field_41065[var6] = this.field_41065[var6] + var1.field_39277[var6][var7] * var5[var7];
            }
         }
      }
   }

   public final void method_36401(class_8020 var1, class_7748 var2) {
      if (var2.method_35142() != var1.field_41067) {
         throw new class_9056(class_3730.method_17283("GVector12"));
      } else if (this.field_41067 != var2.method_35119()) {
         throw new class_9056(class_3730.method_17283("GVector13"));
      } else {
         double[] var5;
         if (var1 == this) {
            var5 = (double[])this.field_41065.clone();
         } else {
            var5 = var1.field_41065;
         }

         for (int var6 = this.field_41067 - 1; var6 >= 0; var6--) {
            this.field_41065[var6] = 0.0;

            for (int var7 = var1.field_41067 - 1; var7 >= 0; var7--) {
               this.field_41065[var6] = this.field_41065[var6] + var2.field_39277[var7][var6] * var5[var7];
            }
         }
      }
   }

   public final void method_36411() {
      for (int var3 = this.field_41067 - 1; var3 >= 0; var3--) {
         this.field_41065[var3] = this.field_41065[var3] * -1.0;
      }
   }

   public final void method_36424() {
      for (int var3 = 0; var3 < this.field_41067; var3++) {
         this.field_41065[var3] = 0.0;
      }
   }

   public final void method_36413(int var1) {
      double[] var4 = new double[var1];
      int var5;
      if (this.field_41067 >= var1) {
         var5 = var1;
      } else {
         var5 = this.field_41067;
      }

      for (int var6 = 0; var6 < var5; var6++) {
         var4[var6] = this.field_41065[var6];
      }

      this.field_41067 = var1;
      this.field_41065 = var4;
   }

   public final void method_36431(double[] var1) {
      for (int var4 = this.field_41067 - 1; var4 >= 0; var4--) {
         this.field_41065[var4] = var1[var4];
      }
   }

   public final void method_36430(class_8020 var1) {
      if (this.field_41067 >= var1.field_41067) {
         for (int var4 = 0; var4 < var1.field_41067; var4++) {
            this.field_41065[var4] = var1.field_41065[var4];
         }

         for (int var5 = var1.field_41067; var5 < this.field_41067; var5++) {
            this.field_41065[var5] = 0.0;
         }
      } else {
         this.field_41067 = var1.field_41067;
         this.field_41065 = new double[this.field_41067];

         for (int var6 = 0; var6 < this.field_41067; var6++) {
            this.field_41065[var6] = var1.field_41065[var6];
         }
      }
   }

   public final void method_36429(class_6064 var1) {
      if (this.field_41067 < 2) {
         this.field_41067 = 2;
         this.field_41065 = new double[2];
      }

      this.field_41065[0] = (double)var1.field_31017;
      this.field_41065[1] = (double)var1.field_31019;

      for (int var4 = 2; var4 < this.field_41067; var4++) {
         this.field_41065[var4] = 0.0;
      }
   }

   public final void method_36425(class_835 var1) {
      if (this.field_41067 < 3) {
         this.field_41067 = 3;
         this.field_41065 = new double[3];
      }

      this.field_41065[0] = (double)var1.field_4390;
      this.field_41065[1] = (double)var1.field_4391;
      this.field_41065[2] = (double)var1.field_4393;

      for (int var4 = 3; var4 < this.field_41067; var4++) {
         this.field_41065[var4] = 0.0;
      }
   }

   public final void method_36427(class_3519 var1) {
      if (this.field_41067 < 3) {
         this.field_41067 = 3;
         this.field_41065 = new double[3];
      }

      this.field_41065[0] = var1.field_17244;
      this.field_41065[1] = var1.field_17242;
      this.field_41065[2] = var1.field_17241;

      for (int var4 = 3; var4 < this.field_41067; var4++) {
         this.field_41065[var4] = 0.0;
      }
   }

   public final void method_36426(class_1752 var1) {
      if (this.field_41067 < 4) {
         this.field_41067 = 4;
         this.field_41065 = new double[4];
      }

      this.field_41065[0] = (double)var1.field_9014;
      this.field_41065[1] = (double)var1.field_9016;
      this.field_41065[2] = (double)var1.field_9013;
      this.field_41065[3] = (double)var1.field_9012;

      for (int var4 = 4; var4 < this.field_41067; var4++) {
         this.field_41065[var4] = 0.0;
      }
   }

   public final void method_36428(class_5230 var1) {
      if (this.field_41067 < 4) {
         this.field_41067 = 4;
         this.field_41065 = new double[4];
      }

      this.field_41065[0] = var1.field_26829;
      this.field_41065[1] = var1.field_26830;
      this.field_41065[2] = var1.field_26828;
      this.field_41065[3] = var1.field_26827;

      for (int var4 = 4; var4 < this.field_41067; var4++) {
         this.field_41065[var4] = 0.0;
      }
   }

   public final int method_36420() {
      return this.field_41065.length;
   }

   public final double method_36419(int var1) {
      return this.field_41065[var1];
   }

   public final void method_36409(int var1, double var2) {
      this.field_41065[var1] = var2;
   }

   @Override
   public String toString() {
      StringBuffer var3 = new StringBuffer(this.field_41067 * 8);

      for (int var4 = 0; var4 < this.field_41067; var4++) {
         var3.append(this.field_41065[var4]).append(" ");
      }

      return var3.toString();
   }

   @Override
   public int hashCode() {
      long var3 = 1L;

      for (int var5 = 0; var5 < this.field_41067; var5++) {
         var3 = 31L * var3 + class_9845.method_45350(this.field_41065[var5]);
      }

      return (int)(var3 ^ var3 >> 32);
   }

   public boolean equals(class_8020 var1) {
      try {
         if (this.field_41067 != var1.field_41067) {
            return false;
         } else {
            for (int var4 = 0; var4 < this.field_41067; var4++) {
               if (this.field_41065[var4] != var1.field_41065[var4]) {
                  return false;
               }
            }

            return true;
         }
      } catch (NullPointerException var5) {
         return false;
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         class_8020 var4 = (class_8020)var1;
         if (this.field_41067 != var4.field_41067) {
            return false;
         } else {
            for (int var5 = 0; var5 < this.field_41067; var5++) {
               if (this.field_41065[var5] != var4.field_41065[var5]) {
                  return false;
               }
            }

            return true;
         }
      } catch (ClassCastException var6) {
         return false;
      } catch (NullPointerException var7) {
         return false;
      }
   }

   public boolean method_36418(class_8020 var1, double var2) {
      if (this.field_41067 == var1.field_41067) {
         for (int var6 = 0; var6 < this.field_41067; var6++) {
            double var7 = this.field_41065[var6] - var1.field_41065[var6];
            if ((!(var7 < 0.0) ? var7 : -var7) > var2) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public final double method_36414(class_8020 var1) {
      if (this.field_41067 != var1.field_41067) {
         throw new class_9056(class_3730.method_17283("GVector14"));
      } else {
         double var4 = 0.0;

         for (int var6 = 0; var6 < this.field_41067; var6++) {
            var4 += this.field_41065[var6] * var1.field_41065[var6];
         }

         return var4;
      }
   }

   public final void method_36412(class_7748 var1, class_7748 var2, class_7748 var3, class_8020 var4) {
      if (var1.field_39283 != var4.method_36420() || var1.field_39283 != var1.field_39280 || var1.field_39283 != var2.field_39283) {
         throw new class_9056(class_3730.method_17283("GVector15"));
      } else if (var2.field_39280 == this.field_41065.length && var2.field_39280 == var3.field_39280 && var2.field_39280 == var3.field_39283) {
         class_7748 var7 = new class_7748(var1.field_39283, var2.field_39280);
         var7.method_35134(var1, var3);
         var7.method_35078(var1, var2);
         var7.method_35117();
         this.method_36400(var7, var4);
      } else {
         throw new class_9056(class_3730.method_17283("GVector23"));
      }
   }

   public final void method_36423(class_7748 var1, class_8020 var2, class_8020 var3) {
      int var6 = var1.field_39283 * var1.field_39280;
      double[] var7 = new double[var6];
      double[] var8 = new double[var6];
      int[] var9 = new int[var2.method_36420()];
      if (var1.field_39283 != var2.method_36420()) {
         throw new class_9056(class_3730.method_17283("GVector16"));
      } else if (var1.field_39283 != var3.method_36420()) {
         throw new class_9056(class_3730.method_17283("GVector24"));
      } else if (var1.field_39283 != var1.field_39280) {
         throw new class_9056(class_3730.method_17283("GVector25"));
      } else {
         for (int var10 = 0; var10 < var1.field_39283; var10++) {
            for (int var11 = 0; var11 < var1.field_39280; var11++) {
               var7[var10 * var1.field_39280 + var11] = var1.field_39277[var10][var11];
            }
         }

         for (int var12 = 0; var12 < var6; var12++) {
            var8[var12] = 0.0;
         }

         for (int var13 = 0; var13 < var1.field_39283; var13++) {
            var8[var13 * var1.field_39280] = var2.field_41065[var13];
         }

         for (int var14 = 0; var14 < var1.field_39280; var14++) {
            var9[var14] = (int)var3.field_41065[var14];
         }

         class_7748.method_35105(var1.field_39283, var7, var9, var8);

         for (int var15 = 0; var15 < var1.field_39283; var15++) {
            this.field_41065[var15] = var8[var15 * var1.field_39280];
         }
      }
   }

   public final double method_36417(class_8020 var1) {
      return Math.acos(this.method_36414(var1) / (this.method_36408() * var1.method_36408()));
   }

   /** @deprecated */
   public final void method_36399(class_8020 var1, class_8020 var2, float var3) {
      this.method_36398(var1, var2, (double)var3);
   }

   /** @deprecated */
   public final void method_36397(class_8020 var1, float var2) {
      this.method_36396(var1, (double)var2);
   }

   public final void method_36398(class_8020 var1, class_8020 var2, double var3) {
      if (var2.field_41067 != var1.field_41067) {
         throw new class_9056(class_3730.method_17283("GVector20"));
      } else if (this.field_41067 != var1.field_41067) {
         throw new class_9056(class_3730.method_17283("GVector21"));
      } else {
         for (int var7 = 0; var7 < this.field_41067; var7++) {
            this.field_41065[var7] = (1.0 - var3) * var1.field_41065[var7] + var3 * var2.field_41065[var7];
         }
      }
   }

   public final void method_36396(class_8020 var1, double var2) {
      if (var1.field_41067 != this.field_41067) {
         throw new class_9056(class_3730.method_17283("GVector22"));
      } else {
         for (int var6 = 0; var6 < this.field_41067; var6++) {
            this.field_41065[var6] = (1.0 - var2) * this.field_41065[var6] + var2 * var1.field_41065[var6];
         }
      }
   }

   @Override
   public Object clone() {
      class_8020 var3 = null;

      try {
         var3 = (class_8020)super.clone();
      } catch (CloneNotSupportedException var5) {
         throw new InternalError();
      }

      var3.field_41065 = new double[this.field_41067];

      for (int var4 = 0; var4 < this.field_41067; var4++) {
         var3.field_41065[var4] = this.field_41065[var4];
      }

      return var3;
   }
}

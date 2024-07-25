package remapped;

import java.io.Serializable;

public abstract class class_3316 implements Serializable {
   public float[] field_16385;
   public float[] field_16376;
   public float field_16381;
   public float field_16380;
   public float field_16386;
   public float field_16375;
   public float field_16384;
   public float field_16383;
   public float field_16379;
   public boolean field_16377 = true;
   public transient class_8554 field_16378;
   public boolean field_16382;

   public void method_15210(float var1, float var2) {
      this.method_15201(var1);
      this.method_15240(var2);
   }

   public abstract class_3316 method_15207(class_4508 var1);

   public abstract void method_15217();

   public float method_15212() {
      return this.field_16381;
   }

   public void method_15201(float var1) {
      if (var1 != this.field_16381) {
         float var4 = var1 - this.field_16381;
         this.field_16381 = var1;
         if (this.field_16385 == null || this.field_16376 == null) {
            this.method_15202();
         }

         for (int var5 = 0; var5 < this.field_16385.length / 2; var5++) {
            this.field_16385[var5 * 2] = this.field_16385[var5 * 2] + var4;
         }

         this.field_16376[0] = this.field_16376[0] + var4;
         var1 += var4;
         this.field_16386 += var4;
         this.field_16384 += var4;
         this.field_16382 = true;
      }
   }

   public void method_15240(float var1) {
      if (var1 != this.field_16380) {
         float var4 = var1 - this.field_16380;
         this.field_16380 = var1;
         if (this.field_16385 == null || this.field_16376 == null) {
            this.method_15202();
         }

         for (int var5 = 0; var5 < this.field_16385.length / 2; var5++) {
            this.field_16385[var5 * 2 + 1] = this.field_16385[var5 * 2 + 1] + var4;
         }

         this.field_16376[1] = this.field_16376[1] + var4;
         var1 += var4;
         this.field_16375 += var4;
         this.field_16383 += var4;
         this.field_16382 = true;
      }
   }

   public float method_15220() {
      return this.field_16380;
   }

   public void method_15211(class_1440 var1) {
      this.method_15201(var1.field_7766);
      this.method_15240(var1.field_7765);
   }

   public float method_15241() {
      this.method_15202();
      return this.field_16376[0];
   }

   public void method_15206(float var1) {
      if (this.field_16385 == null || this.field_16376 == null) {
         this.method_15202();
      }

      float var4 = var1 - this.method_15241();
      this.method_15201(this.field_16381 + var4);
   }

   public float method_15222() {
      this.method_15202();
      return this.field_16376[1];
   }

   public void method_15236(float var1) {
      if (this.field_16385 == null || this.field_16376 == null) {
         this.method_15202();
      }

      float var4 = var1 - this.method_15222();
      this.method_15240(this.field_16380 + var4);
   }

   public float method_15200() {
      this.method_15202();
      return this.field_16386;
   }

   public float method_15208() {
      this.method_15202();
      return this.field_16375;
   }

   public float method_15203() {
      this.method_15202();
      return this.field_16384;
   }

   public float method_15216() {
      this.method_15202();
      return this.field_16383;
   }

   public float method_15231() {
      this.method_15202();
      return this.field_16379;
   }

   public float[] method_15228() {
      this.method_15202();
      return this.field_16376;
   }

   public float[] method_15230() {
      this.method_15202();
      return this.field_16385;
   }

   public int method_15223() {
      this.method_15202();
      return this.field_16385.length / 2;
   }

   public float[] method_15229(int var1) {
      this.method_15202();
      return new float[]{this.field_16385[var1 * 2], this.field_16385[var1 * 2 + 1]};
   }

   public float[] method_15226(int var1) {
      float[] var4 = this.method_15229(var1);
      float[] var5 = this.method_15229(var1 - 1 >= 0 ? var1 - 1 : this.method_15223() - 1);
      float[] var6 = this.method_15229(var1 + 1 < this.method_15223() ? var1 + 1 : 0);
      float[] var7 = this.method_15227(var5, var4);
      float[] var8 = this.method_15227(var4, var6);
      if (var1 == 0 && !this.method_15232()) {
         return var8;
      } else if (var1 == this.method_15223() - 1 && !this.method_15232()) {
         return var7;
      } else {
         float var9 = (var7[0] + var8[0]) / 2.0F;
         float var10 = (var7[1] + var8[1]) / 2.0F;
         float var11 = (float)Math.sqrt((double)(var9 * var9 + var10 * var10));
         return new float[]{var9 / var11, var10 / var11};
      }
   }

   public boolean method_15225(class_3316 var1) {
      if (var1.method_15205(this)) {
         return false;
      } else {
         for (int var4 = 0; var4 < var1.method_15223(); var4++) {
            float[] var5 = var1.method_15229(var4);
            if (!this.method_15224(var5[0], var5[1])) {
               return false;
            }
         }

         return true;
      }
   }

   private float[] method_15227(float[] var1, float[] var2) {
      float var5 = var1[0] - var2[0];
      float var6 = var1[1] - var2[1];
      float var7 = (float)Math.sqrt((double)(var5 * var5 + var6 * var6));
      var5 /= var7;
      var6 /= var7;
      return new float[]{-var6, var5};
   }

   public boolean method_15219(float var1, float var2) {
      if (this.field_16385.length != 0) {
         this.method_15202();
         class_7133 var5 = new class_7133(0.0F, 0.0F, 0.0F, 0.0F);
         class_1440 var6 = new class_1440(var1, var2);

         for (byte var7 = 0; var7 < this.field_16385.length; var7 += 2) {
            int var8 = var7 + 2;
            if (var8 >= this.field_16385.length) {
               var8 = 0;
            }

            var5.method_32756(this.field_16385[var7], this.field_16385[var7 + 1], this.field_16385[var8], this.field_16385[var8 + 1]);
            if (var5.method_32759(var6)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public int method_15221(float var1, float var2) {
      for (byte var5 = 0; var5 < this.field_16385.length; var5 += 2) {
         if (this.field_16385[var5] == var1 && this.field_16385[var5 + 1] == var2) {
            return var5 / 2;
         }
      }

      return -1;
   }

   public boolean method_15224(float var1, float var2) {
      this.method_15202();
      if (this.field_16385.length != 0) {
         boolean var5 = false;
         int var6 = this.field_16385.length;
         float var7 = this.field_16385[var6 - 2];
         float var8 = this.field_16385[var6 - 1];

         for (byte var9 = 0; var9 < var6; var9 += 2) {
            float var10 = this.field_16385[var9];
            float var11 = this.field_16385[var9 + 1];
            float var12;
            float var13;
            float var14;
            float var15;
            if (!(var10 > var7)) {
               var12 = var10;
               var13 = var7;
               var14 = var11;
               var15 = var8;
            } else {
               var12 = var7;
               var13 = var10;
               var14 = var8;
               var15 = var11;
            }

            if (var10 < var1 == var1 <= var7
               && ((double)var2 - (double)var14) * (double)(var13 - var12) < ((double)var15 - (double)var14) * (double)(var1 - var12)) {
               var5 = !var5;
            }

            var7 = var10;
            var8 = var11;
         }

         return var5;
      } else {
         return false;
      }
   }

   public boolean method_15205(class_3316 var1) {
      this.method_15202();
      boolean var4 = false;
      float[] var5 = this.method_15230();
      float[] var6 = var1.method_15230();
      int var7 = var5.length;
      int var8 = var6.length;
      if (!this.method_15232()) {
         var7 -= 2;
      }

      if (!var1.method_15232()) {
         var8 -= 2;
      }

      for (byte var9 = 0; var9 < var7; var9 += 2) {
         int var10 = var9 + 2;
         if (var10 >= var5.length) {
            var10 = 0;
         }

         for (byte var11 = 0; var11 < var8; var11 += 2) {
            int var12 = var11 + 2;
            if (var12 >= var6.length) {
               var12 = 0;
            }

            double var13 = (
                  (double)(var5[var10] - var5[var9]) * (double)(var6[var11 + 1] - var5[var9 + 1])
                     - (double)((var5[var10 + 1] - var5[var9 + 1]) * (var6[var11] - var5[var9]))
               )
               / (double)((var5[var10 + 1] - var5[var9 + 1]) * (var6[var12] - var6[var11]) - (var5[var10] - var5[var9]) * (var6[var12 + 1] - var6[var11 + 1]));
            double var15 = (
                  (double)(var6[var12] - var6[var11]) * (double)(var6[var11 + 1] - var5[var9 + 1])
                     - (double)((var6[var12 + 1] - var6[var11 + 1]) * (var6[var11] - var5[var9]))
               )
               / (double)((var5[var10 + 1] - var5[var9 + 1]) * (var6[var12] - var6[var11]) - (var5[var10] - var5[var9]) * (var6[var12 + 1] - var6[var11 + 1]));
            if (var13 >= 0.0 && var13 <= 1.0 && var15 >= 0.0 && var15 <= 1.0) {
               var4 = true;
               break;
            }
         }

         if (var4) {
            break;
         }
      }

      return var4;
   }

   public boolean method_15214(float var1, float var2) {
      if (this.field_16385.length != 0) {
         this.method_15202();

         for (byte var5 = 0; var5 < this.field_16385.length; var5 += 2) {
            if (this.field_16385[var5] == var1 && this.field_16385[var5 + 1] == var2) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public void method_15218() {
      this.field_16376 = new float[]{0.0F, 0.0F};
      int var3 = this.field_16385.length;

      for (byte var4 = 0; var4 < var3; var4 += 2) {
         this.field_16376[0] = this.field_16376[0] + this.field_16385[var4];
         this.field_16376[1] = this.field_16376[1] + this.field_16385[var4 + 1];
      }

      this.field_16376[0] = this.field_16376[0] / (float)(var3 / 2);
      this.field_16376[1] = this.field_16376[1] / (float)(var3 / 2);
   }

   public void method_15235() {
      this.field_16379 = 0.0F;

      for (byte var3 = 0; var3 < this.field_16385.length; var3 += 2) {
         float var4 = (this.field_16385[var3] - this.field_16376[0]) * (this.field_16385[var3] - this.field_16376[0])
            + (this.field_16385[var3 + 1] - this.field_16376[1]) * (this.field_16385[var3 + 1] - this.field_16376[1]);
         this.field_16379 = !(this.field_16379 > var4) ? var4 : this.field_16379;
      }

      this.field_16379 = (float)Math.sqrt((double)this.field_16379);
   }

   public void method_15242() {
      if (this.field_16382 || this.field_16378 == null) {
         if (this.field_16385.length >= 6) {
            boolean var3 = true;
            float var4 = 0.0F;

            for (int var5 = 0; var5 < this.field_16385.length / 2 - 1; var5++) {
               float var6 = this.field_16385[var5 * 2];
               float var7 = this.field_16385[var5 * 2 + 1];
               float var8 = this.field_16385[var5 * 2 + 2];
               float var9 = this.field_16385[var5 * 2 + 3];
               var4 += var6 * var9 - var7 * var8;
            }

            var4 /= 2.0F;
            var3 = var4 > 0.0F;
            this.field_16378 = new class_7525();

            for (byte var12 = 0; var12 < this.field_16385.length; var12 += 2) {
               this.field_16378.method_39348(this.field_16385[var12], this.field_16385[var12 + 1]);
            }

            this.field_16378.method_39352();
         }

         this.field_16382 = false;
      }
   }

   public void method_15234() {
      this.method_15202();
      this.method_15242();
      this.field_16378 = new class_4777(this.field_16378);
   }

   public class_8554 method_15233() {
      this.method_15202();
      this.method_15242();
      return this.field_16378;
   }

   public final void method_15202() {
      if (this.field_16377) {
         this.method_15217();
         this.method_15218();
         this.method_15235();
         if (this.field_16385.length > 0) {
            this.field_16386 = this.field_16385[0];
            this.field_16375 = this.field_16385[1];
            this.field_16384 = this.field_16385[0];
            this.field_16383 = this.field_16385[1];

            for (int var3 = 0; var3 < this.field_16385.length / 2; var3++) {
               this.field_16386 = Math.max(this.field_16385[var3 * 2], this.field_16386);
               this.field_16375 = Math.max(this.field_16385[var3 * 2 + 1], this.field_16375);
               this.field_16384 = Math.min(this.field_16385[var3 * 2], this.field_16384);
               this.field_16383 = Math.min(this.field_16385[var3 * 2 + 1], this.field_16383);
            }
         }

         this.field_16377 = false;
         this.field_16382 = true;
      }
   }

   public void method_15215() {
      this.method_15202();
      this.method_15233();
   }

   public boolean method_15232() {
      return true;
   }

   public class_3316 method_15237() {
      class_6714 var3 = new class_6714();

      for (int var4 = 0; var4 < this.method_15223(); var4++) {
         int var5 = var4 + 1 < this.method_15223() ? var4 + 1 : 0;
         int var6 = var4 - 1 >= 0 ? var4 - 1 : this.method_15223() - 1;
         float var7 = this.method_15229(var4)[0] - this.method_15229(var6)[0];
         float var8 = this.method_15229(var4)[1] - this.method_15229(var6)[1];
         float var9 = this.method_15229(var5)[0] - this.method_15229(var4)[0];
         float var10 = this.method_15229(var5)[1] - this.method_15229(var4)[1];
         float var11 = (float)Math.sqrt((double)(var7 * var7 + var8 * var8));
         float var12 = (float)Math.sqrt((double)(var9 * var9 + var10 * var10));
         var7 /= var11;
         var8 /= var11;
         var9 /= var12;
         var10 /= var12;
         if (var7 != var9 || var8 != var10) {
            var3.method_30834(this.method_15229(var4)[0], this.method_15229(var4)[1]);
         }
      }

      return var3;
   }

   public class_3316[] method_15209(class_3316 var1) {
      return new class_3400().method_15703(this, var1);
   }

   public class_3316[] method_15238(class_3316 var1) {
      return new class_3400().method_15707(this, var1);
   }

   public float method_15213() {
      return this.field_16386 - this.field_16384;
   }

   public float method_15239() {
      return this.field_16375 - this.field_16383;
   }
}

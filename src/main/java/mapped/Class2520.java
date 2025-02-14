package mapped;

import java.io.Serializable;

public abstract class Class2520 implements Serializable {
   public float[] field16671;
   public float[] field16672;
   public float field16673;
   public float field16674;
   public float field16675;
   public float field16676;
   public float field16677;
   public float field16678;
   public float field16679;
   public boolean field16680 = true;
   public transient Class2533 field16681;
   public boolean field16682;

   public void method10576(float var1, float var2) {
      this.method10580(var1);
      this.method10581(var2);
   }

   public abstract Class2520 method10577(Class8412 var1);

   public abstract void method10578();

   public float method10579() {
      return this.field16673;
   }

   public void method10580(float var1) {
      if (var1 != this.field16673) {
         float var4 = var1 - this.field16673;
         this.field16673 = var1;
         if (this.field16671 == null || this.field16672 == null) {
            this.method10610();
         }

         for (int var5 = 0; var5 < this.field16671.length / 2; var5++) {
            this.field16671[var5 * 2] = this.field16671[var5 * 2] + var4;
         }

         this.field16672[0] = this.field16672[0] + var4;
         var1 += var4;
         this.field16675 += var4;
         this.field16677 += var4;
         this.field16682 = true;
      }
   }

   public void method10581(float var1) {
      if (var1 != this.field16674) {
         float var4 = var1 - this.field16674;
         this.field16674 = var1;
         if (this.field16671 == null || this.field16672 == null) {
            this.method10610();
         }

         for (int var5 = 0; var5 < this.field16671.length / 2; var5++) {
            this.field16671[var5 * 2 + 1] = this.field16671[var5 * 2 + 1] + var4;
         }

         this.field16672[1] = this.field16672[1] + var4;
         var1 += var4;
         this.field16676 += var4;
         this.field16678 += var4;
         this.field16682 = true;
      }
   }

   public float method10582() {
      return this.field16674;
   }

   public void method10583(Class2532 var1) {
      this.method10580(var1.field16737);
      this.method10581(var1.field16738);
   }

   public float method10584() {
      this.method10610();
      return this.field16672[0];
   }

   public void method10585(float var1) {
      if (this.field16671 == null || this.field16672 == null) {
         this.method10610();
      }

      float var4 = var1 - this.method10584();
      this.method10580(this.field16673 + var4);
   }

   public float method10586() {
      this.method10610();
      return this.field16672[1];
   }

   public void method10587(float var1) {
      if (this.field16671 == null || this.field16672 == null) {
         this.method10610();
      }

      float var4 = var1 - this.method10586();
      this.method10581(this.field16674 + var4);
   }

   public float method10588() {
      this.method10610();
      return this.field16675;
   }

   public float method10589() {
      this.method10610();
      return this.field16676;
   }

   public float method10590() {
      this.method10610();
      return this.field16677;
   }

   public float method10591() {
      this.method10610();
      return this.field16678;
   }

   public float method10592() {
      this.method10610();
      return this.field16679;
   }

   public float[] method10593() {
      this.method10610();
      return this.field16672;
   }

   public float[] method10594() {
      this.method10610();
      return this.field16671;
   }

   public int method10595() {
      this.method10610();
      return this.field16671.length / 2;
   }

   public float[] method10596(int var1) {
      this.method10610();
      return new float[]{this.field16671[var1 * 2], this.field16671[var1 * 2 + 1]};
   }

   public float[] method10597(int var1) {
      float[] var4 = this.method10596(var1);
      float[] var5 = this.method10596(var1 - 1 >= 0 ? var1 - 1 : this.method10595() - 1);
      float[] var6 = this.method10596(var1 + 1 < this.method10595() ? var1 + 1 : 0);
      float[] var7 = this.method10599(var5, var4);
      float[] var8 = this.method10599(var4, var6);
      if (var1 == 0 && !this.method10612()) {
         return var8;
      } else if (var1 == this.method10595() - 1 && !this.method10612()) {
         return var7;
      } else {
         float var9 = (var7[0] + var8[0]) / 2.0F;
         float var10 = (var7[1] + var8[1]) / 2.0F;
         float var11 = (float)Math.sqrt((double)(var9 * var9 + var10 * var10));
         return new float[]{var9 / var11, var10 / var11};
      }
   }

   public boolean method10598(Class2520 var1) {
      if (var1.method10603(this)) {
         return false;
      } else {
         for (int var4 = 0; var4 < var1.method10595(); var4++) {
            float[] var5 = var1.method10596(var4);
            if (!this.method10602(var5[0], var5[1])) {
               return false;
            }
         }

         return true;
      }
   }

   private float[] method10599(float[] var1, float[] var2) {
      float var5 = var1[0] - var2[0];
      float var6 = var1[1] - var2[1];
      float var7 = (float)Math.sqrt((double)(var5 * var5 + var6 * var6));
      var5 /= var7;
      var6 /= var7;
      return new float[]{-var6, var5};
   }

   public boolean method10600(float var1, float var2) {
      if (this.field16671.length != 0) {
         this.method10610();
         Class2530 var5 = new Class2530(0.0F, 0.0F, 0.0F, 0.0F);
         Class2532 var6 = new Class2532(var1, var2);

         for (int var7 = 0; var7 < this.field16671.length; var7 += 2) {
            int var8 = var7 + 2;
            if (var8 >= this.field16671.length) {
               var8 = 0;
            }

            var5.method10664(this.field16671[var7], this.field16671[var7 + 1], this.field16671[var8], this.field16671[var8 + 1]);
            if (var5.method10672(var6)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public int method10601(float var1, float var2) {
      for (int var5 = 0; var5 < this.field16671.length; var5 += 2) {
         if (this.field16671[var5] == var1 && this.field16671[var5 + 1] == var2) {
            return var5 / 2;
         }
      }

      return -1;
   }

   public boolean method10602(float var1, float var2) {
      this.method10610();
      if (this.field16671.length != 0) {
         boolean var5 = false;
         int var6 = this.field16671.length;
         float var7 = this.field16671[var6 - 2];
         float var8 = this.field16671[var6 - 1];

         for (int var9 = 0; var9 < var6; var9 += 2) {
            float var10 = this.field16671[var9];
            float var11 = this.field16671[var9 + 1];
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

   public boolean method10603(Class2520 var1) {
      this.method10610();
      boolean var4 = false;
      float[] var5 = this.method10594();
      float[] var6 = var1.method10594();
      int var7 = var5.length;
      int var8 = var6.length;
      if (!this.method10612()) {
         var7 -= 2;
      }

      if (!var1.method10612()) {
         var8 -= 2;
      }

      for (int var9 = 0; var9 < var7; var9 += 2) {
         int var10 = var9 + 2;
         if (var10 >= var5.length) {
            var10 = 0;
         }

         for (int var11 = 0; var11 < var8; var11 += 2) {
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

   public boolean method10604(float var1, float var2) {
      if (this.field16671.length != 0) {
         this.method10610();

         for (int var5 = 0; var5 < this.field16671.length; var5 += 2) {
            if (this.field16671[var5] == var1 && this.field16671[var5 + 1] == var2) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public void method10605() {
      this.field16672 = new float[]{0.0F, 0.0F};
      int var3 = this.field16671.length;

      for (int var4 = 0; var4 < var3; var4 += 2) {
         this.field16672[0] = this.field16672[0] + this.field16671[var4];
         this.field16672[1] = this.field16672[1] + this.field16671[var4 + 1];
      }

      this.field16672[0] = this.field16672[0] / (float)(var3 / 2);
      this.field16672[1] = this.field16672[1] / (float)(var3 / 2);
   }

   public void method10606() {
      this.field16679 = 0.0F;

      for (int var3 = 0; var3 < this.field16671.length; var3 += 2) {
         float var4 = (this.field16671[var3] - this.field16672[0]) * (this.field16671[var3] - this.field16672[0])
            + (this.field16671[var3 + 1] - this.field16672[1]) * (this.field16671[var3 + 1] - this.field16672[1]);
         this.field16679 = !(this.field16679 > var4) ? var4 : this.field16679;
      }

      this.field16679 = (float)Math.sqrt((double)this.field16679);
   }

   public void method10607() {
      if (this.field16682 || this.field16681 == null) {
         if (this.field16671.length >= 6) {
            boolean var3 = true;
            float var4 = 0.0F;

            for (int var5 = 0; var5 < this.field16671.length / 2 - 1; var5++) {
               float var6 = this.field16671[var5 * 2];
               float var7 = this.field16671[var5 * 2 + 1];
               float var8 = this.field16671[var5 * 2 + 2];
               float var9 = this.field16671[var5 * 2 + 3];
               var4 += var6 * var9 - var7 * var8;
            }

            var4 /= 2.0F;
            var3 = var4 > 0.0F;
            this.field16681 = new Class2537();

            for (int var12 = 0; var12 < this.field16671.length; var12 += 2) {
               this.field16681.method10705(this.field16671[var12], this.field16671[var12 + 1]);
            }

            this.field16681.method10707();
         }

         this.field16682 = false;
      }
   }

   public void method10608() {
      this.method10610();
      this.method10607();
      this.field16681 = new Class2534(this.field16681);
   }

   public Class2533 method10609() {
      this.method10610();
      this.method10607();
      return this.field16681;
   }

   public final void method10610() {
      if (this.field16680) {
         this.method10578();
         this.method10605();
         this.method10606();
         if (this.field16671.length > 0) {
            this.field16675 = this.field16671[0];
            this.field16676 = this.field16671[1];
            this.field16677 = this.field16671[0];
            this.field16678 = this.field16671[1];

            for (int var3 = 0; var3 < this.field16671.length / 2; var3++) {
               this.field16675 = Math.max(this.field16671[var3 * 2], this.field16675);
               this.field16676 = Math.max(this.field16671[var3 * 2 + 1], this.field16676);
               this.field16677 = Math.min(this.field16671[var3 * 2], this.field16677);
               this.field16678 = Math.min(this.field16671[var3 * 2 + 1], this.field16678);
            }
         }

         this.field16680 = false;
         this.field16682 = true;
      }
   }

   public void method10611() {
      this.method10610();
      this.method10609();
   }

   public boolean method10612() {
      return true;
   }

   public Class2520 method10613() {
      Class2526 var3 = new Class2526();

      for (int var4 = 0; var4 < this.method10595(); var4++) {
         int var5 = var4 + 1 < this.method10595() ? var4 + 1 : 0;
         int var6 = var4 - 1 >= 0 ? var4 - 1 : this.method10595() - 1;
         float var7 = this.method10596(var4)[0] - this.method10596(var6)[0];
         float var8 = this.method10596(var4)[1] - this.method10596(var6)[1];
         float var9 = this.method10596(var5)[0] - this.method10596(var4)[0];
         float var10 = this.method10596(var5)[1] - this.method10596(var4)[1];
         float var11 = (float)Math.sqrt((double)(var7 * var7 + var8 * var8));
         float var12 = (float)Math.sqrt((double)(var9 * var9 + var10 * var10));
         var7 /= var11;
         var8 /= var11;
         var9 /= var12;
         var10 /= var12;
         if (var7 != var9 || var8 != var10) {
            var3.method10642(this.method10596(var4)[0], this.method10596(var4)[1]);
         }
      }

      return var3;
   }

   public Class2520[] method10614(Class2520 var1) {
      return new Class8030().method27530(this, var1);
   }

   public Class2520[] method10615(Class2520 var1) {
      return new Class8030().method27533(this, var1);
   }

   public float method10616() {
      return this.field16675 - this.field16677;
   }

   public float method10617() {
      return this.field16676 - this.field16678;
   }
}

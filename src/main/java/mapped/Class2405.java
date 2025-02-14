package mapped;

import java.io.Serializable;

public class Class2405 implements Serializable, Cloneable {
   private int field16367;
   public double[] field16368;
   public static final long field16369 = 1398850036893875112L;

   public Class2405(int var1) {
      this.field16367 = var1;
      this.field16368 = new double[var1];

      for (int var4 = 0; var4 < var1; var4++) {
         this.field16368[var4] = 0.0;
      }
   }

   public Class2405(double[] var1) {
      this.field16367 = var1.length;
      this.field16368 = new double[var1.length];

      for (int var4 = 0; var4 < this.field16367; var4++) {
         this.field16368[var4] = var1[var4];
      }
   }

   public Class2405(Class2405 var1) {
      this.field16368 = new double[var1.field16367];
      this.field16367 = var1.field16367;

      for (int var4 = 0; var4 < this.field16367; var4++) {
         this.field16368[var4] = var1.field16368[var4];
      }
   }

   public Class2405(Class2399 var1) {
      this.field16368 = new double[2];
      this.field16368[0] = (double)var1.field16330;
      this.field16368[1] = (double)var1.field16331;
      this.field16367 = 2;
   }

   public Class2405(Class5 var1) {
      this.field16368 = new double[3];
      this.field16368[0] = (double)var1.field8;
      this.field16368[1] = (double)var1.field9;
      this.field16368[2] = (double)var1.field10;
      this.field16367 = 3;
   }

   public Class2405(Class2367 var1) {
      this.field16368 = new double[3];
      this.field16368[0] = var1.field16210;
      this.field16368[1] = var1.field16211;
      this.field16368[2] = var1.field16212;
      this.field16367 = 3;
   }

   public Class2405(Class2411 var1) {
      this.field16368 = new double[4];
      this.field16368[0] = (double)var1.field16389;
      this.field16368[1] = (double)var1.field16390;
      this.field16368[2] = (double)var1.field16391;
      this.field16368[3] = (double)var1.field16392;
      this.field16367 = 4;
   }

   public Class2405(Class2387 var1) {
      this.field16368 = new double[4];
      this.field16368[0] = var1.field16274;
      this.field16368[1] = var1.field16275;
      this.field16368[2] = var1.field16276;
      this.field16368[3] = var1.field16277;
      this.field16367 = 4;
   }

   public Class2405(double[] var1, int var2) {
      this.field16367 = var2;
      this.field16368 = new double[var2];

      for (int var5 = 0; var5 < var2; var5++) {
         this.field16368[var5] = var1[var5];
      }
   }

   public final double method10074() {
      double var3 = 0.0;

      for (int var5 = 0; var5 < this.field16367; var5++) {
         var3 += this.field16368[var5] * this.field16368[var5];
      }

      return Math.sqrt(var3);
   }

   public final double method10075() {
      double var3 = 0.0;

      for (int var5 = 0; var5 < this.field16367; var5++) {
         var3 += this.field16368[var5] * this.field16368[var5];
      }

      return var3;
   }

   public final void method10076(Class2405 var1) {
      double var4 = 0.0;
      if (this.field16367 != var1.field16367) {
         throw new Class2467(Class8148.method28252("GVector0"));
      } else {
         for (int var6 = 0; var6 < this.field16367; var6++) {
            var4 += var1.field16368[var6] * var1.field16368[var6];
         }

         double var7 = 1.0 / Math.sqrt(var4);

         for (int var9 = 0; var9 < this.field16367; var9++) {
            this.field16368[var9] = var1.field16368[var9] * var7;
         }
      }
   }

   public final void method10077() {
      double var3 = 0.0;

      for (int var5 = 0; var5 < this.field16367; var5++) {
         var3 += this.field16368[var5] * this.field16368[var5];
      }

      double var6 = 1.0 / Math.sqrt(var3);

      for (int var8 = 0; var8 < this.field16367; var8++) {
         this.field16368[var8] = this.field16368[var8] * var6;
      }
   }

   public final void method10078(double var1, Class2405 var3) {
      if (this.field16367 != var3.field16367) {
         throw new Class2467(Class8148.method28252("GVector1"));
      } else {
         for (int var6 = 0; var6 < this.field16367; var6++) {
            this.field16368[var6] = var3.field16368[var6] * var1;
         }
      }
   }

   public final void method10079(double var1) {
      for (int var5 = 0; var5 < this.field16367; var5++) {
         this.field16368[var5] = this.field16368[var5] * var1;
      }
   }

   public final void method10080(double var1, Class2405 var3, Class2405 var4) {
      if (var4.field16367 != var3.field16367) {
         throw new Class2467(Class8148.method28252("GVector2"));
      } else if (this.field16367 != var3.field16367) {
         throw new Class2467(Class8148.method28252("GVector3"));
      } else {
         for (int var7 = 0; var7 < this.field16367; var7++) {
            this.field16368[var7] = var3.field16368[var7] * var1 + var4.field16368[var7];
         }
      }
   }

   public final void method10081(Class2405 var1) {
      if (this.field16367 != var1.field16367) {
         throw new Class2467(Class8148.method28252("GVector4"));
      } else {
         for (int var4 = 0; var4 < this.field16367; var4++) {
            this.field16368[var4] = this.field16368[var4] + var1.field16368[var4];
         }
      }
   }

   public final void method10082(Class2405 var1, Class2405 var2) {
      if (var1.field16367 != var2.field16367) {
         throw new Class2467(Class8148.method28252("GVector5"));
      } else if (this.field16367 != var1.field16367) {
         throw new Class2467(Class8148.method28252("GVector6"));
      } else {
         for (int var5 = 0; var5 < this.field16367; var5++) {
            this.field16368[var5] = var1.field16368[var5] + var2.field16368[var5];
         }
      }
   }

   public final void method10083(Class2405 var1) {
      if (this.field16367 != var1.field16367) {
         throw new Class2467(Class8148.method28252("GVector7"));
      } else {
         for (int var4 = 0; var4 < this.field16367; var4++) {
            this.field16368[var4] = this.field16368[var4] - var1.field16368[var4];
         }
      }
   }

   public final void method10084(Class2405 var1, Class2405 var2) {
      if (var1.field16367 != var2.field16367) {
         throw new Class2467(Class8148.method28252("GVector8"));
      } else if (this.field16367 != var1.field16367) {
         throw new Class2467(Class8148.method28252("GVector9"));
      } else {
         for (int var5 = 0; var5 < this.field16367; var5++) {
            this.field16368[var5] = var1.field16368[var5] - var2.field16368[var5];
         }
      }
   }

   public final void method10085(Class2362 var1, Class2405 var2) {
      if (var1.method9309() != var2.field16367) {
         throw new Class2467(Class8148.method28252("GVector10"));
      } else if (this.field16367 != var1.method9308()) {
         throw new Class2467(Class8148.method28252("GVector11"));
      } else {
         double[] var5;
         if (var2 == this) {
            var5 = (double[])this.field16368.clone();
         } else {
            var5 = var2.field16368;
         }

         for (int var6 = this.field16367 - 1; var6 >= 0; var6--) {
            this.field16368[var6] = 0.0;

            for (int var7 = var2.field16367 - 1; var7 >= 0; var7--) {
               this.field16368[var6] = this.field16368[var6] + var1.field16182[var6][var7] * var5[var7];
            }
         }
      }
   }

   public final void method10086(Class2405 var1, Class2362 var2) {
      if (var2.method9308() != var1.field16367) {
         throw new Class2467(Class8148.method28252("GVector12"));
      } else if (this.field16367 != var2.method9309()) {
         throw new Class2467(Class8148.method28252("GVector13"));
      } else {
         double[] var5;
         if (var1 == this) {
            var5 = (double[])this.field16368.clone();
         } else {
            var5 = var1.field16368;
         }

         for (int var6 = this.field16367 - 1; var6 >= 0; var6--) {
            this.field16368[var6] = 0.0;

            for (int var7 = var1.field16367 - 1; var7 >= 0; var7--) {
               this.field16368[var6] = this.field16368[var6] + var2.field16182[var7][var6] * var5[var7];
            }
         }
      }
   }

   public final void method10087() {
      for (int var3 = this.field16367 - 1; var3 >= 0; var3--) {
         this.field16368[var3] = this.field16368[var3] * -1.0;
      }
   }

   public final void method10088() {
      for (int var3 = 0; var3 < this.field16367; var3++) {
         this.field16368[var3] = 0.0;
      }
   }

   public final void method10089(int var1) {
      double[] var4 = new double[var1];
      int var5;
      if (this.field16367 >= var1) {
         var5 = var1;
      } else {
         var5 = this.field16367;
      }

      for (int var6 = 0; var6 < var5; var6++) {
         var4[var6] = this.field16368[var6];
      }

      this.field16367 = var1;
      this.field16368 = var4;
   }

   public final void method10090(double[] var1) {
      for (int var4 = this.field16367 - 1; var4 >= 0; var4--) {
         this.field16368[var4] = var1[var4];
      }
   }

   public final void method10091(Class2405 var1) {
      if (this.field16367 >= var1.field16367) {
         for (int var4 = 0; var4 < var1.field16367; var4++) {
            this.field16368[var4] = var1.field16368[var4];
         }

         for (int var5 = var1.field16367; var5 < this.field16367; var5++) {
            this.field16368[var5] = 0.0;
         }
      } else {
         this.field16367 = var1.field16367;
         this.field16368 = new double[this.field16367];

         for (int var6 = 0; var6 < this.field16367; var6++) {
            this.field16368[var6] = var1.field16368[var6];
         }
      }
   }

   public final void method10092(Class2399 var1) {
      if (this.field16367 < 2) {
         this.field16367 = 2;
         this.field16368 = new double[2];
      }

      this.field16368[0] = (double)var1.field16330;
      this.field16368[1] = (double)var1.field16331;

      for (int var4 = 2; var4 < this.field16367; var4++) {
         this.field16368[var4] = 0.0;
      }
   }

   public final void method10093(Class5 var1) {
      if (this.field16367 < 3) {
         this.field16367 = 3;
         this.field16368 = new double[3];
      }

      this.field16368[0] = (double)var1.field8;
      this.field16368[1] = (double)var1.field9;
      this.field16368[2] = (double)var1.field10;

      for (int var4 = 3; var4 < this.field16367; var4++) {
         this.field16368[var4] = 0.0;
      }
   }

   public final void method10094(Class2367 var1) {
      if (this.field16367 < 3) {
         this.field16367 = 3;
         this.field16368 = new double[3];
      }

      this.field16368[0] = var1.field16210;
      this.field16368[1] = var1.field16211;
      this.field16368[2] = var1.field16212;

      for (int var4 = 3; var4 < this.field16367; var4++) {
         this.field16368[var4] = 0.0;
      }
   }

   public final void method10095(Class2411 var1) {
      if (this.field16367 < 4) {
         this.field16367 = 4;
         this.field16368 = new double[4];
      }

      this.field16368[0] = (double)var1.field16389;
      this.field16368[1] = (double)var1.field16390;
      this.field16368[2] = (double)var1.field16391;
      this.field16368[3] = (double)var1.field16392;

      for (int var4 = 4; var4 < this.field16367; var4++) {
         this.field16368[var4] = 0.0;
      }
   }

   public final void method10096(Class2387 var1) {
      if (this.field16367 < 4) {
         this.field16367 = 4;
         this.field16368 = new double[4];
      }

      this.field16368[0] = var1.field16274;
      this.field16368[1] = var1.field16275;
      this.field16368[2] = var1.field16276;
      this.field16368[3] = var1.field16277;

      for (int var4 = 4; var4 < this.field16367; var4++) {
         this.field16368[var4] = 0.0;
      }
   }

   public final int method10097() {
      return this.field16368.length;
   }

   public final double method10098(int var1) {
      return this.field16368[var1];
   }

   public final void method10099(int var1, double var2) {
      this.field16368[var1] = var2;
   }

   @Override
   public String toString() {
      StringBuffer var3 = new StringBuffer(this.field16367 * 8);

      for (int var4 = 0; var4 < this.field16367; var4++) {
         var3.append(this.field16368[var4]).append(" ");
      }

      return var3.toString();
   }

   @Override
   public int hashCode() {
      long var3 = 1L;

      for (int var5 = 0; var5 < this.field16367; var5++) {
         var3 = 31L * var3 + Class9832.method38797(this.field16368[var5]);
      }

      return (int)(var3 ^ var3 >> 32);
   }

   public boolean equals(Class2405 var1) {
      try {
         if (this.field16367 != var1.field16367) {
            return false;
         } else {
            for (int var4 = 0; var4 < this.field16367; var4++) {
               if (this.field16368[var4] != var1.field16368[var4]) {
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
         Class2405 var4 = (Class2405)var1;
         if (this.field16367 != var4.field16367) {
            return false;
         } else {
            for (int var5 = 0; var5 < this.field16367; var5++) {
               if (this.field16368[var5] != var4.field16368[var5]) {
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

   public boolean method10100(Class2405 var1, double var2) {
      if (this.field16367 == var1.field16367) {
         for (int var6 = 0; var6 < this.field16367; var6++) {
            double var7 = this.field16368[var6] - var1.field16368[var6];
            if ((!(var7 < 0.0) ? var7 : -var7) > var2) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public final double method10101(Class2405 var1) {
      if (this.field16367 != var1.field16367) {
         throw new Class2467(Class8148.method28252("GVector14"));
      } else {
         double var4 = 0.0;

         for (int var6 = 0; var6 < this.field16367; var6++) {
            var4 += this.field16368[var6] * var1.field16368[var6];
         }

         return var4;
      }
   }

   public final void method10102(Class2362 var1, Class2362 var2, Class2362 var3, Class2405 var4) {
      if (var1.field16180 != var4.method10097() || var1.field16180 != var1.field16181 || var1.field16180 != var2.field16180) {
         throw new Class2467(Class8148.method28252("GVector15"));
      } else if (var2.field16181 == this.field16368.length && var2.field16181 == var3.field16181 && var2.field16181 == var3.field16180) {
         Class2362 var7 = new Class2362(var1.field16180, var2.field16181);
         var7.method9287(var1, var3);
         var7.method9326(var1, var2);
         var7.method9298();
         this.method10085(var7, var4);
      } else {
         throw new Class2467(Class8148.method28252("GVector23"));
      }
   }

   public final void method10103(Class2362 var1, Class2405 var2, Class2405 var3) {
      int var6 = var1.field16180 * var1.field16181;
      double[] var7 = new double[var6];
      double[] var8 = new double[var6];
      int[] var9 = new int[var2.method10097()];
      if (var1.field16180 != var2.method10097()) {
         throw new Class2467(Class8148.method28252("GVector16"));
      } else if (var1.field16180 != var3.method10097()) {
         throw new Class2467(Class8148.method28252("GVector24"));
      } else if (var1.field16180 != var1.field16181) {
         throw new Class2467(Class8148.method28252("GVector25"));
      } else {
         for (int var10 = 0; var10 < var1.field16180; var10++) {
            for (int var11 = 0; var11 < var1.field16181; var11++) {
               var7[var10 * var1.field16181 + var11] = var1.field16182[var10][var11];
            }
         }

         for (int var12 = 0; var12 < var6; var12++) {
            var8[var12] = 0.0;
         }

         for (int var13 = 0; var13 < var1.field16180; var13++) {
            var8[var13 * var1.field16181] = var2.field16368[var13];
         }

         for (int var14 = 0; var14 < var1.field16181; var14++) {
            var9[var14] = (int)var3.field16368[var14];
         }

         Class2362.method9339(var1.field16180, var7, var9, var8);

         for (int var15 = 0; var15 < var1.field16180; var15++) {
            this.field16368[var15] = var8[var15 * var1.field16181];
         }
      }
   }

   public final double method10104(Class2405 var1) {
      return Math.acos(this.method10101(var1) / (this.method10074() * var1.method10074()));
   }

   /** @deprecated */
   public final void method10105(Class2405 var1, Class2405 var2, float var3) {
      this.method10107(var1, var2, (double)var3);
   }

   /** @deprecated */
   public final void method10106(Class2405 var1, float var2) {
      this.method10108(var1, (double)var2);
   }

   public final void method10107(Class2405 var1, Class2405 var2, double var3) {
      if (var2.field16367 != var1.field16367) {
         throw new Class2467(Class8148.method28252("GVector20"));
      } else if (this.field16367 != var1.field16367) {
         throw new Class2467(Class8148.method28252("GVector21"));
      } else {
         for (int var7 = 0; var7 < this.field16367; var7++) {
            this.field16368[var7] = (1.0 - var3) * var1.field16368[var7] + var3 * var2.field16368[var7];
         }
      }
   }

   public final void method10108(Class2405 var1, double var2) {
      if (var1.field16367 != this.field16367) {
         throw new Class2467(Class8148.method28252("GVector22"));
      } else {
         for (int var6 = 0; var6 < this.field16367; var6++) {
            this.field16368[var6] = (1.0 - var2) * this.field16368[var6] + var2 * var1.field16368[var6];
         }
      }
   }

   @Override
   public Object clone() {
      Class2405 var3 = null;

      try {
         var3 = (Class2405)super.clone();
      } catch (CloneNotSupportedException var5) {
         throw new InternalError();
      }

      var3.field16368 = new double[this.field16367];

      for (int var4 = 0; var4 < this.field16367; var4++) {
         var3.field16368[var4] = this.field16368[var4];
      }

      return var3;
   }
}

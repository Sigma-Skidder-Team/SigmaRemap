package mapped;


public class Class2537 implements Class2533 {
   public static final float field16752 = 1.0E-6F;
   private float[] field16753;
   private float[] field16754;
   private int field16755;
   private Class9594[] field16756;
   private int[] field16757;
   private int field16758;
   private Class9563[] field16759;
   private int field16760;
   private float field16761 = 1.0E-6F;

   public Class2537() {
      this.field16753 = new float[100];
      this.field16754 = new float[100];
      this.field16755 = 0;
      this.field16756 = new Class9594[100];
      this.field16758 = 0;
      this.field16759 = new Class9563[100];
      this.field16760 = 0;
   }

   public void method10723() {
      this.field16755 = 0;
      this.field16758 = 0;
      this.field16760 = 0;
   }

   private int method10724(int var1, int var2) {
      int var5;
      int var6;
      if (var1 >= var2) {
         var5 = var2;
         var6 = var1;
      } else {
         var5 = var1;
         var6 = var2;
      }

      for (int var7 = 0; var7 < this.field16758; var7++) {
         if (this.field16756[var7].field44872 == var5 && this.field16756[var7].field44873 == var6) {
            return var7;
         }
      }

      return -1;
   }

   private void method10725(int var1, int var2, int var3) {
      int var6 = this.method10724(var1, var2);
      Class9594 var7;
      int var8;
      int var9;
      if (var6 >= 0) {
         var7 = this.field16756[var6];
         var8 = var7.field44874;
         var9 = var7.field44875;
      } else {
         if (this.field16758 == this.field16756.length) {
            Class9594[] var10 = new Class9594[this.field16756.length * 2];
            System.arraycopy(this.field16756, 0, var10, 0, this.field16758);
            this.field16756 = var10;
         }

         var8 = -1;
         var9 = -1;
         var6 = this.field16758++;
         var7 = this.field16756[var6] = new Class9594(this);
      }

      int var11;
      int var13;
      if (var1 >= var2) {
         var13 = var2;
         var11 = var1;
         var9 = var3;
      } else {
         var13 = var1;
         var11 = var2;
         var8 = var3;
      }

      var7.field44872 = var13;
      var7.field44873 = var11;
      var7.field44874 = var8;
      var7.field44875 = var9;
      var7.field44876 = true;
   }

   private void method10726(int var1, int var2) throws Class2433 {
      int var5;
      if (0 <= (var5 = this.method10724(var1, var2))) {
         this.field16756[var5] = this.field16756[--this.field16758];
      } else {
         throw new Class2433(this, "Attempt to delete unknown edge");
      }
   }

   public void method10727(int var1, int var2, boolean var3) throws Class2433 {
      int var6;
      if (0 <= (var6 = this.method10724(var1, var2))) {
         this.field16756[var6].field44876 = var3;
      } else {
         throw new Class2433(this, "Attempt to mark unknown edge");
      }
   }

   private Class9594 method10728() {
      for (int var3 = 0; var3 < this.field16758; var3++) {
         Class9594 var4 = this.field16756[var3];
         if (var4.field44876) {
            var4.field44876 = false;
            if (var4.field44874 >= 0 && var4.field44875 >= 0) {
               return var4;
            }
         }
      }

      return null;
   }

   private static float method10729(float var0, float var1, float var2, float var3, float var4, float var5) {
      float var8 = var4 - var2;
      float var9 = var5 - var3;
      float var10 = var0 - var4;
      float var11 = var1 - var5;
      float var12 = var8 * var11 - var9 * var10;
      if (!(var12 > 0.0F)) {
         return -1.0F;
      } else {
         if (var12 < 1.0E-6F) {
            var12 = 1.0E-6F;
         }

         float var13 = var8 * var8;
         float var14 = var9 * var9;
         float var15 = var10 * var10;
         float var16 = var11 * var11;
         float var17 = var2 - var0;
         float var18 = var3 - var1;
         float var19 = var17 * var17;
         float var20 = var18 * var18;
         return (var13 + var14) * (var15 + var16) * (var19 + var20) / (var12 * var12);
      }
   }

   private static boolean method10730(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var10 = var4 - var2;
      float var11 = var5 - var3;
      float var12 = var0 - var4;
      float var13 = var1 - var5;
      float var14 = var2 - var0;
      float var15 = var3 - var1;
      float var16 = var6 - var0;
      float var17 = var7 - var1;
      float var18 = var6 - var2;
      float var19 = var7 - var3;
      float var20 = var6 - var4;
      float var21 = var7 - var5;
      float var22 = var10 * var19 - var11 * var18;
      float var23 = var14 * var17 - var15 * var16;
      float var24 = var12 * var21 - var13 * var20;
      return (double)var22 >= 0.0 && (double)var24 >= 0.0 && (double)var23 >= 0.0;
   }

   private boolean method10731(int var1, int var2, int var3, int var4) {
      float var7 = this.field16753[this.field16757[var1]];
      float var8 = this.field16754[this.field16757[var1]];
      float var9 = this.field16753[this.field16757[var2]];
      float var10 = this.field16754[this.field16757[var2]];
      float var11 = this.field16753[this.field16757[var3]];
      float var12 = this.field16754[this.field16757[var3]];
      if (!(1.0E-6F > (var9 - var7) * (var12 - var8) - (var10 - var8) * (var11 - var7))) {
         for (int var13 = 0; var13 < var4; var13++) {
            if (var13 != var1 && var13 != var2 && var13 != var3) {
               float var14 = this.field16753[this.field16757[var13]];
               float var15 = this.field16754[this.field16757[var13]];
               if (method10730(var7, var8, var9, var10, var11, var12, var14, var15)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private float method10732() {
      float var3 = 0.0F;
      int var4 = this.field16755 - 1;

      for (int var5 = 0; var5 < this.field16755; var4 = var5++) {
         var3 += this.field16753[var4] * this.field16754[var5] - this.field16754[var4] * this.field16753[var5];
      }

      return var3 * 0.5F;
   }

   public void method10733() throws Class2433 {
      int var3 = this.field16755;
      if (var3 >= 3) {
         this.field16758 = 0;
         this.field16760 = 0;
         this.field16757 = new int[var3];
         if (!(0.0 < (double)this.method10732())) {
            for (int var4 = 0; var4 < var3; var4++) {
               this.field16757[var4] = this.field16755 - 1 - var4;
            }
         } else {
            int var13 = 0;

            while (var13 < var3) {
               this.field16757[var13] = var13++;
            }
         }

         int var14 = 2 * var3;
         int var5 = var3 - 1;

         while (var3 > 2) {
            if (0 >= var14--) {
               throw new Class2433(this, "Bad polygon");
            }

            int var6 = var5;
            if (var3 <= var5) {
               var6 = 0;
            }

            var5 = var6 + 1;
            if (var3 <= var5) {
               var5 = 0;
            }

            int var7 = var5 + 1;
            if (var3 <= var7) {
               var7 = 0;
            }

            if (this.method10731(var6, var5, var7, var3)) {
               int var8 = this.field16757[var6];
               int var9 = this.field16757[var5];
               int var10 = this.field16757[var7];
               if (this.field16760 == this.field16759.length) {
                  Class9563[] var11 = new Class9563[this.field16759.length * 2];
                  System.arraycopy(this.field16759, 0, var11, 0, this.field16760);
                  this.field16759 = var11;
               }

               this.field16759[this.field16760] = new Class9563(this, var8, var9, var10);
               this.method10725(var8, var9, this.field16760);
               this.method10725(var9, var10, this.field16760);
               this.method10725(var10, var8, this.field16760);
               this.field16760++;
               int var15 = var5;

               for (int var12 = var5 + 1; var12 < var3; var12++) {
                  this.field16757[var15] = this.field16757[var12];
                  var15++;
               }

               var14 = 2 * --var3;
            }
         }

         this.field16757 = null;
      }
   }

   private void method10734() throws Class2433 {
      Class9594 var3;
      while ((var3 = this.method10728()) != null) {
         int var4 = var3.field44872;
         int var5 = var3.field44873;
         int var6 = var3.field44874;
         int var7 = var3.field44875;
         int var8 = -1;
         int var9 = -1;

         for (int var10 = 0; var10 < 3; var10++) {
            int var11 = this.field16759[var6].field44538[var10];
            if (var4 != var11 && var5 != var11) {
               var9 = var11;
               break;
            }
         }

         for (int var22 = 0; var22 < 3; var22++) {
            int var24 = this.field16759[var7].field44538[var22];
            if (var4 != var24 && var5 != var24) {
               var8 = var24;
               break;
            }
         }

         if (-1 != var8 && -1 != var9) {
            float var23 = this.field16753[var4];
            float var25 = this.field16754[var4];
            float var12 = this.field16753[var8];
            float var13 = this.field16754[var8];
            float var14 = this.field16753[var5];
            float var15 = this.field16754[var5];
            float var16 = this.field16753[var9];
            float var17 = this.field16754[var9];
            float var18 = method10729(var23, var25, var12, var13, var14, var15);
            float var19 = method10729(var23, var25, var14, var15, var16, var17);
            float var20 = method10729(var12, var13, var14, var15, var16, var17);
            float var21 = method10729(var12, var13, var16, var17, var23, var25);
            if (!(0.0F > var18) && !(0.0F > var19)) {
               if (!(0.0F <= var20) || !(0.0F <= var21)) {
                  continue;
               }

               if (var18 > var19) {
                  var18 = var19;
               }

               if (var20 > var21) {
                  var20 = var21;
               }

               if (var18 > var20) {
                  this.method10726(var4, var5);
                  this.field16759[var6].field44538[0] = var8;
                  this.field16759[var6].field44538[1] = var5;
                  this.field16759[var6].field44538[2] = var9;
                  this.field16759[var7].field44538[0] = var8;
                  this.field16759[var7].field44538[1] = var9;
                  this.field16759[var7].field44538[2] = var4;
                  this.method10725(var8, var5, var6);
                  this.method10725(var5, var9, var6);
                  this.method10725(var9, var8, var6);
                  this.method10725(var9, var4, var7);
                  this.method10725(var4, var8, var7);
                  this.method10725(var8, var9, var7);
                  this.method10727(var8, var9, false);
               }
               continue;
            }

            throw new Class2433(this, "original triangles backwards");
         }

         throw new Class2433(this, "can't find quad");
      }
   }

   @Override
   public boolean method10707() {
      try {
         this.method10733();
         return true;
      } catch (Class2433 var4) {
         this.field16758 = 0;
         return false;
      }
   }

   @Override
   public void method10705(float var1, float var2) {
      for (int var5 = 0; var5 < this.field16755; var5++) {
         if (this.field16753[var5] == var1 && this.field16754[var5] == var2) {
            var2 += this.field16761;
            this.field16761 += 1.0E-6F;
         }
      }

      if (this.field16755 == this.field16753.length) {
         float[] var6 = new float[this.field16755 * 2];
         System.arraycopy(this.field16753, 0, var6, 0, this.field16755);
         this.field16753 = var6;
         var6 = new float[this.field16755 * 2];
         System.arraycopy(this.field16754, 0, var6, 0, this.field16755);
         this.field16754 = var6;
      }

      this.field16753[this.field16755] = var1;
      this.field16754[this.field16755] = var2;
      this.field16755++;
   }

   @Override
   public int method10703() {
      return this.field16760;
   }

   @Override
   public float[] method10704(int var1, int var2) {
      float var5 = this.field16753[this.field16759[var1].field44538[var2]];
      float var6 = this.field16754[this.field16759[var1].field44538[var2]];
      return new float[]{var5, var6};
   }

   @Override
   public void method10706() {
   }
}

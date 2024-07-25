package remapped;

public class class_8416 implements class_2993 {
   private static final int field_43037 = 16;
   private static final int[][] field_43039 = new int[16][];
   private final int field_43042;
   private final int[] field_43041;
   private float[] field_43040;

   public class_8416(int var1) {
      if (!method_38734(var1)) {
         throw new IllegalArgumentException("N is not a power of 2");
      } else if (var1 <= 0) {
         throw new IllegalArgumentException("N must be greater than 0");
      } else {
         this.field_43042 = var1;
         int var4 = method_38735(var1);
         this.field_43041 = new int[var1];

         for (int var5 = 0; var5 < var1; var5++) {
            int var6 = method_38738(var5, var4);
            this.field_43041[var5] = var6;
         }

         this.field_43040 = new float[var1];

         for (int var7 = 0; var7 < var1; var7++) {
            if (var7 > var1 / 2) {
               this.field_43040[var7] = -((float)(var1 - var7) / (float)var1);
            } else {
               this.field_43040[var7] = (float)(var7 / var1);
            }
         }
      }
   }

   @Override
   public float[][] method_13691(float[] var1, float[] var2) throws UnsupportedOperationException {
      float[][] var5 = new float[2][var1.length];
      this.method_38736(true, var1, var2, var5[0], var5[1]);
      return var5;
   }

   @Override
   public float[][] method_13692(float[] var1) throws UnsupportedOperationException {
      float[][] var4 = new float[3][var1.length];
      this.method_38736(false, var1, null, var4[0], var4[1]);
      var4[2] = (float[])this.field_43040.clone();
      return var4;
   }

   @Override
   public float[][] method_13693(float[] var1, float[] var2) throws UnsupportedOperationException {
      float[][] var5 = new float[3][var1.length];
      this.method_38736(false, var1, var2, var5[0], var5[1]);
      var5[2] = (float[])this.field_43040.clone();
      return var5;
   }

   public void method_38736(boolean var1, float[] var2, float[] var3, float[] var4, float[] var5) {
      if (var2.length != this.field_43042) {
         throw new IllegalArgumentException("Number of samples must be " + this.field_43042 + " for this instance of JavaFFT");
      } else {
         for (int var8 = 0; var8 < this.field_43042; var8++) {
            var4[this.field_43041[var8]] = var2[var8];
         }

         if (var3 != null) {
            for (int var44 = 0; var44 < this.field_43042; var44++) {
               var5[this.field_43041[var44]] = var3[var44];
            }
         }

         byte var45 = 1;
         double var9;
         if (!var1) {
            var9 = Math.PI * 2;
         } else {
            var9 = -Math.PI * 2;
         }

         for (byte var11 = 2; var11 <= this.field_43042; var11 <<= 1) {
            double var12 = var9 / (double)((float)var11);
            double var14 = -Math.sin(-2.0 * var12);
            double var16 = -Math.sin(-var12);
            double var18 = Math.cos(-2.0 * var12);
            double var20 = Math.cos(-var12);
            double var22 = 2.0 * var20;

            for (byte var24 = 0; var24 < this.field_43042; var24 += var11) {
               double var25 = var18;
               double var27 = var20;
               double var29 = var14;
               double var31 = var16;
               int var33 = var24;

               for (int var34 = 0; var34 < var45; var34++) {
                  double var35 = var22 * var27 - var25;
                  var25 = var27;
                  var27 = var35;
                  double var37 = var22 * var31 - var29;
                  var29 = var31;
                  var31 = var37;
                  int var39 = var33 + var45;
                  double var40 = var35 * (double)var4[var39] - var37 * (double)var5[var39];
                  double var42 = var35 * (double)var5[var39] + var37 * (double)var4[var39];
                  var4[var39] = (float)((double)var4[var33] - var40);
                  var5[var39] = (float)((double)var5[var33] - var42);
                  var4[var33] = (float)((double)var4[var33] + var40);
                  var5[var33] = (float)((double)var5[var33] + var42);
                  var33++;
               }
            }

            var45 = var11;
         }

         if (var1) {
            for (int var46 = 0; var46 < this.field_43042; var46++) {
               var4[var46] /= (float)this.field_43042;
               var5[var46] /= (float)this.field_43042;
            }
         }
      }
   }

   private static int method_38735(int var0) {
      int var3 = 0;

      while (true) {
         int var4 = var0 & 1 << var3;
         if (var4 != 0) {
            return var3;
         }

         var3++;
      }
   }

   private static int method_38739(int var0, int var1) {
      int var4 = var0;
      int var5 = 0;

      for (int var6 = 0; var6 < var1; var6++) {
         var5 = var5 << 1 | var4 & 1;
         var4 >>= 1;
      }

      return var5;
   }

   private static int method_38738(int var0, int var1) {
      return var1 > 16 ? method_38739(var0, var1) : field_43039[var1 - 1][var0];
   }

   private static boolean method_38734(int var0) {
      return (var0 & var0 - 1) == 0;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            class_8416 var4 = (class_8416)var1;
            return this.field_43042 == var4.field_43042;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return this.field_43042;
   }

   @Override
   public String toString() {
      return "JavaFFT{N=" + this.field_43042 + '}';
   }

   static {
      byte var4 = 2;

      for (int var5 = 1; var5 <= 16; var5++) {
         field_43039[var5 - 1] = new int[var4];

         for (int var8 = 0; var8 < var4; var8++) {
            field_43039[var5 - 1][var8] = method_38739(var8, var5);
         }

         var4 <<= 1;
      }
   }
}

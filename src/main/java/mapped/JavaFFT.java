package mapped;

public class JavaFFT implements Class7897 {
   private static final int field33849 = 16;
   private static final int[][] field33850 = new int[16][];
   private final int field33851;
   private final int[] field33852;
   private float[] field33853;

   public JavaFFT(int var1) {
      if (!method26469(var1)) {
         throw new IllegalArgumentException("N is not a power of 2");
      } else if (var1 <= 0) {
         throw new IllegalArgumentException("N must be greater than 0");
      } else {
         this.field33851 = var1;
         int var4 = method26466(var1);
         this.field33852 = new int[var1];

         for (int var5 = 0; var5 < var1; var5++) {
            int var6 = method26468(var5, var4);
            this.field33852[var5] = var6;
         }

         this.field33853 = new float[var1];

         for (int var7 = 0; var7 < var1; var7++) {
            if (var7 > var1 / 2) {
               this.field33853[var7] = -((float)(var1 - var7) / (float)var1);
            } else {
               this.field33853[var7] = (float)(var7 / var1);
            }
         }
      }
   }

   @Override
   public float[][] inverseTransform(float[] var1, float[] var2) throws UnsupportedOperationException {
      float[][] var5 = new float[2][var1.length];
      this.transform(true, var1, var2, var5[0], var5[1]);
      return var5;
   }

   @Override
   public float[][] transform(float[] var1) throws UnsupportedOperationException {
      float[][] var4 = new float[3][var1.length];
      this.transform(false, var1, null, var4[0], var4[1]);
      var4[2] = this.field33853.clone();
      return var4;
   }

   @Override
   public float[][] transform(float[] var1, float[] var2) throws UnsupportedOperationException {
      float[][] var5 = new float[3][var1.length];
      this.transform(false, var1, var2, var5[0], var5[1]);
      var5[2] = (float[])this.field33853.clone();
      return var5;
   }

   public void transform(boolean var1, float[] var2, float[] var3, float[] var4, float[] var5) {
      if (var2.length != this.field33851) {
         throw new IllegalArgumentException("Number of samples must be " + this.field33851 + " for this instance of JavaFFT");
      } else {
         for (int var8 = 0; var8 < this.field33851; var8++) {
            var4[this.field33852[var8]] = var2[var8];
         }

         if (var3 != null) {
            for (int var44 = 0; var44 < this.field33851; var44++) {
               var5[this.field33852[var44]] = var3[var44];
            }
         }

         int var45 = 1;
         double var9;
         if (!var1) {
            var9 = Math.PI * 2;
         } else {
            var9 = -Math.PI * 2;
         }

         for (int var11 = 2; var11 <= this.field33851; var11 <<= 1) {
            double var12 = var9 / (double)((float)var11);
            double var14 = -Math.sin(-2.0 * var12);
            double var16 = -Math.sin(-var12);
            double var18 = Math.cos(-2.0 * var12);
            double var20 = Math.cos(-var12);
            double var22 = 2.0 * var20;

            for (int var24 = 0; var24 < this.field33851; var24 += var11) {
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
            for (int var46 = 0; var46 < this.field33851; var46++) {
               var4[var46] /= (float)this.field33851;
               var5[var46] /= (float)this.field33851;
            }
         }
      }
   }

   private static int method26466(int var0) {
      int var3 = 0;

      while (true) {
         int var4 = var0 & 1 << var3;
         if (var4 != 0) {
            return var3;
         }

         var3++;
      }
   }

   private static int method26467(int var0, int var1) {
      int var4 = var0;
      int var5 = 0;

      for (int var6 = 0; var6 < var1; var6++) {
         var5 = var5 << 1 | var4 & 1;
         var4 >>= 1;
      }

      return var5;
   }

   private static int method26468(int var0, int var1) {
      return var1 > 16 ? method26467(var0, var1) : field33850[var1 - 1][var0];
   }

   private static boolean method26469(int var0) {
      return (var0 & var0 - 1) == 0;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            JavaFFT var4 = (JavaFFT)var1;
            return this.field33851 == var4.field33851;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return this.field33851;
   }

   @Override
   public String toString() {
      return "JavaFFT{N=" + this.field33851 + '}';
   }

   // $VF: synthetic method
   public static int method26470(JavaFFT var0) {
      return var0.field33851;
   }

   static {
      long var4 = 2;  // Change int to long to prevent overflow

      for (int var5 = 1; var5 <= 16; var5++) {
         if (var4 <= 0) {
            System.err.println("Debug Info: var4 is " + var4 + " at iteration " + var5);
            throw new IllegalArgumentException("Array size cannot be negative or zero");
         }

         field33850[var5 - 1] = new int[(int) var4];  // Cast back to int for array size

         for (int var8 = 0; var8 < var4; var8++) {
            field33850[var5 - 1][var8] = method26467(var8, var5);
         }

         var4 <<= 1;  // Shifting as a long to avoid overflow
      }
   }

}

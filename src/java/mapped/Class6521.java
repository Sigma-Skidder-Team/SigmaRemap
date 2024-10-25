package mapped;



public class Class6521 extends Class6522 implements Class6515 {
   private static String[] field28594;
   public static final int field28595 = 0;
   public static final int field28596 = 1;
   public static final int field28597 = 2;
   private static final float[] field28598 = new float[]{1.0905077F, 1.1892071F, 1.4142135F, 2.0F};
   private final Class6512 field28599;
   private float[] field28600;
   private int field28601;
   private int field28602;
   private final boolean[] field28603;
   private final int[] field28604;
   private final int[] field28605;
   private final float[][] field28606;

   public Class6521(int var1) {
      this.field28599 = new Class6512(var1);
      this.field28603 = new boolean[8];
      this.field28604 = new int[8];
      this.field28605 = new int[8];
      this.field28606 = new float[16][120];
   }

   public int method19765() {
      return this.field28601;
   }

   public int method19766() {
      return this.field28602;
   }

   public boolean method19767(int var1) {
      return this.field28603[var1];
   }

   public int method19768(int var1) {
      return this.field28604[var1];
   }

   public int method19769(int var1) {
      return this.field28605[var1];
   }

   public void method19770(Class9189 var1, Class6516 var2) throws AACException {
      this.field28601 = 2 * var1.method34398();
      this.field28602 = var1.method34397(3);
      int var5 = 0;

      for (int var6 = 0; var6 <= this.field28602; var6++) {
         var5++;
         this.field28603[var6] = var1.method34399();
         this.field28604[var6] = var1.method34397(4);
         if (!this.field28603[var6]) {
            this.field28605[var6] = 2;
         } else {
            this.field28605[var6] = var1.method34397(2);
            if (this.field28605[var6] == 3) {
               var5++;
            }
         }
      }

      this.field28601 = this.field28601 + var1.method34398();
      this.field28601 = this.field28601 | this.field28601 >> 1;
      boolean var7 = var1.method34399();
      double var8 = (double)field28598[var1.method34397(2)];
      this.field28599.method19714(var1, false, var2);
      Class6538 var10 = this.field28599.method19720();
      int var11 = var10.method19871();
      int var12 = var10.method19866();
      int[][] var13 = (int[][])null;

      for (int var22 = 0; var22 < var5; var22++) {
         int var14 = 0;
         int var15 = 1;
         int var16 = 0;
         float var17 = 1.0F;
         if (var22 > 0) {
            var15 = this.field28601 != 2 ? var1.method34398() : 1;
            var16 = var15 != 0 ? Class8253.method28777(var1) - 60 : 0;
            var17 = (float)Math.pow(var8, (double)(-var16));
         }

         if (this.field28601 == 2) {
            this.field28606[var22][0] = var17;
         } else {
            for (int var18 = 0; var18 < var11; var18++) {
               for (int var19 = 0; var19 < var12; var14++) {
                  if (var13[var18][var19] != 0) {
                     if (var15 == 0) {
                        int var20 = Class8253.method28777(var1) - 60;
                        if (var20 != 0) {
                           int var21 = 1;
                           var20 = var16 += var20;
                           if (!var7) {
                              var21 -= 2 * (var20 & 1);
                              var20 >>= 1;
                           }

                           var17 = (float)(Math.pow(var8, (double)(-var20)) * (double)var21);
                        }
                     }

                     this.field28606[var22][var14] = var17;
                  }

                  var19++;
               }
            }
         }
      }
   }

   public void method19771() throws AACException {
      this.field28600 = this.field28599.method19719();
   }

   public void method19772(int var1, float[] var2) {
      double var5 = (double)this.field28606[var1][0];

      for (int var7 = 0; var7 < var2.length; var7++) {
         var2[var7] = (float)((double)var2[var7] + var5 * (double)this.field28600[var7]);
      }
   }

   public void method19773(int var1, float[] var2) {
      Class6538 var5 = this.field28599.method19720();
      int[] var6 = var5.method19868();
      int var7 = var5.method19871();
      int var8 = var5.method19866();
      int[][] var9 = (int[][])null;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;

      for (int var13 = 0; var13 < var7; var13++) {
         int var14 = var5.method19872(var13);

         for (int var15 = 0; var15 < var8; var12++) {
            if (var9[var13][var15] != 0) {
               float var16 = this.field28606[var1][var12];

               for (int var17 = 0; var17 < var14; var17++) {
                  for (int var18 = var6[var15]; var18 < var6[var15 + 1]; var18++) {
                     var2[var11 + var17 * 128 + var18] = var2[var11 + var17 * 128 + var18] + var16 * this.field28600[var10 + var17 * 128 + var18];
                  }
               }
            }

            var15++;
         }

         var11 += var14 * 128;
         var10 += var14 * 128;
      }
   }
}

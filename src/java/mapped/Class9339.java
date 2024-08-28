package mapped;



public class Class9339 implements Class9338 {
   private final int field43354;
   private final float[][] field43355;
   private final float[][] field43356;
   private float[] field43357;
   private float[] field43358;
   private float[] field43359;
   private float[] field43360;
   private float[] field43361;
   private float[] field43362;

   public Class9339(int var1) throws Class2460 {
      this.field43354 = var1;
      switch (var1) {
         case 60:
            this.field43355 = field43353;
            break;
         case 64:
            this.field43355 = field43351;
            break;
         case 480:
            this.field43355 = field43352;
            break;
         case 512:
            this.field43355 = field43350;
            break;
         default:
            throw new Class2460("unexpected FFT length: " + var1);
      }

      this.field43356 = new float[var1][2];
      this.field43357 = new float[2];
      this.field43358 = new float[2];
      this.field43359 = new float[2];
      this.field43360 = new float[2];
      this.field43361 = new float[2];
      this.field43362 = new float[2];
   }

   public void method35344(float[][] var1, boolean var2) {
      int var5 = !var2 ? 1 : 2;
      int var6 = !var2 ? 1 : this.field43354;
      int var7 = 0;

      for (int var8 = 0; var8 < this.field43354; var8++) {
         this.field43356[var8][0] = var1[var7][0];
         this.field43356[var8][1] = var1[var7][1];

         int var9;
         for (var9 = this.field43354 >> 1; var7 >= var9 && var9 > 0; var9 >>= 1) {
            var7 -= var9;
         }

         var7 += var9;
      }

      for (int var18 = 0; var18 < this.field43354; var18++) {
         var1[var18][0] = this.field43356[var18][0];
         var1[var18][1] = this.field43356[var18][1];
      }

      for (int var19 = 0; var19 < this.field43354; var19 += 4) {
         this.field43357[0] = var1[var19][0] + var1[var19 + 1][0];
         this.field43357[1] = var1[var19][1] + var1[var19 + 1][1];
         this.field43358[0] = var1[var19 + 2][0] + var1[var19 + 3][0];
         this.field43358[1] = var1[var19 + 2][1] + var1[var19 + 3][1];
         this.field43359[0] = var1[var19][0] - var1[var19 + 1][0];
         this.field43359[1] = var1[var19][1] - var1[var19 + 1][1];
         this.field43360[0] = var1[var19 + 2][0] - var1[var19 + 3][0];
         this.field43360[1] = var1[var19 + 2][1] - var1[var19 + 3][1];
         var1[var19][0] = this.field43357[0] + this.field43358[0];
         var1[var19][1] = this.field43357[1] + this.field43358[1];
         var1[var19 + 2][0] = this.field43357[0] - this.field43358[0];
         var1[var19 + 2][1] = this.field43357[1] - this.field43358[1];
         this.field43361[0] = this.field43359[0] - this.field43360[1];
         this.field43361[1] = this.field43359[1] + this.field43360[0];
         this.field43362[0] = this.field43359[0] + this.field43360[1];
         this.field43362[1] = this.field43359[1] - this.field43360[0];
         if (!var2) {
            var1[var19 + 1][0] = this.field43361[0];
            var1[var19 + 1][1] = this.field43361[1];
            var1[var19 + 3][0] = this.field43362[0];
            var1[var19 + 3][1] = this.field43362[1];
         } else {
            var1[var19 + 1][0] = this.field43362[0];
            var1[var19 + 1][1] = this.field43362[1];
            var1[var19 + 3][0] = this.field43361[0];
            var1[var19 + 3][1] = this.field43361[1];
         }
      }

      for (int var10 = 4; var10 < this.field43354; var10 <<= 1) {
         int var20 = var10 << 1;
         int var21 = this.field43354 / var20;

         for (int var11 = 0; var11 < this.field43354; var11 += var20) {
            for (int var12 = 0; var12 < var10; var12++) {
               int var13 = var12 * var21;
               float var14 = this.field43355[var13][0];
               float var15 = this.field43355[var13][var5];
               float var16 = var1[var10 + var11 + var12][0] * var14 - var1[var10 + var11 + var12][1] * var15;
               float var17 = var1[var10 + var11 + var12][0] * var15 + var1[var10 + var11 + var12][1] * var14;
               var1[var10 + var11 + var12][0] = (var1[var11 + var12][0] - var16) * (float)var6;
               var1[var10 + var11 + var12][1] = (var1[var11 + var12][1] - var17) * (float)var6;
               var1[var11 + var12][0] = (var1[var11 + var12][0] + var16) * (float)var6;
               var1[var11 + var12][1] = (var1[var11 + var12][1] + var17) * (float)var6;
            }
         }
      }
   }
}

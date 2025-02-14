package mapped;

public class Class661 implements Runnable {
   private static String[] field3323;
   public final int field3324;
   public final int field3325;
   public final float[][] field3326;
   public final int field3327;
   public final int field3328;
   public final int field3329;
   public final Class8543 field3330;

   public Class661(Class8543 var1, int var2, int var3, float[][] var4, int var5, int var6, int var7) {
      this.field3330 = var1;
      this.field3324 = var2;
      this.field3325 = var3;
      this.field3326 = var4;
      this.field3327 = var5;
      this.field3328 = var6;
      this.field3329 = var7;
   }

   @Override
   public void run() {
      for (int var3 = this.field3324; var3 < this.field3325; var3++) {
         int var4 = Class8543.method30435(this.field3330) - var3;
         this.field3326[var3][Class8543.method30438(this.field3330)] = this.field3326[var4][1];
         this.field3326[var3][Class8543.method30438(this.field3330) + 1] = -this.field3326[var4][0];
      }

      for (int var7 = this.field3324; var7 < this.field3325; var7++) {
         int var9 = Class8543.method30435(this.field3330) - var7;

         for (int var5 = Class8543.method30438(this.field3330) + 2; var5 < this.field3327; var5 += 2) {
            int var6 = this.field3327 - var5;
            this.field3326[var7][var5] = this.field3326[var9][var6];
            this.field3326[var7][var5 + 1] = -this.field3326[var9][var6 + 1];
         }
      }

      for (int var8 = this.field3328; var8 < this.field3329; var8++) {
         int var10 = (Class8543.method30435(this.field3330) - var8) % Class8543.method30435(this.field3330);

         for (int var11 = 0; var11 < this.field3327; var11 += 2) {
            int var12 = (this.field3327 - var11) % this.field3327;
            this.field3326[var10][var12] = this.field3326[var8][var11];
            this.field3326[var10][var12 + 1] = -this.field3326[var8][var11 + 1];
         }
      }
   }
}

package mapped;

public class Class684 implements Runnable {
   private static String[] field3485;
   public final int field3486;
   public final int field3487;
   public final int field3488;
   public final int field3489;
   public final int field3490;
   public final int field3491;
   public final double[] field3492;
   public final Class7274 field3493;

   public Class684(Class7274 var1, int var2, int var3, int var4, int var5, int var6, int var7, double[] var8) {
      this.field3493 = var1;
      this.field3486 = var2;
      this.field3487 = var3;
      this.field3488 = var4;
      this.field3489 = var5;
      this.field3490 = var6;
      this.field3491 = var7;
      this.field3492 = var8;
   }

   @Override
   public void run() {
      for (int var3 = this.field3486; var3 < this.field3487; var3++) {
         int var4 = (Class7274.method22900(this.field3493) - var3) % Class7274.method22900(this.field3493);
         int var5 = var4 * this.field3488;
         int var6 = var3 * this.field3488;

         for (int var7 = 1; var7 < this.field3489; var7++) {
            int var8 = Class7274.method22895(this.field3493) - var7;
            int var9 = var8 * this.field3490;
            int var10 = var7 * this.field3490;
            int var11 = var5 + var9;

            for (int var12 = 0; var12 < Class7274.method22898(this.field3493); var12++) {
               int var13 = 2 * var12;
               int var14 = this.field3491 - var13;
               int var15 = var6 + var10 + var13;
               this.field3492[var11 + var14 % this.field3491] = this.field3492[var15];
               this.field3492[var11 + (var14 + 1) % this.field3491] = -this.field3492[var15 + 1];
            }
         }
      }
   }
}

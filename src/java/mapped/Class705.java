package mapped;

public class Class705 implements Runnable {
   private static String[] field3608;
   public final int field3609;
   public final int field3610;
   public final int field3611;
   public final int field3612;
   public final float[] field3613;
   public final Class8543 field3614;

   public Class705(Class8543 var1, int var2, int var3, int var4, int var5, float[] var6) {
      this.field3614 = var1;
      this.field3609 = var2;
      this.field3610 = var3;
      this.field3611 = var4;
      this.field3612 = var5;
      this.field3613 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field3609; var3 < this.field3610; var3++) {
         int var4 = var3 * this.field3611;
         int var5 = (Class8543.method30435(this.field3614) - var3 + 1) * this.field3611;

         for (int var6 = this.field3612; var6 < Class8543.method30438(this.field3614); var6++) {
            int var7 = 2 * var6;
            int var8 = 2 * (Class8543.method30438(this.field3614) - var6);
            this.field3613[var7] = this.field3613[var8];
            this.field3613[var7 + 1] = -this.field3613[var8 + 1];
            int var9 = var4 + var7;
            int var10 = var5 - var7;
            this.field3613[var9] = this.field3613[var10];
            this.field3613[var9 + 1] = -this.field3613[var10 + 1];
         }
      }
   }
}

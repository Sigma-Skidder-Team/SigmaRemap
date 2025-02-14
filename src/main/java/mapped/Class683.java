package mapped;

public class Class683 implements Runnable {
   private static String[] field3476;
   public final int field3477;
   public final int field3478;
   public final int field3479;
   public final float[][][] field3480;
   public final float[] field3481;
   public final int field3482;
   public final int field3483;
   public final Class8026 field3484;

   public Class683(Class8026 var1, int var2, int var3, int var4, float[][][] var5, float[] var6, int var7, int var8) {
      this.field3484 = var1;
      this.field3477 = var2;
      this.field3478 = var3;
      this.field3479 = var4;
      this.field3480 = var5;
      this.field3481 = var6;
      this.field3482 = var7;
      this.field3483 = var8;
   }

   @Override
   public void run() {
      for (int var3 = this.field3477; var3 < this.field3478; var3++) {
         int var4 = var3 * this.field3479;

         for (int var5 = 0; var5 < Class8026.method27513(this.field3484); var5++) {
            System.arraycopy(this.field3480[var3][var5], 0, this.field3481, var4 + var5 * this.field3482, this.field3483);
         }
      }
   }
}

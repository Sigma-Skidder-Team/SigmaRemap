package mapped;

public class Class527 implements Runnable {
   private static String[] field2509;
   public final int field2510;
   public final int field2511;
   public final float[][] field2512;
   public final float[] field2513;
   public final boolean field2514;
   public final Class8543 field2515;

   public Class527(Class8543 var1, int var2, int var3, float[][] var4, float[] var5, boolean var6) {
      this.field2515 = var1;
      this.field2510 = var2;
      this.field2511 = var3;
      this.field2512 = var4;
      this.field2513 = var5;
      this.field2514 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field2510; var3 < this.field2511; var3++) {
         int var4 = 2 * var3;

         for (int var5 = 0; var5 < Class8543.method30435(this.field2515); var5++) {
            int var6 = 2 * var5;
            int var7 = var5 * Class8543.method30438(this.field2515) + var4;
            this.field2512[var3][var6] = this.field2513[var7];
            this.field2512[var3][var6 + 1] = this.field2513[var7 + 1];
         }

         Class8543.method30436(this.field2515).method30933(this.field2512[var3], this.field2514);
      }
   }
}

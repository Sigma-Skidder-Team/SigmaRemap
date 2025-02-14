package mapped;

public class Class634 implements Runnable {
   private static String[] field3163;
   public final int field3164;
   public final int field3165;
   public final int field3166;
   public final int field3167;
   public final float[] field3168;
   public final boolean field3169;
   public final Class8026 field3170;

   public Class634(Class8026 var1, int var2, int var3, int var4, int var5, float[] var6, boolean var7) {
      this.field3170 = var1;
      this.field3164 = var2;
      this.field3165 = var3;
      this.field3166 = var4;
      this.field3167 = var5;
      this.field3168 = var6;
      this.field3169 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[2 * Class8026.method27518(this.field3170)];

      for (int var4 = this.field3164; var4 < this.field3165; var4++) {
         int var5 = var4 * this.field3166;

         for (int var6 = 0; var6 < Class8026.method27516(this.field3170); var6++) {
            int var7 = 2 * var6;

            for (int var8 = 0; var8 < Class8026.method27518(this.field3170); var8++) {
               int var9 = 2 * var8;
               int var10 = var8 * this.field3167 + var5 + var7;
               var3[var9] = this.field3168[var10];
               var3[var9 + 1] = this.field3168[var10 + 1];
            }

            Class8026.method27519(this.field3170).method30933(var3, this.field3169);

            for (int var11 = 0; var11 < Class8026.method27518(this.field3170); var11++) {
               int var12 = 2 * var11;
               int var13 = var11 * this.field3167 + var5 + var7;
               this.field3168[var13] = var3[var12];
               this.field3168[var13 + 1] = var3[var12 + 1];
            }
         }
      }
   }
}

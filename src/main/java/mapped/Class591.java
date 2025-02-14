package mapped;

public class Class591 implements Runnable {
   private static String[] field2902;
   public final int field2903;
   public final int field2904;
   public final int field2905;
   public final int field2906;
   public final float[] field2907;
   public final Class8026 field2908;

   public Class591(Class8026 var1, int var2, int var3, int var4, int var5, float[] var6) {
      this.field2908 = var1;
      this.field2903 = var2;
      this.field2904 = var3;
      this.field2905 = var4;
      this.field2906 = var5;
      this.field2907 = var6;
   }

   @Override
   public void run() {
      float[] var3 = new float[2 * Class8026.method27518(this.field2908)];

      for (int var4 = this.field2903; var4 < this.field2904; var4++) {
         int var5 = var4 * this.field2905;

         for (int var6 = 0; var6 < Class8026.method27516(this.field2908); var6++) {
            int var7 = 2 * var6;

            for (int var8 = 0; var8 < Class8026.method27518(this.field2908); var8++) {
               int var9 = 2 * var8;
               int var10 = var8 * this.field2906 + var5 + var7;
               var3[var9] = this.field2907[var10];
               var3[var9 + 1] = this.field2907[var10 + 1];
            }

            Class8026.method27519(this.field2908).method30929(var3);

            for (int var11 = 0; var11 < Class8026.method27518(this.field2908); var11++) {
               int var12 = 2 * var11;
               int var13 = var11 * this.field2906 + var5 + var7;
               this.field2907[var13] = var3[var12];
               this.field2907[var13 + 1] = var3[var12 + 1];
            }
         }
      }
   }
}

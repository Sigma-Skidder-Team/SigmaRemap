package mapped;

public class Class628 implements Runnable {
   private static String[] field3128;
   public final int field3129;
   public final int field3130;
   public final int field3131;
   public final int field3132;
   public final double[] field3133;
   public final boolean field3134;
   public final Class7274 field3135;

   public Class628(Class7274 var1, int var2, int var3, int var4, int var5, double[] var6, boolean var7) {
      this.field3135 = var1;
      this.field3129 = var2;
      this.field3130 = var3;
      this.field3131 = var4;
      this.field3132 = var5;
      this.field3133 = var6;
      this.field3134 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[2 * Class7274.method22900(this.field3135)];

      for (int var4 = this.field3129; var4 < this.field3130; var4++) {
         int var5 = var4 * this.field3131;

         for (int var6 = 0; var6 < Class7274.method22898(this.field3135); var6++) {
            int var7 = 2 * var6;

            for (int var8 = 0; var8 < Class7274.method22900(this.field3135); var8++) {
               int var9 = 2 * var8;
               int var10 = var8 * this.field3132 + var5 + var7;
               var3[var9] = this.field3133[var10];
               var3[var9 + 1] = this.field3133[var10 + 1];
            }

            Class7274.method22901(this.field3135).method27166(var3, this.field3134);

            for (int var11 = 0; var11 < Class7274.method22900(this.field3135); var11++) {
               int var12 = 2 * var11;
               int var13 = var11 * this.field3132 + var5 + var7;
               this.field3133[var13] = var3[var12];
               this.field3133[var13 + 1] = var3[var12 + 1];
            }
         }
      }
   }
}

package mapped;

public class Class770 implements Runnable {
   private static String[] field4010;
   public final int field4011;
   public final int field4012;
   public final int field4013;
   public final int field4014;
   public final double[] field4015;
   public final boolean field4016;
   public final Class7274 field4017;

   public Class770(Class7274 var1, int var2, int var3, int var4, int var5, double[] var6, boolean var7) {
      this.field4017 = var1;
      this.field4011 = var2;
      this.field4012 = var3;
      this.field4013 = var4;
      this.field4014 = var5;
      this.field4015 = var6;
      this.field4016 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[2 * Class7274.method22895(this.field4017)];

      for (int var4 = this.field4011; var4 < this.field4012; var4++) {
         int var5 = var4 * this.field4013;

         for (int var6 = 0; var6 < Class7274.method22898(this.field4017); var6++) {
            int var7 = 2 * var6;

            for (int var8 = 0; var8 < Class7274.method22895(this.field4017); var8++) {
               int var9 = var5 + var8 * this.field4014 + var7;
               int var10 = 2 * var8;
               var3[var10] = this.field4015[var9];
               var3[var10 + 1] = this.field4015[var9 + 1];
            }

            Class7274.method22899(this.field4017).method27166(var3, this.field4016);

            for (int var11 = 0; var11 < Class7274.method22895(this.field4017); var11++) {
               int var12 = var5 + var11 * this.field4014 + var7;
               int var13 = 2 * var11;
               this.field4015[var12] = var3[var13];
               this.field4015[var12 + 1] = var3[var13 + 1];
            }
         }
      }
   }
}

package mapped;

public class Class569 implements Runnable {
   private static String[] field2764;
   public final int field2765;
   public final int field2766;
   public final double[] field2767;
   public final boolean field2768;
   public final Class6352 field2769;

   public Class569(Class6352 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field2769 = var1;
      this.field2765 = var2;
      this.field2766 = var3;
      this.field2767 = var4;
      this.field2768 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[Class6352.method19333(this.field2769)];

      for (int var4 = this.field2765; var4 < this.field2766; var4++) {
         int var5 = var4 * Class6352.method19329(this.field2769);

         for (int var6 = 0; var6 < Class6352.method19331(this.field2769); var6++) {
            for (int var7 = 0; var7 < Class6352.method19333(this.field2769); var7++) {
               int var8 = var7 * Class6352.method19327(this.field2769) + var5 + var6;
               var3[var7] = this.field2767[var8];
            }

            Class6352.method19334(this.field2769).method38576(var3, this.field2768);

            for (int var9 = 0; var9 < Class6352.method19333(this.field2769); var9++) {
               int var10 = var9 * Class6352.method19327(this.field2769) + var5 + var6;
               this.field2767[var10] = var3[var9];
            }
         }
      }
   }
}

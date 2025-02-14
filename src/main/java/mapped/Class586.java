package mapped;

public class Class586 implements Runnable {
   private static String[] field2874;
   public final int field2875;
   public final int field2876;
   public final double[] field2877;
   public final boolean field2878;
   public final Class6352 field2879;

   public Class586(Class6352 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field2879 = var1;
      this.field2875 = var2;
      this.field2876 = var3;
      this.field2877 = var4;
      this.field2878 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[Class6352.method19328(this.field2879)];

      for (int var4 = this.field2875; var4 < this.field2876; var4++) {
         int var5 = var4 * Class6352.method19327(this.field2879);

         for (int var6 = 0; var6 < Class6352.method19331(this.field2879); var6++) {
            for (int var7 = 0; var7 < Class6352.method19328(this.field2879); var7++) {
               int var8 = var5 + var7 * Class6352.method19329(this.field2879) + var6;
               var3[var7] = this.field2877[var8];
            }

            Class6352.method19332(this.field2879).method38580(var3, this.field2878);

            for (int var9 = 0; var9 < Class6352.method19328(this.field2879); var9++) {
               int var10 = var5 + var9 * Class6352.method19329(this.field2879) + var6;
               this.field2877[var10] = var3[var9];
            }
         }
      }
   }
}

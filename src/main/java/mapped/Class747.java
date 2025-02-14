package mapped;

public class Class747 implements Runnable {
   private static String[] field3875;
   public final int field3876;
   public final int field3877;
   public final double[][][] field3878;
   public final boolean field3879;
   public final Class8832 field3880;

   public Class747(Class8832 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field3880 = var1;
      this.field3876 = var2;
      this.field3877 = var3;
      this.field3878 = var4;
      this.field3879 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field3876; var3 < this.field3877; var3++) {
         for (int var4 = 0; var4 < Class8832.method31956(this.field3880); var4++) {
            Class8832.method31958(this.field3880).method33650(this.field3878[var3][var4], this.field3879);
         }
      }
   }
}

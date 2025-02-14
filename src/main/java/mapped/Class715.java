package mapped;

public class Class715 implements Runnable {
   private static String[] field3671;
   public final int field3672;
   public final int field3673;
   public final double[][][] field3674;
   public final boolean field3675;
   public final Class7274 field3676;

   public Class715(Class7274 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field3676 = var1;
      this.field3672 = var2;
      this.field3673 = var3;
      this.field3674 = var4;
      this.field3675 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field3672; var3 < this.field3673; var3++) {
         for (int var4 = 0; var4 < Class7274.method22895(this.field3676); var4++) {
            Class7274.method22897(this.field3676).method27166(this.field3674[var3][var4], this.field3675);
         }
      }
   }
}

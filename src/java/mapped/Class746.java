package mapped;

public class Class746 implements Runnable {
   private static String[] field3869;
   public final int field3870;
   public final int field3871;
   public final float[][][] field3872;
   public final boolean field3873;
   public final Class7824 field3874;

   public Class746(Class7824 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field3874 = var1;
      this.field3870 = var2;
      this.field3871 = var3;
      this.field3872 = var4;
      this.field3873 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field3870; var3 < this.field3871; var3++) {
         for (int var4 = 0; var4 < Class7824.method26180(this.field3874); var4++) {
            Class7824.method26182(this.field3874).method29627(this.field3872[var3][var4], this.field3873);
         }
      }
   }
}

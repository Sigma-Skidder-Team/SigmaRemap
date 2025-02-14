package mapped;

public class Class710 implements Runnable {
   private static String[] field3643;
   public final int field3644;
   public final int field3645;
   public final float[][][] field3646;
   public final boolean field3647;
   public final Class7824 field3648;

   public Class710(Class7824 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field3648 = var1;
      this.field3644 = var2;
      this.field3645 = var3;
      this.field3646 = var4;
      this.field3647 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field3644; var3 < this.field3645; var3++) {
         for (int var4 = 0; var4 < Class7824.method26180(this.field3648); var4++) {
            Class7824.method26182(this.field3648).method29631(this.field3646[var3][var4], this.field3647);
         }
      }
   }
}

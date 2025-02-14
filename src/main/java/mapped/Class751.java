package mapped;

public class Class751 implements Runnable {
   private static String[] field3895;
   public final int field3896;
   public final int field3897;
   public final float[][] field3898;
   public final float[] field3899;
   public final Class8543 field3900;

   public Class751(Class8543 var1, int var2, int var3, float[][] var4, float[] var5) {
      this.field3900 = var1;
      this.field3896 = var2;
      this.field3897 = var3;
      this.field3898 = var4;
      this.field3899 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field3896; var3 < this.field3897; var3++) {
         int var4 = 2 * var3;

         for (int var5 = 0; var5 < Class8543.method30435(this.field3900); var5++) {
            int var6 = 2 * var5;
            int var7 = var5 * Class8543.method30438(this.field3900) + var4;
            this.field3898[var3][var6] = this.field3899[var7];
            this.field3898[var3][var6 + 1] = this.field3899[var7 + 1];
         }

         Class8543.method30436(this.field3900).method30929(this.field3898[var3]);
      }
   }
}

package mapped;

public class Class1354 implements Runnable {
   private static String[] field7218;
   public final int field7219;
   public final int field7220;
   public final float[][][] field7221;
   public final boolean field7222;
   public final Class7941 field7223;

   public Class1354(Class7941 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field7223 = var1;
      this.field7219 = var2;
      this.field7220 = var3;
      this.field7221 = var4;
      this.field7222 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[Class7941.method26764(this.field7223)];

      for (int var4 = this.field7219; var4 < this.field7220; var4++) {
         for (int var5 = 0; var5 < Class7941.method26767(this.field7223); var5++) {
            for (int var6 = 0; var6 < Class7941.method26764(this.field7223); var6++) {
               var3[var6] = this.field7221[var4][var6][var5];
            }

            Class7941.method26768(this.field7223).method28928(var3, this.field7222);

            for (int var7 = 0; var7 < Class7941.method26764(this.field7223); var7++) {
               this.field7221[var4][var7][var5] = var3[var7];
            }
         }
      }
   }
}

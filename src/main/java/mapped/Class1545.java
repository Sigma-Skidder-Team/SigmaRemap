package mapped;

public class Class1545 implements Runnable {
   private static String[] field8378;
   public final int field8379;
   public final int field8380;
   public final float[][] field8381;
   public final boolean field8382;
   public final Class7821 field8383;

   public Class1545(Class7821 var1, int var2, int var3, float[][] var4, boolean var5) {
      this.field8383 = var1;
      this.field8379 = var2;
      this.field8380 = var3;
      this.field8381 = var4;
      this.field8382 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[Class7821.method26151(this.field8383)];

      for (int var4 = this.field8379; var4 < this.field8380; var4++) {
         for (int var5 = 0; var5 < Class7821.method26151(this.field8383); var5++) {
            var3[var5] = this.field8381[var5][var4];
         }

         Class7821.method26152(this.field8383).method28459(var3, this.field8382);

         for (int var6 = 0; var6 < Class7821.method26151(this.field8383); var6++) {
            this.field8381[var6][var4] = var3[var6];
         }
      }
   }
}

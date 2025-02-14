package mapped;

public class Class1619 implements Runnable {
   private static String[] field8767;
   public final int field8768;
   public final int field8769;
   public final float[][][] field8770;
   public final boolean field8771;
   public final Class7941 field8772;

   public Class1619(Class7941 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field8772 = var1;
      this.field8768 = var2;
      this.field8769 = var3;
      this.field8770 = var4;
      this.field8771 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[Class7941.method26764(this.field8772)];

      for (int var4 = this.field8768; var4 < this.field8769; var4++) {
         for (int var5 = 0; var5 < Class7941.method26767(this.field8772); var5++) {
            for (int var6 = 0; var6 < Class7941.method26764(this.field8772); var6++) {
               var3[var6] = this.field8770[var4][var6][var5];
            }

            Class7941.method26768(this.field8772).method28924(var3, this.field8771);

            for (int var7 = 0; var7 < Class7941.method26764(this.field8772); var7++) {
               this.field8770[var4][var7][var5] = var3[var7];
            }
         }
      }
   }
}

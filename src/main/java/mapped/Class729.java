package mapped;

public class Class729 implements Runnable {
   private static String[] field3766;
   public final int field3767;
   public final int field3768;
   public final int field3769;
   public final float[][][] field3770;
   public final Class8026 field3771;

   public Class729(Class8026 var1, int var2, int var3, int var4, float[][][] var5) {
      this.field3771 = var1;
      this.field3767 = var2;
      this.field3768 = var3;
      this.field3769 = var4;
      this.field3770 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field3767; var3 < this.field3768; var3++) {
         int var4 = (Class8026.method27518(this.field3771) - var3) % Class8026.method27518(this.field3771);

         for (int var5 = 1; var5 < this.field3769; var5++) {
            int var6 = Class8026.method27513(this.field3771) - var5;
            this.field3770[var4][var6][0] = this.field3770[var3][var5][0];
            this.field3770[var4][var6][1] = -this.field3770[var3][var5][1];
         }
      }
   }
}

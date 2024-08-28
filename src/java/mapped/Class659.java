package mapped;

public class Class659 implements Runnable {
   private static String[] field3311;
   public final int field3312;
   public final int field3313;
   public final float[][][] field3314;
   public final boolean field3315;
   public final Class7941 field3316;

   public Class659(Class7941 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field3316 = var1;
      this.field3312 = var2;
      this.field3313 = var3;
      this.field3314 = var4;
      this.field3315 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field3312; var3 < this.field3313; var3++) {
         for (int var4 = 0; var4 < Class7941.method26764(this.field3316); var4++) {
            Class7941.method26766(this.field3316).method28924(this.field3314[var3][var4], this.field3315);
         }
      }
   }
}

package mapped;

public class Class688 implements Runnable {
   private static String[] field3508;
   public final int field3509;
   public final int field3510;
   public final float[][] field3511;
   public final boolean field3512;
   public final Class9533 field3513;

   public Class688(Class9533 var1, int var2, int var3, float[][] var4, boolean var5) {
      this.field3513 = var1;
      this.field3509 = var2;
      this.field3510 = var3;
      this.field3511 = var4;
      this.field3512 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field3509; var3 < this.field3510; var3++) {
         Class9533.method36857(this.field3513).method29631(this.field3511[var3], this.field3512);
      }
   }
}

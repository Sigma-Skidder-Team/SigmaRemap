package mapped;

public class Class574 implements Runnable {
   private static String[] field2800;
   public final int field2801;
   public final int field2802;
   public final float[][][] field2803;
   public final boolean field2804;
   public final Class7941 field2805;

   public Class574(Class7941 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field2805 = var1;
      this.field2801 = var2;
      this.field2802 = var3;
      this.field2803 = var4;
      this.field2804 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field2801; var3 < this.field2802; var3++) {
         for (int var4 = 0; var4 < Class7941.method26764(this.field2805); var4++) {
            Class7941.method26766(this.field2805).method28928(this.field2803[var3][var4], this.field2804);
         }
      }
   }
}

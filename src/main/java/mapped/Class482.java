package mapped;

public class Class482 implements Runnable {
   private static String[] field2257;
   public final int field2258;
   public final int field2259;
   public final float[][] field2260;
   public final boolean field2261;
   public final Class8682 field2262;

   public Class482(Class8682 var1, int var2, int var3, float[][] var4, boolean var5) {
      this.field2262 = var1;
      this.field2258 = var2;
      this.field2259 = var3;
      this.field2260 = var4;
      this.field2261 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field2258; var3 < this.field2259; var3++) {
         Class8682.method31246(this.field2262).method28928(this.field2260[var3], this.field2261);
      }
   }
}

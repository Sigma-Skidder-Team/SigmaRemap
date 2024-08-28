package mapped;

public class Class620 implements Runnable {
   private static String[] field3082;
   public final int field3083;
   public final int field3084;
   public final float[][] field3085;
   public final Class8543 field3086;

   public Class620(Class8543 var1, int var2, int var3, float[][] var4) {
      this.field3086 = var1;
      this.field3083 = var2;
      this.field3084 = var3;
      this.field3085 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field3083; var3 < this.field3084; var3++) {
         Class8543.method30434(this.field3086).method30929(this.field3085[var3]);
      }
   }
}

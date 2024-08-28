package mapped;

public class Class522 implements Runnable {
   private static String[] field2479;
   public final int field2480;
   public final int field2481;
   public final double[][] field2482;
   public final boolean field2483;
   public final Class9330 field2484;

   public Class522(Class9330 var1, int var2, int var3, double[][] var4, boolean var5) {
      this.field2484 = var1;
      this.field2480 = var2;
      this.field2481 = var3;
      this.field2482 = var4;
      this.field2483 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field2480; var3 < this.field2481; var3++) {
         Class9330.method35278(this.field2484).method38576(this.field2482[var3], this.field2483);
      }
   }
}

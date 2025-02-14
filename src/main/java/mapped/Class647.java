package mapped;

public class Class647 implements Runnable {
   private static String[] field3238;
   public final int field3239;
   public final int field3240;
   public final double[][] field3241;
   public final boolean field3242;
   public final Class9330 field3243;

   public Class647(Class9330 var1, int var2, int var3, double[][] var4, boolean var5) {
      this.field3243 = var1;
      this.field3239 = var2;
      this.field3240 = var3;
      this.field3241 = var4;
      this.field3242 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field3239; var3 < this.field3240; var3++) {
         Class9330.method35278(this.field3243).method38580(this.field3241[var3], this.field3242);
      }
   }
}

package mapped;

public class Class719 implements Runnable {
   private static String[] field3699;
   public final int field3700;
   public final int field3701;
   public final double[][] field3702;
   public final boolean field3703;
   public final Class9055 field3704;

   public Class719(Class9055 var1, int var2, int var3, double[][] var4, boolean var5) {
      this.field3704 = var1;
      this.field3700 = var2;
      this.field3701 = var3;
      this.field3702 = var4;
      this.field3703 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field3700; var3 < this.field3701; var3++) {
         Class9055.method33698(this.field3704).method33656(this.field3702[var3], this.field3703);
      }
   }
}

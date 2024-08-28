package mapped;

public class Class739 implements Runnable {
   private static String[] field3833;
   public final int field3834;
   public final int field3835;
   public final float[][] field3836;
   public final Class7821 field3837;

   public Class739(Class7821 var1, int var2, int var3, float[][] var4) {
      this.field3837 = var1;
      this.field3834 = var2;
      this.field3835 = var3;
      this.field3836 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field3834; var3 < this.field3835; var3++) {
         Class7821.method26150(this.field3837).method28455(this.field3836[var3]);
      }
   }
}

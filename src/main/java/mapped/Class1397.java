package mapped;

public class Class1397 implements Runnable {
   private static String[] field7470;
   public final int field7471;
   public final int field7472;
   public final double[] field7473;
   public final boolean field7474;
   public final Class9055 field7475;

   public Class1397(Class9055 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field7475 = var1;
      this.field7471 = var2;
      this.field7472 = var3;
      this.field7473 = var4;
      this.field7474 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field7471; var3 < this.field7472; var3++) {
         Class9055.method33698(this.field7475).method33662(this.field7473, var3 * Class9055.method33697(this.field7475), this.field7474);
      }
   }
}

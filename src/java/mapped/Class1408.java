package mapped;

public class Class1408 implements Runnable {
   private static String[] field7540;
   public final int field7541;
   public final int field7542;
   public final int field7543;
   public final float[] field7544;
   public final boolean field7545;
   public final Class9533 field7546;

   public Class1408(Class9533 var1, int var2, int var3, int var4, float[] var5, boolean var6) {
      this.field7546 = var1;
      this.field7541 = var2;
      this.field7542 = var3;
      this.field7543 = var4;
      this.field7544 = var5;
      this.field7545 = var6;
   }

   @Override
   public void run() {
      if (this.field7541 != -1) {
         for (int var3 = this.field7542; var3 < Class9533.method36858(this.field7546); var3 += this.field7543) {
            Class9533.method36857(this.field7546).method29633(this.field7544, var3 * Class9533.method36856(this.field7546), this.field7545);
         }
      } else {
         for (int var4 = this.field7542; var4 < Class9533.method36858(this.field7546); var4 += this.field7543) {
            Class9533.method36857(this.field7546).method29629(this.field7544, var4 * Class9533.method36856(this.field7546), this.field7545);
         }
      }
   }
}

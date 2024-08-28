package mapped;

public class Class1430 implements Runnable {
   private static String[] field7671;
   public final int field7672;
   public final int field7673;
   public final int field7674;
   public final double[] field7675;
   public final Class9050 field7676;

   public Class1430(Class9050 var1, int var2, int var3, int var4, double[] var5) {
      this.field7676 = var1;
      this.field7672 = var2;
      this.field7673 = var3;
      this.field7674 = var4;
      this.field7675 = var5;
   }

   @Override
   public void run() {
      int var3 = this.field7672 + Class9050.method33664(this.field7676) - 1;

      for (int var4 = this.field7673; var4 < this.field7674; var4++) {
         int var5 = this.field7672 + var4;
         double var6 = this.field7675[var5];
         int var8 = var3 - var4;
         this.field7675[var5] = this.field7675[var8];
         this.field7675[var8] = var6;
      }
   }
}

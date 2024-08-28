package mapped;

public class Class707 implements Runnable {
   private static String[] field3621;
   public final int field3622;
   public final int field3623;
   public final int field3624;
   public final double[][] field3625;
   public final double[][] field3626;
   public final Class9615 field3627;

   public Class707(Class9615 var1, int var2, int var3, int var4, double[][] var5, double[][] var6) {
      this.field3627 = var1;
      this.field3622 = var2;
      this.field3623 = var3;
      this.field3624 = var4;
      this.field3625 = var5;
      this.field3626 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field3622; var3 < this.field3623; var3++) {
         int var4 = 2 * var3;

         for (int var5 = 0; var5 < this.field3624; var5++) {
            int var6 = 2 * var5;
            this.field3625[var3][var6] = this.field3626[var5][var4];
            this.field3625[var3][var6 + 1] = this.field3626[var5][var4 + 1];
         }
      }
   }
}

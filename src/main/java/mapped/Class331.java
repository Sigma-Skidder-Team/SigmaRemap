package mapped;

public class Class331 implements Runnable {
   private static String[] field1433;
   public final int field1434;
   public final int field1435;
   public final double[] field1436;
   public final boolean field1437;
   public final Class3612 field1438;

   public Class331(Class3612 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field1438 = var1;
      this.field1434 = var2;
      this.field1435 = var3;
      this.field1436 = var4;
      this.field1437 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[Class3612.method12226(this.field1438)];

      for (int var4 = this.field1434; var4 < this.field1435; var4++) {
         int var5 = var4 * Class3612.method12222(this.field1438);

         for (int var6 = 0; var6 < Class3612.method12224(this.field1438); var6++) {
            for (int var7 = 0; var7 < Class3612.method12226(this.field1438); var7++) {
               int var8 = var7 * Class3612.method12220(this.field1438) + var5 + var6;
               var3[var7] = this.field1436[var8];
            }

            Class3612.method12227(this.field1438).method33656(var3, this.field1437);

            for (int var9 = 0; var9 < Class3612.method12226(this.field1438); var9++) {
               int var10 = var9 * Class3612.method12220(this.field1438) + var5 + var6;
               this.field1436[var10] = var3[var9];
            }
         }
      }
   }
}

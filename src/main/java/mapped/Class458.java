package mapped;

public class Class458 implements Runnable {
   private static String[] field2100;
   public final int field2101;
   public final int field2102;
   public final double[] field2103;
   public final boolean field2104;
   public final Class3612 field2105;

   public Class458(Class3612 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field2105 = var1;
      this.field2101 = var2;
      this.field2102 = var3;
      this.field2103 = var4;
      this.field2104 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[Class3612.method12221(this.field2105)];

      for (int var4 = this.field2101; var4 < this.field2102; var4++) {
         int var5 = var4 * Class3612.method12220(this.field2105);

         for (int var6 = 0; var6 < Class3612.method12224(this.field2105); var6++) {
            for (int var7 = 0; var7 < Class3612.method12221(this.field2105); var7++) {
               int var8 = var5 + var7 * Class3612.method12222(this.field2105) + var6;
               var3[var7] = this.field2103[var8];
            }

            Class3612.method12225(this.field2105).method33660(var3, this.field2104);

            for (int var9 = 0; var9 < Class3612.method12221(this.field2105); var9++) {
               int var10 = var5 + var9 * Class3612.method12222(this.field2105) + var6;
               this.field2103[var10] = var3[var9];
            }
         }
      }
   }
}

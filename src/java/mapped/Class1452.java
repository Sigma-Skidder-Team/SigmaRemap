package mapped;

public class Class1452 implements Runnable {
   private static String[] field7805;
   public final int field7806;
   public final int field7807;
   public final double[] field7808;
   public final boolean field7809;
   public final Class3612 field7810;

   public Class1452(Class3612 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field7810 = var1;
      this.field7806 = var2;
      this.field7807 = var3;
      this.field7808 = var4;
      this.field7809 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[Class3612.method12221(this.field7810)];

      for (int var4 = this.field7806; var4 < this.field7807; var4++) {
         int var5 = var4 * Class3612.method12220(this.field7810);

         for (int var6 = 0; var6 < Class3612.method12224(this.field7810); var6++) {
            for (int var7 = 0; var7 < Class3612.method12221(this.field7810); var7++) {
               int var8 = var5 + var7 * Class3612.method12222(this.field7810) + var6;
               var3[var7] = this.field7808[var8];
            }

            Class3612.method12225(this.field7810).method33656(var3, this.field7809);

            for (int var9 = 0; var9 < Class3612.method12221(this.field7810); var9++) {
               int var10 = var5 + var9 * Class3612.method12222(this.field7810) + var6;
               this.field7808[var10] = var3[var9];
            }
         }
      }
   }
}

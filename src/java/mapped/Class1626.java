package mapped;

public class Class1626 implements Runnable {
   private static String[] field8813;
   public final int field8814;
   public final int field8815;
   public final double[] field8816;
   public final boolean field8817;
   public final Class3612 field8818;

   public Class1626(Class3612 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field8818 = var1;
      this.field8814 = var2;
      this.field8815 = var3;
      this.field8816 = var4;
      this.field8817 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[Class3612.method12226(this.field8818)];

      for (int var4 = this.field8814; var4 < this.field8815; var4++) {
         int var5 = var4 * Class3612.method12222(this.field8818);

         for (int var6 = 0; var6 < Class3612.method12224(this.field8818); var6++) {
            for (int var7 = 0; var7 < Class3612.method12226(this.field8818); var7++) {
               int var8 = var7 * Class3612.method12220(this.field8818) + var5 + var6;
               var3[var7] = this.field8816[var8];
            }

            Class3612.method12227(this.field8818).method33660(var3, this.field8817);

            for (int var9 = 0; var9 < Class3612.method12226(this.field8818); var9++) {
               int var10 = var9 * Class3612.method12220(this.field8818) + var5 + var6;
               this.field8816[var10] = var3[var9];
            }
         }
      }
   }
}

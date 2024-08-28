package mapped;

public class Class754 implements Runnable {
   private static String[] field3914;
   public final int field3915;
   public final int field3916;
   public final double[] field3917;
   public final boolean field3918;
   public final Class6352 field3919;

   public Class754(Class6352 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field3919 = var1;
      this.field3915 = var2;
      this.field3916 = var3;
      this.field3917 = var4;
      this.field3918 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[Class6352.method19333(this.field3919)];

      for (int var4 = this.field3915; var4 < this.field3916; var4++) {
         int var5 = var4 * Class6352.method19329(this.field3919);

         for (int var6 = 0; var6 < Class6352.method19331(this.field3919); var6++) {
            for (int var7 = 0; var7 < Class6352.method19333(this.field3919); var7++) {
               int var8 = var7 * Class6352.method19327(this.field3919) + var5 + var6;
               var3[var7] = this.field3917[var8];
            }

            Class6352.method19334(this.field3919).method38580(var3, this.field3918);

            for (int var9 = 0; var9 < Class6352.method19333(this.field3919); var9++) {
               int var10 = var9 * Class6352.method19327(this.field3919) + var5 + var6;
               this.field3917[var10] = var3[var9];
            }
         }
      }
   }
}

package mapped;

public class Class1349 implements Runnable {
   private static String[] field7187;
   public final int field7188;
   public final int field7189;
   public final double[] field7190;
   public final boolean field7191;
   public final Class6352 field7192;

   public Class1349(Class6352 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field7192 = var1;
      this.field7188 = var2;
      this.field7189 = var3;
      this.field7190 = var4;
      this.field7191 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[Class6352.method19328(this.field7192)];

      for (int var4 = this.field7188; var4 < this.field7189; var4++) {
         int var5 = var4 * Class6352.method19327(this.field7192);

         for (int var6 = 0; var6 < Class6352.method19331(this.field7192); var6++) {
            for (int var7 = 0; var7 < Class6352.method19328(this.field7192); var7++) {
               int var8 = var5 + var7 * Class6352.method19329(this.field7192) + var6;
               var3[var7] = this.field7190[var8];
            }

            Class6352.method19332(this.field7192).method38576(var3, this.field7191);

            for (int var9 = 0; var9 < Class6352.method19328(this.field7192); var9++) {
               int var10 = var5 + var9 * Class6352.method19329(this.field7192) + var6;
               this.field7190[var10] = var3[var9];
            }
         }
      }
   }
}

package mapped;

public class Class1399 implements Runnable {
   private static String[] field7481;
   public final int field7482;
   public final int field7483;
   public final double[][] field7484;
   public final boolean field7485;
   public final Class9055 field7486;

   public Class1399(Class9055 var1, int var2, int var3, double[][] var4, boolean var5) {
      this.field7486 = var1;
      this.field7482 = var2;
      this.field7483 = var3;
      this.field7484 = var4;
      this.field7485 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[Class9055.method33699(this.field7486)];

      for (int var4 = this.field7482; var4 < this.field7483; var4++) {
         for (int var5 = 0; var5 < Class9055.method33699(this.field7486); var5++) {
            var3[var5] = this.field7484[var5][var4];
         }

         Class9055.method33700(this.field7486).method33656(var3, this.field7485);

         for (int var6 = 0; var6 < Class9055.method33699(this.field7486); var6++) {
            this.field7484[var6][var4] = var3[var6];
         }
      }
   }
}

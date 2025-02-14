package mapped;

public class Class427 implements Runnable {
   private static String[] field1891;
   public final int field1892;
   public final int field1893;
   public final double[][][] field1894;
   public final Class7274 field1895;

   public Class427(Class7274 var1, int var2, int var3, double[][][] var4) {
      this.field1895 = var1;
      this.field1892 = var2;
      this.field1893 = var3;
      this.field1894 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field1892; var3 < this.field1893; var3++) {
         for (int var4 = 0; var4 < Class7274.method22895(this.field1895); var4++) {
            Class7274.method22897(this.field1895).method27162(this.field1894[var3][var4]);
         }
      }
   }
}

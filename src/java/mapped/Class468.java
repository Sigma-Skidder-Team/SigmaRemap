package mapped;

public class Class468 implements Runnable {
   private static String[] field2173;
   public final int field2174;
   public final int field2175;
   public final double[][] field2176;
   public final boolean field2177;
   public final Class9330 field2178;

   public Class468(Class9330 var1, int var2, int var3, double[][] var4, boolean var5) {
      this.field2178 = var1;
      this.field2174 = var2;
      this.field2175 = var3;
      this.field2176 = var4;
      this.field2177 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[Class9330.method35279(this.field2178)];

      for (int var4 = this.field2174; var4 < this.field2175; var4++) {
         for (int var5 = 0; var5 < Class9330.method35279(this.field2178); var5++) {
            var3[var5] = this.field2176[var5][var4];
         }

         Class9330.method35280(this.field2178).method38580(var3, this.field2177);

         for (int var6 = 0; var6 < Class9330.method35279(this.field2178); var6++) {
            this.field2176[var6][var4] = var3[var6];
         }
      }
   }
}

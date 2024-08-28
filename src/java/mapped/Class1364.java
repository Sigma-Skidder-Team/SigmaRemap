package mapped;

public class Class1364 implements Runnable {
   private static String[] field7279;
   public final int field7280;
   public final int field7281;
   public final int field7282;
   public final float[][] field7283;
   public final float[][] field7284;
   public final Class8543 field7285;

   public Class1364(Class8543 var1, int var2, int var3, int var4, float[][] var5, float[][] var6) {
      this.field7285 = var1;
      this.field7280 = var2;
      this.field7281 = var3;
      this.field7282 = var4;
      this.field7283 = var5;
      this.field7284 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field7280; var3 < this.field7281; var3++) {
         int var4 = 2 * var3;

         for (int var5 = 0; var5 < this.field7282; var5++) {
            int var6 = 2 * var5;
            this.field7283[var3][var6] = this.field7284[var5][var4];
            this.field7283[var3][var6 + 1] = this.field7284[var5][var4 + 1];
         }
      }
   }
}

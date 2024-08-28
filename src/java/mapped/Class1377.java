package mapped;

public class Class1377 implements Runnable {
   private static String[] field7354;
   public final int field7355;
   public final int field7356;
   public final int field7357;
   public final float[][] field7358;
   public final float[][] field7359;
   public final Class8543 field7360;

   public Class1377(Class8543 var1, int var2, int var3, int var4, float[][] var5, float[][] var6) {
      this.field7360 = var1;
      this.field7355 = var2;
      this.field7356 = var3;
      this.field7357 = var4;
      this.field7358 = var5;
      this.field7359 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field7355; var3 < this.field7356; var3++) {
         int var4 = 2 * var3;

         for (int var5 = 0; var5 < this.field7357; var5++) {
            int var6 = 2 * var5;
            this.field7358[var3][var6] = this.field7359[var5][var4];
            this.field7358[var3][var6 + 1] = this.field7359[var5][var4 + 1];
         }
      }
   }
}

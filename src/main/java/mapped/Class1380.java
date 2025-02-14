package mapped;

public class Class1380 implements Runnable {
   private static String[] field7372;
   public final int field7373;
   public final int field7374;
   public final float[][][] field7375;
   public final boolean field7376;
   public final Class7941 field7377;

   public Class1380(Class7941 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field7377 = var1;
      this.field7373 = var2;
      this.field7374 = var3;
      this.field7375 = var4;
      this.field7376 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[Class7941.method26769(this.field7377)];

      for (int var4 = this.field7373; var4 < this.field7374; var4++) {
         for (int var5 = 0; var5 < Class7941.method26767(this.field7377); var5++) {
            for (int var6 = 0; var6 < Class7941.method26769(this.field7377); var6++) {
               var3[var6] = this.field7375[var6][var4][var5];
            }

            Class7941.method26770(this.field7377).method28928(var3, this.field7376);

            for (int var7 = 0; var7 < Class7941.method26769(this.field7377); var7++) {
               this.field7375[var7][var4][var5] = var3[var7];
            }
         }
      }
   }
}

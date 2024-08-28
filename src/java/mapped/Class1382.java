package mapped;

public class Class1382 implements Runnable {
   private static String[] field7384;
   public final int field7385;
   public final int field7386;
   public final float[][][] field7387;
   public final Class8162 field7388;

   public Class1382(Class8162 var1, int var2, int var3, float[][][] var4) {
      this.field7388 = var1;
      this.field7385 = var2;
      this.field7386 = var3;
      this.field7387 = var4;
   }

   @Override
   public void run() {
      float[] var3 = new float[Class8162.method28393(this.field7388)];

      for (int var4 = this.field7385; var4 < this.field7386; var4++) {
         for (int var5 = 0; var5 < Class8162.method28396(this.field7388); var5++) {
            for (int var6 = 0; var6 < Class8162.method28393(this.field7388); var6++) {
               var3[var6] = this.field7387[var4][var6][var5];
            }

            Class8162.method28397(this.field7388).method28455(var3);

            for (int var7 = 0; var7 < Class8162.method28393(this.field7388); var7++) {
               this.field7387[var4][var7][var5] = var3[var7];
            }
         }
      }
   }
}

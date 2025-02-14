package mapped;

public class Class1482 implements Runnable {
   private static String[] field7979;
   public final int field7980;
   public final int field7981;
   public final float[][][] field7982;
   public final Class8026 field7983;

   public Class1482(Class8026 var1, int var2, int var3, float[][][] var4) {
      this.field7983 = var1;
      this.field7980 = var2;
      this.field7981 = var3;
      this.field7982 = var4;
   }

   @Override
   public void run() {
      float[] var3 = new float[2 * Class8026.method27518(this.field7983)];

      for (int var4 = this.field7980; var4 < this.field7981; var4++) {
         for (int var5 = 0; var5 < Class8026.method27516(this.field7983); var5++) {
            int var6 = 2 * var5;

            for (int var7 = 0; var7 < Class8026.method27518(this.field7983); var7++) {
               int var8 = 2 * var7;
               var3[var8] = this.field7982[var7][var4][var6];
               var3[var8 + 1] = this.field7982[var7][var4][var6 + 1];
            }

            Class8026.method27519(this.field7983).method30929(var3);

            for (int var9 = 0; var9 < Class8026.method27518(this.field7983); var9++) {
               int var10 = 2 * var9;
               this.field7982[var9][var4][var6] = var3[var10];
               this.field7982[var9][var4][var6 + 1] = var3[var10 + 1];
            }
         }
      }
   }
}

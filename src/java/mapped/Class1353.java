package mapped;

public class Class1353 implements Runnable {
   private static String[] field7212;
   public final int field7213;
   public final int field7214;
   public final float[][][] field7215;
   public final boolean field7216;
   public final Class8026 field7217;

   public Class1353(Class8026 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field7217 = var1;
      this.field7213 = var2;
      this.field7214 = var3;
      this.field7215 = var4;
      this.field7216 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[2 * Class8026.method27518(this.field7217)];

      for (int var4 = this.field7213; var4 < this.field7214; var4++) {
         for (int var5 = 0; var5 < Class8026.method27516(this.field7217); var5++) {
            int var6 = 2 * var5;

            for (int var7 = 0; var7 < Class8026.method27518(this.field7217); var7++) {
               int var8 = 2 * var7;
               var3[var8] = this.field7215[var7][var4][var6];
               var3[var8 + 1] = this.field7215[var7][var4][var6 + 1];
            }

            Class8026.method27519(this.field7217).method30933(var3, this.field7216);

            for (int var9 = 0; var9 < Class8026.method27518(this.field7217); var9++) {
               int var10 = 2 * var9;
               this.field7215[var9][var4][var6] = var3[var10];
               this.field7215[var9][var4][var6 + 1] = var3[var10 + 1];
            }
         }
      }
   }
}

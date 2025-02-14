package mapped;

public class Class1412 implements Runnable {
   private static String[] field7561;
   public final int field7562;
   public final int field7563;
   public final int field7564;
   public final int field7565;
   public final float[] field7566;
   public final boolean field7567;
   public final Class8026 field7568;

   public Class1412(Class8026 var1, int var2, int var3, int var4, int var5, float[] var6, boolean var7) {
      this.field7568 = var1;
      this.field7562 = var2;
      this.field7563 = var3;
      this.field7564 = var4;
      this.field7565 = var5;
      this.field7566 = var6;
      this.field7567 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[2 * Class8026.method27513(this.field7568)];

      for (int var4 = this.field7562; var4 < this.field7563; var4++) {
         int var5 = var4 * this.field7564;

         for (int var6 = 0; var6 < Class8026.method27516(this.field7568); var6++) {
            int var7 = 2 * var6;

            for (int var8 = 0; var8 < Class8026.method27513(this.field7568); var8++) {
               int var9 = var5 + var8 * this.field7565 + var7;
               int var10 = 2 * var8;
               var3[var10] = this.field7566[var9];
               var3[var10 + 1] = this.field7566[var9 + 1];
            }

            Class8026.method27517(this.field7568).method30933(var3, this.field7567);

            for (int var11 = 0; var11 < Class8026.method27513(this.field7568); var11++) {
               int var12 = var5 + var11 * this.field7565 + var7;
               int var13 = 2 * var11;
               this.field7566[var12] = var3[var13];
               this.field7566[var12 + 1] = var3[var13 + 1];
            }
         }
      }
   }
}

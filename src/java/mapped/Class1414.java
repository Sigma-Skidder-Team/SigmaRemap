package mapped;

public class Class1414 implements Runnable {
   private static String[] field7575;
   public final int field7576;
   public final int field7577;
   public final float[] field7578;
   public final boolean field7579;
   public final Class8026 field7580;

   public Class1414(Class8026 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field7580 = var1;
      this.field7576 = var2;
      this.field7577 = var3;
      this.field7578 = var4;
      this.field7579 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[2 * Class8026.method27513(this.field7580)];

      for (int var4 = this.field7576; var4 < this.field7577; var4++) {
         int var5 = var4 * Class8026.method27512(this.field7580);

         for (int var6 = 0; var6 < Class8026.method27516(this.field7580); var6++) {
            int var7 = 2 * var6;

            for (int var8 = 0; var8 < Class8026.method27513(this.field7580); var8++) {
               int var9 = var5 + var7 + var8 * Class8026.method27514(this.field7580);
               int var10 = 2 * var8;
               var3[var10] = this.field7578[var9];
               var3[var10 + 1] = this.field7578[var9 + 1];
            }

            Class8026.method27517(this.field7580).method30933(var3, this.field7579);

            for (int var11 = 0; var11 < Class8026.method27513(this.field7580); var11++) {
               int var12 = var5 + var7 + var11 * Class8026.method27514(this.field7580);
               int var13 = 2 * var11;
               this.field7578[var12] = var3[var13];
               this.field7578[var12 + 1] = var3[var13 + 1];
            }
         }
      }
   }
}

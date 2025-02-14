package mapped;

public class Class1575 implements Runnable {
   private static String[] field8523;
   public final int field8524;
   public final int field8525;
   public final int field8526;
   public final int field8527;
   public final float[] field8528;
   public final Class8026 field8529;

   public Class1575(Class8026 var1, int var2, int var3, int var4, int var5, float[] var6) {
      this.field8529 = var1;
      this.field8524 = var2;
      this.field8525 = var3;
      this.field8526 = var4;
      this.field8527 = var5;
      this.field8528 = var6;
   }

   @Override
   public void run() {
      float[] var3 = new float[2 * Class8026.method27513(this.field8529)];

      for (int var4 = this.field8524; var4 < this.field8525; var4++) {
         int var5 = var4 * this.field8526;

         for (int var6 = 0; var6 < Class8026.method27516(this.field8529); var6++) {
            int var7 = 2 * var6;

            for (int var8 = 0; var8 < Class8026.method27513(this.field8529); var8++) {
               int var9 = var5 + var8 * this.field8527 + var7;
               int var10 = 2 * var8;
               var3[var10] = this.field8528[var9];
               var3[var10 + 1] = this.field8528[var9 + 1];
            }

            Class8026.method27517(this.field8529).method30929(var3);

            for (int var11 = 0; var11 < Class8026.method27513(this.field8529); var11++) {
               int var12 = var5 + var11 * this.field8527 + var7;
               int var13 = 2 * var11;
               this.field8528[var12] = var3[var13];
               this.field8528[var12 + 1] = var3[var13 + 1];
            }
         }
      }
   }
}

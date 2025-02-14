package mapped;

public class Class1529 implements Runnable {
   private static String[] field8290;
   public final int field8291;
   public final int field8292;
   public final int field8293;
   public final int field8294;
   public final int field8295;
   public final int field8296;
   public final float[] field8297;
   public final Class8026 field8298;

   public Class1529(Class8026 var1, int var2, int var3, int var4, int var5, int var6, int var7, float[] var8) {
      this.field8298 = var1;
      this.field8291 = var2;
      this.field8292 = var3;
      this.field8293 = var4;
      this.field8294 = var5;
      this.field8295 = var6;
      this.field8296 = var7;
      this.field8297 = var8;
   }

   @Override
   public void run() {
      for (int var3 = this.field8291; var3 < this.field8292; var3++) {
         int var4 = (Class8026.method27518(this.field8298) - var3) % Class8026.method27518(this.field8298);
         int var5 = var4 * this.field8293;
         int var6 = var3 * this.field8293;

         for (int var7 = 1; var7 < this.field8294; var7++) {
            int var8 = Class8026.method27513(this.field8298) - var7;
            int var9 = var8 * this.field8295;
            int var10 = var7 * this.field8295;
            int var11 = var5 + var9;

            for (int var12 = 0; var12 < Class8026.method27516(this.field8298); var12++) {
               int var13 = 2 * var12;
               int var14 = this.field8296 - var13;
               int var15 = var6 + var10 + var13;
               this.field8297[var11 + var14 % this.field8296] = this.field8297[var15];
               this.field8297[var11 + (var14 + 1) % this.field8296] = -this.field8297[var15 + 1];
            }
         }
      }
   }
}

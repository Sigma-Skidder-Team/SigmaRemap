package mapped;

public class Class457 implements Runnable {
   private static String[] field2091;
   public final int field2092;
   public final int field2093;
   public final int field2094;
   public final int field2095;
   public final int field2096;
   public final int field2097;
   public final float[] field2098;
   public final Class8026 field2099;

   public Class457(Class8026 var1, int var2, int var3, int var4, int var5, int var6, int var7, float[] var8) {
      this.field2099 = var1;
      this.field2092 = var2;
      this.field2093 = var3;
      this.field2094 = var4;
      this.field2095 = var5;
      this.field2096 = var6;
      this.field2097 = var7;
      this.field2098 = var8;
   }

   @Override
   public void run() {
      for (int var3 = this.field2092; var3 < this.field2093; var3++) {
         int var4 = (Class8026.method27518(this.field2099) - var3) % Class8026.method27518(this.field2099);
         int var5 = var4 * this.field2094;
         int var6 = var3 * this.field2094;

         for (int var7 = 1; var7 < this.field2095; var7++) {
            int var8 = Class8026.method27513(this.field2099) - var7;
            int var9 = var8 * this.field2096;
            int var10 = var7 * this.field2096;
            int var11 = var5 + var9;

            for (int var12 = 0; var12 < Class8026.method27516(this.field2099); var12++) {
               int var13 = 2 * var12;
               int var14 = this.field2097 - var13;
               int var15 = var6 + var10 + var13;
               this.field2098[var11 + var14 % this.field2097] = this.field2098[var15];
               this.field2098[var11 + (var14 + 1) % this.field2097] = -this.field2098[var15 + 1];
            }
         }
      }
   }
}

package mapped;

public class Class521 implements Runnable {
   private static String[] field2472;
   public final int field2473;
   public final int field2474;
   public final int field2475;
   public final int field2476;
   public final float[][][] field2477;
   public final Class8026 field2478;

   public Class521(Class8026 var1, int var2, int var3, int var4, int var5, float[][][] var6) {
      this.field2478 = var1;
      this.field2473 = var2;
      this.field2474 = var3;
      this.field2475 = var4;
      this.field2476 = var5;
      this.field2477 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field2473; var3 < this.field2474; var3++) {
         int var4 = (Class8026.method27518(this.field2478) - var3) % Class8026.method27518(this.field2478);

         for (int var5 = 1; var5 < this.field2475; var5++) {
            int var6 = Class8026.method27513(this.field2478) - var5;

            for (int var7 = 0; var7 < Class8026.method27516(this.field2478); var7++) {
               int var8 = 2 * var7;
               int var9 = this.field2476 - var8;
               this.field2477[var4][var6][var9 % this.field2476] = this.field2477[var3][var5][var8];
               this.field2477[var4][var6][(var9 + 1) % this.field2476] = -this.field2477[var3][var5][var8 + 1];
            }
         }
      }
   }
}

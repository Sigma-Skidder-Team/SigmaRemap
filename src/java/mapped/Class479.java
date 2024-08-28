package mapped;

public class Class479 implements Runnable {
   private static String[] field2238;
   public final int field2239;
   public final int field2240;
   public final int field2241;
   public final float[][] field2242;
   public final Class8543 field2243;

   public Class479(Class8543 var1, int var2, int var3, int var4, float[][] var5) {
      this.field2243 = var1;
      this.field2239 = var2;
      this.field2240 = var3;
      this.field2241 = var4;
      this.field2242 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field2239; var3 < this.field2240; var3++) {
         int var4 = Class8543.method30435(this.field2243) - var3;

         for (int var5 = this.field2241; var5 < Class8543.method30438(this.field2243); var5++) {
            int var6 = 2 * var5;
            int var7 = 2 * (Class8543.method30438(this.field2243) - var5);
            this.field2242[0][var6] = this.field2242[0][var7];
            this.field2242[0][var6 + 1] = -this.field2242[0][var7 + 1];
            this.field2242[var3][var6] = this.field2242[var4][var7];
            this.field2242[var3][var6 + 1] = -this.field2242[var4][var7 + 1];
         }
      }
   }
}

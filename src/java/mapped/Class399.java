package mapped;

public class Class399 implements Runnable {
   private static String[] field1711;
   public final int field1712;
   public final int field1713;
   public final float[][][] field1714;
   public final boolean field1715;
   public final Class7941 field1716;

   public Class399(Class7941 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field1716 = var1;
      this.field1712 = var2;
      this.field1713 = var3;
      this.field1714 = var4;
      this.field1715 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[Class7941.method26769(this.field1716)];

      for (int var4 = this.field1712; var4 < this.field1713; var4++) {
         for (int var5 = 0; var5 < Class7941.method26767(this.field1716); var5++) {
            for (int var6 = 0; var6 < Class7941.method26769(this.field1716); var6++) {
               var3[var6] = this.field1714[var6][var4][var5];
            }

            Class7941.method26770(this.field1716).method28924(var3, this.field1715);

            for (int var7 = 0; var7 < Class7941.method26769(this.field1716); var7++) {
               this.field1714[var7][var4][var5] = var3[var7];
            }
         }
      }
   }
}

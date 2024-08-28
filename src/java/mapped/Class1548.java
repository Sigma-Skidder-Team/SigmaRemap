package mapped;

public class Class1548 implements Runnable {
   private static String[] field8397;
   public final int field8398;
   public final int field8399;
   public final float[] field8400;
   public final boolean field8401;
   public final Class7941 field8402;

   public Class1548(Class7941 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field8402 = var1;
      this.field8398 = var2;
      this.field8399 = var3;
      this.field8400 = var4;
      this.field8401 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[Class7941.method26764(this.field8402)];

      for (int var4 = this.field8398; var4 < this.field8399; var4++) {
         int var5 = var4 * Class7941.method26763(this.field8402);

         for (int var6 = 0; var6 < Class7941.method26767(this.field8402); var6++) {
            for (int var7 = 0; var7 < Class7941.method26764(this.field8402); var7++) {
               int var8 = var5 + var7 * Class7941.method26765(this.field8402) + var6;
               var3[var7] = this.field8400[var8];
            }

            Class7941.method26768(this.field8402).method28928(var3, this.field8401);

            for (int var9 = 0; var9 < Class7941.method26764(this.field8402); var9++) {
               int var10 = var5 + var9 * Class7941.method26765(this.field8402) + var6;
               this.field8400[var10] = var3[var9];
            }
         }
      }
   }
}

package mapped;

public class Class1573 implements Runnable {
   private static String[] field8510;
   public final int field8511;
   public final int field8512;
   public final float[] field8513;
   public final Class8026 field8514;

   public Class1573(Class8026 var1, int var2, int var3, float[] var4) {
      this.field8514 = var1;
      this.field8511 = var2;
      this.field8512 = var3;
      this.field8513 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field8511; var3 < this.field8512; var3++) {
         int var4 = var3 * Class8026.method27512(this.field8514);

         for (int var5 = 0; var5 < Class8026.method27513(this.field8514); var5++) {
            Class8026.method27515(this.field8514).method30931(this.field8513, var4 + var5 * Class8026.method27514(this.field8514));
         }
      }
   }
}

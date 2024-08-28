package mapped;

public class Class418 implements Runnable {
   private static String[] field1836;
   public final int field1837;
   public final int field1838;
   public final float[] field1839;
   public final Class8026 field1840;

   public Class418(Class8026 var1, int var2, int var3, float[] var4) {
      this.field1840 = var1;
      this.field1837 = var2;
      this.field1838 = var3;
      this.field1839 = var4;
   }

   @Override
   public void run() {
      float[] var3 = new float[2 * Class8026.method27518(this.field1840)];

      for (int var4 = this.field1837; var4 < this.field1838; var4++) {
         int var5 = var4 * Class8026.method27514(this.field1840);

         for (int var6 = 0; var6 < Class8026.method27516(this.field1840); var6++) {
            int var7 = 2 * var6;

            for (int var8 = 0; var8 < Class8026.method27518(this.field1840); var8++) {
               int var9 = var8 * Class8026.method27512(this.field1840) + var5 + var7;
               int var10 = 2 * var8;
               var3[var10] = this.field1839[var9];
               var3[var10 + 1] = this.field1839[var9 + 1];
            }

            Class8026.method27519(this.field1840).method30929(var3);

            for (int var11 = 0; var11 < Class8026.method27518(this.field1840); var11++) {
               int var12 = var11 * Class8026.method27512(this.field1840) + var5 + var7;
               int var13 = 2 * var11;
               this.field1839[var12] = var3[var13];
               this.field1839[var12 + 1] = var3[var13 + 1];
            }
         }
      }
   }
}

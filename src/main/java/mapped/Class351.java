package mapped;

public class Class351 implements Runnable {
   private static String[] field1559;
   public final int field1560;
   public final int field1561;
   public final int field1562;
   public final int field1563;
   public final float[] field1564;
   public final float[][] field1565;
   public final Class8543 field1566;

   public Class351(Class8543 var1, int var2, int var3, int var4, int var5, float[] var6, float[][] var7) {
      this.field1566 = var1;
      this.field1560 = var2;
      this.field1561 = var3;
      this.field1562 = var4;
      this.field1563 = var5;
      this.field1564 = var6;
      this.field1565 = var7;
   }

   @Override
   public void run() {
      for (int var3 = this.field1560; var3 < this.field1561; var3++) {
         int var4 = 2 * var3;

         for (int var5 = 0; var5 < this.field1562; var5++) {
            int var6 = 2 * var5;
            int var7 = var3 * this.field1563 + var6;
            this.field1564[var7] = this.field1565[var5][var4];
            this.field1564[var7 + 1] = this.field1565[var5][var4 + 1];
         }
      }
   }
}

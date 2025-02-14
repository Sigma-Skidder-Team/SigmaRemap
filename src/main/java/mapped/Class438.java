package mapped;

public class Class438 implements Runnable {
   private static String[] field1967;
   public final int field1968;
   public final int field1969;
   public final float[] field1970;
   public final float[][][] field1971;
   public final boolean field1972;
   public final Class8026 field1973;

   public Class438(Class8026 var1, int var2, int var3, float[] var4, float[][][] var5, boolean var6) {
      this.field1973 = var1;
      this.field1968 = var2;
      this.field1969 = var3;
      this.field1970 = var4;
      this.field1971 = var5;
      this.field1972 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field1968; var3 < this.field1969; var3++) {
         int var4 = var3 * Class8026.method27512(this.field1973);

         for (int var5 = 0; var5 < Class8026.method27513(this.field1973); var5++) {
            System.arraycopy(
               this.field1970, var4 + var5 * Class8026.method27514(this.field1973), this.field1971[var3][var5], 0, Class8026.method27516(this.field1973)
            );
            Class8026.method27515(this.field1973).method30949(this.field1971[var3][var5], this.field1972);
         }
      }
   }
}

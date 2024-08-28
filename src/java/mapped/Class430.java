package mapped;

public class Class430 implements Runnable {
   private static String[] field1912;
   public final int field1913;
   public final int field1914;
   public final int field1915;
   public final int field1916;
   public final int field1917;
   public final float[] field1918;
   public final Class8026 field1919;

   public Class430(Class8026 var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
      this.field1919 = var1;
      this.field1913 = var2;
      this.field1914 = var3;
      this.field1915 = var4;
      this.field1916 = var5;
      this.field1917 = var6;
      this.field1918 = var7;
   }

   @Override
   public void run() {
      for (int var3 = this.field1913; var3 < this.field1914; var3++) {
         int var4 = (Class8026.method27518(this.field1919) - var3) % Class8026.method27518(this.field1919) * this.field1915;
         int var5 = var3 * this.field1915;

         for (int var6 = 0; var6 < Class8026.method27513(this.field1919); var6++) {
            int var7 = (Class8026.method27513(this.field1919) - var6) % Class8026.method27513(this.field1919) * this.field1916;
            int var8 = var6 * this.field1916;

            for (int var9 = 1; var9 < Class8026.method27516(this.field1919); var9 += 2) {
               int var10 = var4 + var7 + this.field1917 - var9;
               int var11 = var5 + var8 + var9;
               this.field1918[var10] = -this.field1918[var11 + 2];
               this.field1918[var10 - 1] = this.field1918[var11 + 1];
            }
         }
      }
   }
}

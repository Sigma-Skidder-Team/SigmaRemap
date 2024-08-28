package mapped;

public class Class448 implements Runnable {
   private static String[] field2034;
   public final int field2035;
   public final int field2036;
   public final int field2037;
   public final int field2038;
   public final float[] field2039;
   public final boolean field2040;
   public final int field2041;
   public final Class8026 field2042;

   public Class448(Class8026 var1, int var2, int var3, int var4, int var5, float[] var6, boolean var7, int var8) {
      this.field2042 = var1;
      this.field2035 = var2;
      this.field2036 = var3;
      this.field2037 = var4;
      this.field2038 = var5;
      this.field2039 = var6;
      this.field2040 = var7;
      this.field2041 = var8;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field2035];

      for (int var4 = this.field2036; var4 >= this.field2037; var4--) {
         int var5 = var4 * Class8026.method27512(this.field2042);
         int var6 = var4 * this.field2038;

         for (int var7 = Class8026.method27513(this.field2042) - 1; var7 >= 0; var7--) {
            System.arraycopy(this.field2039, var5 + var7 * Class8026.method27514(this.field2042), var3, 0, Class8026.method27516(this.field2042));
            Class8026.method27515(this.field2042).method30949(var3, this.field2040);
            System.arraycopy(var3, 0, this.field2039, var6 + var7 * this.field2041, this.field2035);
         }
      }
   }
}

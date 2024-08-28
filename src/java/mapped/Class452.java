package mapped;

public class Class452 implements Runnable {
   private static String[] field2061;
   public final int field2062;
   public final int field2063;
   public final int field2064;
   public final int field2065;
   public final float[] field2066;
   public final int field2067;
   public final Class8026 field2068;

   public Class452(Class8026 var1, int var2, int var3, int var4, int var5, float[] var6, int var7) {
      this.field2068 = var1;
      this.field2062 = var2;
      this.field2063 = var3;
      this.field2064 = var4;
      this.field2065 = var5;
      this.field2066 = var6;
      this.field2067 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field2062];

      for (int var4 = this.field2063; var4 >= this.field2064; var4--) {
         int var5 = var4 * Class8026.method27512(this.field2068);
         int var6 = var4 * this.field2065;

         for (int var7 = Class8026.method27513(this.field2068) - 1; var7 >= 0; var7--) {
            System.arraycopy(this.field2066, var5 + var7 * Class8026.method27514(this.field2068), var3, 0, Class8026.method27516(this.field2068));
            Class8026.method27515(this.field2068).method30941(var3);
            System.arraycopy(var3, 0, this.field2066, var6 + var7 * this.field2067, this.field2062);
         }
      }
   }
}

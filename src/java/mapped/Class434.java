package mapped;

public class Class434 implements Runnable {
   private static String[] field1940;
   public final int field1941;
   public final int field1942;
   public final float[] field1943;
   public final boolean field1944;
   public final Class8162 field1945;

   public Class434(Class8162 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field1945 = var1;
      this.field1941 = var2;
      this.field1942 = var3;
      this.field1943 = var4;
      this.field1944 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field1941; var3 < this.field1942; var3++) {
         int var4 = var3 * Class8162.method28392(this.field1945);

         for (int var5 = 0; var5 < Class8162.method28393(this.field1945); var5++) {
            Class8162.method28395(this.field1945).method28461(this.field1943, var4 + var5 * Class8162.method28394(this.field1945), this.field1944);
         }
      }
   }
}

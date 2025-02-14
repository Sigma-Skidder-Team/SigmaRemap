package mapped;

public class Class433 implements Runnable {
   private static String[] field1934;
   public final int field1935;
   public final int field1936;
   public final float[] field1937;
   public final boolean field1938;
   public final Class7941 field1939;

   public Class433(Class7941 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field1939 = var1;
      this.field1935 = var2;
      this.field1936 = var3;
      this.field1937 = var4;
      this.field1938 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[Class7941.method26769(this.field1939)];

      for (int var4 = this.field1935; var4 < this.field1936; var4++) {
         int var5 = var4 * Class7941.method26765(this.field1939);

         for (int var6 = 0; var6 < Class7941.method26767(this.field1939); var6++) {
            for (int var7 = 0; var7 < Class7941.method26769(this.field1939); var7++) {
               int var8 = var7 * Class7941.method26763(this.field1939) + var5 + var6;
               var3[var7] = this.field1937[var8];
            }

            Class7941.method26770(this.field1939).method28928(var3, this.field1938);

            for (int var9 = 0; var9 < Class7941.method26769(this.field1939); var9++) {
               int var10 = var9 * Class7941.method26763(this.field1939) + var5 + var6;
               this.field1937[var10] = var3[var9];
            }
         }
      }
   }
}

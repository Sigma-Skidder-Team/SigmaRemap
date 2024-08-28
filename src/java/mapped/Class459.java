package mapped;

public class Class459 implements Runnable {
   private static String[] field2106;
   public final int field2107;
   public final int field2108;
   public final int field2109;
   public final float[] field2110;
   public final boolean field2111;
   public final Class7821 field2112;

   public Class459(Class7821 var1, int var2, int var3, int var4, float[] var5, boolean var6) {
      this.field2112 = var1;
      this.field2107 = var2;
      this.field2108 = var3;
      this.field2109 = var4;
      this.field2110 = var5;
      this.field2111 = var6;
   }

   @Override
   public void run() {
      if (this.field2107 != -1) {
         for (int var3 = this.field2108; var3 < Class7821.method26151(this.field2112); var3 += this.field2109) {
            Class7821.method26150(this.field2112).method28461(this.field2110, var3 * Class7821.method26149(this.field2112), this.field2111);
         }
      } else {
         for (int var4 = this.field2108; var4 < Class7821.method26151(this.field2112); var4 += this.field2109) {
            Class7821.method26150(this.field2112).method28457(this.field2110, var4 * Class7821.method26149(this.field2112));
         }
      }
   }
}

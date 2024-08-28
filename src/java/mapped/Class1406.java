package mapped;

public class Class1406 implements Runnable {
   private static String[] field7528;
   public final int field7529;
   public final int field7530;
   public final float[] field7531;
   public final boolean field7532;
   public final Class7941 field7533;

   public Class1406(Class7941 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field7533 = var1;
      this.field7529 = var2;
      this.field7530 = var3;
      this.field7531 = var4;
      this.field7532 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field7529; var3 < this.field7530; var3++) {
         int var4 = var3 * Class7941.method26763(this.field7533);

         for (int var5 = 0; var5 < Class7941.method26764(this.field7533); var5++) {
            Class7941.method26766(this.field7533).method28926(this.field7531, var4 + var5 * Class7941.method26765(this.field7533), this.field7532);
         }
      }
   }
}

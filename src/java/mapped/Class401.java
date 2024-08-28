package mapped;

public class Class401 implements Runnable {
   private static String[] field1723;
   public final int field1724;
   public final int field1725;
   public final float[] field1726;
   public final boolean field1727;
   public final Class8682 field1728;

   public Class401(Class8682 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field1728 = var1;
      this.field1724 = var2;
      this.field1725 = var3;
      this.field1726 = var4;
      this.field1727 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[Class8682.method31247(this.field1728)];

      for (int var4 = this.field1724; var4 < this.field1725; var4++) {
         for (int var5 = 0; var5 < Class8682.method31247(this.field1728); var5++) {
            var3[var5] = this.field1726[var5 * Class8682.method31245(this.field1728) + var4];
         }

         Class8682.method31248(this.field1728).method28924(var3, this.field1727);

         for (int var6 = 0; var6 < Class8682.method31247(this.field1728); var6++) {
            this.field1726[var6 * Class8682.method31245(this.field1728) + var4] = var3[var6];
         }
      }
   }
}

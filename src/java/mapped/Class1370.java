package mapped;

public class Class1370 implements Runnable {
   private static String[] field7315;
   public final int field7316;
   public final int field7317;
   public final float[] field7318;
   public final boolean field7319;
   public final Class8026 field7320;

   public Class1370(Class8026 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field7320 = var1;
      this.field7316 = var2;
      this.field7317 = var3;
      this.field7318 = var4;
      this.field7319 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field7316; var3 < this.field7317; var3++) {
         int var4 = var3 * Class8026.method27512(this.field7320);

         for (int var5 = 0; var5 < Class8026.method27513(this.field7320); var5++) {
            Class8026.method27515(this.field7320).method30935(this.field7318, var4 + var5 * Class8026.method27514(this.field7320), this.field7319);
         }
      }
   }
}

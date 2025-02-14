package mapped;

public class Class1355 implements Runnable {
   private static String[] field7224;
   public final int field7225;
   public final int field7226;
   public final float[] field7227;
   public final int field7228;
   public final float[] field7229;
   public final Class8630 field7230;

   public Class1355(Class8630 var1, int var2, int var3, float[] var4, int var5, float[] var6) {
      this.field7230 = var1;
      this.field7225 = var2;
      this.field7226 = var3;
      this.field7227 = var4;
      this.field7228 = var5;
      this.field7229 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field7225; var3 < this.field7226; var3++) {
         int var4 = 2 * var3;
         int var5 = var4 + 1;
         this.field7227[this.field7228 + var3] = Class8630.method31008(this.field7230)[var4] * this.field7229[var4]
            - Class8630.method31008(this.field7230)[var5] * this.field7229[var5];
      }
   }
}

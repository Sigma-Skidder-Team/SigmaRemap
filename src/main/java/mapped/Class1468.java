package mapped;

public class Class1468 implements Runnable {
   private static String[] field7892;
   public final int field7893;
   public final int field7894;
   public final int field7895;
   public final int field7896;
   public final float[] field7897;
   public final Class8630 field7898;

   public Class1468(Class8630 var1, int var2, int var3, int var4, int var5, float[] var6) {
      this.field7898 = var1;
      this.field7893 = var2;
      this.field7894 = var3;
      this.field7895 = var4;
      this.field7896 = var5;
      this.field7897 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field7893; var3 < this.field7894; var3++) {
         int var4 = 2 * var3;
         int var5 = this.field7895 + (this.field7896 - var4) % this.field7896;
         this.field7897[var5] = this.field7897[this.field7895 + var4];
         this.field7897[var5 + 1] = -this.field7897[this.field7895 + var4 + 1];
      }
   }
}

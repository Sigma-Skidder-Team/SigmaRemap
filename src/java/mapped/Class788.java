package mapped;

public class Class788 implements Runnable {
   private static String[] field4125;
   public final int field4126;
   public final int field4127;
   public final int field4128;
   public final int field4129;
   public final int field4130;
   public final float[] field4131;
   public final Class8026 field4132;

   public Class788(Class8026 var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
      this.field4132 = var1;
      this.field4126 = var2;
      this.field4127 = var3;
      this.field4128 = var4;
      this.field4129 = var5;
      this.field4130 = var6;
      this.field4131 = var7;
   }

   @Override
   public void run() {
      for (int var3 = this.field4126; var3 < this.field4127; var3++) {
         int var4 = (Class8026.method27518(this.field4132) - var3) % Class8026.method27518(this.field4132) * this.field4128;
         int var5 = var3 * this.field4128;

         for (int var6 = 1; var6 < this.field4129; var6++) {
            int var7 = var4 + (Class8026.method27513(this.field4132) - var6) * this.field4130;
            int var8 = var5 + var6 * this.field4130;
            this.field4131[var7] = this.field4131[var8];
            this.field4131[var7 + 1] = -this.field4131[var8 + 1];
         }
      }
   }
}

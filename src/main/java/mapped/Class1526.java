package mapped;

public final class Class1526 implements Runnable {
   private static String[] field8271;
   public final int field8272;
   public final int field8273;
   public final float[] field8274;
   public final float field8275;

   public Class1526(int var1, int var2, float[] var3, float var4) {
      this.field8272 = var1;
      this.field8273 = var2;
      this.field8274 = var3;
      this.field8275 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field8272; var3 < this.field8273; var3++) {
         this.field8274[var3] = this.field8274[var3] * this.field8275;
      }
   }
}

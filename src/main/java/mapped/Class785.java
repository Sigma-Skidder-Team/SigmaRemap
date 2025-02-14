package mapped;

public final class Class785 implements Runnable {
   private static String[] field4108;
   public final int field4109;
   public final int field4110;
   public final double[] field4111;
   public final double field4112;

   public Class785(int var1, int var2, double[] var3, double var4) {
      this.field4109 = var1;
      this.field4110 = var2;
      this.field4111 = var3;
      this.field4112 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field4109; var3 < this.field4110; var3++) {
         this.field4111[var3] = this.field4111[var3] * this.field4112;
      }
   }
}

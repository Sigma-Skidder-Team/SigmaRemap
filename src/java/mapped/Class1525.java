package mapped;

public final class Class1525 implements Runnable {
   private static String[] field8264;
   public final long field8265;
   public final long field8266;
   public final Class2385 field8267;
   public final long field8268;
   public final boolean[] field8269;
   public final int field8270;

   public Class1525(long var1, long var3, Class2385 var5, long var6, boolean[] var8, int var9) {
      this.field8265 = var1;
      this.field8266 = var3;
      this.field8267 = var5;
      this.field8268 = var6;
      this.field8269 = var8;
      this.field8270 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field8265; var3 < this.field8266; var3++) {
         this.field8267.method9673(this.field8268 + var3, this.field8269[this.field8270 + (int)var3]);
      }
   }
}

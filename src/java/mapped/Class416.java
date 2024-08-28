package mapped;

public final class Class416 implements Runnable {
   private static String[] field1824;
   public final long field1825;
   public final long field1826;
   public final Class2378 field1827;
   public final long field1828;
   public final float[] field1829;
   public final int field1830;

   public Class416(long var1, long var3, Class2378 var5, long var6, float[] var8, int var9) {
      this.field1825 = var1;
      this.field1826 = var3;
      this.field1827 = var5;
      this.field1828 = var6;
      this.field1829 = var8;
      this.field1830 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field1825; var3 < this.field1826; var3++) {
         this.field1827.method9685(this.field1828 + var3, this.field1829[this.field1830 + (int)var3]);
      }
   }
}

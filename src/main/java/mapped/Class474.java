package mapped;

public class Class474 implements Runnable {
   private static String[] field2211;
   public final long field2212;
   public final long field2213;
   public final Class2378 field2214;
   public final boolean field2215;
   public final Class8026 field2216;

   public Class474(Class8026 var1, long var2, long var4, Class2378 var6, boolean var7) {
      this.field2216 = var1;
      this.field2212 = var2;
      this.field2213 = var4;
      this.field2214 = var6;
      this.field2215 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field2212; var3 < this.field2213; var3++) {
         long var5 = var3 * Class8026.method27520(this.field2216);

         for (long var7 = 0L; var7 < Class8026.method27521(this.field2216); var7++) {
            Class8026.method27515(this.field2216).method30936(this.field2214, var5 + var7 * Class8026.method27522(this.field2216), this.field2215);
         }
      }
   }
}

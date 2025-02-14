package mapped;

public class Class592 implements Runnable {
   private static String[] field2909;
   public final long field2910;
   public final long field2911;
   public final Class2381 field2912;
   public final Class7274 field2913;

   public Class592(Class7274 var1, long var2, long var4, Class2381 var6) {
      this.field2913 = var1;
      this.field2910 = var2;
      this.field2911 = var4;
      this.field2912 = var6;
   }

   @Override
   public void run() {
      for (long var3 = this.field2910; var3 < this.field2911; var3++) {
         long var5 = var3 * Class7274.method22902(this.field2913);

         for (long var7 = 0L; var7 < Class7274.method22903(this.field2913); var7++) {
            Class7274.method22897(this.field2913).method27165(this.field2912, var5 + var7 * Class7274.method22904(this.field2913));
         }
      }
   }
}

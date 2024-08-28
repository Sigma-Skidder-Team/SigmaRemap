package mapped;

public class Class564 implements Runnable {
   private static String[] field2731;
   public final long field2732;
   public final long field2733;
   public final long field2734;
   public final long field2735;
   public final Class2381 field2736;
   public final boolean field2737;
   public final long field2738;
   public final Class7274 field2739;

   public Class564(Class7274 var1, long var2, long var4, long var6, long var8, Class2381 var10, boolean var11, long var12) {
      this.field2739 = var1;
      this.field2732 = var2;
      this.field2733 = var4;
      this.field2734 = var6;
      this.field2735 = var8;
      this.field2736 = var10;
      this.field2737 = var11;
      this.field2738 = var12;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(this.field2732);

      for (long var4 = this.field2733; var4 >= this.field2734; var4--) {
         long var6 = var4 * Class7274.method22902(this.field2739);
         long var8 = var4 * this.field2735;

         for (long var10 = Class7274.method22903(this.field2739) - 1L; var10 >= 0L; var10--) {
            Class8133.method28177(this.field2736, var6 + var10 * Class7274.method22904(this.field2739), var3, 0L, Class7274.method22905(this.field2739));
            Class7274.method22897(this.field2739).method27183(var3, this.field2737);
            Class8133.method28177(var3, 0L, this.field2736, var8 + var10 * this.field2738, this.field2732);
         }
      }
   }
}

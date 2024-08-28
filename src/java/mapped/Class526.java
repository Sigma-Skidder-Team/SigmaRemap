package mapped;

public class Class526 implements Runnable {
   private static String[] field2503;
   public final long field2504;
   public final long field2505;
   public final Class2378 field2506;
   public final boolean field2507;
   public final Class7941 field2508;

   public Class526(Class7941 var1, long var2, long var4, Class2378 var6, boolean var7) {
      this.field2508 = var1;
      this.field2504 = var2;
      this.field2505 = var4;
      this.field2506 = var6;
      this.field2507 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field2504; var3 < this.field2505; var3++) {
         long var5 = var3 * Class7941.method26771(this.field2508);

         for (long var7 = 0L; var7 < Class7941.method26772(this.field2508); var7++) {
            Class7941.method26766(this.field2508).method28927(this.field2506, var5 + var7 * Class7941.method26773(this.field2508), this.field2507);
         }
      }
   }
}

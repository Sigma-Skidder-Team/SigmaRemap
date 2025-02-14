package mapped;

public class Class1521 implements Runnable {
   private static String[] field8233;
   public final long field8234;
   public final long field8235;
   public final long field8236;
   public final Class2381 field8237;
   public final long field8238;
   public final Class2381 field8239;
   public final long field8240;
   public final Class7274 field8241;

   public Class1521(Class7274 var1, long var2, long var4, long var6, Class2381 var8, long var9, Class2381 var11, long var12) {
      this.field8241 = var1;
      this.field8234 = var2;
      this.field8235 = var4;
      this.field8236 = var6;
      this.field8237 = var8;
      this.field8238 = var9;
      this.field8239 = var11;
      this.field8240 = var12;
   }

   @Override
   public void run() {
      for (long var3 = this.field8234; var3 < this.field8235; var3++) {
         long var5 = var3 * this.field8236;

         for (long var7 = 0L; var7 < Class7274.method22903(this.field8241); var7++) {
            Class8133.method28177(
               this.field8237,
               var3 * Class7274.method22903(this.field8241) * this.field8238 + var7 * this.field8238,
               this.field8239,
               var5 + var7 * this.field8240,
               this.field8238
            );
         }
      }
   }
}

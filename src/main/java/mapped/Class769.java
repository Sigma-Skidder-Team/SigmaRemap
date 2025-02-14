package mapped;

public class Class769 implements Runnable {
   private static String[] field4001;
   public final long field4002;
   public final long field4003;
   public final long field4004;
   public final long field4005;
   public final Class2381 field4006;
   public final Class2381 field4007;
   public final long field4008;
   public final Class9615 field4009;

   public Class769(Class9615 var1, long var2, long var4, long var6, long var8, Class2381 var10, Class2381 var11, long var12) {
      this.field4009 = var1;
      this.field4002 = var2;
      this.field4003 = var4;
      this.field4004 = var6;
      this.field4005 = var8;
      this.field4006 = var10;
      this.field4007 = var11;
      this.field4008 = var12;
   }

   @Override
   public void run() {
      for (long var3 = this.field4002; var3 < this.field4003; var3++) {
         long var5 = 2L * var3;

         for (long var7 = 0L; var7 < this.field4004; var7++) {
            long var9 = 2L * var7;
            long var11 = var3 * this.field4005 + var9;
            this.field4006.method9687(var11, this.field4007.method9653(var7 * this.field4008 + var5));
            this.field4006.method9687(var11 + 1L, this.field4007.method9653(var7 * this.field4008 + var5 + 1L));
         }
      }
   }
}

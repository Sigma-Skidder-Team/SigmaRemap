package mapped;

public class Class1348 implements Runnable {
   private static String[] field7180;
   public final long field7181;
   public final long field7182;
   public final Class2381 field7183;
   public final long field7184;
   public final Class2381 field7185;
   public final Class9615 field7186;

   public Class1348(Class9615 var1, long var2, long var4, Class2381 var6, long var7, Class2381 var9) {
      this.field7186 = var1;
      this.field7181 = var2;
      this.field7182 = var4;
      this.field7183 = var6;
      this.field7184 = var7;
      this.field7185 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field7181; var3 < this.field7182; var3++) {
         long var5 = 2L * var3;

         for (long var7 = 0L; var7 < Class9615.method37426(this.field7186); var7++) {
            long var9 = 2L * var7;
            long var11 = var7 * Class9615.method37428(this.field7186) + var5;
            this.field7183.method9687(var3 * this.field7184 + var9, this.field7185.method9653(var11));
            this.field7183.method9687(var3 * this.field7184 + var9 + 1L, this.field7185.method9653(var11 + 1L));
         }

         Class9615.method37425(this.field7186).method27165(this.field7183, var3 * this.field7184);
      }
   }
}

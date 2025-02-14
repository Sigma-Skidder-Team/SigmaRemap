package mapped;

public class Class1435 implements Runnable {
   private static String[] field7699;
   public final long field7700;
   public final long field7701;
   public final long field7702;
   public final long field7703;
   public final Class2381 field7704;
   public final Class2381 field7705;
   public final long field7706;
   public final Class9615 field7707;

   public Class1435(Class9615 var1, long var2, long var4, long var6, long var8, Class2381 var10, Class2381 var11, long var12) {
      this.field7707 = var1;
      this.field7700 = var2;
      this.field7701 = var4;
      this.field7702 = var6;
      this.field7703 = var8;
      this.field7704 = var10;
      this.field7705 = var11;
      this.field7706 = var12;
   }

   @Override
   public void run() {
      for (long var3 = this.field7700; var3 < this.field7701; var3++) {
         long var5 = 2L * var3;

         for (long var7 = 0L; var7 < this.field7702; var7++) {
            long var9 = 2L * var7;
            long var11 = var3 * this.field7703 + var9;
            this.field7704.method9687(var11, this.field7705.method9653(var7 * this.field7706 + var5));
            this.field7704.method9687(var11 + 1L, this.field7705.method9653(var7 * this.field7706 + var5 + 1L));
         }
      }
   }
}

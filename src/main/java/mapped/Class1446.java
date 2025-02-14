package mapped;

public class Class1446 implements Runnable {
   private static String[] field7769;
   public final long field7770;
   public final long field7771;
   public final long field7772;
   public final long field7773;
   public final long field7774;
   public final Class2381 field7775;
   public final Class7274 field7776;

   public Class1446(Class7274 var1, long var2, long var4, long var6, long var8, long var10, Class2381 var12) {
      this.field7776 = var1;
      this.field7770 = var2;
      this.field7771 = var4;
      this.field7772 = var6;
      this.field7773 = var8;
      this.field7774 = var10;
      this.field7775 = var12;
   }

   @Override
   public void run() {
      for (long var3 = this.field7770; var3 < this.field7771; var3++) {
         long var5 = (Class7274.method22906(this.field7776) - var3) % Class7274.method22906(this.field7776) * this.field7772;
         long var7 = var3 * this.field7772;

         for (long var9 = 1L; var9 < this.field7773; var9++) {
            long var11 = var7 + (Class7274.method22903(this.field7776) - var9) * this.field7774;
            long var13 = var5 + var9 * this.field7774 + Class7274.method22905(this.field7776);
            long var15 = var11 + Class7274.method22905(this.field7776);
            long var17 = var11 + 1L;
            this.field7775.method9687(var13, this.field7775.method9653(var17));
            this.field7775.method9687(var15, this.field7775.method9653(var17));
            this.field7775.method9687(var13 + 1L, -this.field7775.method9653(var11));
            this.field7775.method9687(var15 + 1L, this.field7775.method9653(var11));
         }
      }
   }
}

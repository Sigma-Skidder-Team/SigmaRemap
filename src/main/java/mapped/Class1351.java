package mapped;

public class Class1351 implements Runnable {
   private static String[] field7199;
   public final long field7200;
   public final long field7201;
   public final long field7202;
   public final Class2381 field7203;
   public final Class9050 field7204;

   public Class1351(Class9050 var1, long var2, long var4, long var6, Class2381 var8) {
      this.field7204 = var1;
      this.field7200 = var2;
      this.field7201 = var4;
      this.field7202 = var6;
      this.field7203 = var8;
   }

   @Override
   public void run() {
      long var3 = this.field7200 + Class9050.method33665(this.field7204) - 1L;

      for (long var5 = this.field7201; var5 < this.field7202; var5++) {
         long var7 = this.field7200 + var5;
         double var9 = this.field7203.method9653(var7);
         long var11 = var3 - var5;
         this.field7203.method9687(var7, this.field7203.method9653(var11));
         this.field7203.method9687(var11, var9);
      }
   }
}

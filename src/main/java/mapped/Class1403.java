package mapped;

public class Class1403 implements Runnable {
   private static String[] field7508;
   public final long field7509;
   public final long field7510;
   public final long field7511;
   public final Class2381 field7512;
   public final Class9050 field7513;

   public Class1403(Class9050 var1, long var2, long var4, long var6, Class2381 var8) {
      this.field7513 = var1;
      this.field7509 = var2;
      this.field7510 = var4;
      this.field7511 = var6;
      this.field7512 = var8;
   }

   @Override
   public void run() {
      long var3 = this.field7509 + Class9050.method33665(this.field7513) - 1L;

      for (long var5 = this.field7510; var5 < this.field7511; var5++) {
         long var7 = this.field7509 + var5;
         double var9 = this.field7512.method9653(var7);
         long var11 = var3 - var5;
         this.field7512.method9687(var7, this.field7512.method9653(var11));
         this.field7512.method9687(var11, var9);
      }
   }
}

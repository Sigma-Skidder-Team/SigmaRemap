package mapped;

public class Class1409 implements Runnable {
   private static String[] field7547;
   public final long field7548;
   public final long field7549;
   public final long field7550;
   public final long field7551;
   public final Class2381 field7552;
   public final Class7990 field7553;

   public Class1409(Class7990 var1, long var2, long var4, long var6, long var8, Class2381 var10) {
      this.field7553 = var1;
      this.field7548 = var2;
      this.field7549 = var4;
      this.field7550 = var6;
      this.field7551 = var8;
      this.field7552 = var10;
   }

   @Override
   public void run() {
      for (long var3 = this.field7548; var3 < this.field7549; var3++) {
         long var5 = 2L * var3;
         long var7 = this.field7550 + (this.field7551 - var5) % this.field7551;
         this.field7552.method9687(var7, this.field7552.method9653(this.field7550 + var5));
         this.field7552.method9687(var7 + 1L, -this.field7552.method9653(this.field7550 + var5 + 1L));
      }
   }
}

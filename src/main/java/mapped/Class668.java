package mapped;

public class Class668 implements Runnable {
   private static String[] field3371;
   public final long field3372;
   public final long field3373;
   public final long field3374;
   public final Class2381 field3375;
   public final Class2381 field3376;
   public final Class9788 field3377;

   public Class668(Class9788 var1, long var2, long var4, long var6, Class2381 var8, Class2381 var9) {
      this.field3377 = var1;
      this.field3372 = var2;
      this.field3373 = var4;
      this.field3374 = var6;
      this.field3375 = var8;
      this.field3376 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field3372; var3 < this.field3373; var3++) {
         long var5 = 2L * var3;
         long var7 = this.field3374 + var3;
         this.field3375
            .method9687(
               var7,
               Class9788.method38591(this.field3377).method9653(var5) * this.field3376.method9653(var5)
                  - Class9788.method38591(this.field3377).method9653(var5 + 1L) * this.field3376.method9653(var5 + 1L)
            );
      }
   }
}

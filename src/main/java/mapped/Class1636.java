package mapped;

public class Class1636 implements Runnable {
   private static String[] field8875;
   public final long field8876;
   public final long field8877;
   public final long field8878;
   public final long field8879;
   public final Class2378 field8880;
   public final boolean field8881;
   public final Class8026 field8882;

   public Class1636(Class8026 var1, long var2, long var4, long var6, long var8, Class2378 var10, boolean var11) {
      this.field8882 = var1;
      this.field8876 = var2;
      this.field8877 = var4;
      this.field8878 = var6;
      this.field8879 = var8;
      this.field8880 = var10;
      this.field8881 = var11;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(2L * Class8026.method27524(this.field8882), false);

      for (long var4 = this.field8876; var4 < this.field8877; var4++) {
         long var6 = var4 * this.field8878;

         for (long var8 = 0L; var8 < Class8026.method27523(this.field8882); var8++) {
            long var10 = 2L * var8;

            for (long var12 = 0L; var12 < Class8026.method27524(this.field8882); var12++) {
               long var14 = 2L * var12;
               long var16 = var12 * this.field8879 + var6 + var10;
               var3.method9685(var14, this.field8880.method9651(var16));
               var3.method9685(var14 + 1L, this.field8880.method9651(var16 + 1L));
            }

            Class8026.method27519(this.field8882).method30934(var3, this.field8881);

            for (long var18 = 0L; var18 < Class8026.method27524(this.field8882); var18++) {
               long var19 = 2L * var18;
               long var20 = var18 * this.field8879 + var6 + var10;
               this.field8880.method9685(var20, var3.method9651(var19));
               this.field8880.method9685(var20 + 1L, var3.method9651(var19 + 1L));
            }
         }
      }
   }
}

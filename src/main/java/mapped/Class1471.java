package mapped;

public class Class1471 implements Runnable {
   private static String[] field7910;
   public final long field7911;
   public final long field7912;
   public final long field7913;
   public final long field7914;
   public final Class2378 field7915;
   public final boolean field7916;
   public final Class8026 field7917;

   public Class1471(Class8026 var1, long var2, long var4, long var6, long var8, Class2378 var10, boolean var11) {
      this.field7917 = var1;
      this.field7911 = var2;
      this.field7912 = var4;
      this.field7913 = var6;
      this.field7914 = var8;
      this.field7915 = var10;
      this.field7916 = var11;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(2L * Class8026.method27521(this.field7917), false);

      for (long var4 = this.field7911; var4 < this.field7912; var4++) {
         long var6 = var4 * this.field7913;

         for (long var8 = 0L; var8 < Class8026.method27523(this.field7917); var8++) {
            long var10 = 2L * var8;

            for (long var12 = 0L; var12 < Class8026.method27521(this.field7917); var12++) {
               long var14 = var6 + var12 * this.field7914 + var10;
               long var16 = 2L * var12;
               var3.method9685(var16, this.field7915.method9651(var14));
               var3.method9685(var16 + 1L, this.field7915.method9651(var14 + 1L));
            }

            Class8026.method27517(this.field7917).method30934(var3, this.field7916);

            for (long var18 = 0L; var18 < Class8026.method27521(this.field7917); var18++) {
               long var19 = var6 + var18 * this.field7914 + var10;
               long var20 = 2L * var18;
               this.field7915.method9685(var19, var3.method9651(var20));
               this.field7915.method9685(var19 + 1L, var3.method9651(var20 + 1L));
            }
         }
      }
   }
}

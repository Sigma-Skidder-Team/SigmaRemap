package mapped;

public class Class1465 implements Runnable {
   private static String[] field7878;
   public final long field7879;
   public final long field7880;
   public final Class2378 field7881;
   public final boolean field7882;
   public final Class8026 field7883;

   public Class1465(Class8026 var1, long var2, long var4, Class2378 var6, boolean var7) {
      this.field7883 = var1;
      this.field7879 = var2;
      this.field7880 = var4;
      this.field7881 = var6;
      this.field7882 = var7;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(2L * Class8026.method27524(this.field7883), false);

      for (long var4 = this.field7879; var4 < this.field7880; var4++) {
         long var6 = var4 * Class8026.method27522(this.field7883);

         for (long var8 = 0L; var8 < Class8026.method27523(this.field7883); var8++) {
            long var10 = 2L * var8;

            for (long var12 = 0L; var12 < Class8026.method27524(this.field7883); var12++) {
               long var14 = var12 * Class8026.method27520(this.field7883) + var6 + var10;
               long var16 = 2L * var12;
               var3.method9685(var16, this.field7881.method9651(var14));
               var3.method9685(var16 + 1L, this.field7881.method9651(var14 + 1L));
            }

            Class8026.method27519(this.field7883).method30934(var3, this.field7882);

            for (long var18 = 0L; var18 < Class8026.method27524(this.field7883); var18++) {
               long var19 = var18 * Class8026.method27520(this.field7883) + var6 + var10;
               long var20 = 2L * var18;
               this.field7881.method9685(var19, var3.method9651(var20));
               this.field7881.method9685(var19 + 1L, var3.method9651(var20 + 1L));
            }
         }
      }
   }
}

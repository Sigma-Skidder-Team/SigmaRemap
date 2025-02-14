package mapped;

public class Class1392 implements Runnable {
   private static String[] field7435;
   public final long field7436;
   public final long field7437;
   public final long field7438;
   public final Class2378 field7439;
   public final Class2378 field7440;
   public final Class8630 field7441;

   public Class1392(Class8630 var1, long var2, long var4, long var6, Class2378 var8, Class2378 var9) {
      this.field7441 = var1;
      this.field7436 = var2;
      this.field7437 = var4;
      this.field7438 = var6;
      this.field7439 = var8;
      this.field7440 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field7436; var3 < this.field7437; var3++) {
         long var5 = 2L * var3;
         long var7 = var5 + 1L;
         long var9 = this.field7438 + var3;
         this.field7439.method9685(var5, this.field7440.method9651(var9) * Class8630.method31010(this.field7441).method9651(var5));
         this.field7439.method9685(var7, this.field7440.method9651(var9) * Class8630.method31010(this.field7441).method9651(var7));
      }
   }
}

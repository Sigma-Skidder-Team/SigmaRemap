package mapped;

public class Class1374 implements Runnable {
   private static String[] field7341;
   public final long field7342;
   public final long field7343;
   public final Class2378 field7344;
   public final Class8630 field7345;

   public Class1374(Class8630 var1, long var2, long var4, Class2378 var6) {
      this.field7345 = var1;
      this.field7342 = var2;
      this.field7343 = var4;
      this.field7344 = var6;
   }

   @Override
   public void run() {
      for (long var3 = this.field7342; var3 < this.field7343; var3++) {
         long var5 = 2L * var3;
         long var7 = var5 + 1L;
         float var9 = -this.field7344.method9651(var5) * Class8630.method31011(this.field7345).method9651(var7)
            + this.field7344.method9651(var7) * Class8630.method31011(this.field7345).method9651(var5);
         this.field7344
            .method9685(
               var5,
               this.field7344.method9651(var5) * Class8630.method31011(this.field7345).method9651(var5)
                  + this.field7344.method9651(var7) * Class8630.method31011(this.field7345).method9651(var7)
            );
         this.field7344.method9685(var7, var9);
      }
   }
}

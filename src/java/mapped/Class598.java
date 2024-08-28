package mapped;

public class Class598 implements Runnable {
   private static String[] field2948;
   public final long field2949;
   public final long field2950;
   public final Class2378 field2951;
   public final Class8162 field2952;

   public Class598(Class8162 var1, long var2, long var4, Class2378 var6) {
      this.field2952 = var1;
      this.field2949 = var2;
      this.field2950 = var4;
      this.field2951 = var6;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(Class8162.method28402(this.field2952), false);

      for (long var4 = this.field2949; var4 < this.field2950; var4++) {
         long var6 = var4 * (long)Class8162.method28394(this.field2952);

         for (long var8 = 0L; var8 < Class8162.method28401(this.field2952); var8++) {
            for (long var10 = 0L; var10 < Class8162.method28402(this.field2952); var10++) {
               long var12 = var10 * (long)Class8162.method28392(this.field2952) + var6 + var8;
               var3.method9685(var10, this.field2951.method9651(var12));
            }

            Class8162.method28399(this.field2952).method28456(var3);

            for (long var14 = 0L; var14 < Class8162.method28402(this.field2952); var14++) {
               long var15 = var14 * (long)Class8162.method28392(this.field2952) + var6 + var8;
               this.field2951.method9685(var15, var3.method9651(var14));
            }
         }
      }
   }
}

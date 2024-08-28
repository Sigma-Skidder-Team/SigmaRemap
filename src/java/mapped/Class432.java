package mapped;

public class Class432 implements Runnable {
   private static String[] field1928;
   public final long field1929;
   public final long field1930;
   public final Class2378 field1931;
   public final boolean field1932;
   public final Class8162 field1933;

   public Class432(Class8162 var1, long var2, long var4, Class2378 var6, boolean var7) {
      this.field1933 = var1;
      this.field1929 = var2;
      this.field1930 = var4;
      this.field1931 = var6;
      this.field1932 = var7;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(Class8162.method28402(this.field1933), false);

      for (long var4 = this.field1929; var4 < this.field1930; var4++) {
         long var6 = var4 * Class8162.method28404(this.field1933);

         for (long var8 = 0L; var8 < Class8162.method28401(this.field1933); var8++) {
            for (long var10 = 0L; var10 < Class8162.method28402(this.field1933); var10++) {
               long var12 = var10 * Class8162.method28403(this.field1933) + var6 + var8;
               var3.method9685(var10, this.field1931.method9651(var12));
            }

            Class8162.method28399(this.field1933).method28460(var3, this.field1932);

            for (long var14 = 0L; var14 < Class8162.method28402(this.field1933); var14++) {
               long var15 = var14 * Class8162.method28403(this.field1933) + var6 + var8;
               this.field1931.method9685(var15, var3.method9651(var14));
            }
         }
      }
   }
}

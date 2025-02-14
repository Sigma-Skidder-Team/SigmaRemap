package mapped;

public class Class1628 implements Runnable {
   private static String[] field8825;
   public final long field8826;
   public final long field8827;
   public final Class2378 field8828;
   public final boolean field8829;
   public final Class8162 field8830;

   public Class1628(Class8162 var1, long var2, long var4, Class2378 var6, boolean var7) {
      this.field8830 = var1;
      this.field8826 = var2;
      this.field8827 = var4;
      this.field8828 = var6;
      this.field8829 = var7;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(Class8162.method28400(this.field8830), false);

      for (long var4 = this.field8826; var4 < this.field8827; var4++) {
         long var6 = var4 * Class8162.method28403(this.field8830);

         for (long var8 = 0L; var8 < Class8162.method28401(this.field8830); var8++) {
            for (long var10 = 0L; var10 < Class8162.method28400(this.field8830); var10++) {
               long var12 = var6 + var10 * Class8162.method28404(this.field8830) + var8;
               var3.method9685(var10, this.field8828.method9651(var12));
            }

            Class8162.method28397(this.field8830).method28460(var3, this.field8829);

            for (long var14 = 0L; var14 < Class8162.method28400(this.field8830); var14++) {
               long var15 = var6 + var14 * Class8162.method28404(this.field8830) + var8;
               this.field8828.method9685(var15, var3.method9651(var14));
            }
         }
      }
   }
}

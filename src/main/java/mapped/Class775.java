package mapped;

public class Class775 implements Runnable {
   private static String[] field4044;
   public final long field4045;
   public final long field4046;
   public final Class2381 field4047;
   public final Class8832 field4048;

   public Class775(Class8832 var1, long var2, long var4, Class2381 var6) {
      this.field4048 = var1;
      this.field4045 = var2;
      this.field4046 = var4;
      this.field4047 = var6;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(Class8832.method31965(this.field4048), false);

      for (long var4 = this.field4045; var4 < this.field4046; var4++) {
         long var6 = var4 * (long)Class8832.method31957(this.field4048);

         for (long var8 = 0L; var8 < Class8832.method31964(this.field4048); var8++) {
            for (long var10 = 0L; var10 < Class8832.method31965(this.field4048); var10++) {
               long var12 = var10 * (long)Class8832.method31955(this.field4048) + var6 + var8;
               var3.method9687(var10, this.field4047.method9653(var12));
            }

            Class8832.method31962(this.field4048).method33647(var3);

            for (long var14 = 0L; var14 < Class8832.method31965(this.field4048); var14++) {
               long var15 = var14 * (long)Class8832.method31955(this.field4048) + var6 + var8;
               this.field4047.method9687(var15, var3.method9653(var14));
            }
         }
      }
   }
}
